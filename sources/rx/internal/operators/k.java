package rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import rx.b;
import rx.exceptions.MissingBackpressureException;
import rx.internal.subscriptions.SequentialSubscription;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class k implements b.j0 {

    /* renamed from: a, reason: collision with root package name */
    public final rx.c<rx.b> f85619a;

    /* renamed from: b, reason: collision with root package name */
    public final int f85620b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends qb0.g<rx.b> {

        /* renamed from: a, reason: collision with root package name */
        public final qb0.b f85621a;

        /* renamed from: b, reason: collision with root package name */
        public final SequentialSubscription f85622b;

        /* renamed from: c, reason: collision with root package name */
        public final rx.internal.util.unsafe.z<rx.b> f85623c;

        /* renamed from: d, reason: collision with root package name */
        public final C1090a f85624d;

        /* renamed from: e, reason: collision with root package name */
        public final AtomicBoolean f85625e;

        /* renamed from: f, reason: collision with root package name */
        public volatile boolean f85626f;

        /* renamed from: g, reason: collision with root package name */
        public volatile boolean f85627g;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: rx.internal.operators.k$a$a, reason: collision with other inner class name */
        public final class C1090a extends AtomicInteger implements qb0.b {
            private static final long serialVersionUID = 7233503139645205620L;

            public C1090a() {
            }

            @Override // qb0.b
            public void a(qb0.h hVar) {
                a.this.f85622b.set(hVar);
            }

            @Override // qb0.b
            public void onCompleted() {
                a.this.C();
            }

            @Override // qb0.b
            public void onError(Throwable th2) {
                a.this.D(th2);
            }
        }

        public a(qb0.b bVar, int i11) {
            this.f85621a = bVar;
            this.f85623c = new rx.internal.util.unsafe.z<>(i11);
            SequentialSubscription sequentialSubscription = new SequentialSubscription();
            this.f85622b = sequentialSubscription;
            this.f85624d = new C1090a();
            this.f85625e = new AtomicBoolean();
            add(sequentialSubscription);
            request(i11);
        }

        public void C() {
            this.f85627g = false;
            q();
        }

        public void D(Throwable th2) {
            unsubscribe();
            onError(th2);
        }

        @Override // qb0.c
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        public void onNext(rx.b bVar) {
            if (this.f85623c.offer(bVar)) {
                q();
            } else {
                onError(new MissingBackpressureException());
            }
        }

        @Override // qb0.c
        public void onCompleted() {
            if (this.f85626f) {
                return;
            }
            this.f85626f = true;
            q();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            if (this.f85625e.compareAndSet(false, true)) {
                this.f85621a.onError(th2);
            } else {
                ac0.c.I(th2);
            }
        }

        public void q() {
            C1090a c1090a = this.f85624d;
            if (c1090a.getAndIncrement() != 0) {
                return;
            }
            while (!isUnsubscribed()) {
                if (!this.f85627g) {
                    boolean z11 = this.f85626f;
                    rx.b poll = this.f85623c.poll();
                    boolean z12 = poll == null;
                    if (z11 && z12) {
                        this.f85621a.onCompleted();
                        return;
                    } else if (!z12) {
                        this.f85627g = true;
                        poll.q0(c1090a);
                        request(1L);
                    }
                }
                if (c1090a.decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(rx.c<? extends rx.b> cVar, int i11) {
        this.f85619a = cVar;
        this.f85620b = i11;
    }

    @Override // wb0.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(qb0.b bVar) {
        a aVar = new a(bVar, this.f85620b);
        bVar.a(aVar);
        this.f85619a.J6(aVar);
    }
}
