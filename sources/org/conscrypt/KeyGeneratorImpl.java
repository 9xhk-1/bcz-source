package org.conscrypt;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.KeyGeneratorSpi;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import qr.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class KeyGeneratorImpl extends KeyGeneratorSpi {
    private final String algorithm;
    private int keySizeBits;
    protected SecureRandom secureRandom;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class AES extends KeyGeneratorImpl {
        public AES() {
            super("AES", 128);
        }

        @Override // org.conscrypt.KeyGeneratorImpl
        public void checkKeySize(int i11) {
            if (i11 != 128 && i11 != 192 && i11 != 256) {
                throw new InvalidParameterException("Key size must be either 128, 192, or 256 bits");
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class ARC4 extends KeyGeneratorImpl {
        public ARC4() {
            super("ARC4", 128);
        }

        @Override // org.conscrypt.KeyGeneratorImpl
        public void checkKeySize(int i11) {
            if (i11 < 40 || 2048 < i11) {
                throw new InvalidParameterException("Key size must be between 40 and 2048 bits");
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class ChaCha20 extends KeyGeneratorImpl {
        public ChaCha20() {
            super("ChaCha20", 256);
        }

        @Override // org.conscrypt.KeyGeneratorImpl
        public void checkKeySize(int i11) {
            if (i11 != 256) {
                throw new InvalidParameterException("Key size must be 256 bits");
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DESEDE extends KeyGeneratorImpl {
        public DESEDE() {
            super("DESEDE", 192);
        }

        @Override // org.conscrypt.KeyGeneratorImpl
        public void checkKeySize(int i11) {
            if (i11 != 112 && i11 != 168) {
                throw new InvalidParameterException("Key size must be either 112 or 168 bits");
            }
        }

        @Override // org.conscrypt.KeyGeneratorImpl
        public byte[] doKeyGeneration(int i11) {
            byte[] bArr = new byte[24];
            this.secureRandom.nextBytes(bArr);
            for (int i12 = 0; i12 < 24; i12++) {
                if (Integer.bitCount(bArr[i12]) % 2 == 0) {
                    bArr[i12] = (byte) (bArr[i12] ^ 1);
                }
            }
            if (i11 == 14) {
                System.arraycopy(bArr, 0, bArr, 16, 8);
            }
            return bArr;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class HmacMD5 extends KeyGeneratorImpl {
        public HmacMD5() {
            super("HmacMD5", 128);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class HmacSHA1 extends KeyGeneratorImpl {
        public HmacSHA1() {
            super("HmacSHA1", 160);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class HmacSHA224 extends KeyGeneratorImpl {
        public HmacSHA224() {
            super("HmacSHA224", 224);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class HmacSHA256 extends KeyGeneratorImpl {
        public HmacSHA256() {
            super(b.f82657b, 256);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class HmacSHA384 extends KeyGeneratorImpl {
        public HmacSHA384() {
            super("HmacSHA384", 384);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class HmacSHA512 extends KeyGeneratorImpl {
        public HmacSHA512() {
            super("HmacSHA512", 512);
        }
    }

    public void checkKeySize(int i11) {
        if (i11 <= 0) {
            throw new InvalidParameterException("Key size must be positive");
        }
    }

    public byte[] doKeyGeneration(int i11) {
        byte[] bArr = new byte[i11];
        this.secureRandom.nextBytes(bArr);
        return bArr;
    }

    @Override // javax.crypto.KeyGeneratorSpi
    public SecretKey engineGenerateKey() {
        if (this.secureRandom == null) {
            this.secureRandom = new SecureRandom();
        }
        return new SecretKeySpec(doKeyGeneration((this.keySizeBits + 7) / 8), this.algorithm);
    }

    @Override // javax.crypto.KeyGeneratorSpi
    public void engineInit(SecureRandom secureRandom) {
        this.secureRandom = secureRandom;
    }

    private KeyGeneratorImpl(String str, int i11) {
        this.algorithm = str;
        this.keySizeBits = i11;
    }

    @Override // javax.crypto.KeyGeneratorSpi
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        if (algorithmParameterSpec == null) {
            throw new InvalidAlgorithmParameterException("No params provided");
        }
        throw new InvalidAlgorithmParameterException("Unknown param type: " + algorithmParameterSpec.getClass().getName());
    }

    @Override // javax.crypto.KeyGeneratorSpi
    public void engineInit(int i11, SecureRandom secureRandom) {
        checkKeySize(i11);
        this.keySizeBits = i11;
        this.secureRandom = secureRandom;
    }
}
