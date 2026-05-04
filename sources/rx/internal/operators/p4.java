package rx.internal.operators;

import java.util.NoSuchElementException;
import rx.c;
import rx.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class p4<T> implements e.t<T> {

    /* renamed from: a, reason: collision with root package name */
    public final c.a<T> f85914a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<T> extends qb0.g<T> {

        /* renamed from: d, reason: collision with root package name */
        public static final int f85915d = 0;

        /* renamed from: e, reason: collision with root package name */
        public static final int f85916e = 1;

        /* renamed from: f, reason: collision with root package name */
        public static final int f85917f = 2;

        /* renamed from: a, reason: collision with root package name */
        public final qb0.f<? super T> f85918a;

        /* renamed from: b, reason: collision with root package name */
        public T f85919b;

        /* renamed from: c, reason: collision with root package name */
        public int f85920c;

        public a(qb0.f<? super T> fVar) {
            this.f85918a = fVar;
        }

        @Override // qb0.c
        public void onCompleted() {
            int i11 = this.f85920c;
            if (i11 == 0) {
                this.f85918a.onError(new NoSuchElementException());
            } else if (i11 == 1) {
                this.f85920c = 2;
                T t11 = this.f85919b;
                this.f85919b = null;
                this.f85918a.h(t11);
            }
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            if (this.f85920c == 2) {
                ac0.c.I(th2);
            } else {
                this.f85919b = null;
                this.f85918a.onError(th2);
            }
        }

        @Override // qb0.c
        public void onNext(T t11) {
            int i11 = this.f85920c;
            if (i11 == 0) {
                this.f85920c = 1;
                this.f85919b = t11;
            } else if (i11 == 1) {
                this.f85920c = 2;
                this.f85918a.onError(new IndexOutOfBoundsException("The upstream produced more than one value"));
            }
        }
    }

    public p4(c.a<T> aVar) {
        this.f85914a = aVar;
    }

    @Override // wb0.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(qb0.f<? super T> fVar) {
        a aVar = new a(fVar);
        fVar.b(aVar);
        this.f85914a.call(aVar);
    }
}
