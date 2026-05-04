package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.unit.Velocity;
import g10.u;
import j00.c;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nPager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pager.kt\nandroidx/compose/foundation/pager/DefaultPagerNestedScrollConnection\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,592:1\n65#2:593\n69#2:596\n65#2:598\n69#2:601\n65#2:604\n69#2:607\n60#3:594\n70#3:597\n60#3:599\n70#3:602\n60#3:605\n70#3:608\n22#4:595\n22#4:600\n22#4:603\n22#4:606\n*S KotlinDebug\n*F\n+ 1 Pager.kt\nandroidx/compose/foundation/pager/DefaultPagerNestedScrollConnection\n*L\n505#1:593\n505#1:596\n510#1:598\n511#1:601\n534#1:604\n534#1:607\n505#1:594\n505#1:597\n510#1:599\n511#1:602\n534#1:605\n534#1:608\n505#1:595\n510#1:600\n511#1:603\n534#1:606\n*E\n"})
/* loaded from: classes.dex */
final class DefaultPagerNestedScrollConnection implements NestedScrollConnection {

    @k
    private final Orientation orientation;

    @k
    private final PagerState state;

    public DefaultPagerNestedScrollConnection(@k PagerState pagerState, @k Orientation orientation) {
        this.state = pagerState;
        this.orientation = orientation;
    }

    /* renamed from: mainAxis-k-4lQ0M, reason: not valid java name */
    private final float m964mainAxisk4lQ0M(long j11) {
        return Float.intBitsToFloat((int) (this.orientation == Orientation.Horizontal ? j11 >> 32 : j11 & 4294967295L));
    }

    /* renamed from: consumeOnOrientation-QWom1Mo, reason: not valid java name */
    public final long m965consumeOnOrientationQWom1Mo(long j11, @k Orientation orientation) {
        return orientation == Orientation.Vertical ? Velocity.m5349copyOhffZ5M$default(j11, 0.0f, 0.0f, 2, null) : Velocity.m5349copyOhffZ5M$default(j11, 0.0f, 0.0f, 1, null);
    }

    @k
    public final Orientation getOrientation() {
        return this.orientation;
    }

    @k
    public final PagerState getState() {
        return this.state;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    @l
    /* renamed from: onPostFling-RZ2iAVY */
    public Object mo497onPostFlingRZ2iAVY(long j11, long j12, @k c<? super Velocity> cVar) {
        return Velocity.m5344boximpl(m965consumeOnOrientationQWom1Mo(j12, this.orientation));
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo498onPostScrollDzOQY0M(long j11, long j12, int i11) {
        if (!NestedScrollSource.m3613equalsimpl0(i11, NestedScrollSource.Companion.m3624getSideEffectWNlRxjI()) || m964mainAxisk4lQ0M(j12) == 0.0f) {
            return Offset.Companion.m2284getZeroF1C5BW0();
        }
        throw new CancellationException("Scroll cancelled");
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public long mo804onPreScrollOzD1aCk(long j11, int i11) {
        if (!NestedScrollSource.m3613equalsimpl0(i11, NestedScrollSource.Companion.m3625getUserInputWNlRxjI()) || Math.abs(this.state.getCurrentPageOffsetFraction()) <= 1.0E-6d) {
            return Offset.Companion.m2284getZeroF1C5BW0();
        }
        float currentPageOffsetFraction = this.state.getCurrentPageOffsetFraction() * this.state.getPageSize$foundation_release();
        float pageSize = ((this.state.getLayoutInfo().getPageSize() + this.state.getLayoutInfo().getPageSpacing()) * (-Math.signum(this.state.getCurrentPageOffsetFraction()))) + currentPageOffsetFraction;
        if (this.state.getCurrentPageOffsetFraction() > 0.0f) {
            pageSize = currentPageOffsetFraction;
            currentPageOffsetFraction = pageSize;
        }
        Orientation orientation = this.orientation;
        Orientation orientation2 = Orientation.Horizontal;
        float f11 = -this.state.dispatchRawDelta(-u.H(Float.intBitsToFloat((int) (orientation == orientation2 ? j11 >> 32 : j11 & 4294967295L)), currentPageOffsetFraction, pageSize));
        float intBitsToFloat = this.orientation == orientation2 ? f11 : Float.intBitsToFloat((int) (j11 >> 32));
        if (this.orientation != Orientation.Vertical) {
            f11 = Float.intBitsToFloat((int) (j11 & 4294967295L));
        }
        return Offset.m2261copydBAh8RU(j11, intBitsToFloat, f11);
    }
}
