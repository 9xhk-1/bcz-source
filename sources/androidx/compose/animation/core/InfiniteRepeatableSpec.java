package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class InfiniteRepeatableSpec<T> implements AnimationSpec<T> {
    public static final int $stable = 8;

    @k
    private final DurationBasedAnimationSpec<T> animation;
    private final long initialStartOffset;

    @k
    private final RepeatMode repeatMode;

    public /* synthetic */ InfiniteRepeatableSpec(DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, long j11, v vVar) {
        this(durationBasedAnimationSpec, repeatMode, j11);
    }

    public boolean equals(@l Object obj) {
        if (obj instanceof InfiniteRepeatableSpec) {
            InfiniteRepeatableSpec infiniteRepeatableSpec = (InfiniteRepeatableSpec) obj;
            if (g0.g(infiniteRepeatableSpec.animation, this.animation) && infiniteRepeatableSpec.repeatMode == this.repeatMode && StartOffset.m170equalsimpl0(infiniteRepeatableSpec.initialStartOffset, this.initialStartOffset)) {
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
    public final long m150getInitialStartOffsetRmkjzm4() {
        return this.initialStartOffset;
    }

    @k
    public final RepeatMode getRepeatMode() {
        return this.repeatMode;
    }

    public int hashCode() {
        return (((this.animation.hashCode() * 31) + this.repeatMode.hashCode()) * 31) + StartOffset.m173hashCodeimpl(this.initialStartOffset);
    }

    @Override // androidx.compose.animation.core.AnimationSpec
    @k
    public <V extends AnimationVector> VectorizedAnimationSpec<V> vectorize(@k TwoWayConverter<T, V> twoWayConverter) {
        return new VectorizedInfiniteRepeatableSpec(this.animation.vectorize((TwoWayConverter) twoWayConverter), this.repeatMode, this.initialStartOffset, (v) null);
    }

    private InfiniteRepeatableSpec(DurationBasedAnimationSpec<T> durationBasedAnimationSpec, RepeatMode repeatMode, long j11) {
        this.animation = durationBasedAnimationSpec;
        this.repeatMode = repeatMode;
        this.initialStartOffset = j11;
    }

    public /* synthetic */ InfiniteRepeatableSpec(DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, long j11, int i11, v vVar) {
        this(durationBasedAnimationSpec, (i11 & 2) != 0 ? RepeatMode.Restart : repeatMode, (i11 & 4) != 0 ? StartOffset.m168constructorimpl$default(0, 0, 2, null) : j11, (v) null);
    }

    public /* synthetic */ InfiniteRepeatableSpec(DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, int i11, v vVar) {
        this(durationBasedAnimationSpec, (i11 & 2) != 0 ? RepeatMode.Restart : repeatMode);
    }

    @n(level = DeprecationLevel.HIDDEN, message = "This constructor has been deprecated")
    public /* synthetic */ InfiniteRepeatableSpec(DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode) {
        this(durationBasedAnimationSpec, repeatMode, StartOffset.m168constructorimpl$default(0, 0, 2, null), (v) null);
    }
}
