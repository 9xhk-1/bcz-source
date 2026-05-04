package com.getui.gtc.base.crypt;

import android.annotation.TargetApi;
import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.crypto.SecretKey;

/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final Object f29786a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final Object f29787b = new Object();

    @TargetApi(18)
    private KeyPair a(Context context, String str) throws NoSuchProviderException, NoSuchAlgorithmException, InvalidAlgorithmParameterException {
        KeyPair generateKeyPair;
        synchronized (this.f29787b) {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
            keyPairGenerator.initialize(new KeyGenParameterSpec.Builder(str, 3).setBlockModes("ECB").setEncryptionPaddings("PKCS1Padding").setKeySize(1024).build());
            generateKeyPair = keyPairGenerator.generateKeyPair();
        }
        return generateKeyPair;
    }

    @TargetApi(18)
    public final KeyPair a(Context context, String str, boolean z11) throws KeyStoreException, CertificateException, NoSuchAlgorithmException, IOException, UnrecoverableKeyException, NoSuchProviderException, InvalidAlgorithmParameterException {
        synchronized (this.f29787b) {
            try {
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                keyStore.load(null);
                if (keyStore.containsAlias(str) || !z11) {
                    return new KeyPair(keyStore.getCertificate(str).getPublicKey(), (PrivateKey) keyStore.getKey(str, null));
                }
                return a(context, str);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @TargetApi(23)
    public final SecretKey a(String str) throws KeyStoreException, CertificateException, NoSuchAlgorithmException, IOException, UnrecoverableKeyException, NoSuchProviderException, InvalidAlgorithmParameterException {
        SecretKey secretKey;
        synchronized (this.f29786a) {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            keyStore.containsAlias(str);
            secretKey = (SecretKey) keyStore.getKey(str, null);
        }
        return secretKey;
    }
}
