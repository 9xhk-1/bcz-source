package c40;

import c40.z0;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.DeprecationLevel;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class w1 extends v1 implements z0 {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final Executor f8009b;

    public w1(@m80.k Executor executor) {
        this.f8009b = executor;
        h40.d.b(q());
    }

    public final ScheduledFuture<?> E(ScheduledExecutorService scheduledExecutorService, Runnable runnable, kotlin.coroutines.d dVar, long j11) {
        try {
            return scheduledExecutorService.schedule(runnable, j11, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e11) {
            w(dVar, e11);
            return null;
        }
    }

    @Override // c40.v1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor q11 = q();
        ExecutorService executorService = q11 instanceof ExecutorService ? (ExecutorService) q11 : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // c40.m0
    public void dispatch(@m80.k kotlin.coroutines.d dVar, @m80.k Runnable runnable) {
        Runnable runnable2;
        try {
            Executor q11 = q();
            b bVar = c.f7825a;
            if (bVar != null) {
                runnable2 = bVar.i(runnable);
                if (runnable2 == null) {
                }
                q11.execute(runnable2);
            }
            runnable2 = runnable;
            q11.execute(runnable2);
        } catch (RejectedExecutionException e11) {
            b bVar2 = c.f7825a;
            if (bVar2 != null) {
                bVar2.f();
            }
            w(dVar, e11);
            h1.c().dispatch(dVar, runnable);
        }
    }

    public boolean equals(@m80.l Object obj) {
        return (obj instanceof w1) && ((w1) obj).q() == q();
    }

    @Override // c40.z0
    @m80.k
    public k1 f(long j11, @m80.k Runnable runnable, @m80.k kotlin.coroutines.d dVar) {
        long j12;
        Runnable runnable2;
        kotlin.coroutines.d dVar2;
        Executor q11 = q();
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = q11 instanceof ScheduledExecutorService ? (ScheduledExecutorService) q11 : null;
        if (scheduledExecutorService != null) {
            j12 = j11;
            runnable2 = runnable;
            dVar2 = dVar;
            scheduledFuture = E(scheduledExecutorService, runnable2, dVar2, j12);
        } else {
            j12 = j11;
            runnable2 = runnable;
            dVar2 = dVar;
        }
        return scheduledFuture != null ? new j1(scheduledFuture) : v0.f7992g.f(j12, runnable2, dVar2);
    }

    public int hashCode() {
        return System.identityHashCode(q());
    }

    @Override // c40.z0
    public void j(long j11, @m80.k n<? super yz.g2> nVar) {
        long j12;
        Executor q11 = q();
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = q11 instanceof ScheduledExecutorService ? (ScheduledExecutorService) q11 : null;
        if (scheduledExecutorService != null) {
            j12 = j11;
            scheduledFuture = E(scheduledExecutorService, new f3(this, nVar), nVar.getContext(), j12);
        } else {
            j12 = j11;
        }
        if (scheduledFuture != null) {
            r.c(nVar, new l(scheduledFuture));
        } else {
            v0.f7992g.j(j12, nVar);
        }
    }

    @Override // c40.z0
    @m80.l
    @yz.n(level = DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    public Object k(long j11, @m80.k j00.c<? super yz.g2> cVar) {
        return z0.a.a(this, j11, cVar);
    }

    @Override // c40.v1
    @m80.k
    public Executor q() {
        return this.f8009b;
    }

    @Override // c40.m0
    @m80.k
    public String toString() {
        return q().toString();
    }

    public final void w(kotlin.coroutines.d dVar, RejectedExecutionException rejectedExecutionException) {
        n2.g(dVar, t1.a("The task was rejected", rejectedExecutionException));
    }
}
