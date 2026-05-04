package sh;

import com.squareup.picasso.h0;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class n<T> implements Future<T> {

    /* renamed from: a, reason: collision with root package name */
    public T f88664a = null;

    /* renamed from: b, reason: collision with root package name */
    public CountDownLatch f88665b = new CountDownLatch(1);

    /* renamed from: c, reason: collision with root package name */
    public Throwable f88666c = null;

    public void a(T value) {
        this.f88664a = value;
        this.f88665b.countDown();
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean mayInterruptIfRunning) {
        this.f88666c = new InterruptedException(h0.f41875q);
        this.f88665b.countDown();
        return true;
    }

    @Override // java.util.concurrent.Future
    public T get() throws InterruptedException, ExecutionException {
        this.f88665b.await();
        if (this.f88666c == null) {
            return this.f88664a;
        }
        throw new RuntimeException(this.f88666c);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f88666c != null;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f88665b.getCount() == 0;
    }

    @Override // java.util.concurrent.Future
    public T get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
        this.f88665b.await(timeout, unit);
        if (this.f88666c == null) {
            return this.f88664a;
        }
        throw new RuntimeException(this.f88666c);
    }
}
