package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface VectorizedDurationBasedAnimationSpec<V extends AnimationVector> extends VectorizedFiniteAnimationSpec<V> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DefaultImpls {
        @Deprecated
        public static <V extends AnimationVector> long getDurationNanos(@k VectorizedDurationBasedAnimationSpec<V> vectorizedDurationBasedAnimationSpec, @k V v11, @k V v12, @k V v13) {
            return VectorizedDurationBasedAnimationSpec.super.getDurationNanos(v11, v12, v13);
        }

        @Deprecated
        @k
        public static <V extends AnimationVector> V getEndVelocity(@k VectorizedDurationBasedAnimationSpec<V> vectorizedDurationBasedAnimationSpec, @k V v11, @k V v12, @k V v13) {
            return (V) VectorizedDurationBasedAnimationSpec.super.getEndVelocity(v11, v12, v13);
        }

        @Deprecated
        public static <V extends AnimationVector> boolean isInfinite(@k VectorizedDurationBasedAnimationSpec<V> vectorizedDurationBasedAnimationSpec) {
            return VectorizedDurationBasedAnimationSpec.super.isInfinite();
        }
    }

    int getDelayMillis();

    int getDurationMillis();

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    default long getDurationNanos(@k V v11, @k V v12, @k V v13) {
        return (getDelayMillis() + getDurationMillis()) * 1000000;
    }
}
