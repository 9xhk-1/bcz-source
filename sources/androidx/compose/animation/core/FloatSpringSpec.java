package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nFloatAnimationSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatAnimationSpec.kt\nandroidx/compose/animation/core/FloatSpringSpec\n+ 2 SpringSimulation.kt\nandroidx/compose/animation/core/Motion\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,260:1\n32#2:261\n35#2:264\n60#3:262\n70#3:265\n22#4:263\n22#4:266\n*S KotlinDebug\n*F\n+ 1 FloatAnimationSpec.kt\nandroidx/compose/animation/core/FloatSpringSpec\n*L\n154#1:261\n166#1:264\n154#1:262\n166#1:265\n154#1:263\n166#1:266\n*E\n"})
/* loaded from: classes.dex */
public final class FloatSpringSpec implements FloatAnimationSpec {
    public static final int $stable = 8;
    private final float dampingRatio;

    @k
    private final SpringSimulation spring;
    private final float stiffness;
    private final float visibilityThreshold;

    public FloatSpringSpec() {
        this(0.0f, 0.0f, 0.0f, 7, null);
    }

    public final float getDampingRatio() {
        return this.dampingRatio;
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public long getDurationNanos(float f11, float f12, float f13) {
        float stiffness = this.spring.getStiffness();
        float dampingRatio = this.spring.getDampingRatio();
        float f14 = f11 - f12;
        float f15 = this.visibilityThreshold;
        return SpringEstimationKt.estimateAnimationDurationMillis(stiffness, dampingRatio, f13 / f15, f14 / f15, 1.0f) * 1000000;
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public float getEndVelocity(float f11, float f12, float f13) {
        return 0.0f;
    }

    public final float getStiffness() {
        return this.stiffness;
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public float getValueFromNanos(long j11, float f11, float f12, float f13) {
        this.spring.setFinalPosition(f12);
        return Float.intBitsToFloat((int) (this.spring.m164updateValuesIJZedt4$animation_core_release(f11, f13, j11 / 1000000) >> 32));
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public float getVelocityFromNanos(long j11, float f11, float f12, float f13) {
        this.spring.setFinalPosition(f12);
        return Float.intBitsToFloat((int) (this.spring.m164updateValuesIJZedt4$animation_core_release(f11, f13, j11 / 1000000) & 4294967295L));
    }

    public FloatSpringSpec(float f11, float f12, float f13) {
        this.dampingRatio = f11;
        this.stiffness = f12;
        this.visibilityThreshold = f13;
        SpringSimulation springSimulation = new SpringSimulation(1.0f);
        springSimulation.setDampingRatio(f11);
        springSimulation.setStiffness(f12);
        this.spring = springSimulation;
    }

    public /* synthetic */ FloatSpringSpec(float f11, float f12, float f13, int i11, v vVar) {
        this((i11 & 1) != 0 ? 1.0f : f11, (i11 & 2) != 0 ? 1500.0f : f12, (i11 & 4) != 0 ? 0.01f : f13);
    }
}
