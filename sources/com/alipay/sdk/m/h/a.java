package com.alipay.sdk.m.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class a extends com.alipay.sdk.m.g.a {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ boolean f10564d = true;

    public a(byte[] bArr) {
        super(bArr);
    }

    public static a a(String str, long j11, b bVar, short s11, e eVar) throws Exception {
        byte[] a11 = com.alipay.sdk.m.g.c.a((byte) 1);
        boolean z11 = f10564d;
        if (!z11 && a11.length != 1) {
            throw new AssertionError();
        }
        byte[] a12 = com.alipay.sdk.m.g.c.a(str.charAt(0), str.charAt(1));
        if (!z11 && a12.length != 2) {
            throw new AssertionError();
        }
        byte[] a13 = com.alipay.sdk.m.g.c.a(j11);
        if (!z11 && a13.length != 8) {
            throw new AssertionError();
        }
        byte[] b11 = com.alipay.sdk.m.g.c.b();
        if (!z11 && b11.length != 2) {
            throw new AssertionError();
        }
        bVar.a();
        byte[] a14 = com.alipay.sdk.m.g.c.a(bVar.f10567a);
        if (!z11 && a14.length != 1) {
            throw new AssertionError();
        }
        byte[] a15 = com.alipay.sdk.m.g.c.a(bVar.f10568b);
        if (!z11 && a15.length != 1) {
            throw new AssertionError();
        }
        byte[] bArr = (byte[]) bVar.f10569c.clone();
        if (!z11 && bArr.length != (bVar.f10568b & 255)) {
            throw new AssertionError();
        }
        byte[] a16 = com.alipay.sdk.m.g.c.a(s11);
        if (!z11 && a16.length != 2) {
            throw new AssertionError();
        }
        byte[] b12 = com.alipay.sdk.m.g.c.b();
        if (!z11 && b12.length != 2) {
            throw new AssertionError();
        }
        eVar.a();
        byte[] a17 = com.alipay.sdk.m.g.c.a(eVar.f10571a);
        if (!z11 && a17.length != 1) {
            throw new AssertionError();
        }
        byte[] bArr2 = (byte[]) eVar.f10572b.clone();
        if (!z11 && bArr2.length != (eVar.f10571a & 255)) {
            throw new AssertionError();
        }
        byte[] c11 = com.alipay.sdk.m.g.c.c();
        if (z11 || c11.length == 4) {
            return new a(com.alipay.sdk.m.g.c.a(a11, a12, a13, b11, a14, a15, bArr, a16, b12, a17, bArr2, c11));
        }
        throw new AssertionError();
    }

    public static a c() {
        try {
            return a(com.alipay.sdk.m.g.a.f10553c, 0L, new c(""), (short) 0, new f());
        } catch (Exception unused) {
            return null;
        }
    }
}
