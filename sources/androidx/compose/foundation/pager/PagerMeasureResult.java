package androidx.compose.foundation.pager;

import a00.h0;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.RulerScope;
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
@u0({"SMAP\nPagerMeasureResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerMeasureResult.kt\nandroidx/compose/foundation/pager/PagerMeasureResult\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,148:1\n30#2:149\n80#3:150\n34#4,6:151\n34#4,6:157\n34#4,6:163\n*S KotlinDebug\n*F\n+ 1 PagerMeasureResult.kt\nandroidx/compose/foundation/pager/PagerMeasureResult\n*L\n50#1:149\n50#1:150\n115#1:151,6\n116#1:157,6\n117#1:163,6\n*E\n"})
/* loaded from: classes.dex */
public final class PagerMeasureResult implements PagerLayoutInfo, MeasureResult {
    public static final int $stable = 8;
    private final int afterContentPadding;
    private final int beyondViewportPageCount;
    private final boolean canScrollForward;

    @k
    private final r0 coroutineScope;

    @l
    private final MeasuredPage currentPage;
    private final float currentPageOffsetFraction;

    @k
    private final List<MeasuredPage> extraPagesAfter;

    @k
    private final List<MeasuredPage> extraPagesBefore;

    @l
    private final MeasuredPage firstVisiblePage;
    private final int firstVisiblePageScrollOffset;

    @k
    private final MeasureResult measureResult;

    @k
    private final Orientation orientation;
    private final int pageSize;
    private final int pageSpacing;
    private final boolean remeasureNeeded;
    private final boolean reverseLayout;

    @k
    private final SnapPosition snapPosition;
    private final int viewportEndOffset;
    private final int viewportStartOffset;

    @k
    private final List<MeasuredPage> visiblePagesInfo;

    public PagerMeasureResult(@k List<MeasuredPage> list, int i11, int i12, int i13, @k Orientation orientation, int i14, int i15, boolean z11, int i16, @l MeasuredPage measuredPage, @l MeasuredPage measuredPage2, float f11, int i17, boolean z12, @k SnapPosition snapPosition, @k MeasureResult measureResult, boolean z13, @k List<MeasuredPage> list2, @k List<MeasuredPage> list3, @k r0 r0Var) {
        this.visiblePagesInfo = list;
        this.pageSize = i11;
        this.pageSpacing = i12;
        this.afterContentPadding = i13;
        this.orientation = orientation;
        this.viewportStartOffset = i14;
        this.viewportEndOffset = i15;
        this.reverseLayout = z11;
        this.beyondViewportPageCount = i16;
        this.firstVisiblePage = measuredPage;
        this.currentPage = measuredPage2;
        this.currentPageOffsetFraction = f11;
        this.firstVisiblePageScrollOffset = i17;
        this.canScrollForward = z12;
        this.snapPosition = snapPosition;
        this.measureResult = measureResult;
        this.remeasureNeeded = z13;
        this.extraPagesBefore = list2;
        this.extraPagesAfter = list3;
        this.coroutineScope = r0Var;
    }

    @l
    public final PagerMeasureResult copyWithScrollDeltaWithoutRemeasure(int i11) {
        int i12;
        int pageSize = getPageSize() + getPageSpacing();
        if (!this.remeasureNeeded && !getVisiblePagesInfo().isEmpty() && this.firstVisiblePage != null && (i12 = this.firstVisiblePageScrollOffset - i11) >= 0 && i12 < pageSize) {
            float f11 = pageSize != 0 ? i11 / pageSize : 0.0f;
            float f12 = this.currentPageOffsetFraction - f11;
            if (this.currentPage != null && f12 < 0.5f && f12 > -0.5f) {
                MeasuredPage measuredPage = (MeasuredPage) a00.r0.G2(getVisiblePagesInfo());
                MeasuredPage measuredPage2 = (MeasuredPage) a00.r0.u3(getVisiblePagesInfo());
                if (i11 >= 0 ? Math.min(getViewportStartOffset() - measuredPage.getOffset(), getViewportEndOffset() - measuredPage2.getOffset()) > i11 : Math.min((measuredPage.getOffset() + pageSize) - getViewportStartOffset(), (measuredPage2.getOffset() + pageSize) - getViewportEndOffset()) > (-i11)) {
                    List<MeasuredPage> visiblePagesInfo = getVisiblePagesInfo();
                    int size = visiblePagesInfo.size();
                    for (int i13 = 0; i13 < size; i13++) {
                        visiblePagesInfo.get(i13).applyScrollDelta(i11);
                    }
                    List<MeasuredPage> list = this.extraPagesBefore;
                    int size2 = list.size();
                    for (int i14 = 0; i14 < size2; i14++) {
                        list.get(i14).applyScrollDelta(i11);
                    }
                    List<MeasuredPage> list2 = this.extraPagesAfter;
                    int size3 = list2.size();
                    for (int i15 = 0; i15 < size3; i15++) {
                        list2.get(i15).applyScrollDelta(i11);
                    }
                    return new PagerMeasureResult(getVisiblePagesInfo(), getPageSize(), getPageSpacing(), getAfterContentPadding(), getOrientation(), getViewportStartOffset(), getViewportEndOffset(), getReverseLayout(), getBeyondViewportPageCount(), this.firstVisiblePage, this.currentPage, this.currentPageOffsetFraction - f11, this.firstVisiblePageScrollOffset - i11, this.canScrollForward || i11 > 0, getSnapPosition(), this.measureResult, this.remeasureNeeded, this.extraPagesBefore, this.extraPagesAfter, this.coroutineScope);
                }
            }
        }
        return null;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public int getAfterContentPadding() {
        return this.afterContentPadding;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    @k
    public Map<AlignmentLine, Integer> getAlignmentLines() {
        return this.measureResult.getAlignmentLines();
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public int getBeforeContentPadding() {
        return -getViewportStartOffset();
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public int getBeyondViewportPageCount() {
        return this.beyondViewportPageCount;
    }

    public final boolean getCanScrollBackward() {
        MeasuredPage measuredPage = this.firstVisiblePage;
        return ((measuredPage != null ? measuredPage.getIndex() : 0) == 0 && this.firstVisiblePageScrollOffset == 0) ? false : true;
    }

    public final boolean getCanScrollForward() {
        return this.canScrollForward;
    }

    @k
    public final r0 getCoroutineScope() {
        return this.coroutineScope;
    }

    @l
    public final MeasuredPage getCurrentPage() {
        return this.currentPage;
    }

    public final float getCurrentPageOffsetFraction() {
        return this.currentPageOffsetFraction;
    }

    @k
    public final List<MeasuredPage> getExtraPagesAfter() {
        return this.extraPagesAfter;
    }

    @k
    public final List<MeasuredPage> getExtraPagesBefore() {
        return this.extraPagesBefore;
    }

    @l
    public final MeasuredPage getFirstVisiblePage() {
        return this.firstVisiblePage;
    }

    public final int getFirstVisiblePageScrollOffset() {
        return this.firstVisiblePageScrollOffset;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public int getHeight() {
        return this.measureResult.getHeight();
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    @k
    public Orientation getOrientation() {
        return this.orientation;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public int getPageSize() {
        return this.pageSize;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public int getPageSpacing() {
        return this.pageSpacing;
    }

    public final boolean getRemeasureNeeded() {
        return this.remeasureNeeded;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public boolean getReverseLayout() {
        return this.reverseLayout;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    @l
    public x00.l<RulerScope, g2> getRulers() {
        return this.measureResult.getRulers();
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    @k
    public SnapPosition getSnapPosition() {
        return this.snapPosition;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public int getViewportEndOffset() {
        return this.viewportEndOffset;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    /* renamed from: getViewportSize-YbymL2g */
    public long mo974getViewportSizeYbymL2g() {
        return IntSize.m5281constructorimpl((getHeight() & 4294967295L) | (getWidth() << 32));
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public int getViewportStartOffset() {
        return this.viewportStartOffset;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    @k
    public List<MeasuredPage> getVisiblePagesInfo() {
        return this.visiblePagesInfo;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public int getWidth() {
        return this.measureResult.getWidth();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public void placeChildren() {
        this.measureResult.placeChildren();
    }

    public /* synthetic */ PagerMeasureResult(List list, int i11, int i12, int i13, Orientation orientation, int i14, int i15, boolean z11, int i16, MeasuredPage measuredPage, MeasuredPage measuredPage2, float f11, int i17, boolean z12, SnapPosition snapPosition, MeasureResult measureResult, boolean z13, List list2, List list3, r0 r0Var, int i18, v vVar) {
        this(list, i11, i12, i13, orientation, i14, i15, z11, i16, measuredPage, measuredPage2, f11, i17, z12, snapPosition, measureResult, z13, (i18 & 131072) != 0 ? h0.J() : list2, (i18 & 262144) != 0 ? h0.J() : list3, r0Var);
    }
}
