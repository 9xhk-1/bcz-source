package org.apache.thrift.transport;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class AutoExpandingBufferWriteTransport extends TTransport {
    private final AutoExpandingBuffer buf;
    private int pos = 0;

    public AutoExpandingBufferWriteTransport(int i11, double d11) {
        this.buf = new AutoExpandingBuffer(i11, d11);
    }

    public AutoExpandingBuffer getBuf() {
        return this.buf;
    }

    public int getPos() {
        return this.pos;
    }

    @Override // org.apache.thrift.transport.TTransport
    public boolean isOpen() {
        return true;
    }

    @Override // org.apache.thrift.transport.TTransport
    public int read(byte[] bArr, int i11, int i12) throws TTransportException {
        throw new UnsupportedOperationException();
    }

    public void reset() {
        this.pos = 0;
    }

    @Override // org.apache.thrift.transport.TTransport
    public void write(byte[] bArr, int i11, int i12) throws TTransportException {
        this.buf.resizeIfNecessary(this.pos + i12);
        System.arraycopy(bArr, i11, this.buf.array(), this.pos, i12);
        this.pos += i12;
    }

    @Override // org.apache.thrift.transport.TTransport, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // org.apache.thrift.transport.TTransport
    public void open() throws TTransportException {
    }
}
