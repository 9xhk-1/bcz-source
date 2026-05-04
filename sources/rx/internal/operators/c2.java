package rx.internal.operators;

import rx.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class c2<T> implements c.b<T, T> {

    /* renamed from: a, reason: collision with root package name */
    public final wb0.a f85189a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ qb0.g f85190a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(qb0.g gVar, qb0.g gVar2) {
            super(gVar);
            this.f85190a = gVar2;
        }

        @Override // qb0.c
        public void onCompleted() {
            try {
                this.f85190a.onCompleted();
            } finally {
                q();
            }
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            try {
                this.f85190a.onError(th2);
            } finally {
                q();
            }
        }

        @Override // qb0.c
        public void onNext(T t11) {
            this.f85190a.onNext(t11);
        }

        public void q() {
            try {
                c2.this.f85189a.call();
            } catch (Throwable th2) {
                vb0.a.e(th2);
                ac0.c.I(th2);
            }
        }
    }

    public c2(wb0.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Action can not be null");
        }
        this.f85189a = aVar;
    }

    @Override // wb0.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public qb0.g<? super T> call(qb0.g<? super T> gVar) {
        return new a(gVar, gVar);
    }
}
