package org.conscrypt;

import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class OpenSSLSignatureRawRSA extends SignatureSpi {
    private byte[] inputBuffer;
    private boolean inputIsTooLong;
    private int inputOffset;
    private OpenSSLKey key;

    @Override // java.security.SignatureSpi
    public Object engineGetParameter(String str) throws InvalidParameterException {
        return null;
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        if (privateKey instanceof OpenSSLRSAPrivateKey) {
            this.key = ((OpenSSLRSAPrivateKey) privateKey).getOpenSSLKey();
        } else if (privateKey instanceof RSAPrivateCrtKey) {
            this.key = OpenSSLRSAPrivateCrtKey.getInstance((RSAPrivateCrtKey) privateKey);
        } else {
            if (!(privateKey instanceof RSAPrivateKey)) {
                throw new InvalidKeyException("Need RSA private key");
            }
            this.key = OpenSSLRSAPrivateKey.getInstance((RSAPrivateKey) privateKey);
        }
        this.inputBuffer = new byte[NativeCrypto.RSA_size(this.key.getNativeRef())];
        this.inputOffset = 0;
    }

    @Override // java.security.SignatureSpi
    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        if (publicKey instanceof OpenSSLRSAPublicKey) {
            this.key = ((OpenSSLRSAPublicKey) publicKey).getOpenSSLKey();
        } else {
            if (!(publicKey instanceof RSAPublicKey)) {
                throw new InvalidKeyException("Need RSA public key");
            }
            this.key = OpenSSLRSAPublicKey.getInstance((RSAPublicKey) publicKey);
        }
        this.inputBuffer = new byte[NativeCrypto.RSA_size(this.key.getNativeRef())];
        this.inputOffset = 0;
    }

    @Override // java.security.SignatureSpi
    public byte[] engineSign() throws SignatureException {
        OpenSSLKey openSSLKey = this.key;
        if (openSSLKey == null) {
            throw new SignatureException("Need RSA private key");
        }
        if (this.inputIsTooLong) {
            throw new SignatureException("input length " + this.inputOffset + " != " + this.inputBuffer.length + " (modulus size)");
        }
        byte[] bArr = this.inputBuffer;
        byte[] bArr2 = new byte[bArr.length];
        try {
            try {
                NativeCrypto.RSA_private_encrypt(this.inputOffset, bArr, bArr2, openSSLKey.getNativeRef(), 1);
                return bArr2;
            } catch (Exception e11) {
                throw new SignatureException(e11);
            }
        } finally {
            this.inputOffset = 0;
        }
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte b11) {
        int i11 = this.inputOffset;
        int i12 = i11 + 1;
        this.inputOffset = i12;
        byte[] bArr = this.inputBuffer;
        if (i12 > bArr.length) {
            this.inputIsTooLong = true;
        } else {
            bArr[i11] = b11;
        }
    }

    @Override // java.security.SignatureSpi
    public boolean engineVerify(byte[] bArr) throws SignatureException {
        OpenSSLKey openSSLKey = this.key;
        if (openSSLKey == null) {
            throw new SignatureException("Need RSA public key");
        }
        if (this.inputIsTooLong) {
            return false;
        }
        int length = bArr.length;
        byte[] bArr2 = this.inputBuffer;
        if (length > bArr2.length) {
            throw new SignatureException("Input signature length is too large: " + bArr.length + " > " + this.inputBuffer.length);
        }
        byte[] bArr3 = new byte[bArr2.length];
        try {
            try {
                try {
                    boolean z11 = true;
                    int RSA_public_decrypt = NativeCrypto.RSA_public_decrypt(bArr.length, bArr, bArr3, openSSLKey.getNativeRef(), 1);
                    if (RSA_public_decrypt != this.inputOffset) {
                        z11 = false;
                    }
                    for (int i11 = 0; i11 < RSA_public_decrypt; i11++) {
                        if (this.inputBuffer[i11] != bArr3[i11]) {
                            z11 = false;
                        }
                    }
                    return z11;
                } finally {
                    this.inputOffset = 0;
                }
            } catch (SignatureException e11) {
                throw e11;
            } catch (Exception unused) {
                return false;
            }
        } catch (Exception e12) {
            throw new SignatureException(e12);
        }
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte[] bArr, int i11, int i12) {
        int i13 = this.inputOffset;
        int i14 = i13 + i12;
        this.inputOffset = i14;
        byte[] bArr2 = this.inputBuffer;
        if (i14 > bArr2.length) {
            this.inputIsTooLong = true;
        } else {
            System.arraycopy(bArr, i11, bArr2, i13, i12);
        }
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(String str, Object obj) throws InvalidParameterException {
    }
}
