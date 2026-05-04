package org.conscrypt;

import java.io.ByteArrayOutputStream;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.SignatureSpi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class OpenSSLSignatureRawECDSA extends SignatureSpi {
    private ByteArrayOutputStream buffer = new ByteArrayOutputStream();
    private OpenSSLKey key;

    private static OpenSSLKey verifyKey(OpenSSLKey openSSLKey) throws InvalidKeyException {
        if (NativeCrypto.EVP_PKEY_type(openSSLKey.getNativeRef()) == 408) {
            return openSSLKey;
        }
        throw new InvalidKeyException("Non-EC key used to initialize EC signature.");
    }

    @Override // java.security.SignatureSpi
    public Object engineGetParameter(String str) throws InvalidParameterException {
        return null;
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        this.key = verifyKey(OpenSSLKey.fromPrivateKey(privateKey));
    }

    @Override // java.security.SignatureSpi
    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        this.key = verifyKey(OpenSSLKey.fromPublicKey(publicKey));
    }

    @Override // java.security.SignatureSpi
    public byte[] engineSign() throws SignatureException {
        OpenSSLKey openSSLKey = this.key;
        if (openSSLKey == null) {
            throw new SignatureException("No key provided");
        }
        int ECDSA_size = NativeCrypto.ECDSA_size(openSSLKey.getNativeRef());
        byte[] bArr = new byte[ECDSA_size];
        try {
            try {
                int ECDSA_sign = NativeCrypto.ECDSA_sign(this.buffer.toByteArray(), bArr, this.key.getNativeRef());
                if (ECDSA_sign < 0) {
                    throw new SignatureException("Could not compute signature.");
                }
                if (ECDSA_sign != ECDSA_size) {
                    byte[] bArr2 = new byte[ECDSA_sign];
                    System.arraycopy(bArr, 0, bArr2, 0, ECDSA_sign);
                    bArr = bArr2;
                }
                return bArr;
            } catch (Exception e11) {
                throw new SignatureException(e11);
            }
        } finally {
            this.buffer.reset();
        }
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte b11) {
        this.buffer.write(b11);
    }

    @Override // java.security.SignatureSpi
    public boolean engineVerify(byte[] bArr) throws SignatureException {
        if (this.key == null) {
            throw new SignatureException("No key provided");
        }
        try {
            try {
                int ECDSA_verify = NativeCrypto.ECDSA_verify(this.buffer.toByteArray(), bArr, this.key.getNativeRef());
                if (ECDSA_verify != -1) {
                    return ECDSA_verify == 1;
                }
                throw new SignatureException("Could not verify signature.");
            } catch (Exception e11) {
                throw new SignatureException(e11);
            }
        } finally {
            this.buffer.reset();
        }
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte[] bArr, int i11, int i12) {
        this.buffer.write(bArr, i11, i12);
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(String str, Object obj) throws InvalidParameterException {
    }
}
