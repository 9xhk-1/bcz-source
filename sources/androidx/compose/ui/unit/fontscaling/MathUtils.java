package androidx.compose.ui.unit.fontscaling;

import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes2.dex */
public final class MathUtils {
    public static final int $stable = 0;

    @k
    public static final MathUtils INSTANCE = new MathUtils();

    private MathUtils() {
    }

    public final float constrainedMap(float f11, float f12, float f13, float f14, float f15) {
        return lerp(f11, f12, Math.max(0.0f, Math.min(1.0f, lerpInv(f13, f14, f15))));
    }

    public final float lerp(float f11, float f12, float f13) {
        return f11 + ((f12 - f11) * f13);
    }

    public final float lerpInv(float f11, float f12, float f13) {
        if (f11 == f12) {
            return 0.0f;
        }
        return (f13 - f11) / (f12 - f11);
    }
}
