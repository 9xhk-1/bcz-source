package androidx.compose.animation.core;

import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class EasingFunctionsKt {

    @k
    private static final Easing Ease = new CubicBezierEasing(0.25f, 0.1f, 0.25f, 1.0f);

    @k
    private static final Easing EaseOut = new CubicBezierEasing(0.0f, 0.0f, 0.58f, 1.0f);

    @k
    private static final Easing EaseIn = new CubicBezierEasing(0.42f, 0.0f, 1.0f, 1.0f);

    @k
    private static final Easing EaseInOut = new CubicBezierEasing(0.42f, 0.0f, 0.58f, 1.0f);

    @k
    private static final Easing EaseInSine = new CubicBezierEasing(0.12f, 0.0f, 0.39f, 0.0f);

    @k
    private static final Easing EaseOutSine = new CubicBezierEasing(0.61f, 1.0f, 0.88f, 1.0f);

    @k
    private static final Easing EaseInOutSine = new CubicBezierEasing(0.37f, 0.0f, 0.63f, 1.0f);

    @k
    private static final Easing EaseInCubic = new CubicBezierEasing(0.32f, 0.0f, 0.67f, 0.0f);

    @k
    private static final Easing EaseOutCubic = new CubicBezierEasing(0.33f, 1.0f, 0.68f, 1.0f);

    @k
    private static final Easing EaseInOutCubic = new CubicBezierEasing(0.65f, 0.0f, 0.35f, 1.0f);

    @k
    private static final Easing EaseInQuint = new CubicBezierEasing(0.64f, 0.0f, 0.78f, 0.0f);

    @k
    private static final Easing EaseOutQuint = new CubicBezierEasing(0.22f, 1.0f, 0.36f, 1.0f);

    @k
    private static final Easing EaseInOutQuint = new CubicBezierEasing(0.83f, 0.0f, 0.17f, 1.0f);

    @k
    private static final Easing EaseInCirc = new CubicBezierEasing(0.55f, 0.0f, 1.0f, 0.45f);

    @k
    private static final Easing EaseOutCirc = new CubicBezierEasing(0.0f, 0.55f, 0.45f, 1.0f);

    @k
    private static final Easing EaseInOutCirc = new CubicBezierEasing(0.85f, 0.0f, 0.15f, 1.0f);

    @k
    private static final Easing EaseInQuad = new CubicBezierEasing(0.11f, 0.0f, 0.5f, 0.0f);

    @k
    private static final Easing EaseOutQuad = new CubicBezierEasing(0.5f, 1.0f, 0.89f, 1.0f);

    @k
    private static final Easing EaseInOutQuad = new CubicBezierEasing(0.45f, 0.0f, 0.55f, 1.0f);

    @k
    private static final Easing EaseInQuart = new CubicBezierEasing(0.5f, 0.0f, 0.75f, 0.0f);

    @k
    private static final Easing EaseOutQuart = new CubicBezierEasing(0.25f, 1.0f, 0.5f, 1.0f);

    @k
    private static final Easing EaseInOutQuart = new CubicBezierEasing(0.76f, 0.0f, 0.24f, 1.0f);

    @k
    private static final Easing EaseInExpo = new CubicBezierEasing(0.7f, 0.0f, 0.84f, 0.0f);

    @k
    private static final Easing EaseOutExpo = new CubicBezierEasing(0.16f, 1.0f, 0.3f, 1.0f);

    @k
    private static final Easing EaseInOutExpo = new CubicBezierEasing(0.87f, 0.0f, 0.13f, 1.0f);

    @k
    private static final Easing EaseInBack = new CubicBezierEasing(0.36f, 0.0f, 0.66f, -0.56f);

    @k
    private static final Easing EaseOutBack = new CubicBezierEasing(0.34f, 1.56f, 0.64f, 1.0f);

    @k
    private static final Easing EaseInOutBack = new CubicBezierEasing(0.68f, -0.6f, 0.32f, 1.6f);

    @k
    private static final Easing EaseInElastic = new Easing() { // from class: androidx.compose.animation.core.a
        @Override // androidx.compose.animation.core.Easing
        public final float transform(float f11) {
            float EaseInElastic$lambda$0;
            EaseInElastic$lambda$0 = EasingFunctionsKt.EaseInElastic$lambda$0(f11);
            return EaseInElastic$lambda$0;
        }
    };

    @k
    private static final Easing EaseOutElastic = new Easing() { // from class: androidx.compose.animation.core.b
        @Override // androidx.compose.animation.core.Easing
        public final float transform(float f11) {
            float EaseOutElastic$lambda$1;
            EaseOutElastic$lambda$1 = EasingFunctionsKt.EaseOutElastic$lambda$1(f11);
            return EaseOutElastic$lambda$1;
        }
    };

    @k
    private static final Easing EaseInOutElastic = new Easing() { // from class: androidx.compose.animation.core.c
        @Override // androidx.compose.animation.core.Easing
        public final float transform(float f11) {
            float EaseInOutElastic$lambda$2;
            EaseInOutElastic$lambda$2 = EasingFunctionsKt.EaseInOutElastic$lambda$2(f11);
            return EaseInOutElastic$lambda$2;
        }
    };

    @k
    private static final Easing EaseOutBounce = new Easing() { // from class: androidx.compose.animation.core.d
        @Override // androidx.compose.animation.core.Easing
        public final float transform(float f11) {
            float EaseOutBounce$lambda$3;
            EaseOutBounce$lambda$3 = EasingFunctionsKt.EaseOutBounce$lambda$3(f11);
            return EaseOutBounce$lambda$3;
        }
    };

    @k
    private static final Easing EaseInBounce = new Easing() { // from class: androidx.compose.animation.core.e
        @Override // androidx.compose.animation.core.Easing
        public final float transform(float f11) {
            float EaseInBounce$lambda$4;
            EaseInBounce$lambda$4 = EasingFunctionsKt.EaseInBounce$lambda$4(f11);
            return EaseInBounce$lambda$4;
        }
    };

    @k
    private static final Easing EaseInOutBounce = new Easing() { // from class: androidx.compose.animation.core.f
        @Override // androidx.compose.animation.core.Easing
        public final float transform(float f11) {
            float EaseInOutBounce$lambda$5;
            EaseInOutBounce$lambda$5 = EasingFunctionsKt.EaseInOutBounce$lambda$5(f11);
            return EaseInOutBounce$lambda$5;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final float EaseInBounce$lambda$4(float f11) {
        return 1 - EaseOutBounce.transform(1.0f - f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float EaseInElastic$lambda$0(float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        if (f11 == 1.0f) {
            return 1.0f;
        }
        float f12 = f11 * 10.0f;
        return (float) ((-((float) Math.pow(2.0f, f12 - 10.0f))) * Math.sin((f12 - 10.75f) * 2.0943951023931953d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float EaseInOutBounce$lambda$5(float f11) {
        return (((double) f11) < 0.5d ? 1 - EaseOutBounce.transform(1.0f - (f11 * 2.0f)) : 1 + EaseOutBounce.transform((f11 * 2.0f) - 1.0f)) / 2.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float EaseInOutElastic$lambda$2(float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        if (f11 == 1.0f) {
            return 1.0f;
        }
        if (0.0f > f11 || f11 > 0.5f) {
            return ((float) ((((float) Math.pow(r8, ((-20.0f) * f11) + 10.0f)) * Math.sin(((f11 * 20.0f) - 11.125f) * 1.3962634015954636d)) / 2.0f)) + 1.0f;
        }
        float f12 = f11 * 20.0f;
        return (float) ((-(((float) Math.pow(r0, f12 - 10.0f)) * Math.sin((f12 - 11.125f) * 1.3962634015954636d))) / 2.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float EaseOutBounce$lambda$3(float f11) {
        if (f11 < 0.36363637f) {
            return 7.5625f * f11 * f11;
        }
        if (f11 < 0.72727275f) {
            float f12 = f11 - 0.54545456f;
            return (7.5625f * f12 * f12) + 0.75f;
        }
        if (f11 < 0.90909094f) {
            float f13 = f11 - 0.8181818f;
            return (7.5625f * f13 * f13) + 0.9375f;
        }
        float f14 = f11 - 0.95454544f;
        return (7.5625f * f14 * f14) + 0.984375f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float EaseOutElastic$lambda$1(float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        if (f11 == 1.0f) {
            return 1.0f;
        }
        return (float) ((((float) Math.pow(2.0f, (-10.0f) * f11)) * Math.sin(((f11 * 10.0f) - 0.75f) * 2.0943951023931953d)) + 1.0f);
    }

    @k
    public static final Easing getEase() {
        return Ease;
    }

    @k
    public static final Easing getEaseIn() {
        return EaseIn;
    }

    @k
    public static final Easing getEaseInBack() {
        return EaseInBack;
    }

    @k
    public static final Easing getEaseInBounce() {
        return EaseInBounce;
    }

    @k
    public static final Easing getEaseInCirc() {
        return EaseInCirc;
    }

    @k
    public static final Easing getEaseInCubic() {
        return EaseInCubic;
    }

    @k
    public static final Easing getEaseInElastic() {
        return EaseInElastic;
    }

    @k
    public static final Easing getEaseInExpo() {
        return EaseInExpo;
    }

    @k
    public static final Easing getEaseInOut() {
        return EaseInOut;
    }

    @k
    public static final Easing getEaseInOutBack() {
        return EaseInOutBack;
    }

    @k
    public static final Easing getEaseInOutBounce() {
        return EaseInOutBounce;
    }

    @k
    public static final Easing getEaseInOutCirc() {
        return EaseInOutCirc;
    }

    @k
    public static final Easing getEaseInOutCubic() {
        return EaseInOutCubic;
    }

    @k
    public static final Easing getEaseInOutElastic() {
        return EaseInOutElastic;
    }

    @k
    public static final Easing getEaseInOutExpo() {
        return EaseInOutExpo;
    }

    @k
    public static final Easing getEaseInOutQuad() {
        return EaseInOutQuad;
    }

    @k
    public static final Easing getEaseInOutQuart() {
        return EaseInOutQuart;
    }

    @k
    public static final Easing getEaseInOutQuint() {
        return EaseInOutQuint;
    }

    @k
    public static final Easing getEaseInOutSine() {
        return EaseInOutSine;
    }

    @k
    public static final Easing getEaseInQuad() {
        return EaseInQuad;
    }

    @k
    public static final Easing getEaseInQuart() {
        return EaseInQuart;
    }

    @k
    public static final Easing getEaseInQuint() {
        return EaseInQuint;
    }

    @k
    public static final Easing getEaseInSine() {
        return EaseInSine;
    }

    @k
    public static final Easing getEaseOut() {
        return EaseOut;
    }

    @k
    public static final Easing getEaseOutBack() {
        return EaseOutBack;
    }

    @k
    public static final Easing getEaseOutBounce() {
        return EaseOutBounce;
    }

    @k
    public static final Easing getEaseOutCirc() {
        return EaseOutCirc;
    }

    @k
    public static final Easing getEaseOutCubic() {
        return EaseOutCubic;
    }

    @k
    public static final Easing getEaseOutElastic() {
        return EaseOutElastic;
    }

    @k
    public static final Easing getEaseOutExpo() {
        return EaseOutExpo;
    }

    @k
    public static final Easing getEaseOutQuad() {
        return EaseOutQuad;
    }

    @k
    public static final Easing getEaseOutQuart() {
        return EaseOutQuart;
    }

    @k
    public static final Easing getEaseOutQuint() {
        return EaseOutQuint;
    }

    @k
    public static final Easing getEaseOutSine() {
        return EaseOutSine;
    }
}
