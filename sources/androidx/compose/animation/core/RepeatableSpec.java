package androidx.compose.animation.core;

import androidx.compose.runtime.Immutable;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
/* loaded from: classes.dex */
public final class RepeatableSpec<T> implements FiniteAnimationSpec<T> {
    public static final int $stable = 0;

    @k
    private final DurationBasedAnimationSpec<T> animation;
    private final long initialStartOffset;
    private final int iterations;

    @k
    private final RepeatMode repeatMode;

    public /* synthetic */ RepeatableSpec(int i11, DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, long j11, v vVar) {
        this(i11, durationBasedAnimationSpec, repeatMode, j11);
    }

    public boolean equals(@l Object obj) {
        if (obj instanceof RepeatableSpec) {
            RepeatableSpec repeatableSpec = (RepeatableSpec) obj;
            if (repeatableSpec.iterations == this.iterations && g0.g(repeatableSpec.animation, this.animation) && repeatableSpec.repeatMode == this.repeatMode && StartOffset.m170equalsimpl0(repeatableSpec.initialStartOffset, this.initialStartOffset)) {
                return true;
            }
        }
        return false;
    }

    @k
    public final DurationBasedAnimationSpec<T> getAnimation() {
        return this.animation;
    }

    /* renamed from: getInitialStartOffset-Rmkjzm4, reason: not valid java name */
    public final long m163getInitialStartOffsetRmkjzm4() {
        return this.initialStartOffset;
    }

    public final int getIterations() {
        return this.iterations;
    }

    @k
    public final RepeatMode getRepeatMode() {
        return this.repeatMode;
    }

    public int hashCode() {
        return (((((this.iterations * 31) + this.animation.hashCode()) * 31) + this.repeatMode.hashCode()) * 31) + StartOffset.m173hashCodeimpl(this.initialStartOffset);
    }

    private RepeatableSpec(int i11, DurationBasedAnimationSpec<T> durationBasedAnimationSpec, RepeatMode repeatMode, long j11) {
        this.iterations = i11;
        this.animation = durationBasedAnimationSpec;
        this.repeatMode = repeatMode;
        this.initialStartOffset = j11;
    }

    @Override // androidx.compose.animation.core.AnimationSpec
    @k
    public <V extends AnimationVector> VectorizedFiniteAnimationSpec<V> vectorize(@k TwoWayConverter<T, V> twoWayConverter) {
        return new VectorizedRepeatableSpec(this.iterations, this.animation.vectorize((TwoWayConverter) twoWayConverter), this.repeatMode, this.initialStartOffset, (v) null);
    }

    public /* synthetic */ RepeatableSpec(int i11, DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, long j11, int i12, v vVar) {
        this(i11, durationBasedAnimationSpec, (i12 & 4) != 0 ? RepeatMode.Restart : repeatMode, (i12 & 8) != 0 ? StartOffset.m168constructorimpl$default(0, 0, 2, null) : j11, (v) null);
    }

    public /* synthetic */ RepeatableSpec(int i11, DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, int i12, v vVar) {
        this(i11, durationBasedAnimationSpec, (i12 & 4) != 0 ? RepeatMode.Restart : repeatMode);
    }

    @n(level = DeprecationLevel.HIDDEN, message = "This constructor has been deprecated")
    public /* synthetic */ RepeatableSpec(int i11, DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode) {
        this(i11, durationBasedAnimationSpec, repeatMode, StartOffset.m168constructorimpl$default(0, 0, 2, null), (v) null);
    }
}
