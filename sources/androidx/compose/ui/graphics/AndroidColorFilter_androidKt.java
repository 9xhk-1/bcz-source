package androidx.compose.ui.graphics;

import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class AndroidColorFilter_androidKt {
    @m80.k
    /* renamed from: actualColorMatrixColorFilter-jHG-Opc, reason: not valid java name */
    public static final android.graphics.ColorFilter m2373actualColorMatrixColorFilterjHGOpc(@m80.k float[] fArr) {
        return new android.graphics.ColorMatrixColorFilter(fArr);
    }

    @m80.k
    public static final float[] actualColorMatrixFromFilter(@m80.k android.graphics.ColorFilter colorFilter) {
        if ((colorFilter instanceof android.graphics.ColorMatrixColorFilter) && supportsColorMatrixQuery()) {
            return ColorMatrixFilterHelper.INSTANCE.m2588getColorMatrix8unuwjk((android.graphics.ColorMatrixColorFilter) colorFilter);
        }
        throw new IllegalArgumentException("Unable to obtain ColorMatrix from Android ColorMatrixColorFilter. This method was invoked on an unsupported Android version");
    }

    @m80.k
    /* renamed from: actualLightingColorFilter--OWjLjI, reason: not valid java name */
    public static final android.graphics.ColorFilter m2374actualLightingColorFilterOWjLjI(long j11, long j12) {
        return new android.graphics.LightingColorFilter(ColorKt.m2563toArgb8_81llA(j11), ColorKt.m2563toArgb8_81llA(j12));
    }

    @m80.k
    /* renamed from: actualTintColorFilter-xETnrds, reason: not valid java name */
    public static final android.graphics.ColorFilter m2375actualTintColorFilterxETnrds(long j11, int i11) {
        return Build.VERSION.SDK_INT >= 29 ? BlendModeColorFilterHelper.INSTANCE.m2455BlendModeColorFilterxETnrds(j11, i11) : new PorterDuffColorFilter(ColorKt.m2563toArgb8_81llA(j11), AndroidBlendMode_androidKt.m2361toPorterDuffModes9anfk8(i11));
    }

    @m80.k
    public static final android.graphics.ColorFilter asAndroidColorFilter(@m80.k ColorFilter colorFilter) {
        return colorFilter.getNativeColorFilter$ui_graphics_release();
    }

    @m80.k
    public static final ColorFilter asComposeColorFilter(@m80.k android.graphics.ColorFilter colorFilter) {
        int colorMultiply;
        int colorAdd;
        if (29 <= Build.VERSION.SDK_INT && g0.a(colorFilter)) {
            return BlendModeColorFilterHelper.INSTANCE.createBlendModeColorFilter(h0.a(colorFilter));
        }
        if (!(colorFilter instanceof android.graphics.LightingColorFilter) || !supportsLightingColorFilterQuery()) {
            return ((colorFilter instanceof android.graphics.ColorMatrixColorFilter) && supportsColorMatrixQuery()) ? new ColorMatrixColorFilter(null, colorFilter, null) : new ColorFilter(colorFilter);
        }
        android.graphics.LightingColorFilter lightingColorFilter = (android.graphics.LightingColorFilter) colorFilter;
        colorMultiply = lightingColorFilter.getColorMultiply();
        long Color = ColorKt.Color(colorMultiply);
        colorAdd = lightingColorFilter.getColorAdd();
        return new LightingColorFilter(Color, ColorKt.Color(colorAdd), colorFilter, null);
    }

    public static final boolean supportsColorMatrixQuery() {
        return 26 <= Build.VERSION.SDK_INT;
    }

    public static final boolean supportsLightingColorFilterQuery() {
        return 26 <= Build.VERSION.SDK_INT;
    }
}
