package androidx.compose.animation.core;

import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.z;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAnimationState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationState.kt\nandroidx/compose/animation/core/AnimationStateKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,329:1\n1#2:330\n*E\n"})
/* loaded from: classes.dex */
public final class AnimationStateKt {
    @k
    public static final AnimationState<Float, AnimationVector1D> AnimationState(float f11, float f12, long j11, long j12, boolean z11) {
        return new AnimationState<>(VectorConvertersKt.getVectorConverter(z.f67060a), Float.valueOf(f11), AnimationVectorsKt.AnimationVector(f12), j11, j12, z11);
    }

    public static /* synthetic */ AnimationState AnimationState$default(float f11, float f12, long j11, long j12, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            f12 = 0.0f;
        }
        if ((i11 & 4) != 0) {
            j11 = Long.MIN_VALUE;
        }
        if ((i11 & 8) != 0) {
            j12 = Long.MIN_VALUE;
        }
        if ((i11 & 16) != 0) {
            z11 = false;
        }
        return AnimationState(f11, f12, j11, j12, z11);
    }

    @k
    public static final <T, V extends AnimationVector> AnimationState<T, V> copy(@k AnimationState<T, V> animationState, T t11, @l V v11, long j11, long j12, boolean z11) {
        return new AnimationState<>(animationState.getTypeConverter(), t11, v11, j11, j12, z11);
    }

    public static /* synthetic */ AnimationState copy$default(AnimationState animationState, Object obj, AnimationVector animationVector, long j11, long j12, boolean z11, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            obj = animationState.getValue();
        }
        if ((i11 & 2) != 0) {
            animationVector = AnimationVectorsKt.copy(animationState.getVelocityVector());
        }
        if ((i11 & 4) != 0) {
            j11 = animationState.getLastFrameTimeNanos();
        }
        if ((i11 & 8) != 0) {
            j12 = animationState.getFinishedTimeNanos();
        }
        if ((i11 & 16) != 0) {
            z11 = animationState.isRunning();
        }
        boolean z12 = z11;
        long j13 = j12;
        return copy((AnimationState<Object, AnimationVector>) animationState, obj, animationVector, j11, j13, z12);
    }

    @k
    public static final <T, V extends AnimationVector> V createZeroVectorFrom(@k TwoWayConverter<T, V> twoWayConverter, T t11) {
        V invoke = twoWayConverter.getConvertToVector().invoke(t11);
        invoke.reset$animation_core_release();
        return invoke;
    }

    public static final boolean isFinished(@k AnimationState<?, ?> animationState) {
        return animationState.getFinishedTimeNanos() != Long.MIN_VALUE;
    }

    public static /* synthetic */ AnimationState AnimationState$default(TwoWayConverter twoWayConverter, Object obj, Object obj2, long j11, long j12, boolean z11, int i11, Object obj3) {
        if ((i11 & 8) != 0) {
            j11 = Long.MIN_VALUE;
        }
        if ((i11 & 16) != 0) {
            j12 = Long.MIN_VALUE;
        }
        if ((i11 & 32) != 0) {
            z11 = false;
        }
        return AnimationState(twoWayConverter, obj, obj2, j11, j12, z11);
    }

    @k
    public static final AnimationState<Float, AnimationVector1D> copy(@k AnimationState<Float, AnimationVector1D> animationState, float f11, float f12, long j11, long j12, boolean z11) {
        return new AnimationState<>(animationState.getTypeConverter(), Float.valueOf(f11), AnimationVectorsKt.AnimationVector(f12), j11, j12, z11);
    }

    @k
    public static final <T, V extends AnimationVector> AnimationState<T, V> AnimationState(@k TwoWayConverter<T, V> twoWayConverter, T t11, T t12, long j11, long j12, boolean z11) {
        return new AnimationState<>(twoWayConverter, t11, twoWayConverter.getConvertToVector().invoke(t12), j11, j12, z11);
    }

    public static /* synthetic */ AnimationState copy$default(AnimationState animationState, float f11, float f12, long j11, long j12, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = ((Number) animationState.getValue()).floatValue();
        }
        if ((i11 & 2) != 0) {
            f12 = ((AnimationVector1D) animationState.getVelocityVector()).getValue();
        }
        if ((i11 & 4) != 0) {
            j11 = animationState.getLastFrameTimeNanos();
        }
        if ((i11 & 8) != 0) {
            j12 = animationState.getFinishedTimeNanos();
        }
        if ((i11 & 16) != 0) {
            z11 = animationState.isRunning();
        }
        boolean z12 = z11;
        long j13 = j12;
        return copy((AnimationState<Float, AnimationVector1D>) animationState, f11, f12, j11, j13, z12);
    }
}
