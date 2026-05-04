package androidx.lifecycle;

import androidx.annotation.RequiresApi;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.room.RoomCallableTrackingLiveData;
import java.time.Duration;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.g0;
import kotlinx.coroutines.flow.m0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.j(name = "FlowLiveDataConversions")
/* loaded from: classes2.dex */
public final class FlowLiveDataConversions {
    @k
    public static final <T> kotlinx.coroutines.flow.i<T> asFlow(@k LiveData<T> liveData) {
        g0.p(liveData, "<this>");
        return kotlinx.coroutines.flow.k.Y(kotlinx.coroutines.flow.k.t(new FlowLiveDataConversions$asFlow$1(liveData, null)));
    }

    @w00.k
    @k
    public static final <T> LiveData<T> asLiveData(@k kotlinx.coroutines.flow.i<? extends T> iVar) {
        g0.p(iVar, "<this>");
        return asLiveData$default(iVar, (kotlin.coroutines.d) null, 0L, 3, (Object) null);
    }

    public static /* synthetic */ LiveData asLiveData$default(kotlinx.coroutines.flow.i iVar, kotlin.coroutines.d dVar, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            dVar = EmptyCoroutineContext.INSTANCE;
        }
        if ((i11 & 2) != 0) {
            j11 = 5000;
        }
        return asLiveData(iVar, dVar, j11);
    }

    @w00.k
    @k
    public static final <T> LiveData<T> asLiveData(@k kotlinx.coroutines.flow.i<? extends T> iVar, @k kotlin.coroutines.d context) {
        g0.p(iVar, "<this>");
        g0.p(context, "context");
        return asLiveData$default(iVar, context, 0L, 2, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @w00.k
    @k
    public static final <T> LiveData<T> asLiveData(@k kotlinx.coroutines.flow.i<? extends T> iVar, @k kotlin.coroutines.d context, long j11) {
        g0.p(iVar, "<this>");
        g0.p(context, "context");
        RoomCallableTrackingLiveData roomCallableTrackingLiveData = (LiveData<T>) CoroutineLiveDataKt.liveData(context, j11, new FlowLiveDataConversions$asLiveData$1(iVar, null));
        if (iVar instanceof m0) {
            if (ArchTaskExecutor.getInstance().isMainThread()) {
                roomCallableTrackingLiveData.setValue(((m0) iVar).getValue());
                return roomCallableTrackingLiveData;
            }
            roomCallableTrackingLiveData.postValue(((m0) iVar).getValue());
        }
        return roomCallableTrackingLiveData;
    }

    public static /* synthetic */ LiveData asLiveData$default(kotlinx.coroutines.flow.i iVar, Duration duration, kotlin.coroutines.d dVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            dVar = EmptyCoroutineContext.INSTANCE;
        }
        return asLiveData(iVar, duration, dVar);
    }

    @RequiresApi(26)
    @k
    public static final <T> LiveData<T> asLiveData(@k kotlinx.coroutines.flow.i<? extends T> iVar, @k Duration timeout, @k kotlin.coroutines.d context) {
        g0.p(iVar, "<this>");
        g0.p(timeout, "timeout");
        g0.p(context, "context");
        return asLiveData(iVar, context, Api26Impl.INSTANCE.toMillis(timeout));
    }
}
