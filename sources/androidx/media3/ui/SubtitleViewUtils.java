package androidx.media3.ui;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import androidx.media3.common.text.Cue;
import androidx.media3.common.text.LanguageFeatureSpan;
import androidx.media3.common.util.Assertions;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class SubtitleViewUtils {
    private SubtitleViewUtils() {
    }

    public static /* synthetic */ boolean a(Object obj) {
        return (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan);
    }

    public static /* synthetic */ boolean b(Object obj) {
        return !(obj instanceof LanguageFeatureSpan);
    }

    public static void removeAllEmbeddedStyling(Cue.Builder builder) {
        builder.clearWindowColor();
        if (builder.getText() instanceof Spanned) {
            if (!(builder.getText() instanceof Spannable)) {
                builder.setText(SpannableString.valueOf(builder.getText()));
            }
            removeSpansIf((Spannable) Assertions.checkNotNull(builder.getText()), new ho.i0() { // from class: androidx.media3.ui.q0
                @Override // ho.i0
                public final boolean apply(Object obj) {
                    return SubtitleViewUtils.b(obj);
                }
            });
        }
        removeEmbeddedFontSizes(builder);
    }

    public static void removeEmbeddedFontSizes(Cue.Builder builder) {
        builder.setTextSize(-3.4028235E38f, Integer.MIN_VALUE);
        if (builder.getText() instanceof Spanned) {
            if (!(builder.getText() instanceof Spannable)) {
                builder.setText(SpannableString.valueOf(builder.getText()));
            }
            removeSpansIf((Spannable) Assertions.checkNotNull(builder.getText()), new ho.i0() { // from class: androidx.media3.ui.r0
                @Override // ho.i0
                public final boolean apply(Object obj) {
                    return SubtitleViewUtils.a(obj);
                }
            });
        }
    }

    private static void removeSpansIf(Spannable spannable, ho.i0<Object> i0Var) {
        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
            if (i0Var.apply(obj)) {
                spannable.removeSpan(obj);
            }
        }
    }

    public static float resolveTextSize(int i11, float f11, int i12, int i13) {
        float f12;
        if (f11 == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i11 == 0) {
            f12 = i13;
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    return -3.4028235E38f;
                }
                return f11;
            }
            f12 = i12;
        }
        return f11 * f12;
    }
}
