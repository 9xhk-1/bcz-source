package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface VectorizedAnimationSpec<V extends AnimationVector> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DefaultImpls {
        @Deprecated
        @k
        public static <V extends AnimationVector> V getEndVelocity(@k VectorizedAnimationSpec<V> vectorizedAnimationSpec, @k V v11, @k V v12, @k V v13) {
            return (V) VectorizedAnimationSpec.super.getEndVelocity(v11, v12, v13);
        }
    }

    long getDurationNanos(@k V v11, @k V v12, @k V v13);

    @k
    default V getEndVelocity(@k V v11, @k V v12, @k V v13) {
        return getVelocityFromNanos(getDurationNanos(v11, v12, v13), v11, v12, v13);
    }

    @k
    V getValueFromNanos(long j11, @k V v11, @k V v12, @k V v13);

    @k
    V getVelocityFromNanos(long j11, @k V v11, @k V v12, @k V v13);

    boolean isInfinite();
}
