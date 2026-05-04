package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import c40.r0;
import c40.s0;
import m80.k;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@v0
/* loaded from: classes.dex */
public final class CompositionScopedCoroutineScopeCanceller implements RememberObserver {
    public static final int $stable = 8;

    @k
    private final r0 coroutineScope;

    public CompositionScopedCoroutineScopeCanceller(@k r0 r0Var) {
        this.coroutineScope = r0Var;
    }

    @k
    public final r0 getCoroutineScope() {
        return this.coroutineScope;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        r0 r0Var = this.coroutineScope;
        if (r0Var instanceof RememberedCoroutineScope) {
            ((RememberedCoroutineScope) r0Var).cancelIfCreated();
        } else {
            s0.d(r0Var, new LeftCompositionCancellationException());
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        r0 r0Var = this.coroutineScope;
        if (r0Var instanceof RememberedCoroutineScope) {
            ((RememberedCoroutineScope) r0Var).cancelIfCreated();
        } else {
            s0.d(r0Var, new LeftCompositionCancellationException());
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
    }
}
