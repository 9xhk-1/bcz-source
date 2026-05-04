package androidx.compose.animation.core;

import androidx.annotation.FloatRange;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class FloatExponentialDecaySpec implements FloatDecayAnimationSpec {
    public static final int $stable = 0;
    private final float absVelocityThreshold;
    private final float friction;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FloatExponentialDecaySpec() {
        /*
            r3 = this;
            r0 = 3
            r1 = 0
            r2 = 0
            r3.<init>(r2, r2, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.FloatExponentialDecaySpec.<init>():void");
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getAbsVelocityThreshold() {
        return this.absVelocityThreshold;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public long getDurationNanos(float f11, float f12) {
        return ((long) ((((float) Math.log(getAbsVelocityThreshold() / Math.abs(f12))) * 1000.0f) / this.friction)) * 1000000;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getTargetValue(float f11, float f12) {
        if (Math.abs(f12) <= getAbsVelocityThreshold()) {
            return f11;
        }
        double log = Math.log(Math.abs(getAbsVelocityThreshold() / f12));
        float f13 = this.friction;
        return (f11 - (f12 / f13)) + ((f12 / f13) * ((float) Math.exp((f13 * ((log / f13) * 1000)) / 1000.0f)));
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getValueFromNanos(long j11, float f11, float f12) {
        float f13 = this.friction;
        return (f11 - (f12 / f13)) + ((f12 / f13) * ((float) Math.exp((f13 * (j11 / 1000000)) / 1000.0f)));
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getVelocityFromNanos(long j11, float f11, float f12) {
        return f12 * ((float) Math.exp(((j11 / 1000000) / 1000.0f) * this.friction));
    }

    public FloatExponentialDecaySpec(@FloatRange(from = 0.0d, fromInclusive = false) float f11, @FloatRange(from = 0.0d, fromInclusive = false) float f12) {
        this.absVelocityThreshold = Math.max(1.0E-7f, Math.abs(f12));
        this.friction = Math.max(1.0E-4f, f11) * (-4.2f);
    }

    public /* synthetic */ FloatExponentialDecaySpec(float f11, float f12, int i11, v vVar) {
        this((i11 & 1) != 0 ? 1.0f : f11, (i11 & 2) != 0 ? 0.1f : f12);
    }
}
