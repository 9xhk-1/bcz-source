package o40;

import c40.a4;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class s0 extends k0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final b0 f75846a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public final String f75847b;

    public /* synthetic */ s0(b0 b0Var, String str, int i11, kotlin.jvm.internal.v vVar) {
        this(b0Var, (i11 & 2) != 0 ? null : str);
    }

    @Override // c40.m0
    public void dispatch(@m80.k kotlin.coroutines.d dVar, @m80.k Runnable runnable) {
        c0.e(w(), dVar);
        w().Y0(dVar);
        a4 a4Var = (a4) dVar.get(a4.f7817b);
        if (a4Var == null) {
            throw new UnsupportedOperationException("Function UnconfinedTestCoroutineDispatcher.dispatch can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        a4Var.f7818a = true;
    }

    @Override // c40.m0
    public boolean isDispatchNeeded(@m80.k kotlin.coroutines.d dVar) {
        return false;
    }

    @Override // c40.m0
    @m80.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        String str = this.f75847b;
        if (str == null) {
            str = "UnconfinedTestDispatcher";
        }
        sb2.append(str);
        sb2.append("[scheduler=");
        sb2.append(w());
        sb2.append(l50.b.f69930l);
        return sb2.toString();
    }

    @Override // o40.k0
    @m80.k
    public b0 w() {
        return this.f75846a;
    }

    public s0(@m80.k b0 b0Var, @m80.l String str) {
        this.f75846a = b0Var;
        this.f75847b = str;
    }
}
