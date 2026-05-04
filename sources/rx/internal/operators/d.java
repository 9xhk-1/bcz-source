package rx.internal.operators;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import rx.Notification;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class d {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a<T> implements Iterable<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ rx.c f85236a;

        public a(rx.c cVar) {
            this.f85236a = cVar;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return new b(this.f85236a, new c());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b<T> implements Iterator<T> {

        /* renamed from: a, reason: collision with root package name */
        public final c<T> f85237a;

        /* renamed from: b, reason: collision with root package name */
        public final rx.c<? extends T> f85238b;

        /* renamed from: c, reason: collision with root package name */
        public T f85239c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f85240d = true;

        /* renamed from: e, reason: collision with root package name */
        public boolean f85241e = true;

        /* renamed from: f, reason: collision with root package name */
        public Throwable f85242f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f85243g;

        public b(rx.c<? extends T> cVar, c<T> cVar2) {
            this.f85238b = cVar;
            this.f85237a = cVar2;
        }

        public final boolean a() {
            try {
                if (!this.f85243g) {
                    this.f85243g = true;
                    this.f85237a.C(1);
                    this.f85238b.e3().r5(this.f85237a);
                }
                Notification<? extends T> D = this.f85237a.D();
                if (D.m()) {
                    this.f85241e = false;
                    this.f85239c = D.h();
                    return true;
                }
                this.f85240d = false;
                if (D.k()) {
                    return false;
                }
                if (!D.l()) {
                    throw new IllegalStateException("Should not reach here");
                }
                Throwable g11 = D.g();
                this.f85242f = g11;
                throw vb0.a.c(g11);
            } catch (InterruptedException e11) {
                this.f85237a.unsubscribe();
                Thread.currentThread().interrupt();
                this.f85242f = e11;
                throw vb0.a.c(e11);
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            Throwable th2 = this.f85242f;
            if (th2 != null) {
                throw vb0.a.c(th2);
            }
            if (this.f85240d) {
                return !this.f85241e || a();
            }
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            Throwable th2 = this.f85242f;
            if (th2 != null) {
                throw vb0.a.c(th2);
            }
            if (!hasNext()) {
                throw new NoSuchElementException("No more elements");
            }
            this.f85241e = true;
            return this.f85239c;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Read only iterator");
        }
    }

    public d() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> Iterable<T> a(rx.c<? extends T> cVar) {
        return new a(cVar);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c<T> extends qb0.g<Notification<? extends T>> {

        /* renamed from: a, reason: collision with root package name */
        public final BlockingQueue<Notification<? extends T>> f85244a = new ArrayBlockingQueue(1);

        /* renamed from: b, reason: collision with root package name */
        public final AtomicInteger f85245b = new AtomicInteger();

        public void C(int i11) {
            this.f85245b.set(i11);
        }

        public Notification<? extends T> D() throws InterruptedException {
            C(1);
            return this.f85244a.take();
        }

        @Override // qb0.c
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void onNext(Notification<? extends T> notification) {
            if (this.f85245b.getAndSet(0) == 1 || !notification.m()) {
                while (!this.f85244a.offer(notification)) {
                    Notification<? extends T> poll = this.f85244a.poll();
                    if (poll != null && !poll.m()) {
                        notification = poll;
                    }
                }
            }
        }

        @Override // qb0.c
        public void onCompleted() {
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
        }
    }
}
