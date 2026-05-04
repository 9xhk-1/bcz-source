package org.conscrypt;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import org.conscrypt.NativeRef;
import org.conscrypt.OpenSSLCipher;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class OpenSSLEvpCipher extends OpenSSLCipher {
    private boolean calledUpdate;
    private final NativeRef.EVP_CIPHER_CTX cipherCtx;
    private int modeBlockSize;

    public OpenSSLEvpCipher(OpenSSLCipher.Mode mode, OpenSSLCipher.Padding padding) {
        super(mode, padding);
        this.cipherCtx = new NativeRef.EVP_CIPHER_CTX(NativeCrypto.EVP_CIPHER_CTX_new());
    }

    private void reset() {
        NativeCrypto.EVP_CipherInit_ex(this.cipherCtx, 0L, this.encodedKey, this.f77776iv, isEncrypting());
        this.calledUpdate = false;
    }

    @Override // org.conscrypt.OpenSSLCipher
    public int doFinalInternal(byte[] bArr, int i11, int i12) throws IllegalBlockSizeException, BadPaddingException, ShortBufferException {
        int i13;
        if (!isEncrypting() && !this.calledUpdate) {
            return 0;
        }
        int length = bArr.length - i11;
        if (length >= i12) {
            i13 = NativeCrypto.EVP_CipherFinal_ex(this.cipherCtx, bArr, i11);
        } else {
            byte[] bArr2 = new byte[i12];
            int EVP_CipherFinal_ex = NativeCrypto.EVP_CipherFinal_ex(this.cipherCtx, bArr2, 0);
            if (EVP_CipherFinal_ex > length) {
                throw new ShortBufferWithoutStackTraceException("buffer is too short: " + EVP_CipherFinal_ex + " > " + length);
            }
            if (EVP_CipherFinal_ex > 0) {
                System.arraycopy(bArr2, 0, bArr, i11, EVP_CipherFinal_ex);
            }
            i13 = EVP_CipherFinal_ex;
        }
        reset();
        return (i13 + i11) - i11;
    }

    @Override // org.conscrypt.OpenSSLCipher
    public void engineInitInternal(byte[] bArr, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        byte[] iv2 = algorithmParameterSpec instanceof IvParameterSpec ? ((IvParameterSpec) algorithmParameterSpec).getIV() : null;
        long EVP_get_cipherbyname = NativeCrypto.EVP_get_cipherbyname(getCipherName(bArr.length, this.mode));
        if (EVP_get_cipherbyname == 0) {
            throw new InvalidAlgorithmParameterException("Cannot find name for key length = " + (bArr.length * 8) + " and mode = " + this.mode);
        }
        boolean isEncrypting = isEncrypting();
        int EVP_CIPHER_iv_length = NativeCrypto.EVP_CIPHER_iv_length(EVP_get_cipherbyname);
        if (iv2 != null || EVP_CIPHER_iv_length == 0) {
            if (EVP_CIPHER_iv_length == 0 && iv2 != null) {
                throw new InvalidAlgorithmParameterException("IV not used in " + this.mode + " mode");
            }
            if (iv2 != null && iv2.length != EVP_CIPHER_iv_length) {
                throw new InvalidAlgorithmParameterException("expected IV length of " + EVP_CIPHER_iv_length + " but was " + iv2.length);
            }
        } else {
            if (!isEncrypting) {
                throw new InvalidAlgorithmParameterException("IV must be specified in " + this.mode + " mode");
            }
            iv2 = new byte[EVP_CIPHER_iv_length];
            if (secureRandom != null) {
                secureRandom.nextBytes(iv2);
            } else {
                NativeCrypto.RAND_bytes(iv2);
            }
        }
        this.f77776iv = iv2;
        if (supportsVariableSizeKey()) {
            NativeCrypto.EVP_CipherInit_ex(this.cipherCtx, EVP_get_cipherbyname, null, null, isEncrypting);
            NativeCrypto.EVP_CIPHER_CTX_set_key_length(this.cipherCtx, bArr.length);
            NativeCrypto.EVP_CipherInit_ex(this.cipherCtx, 0L, bArr, iv2, isEncrypting());
        } else {
            NativeCrypto.EVP_CipherInit_ex(this.cipherCtx, EVP_get_cipherbyname, bArr, iv2, isEncrypting);
        }
        NativeCrypto.EVP_CIPHER_CTX_set_padding(this.cipherCtx, getPadding() == OpenSSLCipher.Padding.PKCS5PADDING);
        this.modeBlockSize = NativeCrypto.EVP_CIPHER_CTX_block_size(this.cipherCtx);
        this.calledUpdate = false;
    }

    public abstract String getCipherName(int i11, OpenSSLCipher.Mode mode);

    @Override // org.conscrypt.OpenSSLCipher
    public int getOutputSizeForFinal(int i11) {
        if (this.modeBlockSize == 1) {
            return i11;
        }
        int i12 = NativeCrypto.get_EVP_CIPHER_CTX_buf_len(this.cipherCtx);
        if (getPadding() == OpenSSLCipher.Padding.NOPADDING) {
            return i12 + i11;
        }
        int i13 = i11 + i12 + (NativeCrypto.get_EVP_CIPHER_CTX_final_used(this.cipherCtx) ? this.modeBlockSize : 0);
        int i14 = i13 + ((i13 % this.modeBlockSize != 0 || isEncrypting()) ? this.modeBlockSize : 0);
        return i14 - (i14 % this.modeBlockSize);
    }

    @Override // org.conscrypt.OpenSSLCipher
    public int getOutputSizeForUpdate(int i11) {
        return getOutputSizeForFinal(i11);
    }

    @Override // org.conscrypt.OpenSSLCipher
    public int updateInternal(byte[] bArr, int i11, int i12, byte[] bArr2, int i13, int i14) throws ShortBufferException {
        int length = bArr2.length - i13;
        if (length >= i14) {
            int EVP_CipherUpdate = i13 + NativeCrypto.EVP_CipherUpdate(this.cipherCtx, bArr2, i13, bArr, i11, i12);
            this.calledUpdate = true;
            return EVP_CipherUpdate - i13;
        }
        throw new ShortBufferWithoutStackTraceException("output buffer too small during update: " + length + " < " + i14);
    }
}
