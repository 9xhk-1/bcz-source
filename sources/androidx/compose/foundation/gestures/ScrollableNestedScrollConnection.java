package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class ScrollableNestedScrollConnection implements NestedScrollConnection {
    private boolean enabled;

    @k
    private final ScrollingLogic scrollingLogic;

    public ScrollableNestedScrollConnection(@k ScrollingLogic scrollingLogic, boolean z11) {
        this.scrollingLogic = scrollingLogic;
        this.enabled = z11;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @k
    public final ScrollingLogic getScrollingLogic() {
        return this.scrollingLogic;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0060, code lost:
    
        if (r5 == r8) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0074, code lost:
    
        if (r5 == r8) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    @m80.l
    /* renamed from: onPostFling-RZ2iAVY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo497onPostFlingRZ2iAVY(long r4, long r6, @m80.k j00.c<? super androidx.compose.ui.unit.Velocity> r8) {
        /*
            r3 = this;
            boolean r4 = r8 instanceof androidx.compose.foundation.gestures.ScrollableNestedScrollConnection$onPostFling$1
            if (r4 == 0) goto L13
            r4 = r8
            androidx.compose.foundation.gestures.ScrollableNestedScrollConnection$onPostFling$1 r4 = (androidx.compose.foundation.gestures.ScrollableNestedScrollConnection$onPostFling$1) r4
            int r5 = r4.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r5 & r0
            if (r1 == 0) goto L13
            int r5 = r5 - r0
            r4.label = r5
            goto L18
        L13:
            androidx.compose.foundation.gestures.ScrollableNestedScrollConnection$onPostFling$1 r4 = new androidx.compose.foundation.gestures.ScrollableNestedScrollConnection$onPostFling$1
            r4.<init>(r3, r8)
        L18:
            java.lang.Object r5 = r4.result
            java.lang.Object r8 = kotlin.coroutines.intrinsics.b.l()
            int r0 = r4.label
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L3c
            if (r0 == r2) goto L36
            if (r0 != r1) goto L2e
            long r6 = r4.J$0
            kotlin.e.n(r5)
            goto L77
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            long r6 = r4.J$0
            kotlin.e.n(r5)
            goto L63
        L3c:
            kotlin.e.n(r5)
            boolean r5 = r3.enabled
            if (r5 == 0) goto L82
            boolean r5 = androidx.compose.foundation.ComposeFoundationFlags.NewNestedFlingPropagationEnabled
            if (r5 == 0) goto L6a
            androidx.compose.foundation.gestures.ScrollingLogic r5 = r3.scrollingLogic
            boolean r5 = r5.isFlinging()
            if (r5 == 0) goto L56
            androidx.compose.ui.unit.Velocity$Companion r4 = androidx.compose.ui.unit.Velocity.Companion
            long r4 = r4.m5364getZero9UxMQ8M()
            goto L7d
        L56:
            androidx.compose.foundation.gestures.ScrollingLogic r5 = r3.scrollingLogic
            r4.J$0 = r6
            r4.label = r2
            java.lang.Object r5 = r5.m510doFlingAnimationQWom1Mo(r6, r4)
            if (r5 != r8) goto L63
            goto L76
        L63:
            androidx.compose.ui.unit.Velocity r5 = (androidx.compose.ui.unit.Velocity) r5
            long r4 = r5.m5362unboximpl()
            goto L7d
        L6a:
            androidx.compose.foundation.gestures.ScrollingLogic r5 = r3.scrollingLogic
            r4.J$0 = r6
            r4.label = r1
            java.lang.Object r5 = r5.m510doFlingAnimationQWom1Mo(r6, r4)
            if (r5 != r8) goto L77
        L76:
            return r8
        L77:
            androidx.compose.ui.unit.Velocity r5 = (androidx.compose.ui.unit.Velocity) r5
            long r4 = r5.m5362unboximpl()
        L7d:
            long r4 = androidx.compose.ui.unit.Velocity.m5356minusAH228Gc(r6, r4)
            goto L88
        L82:
            androidx.compose.ui.unit.Velocity$Companion r4 = androidx.compose.ui.unit.Velocity.Companion
            long r4 = r4.m5364getZero9UxMQ8M()
        L88:
            androidx.compose.ui.unit.Velocity r4 = androidx.compose.ui.unit.Velocity.m5344boximpl(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollableNestedScrollConnection.mo497onPostFlingRZ2iAVY(long, long, j00.c):java.lang.Object");
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M, reason: not valid java name */
    public long mo498onPostScrollDzOQY0M(long j11, long j12, int i11) {
        return this.enabled ? this.scrollingLogic.m512performRawScrollMKHz9U(j12) : Offset.Companion.m2284getZeroF1C5BW0();
    }

    public final void setEnabled(boolean z11) {
        this.enabled = z11;
    }
}
