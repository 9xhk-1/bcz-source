package com.baicizhan.main.vld.bonding;

import s.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f25260b = new a(n.f.f87059b, 0, (byte) 1);

    /* renamed from: c, reason: collision with root package name */
    public static final a f25261c = new a(n.f.f87061d, 1, (byte) 2);

    /* renamed from: d, reason: collision with root package name */
    public static final a f25262d = new a("TOKEN", 2, (byte) 3);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a[] f25263e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ m00.a f25264f;

    /* renamed from: a, reason: collision with root package name */
    public final byte f25265a;

    static {
        a[] a11 = a();
        f25263e = a11;
        f25264f = m00.c.c(a11);
    }

    public a(String str, int i11, byte b11) {
        this.f25265a = b11;
    }

    public static final /* synthetic */ a[] a() {
        return new a[]{f25260b, f25261c, f25262d};
    }

    @m80.k
    public static m00.a<a> b() {
        return f25264f;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f25263e.clone();
    }

    public final byte c() {
        return this.f25265a;
    }
}
