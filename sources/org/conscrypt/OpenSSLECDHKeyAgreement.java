package org.conscrypt;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.KeyAgreementSpi;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.SecretKeySpec;
import org.conscrypt.NativeRef;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class OpenSSLECDHKeyAgreement extends KeyAgreementSpi {
    private int mExpectedResultLength;
    private OpenSSLKey mOpenSslPrivateKey;
    private byte[] mResult;

    private void checkCompleted() {
        if (this.mResult == null) {
            throw new IllegalStateException("Key agreement not completed");
        }
    }

    @Override // javax.crypto.KeyAgreementSpi
    public Key engineDoPhase(Key key, boolean z11) throws InvalidKeyException {
        if (this.mOpenSslPrivateKey == null) {
            throw new IllegalStateException("Not initialized");
        }
        if (!z11) {
            throw new IllegalStateException("ECDH only has one phase");
        }
        if (key == null) {
            throw new InvalidKeyException("key == null");
        }
        if (!(key instanceof PublicKey)) {
            throw new InvalidKeyException("Not a public key: " + key.getClass());
        }
        OpenSSLKey fromPublicKey = OpenSSLKey.fromPublicKey((PublicKey) key);
        byte[] bArr = new byte[this.mExpectedResultLength];
        int ECDH_compute_key = NativeCrypto.ECDH_compute_key(bArr, 0, fromPublicKey.getNativeRef(), this.mOpenSslPrivateKey.getNativeRef());
        if (ECDH_compute_key == -1) {
            throw new RuntimeException("Engine returned " + ECDH_compute_key);
        }
        int i11 = this.mExpectedResultLength;
        if (ECDH_compute_key != i11) {
            if (ECDH_compute_key >= i11) {
                throw new RuntimeException("Engine produced a longer than expected result. Expected: " + this.mExpectedResultLength + ", actual: " + ECDH_compute_key);
            }
            byte[] bArr2 = this.mResult;
            System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
            bArr = new byte[ECDH_compute_key];
        }
        this.mResult = bArr;
        return null;
    }

    @Override // javax.crypto.KeyAgreementSpi
    public int engineGenerateSecret(byte[] bArr, int i11) throws ShortBufferException {
        checkCompleted();
        int length = bArr.length - i11;
        byte[] bArr2 = this.mResult;
        if (bArr2.length <= length) {
            System.arraycopy(bArr2, 0, bArr, i11, bArr2.length);
            return this.mResult.length;
        }
        throw new ShortBufferWithoutStackTraceException("Needed: " + this.mResult.length + ", available: " + length);
    }

    @Override // javax.crypto.KeyAgreementSpi
    public void engineInit(Key key, SecureRandom secureRandom) throws InvalidKeyException {
        if (key == null) {
            throw new InvalidKeyException("key == null");
        }
        if (key instanceof PrivateKey) {
            OpenSSLKey fromPrivateKey = OpenSSLKey.fromPrivateKey((PrivateKey) key);
            this.mExpectedResultLength = (NativeCrypto.EC_GROUP_get_degree(new NativeRef.EC_GROUP(NativeCrypto.EC_KEY_get1_group(fromPrivateKey.getNativeRef()))) + 7) / 8;
            this.mOpenSslPrivateKey = fromPrivateKey;
        } else {
            throw new InvalidKeyException("Not a private key: " + key.getClass());
        }
    }

    @Override // javax.crypto.KeyAgreementSpi
    public byte[] engineGenerateSecret() {
        checkCompleted();
        return this.mResult;
    }

    @Override // javax.crypto.KeyAgreementSpi
    public SecretKey engineGenerateSecret(String str) {
        checkCompleted();
        return new SecretKeySpec(engineGenerateSecret(), str);
    }

    @Override // javax.crypto.KeyAgreementSpi
    public void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (algorithmParameterSpec == null) {
            engineInit(key, secureRandom);
            return;
        }
        throw new InvalidAlgorithmParameterException("No algorithm parameters supported");
    }
}
