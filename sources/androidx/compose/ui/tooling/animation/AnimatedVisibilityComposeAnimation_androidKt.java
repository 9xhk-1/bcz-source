package androidx.compose.ui.tooling.animation;

import androidx.compose.animation.core.Transition;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class AnimatedVisibilityComposeAnimation_androidKt {
    @k
    public static final AnimatedVisibilityComposeAnimation parseAnimatedVisibility(@k Transition<Boolean> transition) {
        String label = transition.getLabel();
        if (label == null) {
            label = "AnimatedVisibility";
        }
        return new AnimatedVisibilityComposeAnimation(transition, label);
    }
}
