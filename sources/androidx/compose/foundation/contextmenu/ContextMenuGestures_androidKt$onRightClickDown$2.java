package androidx.compose.foundation.contextmenu;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import j00.c;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import l00.d;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt$onRightClickDown$2", f = "ContextMenuGestures.android.kt", i = {0}, l = {58, 61}, m = "invokeSuspend", n = {"$this$awaitEachGesture"}, s = {"L$0"})
/* loaded from: classes.dex */
public final class ContextMenuGestures_androidKt$onRightClickDown$2 extends RestrictedSuspendLambda implements p<AwaitPointerEventScope, c<? super g2>, Object> {
    final /* synthetic */ l<Offset, g2> $onDown;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ContextMenuGestures_androidKt$onRightClickDown$2(l<? super Offset, g2> lVar, c<? super ContextMenuGestures_androidKt$onRightClickDown$2> cVar) {
        super(2, cVar);
        this.$onDown = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        ContextMenuGestures_androidKt$onRightClickDown$2 contextMenuGestures_androidKt$onRightClickDown$2 = new ContextMenuGestures_androidKt$onRightClickDown$2(this.$onDown, cVar);
        contextMenuGestures_androidKt$onRightClickDown$2.L$0 = obj;
        return contextMenuGestures_androidKt$onRightClickDown$2;
    }

    @Override // x00.p
    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, c<? super g2> cVar) {
        return ((ContextMenuGestures_androidKt$onRightClickDown$2) create(awaitPointerEventScope, cVar)).invokeSuspend(g2.f100423a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        if (r8 == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0032, code lost:
    
        if (r8 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r7.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.e.n(r8)
            goto L53
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1a:
            java.lang.Object r1 = r7.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
            kotlin.e.n(r8)
            goto L35
        L22:
            kotlin.e.n(r8)
            java.lang.Object r8 = r7.L$0
            r1 = r8
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
            r7.L$0 = r1
            r7.label = r3
            java.lang.Object r8 = androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt.access$awaitFirstRightClickDown(r1, r7)
            if (r8 != r0) goto L35
            goto L52
        L35:
            androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.ui.input.pointer.PointerInputChange) r8
            r8.consume()
            x00.l<androidx.compose.ui.geometry.Offset, yz.g2> r4 = r7.$onDown
            long r5 = r8.m3732getPositionF1C5BW0()
            androidx.compose.ui.geometry.Offset r8 = androidx.compose.ui.geometry.Offset.m2257boximpl(r5)
            r4.invoke(r8)
            r8 = 0
            r7.L$0 = r8
            r7.label = r2
            java.lang.Object r8 = androidx.compose.foundation.gestures.TapGestureDetectorKt.waitForUpOrCancellation$default(r1, r8, r7, r3, r8)
            if (r8 != r0) goto L53
        L52:
            return r0
        L53:
            androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.ui.input.pointer.PointerInputChange) r8
            if (r8 == 0) goto L5a
            r8.consume()
        L5a:
            yz.g2 r8 = yz.g2.f100423a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt$onRightClickDown$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
