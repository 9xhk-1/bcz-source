package rx.internal.operators;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import rx.Notification;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class f {
    public f() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> Iterator<T> a(rx.c<? extends T> cVar) {
        a aVar = new a();
        cVar.e3().r5(aVar);
        return aVar;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<T> extends qb0.g<Notification<? extends T>> implements Iterator<T> {

        /* renamed from: d, reason: collision with root package name */
        public static final int f85307d = (rx.internal.util.j.f86718d * 3) / 4;

        /* renamed from: a, reason: collision with root package name */
        public final BlockingQueue<Notification<? extends T>> f85308a = new LinkedBlockingQueue();

        /* renamed from: b, reason: collision with root package name */
        public Notification<? extends T> f85309b;

        /* renamed from: c, reason: collision with root package name */
        public int f85310c;

        public final Notification<? extends T> C() {
            try {
                Notification<? extends T> poll = this.f85308a.poll();
                return poll != null ? poll : this.f85308a.take();
            } catch (InterruptedException e11) {
                unsubscribe();
                throw vb0.a.c(e11);
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f85309b == null) {
                this.f85309b = C();
                int i11 = this.f85310c + 1;
                this.f85310c = i11;
                if (i11 >= f85307d) {
                    request(i11);
                    this.f85310c = 0;
                }
            }
            if (this.f85309b.l()) {
                throw vb0.a.c(this.f85309b.g());
            }
            return !this.f85309b.k();
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T h11 = this.f85309b.h();
            this.f85309b = null;
            return h11;
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            this.f85308a.offer(Notification.d(th2));
        }

        @Override // qb0.g
        public void onStart() {
            request(rx.internal.util.j.f86718d);
        }

        @Override // qb0.c
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void onNext(Notification<? extends T> notification) {
            this.f85308a.offer(notification);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Read-only iterator");
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }
}
