package androidx.compose.material;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.unit.Velocity;
import w00.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1 implements NestedScrollConnection {
    final /* synthetic */ Orientation $orientation;
    final /* synthetic */ AnchoredDraggableState<?> $state;

    public ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1(AnchoredDraggableState<?> anchoredDraggableState, Orientation orientation) {
        this.$state = anchoredDraggableState;
        this.$orientation = orientation;
    }

    @j(name = "offsetToFloat")
    private final float offsetToFloat(long j11) {
        return this.$orientation == Orientation.Horizontal ? Offset.m2268getXimpl(j11) : Offset.m2269getYimpl(j11);
    }

    private final long toOffset(float f11) {
        Orientation orientation = this.$orientation;
        float f12 = orientation == Orientation.Horizontal ? f11 : 0.0f;
        if (orientation != Orientation.Vertical) {
            f11 = 0.0f;
        }
        return OffsetKt.Offset(f12, f11);
    }

    @j(name = "velocityToFloat")
    private final float velocityToFloat(long j11) {
        return this.$orientation == Orientation.Horizontal ? Velocity.m5353getXimpl(j11) : Velocity.m5354getYimpl(j11);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo497onPostFlingRZ2iAVY(long r3, long r5, j00.c<? super androidx.compose.ui.unit.Velocity> r7) {
        /*
            r2 = this;
            boolean r3 = r7 instanceof androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1
            if (r3 == 0) goto L13
            r3 = r7
            androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1 r3 = (androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1) r3
            int r4 = r3.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r4 & r0
            if (r1 == 0) goto L13
            int r4 = r4 - r0
            r3.label = r4
            goto L18
        L13:
            androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1 r3 = new androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1
            r3.<init>(r2, r7)
        L18:
            java.lang.Object r4 = r3.result
            java.lang.Object r7 = kotlin.coroutines.intrinsics.b.l()
            int r0 = r3.label
            r1 = 1
            if (r0 == 0) goto L33
            if (r0 != r1) goto L2b
            long r5 = r3.J$0
            kotlin.e.n(r4)
            goto L47
        L2b:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L33:
            kotlin.e.n(r4)
            androidx.compose.material.AnchoredDraggableState<?> r4 = r2.$state
            float r0 = r2.velocityToFloat(r5)
            r3.J$0 = r5
            r3.label = r1
            java.lang.Object r3 = r4.settle(r0, r3)
            if (r3 != r7) goto L47
            return r7
        L47:
            androidx.compose.ui.unit.Velocity r3 = androidx.compose.ui.unit.Velocity.m5344boximpl(r5)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1.mo497onPostFlingRZ2iAVY(long, long, j00.c):java.lang.Object");
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo498onPostScrollDzOQY0M(long j11, long j12, int i11) {
        return NestedScrollSource.m3613equalsimpl0(i11, NestedScrollSource.Companion.m3625getUserInputWNlRxjI()) ? toOffset(this.$state.dispatchRawDelta(offsetToFloat(j12))) : Offset.Companion.m2284getZeroF1C5BW0();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreFling-QWom1Mo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo803onPreFlingQWom1Mo(long r6, j00.c<? super androidx.compose.ui.unit.Velocity> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1 r0 = (androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1 r0 = new androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            long r6 = r0.J$0
            kotlin.e.n(r8)
            goto L66
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            kotlin.e.n(r8)
            float r8 = r5.velocityToFloat(r6)
            androidx.compose.material.AnchoredDraggableState<?> r2 = r5.$state
            float r2 = r2.requireOffset()
            r4 = 0
            int r4 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r4 >= 0) goto L60
            androidx.compose.material.AnchoredDraggableState<?> r4 = r5.$state
            androidx.compose.material.DraggableAnchors r4 = r4.getAnchors()
            float r4 = r4.minAnchor()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L60
            androidx.compose.material.AnchoredDraggableState<?> r2 = r5.$state
            r0.J$0 = r6
            r0.label = r3
            java.lang.Object r8 = r2.settle(r8, r0)
            if (r8 != r1) goto L66
            return r1
        L60:
            androidx.compose.ui.unit.Velocity$Companion r6 = androidx.compose.ui.unit.Velocity.Companion
            long r6 = r6.m5364getZero9UxMQ8M()
        L66:
            androidx.compose.ui.unit.Velocity r6 = androidx.compose.ui.unit.Velocity.m5344boximpl(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1.mo803onPreFlingQWom1Mo(long, j00.c):java.lang.Object");
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public long mo804onPreScrollOzD1aCk(long j11, int i11) {
        float offsetToFloat = offsetToFloat(j11);
        return (offsetToFloat >= 0.0f || !NestedScrollSource.m3613equalsimpl0(i11, NestedScrollSource.Companion.m3625getUserInputWNlRxjI())) ? Offset.Companion.m2284getZeroF1C5BW0() : toOffset(this.$state.dispatchRawDelta(offsetToFloat));
    }
}
