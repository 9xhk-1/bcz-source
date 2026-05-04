package androidx.compose.foundation.gestures;

import j00.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import l00.d;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic", f = "MouseWheelScrollable.kt", i = {0}, l = {122}, m = "userScroll", n = {"this"}, s = {"L$0"})
/* loaded from: classes.dex */
public final class MouseWheelScrollingLogic$userScroll$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MouseWheelScrollingLogic this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MouseWheelScrollingLogic$userScroll$1(MouseWheelScrollingLogic mouseWheelScrollingLogic, c<? super MouseWheelScrollingLogic$userScroll$1> cVar) {
        super(cVar);
        this.this$0 = mouseWheelScrollingLogic;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object userScroll;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        userScroll = this.this$0.userScroll(null, null, this);
        return userScroll;
    }
}
