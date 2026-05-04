package c40;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class w3 extends m0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final w3 f8010a = new w3();

    @Override // c40.m0
    public void dispatch(@m80.k kotlin.coroutines.d dVar, @m80.k Runnable runnable) {
        a4 a4Var = (a4) dVar.get(a4.f7817b);
        if (a4Var == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        a4Var.f7818a = true;
    }

    @Override // c40.m0
    public boolean isDispatchNeeded(@m80.k kotlin.coroutines.d dVar) {
        return false;
    }

    @Override // c40.m0
    @m80.k
    public m0 limitedParallelism(int i11, @m80.l String str) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // c40.m0
    @m80.k
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
