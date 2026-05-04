package io.ktor.server.routing;

import ix.g1;
import kotlin.DeprecationLevel;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class i0 {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final a f61619b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final double f61620c = 1.0d;

    /* renamed from: d, reason: collision with root package name */
    public static final double f61621d = 1.0d;

    /* renamed from: e, reason: collision with root package name */
    public static final double f61622e = 0.9d;

    /* renamed from: f, reason: collision with root package name */
    public static final double f61623f = 0.8d;

    /* renamed from: g, reason: collision with root package name */
    public static final double f61624g = 0.8d;

    /* renamed from: h, reason: collision with root package name */
    public static final double f61625h = 0.8d;

    /* renamed from: i, reason: collision with root package name */
    public static final double f61626i = 0.5d;

    /* renamed from: j, reason: collision with root package name */
    public static final double f61627j = 0.2d;

    /* renamed from: k, reason: collision with root package name */
    public static final double f61628k = 0.1d;

    /* renamed from: l, reason: collision with root package name */
    public static final double f61629l = -1.0d;

    /* renamed from: m, reason: collision with root package name */
    public static final double f61630m = 0.02d;

    /* renamed from: n, reason: collision with root package name */
    public static final double f61631n = 0.01d;

    /* renamed from: o, reason: collision with root package name */
    @m80.k
    public static final b f61632o;

    /* renamed from: p, reason: collision with root package name */
    @m80.k
    public static final b f61633p;

    /* renamed from: q, reason: collision with root package name */
    @m80.k
    public static final b f61634q;

    /* renamed from: r, reason: collision with root package name */
    @m80.k
    public static final b f61635r;

    /* renamed from: s, reason: collision with root package name */
    @m80.k
    public static final i0 f61636s;

    /* renamed from: t, reason: collision with root package name */
    @m80.k
    public static final i0 f61637t;

    /* renamed from: u, reason: collision with root package name */
    @m80.k
    public static final i0 f61638u;

    /* renamed from: v, reason: collision with root package name */
    @m80.k
    public static final i0 f61639v;

    /* renamed from: w, reason: collision with root package name */
    @m80.k
    public static final i0 f61640w;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f61641a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public static /* synthetic */ i0 l(a aVar, boolean z11, double d11, ix.p1 p1Var, int i11, int i12, Object obj) {
            if ((i12 & 4) != 0) {
                p1Var = ix.p1.f62972b.b();
            }
            ix.p1 p1Var2 = p1Var;
            if ((i12 & 8) != 0) {
                i11 = 0;
            }
            return aVar.k(z11, d11, p1Var2, i11);
        }

        @m80.k
        public final i0 a() {
            return i0.f61637t;
        }

        @m80.k
        public final i0 b() {
            return i0.f61639v;
        }

        @m80.k
        public final b c() {
            return i0.f61632o;
        }

        @m80.k
        public final b d() {
            return i0.f61634q;
        }

        @m80.k
        public final b e() {
            return i0.f61635r;
        }

        @m80.k
        public final b f() {
            return i0.f61633p;
        }

        @m80.k
        public final i0 g() {
            return i0.f61636s;
        }

        @m80.k
        public final i0 i() {
            return i0.f61638u;
        }

        @m80.k
        public final i0 j() {
            return i0.f61640w;
        }

        @yz.n(level = DeprecationLevel.ERROR, message = "Please use RouteSelectorEvaluation.Failure() or RouteSelectorEvaluation.Success() constructors")
        @m80.k
        public final i0 k(boolean z11, double d11, @m80.k ix.p1 parameters, int i11) {
            kotlin.jvm.internal.g0.p(parameters, "parameters");
            return z11 ? new c(d11, parameters, i11) : new b(d11, ix.g1.f62797c.z());
        }

        public a() {
        }

        public static /* synthetic */ void h() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends i0 {

        /* renamed from: x, reason: collision with root package name */
        public final double f61642x;

        /* renamed from: y, reason: collision with root package name */
        @m80.k
        public final ix.g1 f61643y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(double d11, @m80.k ix.g1 failureStatusCode) {
            super(false, null);
            kotlin.jvm.internal.g0.p(failureStatusCode, "failureStatusCode");
            this.f61642x = d11;
            this.f61643y = failureStatusCode;
        }

        public static /* synthetic */ b n(b bVar, double d11, ix.g1 g1Var, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                d11 = bVar.f61642x;
            }
            if ((i11 & 2) != 0) {
                g1Var = bVar.f61643y;
            }
            return bVar.m(d11, g1Var);
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Double.compare(this.f61642x, bVar.f61642x) == 0 && kotlin.jvm.internal.g0.g(this.f61643y, bVar.f61643y);
        }

        public int hashCode() {
            return (Double.hashCode(this.f61642x) * 31) + this.f61643y.hashCode();
        }

        public final double k() {
            return this.f61642x;
        }

        @m80.k
        public final ix.g1 l() {
            return this.f61643y;
        }

        @m80.k
        public final b m(double d11, @m80.k ix.g1 failureStatusCode) {
            kotlin.jvm.internal.g0.p(failureStatusCode, "failureStatusCode");
            return new b(d11, failureStatusCode);
        }

        @m80.k
        public final ix.g1 o() {
            return this.f61643y;
        }

        public final double p() {
            return this.f61642x;
        }

        @m80.k
        public String toString() {
            return "Failure(quality=" + this.f61642x + ", failureStatusCode=" + this.f61643y + ')';
        }
    }

    static {
        g1.a aVar = ix.g1.f62797c;
        f61632o = new b(0.0d, aVar.z());
        f61633p = new b(0.0d, aVar.z());
        f61634q = new b(0.02d, aVar.s());
        f61635r = new b(0.01d, aVar.e());
        f61636s = new c(0.2d, null, 0, 6, null);
        f61637t = new c(1.0d, null, 0, 6, null);
        f61638u = new c(-1.0d, null, 0, 6, null);
        f61639v = new c(1.0d, null, 1, 2, null);
        f61640w = new c(0.5d, null, 1, 2, null);
    }

    public /* synthetic */ i0(boolean z11, kotlin.jvm.internal.v vVar) {
        this(z11);
    }

    public final boolean j() {
        return this.f61641a;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends i0 {

        /* renamed from: x, reason: collision with root package name */
        public final double f61644x;

        /* renamed from: y, reason: collision with root package name */
        @m80.k
        public final ix.p1 f61645y;

        /* renamed from: z, reason: collision with root package name */
        public final int f61646z;

        public /* synthetic */ c(double d11, ix.p1 p1Var, int i11, int i12, kotlin.jvm.internal.v vVar) {
            this(d11, (i12 & 2) != 0 ? ix.p1.f62972b.b() : p1Var, (i12 & 4) != 0 ? 0 : i11);
        }

        public static /* synthetic */ c o(c cVar, double d11, ix.p1 p1Var, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                d11 = cVar.f61644x;
            }
            if ((i12 & 2) != 0) {
                p1Var = cVar.f61645y;
            }
            if ((i12 & 4) != 0) {
                i11 = cVar.f61646z;
            }
            return cVar.n(d11, p1Var, i11);
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Double.compare(this.f61644x, cVar.f61644x) == 0 && kotlin.jvm.internal.g0.g(this.f61645y, cVar.f61645y) && this.f61646z == cVar.f61646z;
        }

        public int hashCode() {
            return (((Double.hashCode(this.f61644x) * 31) + this.f61645y.hashCode()) * 31) + Integer.hashCode(this.f61646z);
        }

        public final double k() {
            return this.f61644x;
        }

        @m80.k
        public final ix.p1 l() {
            return this.f61645y;
        }

        public final int m() {
            return this.f61646z;
        }

        @m80.k
        public final c n(double d11, @m80.k ix.p1 parameters, int i11) {
            kotlin.jvm.internal.g0.p(parameters, "parameters");
            return new c(d11, parameters, i11);
        }

        @m80.k
        public final ix.p1 p() {
            return this.f61645y;
        }

        public final double q() {
            return this.f61644x;
        }

        public final int r() {
            return this.f61646z;
        }

        @m80.k
        public String toString() {
            return "Success(quality=" + this.f61644x + ", parameters=" + this.f61645y + ", segmentIncrement=" + this.f61646z + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(double d11, @m80.k ix.p1 parameters, int i11) {
            super(true, null);
            kotlin.jvm.internal.g0.p(parameters, "parameters");
            this.f61644x = d11;
            this.f61645y = parameters;
            this.f61646z = i11;
        }
    }

    public i0(boolean z11) {
        this.f61641a = z11;
    }
}
