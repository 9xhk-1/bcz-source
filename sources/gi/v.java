package gi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    public static final int f53848a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f53849b = 4;

    /* renamed from: c, reason: collision with root package name */
    public static final int f53850c = 8;

    /* renamed from: d, reason: collision with root package name */
    public static final int f53851d = 16;

    /* renamed from: e, reason: collision with root package name */
    public static final int f53852e = 32;

    /* renamed from: f, reason: collision with root package name */
    public static final int f53853f = 64;

    /* renamed from: g, reason: collision with root package name */
    public static final int f53854g = 128;

    /* renamed from: h, reason: collision with root package name */
    public static final int f53855h = 256;

    /* renamed from: i, reason: collision with root package name */
    public static final int f53856i = 512;

    /* renamed from: j, reason: collision with root package name */
    public static final int f53857j = 1024;

    /* renamed from: k, reason: collision with root package name */
    public static final int f53858k = 2048;

    /* renamed from: l, reason: collision with root package name */
    public static final int f53859l = 4096;

    /* renamed from: m, reason: collision with root package name */
    public static final int f53860m = 8192;

    /* renamed from: n, reason: collision with root package name */
    public static final int f53861n = 16384;

    public static void a(int flag) {
        e(flag | b());
    }

    public static int b() {
        return ia.a.c(ia.a.f60457h);
    }

    public static boolean c(int flag) {
        int b11 = b();
        return (b11 & 1) > 0 && (flag & b11) == 0;
    }

    public static boolean d() {
        return (b() & 1) > 0;
    }

    public static void e(int guideFlags) {
        ia.a.k(ia.a.f60457h, guideFlags);
    }
}
