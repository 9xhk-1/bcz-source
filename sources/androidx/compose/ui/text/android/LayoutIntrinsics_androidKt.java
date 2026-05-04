package androidx.compose.ui.text.android;

import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import androidx.compose.ui.text.android.style.LetterSpacingSpanEm;
import androidx.compose.ui.text.android.style.LetterSpacingSpanPx;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class LayoutIntrinsics_androidKt {
    private static final boolean stripNonMetricAffectingCharSpans = true;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean shouldIncreaseMaxIntrinsic(float f11, CharSequence charSequence, TextPaint textPaint) {
        if (f11 == 0.0f) {
            return false;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (SpannedExtensions_androidKt.hasSpan(spanned, LetterSpacingSpanPx.class) || SpannedExtensions_androidKt.hasSpan(spanned, LetterSpacingSpanEm.class)) {
                return true;
            }
        }
        return textPaint.getLetterSpacing() != 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence stripNonMetricAffectingCharacterStyleSpans(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (SpannedExtensions_androidKt.hasSpan(spanned, CharacterStyle.class)) {
                CharacterStyle[] characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, charSequence.length(), CharacterStyle.class);
                if (characterStyleArr != null && characterStyleArr.length != 0) {
                    SpannableString spannableString = null;
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        if (!(characterStyle instanceof MetricAffectingSpan)) {
                            if (spannableString == null) {
                                spannableString = new SpannableString(charSequence);
                            }
                            spannableString.removeSpan(characterStyle);
                        }
                    }
                    if (spannableString != null) {
                        return spannableString;
                    }
                }
            }
        }
        return charSequence;
    }

    private static /* synthetic */ void getStripNonMetricAffectingCharSpans$annotations() {
    }
}
