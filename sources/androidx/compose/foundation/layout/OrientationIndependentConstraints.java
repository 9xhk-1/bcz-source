package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.h
@u0({"SMAP\nRowColumnImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RowColumnImpl.kt\nandroidx/compose/foundation/layout/OrientationIndependentConstraints\n*L\n1#1,707:1\n210#1:708\n213#1:709\n219#1:710\n216#1:711\n219#1:712\n210#1,10:713\n216#1,4:723\n210#1,4:727\n213#1:731\n219#1:732\n219#1:733\n213#1:734\n210#1:735\n213#1:736\n216#1:737\n219#1:738\n*S KotlinDebug\n*F\n+ 1 RowColumnImpl.kt\nandroidx/compose/foundation/layout/OrientationIndependentConstraints\n*L\n248#1:708\n249#1:709\n250#1:710\n250#1:711\n251#1:712\n257#1:713,10\n259#1:723,4\n259#1:727,4\n265#1:731\n267#1:732\n273#1:733\n275#1:734\n279#1:735\n280#1:736\n281#1:737\n282#1:738\n*E\n"})
/* loaded from: classes.dex */
public final class OrientationIndependentConstraints {
    private final long value;

    private /* synthetic */ OrientationIndependentConstraints(long j11) {
        this.value = j11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ OrientationIndependentConstraints m692boximpl(long j11) {
        return new OrientationIndependentConstraints(j11);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static long m694constructorimpl(long j11) {
        return j11;
    }

    /* renamed from: copy-yUG9Ft0, reason: not valid java name */
    public static final long m696copyyUG9Ft0(long j11, int i11, int i12, int i13, int i14) {
        return m693constructorimpl(i11, i12, i13, i14);
    }

    /* renamed from: copy-yUG9Ft0$default, reason: not valid java name */
    public static /* synthetic */ long m697copyyUG9Ft0$default(long j11, int i11, int i12, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i11 = Constraints.m5070getMinWidthimpl(j11);
        }
        int i16 = i11;
        if ((i15 & 2) != 0) {
            i12 = Constraints.m5068getMaxWidthimpl(j11);
        }
        int i17 = i12;
        if ((i15 & 4) != 0) {
            i13 = Constraints.m5069getMinHeightimpl(j11);
        }
        int i18 = i13;
        if ((i15 & 8) != 0) {
            i14 = Constraints.m5067getMaxHeightimpl(j11);
        }
        return m696copyyUG9Ft0(j11, i16, i17, i18, i14);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m698equalsimpl(long j11, Object obj) {
        return (obj instanceof OrientationIndependentConstraints) && Constraints.m5061equalsimpl0(j11, ((OrientationIndependentConstraints) obj).m710unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m699equalsimpl0(long j11, long j12) {
        return Constraints.m5061equalsimpl0(j11, j12);
    }

    /* renamed from: getCrossAxisMax-impl, reason: not valid java name */
    public static final int m700getCrossAxisMaximpl(long j11) {
        return Constraints.m5067getMaxHeightimpl(j11);
    }

    /* renamed from: getCrossAxisMin-impl, reason: not valid java name */
    public static final int m701getCrossAxisMinimpl(long j11) {
        return Constraints.m5069getMinHeightimpl(j11);
    }

    /* renamed from: getMainAxisMax-impl, reason: not valid java name */
    public static final int m702getMainAxisMaximpl(long j11) {
        return Constraints.m5068getMaxWidthimpl(j11);
    }

    /* renamed from: getMainAxisMin-impl, reason: not valid java name */
    public static final int m703getMainAxisMinimpl(long j11) {
        return Constraints.m5070getMinWidthimpl(j11);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m704hashCodeimpl(long j11) {
        return Constraints.m5071hashCodeimpl(j11);
    }

    /* renamed from: maxHeight-impl, reason: not valid java name */
    public static final int m705maxHeightimpl(long j11, @m80.k LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? Constraints.m5067getMaxHeightimpl(j11) : Constraints.m5068getMaxWidthimpl(j11);
    }

    /* renamed from: maxWidth-impl, reason: not valid java name */
    public static final int m706maxWidthimpl(long j11, @m80.k LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? Constraints.m5068getMaxWidthimpl(j11) : Constraints.m5067getMaxHeightimpl(j11);
    }

    /* renamed from: stretchCrossAxis-q4ezo7Y, reason: not valid java name */
    public static final long m707stretchCrossAxisq4ezo7Y(long j11) {
        return m693constructorimpl(Constraints.m5070getMinWidthimpl(j11), Constraints.m5068getMaxWidthimpl(j11), Constraints.m5067getMaxHeightimpl(j11) != Integer.MAX_VALUE ? Constraints.m5067getMaxHeightimpl(j11) : Constraints.m5069getMinHeightimpl(j11), Constraints.m5067getMaxHeightimpl(j11));
    }

    /* renamed from: toBoxConstraints-OenEA2s, reason: not valid java name */
    public static final long m708toBoxConstraintsOenEA2s(long j11, @m80.k LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? ConstraintsKt.Constraints(Constraints.m5070getMinWidthimpl(j11), Constraints.m5068getMaxWidthimpl(j11), Constraints.m5069getMinHeightimpl(j11), Constraints.m5067getMaxHeightimpl(j11)) : ConstraintsKt.Constraints(Constraints.m5069getMinHeightimpl(j11), Constraints.m5067getMaxHeightimpl(j11), Constraints.m5070getMinWidthimpl(j11), Constraints.m5068getMaxWidthimpl(j11));
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m709toStringimpl(long j11) {
        return "OrientationIndependentConstraints(value=" + ((Object) Constraints.m5073toStringimpl(j11)) + ')';
    }

    public boolean equals(Object obj) {
        return m698equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m704hashCodeimpl(this.value);
    }

    public String toString() {
        return m709toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m710unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m693constructorimpl(int i11, int i12, int i13, int i14) {
        return m694constructorimpl(ConstraintsKt.Constraints(i11, i12, i13, i14));
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m695constructorimpl(long j11, @m80.k LayoutOrientation layoutOrientation) {
        LayoutOrientation layoutOrientation2 = LayoutOrientation.Horizontal;
        return m693constructorimpl(layoutOrientation == layoutOrientation2 ? Constraints.m5070getMinWidthimpl(j11) : Constraints.m5069getMinHeightimpl(j11), layoutOrientation == layoutOrientation2 ? Constraints.m5068getMaxWidthimpl(j11) : Constraints.m5067getMaxHeightimpl(j11), layoutOrientation == layoutOrientation2 ? Constraints.m5069getMinHeightimpl(j11) : Constraints.m5070getMinWidthimpl(j11), layoutOrientation == layoutOrientation2 ? Constraints.m5067getMaxHeightimpl(j11) : Constraints.m5068getMaxWidthimpl(j11));
    }
}
