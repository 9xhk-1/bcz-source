package androidx.compose.foundation.text.handwriting;

import androidx.compose.foundation.text.TextPointerIcon_androidKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerIconKt;
import m80.k;
import x00.a;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class HandwritingDetector_androidKt {
    @k
    public static final Modifier handwritingDetector(@k Modifier modifier, @k a<g2> aVar) {
        return StylusHandwriting_androidKt.isStylusHandwritingSupported() ? PointerIconKt.stylusHoverIcon(modifier, TextPointerIcon_androidKt.getHandwritingPointerIcon(), false, StylusHandwritingKt.getHandwritingBoundsExpansion()).then(new HandwritingDetectorElement(aVar)) : modifier;
    }
}
