package androidx.compose.animation;

import androidx.compose.runtime.Immutable;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
/* loaded from: classes.dex */
final class ExitTransitionImpl extends ExitTransition {

    @k
    private final TransitionData data;

    public ExitTransitionImpl(@k TransitionData transitionData) {
        super(null);
        this.data = transitionData;
    }

    @Override // androidx.compose.animation.ExitTransition
    @k
    public TransitionData getData$animation() {
        return this.data;
    }
}
