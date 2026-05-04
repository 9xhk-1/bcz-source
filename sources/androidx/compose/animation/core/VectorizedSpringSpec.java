package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.v;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class VectorizedSpringSpec<V extends AnimationVector> implements VectorizedFiniteAnimationSpec<V> {
    public static final int $stable = 8;
    private final /* synthetic */ VectorizedFloatAnimationSpec<V> $$delegate_0;
    private final float dampingRatio;
    private final float stiffness;

    private VectorizedSpringSpec(float f11, float f12, Animations animations) {
        this.dampingRatio = f11;
        this.stiffness = f12;
        this.$$delegate_0 = new VectorizedFloatAnimationSpec<>(animations);
    }

    public final float getDampingRatio() {
        return this.dampingRatio;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public long getDurationNanos(@k V v11, @k V v12, @k V v13) {
        return this.$$delegate_0.getDurationNanos(v11, v12, v13);
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    @k
    public V getEndVelocity(@k V v11, @k V v12, @k V v13) {
        return this.$$delegate_0.getEndVelocity(v11, v12, v13);
    }

    public final float getStiffness() {
        return this.stiffness;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    @k
    public V getValueFromNanos(long j11, @k V v11, @k V v12, @k V v13) {
        return this.$$delegate_0.getValueFromNanos(j11, v11, v12, v13);
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    @k
    public V getVelocityFromNanos(long j11, @k V v11, @k V v12, @k V v13) {
        return this.$$delegate_0.getVelocityFromNanos(j11, v11, v12, v13);
    }

    @Override // androidx.compose.animation.core.VectorizedFiniteAnimationSpec, androidx.compose.animation.core.VectorizedAnimationSpec
    public boolean isInfinite() {
        return this.$$delegate_0.isInfinite();
    }

    public /* synthetic */ VectorizedSpringSpec(float f11, float f12, AnimationVector animationVector, int i11, v vVar) {
        this((i11 & 1) != 0 ? 1.0f : f11, (i11 & 2) != 0 ? 1500.0f : f12, (i11 & 4) != 0 ? null : animationVector);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public VectorizedSpringSpec(float r1, float r2, @m80.l V r3) {
        /*
            r0 = this;
            androidx.compose.animation.core.Animations r3 = androidx.compose.animation.core.VectorizedAnimationSpecKt.access$createSpringAnimations(r3, r1, r2)
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.VectorizedSpringSpec.<init>(float, float, androidx.compose.animation.core.AnimationVector):void");
    }
}
