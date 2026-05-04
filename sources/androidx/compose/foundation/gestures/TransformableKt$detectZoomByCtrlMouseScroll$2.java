package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import e3.a;
import e40.o;
import j00.c;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.u0;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.gestures.TransformableKt$detectZoomByCtrlMouseScroll$2", f = "Transformable.kt", i = {0, 1}, l = {a.f48454z, 284}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "$this$awaitPointerEventScope"}, s = {"L$0", "L$0"})
@u0({"SMAP\nTransformable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transformable.kt\nandroidx/compose/foundation/gestures/TransformableKt$detectZoomByCtrlMouseScroll$2\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,399:1\n69#2:400\n70#3:401\n22#4:402\n*S KotlinDebug\n*F\n+ 1 Transformable.kt\nandroidx/compose/foundation/gestures/TransformableKt$detectZoomByCtrlMouseScroll$2\n*L\n276#1:400\n276#1:401\n276#1:402\n*E\n"})
/* loaded from: classes.dex */
public final class TransformableKt$detectZoomByCtrlMouseScroll$2 extends RestrictedSuspendLambda implements p<AwaitPointerEventScope, c<? super g2>, Object> {
    final /* synthetic */ o<TransformEvent> $channel;
    final /* synthetic */ kotlin.coroutines.d $currentContext;
    final /* synthetic */ ScrollConfig $scrollConfig;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransformableKt$detectZoomByCtrlMouseScroll$2(kotlin.coroutines.d dVar, ScrollConfig scrollConfig, o<TransformEvent> oVar, c<? super TransformableKt$detectZoomByCtrlMouseScroll$2> cVar) {
        super(2, cVar);
        this.$currentContext = dVar;
        this.$scrollConfig = scrollConfig;
        this.$channel = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        TransformableKt$detectZoomByCtrlMouseScroll$2 transformableKt$detectZoomByCtrlMouseScroll$2 = new TransformableKt$detectZoomByCtrlMouseScroll$2(this.$currentContext, this.$scrollConfig, this.$channel, cVar);
        transformableKt$detectZoomByCtrlMouseScroll$2.L$0 = obj;
        return transformableKt$detectZoomByCtrlMouseScroll$2;
    }

    @Override // x00.p
    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, c<? super g2> cVar) {
        return ((TransformableKt$detectZoomByCtrlMouseScroll$2) create(awaitPointerEventScope, cVar)).invokeSuspend(g2.f100423a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0089, code lost:
    
        if (r13 == r0) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b A[Catch: all -> 0x0017, TRY_ENTER, TryCatch #0 {all -> 0x0017, blocks: (B:7:0x0012, B:8:0x008c, B:10:0x0090, B:11:0x0055, B:18:0x003b, B:21:0x0048, B:28:0x0027), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0089 -> B:8:0x008c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r12.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2b
            if (r1 == r3) goto L23
            if (r1 != r2) goto L1b
            java.lang.Object r1 = r12.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
            kotlin.e.n(r13)     // Catch: java.lang.Throwable -> L17
            goto L8c
        L17:
            r0 = move-exception
            r13 = r0
            goto L9d
        L1b:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L23:
            java.lang.Object r1 = r12.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
            kotlin.e.n(r13)     // Catch: java.lang.Throwable -> L17
            goto L48
        L2b:
            kotlin.e.n(r13)
            java.lang.Object r13 = r12.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r13 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r13
            r1 = r13
        L33:
            kotlin.coroutines.d r13 = r12.$currentContext
            boolean r13 = c40.n2.D(r13)
            if (r13 == 0) goto La5
            androidx.compose.foundation.gestures.ScrollConfig r13 = r12.$scrollConfig     // Catch: java.lang.Throwable -> L17
            r12.L$0 = r1     // Catch: java.lang.Throwable -> L17
            r12.label = r3     // Catch: java.lang.Throwable -> L17
            java.lang.Object r13 = androidx.compose.foundation.gestures.TransformableKt.access$awaitFirstCtrlMouseScroll(r1, r13, r12)     // Catch: java.lang.Throwable -> L17
            if (r13 != r0) goto L48
            goto L8b
        L48:
            androidx.compose.ui.geometry.Offset r13 = (androidx.compose.ui.geometry.Offset) r13     // Catch: java.lang.Throwable -> L17
            long r4 = r13.m2278unboximpl()     // Catch: java.lang.Throwable -> L17
            e40.o<androidx.compose.foundation.gestures.TransformEvent> r13 = r12.$channel     // Catch: java.lang.Throwable -> L17
            androidx.compose.foundation.gestures.TransformEvent$TransformStarted r6 = androidx.compose.foundation.gestures.TransformEvent.TransformStarted.INSTANCE     // Catch: java.lang.Throwable -> L17
            r13.m(r6)     // Catch: java.lang.Throwable -> L17
        L55:
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r6
            int r13 = (int) r4     // Catch: java.lang.Throwable -> L17
            float r13 = java.lang.Float.intBitsToFloat(r13)     // Catch: java.lang.Throwable -> L17
            r4 = 1141391360(0x44084000, float:545.0)
            float r13 = r13 / r4
            r4 = 1073741824(0x40000000, float:2.0)
            double r4 = (double) r4     // Catch: java.lang.Throwable -> L17
            double r6 = (double) r13     // Catch: java.lang.Throwable -> L17
            double r4 = java.lang.Math.pow(r4, r6)     // Catch: java.lang.Throwable -> L17
            float r7 = (float) r4     // Catch: java.lang.Throwable -> L17
            e40.o<androidx.compose.foundation.gestures.TransformEvent> r13 = r12.$channel     // Catch: java.lang.Throwable -> L17
            androidx.compose.foundation.gestures.TransformEvent$TransformDelta r6 = new androidx.compose.foundation.gestures.TransformEvent$TransformDelta     // Catch: java.lang.Throwable -> L17
            androidx.compose.ui.geometry.Offset$Companion r4 = androidx.compose.ui.geometry.Offset.Companion     // Catch: java.lang.Throwable -> L17
            long r8 = r4.m2284getZeroF1C5BW0()     // Catch: java.lang.Throwable -> L17
            r10 = 0
            r11 = 0
            r6.<init>(r7, r8, r10, r11)     // Catch: java.lang.Throwable -> L17
            r13.m(r6)     // Catch: java.lang.Throwable -> L17
            androidx.compose.foundation.gestures.ScrollConfig r13 = r12.$scrollConfig     // Catch: java.lang.Throwable -> L17
            r12.L$0 = r1     // Catch: java.lang.Throwable -> L17
            r12.label = r2     // Catch: java.lang.Throwable -> L17
            java.lang.Object r13 = androidx.compose.foundation.gestures.TransformableKt.access$awaitCtrlMouseScrollOrNull(r1, r13, r12)     // Catch: java.lang.Throwable -> L17
            if (r13 != r0) goto L8c
        L8b:
            return r0
        L8c:
            androidx.compose.ui.geometry.Offset r13 = (androidx.compose.ui.geometry.Offset) r13     // Catch: java.lang.Throwable -> L17
            if (r13 == 0) goto L95
            long r4 = r13.m2278unboximpl()     // Catch: java.lang.Throwable -> L17
            goto L55
        L95:
            e40.o<androidx.compose.foundation.gestures.TransformEvent> r13 = r12.$channel
            androidx.compose.foundation.gestures.TransformEvent$TransformStopped r4 = androidx.compose.foundation.gestures.TransformEvent.TransformStopped.INSTANCE
            r13.m(r4)
            goto L33
        L9d:
            e40.o<androidx.compose.foundation.gestures.TransformEvent> r0 = r12.$channel
            androidx.compose.foundation.gestures.TransformEvent$TransformStopped r1 = androidx.compose.foundation.gestures.TransformEvent.TransformStopped.INSTANCE
            r0.m(r1)
            throw r13
        La5:
            yz.g2 r13 = yz.g2.f100423a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableKt$detectZoomByCtrlMouseScroll$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
