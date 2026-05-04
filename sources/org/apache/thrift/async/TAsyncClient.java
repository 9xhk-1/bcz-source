package org.apache.thrift.async;

import org.apache.thrift.protocol.TProtocolFactory;
import org.apache.thrift.transport.TNonblockingTransport;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class TAsyncClient {
    protected TAsyncMethodCall ___currentMethod;
    private Exception ___error;
    protected final TAsyncClientManager ___manager;
    protected final TProtocolFactory ___protocolFactory;
    private long ___timeout;
    protected final TNonblockingTransport ___transport;

    public TAsyncClient(TProtocolFactory tProtocolFactory, TAsyncClientManager tAsyncClientManager, TNonblockingTransport tNonblockingTransport) {
        this(tProtocolFactory, tAsyncClientManager, tNonblockingTransport, 0L);
    }

    public void checkReady() {
        if (this.___currentMethod == null) {
            if (this.___error != null) {
                throw new IllegalStateException("Client has an error!", this.___error);
            }
        } else {
            throw new IllegalStateException("Client is currently executing another method: " + this.___currentMethod.getClass().getName());
        }
    }

    public Exception getError() {
        return this.___error;
    }

    public TProtocolFactory getProtocolFactory() {
        return this.___protocolFactory;
    }

    public long getTimeout() {
        return this.___timeout;
    }

    public boolean hasError() {
        return this.___error != null;
    }

    public boolean hasTimeout() {
        return this.___timeout > 0;
    }

    public void onComplete() {
        this.___currentMethod = null;
    }

    public void onError(Exception exc) {
        this.___transport.close();
        this.___currentMethod = null;
        this.___error = exc;
    }

    public void setTimeout(long j11) {
        this.___timeout = j11;
    }

    public TAsyncClient(TProtocolFactory tProtocolFactory, TAsyncClientManager tAsyncClientManager, TNonblockingTransport tNonblockingTransport, long j11) {
        this.___protocolFactory = tProtocolFactory;
        this.___manager = tAsyncClientManager;
        this.___transport = tNonblockingTransport;
        this.___timeout = j11;
    }
}
