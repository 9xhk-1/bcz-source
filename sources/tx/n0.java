package tx;

import tx.m;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class n0 implements m<n0, p0> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final sx.g f91154a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public p0 f91155b;

    public n0(@m80.k sx.g selector, @m80.k p0 options) {
        kotlin.jvm.internal.g0.p(selector, "selector");
        kotlin.jvm.internal.g0.p(options, "options");
        this.f91154a = selector;
        this.f91155b = options;
    }

    @Override // tx.m
    public void a(@m80.k p0 p0Var) {
        kotlin.jvm.internal.g0.p(p0Var, "<set-?>");
        this.f91155b = p0Var;
    }

    @Override // tx.m
    @m80.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n0 b(@m80.k x00.l<? super p0, g2> lVar) {
        return (n0) m.a.a(this, lVar);
    }

    @m80.k
    public final z0 d() {
        return new z0(this.f91154a, getOptions().h());
    }

    @m80.k
    public final d1 e() {
        return new d1(this.f91154a, getOptions().h().r());
    }

    @Override // tx.m
    @m80.k
    public p0 getOptions() {
        return this.f91155b;
    }
}
