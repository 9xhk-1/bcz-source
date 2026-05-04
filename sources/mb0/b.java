package mb0;

import java.util.concurrent.atomic.AtomicInteger;
import lb0.y;
import rx.exceptions.CompositeException;
import rx.exceptions.OnCompletedFailedException;
import rx.exceptions.OnErrorFailedException;
import rx.exceptions.OnErrorNotImplementedException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class b<T> extends AtomicInteger implements qb0.h, qb0.d {

    /* renamed from: e, reason: collision with root package name */
    public static final int f73067e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static final int f73068f = 1;

    /* renamed from: g, reason: collision with root package name */
    public static final int f73069g = 2;

    /* renamed from: h, reason: collision with root package name */
    public static final int f73070h = 3;

    /* renamed from: a, reason: collision with root package name */
    public final lb0.b<T> f73071a;

    /* renamed from: b, reason: collision with root package name */
    public final qb0.g<? super y<T>> f73072b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f73073c;

    /* renamed from: d, reason: collision with root package name */
    public volatile y<T> f73074d;

    public b(lb0.b<T> bVar, qb0.g<? super y<T>> gVar) {
        super(0);
        this.f73071a = bVar;
        this.f73072b = gVar;
    }

    public final void a(y<T> yVar) {
        try {
            if (!isUnsubscribed()) {
                this.f73072b.onNext(yVar);
            }
            try {
                if (isUnsubscribed()) {
                    return;
                }
                this.f73072b.onCompleted();
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
                ac0.f.c().b().a(th2);
            }
        } catch (OnCompletedFailedException e14) {
            e = e14;
            ac0.f.c().b().a(e);
        } catch (OnErrorFailedException e15) {
            e = e15;
            ac0.f.c().b().a(e);
        } catch (OnErrorNotImplementedException e16) {
            e = e16;
            ac0.f.c().b().a(e);
        } catch (Throwable th3) {
            vb0.a.e(th3);
            try {
                this.f73072b.onError(th3);
            } catch (OnCompletedFailedException e17) {
                e = e17;
                ac0.f.c().b().a(e);
            } catch (OnErrorFailedException e18) {
                e = e18;
                ac0.f.c().b().a(e);
            } catch (OnErrorNotImplementedException e19) {
                e = e19;
                ac0.f.c().b().a(e);
            } catch (Throwable th4) {
                vb0.a.e(th4);
                ac0.f.c().b().a(new CompositeException(th3, th4));
            }
        }
    }

    public void b(Throwable th2) {
        set(3);
        if (isUnsubscribed()) {
            return;
        }
        try {
            this.f73072b.onError(th2);
        } catch (OnCompletedFailedException e11) {
            e = e11;
            ac0.f.c().b().a(e);
        } catch (OnErrorFailedException e12) {
            e = e12;
            ac0.f.c().b().a(e);
        } catch (OnErrorNotImplementedException e13) {
            e = e13;
            ac0.f.c().b().a(e);
        } catch (Throwable th3) {
            vb0.a.e(th3);
            ac0.f.c().b().a(new CompositeException(th2, th3));
        }
    }

    public void c(y<T> yVar) {
        while (true) {
            int i11 = get();
            if (i11 == 0) {
                this.f73074d = yVar;
                if (compareAndSet(0, 2)) {
                    return;
                }
            } else {
                if (i11 != 1) {
                    if (i11 == 2 || i11 == 3) {
                        throw new AssertionError();
                    }
                    throw new IllegalStateException("Unknown state: " + i11);
                }
                if (compareAndSet(1, 3)) {
                    a(yVar);
                    return;
                }
            }
        }
    }

    @Override // qb0.h
    public boolean isUnsubscribed() {
        return this.f73073c;
    }

    @Override // qb0.d
    public void request(long j11) {
        if (j11 == 0) {
            return;
        }
        while (true) {
            int i11 = get();
            if (i11 != 0) {
                if (i11 == 1) {
                    return;
                }
                if (i11 != 2) {
                    if (i11 == 3) {
                        return;
                    }
                    throw new IllegalStateException("Unknown state: " + i11);
                }
                if (compareAndSet(2, 3)) {
                    a(this.f73074d);
                    return;
                }
            } else if (compareAndSet(0, 1)) {
                return;
            }
        }
    }

    @Override // qb0.h
    public void unsubscribe() {
        this.f73073c = true;
        this.f73071a.cancel();
    }
}
