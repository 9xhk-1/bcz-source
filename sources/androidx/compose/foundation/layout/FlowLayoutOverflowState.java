package androidx.compose.foundation.layout;

import androidx.collection.IntIntPair;
import androidx.compose.foundation.layout.FlowLayoutBuildingBlocks;
import androidx.compose.foundation.layout.FlowLayoutOverflow;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nFlowLayoutOverflow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowLayoutOverflow.kt\nandroidx/compose/foundation/layout/FlowLayoutOverflowState\n+ 2 RowColumnImpl.kt\nandroidx/compose/foundation/layout/OrientationIndependentConstraints\n*L\n1#1,869:1\n219#2:870\n219#2:871\n*S KotlinDebug\n*F\n+ 1 FlowLayoutOverflow.kt\nandroidx/compose/foundation/layout/FlowLayoutOverflowState\n*L\n794#1:870\n802#1:871\n*E\n"})
/* loaded from: classes.dex */
public final class FlowLayoutOverflowState {
    public static final int $stable = 8;

    @l
    private Measurable collapseMeasurable;

    @l
    private Placeable collapsePlaceable;

    @l
    private IntIntPair collapseSize;

    @l
    private p<? super Boolean, ? super Integer, ? extends Measurable> getOverflowMeasurable;
    private int itemCount;
    private final int minCrossAxisSizeToShowCollapse;
    private final int minLinesToShowCollapse;

    @l
    private Measurable seeMoreMeasurable;

    @l
    private Placeable seeMorePlaceable;

    @l
    private IntIntPair seeMoreSize;

    @m80.k
    private final FlowLayoutOverflow.OverflowType type;

    @m80.k
    private final String shownItemLazyErrorMessage = "Accessing shownItemCount before it is set. Are you calling this in the Composition phase, rather than in the draw phase? Consider our samples on how to use it during the draw phase or consider using ContextualFlowRow/ContextualFlowColumn which initializes this method in the composition phase.";
    private int itemShown = -1;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FlowLayoutOverflow.OverflowType.values().length];
            try {
                iArr[FlowLayoutOverflow.OverflowType.Visible.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FlowLayoutOverflow.OverflowType.Clip.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FlowLayoutOverflow.OverflowType.ExpandIndicator.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FlowLayoutOverflow.OverflowType.ExpandOrCollapseIndicator.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public FlowLayoutOverflowState(@m80.k FlowLayoutOverflow.OverflowType overflowType, int i11, int i12) {
        this.type = overflowType;
        this.minLinesToShowCollapse = i11;
        this.minCrossAxisSizeToShowCollapse = i12;
    }

    public static /* synthetic */ FlowLayoutOverflowState copy$default(FlowLayoutOverflowState flowLayoutOverflowState, FlowLayoutOverflow.OverflowType overflowType, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            overflowType = flowLayoutOverflowState.type;
        }
        if ((i13 & 2) != 0) {
            i11 = flowLayoutOverflowState.minLinesToShowCollapse;
        }
        if ((i13 & 4) != 0) {
            i12 = flowLayoutOverflowState.minCrossAxisSizeToShowCollapse;
        }
        return flowLayoutOverflowState.copy(overflowType, i11, i12);
    }

    @m80.k
    public final FlowLayoutOverflow.OverflowType component1$foundation_layout_release() {
        return this.type;
    }

    public final int component2$foundation_layout_release() {
        return this.minLinesToShowCollapse;
    }

    public final int component3$foundation_layout_release() {
        return this.minCrossAxisSizeToShowCollapse;
    }

    @m80.k
    public final FlowLayoutOverflowState copy(@m80.k FlowLayoutOverflow.OverflowType overflowType, int i11, int i12) {
        return new FlowLayoutOverflowState(overflowType, i11, i12);
    }

    @l
    public final FlowLayoutBuildingBlocks.WrapEllipsisInfo ellipsisInfo$foundation_layout_release(boolean z11, int i11, int i12) {
        Measurable measurable;
        IntIntPair intIntPair;
        Placeable placeable;
        Measurable measurable2;
        Placeable placeable2;
        int i13 = WhenMappings.$EnumSwitchMapping$0[this.type.ordinal()];
        if (i13 == 1 || i13 == 2) {
            return null;
        }
        if (i13 != 3 && i13 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        if (z11) {
            p<? super Boolean, ? super Integer, ? extends Measurable> pVar = this.getOverflowMeasurable;
            if (pVar == null || (measurable = pVar.invoke(Boolean.TRUE, Integer.valueOf(getShownItemCount$foundation_layout_release()))) == null) {
                measurable = this.seeMoreMeasurable;
            }
            intIntPair = this.seeMoreSize;
            if (this.getOverflowMeasurable == null) {
                placeable = this.seeMorePlaceable;
                measurable2 = measurable;
                placeable2 = placeable;
            }
            measurable2 = measurable;
            placeable2 = null;
        } else {
            if (i11 < this.minLinesToShowCollapse - 1 || i12 < this.minCrossAxisSizeToShowCollapse) {
                measurable = null;
            } else {
                p<? super Boolean, ? super Integer, ? extends Measurable> pVar2 = this.getOverflowMeasurable;
                if (pVar2 == null || (measurable = pVar2.invoke(Boolean.FALSE, Integer.valueOf(getShownItemCount$foundation_layout_release()))) == null) {
                    measurable = this.collapseMeasurable;
                }
            }
            intIntPair = this.collapseSize;
            if (this.getOverflowMeasurable == null) {
                placeable = this.collapsePlaceable;
                measurable2 = measurable;
                placeable2 = placeable;
            }
            measurable2 = measurable;
            placeable2 = null;
        }
        if (measurable2 == null) {
            return null;
        }
        g0.m(intIntPair);
        return new FlowLayoutBuildingBlocks.WrapEllipsisInfo(measurable2, placeable2, intIntPair.m25unboximpl(), false, 8, null);
    }

    @l
    /* renamed from: ellipsisSize-F35zm-w$foundation_layout_release, reason: not valid java name */
    public final IntIntPair m653ellipsisSizeF35zmw$foundation_layout_release(boolean z11, int i11, int i12) {
        int i13 = WhenMappings.$EnumSwitchMapping$0[this.type.ordinal()];
        if (i13 != 1 && i13 != 2) {
            if (i13 != 3) {
                if (i13 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                if (z11) {
                    return this.seeMoreSize;
                }
                if (i11 + 1 < this.minLinesToShowCollapse || i12 < this.minCrossAxisSizeToShowCollapse) {
                    return null;
                }
                return this.collapseSize;
            }
            if (z11) {
                return this.seeMoreSize;
            }
        }
        return null;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlowLayoutOverflowState)) {
            return false;
        }
        FlowLayoutOverflowState flowLayoutOverflowState = (FlowLayoutOverflowState) obj;
        return this.type == flowLayoutOverflowState.type && this.minLinesToShowCollapse == flowLayoutOverflowState.minLinesToShowCollapse && this.minCrossAxisSizeToShowCollapse == flowLayoutOverflowState.minCrossAxisSizeToShowCollapse;
    }

    public final int getItemCount$foundation_layout_release() {
        return this.itemCount;
    }

    public final int getItemShown$foundation_layout_release() {
        return this.itemShown;
    }

    public final int getMinCrossAxisSizeToShowCollapse$foundation_layout_release() {
        return this.minCrossAxisSizeToShowCollapse;
    }

    public final int getMinLinesToShowCollapse$foundation_layout_release() {
        return this.minLinesToShowCollapse;
    }

    public final int getShownItemCount$foundation_layout_release() {
        int i11 = this.itemShown;
        if (i11 != -1) {
            return i11;
        }
        throw new IllegalStateException(this.shownItemLazyErrorMessage);
    }

    @m80.k
    public final String getShownItemLazyErrorMessage$foundation_layout_release() {
        return this.shownItemLazyErrorMessage;
    }

    @m80.k
    public final FlowLayoutOverflow.OverflowType getType$foundation_layout_release() {
        return this.type;
    }

    public int hashCode() {
        return (((this.type.hashCode() * 31) + Integer.hashCode(this.minLinesToShowCollapse)) * 31) + Integer.hashCode(this.minCrossAxisSizeToShowCollapse);
    }

    public final void setItemCount$foundation_layout_release(int i11) {
        this.itemCount = i11;
    }

    public final void setItemShown$foundation_layout_release(int i11) {
        this.itemShown = i11;
    }

    /* renamed from: setOverflowMeasurables--hBUhpc$foundation_layout_release, reason: not valid java name */
    public final void m655setOverflowMeasurableshBUhpc$foundation_layout_release(@l IntrinsicMeasurable intrinsicMeasurable, @l IntrinsicMeasurable intrinsicMeasurable2, boolean z11, long j11) {
        long m695constructorimpl = OrientationIndependentConstraints.m695constructorimpl(j11, z11 ? LayoutOrientation.Horizontal : LayoutOrientation.Vertical);
        if (intrinsicMeasurable != null) {
            int mainAxisMin = FlowLayoutKt.mainAxisMin(intrinsicMeasurable, z11, Constraints.m5067getMaxHeightimpl(m695constructorimpl));
            this.seeMoreSize = IntIntPair.m14boximpl(IntIntPair.m17constructorimpl(mainAxisMin, FlowLayoutKt.crossAxisMin(intrinsicMeasurable, z11, mainAxisMin)));
            this.seeMoreMeasurable = intrinsicMeasurable instanceof Measurable ? (Measurable) intrinsicMeasurable : null;
            this.seeMorePlaceable = null;
        }
        if (intrinsicMeasurable2 != null) {
            int mainAxisMin2 = FlowLayoutKt.mainAxisMin(intrinsicMeasurable2, z11, Constraints.m5067getMaxHeightimpl(m695constructorimpl));
            this.collapseSize = IntIntPair.m14boximpl(IntIntPair.m17constructorimpl(mainAxisMin2, FlowLayoutKt.crossAxisMin(intrinsicMeasurable2, z11, mainAxisMin2)));
            this.collapseMeasurable = intrinsicMeasurable2 instanceof Measurable ? (Measurable) intrinsicMeasurable2 : null;
            this.collapsePlaceable = null;
        }
    }

    /* renamed from: setOverflowMeasurables-VKLhPVY$foundation_layout_release, reason: not valid java name */
    public final void m656setOverflowMeasurablesVKLhPVY$foundation_layout_release(@m80.k FlowLineMeasurePolicy flowLineMeasurePolicy, long j11, @m80.k p<? super Boolean, ? super Integer, ? extends Measurable> pVar) {
        this.itemShown = 0;
        this.getOverflowMeasurable = pVar;
        m654setOverflowMeasurableshBUhpc$foundation_layout_release(flowLineMeasurePolicy, pVar.invoke(Boolean.TRUE, 0), pVar.invoke(Boolean.FALSE, 0), j11);
    }

    @m80.k
    public String toString() {
        return "FlowLayoutOverflowState(type=" + this.type + ", minLinesToShowCollapse=" + this.minLinesToShowCollapse + ", minCrossAxisSizeToShowCollapse=" + this.minCrossAxisSizeToShowCollapse + ')';
    }

    /* renamed from: setOverflowMeasurables--hBUhpc$foundation_layout_release, reason: not valid java name */
    public final void m654setOverflowMeasurableshBUhpc$foundation_layout_release(@m80.k final FlowLineMeasurePolicy flowLineMeasurePolicy, @l Measurable measurable, @l Measurable measurable2, long j11) {
        LayoutOrientation layoutOrientation = flowLineMeasurePolicy.isHorizontal() ? LayoutOrientation.Horizontal : LayoutOrientation.Vertical;
        long m708toBoxConstraintsOenEA2s = OrientationIndependentConstraints.m708toBoxConstraintsOenEA2s(OrientationIndependentConstraints.m697copyyUG9Ft0$default(OrientationIndependentConstraints.m695constructorimpl(j11, layoutOrientation), 0, 0, 0, 0, 10, null), layoutOrientation);
        if (measurable != null) {
            FlowLayoutKt.m651measureAndCacherqJ1uqs(measurable, flowLineMeasurePolicy, m708toBoxConstraintsOenEA2s, new x00.l<Placeable, g2>() { // from class: androidx.compose.foundation.layout.FlowLayoutOverflowState$setOverflowMeasurables$3$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(Placeable placeable) {
                    invoke2(placeable);
                    return g2.f100423a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Placeable placeable) {
                    int i11;
                    int i12;
                    if (placeable != null) {
                        FlowLineMeasurePolicy flowLineMeasurePolicy2 = flowLineMeasurePolicy;
                        i11 = flowLineMeasurePolicy2.mainAxisSize(placeable);
                        i12 = flowLineMeasurePolicy2.crossAxisSize(placeable);
                    } else {
                        i11 = 0;
                        i12 = 0;
                    }
                    FlowLayoutOverflowState.this.seeMoreSize = IntIntPair.m14boximpl(IntIntPair.m17constructorimpl(i11, i12));
                    FlowLayoutOverflowState.this.seeMorePlaceable = placeable;
                }
            });
            this.seeMoreMeasurable = measurable;
        }
        if (measurable2 != null) {
            FlowLayoutKt.m651measureAndCacherqJ1uqs(measurable2, flowLineMeasurePolicy, m708toBoxConstraintsOenEA2s, new x00.l<Placeable, g2>() { // from class: androidx.compose.foundation.layout.FlowLayoutOverflowState$setOverflowMeasurables$4$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(Placeable placeable) {
                    invoke2(placeable);
                    return g2.f100423a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Placeable placeable) {
                    int i11;
                    int i12;
                    if (placeable != null) {
                        FlowLineMeasurePolicy flowLineMeasurePolicy2 = flowLineMeasurePolicy;
                        i11 = flowLineMeasurePolicy2.mainAxisSize(placeable);
                        i12 = flowLineMeasurePolicy2.crossAxisSize(placeable);
                    } else {
                        i11 = 0;
                        i12 = 0;
                    }
                    FlowLayoutOverflowState.this.collapseSize = IntIntPair.m14boximpl(IntIntPair.m17constructorimpl(i11, i12));
                    FlowLayoutOverflowState.this.collapsePlaceable = placeable;
                }
            });
            this.collapseMeasurable = measurable2;
        }
    }
}
