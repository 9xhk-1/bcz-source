package org.apache.thrift.transport;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
class TTransportInputStream extends InputStream {
    private TTransport transport;

    public TTransportInputStream(TTransport tTransport) {
        this.transport = tTransport;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        try {
            byte[] bArr = new byte[1];
            this.transport.read(bArr, 0, 1);
            return bArr[0];
        } catch (TTransportException e11) {
            throw new IOException(e11);
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i11, int i12) throws IOException {
        try {
            return this.transport.read(bArr, i11, i12);
        } catch (TTransportException e11) {
            throw new IOException(e11);
        }
    }
}
