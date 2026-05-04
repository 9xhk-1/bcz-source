package rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import rx.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class z0<T> implements c.a<T> {

    /* renamed from: a, reason: collision with root package name */
    public final yb0.c<? extends T> f86460a;

    /* renamed from: b, reason: collision with root package name */
    public volatile ec0.b f86461b = new ec0.b();

    /* renamed from: c, reason: collision with root package name */
    public final AtomicInteger f86462c = new AtomicInteger(0);

    /* renamed from: d, reason: collision with root package name */
    public final ReentrantLock f86463d = new ReentrantLock();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements wb0.b<qb0.h> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ qb0.g f86464a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AtomicBoolean f86465b;

        public a(qb0.g gVar, AtomicBoolean atomicBoolean) {
            this.f86464a = gVar;
            this.f86465b = atomicBoolean;
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(qb0.h hVar) {
            try {
                z0.this.f86461b.a(hVar);
                z0 z0Var = z0.this;
                z0Var.j(this.f86464a, z0Var.f86461b);
            } finally {
                z0.this.f86463d.unlock();
                this.f86465b.set(false);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ qb0.g f86467a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ec0.b f86468b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(qb0.g gVar, qb0.g gVar2, ec0.b bVar) {
            super(gVar);
            this.f86467a = gVar2;
            this.f86468b = bVar;
        }

        @Override // qb0.c
        public void onCompleted() {
            q();
            this.f86467a.onCompleted();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            q();
            this.f86467a.onError(th2);
        }

        @Override // qb0.c
        public void onNext(T t11) {
            this.f86467a.onNext(t11);
        }

        public void q() {
            z0.this.f86463d.lock();
            try {
                if (z0.this.f86461b == this.f86468b) {
                    if (z0.this.f86460a instanceof qb0.h) {
                        ((qb0.h) z0.this.f86460a).unsubscribe();
                    }
                    z0.this.f86461b.unsubscribe();
                    z0.this.f86461b = new ec0.b();
                    z0.this.f86462c.set(0);
                }
                z0.this.f86463d.unlock();
            } catch (Throwable th2) {
                z0.this.f86463d.unlock();
                throw th2;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements wb0.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ec0.b f86470a;

        public c(ec0.b bVar) {
            this.f86470a = bVar;
        }

        @Override // wb0.a
        public void call() {
            z0.this.f86463d.lock();
            try {
                if (z0.this.f86461b == this.f86470a && z0.this.f86462c.decrementAndGet() == 0) {
                    if (z0.this.f86460a instanceof qb0.h) {
                        ((qb0.h) z0.this.f86460a).unsubscribe();
                    }
                    z0.this.f86461b.unsubscribe();
                    z0.this.f86461b = new ec0.b();
                }
                z0.this.f86463d.unlock();
            } catch (Throwable th2) {
                z0.this.f86463d.unlock();
                throw th2;
            }
        }
    }

    public z0(yb0.c<? extends T> cVar) {
        this.f86460a = cVar;
    }

    @Override // wb0.b
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void call(qb0.g<? super T> gVar) {
        this.f86463d.lock();
        if (this.f86462c.incrementAndGet() != 1) {
            try {
                j(gVar, this.f86461b);
            } finally {
                this.f86463d.unlock();
            }
        } else {
            AtomicBoolean atomicBoolean = new AtomicBoolean(true);
            try {
                this.f86460a.A7(l(gVar, atomicBoolean));
            } finally {
                if (atomicBoolean.get()) {
                }
            }
        }
    }

    public final qb0.h h(ec0.b bVar) {
        return ec0.f.a(new c(bVar));
    }

    public void j(qb0.g<? super T> gVar, ec0.b bVar) {
        gVar.add(h(bVar));
        this.f86460a.J6(new b(gVar, gVar, bVar));
    }

    public final wb0.b<qb0.h> l(qb0.g<? super T> gVar, AtomicBoolean atomicBoolean) {
        return new a(gVar, atomicBoolean);
    }
}
