package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import g10.u;
import java.util.List;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nLazyGridMeasuredItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridMeasuredItem.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 6 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,259:1\n255#1:274\n255#1:277\n255#1:285\n34#2,6:260\n30#3:266\n30#3:268\n80#4:267\n80#4:269\n80#4:271\n80#4:273\n80#4:276\n80#4:279\n80#4:287\n80#4:289\n32#5:270\n32#5:272\n32#5:275\n32#5:278\n32#5:286\n32#5:288\n96#6,5:280\n*S KotlinDebug\n*F\n+ 1 LazyGridMeasuredItem.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem\n*L\n173#1:274\n178#1:277\n224#1:285\n78#1:260,6\n87#1:266\n89#1:268\n87#1:267\n89#1:269\n150#1:271\n152#1:273\n173#1:276\n178#1:279\n224#1:287\n255#1:289\n150#1:270\n152#1:272\n173#1:275\n178#1:278\n224#1:286\n255#1:288\n186#1:280,5\n*E\n"})
/* loaded from: classes.dex */
public final class LazyGridMeasuredItem implements LazyGridItemInfo, LazyLayoutMeasuredItem {
    public static final int $stable = 8;
    private final int afterContentPadding;

    @k
    private final LazyLayoutItemAnimator<LazyGridMeasuredItem> animator;
    private final int beforeContentPadding;
    private int column;
    private final long constraints;

    @l
    private final Object contentType;
    private final int crossAxisSize;
    private final int index;
    private final boolean isVertical;

    @k
    private final Object key;
    private final int lane;

    @k
    private final LayoutDirection layoutDirection;
    private int mainAxisLayoutSize;
    private final int mainAxisSize;
    private final int mainAxisSizeWithSpacings;
    private int maxMainAxisOffset;
    private int minMainAxisOffset;
    private boolean nonScrollableItem;
    private long offset;

    @k
    private final List<Placeable> placeables;
    private final boolean reverseLayout;
    private int row;
    private final long size;
    private final int span;
    private final long visualOffset;

    public /* synthetic */ LazyGridMeasuredItem(int i11, Object obj, boolean z11, int i12, int i13, boolean z12, LayoutDirection layoutDirection, int i14, int i15, List list, long j11, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j12, int i16, int i17, v vVar) {
        this(i11, obj, z11, i12, i13, z12, layoutDirection, i14, i15, list, j11, obj2, lazyLayoutItemAnimator, j12, i16, i17);
    }

    /* renamed from: copy-4Tuh3kE, reason: not valid java name */
    private final long m871copy4Tuh3kE(long j11, x00.l<? super Integer, Integer> lVar) {
        int m5243getXimpl = isVertical() ? IntOffset.m5243getXimpl(j11) : lVar.invoke(Integer.valueOf(IntOffset.m5243getXimpl(j11))).intValue();
        boolean isVertical = isVertical();
        int m5244getYimpl = IntOffset.m5244getYimpl(j11);
        if (isVertical) {
            m5244getYimpl = lVar.invoke(Integer.valueOf(m5244getYimpl)).intValue();
        }
        return IntOffset.m5237constructorimpl((m5243getXimpl << 32) | (m5244getYimpl & 4294967295L));
    }

    /* renamed from: getMainAxis--gyyYBs, reason: not valid java name */
    private final int m872getMainAxisgyyYBs(long j11) {
        return isVertical() ? IntOffset.m5244getYimpl(j11) : IntOffset.m5243getXimpl(j11);
    }

    public final void applyScrollDelta(int i11, boolean z11) {
        if (getNonScrollableItem()) {
            return;
        }
        long mo865getOffsetnOccac = mo865getOffsetnOccac();
        int m5243getXimpl = isVertical() ? IntOffset.m5243getXimpl(mo865getOffsetnOccac) : IntOffset.m5243getXimpl(mo865getOffsetnOccac) + i11;
        boolean isVertical = isVertical();
        int m5244getYimpl = IntOffset.m5244getYimpl(mo865getOffsetnOccac);
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

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public int getColumn() {
        return this.column;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* renamed from: getConstraints-msEJaDk */
    public long mo839getConstraintsmsEJaDk() {
        return this.constraints;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    @l
    public Object getContentType() {
        return this.contentType;
    }

    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getIndex() {
        return this.index;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    @k
    public Object getKey() {
        return this.key;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getLane() {
        return this.lane;
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
        return mo865getOffsetnOccac();
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    /* renamed from: getOffset-nOcc-ac */
    public long mo865getOffsetnOccac() {
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

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public int getRow() {
        return this.row;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    /* renamed from: getSize-YbymL2g */
    public long mo866getSizeYbymL2g() {
        return this.size;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getSpan() {
        return this.span;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public boolean isVertical() {
        return this.isVertical;
    }

    public final void place(@k Placeable.PlacementScope placementScope, boolean z11) {
        GraphicsLayer graphicsLayer;
        Placeable.PlacementScope placementScope2;
        int i11 = 0;
        if (!(this.mainAxisLayoutSize != Integer.MIN_VALUE)) {
            InlineClassHelperKt.throwIllegalArgumentException("position() should be called first");
        }
        int placeablesCount = getPlaceablesCount();
        while (i11 < placeablesCount) {
            Placeable placeable = this.placeables.get(i11);
            int mainAxisSize = this.minMainAxisOffset - getMainAxisSize(placeable);
            int i12 = this.maxMainAxisOffset;
            long mo865getOffsetnOccac = mo865getOffsetnOccac();
            LazyLayoutItemAnimation animation = this.animator.getAnimation(getKey(), i11);
            if (animation != null) {
                if (z11) {
                    animation.m891setLookaheadOffsetgyyYBs(mo865getOffsetnOccac);
                } else {
                    long m5247plusqkQi6aY = IntOffset.m5247plusqkQi6aY(!IntOffset.m5242equalsimpl0(animation.m887getLookaheadOffsetnOccac(), LazyLayoutItemAnimation.Companion.m893getNotInitializednOccac()) ? animation.m887getLookaheadOffsetnOccac() : mo865getOffsetnOccac, animation.m888getPlacementDeltanOccac());
                    if ((m872getMainAxisgyyYBs(mo865getOffsetnOccac) <= mainAxisSize && m872getMainAxisgyyYBs(m5247plusqkQi6aY) <= mainAxisSize) || (m872getMainAxisgyyYBs(mo865getOffsetnOccac) >= i12 && m872getMainAxisgyyYBs(m5247plusqkQi6aY) >= i12)) {
                        animation.cancelPlacementAnimation();
                    }
                    mo865getOffsetnOccac = m5247plusqkQi6aY;
                }
                graphicsLayer = animation.getLayer();
            } else {
                graphicsLayer = null;
            }
            if (this.reverseLayout) {
                mo865getOffsetnOccac = IntOffset.m5237constructorimpl(((isVertical() ? (this.mainAxisLayoutSize - IntOffset.m5244getYimpl(mo865getOffsetnOccac)) - getMainAxisSize(placeable) : IntOffset.m5244getYimpl(mo865getOffsetnOccac)) & 4294967295L) | ((isVertical() ? IntOffset.m5243getXimpl(mo865getOffsetnOccac) : (this.mainAxisLayoutSize - IntOffset.m5243getXimpl(mo865getOffsetnOccac)) - getMainAxisSize(placeable)) << 32));
            }
            long m5247plusqkQi6aY2 = IntOffset.m5247plusqkQi6aY(mo865getOffsetnOccac, this.visualOffset);
            if (!z11 && animation != null) {
                animation.m890setFinalOffsetgyyYBs(m5247plusqkQi6aY2);
            }
            if (!isVertical()) {
                placementScope2 = placementScope;
                GraphicsLayer graphicsLayer2 = graphicsLayer;
                if (graphicsLayer2 != null) {
                    Placeable.PlacementScope.m3924placeRelativeWithLayeraW9wM$default(placementScope2, placeable, m5247plusqkQi6aY2, graphicsLayer2, 0.0f, 4, (Object) null);
                } else {
                    Placeable.PlacementScope.m3923placeRelativeWithLayeraW9wM$default(placementScope2, placeable, m5247plusqkQi6aY2, 0.0f, (x00.l) null, 6, (Object) null);
                }
            } else if (graphicsLayer != null) {
                placementScope2 = placementScope;
                Placeable.PlacementScope.m3926placeWithLayeraW9wM$default(placementScope2, placeable, m5247plusqkQi6aY2, graphicsLayer, 0.0f, 4, (Object) null);
            } else {
                placementScope2 = placementScope;
                Placeable.PlacementScope.m3925placeWithLayeraW9wM$default(placementScope2, placeable, m5247plusqkQi6aY2, 0.0f, (x00.l) null, 6, (Object) null);
            }
            i11++;
            placementScope = placementScope2;
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public void position(int i11, int i12, int i13, int i14) {
        position(i11, i12, i13, i14, -1, -1);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public void setNonScrollableItem(boolean z11) {
        this.nonScrollableItem = z11;
    }

    public final void updateMainAxisLayoutSize(int i11) {
        this.mainAxisLayoutSize = i11;
        this.maxMainAxisOffset = i11 + this.afterContentPadding;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private LazyGridMeasuredItem(int i11, Object obj, boolean z11, int i12, int i13, boolean z12, LayoutDirection layoutDirection, int i14, int i15, List<? extends Placeable> list, long j11, Object obj2, LazyLayoutItemAnimator<LazyGridMeasuredItem> lazyLayoutItemAnimator, long j12, int i16, int i17) {
        this.index = i11;
        this.key = obj;
        this.isVertical = z11;
        this.crossAxisSize = i12;
        this.reverseLayout = z12;
        this.layoutDirection = layoutDirection;
        this.beforeContentPadding = i14;
        this.afterContentPadding = i15;
        this.placeables = list;
        this.visualOffset = j11;
        this.contentType = obj2;
        this.animator = lazyLayoutItemAnimator;
        this.constraints = j12;
        this.lane = i16;
        this.span = i17;
        this.mainAxisLayoutSize = Integer.MIN_VALUE;
        int size = list.size();
        int i18 = 0;
        for (int i19 = 0; i19 < size; i19++) {
            Placeable placeable = (Placeable) list.get(i19);
            i18 = Math.max(i18, isVertical() ? placeable.getHeight() : placeable.getWidth());
        }
        this.mainAxisSize = i18;
        this.mainAxisSizeWithSpacings = u.u(i13 + i18, 0);
        this.size = isVertical() ? IntSize.m5281constructorimpl((i18 & 4294967295L) | (this.crossAxisSize << 32)) : IntSize.m5281constructorimpl((this.crossAxisSize & 4294967295L) | (i18 << 32));
        this.offset = IntOffset.Companion.m5254getZeronOccac();
        this.row = -1;
        this.column = -1;
    }

    private final int getMainAxisSize(Placeable placeable) {
        return isVertical() ? placeable.getHeight() : placeable.getWidth();
    }

    public final void position(int i11, int i12, int i13, int i14, int i15, int i16) {
        this.mainAxisLayoutSize = isVertical() ? i14 : i13;
        if (!isVertical()) {
            i13 = i14;
        }
        if (isVertical() && this.layoutDirection == LayoutDirection.Rtl) {
            i12 = (i13 - i12) - this.crossAxisSize;
        }
        this.offset = isVertical() ? IntOffset.m5237constructorimpl((i12 << 32) | (4294967295L & i11)) : IntOffset.m5237constructorimpl((i12 & 4294967295L) | (i11 << 32));
        this.row = i15;
        this.column = i16;
        this.minMainAxisOffset = -this.beforeContentPadding;
        this.maxMainAxisOffset = this.mainAxisLayoutSize + this.afterContentPadding;
    }
}
