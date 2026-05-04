package r20;

import a00.h0;
import e30.a2;
import e30.r0;
import f30.g;
import f30.n;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import m80.k;
import m80.l;
import n10.j;
import p10.c1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final a2 f82876a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public n f82877b;

    public c(@k a2 projection) {
        g0.p(projection, "projection");
        this.f82876a = projection;
        b().b();
        Variance variance = Variance.INVARIANT;
    }

    @Override // r20.b
    @k
    public a2 b() {
        return this.f82876a;
    }

    @Override // e30.u1
    @k
    public Collection<r0> c() {
        r0 type = b().b() == Variance.OUT_VARIANCE ? b().getType() : q().I();
        g0.m(type);
        return a00.g0.l(type);
    }

    @l
    public Void e() {
        return null;
    }

    @l
    public final n f() {
        return this.f82877b;
    }

    @Override // e30.u1
    @k
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public c d(@k g kotlinTypeRefiner) {
        g0.p(kotlinTypeRefiner, "kotlinTypeRefiner");
        a2 d11 = b().d(kotlinTypeRefiner);
        g0.o(d11, "refine(...)");
        return new c(d11);
    }

    @Override // e30.u1
    @k
    public List<c1> getParameters() {
        return h0.J();
    }

    public final void h(@l n nVar) {
        this.f82877b = nVar;
    }

    @Override // e30.u1
    @k
    public j q() {
        j q11 = b().getType().I0().q();
        g0.o(q11, "getBuiltIns(...)");
        return q11;
    }

    @Override // e30.u1
    public /* bridge */ /* synthetic */ p10.d r() {
        return (p10.d) e();
    }

    @Override // e30.u1
    public boolean s() {
        return false;
    }

    @k
    public String toString() {
        return "CapturedTypeConstructor(" + b() + ')';
    }
}
