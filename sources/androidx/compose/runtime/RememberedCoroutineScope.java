package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import c40.a0;
import c40.l2;
import c40.n2;
import c40.r0;
import kotlin.coroutines.d;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import w00.g;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/RememberedCoroutineScope\n+ 2 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n*L\n1#1,561:1\n27#2:562\n33#2,2:563\n33#2,2:565\n*S KotlinDebug\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/RememberedCoroutineScope\n*L\n431#1:562\n451#1:563,2\n478#1:565,2\n*E\n"})
/* loaded from: classes.dex */
public final class RememberedCoroutineScope implements r0, RememberObserver {

    @l
    private volatile d _coroutineContext;

    @k
    private final Object lock = this;

    @k
    private final d overlayContext;

    @k
    private final d parentContext;

    @k
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @g
    @k
    public static final d CancelledCoroutineContext = new CancelledCoroutineContext();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        private Companion() {
        }
    }

    public RememberedCoroutineScope(@k d dVar, @k d dVar2) {
        this.parentContext = dVar;
        this.overlayContext = dVar2;
    }

    public final void cancelIfCreated() {
        synchronized (this.lock) {
            try {
                d dVar = this._coroutineContext;
                if (dVar == null) {
                    this._coroutineContext = CancelledCoroutineContext;
                } else {
                    n2.g(dVar, new ForgottenCoroutineScopeException());
                }
                g2 g2Var = g2.f100423a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // c40.r0
    @k
    public d getCoroutineContext() {
        d dVar;
        d dVar2 = this._coroutineContext;
        if (dVar2 == null || dVar2 == CancelledCoroutineContext) {
            synchronized (this.lock) {
                try {
                    dVar = this._coroutineContext;
                    if (dVar == null) {
                        d dVar3 = this.parentContext;
                        dVar = dVar3.plus(n2.a((l2) dVar3.get(l2.f7886e0))).plus(this.overlayContext);
                    } else if (dVar == CancelledCoroutineContext) {
                        d dVar4 = this.parentContext;
                        a0 a11 = n2.a((l2) dVar4.get(l2.f7886e0));
                        a11.cancel(new ForgottenCoroutineScopeException());
                        dVar = dVar4.plus(a11).plus(this.overlayContext);
                    }
                    this._coroutineContext = dVar;
                    g2 g2Var = g2.f100423a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            dVar2 = dVar;
        }
        g0.m(dVar2);
        return dVar2;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        cancelIfCreated();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        cancelIfCreated();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
    }
}
