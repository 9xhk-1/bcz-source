package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Paint;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.text.ExperimentalTextApi;
import androidx.compose.ui.text.font.FontVariation;
import androidx.compose.ui.unit.AndroidDensity_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.util.ListUtilsKt;
import m80.k;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(26)
/* loaded from: classes2.dex */
final class TypefaceCompatApi26 {

    @k
    public static final TypefaceCompatApi26 INSTANCE = new TypefaceCompatApi26();

    @k
    private static ThreadLocal<Paint> threadLocalPaint = new ThreadLocal<>();

    private TypefaceCompatApi26() {
    }

    @ExperimentalTextApi
    private final String toAndroidString(FontVariation.Settings settings, Context context) {
        final Density Density = AndroidDensity_androidKt.Density(context);
        return ListUtilsKt.fastJoinToString$default(settings.getSettings(), null, null, null, 0, null, new l<FontVariation.Setting, CharSequence>() { // from class: androidx.compose.ui.text.font.TypefaceCompatApi26$toAndroidString$1
            {
                super(1);
            }

            @Override // x00.l
            public final CharSequence invoke(FontVariation.Setting setting) {
                return '\'' + setting.getAxisName() + "' " + setting.toVariationValue(Density.this);
            }
        }, 31, null);
    }

    @m80.l
    @ExperimentalTextApi
    public final android.graphics.Typeface setFontVariationSettings(@m80.l android.graphics.Typeface typeface, @k FontVariation.Settings settings, @k Context context) {
        if (typeface == null) {
            return null;
        }
        if (settings.getSettings().isEmpty()) {
            return typeface;
        }
        Paint paint = threadLocalPaint.get();
        if (paint == null) {
            paint = new Paint();
            threadLocalPaint.set(paint);
        }
        paint.setFontVariationSettings(null);
        paint.setTypeface(typeface);
        paint.setFontVariationSettings(toAndroidString(settings, context));
        return paint.getTypeface();
    }
}
