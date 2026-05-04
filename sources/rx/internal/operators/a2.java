package rx.internal.operators;

import java.util.HashSet;
import java.util.Set;
import rx.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class a2<T, U> implements c.b<T, T> {

    /* renamed from: a, reason: collision with root package name */
    public final wb0.p<? super T, ? extends U> f85063a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public Set<U> f85064a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ qb0.g f85065b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(qb0.g gVar, qb0.g gVar2) {
            super(gVar);
            this.f85065b = gVar2;
            this.f85064a = new HashSet();
        }

        @Override // qb0.c
        public void onCompleted() {
            this.f85064a = null;
            this.f85065b.onCompleted();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            this.f85064a = null;
            this.f85065b.onError(th2);
        }

        @Override // qb0.c
        public void onNext(T t11) {
            if (this.f85064a.add(a2.this.f85063a.call(t11))) {
                this.f85065b.onNext(t11);
            } else {
                request(1L);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final a2<?, ?> f85067a = new a2<>(rx.internal.util.o.c());
    }

    public a2(wb0.p<? super T, ? extends U> pVar) {
        this.f85063a = pVar;
    }

    public static <T> a2<T, T> b() {
        return (a2<T, T>) b.f85067a;
    }

    @Override // wb0.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public qb0.g<? super T> call(qb0.g<? super T> gVar) {
        return new a(gVar, gVar);
    }
}
