package org.conscrypt;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
class OpenSSLBIOInputStream extends FilterInputStream {
    private long ctx;

    public OpenSSLBIOInputStream(InputStream inputStream, boolean z11) {
        super(inputStream);
        this.ctx = NativeCrypto.create_BIO_InputStream(this, z11);
    }

    public long getBioContext() {
        return this.ctx;
    }

    public int gets(byte[] bArr) throws IOException {
        int read;
        int i11 = 0;
        if (bArr != null && bArr.length != 0) {
            while (i11 < bArr.length && (read = read()) != -1) {
                if (read != 10) {
                    bArr[i11] = (byte) read;
                    i11++;
                } else if (i11 != 0) {
                    break;
                }
            }
        }
        return i11;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public void release() {
        NativeCrypto.BIO_free_all(this.ctx);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i11, int i12) throws IOException {
        if (i11 < 0 || i12 < 0 || i12 > bArr.length - i11) {
            throw new IndexOutOfBoundsException("Invalid bounds");
        }
        int i13 = 0;
        if (i12 == 0) {
            return 0;
        }
        do {
            int read = super.read(bArr, i11 + i13, (i12 - i13) - i11);
            if (read == -1) {
                break;
            }
            i13 += read;
        } while (i11 + i13 < i12);
        if (i13 == 0) {
            return -1;
        }
        return i13;
    }
}
