package org.apache.thrift.transport;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class TMemoryInputTransport extends TTransport {
    private byte[] buf_;
    private int endPos_;
    private int pos_;

    public TMemoryInputTransport() {
    }

    public void clear() {
        this.buf_ = null;
    }

    @Override // org.apache.thrift.transport.TTransport
    public void consumeBuffer(int i11) {
        this.pos_ += i11;
    }

    @Override // org.apache.thrift.transport.TTransport
    public byte[] getBuffer() {
        return this.buf_;
    }

    @Override // org.apache.thrift.transport.TTransport
    public int getBufferPosition() {
        return this.pos_;
    }

    @Override // org.apache.thrift.transport.TTransport
    public int getBytesRemainingInBuffer() {
        return this.endPos_ - this.pos_;
    }

    @Override // org.apache.thrift.transport.TTransport
    public boolean isOpen() {
        return true;
    }

    @Override // org.apache.thrift.transport.TTransport
    public int read(byte[] bArr, int i11, int i12) throws TTransportException {
        int bytesRemainingInBuffer = getBytesRemainingInBuffer();
        if (i12 > bytesRemainingInBuffer) {
            i12 = bytesRemainingInBuffer;
        }
        if (i12 > 0) {
            System.arraycopy(this.buf_, this.pos_, bArr, i11, i12);
            consumeBuffer(i12);
        }
        return i12;
    }

    public void reset(byte[] bArr) {
        reset(bArr, 0, bArr.length);
    }

    @Override // org.apache.thrift.transport.TTransport
    public void write(byte[] bArr, int i11, int i12) throws TTransportException {
        throw new UnsupportedOperationException("No writing allowed!");
    }

    public TMemoryInputTransport(byte[] bArr) {
        reset(bArr);
    }

    public void reset(byte[] bArr, int i11, int i12) {
        this.buf_ = bArr;
        this.pos_ = i11;
        this.endPos_ = i11 + i12;
    }

    public TMemoryInputTransport(byte[] bArr, int i11, int i12) {
        reset(bArr, i11, i12);
    }

    @Override // org.apache.thrift.transport.TTransport, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // org.apache.thrift.transport.TTransport
    public void open() throws TTransportException {
    }
}
