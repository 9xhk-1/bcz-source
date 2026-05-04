package com.vivo.push.c;

import android.content.Context;
import android.security.KeyPairGeneratorSpec;
import android.text.TextUtils;
import android.util.Base64;
import com.vivo.push.util.p;
import java.math.BigInteger;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.util.Calendar;
import javax.security.auth.x500.X500Principal;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class e implements b {

    /* renamed from: a, reason: collision with root package name */
    private static PrivateKey f44939a;

    /* renamed from: b, reason: collision with root package name */
    private static PublicKey f44940b;

    /* renamed from: c, reason: collision with root package name */
    private static KeyStore f44941c;

    /* renamed from: d, reason: collision with root package name */
    private static X500Principal f44942d;

    /* renamed from: e, reason: collision with root package name */
    private Context f44943e;

    public e(Context context) {
        this.f44943e = context;
        try {
            b();
            a(context);
        } catch (Exception e11) {
            e11.printStackTrace();
            p.a("RsaSecurity", "init error" + e11.getMessage());
        }
    }

    private static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (f44941c == null) {
                b();
            }
            return f44941c.containsAlias(str);
        } catch (Exception e11) {
            e11.printStackTrace();
            p.a("RsaSecurity", "getPrivateKeySigin error" + e11.getMessage());
            return false;
        }
    }

    @Override // com.vivo.push.c.b
    public final String a(String str) {
        try {
            if (TextUtils.isEmpty(str) || b(this.f44943e) == null) {
                return null;
            }
            byte[] bytes = str.getBytes("UTF-8");
            PrivateKey b11 = b(this.f44943e);
            Signature signature = Signature.getInstance("SHA256withRSA");
            signature.initSign(b11);
            signature.update(bytes);
            String encodeToString = Base64.encodeToString(signature.sign(), 2);
            p.d("RsaSecurity", str.hashCode() + " = " + encodeToString);
            return encodeToString;
        } catch (Exception e11) {
            e11.printStackTrace();
            p.a("RsaSecurity", "signClientSDK error" + e11.getMessage());
            return null;
        }
    }

    private static void b() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            f44941c = keyStore;
            keyStore.load(null);
            f44942d = new X500Principal("CN=Push SDK, OU=VIVO, O=VIVO PUSH, C=CN");
        } catch (Exception e11) {
            e11.printStackTrace();
            p.a("RsaSecurity", "initKeyStore error" + e11.getMessage());
        }
    }

    @Override // com.vivo.push.c.b
    public final boolean a(byte[] bArr, PublicKey publicKey, byte[] bArr2) {
        try {
            Signature signature = Signature.getInstance("SHA256withRSA");
            signature.initVerify(publicKey);
            signature.update(bArr);
            return signature.verify(bArr2);
        } catch (Exception e11) {
            e11.printStackTrace();
            p.a("RsaSecurity", "verifyClientSDK error" + e11.getMessage());
            return false;
        }
    }

    private static PrivateKey b(Context context) {
        PrivateKey privateKey;
        try {
            privateKey = f44939a;
        } catch (Exception e11) {
            e11.printStackTrace();
            p.a("RsaSecurity", "getPrivateKeySigin error" + e11.getMessage());
        }
        if (privateKey != null) {
            return privateKey;
        }
        if (context == null) {
            p.d("RsaSecurity", " getPrivateKeySigin context == null ");
            return null;
        }
        if (!b("PushRsaKeyAlias")) {
            a(context);
        }
        KeyStore.Entry entry = f44941c.getEntry("PushRsaKeyAlias", null);
        if (entry instanceof KeyStore.PrivateKeyEntry) {
            PrivateKey privateKey2 = ((KeyStore.PrivateKeyEntry) entry).getPrivateKey();
            f44939a = privateKey2;
            return privateKey2;
        }
        return null;
    }

    private static void a(Context context) {
        try {
            if (context == null) {
                p.d("RsaSecurity", " generateRSAKeyPairSign context == null ");
                return;
            }
            if (!b("PushRsaKeyAlias")) {
                Calendar calendar = Calendar.getInstance();
                Calendar calendar2 = Calendar.getInstance();
                calendar2.add(1, 999);
                KeyPairGeneratorSpec build = new KeyPairGeneratorSpec.Builder(context.getApplicationContext()).setAlias("PushRsaKeyAlias").setSubject(f44942d).setSerialNumber(BigInteger.valueOf(1337L)).setStartDate(calendar.getTime()).setEndDate(calendar2.getTime()).build();
                KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
                keyPairGenerator.initialize(build);
                keyPairGenerator.generateKeyPair();
                return;
            }
            p.d("RsaSecurity", " generateRSAKeyPairSign this keyAlias PushRsaKeyAlias is Created ");
        } catch (Exception e11) {
            e11.printStackTrace();
            p.a("RsaSecurity", "generateRSAKeyPairSign error" + e11.getMessage());
        }
    }

    @Override // com.vivo.push.c.b
    public final PublicKey a() {
        PublicKey publicKey;
        try {
            publicKey = f44940b;
        } catch (Exception e11) {
            e11.printStackTrace();
            p.a("RsaSecurity", "getPublicKeySign error" + e11.getMessage());
        }
        if (publicKey != null) {
            return publicKey;
        }
        if (!b("PushRsaKeyAlias")) {
            a(this.f44943e);
        }
        KeyStore.Entry entry = f44941c.getEntry("PushRsaKeyAlias", null);
        if (entry instanceof KeyStore.PrivateKeyEntry) {
            PublicKey publicKey2 = ((KeyStore.PrivateKeyEntry) entry).getCertificate().getPublicKey();
            f44940b = publicKey2;
            return publicKey2;
        }
        return null;
    }
}
