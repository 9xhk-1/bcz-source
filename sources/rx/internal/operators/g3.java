package rx.internal.operators;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.TimeUnit;
import rx.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class g3<T> implements c.b<T, T> {

    /* renamed from: a, reason: collision with root package name */
    public final long f85404a;

    /* renamed from: b, reason: collision with root package name */
    public final rx.d f85405b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public Deque<bc0.f<T>> f85406a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ qb0.g f85407b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(qb0.g gVar, qb0.g gVar2) {
            super(gVar);
            this.f85407b = gVar2;
            this.f85406a = new ArrayDeque();
        }

        @Override // qb0.c
        public void onCompleted() {
            q(g3.this.f85405b.b());
            this.f85407b.onCompleted();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            this.f85407b.onError(th2);
        }

        @Override // qb0.c
        public void onNext(T t11) {
            long b11 = g3.this.f85405b.b();
            q(b11);
            this.f85406a.offerLast(new bc0.f<>(b11, t11));
        }

        public final void q(long j11) {
            long j12 = j11 - g3.this.f85404a;
            while (!this.f85406a.isEmpty()) {
                bc0.f<T> first = this.f85406a.getFirst();
                if (first.a() >= j12) {
                    return;
                }
                this.f85406a.removeFirst();
                this.f85407b.onNext(first.b());
            }
        }
    }

    public g3(long j11, TimeUnit timeUnit, rx.d dVar) {
        this.f85404a = timeUnit.toMillis(j11);
        this.f85405b = dVar;
    }

    @Override // wb0.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public qb0.g<? super T> call(qb0.g<? super T> gVar) {
        return new a(gVar, gVar);
    }
}
