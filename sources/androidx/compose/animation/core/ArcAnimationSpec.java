package androidx.compose.animation.core;

import androidx.collection.IntListKt;
import androidx.collection.IntObjectMapKt;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
@ExperimentalAnimationSpecApi
/* loaded from: classes.dex */
public final class ArcAnimationSpec<T> implements DurationBasedAnimationSpec<T> {
    public static final int $stable = 0;
    private final int delayMillis;
    private final int durationMillis;

    @k
    private final Easing easing;
    private final int mode;

    public /* synthetic */ ArcAnimationSpec(int i11, int i12, int i13, Easing easing, v vVar) {
        this(i11, i12, i13, easing);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ArcAnimationSpec)) {
            return false;
        }
        ArcAnimationSpec arcAnimationSpec = (ArcAnimationSpec) obj;
        if (ArcMode.m143equalsimpl0(this.mode, arcAnimationSpec.mode) && this.durationMillis == arcAnimationSpec.durationMillis && this.delayMillis == arcAnimationSpec.delayMillis) {
            return g0.g(this.easing, arcAnimationSpec.easing);
        }
        return false;
    }

    public final int getDelayMillis() {
        return this.delayMillis;
    }

    public final int getDurationMillis() {
        return this.durationMillis;
    }

    @k
    public final Easing getEasing() {
        return this.easing;
    }

    /* renamed from: getMode--9T-Mq4, reason: not valid java name */
    public final int m139getMode9TMq4() {
        return this.mode;
    }

    public int hashCode() {
        return (((((ArcMode.m144hashCodeimpl(this.mode) * 31) + this.durationMillis) * 31) + this.delayMillis) * 31) + this.easing.hashCode();
    }

    private ArcAnimationSpec(int i11, int i12, int i13, Easing easing) {
        this.mode = i11;
        this.durationMillis = i12;
        this.delayMillis = i13;
        this.easing = easing;
    }

    @Override // androidx.compose.animation.core.FiniteAnimationSpec, androidx.compose.animation.core.AnimationSpec
    @k
    public <V extends AnimationVector> VectorizedDurationBasedAnimationSpec<V> vectorize(@k TwoWayConverter<T, V> twoWayConverter) {
        return new VectorizedKeyframesSpec(IntListKt.intListOf(0, this.durationMillis), IntObjectMapKt.emptyIntObjectMap(), this.durationMillis, this.delayMillis, this.easing, this.mode, null);
    }

    public /* synthetic */ ArcAnimationSpec(int i11, int i12, int i13, Easing easing, int i14, v vVar) {
        this((i14 & 1) != 0 ? ArcMode.Companion.m148getArcBelow9TMq4() : i11, (i14 & 2) != 0 ? 300 : i12, (i14 & 4) != 0 ? 0 : i13, (i14 & 8) != 0 ? EasingKt.getFastOutSlowInEasing() : easing, null);
    }
}
