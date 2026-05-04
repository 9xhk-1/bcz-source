package androidx.lifecycle;

import c40.h1;
import c40.m0;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class PausingDispatcher extends m0 {

    @w00.g
    @k
    public final DispatchQueue dispatchQueue = new DispatchQueue();

    @Override // c40.m0
    public void dispatch(@k kotlin.coroutines.d context, @k Runnable block) {
        g0.p(context, "context");
        g0.p(block, "block");
        this.dispatchQueue.dispatchAndEnqueue(context, block);
    }

    @Override // c40.m0
    public boolean isDispatchNeeded(@k kotlin.coroutines.d context) {
        g0.p(context, "context");
        if (h1.e().q().isDispatchNeeded(context)) {
            return true;
        }
        return !this.dispatchQueue.canRun();
    }
}
