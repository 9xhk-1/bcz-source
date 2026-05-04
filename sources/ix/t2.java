package ix;

import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nUrl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Url.kt\nio/ktor/http/Url\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,257:1\n1#2:258\n*E\n"})
/* loaded from: classes8.dex */
public final class t2 {

    /* renamed from: t, reason: collision with root package name */
    @m80.k
    public static final a f62982t = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f62983a;

    /* renamed from: b, reason: collision with root package name */
    public final int f62984b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final p1 f62985c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final String f62986d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    public final String f62987e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    public final String f62988f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f62989g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final String f62990h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public final List<String> f62991i;

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public final List<String> f62992j;

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public final yz.c0 f62993k;

    /* renamed from: l, reason: collision with root package name */
    @m80.l
    public final h2 f62994l;

    /* renamed from: m, reason: collision with root package name */
    @m80.k
    public final h2 f62995m;

    /* renamed from: n, reason: collision with root package name */
    @m80.k
    public final yz.c0 f62996n;

    /* renamed from: o, reason: collision with root package name */
    @m80.k
    public final yz.c0 f62997o;

    /* renamed from: p, reason: collision with root package name */
    @m80.k
    public final yz.c0 f62998p;

    /* renamed from: q, reason: collision with root package name */
    @m80.k
    public final yz.c0 f62999q;

    /* renamed from: r, reason: collision with root package name */
    @m80.k
    public final yz.c0 f63000r;

    /* renamed from: s, reason: collision with root package name */
    @m80.k
    public final yz.c0 f63001s;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public a() {
        }
    }

    public t2(@m80.l h2 h2Var, @m80.k String host, int i11, @m80.k final List<String> pathSegments, @m80.k p1 parameters, @m80.k String fragment, @m80.l String str, @m80.l String str2, boolean z11, @m80.k String urlString) {
        kotlin.jvm.internal.g0.p(host, "host");
        kotlin.jvm.internal.g0.p(pathSegments, "pathSegments");
        kotlin.jvm.internal.g0.p(parameters, "parameters");
        kotlin.jvm.internal.g0.p(fragment, "fragment");
        kotlin.jvm.internal.g0.p(urlString, "urlString");
        this.f62983a = host;
        this.f62984b = i11;
        this.f62985c = parameters;
        this.f62986d = fragment;
        this.f62987e = str;
        this.f62988f = str2;
        this.f62989g = z11;
        this.f62990h = urlString;
        if (i11 < 0 || i11 >= 65536) {
            throw new IllegalArgumentException(("Port must be between 0 and 65535, or 0 if not set. Provided: " + i11).toString());
        }
        this.f62991i = pathSegments;
        this.f62992j = pathSegments;
        this.f62993k = yz.e0.c(new x00.a() { // from class: ix.m2
            @Override // x00.a
            public final Object invoke() {
                List H;
                H = t2.H(pathSegments);
                return H;
            }
        });
        this.f62994l = h2Var;
        this.f62995m = h2Var == null ? h2.f62830c.c() : h2Var;
        this.f62996n = yz.e0.c(new x00.a() { // from class: ix.n2
            @Override // x00.a
            public final Object invoke() {
                String k11;
                k11 = t2.k(pathSegments, this);
                return k11;
            }
        });
        this.f62997o = yz.e0.c(new x00.a() { // from class: ix.o2
            @Override // x00.a
            public final Object invoke() {
                String l11;
                l11 = t2.l(t2.this);
                return l11;
            }
        });
        this.f62998p = yz.e0.c(new x00.a() { // from class: ix.p2
            @Override // x00.a
            public final Object invoke() {
                String j11;
                j11 = t2.j(t2.this);
                return j11;
            }
        });
        this.f62999q = yz.e0.c(new x00.a() { // from class: ix.q2
            @Override // x00.a
            public final Object invoke() {
                String m11;
                m11 = t2.m(t2.this);
                return m11;
            }
        });
        this.f63000r = yz.e0.c(new x00.a() { // from class: ix.r2
            @Override // x00.a
            public final Object invoke() {
                String i12;
                i12 = t2.i(t2.this);
                return i12;
            }
        });
        this.f63001s = yz.e0.c(new x00.a() { // from class: ix.s2
            @Override // x00.a
            public final Object invoke() {
                String h11;
                h11 = t2.h(t2.this);
                return h11;
            }
        });
    }

    public static final List H(List list) {
        if (list.isEmpty()) {
            return a00.h0.J();
        }
        return list.subList((((CharSequence) a00.r0.G2(list)).length() != 0 || list.size() <= 1) ? 0 : 1, ((CharSequence) a00.r0.u3(list)).length() == 0 ? a00.h0.L(list) : 1 + a00.h0.L(list));
    }

    public static final String h(t2 t2Var) {
        int I3 = u30.k0.I3(t2Var.f62990h, '#', 0, false, 6, null) + 1;
        if (I3 == 0) {
            return "";
        }
        String substring = t2Var.f62990h.substring(I3);
        kotlin.jvm.internal.g0.o(substring, "substring(...)");
        return substring;
    }

    public static final String i(t2 t2Var) {
        String str = t2Var.f62988f;
        if (str == null) {
            return null;
        }
        if (str.length() == 0) {
            return "";
        }
        String substring = t2Var.f62990h.substring(u30.k0.I3(t2Var.f62990h, ':', t2Var.f62995m.l().length() + 3, false, 4, null) + 1, u30.k0.I3(t2Var.f62990h, '@', 0, false, 6, null));
        kotlin.jvm.internal.g0.o(substring, "substring(...)");
        return substring;
    }

    public static final String j(t2 t2Var) {
        int I3 = u30.k0.I3(t2Var.f62990h, '/', t2Var.f62995m.l().length() + 3, false, 4, null);
        if (I3 == -1) {
            return "";
        }
        int I32 = u30.k0.I3(t2Var.f62990h, '#', I3, false, 4, null);
        if (I32 == -1) {
            String substring = t2Var.f62990h.substring(I3);
            kotlin.jvm.internal.g0.o(substring, "substring(...)");
            return substring;
        }
        String substring2 = t2Var.f62990h.substring(I3, I32);
        kotlin.jvm.internal.g0.o(substring2, "substring(...)");
        return substring2;
    }

    public static final String k(List list, t2 t2Var) {
        int I3;
        if (list.isEmpty() || (I3 = u30.k0.I3(t2Var.f62990h, '/', t2Var.f62995m.l().length() + 3, false, 4, null)) == -1) {
            return "";
        }
        int N3 = u30.k0.N3(t2Var.f62990h, new char[]{s60.d.f88057a, '#'}, I3, false, 4, null);
        if (N3 == -1) {
            String substring = t2Var.f62990h.substring(I3);
            kotlin.jvm.internal.g0.o(substring, "substring(...)");
            return substring;
        }
        String substring2 = t2Var.f62990h.substring(I3, N3);
        kotlin.jvm.internal.g0.o(substring2, "substring(...)");
        return substring2;
    }

    public static final String l(t2 t2Var) {
        int I3 = u30.k0.I3(t2Var.f62990h, s60.d.f88057a, 0, false, 6, null) + 1;
        if (I3 == 0) {
            return "";
        }
        int I32 = u30.k0.I3(t2Var.f62990h, '#', I3, false, 4, null);
        if (I32 == -1) {
            String substring = t2Var.f62990h.substring(I3);
            kotlin.jvm.internal.g0.o(substring, "substring(...)");
            return substring;
        }
        String substring2 = t2Var.f62990h.substring(I3, I32);
        kotlin.jvm.internal.g0.o(substring2, "substring(...)");
        return substring2;
    }

    public static final String m(t2 t2Var) {
        String str = t2Var.f62987e;
        if (str == null) {
            return null;
        }
        if (str.length() == 0) {
            return "";
        }
        int length = t2Var.f62995m.l().length() + 3;
        String substring = t2Var.f62990h.substring(length, u30.k0.N3(t2Var.f62990h, new char[]{':', '@'}, length, false, 4, null));
        kotlin.jvm.internal.g0.o(substring, "substring(...)");
        return substring;
    }

    @m80.k
    public final h2 A() {
        return this.f62995m;
    }

    @m80.l
    public final h2 B() {
        return this.f62994l;
    }

    @m80.k
    public final List<String> C() {
        return this.f62992j;
    }

    @m80.k
    public final List<String> D() {
        return (List) this.f62993k.getValue();
    }

    public final int E() {
        return this.f62984b;
    }

    public final boolean F() {
        return this.f62989g;
    }

    @m80.l
    public final String G() {
        return this.f62987e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t2.class != obj.getClass()) {
            return false;
        }
        return kotlin.jvm.internal.g0.g(this.f62990h, ((t2) obj).f62990h);
    }

    public int hashCode() {
        return this.f62990h.hashCode();
    }

    @m80.k
    public final String n() {
        return (String) this.f63001s.getValue();
    }

    @m80.l
    public final String o() {
        return (String) this.f63000r.getValue();
    }

    @m80.k
    public final String p() {
        return (String) this.f62996n.getValue();
    }

    @m80.k
    public final String q() {
        return (String) this.f62998p.getValue();
    }

    @m80.k
    public final String r() {
        return (String) this.f62997o.getValue();
    }

    @m80.l
    public final String s() {
        return (String) this.f62999q.getValue();
    }

    @m80.k
    public final String t() {
        return this.f62986d;
    }

    @m80.k
    public String toString() {
        return this.f62990h;
    }

    @m80.k
    public final String u() {
        return this.f62983a;
    }

    @m80.k
    public final p1 v() {
        return this.f62985c;
    }

    @m80.l
    public final String w() {
        return this.f62988f;
    }

    @m80.k
    public final List<String> x() {
        return this.f62991i;
    }

    public final int z() {
        Integer valueOf = Integer.valueOf(this.f62984b);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        return valueOf != null ? valueOf.intValue() : this.f62995m.k();
    }

    @yz.n(message = "\n        `pathSegments` is deprecated.\n\n        This property will contain an empty path segment at the beginning for URLs with a hostname,\n        and an empty path segment at the end for the URLs with a trailing slash. If you need to keep this behaviour please\n        use [rawSegments]. If you only need to access the meaningful parts of the path, consider using [segments] instead.\n             \n        Please decide if you need [rawSegments] or [segments] explicitly.\n        ", replaceWith = @yz.w0(expression = "rawSegments", imports = {}))
    public static /* synthetic */ void y() {
    }
}
