package ix;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nURLProtocol.kt\nKotlin\n*S Kotlin\n*F\n+ 1 URLProtocol.kt\nio/ktor/http/URLProtocol\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,69:1\n1069#2,2:70\n1#3:72\n1202#4,2:73\n1230#4,4:75\n*S KotlinDebug\n*F\n+ 1 URLProtocol.kt\nio/ktor/http/URLProtocol\n*L\n16#1:70,2\n49#1:73,2\n49#1:75,4\n*E\n"})
/* loaded from: classes8.dex */
public final class h2 {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final a f62830c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final h2 f62831d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final h2 f62832e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final h2 f62833f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final h2 f62834g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public static final h2 f62835h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public static final Map<String, h2> f62836i;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f62837a;

    /* renamed from: b, reason: collision with root package name */
    public final int f62838b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final h2 a(@m80.k String name) {
            kotlin.jvm.internal.g0.p(name, "name");
            String e11 = xy.e2.e(name);
            h2 h2Var = h2.f62830c.b().get(e11);
            return h2Var == null ? new h2(e11, 0) : h2Var;
        }

        @m80.k
        public final Map<String, h2> b() {
            return h2.f62836i;
        }

        @m80.k
        public final h2 c() {
            return h2.f62831d;
        }

        @m80.k
        public final h2 d() {
            return h2.f62832e;
        }

        @m80.k
        public final h2 e() {
            return h2.f62835h;
        }

        @m80.k
        public final h2 f() {
            return h2.f62833f;
        }

        @m80.k
        public final h2 g() {
            return h2.f62834g;
        }

        public a() {
        }
    }

    static {
        h2 h2Var = new h2("http", 80);
        f62831d = h2Var;
        h2 h2Var2 = new h2("https", 443);
        f62832e = h2Var2;
        h2 h2Var3 = new h2("ws", 80);
        f62833f = h2Var3;
        h2 h2Var4 = new h2("wss", 443);
        f62834g = h2Var4;
        h2 h2Var5 = new h2("socks", pd.a.f80340j);
        f62835h = h2Var5;
        List Q = a00.h0.Q(h2Var, h2Var2, h2Var3, h2Var4, h2Var5);
        LinkedHashMap linkedHashMap = new LinkedHashMap(g10.u.u(a00.k1.j(a00.i0.d0(Q, 10)), 16));
        for (Object obj : Q) {
            linkedHashMap.put(((h2) obj).f62837a, obj);
        }
        f62836i = linkedHashMap;
    }

    public h2(@m80.k String name, int i11) {
        kotlin.jvm.internal.g0.p(name, "name");
        this.f62837a = name;
        this.f62838b = i11;
        for (int i12 = 0; i12 < name.length(); i12++) {
            if (!xy.v.a(name.charAt(i12))) {
                throw new IllegalArgumentException("All characters should be lower case");
            }
        }
    }

    public static /* synthetic */ h2 j(h2 h2Var, String str, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = h2Var.f62837a;
        }
        if ((i12 & 2) != 0) {
            i11 = h2Var.f62838b;
        }
        return h2Var.i(str, i11);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h2)) {
            return false;
        }
        h2 h2Var = (h2) obj;
        return kotlin.jvm.internal.g0.g(this.f62837a, h2Var.f62837a) && this.f62838b == h2Var.f62838b;
    }

    @m80.k
    public final String g() {
        return this.f62837a;
    }

    public final int h() {
        return this.f62838b;
    }

    public int hashCode() {
        return (this.f62837a.hashCode() * 31) + Integer.hashCode(this.f62838b);
    }

    @m80.k
    public final h2 i(@m80.k String name, int i11) {
        kotlin.jvm.internal.g0.p(name, "name");
        return new h2(name, i11);
    }

    public final int k() {
        return this.f62838b;
    }

    @m80.k
    public final String l() {
        return this.f62837a;
    }

    @m80.k
    public String toString() {
        return "URLProtocol(name=" + this.f62837a + ", defaultPort=" + this.f62838b + ')';
    }
}
