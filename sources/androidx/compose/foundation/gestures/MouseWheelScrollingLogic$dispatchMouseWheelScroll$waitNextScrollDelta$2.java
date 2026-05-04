package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.MouseWheelScrollingLogic;
import c40.r0;
import com.jiongji.andriod.card.R;
import e40.o;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$2", f = "MouseWheelScrollable.kt", i = {}, l = {R.styleable.Theme_drawable_syncview}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$2 extends SuspendLambda implements p<r0, c<? super MouseWheelScrollingLogic.MouseWheelScrollDelta>, Object> {
    int label;
    final /* synthetic */ MouseWheelScrollingLogic this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$2(MouseWheelScrollingLogic mouseWheelScrollingLogic, c<? super MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$2> cVar) {
        super(2, cVar);
        this.this$0 = mouseWheelScrollingLogic;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        return new MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$2(this.this$0, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, c<? super MouseWheelScrollingLogic.MouseWheelScrollDelta> cVar) {
        return ((MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$2) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        o oVar;
        Object busyReceive;
        Object l11 = b.l();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.n(obj);
            return obj;
        }
        e.n(obj);
        MouseWheelScrollingLogic mouseWheelScrollingLogic = this.this$0;
        oVar = mouseWheelScrollingLogic.channel;
        this.label = 1;
        busyReceive = mouseWheelScrollingLogic.busyReceive(oVar, this);
        return busyReceive == l11 ? l11 : busyReceive;
    }
}
