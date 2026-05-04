package mb0;

import lb0.y;
import rx.c;
import rx.exceptions.CompositeException;
import rx.exceptions.OnCompletedFailedException;
import rx.exceptions.OnErrorFailedException;
import rx.exceptions.OnErrorNotImplementedException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class f<T> implements c.a<e<T>> {

    /* renamed from: a, reason: collision with root package name */
    public final c.a<y<T>> f73081a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a<R> extends qb0.g<y<R>> {

        /* renamed from: a, reason: collision with root package name */
        public final qb0.g<? super e<R>> f73082a;

        public a(qb0.g<? super e<R>> gVar) {
            super(gVar);
            this.f73082a = gVar;
        }

        @Override // qb0.c
        public void onCompleted() {
            this.f73082a.onCompleted();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            try {
                this.f73082a.onNext(e.b(th2));
                this.f73082a.onCompleted();
            } catch (Throwable th3) {
                try {
                    this.f73082a.onError(th3);
                } catch (OnCompletedFailedException e11) {
                    e = e11;
                    ac0.f.c().b().a(e);
                } catch (OnErrorFailedException e12) {
                    e = e12;
                    ac0.f.c().b().a(e);
                } catch (OnErrorNotImplementedException e13) {
                    e = e13;
                    ac0.f.c().b().a(e);
                } catch (Throwable th4) {
                    vb0.a.e(th4);
                    ac0.f.c().b().a(new CompositeException(th3, th4));
                }
            }
        }

        @Override // qb0.c
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void onNext(y<R> yVar) {
            this.f73082a.onNext(e.e(yVar));
        }
    }

    public f(c.a<y<T>> aVar) {
        this.f73081a = aVar;
    }

    @Override // wb0.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(qb0.g<? super e<T>> gVar) {
        this.f73081a.call(new a(gVar));
    }
}
