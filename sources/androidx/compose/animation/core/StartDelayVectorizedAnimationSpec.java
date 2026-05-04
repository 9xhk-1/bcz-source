package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
/* loaded from: classes.dex */
final class StartDelayVectorizedAnimationSpec<V extends AnimationVector> implements VectorizedAnimationSpec<V> {
    private final long startDelayNanos;

    @k
    private final VectorizedAnimationSpec<V> vectorizedAnimationSpec;

    public StartDelayVectorizedAnimationSpec(@k VectorizedAnimationSpec<V> vectorizedAnimationSpec, long j11) {
        this.vectorizedAnimationSpec = vectorizedAnimationSpec;
        this.startDelayNanos = j11;
    }

    public boolean equals(@l Object obj) {
        if (!(obj instanceof StartDelayVectorizedAnimationSpec)) {
            return false;
        }
        StartDelayVectorizedAnimationSpec startDelayVectorizedAnimationSpec = (StartDelayVectorizedAnimationSpec) obj;
        return startDelayVectorizedAnimationSpec.startDelayNanos == this.startDelayNanos && g0.g(startDelayVectorizedAnimationSpec.vectorizedAnimationSpec, this.vectorizedAnimationSpec);
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public long getDurationNanos(@k V v11, @k V v12, @k V v13) {
        return this.vectorizedAnimationSpec.getDurationNanos(v11, v12, v13) + this.startDelayNanos;
    }

    public final long getStartDelayNanos() {
        return this.startDelayNanos;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    @k
    public V getValueFromNanos(long j11, @k V v11, @k V v12, @k V v13) {
        long j12 = this.startDelayNanos;
        return j11 < j12 ? v11 : this.vectorizedAnimationSpec.getValueFromNanos(j11 - j12, v11, v12, v13);
    }

    @k
    public final VectorizedAnimationSpec<V> getVectorizedAnimationSpec() {
        return this.vectorizedAnimationSpec;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    @k
    public V getVelocityFromNanos(long j11, @k V v11, @k V v12, @k V v13) {
        long j12 = this.startDelayNanos;
        return j11 < j12 ? v13 : this.vectorizedAnimationSpec.getVelocityFromNanos(j11 - j12, v11, v12, v13);
    }

    public int hashCode() {
        return (this.vectorizedAnimationSpec.hashCode() * 31) + Long.hashCode(this.startDelayNanos);
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public boolean isInfinite() {
        return this.vectorizedAnimationSpec.isInfinite();
    }
}
