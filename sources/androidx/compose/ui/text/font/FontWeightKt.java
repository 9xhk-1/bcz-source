package androidx.compose.ui.text.font;

import androidx.compose.ui.util.MathHelpersKt;
import g10.u;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class FontWeightKt {
    @k
    public static final FontWeight lerp(@k FontWeight fontWeight, @k FontWeight fontWeight2, float f11) {
        return new FontWeight(u.I(MathHelpersKt.lerp(fontWeight.getWeight(), fontWeight2.getWeight(), f11), 1, 1000));
    }
}
