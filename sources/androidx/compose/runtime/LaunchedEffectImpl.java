package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import c40.l2;
import c40.p2;
import c40.r0;
import c40.s0;
import j00.c;
import kotlin.coroutines.d;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class LaunchedEffectImpl implements RememberObserver {
    public static final int $stable = 8;

    @l
    private l2 job;

    @k
    private final r0 scope;

    @k
    private final p<r0, c<? super g2>, Object> task;

    /* JADX WARN: Multi-variable type inference failed */
    public LaunchedEffectImpl(@k d dVar, @k p<? super r0, ? super c<? super g2>, ? extends Object> pVar) {
        this.task = pVar;
        this.scope = s0.a(dVar);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        l2 l2Var = this.job;
        if (l2Var != null) {
            l2Var.cancel(new LeftCompositionCancellationException());
        }
        this.job = null;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        l2 l2Var = this.job;
        if (l2Var != null) {
            l2Var.cancel(new LeftCompositionCancellationException());
        }
        this.job = null;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        l2 f11;
        l2 l2Var = this.job;
        if (l2Var != null) {
            p2.i(l2Var, "Old job was still running!", null, 2, null);
        }
        f11 = c40.k.f(this.scope, null, null, this.task, 3, null);
        this.job = f11;
    }
}
