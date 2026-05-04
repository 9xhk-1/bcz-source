package my;

import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f73889a = new h("OK", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final h f73890b = new h("SkipCORS", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final h f73891c = new h("Failed", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ h[] f73892d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ m00.a f73893e;

    static {
        h[] a11 = a();
        f73892d = a11;
        f73893e = m00.c.c(a11);
    }

    public h(String str, int i11) {
    }

    public static final /* synthetic */ h[] a() {
        return new h[]{f73889a, f73890b, f73891c};
    }

    @k
    public static m00.a<h> b() {
        return f73893e;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f73892d.clone();
    }
}
