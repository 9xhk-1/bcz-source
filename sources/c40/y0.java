package c40;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class y0<T> extends a<T> implements x0<T> {
    public y0(@m80.k kotlin.coroutines.d dVar, boolean z11) {
        super(dVar, true, z11);
    }

    public static /* synthetic */ <T> Object e2(y0<T> y0Var, j00.c<? super T> cVar) {
        Object g02 = y0Var.g0(cVar);
        kotlin.coroutines.intrinsics.b.l();
        return g02;
    }

    @Override // c40.x0
    @m80.k
    public k40.h<T> H0() {
        k40.h<T> hVar = (k40.h<T>) Z0();
        kotlin.jvm.internal.g0.n(hVar, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectClause1<T of kotlinx.coroutines.DeferredCoroutine>");
        return hVar;
    }

    @Override // c40.x0
    public T S() {
        return (T) T0();
    }

    @Override // c40.x0
    @m80.l
    public Object i(@m80.k j00.c<? super T> cVar) {
        return e2(this, cVar);
    }
}
