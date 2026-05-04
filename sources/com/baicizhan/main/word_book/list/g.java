package com.baicizhan.main.word_book.list;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f27143a = new g("UNSPECIFIED", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final g f27144b = new g("PENDING", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final g f27145c = new g("RESOLVED", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final g f27146d = new g("GRANTED", 3);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ g[] f27147e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ m00.a f27148f;

    static {
        g[] a11 = a();
        f27147e = a11;
        f27148f = m00.c.c(a11);
    }

    public g(String str, int i11) {
    }

    public static final /* synthetic */ g[] a() {
        return new g[]{f27143a, f27144b, f27145c, f27146d};
    }

    @m80.k
    public static m00.a<g> b() {
        return f27148f;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f27147e.clone();
    }
}
