package c10;

import m80.k;
import w00.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f7473a = new a();

    /* renamed from: b, reason: collision with root package name */
    @g
    public static final double f7474b = Math.log(2.0d);

    /* renamed from: c, reason: collision with root package name */
    @g
    public static final double f7475c;

    /* renamed from: d, reason: collision with root package name */
    @g
    public static final double f7476d;

    /* renamed from: e, reason: collision with root package name */
    @g
    public static final double f7477e;

    /* renamed from: f, reason: collision with root package name */
    @g
    public static final double f7478f;

    /* renamed from: g, reason: collision with root package name */
    @g
    public static final double f7479g;

    static {
        double ulp = Math.ulp(1.0d);
        f7475c = ulp;
        double sqrt = Math.sqrt(ulp);
        f7476d = sqrt;
        double sqrt2 = Math.sqrt(sqrt);
        f7477e = sqrt2;
        double d11 = 1;
        f7478f = d11 / sqrt;
        f7479g = d11 / sqrt2;
    }
}
