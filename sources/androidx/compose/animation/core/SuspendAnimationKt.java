package androidx.compose.animation.core;

import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.ui.MotionDurationScale;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.z;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSuspendAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuspendAnimation.kt\nandroidx/compose/animation/core/SuspendAnimationKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Preconditions.kt\nandroidx/compose/animation/core/PreconditionsKt\n*L\n1#1,363:1\n1#2:364\n52#3,5:365\n*S KotlinDebug\n*F\n+ 1 SuspendAnimation.kt\nandroidx/compose/animation/core/SuspendAnimationKt\n*L\n312#1:365,5\n*E\n"})
/* loaded from: classes.dex */
public final class SuspendAnimationKt {
    @l
    public static final Object animate(float f11, float f12, float f13, @k AnimationSpec<Float> animationSpec, @k p<? super Float, ? super Float, g2> pVar, @k j00.c<? super g2> cVar) {
        Object animate = animate(VectorConvertersKt.getVectorConverter(z.f67060a), l00.a.e(f11), l00.a.e(f12), l00.a.e(f13), animationSpec, pVar, cVar);
        return animate == kotlin.coroutines.intrinsics.b.l() ? animate : g2.f100423a;
    }

    public static /* synthetic */ Object animate$default(float f11, float f12, float f13, AnimationSpec animationSpec, p pVar, j00.c cVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            f13 = 0.0f;
        }
        if ((i11 & 8) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        return animate(f11, f12, f13, animationSpec, pVar, cVar);
    }

    @l
    public static final Object animateDecay(float f11, float f12, @k FloatDecayAnimationSpec floatDecayAnimationSpec, @k final p<? super Float, ? super Float, g2> pVar, @k j00.c<? super g2> cVar) {
        Object animate$default = animate$default(AnimationStateKt.AnimationState$default(f11, f12, 0L, 0L, false, 28, null), AnimationKt.DecayAnimation(floatDecayAnimationSpec, f11, f12), 0L, new x00.l<AnimationScope<Float, AnimationVector1D>, g2>() { // from class: androidx.compose.animation.core.SuspendAnimationKt$animateDecay$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                invoke2(animationScope);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(AnimationScope<Float, AnimationVector1D> animationScope) {
                pVar.invoke(animationScope.getValue(), Float.valueOf(animationScope.getVelocityVector().getValue()));
            }
        }, cVar, 2, null);
        return animate$default == kotlin.coroutines.intrinsics.b.l() ? animate$default : g2.f100423a;
    }

    public static /* synthetic */ Object animateDecay$default(AnimationState animationState, DecayAnimationSpec decayAnimationSpec, boolean z11, x00.l lVar, j00.c cVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        if ((i11 & 4) != 0) {
            lVar = new x00.l<AnimationScope<Object, Object>, g2>() { // from class: androidx.compose.animation.core.SuspendAnimationKt$animateDecay$4
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(AnimationScope<Object, Object> animationScope) {
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(AnimationScope<Object, Object> animationScope) {
                    invoke2(animationScope);
                    return g2.f100423a;
                }
            };
        }
        return animateDecay(animationState, decayAnimationSpec, z11, lVar, (j00.c<? super g2>) cVar);
    }

    @l
    public static final <T, V extends AnimationVector> Object animateTo(@k AnimationState<T, V> animationState, T t11, @k AnimationSpec<T> animationSpec, boolean z11, @k x00.l<? super AnimationScope<T, V>, g2> lVar, @k j00.c<? super g2> cVar) {
        Object animate = animate(animationState, new TargetBasedAnimation(animationSpec, animationState.getTypeConverter(), animationState.getValue(), t11, animationState.getVelocityVector()), z11 ? animationState.getLastFrameTimeNanos() : Long.MIN_VALUE, lVar, cVar);
        return animate == kotlin.coroutines.intrinsics.b.l() ? animate : g2.f100423a;
    }

    public static /* synthetic */ Object animateTo$default(AnimationState animationState, Object obj, AnimationSpec animationSpec, boolean z11, x00.l lVar, j00.c cVar, int i11, Object obj2) {
        if ((i11 & 2) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        boolean z12 = z11;
        if ((i11 & 8) != 0) {
            lVar = new x00.l<AnimationScope<Object, Object>, g2>() { // from class: androidx.compose.animation.core.SuspendAnimationKt$animateTo$2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(AnimationScope<Object, Object> animationScope) {
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(AnimationScope<Object, Object> animationScope) {
                    invoke2(animationScope);
                    return g2.f100423a;
                }
            };
        }
        return animateTo(animationState, obj, animationSpec2, z12, lVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <R, T, V extends AnimationVector> Object callWithFrameNanos(Animation<T, V> animation, final x00.l<? super Long, ? extends R> lVar, j00.c<? super R> cVar) {
        return animation.isInfinite() ? InfiniteAnimationPolicyKt.withInfiniteAnimationFrameNanos(lVar, cVar) : MonotonicFrameClockKt.withFrameNanos(new x00.l<Long, R>() { // from class: androidx.compose.animation.core.SuspendAnimationKt$callWithFrameNanos$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public final R invoke(long j11) {
                return lVar.invoke(Long.valueOf(j11));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ Object invoke(Long l11) {
                return invoke(l11.longValue());
            }
        }, cVar);
    }

    private static final <T, V extends AnimationVector> void doAnimationFrame(AnimationScope<T, V> animationScope, long j11, long j12, Animation<T, V> animation, AnimationState<T, V> animationState, x00.l<? super AnimationScope<T, V>, g2> lVar) {
        animationScope.setLastFrameTimeNanos$animation_core_release(j11);
        animationScope.setValue$animation_core_release(animation.getValueFromNanos(j12));
        animationScope.setVelocityVector$animation_core_release(animation.getVelocityVectorFromNanos(j12));
        if (animation.isFinishedFromNanos(j12)) {
            animationScope.setFinishedTimeNanos$animation_core_release(animationScope.getLastFrameTimeNanos());
            animationScope.setRunning$animation_core_release(false);
        }
        updateState(animationScope, animationState);
        lVar.invoke(animationScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T, V extends AnimationVector> void doAnimationFrameWithScale(AnimationScope<T, V> animationScope, long j11, float f11, Animation<T, V> animation, AnimationState<T, V> animationState, x00.l<? super AnimationScope<T, V>, g2> lVar) {
        doAnimationFrame(animationScope, j11, f11 == 0.0f ? animation.getDurationNanos() : (long) ((j11 - animationScope.getStartTimeNanos()) / f11), animation, animationState, lVar);
    }

    public static final float getDurationScale(@k kotlin.coroutines.d dVar) {
        MotionDurationScale motionDurationScale = (MotionDurationScale) dVar.get(MotionDurationScale.Key);
        float scaleFactor = motionDurationScale != null ? motionDurationScale.getScaleFactor() : 1.0f;
        if (!(scaleFactor >= 0.0f)) {
            PreconditionsKt.throwIllegalStateException("negative scale factor");
        }
        return scaleFactor;
    }

    public static final <T, V extends AnimationVector> void updateState(@k AnimationScope<T, V> animationScope, @k AnimationState<T, V> animationState) {
        animationState.setValue$animation_core_release(animationScope.getValue());
        AnimationVectorsKt.copyFrom(animationState.getVelocityVector(), animationScope.getVelocityVector());
        animationState.setFinishedTimeNanos$animation_core_release(animationScope.getFinishedTimeNanos());
        animationState.setLastFrameTimeNanos$animation_core_release(animationScope.getLastFrameTimeNanos());
        animationState.setRunning$animation_core_release(animationScope.isRunning());
    }

    @l
    public static final <T, V extends AnimationVector> Object animate(@k final TwoWayConverter<T, V> twoWayConverter, T t11, T t12, @l T t13, @k AnimationSpec<T> animationSpec, @k final p<? super T, ? super T, g2> pVar, @k j00.c<? super g2> cVar) {
        V newInstance;
        if (t13 == null || (newInstance = twoWayConverter.getConvertToVector().invoke(t13)) == null) {
            newInstance = AnimationVectorsKt.newInstance(twoWayConverter.getConvertToVector().invoke(t11));
        }
        AnimationVector animationVector = newInstance;
        Object animate$default = animate$default(new AnimationState(twoWayConverter, t11, animationVector, 0L, 0L, false, 56, null), new TargetBasedAnimation(animationSpec, twoWayConverter, t11, t12, animationVector), 0L, new x00.l<AnimationScope<T, V>, g2>() { // from class: androidx.compose.animation.core.SuspendAnimationKt$animate$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(Object obj) {
                invoke((AnimationScope) obj);
                return g2.f100423a;
            }

            public final void invoke(AnimationScope<T, V> animationScope) {
                pVar.invoke(animationScope.getValue(), twoWayConverter.getConvertFromVector().invoke(animationScope.getVelocityVector()));
            }
        }, cVar, 2, null);
        return animate$default == kotlin.coroutines.intrinsics.b.l() ? animate$default : g2.f100423a;
    }

    public static /* synthetic */ Object animate$default(TwoWayConverter twoWayConverter, Object obj, Object obj2, Object obj3, AnimationSpec animationSpec, p pVar, j00.c cVar, int i11, Object obj4) {
        if ((i11 & 8) != 0) {
            obj3 = null;
        }
        if ((i11 & 16) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        return animate(twoWayConverter, obj, obj2, obj3, animationSpec, pVar, cVar);
    }

    @l
    public static final <T, V extends AnimationVector> Object animateDecay(@k AnimationState<T, V> animationState, @k DecayAnimationSpec<T> decayAnimationSpec, boolean z11, @k x00.l<? super AnimationScope<T, V>, g2> lVar, @k j00.c<? super g2> cVar) {
        Object animate = animate(animationState, new DecayAnimation((DecayAnimationSpec) decayAnimationSpec, (TwoWayConverter) animationState.getTypeConverter(), (Object) animationState.getValue(), (AnimationVector) animationState.getVelocityVector()), z11 ? animationState.getLastFrameTimeNanos() : Long.MIN_VALUE, lVar, cVar);
        return animate == kotlin.coroutines.intrinsics.b.l() ? animate : g2.f100423a;
    }

    public static /* synthetic */ Object animate$default(AnimationState animationState, Animation animation, long j11, x00.l lVar, j00.c cVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j11 = Long.MIN_VALUE;
        }
        long j12 = j11;
        if ((i11 & 4) != 0) {
            lVar = new x00.l<AnimationScope<Object, Object>, g2>() { // from class: androidx.compose.animation.core.SuspendAnimationKt$animate$5
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(AnimationScope<Object, Object> animationScope) {
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(AnimationScope<Object, Object> animationScope) {
                    invoke2(animationScope);
                    return g2.f100423a;
                }
            };
        }
        return animate(animationState, animation, j12, lVar, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00e5 A[Catch: CancellationException -> 0x0043, TRY_LEAVE, TryCatch #4 {CancellationException -> 0x0043, blocks: (B:16:0x003e, B:18:0x00d8, B:20:0x00e5, B:25:0x0108), top: B:15:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Type inference failed for: r12v0, types: [T, androidx.compose.animation.core.AnimationScope] */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T, V extends androidx.compose.animation.core.AnimationVector> java.lang.Object animate(@m80.k final androidx.compose.animation.core.AnimationState<T, V> r23, @m80.k androidx.compose.animation.core.Animation<T, V> r24, long r25, @m80.k final x00.l<? super androidx.compose.animation.core.AnimationScope<T, V>, yz.g2> r27, @m80.k j00.c<? super yz.g2> r28) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SuspendAnimationKt.animate(androidx.compose.animation.core.AnimationState, androidx.compose.animation.core.Animation, long, x00.l, j00.c):java.lang.Object");
    }
}
