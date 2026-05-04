package e30;

import kotlin.NoWhenBranchMatchedException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nflexibleTypes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 flexibleTypes.kt\norg/jetbrains/kotlin/types/FlexibleTypeImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,174:1\n1#2:175\n*E\n"})
/* loaded from: classes8.dex */
public final class j0 extends i0 implements v {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final a f48608e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    public static boolean f48609f;

    /* renamed from: d, reason: collision with root package name */
    public boolean f48610d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(@m80.k c1 lowerBound, @m80.k c1 upperBound) {
        super(lowerBound, upperBound);
        kotlin.jvm.internal.g0.p(lowerBound, "lowerBound");
        kotlin.jvm.internal.g0.p(upperBound, "upperBound");
    }

    @Override // e30.v
    @m80.k
    public r0 C(@m80.k r0 replacement) {
        k2 e11;
        kotlin.jvm.internal.g0.p(replacement, "replacement");
        k2 L0 = replacement.L0();
        if (L0 instanceof i0) {
            e11 = L0;
        } else {
            if (!(L0 instanceof c1)) {
                throw new NoWhenBranchMatchedException();
            }
            c1 c1Var = (c1) L0;
            e11 = u0.e(c1Var, c1Var.M0(true));
        }
        return j2.b(e11, L0);
    }

    @Override // e30.v
    public boolean E0() {
        return (Q0().I0().r() instanceof p10.c1) && kotlin.jvm.internal.g0.g(Q0().I0(), R0().I0());
    }

    @Override // e30.k2
    @m80.k
    public k2 M0(boolean z11) {
        return u0.e(Q0().M0(z11), R0().M0(z11));
    }

    @Override // e30.k2
    @m80.k
    public k2 O0(@m80.k r1 newAttributes) {
        kotlin.jvm.internal.g0.p(newAttributes, "newAttributes");
        return u0.e(Q0().O0(newAttributes), R0().O0(newAttributes));
    }

    @Override // e30.i0
    @m80.k
    public c1 P0() {
        U0();
        return Q0();
    }

    @Override // e30.i0
    @m80.k
    public String S0(@m80.k p20.m renderer, @m80.k p20.u options) {
        kotlin.jvm.internal.g0.p(renderer, "renderer");
        kotlin.jvm.internal.g0.p(options, "options");
        if (!options.d()) {
            return renderer.T(renderer.W(Q0()), renderer.W(R0()), j30.e.o(this));
        }
        return '(' + renderer.W(Q0()) + zr.m.f102856e + renderer.W(R0()) + ')';
    }

    @Override // e30.k2
    @m80.k
    /* renamed from: T0, reason: merged with bridge method [inline-methods] */
    public i0 S0(@m80.k f30.g kotlinTypeRefiner) {
        kotlin.jvm.internal.g0.p(kotlinTypeRefiner, "kotlinTypeRefiner");
        r0 a11 = kotlinTypeRefiner.a(Q0());
        kotlin.jvm.internal.g0.n(a11, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        r0 a12 = kotlinTypeRefiner.a(R0());
        kotlin.jvm.internal.g0.n(a12, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new j0((c1) a11, (c1) a12);
    }

    public final void U0() {
        if (!f48609f || this.f48610d) {
            return;
        }
        this.f48610d = true;
        l0.b(Q0());
        l0.b(R0());
        kotlin.jvm.internal.g0.g(Q0(), R0());
        f30.e.f50430a.a(Q0(), R0());
    }

    @Override // e30.i0
    @m80.k
    public String toString() {
        return '(' + Q0() + zr.m.f102856e + R0() + ')';
    }
}
