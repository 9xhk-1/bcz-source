package androidx.compose.ui.tooling.animation;

import a00.r0;
import a00.w1;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.ComposeAnimationType;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.animation.states.AnimatedVisibilityState;
import java.util.Set;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class AnimatedVisibilityComposeAnimation implements ComposeAnimation {
    public static final int $stable = 8;

    @k
    private final Transition<Boolean> animationObject;

    @l
    private final String label;

    @k
    private final Set<AnimatedVisibilityState> states;

    @k
    private final ComposeAnimationType type = ComposeAnimationType.ANIMATED_VISIBILITY;

    public AnimatedVisibilityComposeAnimation(@k Transition<Boolean> transition, @l String str) {
        this.animationObject = transition;
        this.label = str;
        AnimatedVisibilityState.Companion companion = AnimatedVisibilityState.Companion;
        this.states = w1.u(AnimatedVisibilityState.m5046boximpl(companion.m5053getEnterjXw82LU()), AnimatedVisibilityState.m5046boximpl(companion.m5054getExitjXw82LU()));
    }

    @l
    public final Transition<Object> getChildTransition() {
        Object b32 = r0.b3(m5039getAnimationObject().getTransitions(), 0);
        if (b32 instanceof Transition) {
            return (Transition) b32;
        }
        return null;
    }

    @l
    public String getLabel() {
        return this.label;
    }

    @k
    public Set<AnimatedVisibilityState> getStates() {
        return this.states;
    }

    @k
    public ComposeAnimationType getType() {
        return this.type;
    }

    @k
    /* renamed from: getAnimationObject, reason: merged with bridge method [inline-methods] */
    public Transition<Boolean> m5039getAnimationObject() {
        return this.animationObject;
    }

    public static /* synthetic */ void getChildTransition$annotations() {
    }
}
