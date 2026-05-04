package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.RulerScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import c40.r0;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nLazyListMeasureResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListMeasureResult.kt\nandroidx/compose/foundation/lazy/LazyListMeasureResult\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,152:1\n30#2:153\n80#3:154\n34#4,6:155\n*S KotlinDebug\n*F\n+ 1 LazyListMeasureResult.kt\nandroidx/compose/foundation/lazy/LazyListMeasureResult\n*L\n73#1:153\n73#1:154\n124#1:155,6\n*E\n"})
/* loaded from: classes.dex */
public final class LazyListMeasureResult implements LazyListLayoutInfo, MeasureResult {
    public static final int $stable = 8;
    private final int afterContentPadding;
    private final boolean canScrollForward;
    private final long childConstraints;
    private final float consumedScroll;

    @k
    private final r0 coroutineScope;

    @k
    private final Density density;

    @l
    private final LazyListMeasuredItem firstVisibleItem;
    private final int firstVisibleItemScrollOffset;
    private final int mainAxisItemSpacing;

    @k
    private final MeasureResult measureResult;

    @k
    private final Orientation orientation;
    private final boolean remeasureNeeded;
    private final boolean reverseLayout;
    private final float scrollBackAmount;
    private final int totalItemsCount;
    private final int viewportEndOffset;
    private final int viewportStartOffset;

    @k
    private final List<LazyListMeasuredItem> visibleItemsInfo;

    public /* synthetic */ LazyListMeasureResult(LazyListMeasuredItem lazyListMeasuredItem, int i11, boolean z11, float f11, MeasureResult measureResult, float f12, boolean z12, r0 r0Var, Density density, long j11, List list, int i12, int i13, int i14, boolean z13, Orientation orientation, int i15, int i16, v vVar) {
        this(lazyListMeasuredItem, i11, z11, f11, measureResult, f12, z12, r0Var, density, j11, list, i12, i13, i14, z13, orientation, i15, i16);
    }

    @l
    public final LazyListMeasureResult copyWithScrollDeltaWithoutRemeasure(int i11, boolean z11) {
        LazyListMeasuredItem lazyListMeasuredItem;
        if (!this.remeasureNeeded && !getVisibleItemsInfo().isEmpty() && (lazyListMeasuredItem = this.firstVisibleItem) != null) {
            int mainAxisSizeWithSpacings = lazyListMeasuredItem.getMainAxisSizeWithSpacings();
            int i12 = this.firstVisibleItemScrollOffset - i11;
            if (i12 >= 0 && i12 < mainAxisSizeWithSpacings) {
                LazyListMeasuredItem lazyListMeasuredItem2 = (LazyListMeasuredItem) a00.r0.G2(getVisibleItemsInfo());
                LazyListMeasuredItem lazyListMeasuredItem3 = (LazyListMeasuredItem) a00.r0.u3(getVisibleItemsInfo());
                if (!lazyListMeasuredItem2.getNonScrollableItem() && !lazyListMeasuredItem3.getNonScrollableItem() && (i11 >= 0 ? Math.min(getViewportStartOffset() - lazyListMeasuredItem2.getOffset(), getViewportEndOffset() - lazyListMeasuredItem3.getOffset()) > i11 : Math.min((lazyListMeasuredItem2.getOffset() + lazyListMeasuredItem2.getMainAxisSizeWithSpacings()) - getViewportStartOffset(), (lazyListMeasuredItem3.getOffset() + lazyListMeasuredItem3.getMainAxisSizeWithSpacings()) - getViewportEndOffset()) > (-i11))) {
                    List<LazyListMeasuredItem> visibleItemsInfo = getVisibleItemsInfo();
                    int size = visibleItemsInfo.size();
                    for (int i13 = 0; i13 < size; i13++) {
                        visibleItemsInfo.get(i13).applyScrollDelta(i11, z11);
                    }
                    return new LazyListMeasureResult(this.firstVisibleItem, this.firstVisibleItemScrollOffset - i11, this.canScrollForward || i11 > 0, i11, this.measureResult, this.scrollBackAmount, this.remeasureNeeded, this.coroutineScope, this.density, this.childConstraints, getVisibleItemsInfo(), getViewportStartOffset(), getViewportEndOffset(), getTotalItemsCount(), getReverseLayout(), getOrientation(), getAfterContentPadding(), getMainAxisItemSpacing(), null);
                }
            }
        }
        return null;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int getAfterContentPadding() {
        return this.afterContentPadding;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    @k
    public Map<AlignmentLine, Integer> getAlignmentLines() {
        return this.measureResult.getAlignmentLines();
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int getBeforeContentPadding() {
        return -getViewportStartOffset();
    }

    public final boolean getCanScrollBackward() {
        LazyListMeasuredItem lazyListMeasuredItem = this.firstVisibleItem;
        return ((lazyListMeasuredItem != null ? lazyListMeasuredItem.getIndex() : 0) == 0 && this.firstVisibleItemScrollOffset == 0) ? false : true;
    }

    public final boolean getCanScrollForward() {
        return this.canScrollForward;
    }

    /* renamed from: getChildConstraints-msEJaDk, reason: not valid java name */
    public final long m836getChildConstraintsmsEJaDk() {
        return this.childConstraints;
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
    public final LazyListMeasuredItem getFirstVisibleItem() {
        return this.firstVisibleItem;
    }

    public final int getFirstVisibleItemScrollOffset() {
        return this.firstVisibleItemScrollOffset;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public int getHeight() {
        return this.measureResult.getHeight();
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int getMainAxisItemSpacing() {
        return this.mainAxisItemSpacing;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    @k
    public Orientation getOrientation() {
        return this.orientation;
    }

    public final boolean getRemeasureNeeded() {
        return this.remeasureNeeded;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
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

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int getTotalItemsCount() {
        return this.totalItemsCount;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int getViewportEndOffset() {
        return this.viewportEndOffset;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    /* renamed from: getViewportSize-YbymL2g */
    public long mo833getViewportSizeYbymL2g() {
        return IntSize.m5281constructorimpl((getHeight() & 4294967295L) | (getWidth() << 32));
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int getViewportStartOffset() {
        return this.viewportStartOffset;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    @k
    public List<LazyListMeasuredItem> getVisibleItemsInfo() {
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

    private LazyListMeasureResult(LazyListMeasuredItem lazyListMeasuredItem, int i11, boolean z11, float f11, MeasureResult measureResult, float f12, boolean z12, r0 r0Var, Density density, long j11, List<LazyListMeasuredItem> list, int i12, int i13, int i14, boolean z13, Orientation orientation, int i15, int i16) {
        this.firstVisibleItem = lazyListMeasuredItem;
        this.firstVisibleItemScrollOffset = i11;
        this.canScrollForward = z11;
        this.consumedScroll = f11;
        this.measureResult = measureResult;
        this.scrollBackAmount = f12;
        this.remeasureNeeded = z12;
        this.coroutineScope = r0Var;
        this.density = density;
        this.childConstraints = j11;
        this.visibleItemsInfo = list;
        this.viewportStartOffset = i12;
        this.viewportEndOffset = i13;
        this.totalItemsCount = i14;
        this.reverseLayout = z13;
        this.orientation = orientation;
        this.afterContentPadding = i15;
        this.mainAxisItemSpacing = i16;
    }
}
