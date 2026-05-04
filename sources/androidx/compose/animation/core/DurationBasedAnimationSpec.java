package androidx.compose.animation.core;

import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface DurationBasedAnimationSpec<T> extends FiniteAnimationSpec<T> {
    @Override // androidx.compose.animation.core.FiniteAnimationSpec, androidx.compose.animation.core.AnimationSpec
    @k
    <V extends AnimationVector> VectorizedDurationBasedAnimationSpec<V> vectorize(@k TwoWayConverter<T, V> twoWayConverter);
}
