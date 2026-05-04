package androidx.compose.animation.core;

import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class DecayAnimationSpecImpl<T> implements DecayAnimationSpec<T> {

    @k
    private final FloatDecayAnimationSpec floatDecaySpec;

    public DecayAnimationSpecImpl(@k FloatDecayAnimationSpec floatDecayAnimationSpec) {
        this.floatDecaySpec = floatDecayAnimationSpec;
    }

    @Override // androidx.compose.animation.core.DecayAnimationSpec
    @k
    public <V extends AnimationVector> VectorizedDecayAnimationSpec<V> vectorize(@k TwoWayConverter<T, V> twoWayConverter) {
        return new VectorizedFloatDecaySpec(this.floatDecaySpec);
    }
}
