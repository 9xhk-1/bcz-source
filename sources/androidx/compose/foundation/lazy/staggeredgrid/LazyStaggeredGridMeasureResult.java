package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.RulerScope;
import androidx.compose.ui.unit.Density;
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
@u0({"SMAP\nLazyStaggeredGridMeasureResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasureResult.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,297:1\n34#2,6:298\n34#2,6:304\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasureResult.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult\n*L\n178#1:298,6\n212#1:304,6\n*E\n"})
/* loaded from: classes.dex */
public final class LazyStaggeredGridMeasureResult implements LazyStaggeredGridLayoutInfo, MeasureResult {
    public static final int $stable = 8;
    private final int afterContentPadding;
    private final int beforeContentPadding;
    private final boolean canScrollForward;
    private final float consumedScroll;

    @k
    private final r0 coroutineScope;

    @k
    private final Density density;

    @k
    private final int[] firstVisibleItemIndices;

    @k
    private final int[] firstVisibleItemScrollOffsets;
    private final boolean isVertical;
    private final int mainAxisItemSpacing;

    @k
    private final MeasureResult measureResult;

    @k
    private final Orientation orientation;
    private final boolean remeasureNeeded;
    private final float scrollBackAmount;

    @k
    private final LazyStaggeredGridSlots slots;

    @k
    private final LazyStaggeredGridSpanProvider spanProvider;
    private final int totalItemsCount;
    private final int viewportEndOffset;
    private final long viewportSize;
    private final int viewportStartOffset;

    @k
    private final List<LazyStaggeredGridMeasuredItem> visibleItemsInfo;

    public /* synthetic */ LazyStaggeredGridMeasureResult(int[] iArr, int[] iArr2, float f11, MeasureResult measureResult, float f12, boolean z11, boolean z12, boolean z13, LazyStaggeredGridSlots lazyStaggeredGridSlots, LazyStaggeredGridSpanProvider lazyStaggeredGridSpanProvider, Density density, int i11, List list, long j11, int i12, int i13, int i14, int i15, int i16, r0 r0Var, v vVar) {
        this(iArr, iArr2, f11, measureResult, f12, z11, z12, z13, lazyStaggeredGridSlots, lazyStaggeredGridSpanProvider, density, i11, list, j11, i12, i13, i14, i15, i16, r0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0085, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b1, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b5, code lost:
    
        return null;
     */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult copyWithScrollDeltaWithoutRemeasure(int r33, boolean r34) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult.copyWithScrollDeltaWithoutRemeasure(int, boolean):androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult");
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int getAfterContentPadding() {
        return this.afterContentPadding;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    @k
    public Map<AlignmentLine, Integer> getAlignmentLines() {
        return this.measureResult.getAlignmentLines();
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int getBeforeContentPadding() {
        return this.beforeContentPadding;
    }

    public final boolean getCanScrollBackward() {
        return this.firstVisibleItemIndices[0] != 0 || this.firstVisibleItemScrollOffsets[0] > 0;
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

    @k
    public final int[] getFirstVisibleItemIndices() {
        return this.firstVisibleItemIndices;
    }

    @k
    public final int[] getFirstVisibleItemScrollOffsets() {
        return this.firstVisibleItemScrollOffsets;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public int getHeight() {
        return this.measureResult.getHeight();
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int getMainAxisItemSpacing() {
        return this.mainAxisItemSpacing;
    }

    @k
    public final MeasureResult getMeasureResult() {
        return this.measureResult;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    @k
    public Orientation getOrientation() {
        return this.orientation;
    }

    public final boolean getRemeasureNeeded() {
        return this.remeasureNeeded;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    @l
    public x00.l<RulerScope, g2> getRulers() {
        return this.measureResult.getRulers();
    }

    public final float getScrollBackAmount() {
        return this.scrollBackAmount;
    }

    @k
    public final LazyStaggeredGridSlots getSlots() {
        return this.slots;
    }

    @k
    public final LazyStaggeredGridSpanProvider getSpanProvider() {
        return this.spanProvider;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int getTotalItemsCount() {
        return this.totalItemsCount;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int getViewportEndOffset() {
        return this.viewportEndOffset;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    /* renamed from: getViewportSize-YbymL2g */
    public long mo935getViewportSizeYbymL2g() {
        return this.viewportSize;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int getViewportStartOffset() {
        return this.viewportStartOffset;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    @k
    public List<LazyStaggeredGridMeasuredItem> getVisibleItemsInfo() {
        return this.visibleItemsInfo;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public int getWidth() {
        return this.measureResult.getWidth();
    }

    public final boolean isVertical() {
        return this.isVertical;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public void placeChildren() {
        this.measureResult.placeChildren();
    }

    private LazyStaggeredGridMeasureResult(int[] iArr, int[] iArr2, float f11, MeasureResult measureResult, float f12, boolean z11, boolean z12, boolean z13, LazyStaggeredGridSlots lazyStaggeredGridSlots, LazyStaggeredGridSpanProvider lazyStaggeredGridSpanProvider, Density density, int i11, List<LazyStaggeredGridMeasuredItem> list, long j11, int i12, int i13, int i14, int i15, int i16, r0 r0Var) {
        this.firstVisibleItemIndices = iArr;
        this.firstVisibleItemScrollOffsets = iArr2;
        this.consumedScroll = f11;
        this.measureResult = measureResult;
        this.scrollBackAmount = f12;
        this.canScrollForward = z11;
        this.isVertical = z12;
        this.remeasureNeeded = z13;
        this.slots = lazyStaggeredGridSlots;
        this.spanProvider = lazyStaggeredGridSpanProvider;
        this.density = density;
        this.totalItemsCount = i11;
        this.visibleItemsInfo = list;
        this.viewportSize = j11;
        this.viewportStartOffset = i12;
        this.viewportEndOffset = i13;
        this.beforeContentPadding = i14;
        this.afterContentPadding = i15;
        this.mainAxisItemSpacing = i16;
        this.coroutineScope = r0Var;
        this.orientation = z12 ? Orientation.Vertical : Orientation.Horizontal;
    }
}
