package androidx.compose.ui.unit;

import android.content.Context;
import androidx.compose.ui.unit.fontscaling.FontScaleConverter;
import androidx.compose.ui.unit.fontscaling.FontScaleConverterFactory;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class AndroidDensity_androidKt {
    @k
    public static final Density Density(@k Context context) {
        float f11 = context.getResources().getConfiguration().fontScale;
        float f12 = context.getResources().getDisplayMetrics().density;
        FontScaleConverter forScale = FontScaleConverterFactory.INSTANCE.forScale(f11);
        if (forScale == null) {
            forScale = new LinearFontScaleConverter(f11);
        }
        return new DensityWithConverter(f12, f11, forScale);
    }
}
