package rx.internal.operators;

import java.util.ArrayList;
import java.util.List;
import rx.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class q1<T, TClosing> implements c.b<List<T>, T> {

    /* renamed from: a, reason: collision with root package name */
    public final wb0.o<? extends rx.c<? extends TClosing>> f85929a;

    /* renamed from: b, reason: collision with root package name */
    public final int f85930b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements wb0.o<rx.c<? extends TClosing>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ rx.c f85931a;

        public a(rx.c cVar) {
            this.f85931a = cVar;
        }

        @Override // wb0.o, java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.c<? extends TClosing> call() {
            return this.f85931a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends qb0.g<TClosing> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f85933a;

        public b(c cVar) {
            this.f85933a = cVar;
        }

        @Override // qb0.c
        public void onCompleted() {
            this.f85933a.onCompleted();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            this.f85933a.onError(th2);
        }

        @Override // qb0.c
        public void onNext(TClosing tclosing) {
            this.f85933a.q();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class c extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public final qb0.g<? super List<T>> f85935a;

        /* renamed from: b, reason: collision with root package name */
        public List<T> f85936b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f85937c;

        public c(qb0.g<? super List<T>> gVar) {
            this.f85935a = gVar;
            this.f85936b = new ArrayList(q1.this.f85930b);
        }

        @Override // qb0.c
        public void onCompleted() {
            try {
                synchronized (this) {
                    try {
                        if (this.f85937c) {
                            return;
                        }
                        this.f85937c = true;
                        List<T> list = this.f85936b;
                        this.f85936b = null;
                        this.f85935a.onNext(list);
                        this.f85935a.onCompleted();
                        unsubscribe();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                vb0.a.f(th3, this.f85935a);
            }
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            synchronized (this) {
                try {
                    if (this.f85937c) {
                        return;
                    }
                    this.f85937c = true;
                    this.f85936b = null;
                    this.f85935a.onError(th2);
                    unsubscribe();
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // qb0.c
        public void onNext(T t11) {
            synchronized (this) {
                try {
                    if (this.f85937c) {
                        return;
                    }
                    this.f85936b.add(t11);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void q() {
            synchronized (this) {
                try {
                    if (this.f85937c) {
                        return;
                    }
                    List<T> list = this.f85936b;
                    this.f85936b = new ArrayList(q1.this.f85930b);
                    try {
                        this.f85935a.onNext(list);
                    } catch (Throwable th2) {
                        unsubscribe();
                        synchronized (this) {
                            try {
                                if (this.f85937c) {
                                    return;
                                }
                                this.f85937c = true;
                                vb0.a.f(th2, this.f85935a);
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            }
        }
    }

    public q1(wb0.o<? extends rx.c<? extends TClosing>> oVar, int i11) {
        this.f85929a = oVar;
        this.f85930b = i11;
    }

    @Override // wb0.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public qb0.g<? super T> call(qb0.g<? super List<T>> gVar) {
        try {
            rx.c<? extends TClosing> call = this.f85929a.call();
            c cVar = new c(new zb0.g(gVar));
            b bVar = new b(cVar);
            gVar.add(bVar);
            gVar.add(cVar);
            call.J6(bVar);
            return cVar;
        } catch (Throwable th2) {
            vb0.a.f(th2, gVar);
            return zb0.h.d();
        }
    }

    public q1(rx.c<? extends TClosing> cVar, int i11) {
        this.f85929a = new a(cVar);
        this.f85930b = i11;
    }
}
