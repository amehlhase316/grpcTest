import io.grpc.stub.StreamObserver;
import echo.*;

public class CalcImpl extends CalcGrpc.CalcImplBase{
    @Override
    public void add(AddRequest req, StreamObserver<AddResponse> responseObserver) {
        AddResponse response = AddResponse.newBuilder().setResult(req.getNum1()+req.getNum2()).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
