package androidx.lifecycle;

import android.annotation.SuppressLint;
import c40.h1;
import c40.k1;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class LiveDataScopeImpl<T> implements LiveDataScope<T> {

    @k
    private final kotlin.coroutines.d coroutineContext;

    @k
    private CoroutineLiveData<T> target;

    public LiveDataScopeImpl(@k CoroutineLiveData<T> target, @k kotlin.coroutines.d context) {
        g0.p(target, "target");
        g0.p(context, "context");
        this.target = target;
        this.coroutineContext = context.plus(h1.e().q());
    }

    @Override // androidx.lifecycle.LiveDataScope
    @l
    @SuppressLint({"NullSafeMutableLiveData"})
    public Object emit(T t11, @k j00.c<? super g2> cVar) {
        Object h11 = c40.i.h(this.coroutineContext, new LiveDataScopeImpl$emit$2(this, t11, null), cVar);
        return h11 == kotlin.coroutines.intrinsics.b.l() ? h11 : g2.f100423a;
    }

    @Override // androidx.lifecycle.LiveDataScope
    @l
    public Object emitSource(@k LiveData<T> liveData, @k j00.c<? super k1> cVar) {
        return c40.i.h(this.coroutineContext, new LiveDataScopeImpl$emitSource$2(this, liveData, null), cVar);
    }

    @Override // androidx.lifecycle.LiveDataScope
    @l
    public T getLatestValue() {
        return this.target.getValue();
    }

    @k
    public final CoroutineLiveData<T> getTarget$lifecycle_livedata_release() {
        return this.target;
    }

    public final void setTarget$lifecycle_livedata_release(@k CoroutineLiveData<T> coroutineLiveData) {
        g0.p(coroutineLiveData, "<set-?>");
        this.target = coroutineLiveData;
    }
}
