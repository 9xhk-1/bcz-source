package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class ModifierUtilsKt {
    /* renamed from: maxWidthForTextLayout-R2G3SPE, reason: not valid java name */
    public static final int m1401maxWidthForTextLayoutR2G3SPE(long j11, boolean z11, int i11) {
        if ((z11 || TextOverflow.m5019equalsimpl0(i11, TextOverflow.Companion.m5029getEllipsisgIe3tQ8())) && Constraints.m5064getHasBoundedWidthimpl(j11)) {
            return Constraints.m5068getMaxWidthimpl(j11);
        }
        return Integer.MAX_VALUE;
    }
}
