package org.conscrypt;

import java.io.Serializable;
import java.security.SecureRandomSpi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class OpenSSLRandom extends SecureRandomSpi implements Serializable {
    private static final long serialVersionUID = 8506210602917522861L;

    @Override // java.security.SecureRandomSpi
    public byte[] engineGenerateSeed(int i11) {
        byte[] bArr = new byte[i11];
        NativeCrypto.RAND_bytes(bArr);
        return bArr;
    }

    @Override // java.security.SecureRandomSpi
    public void engineNextBytes(byte[] bArr) {
        NativeCrypto.RAND_bytes(bArr);
    }

    @Override // java.security.SecureRandomSpi
    public void engineSetSeed(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("seed == null");
        }
    }
}
