package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nMeasuredPage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeasuredPage.kt\nandroidx/compose/foundation/pager/MeasuredPage\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 4 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,129:1\n125#1:160\n34#2,6:130\n70#2,4:136\n75#2:154\n107#3,7:140\n107#3,7:147\n96#3,5:155\n32#4:161\n32#4:163\n32#4:165\n80#5:162\n80#5:164\n80#5:166\n*S KotlinDebug\n*F\n+ 1 MeasuredPage.kt\nandroidx/compose/foundation/pager/MeasuredPage\n*L\n94#1:160\n52#1:130,6\n68#1:136,4\n68#1:154\n72#1:140,7\n79#1:147,7\n88#1:155,5\n94#1:161\n119#1:163\n125#1:165\n94#1:162\n119#1:164\n125#1:166\n*E\n"})
/* loaded from: classes.dex */
public final class MeasuredPage implements PageInfo {
    public static final int $stable = 8;
    private final int crossAxisSize;

    @l
    private final Alignment.Horizontal horizontalAlignment;
    private final int index;
    private final boolean isVertical;

    @k
    private final Object key;

    @k
    private final LayoutDirection layoutDirection;
    private int mainAxisLayoutSize;
    private int offset;

    @k
    private final int[] placeableOffsets;

    @k
    private final List<Placeable> placeables;
    private final boolean reverseLayout;
    private final int size;

    @l
    private final Alignment.Vertical verticalAlignment;
    private final long visualOffset;

    public /* synthetic */ MeasuredPage(int i11, int i12, List list, long j11, Object obj, Orientation orientation, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z11, v vVar) {
        this(i11, i12, list, j11, obj, orientation, horizontal, vertical, layoutDirection, z11);
    }

    /* renamed from: copy-4Tuh3kE, reason: not valid java name */
    private final long m967copy4Tuh3kE(long j11, x00.l<? super Integer, Integer> lVar) {
        int m5243getXimpl = this.isVertical ? IntOffset.m5243getXimpl(j11) : lVar.invoke(Integer.valueOf(IntOffset.m5243getXimpl(j11))).intValue();
        boolean z11 = this.isVertical;
        int m5244getYimpl = IntOffset.m5244getYimpl(j11);
        if (z11) {
            m5244getYimpl = lVar.invoke(Integer.valueOf(m5244getYimpl)).intValue();
        }
        return IntOffset.m5237constructorimpl((m5243getXimpl << 32) | (m5244getYimpl & 4294967295L));
    }

    private final int getMainAxisSize(Placeable placeable) {
        return this.isVertical ? placeable.getHeight() : placeable.getWidth();
    }

    /* renamed from: getOffset-Bjo55l4, reason: not valid java name */
    private final long m968getOffsetBjo55l4(int i11) {
        int[] iArr = this.placeableOffsets;
        int i12 = i11 * 2;
        return IntOffset.m5237constructorimpl((iArr[i12] << 32) | (iArr[i12 + 1] & 4294967295L));
    }

    public final void applyScrollDelta(int i11) {
        this.offset = getOffset() + i11;
        int length = this.placeableOffsets.length;
        for (int i12 = 0; i12 < length; i12++) {
            boolean z11 = this.isVertical;
            if ((z11 && i12 % 2 == 1) || (!z11 && i12 % 2 == 0)) {
                int[] iArr = this.placeableOffsets;
                iArr[i12] = iArr[i12] + i11;
            }
        }
    }

    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    @Override // androidx.compose.foundation.pager.PageInfo
    public int getIndex() {
        return this.index;
    }

    @Override // androidx.compose.foundation.pager.PageInfo
    @k
    public Object getKey() {
        return this.key;
    }

    @Override // androidx.compose.foundation.pager.PageInfo
    public int getOffset() {
        return this.offset;
    }

    public final int getSize() {
        return this.size;
    }

    public final void place(@k Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope placementScope2;
        int i11 = 0;
        if (!(this.mainAxisLayoutSize != Integer.MIN_VALUE)) {
            InlineClassHelperKt.throwIllegalArgumentException("position() should be called first");
        }
        int size = this.placeables.size();
        while (i11 < size) {
            Placeable placeable = this.placeables.get(i11);
            long m968getOffsetBjo55l4 = m968getOffsetBjo55l4(i11);
            if (this.reverseLayout) {
                m968getOffsetBjo55l4 = IntOffset.m5237constructorimpl(((this.isVertical ? IntOffset.m5243getXimpl(m968getOffsetBjo55l4) : (this.mainAxisLayoutSize - IntOffset.m5243getXimpl(m968getOffsetBjo55l4)) - getMainAxisSize(placeable)) << 32) | ((this.isVertical ? (this.mainAxisLayoutSize - IntOffset.m5244getYimpl(m968getOffsetBjo55l4)) - getMainAxisSize(placeable) : IntOffset.m5244getYimpl(m968getOffsetBjo55l4)) & 4294967295L));
            }
            long m5247plusqkQi6aY = IntOffset.m5247plusqkQi6aY(m968getOffsetBjo55l4, this.visualOffset);
            if (this.isVertical) {
                placementScope2 = placementScope;
                Placeable.PlacementScope.m3925placeWithLayeraW9wM$default(placementScope2, placeable, m5247plusqkQi6aY, 0.0f, (x00.l) null, 6, (Object) null);
            } else {
                placementScope2 = placementScope;
                Placeable.PlacementScope.m3923placeRelativeWithLayeraW9wM$default(placementScope2, placeable, m5247plusqkQi6aY, 0.0f, (x00.l) null, 6, (Object) null);
            }
            i11++;
            placementScope = placementScope2;
        }
    }

    public final void position(int i11, int i12, int i13) {
        int width;
        this.offset = i11;
        this.mainAxisLayoutSize = this.isVertical ? i13 : i12;
        List<Placeable> list = this.placeables;
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            Placeable placeable = list.get(i14);
            int i15 = i14 * 2;
            if (this.isVertical) {
                int[] iArr = this.placeableOffsets;
                Alignment.Horizontal horizontal = this.horizontalAlignment;
                if (horizontal == null) {
                    InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("null horizontalAlignment");
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
                    InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("null verticalAlignment");
                    throw new KotlinNothingValueException();
                }
                iArr2[i16] = vertical.align(placeable.getHeight(), i13);
                width = placeable.getWidth();
            }
            i11 += width;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private MeasuredPage(int i11, int i12, List<? extends Placeable> list, long j11, Object obj, Orientation orientation, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z11) {
        this.index = i11;
        this.size = i12;
        this.placeables = list;
        this.visualOffset = j11;
        this.key = obj;
        this.horizontalAlignment = horizontal;
        this.verticalAlignment = vertical;
        this.layoutDirection = layoutDirection;
        this.reverseLayout = z11;
        this.isVertical = orientation == Orientation.Vertical;
        int size = list.size();
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            Placeable placeable = (Placeable) list.get(i14);
            i13 = Math.max(i13, !this.isVertical ? placeable.getHeight() : placeable.getWidth());
        }
        this.crossAxisSize = i13;
        this.placeableOffsets = new int[this.placeables.size() * 2];
        this.mainAxisLayoutSize = Integer.MIN_VALUE;
    }
}
