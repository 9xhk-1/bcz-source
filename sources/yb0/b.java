package yb0;

import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicReference;
import rx.exceptions.OnErrorNotImplementedException;
import rx.internal.operators.v;
import rx.internal.util.o;
import wb0.m;
import wb0.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class b<T> {

    /* renamed from: b, reason: collision with root package name */
    public static final Object f99825b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final Object f99826c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final Object f99827d = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final rx.c<? extends T> f99828a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f99829a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AtomicReference f99830b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ wb0.b f99831c;

        public a(CountDownLatch countDownLatch, AtomicReference atomicReference, wb0.b bVar) {
            this.f99829a = countDownLatch;
            this.f99830b = atomicReference;
            this.f99831c = bVar;
        }

        @Override // qb0.c
        public void onCompleted() {
            this.f99829a.countDown();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            this.f99830b.set(th2);
            this.f99829a.countDown();
        }

        @Override // qb0.c
        public void onNext(T t11) {
            this.f99831c.call(t11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: yb0.b$b, reason: collision with other inner class name */
    public class C1357b implements Iterable<T> {
        public C1357b() {
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return b.this.h();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f99834a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AtomicReference f99835b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AtomicReference f99836c;

        public c(CountDownLatch countDownLatch, AtomicReference atomicReference, AtomicReference atomicReference2) {
            this.f99834a = countDownLatch;
            this.f99835b = atomicReference;
            this.f99836c = atomicReference2;
        }

        @Override // qb0.c
        public void onCompleted() {
            this.f99834a.countDown();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            this.f99835b.set(th2);
            this.f99834a.countDown();
        }

        @Override // qb0.c
        public void onNext(T t11) {
            this.f99836c.set(t11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ BlockingQueue f99841a;

        public e(BlockingQueue blockingQueue) {
            this.f99841a = blockingQueue;
        }

        @Override // qb0.c
        public void onCompleted() {
            this.f99841a.offer(v.b());
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            this.f99841a.offer(v.c(th2));
        }

        @Override // qb0.c
        public void onNext(T t11) {
            this.f99841a.offer(v.j(t11));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class f extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ BlockingQueue f99843a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ qb0.d[] f99844b;

        public f(BlockingQueue blockingQueue, qb0.d[] dVarArr) {
            this.f99843a = blockingQueue;
            this.f99844b = dVarArr;
        }

        @Override // qb0.c
        public void onCompleted() {
            this.f99843a.offer(v.b());
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            this.f99843a.offer(v.c(th2));
        }

        @Override // qb0.c
        public void onNext(T t11) {
            this.f99843a.offer(v.j(t11));
        }

        @Override // qb0.g
        public void onStart() {
            this.f99843a.offer(b.f99825b);
        }

        @Override // qb0.g
        public void setProducer(qb0.d dVar) {
            this.f99844b[0] = dVar;
            this.f99843a.offer(b.f99826c);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class g implements wb0.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ BlockingQueue f99846a;

        public g(BlockingQueue blockingQueue) {
            this.f99846a = blockingQueue;
        }

        @Override // wb0.a
        public void call() {
            this.f99846a.offer(b.f99827d);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class h implements wb0.b<Throwable> {
        public h() {
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th2) {
            throw new OnErrorNotImplementedException(th2);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class i implements qb0.c<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ wb0.b f99849a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ wb0.b f99850b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ wb0.a f99851c;

        public i(wb0.b bVar, wb0.b bVar2, wb0.a aVar) {
            this.f99849a = bVar;
            this.f99850b = bVar2;
            this.f99851c = aVar;
        }

        @Override // qb0.c
        public void onCompleted() {
            this.f99851c.call();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            this.f99850b.call(th2);
        }

        @Override // qb0.c
        public void onNext(T t11) {
            this.f99849a.call(t11);
        }
    }

    public b(rx.c<? extends T> cVar) {
        this.f99828a = cVar;
    }

    public static <T> b<T> g(rx.c<? extends T> cVar) {
        return new b<>(cVar);
    }

    public Iterable<T> A() {
        return new C1357b();
    }

    public final T a(rx.c<? extends T> cVar) {
        AtomicReference atomicReference = new AtomicReference();
        AtomicReference atomicReference2 = new AtomicReference();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        rx.internal.util.d.a(countDownLatch, cVar.r5(new c(countDownLatch, atomicReference2, atomicReference)));
        if (atomicReference2.get() != null) {
            vb0.a.c((Throwable) atomicReference2.get());
        }
        return (T) atomicReference.get();
    }

    public T b() {
        return a(this.f99828a.X1());
    }

    public T c(p<? super T, Boolean> pVar) {
        return a(this.f99828a.Y1(pVar));
    }

    public T d(T t11) {
        return a(this.f99828a.c3(o.c()).Z1(t11));
    }

    public T e(T t11, p<? super T, Boolean> pVar) {
        return a(this.f99828a.V1(pVar).c3(o.c()).Z1(t11));
    }

    public void f(wb0.b<? super T> bVar) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicReference atomicReference = new AtomicReference();
        rx.internal.util.d.a(countDownLatch, this.f99828a.r5(new a(countDownLatch, atomicReference, bVar)));
        if (atomicReference.get() != null) {
            vb0.a.c((Throwable) atomicReference.get());
        }
    }

    public Iterator<T> h() {
        return rx.internal.operators.f.a(this.f99828a);
    }

    public T i() {
        return a(this.f99828a.W2());
    }

    public T j(p<? super T, Boolean> pVar) {
        return a(this.f99828a.X2(pVar));
    }

    public T k(T t11) {
        return a(this.f99828a.c3(o.c()).Y2(t11));
    }

    public T l(T t11, p<? super T, Boolean> pVar) {
        return a(this.f99828a.V1(pVar).c3(o.c()).Y2(t11));
    }

    public Iterable<T> m() {
        return rx.internal.operators.b.a(this.f99828a);
    }

    public Iterable<T> n(T t11) {
        return rx.internal.operators.c.a(this.f99828a, t11);
    }

    public Iterable<T> o() {
        return rx.internal.operators.d.a(this.f99828a);
    }

    public T p() {
        return a(this.f99828a.Q4());
    }

    public T q(p<? super T, Boolean> pVar) {
        return a(this.f99828a.R4(pVar));
    }

    public T r(T t11) {
        return a(this.f99828a.c3(o.c()).S4(t11));
    }

    public T s(T t11, p<? super T, Boolean> pVar) {
        return a(this.f99828a.V1(pVar).c3(o.c()).S4(t11));
    }

    public void t() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Throwable[] thArr = {null};
        rx.internal.util.d.a(countDownLatch, this.f99828a.r5(new d(thArr, countDownLatch)));
        Throwable th2 = thArr[0];
        if (th2 != null) {
            vb0.a.c(th2);
        }
    }

    public void u(qb0.c<? super T> cVar) {
        Object poll;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        qb0.h r52 = this.f99828a.r5(new e(linkedBlockingQueue));
        do {
            try {
                try {
                    poll = linkedBlockingQueue.poll();
                    if (poll == null) {
                        poll = linkedBlockingQueue.take();
                    }
                } catch (InterruptedException e11) {
                    Thread.currentThread().interrupt();
                    cVar.onError(e11);
                    r52.unsubscribe();
                    return;
                }
            } catch (Throwable th2) {
                r52.unsubscribe();
                throw th2;
            }
        } while (!v.a(cVar, poll));
        r52.unsubscribe();
    }

    public void v(qb0.g<? super T> gVar) {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        qb0.d[] dVarArr = {null};
        f fVar = new f(linkedBlockingQueue, dVarArr);
        gVar.add(fVar);
        gVar.add(ec0.f.a(new g(linkedBlockingQueue)));
        this.f99828a.r5(fVar);
        while (!gVar.isUnsubscribed()) {
            try {
                try {
                    Object poll = linkedBlockingQueue.poll();
                    if (poll == null) {
                        poll = linkedBlockingQueue.take();
                    }
                    if (gVar.isUnsubscribed() || poll == f99827d) {
                        break;
                    }
                    if (poll == f99825b) {
                        gVar.onStart();
                    } else if (poll == f99826c) {
                        gVar.setProducer(dVarArr[0]);
                    } else if (v.a(gVar, poll)) {
                        fVar.unsubscribe();
                        return;
                    }
                } catch (InterruptedException e11) {
                    Thread.currentThread().interrupt();
                    gVar.onError(e11);
                    fVar.unsubscribe();
                    return;
                }
            } finally {
                fVar.unsubscribe();
            }
        }
    }

    public void w(wb0.b<? super T> bVar) {
        y(bVar, new h(), m.a());
    }

    public void x(wb0.b<? super T> bVar, wb0.b<? super Throwable> bVar2) {
        y(bVar, bVar2, m.a());
    }

    public void y(wb0.b<? super T> bVar, wb0.b<? super Throwable> bVar2, wb0.a aVar) {
        u(new i(bVar, bVar2, aVar));
    }

    public Future<T> z() {
        return rx.internal.operators.e.a(this.f99828a);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Throwable[] f99838a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f99839b;

        public d(Throwable[] thArr, CountDownLatch countDownLatch) {
            this.f99838a = thArr;
            this.f99839b = countDownLatch;
        }

        @Override // qb0.c
        public void onCompleted() {
            this.f99839b.countDown();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            this.f99838a[0] = th2;
            this.f99839b.countDown();
        }

        @Override // qb0.c
        public void onNext(T t11) {
        }
    }
}
