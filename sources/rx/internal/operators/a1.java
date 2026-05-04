package rx.internal.operators;

import java.util.NoSuchElementException;
import rx.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class a1<T> implements e.t<T> {

    /* renamed from: a, reason: collision with root package name */
    public final rx.c<T> f85057a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public boolean f85058a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f85059b;

        /* renamed from: c, reason: collision with root package name */
        public T f85060c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ qb0.f f85061d;

        public a(qb0.f fVar) {
            this.f85061d = fVar;
        }

        @Override // qb0.c
        public void onCompleted() {
            if (this.f85058a) {
                return;
            }
            if (this.f85059b) {
                this.f85061d.h(this.f85060c);
            } else {
                this.f85061d.onError(new NoSuchElementException("Observable emitted no items"));
            }
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            this.f85061d.onError(th2);
            unsubscribe();
        }

        @Override // qb0.c
        public void onNext(T t11) {
            if (!this.f85059b) {
                this.f85059b = true;
                this.f85060c = t11;
            } else {
                this.f85058a = true;
                this.f85061d.onError(new IllegalArgumentException("Observable emitted too many elements"));
                unsubscribe();
            }
        }

        @Override // qb0.g
        public void onStart() {
            request(2L);
        }
    }

    public a1(rx.c<T> cVar) {
        this.f85057a = cVar;
    }

    public static <T> a1<T> b(rx.c<T> cVar) {
        return new a1<>(cVar);
    }

    @Override // wb0.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(qb0.f<? super T> fVar) {
        a aVar = new a(fVar);
        fVar.b(aVar);
        this.f85057a.J6(aVar);
    }
}
