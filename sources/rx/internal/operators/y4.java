package rx.internal.operators;

import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import rx.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class y4 {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a<R> implements e.t<R> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ rx.e[] f86428a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ wb0.y f86429b;

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: rx.internal.operators.y4$a$a, reason: collision with other inner class name */
        public class C1109a<T> extends qb0.f<T> {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Object[] f86430b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ int f86431c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ AtomicInteger f86432d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ qb0.f f86433e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ AtomicBoolean f86434f;

            public C1109a(Object[] objArr, int i11, AtomicInteger atomicInteger, qb0.f fVar, AtomicBoolean atomicBoolean) {
                this.f86430b = objArr;
                this.f86431c = i11;
                this.f86432d = atomicInteger;
                this.f86433e = fVar;
                this.f86434f = atomicBoolean;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // qb0.f
            public void h(T t11) {
                this.f86430b[this.f86431c] = t11;
                if (this.f86432d.decrementAndGet() == 0) {
                    try {
                        this.f86433e.h(a.this.f86429b.call(this.f86430b));
                    } catch (Throwable th2) {
                        vb0.a.e(th2);
                        onError(th2);
                    }
                }
            }

            @Override // qb0.f
            public void onError(Throwable th2) {
                if (this.f86434f.compareAndSet(false, true)) {
                    this.f86433e.onError(th2);
                } else {
                    ac0.c.I(th2);
                }
            }
        }

        public a(rx.e[] eVarArr, wb0.y yVar) {
            this.f86428a = eVarArr;
            this.f86429b = yVar;
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(qb0.f<? super R> fVar) {
            if (this.f86428a.length == 0) {
                fVar.onError(new NoSuchElementException("Can't zip 0 Singles."));
                return;
            }
            AtomicInteger atomicInteger = new AtomicInteger(this.f86428a.length);
            AtomicBoolean atomicBoolean = new AtomicBoolean();
            Object[] objArr = new Object[this.f86428a.length];
            ec0.b bVar = new ec0.b();
            fVar.b(bVar);
            int i11 = 0;
            while (i11 < this.f86428a.length && !bVar.isUnsubscribed() && !atomicBoolean.get()) {
                qb0.f<? super R> fVar2 = fVar;
                C1109a c1109a = new C1109a(objArr, i11, atomicInteger, fVar2, atomicBoolean);
                bVar.a(c1109a);
                if (bVar.isUnsubscribed() || atomicBoolean.get()) {
                    return;
                }
                this.f86428a[i11].j0(c1109a);
                i11++;
                fVar = fVar2;
            }
        }
    }

    public y4() {
        throw new IllegalStateException("No instances!");
    }

    public static <T, R> rx.e<R> a(rx.e<? extends T>[] eVarArr, wb0.y<? extends R> yVar) {
        return rx.e.n(new a(eVarArr, yVar));
    }
}
