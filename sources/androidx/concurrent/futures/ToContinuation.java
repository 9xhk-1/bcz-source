package androidx.concurrent.futures;

import c40.n;
import com.google.common.util.concurrent.p1;
import java.util.concurrent.ExecutionException;
import kotlin.Result;
import kotlin.e;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class ToContinuation<T> implements Runnable {

    @k
    private final n<T> continuation;

    @k
    private final p1<T> futureToObserve;

    /* JADX WARN: Multi-variable type inference failed */
    public ToContinuation(@k p1<T> futureToObserve, @k n<? super T> continuation) {
        g0.q(futureToObserve, "futureToObserve");
        g0.q(continuation, "continuation");
        this.futureToObserve = futureToObserve;
        this.continuation = continuation;
    }

    @k
    public final n<T> getContinuation() {
        return this.continuation;
    }

    @k
    public final p1<T> getFutureToObserve() {
        return this.futureToObserve;
    }

    @Override // java.lang.Runnable
    public void run() {
        Throwable nonNullCause;
        if (this.futureToObserve.isCancelled()) {
            n.a.a(this.continuation, null, 1, null);
            return;
        }
        try {
            n<T> nVar = this.continuation;
            Result.a aVar = Result.Companion;
            nVar.resumeWith(Result.m6308constructorimpl(AbstractResolvableFuture.getUninterruptibly(this.futureToObserve)));
        } catch (ExecutionException e11) {
            n<T> nVar2 = this.continuation;
            nonNullCause = ListenableFutureKt.nonNullCause(e11);
            Result.a aVar2 = Result.Companion;
            nVar2.resumeWith(Result.m6308constructorimpl(e.a(nonNullCause)));
        }
    }
}
