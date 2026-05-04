package rx.internal.operators;

import rx.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class e3<T> implements c.b<T, T> {

    /* renamed from: a, reason: collision with root package name */
    public final int f85291a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public int f85292a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ qb0.g f85293b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(qb0.g gVar, qb0.g gVar2) {
            super(gVar);
            this.f85293b = gVar2;
        }

        @Override // qb0.c
        public void onCompleted() {
            this.f85293b.onCompleted();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            this.f85293b.onError(th2);
        }

        @Override // qb0.c
        public void onNext(T t11) {
            int i11 = this.f85292a;
            if (i11 >= e3.this.f85291a) {
                this.f85293b.onNext(t11);
            } else {
                this.f85292a = i11 + 1;
            }
        }

        @Override // qb0.g
        public void setProducer(qb0.d dVar) {
            this.f85293b.setProducer(dVar);
            dVar.request(e3.this.f85291a);
        }
    }

    public e3(int i11) {
        if (i11 >= 0) {
            this.f85291a = i11;
            return;
        }
        throw new IllegalArgumentException("n >= 0 required but it was " + i11);
    }

    @Override // wb0.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public qb0.g<? super T> call(qb0.g<? super T> gVar) {
        return new a(gVar, gVar);
    }
}
