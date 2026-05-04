package org.apache.thrift.transport;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class TFastFramedTransport extends TTransport {
    public static final int DEFAULT_BUF_CAPACITY = 1024;
    public static final int DEFAULT_MAX_LENGTH = 16384000;
    private final byte[] i32buf;
    private final int maxLength;
    private final AutoExpandingBufferReadTransport readBuffer;
    private final TTransport underlying;
    private final AutoExpandingBufferWriteTransport writeBuffer;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Factory extends TTransportFactory {
        private final int initialCapacity;
        private final int maxLength;

        public Factory() {
            this(1024, 16384000);
        }

        @Override // org.apache.thrift.transport.TTransportFactory
        public TTransport getTransport(TTransport tTransport) {
            return new TFastFramedTransport(tTransport, this.initialCapacity, this.maxLength);
        }

        public Factory(int i11) {
            this(i11, 16384000);
        }

        public Factory(int i11, int i12) {
            this.initialCapacity = i11;
            this.maxLength = i12;
        }
    }

    public TFastFramedTransport(TTransport tTransport) {
        this(tTransport, 1024, 16384000);
    }

    private void readFrame() throws TTransportException {
        this.underlying.readAll(this.i32buf, 0, 4);
        int decodeFrameSize = TFramedTransport.decodeFrameSize(this.i32buf);
        if (decodeFrameSize < 0) {
            throw new TTransportException("Read a negative frame size (" + decodeFrameSize + ")!");
        }
        if (decodeFrameSize <= this.maxLength) {
            this.readBuffer.fill(this.underlying, decodeFrameSize);
            return;
        }
        throw new TTransportException("Frame size (" + decodeFrameSize + ") larger than max length (" + this.maxLength + ")!");
    }

    @Override // org.apache.thrift.transport.TTransport, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.underlying.close();
    }

    @Override // org.apache.thrift.transport.TTransport
    public void consumeBuffer(int i11) {
        this.readBuffer.consumeBuffer(i11);
    }

    @Override // org.apache.thrift.transport.TTransport
    public void flush() throws TTransportException {
        int pos = this.writeBuffer.getPos();
        TFramedTransport.encodeFrameSize(pos, this.i32buf);
        this.underlying.write(this.i32buf, 0, 4);
        this.underlying.write(this.writeBuffer.getBuf().array(), 0, pos);
        this.writeBuffer.reset();
        this.underlying.flush();
    }

    @Override // org.apache.thrift.transport.TTransport
    public byte[] getBuffer() {
        return this.readBuffer.getBuffer();
    }

    @Override // org.apache.thrift.transport.TTransport
    public int getBufferPosition() {
        return this.readBuffer.getBufferPosition();
    }

    @Override // org.apache.thrift.transport.TTransport
    public int getBytesRemainingInBuffer() {
        return this.readBuffer.getBytesRemainingInBuffer();
    }

    @Override // org.apache.thrift.transport.TTransport
    public boolean isOpen() {
        return this.underlying.isOpen();
    }

    @Override // org.apache.thrift.transport.TTransport
    public void open() throws TTransportException {
        this.underlying.open();
    }

    @Override // org.apache.thrift.transport.TTransport
    public int read(byte[] bArr, int i11, int i12) throws TTransportException {
        int read = this.readBuffer.read(bArr, i11, i12);
        if (read > 0) {
            return read;
        }
        readFrame();
        return this.readBuffer.read(bArr, i11, i12);
    }

    @Override // org.apache.thrift.transport.TTransport
    public void write(byte[] bArr, int i11, int i12) throws TTransportException {
        this.writeBuffer.write(bArr, i11, i12);
    }

    public TFastFramedTransport(TTransport tTransport, int i11) {
        this(tTransport, i11, 16384000);
    }

    public TFastFramedTransport(TTransport tTransport, int i11, int i12) {
        this.i32buf = new byte[4];
        this.underlying = tTransport;
        this.maxLength = i12;
        this.writeBuffer = new AutoExpandingBufferWriteTransport(i11, 1.5d);
        this.readBuffer = new AutoExpandingBufferReadTransport(i11, 1.5d);
    }
}
