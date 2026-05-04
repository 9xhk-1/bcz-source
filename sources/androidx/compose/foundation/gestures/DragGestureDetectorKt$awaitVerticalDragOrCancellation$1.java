package androidx.compose.foundation.gestures;

import j00.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import l00.d;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", i = {0, 0}, l = {1048}, m = "awaitVerticalDragOrCancellation-rnUCldI", n = {"$this$awaitDragOrUp_u2djO51t88$iv", "pointer$iv"}, s = {"L$0", "L$1"})
/* loaded from: classes.dex */
public final class DragGestureDetectorKt$awaitVerticalDragOrCancellation$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public DragGestureDetectorKt$awaitVerticalDragOrCancellation$1(c<? super DragGestureDetectorKt$awaitVerticalDragOrCancellation$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return DragGestureDetectorKt.m428awaitVerticalDragOrCancellationrnUCldI(null, 0L, this);
    }
}
