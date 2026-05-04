package androidx.compose.ui.tooling.animation.clock;

import a00.i0;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.tooling.ComposeAnimatedProperty;
import androidx.compose.animation.tooling.TransitionInfo;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.animation.TransitionBasedAnimation;
import androidx.compose.ui.tooling.animation.states.TargetState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nTransitionClock.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransitionClock.android.kt\nandroidx/compose/ui/tooling/animation/clock/TransitionClock\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,90:1\n1#2:91\n1#2:102\n1603#3,9:92\n1855#3:101\n1856#3:103\n1612#3:104\n766#3:105\n857#3,2:106\n1549#3:108\n1620#3,3:109\n766#3:112\n857#3,2:113\n*S KotlinDebug\n*F\n+ 1 TransitionClock.android.kt\nandroidx/compose/ui/tooling/animation/clock/TransitionClock\n*L\n58#1:102\n58#1:92,9\n58#1:101\n58#1:103\n58#1:104\n63#1:105\n63#1:106,2\n78#1:108\n78#1:109,3\n79#1:112\n79#1:113,2\n*E\n"})
/* loaded from: classes2.dex */
public final class TransitionClock<T> implements ComposeAnimationClock<TransitionBasedAnimation<T>, TargetState<T>> {
    public static final int $stable = 8;

    @k
    private final TransitionBasedAnimation<T> animation;

    @k
    private TargetState<T> state = new TargetState<>(getAnimation().m5038getAnimationObject().getCurrentState(), getAnimation().m5038getAnimationObject().getTargetState());

    public TransitionClock(@k TransitionBasedAnimation<T> transitionBasedAnimation) {
        this.animation = transitionBasedAnimation;
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    @k
    public List<ComposeAnimatedProperty> getAnimatedProperties() {
        List<Transition<?>.TransitionAnimationState<?, ?>> allAnimations = Utils_androidKt.allAnimations(getAnimation().m5038getAnimationObject());
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = allAnimations.iterator();
        while (it.hasNext()) {
            Transition.TransitionAnimationState transitionAnimationState = (Transition.TransitionAnimationState) it.next();
            Object value = transitionAnimationState.getValue();
            ComposeAnimatedProperty composeAnimatedProperty = value == null ? null : new ComposeAnimatedProperty(transitionAnimationState.getLabel(), value);
            if (composeAnimatedProperty != null) {
                arrayList.add(composeAnimatedProperty);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (T t11 : arrayList) {
            if (!Utils_androidKt.getIGNORE_TRANSITIONS().contains(((ComposeAnimatedProperty) t11).getLabel())) {
                arrayList2.add(t11);
            }
        }
        return arrayList2;
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public long getMaxDuration() {
        return Utils_androidKt.nanosToMillis(getAnimation().m5038getAnimationObject().getTotalDurationNanos());
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public long getMaxDurationPerIteration() {
        return Utils_androidKt.nanosToMillis(getAnimation().m5038getAnimationObject().getTotalDurationNanos());
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    @k
    public List<TransitionInfo> getTransitions(long j11) {
        List<Transition<?>.TransitionAnimationState<?, ?>> allAnimations = Utils_androidKt.allAnimations(getAnimation().m5038getAnimationObject());
        ArrayList arrayList = new ArrayList(i0.d0(allAnimations, 10));
        Iterator<T> it = allAnimations.iterator();
        while (it.hasNext()) {
            arrayList.add(Utils_androidKt.createTransitionInfo((Transition.TransitionAnimationState) it.next(), j11));
        }
        ArrayList arrayList2 = new ArrayList();
        for (T t11 : arrayList) {
            if (!Utils_androidKt.getIGNORE_TRANSITIONS().contains(((TransitionInfo) t11).getLabel())) {
                arrayList2.add(t11);
            }
        }
        return arrayList2;
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public void setClockTime(long j11) {
        getAnimation().m5038getAnimationObject().seek(getState().getInitial(), getState().getTarget(), j11);
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public void setStateParameters(@k Object obj, @l Object obj2) {
        TargetState<T> parseParametersToValue = Utils_androidKt.parseParametersToValue(getState().getInitial(), obj, obj2);
        if (parseParametersToValue != null) {
            setState((TargetState) parseParametersToValue);
        }
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    @k
    public TransitionBasedAnimation<T> getAnimation() {
        return this.animation;
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    @k
    public TargetState<T> getState() {
        return this.state;
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public void setState(@k TargetState<T> targetState) {
        this.state = targetState;
        setClockTime(0L);
    }
}
