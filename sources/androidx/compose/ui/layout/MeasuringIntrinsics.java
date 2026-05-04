package androidx.compose.ui.layout;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.internal.u0;
import m00.a;
import m00.c;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class MeasuringIntrinsics {

    @k
    public static final MeasuringIntrinsics INSTANCE = new MeasuringIntrinsics();

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
        private static final /* synthetic */ a $ENTRIES;
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
        public static a<IntrinsicMinMax> getEntries() {
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
        private static final /* synthetic */ a $ENTRIES;
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
        public static a<IntrinsicWidthHeight> getEntries() {
            return $ENTRIES;
        }

        public static IntrinsicWidthHeight valueOf(String str) {
            return (IntrinsicWidthHeight) Enum.valueOf(IntrinsicWidthHeight.class, str);
        }

        public static IntrinsicWidthHeight[] values() {
            return (IntrinsicWidthHeight[]) $VALUES.clone();
        }
    }

    private MeasuringIntrinsics() {
    }

    public final int maxHeight(@k LayoutModifier layoutModifier, @k IntrinsicMeasureScope intrinsicMeasureScope, @k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        return layoutModifier.mo646measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new DefaultIntrinsicMeasurable(intrinsicMeasurable, IntrinsicMinMax.Max, IntrinsicWidthHeight.Height), ConstraintsKt.Constraints$default(0, i11, 0, 0, 13, null)).getHeight();
    }

    public final int maxWidth(@k LayoutModifier layoutModifier, @k IntrinsicMeasureScope intrinsicMeasureScope, @k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        return layoutModifier.mo646measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new DefaultIntrinsicMeasurable(intrinsicMeasurable, IntrinsicMinMax.Max, IntrinsicWidthHeight.Width), ConstraintsKt.Constraints$default(0, 0, 0, i11, 7, null)).getWidth();
    }

    public final int minHeight(@k LayoutModifier layoutModifier, @k IntrinsicMeasureScope intrinsicMeasureScope, @k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        return layoutModifier.mo646measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new DefaultIntrinsicMeasurable(intrinsicMeasurable, IntrinsicMinMax.Min, IntrinsicWidthHeight.Height), ConstraintsKt.Constraints$default(0, i11, 0, 0, 13, null)).getHeight();
    }

    public final int minWidth(@k LayoutModifier layoutModifier, @k IntrinsicMeasureScope intrinsicMeasureScope, @k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        return layoutModifier.mo646measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new DefaultIntrinsicMeasurable(intrinsicMeasurable, IntrinsicMinMax.Min, IntrinsicWidthHeight.Width), ConstraintsKt.Constraints$default(0, 0, 0, i11, 7, null)).getWidth();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nLayoutModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutModifier.kt\nandroidx/compose/ui/layout/MeasuringIntrinsics$EmptyPlaceable\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,272:1\n30#2:273\n80#3:274\n*S KotlinDebug\n*F\n+ 1 LayoutModifier.kt\nandroidx/compose/ui/layout/MeasuringIntrinsics$EmptyPlaceable\n*L\n209#1:273\n209#1:274\n*E\n"})
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
