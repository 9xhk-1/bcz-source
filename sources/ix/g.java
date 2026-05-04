package ix;

import ix.o0;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class g extends o0 {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final a f62782d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final g f62783e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final g f62784f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final g f62785g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public static final g f62786h;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nContentDisposition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentDisposition.kt\nio/ktor/http/ContentDisposition$Companion\n+ 2 HeaderValueWithParameters.kt\nio/ktor/http/HeaderValueWithParameters$Companion\n*L\n1#1,103:1\n63#2,2:104\n*S KotlinDebug\n*F\n+ 1 ContentDisposition.kt\nio/ktor/http/ContentDisposition$Companion\n*L\n76#1:104,2\n*E\n"})
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final g a() {
            return g.f62785g;
        }

        @m80.k
        public final g b() {
            return g.f62783e;
        }

        @m80.k
        public final g c() {
            return g.f62786h;
        }

        @m80.k
        public final g d() {
            return g.f62784f;
        }

        @m80.k
        public final g e(@m80.k String value) {
            kotlin.jvm.internal.g0.p(value, "value");
            o0.a aVar = o0.f62966c;
            m0 m0Var = (m0) a00.r0.u3(x0.f(value));
            return new g(m0Var.g(), m0Var.e());
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final b f62787a = new b();

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public static final String f62788b = "filename";

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public static final String f62789c = "filename*";

        /* renamed from: d, reason: collision with root package name */
        @m80.k
        public static final String f62790d = "name";

        /* renamed from: e, reason: collision with root package name */
        @m80.k
        public static final String f62791e = "creation-date";

        /* renamed from: f, reason: collision with root package name */
        @m80.k
        public static final String f62792f = "modification-date";

        /* renamed from: g, reason: collision with root package name */
        @m80.k
        public static final String f62793g = "read-date";

        /* renamed from: h, reason: collision with root package name */
        @m80.k
        public static final String f62794h = "size";

        /* renamed from: i, reason: collision with root package name */
        @m80.k
        public static final String f62795i = "handling";
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i11 = 2;
        f62783e = new g("file", 0 == true ? 1 : 0, i11, 0 == true ? 1 : 0);
        f62784f = new g("mixed", 0 == true ? 1 : 0, i11, 0 == true ? 1 : 0);
        f62785g = new g("attachment", 0 == true ? 1 : 0, i11, 0 == true ? 1 : 0);
        f62786h = new g("inline", 0 == true ? 1 : 0, i11, 0 == true ? 1 : 0);
    }

    public /* synthetic */ g(String str, List list, int i11, kotlin.jvm.internal.v vVar) {
        this(str, (i11 & 2) != 0 ? a00.h0.J() : list);
    }

    public static /* synthetic */ g k(g gVar, String str, String str2, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        return gVar.j(str, str2, z11);
    }

    public boolean equals(@m80.l Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return kotlin.jvm.internal.g0.g(h(), gVar.h()) && kotlin.jvm.internal.g0.g(b(), gVar.b());
    }

    @m80.k
    public final String h() {
        return a();
    }

    public int hashCode() {
        return (h().hashCode() * 31) + b().hashCode();
    }

    @m80.l
    public final String i() {
        return c("name");
    }

    @m80.k
    public final g j(@m80.k String key, @m80.k String value, boolean z11) {
        kotlin.jvm.internal.g0.p(key, "key");
        kotlin.jvm.internal.g0.p(value, "value");
        if (z11) {
            value = h.b(key, value);
        }
        return new g(h(), a00.r0.J4(b(), new n0(key, value)));
    }

    @m80.k
    public final g l(@m80.k List<n0> newParameters) {
        kotlin.jvm.internal.g0.p(newParameters, "newParameters");
        return new g(h(), a00.r0.I4(b(), newParameters));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(@m80.k String disposition, @m80.k List<n0> parameters) {
        super(disposition, parameters);
        kotlin.jvm.internal.g0.p(disposition, "disposition");
        kotlin.jvm.internal.g0.p(parameters, "parameters");
    }
}
