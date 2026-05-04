package x20;

import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class i extends a {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final d30.i<k> f97114b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @w00.k
    public i(@m80.k x00.a<? extends k> getScope) {
        this(null, getScope, 1, 0 == true ? 1 : 0);
        g0.p(getScope, "getScope");
    }

    public static final k l(x00.a aVar) {
        k kVar = (k) aVar.invoke();
        return kVar instanceof a ? ((a) kVar).i() : kVar;
    }

    @Override // x20.a
    @m80.k
    public k j() {
        return this.f97114b.invoke();
    }

    public /* synthetic */ i(d30.n nVar, x00.a aVar, int i11, kotlin.jvm.internal.v vVar) {
        this((i11 & 1) != 0 ? d30.f.f47125e : nVar, aVar);
    }

    @w00.k
    public i(@m80.k d30.n storageManager, @m80.k x00.a<? extends k> getScope) {
        g0.p(storageManager, "storageManager");
        g0.p(getScope, "getScope");
        this.f97114b = storageManager.f(new h(getScope));
    }
}
