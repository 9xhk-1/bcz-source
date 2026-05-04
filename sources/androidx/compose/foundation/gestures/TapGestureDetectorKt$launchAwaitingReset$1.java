package androidx.compose.foundation.gestures;

import c40.l2;
import c40.r0;
import j00.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$launchAwaitingReset$1", f = "TapGestureDetector.kt", i = {0}, l = {502, 504}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
/* loaded from: classes.dex */
public final class TapGestureDetectorKt$launchAwaitingReset$1 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
    final /* synthetic */ p<r0, c<? super g2>, Object> $block;
    final /* synthetic */ l2 $resetJob;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TapGestureDetectorKt$launchAwaitingReset$1(l2 l2Var, p<? super r0, ? super c<? super g2>, ? extends Object> pVar, c<? super TapGestureDetectorKt$launchAwaitingReset$1> cVar) {
        super(2, cVar);
        this.$resetJob = l2Var;
        this.$block = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        TapGestureDetectorKt$launchAwaitingReset$1 tapGestureDetectorKt$launchAwaitingReset$1 = new TapGestureDetectorKt$launchAwaitingReset$1(this.$resetJob, this.$block, cVar);
        tapGestureDetectorKt$launchAwaitingReset$1.L$0 = obj;
        return tapGestureDetectorKt$launchAwaitingReset$1;
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, c<? super g2> cVar) {
        return ((TapGestureDetectorKt$launchAwaitingReset$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
    
        if (r5.invoke(r1, r4) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
    
        if (r5.K0(r4) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.e.n(r5)
            goto L49
        L12:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L1a:
            java.lang.Object r1 = r4.L$0
            c40.r0 r1 = (c40.r0) r1
            kotlin.e.n(r5)
            goto L3b
        L22:
            kotlin.e.n(r5)
            java.lang.Object r5 = r4.L$0
            r1 = r5
            c40.r0 r1 = (c40.r0) r1
            boolean r5 = androidx.compose.foundation.ComposeFoundationFlags.isDetectTapGesturesImmediateCoroutineDispatchEnabled
            if (r5 == 0) goto L3b
            c40.l2 r5 = r4.$resetJob
            r4.L$0 = r1
            r4.label = r3
            java.lang.Object r5 = r5.K0(r4)
            if (r5 != r0) goto L3b
            goto L48
        L3b:
            x00.p<c40.r0, j00.c<? super yz.g2>, java.lang.Object> r5 = r4.$block
            r3 = 0
            r4.L$0 = r3
            r4.label = r2
            java.lang.Object r5 = r5.invoke(r1, r4)
            if (r5 != r0) goto L49
        L48:
            return r0
        L49:
            yz.g2 r5 = yz.g2.f100423a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt$launchAwaitingReset$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
