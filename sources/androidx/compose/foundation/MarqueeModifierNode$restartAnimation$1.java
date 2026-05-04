package androidx.compose.foundation;

import c40.l2;
import c40.r0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.compose.foundation.MarqueeModifierNode$restartAnimation$1", f = "BasicMarquee.kt", i = {}, l = {379, 380}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class MarqueeModifierNode$restartAnimation$1 extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {
    final /* synthetic */ l2 $oldJob;
    int label;
    final /* synthetic */ MarqueeModifierNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarqueeModifierNode$restartAnimation$1(l2 l2Var, MarqueeModifierNode marqueeModifierNode, j00.c<? super MarqueeModifierNode$restartAnimation$1> cVar) {
        super(2, cVar);
        this.$oldJob = l2Var;
        this.this$0 = marqueeModifierNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        return new MarqueeModifierNode$restartAnimation$1(this.$oldJob, this.this$0, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
        return ((MarqueeModifierNode$restartAnimation$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (r5 == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002b, code lost:
    
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
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.e.n(r5)
            goto L39
        L12:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L1a:
            kotlin.e.n(r5)
            goto L2e
        L1e:
            kotlin.e.n(r5)
            c40.l2 r5 = r4.$oldJob
            if (r5 == 0) goto L2e
            r4.label = r3
            java.lang.Object r5 = r5.K0(r4)
            if (r5 != r0) goto L2e
            goto L38
        L2e:
            androidx.compose.foundation.MarqueeModifierNode r5 = r4.this$0
            r4.label = r2
            java.lang.Object r5 = androidx.compose.foundation.MarqueeModifierNode.access$runAnimation(r5, r4)
            if (r5 != r0) goto L39
        L38:
            return r0
        L39:
            yz.g2 r5 = yz.g2.f100423a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.MarqueeModifierNode$restartAnimation$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
