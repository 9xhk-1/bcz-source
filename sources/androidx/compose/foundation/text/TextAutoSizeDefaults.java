package androidx.compose.foundation.text;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.TextUnitKt;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class TextAutoSizeDefaults {
    public static final int $stable = 0;

    @k
    public static final TextAutoSizeDefaults INSTANCE = new TextAutoSizeDefaults();
    private static final long MinFontSize = TextUnitKt.getSp(12);
    private static final long MaxFontSize = TextUnitKt.getSp(112);

    private TextAutoSizeDefaults() {
    }

    /* renamed from: getMaxFontSize-XSAIIZE, reason: not valid java name */
    public final long m1124getMaxFontSizeXSAIIZE() {
        return MaxFontSize;
    }

    /* renamed from: getMinFontSize-XSAIIZE, reason: not valid java name */
    public final long m1125getMinFontSizeXSAIIZE() {
        return MinFontSize;
    }
}
