package cc0;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;
import qb0.f;
import rx.e;
import rx.internal.util.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class a<T> {

    /* renamed from: a, reason: collision with root package name */
    public final e<? extends T> f8512a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: cc0.a$a, reason: collision with other inner class name */
    public class C0147a extends f<T> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AtomicReference f8513b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f8514c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ AtomicReference f8515d;

        public C0147a(AtomicReference atomicReference, CountDownLatch countDownLatch, AtomicReference atomicReference2) {
            this.f8513b = atomicReference;
            this.f8514c = countDownLatch;
            this.f8515d = atomicReference2;
        }

        @Override // qb0.f
        public void h(T t11) {
            this.f8513b.set(t11);
            this.f8514c.countDown();
        }

        @Override // qb0.f
        public void onError(Throwable th2) {
            this.f8515d.set(th2);
            this.f8514c.countDown();
        }
    }

    public a(e<? extends T> eVar) {
        this.f8512a = eVar;
    }

    public static <T> a<T> a(e<? extends T> eVar) {
        return new a<>(eVar);
    }

    public Future<T> b() {
        return rx.internal.operators.e.a(this.f8512a.z0());
    }

    public T c() {
        AtomicReference atomicReference = new AtomicReference();
        AtomicReference atomicReference2 = new AtomicReference();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        d.a(countDownLatch, this.f8512a.j0(new C0147a(atomicReference, countDownLatch, atomicReference2)));
        Throwable th2 = (Throwable) atomicReference2.get();
        if (th2 == null) {
            return (T) atomicReference.get();
        }
        throw vb0.a.c(th2);
    }
}
