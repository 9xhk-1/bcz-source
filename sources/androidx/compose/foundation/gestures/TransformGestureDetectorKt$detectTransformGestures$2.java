package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.constraintlayout.motion.widget.Key;
import j00.c;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.u0;
import l00.d;
import x00.p;
import x00.r;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.gestures.TransformGestureDetectorKt$detectTransformGestures$2", f = "TransformGestureDetector.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1}, l = {60, 62}, m = "invokeSuspend", n = {"$this$awaitEachGesture", Key.ROTATION, "zoom", "pan", "pastTouchSlop", "touchSlop", "lockedToPanZoom", "$this$awaitEachGesture", Key.ROTATION, "zoom", "pan", "pastTouchSlop", "touchSlop", "lockedToPanZoom"}, s = {"L$0", "F$0", "F$1", "J$0", "I$0", "F$2", "I$1", "L$0", "F$0", "F$1", "J$0", "I$0", "F$2", "I$1"})
@u0({"SMAP\nTransformGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransformGestureDetector.kt\nandroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,255:1\n102#2,2:256\n34#2,6:258\n104#2:264\n34#2,6:265\n102#2,2:271\n34#2,6:273\n104#2:279\n*S KotlinDebug\n*F\n+ 1 TransformGestureDetector.kt\nandroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2\n*L\n63#1:256,2\n63#1:258,6\n63#1:264\n95#1:265,6\n102#1:271,2\n102#1:273,6\n102#1:279\n*E\n"})
/* loaded from: classes.dex */
public final class TransformGestureDetectorKt$detectTransformGestures$2 extends RestrictedSuspendLambda implements p<AwaitPointerEventScope, c<? super g2>, Object> {
    final /* synthetic */ r<Offset, Offset, Float, Float, g2> $onGesture;
    final /* synthetic */ boolean $panZoomLock;
    float F$0;
    float F$1;
    float F$2;
    int I$0;
    int I$1;
    long J$0;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TransformGestureDetectorKt$detectTransformGestures$2(boolean z11, r<? super Offset, ? super Offset, ? super Float, ? super Float, g2> rVar, c<? super TransformGestureDetectorKt$detectTransformGestures$2> cVar) {
        super(2, cVar);
        this.$panZoomLock = z11;
        this.$onGesture = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        TransformGestureDetectorKt$detectTransformGestures$2 transformGestureDetectorKt$detectTransformGestures$2 = new TransformGestureDetectorKt$detectTransformGestures$2(this.$panZoomLock, this.$onGesture, cVar);
        transformGestureDetectorKt$detectTransformGestures$2.L$0 = obj;
        return transformGestureDetectorKt$detectTransformGestures$2;
    }

    @Override // x00.p
    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, c<? super g2> cVar) {
        return ((TransformGestureDetectorKt$detectTransformGestures$2) create(awaitPointerEventScope, cVar)).invokeSuspend(g2.f100423a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x013c, code lost:
    
        if (androidx.compose.ui.geometry.Offset.m2265equalsimpl0(r11, androidx.compose.ui.geometry.Offset.Companion.m2284getZeroF1C5BW0()) == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0093, code lost:
    
        if (r15 == r6) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [int] */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0093 -> B:6:0x0096). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformGestureDetectorKt$detectTransformGestures$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
