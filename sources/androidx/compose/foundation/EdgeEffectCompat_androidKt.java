package androidx.compose.foundation;

import android.view.ViewConfiguration;
import androidx.compose.ui.unit.Density;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class EdgeEffectCompat_androidKt {
    private static final double DecelMinusOne;
    private static final double DecelerationRate;
    private static final float GravityEarth = 9.80665f;
    private static final float InchesPerMeter = 39.37f;
    private static final float Inflection = 0.35f;
    private static final float PlatformFlingScrollFriction = ViewConfiguration.getScrollFriction();

    static {
        double log = Math.log(0.78d) / Math.log(0.9d);
        DecelerationRate = log;
        DecelMinusOne = log - 1.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float flingDistance(Density density, float f11) {
        double density2 = density.getDensity() * 386.0878f * 160.0f * 0.84f;
        double abs = Math.abs(f11) * 0.35f;
        float f12 = PlatformFlingScrollFriction;
        return (float) (f12 * density2 * Math.exp((DecelerationRate / DecelMinusOne) * Math.log(abs / (f12 * density2))));
    }
}
