package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.layout.Placeable;
import c40.r0;
import java.util.List;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nLazyStaggeredGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext\n+ 2 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/SpanRange\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,1475:1\n261#1:1481\n1135#2:1476\n1132#2:1477\n1129#2:1479\n1135#2:1482\n1132#2:1483\n1129#2:1485\n90#3:1478\n85#3:1480\n90#3:1484\n85#3:1486\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext\n*L\n264#1:1481\n261#1:1476\n261#1:1477\n261#1:1479\n264#1:1482\n264#1:1483\n264#1:1485\n261#1:1478\n261#1:1480\n264#1:1484\n264#1:1486\n*E\n"})
/* loaded from: classes.dex */
public final class LazyStaggeredGridMeasureContext {
    public static final int $stable = 8;
    private final int afterContentPadding;

    @l
    private final LazyStaggeredGridLayoutInfo approachLayoutInfo;
    private final int beforeContentPadding;
    private final long constraints;
    private final long contentOffset;

    @k
    private final r0 coroutineScope;

    @k
    private final GraphicsContext graphicsContext;
    private final boolean isInLookaheadScope;
    private final boolean isLookingAhead;
    private final boolean isVertical;

    @k
    private final LazyStaggeredGridItemProvider itemProvider;
    private final int laneCount;

    @k
    private final LazyStaggeredGridLaneInfo laneInfo;
    private final int mainAxisAvailableSize;
    private final int mainAxisSpacing;

    @k
    private final LazyLayoutMeasureScope measureScope;

    @k
    private final LazyStaggeredGridMeasureProvider measuredItemProvider;

    @k
    private final List<Integer> pinnedItems;

    @k
    private final LazyStaggeredGridSlots resolvedSlots;
    private final boolean reverseLayout;

    @k
    private final LazyStaggeredGridState state;

    public /* synthetic */ LazyStaggeredGridMeasureContext(LazyStaggeredGridState lazyStaggeredGridState, List list, LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, LazyStaggeredGridSlots lazyStaggeredGridSlots, long j11, boolean z11, LazyLayoutMeasureScope lazyLayoutMeasureScope, int i11, long j12, int i12, int i13, boolean z12, int i14, r0 r0Var, boolean z13, boolean z14, LazyStaggeredGridLayoutInfo lazyStaggeredGridLayoutInfo, GraphicsContext graphicsContext, v vVar) {
        this(lazyStaggeredGridState, list, lazyStaggeredGridItemProvider, lazyStaggeredGridSlots, j11, z11, lazyLayoutMeasureScope, i11, j12, i12, i13, z12, i14, r0Var, z13, z14, lazyStaggeredGridLayoutInfo, graphicsContext);
    }

    public final int getAfterContentPadding() {
        return this.afterContentPadding;
    }

    @l
    public final LazyStaggeredGridLayoutInfo getApproachLayoutInfo() {
        return this.approachLayoutInfo;
    }

    public final int getBeforeContentPadding() {
        return this.beforeContentPadding;
    }

    /* renamed from: getConstraints-msEJaDk, reason: not valid java name */
    public final long m936getConstraintsmsEJaDk() {
        return this.constraints;
    }

    /* renamed from: getContentOffset-nOcc-ac, reason: not valid java name */
    public final long m937getContentOffsetnOccac() {
        return this.contentOffset;
    }

    @k
    public final r0 getCoroutineScope() {
        return this.coroutineScope;
    }

    @k
    public final GraphicsContext getGraphicsContext() {
        return this.graphicsContext;
    }

    @k
    public final LazyStaggeredGridItemProvider getItemProvider() {
        return this.itemProvider;
    }

    public final int getLaneCount() {
        return this.laneCount;
    }

    @k
    public final LazyStaggeredGridLaneInfo getLaneInfo() {
        return this.laneInfo;
    }

    /* renamed from: getLaneInfo-SZVOQXA, reason: not valid java name */
    public final int m938getLaneInfoSZVOQXA(long j11) {
        int i11 = (int) (4294967295L & j11);
        int i12 = (int) (j11 >> 32);
        if (i11 - i12 != 1) {
            return -2;
        }
        return i12;
    }

    public final int getMainAxisAvailableSize() {
        return this.mainAxisAvailableSize;
    }

    public final int getMainAxisSpacing() {
        return this.mainAxisSpacing;
    }

    @k
    public final LazyLayoutMeasureScope getMeasureScope() {
        return this.measureScope;
    }

    @k
    public final LazyStaggeredGridMeasureProvider getMeasuredItemProvider() {
        return this.measuredItemProvider;
    }

    @k
    public final List<Integer> getPinnedItems() {
        return this.pinnedItems;
    }

    @k
    public final LazyStaggeredGridSlots getResolvedSlots() {
        return this.resolvedSlots;
    }

    public final boolean getReverseLayout() {
        return this.reverseLayout;
    }

    /* renamed from: getSpanRange-lOCCd4c, reason: not valid java name */
    public final long m939getSpanRangelOCCd4c(@k LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, int i11, int i12) {
        boolean isFullSpan = lazyStaggeredGridItemProvider.getSpanProvider().isFullSpan(i11);
        int i13 = isFullSpan ? this.laneCount : 1;
        if (isFullSpan) {
            i12 = 0;
        }
        return SpanRange.m954constructorimpl(i12, i13);
    }

    @k
    public final LazyStaggeredGridState getState() {
        return this.state;
    }

    public final boolean isFullSpan(@k LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, int i11) {
        return lazyStaggeredGridItemProvider.getSpanProvider().isFullSpan(i11);
    }

    /* renamed from: isFullSpan-SZVOQXA, reason: not valid java name */
    public final boolean m940isFullSpanSZVOQXA(long j11) {
        return ((int) (4294967295L & j11)) - ((int) (j11 >> 32)) != 1;
    }

    public final boolean isInLookaheadScope() {
        return this.isInLookaheadScope;
    }

    public final boolean isLookingAhead() {
        return this.isLookingAhead;
    }

    public final boolean isVertical() {
        return this.isVertical;
    }

    private LazyStaggeredGridMeasureContext(LazyStaggeredGridState lazyStaggeredGridState, List<Integer> list, final LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, final LazyStaggeredGridSlots lazyStaggeredGridSlots, long j11, final boolean z11, final LazyLayoutMeasureScope lazyLayoutMeasureScope, int i11, long j12, int i12, int i13, boolean z12, int i14, r0 r0Var, boolean z13, boolean z14, LazyStaggeredGridLayoutInfo lazyStaggeredGridLayoutInfo, GraphicsContext graphicsContext) {
        this.state = lazyStaggeredGridState;
        this.pinnedItems = list;
        this.itemProvider = lazyStaggeredGridItemProvider;
        this.resolvedSlots = lazyStaggeredGridSlots;
        this.constraints = j11;
        this.isVertical = z11;
        this.measureScope = lazyLayoutMeasureScope;
        this.mainAxisAvailableSize = i11;
        this.contentOffset = j12;
        this.beforeContentPadding = i12;
        this.afterContentPadding = i13;
        this.reverseLayout = z12;
        this.mainAxisSpacing = i14;
        this.coroutineScope = r0Var;
        this.isInLookaheadScope = z13;
        this.isLookingAhead = z14;
        this.approachLayoutInfo = lazyStaggeredGridLayoutInfo;
        this.graphicsContext = graphicsContext;
        this.measuredItemProvider = new LazyStaggeredGridMeasureProvider(z11, lazyStaggeredGridItemProvider, lazyLayoutMeasureScope, lazyStaggeredGridSlots) { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext$measuredItemProvider$1
            @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureProvider
            /* renamed from: createItem-pitSLOA, reason: not valid java name */
            public LazyStaggeredGridMeasuredItem mo941createItempitSLOA(int i15, int i16, int i17, Object obj, Object obj2, List<? extends Placeable> list2, long j13) {
                return new LazyStaggeredGridMeasuredItem(i15, obj, list2, LazyStaggeredGridMeasureContext.this.isVertical(), LazyStaggeredGridMeasureContext.this.getMainAxisSpacing(), i16, i17, LazyStaggeredGridMeasureContext.this.getBeforeContentPadding(), LazyStaggeredGridMeasureContext.this.getAfterContentPadding(), obj2, LazyStaggeredGridMeasureContext.this.getState().getItemAnimator$foundation_release(), j13, null);
            }
        };
        this.laneInfo = lazyStaggeredGridState.getLaneInfo$foundation_release();
        this.laneCount = lazyStaggeredGridSlots.getSizes().length;
    }
}
