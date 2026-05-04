package androidx.compose.animation.core;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
/* loaded from: classes.dex */
final class StartDelayAnimationSpec<T> implements AnimationSpec<T> {

    @k
    private final AnimationSpec<T> animationSpec;
    private final long startDelayNanos;

    public StartDelayAnimationSpec(@k AnimationSpec<T> animationSpec, long j11) {
        this.animationSpec = animationSpec;
        this.startDelayNanos = j11;
    }

    public boolean equals(@l Object obj) {
        if (!(obj instanceof StartDelayAnimationSpec)) {
            return false;
        }
        StartDelayAnimationSpec startDelayAnimationSpec = (StartDelayAnimationSpec) obj;
        return startDelayAnimationSpec.startDelayNanos == this.startDelayNanos && g0.g(startDelayAnimationSpec.animationSpec, this.animationSpec);
    }

    @k
    public final AnimationSpec<T> getAnimationSpec() {
        return this.animationSpec;
    }

    public final long getStartDelayNanos() {
        return this.startDelayNanos;
    }

    public int hashCode() {
        return (this.animationSpec.hashCode() * 31) + Long.hashCode(this.startDelayNanos);
    }

    @Override // androidx.compose.animation.core.AnimationSpec
    @k
    public <V extends AnimationVector> VectorizedAnimationSpec<V> vectorize(@k TwoWayConverter<T, V> twoWayConverter) {
        return new StartDelayVectorizedAnimationSpec(this.animationSpec.vectorize(twoWayConverter), this.startDelayNanos);
    }
}
