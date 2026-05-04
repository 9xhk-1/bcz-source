package org.apache.thrift.transport;

import java.io.OutputStream;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class TZlibTransport extends TIOStreamTransport {
    private TTransport transport_;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Factory extends TTransportFactory {
        @Override // org.apache.thrift.transport.TTransportFactory
        public TTransport getTransport(TTransport tTransport) {
            return new TZlibTransport(tTransport);
        }
    }

    public TZlibTransport(TTransport tTransport) {
        this(tTransport, 9);
    }

    @Override // org.apache.thrift.transport.TIOStreamTransport, org.apache.thrift.transport.TTransport, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.transport_.isOpen()) {
            this.transport_.close();
        }
    }

    @Override // org.apache.thrift.transport.TIOStreamTransport, org.apache.thrift.transport.TTransport
    public boolean isOpen() {
        return this.transport_.isOpen();
    }

    @Override // org.apache.thrift.transport.TIOStreamTransport, org.apache.thrift.transport.TTransport
    public void open() throws TTransportException {
        this.transport_.open();
    }

    public TZlibTransport(TTransport tTransport, int i11) {
        this.transport_ = tTransport;
        this.inputStream_ = new InflaterInputStream(new TTransportInputStream(this.transport_), new Inflater());
        this.outputStream_ = new DeflaterOutputStream((OutputStream) new TTransportOutputStream(this.transport_), new Deflater(i11, false), true);
    }
}
