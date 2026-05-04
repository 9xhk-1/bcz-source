package androidx.compose.foundation.gestures.snapping;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.lazy.grid.LazyGridItemInfo;
import androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.unit.IntOffset;
import g10.u;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLazyGridSnapLayoutInfoProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridSnapLayoutInfoProvider.kt\nandroidx/compose/foundation/gestures/snapping/LazyGridSnapLayoutInfoProviderKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,144:1\n1247#2,6:145\n59#3:151\n54#3:153\n59#3:155\n54#3:157\n90#4:152\n85#4:154\n90#4:156\n85#4:158\n*S KotlinDebug\n*F\n+ 1 LazyGridSnapLayoutInfoProvider.kt\nandroidx/compose/foundation/gestures/snapping/LazyGridSnapLayoutInfoProviderKt\n*L\n117#1:145,6\n124#1:151\n126#1:153\n131#1:155\n133#1:157\n124#1:152\n126#1:154\n131#1:156\n133#1:158\n*E\n"})
/* loaded from: classes.dex */
public final class LazyGridSnapLayoutInfoProviderKt {
    @k
    public static final SnapLayoutInfoProvider SnapLayoutInfoProvider(@k final LazyGridState lazyGridState, @k final SnapPosition snapPosition) {
        return new SnapLayoutInfoProvider() { // from class: androidx.compose.foundation.gestures.snapping.LazyGridSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1
            private final int getAverageItemSize() {
                LazyGridLayoutInfo layoutInfo = getLayoutInfo();
                int i11 = 0;
                if (layoutInfo.getVisibleItemsInfo().isEmpty()) {
                    return 0;
                }
                int size = layoutInfo.getVisibleItemsInfo().size();
                Iterator<T> it = layoutInfo.getVisibleItemsInfo().iterator();
                while (it.hasNext()) {
                    i11 += LazyGridSnapLayoutInfoProviderKt.sizeOnMainAxis((LazyGridItemInfo) it.next(), layoutInfo.getOrientation());
                }
                return i11 / size;
            }

            private final LazyGridLayoutInfo getLayoutInfo() {
                return LazyGridState.this.getLayoutInfo();
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateApproachOffset(float f11, float f12) {
                return u.t(Math.abs(f12) - getAverageItemSize(), 0.0f) * Math.signum(f12);
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateSnapOffset(float f11) {
                List<LazyGridItemInfo> visibleItemsInfo = getLayoutInfo().getVisibleItemsInfo();
                SnapPosition snapPosition2 = snapPosition;
                int size = visibleItemsInfo.size();
                float f12 = Float.NEGATIVE_INFINITY;
                float f13 = Float.POSITIVE_INFINITY;
                for (int i11 = 0; i11 < size; i11++) {
                    LazyGridItemInfo lazyGridItemInfo = visibleItemsInfo.get(i11);
                    float calculateDistanceToDesiredSnapPosition = SnapPositionKt.calculateDistanceToDesiredSnapPosition(LazyGridSnapLayoutInfoProviderKt.getSingleAxisViewportSize(getLayoutInfo()), getLayoutInfo().getBeforeContentPadding(), getLayoutInfo().getAfterContentPadding(), LazyGridSnapLayoutInfoProviderKt.sizeOnMainAxis(lazyGridItemInfo, getLayoutInfo().getOrientation()), LazyGridSnapLayoutInfoProviderKt.offsetOnMainAxis(lazyGridItemInfo, getLayoutInfo().getOrientation()), lazyGridItemInfo.getIndex(), snapPosition2, getLayoutInfo().getTotalItemsCount());
                    if (calculateDistanceToDesiredSnapPosition <= 0.0f && calculateDistanceToDesiredSnapPosition > f12) {
                        f12 = calculateDistanceToDesiredSnapPosition;
                    }
                    if (calculateDistanceToDesiredSnapPosition >= 0.0f && calculateDistanceToDesiredSnapPosition < f13) {
                        f13 = calculateDistanceToDesiredSnapPosition;
                    }
                }
                return SnapFlingBehaviorKt.m547calculateFinalOffsetFhqu1e0(LazyListSnapLayoutInfoProviderKt.calculateFinalSnappingItem(LazyGridState.this.getDensity$foundation_release(), f11), f12, f13);
            }
        };
    }

    public static /* synthetic */ SnapLayoutInfoProvider SnapLayoutInfoProvider$default(LazyGridState lazyGridState, SnapPosition snapPosition, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            snapPosition = SnapPosition.Center.INSTANCE;
        }
        return SnapLayoutInfoProvider(lazyGridState, snapPosition);
    }

    public static final int getSingleAxisViewportSize(@k LazyGridLayoutInfo lazyGridLayoutInfo) {
        return (int) (lazyGridLayoutInfo.getOrientation() == Orientation.Vertical ? lazyGridLayoutInfo.mo869getViewportSizeYbymL2g() & 4294967295L : lazyGridLayoutInfo.mo869getViewportSizeYbymL2g() >> 32);
    }

    public static final int offsetOnMainAxis(@k LazyGridItemInfo lazyGridItemInfo, @k Orientation orientation) {
        return orientation == Orientation.Vertical ? IntOffset.m5244getYimpl(lazyGridItemInfo.mo865getOffsetnOccac()) : IntOffset.m5243getXimpl(lazyGridItemInfo.mo865getOffsetnOccac());
    }

    @Composable
    @k
    public static final FlingBehavior rememberSnapFlingBehavior(@k LazyGridState lazyGridState, @l SnapPosition snapPosition, @l Composer composer, int i11, int i12) {
        if ((i12 & 2) != 0) {
            snapPosition = SnapPosition.Center.INSTANCE;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-234434234, i11, -1, "androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior (LazyGridSnapLayoutInfoProvider.kt:114)");
        }
        boolean z11 = (((i11 & 14) ^ 6) > 4 && composer.changed(lazyGridState)) || (i11 & 6) == 4;
        Object rememberedValue = composer.rememberedValue();
        if (z11 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapLayoutInfoProvider(lazyGridState, snapPosition);
            composer.updateRememberedValue(rememberedValue);
        }
        TargetedFlingBehavior rememberSnapFlingBehavior = SnapFlingBehaviorKt.rememberSnapFlingBehavior((SnapLayoutInfoProvider) rememberedValue, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return rememberSnapFlingBehavior;
    }

    public static final int sizeOnMainAxis(@k LazyGridItemInfo lazyGridItemInfo, @k Orientation orientation) {
        return (int) (orientation == Orientation.Vertical ? lazyGridItemInfo.mo866getSizeYbymL2g() & 4294967295L : lazyGridItemInfo.mo866getSizeYbymL2g() >> 32);
    }
}
