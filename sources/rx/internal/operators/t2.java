package rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class t2<T> implements c.b<T, T> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final t2<Object> f86097a = new t2<>();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b<T> extends AtomicLong implements qb0.d, qb0.h, qb0.c<T> {

        /* renamed from: h, reason: collision with root package name */
        public static final Object f86098h = new Object();

        /* renamed from: i, reason: collision with root package name */
        public static final long f86099i = -4611686018427387904L;
        private static final long serialVersionUID = -1364393685005146274L;

        /* renamed from: a, reason: collision with root package name */
        public final qb0.g<? super T> f86100a;

        /* renamed from: b, reason: collision with root package name */
        public c<? super T> f86101b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicReference<Object> f86102c = new AtomicReference<>(f86098h);

        /* renamed from: d, reason: collision with root package name */
        public Throwable f86103d;

        /* renamed from: e, reason: collision with root package name */
        public volatile boolean f86104e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f86105f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f86106g;

        public b(qb0.g<? super T> gVar) {
            this.f86100a = gVar;
            lazySet(-4611686018427387904L);
        }

        public void c() {
            boolean z11;
            Object obj;
            synchronized (this) {
                try {
                    boolean z12 = true;
                    if (this.f86105f) {
                        this.f86106g = true;
                        return;
                    }
                    this.f86105f = true;
                    this.f86106g = false;
                    while (true) {
                        try {
                            long j11 = get();
                            if (j11 == Long.MIN_VALUE) {
                                return;
                            }
                            Object obj2 = this.f86102c.get();
                            if (j11 > 0 && obj2 != (obj = f86098h)) {
                                this.f86100a.onNext(obj2);
                                androidx.camera.view.q.a(this.f86102c, obj2, obj);
                                d(1L);
                                obj2 = obj;
                            }
                            if (obj2 == f86098h && this.f86104e) {
                                Throwable th2 = this.f86103d;
                                if (th2 != null) {
                                    this.f86100a.onError(th2);
                                } else {
                                    this.f86100a.onCompleted();
                                }
                            }
                            try {
                                synchronized (this) {
                                    try {
                                        if (!this.f86106g) {
                                            this.f86105f = false;
                                            return;
                                        }
                                        this.f86106g = false;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        z12 = false;
                                    }
                                }
                            } catch (Throwable th4) {
                                th = th4;
                            }
                            try {
                                throw th;
                            } catch (Throwable th5) {
                                z11 = z12;
                                th = th5;
                                if (z11) {
                                    throw th;
                                }
                                synchronized (this) {
                                    this.f86105f = false;
                                }
                                throw th;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            z11 = false;
                        }
                    }
                } finally {
                }
            }
        }

        public long d(long j11) {
            long j12;
            long j13;
            do {
                j12 = get();
                if (j12 < 0) {
                    return j12;
                }
                j13 = j12 - j11;
            } while (!compareAndSet(j12, j13));
            return j13;
        }

        @Override // qb0.h
        public boolean isUnsubscribed() {
            return get() == Long.MIN_VALUE;
        }

        @Override // qb0.c
        public void onCompleted() {
            this.f86104e = true;
            c();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            this.f86103d = th2;
            this.f86104e = true;
            c();
        }

        @Override // qb0.c
        public void onNext(T t11) {
            this.f86102c.lazySet(t11);
            c();
        }

        @Override // qb0.d
        public void request(long j11) {
            long j12;
            long j13;
            if (j11 >= 0) {
                do {
                    j12 = get();
                    if (j12 == Long.MIN_VALUE) {
                        return;
                    }
                    if (j12 == -4611686018427387904L) {
                        j13 = j11;
                    } else {
                        j13 = j12 + j11;
                        if (j13 < 0) {
                            j13 = Long.MAX_VALUE;
                        }
                    }
                } while (!compareAndSet(j12, j13));
                if (j12 == -4611686018427387904L) {
                    this.f86101b.q(Long.MAX_VALUE);
                }
                c();
            }
        }

        @Override // qb0.h
        public void unsubscribe() {
            if (get() >= 0) {
                getAndSet(Long.MIN_VALUE);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c<T> extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public final b<T> f86107a;

        public c(b<T> bVar) {
            this.f86107a = bVar;
        }

        @Override // qb0.c
        public void onCompleted() {
            this.f86107a.onCompleted();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            this.f86107a.onError(th2);
        }

        @Override // qb0.c
        public void onNext(T t11) {
            this.f86107a.onNext(t11);
        }

        @Override // qb0.g
        public void onStart() {
            request(0L);
        }

        public void q(long j11) {
            request(j11);
        }
    }

    public static <T> t2<T> b() {
        return (t2<T>) a.f86097a;
    }

    @Override // wb0.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public qb0.g<? super T> call(qb0.g<? super T> gVar) {
        b bVar = new b(gVar);
        c<? super T> cVar = new c<>(bVar);
        bVar.f86101b = cVar;
        gVar.add(cVar);
        gVar.add(bVar);
        gVar.setProducer(bVar);
        return cVar;
    }
}
