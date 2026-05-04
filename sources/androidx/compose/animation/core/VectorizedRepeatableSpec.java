package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.v;
import m80.k;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class VectorizedRepeatableSpec<V extends AnimationVector> implements VectorizedFiniteAnimationSpec<V> {
    public static final int $stable = 8;

    @k
    private final VectorizedDurationBasedAnimationSpec<V> animation;
    private final long durationNanos;
    private final long initialOffsetNanos;
    private final int iterations;

    @k
    private final RepeatMode repeatMode;

    public /* synthetic */ VectorizedRepeatableSpec(int i11, VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec, RepeatMode repeatMode, long j11, v vVar) {
        this(i11, vectorizedDurationBasedAnimationSpec, repeatMode, j11);
    }

    private final long repetitionPlayTimeNanos(long j11) {
        long j12 = this.initialOffsetNanos;
        if (j11 + j12 <= 0) {
            return 0L;
        }
        long j13 = j11 + j12;
        long min = Math.min(j13 / this.durationNanos, this.iterations - 1);
        return (this.repeatMode == RepeatMode.Restart || min % ((long) 2) == 0) ? j13 - (min * this.durationNanos) : ((min + 1) * this.durationNanos) - j13;
    }

    private final V repetitionStartVelocity(long j11, V v11, V v12, V v13) {
        long j12 = this.initialOffsetNanos;
        long j13 = j11 + j12;
        long j14 = this.durationNanos;
        return j13 > j14 ? getVelocityFromNanos(j14 - j12, v11, v12, v13) : v12;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public long getDurationNanos(@k V v11, @k V v12, @k V v13) {
        return (this.iterations * this.durationNanos) - this.initialOffsetNanos;
    }

    public final long getDurationNanos$animation_core_release() {
        return this.durationNanos;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    @k
    public V getValueFromNanos(long j11, @k V v11, @k V v12, @k V v13) {
        return this.animation.getValueFromNanos(repetitionPlayTimeNanos(j11), v11, v12, repetitionStartVelocity(j11, v11, v13, v12));
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    @k
    public V getVelocityFromNanos(long j11, @k V v11, @k V v12, @k V v13) {
        return this.animation.getVelocityFromNanos(repetitionPlayTimeNanos(j11), v11, v12, repetitionStartVelocity(j11, v11, v13, v12));
    }

    private VectorizedRepeatableSpec(int i11, VectorizedDurationBasedAnimationSpec<V> vectorizedDurationBasedAnimationSpec, RepeatMode repeatMode, long j11) {
        this.iterations = i11;
        this.animation = vectorizedDurationBasedAnimationSpec;
        this.repeatMode = repeatMode;
        if (i11 < 1) {
            throw new IllegalArgumentException("Iterations count can't be less than 1");
        }
        this.durationNanos = (vectorizedDurationBasedAnimationSpec.getDelayMillis() + vectorizedDurationBasedAnimationSpec.getDurationMillis()) * 1000000;
        this.initialOffsetNanos = j11 * 1000000;
    }

    public /* synthetic */ VectorizedRepeatableSpec(int i11, VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec, RepeatMode repeatMode, long j11, int i12, v vVar) {
        this(i11, vectorizedDurationBasedAnimationSpec, (i12 & 4) != 0 ? RepeatMode.Restart : repeatMode, (i12 & 8) != 0 ? StartOffset.m168constructorimpl$default(0, 0, 2, null) : j11, (v) null);
    }

    public /* synthetic */ VectorizedRepeatableSpec(int i11, VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec, RepeatMode repeatMode, int i12, v vVar) {
        this(i11, vectorizedDurationBasedAnimationSpec, (i12 & 4) != 0 ? RepeatMode.Restart : repeatMode);
    }

    @n(level = DeprecationLevel.HIDDEN, message = "This method has been deprecated in favor of the constructor that accepts start offset.")
    public /* synthetic */ VectorizedRepeatableSpec(int i11, VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec, RepeatMode repeatMode) {
        this(i11, vectorizedDurationBasedAnimationSpec, repeatMode, StartOffset.m168constructorimpl$default(0, 0, 2, null), (v) null);
    }
}
