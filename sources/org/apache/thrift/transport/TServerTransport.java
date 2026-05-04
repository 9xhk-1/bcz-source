package org.apache.thrift.transport;

import java.io.Closeable;
import java.net.InetSocketAddress;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class TServerTransport implements Closeable {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class AbstractServerTransportArgs<T extends AbstractServerTransportArgs<T>> {
        InetSocketAddress bindAddr;
        int backlog = 0;
        int clientTimeout = 0;

        public T backlog(int i11) {
            this.backlog = i11;
            return this;
        }

        public T bindAddr(InetSocketAddress inetSocketAddress) {
            this.bindAddr = inetSocketAddress;
            return this;
        }

        public T clientTimeout(int i11) {
            this.clientTimeout = i11;
            return this;
        }

        public T port(int i11) {
            this.bindAddr = new InetSocketAddress(i11);
            return this;
        }
    }

    public final TTransport accept() throws TTransportException {
        TTransport acceptImpl = acceptImpl();
        if (acceptImpl != null) {
            return acceptImpl;
        }
        throw new TTransportException("accept() may not return NULL");
    }

    public abstract TTransport acceptImpl() throws TTransportException;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    public abstract void listen() throws TTransportException;

    public void interrupt() {
    }
}
