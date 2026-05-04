package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class VectorizedFloatAnimationSpec<V extends AnimationVector> implements VectorizedFiniteAnimationSpec<V> {
    public static final int $stable = 8;

    @k
    private final Animations anims;
    private V endVelocityVector;
    private V valueVector;
    private V velocityVector;

    public VectorizedFloatAnimationSpec(@k Animations animations) {
        this.anims = animations;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public long getDurationNanos(@k V v11, @k V v12, @k V v13) {
        int size$animation_core_release = v11.getSize$animation_core_release();
        long j11 = 0;
        for (int i11 = 0; i11 < size$animation_core_release; i11++) {
            j11 = Math.max(j11, this.anims.get(i11).getDurationNanos(v11.get$animation_core_release(i11), v12.get$animation_core_release(i11), v13.get$animation_core_release(i11)));
        }
        return j11;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    @k
    public V getEndVelocity(@k V v11, @k V v12, @k V v13) {
        if (this.endVelocityVector == null) {
            this.endVelocityVector = (V) AnimationVectorsKt.newInstance(v13);
        }
        V v14 = this.endVelocityVector;
        if (v14 == null) {
            g0.S("endVelocityVector");
            v14 = null;
        }
        int size$animation_core_release = v14.getSize$animation_core_release();
        for (int i11 = 0; i11 < size$animation_core_release; i11++) {
            V v15 = this.endVelocityVector;
            if (v15 == null) {
                g0.S("endVelocityVector");
                v15 = null;
            }
            v15.set$animation_core_release(i11, this.anims.get(i11).getEndVelocity(v11.get$animation_core_release(i11), v12.get$animation_core_release(i11), v13.get$animation_core_release(i11)));
        }
        V v16 = this.endVelocityVector;
        if (v16 != null) {
            return v16;
        }
        g0.S("endVelocityVector");
        return null;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    @k
    public V getValueFromNanos(long j11, @k V v11, @k V v12, @k V v13) {
        if (this.valueVector == null) {
            this.valueVector = (V) AnimationVectorsKt.newInstance(v11);
        }
        V v14 = this.valueVector;
        if (v14 == null) {
            g0.S("valueVector");
            v14 = null;
        }
        int size$animation_core_release = v14.getSize$animation_core_release();
        for (int i11 = 0; i11 < size$animation_core_release; i11++) {
            V v15 = this.valueVector;
            if (v15 == null) {
                g0.S("valueVector");
                v15 = null;
            }
            v15.set$animation_core_release(i11, this.anims.get(i11).getValueFromNanos(j11, v11.get$animation_core_release(i11), v12.get$animation_core_release(i11), v13.get$animation_core_release(i11)));
        }
        V v16 = this.valueVector;
        if (v16 != null) {
            return v16;
        }
        g0.S("valueVector");
        return null;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    @k
    public V getVelocityFromNanos(long j11, @k V v11, @k V v12, @k V v13) {
        if (this.velocityVector == null) {
            this.velocityVector = (V) AnimationVectorsKt.newInstance(v13);
        }
        V v14 = this.velocityVector;
        if (v14 == null) {
            g0.S("velocityVector");
            v14 = null;
        }
        int size$animation_core_release = v14.getSize$animation_core_release();
        for (int i11 = 0; i11 < size$animation_core_release; i11++) {
            V v15 = this.velocityVector;
            if (v15 == null) {
                g0.S("velocityVector");
                v15 = null;
            }
            v15.set$animation_core_release(i11, this.anims.get(i11).getVelocityFromNanos(j11, v11.get$animation_core_release(i11), v12.get$animation_core_release(i11), v13.get$animation_core_release(i11)));
        }
        V v16 = this.velocityVector;
        if (v16 != null) {
            return v16;
        }
        g0.S("velocityVector");
        return null;
    }

    public VectorizedFloatAnimationSpec(@k final FloatAnimationSpec floatAnimationSpec) {
        this(new Animations() { // from class: androidx.compose.animation.core.VectorizedFloatAnimationSpec.1
            @Override // androidx.compose.animation.core.Animations
            public FloatAnimationSpec get(int i11) {
                return FloatAnimationSpec.this;
            }
        });
    }
}
