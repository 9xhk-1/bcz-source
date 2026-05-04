package org.conscrypt;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import org.conscrypt.OpenSSLCipher;
import pr.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class OpenSSLAeadCipherAES extends OpenSSLAeadCipher {
    private static final int AES_BLOCK_SIZE = 16;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class GCM extends OpenSSLAeadCipherAES {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class AES_128 extends GCM {
            @Override // org.conscrypt.OpenSSLAeadCipherAES, org.conscrypt.OpenSSLCipher
            public void checkSupportedKeySize(int i11) throws InvalidKeyException {
                if (i11 == 16) {
                    return;
                }
                throw new InvalidKeyException("Unsupported key size: " + i11 + " bytes (must be 16)");
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class AES_256 extends GCM {
            @Override // org.conscrypt.OpenSSLAeadCipherAES, org.conscrypt.OpenSSLCipher
            public void checkSupportedKeySize(int i11) throws InvalidKeyException {
                if (i11 == 32) {
                    return;
                }
                throw new InvalidKeyException("Unsupported key size: " + i11 + " bytes (must be 32)");
            }
        }

        public GCM() {
            super(OpenSSLCipher.Mode.GCM);
        }

        @Override // org.conscrypt.OpenSSLCipher
        public void checkSupportedMode(OpenSSLCipher.Mode mode) throws NoSuchAlgorithmException {
            if (mode != OpenSSLCipher.Mode.GCM) {
                throw new NoSuchAlgorithmException("Mode must be GCM");
            }
        }

        @Override // org.conscrypt.OpenSSLAeadCipher
        public long getEVP_AEAD(int i11) throws InvalidKeyException {
            if (i11 == 16) {
                return NativeCrypto.EVP_aead_aes_128_gcm();
            }
            if (i11 == 32) {
                return NativeCrypto.EVP_aead_aes_256_gcm();
            }
            throw new RuntimeException("Unexpected key length: " + i11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class GCM_SIV extends OpenSSLAeadCipherAES {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class AES_128 extends GCM_SIV {
            @Override // org.conscrypt.OpenSSLAeadCipherAES, org.conscrypt.OpenSSLCipher
            public void checkSupportedKeySize(int i11) throws InvalidKeyException {
                if (i11 == 16) {
                    return;
                }
                throw new InvalidKeyException("Unsupported key size: " + i11 + " bytes (must be 16)");
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class AES_256 extends GCM_SIV {
            @Override // org.conscrypt.OpenSSLAeadCipherAES, org.conscrypt.OpenSSLCipher
            public void checkSupportedKeySize(int i11) throws InvalidKeyException {
                if (i11 == 32) {
                    return;
                }
                throw new InvalidKeyException("Unsupported key size: " + i11 + " bytes (must be 32)");
            }
        }

        public GCM_SIV() {
            super(OpenSSLCipher.Mode.GCM_SIV);
        }

        @Override // org.conscrypt.OpenSSLAeadCipher
        public boolean allowsNonceReuse() {
            return true;
        }

        @Override // org.conscrypt.OpenSSLCipher
        public void checkSupportedMode(OpenSSLCipher.Mode mode) throws NoSuchAlgorithmException {
            if (mode != OpenSSLCipher.Mode.GCM_SIV) {
                throw new NoSuchAlgorithmException("Mode must be GCM-SIV");
            }
        }

        @Override // org.conscrypt.OpenSSLAeadCipher
        public void checkSupportedTagLength(int i11) throws InvalidAlgorithmParameterException {
            if (i11 != 128) {
                throw new InvalidAlgorithmParameterException("Tag length must be 128 bits");
            }
        }

        @Override // org.conscrypt.OpenSSLAeadCipher
        public long getEVP_AEAD(int i11) throws InvalidKeyException {
            if (i11 == 16) {
                return NativeCrypto.EVP_aead_aes_128_gcm_siv();
            }
            if (i11 == 32) {
                return NativeCrypto.EVP_aead_aes_256_gcm_siv();
            }
            throw new RuntimeException("Unexpected key length: " + i11);
        }
    }

    public OpenSSLAeadCipherAES(OpenSSLCipher.Mode mode) {
        super(mode);
    }

    @Override // org.conscrypt.OpenSSLCipher
    public void checkSupportedKeySize(int i11) throws InvalidKeyException {
        if (i11 == 16 || i11 == 32) {
            return;
        }
        throw new InvalidKeyException("Unsupported key size: " + i11 + " bytes (must be 16 or 32)");
    }

    @Override // org.conscrypt.OpenSSLCipher, javax.crypto.CipherSpi
    public AlgorithmParameters engineGetParameters() {
        byte[] bArr = this.f77776iv;
        if (bArr == null) {
            return null;
        }
        AlgorithmParameterSpec gCMParameterSpec = Platform.toGCMParameterSpec(this.tagLengthInBytes * 8, bArr);
        if (gCMParameterSpec == null) {
            return super.engineGetParameters();
        }
        try {
            AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance(b.f81166d);
            algorithmParameters.init(gCMParameterSpec);
            return algorithmParameters;
        } catch (NoSuchAlgorithmException e11) {
            throw ((Error) new AssertionError("GCM not supported").initCause(e11));
        } catch (InvalidParameterSpecException unused) {
            return null;
        }
    }

    @Override // org.conscrypt.OpenSSLCipher
    public String getBaseCipherName() {
        return "AES";
    }

    @Override // org.conscrypt.OpenSSLCipher
    public int getCipherBlockSize() {
        return 16;
    }

    @Override // org.conscrypt.OpenSSLAeadCipher, org.conscrypt.OpenSSLCipher
    public int getOutputSizeForFinal(int i11) {
        return isEncrypting() ? this.bufCount + i11 + this.tagLengthInBytes : Math.max(0, (this.bufCount + i11) - this.tagLengthInBytes);
    }

    @Override // org.conscrypt.OpenSSLCipher
    public AlgorithmParameterSpec getParameterSpec(AlgorithmParameters algorithmParameters) throws InvalidAlgorithmParameterException {
        if (algorithmParameters == null) {
            return null;
        }
        AlgorithmParameterSpec fromGCMParameters = Platform.fromGCMParameters(algorithmParameters);
        return fromGCMParameters != null ? fromGCMParameters : super.getParameterSpec(algorithmParameters);
    }
}
