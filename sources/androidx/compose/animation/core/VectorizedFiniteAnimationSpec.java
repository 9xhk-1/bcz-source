package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface VectorizedFiniteAnimationSpec<V extends AnimationVector> extends VectorizedAnimationSpec<V> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DefaultImpls {
        @Deprecated
        @k
        public static <V extends AnimationVector> V getEndVelocity(@k VectorizedFiniteAnimationSpec<V> vectorizedFiniteAnimationSpec, @k V v11, @k V v12, @k V v13) {
            return (V) VectorizedFiniteAnimationSpec.super.getEndVelocity(v11, v12, v13);
        }

        @Deprecated
        public static <V extends AnimationVector> boolean isInfinite(@k VectorizedFiniteAnimationSpec<V> vectorizedFiniteAnimationSpec) {
            return VectorizedFiniteAnimationSpec.super.isInfinite();
        }
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    default boolean isInfinite() {
        return false;
    }
}
