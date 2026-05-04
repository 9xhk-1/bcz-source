package androidx.compose.foundation.gestures;

import androidx.core.app.NotificationCompat;
import com.baicizhan.main.home.player.IslandsKt;
import j00.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import l00.d;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.gestures.DragGestureNode", f = "Draggable.kt", i = {0, 0, 1, 1, 1}, l = {534, 537}, m = "processDragStart", n = {"this", NotificationCompat.CATEGORY_EVENT, "this", NotificationCompat.CATEGORY_EVENT, IslandsKt.f23311p}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
/* loaded from: classes.dex */
public final class DragGestureNode$processDragStart$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DragGestureNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureNode$processDragStart$1(DragGestureNode dragGestureNode, c<? super DragGestureNode$processDragStart$1> cVar) {
        super(cVar);
        this.this$0 = dragGestureNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object processDragStart;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        processDragStart = this.this$0.processDragStart(null, this);
        return processDragStart;
    }
}
