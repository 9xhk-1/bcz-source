package androidx.compose.ui.tooling.animation.clock;

import a00.i0;
import a00.r0;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec;
import androidx.compose.animation.tooling.ComposeAnimatedProperty;
import androidx.compose.animation.tooling.TransitionInfo;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.animation.InfiniteTransitionComposeAnimation;
import androidx.compose.ui.tooling.animation.states.TargetState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import x00.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nInfiniteTransitionClock.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfiniteTransitionClock.android.kt\nandroidx/compose/ui/tooling/animation/clock/InfiniteTransitionClock\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,88:1\n1603#2,9:89\n1855#2:98\n1856#2:100\n1612#2:101\n766#2:102\n857#2,2:103\n1549#2:106\n1620#2,3:107\n766#2:110\n857#2,2:111\n1#3:99\n1#3:105\n*S KotlinDebug\n*F\n+ 1 InfiniteTransitionClock.android.kt\nandroidx/compose/ui/tooling/animation/clock/InfiniteTransitionClock\n*L\n47#1:89,9\n47#1:98\n47#1:100\n47#1:101\n52#1:102\n52#1:103,2\n70#1:106\n70#1:107,3\n71#1:110\n71#1:111,2\n47#1:99\n*E\n"})
/* loaded from: classes2.dex */
public final class InfiniteTransitionClock implements ComposeAnimationClock<InfiniteTransitionComposeAnimation, TargetState<Object>> {
    public static final int $stable = 8;

    @k
    private final InfiniteTransitionComposeAnimation animation;

    @k
    private final a<Long> maxDuration;

    @k
    private TargetState<Object> state;

    public InfiniteTransitionClock(@k InfiniteTransitionComposeAnimation infiniteTransitionComposeAnimation, @k a<Long> aVar) {
        this.animation = infiniteTransitionComposeAnimation;
        this.maxDuration = aVar;
        this.state = new TargetState<>(0, 0);
    }

    private final <T, V extends AnimationVector> long getIterationDuration(InfiniteTransition.TransitionAnimationState<T, V> transitionAnimationState) {
        AnimationSpec<T> animationSpec = transitionAnimationState.getAnimationSpec();
        g0.n(animationSpec, "null cannot be cast to non-null type androidx.compose.animation.core.InfiniteRepeatableSpec<T of androidx.compose.ui.tooling.animation.clock.InfiniteTransitionClock.getIterationDuration>");
        InfiniteRepeatableSpec infiniteRepeatableSpec = (InfiniteRepeatableSpec) animationSpec;
        int i11 = infiniteRepeatableSpec.getRepeatMode() == RepeatMode.Reverse ? 2 : 1;
        VectorizedDurationBasedAnimationSpec<V> vectorize = infiniteRepeatableSpec.getAnimation().vectorize((TwoWayConverter) transitionAnimationState.getTypeConverter());
        return Utils_androidKt.millisToNanos(vectorize.getDelayMillis() + (vectorize.getDurationMillis() * i11));
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    @k
    public List<ComposeAnimatedProperty> getAnimatedProperties() {
        List<InfiniteTransition.TransitionAnimationState<?, ?>> animations = getAnimation().m5040getAnimationObject().getAnimations();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = animations.iterator();
        while (it.hasNext()) {
            InfiniteTransition.TransitionAnimationState transitionAnimationState = (InfiniteTransition.TransitionAnimationState) it.next();
            Object value = transitionAnimationState.getValue();
            ComposeAnimatedProperty composeAnimatedProperty = value == null ? null : new ComposeAnimatedProperty(transitionAnimationState.getLabel(), value);
            if (composeAnimatedProperty != null) {
                arrayList.add(composeAnimatedProperty);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!Utils_androidKt.getIGNORE_TRANSITIONS().contains(((ComposeAnimatedProperty) obj).getLabel())) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public long getMaxDuration() {
        return Math.max(getMaxDurationPerIteration(), this.maxDuration.invoke().longValue());
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public long getMaxDurationPerIteration() {
        Long l11;
        Iterator<T> it = getAnimation().m5040getAnimationObject().getAnimations().iterator();
        if (it.hasNext()) {
            Long valueOf = Long.valueOf(getIterationDuration((InfiniteTransition.TransitionAnimationState) it.next()));
            while (it.hasNext()) {
                Long valueOf2 = Long.valueOf(getIterationDuration((InfiniteTransition.TransitionAnimationState) it.next()));
                if (valueOf.compareTo(valueOf2) < 0) {
                    valueOf = valueOf2;
                }
            }
            l11 = valueOf;
        } else {
            l11 = null;
        }
        return Utils_androidKt.nanosToMillis(l11 != null ? l11.longValue() : 0L);
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    @k
    public List<TransitionInfo> getTransitions(long j11) {
        List<InfiniteTransition.TransitionAnimationState<?, ?>> animations = getAnimation().m5040getAnimationObject().getAnimations();
        ArrayList arrayList = new ArrayList(i0.d0(animations, 10));
        Iterator<T> it = animations.iterator();
        while (it.hasNext()) {
            arrayList.add(Utils_androidKt.createTransitionInfo((InfiniteTransition.TransitionAnimationState) it.next(), j11, getMaxDuration()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!Utils_androidKt.getIGNORE_TRANSITIONS().contains(((TransitionInfo) obj).getLabel())) {
                arrayList2.add(obj);
            }
        }
        return r0.a6(arrayList2);
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public void setClockTime(long j11) {
        getAnimation().setTimeNanos(j11);
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    @k
    public InfiniteTransitionComposeAnimation getAnimation() {
        return this.animation;
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    @k
    public TargetState<Object> getState() {
        return this.state;
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public void setState(@k TargetState<Object> targetState) {
        this.state = targetState;
    }

    public /* synthetic */ InfiniteTransitionClock(InfiniteTransitionComposeAnimation infiniteTransitionComposeAnimation, a aVar, int i11, v vVar) {
        this(infiniteTransitionComposeAnimation, (i11 & 2) != 0 ? new a<Long>() { // from class: androidx.compose.ui.tooling.animation.clock.InfiniteTransitionClock.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            public final Long invoke() {
                return 0L;
            }
        } : aVar);
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public void setStateParameters(@k Object obj, @l Object obj2) {
    }
}
