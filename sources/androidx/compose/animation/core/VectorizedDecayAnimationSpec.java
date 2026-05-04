package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface VectorizedDecayAnimationSpec<V extends AnimationVector> {
    float getAbsVelocityThreshold();

    long getDurationNanos(@k V v11, @k V v12);

    @k
    V getTargetValue(@k V v11, @k V v12);

    @k
    V getValueFromNanos(long j11, @k V v11, @k V v12);

    @k
    V getVelocityFromNanos(long j11, @k V v11, @k V v12);
}
