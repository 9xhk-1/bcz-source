package rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import rx.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class o implements b.j0 {

    /* renamed from: a, reason: collision with root package name */
    public final rx.b[] f85791a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements qb0.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ec0.b f85792a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AtomicBoolean f85793b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ qb0.b f85794c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ AtomicInteger f85795d;

        public a(ec0.b bVar, AtomicBoolean atomicBoolean, qb0.b bVar2, AtomicInteger atomicInteger) {
            this.f85792a = bVar;
            this.f85793b = atomicBoolean;
            this.f85794c = bVar2;
            this.f85795d = atomicInteger;
        }

        @Override // qb0.b
        public void a(qb0.h hVar) {
            this.f85792a.a(hVar);
        }

        @Override // qb0.b
        public void onCompleted() {
            if (this.f85795d.decrementAndGet() == 0 && this.f85793b.compareAndSet(false, true)) {
                this.f85794c.onCompleted();
            }
        }

        @Override // qb0.b
        public void onError(Throwable th2) {
            this.f85792a.unsubscribe();
            if (this.f85793b.compareAndSet(false, true)) {
                this.f85794c.onError(th2);
            } else {
                ac0.c.I(th2);
            }
        }
    }

    public o(rx.b[] bVarArr) {
        this.f85791a = bVarArr;
    }

    @Override // wb0.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(qb0.b bVar) {
        ec0.b bVar2 = new ec0.b();
        AtomicInteger atomicInteger = new AtomicInteger(this.f85791a.length + 1);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        bVar.a(bVar2);
        for (rx.b bVar3 : this.f85791a) {
            if (bVar2.isUnsubscribed()) {
                return;
            }
            if (bVar3 == null) {
                bVar2.unsubscribe();
                Throwable nullPointerException = new NullPointerException("A completable source is null");
                if (atomicBoolean.compareAndSet(false, true)) {
                    bVar.onError(nullPointerException);
                    return;
                }
                ac0.c.I(nullPointerException);
            }
            bVar3.G0(new a(bVar2, atomicBoolean, bVar, atomicInteger));
        }
        if (atomicInteger.decrementAndGet() == 0 && atomicBoolean.compareAndSet(false, true)) {
            bVar.onCompleted();
        }
    }
}
