package rx.internal.operators;

import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import rx.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class q implements b.j0 {

    /* renamed from: a, reason: collision with root package name */
    public final Iterable<? extends rx.b> f85921a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements qb0.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ec0.b f85922a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Queue f85923b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AtomicInteger f85924c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ qb0.b f85925d;

        public a(ec0.b bVar, Queue queue, AtomicInteger atomicInteger, qb0.b bVar2) {
            this.f85922a = bVar;
            this.f85923b = queue;
            this.f85924c = atomicInteger;
            this.f85925d = bVar2;
        }

        @Override // qb0.b
        public void a(qb0.h hVar) {
            this.f85922a.a(hVar);
        }

        public void b() {
            if (this.f85924c.decrementAndGet() == 0) {
                if (this.f85923b.isEmpty()) {
                    this.f85925d.onCompleted();
                } else {
                    this.f85925d.onError(n.b(this.f85923b));
                }
            }
        }

        @Override // qb0.b
        public void onCompleted() {
            b();
        }

        @Override // qb0.b
        public void onError(Throwable th2) {
            this.f85923b.offer(th2);
            b();
        }
    }

    public q(Iterable<? extends rx.b> iterable) {
        this.f85921a = iterable;
    }

    @Override // wb0.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(qb0.b bVar) {
        ec0.b bVar2 = new ec0.b();
        bVar.a(bVar2);
        try {
            Iterator<? extends rx.b> it = this.f85921a.iterator();
            if (it == null) {
                bVar.onError(new NullPointerException("The source iterator returned is null"));
                return;
            }
            AtomicInteger atomicInteger = new AtomicInteger(1);
            Queue oVar = rx.internal.util.unsafe.n0.f() ? new rx.internal.util.unsafe.o() : new rx.internal.util.atomic.c();
            while (!bVar2.isUnsubscribed()) {
                try {
                    if (!it.hasNext()) {
                        if (atomicInteger.decrementAndGet() == 0) {
                            if (oVar.isEmpty()) {
                                bVar.onCompleted();
                                return;
                            } else {
                                bVar.onError(n.b(oVar));
                                return;
                            }
                        }
                        return;
                    }
                    if (bVar2.isUnsubscribed()) {
                        return;
                    }
                    try {
                        rx.b next = it.next();
                        if (bVar2.isUnsubscribed()) {
                            return;
                        }
                        if (next == null) {
                            oVar.offer(new NullPointerException("A completable source is null"));
                            if (atomicInteger.decrementAndGet() == 0) {
                                if (oVar.isEmpty()) {
                                    bVar.onCompleted();
                                    return;
                                } else {
                                    bVar.onError(n.b(oVar));
                                    return;
                                }
                            }
                            return;
                        }
                        atomicInteger.getAndIncrement();
                        next.G0(new a(bVar2, oVar, atomicInteger, bVar));
                    } catch (Throwable th2) {
                        oVar.offer(th2);
                        if (atomicInteger.decrementAndGet() == 0) {
                            if (oVar.isEmpty()) {
                                bVar.onCompleted();
                                return;
                            } else {
                                bVar.onError(n.b(oVar));
                                return;
                            }
                        }
                        return;
                    }
                } catch (Throwable th3) {
                    oVar.offer(th3);
                    if (atomicInteger.decrementAndGet() == 0) {
                        if (oVar.isEmpty()) {
                            bVar.onCompleted();
                            return;
                        } else {
                            bVar.onError(n.b(oVar));
                            return;
                        }
                    }
                    return;
                }
            }
        } catch (Throwable th4) {
            bVar.onError(th4);
        }
    }
}
