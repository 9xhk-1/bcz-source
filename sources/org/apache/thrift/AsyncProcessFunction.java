package org.apache.thrift;

import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.protocol.TMessage;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.server.AbstractNonblockingServer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class AsyncProcessFunction<I, T, R> {
    final String methodName;

    public AsyncProcessFunction(String str) {
        this.methodName = str;
    }

    public abstract T getEmptyArgsInstance();

    public String getMethodName() {
        return this.methodName;
    }

    public abstract AsyncMethodCallback getResultHandler(AbstractNonblockingServer.AsyncFrameBuffer asyncFrameBuffer, int i11);

    public abstract boolean isOneway();

    public void sendResponse(AbstractNonblockingServer.AsyncFrameBuffer asyncFrameBuffer, TBase tBase, byte b11, int i11) throws TException {
        TProtocol outputProtocol = asyncFrameBuffer.getOutputProtocol();
        outputProtocol.writeMessageBegin(new TMessage(getMethodName(), b11, i11));
        tBase.write(outputProtocol);
        outputProtocol.writeMessageEnd();
        outputProtocol.getTransport().flush();
        asyncFrameBuffer.responseReady();
    }

    public abstract void start(I i11, T t11, AsyncMethodCallback<R> asyncMethodCallback) throws TException;
}
