package androidx.compose.foundation.gestures.snapping;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.pager.PageInfo;
import androidx.compose.foundation.pager.PagerLayoutInfo;
import androidx.compose.foundation.pager.PagerLayoutInfoKt;
import androidx.compose.foundation.pager.PagerSnapDistance;
import androidx.compose.foundation.pager.PagerState;
import g10.u;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.u0;
import m80.k;
import org.junit.jupiter.api.j2;
import x00.a;
import x00.q;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nPagerSnapLayoutInfoProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerSnapLayoutInfoProvider.kt\nandroidx/compose/foundation/gestures/snapping/PagerSnapLayoutInfoProviderKt\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,306:1\n222#1,4:313\n222#1,4:318\n222#1,4:322\n222#1,4:326\n222#1,4:330\n65#2:307\n69#2:310\n60#3:308\n70#3:311\n22#4:309\n22#4:312\n1#5:317\n*S KotlinDebug\n*F\n+ 1 PagerSnapLayoutInfoProvider.kt\nandroidx/compose/foundation/gestures/snapping/PagerSnapLayoutInfoProviderKt\n*L\n250#1:313,4\n272#1:318,4\n282#1:322,4\n288#1:326,4\n292#1:330,4\n216#1:307\n218#1:310\n216#1:308\n218#1:311\n216#1:309\n218#1:312\n*E\n"})
/* loaded from: classes.dex */
public final class PagerSnapLayoutInfoProviderKt {
    @k
    public static final SnapLayoutInfoProvider SnapLayoutInfoProvider(@k final PagerState pagerState, @k final PagerSnapDistance pagerSnapDistance, @k final q<? super Float, ? super Float, ? super Float, Float> qVar) {
        return new SnapLayoutInfoProvider() { // from class: androidx.compose.foundation.gestures.snapping.PagerSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1
            private final Pair<Float, Float> searchForSnappingBounds(SnapPosition snapPosition, float f11) {
                float f12;
                boolean isScrollingForward;
                boolean isScrollingForward2;
                List<PageInfo> visiblePagesInfo = getLayoutInfo().getVisiblePagesInfo();
                PagerState pagerState2 = PagerState.this;
                int size = visiblePagesInfo.size();
                int i11 = 0;
                float f13 = Float.NEGATIVE_INFINITY;
                float f14 = Float.POSITIVE_INFINITY;
                while (true) {
                    f12 = 0.0f;
                    if (i11 >= size) {
                        break;
                    }
                    PageInfo pageInfo = visiblePagesInfo.get(i11);
                    float calculateDistanceToDesiredSnapPosition = SnapPositionKt.calculateDistanceToDesiredSnapPosition(PagerLayoutInfoKt.getMainAxisViewportSize(getLayoutInfo()), getLayoutInfo().getBeforeContentPadding(), getLayoutInfo().getAfterContentPadding(), getLayoutInfo().getPageSize(), pageInfo.getOffset(), pageInfo.getIndex(), snapPosition, pagerState2.getPageCount());
                    if (calculateDistanceToDesiredSnapPosition <= 0.0f && calculateDistanceToDesiredSnapPosition > f13) {
                        f13 = calculateDistanceToDesiredSnapPosition;
                    }
                    if (calculateDistanceToDesiredSnapPosition >= 0.0f && calculateDistanceToDesiredSnapPosition < f14) {
                        f14 = calculateDistanceToDesiredSnapPosition;
                    }
                    i11++;
                }
                if (f13 == Float.NEGATIVE_INFINITY) {
                    f13 = f14;
                }
                if (f14 == Float.POSITIVE_INFINITY) {
                    f14 = f13;
                }
                if (!PagerState.this.getCanScrollForward()) {
                    isScrollingForward2 = PagerSnapLayoutInfoProviderKt.isScrollingForward(PagerState.this, f11);
                    if (isScrollingForward2) {
                        f13 = 0.0f;
                        f14 = 0.0f;
                    } else {
                        f14 = 0.0f;
                    }
                }
                if (PagerState.this.getCanScrollBackward()) {
                    f12 = f13;
                } else {
                    isScrollingForward = PagerSnapLayoutInfoProviderKt.isScrollingForward(PagerState.this, f11);
                    if (!isScrollingForward) {
                        f14 = 0.0f;
                    }
                }
                return h1.a(Float.valueOf(f12), Float.valueOf(f14));
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateApproachOffset(float f11, float f12) {
                int pageSize$foundation_release = PagerState.this.getPageSize$foundation_release() + PagerState.this.getPageSpacing$foundation_release();
                if (pageSize$foundation_release == 0) {
                    return 0.0f;
                }
                int firstVisiblePage$foundation_release = f11 < 0.0f ? PagerState.this.getFirstVisiblePage$foundation_release() + 1 : PagerState.this.getFirstVisiblePage$foundation_release();
                int u11 = u.u(Math.abs((u.I(pagerSnapDistance.calculateTargetPage(firstVisiblePage$foundation_release, u.I(((int) (f12 / pageSize$foundation_release)) + firstVisiblePage$foundation_release, 0, PagerState.this.getPageCount()), f11, PagerState.this.getPageSize$foundation_release(), PagerState.this.getPageSpacing$foundation_release()), 0, PagerState.this.getPageCount()) - firstVisiblePage$foundation_release) * pageSize$foundation_release) - pageSize$foundation_release, 0);
                return u11 == 0 ? u11 : u11 * Math.signum(f11);
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateSnapOffset(float f11) {
                Pair<Float, Float> searchForSnappingBounds = searchForSnappingBounds(PagerState.this.getLayoutInfo().getSnapPosition(), f11);
                float floatValue = searchForSnappingBounds.component1().floatValue();
                float floatValue2 = searchForSnappingBounds.component2().floatValue();
                float floatValue3 = qVar.invoke(Float.valueOf(f11), Float.valueOf(floatValue), Float.valueOf(floatValue2)).floatValue();
                if (!(floatValue3 == floatValue || floatValue3 == floatValue2 || floatValue3 == 0.0f)) {
                    InlineClassHelperKt.throwIllegalStateException("Final Snapping Offset Should Be one of " + floatValue + j2.O + floatValue2 + " or 0.0");
                }
                if (isValidDistance(floatValue3)) {
                    return floatValue3;
                }
                return 0.0f;
            }

            public final PagerLayoutInfo getLayoutInfo() {
                return PagerState.this.getLayoutInfo();
            }

            public final boolean isValidDistance(float f11) {
                return (f11 == Float.POSITIVE_INFINITY || f11 == Float.NEGATIVE_INFINITY) ? false : true;
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0086 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final float calculateFinalSnappingBound(@m80.k androidx.compose.foundation.pager.PagerState r5, @m80.k androidx.compose.ui.unit.LayoutDirection r6, float r7, float r8, float r9, float r10) {
        /*
            boolean r0 = isScrollingForward(r5, r8)
            androidx.compose.foundation.pager.PagerLayoutInfo r1 = r5.getLayoutInfo()
            androidx.compose.foundation.gestures.Orientation r1 = r1.getOrientation()
            androidx.compose.foundation.gestures.Orientation r2 = androidx.compose.foundation.gestures.Orientation.Vertical
            if (r1 != r2) goto L11
            goto L1b
        L11:
            androidx.compose.ui.unit.LayoutDirection r1 = androidx.compose.ui.unit.LayoutDirection.Ltr
            if (r6 != r1) goto L16
            goto L1b
        L16:
            if (r0 != 0) goto L1a
            r0 = 1
            goto L1b
        L1a:
            r0 = 0
        L1b:
            androidx.compose.foundation.pager.PagerLayoutInfo r6 = r5.getLayoutInfo()
            int r6 = r6.getPageSize()
            r1 = 0
            if (r6 != 0) goto L28
            r2 = r1
            goto L2e
        L28:
            float r2 = dragGestureDelta(r5)
            float r6 = (float) r6
            float r2 = r2 / r6
        L2e:
            int r6 = (int) r2
            float r6 = (float) r6
            float r6 = r2 - r6
            androidx.compose.ui.unit.Density r3 = r5.getDensity$foundation_release()
            int r8 = androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProviderKt.calculateFinalSnappingItem(r3, r8)
            androidx.compose.foundation.gestures.snapping.FinalSnappingItem$Companion r3 = androidx.compose.foundation.gestures.snapping.FinalSnappingItem.Companion
            int r4 = r3.m544getClosestItembbeMdSM()
            boolean r4 = androidx.compose.foundation.gestures.snapping.FinalSnappingItem.m540equalsimpl0(r8, r4)
            if (r4 == 0) goto L71
            float r6 = java.lang.Math.abs(r6)
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L51
            if (r0 == 0) goto L86
            goto L7b
        L51:
            float r6 = java.lang.Math.abs(r2)
            float r5 = r5.getPositionThresholdFraction$foundation_release()
            float r5 = java.lang.Math.abs(r5)
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 < 0) goto L64
            if (r0 == 0) goto L7b
            goto L86
        L64:
            float r5 = java.lang.Math.abs(r9)
            float r6 = java.lang.Math.abs(r10)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 >= 0) goto L7b
            goto L86
        L71:
            int r5 = r3.m545getNextItembbeMdSM()
            boolean r5 = androidx.compose.foundation.gestures.snapping.FinalSnappingItem.m540equalsimpl0(r8, r5)
            if (r5 == 0) goto L7c
        L7b:
            return r10
        L7c:
            int r5 = r3.m546getPreviousItembbeMdSM()
            boolean r5 = androidx.compose.foundation.gestures.snapping.FinalSnappingItem.m540equalsimpl0(r8, r5)
            if (r5 == 0) goto L87
        L86:
            return r9
        L87:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.PagerSnapLayoutInfoProviderKt.calculateFinalSnappingBound(androidx.compose.foundation.pager.PagerState, androidx.compose.ui.unit.LayoutDirection, float, float, float, float):float");
    }

    private static final float dragGestureDelta(PagerState pagerState) {
        return pagerState.getLayoutInfo().getOrientation() == Orientation.Horizontal ? Float.intBitsToFloat((int) (pagerState.m983getUpDownDifferenceF1C5BW0$foundation_release() >> 32)) : Float.intBitsToFloat((int) (pagerState.m983getUpDownDifferenceF1C5BW0$foundation_release() & 4294967295L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isScrollingForward(PagerState pagerState, float f11) {
        boolean reverseLayout = pagerState.getLayoutInfo().getReverseLayout();
        boolean z11 = (pagerState.isNotGestureAction$foundation_release() ? -f11 : dragGestureDelta(pagerState)) > 0.0f;
        return (z11 && reverseLayout) || !(z11 || reverseLayout);
    }

    private static final void debugLog(a<String> aVar) {
    }
}
