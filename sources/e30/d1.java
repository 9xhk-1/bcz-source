package e30;

import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class d1 extends c1 {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final u1 f48564b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final List<a2> f48565c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f48566d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final x20.k f48567e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final x00.l<f30.g, c1> f48568f;

    /* JADX WARN: Multi-variable type inference failed */
    public d1(@m80.k u1 constructor, @m80.k List<? extends a2> arguments, boolean z11, @m80.k x20.k memberScope, @m80.k x00.l<? super f30.g, ? extends c1> refinedTypeFactory) {
        kotlin.jvm.internal.g0.p(constructor, "constructor");
        kotlin.jvm.internal.g0.p(arguments, "arguments");
        kotlin.jvm.internal.g0.p(memberScope, "memberScope");
        kotlin.jvm.internal.g0.p(refinedTypeFactory, "refinedTypeFactory");
        this.f48564b = constructor;
        this.f48565c = arguments;
        this.f48566d = z11;
        this.f48567e = memberScope;
        this.f48568f = refinedTypeFactory;
        if (!(r() instanceof g30.f) || (r() instanceof g30.j)) {
            return;
        }
        throw new IllegalStateException("SimpleTypeImpl should not be created for error type: " + r() + '\n' + I0());
    }

    @Override // e30.r0
    @m80.k
    public List<a2> G0() {
        return this.f48565c;
    }

    @Override // e30.r0
    @m80.k
    public r1 H0() {
        return r1.f48652b.j();
    }

    @Override // e30.r0
    @m80.k
    public u1 I0() {
        return this.f48564b;
    }

    @Override // e30.r0
    public boolean J0() {
        return this.f48566d;
    }

    @Override // e30.k2
    @m80.k
    /* renamed from: P0 */
    public c1 M0(boolean z11) {
        return z11 == J0() ? this : z11 ? new a1(this) : new y0(this);
    }

    @Override // e30.k2
    @m80.k
    /* renamed from: Q0 */
    public c1 O0(@m80.k r1 newAttributes) {
        kotlin.jvm.internal.g0.p(newAttributes, "newAttributes");
        return newAttributes.isEmpty() ? this : new e1(this, newAttributes);
    }

    @Override // e30.k2
    @m80.k
    /* renamed from: R0, reason: merged with bridge method [inline-methods] */
    public c1 S0(@m80.k f30.g kotlinTypeRefiner) {
        kotlin.jvm.internal.g0.p(kotlinTypeRefiner, "kotlinTypeRefiner");
        c1 invoke = this.f48568f.invoke(kotlinTypeRefiner);
        return invoke == null ? this : invoke;
    }

    @Override // e30.r0
    @m80.k
    public x20.k r() {
        return this.f48567e;
    }
}
