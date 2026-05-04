package androidx.compose.foundation.layout;

import androidx.collection.IntIntPair;
import androidx.compose.foundation.layout.FlowLayoutOverflow;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nFlowLayoutBuildingBlocks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowLayoutBuildingBlocks.kt\nandroidx/compose/foundation/layout/FlowLayoutBuildingBlocks\n+ 2 RowColumnImpl.kt\nandroidx/compose/foundation/layout/OrientationIndependentConstraints\n*L\n1#1,183:1\n213#2:184\n213#2:185\n*S KotlinDebug\n*F\n+ 1 FlowLayoutBuildingBlocks.kt\nandroidx/compose/foundation/layout/FlowLayoutBuildingBlocks\n*L\n114#1:184\n161#1:185\n*E\n"})
/* loaded from: classes.dex */
public final class FlowLayoutBuildingBlocks {
    public static final int $stable = 8;
    private final long constraints;
    private final int crossAxisSpacing;
    private final int mainAxisSpacing;
    private final int maxItemsInMainAxis;
    private final int maxLines;

    @m80.k
    private final FlowLayoutOverflowState overflow;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class WrapEllipsisInfo {
        public static final int $stable = 8;

        @m80.k
        private final Measurable ellipsis;
        private final long ellipsisSize;
        private boolean placeEllipsisOnLastContentLine;

        @l
        private final Placeable placeable;

        public /* synthetic */ WrapEllipsisInfo(Measurable measurable, Placeable placeable, long j11, boolean z11, v vVar) {
            this(measurable, placeable, j11, z11);
        }

        @m80.k
        public final Measurable getEllipsis() {
            return this.ellipsis;
        }

        /* renamed from: getEllipsisSize-OO21N7I, reason: not valid java name */
        public final long m649getEllipsisSizeOO21N7I() {
            return this.ellipsisSize;
        }

        public final boolean getPlaceEllipsisOnLastContentLine() {
            return this.placeEllipsisOnLastContentLine;
        }

        @l
        public final Placeable getPlaceable() {
            return this.placeable;
        }

        public final void setPlaceEllipsisOnLastContentLine(boolean z11) {
            this.placeEllipsisOnLastContentLine = z11;
        }

        private WrapEllipsisInfo(Measurable measurable, Placeable placeable, long j11, boolean z11) {
            this.ellipsis = measurable;
            this.placeable = placeable;
            this.ellipsisSize = j11;
            this.placeEllipsisOnLastContentLine = z11;
        }

        public /* synthetic */ WrapEllipsisInfo(Measurable measurable, Placeable placeable, long j11, boolean z11, int i11, v vVar) {
            this(measurable, placeable, j11, (i11 & 8) != 0 ? true : z11, null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class WrapInfo {
        public static final int $stable = 0;
        private final boolean isLastItemInContainer;
        private final boolean isLastItemInLine;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public WrapInfo() {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlowLayoutBuildingBlocks.WrapInfo.<init>():void");
        }

        public final boolean isLastItemInContainer() {
            return this.isLastItemInContainer;
        }

        public final boolean isLastItemInLine() {
            return this.isLastItemInLine;
        }

        public WrapInfo(boolean z11, boolean z12) {
            this.isLastItemInLine = z11;
            this.isLastItemInContainer = z12;
        }

        public /* synthetic */ WrapInfo(boolean z11, boolean z12, int i11, v vVar) {
            this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? false : z12);
        }
    }

    public /* synthetic */ FlowLayoutBuildingBlocks(int i11, FlowLayoutOverflowState flowLayoutOverflowState, long j11, int i12, int i13, int i14, v vVar) {
        this(i11, flowLayoutOverflowState, j11, i12, i13, i14);
    }

    @l
    public final WrapEllipsisInfo getWrapEllipsisInfo(@m80.k WrapInfo wrapInfo, boolean z11, int i11, int i12, int i13, int i14) {
        WrapEllipsisInfo ellipsisInfo$foundation_layout_release;
        if (!wrapInfo.isLastItemInContainer() || (ellipsisInfo$foundation_layout_release = this.overflow.ellipsisInfo$foundation_layout_release(z11, i11, i12)) == null) {
            return null;
        }
        ellipsisInfo$foundation_layout_release.setPlaceEllipsisOnLastContentLine(i11 >= 0 && (i14 == 0 || (i13 - IntIntPair.m21getFirstimpl(ellipsisInfo$foundation_layout_release.m649getEllipsisSizeOO21N7I()) >= 0 && i14 < this.maxItemsInMainAxis)));
        return ellipsisInfo$foundation_layout_release;
    }

    @m80.k
    /* renamed from: getWrapInfo-OpUlnko, reason: not valid java name */
    public final WrapInfo m648getWrapInfoOpUlnko(boolean z11, int i11, long j11, @l IntIntPair intIntPair, int i12, int i13, int i14, boolean z12, boolean z13) {
        int i15 = i13 + i14;
        if (intIntPair == null) {
            return new WrapInfo(true, true);
        }
        if (this.overflow.getType$foundation_layout_release() != FlowLayoutOverflow.OverflowType.Visible && (i12 >= this.maxLines || IntIntPair.m22getSecondimpl(j11) - IntIntPair.m22getSecondimpl(intIntPair.m25unboximpl()) < 0)) {
            return new WrapInfo(true, true);
        }
        if (i11 != 0 && (i11 >= this.maxItemsInMainAxis || IntIntPair.m21getFirstimpl(j11) - IntIntPair.m21getFirstimpl(intIntPair.m25unboximpl()) < 0)) {
            return z12 ? new WrapInfo(true, true) : new WrapInfo(true, m648getWrapInfoOpUlnko(z11, 0, IntIntPair.m17constructorimpl(Constraints.m5068getMaxWidthimpl(this.constraints), (IntIntPair.m22getSecondimpl(j11) - this.crossAxisSpacing) - i14), IntIntPair.m14boximpl(IntIntPair.m17constructorimpl(IntIntPair.m21getFirstimpl(intIntPair.m25unboximpl()) - this.mainAxisSpacing, IntIntPair.m22getSecondimpl(intIntPair.m25unboximpl()))), i12 + 1, i15, 0, true, false).isLastItemInContainer());
        }
        int max = i13 + Math.max(i14, IntIntPair.m22getSecondimpl(intIntPair.m25unboximpl()));
        IntIntPair m653ellipsisSizeF35zmw$foundation_layout_release = z13 ? null : this.overflow.m653ellipsisSizeF35zmw$foundation_layout_release(z11, i12, max);
        if (m653ellipsisSizeF35zmw$foundation_layout_release != null) {
            m653ellipsisSizeF35zmw$foundation_layout_release.m25unboximpl();
            if (i11 + 1 >= this.maxItemsInMainAxis || ((IntIntPair.m21getFirstimpl(j11) - IntIntPair.m21getFirstimpl(intIntPair.m25unboximpl())) - this.mainAxisSpacing) - IntIntPair.m21getFirstimpl(m653ellipsisSizeF35zmw$foundation_layout_release.m25unboximpl()) < 0) {
                if (z13) {
                    return new WrapInfo(true, true);
                }
                WrapInfo m648getWrapInfoOpUlnko = m648getWrapInfoOpUlnko(false, 0, IntIntPair.m17constructorimpl(Constraints.m5068getMaxWidthimpl(this.constraints), (IntIntPair.m22getSecondimpl(j11) - this.crossAxisSpacing) - Math.max(i14, IntIntPair.m22getSecondimpl(intIntPair.m25unboximpl()))), m653ellipsisSizeF35zmw$foundation_layout_release, i12 + 1, max, 0, true, true);
                return new WrapInfo(m648getWrapInfoOpUlnko.isLastItemInContainer(), m648getWrapInfoOpUlnko.isLastItemInContainer());
            }
        }
        return new WrapInfo(false, false);
    }

    private FlowLayoutBuildingBlocks(int i11, FlowLayoutOverflowState flowLayoutOverflowState, long j11, int i12, int i13, int i14) {
        this.maxItemsInMainAxis = i11;
        this.overflow = flowLayoutOverflowState;
        this.constraints = j11;
        this.maxLines = i12;
        this.mainAxisSpacing = i13;
        this.crossAxisSpacing = i14;
    }
}
