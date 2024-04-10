import io.grpc.Channel;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import java.util.concurrent.TimeUnit;
import echo.*;

/**
 * Client that requests `parrot` method from the `EchoServer`.
 */
public class EchoClient {
  private final EchoGrpc.EchoBlockingStub blockingStub;
  private final CalcGrpc.CalcBlockingStub blockingStub2;

  /** Construct client for accessing server using the existing channel. */
  public EchoClient(Channel channel) {
    // 'channel' here is a Channel, not a ManagedChannel, so it is not this code's responsibility to
        // shut it down.

        // Passing Channels to code makes code easier to test and makes it easier to reuse Channels.
    blockingStub = EchoGrpc.newBlockingStub(channel);
    blockingStub2 = CalcGrpc.newBlockingStub(channel);
  }

  public void askServerToParrot(String message) {
    ClientRequest request = ClientRequest.newBuilder().setMessage(message).build(); //creating a request object
    ServerResponse response;
    try {
      response = blockingStub.parrot(request); //sends request via message call
      //using blocking stub = doorway connected to the channel, on thist stub you call the method
      //into this method you give a request, IE regular method call
    } catch (Exception e) {
      System.err.println("RPC failed: " + e.getMessage());
      return;
    }
    System.out.println("Received from server: " + response.getMessage());
  }
  //add two number method --- implemnted in the main for now
  public void add() {
    ///each blocking stub is for each service
    echo.AddRequest req = echo.AddRequest.newBuilder().setNum1(30).setNum2(21).build();
    echo.AddResponse response;
    try {
      response = blockingStub2.add(req); //sends request via message call
      System.out.println(response.toString());
      //using blocking stub = doorway connected to the channel, on thist stub you call the method
      //into this method you give a request, IE regular method call
    } catch (Exception e) {
      System.err.println("RPC failed: " + e.getMessage());
      return;
    }
  }

  public static void main(String[] args) throws Exception {
    //THIS IS ALL INPUT CHECKING
    if (args.length != 3) {
      System.out.println("Expected arguments: <host(String)> <port(int)> <message(String)>");
      System.exit(1);
    }
    int port = 9099;
    String host = args[0];
    String message = args[2];
    try {
      port = Integer.parseInt(args[1]);
    } catch (NumberFormatException nfe) {
      System.out.println("[Port] must be an integer");
      System.exit(2);
    }
    

    // Create a communication channel to the server, known as a Channel. Channels are thread-safe
    // and reusable. It is common to create channels at the beginning of your application and reuse
    // them until the application shuts down.
    String target = host + ":" + port; //this is what GRPC want
    ManagedChannel channel = ManagedChannelBuilder.forTarget(target)
        // Channels are secure by default (via SSL/TLS). For the example we disable TLS to avoid
        // needing certificates.
            // target is host port - socketlocalhost port
        .usePlaintext() //allows us to see traffic on wireshark
        .build(); //builder pattern
    //connection is established
    try {
      EchoClient client = new EchoClient(channel);
      client.askServerToParrot(message);
      client.add();
    } finally {
      // ManagedChannels use resources like threads and TCP connections. To prevent leaking these
      // resources the channel should be shut down when it will no longer be used. If it may be used
      // again leave it running.
      channel.shutdownNow().awaitTermination(5, TimeUnit.SECONDS);
    }
  }
}
