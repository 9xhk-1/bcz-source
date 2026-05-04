package org.conscrypt;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import org.conscrypt.OpenSSLCipher;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class OpenSSLAeadCipherChaCha20 extends OpenSSLAeadCipher {
    public OpenSSLAeadCipherChaCha20() {
        super(OpenSSLCipher.Mode.POLY1305);
    }

    @Override // org.conscrypt.OpenSSLCipher
    public void checkSupportedKeySize(int i11) throws InvalidKeyException {
        if (i11 == 32) {
            return;
        }
        throw new InvalidKeyException("Unsupported key size: " + i11 + " bytes (must be 32)");
    }

    @Override // org.conscrypt.OpenSSLCipher
    public void checkSupportedMode(OpenSSLCipher.Mode mode) throws NoSuchAlgorithmException {
        if (mode != OpenSSLCipher.Mode.POLY1305) {
            throw new NoSuchAlgorithmException("Mode must be Poly1305");
        }
    }

    @Override // org.conscrypt.OpenSSLCipher
    public String getBaseCipherName() {
        return "ChaCha20";
    }

    @Override // org.conscrypt.OpenSSLCipher
    public int getCipherBlockSize() {
        return 0;
    }

    @Override // org.conscrypt.OpenSSLAeadCipher
    public long getEVP_AEAD(int i11) throws InvalidKeyException {
        if (i11 == 32) {
            return NativeCrypto.EVP_aead_chacha20_poly1305();
        }
        throw new RuntimeException("Unexpected key length: " + i11);
    }

    @Override // org.conscrypt.OpenSSLAeadCipher, org.conscrypt.OpenSSLCipher
    public int getOutputSizeForFinal(int i11) {
        return isEncrypting() ? this.bufCount + i11 + 16 : Math.max(0, (this.bufCount + i11) - 16);
    }
}
