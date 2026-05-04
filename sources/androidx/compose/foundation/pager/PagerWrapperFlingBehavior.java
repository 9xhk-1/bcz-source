package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class PagerWrapperFlingBehavior implements FlingBehavior {

    @k
    private final TargetedFlingBehavior originalFlingBehavior;

    @k
    private final PagerState pagerState;

    public PagerWrapperFlingBehavior(@k TargetedFlingBehavior targetedFlingBehavior, @k PagerState pagerState) {
        this.originalFlingBehavior = targetedFlingBehavior;
        this.pagerState = pagerState;
    }

    @k
    public final TargetedFlingBehavior getOriginalFlingBehavior() {
        return this.originalFlingBehavior;
    }

    @k
    public final PagerState getPagerState() {
        return this.pagerState;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // androidx.compose.foundation.gestures.FlingBehavior
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object performFling(@m80.k final androidx.compose.foundation.gestures.ScrollScope r6, float r7, @m80.k j00.c<? super java.lang.Float> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof androidx.compose.foundation.pager.PagerWrapperFlingBehavior$performFling$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.pager.PagerWrapperFlingBehavior$performFling$1 r0 = (androidx.compose.foundation.pager.PagerWrapperFlingBehavior$performFling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.pager.PagerWrapperFlingBehavior$performFling$1 r0 = new androidx.compose.foundation.pager.PagerWrapperFlingBehavior$performFling$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r6 = r0.L$0
            androidx.compose.foundation.pager.PagerWrapperFlingBehavior r6 = (androidx.compose.foundation.pager.PagerWrapperFlingBehavior) r6
            kotlin.e.n(r8)
            goto L4b
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            kotlin.e.n(r8)
            androidx.compose.foundation.gestures.TargetedFlingBehavior r8 = r5.originalFlingBehavior
            androidx.compose.foundation.pager.PagerWrapperFlingBehavior$performFling$resultVelocity$1$1 r2 = new androidx.compose.foundation.pager.PagerWrapperFlingBehavior$performFling$resultVelocity$1$1
            r2.<init>()
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r8 = r8.performFling(r6, r7, r2, r0)
            if (r8 != r1) goto L4a
            return r1
        L4a:
            r6 = r5
        L4b:
            java.lang.Number r8 = (java.lang.Number) r8
            float r7 = r8.floatValue()
            androidx.compose.foundation.pager.PagerState r8 = r6.pagerState
            float r8 = r8.getCurrentPageOffsetFraction()
            r0 = 0
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r8 != 0) goto L5d
            goto L7d
        L5d:
            androidx.compose.foundation.pager.PagerState r8 = r6.pagerState
            float r8 = r8.getCurrentPageOffsetFraction()
            float r8 = java.lang.Math.abs(r8)
            double r1 = (double) r8
            r3 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            int r8 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r8 >= 0) goto L7d
            androidx.compose.foundation.pager.PagerState r6 = r6.pagerState
            int r8 = r6.getCurrentPage()
            r1 = 2
            r2 = 0
            androidx.compose.foundation.pager.PagerState.requestScrollToPage$default(r6, r8, r0, r1, r2)
            goto L82
        L7d:
            androidx.compose.foundation.pager.PagerState r6 = r6.pagerState
            r6.getCurrentPageOffsetFraction()
        L82:
            java.lang.Float r6 = l00.a.e(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerWrapperFlingBehavior.performFling(androidx.compose.foundation.gestures.ScrollScope, float, j00.c):java.lang.Object");
    }
}
