package org.apache.thrift.transport;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class AutoExpandingBufferReadTransport extends TTransport {
    private final AutoExpandingBuffer buf;
    private int pos = 0;
    private int limit = 0;

    public AutoExpandingBufferReadTransport(int i11, double d11) {
        this.buf = new AutoExpandingBuffer(i11, d11);
    }

    @Override // org.apache.thrift.transport.TTransport
    public final void consumeBuffer(int i11) {
        this.pos += i11;
    }

    public void fill(TTransport tTransport, int i11) throws TTransportException {
        this.buf.resizeIfNecessary(i11);
        tTransport.readAll(this.buf.array(), 0, i11);
        this.pos = 0;
        this.limit = i11;
    }

    @Override // org.apache.thrift.transport.TTransport
    public final byte[] getBuffer() {
        return this.buf.array();
    }

    @Override // org.apache.thrift.transport.TTransport
    public final int getBufferPosition() {
        return this.pos;
    }

    @Override // org.apache.thrift.transport.TTransport
    public final int getBytesRemainingInBuffer() {
        return this.limit - this.pos;
    }

    @Override // org.apache.thrift.transport.TTransport
    public boolean isOpen() {
        return true;
    }

    @Override // org.apache.thrift.transport.TTransport
    public final int read(byte[] bArr, int i11, int i12) throws TTransportException {
        int min = Math.min(i12, getBytesRemainingInBuffer());
        System.arraycopy(this.buf.array(), this.pos, bArr, i11, min);
        consumeBuffer(min);
        return min;
    }

    @Override // org.apache.thrift.transport.TTransport
    public void write(byte[] bArr, int i11, int i12) throws TTransportException {
        throw new UnsupportedOperationException();
    }

    @Override // org.apache.thrift.transport.TTransport, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // org.apache.thrift.transport.TTransport
    public void open() throws TTransportException {
    }
}
