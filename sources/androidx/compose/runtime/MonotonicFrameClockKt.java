package androidx.compose.runtime;

import j00.c;
import kotlin.coroutines.d;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nMonotonicFrameClock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MonotonicFrameClock.kt\nandroidx/compose/runtime/MonotonicFrameClockKt\n*L\n1#1,131:1\n65#1:132\n*S KotlinDebug\n*F\n+ 1 MonotonicFrameClock.kt\nandroidx/compose/runtime/MonotonicFrameClockKt\n*L\n105#1:132\n*E\n"})
/* loaded from: classes.dex */
public final class MonotonicFrameClockKt {
    @k
    public static final MonotonicFrameClock getMonotonicFrameClock(@k d dVar) {
        MonotonicFrameClock monotonicFrameClock = (MonotonicFrameClock) dVar.get(MonotonicFrameClock.Key);
        if (monotonicFrameClock != null) {
            return monotonicFrameClock;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }

    @l
    public static final <R> Object withFrameMillis(@k MonotonicFrameClock monotonicFrameClock, @k x00.l<? super Long, ? extends R> lVar, @k c<? super R> cVar) {
        return monotonicFrameClock.withFrameNanos(new MonotonicFrameClockKt$withFrameMillis$2(lVar), cVar);
    }

    private static final <R> Object withFrameMillis$$forInline(MonotonicFrameClock monotonicFrameClock, x00.l<? super Long, ? extends R> lVar, c<? super R> cVar) {
        MonotonicFrameClockKt$withFrameMillis$2 monotonicFrameClockKt$withFrameMillis$2 = new MonotonicFrameClockKt$withFrameMillis$2(lVar);
        d0.e(0);
        Object withFrameNanos = monotonicFrameClock.withFrameNanos(monotonicFrameClockKt$withFrameMillis$2, cVar);
        d0.e(1);
        return withFrameNanos;
    }

    @l
    public static final <R> Object withFrameNanos(@k x00.l<? super Long, ? extends R> lVar, @k c<? super R> cVar) {
        return getMonotonicFrameClock(cVar.getContext()).withFrameNanos(lVar, cVar);
    }

    @l
    public static final <R> Object withFrameMillis(@k x00.l<? super Long, ? extends R> lVar, @k c<? super R> cVar) {
        return getMonotonicFrameClock(cVar.getContext()).withFrameNanos(new MonotonicFrameClockKt$withFrameMillis$2(lVar), cVar);
    }

    @ExperimentalComposeApi
    public static /* synthetic */ void getMonotonicFrameClock$annotations(d dVar) {
    }
}
