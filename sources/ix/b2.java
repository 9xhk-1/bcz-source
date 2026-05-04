package ix;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nURLBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 URLBuilder.kt\nio/ktor/http/URLBuilder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,325:1\n1557#2:326\n1628#2,3:327\n1557#2:330\n1628#2,3:331\n1557#2:334\n1628#2,3:335\n*S KotlinDebug\n*F\n+ 1 URLBuilder.kt\nio/ktor/http/URLBuilder\n*L\n71#1:326\n71#1:327,3\n74#1:330\n74#1:331,3\n76#1:334\n76#1:335,3\n*E\n"})
/* loaded from: classes8.dex */
public final class b2 {

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public static final a f62712k;

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public static final t2 f62713l;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public String f62714a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f62715b;

    /* renamed from: c, reason: collision with root package name */
    public int f62716c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public h2 f62717d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    public String f62718e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    public String f62719f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public String f62720g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public List<String> f62721h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public q1 f62722i;

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public q1 f62723j;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public a() {
        }
    }

    static {
        a aVar = new a(null);
        f62712k = aVar;
        f62713l = l2.f(c2.a(aVar));
    }

    public b2() {
        this(null, null, 0, null, null, null, null, null, false, 511, null);
    }

    public final void A(@m80.k List<String> value) {
        kotlin.jvm.internal.g0.p(value, "value");
        List<String> list = value;
        ArrayList arrayList = new ArrayList(a00.i0.d0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(f.t((String) it.next()));
        }
        this.f62721h = arrayList;
    }

    public final void B(int i11) {
        if (i11 >= 0 && i11 < 65536) {
            this.f62716c = i11;
            return;
        }
        throw new IllegalArgumentException(("Port must be between 0 and 65535, or 0 if not set. Provided: " + i11).toString());
    }

    public final void C(@m80.k h2 value) {
        kotlin.jvm.internal.g0.p(value, "value");
        this.f62717d = value;
    }

    public final void D(@m80.l h2 h2Var) {
        this.f62717d = h2Var;
    }

    public final void E(boolean z11) {
        this.f62715b = z11;
    }

    public final void F(@m80.l String str) {
        this.f62718e = str != null ? f.n(str, false, 1, null) : null;
    }

    public final void a() {
        if (this.f62714a.length() <= 0 && !kotlin.jvm.internal.g0.g(o().l(), "file")) {
            t2 t2Var = f62713l;
            this.f62714a = t2Var.u();
            if (this.f62717d == null) {
                this.f62717d = t2Var.B();
            }
            if (this.f62716c == 0) {
                B(t2Var.E());
            }
        }
    }

    @m80.k
    public final t2 b() {
        a();
        return new t2(this.f62717d, this.f62714a, this.f62716c, m(), this.f62723j.build(), i(), r(), l(), this.f62715b, c());
    }

    @m80.k
    public final String c() {
        Appendable l11;
        a();
        l11 = e2.l(this, new StringBuilder(256));
        String sb2 = ((StringBuilder) l11).toString();
        kotlin.jvm.internal.g0.o(sb2, "toString(...)");
        return sb2;
    }

    @m80.k
    public final String d() {
        return this.f62720g;
    }

    @m80.k
    public final q1 e() {
        return this.f62722i;
    }

    @m80.l
    public final String f() {
        return this.f62719f;
    }

    @m80.k
    public final List<String> g() {
        return this.f62721h;
    }

    @m80.l
    public final String h() {
        return this.f62718e;
    }

    @m80.k
    public final String i() {
        return f.k(this.f62720g, 0, 0, false, null, 15, null);
    }

    @m80.k
    public final String j() {
        return this.f62714a;
    }

    @m80.k
    public final q1 k() {
        return this.f62723j;
    }

    @m80.l
    public final String l() {
        String str = this.f62719f;
        if (str != null) {
            return f.i(str, 0, 0, null, 7, null);
        }
        return null;
    }

    @m80.k
    public final List<String> m() {
        List<String> list = this.f62721h;
        ArrayList arrayList = new ArrayList(a00.i0.d0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(f.i((String) it.next(), 0, 0, null, 7, null));
        }
        return arrayList;
    }

    public final int n() {
        return this.f62716c;
    }

    @m80.k
    public final h2 o() {
        h2 h2Var = this.f62717d;
        return h2Var == null ? h2.f62830c.c() : h2Var;
    }

    @m80.l
    public final h2 p() {
        return this.f62717d;
    }

    public final boolean q() {
        return this.f62715b;
    }

    @m80.l
    public final String r() {
        String str = this.f62718e;
        if (str != null) {
            return f.i(str, 0, 0, null, 7, null);
        }
        return null;
    }

    public final void s(@m80.k String str) {
        kotlin.jvm.internal.g0.p(str, "<set-?>");
        this.f62720g = str;
    }

    public final void t(@m80.k q1 value) {
        kotlin.jvm.internal.g0.p(value, "value");
        this.f62722i = value;
        this.f62723j = new u2(value);
    }

    @m80.k
    public String toString() {
        Appendable l11;
        l11 = e2.l(this, new StringBuilder(256));
        String sb2 = ((StringBuilder) l11).toString();
        kotlin.jvm.internal.g0.o(sb2, "toString(...)");
        return sb2;
    }

    public final void u(@m80.l String str) {
        this.f62719f = str;
    }

    public final void v(@m80.k List<String> list) {
        kotlin.jvm.internal.g0.p(list, "<set-?>");
        this.f62721h = list;
    }

    public final void w(@m80.l String str) {
        this.f62718e = str;
    }

    public final void x(@m80.k String value) {
        kotlin.jvm.internal.g0.p(value, "value");
        this.f62720g = f.v(value, false, false, null, 7, null);
    }

    public final void y(@m80.k String str) {
        kotlin.jvm.internal.g0.p(str, "<set-?>");
        this.f62714a = str;
    }

    public final void z(@m80.l String str) {
        this.f62719f = str != null ? f.n(str, false, 1, null) : null;
    }

    public b2(@m80.l h2 h2Var, @m80.k String host, int i11, @m80.l String str, @m80.l String str2, @m80.k List<String> pathSegments, @m80.k p1 parameters, @m80.k String fragment, boolean z11) {
        kotlin.jvm.internal.g0.p(host, "host");
        kotlin.jvm.internal.g0.p(pathSegments, "pathSegments");
        kotlin.jvm.internal.g0.p(parameters, "parameters");
        kotlin.jvm.internal.g0.p(fragment, "fragment");
        this.f62714a = host;
        this.f62715b = z11;
        this.f62716c = i11;
        this.f62717d = h2Var;
        this.f62718e = str != null ? f.n(str, false, 1, null) : null;
        this.f62719f = str2 != null ? f.n(str2, false, 1, null) : null;
        this.f62720g = f.v(fragment, false, false, null, 7, null);
        List<String> list = pathSegments;
        ArrayList arrayList = new ArrayList(a00.i0.d0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(f.t((String) it.next()));
        }
        this.f62721h = arrayList;
        q1 e11 = v2.e(parameters);
        this.f62722i = e11;
        this.f62723j = new u2(e11);
    }

    public /* synthetic */ b2(h2 h2Var, String str, int i11, String str2, String str3, List list, p1 p1Var, String str4, boolean z11, int i12, kotlin.jvm.internal.v vVar) {
        this((i12 & 1) != 0 ? null : h2Var, (i12 & 2) != 0 ? "" : str, (i12 & 4) != 0 ? 0 : i11, (i12 & 8) != 0 ? null : str2, (i12 & 16) != 0 ? null : str3, (i12 & 32) != 0 ? a00.h0.J() : list, (i12 & 64) != 0 ? p1.f62972b.b() : p1Var, (i12 & 128) != 0 ? "" : str4, (i12 & 256) != 0 ? false : z11);
    }
}
