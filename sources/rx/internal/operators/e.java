package rx.internal.operators;

import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class e {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a<T> extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f85277a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AtomicReference f85278b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AtomicReference f85279c;

        public a(CountDownLatch countDownLatch, AtomicReference atomicReference, AtomicReference atomicReference2) {
            this.f85277a = countDownLatch;
            this.f85278b = atomicReference;
            this.f85279c = atomicReference2;
        }

        @Override // qb0.c
        public void onCompleted() {
            this.f85277a.countDown();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            androidx.camera.view.q.a(this.f85278b, null, th2);
            this.f85277a.countDown();
        }

        @Override // qb0.c
        public void onNext(T t11) {
            this.f85279c.set(t11);
        }
    }

    public e() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> Future<T> a(rx.c<? extends T> cVar) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicReference atomicReference = new AtomicReference();
        AtomicReference atomicReference2 = new AtomicReference();
        return new b(countDownLatch, cVar.Q4().r5(new a(countDownLatch, atomicReference2, atomicReference)), atomicReference2, atomicReference);
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b<T> implements Future<T> {

        /* renamed from: a, reason: collision with root package name */
        public volatile boolean f85280a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f85281b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ qb0.h f85282c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ AtomicReference f85283d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ AtomicReference f85284e;

        public b(CountDownLatch countDownLatch, qb0.h hVar, AtomicReference atomicReference, AtomicReference atomicReference2) {
            this.f85281b = countDownLatch;
            this.f85282c = hVar;
            this.f85283d = atomicReference;
            this.f85284e = atomicReference2;
        }

        public final T a() throws ExecutionException {
            Throwable th2 = (Throwable) this.f85283d.get();
            if (th2 != null) {
                throw new ExecutionException("Observable onError", th2);
            }
            if (this.f85280a) {
                throw new CancellationException("Subscription unsubscribed");
            }
            return (T) this.f85284e.get();
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z11) {
            if (this.f85281b.getCount() <= 0) {
                return false;
            }
            this.f85280a = true;
            this.f85282c.unsubscribe();
            this.f85281b.countDown();
            return true;
        }

        @Override // java.util.concurrent.Future
        public T get() throws InterruptedException, ExecutionException {
            this.f85281b.await();
            return a();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f85280a;
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f85281b.getCount() == 0;
        }

        @Override // java.util.concurrent.Future
        public T get(long j11, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            if (this.f85281b.await(j11, timeUnit)) {
                return a();
            }
            throw new TimeoutException("Timed out after " + timeUnit.toMillis(j11) + "ms waiting for underlying Observable.");
        }
    }
}
