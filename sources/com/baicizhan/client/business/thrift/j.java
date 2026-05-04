package com.baicizhan.client.business.thrift;

import org.apache.thrift.TByteArrayOutputStream;
import org.apache.thrift.transport.TMemoryInputTransport;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;
import org.apache.thrift.transport.TTransportFactory;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class j extends TTransport {

    /* renamed from: f, reason: collision with root package name */
    public static final int f16627f = 16384000;

    /* renamed from: a, reason: collision with root package name */
    public int f16628a;

    /* renamed from: b, reason: collision with root package name */
    public TTransport f16629b;

    /* renamed from: c, reason: collision with root package name */
    public final TByteArrayOutputStream f16630c;

    /* renamed from: d, reason: collision with root package name */
    public TMemoryInputTransport f16631d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f16632e;

    public j(TTransport transport, int maxLength) {
        this.f16629b = null;
        this.f16630c = new TByteArrayOutputStream(1024);
        this.f16631d = new TMemoryInputTransport(new byte[0]);
        this.f16632e = new byte[4];
        this.f16629b = transport;
        this.f16628a = maxLength;
    }

    public static final int decodeFrameSize(final byte[] buf) {
        return (buf[3] & 255) | ((buf[0] & 255) << 24) | ((buf[1] & 255) << 16) | ((buf[2] & 255) << 8);
    }

    public static final void encodeFrameSize(final int frameSize, final byte[] buf) {
        buf[0] = (byte) ((frameSize >> 24) & 255);
        buf[1] = (byte) ((frameSize >> 16) & 255);
        buf[2] = (byte) ((frameSize >> 8) & 255);
        buf[3] = (byte) (frameSize & 255);
    }

    public TTransport a() {
        return this.f16629b;
    }

    @Override // org.apache.thrift.transport.TTransport, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f16629b.close();
    }

    @Override // org.apache.thrift.transport.TTransport
    public void consumeBuffer(int len) {
        this.f16631d.consumeBuffer(len);
    }

    @Override // org.apache.thrift.transport.TTransport
    public void flush() throws TTransportException {
        byte[] bArr = this.f16630c.get();
        int len = this.f16630c.len();
        this.f16630c.reset();
        encodeFrameSize(len, this.f16632e);
        this.f16629b.write(this.f16632e, 0, 4);
        this.f16629b.write(bArr, 0, len);
        this.f16629b.flush();
    }

    @Override // org.apache.thrift.transport.TTransport
    public byte[] getBuffer() {
        return this.f16631d.getBuffer();
    }

    @Override // org.apache.thrift.transport.TTransport
    public int getBufferPosition() {
        return this.f16631d.getBufferPosition();
    }

    @Override // org.apache.thrift.transport.TTransport
    public int getBytesRemainingInBuffer() {
        return this.f16631d.getBytesRemainingInBuffer();
    }

    @Override // org.apache.thrift.transport.TTransport
    public boolean isOpen() {
        return this.f16629b.isOpen();
    }

    @Override // org.apache.thrift.transport.TTransport
    public void open() throws TTransportException {
        this.f16629b.open();
    }

    @Override // org.apache.thrift.transport.TTransport
    public int read(byte[] buf, int off, int len) throws TTransportException {
        int read;
        TMemoryInputTransport tMemoryInputTransport = this.f16631d;
        if (tMemoryInputTransport != null && (read = tMemoryInputTransport.read(buf, off, len)) > 0) {
            return read;
        }
        readFrame();
        return this.f16631d.read(buf, off, len);
    }

    public final void readFrame() throws TTransportException {
        this.f16629b.readAll(this.f16632e, 0, 4);
        int decodeFrameSize = decodeFrameSize(this.f16632e);
        if (decodeFrameSize < 0) {
            throw new TTransportException("Read a negative frame size (" + decodeFrameSize + ")!");
        }
        if (decodeFrameSize <= this.f16628a) {
            byte[] bArr = new byte[decodeFrameSize];
            this.f16629b.readAll(bArr, 0, decodeFrameSize);
            this.f16631d.reset(bArr);
        } else {
            throw new TTransportException("Frame size (" + decodeFrameSize + ") larger than max length (" + this.f16628a + ")!");
        }
    }

    @Override // org.apache.thrift.transport.TTransport
    public void setMethodName(String name) throws TTransportException {
        this.f16629b.setMethodName(name);
    }

    @Override // org.apache.thrift.transport.TTransport
    public void write(byte[] buf, int off, int len) throws TTransportException {
        this.f16630c.write(buf, off, len);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends TTransportFactory {

        /* renamed from: a, reason: collision with root package name */
        public int f16633a;

        public a() {
            this.f16633a = 16384000;
        }

        @Override // org.apache.thrift.transport.TTransportFactory
        public TTransport getTransport(TTransport base) {
            return new j(base, this.f16633a);
        }

        public a(int maxLength) {
            this.f16633a = maxLength;
        }
    }

    public j(TTransport transport) {
        this.f16629b = null;
        this.f16630c = new TByteArrayOutputStream(1024);
        this.f16631d = new TMemoryInputTransport(new byte[0]);
        this.f16632e = new byte[4];
        this.f16629b = transport;
        this.f16628a = 16384000;
    }
}
