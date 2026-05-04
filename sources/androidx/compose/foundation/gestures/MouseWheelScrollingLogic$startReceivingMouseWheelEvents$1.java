package androidx.compose.foundation.gestures;

import c40.r0;
import j00.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.u0;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1", f = "MouseWheelScrollable.kt", i = {0, 1}, l = {107, 110}, m = "invokeSuspend", n = {"$this$launch", "$this$launch"}, s = {"L$0", "L$0"})
@u0({"SMAP\nMouseWheelScrollable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MouseWheelScrollable.kt\nandroidx/compose/foundation/gestures/MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,363:1\n1#2:364\n*E\n"})
/* loaded from: classes.dex */
public final class MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MouseWheelScrollingLogic this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1(MouseWheelScrollingLogic mouseWheelScrollingLogic, c<? super MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1> cVar) {
        super(2, cVar);
        this.this$0 = mouseWheelScrollingLogic;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1 mouseWheelScrollingLogic$startReceivingMouseWheelEvents$1 = new MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1(this.this$0, cVar);
        mouseWheelScrollingLogic$startReceivingMouseWheelEvents$1.L$0 = obj;
        return mouseWheelScrollingLogic$startReceivingMouseWheelEvents$1;
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, c<? super g2> cVar) {
        return ((MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0017  */
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
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L2e
            if (r1 == r4) goto L26
            if (r1 != r3) goto L1e
            java.lang.Object r1 = r12.L$0
            c40.r0 r1 = (c40.r0) r1
            kotlin.e.n(r13)     // Catch: java.lang.Throwable -> L19
            r10 = r12
        L17:
            r13 = r1
            goto L35
        L19:
            r0 = move-exception
            r13 = r0
            r10 = r12
            goto L94
        L1e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L26:
            java.lang.Object r1 = r12.L$0
            c40.r0 r1 = (c40.r0) r1
            kotlin.e.n(r13)     // Catch: java.lang.Throwable -> L19
            goto L54
        L2e:
            kotlin.e.n(r13)
            java.lang.Object r13 = r12.L$0
            c40.r0 r13 = (c40.r0) r13
        L35:
            kotlin.coroutines.d r1 = r13.getCoroutineContext()     // Catch: java.lang.Throwable -> L88
            boolean r1 = c40.n2.D(r1)     // Catch: java.lang.Throwable -> L88
            if (r1 == 0) goto L8b
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic r1 = r12.this$0     // Catch: java.lang.Throwable -> L88
            e40.o r1 = androidx.compose.foundation.gestures.MouseWheelScrollingLogic.access$getChannel$p(r1)     // Catch: java.lang.Throwable -> L88
            r12.L$0 = r13     // Catch: java.lang.Throwable -> L88
            r12.label = r4     // Catch: java.lang.Throwable -> L88
            java.lang.Object r1 = r1.H(r12)     // Catch: java.lang.Throwable -> L88
            if (r1 != r0) goto L51
            r10 = r12
            goto L84
        L51:
            r11 = r1
            r1 = r13
            r13 = r11
        L54:
            r7 = r13
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic$MouseWheelScrollDelta r7 = (androidx.compose.foundation.gestures.MouseWheelScrollingLogic.MouseWheelScrollDelta) r7     // Catch: java.lang.Throwable -> L88
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic r13 = r12.this$0     // Catch: java.lang.Throwable -> L88
            androidx.compose.ui.unit.Density r13 = androidx.compose.foundation.gestures.MouseWheelScrollingLogic.access$getDensity$p(r13)     // Catch: java.lang.Throwable -> L88
            float r5 = androidx.compose.foundation.gestures.MouseWheelScrollableKt.access$getAnimationThreshold$p()     // Catch: java.lang.Throwable -> L88
            float r8 = r13.mo377toPx0680j_4(r5)     // Catch: java.lang.Throwable -> L88
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic r13 = r12.this$0     // Catch: java.lang.Throwable -> L88
            androidx.compose.ui.unit.Density r13 = androidx.compose.foundation.gestures.MouseWheelScrollingLogic.access$getDensity$p(r13)     // Catch: java.lang.Throwable -> L88
            float r5 = androidx.compose.foundation.gestures.MouseWheelScrollableKt.access$getAnimationSpeed$p()     // Catch: java.lang.Throwable -> L88
            float r9 = r13.mo377toPx0680j_4(r5)     // Catch: java.lang.Throwable -> L88
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic r5 = r12.this$0     // Catch: java.lang.Throwable -> L88
            androidx.compose.foundation.gestures.ScrollingLogic r6 = androidx.compose.foundation.gestures.MouseWheelScrollingLogic.access$getScrollingLogic$p(r5)     // Catch: java.lang.Throwable -> L88
            r12.L$0 = r1     // Catch: java.lang.Throwable -> L88
            r12.label = r3     // Catch: java.lang.Throwable -> L88
            r10 = r12
            java.lang.Object r13 = androidx.compose.foundation.gestures.MouseWheelScrollingLogic.access$dispatchMouseWheelScroll(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L85
            if (r13 != r0) goto L17
        L84:
            return r0
        L85:
            r0 = move-exception
        L86:
            r13 = r0
            goto L94
        L88:
            r0 = move-exception
            r10 = r12
            goto L86
        L8b:
            r10 = r12
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic r13 = r10.this$0
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic.access$setReceivingMouseWheelEventsJob$p(r13, r2)
            yz.g2 r13 = yz.g2.f100423a
            return r13
        L94:
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic r0 = r10.this$0
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic.access$setReceivingMouseWheelEventsJob$p(r0, r2)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
