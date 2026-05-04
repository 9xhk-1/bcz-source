package androidx.room.concurrent;

import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.g0;
import m80.k;
import x00.a;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class CloseBarrierKt {
    public static final void ifNotClosed(@k CloseBarrier closeBarrier, @k a<g2> action) {
        g0.p(closeBarrier, "<this>");
        g0.p(action, "action");
        if (closeBarrier.block$room_runtime_release()) {
            try {
                action.invoke();
            } finally {
                d0.d(1);
                closeBarrier.unblock$room_runtime_release();
                d0.c(1);
            }
        }
    }
}
