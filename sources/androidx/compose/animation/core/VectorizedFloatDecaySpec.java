package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class VectorizedFloatDecaySpec<V extends AnimationVector> implements VectorizedDecayAnimationSpec<V> {
    private final float absVelocityThreshold;

    @k
    private final FloatDecayAnimationSpec floatDecaySpec;
    private V targetVector;
    private V valueVector;
    private V velocityVector;

    public VectorizedFloatDecaySpec(@k FloatDecayAnimationSpec floatDecayAnimationSpec) {
        this.floatDecaySpec = floatDecayAnimationSpec;
        this.absVelocityThreshold = floatDecayAnimationSpec.getAbsVelocityThreshold();
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    public float getAbsVelocityThreshold() {
        return this.absVelocityThreshold;
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    public long getDurationNanos(@k V v11, @k V v12) {
        if (this.velocityVector == null) {
            this.velocityVector = (V) AnimationVectorsKt.newInstance(v11);
        }
        V v13 = this.velocityVector;
        if (v13 == null) {
            g0.S("velocityVector");
            v13 = null;
        }
        int size$animation_core_release = v13.getSize$animation_core_release();
        long j11 = 0;
        for (int i11 = 0; i11 < size$animation_core_release; i11++) {
            j11 = Math.max(j11, this.floatDecaySpec.getDurationNanos(v11.get$animation_core_release(i11), v12.get$animation_core_release(i11)));
        }
        return j11;
    }

    @k
    public final FloatDecayAnimationSpec getFloatDecaySpec() {
        return this.floatDecaySpec;
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    @k
    public V getTargetValue(@k V v11, @k V v12) {
        if (this.targetVector == null) {
            this.targetVector = (V) AnimationVectorsKt.newInstance(v11);
        }
        V v13 = this.targetVector;
        if (v13 == null) {
            g0.S("targetVector");
            v13 = null;
        }
        int size$animation_core_release = v13.getSize$animation_core_release();
        for (int i11 = 0; i11 < size$animation_core_release; i11++) {
            V v14 = this.targetVector;
            if (v14 == null) {
                g0.S("targetVector");
                v14 = null;
            }
            v14.set$animation_core_release(i11, this.floatDecaySpec.getTargetValue(v11.get$animation_core_release(i11), v12.get$animation_core_release(i11)));
        }
        V v15 = this.targetVector;
        if (v15 != null) {
            return v15;
        }
        g0.S("targetVector");
        return null;
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    @k
    public V getValueFromNanos(long j11, @k V v11, @k V v12) {
        if (this.valueVector == null) {
            this.valueVector = (V) AnimationVectorsKt.newInstance(v11);
        }
        V v13 = this.valueVector;
        if (v13 == null) {
            g0.S("valueVector");
            v13 = null;
        }
        int size$animation_core_release = v13.getSize$animation_core_release();
        for (int i11 = 0; i11 < size$animation_core_release; i11++) {
            V v14 = this.valueVector;
            if (v14 == null) {
                g0.S("valueVector");
                v14 = null;
            }
            v14.set$animation_core_release(i11, this.floatDecaySpec.getValueFromNanos(j11, v11.get$animation_core_release(i11), v12.get$animation_core_release(i11)));
        }
        V v15 = this.valueVector;
        if (v15 != null) {
            return v15;
        }
        g0.S("valueVector");
        return null;
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    @k
    public V getVelocityFromNanos(long j11, @k V v11, @k V v12) {
        if (this.velocityVector == null) {
            this.velocityVector = (V) AnimationVectorsKt.newInstance(v11);
        }
        V v13 = this.velocityVector;
        if (v13 == null) {
            g0.S("velocityVector");
            v13 = null;
        }
        int size$animation_core_release = v13.getSize$animation_core_release();
        for (int i11 = 0; i11 < size$animation_core_release; i11++) {
            V v14 = this.velocityVector;
            if (v14 == null) {
                g0.S("velocityVector");
                v14 = null;
            }
            v14.set$animation_core_release(i11, this.floatDecaySpec.getVelocityFromNanos(j11, v11.get$animation_core_release(i11), v12.get$animation_core_release(i11)));
        }
        V v15 = this.velocityVector;
        if (v15 != null) {
            return v15;
        }
        g0.S("velocityVector");
        return null;
    }
}
