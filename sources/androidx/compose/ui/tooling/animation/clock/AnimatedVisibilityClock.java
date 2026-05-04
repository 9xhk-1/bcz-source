package androidx.compose.ui.tooling.animation.clock;

import a00.h0;
import a00.i0;
import a00.r0;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.tooling.ComposeAnimatedProperty;
import androidx.compose.animation.tooling.TransitionInfo;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.animation.AnimatedVisibilityComposeAnimation;
import androidx.compose.ui.tooling.animation.states.AnimatedVisibilityState;
import e00.g;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nAnimatedVisibilityClock.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedVisibilityClock.android.kt\nandroidx/compose/ui/tooling/animation/clock/AnimatedVisibilityClock\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n1549#2:94\n1620#2,3:95\n1045#2:98\n766#2:99\n857#2,2:100\n1603#2,9:102\n1855#2:111\n1856#2:113\n1612#2:114\n1045#2:115\n766#2:116\n857#2,2:117\n1#3:112\n*S KotlinDebug\n*F\n+ 1 AnimatedVisibilityClock.android.kt\nandroidx/compose/ui/tooling/animation/clock/AnimatedVisibilityClock\n*L\n70#1:94\n70#1:95,3\n71#1:98\n72#1:99\n72#1:100,2\n81#1:102,9\n81#1:111\n81#1:113\n81#1:114\n84#1:115\n85#1:116\n85#1:117,2\n81#1:112\n*E\n"})
/* loaded from: classes2.dex */
public final class AnimatedVisibilityClock implements ComposeAnimationClock<AnimatedVisibilityComposeAnimation, AnimatedVisibilityState> {
    public static final int $stable = 8;

    @k
    private final AnimatedVisibilityComposeAnimation animation;

    @k
    private String state;

    public AnimatedVisibilityClock(@k AnimatedVisibilityComposeAnimation animatedVisibilityComposeAnimation) {
        this.animation = animatedVisibilityComposeAnimation;
        this.state = getAnimation().m5039getAnimationObject().getCurrentState().booleanValue() ? AnimatedVisibilityState.Companion.m5054getExitjXw82LU() : AnimatedVisibilityState.Companion.m5053getEnterjXw82LU();
    }

    /* renamed from: toCurrentTargetPair-7IW2chM, reason: not valid java name */
    private final Pair<Boolean, Boolean> m5043toCurrentTargetPair7IW2chM(String str) {
        Boolean bool;
        Boolean bool2;
        if (AnimatedVisibilityState.m5049equalsimpl0(str, AnimatedVisibilityState.Companion.m5053getEnterjXw82LU())) {
            bool = Boolean.FALSE;
            bool2 = Boolean.TRUE;
        } else {
            bool = Boolean.TRUE;
            bool2 = Boolean.FALSE;
        }
        return h1.a(bool, bool2);
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    @k
    public List<ComposeAnimatedProperty> getAnimatedProperties() {
        Transition<Object> childTransition = getAnimation().getChildTransition();
        if (childTransition == null) {
            return h0.J();
        }
        List<Transition<?>.TransitionAnimationState<?, ?>> allAnimations = Utils_androidKt.allAnimations(childTransition);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = allAnimations.iterator();
        while (it.hasNext()) {
            Transition.TransitionAnimationState transitionAnimationState = (Transition.TransitionAnimationState) it.next();
            String label = transitionAnimationState.getLabel();
            Object value = transitionAnimationState.getValue();
            ComposeAnimatedProperty composeAnimatedProperty = value == null ? null : new ComposeAnimatedProperty(label, value);
            if (composeAnimatedProperty != null) {
                arrayList.add(composeAnimatedProperty);
            }
        }
        List z52 = r0.z5(arrayList, new Comparator() { // from class: androidx.compose.ui.tooling.animation.clock.AnimatedVisibilityClock$getAnimatedProperties$lambda$8$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(T t11, T t12) {
                return g.l(((ComposeAnimatedProperty) t11).getLabel(), ((ComposeAnimatedProperty) t12).getLabel());
            }
        });
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : z52) {
            if (!Utils_androidKt.getIGNORE_TRANSITIONS().contains(((ComposeAnimatedProperty) obj).getLabel())) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public long getMaxDuration() {
        Transition<Object> childTransition = getAnimation().getChildTransition();
        if (childTransition != null) {
            return Utils_androidKt.nanosToMillis(childTransition.getTotalDurationNanos());
        }
        return 0L;
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public long getMaxDurationPerIteration() {
        Transition<Object> childTransition = getAnimation().getChildTransition();
        if (childTransition != null) {
            return Utils_androidKt.nanosToMillis(childTransition.getTotalDurationNanos());
        }
        return 0L;
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public /* bridge */ /* synthetic */ AnimatedVisibilityState getState() {
        return AnimatedVisibilityState.m5046boximpl(m5044getStatejXw82LU());
    }

    @k
    /* renamed from: getState-jXw82LU, reason: not valid java name */
    public String m5044getStatejXw82LU() {
        return this.state;
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    @k
    public List<TransitionInfo> getTransitions(long j11) {
        Transition<Object> childTransition = getAnimation().getChildTransition();
        if (childTransition == null) {
            return h0.J();
        }
        List<Transition<?>.TransitionAnimationState<?, ?>> allAnimations = Utils_androidKt.allAnimations(childTransition);
        ArrayList arrayList = new ArrayList(i0.d0(allAnimations, 10));
        Iterator<T> it = allAnimations.iterator();
        while (it.hasNext()) {
            arrayList.add(Utils_androidKt.createTransitionInfo((Transition.TransitionAnimationState) it.next(), j11));
        }
        List z52 = r0.z5(arrayList, new Comparator() { // from class: androidx.compose.ui.tooling.animation.clock.AnimatedVisibilityClock$getTransitions$lambda$4$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(T t11, T t12) {
                return g.l(((TransitionInfo) t11).getLabel(), ((TransitionInfo) t12).getLabel());
            }
        });
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : z52) {
            if (!Utils_androidKt.getIGNORE_TRANSITIONS().contains(((TransitionInfo) obj).getLabel())) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public void setClockTime(long j11) {
        Transition<Boolean> m5039getAnimationObject = getAnimation().m5039getAnimationObject();
        Pair<Boolean, Boolean> m5043toCurrentTargetPair7IW2chM = m5043toCurrentTargetPair7IW2chM(m5044getStatejXw82LU());
        Boolean component1 = m5043toCurrentTargetPair7IW2chM.component1();
        component1.booleanValue();
        Boolean component2 = m5043toCurrentTargetPair7IW2chM.component2();
        component2.booleanValue();
        m5039getAnimationObject.seek(component1, component2, j11);
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public /* bridge */ /* synthetic */ void setState(AnimatedVisibilityState animatedVisibilityState) {
        m5045setState7IW2chM(animatedVisibilityState.m5052unboximpl());
    }

    /* renamed from: setState-7IW2chM, reason: not valid java name */
    public void m5045setState7IW2chM(@k String str) {
        this.state = str;
        setClockTime(0L);
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public void setStateParameters(@k Object obj, @l Object obj2) {
        g0.n(obj, "null cannot be cast to non-null type androidx.compose.ui.tooling.animation.states.AnimatedVisibilityState");
        m5045setState7IW2chM(((AnimatedVisibilityState) obj).m5052unboximpl());
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    @k
    public AnimatedVisibilityComposeAnimation getAnimation() {
        return this.animation;
    }
}
