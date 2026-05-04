package androidx.compose.animation.core;

import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nVectorizedAnimationSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorizedAnimationSpec.kt\nandroidx/compose/animation/core/VectorizedAnimationSpecKt\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,1038:1\n119#2,10:1039\n*S KotlinDebug\n*F\n+ 1 VectorizedAnimationSpec.kt\nandroidx/compose/animation/core/VectorizedAnimationSpecKt\n*L\n187#1:1039,10\n*E\n"})
/* loaded from: classes.dex */
public final class VectorizedAnimationSpecKt {

    @k
    private static final int[] EmptyIntArray = new int[0];

    @k
    private static final float[] EmptyFloatArray = new float[0];

    @k
    private static final ArcSpline EmptyArcSpline = new ArcSpline(new int[2], new float[2], new float[][]{new float[2], new float[2]});

    public static final long clampPlayTime(@k VectorizedDurationBasedAnimationSpec<?> vectorizedDurationBasedAnimationSpec, long j11) {
        long delayMillis = j11 - vectorizedDurationBasedAnimationSpec.getDelayMillis();
        long durationMillis = vectorizedDurationBasedAnimationSpec.getDurationMillis();
        if (delayMillis < 0) {
            delayMillis = 0;
        }
        return delayMillis > durationMillis ? durationMillis : delayMillis;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <V extends AnimationVector> Animations createSpringAnimations(final V v11, final float f11, final float f12) {
        return v11 != null ? new Animations(v11, f11, f12) { // from class: androidx.compose.animation.core.VectorizedAnimationSpecKt$createSpringAnimations$1
            private final FloatSpringSpec[] anims;

            /* JADX WARN: Incorrect types in method signature: (TV;FF)V */
            {
                int size$animation_core_release = v11.getSize$animation_core_release();
                FloatSpringSpec[] floatSpringSpecArr = new FloatSpringSpec[size$animation_core_release];
                for (int i11 = 0; i11 < size$animation_core_release; i11++) {
                    floatSpringSpecArr[i11] = new FloatSpringSpec(f11, f12, v11.get$animation_core_release(i11));
                }
                this.anims = floatSpringSpecArr;
            }

            @Override // androidx.compose.animation.core.Animations
            public FloatSpringSpec get(int i11) {
                return this.anims[i11];
            }
        } : new Animations(f11, f12) { // from class: androidx.compose.animation.core.VectorizedAnimationSpecKt$createSpringAnimations$2
            private final FloatSpringSpec anim;

            {
                this.anim = new FloatSpringSpec(f11, f12, 0.0f, 4, null);
            }

            @Override // androidx.compose.animation.core.Animations
            public FloatSpringSpec get(int i11) {
                return this.anim;
            }
        };
    }

    public static final <V extends AnimationVector> long getDurationMillis(@k VectorizedAnimationSpec<V> vectorizedAnimationSpec, @k V v11, @k V v12, @k V v13) {
        return vectorizedAnimationSpec.getDurationNanos(v11, v12, v13) / 1000000;
    }

    @k
    public static final <V extends AnimationVector> V getValueFromMillis(@k VectorizedAnimationSpec<V> vectorizedAnimationSpec, long j11, @k V v11, @k V v12, @k V v13) {
        return vectorizedAnimationSpec.getValueFromNanos(j11 * 1000000, v11, v12, v13);
    }
}
