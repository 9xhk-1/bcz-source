package org.apache.thrift.transport;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
class TTransportOutputStream extends OutputStream {
    private TTransport transport;

    public TTransportOutputStream(TTransport tTransport) {
        this.transport = tTransport;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        try {
            this.transport.flush();
        } catch (TTransportException e11) {
            throw new IOException(e11);
        }
    }

    @Override // java.io.OutputStream
    public void write(int i11) throws IOException {
        try {
            this.transport.write(new byte[]{(byte) i11});
        } catch (TTransportException e11) {
            throw new IOException(e11);
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i11, int i12) throws IOException {
        try {
            this.transport.write(bArr, i11, i12);
        } catch (TTransportException e11) {
            throw new IOException(e11);
        }
    }
}
