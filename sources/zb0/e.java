package zb0;

import java.util.Arrays;
import rx.exceptions.CompositeException;
import rx.exceptions.OnCompletedFailedException;
import rx.exceptions.OnErrorFailedException;
import rx.exceptions.OnErrorNotImplementedException;
import rx.exceptions.UnsubscribeFailedException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class e<T> extends qb0.g<T> {

    /* renamed from: a, reason: collision with root package name */
    public final qb0.g<? super T> f102513a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f102514b;

    public e(qb0.g<? super T> gVar) {
        super(gVar);
        this.f102513a = gVar;
    }

    public qb0.g<? super T> C() {
        return this.f102513a;
    }

    @Override // qb0.c
    public void onCompleted() {
        UnsubscribeFailedException unsubscribeFailedException;
        if (this.f102514b) {
            return;
        }
        this.f102514b = true;
        try {
            this.f102513a.onCompleted();
            try {
                unsubscribe();
            } finally {
            }
        } catch (Throwable th2) {
            try {
                vb0.a.e(th2);
                ac0.c.I(th2);
                throw new OnCompletedFailedException(th2.getMessage(), th2);
            } catch (Throwable th3) {
                try {
                    unsubscribe();
                    throw th3;
                } finally {
                }
            }
        }
    }

    @Override // qb0.c
    public void onError(Throwable th2) {
        vb0.a.e(th2);
        if (this.f102514b) {
            return;
        }
        this.f102514b = true;
        q(th2);
    }

    @Override // qb0.c
    public void onNext(T t11) {
        try {
            if (this.f102514b) {
                return;
            }
            this.f102513a.onNext(t11);
        } catch (Throwable th2) {
            vb0.a.f(th2, this);
        }
    }

    public void q(Throwable th2) {
        ac0.f.c().b().a(th2);
        try {
            this.f102513a.onError(th2);
            try {
                unsubscribe();
            } catch (Throwable th3) {
                ac0.c.I(th3);
                throw new OnErrorFailedException(th3);
            }
        } catch (OnErrorNotImplementedException e11) {
            try {
                unsubscribe();
                throw e11;
            } catch (Throwable th4) {
                ac0.c.I(th4);
                throw new OnErrorNotImplementedException("Observer.onError not implemented and error while unsubscribing.", new CompositeException(Arrays.asList(th2, th4)));
            }
        } catch (Throwable th5) {
            ac0.c.I(th5);
            try {
                unsubscribe();
                throw new OnErrorFailedException("Error occurred when trying to propagate error to Observer.onError", new CompositeException(Arrays.asList(th2, th5)));
            } catch (Throwable th6) {
                ac0.c.I(th6);
                throw new OnErrorFailedException("Error occurred when trying to propagate error to Observer.onError and during unsubscription.", new CompositeException(Arrays.asList(th2, th5, th6)));
            }
        }
    }
}
