package d70;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.apache.http.concurrent.Cancellable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class k<T> implements Future<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Future<T> f47391a;

    /* renamed from: b, reason: collision with root package name */
    public final Cancellable f47392b;

    public k(Future<T> future, Cancellable cancellable) {
        this.f47391a = future;
        this.f47392b = cancellable;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z11) {
        try {
            Cancellable cancellable = this.f47392b;
            if (cancellable != null) {
                cancellable.cancel();
            }
        } catch (Throwable unused) {
        }
        return this.f47391a.cancel(z11);
    }

    @Override // java.util.concurrent.Future
    public T get() throws InterruptedException, ExecutionException {
        return this.f47391a.get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f47391a.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f47391a.isDone();
    }

    public String toString() {
        return this.f47391a.toString();
    }

    @Override // java.util.concurrent.Future
    public T get(long j11, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.f47391a.get(j11, timeUnit);
    }
}
