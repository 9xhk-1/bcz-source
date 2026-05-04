package rx.internal.operators;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;
import rx.Notification;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class b {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a<T> implements Iterable<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ rx.c f85126a;

        public a(rx.c cVar) {
            this.f85126a = cVar;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            C1079b c1079b = new C1079b();
            this.f85126a.e3().r5(c1079b);
            return c1079b;
        }
    }

    public b() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> Iterable<T> a(rx.c<? extends T> cVar) {
        return new a(cVar);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: rx.internal.operators.b$b, reason: collision with other inner class name */
    public static final class C1079b<T> extends qb0.g<Notification<? extends T>> implements Iterator<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Semaphore f85127a = new Semaphore(0);

        /* renamed from: b, reason: collision with root package name */
        public final AtomicReference<Notification<? extends T>> f85128b = new AtomicReference<>();

        /* renamed from: c, reason: collision with root package name */
        public Notification<? extends T> f85129c;

        @Override // java.util.Iterator
        public boolean hasNext() {
            Notification<? extends T> notification = this.f85129c;
            if (notification != null && notification.l()) {
                throw vb0.a.c(this.f85129c.g());
            }
            Notification<? extends T> notification2 = this.f85129c;
            if ((notification2 == null || !notification2.k()) && this.f85129c == null) {
                try {
                    this.f85127a.acquire();
                    Notification<? extends T> andSet = this.f85128b.getAndSet(null);
                    this.f85129c = andSet;
                    if (andSet.l()) {
                        throw vb0.a.c(this.f85129c.g());
                    }
                } catch (InterruptedException e11) {
                    unsubscribe();
                    Thread.currentThread().interrupt();
                    this.f85129c = Notification.d(e11);
                    throw vb0.a.c(e11);
                }
            }
            return !this.f85129c.k();
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext() || !this.f85129c.m()) {
                throw new NoSuchElementException();
            }
            T h11 = this.f85129c.h();
            this.f85129c = null;
            return h11;
        }

        @Override // qb0.c
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void onNext(Notification<? extends T> notification) {
            if (this.f85128b.getAndSet(notification) == null) {
                this.f85127a.release();
            }
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Read-only iterator.");
        }

        @Override // qb0.c
        public void onCompleted() {
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
        }
    }
}
