package androidx.compose.ui.input.nestedscroll;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import c40.r0;
import m80.k;
import m80.l;
import x00.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class NestedScrollDispatcher {
    public static final int $stable = 8;

    @k
    private a<? extends r0> calculateNestedScrollScope = new a<r0>() { // from class: androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$calculateNestedScrollScope$1
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        public final r0 invoke() {
            return NestedScrollDispatcher.this.getScope$ui_release();
        }
    };

    @l
    private NestedScrollNode lastKnownParentNode;

    @l
    private NestedScrollNode nestedScrollNode;

    @l
    private r0 scope;

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0053, code lost:
    
        if (r12 == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0074, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0072, code lost:
    
        if (r12 == r0) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @m80.l
    /* renamed from: dispatchPostFling-RZ2iAVY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m3606dispatchPostFlingRZ2iAVY(long r8, long r10, @m80.k j00.c<? super androidx.compose.ui.unit.Velocity> r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1
            if (r0 == 0) goto L14
            r0 = r12
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1 r0 = (androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1 r0 = new androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1
            r0.<init>(r7, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3a
            if (r1 == r3) goto L36
            if (r1 != r2) goto L2e
            kotlin.e.n(r12)
            goto L75
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            kotlin.e.n(r12)
            goto L56
        L3a:
            kotlin.e.n(r12)
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r12 = r7.getParent$ui_release()
            if (r12 != 0) goto L64
            boolean r12 = androidx.compose.ui.ComposeUiFlags.NewNestedScrollFlingDispatchingEnabled
            if (r12 == 0) goto L64
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r1 = r7.lastKnownParentNode
            if (r1 == 0) goto L5d
            r6.label = r3
            r2 = r8
            r4 = r10
            java.lang.Object r12 = r1.mo497onPostFlingRZ2iAVY(r2, r4, r6)
            if (r12 != r0) goto L56
            goto L74
        L56:
            androidx.compose.ui.unit.Velocity r12 = (androidx.compose.ui.unit.Velocity) r12
            long r8 = r12.m5362unboximpl()
            goto L82
        L5d:
            androidx.compose.ui.unit.Velocity$Companion r8 = androidx.compose.ui.unit.Velocity.Companion
            long r8 = r8.m5364getZero9UxMQ8M()
            goto L82
        L64:
            r4 = r10
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r1 = r7.getParent$ui_release()
            if (r1 == 0) goto L7c
            r6.label = r2
            r2 = r8
            java.lang.Object r12 = r1.mo497onPostFlingRZ2iAVY(r2, r4, r6)
            if (r12 != r0) goto L75
        L74:
            return r0
        L75:
            androidx.compose.ui.unit.Velocity r12 = (androidx.compose.ui.unit.Velocity) r12
            long r8 = r12.m5362unboximpl()
            goto L82
        L7c:
            androidx.compose.ui.unit.Velocity$Companion r8 = androidx.compose.ui.unit.Velocity.Companion
            long r8 = r8.m5364getZero9UxMQ8M()
        L82:
            androidx.compose.ui.unit.Velocity r8 = androidx.compose.ui.unit.Velocity.m5344boximpl(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher.m3606dispatchPostFlingRZ2iAVY(long, long, j00.c):java.lang.Object");
    }

    /* renamed from: dispatchPostScroll-DzOQY0M, reason: not valid java name */
    public final long m3607dispatchPostScrollDzOQY0M(long j11, long j12, int i11) {
        NestedScrollConnection parent$ui_release = getParent$ui_release();
        return parent$ui_release != null ? parent$ui_release.mo498onPostScrollDzOQY0M(j11, j12, i11) : Offset.Companion.m2284getZeroF1C5BW0();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /* renamed from: dispatchPreFling-QWom1Mo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m3608dispatchPreFlingQWom1Mo(long r5, @m80.k j00.c<? super androidx.compose.ui.unit.Velocity> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1 r0 = (androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1 r0 = new androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.e.n(r7)
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.e.n(r7)
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r7 = r4.getParent$ui_release()
            if (r7 == 0) goto L4a
            r0.label = r3
            java.lang.Object r7 = r7.mo803onPreFlingQWom1Mo(r5, r0)
            if (r7 != r1) goto L43
            return r1
        L43:
            androidx.compose.ui.unit.Velocity r7 = (androidx.compose.ui.unit.Velocity) r7
            long r5 = r7.m5362unboximpl()
            goto L50
        L4a:
            androidx.compose.ui.unit.Velocity$Companion r5 = androidx.compose.ui.unit.Velocity.Companion
            long r5 = r5.m5364getZero9UxMQ8M()
        L50:
            androidx.compose.ui.unit.Velocity r5 = androidx.compose.ui.unit.Velocity.m5344boximpl(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher.m3608dispatchPreFlingQWom1Mo(long, j00.c):java.lang.Object");
    }

    /* renamed from: dispatchPreScroll-OzD1aCk, reason: not valid java name */
    public final long m3609dispatchPreScrollOzD1aCk(long j11, int i11) {
        NestedScrollConnection parent$ui_release = getParent$ui_release();
        return parent$ui_release != null ? parent$ui_release.mo804onPreScrollOzD1aCk(j11, i11) : Offset.Companion.m2284getZeroF1C5BW0();
    }

    @k
    public final a<r0> getCalculateNestedScrollScope$ui_release() {
        return this.calculateNestedScrollScope;
    }

    @k
    public final r0 getCoroutineScope() {
        r0 invoke = this.calculateNestedScrollScope.invoke();
        if (invoke != null) {
            return invoke;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    @l
    public final NestedScrollNode getLastKnownParentNode$ui_release() {
        return this.lastKnownParentNode;
    }

    @l
    public final NestedScrollNode getNestedScrollNode$ui_release() {
        return this.nestedScrollNode;
    }

    @l
    public final NestedScrollConnection getParent$ui_release() {
        NestedScrollNode nestedScrollNode = this.nestedScrollNode;
        if (nestedScrollNode != null) {
            return nestedScrollNode.getParentNestedScrollNode$ui_release();
        }
        return null;
    }

    @l
    public final r0 getScope$ui_release() {
        return this.scope;
    }

    public final void setCalculateNestedScrollScope$ui_release(@k a<? extends r0> aVar) {
        this.calculateNestedScrollScope = aVar;
    }

    public final void setLastKnownParentNode$ui_release(@l NestedScrollNode nestedScrollNode) {
        this.lastKnownParentNode = nestedScrollNode;
    }

    public final void setNestedScrollNode$ui_release(@l NestedScrollNode nestedScrollNode) {
        this.nestedScrollNode = nestedScrollNode;
    }

    public final void setScope$ui_release(@l r0 r0Var) {
        this.scope = r0Var;
    }
}
