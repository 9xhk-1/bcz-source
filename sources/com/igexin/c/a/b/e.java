package com.igexin.c.a.b;

import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public class e extends com.igexin.c.a.d.g {
    private static volatile e J;

    /* renamed from: a, reason: collision with root package name */
    public volatile long f37154a;

    /* renamed from: b, reason: collision with root package name */
    public volatile long f37155b;

    /* renamed from: c, reason: collision with root package name */
    public volatile long f37156c;

    /* renamed from: d, reason: collision with root package name */
    public volatile long f37157d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f37158e;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f37159f;

    /* renamed from: g, reason: collision with root package name */
    public com.igexin.c.a.d.a.b<String, Integer, d, f> f37160g;

    private e() {
    }

    public static e a() {
        if (J == null) {
            synchronized (e.class) {
                try {
                    if (J == null) {
                        J = new e();
                    }
                } finally {
                }
            }
        }
        return J;
    }

    public static void c() {
        J.f37154a = 0L;
        J.f37156c = 0L;
        J.f37155b = 0L;
        J.f37157d = 0L;
    }

    private byte[] g() {
        return this.f37158e;
    }

    private byte[] h() {
        return this.f37159f;
    }

    private static void i() {
        J = null;
    }

    public final void b() {
        e();
    }

    private f a(String str, int i11, d dVar) {
        return a(str, i11, dVar, null, false, -1, -1L, (byte) 0, null, null);
    }

    private f a(String str, int i11, d dVar, Object obj) {
        return a(str, i11, dVar, obj, false, -1, -1L, (byte) 0, null, null);
    }

    private f a(String str, int i11, d dVar, Object obj, byte b11) {
        return a(str, i11, dVar, obj, false, -1, -1L, b11, null, null);
    }

    private f a(String str, int i11, d dVar, Object obj, int i12) {
        return a(str, i11, dVar, obj, false, i12, -1L, (byte) 0, null, null);
    }

    private f a(String str, int i11, d dVar, Object obj, long j11) {
        return a(str, i11, dVar, obj, false, -1, j11, (byte) 0, null, null);
    }

    private f a(String str, int i11, d dVar, Object obj, com.igexin.c.a.d.a.d dVar2) {
        return a(str, i11, dVar, obj, false, -1, -1L, (byte) 0, null, dVar2);
    }

    private f a(String str, int i11, d dVar, Object obj, Object obj2) {
        return a(str, i11, dVar, obj, false, -1, -1L, (byte) 0, obj2, null);
    }

    private f a(String str, int i11, d dVar, Object obj, boolean z11, int i12, long j11, byte b11, Object obj2, com.igexin.c.a.d.a.d dVar2) {
        return a(str, i11, dVar, obj, z11, i12, j11, b11, obj2, dVar2, 0, null);
    }

    private f a(String str, int i11, d dVar, Object obj, boolean z11, int i12, long j11, byte b11, Object obj2, com.igexin.c.a.d.a.d dVar2, int i13, com.igexin.c.a.d.a.g gVar) {
        f a11;
        com.igexin.c.a.d.a.b<String, Integer, d, f> bVar = this.f37160g;
        if (bVar == null || (a11 = bVar.a(str, dVar)) == null || a11.n()) {
            return null;
        }
        if (gVar != null) {
            a11.a(i13, gVar);
        }
        a(a11, obj, z11, i12, j11, b11, obj2, dVar2);
        return a11;
    }

    public final f a(String str, d dVar, Object obj) {
        return a(str, 3, dVar, obj, true, -1, -1L, (byte) 0, null, null);
    }

    public final f a(String str, d dVar, Object obj, int i11, com.igexin.c.a.d.a.g gVar) {
        return a(str, 3, dVar, obj, true, -1, -1L, (byte) 0, null, null, i11, gVar);
    }

    private void a(com.igexin.c.a.d.a.b<String, Integer, d, f> bVar) {
        this.f37160g = bVar;
    }

    private void a(byte[] bArr) {
        this.f37158e = bArr;
        byte[] a11 = com.igexin.c.b.a.a(bArr);
        this.f37159f = a11;
        if (a11 != null) {
            new String(a11);
        }
    }

    private boolean a(f fVar, Object obj, boolean z11, int i11, long j11, byte b11, Object obj2, com.igexin.c.a.d.a.d dVar) {
        fVar.f37164d = obj;
        fVar.a(j11, TimeUnit.MILLISECONDS);
        fVar.A = i11;
        fVar.a((int) b11);
        fVar.F = obj2;
        fVar.a(dVar);
        return a(fVar, z11);
    }
}
