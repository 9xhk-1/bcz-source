package com.vivo.push.c;

import android.security.keystore.KeyGenParameterSpec;
import com.vivo.push.util.p;
import java.security.KeyStore;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    private KeyStore f44933a;

    /* renamed from: b, reason: collision with root package name */
    private SecretKey f44934b;

    public a() {
        a();
        b();
    }

    private void a() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            this.f44933a = keyStore;
            keyStore.load(null);
        } catch (Exception e11) {
            e11.printStackTrace();
            p.a("AesSecurity", "initKeyStore error" + e11.getMessage());
        }
    }

    private SecretKey b() {
        try {
            SecretKey secretKey = this.f44934b;
            if (secretKey != null) {
                return secretKey;
            }
            if (c()) {
                this.f44934b = d();
            } else {
                KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                keyGenerator.init(new KeyGenParameterSpec.Builder("AesKeyAlias", 3).setBlockModes(pr.b.f81166d).setEncryptionPaddings("NoPadding").setKeySize(256).build());
                this.f44934b = keyGenerator.generateKey();
            }
            return this.f44934b;
        } catch (Exception e11) {
            e11.printStackTrace();
            p.a("AesSecurity", "getSecretKey error" + e11.getMessage());
            return null;
        }
    }

    private boolean c() {
        try {
            if (this.f44933a == null) {
                a();
            }
            return this.f44933a.containsAlias("AesKeyAlias");
        } catch (Exception e11) {
            e11.printStackTrace();
            p.a("AesSecurity", "hasAESKey error" + e11.getMessage());
            return false;
        }
    }

    private SecretKey d() {
        try {
            return ((KeyStore.SecretKeyEntry) this.f44933a.getEntry("AesKeyAlias", null)).getSecretKey();
        } catch (Exception e11) {
            e11.printStackTrace();
            p.a("AesSecurity", "getAESSecretKey error" + e11.getMessage());
            return null;
        }
    }
}
