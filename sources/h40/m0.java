package h40;

import c40.g2;
import kotlin.DeprecationLevel;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class m0 extends c40.m0 implements c40.z0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c40.z0 f58247a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final c40.m0 f58248b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f58249c;

    /* JADX WARN: Multi-variable type inference failed */
    public m0(@m80.k c40.m0 m0Var, @m80.k String str) {
        c40.z0 z0Var = m0Var instanceof c40.z0 ? (c40.z0) m0Var : null;
        this.f58247a = z0Var == null ? c40.w0.a() : z0Var;
        this.f58248b = m0Var;
        this.f58249c = str;
    }

    @Override // c40.m0
    public void dispatch(@m80.k kotlin.coroutines.d dVar, @m80.k Runnable runnable) {
        this.f58248b.dispatch(dVar, runnable);
    }

    @Override // c40.m0
    @g2
    public void dispatchYield(@m80.k kotlin.coroutines.d dVar, @m80.k Runnable runnable) {
        this.f58248b.dispatchYield(dVar, runnable);
    }

    @Override // c40.z0
    @m80.k
    public c40.k1 f(long j11, @m80.k Runnable runnable, @m80.k kotlin.coroutines.d dVar) {
        return this.f58247a.f(j11, runnable, dVar);
    }

    @Override // c40.m0
    public boolean isDispatchNeeded(@m80.k kotlin.coroutines.d dVar) {
        return this.f58248b.isDispatchNeeded(dVar);
    }

    @Override // c40.z0
    public void j(long j11, @m80.k c40.n<? super yz.g2> nVar) {
        this.f58247a.j(j11, nVar);
    }

    @Override // c40.z0
    @m80.l
    @yz.n(level = DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    public Object k(long j11, @m80.k j00.c<? super yz.g2> cVar) {
        return this.f58247a.k(j11, cVar);
    }

    @Override // c40.m0
    @m80.k
    public String toString() {
        return this.f58249c;
    }
}
