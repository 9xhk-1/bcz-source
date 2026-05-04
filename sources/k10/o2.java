package k10;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\ntypeOfImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 typeOfImpl.kt\nkotlin/reflect/jvm/internal/TypeOfImplKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,51:1\n1#2:52\n*E\n"})
/* loaded from: classes8.dex */
public final class o2 {
    @m80.k
    public static final h10.r a(@m80.k h10.r type) {
        kotlin.jvm.internal.g0.p(type, "type");
        e30.r0 D = ((kotlin.reflect.jvm.internal.r) type).D();
        if (!(D instanceof e30.c1)) {
            throw new IllegalArgumentException(("Non-simple type cannot be a mutable collection type: " + type).toString());
        }
        p10.d r11 = D.I0().r();
        p10.b bVar = r11 instanceof p10.b ? (p10.b) r11 : null;
        if (bVar != null) {
            e30.c1 c1Var = (e30.c1) D;
            e30.u1 o11 = d(bVar).o();
            kotlin.jvm.internal.g0.o(o11, "getTypeConstructor(...)");
            return new kotlin.reflect.jvm.internal.r(e30.u0.l(c1Var, null, o11, null, false, 26, null), null, 2, null);
        }
        throw new IllegalArgumentException("Non-class type cannot be a mutable collection type: " + type);
    }

    @m80.k
    public static final h10.r b(@m80.k h10.r type) {
        kotlin.jvm.internal.g0.p(type, "type");
        e30.r0 D = ((kotlin.reflect.jvm.internal.r) type).D();
        if (D instanceof e30.c1) {
            e30.c1 c1Var = (e30.c1) D;
            e30.u1 o11 = j30.e.o(D).G().o();
            kotlin.jvm.internal.g0.o(o11, "getTypeConstructor(...)");
            return new kotlin.reflect.jvm.internal.r(e30.u0.l(c1Var, null, o11, null, false, 26, null), null, 2, null);
        }
        throw new IllegalArgumentException(("Non-simple type cannot be a Nothing type: " + type).toString());
    }

    @m80.k
    public static final h10.r c(@m80.k h10.r lowerBound, @m80.k h10.r upperBound) {
        kotlin.jvm.internal.g0.p(lowerBound, "lowerBound");
        kotlin.jvm.internal.g0.p(upperBound, "upperBound");
        e30.r0 D = ((kotlin.reflect.jvm.internal.r) lowerBound).D();
        kotlin.jvm.internal.g0.n(D, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        e30.r0 D2 = ((kotlin.reflect.jvm.internal.r) upperBound).D();
        kotlin.jvm.internal.g0.n(D2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new kotlin.reflect.jvm.internal.r(e30.u0.e((e30.c1) D, (e30.c1) D2), null, 2, null);
    }

    public static final p10.b d(p10.b bVar) {
        n20.c p11 = o10.a.f75522a.p(u20.e.p(bVar));
        if (p11 != null) {
            p10.b o11 = u20.e.m(bVar).o(p11);
            kotlin.jvm.internal.g0.o(o11, "getBuiltInClassByFqName(...)");
            return o11;
        }
        throw new IllegalArgumentException("Not a readonly collection: " + bVar);
    }
}
