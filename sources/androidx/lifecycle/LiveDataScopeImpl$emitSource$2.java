package androidx.lifecycle;

import c40.k1;
import c40.r0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.lifecycle.LiveDataScopeImpl$emitSource$2", f = "CoroutineLiveData.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class LiveDataScopeImpl$emitSource$2 extends SuspendLambda implements p<r0, j00.c<? super k1>, Object> {
    final /* synthetic */ LiveData<T> $source;
    int label;
    final /* synthetic */ LiveDataScopeImpl<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveDataScopeImpl$emitSource$2(LiveDataScopeImpl<T> liveDataScopeImpl, LiveData<T> liveData, j00.c<? super LiveDataScopeImpl$emitSource$2> cVar) {
        super(2, cVar);
        this.this$0 = liveDataScopeImpl;
        this.$source = liveData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final j00.c<g2> create(@l Object obj, @k j00.c<?> cVar) {
        return new LiveDataScopeImpl$emitSource$2(this.this$0, this.$source, cVar);
    }

    @Override // x00.p
    @l
    public final Object invoke(@k r0 r0Var, @l j00.c<? super k1> cVar) {
        return ((LiveDataScopeImpl$emitSource$2) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            return obj;
        }
        kotlin.e.n(obj);
        CoroutineLiveData target$lifecycle_livedata_release = this.this$0.getTarget$lifecycle_livedata_release();
        Object obj2 = this.$source;
        this.label = 1;
        Object emitSource$lifecycle_livedata_release = target$lifecycle_livedata_release.emitSource$lifecycle_livedata_release(obj2, this);
        return emitSource$lifecycle_livedata_release == l11 ? l11 : emitSource$lifecycle_livedata_release;
    }
}
