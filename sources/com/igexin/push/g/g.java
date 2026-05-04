package com.igexin.push.g;

import android.text.TextUtils;
import android.util.Base64;
import com.getui.gtc.base.crypt.CryptTools;
import java.security.MessageDigest;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes7.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public static String f38689a = "MHwwDQYJKoZIhvcNAQEBBQADawAwaAJhAJp1rROuvBF7sBSnvLaesj2iFhMcY8aXyLvpnNLKs2wjL3JmEnyr++SlVa35liUlzi83tnAFkn3A9GB7pHBNzawyUkBh8WUhq5bnFIkk2RaDa6+5MpG84DEv52p7RR+aWwIDAQAB";

    /* renamed from: b, reason: collision with root package name */
    public static String f38690b = "69d747c4b9f641baf4004be4297e9f3b";

    /* renamed from: c, reason: collision with root package name */
    public static String f38691c = "";

    /* renamed from: d, reason: collision with root package name */
    public static String f38692d = "";

    /* renamed from: e, reason: collision with root package name */
    private static final String f38693e = "com.igexin.push.g.g";

    /* renamed from: f, reason: collision with root package name */
    private static boolean f38694f = false;

    /* renamed from: g, reason: collision with root package name */
    private static int f38695g = 0;

    /* renamed from: h, reason: collision with root package name */
    private static byte[] f38696h = null;

    /* renamed from: i, reason: collision with root package name */
    private static byte[] f38697i = null;

    /* renamed from: j, reason: collision with root package name */
    private static final int f38698j = 200;

    static {
        try {
            f38696h = h();
            byte[] g11 = g();
            f38697i = g11;
            f38694f = (f38696h == null || g11 == null || f38690b.getBytes() == null) ? false : true;
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            com.igexin.c.a.c.a.a(f38693e + "|load key error = " + th2.toString(), new Object[0]);
            f38694f = false;
            f38692d = th2.getMessage();
        }
        if (f38694f) {
            String str = f38693e;
            com.igexin.c.a.c.a.a(str, "load Encrypt key success ~~~~~~~");
            com.igexin.c.a.c.a.a(str + "|load  Encrypt key success ~~~~~~~", new Object[0]);
            return;
        }
        String str2 = f38693e;
        com.igexin.c.a.c.a.a(str2, "load key error ++++++++");
        com.igexin.c.a.c.a.a(str2 + "|load key error ++++++++", new Object[0]);
        if (TextUtils.isEmpty(f38692d)) {
            f38692d = "value = null, normal error";
        }
    }

    public static String a(String str, byte[] bArr) throws Exception {
        byte[] bytes = str.getBytes();
        byte[] bArr2 = new byte[bytes.length + bArr.length];
        int a11 = com.igexin.c.a.b.g.a(bytes, bArr2, 0, bytes.length);
        if (bArr.length > 0) {
            com.igexin.c.a.b.g.a(bArr, bArr2, a11, bArr.length);
        }
        return Base64.encodeToString(d(bArr2), 2);
    }

    public static byte[] b() {
        if (!f38694f) {
            return new byte[0];
        }
        try {
            byte[] bArr = f38696h;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return CryptTools.encrypt("RSA/NONE/OAEPWithSHA1AndMGF1Padding", CryptTools.parsePublicKey("RSA", f38689a), bArr2);
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            com.igexin.c.a.c.a.a(f38693e + "| getSocketAESKey  fail ~~~~~~~" + th2.getMessage(), new Object[0]);
            return new byte[0];
        }
    }

    public static byte[] c() {
        return f38690b.getBytes();
    }

    public static boolean d() {
        try {
            f38696h = h();
            byte[] g11 = g();
            f38697i = g11;
            f38694f = (f38696h == null || g11 == null || f38690b.getBytes() == null) ? false : true;
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            com.igexin.c.a.c.a.a(f38693e + "|load key error = " + th2.toString(), new Object[0]);
            f38694f = false;
        }
        if (f38694f) {
            String str = f38693e;
            com.igexin.c.a.c.a.a(str, "load key success ~~~~~~~");
            com.igexin.c.a.c.a.a(str + "|load key success ~~~~~~~", new Object[0]);
        } else {
            String str2 = f38693e;
            com.igexin.c.a.c.a.a(str2, "load key error ++++++++");
            com.igexin.c.a.c.a.a(str2 + "|load key error ++++++++", new Object[0]);
        }
        return f38694f;
    }

    public static int e() {
        int i11 = f38695g;
        f38695g = i11 + 1;
        return i11;
    }

    public static String f() {
        byte[] j11 = j();
        byte[] bytes = p.b().getBytes();
        byte[] bArr = new byte[bytes.length + j11.length];
        com.igexin.c.a.b.g.a(j11, bArr, com.igexin.c.a.b.g.a(bytes, bArr, 0, bytes.length), j11.length);
        return Base64.encodeToString(bArr, 2);
    }

    private static byte[] g() {
        try {
            return CryptTools.generateKey("AES", 128).getEncoded();
        } catch (Throwable unused) {
            String str = f38693e;
            com.igexin.c.a.c.a.a(str, "generate  http key fail ~~~~~~~");
            com.igexin.c.a.c.a.a(str + "|generate  http key fail ~~~~~~~", new Object[0]);
            return null;
        }
    }

    private static byte[] h() {
        try {
            return CryptTools.generateKey("AES", 128).getEncoded();
        } catch (Throwable unused) {
            String str = f38693e;
            com.igexin.c.a.c.a.a(str, "generate  socket key fail ~~~~~~~");
            com.igexin.c.a.c.a.a(str + "|generate  socket key fail ~~~~~~~", new Object[0]);
            return null;
        }
    }

    private static byte[] i() {
        return new byte[0];
    }

    private static byte[] j() {
        try {
            byte[] bArr = f38697i;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return CryptTools.encrypt("RSA/NONE/OAEPWithSHA1AndMGF1Padding", CryptTools.parsePublicKey("RSA", f38689a), bArr2);
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            com.igexin.c.a.c.a.a(f38693e + "| getHttpAESKey  fail ~~~~~~~", new Object[0]);
            return new byte[0];
        }
    }

    public static boolean a() {
        return f38694f;
    }

    public static byte[] b(byte[] bArr) {
        return c(bArr);
    }

    public static byte[] c(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (Exception e11) {
            com.igexin.c.a.c.a.a(e11);
            return null;
        }
    }

    private static byte[] d(byte[] bArr) {
        try {
            return MessageDigest.getInstance("SHA-1").digest(bArr);
        } catch (Exception e11) {
            com.igexin.c.a.c.a.a(e11);
            return null;
        }
    }

    public static byte[] e(byte[] bArr, byte[] bArr2) {
        try {
            byte[] bytes = f38691c.getBytes();
            byte[] bArr3 = new byte[bytes.length];
            for (int i11 = 0; i11 < bytes.length; i11++) {
                bArr3[i11] = (byte) (~(bytes[(bytes.length - i11) - 1] & 255));
            }
            return CryptTools.decrypt("AES/CFB/NoPadding", new SecretKeySpec(c(bArr3), "AES"), new IvParameterSpec(c(bArr2)), bArr);
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            com.igexin.c.a.c.a.a(f38693e + "| altAesDecSocket  fail ~~~~~~~", new Object[0]);
            return new byte[0];
        }
    }

    private static byte[] f(byte[] bArr, byte[] bArr2) {
        try {
            byte[] bytes = f38691c.getBytes();
            byte[] bArr3 = new byte[bytes.length];
            for (int i11 = 0; i11 < bytes.length; i11++) {
                bArr3[i11] = (byte) (~(bytes[(bytes.length - i11) - 1] & 255));
            }
            return CryptTools.encrypt("AES/CFB/NoPadding", new SecretKeySpec(c(bArr3), "AES"), new IvParameterSpec(c(bArr2)), bArr);
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            com.igexin.c.a.c.a.a(f38693e + "| altAesEncSocket  fail ~~~~~~~", new Object[0]);
            return new byte[0];
        }
    }

    public static byte[] a(com.igexin.push.d.c.a aVar, int i11, int i12) {
        byte[] bArr = new byte[aVar.f38406a + 11];
        com.igexin.c.a.b.g.a(i11, bArr, 0);
        com.igexin.c.a.b.g.a(i12, bArr, 4);
        com.igexin.c.a.b.g.b((short) aVar.f38406a, bArr, 8);
        bArr[10] = aVar.f38407b;
        com.igexin.c.a.b.g.a(aVar.f38410e, bArr, 11, aVar.f38406a);
        return d(bArr);
    }

    public static byte[] b(byte[] bArr, byte[] bArr2) {
        try {
            return CryptTools.decrypt("AES/CFB/NoPadding", new SecretKeySpec(f38697i, "AES"), new IvParameterSpec(bArr2), bArr);
        } catch (Throwable unused) {
            String str = f38693e;
            com.igexin.c.a.c.a.a(str, " httpId decrypt  http data  fail ~~~~~~~");
            com.igexin.c.a.c.a.a(str + "| httpId decrypt  http data  fail ~~~~~~~", new Object[0]);
            return new byte[0];
        }
    }

    public static byte[] c(byte[] bArr, byte[] bArr2) {
        try {
            return CryptTools.encrypt("AES/CFB/NoPadding", new SecretKeySpec(f38696h, "AES"), new IvParameterSpec(bArr2), bArr);
        } catch (Throwable unused) {
            String str = f38693e;
            com.igexin.c.a.c.a.a(str, " sockeId encrypt  http data  fail ~~~~~~~");
            com.igexin.c.a.c.a.a(str + "| sockeId encrypt  http data  fail ~~~~~~~", new Object[0]);
            return new byte[0];
        }
    }

    public static byte[] d(byte[] bArr, byte[] bArr2) {
        try {
            return CryptTools.decrypt("AES/CFB/NoPadding", new SecretKeySpec(f38696h, "AES"), new IvParameterSpec(bArr2), bArr);
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            com.igexin.c.a.c.a.a(f38693e + "| sockeId encrypt  http data  fail ~~~~~~~", new Object[0]);
            return new byte[0];
        }
    }

    public static byte[] a(byte[] bArr) {
        return com.igexin.c.a.a.a.b(bArr, com.igexin.push.core.e.M);
    }

    public static byte[] a(byte[] bArr, byte[] bArr2) {
        try {
            return CryptTools.encrypt("AES/CFB/NoPadding", new SecretKeySpec(f38697i, "AES"), new IvParameterSpec(bArr2), bArr);
        } catch (Throwable unused) {
            String str = f38693e;
            com.igexin.c.a.c.a.a(str, " httpId encrypt  http data  fail ~~~~~~~");
            com.igexin.c.a.c.a.a(str + "| httpId encrypt  http data  fail ~~~~~~~", new Object[0]);
            return new byte[0];
        }
    }
}
