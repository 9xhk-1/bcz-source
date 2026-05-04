package androidx.lifecycle;

import androidx.annotation.RequiresApi;
import c40.h1;
import java.time.Duration;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class CoroutineLiveDataKt {
    public static final long DEFAULT_TIMEOUT = 5000;

    @l
    public static final <T> Object addDisposableSource(@k MediatorLiveData<T> mediatorLiveData, @k LiveData<T> liveData, @k j00.c<? super EmittedSource> cVar) {
        return c40.i.h(h1.e().q(), new CoroutineLiveDataKt$addDisposableSource$2(mediatorLiveData, liveData, null), cVar);
    }

    @w00.k
    @RequiresApi(26)
    @k
    public static final <T> LiveData<T> liveData(@k Duration timeout, @k p<? super LiveDataScope<T>, ? super j00.c<? super g2>, ? extends Object> block) {
        g0.p(timeout, "timeout");
        g0.p(block, "block");
        return liveData$default(timeout, (kotlin.coroutines.d) null, block, 2, (Object) null);
    }

    public static /* synthetic */ LiveData liveData$default(kotlin.coroutines.d dVar, long j11, p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            dVar = EmptyCoroutineContext.INSTANCE;
        }
        if ((i11 & 2) != 0) {
            j11 = 5000;
        }
        return liveData(dVar, j11, pVar);
    }

    @w00.k
    @k
    public static final <T> LiveData<T> liveData(@k kotlin.coroutines.d context, @k p<? super LiveDataScope<T>, ? super j00.c<? super g2>, ? extends Object> block) {
        g0.p(context, "context");
        g0.p(block, "block");
        return liveData$default(context, 0L, block, 2, (Object) null);
    }

    @w00.k
    @k
    public static final <T> LiveData<T> liveData(@k p<? super LiveDataScope<T>, ? super j00.c<? super g2>, ? extends Object> block) {
        g0.p(block, "block");
        return liveData$default((kotlin.coroutines.d) null, 0L, block, 3, (Object) null);
    }

    public static /* synthetic */ LiveData liveData$default(Duration duration, kotlin.coroutines.d dVar, p pVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            dVar = EmptyCoroutineContext.INSTANCE;
        }
        return liveData(duration, dVar, pVar);
    }

    @w00.k
    @k
    public static final <T> LiveData<T> liveData(@k kotlin.coroutines.d context, long j11, @k p<? super LiveDataScope<T>, ? super j00.c<? super g2>, ? extends Object> block) {
        g0.p(context, "context");
        g0.p(block, "block");
        return new CoroutineLiveData(context, j11, block);
    }

    @w00.k
    @RequiresApi(26)
    @k
    public static final <T> LiveData<T> liveData(@k Duration timeout, @k kotlin.coroutines.d context, @k p<? super LiveDataScope<T>, ? super j00.c<? super g2>, ? extends Object> block) {
        g0.p(timeout, "timeout");
        g0.p(context, "context");
        g0.p(block, "block");
        return new CoroutineLiveData(context, Api26Impl.INSTANCE.toMillis(timeout), block);
    }
}
