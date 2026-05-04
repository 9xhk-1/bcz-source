package ku;

import com.huawei.hms.framework.common.ContainerUtils;
import com.typesafe.config.ConfigException;
import com.typesafe.config.ConfigValueType;
import java.util.Iterator;
import java.util.List;
import ku.j0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class e2 {

    /* renamed from: a, reason: collision with root package name */
    public static final b2 f68701a = b2.c(c2.START, "start of file", "");

    /* renamed from: b, reason: collision with root package name */
    public static final b2 f68702b = b2.c(c2.END, "end of file", "");

    /* renamed from: c, reason: collision with root package name */
    public static final b2 f68703c = b2.c(c2.COMMA, "','", ",");

    /* renamed from: d, reason: collision with root package name */
    public static final b2 f68704d = b2.c(c2.EQUALS, "'='", ContainerUtils.KEY_VALUE_DELIMITER);

    /* renamed from: e, reason: collision with root package name */
    public static final b2 f68705e = b2.c(c2.COLON, "':'", ":");

    /* renamed from: f, reason: collision with root package name */
    public static final b2 f68706f = b2.c(c2.OPEN_CURLY, "'{'", "{");

    /* renamed from: g, reason: collision with root package name */
    public static final b2 f68707g = b2.c(c2.CLOSE_CURLY, "'}'", com.alipay.sdk.m.u.i.f11099d);

    /* renamed from: h, reason: collision with root package name */
    public static final b2 f68708h = b2.c(c2.OPEN_SQUARE, "'['", "[");

    /* renamed from: i, reason: collision with root package name */
    public static final b2 f68709i = b2.c(c2.CLOSE_SQUARE, "']'", "]");

    /* renamed from: j, reason: collision with root package name */
    public static final b2 f68710j = b2.c(c2.PLUS_EQUALS, "'+='", "+=");

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class a extends b2 {

        /* renamed from: e, reason: collision with root package name */
        public final String f68711e;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: ku.e2$a$a, reason: collision with other inner class name */
        public static final class C0828a extends a {
            public C0828a(ju.m mVar, String str) {
                super(mVar, str);
            }

            @Override // ku.b2
            public String e() {
                return r60.e.f83301a + this.f68711e;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class b extends a {
            public b(ju.m mVar, String str) {
                super(mVar, str);
            }

            @Override // ku.b2
            public String e() {
                return "#" + this.f68711e;
            }
        }

        public a(ju.m mVar, String str) {
            super(c2.COMMENT, mVar);
            this.f68711e = str;
        }

        @Override // ku.b2
        public boolean a(Object obj) {
            return obj instanceof a;
        }

        @Override // ku.b2
        public boolean equals(Object obj) {
            return super.equals(obj) && ((a) obj).f68711e.equals(this.f68711e);
        }

        public String h() {
            return this.f68711e;
        }

        @Override // ku.b2
        public int hashCode() {
            return (((super.hashCode() + 41) * 41) + this.f68711e.hashCode()) * 41;
        }

        @Override // ku.b2
        public String toString() {
            return "'#" + this.f68711e + "' (COMMENT)";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b extends b2 {

        /* renamed from: e, reason: collision with root package name */
        public final String f68712e;

        public b(ju.m mVar, String str) {
            super(c2.IGNORED_WHITESPACE, mVar);
            this.f68712e = str;
        }

        @Override // ku.b2
        public boolean a(Object obj) {
            return obj instanceof b;
        }

        @Override // ku.b2
        public String e() {
            return this.f68712e;
        }

        @Override // ku.b2
        public boolean equals(Object obj) {
            return super.equals(obj) && ((b) obj).f68712e.equals(this.f68712e);
        }

        @Override // ku.b2
        public int hashCode() {
            return ((super.hashCode() + 41) * 41) + this.f68712e.hashCode();
        }

        @Override // ku.b2
        public String toString() {
            return "'" + this.f68712e + "' (WHITESPACE)";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c extends b2 {
        public c(ju.m mVar) {
            super(c2.NEWLINE, mVar);
        }

        @Override // ku.b2
        public boolean a(Object obj) {
            return obj instanceof c;
        }

        @Override // ku.b2
        public String e() {
            return "\n";
        }

        @Override // ku.b2
        public boolean equals(Object obj) {
            return super.equals(obj) && ((c) obj).b() == b();
        }

        @Override // ku.b2
        public int hashCode() {
            return ((super.hashCode() + 41) * 41) + b();
        }

        @Override // ku.b2
        public String toString() {
            return "'\\n'@" + b();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d extends b2 {

        /* renamed from: e, reason: collision with root package name */
        public final String f68713e;

        /* renamed from: f, reason: collision with root package name */
        public final String f68714f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f68715g;

        /* renamed from: h, reason: collision with root package name */
        public final Throwable f68716h;

        public d(ju.m mVar, String str, String str2, boolean z11, Throwable th2) {
            super(c2.PROBLEM, mVar);
            this.f68713e = str;
            this.f68714f = str2;
            this.f68715g = z11;
            this.f68716h = th2;
        }

        @Override // ku.b2
        public boolean a(Object obj) {
            return obj instanceof d;
        }

        @Override // ku.b2
        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            d dVar = (d) obj;
            return dVar.f68713e.equals(this.f68713e) && dVar.f68714f.equals(this.f68714f) && dVar.f68715g == this.f68715g && q.b(dVar.f68716h, this.f68716h);
        }

        public Throwable g() {
            return this.f68716h;
        }

        public String h() {
            return this.f68714f;
        }

        @Override // ku.b2
        public int hashCode() {
            int hashCode = (((((((super.hashCode() + 41) * 41) + this.f68713e.hashCode()) * 41) + this.f68714f.hashCode()) * 41) + Boolean.valueOf(this.f68715g).hashCode()) * 41;
            Throwable th2 = this.f68716h;
            return th2 != null ? (hashCode + th2.hashCode()) * 41 : hashCode;
        }

        public boolean i() {
            return this.f68715g;
        }

        public String j() {
            return this.f68713e;
        }

        @Override // ku.b2
        public String toString() {
            return '\'' + this.f68713e + "' (" + this.f68714f + pn.j.f81007d;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e extends b2 {

        /* renamed from: e, reason: collision with root package name */
        public final boolean f68717e;

        /* renamed from: f, reason: collision with root package name */
        public final List<b2> f68718f;

        public e(ju.m mVar, boolean z11, List<b2> list) {
            super(c2.SUBSTITUTION, mVar);
            this.f68717e = z11;
            this.f68718f = list;
        }

        @Override // ku.b2
        public boolean a(Object obj) {
            return obj instanceof e;
        }

        @Override // ku.b2
        public String e() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("${");
            sb2.append(this.f68717e ? "?" : "");
            sb2.append(d2.c(this.f68718f.iterator()));
            sb2.append(com.alipay.sdk.m.u.i.f11099d);
            return sb2.toString();
        }

        @Override // ku.b2
        public boolean equals(Object obj) {
            return super.equals(obj) && ((e) obj).f68718f.equals(this.f68718f);
        }

        public boolean g() {
            return this.f68717e;
        }

        public List<b2> h() {
            return this.f68718f;
        }

        @Override // ku.b2
        public int hashCode() {
            return ((super.hashCode() + 41) * 41) + this.f68718f.hashCode();
        }

        @Override // ku.b2
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            Iterator<b2> it = this.f68718f.iterator();
            while (it.hasNext()) {
                sb2.append(it.next().toString());
            }
            return "'${" + sb2.toString() + "}'";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class f extends b2 {

        /* renamed from: e, reason: collision with root package name */
        public final String f68719e;

        public f(ju.m mVar, String str) {
            super(c2.UNQUOTED_TEXT, mVar);
            this.f68719e = str;
        }

        @Override // ku.b2
        public boolean a(Object obj) {
            return obj instanceof f;
        }

        @Override // ku.b2
        public String e() {
            return this.f68719e;
        }

        @Override // ku.b2
        public boolean equals(Object obj) {
            return super.equals(obj) && ((f) obj).f68719e.equals(this.f68719e);
        }

        public String g() {
            return this.f68719e;
        }

        @Override // ku.b2
        public int hashCode() {
            return ((super.hashCode() + 41) * 41) + this.f68719e.hashCode();
        }

        @Override // ku.b2
        public String toString() {
            return "'" + this.f68719e + "'";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class g extends b2 {

        /* renamed from: e, reason: collision with root package name */
        public final ku.d f68720e;

        public g(ku.d dVar) {
            this(dVar, null);
        }

        @Override // ku.b2
        public boolean a(Object obj) {
            return obj instanceof g;
        }

        @Override // ku.b2
        public boolean equals(Object obj) {
            return super.equals(obj) && ((g) obj).f68720e.equals(this.f68720e);
        }

        public ku.d g() {
            return this.f68720e;
        }

        @Override // ku.b2
        public int hashCode() {
            return ((super.hashCode() + 41) * 41) + this.f68720e.hashCode();
        }

        @Override // ku.b2
        public String toString() {
            if (g().N0() != b1.RESOLVED) {
                return "'<unresolved value>' (" + this.f68720e.valueType().name() + pn.j.f81007d;
            }
            return "'" + g().c() + "' (" + this.f68720e.valueType().name() + pn.j.f81007d;
        }

        public g(ku.d dVar, String str) {
            super(c2.VALUE, dVar.g(), str);
            this.f68720e = dVar;
        }
    }

    public static b2 A(ju.m mVar, String str, String str2, boolean z11, Throwable th2) {
        return new d(mVar, str, str2, z11, th2);
    }

    public static b2 B(ju.m mVar, String str, String str2) {
        return F(new j0.a(mVar, str), str2);
    }

    public static b2 C(ju.m mVar, boolean z11, List<b2> list) {
        return new e(mVar, z11, list);
    }

    public static b2 D(ju.m mVar, String str) {
        return new f(mVar, str);
    }

    public static b2 E(ku.d dVar) {
        return new g(dVar);
    }

    public static b2 F(ku.d dVar, String str) {
        return new g(dVar, str);
    }

    public static String a(b2 b2Var) {
        if (b2Var instanceof a) {
            return ((a) b2Var).h();
        }
        throw new ConfigException.BugOrBroken("tried to get comment text from " + b2Var);
    }

    public static Throwable b(b2 b2Var) {
        if (b2Var instanceof d) {
            return ((d) b2Var).g();
        }
        throw new ConfigException.BugOrBroken("tried to get problem cause from " + b2Var);
    }

    public static String c(b2 b2Var) {
        if (b2Var instanceof d) {
            return ((d) b2Var).h();
        }
        throw new ConfigException.BugOrBroken("tried to get problem message from " + b2Var);
    }

    public static boolean d(b2 b2Var) {
        if (b2Var instanceof d) {
            return ((d) b2Var).i();
        }
        throw new ConfigException.BugOrBroken("tried to get problem suggestQuotes from " + b2Var);
    }

    public static String e(b2 b2Var) {
        if (b2Var instanceof d) {
            return ((d) b2Var).j();
        }
        throw new ConfigException.BugOrBroken("tried to get problem what from " + b2Var);
    }

    public static boolean f(b2 b2Var) {
        if (b2Var instanceof e) {
            return ((e) b2Var).g();
        }
        throw new ConfigException.BugOrBroken("tried to get substitution optionality from " + b2Var);
    }

    public static List<b2> g(b2 b2Var) {
        if (b2Var instanceof e) {
            return ((e) b2Var).h();
        }
        throw new ConfigException.BugOrBroken("tried to get substitution from " + b2Var);
    }

    public static String h(b2 b2Var) {
        if (b2Var instanceof f) {
            return ((f) b2Var).g();
        }
        throw new ConfigException.BugOrBroken("tried to get unquoted text from " + b2Var);
    }

    public static ku.d i(b2 b2Var) {
        if (b2Var instanceof g) {
            return ((g) b2Var).g();
        }
        throw new ConfigException.BugOrBroken("tried to get value of non-value token " + b2Var);
    }

    public static boolean j(b2 b2Var) {
        return b2Var instanceof a;
    }

    public static boolean k(b2 b2Var) {
        return b2Var instanceof b;
    }

    public static boolean l(b2 b2Var) {
        return b2Var instanceof c;
    }

    public static boolean m(b2 b2Var) {
        return b2Var instanceof d;
    }

    public static boolean n(b2 b2Var) {
        return b2Var instanceof e;
    }

    public static boolean o(b2 b2Var) {
        return b2Var instanceof f;
    }

    public static boolean p(b2 b2Var) {
        return b2Var instanceof g;
    }

    public static boolean q(b2 b2Var, ConfigValueType configValueType) {
        return p(b2Var) && i(b2Var).valueType() == configValueType;
    }

    public static b2 r(ju.m mVar, boolean z11) {
        return F(new h(mVar, z11), "" + z11);
    }

    public static b2 s(ju.m mVar, String str) {
        return new a.C0828a(mVar, str);
    }

    public static b2 t(ju.m mVar, String str) {
        return new a.b(mVar, str);
    }

    public static b2 u(ju.m mVar, double d11, String str) {
        return F(g0.Y0(mVar, d11, str), str);
    }

    public static b2 v(ju.m mVar, String str) {
        return new b(mVar, str);
    }

    public static b2 w(ju.m mVar, int i11, String str) {
        return F(g0.Z0(mVar, i11, str), str);
    }

    public static b2 x(ju.m mVar) {
        return new c(mVar);
    }

    public static b2 y(ju.m mVar, long j11, String str) {
        return F(g0.Z0(mVar, j11, str), str);
    }

    public static b2 z(ju.m mVar) {
        return F(new f0(mVar), "null");
    }
}
