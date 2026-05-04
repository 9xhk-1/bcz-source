package s20;

import e30.a2;
import e30.c2;
import e30.r0;
import e30.r1;
import e30.u0;
import e30.v0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.g0;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import n10.o;
import n20.b;
import p10.c1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class t extends g<b> {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final a f87465b = new a(null);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.l
        public final g<?> a(@m80.k r0 argumentType) {
            g0.p(argumentType, "argumentType");
            if (v0.a(argumentType)) {
                return null;
            }
            r0 r0Var = argumentType;
            int i11 = 0;
            while (n10.j.c0(r0Var)) {
                r0Var = ((a2) a00.r0.m5(r0Var.G0())).getType();
                i11++;
            }
            p10.d r11 = r0Var.I0().r();
            if (r11 instanceof p10.b) {
                n20.b n11 = u20.e.n(r11);
                return n11 == null ? new t(new b.a(argumentType)) : new t(n11, i11);
            }
            if (!(r11 instanceof c1)) {
                return null;
            }
            b.a aVar = n20.b.f74280d;
            n20.c l11 = o.a.f74031b.l();
            g0.o(l11, "toSafe(...)");
            return new t(aVar.c(l11), 0);
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class b {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            @m80.k
            public final r0 f87466a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@m80.k r0 type) {
                super(null);
                g0.p(type, "type");
                this.f87466a = type;
            }

            @m80.k
            public final r0 a() {
                return this.f87466a;
            }

            public boolean equals(@m80.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && g0.g(this.f87466a, ((a) obj).f87466a);
            }

            public int hashCode() {
                return this.f87466a.hashCode();
            }

            @m80.k
            public String toString() {
                return "LocalClass(type=" + this.f87466a + ')';
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: s20.t$b$b, reason: collision with other inner class name */
        public static final class C1127b extends b {

            /* renamed from: a, reason: collision with root package name */
            @m80.k
            public final f f87467a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1127b(@m80.k f value) {
                super(null);
                g0.p(value, "value");
                this.f87467a = value;
            }

            public final int a() {
                return this.f87467a.c();
            }

            @m80.k
            public final n20.b b() {
                return this.f87467a.d();
            }

            @m80.k
            public final f c() {
                return this.f87467a;
            }

            public boolean equals(@m80.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1127b) && g0.g(this.f87467a, ((C1127b) obj).f87467a);
            }

            public int hashCode() {
                return this.f87467a.hashCode();
            }

            @m80.k
            public String toString() {
                return "NormalClass(value=" + this.f87467a + ')';
            }
        }

        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(@m80.k b value) {
        super(value);
        g0.p(value, "value");
    }

    @Override // s20.g
    @m80.k
    public r0 a(@m80.k p10.a0 module) {
        g0.p(module, "module");
        r1 j11 = r1.f48652b.j();
        p10.b E = module.q().E();
        g0.o(E, "getKClass(...)");
        return u0.h(j11, E, a00.g0.l(new c2(c(module))));
    }

    @m80.k
    public final r0 c(@m80.k p10.a0 module) {
        g0.p(module, "module");
        b b11 = b();
        if (b11 instanceof b.a) {
            return ((b.a) b()).a();
        }
        if (!(b11 instanceof b.C1127b)) {
            throw new NoWhenBranchMatchedException();
        }
        f c11 = ((b.C1127b) b()).c();
        n20.b a11 = c11.a();
        int b12 = c11.b();
        p10.b b13 = p10.t.b(module, a11);
        if (b13 == null) {
            return g30.i.d(ErrorTypeKind.UNRESOLVED_KCLASS_CONSTANT_VALUE, a11.toString(), String.valueOf(b12));
        }
        e30.c1 s11 = b13.s();
        g0.o(s11, "getDefaultType(...)");
        r0 E = j30.e.E(s11);
        for (int i11 = 0; i11 < b12; i11++) {
            E = module.q().l(Variance.INVARIANT, E);
        }
        return E;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t(@m80.k f value) {
        this(new b.C1127b(value));
        g0.p(value, "value");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t(@m80.k n20.b classId, int i11) {
        this(new f(classId, i11));
        g0.p(classId, "classId");
    }
}
