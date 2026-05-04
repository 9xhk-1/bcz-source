package androidx.compose.foundation.gestures.snapping;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListLayoutInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.unit.Density;
import g10.u;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLazyListSnapLayoutInfoProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListSnapLayoutInfoProvider.kt\nandroidx/compose/foundation/gestures/snapping/LazyListSnapLayoutInfoProviderKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,145:1\n1247#2,6:146\n59#3:152\n54#3:154\n90#4:153\n85#4:155\n*S KotlinDebug\n*F\n+ 1 LazyListSnapLayoutInfoProvider.kt\nandroidx/compose/foundation/gestures/snapping/LazyListSnapLayoutInfoProviderKt\n*L\n118#1:146,6\n123#1:152\n123#1:154\n123#1:153\n123#1:155\n*E\n"})
/* loaded from: classes.dex */
public final class LazyListSnapLayoutInfoProviderKt {
    @k
    public static final SnapLayoutInfoProvider SnapLayoutInfoProvider(@k final LazyListState lazyListState, @k final SnapPosition snapPosition) {
        return new SnapLayoutInfoProvider() { // from class: androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1
            private final int getAverageItemSize() {
                LazyListLayoutInfo layoutInfo = getLayoutInfo();
                int i11 = 0;
                if (layoutInfo.getVisibleItemsInfo().isEmpty()) {
                    return 0;
                }
                int size = layoutInfo.getVisibleItemsInfo().size();
                Iterator<T> it = layoutInfo.getVisibleItemsInfo().iterator();
                while (it.hasNext()) {
                    i11 += ((LazyListItemInfo) it.next()).getSize();
                }
                return i11 / size;
            }

            private final LazyListLayoutInfo getLayoutInfo() {
                return LazyListState.this.getLayoutInfo();
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateApproachOffset(float f11, float f12) {
                return u.t(Math.abs(f12) - getAverageItemSize(), 0.0f) * Math.signum(f12);
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateSnapOffset(float f11) {
                List<LazyListItemInfo> visibleItemsInfo = getLayoutInfo().getVisibleItemsInfo();
                SnapPosition snapPosition2 = snapPosition;
                int size = visibleItemsInfo.size();
                float f12 = Float.NEGATIVE_INFINITY;
                float f13 = Float.POSITIVE_INFINITY;
                for (int i11 = 0; i11 < size; i11++) {
                    LazyListItemInfo lazyListItemInfo = visibleItemsInfo.get(i11);
                    LazyLayoutMeasuredItem lazyLayoutMeasuredItem = lazyListItemInfo instanceof LazyLayoutMeasuredItem ? (LazyLayoutMeasuredItem) lazyListItemInfo : null;
                    if (lazyLayoutMeasuredItem == null || !lazyLayoutMeasuredItem.getNonScrollableItem()) {
                        float calculateDistanceToDesiredSnapPosition = SnapPositionKt.calculateDistanceToDesiredSnapPosition(LazyListSnapLayoutInfoProviderKt.getSingleAxisViewportSize(getLayoutInfo()), getLayoutInfo().getBeforeContentPadding(), getLayoutInfo().getAfterContentPadding(), lazyListItemInfo.getSize(), lazyListItemInfo.getOffset(), lazyListItemInfo.getIndex(), snapPosition2, getLayoutInfo().getTotalItemsCount());
                        if (calculateDistanceToDesiredSnapPosition <= 0.0f && calculateDistanceToDesiredSnapPosition > f12) {
                            f12 = calculateDistanceToDesiredSnapPosition;
                        }
                        if (calculateDistanceToDesiredSnapPosition >= 0.0f && calculateDistanceToDesiredSnapPosition < f13) {
                            f13 = calculateDistanceToDesiredSnapPosition;
                        }
                    }
                }
                return SnapFlingBehaviorKt.m547calculateFinalOffsetFhqu1e0(LazyListSnapLayoutInfoProviderKt.calculateFinalSnappingItem(LazyListState.this.getDensity$foundation_release(), f11), f12, f13);
            }
        };
    }

    public static /* synthetic */ SnapLayoutInfoProvider SnapLayoutInfoProvider$default(LazyListState lazyListState, SnapPosition snapPosition, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            snapPosition = SnapPosition.Center.INSTANCE;
        }
        return SnapLayoutInfoProvider(lazyListState, snapPosition);
    }

    public static final int calculateFinalSnappingItem(@k Density density, float f11) {
        return Math.abs(f11) < density.mo377toPx0680j_4(SnapFlingBehaviorKt.getMinFlingVelocityDp()) ? FinalSnappingItem.Companion.m544getClosestItembbeMdSM() : f11 > 0.0f ? FinalSnappingItem.Companion.m545getNextItembbeMdSM() : FinalSnappingItem.Companion.m546getPreviousItembbeMdSM();
    }

    public static final int getSingleAxisViewportSize(@k LazyListLayoutInfo lazyListLayoutInfo) {
        return (int) (lazyListLayoutInfo.getOrientation() == Orientation.Vertical ? lazyListLayoutInfo.mo833getViewportSizeYbymL2g() & 4294967295L : lazyListLayoutInfo.mo833getViewportSizeYbymL2g() >> 32);
    }

    @Composable
    @k
    public static final FlingBehavior rememberSnapFlingBehavior(@k LazyListState lazyListState, @l SnapPosition snapPosition, @l Composer composer, int i11, int i12) {
        if ((i12 & 2) != 0) {
            snapPosition = SnapPosition.Center.INSTANCE;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-338621290, i11, -1, "androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior (LazyListSnapLayoutInfoProvider.kt:115)");
        }
        boolean z11 = (((i11 & 14) ^ 6) > 4 && composer.changed(lazyListState)) || (i11 & 6) == 4;
        Object rememberedValue = composer.rememberedValue();
        if (z11 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapLayoutInfoProvider(lazyListState, snapPosition);
            composer.updateRememberedValue(rememberedValue);
        }
        TargetedFlingBehavior rememberSnapFlingBehavior = SnapFlingBehaviorKt.rememberSnapFlingBehavior((SnapLayoutInfoProvider) rememberedValue, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return rememberSnapFlingBehavior;
    }
}
