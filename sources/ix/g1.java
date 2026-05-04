package ix;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nHttpStatusCode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpStatusCode.kt\nio/ktor/http/HttpStatusCode\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,185:1\n1202#2,2:186\n1230#2,4:188\n*S KotlinDebug\n*F\n+ 1 HttpStatusCode.kt\nio/ktor/http/HttpStatusCode\n*L\n112#1:186,2\n112#1:188,4\n*E\n"})
/* loaded from: classes8.dex */
public final class g1 implements Comparable<g1> {

    /* renamed from: j1, reason: collision with root package name */
    @m80.k
    public static final List<g1> f62809j1;

    /* renamed from: k1, reason: collision with root package name */
    @m80.k
    public static final Map<Integer, g1> f62811k1;

    /* renamed from: a, reason: collision with root package name */
    public final int f62827a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f62828b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final a f62797c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final g1 f62798d = new g1(100, "Continue");

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final g1 f62799e = new g1(101, "Switching Protocols");

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final g1 f62800f = new g1(102, "Processing");

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final g1 f62803g = new g1(200, "OK");

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public static final g1 f62804h = new g1(201, "Created");

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public static final g1 f62806i = new g1(202, "Accepted");

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public static final g1 f62808j = new g1(203, "Non-Authoritative Information");

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public static final g1 f62810k = new g1(204, "No Content");

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public static final g1 f62812l = new g1(205, "Reset Content");

    /* renamed from: m, reason: collision with root package name */
    @m80.k
    public static final g1 f62813m = new g1(206, "Partial Content");

    /* renamed from: n, reason: collision with root package name */
    @m80.k
    public static final g1 f62814n = new g1(207, "Multi-Status");

    /* renamed from: o, reason: collision with root package name */
    @m80.k
    public static final g1 f62815o = new g1(300, "Multiple Choices");

    /* renamed from: p, reason: collision with root package name */
    @m80.k
    public static final g1 f62816p = new g1(301, "Moved Permanently");

    /* renamed from: q, reason: collision with root package name */
    @m80.k
    public static final g1 f62817q = new g1(302, "Found");

    /* renamed from: r, reason: collision with root package name */
    @m80.k
    public static final g1 f62818r = new g1(303, "See Other");

    /* renamed from: s, reason: collision with root package name */
    @m80.k
    public static final g1 f62819s = new g1(304, "Not Modified");

    /* renamed from: t, reason: collision with root package name */
    @m80.k
    public static final g1 f62820t = new g1(305, "Use Proxy");

    /* renamed from: u, reason: collision with root package name */
    @m80.k
    public static final g1 f62821u = new g1(306, "Switch Proxy");

    /* renamed from: v, reason: collision with root package name */
    @m80.k
    public static final g1 f62822v = new g1(307, "Temporary Redirect");

    /* renamed from: w, reason: collision with root package name */
    @m80.k
    public static final g1 f62823w = new g1(308, "Permanent Redirect");

    /* renamed from: x, reason: collision with root package name */
    @m80.k
    public static final g1 f62824x = new g1(400, "Bad Request");

    /* renamed from: y, reason: collision with root package name */
    @m80.k
    public static final g1 f62825y = new g1(401, "Unauthorized");

    /* renamed from: z, reason: collision with root package name */
    @m80.k
    public static final g1 f62826z = new g1(402, "Payment Required");

    @m80.k
    public static final g1 A = new g1(403, "Forbidden");

    @m80.k
    public static final g1 B = new g1(404, "Not Found");

    @m80.k
    public static final g1 C = new g1(405, "Method Not Allowed");

    @m80.k
    public static final g1 D = new g1(406, "Not Acceptable");

    @m80.k
    public static final g1 E = new g1(407, "Proxy Authentication Required");

    @m80.k
    public static final g1 F = new g1(408, "Request Timeout");

    @m80.k
    public static final g1 G = new g1(409, "Conflict");

    @m80.k
    public static final g1 H = new g1(410, "Gone");

    @m80.k
    public static final g1 I = new g1(411, "Length Required");

    @m80.k
    public static final g1 J = new g1(412, "Precondition Failed");

    @m80.k
    public static final g1 K = new g1(413, "Payload Too Large");

    @m80.k
    public static final g1 L = new g1(414, "Request-URI Too Long");

    @m80.k
    public static final g1 M = new g1(415, "Unsupported Media Type");

    @m80.k
    public static final g1 N = new g1(416, "Requested Range Not Satisfiable");

    @m80.k
    public static final g1 O = new g1(417, "Expectation Failed");

    @m80.k
    public static final g1 P = new g1(422, "Unprocessable Entity");

    @m80.k
    public static final g1 Q = new g1(423, "Locked");

    @m80.k
    public static final g1 R = new g1(424, "Failed Dependency");

    @m80.k
    public static final g1 S = new g1(TypedValues.CycleType.TYPE_WAVE_PHASE, "Too Early");

    @m80.k
    public static final g1 T = new g1(426, "Upgrade Required");

    @m80.k
    public static final g1 U = new g1(org.apache.http.u.P, "Too Many Requests");

    @m80.k
    public static final g1 V = new g1(431, "Request Header Fields Too Large");

    @m80.k
    public static final g1 W = new g1(500, "Internal Server Error");

    @m80.k
    public static final g1 X = new g1(501, "Not Implemented");

    @m80.k
    public static final g1 Y = new g1(502, "Bad Gateway");

    @m80.k
    public static final g1 Z = new g1(503, "Service Unavailable");

    /* renamed from: f0, reason: collision with root package name */
    @m80.k
    public static final g1 f62801f0 = new g1(504, "Gateway Timeout");

    /* renamed from: f1, reason: collision with root package name */
    @m80.k
    public static final g1 f62802f1 = new g1(505, "HTTP Version Not Supported");

    /* renamed from: h1, reason: collision with root package name */
    @m80.k
    public static final g1 f62805h1 = new g1(TypedValues.PositionType.TYPE_PERCENT_X, "Variant Also Negotiates");

    /* renamed from: i1, reason: collision with root package name */
    @m80.k
    public static final g1 f62807i1 = new g1(507, "Insufficient Storage");

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final g1 A() {
            return g1.X;
        }

        @m80.k
        public final g1 B() {
            return g1.f62819s;
        }

        @m80.k
        public final g1 C() {
            return g1.f62803g;
        }

        @m80.k
        public final g1 D() {
            return g1.f62813m;
        }

        @m80.k
        public final g1 E() {
            return g1.K;
        }

        @m80.k
        public final g1 F() {
            return g1.f62826z;
        }

        @m80.k
        public final g1 G() {
            return g1.f62823w;
        }

        @m80.k
        public final g1 H() {
            return g1.J;
        }

        @m80.k
        public final g1 I() {
            return g1.f62800f;
        }

        @m80.k
        public final g1 J() {
            return g1.E;
        }

        @m80.k
        public final g1 K() {
            return g1.V;
        }

        @m80.k
        public final g1 L() {
            return g1.F;
        }

        @m80.k
        public final g1 M() {
            return g1.L;
        }

        @m80.k
        public final g1 N() {
            return g1.N;
        }

        @m80.k
        public final g1 O() {
            return g1.f62812l;
        }

        @m80.k
        public final g1 P() {
            return g1.f62818r;
        }

        @m80.k
        public final g1 Q() {
            return g1.Z;
        }

        @m80.k
        public final g1 R() {
            return g1.f62821u;
        }

        @m80.k
        public final g1 S() {
            return g1.f62799e;
        }

        @m80.k
        public final g1 T() {
            return g1.f62822v;
        }

        @m80.k
        public final g1 U() {
            return g1.S;
        }

        @m80.k
        public final g1 V() {
            return g1.U;
        }

        @m80.k
        public final g1 W() {
            return g1.f62825y;
        }

        @m80.k
        public final g1 X() {
            return g1.P;
        }

        @m80.k
        public final g1 Y() {
            return g1.M;
        }

        @m80.k
        public final g1 Z() {
            return g1.T;
        }

        @m80.k
        public final g1 a(int i11) {
            g1 g1Var = (g1) g1.f62811k1.get(Integer.valueOf(i11));
            return g1Var == null ? new g1(i11, "Unknown Status Code") : g1Var;
        }

        @m80.k
        public final g1 a0() {
            return g1.f62820t;
        }

        @m80.k
        public final g1 b() {
            return g1.f62806i;
        }

        @m80.k
        public final g1 b0() {
            return g1.f62805h1;
        }

        @m80.k
        public final List<g1> c() {
            return g1.f62809j1;
        }

        @m80.k
        public final g1 c0() {
            return g1.f62802f1;
        }

        @m80.k
        public final g1 d() {
            return g1.Y;
        }

        @m80.k
        public final g1 e() {
            return g1.f62824x;
        }

        @m80.k
        public final g1 f() {
            return g1.G;
        }

        @m80.k
        public final g1 g() {
            return g1.f62798d;
        }

        @m80.k
        public final g1 h() {
            return g1.f62804h;
        }

        @m80.k
        public final g1 i() {
            return g1.O;
        }

        @m80.k
        public final g1 j() {
            return g1.R;
        }

        @m80.k
        public final g1 k() {
            return g1.A;
        }

        @m80.k
        public final g1 l() {
            return g1.f62817q;
        }

        @m80.k
        public final g1 m() {
            return g1.f62801f0;
        }

        @m80.k
        public final g1 n() {
            return g1.H;
        }

        @m80.k
        public final g1 o() {
            return g1.f62807i1;
        }

        @m80.k
        public final g1 p() {
            return g1.W;
        }

        @m80.k
        public final g1 q() {
            return g1.I;
        }

        @m80.k
        public final g1 r() {
            return g1.Q;
        }

        @m80.k
        public final g1 s() {
            return g1.C;
        }

        @m80.k
        public final g1 t() {
            return g1.f62816p;
        }

        @m80.k
        public final g1 u() {
            return g1.f62814n;
        }

        @m80.k
        public final g1 v() {
            return g1.f62815o;
        }

        @m80.k
        public final g1 w() {
            return g1.f62810k;
        }

        @m80.k
        public final g1 x() {
            return g1.f62808j;
        }

        @m80.k
        public final g1 y() {
            return g1.D;
        }

        @m80.k
        public final g1 z() {
            return g1.B;
        }

        public a() {
        }
    }

    static {
        List<g1> a11 = h1.a();
        f62809j1 = a11;
        List<g1> list = a11;
        LinkedHashMap linkedHashMap = new LinkedHashMap(g10.u.u(a00.k1.j(a00.i0.d0(list, 10)), 16));
        for (Object obj : list) {
            linkedHashMap.put(Integer.valueOf(((g1) obj).f62827a), obj);
        }
        f62811k1 = linkedHashMap;
    }

    public g1(int i11, @m80.k String description) {
        kotlin.jvm.internal.g0.p(description, "description");
        this.f62827a = i11;
        this.f62828b = description;
    }

    public static /* synthetic */ g1 m0(g1 g1Var, int i11, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = g1Var.f62827a;
        }
        if ((i12 & 2) != 0) {
            str = g1Var.f62828b;
        }
        return g1Var.l0(i11, str);
    }

    public boolean equals(@m80.l Object obj) {
        return (obj instanceof g1) && ((g1) obj).f62827a == this.f62827a;
    }

    public int hashCode() {
        return Integer.hashCode(this.f62827a);
    }

    @Override // java.lang.Comparable
    /* renamed from: i0, reason: merged with bridge method [inline-methods] */
    public int compareTo(@m80.k g1 other) {
        kotlin.jvm.internal.g0.p(other, "other");
        return this.f62827a - other.f62827a;
    }

    public final int j0() {
        return this.f62827a;
    }

    @m80.k
    public final String k0() {
        return this.f62828b;
    }

    @m80.k
    public final g1 l0(int i11, @m80.k String description) {
        kotlin.jvm.internal.g0.p(description, "description");
        return new g1(i11, description);
    }

    @m80.k
    public final g1 n0(@m80.k String value) {
        kotlin.jvm.internal.g0.p(value, "value");
        return m0(this, 0, value, 1, null);
    }

    @m80.k
    public final String o0() {
        return this.f62828b;
    }

    public final int p0() {
        return this.f62827a;
    }

    @m80.k
    public String toString() {
        return this.f62827a + ' ' + this.f62828b;
    }
}
