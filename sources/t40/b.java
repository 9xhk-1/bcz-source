package t40;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final int f89483a = 3600;

    /* renamed from: b, reason: collision with root package name */
    public static final int f89484b = 60;

    /* renamed from: c, reason: collision with root package name */
    public static final int f89485c = 60;

    /* renamed from: d, reason: collision with root package name */
    public static final int f89486d = 24;

    /* renamed from: e, reason: collision with root package name */
    public static final int f89487e = 86400;

    /* renamed from: f, reason: collision with root package name */
    public static final int f89488f = 1000000000;

    /* renamed from: g, reason: collision with root package name */
    public static final int f89489g = 1000000;

    /* renamed from: h, reason: collision with root package name */
    public static final int f89490h = 1000;

    /* renamed from: i, reason: collision with root package name */
    public static final long f89491i = 86400000000000L;

    /* renamed from: j, reason: collision with root package name */
    public static final long f89492j = 60000000000L;

    /* renamed from: k, reason: collision with root package name */
    public static final long f89493k = 3600000000000L;

    /* renamed from: l, reason: collision with root package name */
    public static final int f89494l = 86400000;

    /* renamed from: m, reason: collision with root package name */
    public static final long f89495m = 315569520000L;

    public static final boolean a(int i11) {
        long j11 = i11;
        if ((3 & j11) == 0) {
            return j11 % ((long) 100) != 0 || j11 % ((long) 400) == 0;
        }
        return false;
    }

    public static final int b(int i11, boolean z11) {
        return i11 != 2 ? (i11 == 4 || i11 == 6 || i11 == 9 || i11 == 11) ? 30 : 31 : z11 ? 29 : 28;
    }
}
