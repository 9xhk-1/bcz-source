package org.apache.thrift.transport;

import java.io.Closeable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class TTransport implements Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    public byte[] getBuffer() {
        return null;
    }

    public int getBufferPosition() {
        return 0;
    }

    public int getBytesRemainingInBuffer() {
        return -1;
    }

    public abstract boolean isOpen();

    public abstract void open() throws TTransportException;

    public boolean peek() {
        return isOpen();
    }

    public abstract int read(byte[] bArr, int i11, int i12) throws TTransportException;

    public int readAll(byte[] bArr, int i11, int i12) throws TTransportException {
        int i13 = 0;
        while (i13 < i12) {
            int read = read(bArr, i11 + i13, i12 - i13);
            if (read <= 0) {
                throw new TTransportException("Cannot read. Remote side has closed. Tried to read " + i12 + " bytes, but only got " + i13 + " bytes. (This is often indicative of an internal error on the server side. Please check your server logs.)");
            }
            i13 += read;
        }
        return i13;
    }

    public void write(byte[] bArr) throws TTransportException {
        write(bArr, 0, bArr.length);
    }

    public abstract void write(byte[] bArr, int i11, int i12) throws TTransportException;

    public void flush() throws TTransportException {
    }

    public void consumeBuffer(int i11) {
    }

    public void setMethodName(String str) throws TTransportException {
    }
}
