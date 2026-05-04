package org.conscrypt;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.BadPaddingException;
import javax.crypto.CipherSpi;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class OpenSSLCipher extends CipherSpi {
    private int blockSize;
    byte[] encodedKey;
    private boolean encrypting;

    /* renamed from: iv, reason: collision with root package name */
    byte[] f77776iv;
    Mode mode;
    private Padding padding;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum Mode {
        NONE,
        CBC,
        CTR,
        ECB,
        GCM,
        GCM_SIV,
        POLY1305;

        public static Mode getNormalized(String str) {
            String upperCase = str.toUpperCase(Locale.US);
            if (upperCase.equals("GCM-SIV")) {
                return GCM_SIV;
            }
            if (upperCase.equals("GCM_SIV")) {
                throw new IllegalArgumentException("Invalid mode");
            }
            return valueOf(upperCase);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum Padding {
        NOPADDING,
        PKCS5PADDING,
        PKCS7PADDING;

        public static Padding getNormalized(String str) {
            Padding valueOf = valueOf(str.toUpperCase(Locale.US));
            return valueOf == PKCS7PADDING ? PKCS5PADDING : valueOf;
        }
    }

    public OpenSSLCipher() {
        this.mode = Mode.ECB;
        this.padding = Padding.PKCS5PADDING;
    }

    private byte[] checkAndSetEncodedKey(int i11, Key key) throws InvalidKeyException {
        if (i11 == 1 || i11 == 3) {
            this.encrypting = true;
        } else {
            if (i11 != 2 && i11 != 4) {
                throw new InvalidParameterException("Unsupported opmode " + i11);
            }
            this.encrypting = false;
        }
        if (!(key instanceof SecretKey)) {
            throw new InvalidKeyException("Only SecretKey is supported");
        }
        byte[] encoded = key.getEncoded();
        if (encoded == null) {
            throw new InvalidKeyException("key.getEncoded() == null");
        }
        checkSupportedKeySize(encoded.length);
        this.encodedKey = encoded;
        return encoded;
    }

    public abstract void checkSupportedKeySize(int i11) throws InvalidKeyException;

    public abstract void checkSupportedMode(Mode mode) throws NoSuchAlgorithmException;

    public abstract void checkSupportedPadding(Padding padding) throws NoSuchPaddingException;

    public abstract int doFinalInternal(byte[] bArr, int i11, int i12) throws IllegalBlockSizeException, BadPaddingException, ShortBufferException;

    @Override // javax.crypto.CipherSpi
    public byte[] engineDoFinal(byte[] bArr, int i11, int i12) throws IllegalBlockSizeException, BadPaddingException {
        int i13;
        int outputSizeForFinal = getOutputSizeForFinal(i12);
        byte[] bArr2 = new byte[outputSizeForFinal];
        if (i12 > 0) {
            try {
                i13 = updateInternal(bArr, i11, i12, bArr2, 0, outputSizeForFinal);
            } catch (ShortBufferException e11) {
                throw new RuntimeException("our calculated buffer was too small", e11);
            }
        } else {
            i13 = 0;
        }
        try {
            int doFinalInternal = i13 + doFinalInternal(bArr2, i13, outputSizeForFinal - i13);
            return doFinalInternal == outputSizeForFinal ? bArr2 : doFinalInternal == 0 ? EmptyArray.BYTE : Arrays.copyOfRange(bArr2, 0, doFinalInternal);
        } catch (ShortBufferException e12) {
            throw new RuntimeException("our calculated buffer was too small", e12);
        }
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetBlockSize() {
        return this.blockSize;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineGetIV() {
        return this.f77776iv;
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetKeySize(Key key) throws InvalidKeyException {
        if (!(key instanceof SecretKey)) {
            throw new InvalidKeyException("Only SecretKey is supported");
        }
        byte[] encoded = key.getEncoded();
        if (encoded == null) {
            throw new InvalidKeyException("key.getEncoded() == null");
        }
        checkSupportedKeySize(encoded.length);
        return encoded.length * 8;
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetOutputSize(int i11) {
        return Math.max(getOutputSizeForUpdate(i11), getOutputSizeForFinal(i11));
    }

    @Override // javax.crypto.CipherSpi
    public AlgorithmParameters engineGetParameters() {
        byte[] bArr = this.f77776iv;
        if (bArr != null && bArr.length > 0) {
            try {
                AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance(getBaseCipherName());
                algorithmParameters.init(new IvParameterSpec(this.f77776iv));
                return algorithmParameters;
            } catch (NoSuchAlgorithmException | InvalidParameterSpecException unused) {
            }
        }
        return null;
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i11, Key key, SecureRandom secureRandom) throws InvalidKeyException {
        checkAndSetEncodedKey(i11, key);
        try {
            engineInitInternal(this.encodedKey, null, secureRandom);
        } catch (InvalidAlgorithmParameterException e11) {
            throw new RuntimeException(e11);
        }
    }

    public abstract void engineInitInternal(byte[] bArr, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException;

    @Override // javax.crypto.CipherSpi
    public void engineSetMode(String str) throws NoSuchAlgorithmException {
        try {
            Mode normalized = Mode.getNormalized(str);
            checkSupportedMode(normalized);
            this.mode = normalized;
        } catch (IllegalArgumentException e11) {
            NoSuchAlgorithmException noSuchAlgorithmException = new NoSuchAlgorithmException("No such mode: " + str);
            noSuchAlgorithmException.initCause(e11);
            throw noSuchAlgorithmException;
        }
    }

    @Override // javax.crypto.CipherSpi
    public void engineSetPadding(String str) throws NoSuchPaddingException {
        try {
            Padding normalized = Padding.getNormalized(str);
            checkSupportedPadding(normalized);
            this.padding = normalized;
        } catch (IllegalArgumentException e11) {
            NoSuchPaddingException noSuchPaddingException = new NoSuchPaddingException("No such padding: " + str);
            noSuchPaddingException.initCause(e11);
            throw noSuchPaddingException;
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
        int outputSizeForUpdate = getOutputSizeForUpdate(i12);
        byte[] bArr2 = outputSizeForUpdate > 0 ? new byte[outputSizeForUpdate] : EmptyArray.BYTE;
        try {
            int updateInternal = updateInternal(bArr, i11, i12, bArr2, 0, outputSizeForUpdate);
            return bArr2.length == updateInternal ? bArr2 : updateInternal == 0 ? EmptyArray.BYTE : Arrays.copyOfRange(bArr2, 0, updateInternal);
        } catch (ShortBufferException unused) {
            throw new RuntimeException("calculated buffer size was wrong: " + outputSizeForUpdate);
        }
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

    public abstract String getBaseCipherName();

    public abstract int getCipherBlockSize();

    public abstract int getOutputSizeForFinal(int i11);

    public abstract int getOutputSizeForUpdate(int i11);

    public Padding getPadding() {
        return this.padding;
    }

    public AlgorithmParameterSpec getParameterSpec(AlgorithmParameters algorithmParameters) throws InvalidAlgorithmParameterException {
        if (algorithmParameters == null) {
            return null;
        }
        try {
            return algorithmParameters.getParameterSpec(IvParameterSpec.class);
        } catch (InvalidParameterSpecException e11) {
            throw new InvalidAlgorithmParameterException("Params must be convertible to IvParameterSpec", e11);
        }
    }

    public boolean isEncrypting() {
        return this.encrypting;
    }

    public boolean supportsVariableSizeIv() {
        return false;
    }

    public boolean supportsVariableSizeKey() {
        return false;
    }

    public abstract int updateInternal(byte[] bArr, int i11, int i12, byte[] bArr2, int i13, int i14) throws ShortBufferException;

    public OpenSSLCipher(Mode mode, Padding padding) {
        this.mode = Mode.ECB;
        Padding padding2 = Padding.PKCS5PADDING;
        this.mode = mode;
        this.padding = padding;
        this.blockSize = getCipherBlockSize();
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i11, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        checkAndSetEncodedKey(i11, key);
        engineInitInternal(this.encodedKey, algorithmParameterSpec, secureRandom);
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i11, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        engineInit(i11, key, getParameterSpec(algorithmParameters), secureRandom);
    }

    @Override // javax.crypto.CipherSpi
    public int engineUpdate(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) throws ShortBufferException {
        return updateInternal(bArr, i11, i12, bArr2, i13, getOutputSizeForUpdate(i12));
    }

    @Override // javax.crypto.CipherSpi
    public int engineDoFinal(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) throws ShortBufferException, IllegalBlockSizeException, BadPaddingException {
        byte[] bArr3;
        int i14;
        if (bArr2 != null) {
            int outputSizeForFinal = getOutputSizeForFinal(i12);
            if (i12 > 0) {
                bArr3 = bArr2;
                i14 = updateInternal(bArr, i11, i12, bArr3, i13, outputSizeForFinal);
                i13 += i14;
                outputSizeForFinal -= i14;
            } else {
                bArr3 = bArr2;
                i14 = 0;
            }
            return i14 + doFinalInternal(bArr3, i13, outputSizeForFinal);
        }
        throw new NullPointerException("output == null");
    }
}
