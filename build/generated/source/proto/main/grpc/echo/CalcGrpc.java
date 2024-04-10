package echo;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.48.1)",
    comments = "Source: add.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CalcGrpc {

  private CalcGrpc() {}

  public static final String SERVICE_NAME = "addmessage.Calc";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<echo.AddRequest,
      echo.AddResponse> getAddMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "add",
      requestType = echo.AddRequest.class,
      responseType = echo.AddResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<echo.AddRequest,
      echo.AddResponse> getAddMethod() {
    io.grpc.MethodDescriptor<echo.AddRequest, echo.AddResponse> getAddMethod;
    if ((getAddMethod = CalcGrpc.getAddMethod) == null) {
      synchronized (CalcGrpc.class) {
        if ((getAddMethod = CalcGrpc.getAddMethod) == null) {
          CalcGrpc.getAddMethod = getAddMethod =
              io.grpc.MethodDescriptor.<echo.AddRequest, echo.AddResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "add"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  echo.AddRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  echo.AddResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CalcMethodDescriptorSupplier("add"))
              .build();
        }
      }
    }
    return getAddMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CalcStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CalcStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CalcStub>() {
        @java.lang.Override
        public CalcStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CalcStub(channel, callOptions);
        }
      };
    return CalcStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CalcBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CalcBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CalcBlockingStub>() {
        @java.lang.Override
        public CalcBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CalcBlockingStub(channel, callOptions);
        }
      };
    return CalcBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CalcFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CalcFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CalcFutureStub>() {
        @java.lang.Override
        public CalcFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CalcFutureStub(channel, callOptions);
        }
      };
    return CalcFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class CalcImplBase implements io.grpc.BindableService {

    /**
     */
    public void add(echo.AddRequest request,
        io.grpc.stub.StreamObserver<echo.AddResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                echo.AddRequest,
                echo.AddResponse>(
                  this, METHODID_ADD)))
          .build();
    }
  }

  /**
   */
  public static final class CalcStub extends io.grpc.stub.AbstractAsyncStub<CalcStub> {
    private CalcStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalcStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CalcStub(channel, callOptions);
    }

    /**
     */
    public void add(echo.AddRequest request,
        io.grpc.stub.StreamObserver<echo.AddResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CalcBlockingStub extends io.grpc.stub.AbstractBlockingStub<CalcBlockingStub> {
    private CalcBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalcBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CalcBlockingStub(channel, callOptions);
    }

    /**
     */
    public echo.AddResponse add(echo.AddRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CalcFutureStub extends io.grpc.stub.AbstractFutureStub<CalcFutureStub> {
    private CalcFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalcFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CalcFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<echo.AddResponse> add(
        echo.AddRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CalcImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CalcImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD:
          serviceImpl.add((echo.AddRequest) request,
              (io.grpc.stub.StreamObserver<echo.AddResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CalcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CalcBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return echo.CalcProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Calc");
    }
  }

  private static final class CalcFileDescriptorSupplier
      extends CalcBaseDescriptorSupplier {
    CalcFileDescriptorSupplier() {}
  }

  private static final class CalcMethodDescriptorSupplier
      extends CalcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CalcMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CalcGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CalcFileDescriptorSupplier())
              .addMethod(getAddMethod())
              .build();
        }
      }
    }
    return result;
  }
}
