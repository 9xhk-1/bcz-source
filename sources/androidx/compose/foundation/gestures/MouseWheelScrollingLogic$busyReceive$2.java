package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.MouseWheelScrollingLogic;
import c40.k;
import c40.l2;
import c40.r0;
import e40.o;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$busyReceive$2", f = "MouseWheelScrollable.kt", i = {0}, l = {170}, m = "invokeSuspend", n = {"job"}, s = {"L$0"})
/* loaded from: classes.dex */
public final class MouseWheelScrollingLogic$busyReceive$2 extends SuspendLambda implements p<r0, c<? super MouseWheelScrollingLogic.MouseWheelScrollDelta>, Object> {
    final /* synthetic */ o<MouseWheelScrollingLogic.MouseWheelScrollDelta> $this_busyReceive;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MouseWheelScrollingLogic$busyReceive$2(o<MouseWheelScrollingLogic.MouseWheelScrollDelta> oVar, c<? super MouseWheelScrollingLogic$busyReceive$2> cVar) {
        super(2, cVar);
        this.$this_busyReceive = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        MouseWheelScrollingLogic$busyReceive$2 mouseWheelScrollingLogic$busyReceive$2 = new MouseWheelScrollingLogic$busyReceive$2(this.$this_busyReceive, cVar);
        mouseWheelScrollingLogic$busyReceive$2.L$0 = obj;
        return mouseWheelScrollingLogic$busyReceive$2;
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, c<? super MouseWheelScrollingLogic.MouseWheelScrollDelta> cVar) {
        return ((MouseWheelScrollingLogic$busyReceive$2) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [c40.l2] */
    /* JADX WARN: Type inference failed for: r1v3, types: [c40.l2] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        l2 f11;
        Object l11 = b.l();
        ?? r12 = this.label;
        try {
            if (r12 == 0) {
                e.n(obj);
                f11 = k.f((r0) this.L$0, null, null, new MouseWheelScrollingLogic$busyReceive$2$job$1(null), 3, null);
                o<MouseWheelScrollingLogic.MouseWheelScrollDelta> oVar = this.$this_busyReceive;
                this.L$0 = f11;
                this.label = 1;
                obj = oVar.H(this);
                r12 = f11;
                if (obj == l11) {
                    return l11;
                }
            } else {
                if (r12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                l2 l2Var = (l2) this.L$0;
                e.n(obj);
                r12 = l2Var;
            }
            MouseWheelScrollingLogic.MouseWheelScrollDelta mouseWheelScrollDelta = (MouseWheelScrollingLogic.MouseWheelScrollDelta) obj;
            l2.a.b(r12, null, 1, null);
            return mouseWheelScrollDelta;
        } catch (Throwable th2) {
            l2.a.b(r12, null, 1, null);
            throw th2;
        }
    }
}
