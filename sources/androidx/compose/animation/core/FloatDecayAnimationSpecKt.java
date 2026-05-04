package androidx.compose.animation.core;

import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class FloatDecayAnimationSpecKt {
    private static final float ExponentialDecayFriction = -4.2f;

    @k
    public static final Animation<Float, AnimationVector1D> createAnimation(@k FloatDecayAnimationSpec floatDecayAnimationSpec, float f11, float f12) {
        return AnimationKt.DecayAnimation(floatDecayAnimationSpec, f11, f12);
    }

    public static /* synthetic */ Animation createAnimation$default(FloatDecayAnimationSpec floatDecayAnimationSpec, float f11, float f12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            f12 = 0.0f;
        }
        return createAnimation(floatDecayAnimationSpec, f11, f12);
    }
}
