package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nSpringSimulation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpringSimulation.kt\nandroidx/compose/animation/core/SpringSimulation\n+ 2 SpringSimulation.kt\nandroidx/compose/animation/core/SpringSimulationKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,152:1\n38#2:153\n53#3,3:154\n*S KotlinDebug\n*F\n+ 1 SpringSimulation.kt\nandroidx/compose/animation/core/SpringSimulation\n*L\n149#1:153\n149#1:154,3\n*E\n"})
/* loaded from: classes.dex */
public final class SpringSimulation {
    public static final int $stable = 8;
    private float finalPosition;
    private double naturalFreq = Math.sqrt(50.0d);
    private float dampingRatio = 1.0f;

    public SpringSimulation(float f11) {
        this.finalPosition = f11;
    }

    public final float getAcceleration(float f11, float f12) {
        float f13 = f11 - this.finalPosition;
        double d11 = this.naturalFreq;
        return (float) (((-(d11 * d11)) * f13) - (((d11 * 2.0d) * this.dampingRatio) * f12));
    }

    public final float getDampingRatio() {
        return this.dampingRatio;
    }

    public final float getFinalPosition() {
        return this.finalPosition;
    }

    public final float getStiffness() {
        double d11 = this.naturalFreq;
        return (float) (d11 * d11);
    }

    public final void setDampingRatio(float f11) {
        if (f11 < 0.0f) {
            PreconditionsKt.throwIllegalArgumentException("Damping ratio must be non-negative");
        }
        this.dampingRatio = f11;
    }

    public final void setFinalPosition(float f11) {
        this.finalPosition = f11;
    }

    public final void setStiffness(float f11) {
        if (getStiffness() <= 0.0f) {
            PreconditionsKt.throwIllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.naturalFreq = Math.sqrt(f11);
    }

    /* renamed from: updateValues-IJZedt4$animation_core_release, reason: not valid java name */
    public final long m164updateValuesIJZedt4$animation_core_release(float f11, float f12, long j11) {
        double exp;
        double d11;
        float f13 = f11 - this.finalPosition;
        double d12 = j11 / 1000.0d;
        float f14 = this.dampingRatio;
        double d13 = f14 * f14;
        double d14 = this.naturalFreq;
        double d15 = (-f14) * d14;
        if (f14 > 1.0f) {
            double sqrt = d14 * Math.sqrt(d13 - 1);
            double d16 = d15 + sqrt;
            double d17 = d15 - sqrt;
            double d18 = f13;
            double d19 = ((d17 * d18) - f12) / (d17 - d16);
            double d21 = d18 - d19;
            double d22 = d17 * d12;
            double d23 = d12 * d16;
            d11 = (Math.exp(d22) * d21) + (Math.exp(d23) * d19);
            exp = (d21 * d17 * Math.exp(d22)) + (d19 * d16 * Math.exp(d23));
        } else if (f14 == 1.0f) {
            double d24 = f13;
            double d25 = f12 + (d14 * d24);
            double d26 = (-d14) * d12;
            double d27 = d24 + (d12 * d25);
            d11 = d27 * Math.exp(d26);
            exp = (d27 * Math.exp(d26) * (-this.naturalFreq)) + (d25 * Math.exp(d26));
        } else {
            double d28 = 1;
            double sqrt2 = d14 * Math.sqrt(d28 - d13);
            double d29 = f13;
            double d31 = (d28 / sqrt2) * (((-d15) * d29) + f12);
            double d32 = sqrt2 * d12;
            double d33 = d12 * d15;
            double exp2 = Math.exp(d33) * ((Math.cos(d32) * d29) + (Math.sin(d32) * d31));
            exp = (d15 * exp2) + (Math.exp(d33) * (((-sqrt2) * d29 * Math.sin(d32)) + (sqrt2 * d31 * Math.cos(d32))));
            d11 = exp2;
        }
        return Motion.m155constructorimpl((Float.floatToRawIntBits((float) exp) & 4294967295L) | (Float.floatToRawIntBits((float) (d11 + this.finalPosition)) << 32));
    }
}
