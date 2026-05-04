package com.vivo.push.util;

import android.content.Context;
import android.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    private static volatile a f45079c;

    /* renamed from: a, reason: collision with root package name */
    private byte[] f45080a;

    /* renamed from: b, reason: collision with root package name */
    private byte[] f45081b;

    private a(Context context) {
        w.b().a(ContextDelegate.getContext(context));
        w b11 = w.b();
        this.f45080a = b11.c();
        this.f45081b = b11.d();
    }

    public static a a(Context context) {
        if (f45079c == null) {
            synchronized (a.class) {
                try {
                    if (f45079c == null) {
                        f45079c = new a(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return f45079c;
    }

    public final String b(String str) throws Exception {
        return new String(f.a(f.a(a()), f.a(b()), Base64.decode(str, 2)), "utf-8");
    }

    private byte[] b() {
        byte[] bArr = this.f45081b;
        return (bArr == null || bArr.length <= 0) ? w.b().d() : bArr;
    }

    public final String a(String str) throws Exception {
        String a11 = f.a(a());
        String a12 = f.a(b());
        byte[] bytes = str.getBytes("utf-8");
        SecretKeySpec secretKeySpec = new SecretKeySpec(a12.getBytes("utf-8"), "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(1, secretKeySpec, new IvParameterSpec(a11.getBytes("utf-8")));
        return Base64.encodeToString(cipher.doFinal(bytes), 2);
    }

    private byte[] a() {
        byte[] bArr = this.f45080a;
        return (bArr == null || bArr.length <= 0) ? w.b().c() : bArr;
    }
}
