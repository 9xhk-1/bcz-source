package r20;

import a00.h0;
import e30.a2;
import e30.c1;
import e30.r1;
import f30.g;
import g30.i;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a extends c1 implements i30.b {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final a2 f82872b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final b f82873c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f82874d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final r1 f82875e;

    public /* synthetic */ a(a2 a2Var, b bVar, boolean z11, r1 r1Var, int i11, v vVar) {
        this(a2Var, (i11 & 2) != 0 ? new c(a2Var) : bVar, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? r1.f48652b.j() : r1Var);
    }

    @Override // e30.r0
    @k
    public List<a2> G0() {
        return h0.J();
    }

    @Override // e30.r0
    @k
    public r1 H0() {
        return this.f82875e;
    }

    @Override // e30.r0
    public boolean J0() {
        return this.f82874d;
    }

    @Override // e30.k2
    @k
    /* renamed from: Q0 */
    public c1 O0(@k r1 newAttributes) {
        g0.p(newAttributes, "newAttributes");
        return new a(this.f82872b, I0(), J0(), newAttributes);
    }

    @Override // e30.r0
    @k
    /* renamed from: R0, reason: merged with bridge method [inline-methods] */
    public b I0() {
        return this.f82873c;
    }

    @Override // e30.c1
    @k
    /* renamed from: S0, reason: merged with bridge method [inline-methods] */
    public a M0(boolean z11) {
        return z11 == J0() ? this : new a(this.f82872b, I0(), z11, H0());
    }

    @Override // e30.k2
    @k
    /* renamed from: T0, reason: merged with bridge method [inline-methods] */
    public a S0(@k g kotlinTypeRefiner) {
        g0.p(kotlinTypeRefiner, "kotlinTypeRefiner");
        a2 d11 = this.f82872b.d(kotlinTypeRefiner);
        g0.o(d11, "refine(...)");
        return new a(d11, I0(), J0(), H0());
    }

    @Override // e30.r0
    @k
    public x20.k r() {
        return i.a(ErrorScopeKind.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    @Override // e30.c1
    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Captured(");
        sb2.append(this.f82872b);
        sb2.append(')');
        sb2.append(J0() ? "?" : "");
        return sb2.toString();
    }

    public a(@k a2 typeProjection, @k b constructor, boolean z11, @k r1 attributes) {
        g0.p(typeProjection, "typeProjection");
        g0.p(constructor, "constructor");
        g0.p(attributes, "attributes");
        this.f82872b = typeProjection;
        this.f82873c = constructor;
        this.f82874d = z11;
        this.f82875e = attributes;
    }
}
