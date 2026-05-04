package mb0;

import lb0.y;
import retrofit2.adapter.rxjava.HttpException;
import rx.c;
import rx.exceptions.CompositeException;
import rx.exceptions.OnCompletedFailedException;
import rx.exceptions.OnErrorFailedException;
import rx.exceptions.OnErrorNotImplementedException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class a<T> implements c.a<T> {

    /* renamed from: a, reason: collision with root package name */
    public final c.a<y<T>> f73064a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: mb0.a$a, reason: collision with other inner class name */
    public static class C0883a<R> extends qb0.g<y<R>> {

        /* renamed from: a, reason: collision with root package name */
        public final qb0.g<? super R> f73065a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f73066b;

        public C0883a(qb0.g<? super R> gVar) {
            super(gVar);
            this.f73065a = gVar;
        }

        @Override // qb0.c
        public void onCompleted() {
            if (this.f73066b) {
                return;
            }
            this.f73065a.onCompleted();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            if (!this.f73066b) {
                this.f73065a.onError(th2);
                return;
            }
            AssertionError assertionError = new AssertionError("This should never happen! Report as a Retrofit bug with the full stacktrace.");
            assertionError.initCause(th2);
            ac0.f.c().b().a(assertionError);
        }

        @Override // qb0.c
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void onNext(y<R> yVar) {
            if (yVar.g()) {
                this.f73065a.onNext(yVar.a());
                return;
            }
            this.f73066b = true;
            HttpException httpException = new HttpException(yVar);
            try {
                this.f73065a.onError(httpException);
            } catch (OnCompletedFailedException e11) {
                e = e11;
                ac0.f.c().b().a(e);
            } catch (OnErrorFailedException e12) {
                e = e12;
                ac0.f.c().b().a(e);
            } catch (OnErrorNotImplementedException e13) {
                e = e13;
                ac0.f.c().b().a(e);
            } catch (Throwable th2) {
                vb0.a.e(th2);
                ac0.f.c().b().a(new CompositeException(httpException, th2));
            }
        }
    }

    public a(c.a<y<T>> aVar) {
        this.f73064a = aVar;
    }

    @Override // wb0.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(qb0.g<? super T> gVar) {
        this.f73064a.call(new C0883a(gVar));
    }
}
