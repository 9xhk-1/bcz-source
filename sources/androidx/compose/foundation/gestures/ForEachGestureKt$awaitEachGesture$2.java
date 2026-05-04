package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import j00.c;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2", f = "ForEachGesture.kt", i = {0, 1, 2}, l = {102, 105, 110}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "$this$awaitPointerEventScope", "$this$awaitPointerEventScope"}, s = {"L$0", "L$0", "L$0"})
/* loaded from: classes.dex */
public final class ForEachGestureKt$awaitEachGesture$2 extends RestrictedSuspendLambda implements p<AwaitPointerEventScope, c<? super g2>, Object> {
    final /* synthetic */ p<AwaitPointerEventScope, c<? super g2>, Object> $block;
    final /* synthetic */ kotlin.coroutines.d $currentContext;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ForEachGestureKt$awaitEachGesture$2(kotlin.coroutines.d dVar, p<? super AwaitPointerEventScope, ? super c<? super g2>, ? extends Object> pVar, c<? super ForEachGestureKt$awaitEachGesture$2> cVar) {
        super(2, cVar);
        this.$currentContext = dVar;
        this.$block = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        ForEachGestureKt$awaitEachGesture$2 forEachGestureKt$awaitEachGesture$2 = new ForEachGestureKt$awaitEachGesture$2(this.$currentContext, this.$block, cVar);
        forEachGestureKt$awaitEachGesture$2.L$0 = obj;
        return forEachGestureKt$awaitEachGesture$2;
    }

    @Override // x00.p
    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, c<? super g2> cVar) {
        return ((ForEachGestureKt$awaitEachGesture$2) create(awaitPointerEventScope, cVar)).invokeSuspend(g2.f100423a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
    
        if (r9 != r0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0071, code lost:
    
        if (r9 == r0) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0044 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0074  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.compose.ui.input.pointer.AwaitPointerEventScope, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v3, types: [androidx.compose.ui.input.pointer.AwaitPointerEventScope, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005a -> B:8:0x0029). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0071 -> B:8:0x0029). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r8.label
            r2 = 3
            r3 = 2
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L35
            if (r1 == r5) goto L2d
            if (r1 == r3) goto L22
            if (r1 != r2) goto L1a
            java.lang.Object r1 = r8.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
            kotlin.e.n(r9)
            goto L29
        L1a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L22:
            java.lang.Object r1 = r8.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
            kotlin.e.n(r9)     // Catch: java.util.concurrent.CancellationException -> L2b
        L29:
            r9 = r1
            goto L3c
        L2b:
            r9 = move-exception
            goto L61
        L2d:
            java.lang.Object r1 = r8.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
            kotlin.e.n(r9)     // Catch: java.util.concurrent.CancellationException -> L2b
            goto L52
        L35:
            kotlin.e.n(r9)
            java.lang.Object r9 = r8.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r9 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r9
        L3c:
            kotlin.coroutines.d r1 = r8.$currentContext
            boolean r1 = c40.n2.D(r1)
            if (r1 == 0) goto L75
            x00.p<androidx.compose.ui.input.pointer.AwaitPointerEventScope, j00.c<? super yz.g2>, java.lang.Object> r1 = r8.$block     // Catch: java.util.concurrent.CancellationException -> L5d
            r8.L$0 = r9     // Catch: java.util.concurrent.CancellationException -> L5d
            r8.label = r5     // Catch: java.util.concurrent.CancellationException -> L5d
            java.lang.Object r1 = r1.invoke(r9, r8)     // Catch: java.util.concurrent.CancellationException -> L5d
            if (r1 != r0) goto L51
            goto L73
        L51:
            r1 = r9
        L52:
            r8.L$0 = r1     // Catch: java.util.concurrent.CancellationException -> L2b
            r8.label = r3     // Catch: java.util.concurrent.CancellationException -> L2b
            java.lang.Object r9 = androidx.compose.foundation.gestures.ForEachGestureKt.awaitAllPointersUp$default(r1, r4, r8, r5, r4)     // Catch: java.util.concurrent.CancellationException -> L2b
            if (r9 != r0) goto L29
            goto L73
        L5d:
            r1 = move-exception
            r7 = r1
            r1 = r9
            r9 = r7
        L61:
            kotlin.coroutines.d r6 = r8.$currentContext
            boolean r6 = c40.n2.D(r6)
            if (r6 == 0) goto L74
            r8.L$0 = r1
            r8.label = r2
            java.lang.Object r9 = androidx.compose.foundation.gestures.ForEachGestureKt.awaitAllPointersUp$default(r1, r4, r8, r5, r4)
            if (r9 != r0) goto L29
        L73:
            return r0
        L74:
            throw r9
        L75:
            yz.g2 r9 = yz.g2.f100423a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
