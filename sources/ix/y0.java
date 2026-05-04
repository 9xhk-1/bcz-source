package ix;

import io.ktor.http.IllegalHeaderNameException;
import io.ktor.http.IllegalHeaderValueException;
import java.util.Arrays;
import java.util.List;
import kotlin.DeprecationLevel;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nHttpHeaders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpHeaders.kt\nio/ktor/http/HttpHeaders\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,204:1\n12574#2,2:205\n1188#3,3:207\n1188#3,3:210\n*S KotlinDebug\n*F\n+ 1 HttpHeaders.kt\nio/ktor/http/HttpHeaders\n*L\n130#1:205,2\n151#1:207,3\n162#1:210,3\n*E\n"})
/* loaded from: classes8.dex */
public final class y0 {

    @m80.k
    public static final String[] V0;

    @m80.k
    public static final List<String> W0;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final y0 f63006a = new y0();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final String f63008b = "Accept";

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final String f63010c = "Accept-Charset";

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final String f63012d = "Accept-Encoding";

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final String f63014e = "Accept-Language";

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final String f63016f = "Accept-Ranges";

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final String f63018g = "Age";

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public static final String f63020h = "Allow";

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public static final String f63022i = "ALPN";

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public static final String f63024j = "Authentication-Info";

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public static final String f63026k = "Authorization";

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public static final String f63028l = "Cache-Control";

    /* renamed from: m, reason: collision with root package name */
    @m80.k
    public static final String f63030m = "Connection";

    /* renamed from: n, reason: collision with root package name */
    @m80.k
    public static final String f63032n = "Content-Disposition";

    /* renamed from: o, reason: collision with root package name */
    @m80.k
    public static final String f63034o = "Content-Encoding";

    /* renamed from: p, reason: collision with root package name */
    @m80.k
    public static final String f63036p = "Content-Language";

    /* renamed from: q, reason: collision with root package name */
    @m80.k
    public static final String f63038q = "Content-Length";

    /* renamed from: r, reason: collision with root package name */
    @m80.k
    public static final String f63040r = "Content-Location";

    /* renamed from: s, reason: collision with root package name */
    @m80.k
    public static final String f63042s = "Content-Range";

    /* renamed from: t, reason: collision with root package name */
    @m80.k
    public static final String f63044t = "Content-Type";

    /* renamed from: u, reason: collision with root package name */
    @m80.k
    public static final String f63046u = "Cookie";

    /* renamed from: v, reason: collision with root package name */
    @m80.k
    public static final String f63048v = "DASL";

    /* renamed from: w, reason: collision with root package name */
    @m80.k
    public static final String f63050w = "Date";

    /* renamed from: x, reason: collision with root package name */
    @m80.k
    public static final String f63052x = "DAV";

    /* renamed from: y, reason: collision with root package name */
    @m80.k
    public static final String f63054y = org.apache.http.m.f77734t;

    /* renamed from: z, reason: collision with root package name */
    @m80.k
    public static final String f63056z = org.apache.http.m.f77735u;

    @m80.k
    public static final String A = "ETag";

    @m80.k
    public static final String B = "Expect";

    @m80.k
    public static final String C = "Expires";

    @m80.k
    public static final String D = "From";

    @m80.k
    public static final String E = qo.c.f82442u;

    @m80.k
    public static final String F = "Host";

    @m80.k
    public static final String G = qo.c.f82451x;

    @m80.k
    public static final String H = org.apache.http.m.A;

    @m80.k
    public static final String I = "If-Match";

    @m80.k
    public static final String J = "If-Modified-Since";

    @m80.k
    public static final String K = "If-None-Match";

    @m80.k
    public static final String L = "If-Range";

    @m80.k
    public static final String M = "If-Schedule-Tag-Match";

    @m80.k
    public static final String N = "If-Unmodified-Since";

    @m80.k
    public static final String O = "Last-Modified";

    @m80.k
    public static final String P = "Location";

    @m80.k
    public static final String Q = org.apache.http.m.I;

    @m80.k
    public static final String R = "Link";

    @m80.k
    public static final String S = "Max-Forwards";

    @m80.k
    public static final String T = "MIME-Version";

    @m80.k
    public static final String U = "Ordering-Type";

    @m80.k
    public static final String V = "Origin";

    @m80.k
    public static final String W = org.apache.http.m.K;

    @m80.k
    public static final String X = ma.b.W1;

    @m80.k
    public static final String Y = "Pragma";

    @m80.k
    public static final String Z = "Prefer";

    /* renamed from: a0, reason: collision with root package name */
    @m80.k
    public static final String f63007a0 = "Preference-Applied";

    /* renamed from: b0, reason: collision with root package name */
    @m80.k
    public static final String f63009b0 = "Proxy-Authenticate";

    /* renamed from: c0, reason: collision with root package name */
    @m80.k
    public static final String f63011c0 = "Proxy-Authentication-Info";

    /* renamed from: d0, reason: collision with root package name */
    @m80.k
    public static final String f63013d0 = "Proxy-Authorization";

    /* renamed from: e0, reason: collision with root package name */
    @m80.k
    public static final String f63015e0 = qo.c.f82382c1;

    /* renamed from: f0, reason: collision with root package name */
    @m80.k
    public static final String f63017f0 = qo.c.f82386d1;

    /* renamed from: g0, reason: collision with root package name */
    @m80.k
    public static final String f63019g0 = "Range";

    /* renamed from: h0, reason: collision with root package name */
    @m80.k
    public static final String f63021h0 = "Referer";

    /* renamed from: i0, reason: collision with root package name */
    @m80.k
    public static final String f63023i0 = "Retry-After";

    /* renamed from: j0, reason: collision with root package name */
    @m80.k
    public static final String f63025j0 = "Schedule-Reply";

    /* renamed from: k0, reason: collision with root package name */
    @m80.k
    public static final String f63027k0 = "Schedule-Tag";

    /* renamed from: l0, reason: collision with root package name */
    @m80.k
    public static final String f63029l0 = qo.c.Y1;

    /* renamed from: m0, reason: collision with root package name */
    @m80.k
    public static final String f63031m0 = "Sec-WebSocket-Extensions";

    /* renamed from: n0, reason: collision with root package name */
    @m80.k
    public static final String f63033n0 = qo.c.f82375a2;

    /* renamed from: o0, reason: collision with root package name */
    @m80.k
    public static final String f63035o0 = qo.c.f82379b2;

    /* renamed from: p0, reason: collision with root package name */
    @m80.k
    public static final String f63037p0 = qo.c.f82383c2;

    /* renamed from: q0, reason: collision with root package name */
    @m80.k
    public static final String f63039q0 = "Server";

    /* renamed from: r0, reason: collision with root package name */
    @m80.k
    public static final String f63041r0 = "Set-Cookie";

    /* renamed from: s0, reason: collision with root package name */
    @m80.k
    public static final String f63043s0 = "SLUG";

    /* renamed from: t0, reason: collision with root package name */
    @m80.k
    public static final String f63045t0 = "Strict-Transport-Security";

    /* renamed from: u0, reason: collision with root package name */
    @m80.k
    public static final String f63047u0 = "TE";

    /* renamed from: v0, reason: collision with root package name */
    @m80.k
    public static final String f63049v0 = org.apache.http.m.U;

    /* renamed from: w0, reason: collision with root package name */
    @m80.k
    public static final String f63051w0 = "Trailer";

    /* renamed from: x0, reason: collision with root package name */
    @m80.k
    public static final String f63053x0 = "Transfer-Encoding";

    /* renamed from: y0, reason: collision with root package name */
    @m80.k
    public static final String f63055y0 = "Upgrade";

    /* renamed from: z0, reason: collision with root package name */
    @m80.k
    public static final String f63057z0 = "User-Agent";

    @m80.k
    public static final String A0 = "Vary";

    @m80.k
    public static final String B0 = "Via";

    @m80.k
    public static final String C0 = "Warning";

    @m80.k
    public static final String D0 = "WWW-Authenticate";

    @m80.k
    public static final String E0 = "Access-Control-Allow-Origin";

    @m80.k
    public static final String F0 = qo.c.S;

    @m80.k
    public static final String G0 = qo.c.V;

    @m80.k
    public static final String H0 = qo.c.R;

    @m80.k
    public static final String I0 = qo.c.f82418m;

    @m80.k
    public static final String J0 = qo.c.f82415l;

    @m80.k
    public static final String K0 = qo.c.W;

    @m80.k
    public static final String L0 = qo.c.X;

    @m80.k
    public static final String M0 = "X-Http-Method-Override";

    @m80.k
    public static final String N0 = qo.c.Y0;

    @m80.k
    public static final String O0 = "X-Forwarded-Server";

    @m80.k
    public static final String P0 = qo.c.X0;

    @m80.k
    public static final String Q0 = qo.c.W0;

    @m80.k
    public static final String R0 = qo.c.Z0;

    @m80.k
    public static final String S0 = qo.c.f82390e1;

    @m80.k
    public static final String T0 = "X-Correlation-ID";

    @m80.k
    public static final String U0 = "X-Total-Count";

    static {
        String[] strArr = {"Transfer-Encoding", "Upgrade"};
        V0 = strArr;
        W0 = a00.q.t(strArr);
    }

    @m80.k
    public final String A() {
        return f63040r;
    }

    @m80.k
    public final String A0() {
        return f63039q0;
    }

    @m80.k
    public final String B() {
        return f63042s;
    }

    @m80.k
    public final String B0() {
        return f63041r0;
    }

    @m80.k
    public final String C() {
        return f63044t;
    }

    @m80.k
    public final String C0() {
        return f63045t0;
    }

    @m80.k
    public final String D() {
        return f63046u;
    }

    @m80.k
    public final String D0() {
        return f63047u0;
    }

    @m80.k
    public final String E() {
        return f63048v;
    }

    @m80.k
    public final String E0() {
        return f63049v0;
    }

    @m80.k
    public final String F() {
        return f63052x;
    }

    @m80.k
    public final String F0() {
        return f63051w0;
    }

    @m80.k
    public final String G() {
        return f63050w;
    }

    @m80.k
    public final String G0() {
        return f63053x0;
    }

    @m80.k
    public final String H() {
        return f63054y;
    }

    @m80.k
    public final String[] H0() {
        String[] strArr = V0;
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length);
        kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
        return (String[]) copyOf;
    }

    @m80.k
    public final String I() {
        return f63056z;
    }

    @m80.k
    public final String J() {
        return A;
    }

    @m80.k
    public final List<String> J0() {
        return W0;
    }

    @m80.k
    public final String K() {
        return B;
    }

    @m80.k
    public final String K0() {
        return f63055y0;
    }

    @m80.k
    public final String L() {
        return C;
    }

    @m80.k
    public final String L0() {
        return f63057z0;
    }

    @m80.k
    public final String M() {
        return E;
    }

    @m80.k
    public final String M0() {
        return A0;
    }

    @m80.k
    public final String N() {
        return D;
    }

    @m80.k
    public final String N0() {
        return B0;
    }

    @m80.k
    public final String O() {
        return G;
    }

    @m80.k
    public final String O0() {
        return D0;
    }

    @m80.k
    public final String P() {
        return F;
    }

    @m80.k
    public final String P0() {
        return C0;
    }

    @m80.k
    public final String Q() {
        return H;
    }

    @m80.k
    public final String Q0() {
        return T0;
    }

    @m80.k
    public final String R() {
        return I;
    }

    @m80.k
    public final String R0() {
        return Q0;
    }

    @m80.k
    public final String S() {
        return J;
    }

    @m80.k
    public final String S0() {
        return N0;
    }

    @m80.k
    public final String T() {
        return K;
    }

    @m80.k
    public final String T0() {
        return R0;
    }

    @m80.k
    public final String U() {
        return L;
    }

    @m80.k
    public final String U0() {
        return P0;
    }

    @m80.k
    public final String V() {
        return M;
    }

    @m80.k
    public final String V0() {
        return O0;
    }

    @m80.k
    public final String W() {
        return N;
    }

    @m80.k
    public final String W0() {
        return M0;
    }

    @m80.k
    public final String X() {
        return O;
    }

    @m80.k
    public final String X0() {
        return S0;
    }

    @m80.k
    public final String Y() {
        return R;
    }

    @m80.k
    public final String Y0() {
        return U0;
    }

    @m80.k
    public final String Z() {
        return P;
    }

    public final boolean Z0(@m80.k String header) {
        kotlin.jvm.internal.g0.p(header, "header");
        for (String str : V0) {
            if (u30.f0.c2(str, header, true)) {
                return true;
            }
        }
        return false;
    }

    public final void a(@m80.k String name) {
        boolean b11;
        kotlin.jvm.internal.g0.p(name, "name");
        int i11 = 0;
        int i12 = 0;
        while (i11 < name.length()) {
            char charAt = name.charAt(i11);
            int i13 = i12 + 1;
            if (kotlin.jvm.internal.g0.t(charAt, 32) > 0) {
                b11 = z0.b(charAt);
                if (!b11) {
                    i11++;
                    i12 = i13;
                }
            }
            throw new IllegalHeaderNameException(name, i12);
        }
    }

    @m80.k
    public final String a0() {
        return Q;
    }

    public final void b(@m80.k String value) {
        kotlin.jvm.internal.g0.p(value, "value");
        int i11 = 0;
        int i12 = 0;
        while (i11 < value.length()) {
            char charAt = value.charAt(i11);
            int i13 = i12 + 1;
            if (kotlin.jvm.internal.g0.t(charAt, 32) < 0 && charAt != '\t') {
                throw new IllegalHeaderValueException(value, i12);
            }
            i11++;
            i12 = i13;
        }
    }

    @m80.k
    public final String b0() {
        return T;
    }

    @m80.k
    public final String c() {
        return f63022i;
    }

    @m80.k
    public final String c0() {
        return S;
    }

    @m80.k
    public final String d() {
        return f63008b;
    }

    @m80.k
    public final String d0() {
        return U;
    }

    @m80.k
    public final String e() {
        return f63010c;
    }

    @m80.k
    public final String e0() {
        return V;
    }

    @m80.k
    public final String f() {
        return f63012d;
    }

    @m80.k
    public final String f0() {
        return W;
    }

    @m80.k
    public final String g() {
        return f63014e;
    }

    @m80.k
    public final String g0() {
        return X;
    }

    @m80.k
    public final String h() {
        return f63016f;
    }

    @m80.k
    public final String h0() {
        return Y;
    }

    @m80.k
    public final String i() {
        return G0;
    }

    @m80.k
    public final String i0() {
        return Z;
    }

    @m80.k
    public final String j() {
        return H0;
    }

    @m80.k
    public final String j0() {
        return f63007a0;
    }

    @m80.k
    public final String k() {
        return F0;
    }

    @m80.k
    public final String k0() {
        return f63009b0;
    }

    @m80.k
    public final String l() {
        return E0;
    }

    @m80.k
    public final String l0() {
        return f63011c0;
    }

    @m80.k
    public final String m() {
        return K0;
    }

    @m80.k
    public final String m0() {
        return f63013d0;
    }

    @m80.k
    public final String n() {
        return L0;
    }

    @m80.k
    public final String n0() {
        return f63015e0;
    }

    @m80.k
    public final String o() {
        return J0;
    }

    @m80.k
    public final String o0() {
        return f63017f0;
    }

    @m80.k
    public final String p() {
        return I0;
    }

    @m80.k
    public final String p0() {
        return f63019g0;
    }

    @m80.k
    public final String q() {
        return f63018g;
    }

    @m80.k
    public final String q0() {
        return f63021h0;
    }

    @m80.k
    public final String r() {
        return f63020h;
    }

    @m80.k
    public final String r0() {
        return f63023i0;
    }

    @m80.k
    public final String s() {
        return f63024j;
    }

    @m80.k
    public final String s0() {
        return f63043s0;
    }

    @m80.k
    public final String t() {
        return f63026k;
    }

    @m80.k
    public final String t0() {
        return f63025j0;
    }

    @m80.k
    public final String u() {
        return f63028l;
    }

    @m80.k
    public final String u0() {
        return f63027k0;
    }

    @m80.k
    public final String v() {
        return f63030m;
    }

    @m80.k
    public final String v0() {
        return f63029l0;
    }

    @m80.k
    public final String w() {
        return f63032n;
    }

    @m80.k
    public final String w0() {
        return f63031m0;
    }

    @m80.k
    public final String x() {
        return f63034o;
    }

    @m80.k
    public final String x0() {
        return f63033n0;
    }

    @m80.k
    public final String y() {
        return f63036p;
    }

    @m80.k
    public final String y0() {
        return f63035o0;
    }

    @m80.k
    public final String z() {
        return f63038q;
    }

    @m80.k
    public final String z0() {
        return f63037p0;
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Use UnsafeHeadersList instead.", replaceWith = @yz.w0(expression = "HttpHeaders.UnsafeHeadersList", imports = {}))
    public static /* synthetic */ void I0() {
    }
}
