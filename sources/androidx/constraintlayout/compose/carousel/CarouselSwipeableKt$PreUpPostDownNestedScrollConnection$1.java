package androidx.constraintlayout.compose.carousel;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class CarouselSwipeableKt$PreUpPostDownNestedScrollConnection$1 implements NestedScrollConnection {
    final /* synthetic */ CarouselSwipeableState<T> $this_PreUpPostDownNestedScrollConnection;

    public CarouselSwipeableKt$PreUpPostDownNestedScrollConnection$1(CarouselSwipeableState<T> carouselSwipeableState) {
        this.$this_PreUpPostDownNestedScrollConnection = carouselSwipeableState;
    }

    private final float toFloat(long j11) {
        return Offset.m2269getYimpl(j11);
    }

    private final long toOffset(float f11) {
        return OffsetKt.Offset(0.0f, f11);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo497onPostFlingRZ2iAVY(long r5, long r7, j00.c<? super androidx.compose.ui.unit.Velocity> r9) {
        /*
            r4 = this;
            boolean r5 = r9 instanceof androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1
            if (r5 == 0) goto L13
            r5 = r9
            androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1 r5 = (androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1) r5
            int r6 = r5.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r6 & r0
            if (r1 == 0) goto L13
            int r6 = r6 - r0
            r5.label = r6
            goto L18
        L13:
            androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1 r5 = new androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1
            r5.<init>(r4, r9)
        L18:
            java.lang.Object r6 = r5.result
            java.lang.Object r9 = kotlin.coroutines.intrinsics.b.l()
            int r0 = r5.label
            r1 = 1
            if (r0 == 0) goto L33
            if (r0 != r1) goto L2b
            long r7 = r5.J$0
            kotlin.e.n(r6)
            goto L53
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.e.n(r6)
            androidx.constraintlayout.compose.carousel.CarouselSwipeableState<T> r6 = r4.$this_PreUpPostDownNestedScrollConnection
            float r0 = androidx.compose.ui.unit.Velocity.m5353getXimpl(r7)
            float r2 = androidx.compose.ui.unit.Velocity.m5354getYimpl(r7)
            long r2 = androidx.compose.ui.geometry.OffsetKt.Offset(r0, r2)
            float r0 = r4.toFloat(r2)
            r5.J$0 = r7
            r5.label = r1
            java.lang.Object r5 = r6.performFling(r0, r5)
            if (r5 != r9) goto L53
            return r9
        L53:
            androidx.compose.ui.unit.Velocity r5 = androidx.compose.ui.unit.Velocity.m5344boximpl(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$PreUpPostDownNestedScrollConnection$1.mo497onPostFlingRZ2iAVY(long, long, j00.c):java.lang.Object");
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo498onPostScrollDzOQY0M(long j11, long j12, int i11) {
        return NestedScrollSource.m3613equalsimpl0(i11, NestedScrollSource.Companion.m3625getUserInputWNlRxjI()) ? toOffset(this.$this_PreUpPostDownNestedScrollConnection.performDrag(toFloat(j12))) : Offset.Companion.m2284getZeroF1C5BW0();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreFling-QWom1Mo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo803onPreFlingQWom1Mo(long r7, j00.c<? super androidx.compose.ui.unit.Velocity> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1 r0 = (androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1 r0 = new androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            long r7 = r0.J$0
            kotlin.e.n(r9)
            goto L72
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            kotlin.e.n(r9)
            float r9 = androidx.compose.ui.unit.Velocity.m5353getXimpl(r7)
            float r2 = androidx.compose.ui.unit.Velocity.m5354getYimpl(r7)
            long r4 = androidx.compose.ui.geometry.OffsetKt.Offset(r9, r2)
            float r9 = r6.toFloat(r4)
            r2 = 0
            int r2 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r2 >= 0) goto L6c
            androidx.constraintlayout.compose.carousel.CarouselSwipeableState<T> r2 = r6.$this_PreUpPostDownNestedScrollConnection
            androidx.compose.runtime.FloatState r2 = r2.getOffset()
            float r2 = r2.getFloatValue()
            androidx.constraintlayout.compose.carousel.CarouselSwipeableState<T> r4 = r6.$this_PreUpPostDownNestedScrollConnection
            float r4 = r4.getMinBound$constraintlayout_compose_release()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L6c
            androidx.constraintlayout.compose.carousel.CarouselSwipeableState<T> r2 = r6.$this_PreUpPostDownNestedScrollConnection
            r0.J$0 = r7
            r0.label = r3
            java.lang.Object r9 = r2.performFling(r9, r0)
            if (r9 != r1) goto L72
            return r1
        L6c:
            androidx.compose.ui.unit.Velocity$Companion r7 = androidx.compose.ui.unit.Velocity.Companion
            long r7 = r7.m5364getZero9UxMQ8M()
        L72:
            androidx.compose.ui.unit.Velocity r7 = androidx.compose.ui.unit.Velocity.m5344boximpl(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$PreUpPostDownNestedScrollConnection$1.mo803onPreFlingQWom1Mo(long, j00.c):java.lang.Object");
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public long mo804onPreScrollOzD1aCk(long j11, int i11) {
        float f11 = toFloat(j11);
        return (f11 >= 0.0f || !NestedScrollSource.m3613equalsimpl0(i11, NestedScrollSource.Companion.m3625getUserInputWNlRxjI())) ? Offset.Companion.m2284getZeroF1C5BW0() : toOffset(this.$this_PreUpPostDownNestedScrollConnection.performDrag(f11));
    }
}
