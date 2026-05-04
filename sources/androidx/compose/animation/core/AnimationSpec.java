package androidx.compose.animation.core;

import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface AnimationSpec<T> {
    @k
    <V extends AnimationVector> VectorizedAnimationSpec<V> vectorize(@k TwoWayConverter<T, V> twoWayConverter);
}
