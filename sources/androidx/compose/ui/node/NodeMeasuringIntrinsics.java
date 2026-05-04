package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.ApproachIntrinsicMeasureScope;
import androidx.compose.ui.layout.ApproachIntrinsicsMeasureScope;
import androidx.compose.ui.layout.ApproachMeasureScope;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.IntrinsicsMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.internal.u0;
import m00.c;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class NodeMeasuringIntrinsics {
    public static final int $stable = 0;

    @k
    public static final NodeMeasuringIntrinsics INSTANCE = new NodeMeasuringIntrinsics();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface ApproachMeasureBlock {
        @k
        /* renamed from: measure-3p2s80s */
        MeasureResult mo3835measure3p2s80s(@k ApproachMeasureScope approachMeasureScope, @k Measurable measurable, long j11);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DefaultIntrinsicMeasurable implements Measurable {

        @k
        private final IntrinsicMeasurable measurable;

        @k
        private final IntrinsicMinMax minMax;

        @k
        private final IntrinsicWidthHeight widthHeight;

        public DefaultIntrinsicMeasurable(@k IntrinsicMeasurable intrinsicMeasurable, @k IntrinsicMinMax intrinsicMinMax, @k IntrinsicWidthHeight intrinsicWidthHeight) {
            this.measurable = intrinsicMeasurable;
            this.minMax = intrinsicMinMax;
            this.widthHeight = intrinsicWidthHeight;
        }

        @k
        public final IntrinsicMeasurable getMeasurable() {
            return this.measurable;
        }

        @k
        public final IntrinsicMinMax getMinMax() {
            return this.minMax;
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        @l
        public Object getParentData() {
            return this.measurable.getParentData();
        }

        @k
        public final IntrinsicWidthHeight getWidthHeight() {
            return this.widthHeight;
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicHeight(int i11) {
            return this.measurable.maxIntrinsicHeight(i11);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicWidth(int i11) {
            return this.measurable.maxIntrinsicWidth(i11);
        }

        @Override // androidx.compose.ui.layout.Measurable
        @k
        /* renamed from: measure-BRTryo0 */
        public Placeable mo3857measureBRTryo0(long j11) {
            if (this.widthHeight == IntrinsicWidthHeight.Width) {
                return new EmptyPlaceable(this.minMax == IntrinsicMinMax.Max ? this.measurable.maxIntrinsicWidth(Constraints.m5067getMaxHeightimpl(j11)) : this.measurable.minIntrinsicWidth(Constraints.m5067getMaxHeightimpl(j11)), Constraints.m5063getHasBoundedHeightimpl(j11) ? Constraints.m5067getMaxHeightimpl(j11) : 32767);
            }
            return new EmptyPlaceable(Constraints.m5064getHasBoundedWidthimpl(j11) ? Constraints.m5068getMaxWidthimpl(j11) : 32767, this.minMax == IntrinsicMinMax.Max ? this.measurable.maxIntrinsicHeight(Constraints.m5068getMaxWidthimpl(j11)) : this.measurable.minIntrinsicHeight(Constraints.m5068getMaxWidthimpl(j11)));
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicHeight(int i11) {
            return this.measurable.minIntrinsicHeight(i11);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicWidth(int i11) {
            return this.measurable.minIntrinsicWidth(i11);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class IntrinsicMinMax {
        private static final /* synthetic */ m00.a $ENTRIES;
        private static final /* synthetic */ IntrinsicMinMax[] $VALUES;
        public static final IntrinsicMinMax Min = new IntrinsicMinMax("Min", 0);
        public static final IntrinsicMinMax Max = new IntrinsicMinMax("Max", 1);

        private static final /* synthetic */ IntrinsicMinMax[] $values() {
            return new IntrinsicMinMax[]{Min, Max};
        }

        static {
            IntrinsicMinMax[] $values = $values();
            $VALUES = $values;
            $ENTRIES = c.c($values);
        }

        private IntrinsicMinMax(String str, int i11) {
        }

        @k
        public static m00.a<IntrinsicMinMax> getEntries() {
            return $ENTRIES;
        }

        public static IntrinsicMinMax valueOf(String str) {
            return (IntrinsicMinMax) Enum.valueOf(IntrinsicMinMax.class, str);
        }

        public static IntrinsicMinMax[] values() {
            return (IntrinsicMinMax[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class IntrinsicWidthHeight {
        private static final /* synthetic */ m00.a $ENTRIES;
        private static final /* synthetic */ IntrinsicWidthHeight[] $VALUES;
        public static final IntrinsicWidthHeight Width = new IntrinsicWidthHeight(qo.c.f82447v1, 0);
        public static final IntrinsicWidthHeight Height = new IntrinsicWidthHeight("Height", 1);

        private static final /* synthetic */ IntrinsicWidthHeight[] $values() {
            return new IntrinsicWidthHeight[]{Width, Height};
        }

        static {
            IntrinsicWidthHeight[] $values = $values();
            $VALUES = $values;
            $ENTRIES = c.c($values);
        }

        private IntrinsicWidthHeight(String str, int i11) {
        }

        @k
        public static m00.a<IntrinsicWidthHeight> getEntries() {
            return $ENTRIES;
        }

        public static IntrinsicWidthHeight valueOf(String str) {
            return (IntrinsicWidthHeight) Enum.valueOf(IntrinsicWidthHeight.class, str);
        }

        public static IntrinsicWidthHeight[] values() {
            return (IntrinsicWidthHeight[]) $VALUES.clone();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface MeasureBlock {
        @k
        /* renamed from: measure-3p2s80s */
        MeasureResult mo4024measure3p2s80s(@k MeasureScope measureScope, @k Measurable measurable, long j11);
    }

    private NodeMeasuringIntrinsics() {
    }

    public final int maxHeight$ui_release(@k ApproachMeasureBlock approachMeasureBlock, @k ApproachIntrinsicMeasureScope approachIntrinsicMeasureScope, @k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        return approachMeasureBlock.mo3835measure3p2s80s(new ApproachIntrinsicsMeasureScope(approachIntrinsicMeasureScope, approachIntrinsicMeasureScope.getLayoutDirection()), new DefaultIntrinsicMeasurable(intrinsicMeasurable, IntrinsicMinMax.Max, IntrinsicWidthHeight.Height), ConstraintsKt.Constraints$default(0, i11, 0, 0, 13, null)).getHeight();
    }

    public final int maxWidth$ui_release(@k ApproachMeasureBlock approachMeasureBlock, @k ApproachIntrinsicMeasureScope approachIntrinsicMeasureScope, @k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        return approachMeasureBlock.mo3835measure3p2s80s(new ApproachIntrinsicsMeasureScope(approachIntrinsicMeasureScope, approachIntrinsicMeasureScope.getLayoutDirection()), new DefaultIntrinsicMeasurable(intrinsicMeasurable, IntrinsicMinMax.Max, IntrinsicWidthHeight.Width), ConstraintsKt.Constraints$default(0, 0, 0, i11, 7, null)).getWidth();
    }

    public final int minHeight$ui_release(@k ApproachMeasureBlock approachMeasureBlock, @k ApproachIntrinsicMeasureScope approachIntrinsicMeasureScope, @k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        return approachMeasureBlock.mo3835measure3p2s80s(new ApproachIntrinsicsMeasureScope(approachIntrinsicMeasureScope, approachIntrinsicMeasureScope.getLayoutDirection()), new DefaultIntrinsicMeasurable(intrinsicMeasurable, IntrinsicMinMax.Min, IntrinsicWidthHeight.Height), ConstraintsKt.Constraints$default(0, i11, 0, 0, 13, null)).getHeight();
    }

    public final int minWidth$ui_release(@k ApproachMeasureBlock approachMeasureBlock, @k ApproachIntrinsicMeasureScope approachIntrinsicMeasureScope, @k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        return approachMeasureBlock.mo3835measure3p2s80s(new ApproachIntrinsicsMeasureScope(approachIntrinsicMeasureScope, approachIntrinsicMeasureScope.getLayoutDirection()), new DefaultIntrinsicMeasurable(intrinsicMeasurable, IntrinsicMinMax.Min, IntrinsicWidthHeight.Width), ConstraintsKt.Constraints$default(0, 0, 0, i11, 7, null)).getWidth();
    }

    public final int maxHeight$ui_release(@k MeasureBlock measureBlock, @k IntrinsicMeasureScope intrinsicMeasureScope, @k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        return measureBlock.mo4024measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new DefaultIntrinsicMeasurable(intrinsicMeasurable, IntrinsicMinMax.Max, IntrinsicWidthHeight.Height), ConstraintsKt.Constraints$default(0, i11, 0, 0, 13, null)).getHeight();
    }

    public final int maxWidth$ui_release(@k MeasureBlock measureBlock, @k IntrinsicMeasureScope intrinsicMeasureScope, @k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        return measureBlock.mo4024measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new DefaultIntrinsicMeasurable(intrinsicMeasurable, IntrinsicMinMax.Max, IntrinsicWidthHeight.Width), ConstraintsKt.Constraints$default(0, 0, 0, i11, 7, null)).getWidth();
    }

    public final int minHeight$ui_release(@k MeasureBlock measureBlock, @k IntrinsicMeasureScope intrinsicMeasureScope, @k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        return measureBlock.mo4024measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new DefaultIntrinsicMeasurable(intrinsicMeasurable, IntrinsicMinMax.Min, IntrinsicWidthHeight.Height), ConstraintsKt.Constraints$default(0, i11, 0, 0, 13, null)).getHeight();
    }

    public final int minWidth$ui_release(@k MeasureBlock measureBlock, @k IntrinsicMeasureScope intrinsicMeasureScope, @k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        return measureBlock.mo4024measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new DefaultIntrinsicMeasurable(intrinsicMeasurable, IntrinsicMinMax.Min, IntrinsicWidthHeight.Width), ConstraintsKt.Constraints$default(0, 0, 0, i11, 7, null)).getWidth();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nLayoutModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutModifierNode.kt\nandroidx/compose/ui/node/NodeMeasuringIntrinsics$EmptyPlaceable\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,398:1\n30#2:399\n80#3:400\n*S KotlinDebug\n*F\n+ 1 LayoutModifierNode.kt\nandroidx/compose/ui/node/NodeMeasuringIntrinsics$EmptyPlaceable\n*L\n376#1:399\n376#1:400\n*E\n"})
    public static final class EmptyPlaceable extends Placeable {
        public EmptyPlaceable(int i11, int i12) {
            m3919setMeasuredSizeozmzZPI(IntSize.m5281constructorimpl((i12 & 4294967295L) | (i11 << 32)));
        }

        @Override // androidx.compose.ui.layout.Measured
        public int get(@k AlignmentLine alignmentLine) {
            return Integer.MIN_VALUE;
        }

        @Override // androidx.compose.ui.layout.Placeable
        /* renamed from: placeAt-f8xVGno */
        public void mo3858placeAtf8xVGno(long j11, float f11, @l x00.l<? super GraphicsLayerScope, g2> lVar) {
        }
    }
}
