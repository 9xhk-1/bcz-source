package org.conscrypt;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.BadPaddingException;
import javax.crypto.CipherSpi;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import javax.crypto.spec.SecretKeySpec;
import org.conscrypt.EvpMdRef;
import org.conscrypt.NativeRef;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class OpenSSLCipherRSA extends CipherSpi {
    private byte[] buffer;
    private int bufferOffset;
    boolean encrypting;
    private boolean inputTooLarge;
    OpenSSLKey key;
    int padding;
    boolean usingPrivateKey;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class DirectRSA extends OpenSSLCipherRSA {
        public DirectRSA(int i11) {
            super(i11);
        }

        @Override // org.conscrypt.OpenSSLCipherRSA
        public int doCryptoOperation(byte[] bArr, byte[] bArr2) throws BadPaddingException, IllegalBlockSizeException {
            if (this.encrypting) {
                return this.usingPrivateKey ? NativeCrypto.RSA_private_encrypt(bArr.length, bArr, bArr2, this.key.getNativeRef(), this.padding) : NativeCrypto.RSA_public_encrypt(bArr.length, bArr, bArr2, this.key.getNativeRef(), this.padding);
            }
            try {
                return this.usingPrivateKey ? NativeCrypto.RSA_private_decrypt(bArr.length, bArr, bArr2, this.key.getNativeRef(), this.padding) : NativeCrypto.RSA_public_decrypt(bArr.length, bArr, bArr2, this.key.getNativeRef(), this.padding);
            } catch (SignatureException e11) {
                IllegalBlockSizeException illegalBlockSizeException = new IllegalBlockSizeException();
                illegalBlockSizeException.initCause(e11);
                throw illegalBlockSizeException;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class PKCS1 extends DirectRSA {
        public PKCS1() {
            super(1);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Raw extends DirectRSA {
        public Raw() {
            super(3);
        }
    }

    public OpenSSLCipherRSA(int i11) {
        this.padding = i11;
    }

    public abstract int doCryptoOperation(byte[] bArr, byte[] bArr2) throws BadPaddingException, IllegalBlockSizeException;

    @Override // javax.crypto.CipherSpi
    public byte[] engineDoFinal(byte[] bArr, int i11, int i12) throws IllegalBlockSizeException, BadPaddingException {
        if (bArr != null) {
            engineUpdate(bArr, i11, i12);
        }
        if (this.inputTooLarge) {
            throw new IllegalBlockSizeException("input must be under " + this.buffer.length + " bytes");
        }
        int i13 = this.bufferOffset;
        byte[] bArr2 = this.buffer;
        if (i13 != bArr2.length) {
            if (this.padding == 3) {
                byte[] bArr3 = new byte[bArr2.length];
                System.arraycopy(bArr2, 0, bArr3, bArr2.length - i13, i13);
                bArr2 = bArr3;
            } else {
                bArr2 = Arrays.copyOf(bArr2, i13);
            }
        }
        int length = this.buffer.length;
        byte[] bArr4 = new byte[length];
        int doCryptoOperation = doCryptoOperation(bArr2, bArr4);
        if (!this.encrypting && doCryptoOperation != length) {
            bArr4 = Arrays.copyOf(bArr4, doCryptoOperation);
        }
        this.bufferOffset = 0;
        return bArr4;
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetBlockSize() {
        return this.encrypting ? paddedBlockSizeBytes() : keySizeBytes();
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineGetIV() {
        return null;
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetKeySize(Key key) throws InvalidKeyException {
        if (key instanceof OpenSSLRSAPrivateKey) {
            return ((OpenSSLRSAPrivateKey) key).getModulus().bitLength();
        }
        if (key instanceof RSAPrivateCrtKey) {
            return ((RSAPrivateCrtKey) key).getModulus().bitLength();
        }
        if (key instanceof RSAPrivateKey) {
            return ((RSAPrivateKey) key).getModulus().bitLength();
        }
        if (key instanceof OpenSSLRSAPublicKey) {
            return ((OpenSSLRSAPublicKey) key).getModulus().bitLength();
        }
        if (key instanceof RSAPublicKey) {
            return ((RSAPublicKey) key).getModulus().bitLength();
        }
        if (key == null) {
            throw new InvalidKeyException("RSA private or public key is null");
        }
        throw new InvalidKeyException("Need RSA private or public key");
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetOutputSize(int i11) {
        return this.encrypting ? keySizeBytes() : paddedBlockSizeBytes();
    }

    @Override // javax.crypto.CipherSpi
    public AlgorithmParameters engineGetParameters() {
        return null;
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i11, Key key, SecureRandom secureRandom) throws InvalidKeyException {
        try {
            engineInitInternal(i11, key, null);
        } catch (InvalidAlgorithmParameterException e11) {
            throw new InvalidKeyException("Algorithm parameters rejected when none supplied", e11);
        }
    }

    public void engineInitInternal(int i11, Key key, AlgorithmParameterSpec algorithmParameterSpec) throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (i11 == 1 || i11 == 3) {
            this.encrypting = true;
        } else {
            if (i11 != 2 && i11 != 4) {
                throw new InvalidParameterException("Unsupported opmode " + i11);
            }
            this.encrypting = false;
        }
        if (key instanceof OpenSSLRSAPrivateKey) {
            this.usingPrivateKey = true;
            this.key = ((OpenSSLRSAPrivateKey) key).getOpenSSLKey();
        } else if (key instanceof RSAPrivateCrtKey) {
            this.usingPrivateKey = true;
            this.key = OpenSSLRSAPrivateCrtKey.getInstance((RSAPrivateCrtKey) key);
        } else if (key instanceof RSAPrivateKey) {
            this.usingPrivateKey = true;
            this.key = OpenSSLRSAPrivateKey.getInstance((RSAPrivateKey) key);
        } else if (key instanceof OpenSSLRSAPublicKey) {
            this.usingPrivateKey = false;
            this.key = ((OpenSSLRSAPublicKey) key).getOpenSSLKey();
        } else {
            if (!(key instanceof RSAPublicKey)) {
                if (key != null) {
                    throw new InvalidKeyException("Need RSA private or public key");
                }
                throw new InvalidKeyException("RSA private or public key is null");
            }
            this.usingPrivateKey = false;
            this.key = OpenSSLRSAPublicKey.getInstance((RSAPublicKey) key);
        }
        this.buffer = new byte[NativeCrypto.RSA_size(this.key.getNativeRef())];
        this.bufferOffset = 0;
        this.inputTooLarge = false;
        doCryptoInit(algorithmParameterSpec);
    }

    @Override // javax.crypto.CipherSpi
    public void engineSetMode(String str) throws NoSuchAlgorithmException {
        String upperCase = str.toUpperCase(Locale.ROOT);
        if ("NONE".equals(upperCase) || "ECB".equals(upperCase)) {
            return;
        }
        throw new NoSuchAlgorithmException("mode not supported: " + str);
    }

    @Override // javax.crypto.CipherSpi
    public void engineSetPadding(String str) throws NoSuchPaddingException {
        String upperCase = str.toUpperCase(Locale.ROOT);
        if ("PKCS1PADDING".equals(upperCase)) {
            this.padding = 1;
        } else {
            if ("NOPADDING".equals(upperCase)) {
                this.padding = 3;
                return;
            }
            throw new NoSuchPaddingException("padding not supported: " + str);
        }
    }

    @Override // javax.crypto.CipherSpi
    public Key engineUnwrap(byte[] bArr, String str, int i11) throws InvalidKeyException, NoSuchAlgorithmException {
        try {
            byte[] engineDoFinal = engineDoFinal(bArr, 0, bArr.length);
            if (i11 == 1) {
                return KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(engineDoFinal));
            }
            if (i11 == 2) {
                return KeyFactory.getInstance(str).generatePrivate(new PKCS8EncodedKeySpec(engineDoFinal));
            }
            if (i11 == 3) {
                return new SecretKeySpec(engineDoFinal, str);
            }
            throw new UnsupportedOperationException("wrappedKeyType == " + i11);
        } catch (InvalidKeySpecException e11) {
            throw new InvalidKeyException(e11);
        } catch (BadPaddingException e12) {
            throw new InvalidKeyException(e12);
        } catch (IllegalBlockSizeException e13) {
            throw new InvalidKeyException(e13);
        }
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineUpdate(byte[] bArr, int i11, int i12) {
        int i13 = this.bufferOffset;
        int i14 = i13 + i12;
        byte[] bArr2 = this.buffer;
        if (i14 > bArr2.length) {
            this.inputTooLarge = true;
            return EmptyArray.BYTE;
        }
        System.arraycopy(bArr, i11, bArr2, i13, i12);
        this.bufferOffset += i12;
        return EmptyArray.BYTE;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineWrap(Key key) throws IllegalBlockSizeException, InvalidKeyException {
        try {
            byte[] encoded = key.getEncoded();
            return engineDoFinal(encoded, 0, encoded.length);
        } catch (BadPaddingException e11) {
            IllegalBlockSizeException illegalBlockSizeException = new IllegalBlockSizeException();
            illegalBlockSizeException.initCause(e11);
            throw illegalBlockSizeException;
        }
    }

    public boolean isInitialized() {
        return this.key != null;
    }

    public int keySizeBytes() {
        if (isInitialized()) {
            return NativeCrypto.RSA_size(this.key.getNativeRef());
        }
        throw new IllegalStateException("cipher is not initialized");
    }

    public int paddedBlockSizeBytes() {
        int keySizeBytes = keySizeBytes();
        return this.padding == 1 ? keySizeBytes - 11 : keySizeBytes;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class OAEP extends OpenSSLCipherRSA {
        private byte[] label;
        private long mgf1Md;
        private long oaepMd;
        private int oaepMdSizeBytes;
        private NativeRef.EVP_PKEY_CTX pkeyCtx;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class SHA1 extends OAEP {
            public SHA1() {
                super(EvpMdRef.SHA1.EVP_MD, EvpMdRef.SHA1.SIZE_BYTES);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class SHA224 extends OAEP {
            public SHA224() {
                super(EvpMdRef.SHA224.EVP_MD, EvpMdRef.SHA224.SIZE_BYTES);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class SHA256 extends OAEP {
            public SHA256() {
                super(EvpMdRef.SHA256.EVP_MD, EvpMdRef.SHA256.SIZE_BYTES);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class SHA384 extends OAEP {
            public SHA384() {
                super(EvpMdRef.SHA384.EVP_MD, EvpMdRef.SHA384.SIZE_BYTES);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class SHA512 extends OAEP {
            public SHA512() {
                super(EvpMdRef.SHA512.EVP_MD, EvpMdRef.SHA512.SIZE_BYTES);
            }
        }

        public OAEP(long j11, int i11) {
            super(4);
            this.mgf1Md = j11;
            this.oaepMd = j11;
            this.oaepMdSizeBytes = i11;
        }

        private void readOAEPParameters(OAEPParameterSpec oAEPParameterSpec) throws InvalidAlgorithmParameterException {
            String mGFAlgorithm = oAEPParameterSpec.getMGFAlgorithm();
            Locale locale = Locale.US;
            String upperCase = mGFAlgorithm.toUpperCase(locale);
            AlgorithmParameterSpec mGFParameters = oAEPParameterSpec.getMGFParameters();
            if ((!"MGF1".equals(upperCase) && !"1.2.840.113549.1.1.8".equals(upperCase)) || !(mGFParameters instanceof MGF1ParameterSpec)) {
                throw new InvalidAlgorithmParameterException("Only MGF1 supported as mask generation function");
            }
            MGF1ParameterSpec mGF1ParameterSpec = (MGF1ParameterSpec) mGFParameters;
            String upperCase2 = oAEPParameterSpec.getDigestAlgorithm().toUpperCase(locale);
            try {
                this.oaepMd = EvpMdRef.getEVP_MDByJcaDigestAlgorithmStandardName(upperCase2);
                this.oaepMdSizeBytes = EvpMdRef.getDigestSizeBytesByJcaDigestAlgorithmStandardName(upperCase2);
                this.mgf1Md = EvpMdRef.getEVP_MDByJcaDigestAlgorithmStandardName(mGF1ParameterSpec.getDigestAlgorithm());
                PSource pSource = oAEPParameterSpec.getPSource();
                if (!"PSpecified".equals(pSource.getAlgorithm()) || !(pSource instanceof PSource.PSpecified)) {
                    throw new InvalidAlgorithmParameterException("Only PSpecified accepted for PSource");
                }
                this.label = ((PSource.PSpecified) pSource).getValue();
            } catch (NoSuchAlgorithmException e11) {
                throw new InvalidAlgorithmParameterException(e11);
            }
        }

        @Override // org.conscrypt.OpenSSLCipherRSA
        public void doCryptoInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException, InvalidKeyException {
            this.pkeyCtx = new NativeRef.EVP_PKEY_CTX(this.encrypting ? NativeCrypto.EVP_PKEY_encrypt_init(this.key.getNativeRef()) : NativeCrypto.EVP_PKEY_decrypt_init(this.key.getNativeRef()));
            if (algorithmParameterSpec instanceof OAEPParameterSpec) {
                readOAEPParameters((OAEPParameterSpec) algorithmParameterSpec);
            }
            NativeCrypto.EVP_PKEY_CTX_set_rsa_padding(this.pkeyCtx.address, 4);
            NativeCrypto.EVP_PKEY_CTX_set_rsa_oaep_md(this.pkeyCtx.address, this.oaepMd);
            NativeCrypto.EVP_PKEY_CTX_set_rsa_mgf1_md(this.pkeyCtx.address, this.mgf1Md);
            byte[] bArr = this.label;
            if (bArr == null || bArr.length <= 0) {
                return;
            }
            NativeCrypto.EVP_PKEY_CTX_set_rsa_oaep_label(this.pkeyCtx.address, bArr);
        }

        @Override // org.conscrypt.OpenSSLCipherRSA
        public int doCryptoOperation(byte[] bArr, byte[] bArr2) throws BadPaddingException, IllegalBlockSizeException {
            return this.encrypting ? NativeCrypto.EVP_PKEY_encrypt(this.pkeyCtx, bArr2, 0, bArr, 0, bArr.length) : NativeCrypto.EVP_PKEY_decrypt(this.pkeyCtx, bArr2, 0, bArr, 0, bArr.length);
        }

        @Override // org.conscrypt.OpenSSLCipherRSA, javax.crypto.CipherSpi
        public AlgorithmParameters engineGetParameters() {
            if (!isInitialized()) {
                return null;
            }
            try {
                AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance("OAEP");
                algorithmParameters.init(new OAEPParameterSpec(EvpMdRef.getJcaDigestAlgorithmStandardNameFromEVP_MD(this.oaepMd), "MGF1", new MGF1ParameterSpec(EvpMdRef.getJcaDigestAlgorithmStandardNameFromEVP_MD(this.mgf1Md)), this.label == null ? PSource.PSpecified.DEFAULT : new PSource.PSpecified(this.label)));
                return algorithmParameters;
            } catch (NoSuchAlgorithmException e11) {
                throw ((Error) new AssertionError("OAEP not supported").initCause(e11));
            } catch (InvalidParameterSpecException unused) {
                throw new RuntimeException("No providers of AlgorithmParameters.OAEP available");
            }
        }

        @Override // org.conscrypt.OpenSSLCipherRSA, javax.crypto.CipherSpi
        public void engineInit(int i11, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
            if (algorithmParameterSpec != null && !(algorithmParameterSpec instanceof OAEPParameterSpec)) {
                throw new InvalidAlgorithmParameterException("Only OAEPParameterSpec accepted in OAEP mode");
            }
            engineInitInternal(i11, key, algorithmParameterSpec);
        }

        @Override // org.conscrypt.OpenSSLCipherRSA
        public void engineInitInternal(int i11, Key key, AlgorithmParameterSpec algorithmParameterSpec) throws InvalidKeyException, InvalidAlgorithmParameterException {
            if (i11 == 1 || i11 == 3) {
                if (!(key instanceof PublicKey)) {
                    throw new InvalidKeyException("Only public keys may be used to encrypt");
                }
            } else if ((i11 == 2 || i11 == 4) && !(key instanceof PrivateKey)) {
                throw new InvalidKeyException("Only private keys may be used to decrypt");
            }
            super.engineInitInternal(i11, key, algorithmParameterSpec);
        }

        @Override // org.conscrypt.OpenSSLCipherRSA, javax.crypto.CipherSpi
        public void engineSetPadding(String str) throws NoSuchPaddingException {
            if (!str.toUpperCase(Locale.US).equals("OAEPPADDING")) {
                throw new NoSuchPaddingException("Only OAEP padding is supported");
            }
            this.padding = 4;
        }

        @Override // org.conscrypt.OpenSSLCipherRSA
        public int paddedBlockSizeBytes() {
            return keySizeBytes() - ((this.oaepMdSizeBytes * 2) + 2);
        }

        @Override // org.conscrypt.OpenSSLCipherRSA, javax.crypto.CipherSpi
        public void engineInit(int i11, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
            OAEPParameterSpec oAEPParameterSpec;
            if (algorithmParameters != null) {
                try {
                    oAEPParameterSpec = (OAEPParameterSpec) algorithmParameters.getParameterSpec(OAEPParameterSpec.class);
                } catch (InvalidParameterSpecException e11) {
                    throw new InvalidAlgorithmParameterException("Only OAEP parameters are supported", e11);
                }
            } else {
                oAEPParameterSpec = null;
            }
            engineInitInternal(i11, key, oAEPParameterSpec);
        }
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i11, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (algorithmParameterSpec == null) {
            engineInitInternal(i11, key, algorithmParameterSpec);
            return;
        }
        throw new InvalidAlgorithmParameterException("unknown param type: " + algorithmParameterSpec.getClass().getName());
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i11, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (algorithmParameters == null) {
            engineInitInternal(i11, key, null);
            return;
        }
        throw new InvalidAlgorithmParameterException("unknown param type: " + algorithmParameters.getClass().getName());
    }

    @Override // javax.crypto.CipherSpi
    public int engineUpdate(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) throws ShortBufferException {
        engineUpdate(bArr, i11, i12);
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    public int engineDoFinal(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) throws ShortBufferException, IllegalBlockSizeException, BadPaddingException {
        byte[] engineDoFinal = engineDoFinal(bArr, i11, i12);
        int length = engineDoFinal.length + i13;
        if (length <= bArr2.length) {
            System.arraycopy(engineDoFinal, 0, bArr2, i13, engineDoFinal.length);
            return engineDoFinal.length;
        }
        throw new ShortBufferWithoutStackTraceException("output buffer is too small " + bArr2.length + " < " + length);
    }

    public void doCryptoInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException, InvalidKeyException {
    }
}
