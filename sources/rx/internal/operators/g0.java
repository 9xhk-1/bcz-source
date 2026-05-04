package rx.internal.operators;

import java.util.Arrays;
import rx.c;
import rx.exceptions.CompositeException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class g0<T> implements c.a<T> {

    /* renamed from: a, reason: collision with root package name */
    public final qb0.c<? super T> f85362a;

    /* renamed from: b, reason: collision with root package name */
    public final rx.c<T> f85363b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<T> extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public final qb0.g<? super T> f85364a;

        /* renamed from: b, reason: collision with root package name */
        public final qb0.c<? super T> f85365b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f85366c;

        public a(qb0.g<? super T> gVar, qb0.c<? super T> cVar) {
            super(gVar);
            this.f85364a = gVar;
            this.f85365b = cVar;
        }

        @Override // qb0.c
        public void onCompleted() {
            if (this.f85366c) {
                return;
            }
            try {
                this.f85365b.onCompleted();
                this.f85366c = true;
                this.f85364a.onCompleted();
            } catch (Throwable th2) {
                vb0.a.f(th2, this);
            }
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            if (this.f85366c) {
                ac0.c.I(th2);
                return;
            }
            this.f85366c = true;
            try {
                this.f85365b.onError(th2);
                this.f85364a.onError(th2);
            } catch (Throwable th3) {
                vb0.a.e(th3);
                this.f85364a.onError(new CompositeException(Arrays.asList(th2, th3)));
            }
        }

        @Override // qb0.c
        public void onNext(T t11) {
            if (this.f85366c) {
                return;
            }
            try {
                this.f85365b.onNext(t11);
                this.f85364a.onNext(t11);
            } catch (Throwable th2) {
                vb0.a.g(th2, this, t11);
            }
        }
    }

    public g0(rx.c<T> cVar, qb0.c<? super T> cVar2) {
        this.f85363b = cVar;
        this.f85362a = cVar2;
    }

    @Override // wb0.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(qb0.g<? super T> gVar) {
        this.f85363b.J6(new a(gVar, this.f85362a));
    }
}
