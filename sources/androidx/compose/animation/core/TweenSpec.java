package androidx.compose.animation.core;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
/* loaded from: classes.dex */
public final class TweenSpec<T> implements DurationBasedAnimationSpec<T> {
    public static final int $stable = 0;
    private final int delay;
    private final int durationMillis;

    @k
    private final Easing easing;

    public TweenSpec() {
        this(0, 0, null, 7, null);
    }

    public boolean equals(@l Object obj) {
        if (obj instanceof TweenSpec) {
            TweenSpec tweenSpec = (TweenSpec) obj;
            if (tweenSpec.durationMillis == this.durationMillis && tweenSpec.delay == this.delay && g0.g(tweenSpec.easing, this.easing)) {
                return true;
            }
        }
        return false;
    }

    public final int getDelay() {
        return this.delay;
    }

    public final int getDurationMillis() {
        return this.durationMillis;
    }

    @k
    public final Easing getEasing() {
        return this.easing;
    }

    public int hashCode() {
        return (((this.durationMillis * 31) + this.easing.hashCode()) * 31) + this.delay;
    }

    public TweenSpec(int i11, int i12, @k Easing easing) {
        this.durationMillis = i11;
        this.delay = i12;
        this.easing = easing;
    }

    @Override // androidx.compose.animation.core.FiniteAnimationSpec, androidx.compose.animation.core.AnimationSpec
    @k
    public <V extends AnimationVector> VectorizedTweenSpec<V> vectorize(@k TwoWayConverter<T, V> twoWayConverter) {
        return new VectorizedTweenSpec<>(this.durationMillis, this.delay, this.easing);
    }

    public /* synthetic */ TweenSpec(int i11, int i12, Easing easing, int i13, v vVar) {
        this((i13 & 1) != 0 ? 300 : i11, (i13 & 2) != 0 ? 0 : i12, (i13 & 4) != 0 ? EasingKt.getFastOutSlowInEasing() : easing);
    }
}
