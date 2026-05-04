package androidx.compose.foundation.lazy;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import g10.u;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nLazyListMeasuredItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListMeasuredItem.kt\nandroidx/compose/foundation/lazy/LazyListMeasuredItem\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 4 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,264:1\n260#1:292\n260#1:300\n34#2,6:265\n70#2,4:271\n75#2:289\n107#3,7:275\n107#3,7:282\n96#3,5:295\n32#4:290\n32#4:293\n32#4:301\n32#4:303\n80#5:291\n80#5:294\n80#5:302\n80#5:304\n*S KotlinDebug\n*F\n+ 1 LazyListMeasuredItem.kt\nandroidx/compose/foundation/lazy/LazyListMeasuredItem\n*L\n183#1:292\n229#1:300\n97#1:265,6\n129#1:271,4\n129#1:289\n133#1:275,7\n142#1:282,7\n191#1:295,5\n163#1:290\n183#1:293\n229#1:301\n260#1:303\n163#1:291\n183#1:294\n229#1:302\n260#1:304\n*E\n"})
/* loaded from: classes.dex */
public final class LazyListMeasuredItem implements LazyListItemInfo, LazyLayoutMeasuredItem {
    public static final int $stable = 8;
    private final int afterContentPadding;

    @k
    private final LazyLayoutItemAnimator<LazyListMeasuredItem> animator;
    private final int beforeContentPadding;
    private final long constraints;

    @l
    private final Object contentType;
    private final int crossAxisSize;

    @l
    private final Alignment.Horizontal horizontalAlignment;
    private final int index;
    private final boolean isVertical;

    @k
    private final Object key;
    private final int lane;

    @k
    private final LayoutDirection layoutDirection;
    private int mainAxisLayoutSize;
    private final int mainAxisSizeWithSpacings;
    private int maxMainAxisOffset;
    private int minMainAxisOffset;
    private boolean nonScrollableItem;
    private int offset;

    @k
    private final int[] placeableOffsets;

    @k
    private final List<Placeable> placeables;
    private final boolean reverseLayout;
    private final int size;
    private final int spacing;
    private final int span;

    @l
    private final Alignment.Vertical verticalAlignment;
    private final long visualOffset;

    public /* synthetic */ LazyListMeasuredItem(int i11, List list, boolean z11, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z12, int i12, int i13, int i14, long j11, Object obj, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j12, v vVar) {
        this(i11, list, z11, horizontal, vertical, layoutDirection, z12, i12, i13, i14, j11, obj, obj2, lazyLayoutItemAnimator, j12);
    }

    /* renamed from: copy-4Tuh3kE, reason: not valid java name */
    private final long m837copy4Tuh3kE(long j11, x00.l<? super Integer, Integer> lVar) {
        int m5244getYimpl;
        long j12;
        if (isVertical()) {
            int m5243getXimpl = IntOffset.m5243getXimpl(j11);
            m5244getYimpl = lVar.invoke(Integer.valueOf(IntOffset.m5244getYimpl(j11))).intValue();
            j12 = m5243getXimpl;
        } else {
            int intValue = lVar.invoke(Integer.valueOf(IntOffset.m5243getXimpl(j11))).intValue();
            m5244getYimpl = IntOffset.m5244getYimpl(j11);
            j12 = intValue;
        }
        return IntOffset.m5237constructorimpl((j12 << 32) | (m5244getYimpl & 4294967295L));
    }

    /* renamed from: getMainAxis--gyyYBs, reason: not valid java name */
    private final int m838getMainAxisgyyYBs(long j11) {
        return isVertical() ? IntOffset.m5244getYimpl(j11) : IntOffset.m5243getXimpl(j11);
    }

    private final int getMainAxisSize(Placeable placeable) {
        return isVertical() ? placeable.getHeight() : placeable.getWidth();
    }

    public final void applyScrollDelta(int i11, boolean z11) {
        int intValue;
        int m5244getYimpl;
        if (getNonScrollableItem()) {
            return;
        }
        this.offset = getOffset() + i11;
        int length = this.placeableOffsets.length;
        for (int i12 = 0; i12 < length; i12++) {
            int i13 = i12 & 1;
            if ((isVertical() && i13 != 0) || (!isVertical() && i13 == 0)) {
                int[] iArr = this.placeableOffsets;
                iArr[i12] = iArr[i12] + i11;
            }
        }
        if (z11) {
            int placeablesCount = getPlaceablesCount();
            for (int i14 = 0; i14 < placeablesCount; i14++) {
                LazyLayoutItemAnimation animation = this.animator.getAnimation(getKey(), i14);
                if (animation != null) {
                    long m889getRawOffsetnOccac = animation.m889getRawOffsetnOccac();
                    if (isVertical()) {
                        intValue = IntOffset.m5243getXimpl(m889getRawOffsetnOccac);
                        m5244getYimpl = Integer.valueOf(IntOffset.m5244getYimpl(m889getRawOffsetnOccac) + i11).intValue();
                    } else {
                        intValue = Integer.valueOf(IntOffset.m5243getXimpl(m889getRawOffsetnOccac) + i11).intValue();
                        m5244getYimpl = IntOffset.m5244getYimpl(m889getRawOffsetnOccac);
                    }
                    animation.m892setRawOffsetgyyYBs(IntOffset.m5237constructorimpl((intValue << 32) | (4294967295L & m5244getYimpl)));
                }
            }
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* renamed from: getConstraints-msEJaDk, reason: not valid java name */
    public long mo839getConstraintsmsEJaDk() {
        return this.constraints;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    @l
    public Object getContentType() {
        return this.contentType;
    }

    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getIndex() {
        return this.index;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    @k
    public Object getKey() {
        return this.key;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getLane() {
        return this.lane;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getMainAxisSizeWithSpacings() {
        return this.mainAxisSizeWithSpacings;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public boolean getNonScrollableItem() {
        return this.nonScrollableItem;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    public int getOffset() {
        return this.offset;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* renamed from: getOffset-Bjo55l4, reason: not valid java name */
    public long mo840getOffsetBjo55l4(int i11) {
        int[] iArr = this.placeableOffsets;
        int i12 = i11 * 2;
        return IntOffset.m5237constructorimpl((iArr[i12] << 32) | (iArr[i12 + 1] & 4294967295L));
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

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    public int getSize() {
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

    public final void place(@k Placeable.PlacementScope placementScope, boolean z11) {
        GraphicsLayer graphicsLayer;
        Placeable.PlacementScope placementScope2;
        long m5243getXimpl;
        int i11 = 0;
        if (!(this.mainAxisLayoutSize != Integer.MIN_VALUE)) {
            InlineClassHelperKt.throwIllegalArgumentException("position() should be called first");
        }
        int placeablesCount = getPlaceablesCount();
        while (i11 < placeablesCount) {
            Placeable placeable = this.placeables.get(i11);
            int mainAxisSize = this.minMainAxisOffset - getMainAxisSize(placeable);
            int i12 = this.maxMainAxisOffset;
            long mo840getOffsetBjo55l4 = mo840getOffsetBjo55l4(i11);
            LazyLayoutItemAnimation animation = this.animator.getAnimation(getKey(), i11);
            if (animation != null) {
                if (z11) {
                    animation.m891setLookaheadOffsetgyyYBs(mo840getOffsetBjo55l4);
                } else {
                    if (!IntOffset.m5242equalsimpl0(animation.m887getLookaheadOffsetnOccac(), LazyLayoutItemAnimation.Companion.m893getNotInitializednOccac())) {
                        mo840getOffsetBjo55l4 = animation.m887getLookaheadOffsetnOccac();
                    }
                    long m5247plusqkQi6aY = IntOffset.m5247plusqkQi6aY(mo840getOffsetBjo55l4, animation.m888getPlacementDeltanOccac());
                    if ((m838getMainAxisgyyYBs(mo840getOffsetBjo55l4) <= mainAxisSize && m838getMainAxisgyyYBs(m5247plusqkQi6aY) <= mainAxisSize) || (m838getMainAxisgyyYBs(mo840getOffsetBjo55l4) >= i12 && m838getMainAxisgyyYBs(m5247plusqkQi6aY) >= i12)) {
                        animation.cancelPlacementAnimation();
                    }
                    mo840getOffsetBjo55l4 = m5247plusqkQi6aY;
                }
                graphicsLayer = animation.getLayer();
            } else {
                graphicsLayer = null;
            }
            if (this.reverseLayout) {
                if (isVertical()) {
                    m5243getXimpl = (((this.mainAxisLayoutSize - IntOffset.m5244getYimpl(mo840getOffsetBjo55l4)) - getMainAxisSize(placeable)) & 4294967295L) | (IntOffset.m5243getXimpl(mo840getOffsetBjo55l4) << 32);
                } else {
                    m5243getXimpl = (((this.mainAxisLayoutSize - IntOffset.m5243getXimpl(mo840getOffsetBjo55l4)) - getMainAxisSize(placeable)) << 32) | (4294967295L & IntOffset.m5244getYimpl(mo840getOffsetBjo55l4));
                }
                mo840getOffsetBjo55l4 = IntOffset.m5237constructorimpl(m5243getXimpl);
            }
            long m5247plusqkQi6aY2 = IntOffset.m5247plusqkQi6aY(mo840getOffsetBjo55l4, this.visualOffset);
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
        position(i11, i13, i14);
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
    private LazyListMeasuredItem(int i11, List<? extends Placeable> list, boolean z11, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z12, int i12, int i13, int i14, long j11, Object obj, Object obj2, LazyLayoutItemAnimator<LazyListMeasuredItem> lazyLayoutItemAnimator, long j12) {
        this.index = i11;
        this.placeables = list;
        this.isVertical = z11;
        this.horizontalAlignment = horizontal;
        this.verticalAlignment = vertical;
        this.layoutDirection = layoutDirection;
        this.reverseLayout = z12;
        this.beforeContentPadding = i12;
        this.afterContentPadding = i13;
        this.spacing = i14;
        this.visualOffset = j11;
        this.key = obj;
        this.contentType = obj2;
        this.animator = lazyLayoutItemAnimator;
        this.constraints = j12;
        this.span = 1;
        this.mainAxisLayoutSize = Integer.MIN_VALUE;
        int size = list.size();
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < size; i17++) {
            Placeable placeable = (Placeable) list.get(i17);
            i15 += isVertical() ? placeable.getHeight() : placeable.getWidth();
            i16 = Math.max(i16, !isVertical() ? placeable.getHeight() : placeable.getWidth());
        }
        this.size = i15;
        this.mainAxisSizeWithSpacings = u.u(getSize() + this.spacing, 0);
        this.crossAxisSize = i16;
        this.placeableOffsets = new int[this.placeables.size() * 2];
    }

    public final void position(int i11, int i12, int i13) {
        int width;
        this.offset = i11;
        this.mainAxisLayoutSize = isVertical() ? i13 : i12;
        List<Placeable> list = this.placeables;
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            Placeable placeable = list.get(i14);
            int i15 = i14 * 2;
            if (isVertical()) {
                int[] iArr = this.placeableOffsets;
                Alignment.Horizontal horizontal = this.horizontalAlignment;
                if (horizontal == null) {
                    InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("null horizontalAlignment when isVertical == true");
                    throw new KotlinNothingValueException();
                }
                iArr[i15] = horizontal.align(placeable.getWidth(), i12, this.layoutDirection);
                this.placeableOffsets[i15 + 1] = i11;
                width = placeable.getHeight();
            } else {
                int[] iArr2 = this.placeableOffsets;
                iArr2[i15] = i11;
                int i16 = i15 + 1;
                Alignment.Vertical vertical = this.verticalAlignment;
                if (vertical == null) {
                    InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("null verticalAlignment when isVertical == false");
                    throw new KotlinNothingValueException();
                }
                iArr2[i16] = vertical.align(placeable.getHeight(), i13);
                width = placeable.getWidth();
            }
            i11 += width;
        }
        this.minMainAxisOffset = -this.beforeContentPadding;
        this.maxMainAxisOffset = this.mainAxisLayoutSize + this.afterContentPadding;
    }
}
