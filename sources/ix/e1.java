package ix;

import com.badlogic.gdx.Net;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class e1 {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final a f62753b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final e1 f62754c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final e1 f62755d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final e1 f62756e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final e1 f62757f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final e1 f62758g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public static final e1 f62759h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public static final e1 f62760i;

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public static final List<e1> f62761j;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f62762a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final List<e1> a() {
            return e1.f62761j;
        }

        @m80.k
        public final e1 b() {
            return e1.f62758g;
        }

        @m80.k
        public final e1 c() {
            return e1.f62754c;
        }

        @m80.k
        public final e1 d() {
            return e1.f62759h;
        }

        @m80.k
        public final e1 e() {
            return e1.f62760i;
        }

        @m80.k
        public final e1 f() {
            return e1.f62757f;
        }

        @m80.k
        public final e1 g() {
            return e1.f62755d;
        }

        @m80.k
        public final e1 h() {
            return e1.f62756e;
        }

        @m80.k
        public final e1 i(@m80.k String method) {
            kotlin.jvm.internal.g0.p(method, "method");
            return kotlin.jvm.internal.g0.g(method, c().l()) ? c() : kotlin.jvm.internal.g0.g(method, g().l()) ? g() : kotlin.jvm.internal.g0.g(method, h().l()) ? h() : kotlin.jvm.internal.g0.g(method, f().l()) ? f() : kotlin.jvm.internal.g0.g(method, b().l()) ? b() : kotlin.jvm.internal.g0.g(method, d().l()) ? d() : kotlin.jvm.internal.g0.g(method, e().l()) ? e() : new e1(method);
        }

        public a() {
        }
    }

    static {
        e1 e1Var = new e1("GET");
        f62754c = e1Var;
        e1 e1Var2 = new e1("POST");
        f62755d = e1Var2;
        e1 e1Var3 = new e1(Net.a.f11465d);
        f62756e = e1Var3;
        e1 e1Var4 = new e1("PATCH");
        f62757f = e1Var4;
        e1 e1Var5 = new e1(Net.a.f11467f);
        f62758g = e1Var5;
        e1 e1Var6 = new e1(Net.a.f11462a);
        f62759h = e1Var6;
        e1 e1Var7 = new e1("OPTIONS");
        f62760i = e1Var7;
        f62761j = a00.h0.Q(e1Var, e1Var2, e1Var3, e1Var4, e1Var5, e1Var6, e1Var7);
    }

    public e1(@m80.k String value) {
        kotlin.jvm.internal.g0.p(value, "value");
        this.f62762a = value;
    }

    public static /* synthetic */ e1 k(e1 e1Var, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = e1Var.f62762a;
        }
        return e1Var.j(str);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e1) && kotlin.jvm.internal.g0.g(this.f62762a, ((e1) obj).f62762a);
    }

    public int hashCode() {
        return this.f62762a.hashCode();
    }

    @m80.k
    public final String i() {
        return this.f62762a;
    }

    @m80.k
    public final e1 j(@m80.k String value) {
        kotlin.jvm.internal.g0.p(value, "value");
        return new e1(value);
    }

    @m80.k
    public final String l() {
        return this.f62762a;
    }

    @m80.k
    public String toString() {
        return "HttpMethod(value=" + this.f62762a + ')';
    }
}
