package rx.internal.operators;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import rx.b;
import rx.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class s implements b.j0 {

    /* renamed from: a, reason: collision with root package name */
    public final rx.b f86017a;

    /* renamed from: b, reason: collision with root package name */
    public final long f86018b;

    /* renamed from: c, reason: collision with root package name */
    public final TimeUnit f86019c;

    /* renamed from: d, reason: collision with root package name */
    public final rx.d f86020d;

    /* renamed from: e, reason: collision with root package name */
    public final rx.b f86021e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements wb0.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AtomicBoolean f86022a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ec0.b f86023b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ qb0.b f86024c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: rx.internal.operators.s$a$a, reason: collision with other inner class name */
        public class C1099a implements qb0.b {
            public C1099a() {
            }

            @Override // qb0.b
            public void a(qb0.h hVar) {
                a.this.f86023b.a(hVar);
            }

            @Override // qb0.b
            public void onCompleted() {
                a.this.f86023b.unsubscribe();
                a.this.f86024c.onCompleted();
            }

            @Override // qb0.b
            public void onError(Throwable th2) {
                a.this.f86023b.unsubscribe();
                a.this.f86024c.onError(th2);
            }
        }

        public a(AtomicBoolean atomicBoolean, ec0.b bVar, qb0.b bVar2) {
            this.f86022a = atomicBoolean;
            this.f86023b = bVar;
            this.f86024c = bVar2;
        }

        @Override // wb0.a
        public void call() {
            if (this.f86022a.compareAndSet(false, true)) {
                this.f86023b.c();
                rx.b bVar = s.this.f86021e;
                if (bVar == null) {
                    this.f86024c.onError(new TimeoutException());
                } else {
                    bVar.G0(new C1099a());
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements qb0.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ec0.b f86027a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AtomicBoolean f86028b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ qb0.b f86029c;

        public b(ec0.b bVar, AtomicBoolean atomicBoolean, qb0.b bVar2) {
            this.f86027a = bVar;
            this.f86028b = atomicBoolean;
            this.f86029c = bVar2;
        }

        @Override // qb0.b
        public void a(qb0.h hVar) {
            this.f86027a.a(hVar);
        }

        @Override // qb0.b
        public void onCompleted() {
            if (this.f86028b.compareAndSet(false, true)) {
                this.f86027a.unsubscribe();
                this.f86029c.onCompleted();
            }
        }

        @Override // qb0.b
        public void onError(Throwable th2) {
            if (!this.f86028b.compareAndSet(false, true)) {
                ac0.c.I(th2);
            } else {
                this.f86027a.unsubscribe();
                this.f86029c.onError(th2);
            }
        }
    }

    public s(rx.b bVar, long j11, TimeUnit timeUnit, rx.d dVar, rx.b bVar2) {
        this.f86017a = bVar;
        this.f86018b = j11;
        this.f86019c = timeUnit;
        this.f86020d = dVar;
        this.f86021e = bVar2;
    }

    @Override // wb0.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(qb0.b bVar) {
        ec0.b bVar2 = new ec0.b();
        bVar.a(bVar2);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        d.a a11 = this.f86020d.a();
        bVar2.a(a11);
        a11.j(new a(atomicBoolean, bVar2, bVar), this.f86018b, this.f86019c);
        this.f86017a.G0(new b(bVar2, atomicBoolean, bVar));
    }
}
