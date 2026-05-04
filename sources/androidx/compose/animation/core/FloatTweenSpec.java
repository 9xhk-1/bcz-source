package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nFloatAnimationSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatAnimationSpec.kt\nandroidx/compose/animation/core/FloatTweenSpec\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 3 VectorConverters.kt\nandroidx/compose/animation/core/VectorConvertersKt\n*L\n1#1,260:1\n223#1:261\n223#1:283\n119#2,10:262\n119#2,10:273\n119#2,10:284\n71#3:272\n*S KotlinDebug\n*F\n+ 1 FloatAnimationSpec.kt\nandroidx/compose/animation/core/FloatTweenSpec\n*L\n216#1:261\n244#1:283\n216#1:262,10\n223#1:273,10\n244#1:284,10\n219#1:272\n*E\n"})
/* loaded from: classes.dex */
public final class FloatTweenSpec implements FloatAnimationSpec {
    public static final int $stable = 0;
    private final int delay;
    private final long delayNanos;
    private final int duration;
    private final long durationNanos;

    @k
    private final Easing easing;

    public FloatTweenSpec() {
        this(0, 0, null, 7, null);
    }

    private final long clampPlayTimeNanos(long j11) {
        long j12 = j11 - this.delayNanos;
        long j13 = this.durationNanos;
        if (j12 < 0) {
            j12 = 0;
        }
        return j12 > j13 ? j13 : j12;
    }

    public final int getDelay() {
        return this.delay;
    }

    public final int getDuration() {
        return this.duration;
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public long getDurationNanos(float f11, float f12, float f13) {
        return this.delayNanos + this.durationNanos;
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public float getValueFromNanos(long j11, float f11, float f12, float f13) {
        long j12 = j11 - this.delayNanos;
        long j13 = this.durationNanos;
        if (j12 < 0) {
            j12 = 0;
        }
        if (j12 > j13) {
            j12 = j13;
        }
        float transform = this.easing.transform(this.duration == 0 ? 1.0f : j12 / j13);
        return (f11 * (1 - transform)) + (f12 * transform);
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public float getVelocityFromNanos(long j11, float f11, float f12, float f13) {
        long j12 = j11 - this.delayNanos;
        long j13 = this.durationNanos;
        if (j12 < 0) {
            j12 = 0;
        }
        long j14 = j12 > j13 ? j13 : j12;
        if (j14 == 0) {
            return f13;
        }
        return (getValueFromNanos(j14, f11, f12, f13) - getValueFromNanos(j14 - 1000000, f11, f12, f13)) * 1000.0f;
    }

    public FloatTweenSpec(int i11, int i12, @k Easing easing) {
        this.duration = i11;
        this.delay = i12;
        this.easing = easing;
        this.durationNanos = i11 * 1000000;
        this.delayNanos = i12 * 1000000;
    }

    public /* synthetic */ FloatTweenSpec(int i11, int i12, Easing easing, int i13, v vVar) {
        this((i13 & 1) != 0 ? 300 : i11, (i13 & 2) != 0 ? 0 : i12, (i13 & 4) != 0 ? EasingKt.getFastOutSlowInEasing() : easing);
    }
}
