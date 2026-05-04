package rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;
import rx.Notification;
import rx.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class n2<T> implements c.b<Notification<T>, T> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements qb0.d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f85768a;

        public a(c cVar) {
            this.f85768a = cVar;
        }

        @Override // qb0.d
        public void request(long j11) {
            if (j11 > 0) {
                this.f85768a.D(j11);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final n2<Object> f85770a = new n2<>();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c<T> extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public final qb0.g<? super Notification<T>> f85771a;

        /* renamed from: b, reason: collision with root package name */
        public volatile Notification<T> f85772b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f85773c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f85774d;

        /* renamed from: e, reason: collision with root package name */
        public final AtomicLong f85775e = new AtomicLong();

        public c(qb0.g<? super Notification<T>> gVar) {
            this.f85771a = gVar;
        }

        private void C() {
            synchronized (this) {
                try {
                    if (this.f85773c) {
                        this.f85774d = true;
                        return;
                    }
                    this.f85773c = true;
                    AtomicLong atomicLong = this.f85775e;
                    while (!this.f85771a.isUnsubscribed()) {
                        Notification<T> notification = this.f85772b;
                        if (notification != null && atomicLong.get() > 0) {
                            this.f85772b = null;
                            this.f85771a.onNext(notification);
                            if (this.f85771a.isUnsubscribed()) {
                                return;
                            }
                            this.f85771a.onCompleted();
                            return;
                        }
                        synchronized (this) {
                            try {
                                if (!this.f85774d) {
                                    this.f85773c = false;
                                    return;
                                }
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            }
        }

        public void D(long j11) {
            rx.internal.operators.a.b(this.f85775e, j11);
            request(j11);
            C();
        }

        @Override // qb0.c
        public void onCompleted() {
            this.f85772b = Notification.b();
            C();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            this.f85772b = Notification.d(th2);
            ac0.c.I(th2);
            C();
        }

        @Override // qb0.c
        public void onNext(T t11) {
            this.f85771a.onNext(Notification.e(t11));
            q();
        }

        @Override // qb0.g
        public void onStart() {
            request(0L);
        }

        public final void q() {
            long j11;
            AtomicLong atomicLong = this.f85775e;
            do {
                j11 = atomicLong.get();
                if (j11 == Long.MAX_VALUE) {
                    return;
                }
            } while (!atomicLong.compareAndSet(j11, j11 - 1));
        }
    }

    public static <T> n2<T> b() {
        return (n2<T>) b.f85770a;
    }

    @Override // wb0.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public qb0.g<? super T> call(qb0.g<? super Notification<T>> gVar) {
        c cVar = new c(gVar);
        gVar.add(cVar);
        gVar.setProducer(new a(cVar));
        return cVar;
    }
}
