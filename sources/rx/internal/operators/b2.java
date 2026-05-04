package rx.internal.operators;

import rx.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class b2<T, U> implements c.b<T, T>, wb0.q<U, U, Boolean> {

    /* renamed from: a, reason: collision with root package name */
    public final wb0.p<? super T, ? extends U> f85137a;

    /* renamed from: b, reason: collision with root package name */
    public final wb0.q<? super U, ? super U, Boolean> f85138b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public U f85139a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f85140b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ qb0.g f85141c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(qb0.g gVar, qb0.g gVar2) {
            super(gVar);
            this.f85141c = gVar2;
        }

        @Override // qb0.c
        public void onCompleted() {
            this.f85141c.onCompleted();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            this.f85141c.onError(th2);
        }

        @Override // qb0.c
        public void onNext(T t11) {
            try {
                U call = b2.this.f85137a.call(t11);
                U u11 = this.f85139a;
                this.f85139a = call;
                if (!this.f85140b) {
                    this.f85140b = true;
                    this.f85141c.onNext(t11);
                    return;
                }
                try {
                    if (b2.this.f85138b.call(u11, call).booleanValue()) {
                        request(1L);
                    } else {
                        this.f85141c.onNext(t11);
                    }
                } catch (Throwable th2) {
                    vb0.a.g(th2, this.f85141c, call);
                }
            } catch (Throwable th3) {
                vb0.a.g(th3, this.f85141c, t11);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b2<?, ?> f85143a = new b2<>(rx.internal.util.o.c());
    }

    public b2(wb0.p<? super T, ? extends U> pVar) {
        this.f85137a = pVar;
        this.f85138b = this;
    }

    public static <T> b2<T, T> h() {
        return (b2<T, T>) b.f85143a;
    }

    @Override // wb0.q
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Boolean call(U u11, U u12) {
        return Boolean.valueOf(u11 == u12 || (u11 != null && u11.equals(u12)));
    }

    @Override // wb0.p
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public qb0.g<? super T> call(qb0.g<? super T> gVar) {
        return new a(gVar, gVar);
    }

    public b2(wb0.q<? super U, ? super U, Boolean> qVar) {
        this.f85137a = rx.internal.util.o.c();
        this.f85138b = qVar;
    }
}
