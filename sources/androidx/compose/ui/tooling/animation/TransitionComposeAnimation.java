package androidx.compose.ui.tooling.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.ComposeAnimationType;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Set;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class TransitionComposeAnimation<T> implements ComposeAnimation, TransitionBasedAnimation<T> {
    public static final int $stable = 8;

    @k
    private final Transition<T> animationObject;

    @l
    private final String label;

    @k
    private final Set<Object> states;

    @k
    private final ComposeAnimationType type = ComposeAnimationType.TRANSITION_ANIMATION;

    public TransitionComposeAnimation(@k Transition<T> transition, @k Set<? extends Object> set, @l String str) {
        this.animationObject = transition;
        this.states = set;
        this.label = str;
    }

    @l
    public String getLabel() {
        return this.label;
    }

    @k
    public Set<Object> getStates() {
        return this.states;
    }

    @k
    public ComposeAnimationType getType() {
        return this.type;
    }

    @Override // androidx.compose.ui.tooling.animation.TransitionBasedAnimation
    @k
    /* renamed from: getAnimationObject, reason: merged with bridge method [inline-methods] */
    public Transition<T> m5042getAnimationObject() {
        return this.animationObject;
    }
}
