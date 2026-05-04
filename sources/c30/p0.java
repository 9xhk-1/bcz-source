package c30;

import e30.c1;
import e30.e2;
import e30.f2;
import e30.v0;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import p10.b1;
import p10.g1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class p0 extends s10.g implements t {

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public final ProtoBuf.TypeAlias f7744k;

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public final k20.c f7745l;

    /* renamed from: m, reason: collision with root package name */
    @m80.k
    public final k20.g f7746m;

    /* renamed from: n, reason: collision with root package name */
    @m80.k
    public final k20.h f7747n;

    /* renamed from: o, reason: collision with root package name */
    @m80.l
    public final s f7748o;

    /* renamed from: p, reason: collision with root package name */
    public c1 f7749p;

    /* renamed from: q, reason: collision with root package name */
    public c1 f7750q;

    /* renamed from: r, reason: collision with root package name */
    public List<? extends p10.c1> f7751r;

    /* renamed from: s, reason: collision with root package name */
    public c1 f7752s;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p0(@m80.k d30.n r12, @m80.k p10.h r13, @m80.k q10.g r14, @m80.k n20.f r15, @m80.k p10.p r16, @m80.k kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias r17, @m80.k k20.c r18, @m80.k k20.g r19, @m80.k k20.h r20, @m80.l c30.s r21) {
        /*
            r11 = this;
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            java.lang.String r0 = "storageManager"
            kotlin.jvm.internal.g0.p(r12, r0)
            java.lang.String r0 = "containingDeclaration"
            kotlin.jvm.internal.g0.p(r13, r0)
            java.lang.String r0 = "annotations"
            kotlin.jvm.internal.g0.p(r14, r0)
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r15, r0)
            java.lang.String r0 = "visibility"
            r6 = r16
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "nameResolver"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "typeTable"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "versionRequirementTable"
            kotlin.jvm.internal.g0.p(r10, r0)
            p10.x0 r5 = p10.x0.f78622a
            java.lang.String r0 = "NO_SOURCE"
            kotlin.jvm.internal.g0.o(r5, r0)
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r11.f7744k = r7
            r11.f7745l = r8
            r11.f7746m = r9
            r11.f7747n = r10
            r1 = r21
            r11.f7748o = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c30.p0.<init>(d30.n, p10.h, q10.g, n20.f, p10.p, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias, k20.c, k20.g, k20.h, c30.s):void");
    }

    @Override // c30.t
    @m80.k
    public k20.g D() {
        return this.f7746m;
    }

    @Override // s10.g
    @m80.k
    public List<p10.c1> M0() {
        List list = this.f7751r;
        if (list != null) {
            return list;
        }
        kotlin.jvm.internal.g0.S("typeConstructorParameters");
        return null;
    }

    @Override // c30.t
    @m80.k
    /* renamed from: P0, reason: merged with bridge method [inline-methods] */
    public ProtoBuf.TypeAlias M() {
        return this.f7744k;
    }

    @m80.k
    public k20.h Q0() {
        return this.f7747n;
    }

    public final void R0(@m80.k List<? extends p10.c1> declaredTypeParameters, @m80.k c1 underlyingType, @m80.k c1 expandedType) {
        kotlin.jvm.internal.g0.p(declaredTypeParameters, "declaredTypeParameters");
        kotlin.jvm.internal.g0.p(underlyingType, "underlyingType");
        kotlin.jvm.internal.g0.p(expandedType, "expandedType");
        N0(declaredTypeParameters);
        this.f7749p = underlyingType;
        this.f7750q = expandedType;
        this.f7751r = g1.g(this);
        this.f7752s = H0();
    }

    @Override // p10.z0
    @m80.k
    /* renamed from: S0, reason: merged with bridge method [inline-methods] */
    public b1 c(@m80.k f2 substitutor) {
        kotlin.jvm.internal.g0.p(substitutor, "substitutor");
        if (substitutor.k()) {
            return this;
        }
        d30.n e02 = e0();
        p10.h b11 = b();
        kotlin.jvm.internal.g0.o(b11, "getContainingDeclaration(...)");
        q10.g annotations = getAnnotations();
        kotlin.jvm.internal.g0.o(annotations, "<get-annotations>(...)");
        n20.f name = getName();
        kotlin.jvm.internal.g0.o(name, "getName(...)");
        p0 p0Var = new p0(e02, b11, annotations, name, getVisibility(), M(), b0(), D(), Q0(), c0());
        List<p10.c1> t11 = t();
        c1 x02 = x0();
        Variance variance = Variance.INVARIANT;
        e30.r0 n11 = substitutor.n(x02, variance);
        kotlin.jvm.internal.g0.o(n11, "safeSubstitute(...)");
        c1 a11 = e2.a(n11);
        e30.r0 n12 = substitutor.n(a0(), variance);
        kotlin.jvm.internal.g0.o(n12, "safeSubstitute(...)");
        p0Var.R0(t11, a11, e2.a(n12));
        return p0Var;
    }

    @Override // p10.b1
    @m80.k
    public c1 a0() {
        c1 c1Var = this.f7750q;
        if (c1Var != null) {
            return c1Var;
        }
        kotlin.jvm.internal.g0.S("expandedType");
        return null;
    }

    @Override // c30.t
    @m80.k
    public k20.c b0() {
        return this.f7745l;
    }

    @Override // c30.t
    @m80.l
    public s c0() {
        return this.f7748o;
    }

    @Override // p10.b1
    @m80.l
    public p10.b l() {
        if (v0.a(a0())) {
            return null;
        }
        p10.d r11 = a0().I0().r();
        if (r11 instanceof p10.b) {
            return (p10.b) r11;
        }
        return null;
    }

    @Override // p10.d
    @m80.k
    public c1 s() {
        c1 c1Var = this.f7752s;
        if (c1Var != null) {
            return c1Var;
        }
        kotlin.jvm.internal.g0.S("defaultTypeImpl");
        return null;
    }

    @Override // p10.b1
    @m80.k
    public c1 x0() {
        c1 c1Var = this.f7749p;
        if (c1Var != null) {
            return c1Var;
        }
        kotlin.jvm.internal.g0.S("underlyingType");
        return null;
    }
}
