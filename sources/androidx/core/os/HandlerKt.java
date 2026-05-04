package androidx.core.os;

import android.os.Handler;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class HandlerKt {
    @k
    public static final Runnable postAtTime(@k Handler handler, long j11, @l Object obj, @k x00.a<g2> aVar) {
        HandlerKt$postAtTime$runnable$1 handlerKt$postAtTime$runnable$1 = new HandlerKt$postAtTime$runnable$1(aVar);
        handler.postAtTime(handlerKt$postAtTime$runnable$1, obj, j11);
        return handlerKt$postAtTime$runnable$1;
    }

    public static /* synthetic */ Runnable postAtTime$default(Handler handler, long j11, Object obj, x00.a aVar, int i11, Object obj2) {
        if ((i11 & 2) != 0) {
            obj = null;
        }
        HandlerKt$postAtTime$runnable$1 handlerKt$postAtTime$runnable$1 = new HandlerKt$postAtTime$runnable$1(aVar);
        handler.postAtTime(handlerKt$postAtTime$runnable$1, obj, j11);
        return handlerKt$postAtTime$runnable$1;
    }

    @k
    public static final Runnable postDelayed(@k Handler handler, long j11, @l Object obj, @k x00.a<g2> aVar) {
        HandlerKt$postDelayed$runnable$1 handlerKt$postDelayed$runnable$1 = new HandlerKt$postDelayed$runnable$1(aVar);
        if (obj == null) {
            handler.postDelayed(handlerKt$postDelayed$runnable$1, j11);
            return handlerKt$postDelayed$runnable$1;
        }
        HandlerCompat.postDelayed(handler, handlerKt$postDelayed$runnable$1, obj, j11);
        return handlerKt$postDelayed$runnable$1;
    }

    public static /* synthetic */ Runnable postDelayed$default(Handler handler, long j11, Object obj, x00.a aVar, int i11, Object obj2) {
        if ((i11 & 2) != 0) {
            obj = null;
        }
        HandlerKt$postDelayed$runnable$1 handlerKt$postDelayed$runnable$1 = new HandlerKt$postDelayed$runnable$1(aVar);
        if (obj == null) {
            handler.postDelayed(handlerKt$postDelayed$runnable$1, j11);
            return handlerKt$postDelayed$runnable$1;
        }
        HandlerCompat.postDelayed(handler, handlerKt$postDelayed$runnable$1, obj, j11);
        return handlerKt$postDelayed$runnable$1;
    }
}
