package rx.internal.operators;

import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import rx.b;
import rx.exceptions.CompositeException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class n implements b.j0 {

    /* renamed from: a, reason: collision with root package name */
    public final rx.c<rx.b> f85747a;

    /* renamed from: b, reason: collision with root package name */
    public final int f85748b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f85749c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends qb0.g<rx.b> {

        /* renamed from: a, reason: collision with root package name */
        public final qb0.b f85750a;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f85752c;

        /* renamed from: d, reason: collision with root package name */
        public volatile boolean f85753d;

        /* renamed from: b, reason: collision with root package name */
        public final ec0.b f85751b = new ec0.b();

        /* renamed from: g, reason: collision with root package name */
        public final AtomicInteger f85756g = new AtomicInteger(1);

        /* renamed from: f, reason: collision with root package name */
        public final AtomicBoolean f85755f = new AtomicBoolean();

        /* renamed from: e, reason: collision with root package name */
        public final AtomicReference<Queue<Throwable>> f85754e = new AtomicReference<>();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: rx.internal.operators.n$a$a, reason: collision with other inner class name */
        public class C1093a implements qb0.b {

            /* renamed from: a, reason: collision with root package name */
            public qb0.h f85757a;

            /* renamed from: b, reason: collision with root package name */
            public boolean f85758b;

            public C1093a() {
            }

            @Override // qb0.b
            public void a(qb0.h hVar) {
                this.f85757a = hVar;
                a.this.f85751b.a(hVar);
            }

            @Override // qb0.b
            public void onCompleted() {
                if (this.f85758b) {
                    return;
                }
                this.f85758b = true;
                a.this.f85751b.e(this.f85757a);
                a.this.H();
                if (a.this.f85753d) {
                    return;
                }
                a.this.request(1L);
            }

            @Override // qb0.b
            public void onError(Throwable th2) {
                if (this.f85758b) {
                    ac0.c.I(th2);
                    return;
                }
                this.f85758b = true;
                a.this.f85751b.e(this.f85757a);
                a.this.D().offer(th2);
                a.this.H();
                a aVar = a.this;
                if (!aVar.f85752c || aVar.f85753d) {
                    return;
                }
                a.this.request(1L);
            }
        }

        public a(qb0.b bVar, int i11, boolean z11) {
            this.f85750a = bVar;
            this.f85752c = z11;
            if (i11 == Integer.MAX_VALUE) {
                request(Long.MAX_VALUE);
            } else {
                request(i11);
            }
        }

        public Queue<Throwable> D() {
            Queue<Throwable> queue = this.f85754e.get();
            if (queue != null) {
                return queue;
            }
            ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
            return androidx.camera.view.q.a(this.f85754e, null, concurrentLinkedQueue) ? concurrentLinkedQueue : this.f85754e.get();
        }

        @Override // qb0.c
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        public void onNext(rx.b bVar) {
            if (this.f85753d) {
                return;
            }
            this.f85756g.getAndIncrement();
            bVar.G0(new C1093a());
        }

        public void H() {
            Queue<Throwable> queue;
            if (this.f85756g.decrementAndGet() != 0) {
                if (this.f85752c || (queue = this.f85754e.get()) == null || queue.isEmpty()) {
                    return;
                }
                Throwable b11 = n.b(queue);
                if (this.f85755f.compareAndSet(false, true)) {
                    this.f85750a.onError(b11);
                    return;
                } else {
                    ac0.c.I(b11);
                    return;
                }
            }
            Queue<Throwable> queue2 = this.f85754e.get();
            if (queue2 == null || queue2.isEmpty()) {
                this.f85750a.onCompleted();
                return;
            }
            Throwable b12 = n.b(queue2);
            if (this.f85755f.compareAndSet(false, true)) {
                this.f85750a.onError(b12);
            } else {
                ac0.c.I(b12);
            }
        }

        @Override // qb0.c
        public void onCompleted() {
            if (this.f85753d) {
                return;
            }
            this.f85753d = true;
            H();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            if (this.f85753d) {
                ac0.c.I(th2);
                return;
            }
            D().offer(th2);
            this.f85753d = true;
            H();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n(rx.c<? extends rx.b> cVar, int i11, boolean z11) {
        this.f85747a = cVar;
        this.f85748b = i11;
        this.f85749c = z11;
    }

    public static Throwable b(Queue<Throwable> queue) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            Throwable poll = queue.poll();
            if (poll == null) {
                break;
            }
            arrayList.add(poll);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList.size() == 1 ? (Throwable) arrayList.get(0) : new CompositeException(arrayList);
    }

    @Override // wb0.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(qb0.b bVar) {
        a aVar = new a(bVar, this.f85748b, this.f85749c);
        bVar.a(aVar);
        this.f85747a.J6(aVar);
    }
}
