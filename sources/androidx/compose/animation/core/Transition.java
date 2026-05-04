package androidx.compose.animation.core;

import androidx.annotation.RestrictTo;
import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotLongStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import c40.r0;
import c40.s0;
import java.util.List;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import kotlinx.coroutines.CoroutineStart;
import m80.k;
import m80.l;
import org.junit.jupiter.api.j2;
import w00.j;
import x00.p;
import yz.g2;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotLongState.kt\nandroidx/compose/runtime/SnapshotLongStateKt__SnapshotLongStateKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2137:1\n85#2:2138\n113#2,2:2139\n85#2:2141\n113#2,2:2142\n85#2:2150\n113#2,2:2151\n85#2:2153\n113#2,2:2154\n85#2:2174\n78#3:2144\n107#3,2:2145\n78#3:2147\n107#3,2:2148\n102#4,2:2156\n34#4,6:2158\n104#4:2164\n102#4,2:2165\n34#4,6:2167\n104#4:2173\n34#4,6:2175\n34#4,6:2181\n34#4,6:2187\n34#4,6:2193\n34#4,6:2199\n34#4,6:2205\n34#4,6:2211\n34#4,6:2217\n34#4,6:2243\n34#4,6:2249\n34#4,6:2255\n34#4,6:2261\n34#4,6:2267\n34#4,6:2273\n34#4,6:2279\n34#4,6:2285\n34#4,6:2291\n34#4,6:2297\n269#4,3:2303\n34#4,6:2306\n272#4:2312\n34#4,6:2313\n557#5:2223\n554#5,6:2224\n1247#6,3:2230\n1250#6,3:2234\n1247#6,6:2237\n555#7:2233\n1#8:2319\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition\n*L\n912#1:2138\n912#1:2139,2\n919#1:2141\n919#1:2142,2\n949#1:2150\n949#1:2151,2\n965#1:2153\n965#1:2154,2\n994#1:2174\n926#1:2144\n926#1:2145,2\n946#1:2147\n946#1:2148,2\n983#1:2156,2\n983#1:2158,6\n983#1:2164\n984#1:2165,2\n984#1:2167,6\n984#1:2173\n998#1:2175,6\n999#1:2181,6\n1032#1:2187,6\n1041#1:2193,6\n1079#1:2199,6\n1117#1:2205,6\n1130#1:2211,6\n1164#1:2217,6\n1216#1:2243,6\n1217#1:2249,6\n1232#1:2255,6\n1233#1:2261,6\n1241#1:2267,6\n1242#1:2273,6\n1247#1:2279,6\n1248#1:2285,6\n1258#1:2291,6\n1259#1:2297,6\n1263#1:2303,3\n1263#1:2306,6\n1263#1:2312\n1272#1:2313,6\n1181#1:2223\n1181#1:2224,6\n1181#1:2230,3\n1181#1:2234,3\n1182#1:2237,6\n1181#1:2233\n*E\n"})
@Stable
/* loaded from: classes.dex */
public final class Transition<S> {
    public static final int $stable = 0;

    @k
    private final SnapshotStateList<Transition<S>.TransitionAnimationState<?, ?>> _animations;

    @k
    private final MutableLongState _playTimeNanos$delegate;

    @k
    private final SnapshotStateList<Transition<?>> _transitions;

    @k
    private final MutableState isSeeking$delegate;

    @l
    private final String label;
    private long lastSeekedTimeNanos;

    @l
    private final Transition<?> parentTransition;

    @k
    private final MutableState segment$delegate;

    @k
    private final MutableLongState startTimeNanos$delegate;

    @k
    private final MutableState targetState$delegate;

    @k
    private final State totalDurationNanos$delegate;

    @k
    private final TransitionState<S> transitionState;

    @k
    private final MutableState updateChildrenNeeded$delegate;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition$DeferredAnimation\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,2137:1\n85#2:2138\n113#2,2:2139\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition$DeferredAnimation\n*L\n1615#1:2138\n1615#1:2139,2\n*E\n"})
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final class DeferredAnimation<T, V extends AnimationVector> {

        @k
        private final MutableState data$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

        @k
        private final String label;

        @k
        private final TwoWayConverter<T, V> typeConverter;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public final class DeferredAnimationData<T, V extends AnimationVector> implements State<T> {

            @k
            private final Transition<S>.TransitionAnimationState<T, V> animation;

            @k
            private x00.l<? super S, ? extends T> targetValueByState;

            @k
            private x00.l<? super Segment<S>, ? extends FiniteAnimationSpec<T>> transitionSpec;

            public DeferredAnimationData(@k Transition<S>.TransitionAnimationState<T, V> transitionAnimationState, @k x00.l<? super Segment<S>, ? extends FiniteAnimationSpec<T>> lVar, @k x00.l<? super S, ? extends T> lVar2) {
                this.animation = transitionAnimationState;
                this.transitionSpec = lVar;
                this.targetValueByState = lVar2;
            }

            @k
            public final Transition<S>.TransitionAnimationState<T, V> getAnimation() {
                return this.animation;
            }

            @k
            public final x00.l<S, T> getTargetValueByState() {
                return this.targetValueByState;
            }

            @k
            public final x00.l<Segment<S>, FiniteAnimationSpec<T>> getTransitionSpec() {
                return this.transitionSpec;
            }

            @Override // androidx.compose.runtime.State
            public T getValue() {
                updateAnimationStates(Transition.this.getSegment());
                return this.animation.getValue();
            }

            public final void setTargetValueByState(@k x00.l<? super S, ? extends T> lVar) {
                this.targetValueByState = lVar;
            }

            public final void setTransitionSpec(@k x00.l<? super Segment<S>, ? extends FiniteAnimationSpec<T>> lVar) {
                this.transitionSpec = lVar;
            }

            public final void updateAnimationStates(@k Segment<S> segment) {
                T invoke = this.targetValueByState.invoke(segment.getTargetState());
                if (!Transition.this.isSeeking()) {
                    this.animation.updateTargetValue$animation_core_release(invoke, this.transitionSpec.invoke(segment));
                } else {
                    this.animation.updateInitialAndTargetValue$animation_core_release(this.targetValueByState.invoke(segment.getInitialState()), invoke, this.transitionSpec.invoke(segment));
                }
            }
        }

        public DeferredAnimation(@k TwoWayConverter<T, V> twoWayConverter, @k String str) {
            this.typeConverter = twoWayConverter;
            this.label = str;
        }

        @k
        public final State<T> animate(@k x00.l<? super Segment<S>, ? extends FiniteAnimationSpec<T>> lVar, @k x00.l<? super S, ? extends T> lVar2) {
            Transition<S>.DeferredAnimationData<T, V>.DeferredAnimationData<T, V> data$animation_core_release = getData$animation_core_release();
            if (data$animation_core_release == null) {
                Transition<S> transition = Transition.this;
                data$animation_core_release = new DeferredAnimationData<>(transition.new TransitionAnimationState(lVar2.invoke(transition.getCurrentState()), AnimationStateKt.createZeroVectorFrom(this.typeConverter, lVar2.invoke(Transition.this.getCurrentState())), this.typeConverter, this.label), lVar, lVar2);
                Transition<S> transition2 = Transition.this;
                setData$animation_core_release(data$animation_core_release);
                transition2.addAnimation$animation_core_release(data$animation_core_release.getAnimation());
            }
            Transition<S> transition3 = Transition.this;
            data$animation_core_release.setTargetValueByState(lVar2);
            data$animation_core_release.setTransitionSpec(lVar);
            data$animation_core_release.updateAnimationStates(transition3.getSegment());
            return data$animation_core_release;
        }

        @l
        public final Transition<S>.DeferredAnimationData<T, V>.DeferredAnimationData<T, V> getData$animation_core_release() {
            return (DeferredAnimationData) this.data$delegate.getValue();
        }

        @k
        public final String getLabel() {
            return this.label;
        }

        @k
        public final TwoWayConverter<T, V> getTypeConverter() {
            return this.typeConverter;
        }

        public final void setData$animation_core_release(@l Transition<S>.DeferredAnimationData<T, V>.DeferredAnimationData<T, V> deferredAnimationData) {
            this.data$delegate.setValue(deferredAnimationData);
        }

        public final void setupSeeking$animation_core_release() {
            Transition<S>.DeferredAnimationData<T, V>.DeferredAnimationData<T, V> data$animation_core_release = getData$animation_core_release();
            if (data$animation_core_release != null) {
                Transition<S> transition = Transition.this;
                data$animation_core_release.getAnimation().updateInitialAndTargetValue$animation_core_release(data$animation_core_release.getTargetValueByState().invoke(transition.getSegment().getInitialState()), data$animation_core_release.getTargetValueByState().invoke(transition.getSegment().getTargetState()), data$animation_core_release.getTransitionSpec().invoke(transition.getSegment()));
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface Segment<S> {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class DefaultImpls {
            @Deprecated
            public static <S> boolean isTransitioningTo(@k Segment<S> segment, S s11, S s12) {
                return Segment.super.isTransitioningTo(s11, s12);
            }
        }

        S getInitialState();

        S getTargetState();

        default boolean isTransitioningTo(S s11, S s12) {
            return g0.g(s11, getInitialState()) && g0.g(s12, getTargetState());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class SegmentImpl<S> implements Segment<S> {
        private final S initialState;
        private final S targetState;

        public SegmentImpl(S s11, S s12) {
            this.initialState = s11;
            this.targetState = s12;
        }

        public boolean equals(@l Object obj) {
            if (!(obj instanceof Segment)) {
                return false;
            }
            Segment segment = (Segment) obj;
            return g0.g(getInitialState(), segment.getInitialState()) && g0.g(getTargetState(), segment.getTargetState());
        }

        @Override // androidx.compose.animation.core.Transition.Segment
        public S getInitialState() {
            return this.initialState;
        }

        @Override // androidx.compose.animation.core.Transition.Segment
        public S getTargetState() {
            return this.targetState;
        }

        public int hashCode() {
            S initialState = getInitialState();
            int hashCode = (initialState != null ? initialState.hashCode() : 0) * 31;
            S targetState = getTargetState();
            return hashCode + (targetState != null ? targetState.hashCode() : 0);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition$TransitionAnimationState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 4 SnapshotLongState.kt\nandroidx/compose/runtime/SnapshotLongStateKt__SnapshotLongStateKt\n*L\n1#1,2137:1\n85#2:2138\n113#2,2:2139\n85#2:2141\n113#2,2:2142\n85#2:2144\n113#2,2:2145\n85#2:2147\n113#2,2:2148\n85#2:2153\n113#2,2:2154\n79#3:2150\n112#3,2:2151\n78#4:2156\n107#4,2:2157\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition$TransitionAnimationState\n*L\n1296#1:2138\n1296#1:2139,2\n1304#1:2141\n1304#1:2142,2\n1312#1:2144\n1312#1:2145,2\n1326#1:2147\n1326#1:2148,2\n1339#1:2153\n1339#1:2154,2\n1327#1:2150\n1327#1:2151,2\n1343#1:2156\n1343#1:2157,2\n*E\n"})
    @Stable
    public final class TransitionAnimationState<T, V extends AnimationVector> implements State<T> {

        @k
        private final MutableState animation$delegate;

        @k
        private final MutableState animationSpec$delegate;

        @k
        private final SpringSpec<T> defaultSpring;

        @k
        private final MutableLongState durationNanos$delegate;

        @l
        private TargetBasedAnimation<T, V> initialValueAnimation;

        @l
        private SeekableTransitionState.SeekingAnimationState initialValueState;

        @k
        private final FiniteAnimationSpec<T> interruptionSpec;

        @k
        private final MutableState isFinished$delegate;
        private boolean isSeeking;

        @k
        private final String label;

        @k
        private final MutableFloatState resetSnapValue$delegate;

        @k
        private final MutableState targetValue$delegate;

        @k
        private final TwoWayConverter<T, V> typeConverter;
        private boolean useOnlyInitialValue;

        @k
        private final MutableState value$delegate;

        @k
        private V velocityVector;

        public TransitionAnimationState(T t11, @k V v11, @k TwoWayConverter<T, V> twoWayConverter, @k String str) {
            T t12;
            this.typeConverter = twoWayConverter;
            this.label = str;
            this.targetValue$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t11, null, 2, null);
            SpringSpec<T> spring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
            this.defaultSpring = spring$default;
            this.animationSpec$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(spring$default, null, 2, null);
            this.animation$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TargetBasedAnimation(getAnimationSpec(), twoWayConverter, t11, getTargetValue(), v11), null, 2, null);
            this.isFinished$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
            this.resetSnapValue$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(-1.0f);
            this.value$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t11, null, 2, null);
            this.velocityVector = v11;
            this.durationNanos$delegate = SnapshotLongStateKt.mutableLongStateOf(getAnimation().getDurationNanos());
            Float f11 = VisibilityThresholdsKt.getVisibilityThresholdMap().get(twoWayConverter);
            if (f11 != null) {
                float floatValue = f11.floatValue();
                V invoke = twoWayConverter.getConvertToVector().invoke(t11);
                int size$animation_core_release = invoke.getSize$animation_core_release();
                for (int i11 = 0; i11 < size$animation_core_release; i11++) {
                    invoke.set$animation_core_release(i11, floatValue);
                }
                t12 = this.typeConverter.getConvertFromVector().invoke(invoke);
            } else {
                t12 = null;
            }
            this.interruptionSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, t12, 3, null);
        }

        private final T getTargetValue() {
            return this.targetValue$delegate.getValue();
        }

        private final void setAnimation(TargetBasedAnimation<T, V> targetBasedAnimation) {
            this.animation$delegate.setValue(targetBasedAnimation);
        }

        private final void setAnimationSpec(FiniteAnimationSpec<T> finiteAnimationSpec) {
            this.animationSpec$delegate.setValue(finiteAnimationSpec);
        }

        private final void setTargetValue(T t11) {
            this.targetValue$delegate.setValue(t11);
        }

        private final void updateAnimation(T t11, boolean z11) {
            TargetBasedAnimation<T, V> targetBasedAnimation = this.initialValueAnimation;
            if (g0.g(targetBasedAnimation != null ? targetBasedAnimation.getTargetValue() : null, getTargetValue())) {
                setAnimation(new TargetBasedAnimation<>(this.interruptionSpec, this.typeConverter, t11, t11, AnimationVectorsKt.newInstance(this.velocityVector)));
                this.useOnlyInitialValue = true;
                setDurationNanos$animation_core_release(getAnimation().getDurationNanos());
                return;
            }
            AnimationSpec animationSpec = (!z11 || this.isSeeking) ? getAnimationSpec() : getAnimationSpec() instanceof SpringSpec ? getAnimationSpec() : this.interruptionSpec;
            if (Transition.this.getPlayTimeNanos() > 0) {
                animationSpec = AnimationSpecKt.delayed(animationSpec, Transition.this.getPlayTimeNanos());
            }
            setAnimation(new TargetBasedAnimation<>(animationSpec, this.typeConverter, t11, getTargetValue(), this.velocityVector));
            setDurationNanos$animation_core_release(getAnimation().getDurationNanos());
            this.useOnlyInitialValue = false;
            Transition.this.onChildAnimationUpdated();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void updateAnimation$default(TransitionAnimationState transitionAnimationState, Object obj, boolean z11, int i11, Object obj2) {
            if ((i11 & 1) != 0) {
                obj = transitionAnimationState.getValue();
            }
            if ((i11 & 2) != 0) {
                z11 = false;
            }
            transitionAnimationState.updateAnimation(obj, z11);
        }

        public final void clearInitialAnimation$animation_core_release() {
            this.initialValueAnimation = null;
            this.initialValueState = null;
            this.useOnlyInitialValue = false;
        }

        @k
        public final TargetBasedAnimation<T, V> getAnimation() {
            return (TargetBasedAnimation) this.animation$delegate.getValue();
        }

        @k
        public final FiniteAnimationSpec<T> getAnimationSpec() {
            return (FiniteAnimationSpec) this.animationSpec$delegate.getValue();
        }

        public final long getDurationNanos$animation_core_release() {
            return this.durationNanos$delegate.getLongValue();
        }

        @l
        public final SeekableTransitionState.SeekingAnimationState getInitialValueState$animation_core_release() {
            return this.initialValueState;
        }

        @k
        public final String getLabel() {
            return this.label;
        }

        public final float getResetSnapValue$animation_core_release() {
            return this.resetSnapValue$delegate.getFloatValue();
        }

        @k
        public final TwoWayConverter<T, V> getTypeConverter() {
            return this.typeConverter;
        }

        @Override // androidx.compose.runtime.State
        public T getValue() {
            return this.value$delegate.getValue();
        }

        public final boolean isFinished$animation_core_release() {
            return ((Boolean) this.isFinished$delegate.getValue()).booleanValue();
        }

        public final void onPlayTimeChanged$animation_core_release(long j11, boolean z11) {
            if (z11) {
                j11 = getAnimation().getDurationNanos();
            }
            setValue$animation_core_release(getAnimation().getValueFromNanos(j11));
            this.velocityVector = getAnimation().getVelocityVectorFromNanos(j11);
            if (getAnimation().isFinishedFromNanos(j11)) {
                setFinished$animation_core_release(true);
            }
        }

        public final void resetAnimation$animation_core_release() {
            setResetSnapValue$animation_core_release(-2.0f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void resetAnimationValue$animation_core_release(float f11) {
            if (f11 != -4.0f && f11 != -5.0f) {
                setResetSnapValue$animation_core_release(f11);
                return;
            }
            TargetBasedAnimation<T, V> targetBasedAnimation = this.initialValueAnimation;
            if (targetBasedAnimation != null) {
                getAnimation().setMutableInitialValue$animation_core_release(targetBasedAnimation.getTargetValue());
                this.initialValueState = null;
                this.initialValueAnimation = null;
            }
            Object initialValue = f11 == -4.0f ? getAnimation().getInitialValue() : getAnimation().getTargetValue();
            getAnimation().setMutableInitialValue$animation_core_release(initialValue);
            getAnimation().setMutableTargetValue$animation_core_release(initialValue);
            setValue$animation_core_release(initialValue);
            setDurationNanos$animation_core_release(getAnimation().getDurationNanos());
        }

        public final void seekTo$animation_core_release(long j11) {
            if (getResetSnapValue$animation_core_release() == -1.0f) {
                this.isSeeking = true;
                if (g0.g(getAnimation().getTargetValue(), getAnimation().getInitialValue())) {
                    setValue$animation_core_release(getAnimation().getTargetValue());
                } else {
                    setValue$animation_core_release(getAnimation().getValueFromNanos(j11));
                    this.velocityVector = getAnimation().getVelocityVectorFromNanos(j11);
                }
            }
        }

        public final void setDurationNanos$animation_core_release(long j11) {
            this.durationNanos$delegate.setLongValue(j11);
        }

        public final void setFinished$animation_core_release(boolean z11) {
            this.isFinished$delegate.setValue(Boolean.valueOf(z11));
        }

        public final void setInitialValueAnimation$animation_core_release(@k SeekableTransitionState.SeekingAnimationState seekingAnimationState) {
            if (!g0.g(getAnimation().getTargetValue(), getAnimation().getInitialValue())) {
                this.initialValueAnimation = getAnimation();
                this.initialValueState = seekingAnimationState;
            }
            setAnimation(new TargetBasedAnimation<>(this.interruptionSpec, this.typeConverter, getValue(), getValue(), AnimationVectorsKt.newInstance(this.velocityVector)));
            setDurationNanos$animation_core_release(getAnimation().getDurationNanos());
            this.useOnlyInitialValue = true;
        }

        public final void setInitialValueState$animation_core_release(@l SeekableTransitionState.SeekingAnimationState seekingAnimationState) {
            this.initialValueState = seekingAnimationState;
        }

        public final void setResetSnapValue$animation_core_release(float f11) {
            this.resetSnapValue$delegate.setFloatValue(f11);
        }

        public void setValue$animation_core_release(T t11) {
            this.value$delegate.setValue(t11);
        }

        @k
        public String toString() {
            return "current value: " + getValue() + ", target: " + getTargetValue() + ", spec: " + getAnimationSpec();
        }

        public final void updateInitialAndTargetValue$animation_core_release(T t11, T t12, @k FiniteAnimationSpec<T> finiteAnimationSpec) {
            setTargetValue(t12);
            setAnimationSpec(finiteAnimationSpec);
            if (g0.g(getAnimation().getInitialValue(), t11) && g0.g(getAnimation().getTargetValue(), t12)) {
                return;
            }
            updateAnimation$default(this, t11, false, 2, null);
        }

        public final void updateInitialValue$animation_core_release() {
            TargetBasedAnimation<T, V> targetBasedAnimation;
            SeekableTransitionState.SeekingAnimationState seekingAnimationState = this.initialValueState;
            if (seekingAnimationState == null || (targetBasedAnimation = this.initialValueAnimation) == null) {
                return;
            }
            long M0 = c10.d.M0(seekingAnimationState.getDurationNanos() * seekingAnimationState.getValue());
            T valueFromNanos = targetBasedAnimation.getValueFromNanos(M0);
            if (this.useOnlyInitialValue) {
                getAnimation().setMutableTargetValue$animation_core_release(valueFromNanos);
            }
            getAnimation().setMutableInitialValue$animation_core_release(valueFromNanos);
            setDurationNanos$animation_core_release(getAnimation().getDurationNanos());
            if (getResetSnapValue$animation_core_release() == -2.0f || this.useOnlyInitialValue) {
                setValue$animation_core_release(valueFromNanos);
            } else {
                seekTo$animation_core_release(Transition.this.getPlayTimeNanos());
            }
            if (M0 < seekingAnimationState.getDurationNanos()) {
                seekingAnimationState.setComplete(false);
            } else {
                this.initialValueState = null;
                this.initialValueAnimation = null;
            }
        }

        public final void updateTargetValue$animation_core_release(T t11, @k FiniteAnimationSpec<T> finiteAnimationSpec) {
            if (this.useOnlyInitialValue) {
                TargetBasedAnimation<T, V> targetBasedAnimation = this.initialValueAnimation;
                if (g0.g(t11, targetBasedAnimation != null ? targetBasedAnimation.getTargetValue() : null)) {
                    return;
                }
            }
            if (g0.g(getTargetValue(), t11) && getResetSnapValue$animation_core_release() == -1.0f) {
                return;
            }
            setTargetValue(t11);
            setAnimationSpec(finiteAnimationSpec);
            updateAnimation(getResetSnapValue$animation_core_release() == -3.0f ? t11 : getValue(), !isFinished$animation_core_release());
            setFinished$animation_core_release(getResetSnapValue$animation_core_release() == -3.0f);
            if (getResetSnapValue$animation_core_release() >= 0.0f) {
                setValue$animation_core_release(getAnimation().getValueFromNanos((long) (getAnimation().getDurationNanos() * getResetSnapValue$animation_core_release())));
            } else if (getResetSnapValue$animation_core_release() == -3.0f) {
                setValue$animation_core_release(t11);
            }
            this.useOnlyInitialValue = false;
            setResetSnapValue$animation_core_release(-1.0f);
        }
    }

    public Transition(@k TransitionState<S> transitionState, @l Transition<?> transition, @l String str) {
        this.transitionState = transitionState;
        this.parentTransition = transition;
        this.label = str;
        this.targetState$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(getCurrentState(), null, 2, null);
        this.segment$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new SegmentImpl(getCurrentState(), getCurrentState()), null, 2, null);
        this._playTimeNanos$delegate = SnapshotLongStateKt.mutableLongStateOf(0L);
        this.startTimeNanos$delegate = SnapshotLongStateKt.mutableLongStateOf(Long.MIN_VALUE);
        Boolean bool = Boolean.FALSE;
        this.updateChildrenNeeded$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this._animations = SnapshotStateKt.mutableStateListOf();
        this._transitions = SnapshotStateKt.mutableStateListOf();
        this.isSeeking$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.totalDurationNanos$delegate = SnapshotStateKt.derivedStateOf(new x00.a<Long>(this) { // from class: androidx.compose.animation.core.Transition$totalDurationNanos$2
            final /* synthetic */ Transition<S> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            public final Long invoke() {
                long calculateTotalDurationNanos;
                calculateTotalDurationNanos = this.this$0.calculateTotalDurationNanos();
                return Long.valueOf(calculateTotalDurationNanos);
            }
        });
        transitionState.transitionConfigured$animation_core_release(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long calculateTotalDurationNanos() {
        SnapshotStateList<Transition<S>.TransitionAnimationState<?, ?>> snapshotStateList = this._animations;
        int size = snapshotStateList.size();
        long j11 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            j11 = Math.max(j11, snapshotStateList.get(i11).getDurationNanos$animation_core_release());
        }
        SnapshotStateList<Transition<?>> snapshotStateList2 = this._transitions;
        int size2 = snapshotStateList2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            j11 = Math.max(j11, snapshotStateList2.get(i12).calculateTotalDurationNanos());
        }
        return j11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean getUpdateChildrenNeeded() {
        return ((Boolean) this.updateChildrenNeeded$delegate.getValue()).booleanValue();
    }

    private final long get_playTimeNanos() {
        return this._playTimeNanos$delegate.getLongValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onChildAnimationUpdated() {
        setUpdateChildrenNeeded(true);
        if (isSeeking()) {
            SnapshotStateList<Transition<S>.TransitionAnimationState<?, ?>> snapshotStateList = this._animations;
            int size = snapshotStateList.size();
            long j11 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                Transition<S>.TransitionAnimationState<?, ?> transitionAnimationState = snapshotStateList.get(i11);
                j11 = Math.max(j11, transitionAnimationState.getDurationNanos$animation_core_release());
                transitionAnimationState.seekTo$animation_core_release(this.lastSeekedTimeNanos);
            }
            setUpdateChildrenNeeded(false);
        }
    }

    private final void setSegment(Segment<S> segment) {
        this.segment$delegate.setValue(segment);
    }

    private final void setUpdateChildrenNeeded(boolean z11) {
        this.updateChildrenNeeded$delegate.setValue(Boolean.valueOf(z11));
    }

    private final void set_playTimeNanos(long j11) {
        this._playTimeNanos$delegate.setLongValue(j11);
    }

    public final boolean addAnimation$animation_core_release(@k Transition<S>.TransitionAnimationState<?, ?> transitionAnimationState) {
        return this._animations.add(transitionAnimationState);
    }

    public final boolean addTransition$animation_core_release(@k Transition<?> transition) {
        return this._transitions.add(transition);
    }

    @Composable
    public final void animateTo$animation_core_release(final S s11, @l Composer composer, final int i11) {
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(-1493585151);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? startRestartGroup.changed(s11) : startRestartGroup.changedInstance(s11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changed(this) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i12 & 19) != 18, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1493585151, i12, -1, "androidx.compose.animation.core.Transition.animateTo (Transition.kt:1172)");
            }
            if (isSeeking()) {
                startRestartGroup.startReplaceGroup(1824116347);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(1822632563);
                updateTarget$animation_core_release(s11);
                if (!g0.g(s11, getCurrentState()) || isRunning() || getUpdateChildrenNeeded()) {
                    startRestartGroup.startReplaceGroup(1822863854);
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    Composer.Companion companion = Composer.Companion;
                    if (rememberedValue == companion.getEmpty()) {
                        rememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    final r0 r0Var = (r0) rememberedValue;
                    int i13 = i12 & 112;
                    boolean changedInstance = startRestartGroup.changedInstance(r0Var) | (i13 == 32);
                    Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (changedInstance || rememberedValue2 == companion.getEmpty()) {
                        rememberedValue2 = new x00.l<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.animation.core.Transition$animateTo$1$1

                            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
                            @l00.d(c = "androidx.compose.animation.core.Transition$animateTo$1$1$1", f = "Transition.kt", i = {0, 0}, l = {1188}, m = "invokeSuspend", n = {"$this$launch", "durationScale"}, s = {"L$0", "F$0"})
                            /* renamed from: androidx.compose.animation.core.Transition$animateTo$1$1$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {
                                float F$0;
                                private /* synthetic */ Object L$0;
                                int label;
                                final /* synthetic */ Transition<S> this$0;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public AnonymousClass1(Transition<S> transition, j00.c<? super AnonymousClass1> cVar) {
                                    super(2, cVar);
                                    this.this$0 = transition;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, cVar);
                                    anonymousClass1.L$0 = obj;
                                    return anonymousClass1;
                                }

                                @Override // x00.p
                                public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
                                    return ((AnonymousClass1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    final float durationScale;
                                    r0 r0Var;
                                    Object l11 = kotlin.coroutines.intrinsics.b.l();
                                    int i11 = this.label;
                                    if (i11 == 0) {
                                        kotlin.e.n(obj);
                                        r0 r0Var2 = (r0) this.L$0;
                                        durationScale = SuspendAnimationKt.getDurationScale(r0Var2.getCoroutineContext());
                                        r0Var = r0Var2;
                                    } else {
                                        if (i11 != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        durationScale = this.F$0;
                                        r0Var = (r0) this.L$0;
                                        kotlin.e.n(obj);
                                    }
                                    while (s0.k(r0Var)) {
                                        final Transition<S> transition = this.this$0;
                                        x00.l<Long, g2> lVar = new x00.l<Long, g2>() { // from class: androidx.compose.animation.core.Transition.animateTo.1.1.1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // x00.l
                                            public /* bridge */ /* synthetic */ g2 invoke(Long l12) {
                                                invoke(l12.longValue());
                                                return g2.f100423a;
                                            }

                                            public final void invoke(long j11) {
                                                if (transition.isSeeking()) {
                                                    return;
                                                }
                                                transition.onFrame$animation_core_release(j11, durationScale);
                                            }
                                        };
                                        this.L$0 = r0Var;
                                        this.F$0 = durationScale;
                                        this.label = 1;
                                        if (MonotonicFrameClockKt.withFrameNanos(lVar, this) == l11) {
                                            return l11;
                                        }
                                    }
                                    return g2.f100423a;
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // x00.l
                            public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                                c40.k.f(r0.this, null, CoroutineStart.UNDISPATCHED, new AnonymousClass1(this, null), 1, null);
                                return new DisposableEffectResult() { // from class: androidx.compose.animation.core.Transition$animateTo$1$1$invoke$$inlined$onDispose$1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public void dispose() {
                                    }
                                };
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    EffectsKt.DisposableEffect(r0Var, this, (x00.l) rememberedValue2, startRestartGroup, i13);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(1824106427);
                    startRestartGroup.endReplaceGroup();
                }
                startRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>(this) { // from class: androidx.compose.animation.core.Transition$animateTo$2
                final /* synthetic */ Transition<S> $tmp1_rcvr;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                    this.$tmp1_rcvr = this;
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ g2 invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return g2.f100423a;
                }

                public final void invoke(Composer composer2, int i14) {
                    this.$tmp1_rcvr.animateTo$animation_core_release(s11, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                }
            });
        }
    }

    public final void clearInitialAnimations$animation_core_release() {
        SnapshotStateList<Transition<S>.TransitionAnimationState<?, ?>> snapshotStateList = this._animations;
        int size = snapshotStateList.size();
        for (int i11 = 0; i11 < size; i11++) {
            snapshotStateList.get(i11).clearInitialAnimation$animation_core_release();
        }
        SnapshotStateList<Transition<?>> snapshotStateList2 = this._transitions;
        int size2 = snapshotStateList2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            snapshotStateList2.get(i12).clearInitialAnimations$animation_core_release();
        }
    }

    @k
    public final List<Transition<S>.TransitionAnimationState<?, ?>> getAnimations() {
        return this._animations;
    }

    public final S getCurrentState() {
        return this.transitionState.getCurrentState();
    }

    @InternalAnimationApi
    public final boolean getHasInitialValueAnimations() {
        SnapshotStateList<Transition<S>.TransitionAnimationState<?, ?>> snapshotStateList = this._animations;
        int size = snapshotStateList.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (snapshotStateList.get(i11).getInitialValueState$animation_core_release() != null) {
                return true;
            }
        }
        SnapshotStateList<Transition<?>> snapshotStateList2 = this._transitions;
        int size2 = snapshotStateList2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            if (snapshotStateList2.get(i12).getHasInitialValueAnimations()) {
                return true;
            }
        }
        return false;
    }

    @l
    public final String getLabel() {
        return this.label;
    }

    public final long getLastSeekedTimeNanos$animation_core_release() {
        return this.lastSeekedTimeNanos;
    }

    @l
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final Transition<?> getParentTransition() {
        return this.parentTransition;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final long getPlayTimeNanos() {
        Transition<?> transition = this.parentTransition;
        return transition != null ? transition.getPlayTimeNanos() : get_playTimeNanos();
    }

    @k
    public final Segment<S> getSegment() {
        return (Segment) this.segment$delegate.getValue();
    }

    public final long getStartTimeNanos$animation_core_release() {
        return this.startTimeNanos$delegate.getLongValue();
    }

    public final S getTargetState() {
        return (S) this.targetState$delegate.getValue();
    }

    public final long getTotalDurationNanos() {
        return ((Number) this.totalDurationNanos$delegate.getValue()).longValue();
    }

    @k
    public final List<Transition<?>> getTransitions() {
        return this._transitions;
    }

    public final boolean isRunning() {
        return getStartTimeNanos$animation_core_release() != Long.MIN_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final boolean isSeeking() {
        return ((Boolean) this.isSeeking$delegate.getValue()).booleanValue();
    }

    public final void onDisposed$animation_core_release() {
        onTransitionEnd$animation_core_release();
        this.transitionState.transitionRemoved$animation_core_release();
    }

    public final void onFrame$animation_core_release(long j11, float f11) {
        if (getStartTimeNanos$animation_core_release() == Long.MIN_VALUE) {
            onTransitionStart$animation_core_release(j11);
        }
        long startTimeNanos$animation_core_release = j11 - getStartTimeNanos$animation_core_release();
        if (f11 != 0.0f) {
            startTimeNanos$animation_core_release = c10.d.M0(startTimeNanos$animation_core_release / f11);
        }
        setPlayTimeNanos(startTimeNanos$animation_core_release);
        onFrame$animation_core_release(startTimeNanos$animation_core_release, f11 == 0.0f);
    }

    public final void onTransitionEnd$animation_core_release() {
        setStartTimeNanos$animation_core_release(Long.MIN_VALUE);
        TransitionState<S> transitionState = this.transitionState;
        if (transitionState instanceof MutableTransitionState) {
            transitionState.setCurrentState$animation_core_release(getTargetState());
        }
        setPlayTimeNanos(0L);
        this.transitionState.setRunning$animation_core_release(false);
        SnapshotStateList<Transition<?>> snapshotStateList = this._transitions;
        int size = snapshotStateList.size();
        for (int i11 = 0; i11 < size; i11++) {
            snapshotStateList.get(i11).onTransitionEnd$animation_core_release();
        }
    }

    public final void onTransitionStart$animation_core_release(long j11) {
        setStartTimeNanos$animation_core_release(j11);
        this.transitionState.setRunning$animation_core_release(true);
    }

    public final void removeAnimation$animation_core_release(@k Transition<S>.TransitionAnimationState<?, ?> transitionAnimationState) {
        this._animations.remove(transitionAnimationState);
    }

    public final boolean removeTransition$animation_core_release(@k Transition<?> transition) {
        return this._transitions.remove(transition);
    }

    public final void resetAnimationFraction$animation_core_release(float f11) {
        SnapshotStateList<Transition<S>.TransitionAnimationState<?, ?>> snapshotStateList = this._animations;
        int size = snapshotStateList.size();
        for (int i11 = 0; i11 < size; i11++) {
            snapshotStateList.get(i11).resetAnimationValue$animation_core_release(f11);
        }
        SnapshotStateList<Transition<?>> snapshotStateList2 = this._transitions;
        int size2 = snapshotStateList2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            snapshotStateList2.get(i12).resetAnimationFraction$animation_core_release(f11);
        }
    }

    @j(name = "seek")
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final void seek(S s11, S s12, long j11) {
        setStartTimeNanos$animation_core_release(Long.MIN_VALUE);
        this.transitionState.setRunning$animation_core_release(false);
        if (!isSeeking() || !g0.g(getCurrentState(), s11) || !g0.g(getTargetState(), s12)) {
            if (!g0.g(getCurrentState(), s11)) {
                TransitionState<S> transitionState = this.transitionState;
                if (transitionState instanceof MutableTransitionState) {
                    transitionState.setCurrentState$animation_core_release(s11);
                }
            }
            setTargetState$animation_core_release(s12);
            setSeeking$animation_core_release(true);
            setSegment(new SegmentImpl(s11, s12));
        }
        SnapshotStateList<Transition<?>> snapshotStateList = this._transitions;
        int size = snapshotStateList.size();
        for (int i11 = 0; i11 < size; i11++) {
            Transition<?> transition = snapshotStateList.get(i11);
            g0.n(transition, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>");
            if (transition.isSeeking()) {
                transition.seek(transition.getCurrentState(), transition.getTargetState(), j11);
            }
        }
        SnapshotStateList<Transition<S>.TransitionAnimationState<?, ?>> snapshotStateList2 = this._animations;
        int size2 = snapshotStateList2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            snapshotStateList2.get(i12).seekTo$animation_core_release(j11);
        }
        this.lastSeekedTimeNanos = j11;
    }

    public final void seekAnimations$animation_core_release(long j11) {
        if (getStartTimeNanos$animation_core_release() == Long.MIN_VALUE) {
            setStartTimeNanos$animation_core_release(j11);
        }
        setPlayTimeNanos(j11);
        setUpdateChildrenNeeded(false);
        SnapshotStateList<Transition<S>.TransitionAnimationState<?, ?>> snapshotStateList = this._animations;
        int size = snapshotStateList.size();
        for (int i11 = 0; i11 < size; i11++) {
            snapshotStateList.get(i11).seekTo$animation_core_release(j11);
        }
        SnapshotStateList<Transition<?>> snapshotStateList2 = this._transitions;
        int size2 = snapshotStateList2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            Transition<?> transition = snapshotStateList2.get(i12);
            if (!g0.g(transition.getTargetState(), transition.getCurrentState())) {
                transition.seekAnimations$animation_core_release(j11);
            }
        }
    }

    public final void setInitialAnimations$animation_core_release(@k SeekableTransitionState.SeekingAnimationState seekingAnimationState) {
        SnapshotStateList<Transition<S>.TransitionAnimationState<?, ?>> snapshotStateList = this._animations;
        int size = snapshotStateList.size();
        for (int i11 = 0; i11 < size; i11++) {
            snapshotStateList.get(i11).setInitialValueAnimation$animation_core_release(seekingAnimationState);
        }
        SnapshotStateList<Transition<?>> snapshotStateList2 = this._transitions;
        int size2 = snapshotStateList2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            snapshotStateList2.get(i12).setInitialAnimations$animation_core_release(seekingAnimationState);
        }
    }

    public final void setLastSeekedTimeNanos$animation_core_release(long j11) {
        this.lastSeekedTimeNanos = j11;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void setPlayTimeNanos(long j11) {
        if (this.parentTransition == null) {
            set_playTimeNanos(j11);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void setSeeking$animation_core_release(boolean z11) {
        this.isSeeking$delegate.setValue(Boolean.valueOf(z11));
    }

    public final void setStartTimeNanos$animation_core_release(long j11) {
        this.startTimeNanos$delegate.setLongValue(j11);
    }

    public final void setTargetState$animation_core_release(S s11) {
        this.targetState$delegate.setValue(s11);
    }

    @k
    public String toString() {
        List<Transition<S>.TransitionAnimationState<?, ?>> animations = getAnimations();
        int size = animations.size();
        String str = "Transition animation values: ";
        for (int i11 = 0; i11 < size; i11++) {
            str = str + animations.get(i11) + j2.O;
        }
        return str;
    }

    public final void updateInitialValues$animation_core_release() {
        SnapshotStateList<Transition<S>.TransitionAnimationState<?, ?>> snapshotStateList = this._animations;
        int size = snapshotStateList.size();
        for (int i11 = 0; i11 < size; i11++) {
            snapshotStateList.get(i11).updateInitialValue$animation_core_release();
        }
        SnapshotStateList<Transition<?>> snapshotStateList2 = this._transitions;
        int size2 = snapshotStateList2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            snapshotStateList2.get(i12).updateInitialValues$animation_core_release();
        }
    }

    public final void updateTarget$animation_core_release(S s11) {
        if (g0.g(getTargetState(), s11)) {
            return;
        }
        setSegment(new SegmentImpl(getTargetState(), s11));
        if (!g0.g(getCurrentState(), getTargetState())) {
            this.transitionState.setCurrentState$animation_core_release(getTargetState());
        }
        setTargetState$animation_core_release(s11);
        if (!isRunning()) {
            setUpdateChildrenNeeded(true);
        }
        SnapshotStateList<Transition<S>.TransitionAnimationState<?, ?>> snapshotStateList = this._animations;
        int size = snapshotStateList.size();
        for (int i11 = 0; i11 < size; i11++) {
            snapshotStateList.get(i11).resetAnimation$animation_core_release();
        }
    }

    public final void removeAnimation$animation_core_release(@k Transition<S>.DeferredAnimation<?, ?> deferredAnimation) {
        Transition<S>.TransitionAnimationState<?, ?> animation;
        Transition<S>.DeferredAnimationData<?, V>.DeferredAnimationData<?, ?> data$animation_core_release = deferredAnimation.getData$animation_core_release();
        if (data$animation_core_release == null || (animation = data$animation_core_release.getAnimation()) == null) {
            return;
        }
        removeAnimation$animation_core_release(animation);
    }

    public final void onFrame$animation_core_release(long j11, boolean z11) {
        boolean z12 = true;
        if (getStartTimeNanos$animation_core_release() == Long.MIN_VALUE) {
            onTransitionStart$animation_core_release(j11);
        } else if (!this.transitionState.isRunning$animation_core_release()) {
            this.transitionState.setRunning$animation_core_release(true);
        }
        setUpdateChildrenNeeded(false);
        SnapshotStateList<Transition<S>.TransitionAnimationState<?, ?>> snapshotStateList = this._animations;
        int size = snapshotStateList.size();
        for (int i11 = 0; i11 < size; i11++) {
            Transition<S>.TransitionAnimationState<?, ?> transitionAnimationState = snapshotStateList.get(i11);
            if (!transitionAnimationState.isFinished$animation_core_release()) {
                transitionAnimationState.onPlayTimeChanged$animation_core_release(j11, z11);
            }
            if (!transitionAnimationState.isFinished$animation_core_release()) {
                z12 = false;
            }
        }
        SnapshotStateList<Transition<?>> snapshotStateList2 = this._transitions;
        int size2 = snapshotStateList2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            Transition<?> transition = snapshotStateList2.get(i12);
            if (!g0.g(transition.getTargetState(), transition.getCurrentState())) {
                transition.onFrame$animation_core_release(j11, z11);
            }
            if (!g0.g(transition.getTargetState(), transition.getCurrentState())) {
                z12 = false;
            }
        }
        if (z12) {
            onTransitionEnd$animation_core_release();
        }
    }

    public /* synthetic */ Transition(TransitionState transitionState, Transition transition, String str, int i11, v vVar) {
        this(transitionState, transition, (i11 & 4) != 0 ? null : str);
    }

    public /* synthetic */ Transition(TransitionState transitionState, String str, int i11, v vVar) {
        this(transitionState, (i11 & 2) != 0 ? null : str);
    }

    @InternalAnimationApi
    public static /* synthetic */ void getHasInitialValueAnimations$annotations() {
    }

    @v0
    public Transition(@k TransitionState<S> transitionState, @l String str) {
        this(transitionState, null, str);
    }

    public Transition(S s11, @l String str) {
        this(new MutableTransitionState(s11), null, str);
    }

    public /* synthetic */ Transition(MutableTransitionState mutableTransitionState, String str, int i11, v vVar) {
        this(mutableTransitionState, (i11 & 2) != 0 ? null : str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @v0
    public Transition(@k MutableTransitionState<S> mutableTransitionState, @l String str) {
        this(mutableTransitionState, null, str);
        g0.n(mutableTransitionState, "null cannot be cast to non-null type androidx.compose.animation.core.TransitionState<S of androidx.compose.animation.core.Transition>");
    }
}
