package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.ui.Modifier;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class AnimatedContentScopeImpl implements AnimatedContentScope, AnimatedVisibilityScope {
    private final /* synthetic */ AnimatedVisibilityScope $$delegate_0;

    public AnimatedContentScopeImpl(@k AnimatedVisibilityScope animatedVisibilityScope) {
        this.$$delegate_0 = animatedVisibilityScope;
    }

    @Override // androidx.compose.animation.AnimatedVisibilityScope
    @k
    public Modifier animateEnterExit(@k Modifier modifier, @k EnterTransition enterTransition, @k ExitTransition exitTransition, @k String str) {
        return this.$$delegate_0.animateEnterExit(modifier, enterTransition, exitTransition, str);
    }

    @Override // androidx.compose.animation.AnimatedVisibilityScope
    @k
    public Transition<EnterExitState> getTransition() {
        return this.$$delegate_0.getTransition();
    }
}
