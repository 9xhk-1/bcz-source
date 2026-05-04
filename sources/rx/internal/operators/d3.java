package rx.internal.operators;

import java.util.NoSuchElementException;
import rx.c;
import rx.internal.producers.SingleProducer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class d3<T> implements c.b<T, T> {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f85258a;

    /* renamed from: b, reason: collision with root package name */
    public final T f85259b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final d3<?> f85260a = new d3<>();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b<T> extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public final qb0.g<? super T> f85261a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f85262b;

        /* renamed from: c, reason: collision with root package name */
        public final T f85263c;

        /* renamed from: d, reason: collision with root package name */
        public T f85264d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f85265e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f85266f;

        public b(qb0.g<? super T> gVar, boolean z11, T t11) {
            this.f85261a = gVar;
            this.f85262b = z11;
            this.f85263c = t11;
            request(2L);
        }

        @Override // qb0.c
        public void onCompleted() {
            if (this.f85266f) {
                return;
            }
            if (this.f85265e) {
                this.f85261a.setProducer(new SingleProducer(this.f85261a, this.f85264d));
            } else if (this.f85262b) {
                this.f85261a.setProducer(new SingleProducer(this.f85261a, this.f85263c));
            } else {
                this.f85261a.onError(new NoSuchElementException("Sequence contains no elements"));
            }
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            if (this.f85266f) {
                ac0.c.I(th2);
            } else {
                this.f85261a.onError(th2);
            }
        }

        @Override // qb0.c
        public void onNext(T t11) {
            if (this.f85266f) {
                return;
            }
            if (!this.f85265e) {
                this.f85264d = t11;
                this.f85265e = true;
            } else {
                this.f85266f = true;
                this.f85261a.onError(new IllegalArgumentException("Sequence contains too many elements"));
                unsubscribe();
            }
        }
    }

    public d3() {
        this(false, null);
    }

    public static <T> d3<T> b() {
        return (d3<T>) a.f85260a;
    }

    @Override // wb0.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public qb0.g<? super T> call(qb0.g<? super T> gVar) {
        b bVar = new b(gVar, this.f85258a, this.f85259b);
        gVar.add(bVar);
        return bVar;
    }

    public d3(T t11) {
        this(true, t11);
    }

    public d3(boolean z11, T t11) {
        this.f85258a = z11;
        this.f85259b = t11;
    }
}
