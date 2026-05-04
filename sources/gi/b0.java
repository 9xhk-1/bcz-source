package gi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f53731a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f53732b = 2;

    /* renamed from: c, reason: collision with root package name */
    public static final int f53733c = 4;

    /* renamed from: d, reason: collision with root package name */
    public static final int f53734d = 8;

    public static void a() {
        h((d() & (-2)) | 2);
    }

    public static void b(int flag) {
        h(flag | d());
    }

    public static void c() {
        h(d() | 3);
    }

    public static int d() {
        return ia.a.c(ia.a.f60458i);
    }

    public static boolean e() {
        return (d() & 2) > 0;
    }

    public static boolean f(int flag) {
        int d11 = d();
        return (d11 & 1) > 0 && (flag & d11) == 0;
    }

    public static boolean g() {
        return (d() & 1) > 0;
    }

    public static void h(int guideFlags) {
        ia.a.k(ia.a.f60458i, guideFlags);
    }

    public static void i() {
        h(d() & (-3));
    }
}
