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
public final class VectorizedInfiniteRepeatableSpec<V extends AnimationVector> implements VectorizedAnimationSpec<V> {
    public static final int $stable = 8;

    @k
    private final VectorizedDurationBasedAnimationSpec<V> animation;
    private final long durationNanos;
    private final long initialOffsetNanos;

    @k
    private final RepeatMode repeatMode;

    public /* synthetic */ VectorizedInfiniteRepeatableSpec(VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec, RepeatMode repeatMode, long j11, v vVar) {
        this(vectorizedDurationBasedAnimationSpec, repeatMode, j11);
    }

    private final long repetitionPlayTimeNanos(long j11) {
        long j12 = this.initialOffsetNanos;
        if (j11 + j12 <= 0) {
            return 0L;
        }
        long j13 = j11 + j12;
        long j14 = this.durationNanos;
        long j15 = j13 / j14;
        return (this.repeatMode == RepeatMode.Restart || j15 % ((long) 2) == 0) ? j13 - (j15 * j14) : ((j15 + 1) * j14) - j13;
    }

    private final V repetitionStartVelocity(long j11, V v11, V v12, V v13) {
        long j12 = this.initialOffsetNanos;
        long j13 = j11 + j12;
        long j14 = this.durationNanos;
        return j13 > j14 ? this.animation.getVelocityFromNanos(j14 - j12, v11, v13, v12) : v12;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public long getDurationNanos(@k V v11, @k V v12, @k V v13) {
        return Long.MAX_VALUE;
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

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public boolean isInfinite() {
        return true;
    }

    private VectorizedInfiniteRepeatableSpec(VectorizedDurationBasedAnimationSpec<V> vectorizedDurationBasedAnimationSpec, RepeatMode repeatMode, long j11) {
        this.animation = vectorizedDurationBasedAnimationSpec;
        this.repeatMode = repeatMode;
        this.durationNanos = (vectorizedDurationBasedAnimationSpec.getDelayMillis() + vectorizedDurationBasedAnimationSpec.getDurationMillis()) * 1000000;
        this.initialOffsetNanos = j11 * 1000000;
    }

    public /* synthetic */ VectorizedInfiniteRepeatableSpec(VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec, RepeatMode repeatMode, long j11, int i11, v vVar) {
        this(vectorizedDurationBasedAnimationSpec, (i11 & 2) != 0 ? RepeatMode.Restart : repeatMode, (i11 & 4) != 0 ? StartOffset.m168constructorimpl$default(0, 0, 2, null) : j11, (v) null);
    }

    public /* synthetic */ VectorizedInfiniteRepeatableSpec(VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec, RepeatMode repeatMode, int i11, v vVar) {
        this(vectorizedDurationBasedAnimationSpec, (i11 & 2) != 0 ? RepeatMode.Restart : repeatMode);
    }

    @n(level = DeprecationLevel.HIDDEN, message = "This method has been deprecated in favor of the constructor that accepts start offset.")
    public /* synthetic */ VectorizedInfiniteRepeatableSpec(VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec, RepeatMode repeatMode) {
        this(vectorizedDurationBasedAnimationSpec, repeatMode, StartOffset.m168constructorimpl$default(0, 0, 2, null), (v) null);
    }
}
