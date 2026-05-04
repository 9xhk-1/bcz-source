package androidx.compose.foundation.lazy.staggeredgrid;

import a00.h0;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import g10.u;
import java.util.List;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nLazyStaggeredGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 6 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,1475:1\n1461#1:1509\n1464#1:1510\n1461#1:1511\n1464#1:1515\n1464#1:1518\n344#2,8:1476\n344#2,8:1484\n70#2,4:1505\n75#2:1514\n30#3:1492\n30#3:1494\n80#4:1493\n80#4:1495\n80#4:1497\n80#4:1499\n80#4:1513\n80#4:1517\n80#4:1520\n80#4:1522\n32#5:1496\n32#5:1498\n32#5:1512\n32#5:1516\n32#5:1519\n32#5:1521\n96#6,5:1500\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem\n*L\n1379#1:1509\n1416#1:1510\n1417#1:1511\n1446#1:1515\n1451#1:1518\n1312#1:1476,8\n1319#1:1484,8\n1378#1:1505,4\n1378#1:1514\n1333#1:1492\n1335#1:1494\n1333#1:1493\n1335#1:1495\n1352#1:1497\n1354#1:1499\n1416#1:1513\n1446#1:1517\n1451#1:1520\n1464#1:1522\n1352#1:1496\n1354#1:1498\n1416#1:1512\n1446#1:1516\n1451#1:1519\n1464#1:1521\n1376#1:1500,5\n*E\n"})
/* loaded from: classes.dex */
public final class LazyStaggeredGridMeasuredItem implements LazyStaggeredGridItemInfo, LazyLayoutMeasuredItem {
    public static final int $stable = 8;
    private final int afterContentPadding;

    @k
    private final LazyLayoutItemAnimator<LazyStaggeredGridMeasuredItem> animator;
    private final int beforeContentPadding;
    private final long constraints;

    @l
    private final Object contentType;
    private final int crossAxisSize;
    private final int index;
    private final boolean isVertical;
    private boolean isVisible;

    @k
    private final Object key;
    private final int lane;
    private int mainAxisLayoutSize;
    private final int mainAxisSize;
    private final int mainAxisSizeWithSpacings;
    private int maxMainAxisOffset;
    private int minMainAxisOffset;
    private boolean nonScrollableItem;
    private long offset;

    @k
    private final List<Placeable> placeables;
    private final long size;
    private final int span;

    public /* synthetic */ LazyStaggeredGridMeasuredItem(int i11, Object obj, List list, boolean z11, int i12, int i13, int i14, int i15, int i16, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j11, v vVar) {
        this(i11, obj, list, z11, i12, i13, i14, i15, i16, obj2, lazyLayoutItemAnimator, j11);
    }

    /* renamed from: copy-4Tuh3kE, reason: not valid java name */
    private final long m949copy4Tuh3kE(long j11, x00.l<? super Integer, Integer> lVar) {
        int m5243getXimpl = isVertical() ? IntOffset.m5243getXimpl(j11) : lVar.invoke(Integer.valueOf(IntOffset.m5243getXimpl(j11))).intValue();
        boolean isVertical = isVertical();
        int m5244getYimpl = IntOffset.m5244getYimpl(j11);
        if (isVertical) {
            m5244getYimpl = lVar.invoke(Integer.valueOf(m5244getYimpl)).intValue();
        }
        return IntOffset.m5237constructorimpl((m5243getXimpl << 32) | (m5244getYimpl & 4294967295L));
    }

    /* renamed from: getMainAxis--gyyYBs, reason: not valid java name */
    private final int m950getMainAxisgyyYBs(long j11) {
        return isVertical() ? IntOffset.m5244getYimpl(j11) : IntOffset.m5243getXimpl(j11);
    }

    public final void applyScrollDelta(int i11, boolean z11) {
        if (getNonScrollableItem()) {
            return;
        }
        long mo932getOffsetnOccac = mo932getOffsetnOccac();
        int m5243getXimpl = isVertical() ? IntOffset.m5243getXimpl(mo932getOffsetnOccac) : IntOffset.m5243getXimpl(mo932getOffsetnOccac) + i11;
        boolean isVertical = isVertical();
        int m5244getYimpl = IntOffset.m5244getYimpl(mo932getOffsetnOccac);
        if (isVertical) {
            m5244getYimpl += i11;
        }
        this.offset = IntOffset.m5237constructorimpl((m5243getXimpl << 32) | (m5244getYimpl & 4294967295L));
        if (z11) {
            int placeablesCount = getPlaceablesCount();
            for (int i12 = 0; i12 < placeablesCount; i12++) {
                LazyLayoutItemAnimation animation = this.animator.getAnimation(getKey(), i12);
                if (animation != null) {
                    long m889getRawOffsetnOccac = animation.m889getRawOffsetnOccac();
                    int m5243getXimpl2 = isVertical() ? IntOffset.m5243getXimpl(m889getRawOffsetnOccac) : Integer.valueOf(IntOffset.m5243getXimpl(m889getRawOffsetnOccac) + i11).intValue();
                    boolean isVertical2 = isVertical();
                    int m5244getYimpl2 = IntOffset.m5244getYimpl(m889getRawOffsetnOccac);
                    if (isVertical2) {
                        m5244getYimpl2 = Integer.valueOf(m5244getYimpl2 + i11).intValue();
                    }
                    animation.m892setRawOffsetgyyYBs(IntOffset.m5237constructorimpl((m5244getYimpl2 & 4294967295L) | (m5243getXimpl2 << 32)));
                }
            }
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* renamed from: getConstraints-msEJaDk */
    public long mo839getConstraintsmsEJaDk() {
        return this.constraints;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    @l
    public Object getContentType() {
        return this.contentType;
    }

    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getIndex() {
        return this.index;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    @k
    public Object getKey() {
        return this.key;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getLane() {
        return this.lane;
    }

    public final int getMainAxisOffset() {
        return !isVertical() ? IntOffset.m5243getXimpl(mo932getOffsetnOccac()) : IntOffset.m5244getYimpl(mo932getOffsetnOccac());
    }

    public final int getMainAxisSize() {
        return this.mainAxisSize;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getMainAxisSizeWithSpacings() {
        return this.mainAxisSizeWithSpacings;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public boolean getNonScrollableItem() {
        return this.nonScrollableItem;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* renamed from: getOffset-Bjo55l4 */
    public long mo840getOffsetBjo55l4(int i11) {
        return mo932getOffsetnOccac();
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    /* renamed from: getOffset-nOcc-ac */
    public long mo932getOffsetnOccac() {
        return this.offset;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    @l
    public Object getParentData(int i11) {
        return this.placeables.get(i11).getParentData();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getPlaceablesCount() {
        return this.placeables.size();
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    /* renamed from: getSize-YbymL2g */
    public long mo933getSizeYbymL2g() {
        return this.size;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getSpan() {
        return this.span;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public boolean isVertical() {
        return this.isVertical;
    }

    public final boolean isVisible() {
        return this.isVisible;
    }

    public final void place(@k Placeable.PlacementScope placementScope, @k LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, boolean z11) {
        GraphicsLayer graphicsLayer;
        if (!(this.mainAxisLayoutSize != -1)) {
            InlineClassHelperKt.throwIllegalArgumentException("position() should be called first");
        }
        List<Placeable> list = this.placeables;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            Placeable placeable = list.get(i11);
            int height = this.minMainAxisOffset - (isVertical() ? placeable.getHeight() : placeable.getWidth());
            int i12 = this.maxMainAxisOffset;
            long mo932getOffsetnOccac = mo932getOffsetnOccac();
            LazyLayoutItemAnimation animation = this.animator.getAnimation(getKey(), i11);
            if (animation != null) {
                if (z11) {
                    animation.m891setLookaheadOffsetgyyYBs(mo932getOffsetnOccac);
                } else {
                    long m5247plusqkQi6aY = IntOffset.m5247plusqkQi6aY(!IntOffset.m5242equalsimpl0(animation.m887getLookaheadOffsetnOccac(), LazyLayoutItemAnimation.Companion.m893getNotInitializednOccac()) ? animation.m887getLookaheadOffsetnOccac() : mo932getOffsetnOccac, animation.m888getPlacementDeltanOccac());
                    if ((m950getMainAxisgyyYBs(mo932getOffsetnOccac) <= height && m950getMainAxisgyyYBs(m5247plusqkQi6aY) <= height) || (m950getMainAxisgyyYBs(mo932getOffsetnOccac) >= i12 && m950getMainAxisgyyYBs(m5247plusqkQi6aY) >= i12)) {
                        animation.cancelPlacementAnimation();
                    }
                    mo932getOffsetnOccac = m5247plusqkQi6aY;
                }
                graphicsLayer = animation.getLayer();
            } else {
                graphicsLayer = null;
            }
            if (lazyStaggeredGridMeasureContext.getReverseLayout()) {
                int m5243getXimpl = isVertical() ? IntOffset.m5243getXimpl(mo932getOffsetnOccac) : (this.mainAxisLayoutSize - IntOffset.m5243getXimpl(mo932getOffsetnOccac)) - (isVertical() ? placeable.getHeight() : placeable.getWidth());
                mo932getOffsetnOccac = IntOffset.m5237constructorimpl(((isVertical() ? (this.mainAxisLayoutSize - IntOffset.m5244getYimpl(mo932getOffsetnOccac)) - (isVertical() ? placeable.getHeight() : placeable.getWidth()) : IntOffset.m5244getYimpl(mo932getOffsetnOccac)) & 4294967295L) | (m5243getXimpl << 32));
            }
            long m5247plusqkQi6aY2 = IntOffset.m5247plusqkQi6aY(mo932getOffsetnOccac, lazyStaggeredGridMeasureContext.m937getContentOffsetnOccac());
            if (!z11 && animation != null) {
                animation.m890setFinalOffsetgyyYBs(m5247plusqkQi6aY2);
            }
            if (graphicsLayer != null) {
                Placeable.PlacementScope.m3924placeRelativeWithLayeraW9wM$default(placementScope, placeable, m5247plusqkQi6aY2, graphicsLayer, 0.0f, 4, (Object) null);
            } else {
                Placeable.PlacementScope.m3923placeRelativeWithLayeraW9wM$default(placementScope, placeable, m5247plusqkQi6aY2, 0.0f, (x00.l) null, 6, (Object) null);
            }
        }
    }

    public final void position(int i11, int i12, int i13) {
        long m5237constructorimpl;
        this.mainAxisLayoutSize = i13;
        this.minMainAxisOffset = -this.beforeContentPadding;
        this.maxMainAxisOffset = i13 + this.afterContentPadding;
        if (isVertical()) {
            m5237constructorimpl = IntOffset.m5237constructorimpl((i12 << 32) | (4294967295L & i11));
        } else {
            m5237constructorimpl = IntOffset.m5237constructorimpl((i12 & 4294967295L) | (i11 << 32));
        }
        this.offset = m5237constructorimpl;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public void setNonScrollableItem(boolean z11) {
        this.nonScrollableItem = z11;
    }

    public final void setVisible(boolean z11) {
        this.isVisible = z11;
    }

    @k
    public String toString() {
        return super.toString();
    }

    public final void updateMainAxisLayoutSize(int i11) {
        this.mainAxisLayoutSize = i11;
        this.maxMainAxisOffset = i11 + this.afterContentPadding;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private LazyStaggeredGridMeasuredItem(int i11, Object obj, List<? extends Placeable> list, boolean z11, int i12, int i13, int i14, int i15, int i16, Object obj2, LazyLayoutItemAnimator<LazyStaggeredGridMeasuredItem> lazyLayoutItemAnimator, long j11) {
        int height;
        this.index = i11;
        this.key = obj;
        this.placeables = list;
        this.isVertical = z11;
        this.lane = i13;
        this.span = i14;
        this.beforeContentPadding = i15;
        this.afterContentPadding = i16;
        this.contentType = obj2;
        this.animator = lazyLayoutItemAnimator;
        this.constraints = j11;
        int i17 = 1;
        this.isVisible = true;
        int i18 = 0;
        if (list.isEmpty()) {
            height = 0;
        } else {
            Placeable placeable = (Placeable) list.get(0);
            height = isVertical() ? placeable.getHeight() : placeable.getWidth();
            int L = h0.L(list);
            if (1 <= L) {
                int i19 = 1;
                while (true) {
                    Placeable placeable2 = (Placeable) list.get(i19);
                    int height2 = isVertical() ? placeable2.getHeight() : placeable2.getWidth();
                    height = height2 > height ? height2 : height;
                    if (i19 == L) {
                        break;
                    } else {
                        i19++;
                    }
                }
            }
        }
        this.mainAxisSize = height;
        this.mainAxisSizeWithSpacings = u.u(height + i12, 0);
        List<Placeable> list2 = this.placeables;
        if (!list2.isEmpty()) {
            Placeable placeable3 = list2.get(0);
            int width = isVertical() ? placeable3.getWidth() : placeable3.getHeight();
            int L2 = h0.L(list2);
            if (1 <= L2) {
                while (true) {
                    Placeable placeable4 = list2.get(i17);
                    int width2 = isVertical() ? placeable4.getWidth() : placeable4.getHeight();
                    width = width2 > width ? width2 : width;
                    if (i17 == L2) {
                        break;
                    } else {
                        i17++;
                    }
                }
            }
            i18 = width;
        }
        this.crossAxisSize = i18;
        this.mainAxisLayoutSize = -1;
        this.size = isVertical() ? IntSize.m5281constructorimpl((this.mainAxisSize & 4294967295L) | (i18 << 32)) : IntSize.m5281constructorimpl((i18 & 4294967295L) | (this.mainAxisSize << 32));
        this.offset = IntOffset.Companion.m5254getZeronOccac();
    }

    private final int getMainAxisSize(Placeable placeable) {
        return isVertical() ? placeable.getHeight() : placeable.getWidth();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public void position(int i11, int i12, int i13, int i14) {
        if (isVertical()) {
            i13 = i14;
        }
        position(i11, i12, i13);
    }
}
