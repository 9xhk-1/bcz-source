package androidx.compose.foundation.gestures;

import androidx.core.app.NotificationCompat;
import j00.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import l00.d;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.gestures.DragGestureNode", f = "Draggable.kt", i = {0, 0}, l = {544}, m = "processDragStop", n = {"this", NotificationCompat.CATEGORY_EVENT}, s = {"L$0", "L$1"})
/* loaded from: classes.dex */
public final class DragGestureNode$processDragStop$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DragGestureNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureNode$processDragStop$1(DragGestureNode dragGestureNode, c<? super DragGestureNode$processDragStop$1> cVar) {
        super(cVar);
        this.this$0 = dragGestureNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object processDragStop;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        processDragStop = this.this$0.processDragStop(null, this);
        return processDragStop;
    }
}
