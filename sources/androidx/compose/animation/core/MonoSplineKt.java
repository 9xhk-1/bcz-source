package androidx.compose.animation.core;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class MonoSplineKt {
    private static final boolean MonoSplineIsExtrapolate = true;

    public static final float hermiteDifferential(float f11, float f12, float f13, float f14, float f15, float f16) {
        float f17 = f12 * f12;
        float f18 = 2;
        return (f11 * ((f15 - ((f18 * f12) * ((f18 * f15) + f16))) + ((3 * (f15 + f16)) * f17))) - ((6 * (f12 - f17)) * (f13 - f14));
    }

    public static final float hermiteInterpolate(float f11, float f12, float f13, float f14, float f15, float f16) {
        float f17 = f12 * f12;
        float f18 = f17 * f12;
        float f19 = 2;
        return ((((f15 * f11) * ((f12 - (f19 * f17)) + f18)) + ((f11 * f16) * (f18 - f17))) + f13) - (((3 * f17) - (f19 * f18)) * (f13 - f14));
    }
}
