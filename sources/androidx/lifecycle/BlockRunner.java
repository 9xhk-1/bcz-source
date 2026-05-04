package androidx.lifecycle;

import androidx.annotation.MainThread;
import c40.h1;
import c40.l2;
import c40.r0;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class BlockRunner<T> {

    @k
    private final p<LiveDataScope<T>, j00.c<? super g2>, Object> block;

    @l
    private l2 cancellationJob;

    @k
    private final CoroutineLiveData<T> liveData;

    @k
    private final x00.a<g2> onDone;

    @l
    private l2 runningJob;

    @k
    private final r0 scope;
    private final long timeoutInMs;

    /* JADX WARN: Multi-variable type inference failed */
    public BlockRunner(@k CoroutineLiveData<T> liveData, @k p<? super LiveDataScope<T>, ? super j00.c<? super g2>, ? extends Object> block, long j11, @k r0 scope, @k x00.a<g2> onDone) {
        g0.p(liveData, "liveData");
        g0.p(block, "block");
        g0.p(scope, "scope");
        g0.p(onDone, "onDone");
        this.liveData = liveData;
        this.block = block;
        this.timeoutInMs = j11;
        this.scope = scope;
        this.onDone = onDone;
    }

    @MainThread
    public final void cancel() {
        l2 f11;
        if (this.cancellationJob != null) {
            throw new IllegalStateException("Cancel call cannot happen without a maybeRun");
        }
        f11 = c40.k.f(this.scope, h1.e().q(), null, new BlockRunner$cancel$1(this, null), 2, null);
        this.cancellationJob = f11;
    }

    @MainThread
    public final void maybeRun() {
        l2 f11;
        l2 l2Var = this.cancellationJob;
        if (l2Var != null) {
            l2.a.b(l2Var, null, 1, null);
        }
        this.cancellationJob = null;
        if (this.runningJob != null) {
            return;
        }
        f11 = c40.k.f(this.scope, null, null, new BlockRunner$maybeRun$1(this, null), 3, null);
        this.runningJob = f11;
    }
}
