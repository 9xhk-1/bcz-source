package com.getui.gtc.base.crypt;

import android.content.Context;
import android.os.Process;
import java.security.KeyPair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

/* loaded from: classes6.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    a f29792a;

    /* renamed from: b, reason: collision with root package name */
    c f29793b;

    /* renamed from: c, reason: collision with root package name */
    Map<String, SecretKey> f29794c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    Map<String, SecretKey> f29795d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    Map<String, KeyPair> f29796e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    Map<String, IvParameterSpec> f29797f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    String f29798g;

    private KeyPair d(String str) {
        try {
            String digestToHexString = CryptTools.digestToHexString("MD5", (str + "-rsa1024alias").getBytes());
            if (this.f29796e.containsKey(digestToHexString)) {
                return this.f29796e.get(digestToHexString);
            }
            KeyPair a11 = this.f29792a.a(null, digestToHexString, false);
            if (a11 == null) {
                return null;
            }
            this.f29796e.put(digestToHexString, a11);
            return a11;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final List<CryptException> a(Context context) throws CryptException {
        SecretKey secretKey;
        ArrayList arrayList = new ArrayList();
        this.f29798g = String.valueOf(Process.myPid());
        String str = this.f29798g + "-rsa1024alias";
        String str2 = this.f29798g + "-aes128alias";
        String str3 = this.f29798g + "-ivalias";
        String digestToHexString = CryptTools.digestToHexString("MD5", str.getBytes());
        String digestToHexString2 = CryptTools.digestToHexString("MD5", str2.getBytes());
        String digestToHexString3 = CryptTools.digestToHexString("MD5", str3.getBytes());
        a aVar = new a();
        this.f29792a = aVar;
        try {
            KeyPair a11 = aVar.a(context, digestToHexString, true);
            this.f29796e.put(digestToHexString, a11);
            c cVar = new c(context, a11);
            this.f29793b = cVar;
            secretKey = cVar.a(digestToHexString2);
        } catch (Throwable th2) {
            arrayList.add(new CryptException("above api 18, but second secret key create failed with android key store!", th2));
            secretKey = null;
        }
        if (secretKey == null) {
            try {
                c cVar2 = new c(context, null);
                this.f29793b = cVar2;
                secretKey = cVar2.a(digestToHexString2);
            } catch (Throwable th3) {
                throw new CryptException("second secret key create failed!", th3);
            }
        }
        this.f29795d.put(digestToHexString2, secretKey);
        try {
            c cVar3 = this.f29793b;
            IvParameterSpec b11 = cVar3.b(digestToHexString3, true, cVar3.f29789a);
            if (b11 == null) {
                throw new CryptException("iv parameter spec create failed!");
            }
            this.f29797f.put(digestToHexString3, b11);
            return arrayList;
        } catch (Throwable th4) {
            throw new CryptException("iv parameter spec create failed!", th4);
        }
    }

    public final SecretKey b(String str) {
        try {
            String digestToHexString = CryptTools.digestToHexString("MD5", (str + "-aes128alias").getBytes());
            if (this.f29795d.containsKey(digestToHexString)) {
                return this.f29795d.get(digestToHexString);
            }
            SecretKey a11 = this.f29793b.a(digestToHexString, false, d(str));
            if (a11 == null) {
                return null;
            }
            this.f29795d.put(digestToHexString, a11);
            return a11;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final IvParameterSpec c(String str) {
        try {
            String digestToHexString = CryptTools.digestToHexString("MD5", (str + "-ivalias").getBytes());
            if (this.f29797f.containsKey(digestToHexString)) {
                return this.f29797f.get(digestToHexString);
            }
            IvParameterSpec b11 = this.f29793b.b(digestToHexString, false, d(str));
            if (b11 == null) {
                return null;
            }
            this.f29797f.put(digestToHexString, b11);
            return b11;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final SecretKey a() {
        return b(this.f29798g);
    }

    public final IvParameterSpec b() {
        return c(this.f29798g);
    }

    public final SecretKey a(String str) {
        try {
            String digestToHexString = CryptTools.digestToHexString("MD5", (str + "-aes128alias").getBytes());
            if (this.f29794c.containsKey(digestToHexString)) {
                return this.f29794c.get(digestToHexString);
            }
            SecretKey a11 = this.f29792a.a(digestToHexString);
            if (a11 == null) {
                return null;
            }
            this.f29794c.put(digestToHexString, a11);
            return a11;
        } catch (Throwable unused) {
            return null;
        }
    }
}
