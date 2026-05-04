package androidx.compose.animation.core;

import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class EasingKt {
    private static final float OneUlpAt1 = 1.1920929E-7f;

    @k
    private static final Easing FastOutSlowInEasing = new CubicBezierEasing(0.4f, 0.0f, 0.2f, 1.0f);

    @k
    private static final Easing LinearOutSlowInEasing = new CubicBezierEasing(0.0f, 0.0f, 0.2f, 1.0f);

    @k
    private static final Easing FastOutLinearInEasing = new CubicBezierEasing(0.4f, 0.0f, 1.0f, 1.0f);

    @k
    private static final Easing LinearEasing = new Easing() { // from class: androidx.compose.animation.core.g
        @Override // androidx.compose.animation.core.Easing
        public final float transform(float f11) {
            float LinearEasing$lambda$0;
            LinearEasing$lambda$0 = EasingKt.LinearEasing$lambda$0(f11);
            return LinearEasing$lambda$0;
        }
    };

    @k
    public static final Easing getFastOutLinearInEasing() {
        return FastOutLinearInEasing;
    }

    @k
    public static final Easing getFastOutSlowInEasing() {
        return FastOutSlowInEasing;
    }

    @k
    public static final Easing getLinearEasing() {
        return LinearEasing;
    }

    @k
    public static final Easing getLinearOutSlowInEasing() {
        return LinearOutSlowInEasing;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float LinearEasing$lambda$0(float f11) {
        return f11;
    }
}
