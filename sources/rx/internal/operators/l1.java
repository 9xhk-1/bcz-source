package rx.internal.operators;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import rx.c;
import rx.internal.producers.SingleProducer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class l1 {
    public l1() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> c.a<T> a(Future<? extends T> future) {
        return new a(future);
    }

    public static <T> c.a<T> b(Future<? extends T> future, long j11, TimeUnit timeUnit) {
        return new a(future, j11, timeUnit);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a<T> implements c.a<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Future<? extends T> f85689a;

        /* renamed from: b, reason: collision with root package name */
        public final long f85690b;

        /* renamed from: c, reason: collision with root package name */
        public final TimeUnit f85691c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: rx.internal.operators.l1$a$a, reason: collision with other inner class name */
        public class C1091a implements wb0.a {
            public C1091a() {
            }

            @Override // wb0.a
            public void call() {
                a.this.f85689a.cancel(true);
            }
        }

        public a(Future<? extends T> future) {
            this.f85689a = future;
            this.f85690b = 0L;
            this.f85691c = null;
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(qb0.g<? super T> gVar) {
            gVar.add(ec0.f.a(new C1091a()));
            try {
                if (gVar.isUnsubscribed()) {
                    return;
                }
                TimeUnit timeUnit = this.f85691c;
                gVar.setProducer(new SingleProducer(gVar, timeUnit == null ? this.f85689a.get() : this.f85689a.get(this.f85690b, timeUnit)));
            } catch (Throwable th2) {
                if (gVar.isUnsubscribed()) {
                    return;
                }
                vb0.a.f(th2, gVar);
            }
        }

        public a(Future<? extends T> future, long j11, TimeUnit timeUnit) {
            this.f85689a = future;
            this.f85690b = j11;
            this.f85691c = timeUnit;
        }
    }
}
