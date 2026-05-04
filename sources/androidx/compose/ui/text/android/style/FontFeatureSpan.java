package androidx.compose.ui.text.android.style;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.compose.runtime.internal.StabilityInferred;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class FontFeatureSpan extends MetricAffectingSpan {
    public static final int $stable = 0;

    @k
    private final String fontFeatureSettings;

    public FontFeatureSpan(@k String str) {
        this.fontFeatureSettings = str;
    }

    @k
    public final String getFontFeatureSettings() {
        return this.fontFeatureSettings;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@k TextPaint textPaint) {
        textPaint.setFontFeatureSettings(this.fontFeatureSettings);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(@k TextPaint textPaint) {
        textPaint.setFontFeatureSettings(this.fontFeatureSettings);
    }
}
