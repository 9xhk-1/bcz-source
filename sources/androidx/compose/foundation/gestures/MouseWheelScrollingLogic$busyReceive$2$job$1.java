package androidx.compose.foundation.gestures;

import androidx.compose.runtime.MonotonicFrameClockKt;
import c40.n2;
import c40.r0;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import l00.d;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$busyReceive$2$job$1", f = "MouseWheelScrollable.kt", i = {0}, l = {166}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
/* loaded from: classes.dex */
public final class MouseWheelScrollingLogic$busyReceive$2$job$1 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    public MouseWheelScrollingLogic$busyReceive$2$job$1(c<? super MouseWheelScrollingLogic$busyReceive$2$job$1> cVar) {
        super(2, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        MouseWheelScrollingLogic$busyReceive$2$job$1 mouseWheelScrollingLogic$busyReceive$2$job$1 = new MouseWheelScrollingLogic$busyReceive$2$job$1(cVar);
        mouseWheelScrollingLogic$busyReceive$2$job$1.L$0 = obj;
        return mouseWheelScrollingLogic$busyReceive$2$job$1;
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, c<? super g2> cVar) {
        return ((MouseWheelScrollingLogic$busyReceive$2$job$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        r0 r0Var;
        Object l11 = b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            r0Var = (r0) this.L$0;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r0Var = (r0) this.L$0;
            e.n(obj);
        }
        while (n2.D(r0Var.getCoroutineContext())) {
            AnonymousClass1 anonymousClass1 = new l<Long, g2>() { // from class: androidx.compose.foundation.gestures.MouseWheelScrollingLogic$busyReceive$2$job$1.1
                public final void invoke(long j11) {
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(Long l12) {
                    invoke(l12.longValue());
                    return g2.f100423a;
                }
            };
            this.L$0 = r0Var;
            this.label = 1;
            if (MonotonicFrameClockKt.withFrameNanos(anonymousClass1, this) == l11) {
                return l11;
            }
        }
        return g2.f100423a;
    }
}
