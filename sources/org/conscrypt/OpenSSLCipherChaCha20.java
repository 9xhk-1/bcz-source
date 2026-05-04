package org.conscrypt;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import org.conscrypt.OpenSSLCipher;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class OpenSSLCipherChaCha20 extends OpenSSLCipher {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int BLOCK_SIZE_BYTES = 64;
    private static final int NONCE_SIZE_BYTES = 12;
    private int currentBlockConsumedBytes = 0;
    private int blockCounter = 0;

    private void reset() {
        this.blockCounter = 0;
        this.currentBlockConsumedBytes = 0;
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
        if (mode != OpenSSLCipher.Mode.NONE) {
            throw new NoSuchAlgorithmException("Mode must be NONE");
        }
    }

    @Override // org.conscrypt.OpenSSLCipher
    public void checkSupportedPadding(OpenSSLCipher.Padding padding) throws NoSuchPaddingException {
        if (padding != OpenSSLCipher.Padding.NOPADDING) {
            throw new NoSuchPaddingException("Must be NoPadding");
        }
    }

    @Override // org.conscrypt.OpenSSLCipher
    public int doFinalInternal(byte[] bArr, int i11, int i12) throws IllegalBlockSizeException, BadPaddingException, ShortBufferException {
        reset();
        return 0;
    }

    @Override // org.conscrypt.OpenSSLCipher
    public void engineInitInternal(byte[] bArr, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (algorithmParameterSpec instanceof IvParameterSpec) {
            IvParameterSpec ivParameterSpec = (IvParameterSpec) algorithmParameterSpec;
            if (ivParameterSpec.getIV().length != 12) {
                throw new InvalidAlgorithmParameterException("IV must be 12 bytes long");
            }
            this.f77776iv = ivParameterSpec.getIV();
            return;
        }
        if (!isEncrypting()) {
            throw new InvalidAlgorithmParameterException("IV must be specified when decrypting");
        }
        byte[] bArr2 = new byte[12];
        this.f77776iv = bArr2;
        if (secureRandom != null) {
            secureRandom.nextBytes(bArr2);
        } else {
            NativeCrypto.RAND_bytes(bArr2);
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

    @Override // org.conscrypt.OpenSSLCipher
    public int updateInternal(byte[] bArr, int i11, int i12, byte[] bArr2, int i13, int i14) throws ShortBufferException {
        int i15;
        int i16;
        int i17;
        if (i12 > bArr2.length - i13) {
            throw new ShortBufferWithoutStackTraceException("Insufficient output space");
        }
        int i18 = this.currentBlockConsumedBytes;
        if (i18 > 0) {
            int min = Math.min(64 - i18, i12);
            byte[] bArr3 = new byte[64];
            byte[] bArr4 = new byte[64];
            System.arraycopy(bArr, i11, bArr3, this.currentBlockConsumedBytes, min);
            NativeCrypto.chacha20_encrypt_decrypt(bArr3, 0, bArr4, 0, 64, this.encodedKey, this.f77776iv, this.blockCounter);
            System.arraycopy(bArr4, this.currentBlockConsumedBytes, bArr2, i13, min);
            int i19 = this.currentBlockConsumedBytes + min;
            this.currentBlockConsumedBytes = i19;
            if (i19 < 64) {
                return min;
            }
            this.currentBlockConsumedBytes = 0;
            this.blockCounter++;
            i15 = i12 - min;
            i17 = i13 + min;
            i16 = i11 + min;
        } else {
            i15 = i12;
            i16 = i11;
            i17 = i13;
        }
        NativeCrypto.chacha20_encrypt_decrypt(bArr, i16, bArr2, i17, i15, this.encodedKey, this.f77776iv, this.blockCounter);
        this.currentBlockConsumedBytes = i15 % 64;
        this.blockCounter += i15 / 64;
        return i12;
    }

    @Override // org.conscrypt.OpenSSLCipher
    public int getOutputSizeForFinal(int i11) {
        return i11;
    }

    @Override // org.conscrypt.OpenSSLCipher
    public int getOutputSizeForUpdate(int i11) {
        return i11;
    }
}
