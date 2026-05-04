package rx.internal.operators;

import java.util.concurrent.TimeUnit;
import rx.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class s3<T> implements c.b<T, T> {

    /* renamed from: a, reason: collision with root package name */
    public final long f86055a;

    /* renamed from: b, reason: collision with root package name */
    public final rx.d f86056b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public long f86057a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ qb0.g f86058b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(qb0.g gVar, qb0.g gVar2) {
            super(gVar);
            this.f86058b = gVar2;
            this.f86057a = -1L;
        }

        @Override // qb0.c
        public void onCompleted() {
            this.f86058b.onCompleted();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            this.f86058b.onError(th2);
        }

        @Override // qb0.c
        public void onNext(T t11) {
            long b11 = s3.this.f86056b.b();
            long j11 = this.f86057a;
            if (j11 == -1 || b11 < j11 || b11 - j11 >= s3.this.f86055a) {
                this.f86057a = b11;
                this.f86058b.onNext(t11);
            }
        }

        @Override // qb0.g
        public void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    public s3(long j11, TimeUnit timeUnit, rx.d dVar) {
        this.f86055a = timeUnit.toMillis(j11);
        this.f86056b = dVar;
    }

    @Override // wb0.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public qb0.g<? super T> call(qb0.g<? super T> gVar) {
        return new a(gVar, gVar);
    }
}
