package androidx.compose.animation.core;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
/* loaded from: classes.dex */
public final class SnapSpec<T> implements DurationBasedAnimationSpec<T> {
    public static final int $stable = 0;
    private final int delay;

    public SnapSpec() {
        this(0, 1, null);
    }

    public boolean equals(@l Object obj) {
        return (obj instanceof SnapSpec) && ((SnapSpec) obj).delay == this.delay;
    }

    public final int getDelay() {
        return this.delay;
    }

    public int hashCode() {
        return this.delay;
    }

    public SnapSpec(int i11) {
        this.delay = i11;
    }

    @Override // androidx.compose.animation.core.FiniteAnimationSpec, androidx.compose.animation.core.AnimationSpec
    @k
    public <V extends AnimationVector> VectorizedDurationBasedAnimationSpec<V> vectorize(@k TwoWayConverter<T, V> twoWayConverter) {
        return new VectorizedSnapSpec(this.delay);
    }

    public /* synthetic */ SnapSpec(int i11, int i12, v vVar) {
        this((i12 & 1) != 0 ? 0 : i11);
    }
}
