package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.LazyGridSnapLayoutInfoProviderKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.RulerScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import c40.r0;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nLazyGridMeasureResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridMeasureResult.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasureResult\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,162:1\n30#2:163\n80#3:164\n34#4,6:165\n*S KotlinDebug\n*F\n+ 1 LazyGridMeasureResult.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasureResult\n*L\n76#1:163\n76#1:164\n133#1:165,6\n*E\n"})
/* loaded from: classes.dex */
public final class LazyGridMeasureResult implements LazyGridLayoutInfo, MeasureResult {
    public static final int $stable = 8;
    private final int afterContentPadding;
    private final boolean canScrollForward;
    private final float consumedScroll;

    @k
    private final r0 coroutineScope;

    @k
    private final Density density;

    @l
    private final LazyGridMeasuredLine firstVisibleLine;
    private final int firstVisibleLineScrollOffset;
    private final int mainAxisItemSpacing;

    @k
    private final MeasureResult measureResult;

    @k
    private final Orientation orientation;

    @k
    private final x00.l<Integer, List<Pair<Integer, Constraints>>> prefetchInfoRetriever;
    private final boolean remeasureNeeded;
    private final boolean reverseLayout;
    private final float scrollBackAmount;
    private final int slotsPerLine;
    private final int totalItemsCount;
    private final int viewportEndOffset;
    private final int viewportStartOffset;

    @k
    private final List<LazyGridMeasuredItem> visibleItemsInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyGridMeasureResult(@l LazyGridMeasuredLine lazyGridMeasuredLine, int i11, boolean z11, float f11, @k MeasureResult measureResult, float f12, boolean z12, @k r0 r0Var, @k Density density, int i12, @k x00.l<? super Integer, ? extends List<Pair<Integer, Constraints>>> lVar, @k List<LazyGridMeasuredItem> list, int i13, int i14, int i15, boolean z13, @k Orientation orientation, int i16, int i17) {
        this.firstVisibleLine = lazyGridMeasuredLine;
        this.firstVisibleLineScrollOffset = i11;
        this.canScrollForward = z11;
        this.consumedScroll = f11;
        this.measureResult = measureResult;
        this.scrollBackAmount = f12;
        this.remeasureNeeded = z12;
        this.coroutineScope = r0Var;
        this.density = density;
        this.slotsPerLine = i12;
        this.prefetchInfoRetriever = lVar;
        this.visibleItemsInfo = list;
        this.viewportStartOffset = i13;
        this.viewportEndOffset = i14;
        this.totalItemsCount = i15;
        this.reverseLayout = z13;
        this.orientation = orientation;
        this.afterContentPadding = i16;
        this.mainAxisItemSpacing = i17;
    }

    @l
    public final LazyGridMeasureResult copyWithScrollDeltaWithoutRemeasure(int i11, boolean z11) {
        LazyGridMeasuredLine lazyGridMeasuredLine;
        if (!this.remeasureNeeded && !getVisibleItemsInfo().isEmpty() && (lazyGridMeasuredLine = this.firstVisibleLine) != null) {
            int mainAxisSizeWithSpacings = lazyGridMeasuredLine.getMainAxisSizeWithSpacings();
            int i12 = this.firstVisibleLineScrollOffset - i11;
            if (i12 >= 0 && i12 < mainAxisSizeWithSpacings) {
                LazyGridMeasuredItem lazyGridMeasuredItem = (LazyGridMeasuredItem) a00.r0.G2(getVisibleItemsInfo());
                LazyGridMeasuredItem lazyGridMeasuredItem2 = (LazyGridMeasuredItem) a00.r0.u3(getVisibleItemsInfo());
                if (!lazyGridMeasuredItem.getNonScrollableItem() && !lazyGridMeasuredItem2.getNonScrollableItem() && (i11 >= 0 ? Math.min(getViewportStartOffset() - LazyGridSnapLayoutInfoProviderKt.offsetOnMainAxis(lazyGridMeasuredItem, getOrientation()), getViewportEndOffset() - LazyGridSnapLayoutInfoProviderKt.offsetOnMainAxis(lazyGridMeasuredItem2, getOrientation())) > i11 : Math.min((LazyGridSnapLayoutInfoProviderKt.offsetOnMainAxis(lazyGridMeasuredItem, getOrientation()) + lazyGridMeasuredItem.getMainAxisSizeWithSpacings()) - getViewportStartOffset(), (LazyGridSnapLayoutInfoProviderKt.offsetOnMainAxis(lazyGridMeasuredItem2, getOrientation()) + lazyGridMeasuredItem2.getMainAxisSizeWithSpacings()) - getViewportEndOffset()) > (-i11))) {
                    List<LazyGridMeasuredItem> visibleItemsInfo = getVisibleItemsInfo();
                    int size = visibleItemsInfo.size();
                    for (int i13 = 0; i13 < size; i13++) {
                        visibleItemsInfo.get(i13).applyScrollDelta(i11, z11);
                    }
                    return new LazyGridMeasureResult(this.firstVisibleLine, this.firstVisibleLineScrollOffset - i11, this.canScrollForward || i11 > 0, i11, this.measureResult, this.scrollBackAmount, this.remeasureNeeded, this.coroutineScope, this.density, this.slotsPerLine, this.prefetchInfoRetriever, getVisibleItemsInfo(), getViewportStartOffset(), getViewportEndOffset(), getTotalItemsCount(), getReverseLayout(), getOrientation(), getAfterContentPadding(), getMainAxisItemSpacing());
                }
            }
        }
        return null;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public int getAfterContentPadding() {
        return this.afterContentPadding;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    @k
    public Map<AlignmentLine, Integer> getAlignmentLines() {
        return this.measureResult.getAlignmentLines();
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public int getBeforeContentPadding() {
        return -getViewportStartOffset();
    }

    public final boolean getCanScrollBackward() {
        LazyGridMeasuredLine lazyGridMeasuredLine = this.firstVisibleLine;
        return ((lazyGridMeasuredLine != null ? lazyGridMeasuredLine.getIndex() : 0) == 0 && this.firstVisibleLineScrollOffset == 0) ? false : true;
    }

    public final boolean getCanScrollForward() {
        return this.canScrollForward;
    }

    public final float getConsumedScroll() {
        return this.consumedScroll;
    }

    @k
    public final r0 getCoroutineScope() {
        return this.coroutineScope;
    }

    @k
    public final Density getDensity() {
        return this.density;
    }

    @l
    public final LazyGridMeasuredLine getFirstVisibleLine() {
        return this.firstVisibleLine;
    }

    public final int getFirstVisibleLineScrollOffset() {
        return this.firstVisibleLineScrollOffset;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public int getHeight() {
        return this.measureResult.getHeight();
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public int getMainAxisItemSpacing() {
        return this.mainAxisItemSpacing;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public int getMaxSpan() {
        return this.slotsPerLine;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    @k
    public Orientation getOrientation() {
        return this.orientation;
    }

    @k
    public final x00.l<Integer, List<Pair<Integer, Constraints>>> getPrefetchInfoRetriever() {
        return this.prefetchInfoRetriever;
    }

    public final boolean getRemeasureNeeded() {
        return this.remeasureNeeded;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public boolean getReverseLayout() {
        return this.reverseLayout;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    @l
    public x00.l<RulerScope, g2> getRulers() {
        return this.measureResult.getRulers();
    }

    public final float getScrollBackAmount() {
        return this.scrollBackAmount;
    }

    public final int getSlotsPerLine() {
        return this.slotsPerLine;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public int getTotalItemsCount() {
        return this.totalItemsCount;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public int getViewportEndOffset() {
        return this.viewportEndOffset;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    /* renamed from: getViewportSize-YbymL2g */
    public long mo869getViewportSizeYbymL2g() {
        return IntSize.m5281constructorimpl((getHeight() & 4294967295L) | (getWidth() << 32));
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public int getViewportStartOffset() {
        return this.viewportStartOffset;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    @k
    public List<LazyGridMeasuredItem> getVisibleItemsInfo() {
        return this.visibleItemsInfo;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public int getWidth() {
        return this.measureResult.getWidth();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public void placeChildren() {
        this.measureResult.placeChildren();
    }
}
