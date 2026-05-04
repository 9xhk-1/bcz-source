package rx.internal.operators;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import rx.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class r implements b.j0 {

    /* renamed from: a, reason: collision with root package name */
    public final Iterable<? extends rx.b> f85963a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements qb0.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ec0.b f85964a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AtomicBoolean f85965b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ qb0.b f85966c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ AtomicInteger f85967d;

        public a(ec0.b bVar, AtomicBoolean atomicBoolean, qb0.b bVar2, AtomicInteger atomicInteger) {
            this.f85964a = bVar;
            this.f85965b = atomicBoolean;
            this.f85966c = bVar2;
            this.f85967d = atomicInteger;
        }

        @Override // qb0.b
        public void a(qb0.h hVar) {
            this.f85964a.a(hVar);
        }

        @Override // qb0.b
        public void onCompleted() {
            if (this.f85967d.decrementAndGet() == 0 && this.f85965b.compareAndSet(false, true)) {
                this.f85966c.onCompleted();
            }
        }

        @Override // qb0.b
        public void onError(Throwable th2) {
            this.f85964a.unsubscribe();
            if (this.f85965b.compareAndSet(false, true)) {
                this.f85966c.onError(th2);
            } else {
                ac0.c.I(th2);
            }
        }
    }

    public r(Iterable<? extends rx.b> iterable) {
        this.f85963a = iterable;
    }

    @Override // wb0.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(qb0.b bVar) {
        ec0.b bVar2 = new ec0.b();
        bVar.a(bVar2);
        try {
            Iterator<? extends rx.b> it = this.f85963a.iterator();
            if (it == null) {
                bVar.onError(new NullPointerException("The source iterator returned is null"));
                return;
            }
            AtomicInteger atomicInteger = new AtomicInteger(1);
            AtomicBoolean atomicBoolean = new AtomicBoolean();
            while (!bVar2.isUnsubscribed()) {
                try {
                    if (!it.hasNext()) {
                        if (atomicInteger.decrementAndGet() == 0 && atomicBoolean.compareAndSet(false, true)) {
                            bVar.onCompleted();
                            return;
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
                            bVar2.unsubscribe();
                            Throwable nullPointerException = new NullPointerException("A completable source is null");
                            if (atomicBoolean.compareAndSet(false, true)) {
                                bVar.onError(nullPointerException);
                                return;
                            } else {
                                ac0.c.I(nullPointerException);
                                return;
                            }
                        }
                        atomicInteger.getAndIncrement();
                        next.G0(new a(bVar2, atomicBoolean, bVar, atomicInteger));
                    } catch (Throwable th2) {
                        bVar2.unsubscribe();
                        if (atomicBoolean.compareAndSet(false, true)) {
                            bVar.onError(th2);
                            return;
                        } else {
                            ac0.c.I(th2);
                            return;
                        }
                    }
                } catch (Throwable th3) {
                    bVar2.unsubscribe();
                    if (atomicBoolean.compareAndSet(false, true)) {
                        bVar.onError(th3);
                        return;
                    } else {
                        ac0.c.I(th3);
                        return;
                    }
                }
            }
        } catch (Throwable th4) {
            bVar.onError(th4);
        }
    }
}
