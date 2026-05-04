package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.v;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class VectorizedTweenSpec<V extends AnimationVector> implements VectorizedDurationBasedAnimationSpec<V> {
    public static final int $stable = 8;

    @k
    private final VectorizedFloatAnimationSpec<V> anim;
    private final int delayMillis;
    private final int durationMillis;

    @k
    private final Easing easing;

    public VectorizedTweenSpec() {
        this(0, 0, null, 7, null);
    }

    @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    public int getDelayMillis() {
        return this.delayMillis;
    }

    @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    public int getDurationMillis() {
        return this.durationMillis;
    }

    @k
    public final Easing getEasing() {
        return this.easing;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    @k
    public V getValueFromNanos(long j11, @k V v11, @k V v12, @k V v13) {
        return this.anim.getValueFromNanos(j11, v11, v12, v13);
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    @k
    public V getVelocityFromNanos(long j11, @k V v11, @k V v12, @k V v13) {
        return this.anim.getVelocityFromNanos(j11, v11, v12, v13);
    }

    public VectorizedTweenSpec(int i11, int i12, @k Easing easing) {
        this.durationMillis = i11;
        this.delayMillis = i12;
        this.easing = easing;
        this.anim = new VectorizedFloatAnimationSpec<>(new FloatTweenSpec(getDurationMillis(), getDelayMillis(), easing));
    }

    public /* synthetic */ VectorizedTweenSpec(int i11, int i12, Easing easing, int i13, v vVar) {
        this((i13 & 1) != 0 ? 300 : i11, (i13 & 2) != 0 ? 0 : i12, (i13 & 4) != 0 ? EasingKt.getFastOutSlowInEasing() : easing);
    }
}
