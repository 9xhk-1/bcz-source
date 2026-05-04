package androidx.compose.ui.text.android.style;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.compose.runtime.internal.StabilityInferred;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class TypefaceSpan extends MetricAffectingSpan {
    public static final int $stable = 8;

    @k
    private final Typeface typeface;

    public TypefaceSpan(@k Typeface typeface) {
        this.typeface = typeface;
    }

    private final void updateTypeface(Paint paint) {
        paint.setTypeface(this.typeface);
    }

    @k
    public final Typeface getTypeface() {
        return this.typeface;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@k TextPaint textPaint) {
        updateTypeface(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(@k TextPaint textPaint) {
        updateTypeface(textPaint);
    }
}
