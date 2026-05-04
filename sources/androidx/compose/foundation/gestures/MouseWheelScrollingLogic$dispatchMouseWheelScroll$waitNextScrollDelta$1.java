package androidx.compose.foundation.gestures;

import com.jiongji.andriod.card.R;
import j00.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import l00.d;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic", f = "MouseWheelScrollable.kt", i = {0, 0, 0, 0, 0}, l = {R.styleable.Theme_drawable_syncview}, m = "dispatchMouseWheelScroll$waitNextScrollDelta", n = {"this$0", "targetScrollDelta", "targetValue", "$this_dispatchMouseWheelScroll", "animationState"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"})
/* loaded from: classes.dex */
public final class MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;

    public MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1(c<? super MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object dispatchMouseWheelScroll$waitNextScrollDelta;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        dispatchMouseWheelScroll$waitNextScrollDelta = MouseWheelScrollingLogic.dispatchMouseWheelScroll$waitNextScrollDelta(null, null, null, null, null, 0L, this);
        return dispatchMouseWheelScroll$waitNextScrollDelta;
    }
}
