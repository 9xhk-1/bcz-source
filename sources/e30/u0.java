package e30;

import e30.o1;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nKotlinTypeFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KotlinTypeFactory.kt\norg/jetbrains/kotlin/types/KotlinTypeFactory\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,276:1\n1#2:277\n*E\n"})
/* loaded from: classes8.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final u0 f48669a = new u0();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final x00.l<f30.g, c1> f48670b = a.f48671a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements x00.l {

        /* renamed from: a, reason: collision with root package name */
        public static final a f48671a = new a();

        @Override // x00.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(f30.g gVar) {
            kotlin.jvm.internal.g0.p(gVar, "<unused var>");
            return null;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public final c1 f48672a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public final u1 f48673b;

        public b(@m80.l c1 c1Var, @m80.l u1 u1Var) {
            this.f48672a = c1Var;
            this.f48673b = u1Var;
        }

        @m80.l
        public final c1 a() {
            return this.f48672a;
        }

        @m80.l
        public final u1 b() {
            return this.f48673b;
        }
    }

    @w00.o
    @m80.k
    public static final c1 c(@m80.k p10.b1 b1Var, @m80.k List<? extends a2> arguments) {
        kotlin.jvm.internal.g0.p(b1Var, "<this>");
        kotlin.jvm.internal.g0.p(arguments, "arguments");
        return new m1(o1.a.f48644a, false).i(n1.f48631e.a(null, b1Var, arguments), r1.f48652b.j());
    }

    @w00.o
    @m80.k
    public static final k2 e(@m80.k c1 lowerBound, @m80.k c1 upperBound) {
        kotlin.jvm.internal.g0.p(lowerBound, "lowerBound");
        kotlin.jvm.internal.g0.p(upperBound, "upperBound");
        return kotlin.jvm.internal.g0.g(lowerBound, upperBound) ? lowerBound : new j0(lowerBound, upperBound);
    }

    @w00.o
    @m80.k
    public static final c1 f(@m80.k r1 attributes, @m80.k s20.q constructor, boolean z11) {
        kotlin.jvm.internal.g0.p(attributes, "attributes");
        kotlin.jvm.internal.g0.p(constructor, "constructor");
        return o(attributes, constructor, a00.h0.J(), z11, g30.i.a(ErrorScopeKind.INTEGER_LITERAL_TYPE_SCOPE, true, "unknown integer literal type"));
    }

    @w00.o
    @m80.k
    public static final c1 h(@m80.k r1 attributes, @m80.k p10.b descriptor, @m80.k List<? extends a2> arguments) {
        kotlin.jvm.internal.g0.p(attributes, "attributes");
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        kotlin.jvm.internal.g0.p(arguments, "arguments");
        u1 o11 = descriptor.o();
        kotlin.jvm.internal.g0.o(o11, "getTypeConstructor(...)");
        return m(attributes, o11, arguments, false, null, 16, null);
    }

    @w00.o
    @m80.k
    public static final c1 i(@m80.k c1 baseType, @m80.k r1 annotations, @m80.k u1 constructor, @m80.k List<? extends a2> arguments, boolean z11) {
        kotlin.jvm.internal.g0.p(baseType, "baseType");
        kotlin.jvm.internal.g0.p(annotations, "annotations");
        kotlin.jvm.internal.g0.p(constructor, "constructor");
        kotlin.jvm.internal.g0.p(arguments, "arguments");
        return m(annotations, constructor, arguments, z11, null, 16, null);
    }

    @w00.k
    @w00.o
    @m80.k
    public static final c1 j(@m80.k r1 attributes, @m80.k u1 constructor, @m80.k List<? extends a2> arguments, boolean z11) {
        kotlin.jvm.internal.g0.p(attributes, "attributes");
        kotlin.jvm.internal.g0.p(constructor, "constructor");
        kotlin.jvm.internal.g0.p(arguments, "arguments");
        return m(attributes, constructor, arguments, z11, null, 16, null);
    }

    @w00.k
    @w00.o
    @m80.k
    public static final c1 k(@m80.k r1 attributes, @m80.k u1 constructor, @m80.k List<? extends a2> arguments, boolean z11, @m80.l f30.g gVar) {
        kotlin.jvm.internal.g0.p(attributes, "attributes");
        kotlin.jvm.internal.g0.p(constructor, "constructor");
        kotlin.jvm.internal.g0.p(arguments, "arguments");
        if (!attributes.isEmpty() || !arguments.isEmpty() || z11 || constructor.r() == null) {
            return p(attributes, constructor, arguments, z11, f48669a.d(constructor, arguments, gVar), new s0(constructor, arguments, attributes, z11));
        }
        p10.d r11 = constructor.r();
        kotlin.jvm.internal.g0.m(r11);
        c1 s11 = r11.s();
        kotlin.jvm.internal.g0.o(s11, "getDefaultType(...)");
        return s11;
    }

    public static /* synthetic */ c1 l(c1 c1Var, r1 r1Var, u1 u1Var, List list, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            r1Var = c1Var.H0();
        }
        if ((i11 & 4) != 0) {
            u1Var = c1Var.I0();
        }
        if ((i11 & 8) != 0) {
            list = c1Var.G0();
        }
        if ((i11 & 16) != 0) {
            z11 = c1Var.J0();
        }
        return i(c1Var, r1Var, u1Var, list, z11);
    }

    public static /* synthetic */ c1 m(r1 r1Var, u1 u1Var, List list, boolean z11, f30.g gVar, int i11, Object obj) {
        if ((i11 & 16) != 0) {
            gVar = null;
        }
        return k(r1Var, u1Var, list, z11, gVar);
    }

    public static final c1 n(u1 u1Var, List list, r1 r1Var, boolean z11, f30.g refiner) {
        kotlin.jvm.internal.g0.p(refiner, "refiner");
        b g11 = f48669a.g(u1Var, refiner, list);
        if (g11 == null) {
            return null;
        }
        c1 a11 = g11.a();
        if (a11 != null) {
            return a11;
        }
        u1 b11 = g11.b();
        kotlin.jvm.internal.g0.m(b11);
        return k(r1Var, b11, list, z11, refiner);
    }

    @w00.o
    @m80.k
    public static final c1 o(@m80.k r1 attributes, @m80.k u1 constructor, @m80.k List<? extends a2> arguments, boolean z11, @m80.k x20.k memberScope) {
        kotlin.jvm.internal.g0.p(attributes, "attributes");
        kotlin.jvm.internal.g0.p(constructor, "constructor");
        kotlin.jvm.internal.g0.p(arguments, "arguments");
        kotlin.jvm.internal.g0.p(memberScope, "memberScope");
        d1 d1Var = new d1(constructor, arguments, z11, memberScope, new t0(constructor, arguments, attributes, z11, memberScope));
        return attributes.isEmpty() ? d1Var : new e1(d1Var, attributes);
    }

    @w00.o
    @m80.k
    public static final c1 p(@m80.k r1 attributes, @m80.k u1 constructor, @m80.k List<? extends a2> arguments, boolean z11, @m80.k x20.k memberScope, @m80.k x00.l<? super f30.g, ? extends c1> refinedTypeFactory) {
        kotlin.jvm.internal.g0.p(attributes, "attributes");
        kotlin.jvm.internal.g0.p(constructor, "constructor");
        kotlin.jvm.internal.g0.p(arguments, "arguments");
        kotlin.jvm.internal.g0.p(memberScope, "memberScope");
        kotlin.jvm.internal.g0.p(refinedTypeFactory, "refinedTypeFactory");
        d1 d1Var = new d1(constructor, arguments, z11, memberScope, refinedTypeFactory);
        return attributes.isEmpty() ? d1Var : new e1(d1Var, attributes);
    }

    public static final c1 q(u1 u1Var, List list, r1 r1Var, boolean z11, x20.k kVar, f30.g kotlinTypeRefiner) {
        kotlin.jvm.internal.g0.p(kotlinTypeRefiner, "kotlinTypeRefiner");
        b g11 = f48669a.g(u1Var, kotlinTypeRefiner, list);
        if (g11 == null) {
            return null;
        }
        c1 a11 = g11.a();
        if (a11 != null) {
            return a11;
        }
        u1 b11 = g11.b();
        kotlin.jvm.internal.g0.m(b11);
        return o(r1Var, b11, list, z11, kVar);
    }

    public final x20.k d(u1 u1Var, List<? extends a2> list, f30.g gVar) {
        p10.d r11 = u1Var.r();
        if (r11 instanceof p10.c1) {
            return ((p10.c1) r11).s().r();
        }
        if (r11 instanceof p10.b) {
            if (gVar == null) {
                gVar = u20.e.r(u20.e.s(r11));
            }
            return list.isEmpty() ? s10.a0.b((p10.b) r11, gVar) : s10.a0.a((p10.b) r11, v1.f48674c.b(u1Var, list), gVar);
        }
        if (r11 instanceof p10.b1) {
            return g30.i.a(ErrorScopeKind.SCOPE_FOR_ABBREVIATION_TYPE, true, ((p10.b1) r11).getName().toString());
        }
        if (u1Var instanceof q0) {
            return ((q0) u1Var).h();
        }
        throw new IllegalStateException("Unsupported classifier: " + r11 + " for constructor: " + u1Var);
    }

    public final b g(u1 u1Var, f30.g gVar, List<? extends a2> list) {
        p10.d f11;
        p10.d r11 = u1Var.r();
        if (r11 == null || (f11 = gVar.f(r11)) == null) {
            return null;
        }
        if (f11 instanceof p10.b1) {
            return new b(c((p10.b1) f11, list), null);
        }
        u1 d11 = f11.o().d(gVar);
        kotlin.jvm.internal.g0.o(d11, "refine(...)");
        return new b(null, d11);
    }
}
