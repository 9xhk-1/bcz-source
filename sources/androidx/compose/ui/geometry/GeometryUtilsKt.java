package androidx.compose.ui.geometry;

import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class GeometryUtilsKt {
    @k
    public static final String toStringAsFixed(float f11, int i11) {
        if (Float.isNaN(f11)) {
            return "NaN";
        }
        if (Float.isInfinite(f11)) {
            return f11 < 0.0f ? "-Infinity" : "Infinity";
        }
        int max = Math.max(i11, 0);
        float pow = (float) Math.pow(10.0f, max);
        float f12 = f11 * pow;
        int i12 = (int) f12;
        if (f12 - i12 >= 0.5f) {
            i12++;
        }
        float f13 = i12 / pow;
        return max > 0 ? String.valueOf(f13) : String.valueOf((int) f13);
    }
}
