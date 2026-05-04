package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import g10.u;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import yz.g2;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nAnimatable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animatable.kt\nandroidx/compose/animation/core/Animatable\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Preconditions.kt\nandroidx/compose/animation/core/PreconditionsKt\n*L\n1#1,492:1\n85#2:493\n113#2,2:494\n85#2:496\n113#2,2:497\n1#3:499\n52#4,5:500\n*S KotlinDebug\n*F\n+ 1 Animatable.kt\nandroidx/compose/animation/core/Animatable\n*L\n86#1:493\n86#1:494,2\n93#1:496\n93#1:497,2\n171#1:500,5\n*E\n"})
/* loaded from: classes.dex */
public final class Animatable<T, V extends AnimationVector> {
    public static final int $stable = 8;

    @k
    private final SpringSpec<T> defaultSpringSpec;

    @k
    private final AnimationState<T, V> internalState;

    @k
    private final MutableState isRunning$delegate;

    @k
    private final String label;

    @l
    private T lowerBound;

    @k
    private V lowerBoundVector;

    @k
    private final MutatorMutex mutatorMutex;

    @k
    private final V negativeInfinityBounds;

    @k
    private final V positiveInfinityBounds;

    @k
    private final MutableState targetValue$delegate;

    @k
    private final TwoWayConverter<T, V> typeConverter;

    @l
    private T upperBound;

    @k
    private V upperBoundVector;

    @l
    private final T visibilityThreshold;

    public Animatable(T t11, @k TwoWayConverter<T, V> twoWayConverter, @l T t12, @k String str) {
        this.typeConverter = twoWayConverter;
        this.visibilityThreshold = t12;
        this.label = str;
        this.internalState = new AnimationState<>(twoWayConverter, t11, null, 0L, 0L, false, 60, null);
        this.isRunning$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.targetValue$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t11, null, 2, null);
        this.mutatorMutex = new MutatorMutex();
        this.defaultSpringSpec = new SpringSpec<>(0.0f, 0.0f, t12, 3, null);
        V velocityVector = getVelocityVector();
        V v11 = velocityVector instanceof AnimationVector1D ? AnimatableKt.negativeInfinityBounds1D : velocityVector instanceof AnimationVector2D ? AnimatableKt.negativeInfinityBounds2D : velocityVector instanceof AnimationVector3D ? AnimatableKt.negativeInfinityBounds3D : AnimatableKt.negativeInfinityBounds4D;
        g0.n(v11, "null cannot be cast to non-null type V of androidx.compose.animation.core.Animatable");
        this.negativeInfinityBounds = v11;
        V velocityVector2 = getVelocityVector();
        V v12 = velocityVector2 instanceof AnimationVector1D ? AnimatableKt.positiveInfinityBounds1D : velocityVector2 instanceof AnimationVector2D ? AnimatableKt.positiveInfinityBounds2D : velocityVector2 instanceof AnimationVector3D ? AnimatableKt.positiveInfinityBounds3D : AnimatableKt.positiveInfinityBounds4D;
        g0.n(v12, "null cannot be cast to non-null type V of androidx.compose.animation.core.Animatable");
        this.positiveInfinityBounds = v12;
        this.lowerBoundVector = v11;
        this.upperBoundVector = v12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateDecay$default(Animatable animatable, Object obj, DecayAnimationSpec decayAnimationSpec, x00.l lVar, j00.c cVar, int i11, Object obj2) {
        if ((i11 & 4) != 0) {
            lVar = null;
        }
        return animatable.animateDecay(obj, decayAnimationSpec, lVar, cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateTo$default(Animatable animatable, Object obj, AnimationSpec animationSpec, Object obj2, x00.l lVar, j00.c cVar, int i11, Object obj3) {
        if ((i11 & 2) != 0) {
            animationSpec = animatable.defaultSpringSpec;
        }
        AnimationSpec animationSpec2 = animationSpec;
        T t11 = obj2;
        if ((i11 & 4) != 0) {
            t11 = animatable.getVelocity();
        }
        T t12 = t11;
        if ((i11 & 8) != 0) {
            lVar = null;
        }
        return animatable.animateTo(obj, animationSpec2, t12, lVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T clampToBounds(T t11) {
        if (g0.g(this.lowerBoundVector, this.negativeInfinityBounds) && g0.g(this.upperBoundVector, this.positiveInfinityBounds)) {
            return t11;
        }
        V invoke = this.typeConverter.getConvertToVector().invoke(t11);
        int size$animation_core_release = invoke.getSize$animation_core_release();
        boolean z11 = false;
        for (int i11 = 0; i11 < size$animation_core_release; i11++) {
            if (invoke.get$animation_core_release(i11) < this.lowerBoundVector.get$animation_core_release(i11) || invoke.get$animation_core_release(i11) > this.upperBoundVector.get$animation_core_release(i11)) {
                invoke.set$animation_core_release(i11, u.H(invoke.get$animation_core_release(i11), this.lowerBoundVector.get$animation_core_release(i11), this.upperBoundVector.get$animation_core_release(i11)));
                z11 = true;
            }
        }
        return z11 ? this.typeConverter.getConvertFromVector().invoke(invoke) : t11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void endAnimation() {
        AnimationState<T, V> animationState = this.internalState;
        animationState.getVelocityVector().reset$animation_core_release();
        animationState.setLastFrameTimeNanos$animation_core_release(Long.MIN_VALUE);
        setRunning(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object runAnimation(Animation<T, V> animation, T t11, x00.l<? super Animatable<T, V>, g2> lVar, j00.c<? super AnimationResult<T, V>> cVar) {
        return MutatorMutex.mutate$default(this.mutatorMutex, null, new Animatable$runAnimation$2(this, t11, animation, this.internalState.getLastFrameTimeNanos(), lVar, null), cVar, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRunning(boolean z11) {
        this.isRunning$delegate.setValue(Boolean.valueOf(z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTargetValue(T t11) {
        this.targetValue$delegate.setValue(t11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateBounds$default(Animatable animatable, Object obj, Object obj2, int i11, Object obj3) {
        if ((i11 & 1) != 0) {
            obj = animatable.lowerBound;
        }
        if ((i11 & 2) != 0) {
            obj2 = animatable.upperBound;
        }
        animatable.updateBounds(obj, obj2);
    }

    @l
    public final Object animateDecay(T t11, @k DecayAnimationSpec<T> decayAnimationSpec, @l x00.l<? super Animatable<T, V>, g2> lVar, @k j00.c<? super AnimationResult<T, V>> cVar) {
        return runAnimation(new DecayAnimation((DecayAnimationSpec) decayAnimationSpec, (TwoWayConverter) this.typeConverter, (Object) getValue(), (AnimationVector) this.typeConverter.getConvertToVector().invoke(t11)), t11, lVar, cVar);
    }

    @l
    public final Object animateTo(T t11, @k AnimationSpec<T> animationSpec, T t12, @l x00.l<? super Animatable<T, V>, g2> lVar, @k j00.c<? super AnimationResult<T, V>> cVar) {
        return runAnimation(AnimationKt.TargetBasedAnimation(animationSpec, this.typeConverter, getValue(), t11, t12), t12, lVar, cVar);
    }

    @k
    public final State<T> asState() {
        return this.internalState;
    }

    @k
    public final SpringSpec<T> getDefaultSpringSpec$animation_core_release() {
        return this.defaultSpringSpec;
    }

    @k
    public final AnimationState<T, V> getInternalState$animation_core_release() {
        return this.internalState;
    }

    @k
    public final String getLabel() {
        return this.label;
    }

    @l
    public final T getLowerBound() {
        return this.lowerBound;
    }

    public final T getTargetValue() {
        return this.targetValue$delegate.getValue();
    }

    @k
    public final TwoWayConverter<T, V> getTypeConverter() {
        return this.typeConverter;
    }

    @l
    public final T getUpperBound() {
        return this.upperBound;
    }

    public final T getValue() {
        return this.internalState.getValue();
    }

    public final T getVelocity() {
        return this.typeConverter.getConvertFromVector().invoke(getVelocityVector());
    }

    @k
    public final V getVelocityVector() {
        return this.internalState.getVelocityVector();
    }

    public final boolean isRunning() {
        return ((Boolean) this.isRunning$delegate.getValue()).booleanValue();
    }

    @l
    public final Object snapTo(T t11, @k j00.c<? super g2> cVar) {
        Object mutate$default = MutatorMutex.mutate$default(this.mutatorMutex, null, new Animatable$snapTo$2(this, t11, null), cVar, 1, null);
        return mutate$default == kotlin.coroutines.intrinsics.b.l() ? mutate$default : g2.f100423a;
    }

    @l
    public final Object stop(@k j00.c<? super g2> cVar) {
        Object mutate$default = MutatorMutex.mutate$default(this.mutatorMutex, null, new Animatable$stop$2(this, null), cVar, 1, null);
        return mutate$default == kotlin.coroutines.intrinsics.b.l() ? mutate$default : g2.f100423a;
    }

    public final void updateBounds(@l T t11, @l T t12) {
        V v11;
        V v12;
        if (t11 == null || (v11 = this.typeConverter.getConvertToVector().invoke(t11)) == null) {
            v11 = this.negativeInfinityBounds;
        }
        if (t12 == null || (v12 = this.typeConverter.getConvertToVector().invoke(t12)) == null) {
            v12 = this.positiveInfinityBounds;
        }
        int size$animation_core_release = v11.getSize$animation_core_release();
        for (int i11 = 0; i11 < size$animation_core_release; i11++) {
            if (!(v11.get$animation_core_release(i11) <= v12.get$animation_core_release(i11))) {
                PreconditionsKt.throwIllegalStateException("Lower bound must be no greater than upper bound on *all* dimensions. The provided lower bound: " + v11 + " is greater than upper bound " + v12 + " on index " + i11);
            }
        }
        this.lowerBoundVector = v11;
        this.upperBoundVector = v12;
        this.upperBound = t12;
        this.lowerBound = t11;
        if (isRunning()) {
            return;
        }
        T clampToBounds = clampToBounds(getValue());
        if (g0.g(clampToBounds, getValue())) {
            return;
        }
        this.internalState.setValue$animation_core_release(clampToBounds);
    }

    private static /* synthetic */ void getNegativeInfinityBounds$annotations() {
    }

    private static /* synthetic */ void getPositiveInfinityBounds$annotations() {
    }

    public /* synthetic */ Animatable(Object obj, TwoWayConverter twoWayConverter, Object obj2, String str, int i11, v vVar) {
        this(obj, twoWayConverter, (i11 & 4) != 0 ? null : obj2, (i11 & 8) != 0 ? "Animatable" : str);
    }

    public /* synthetic */ Animatable(Object obj, TwoWayConverter twoWayConverter, Object obj2, int i11, v vVar) {
        this(obj, twoWayConverter, (i11 & 4) != 0 ? null : obj2);
    }

    @n(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility", replaceWith = @w0(expression = "Animatable(initialValue, typeConverter, visibilityThreshold, \"Animatable\")", imports = {}))
    public /* synthetic */ Animatable(Object obj, TwoWayConverter twoWayConverter, Object obj2) {
        this(obj, twoWayConverter, obj2, "Animatable");
    }
}
