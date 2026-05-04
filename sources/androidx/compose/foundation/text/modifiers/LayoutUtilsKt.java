package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextDelegateKt;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import g10.u;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class LayoutUtilsKt {
    /* renamed from: finalConstraints-tfFHcEY, reason: not valid java name */
    public static final long m1396finalConstraintstfFHcEY(long j11, boolean z11, int i11, float f11) {
        return Constraints.Companion.m5077fitPrioritizingWidthZbe2FdA(0, m1398finalMaxWidthtfFHcEY(j11, z11, i11, f11), 0, Constraints.m5067getMaxHeightimpl(j11));
    }

    /* renamed from: finalMaxLines-xdlQI24, reason: not valid java name */
    public static final int m1397finalMaxLinesxdlQI24(boolean z11, int i11, int i12) {
        if (z11 || !m1399isEllipsisMW5ApA(i11)) {
            return u.u(i12, 1);
        }
        return 1;
    }

    /* renamed from: finalMaxWidth-tfFHcEY, reason: not valid java name */
    public static final int m1398finalMaxWidthtfFHcEY(long j11, boolean z11, int i11, float f11) {
        int m5068getMaxWidthimpl = ((z11 || m1399isEllipsisMW5ApA(i11)) && Constraints.m5064getHasBoundedWidthimpl(j11)) ? Constraints.m5068getMaxWidthimpl(j11) : Integer.MAX_VALUE;
        return Constraints.m5070getMinWidthimpl(j11) == m5068getMaxWidthimpl ? m5068getMaxWidthimpl : u.I(TextDelegateKt.ceilToIntPx(f11), Constraints.m5070getMinWidthimpl(j11), m5068getMaxWidthimpl);
    }

    /* renamed from: isEllipsis-MW5-ApA, reason: not valid java name */
    public static final boolean m1399isEllipsisMW5ApA(int i11) {
        TextOverflow.Companion companion = TextOverflow.Companion;
        return TextOverflow.m5019equalsimpl0(i11, companion.m5029getEllipsisgIe3tQ8()) || TextOverflow.m5019equalsimpl0(i11, companion.m5031getStartEllipsisgIe3tQ8()) || TextOverflow.m5019equalsimpl0(i11, companion.m5030getMiddleEllipsisgIe3tQ8());
    }
}
