package my;

import a00.h0;
import a00.q;
import a00.r0;
import a00.w1;
import io.ktor.utils.io.c0;
import ix.e1;
import ix.k;
import ix.y0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import u30.f0;
import u30.k0;
import x00.l;
import xy.t;
import xy.w;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@c0
@u0({"SMAP\nCORSConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CORSConfig.kt\nio/ktor/server/plugins/cors/CORSConfig\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,266:1\n1#2:267\n*E\n"})
/* loaded from: classes8.dex */
public final class c {

    /* renamed from: l, reason: collision with root package name */
    @k
    public static final a f73851l;

    /* renamed from: m, reason: collision with root package name */
    public static final long f73852m = 86400;

    /* renamed from: n, reason: collision with root package name */
    @k
    public static final Set<e1> f73853n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public static final Set<String> f73854o;

    /* renamed from: p, reason: collision with root package name */
    @k
    public static final Set<String> f73855p;

    /* renamed from: q, reason: collision with root package name */
    @k
    public static final Set<ix.k> f73856q;

    /* renamed from: f, reason: collision with root package name */
    public boolean f73862f;

    /* renamed from: k, reason: collision with root package name */
    public boolean f73867k;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f73857a = "*.";

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Set<String> f73858b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Set<String> f73859c = new t();

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Set<e1> f73860d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Set<String> f73861e = new t();

    /* renamed from: g, reason: collision with root package name */
    @k
    public final List<l<String, Boolean>> f73863g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    @k
    public final List<l<String, Boolean>> f73864h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public long f73865i = 86400;

    /* renamed from: j, reason: collision with root package name */
    public boolean f73866j = true;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public final Set<String> b(String... strArr) {
            return new t(q.t(strArr));
        }

        @k
        public final Set<e1> c() {
            return c.f73853n;
        }

        @k
        public final Set<ix.k> d() {
            return c.f73856q;
        }

        @k
        public final Set<String> f() {
            return c.f73854o;
        }

        @k
        public final Set<String> g() {
            return c.f73855p;
        }

        public a() {
        }

        public static /* synthetic */ void e() {
        }
    }

    static {
        a aVar = new a(null);
        f73851l = aVar;
        e1.a aVar2 = e1.f62753b;
        f73853n = w1.u(aVar2.c(), aVar2.g(), aVar2.d());
        y0 y0Var = y0.f63006a;
        f73854o = aVar.b(y0Var.d(), y0Var.g(), y0Var.y(), y0Var.C());
        f73855p = aVar.b(y0Var.u(), y0Var.y(), y0Var.C(), y0Var.L(), y0Var.X(), y0Var.h0());
        f73856q = w.a(w1.u(k.a.f62847a.e(), k.g.f62893a.e(), k.h.f62902a.g()));
    }

    public static final int K(String str, final String str2) {
        return r0.H5(u30.r0.P9(str, str2.length(), 0, false, new l() { // from class: my.b
            @Override // x00.l
            public final Object invoke(Object obj) {
                int L;
                L = c.L(str2, (CharSequence) obj);
                return Integer.valueOf(L);
            }
        }, 6, null));
    }

    public static final int L(String str, CharSequence it) {
        g0.p(it, "it");
        return g0.g(it, str) ? 1 : 0;
    }

    public static final boolean k(String str, String name) {
        g0.p(name, "name");
        return f0.J2(name, str, false, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void m(c cVar, String str, List list, List list2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            list = h0.Q("http", "https");
        }
        if ((i11 & 4) != 0) {
            list2 = h0.J();
        }
        cVar.l(str, list, list2);
    }

    @m80.k
    public final Set<String> B() {
        return this.f73858b;
    }

    public final long C() {
        return this.f73865i;
    }

    @m80.k
    public final Set<e1> D() {
        return this.f73860d;
    }

    @m80.k
    public final List<l<String, Boolean>> E() {
        return this.f73863g;
    }

    public final void F(boolean z11) {
        this.f73862f = z11;
    }

    public final void G(boolean z11) {
        this.f73867k = z11;
    }

    public final void H(boolean z11) {
        this.f73866j = z11;
    }

    public final void I(long j11) {
        if (j11 >= 0) {
            this.f73865i = j11;
            return;
        }
        throw new IllegalStateException(("maxAgeInSeconds shouldn't be negative: " + j11).toString());
    }

    public final void J(String str) {
        if (k0.m3(str, '*', false, 2, null)) {
            if (!M(str)) {
                throw new IllegalArgumentException("wildcard must appear in front of the domain, e.g. *.domain.com");
            }
            if (K(str, this.f73857a) != 1) {
                throw new IllegalArgumentException("wildcard cannot appear more than once");
            }
        }
    }

    public final boolean M(String str) {
        return k0.n3(str, this.f73857a, false, 2, null) && !f0.b2(str, this.f73857a, false, 2, null) && (k0.J3(str, this.f73857a, 0, false, 6, null) <= 0 || f0.b2(k0.U5(str, this.f73857a, null, 2, null), "://", false, 2, null));
    }

    public final void g(String str) {
        J(str);
        this.f73858b.add(str);
    }

    public final void h(@m80.k String header) {
        g0.p(header, "header");
        if (f0.c2(header, y0.f63006a.C(), true)) {
            this.f73867k = true;
        } else {
            if (f73854o.contains(header)) {
                return;
            }
            this.f73859c.add(header);
        }
    }

    public final void i(@m80.k l<? super String, Boolean> predicate) {
        g0.p(predicate, "predicate");
        this.f73864h.add(predicate);
    }

    public final void j(@m80.k String headerPrefix) {
        g0.p(headerPrefix, "headerPrefix");
        final String lowerCase = headerPrefix.toLowerCase(Locale.ROOT);
        g0.o(lowerCase, "toLowerCase(...)");
        this.f73864h.add(new l() { // from class: my.a
            @Override // x00.l
            public final Object invoke(Object obj) {
                boolean k11;
                k11 = c.k(lowerCase, (String) obj);
                return Boolean.valueOf(k11);
            }
        });
    }

    public final void l(@m80.k String host, @m80.k List<String> schemes, @m80.k List<String> subDomains) {
        g0.p(host, "host");
        g0.p(schemes, "schemes");
        g0.p(subDomains, "subDomains");
        if (g0.g(host, "*")) {
            q();
            return;
        }
        if (k0.n3(host, "://", false, 2, null)) {
            throw new IllegalArgumentException("scheme should be specified as a separate parameter schemes");
        }
        for (String str : schemes) {
            g(str + "://" + host);
            for (String str2 : subDomains) {
                J(str2);
                g(str + "://" + str2 + '.' + host);
            }
        }
    }

    public final void n(@m80.k e1 method) {
        g0.p(method, "method");
        if (f73853n.contains(method)) {
            return;
        }
        this.f73860d.add(method);
    }

    public final void o(@m80.k l<? super String, Boolean> predicate) {
        g0.p(predicate, "predicate");
        this.f73863g.add(predicate);
    }

    public final void p() {
        h(y0.f63006a.W0());
    }

    public final void q() {
        this.f73858b.add("*");
    }

    public final void r() {
        this.f73860d.addAll(e1.f62753b.a());
    }

    public final void s(@m80.k String header) {
        g0.p(header, "header");
        if (f73855p.contains(header)) {
            return;
        }
        this.f73861e.add(header);
    }

    public final boolean t() {
        return this.f73862f;
    }

    public final boolean u() {
        return this.f73867k;
    }

    public final boolean v() {
        return this.f73866j;
    }

    @m80.k
    public final Set<String> w() {
        return this.f73861e;
    }

    @m80.k
    public final List<l<String, Boolean>> y() {
        return this.f73864h;
    }

    @m80.k
    public final Set<String> z() {
        return this.f73859c;
    }

    public static /* synthetic */ void A() {
    }

    public static /* synthetic */ void x() {
    }
}
