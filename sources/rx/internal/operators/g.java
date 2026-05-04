package rx.internal.operators;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import rx.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class g<T> extends dc0.f<T, T> {

    /* renamed from: d, reason: collision with root package name */
    public static final qb0.c f85354d = new a();

    /* renamed from: b, reason: collision with root package name */
    public final c<T> f85355b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f85356c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b<T> implements c.a<T> {

        /* renamed from: a, reason: collision with root package name */
        public final c<T> f85357a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements wb0.a {
            public a() {
            }

            @Override // wb0.a
            public void call() {
                b.this.f85357a.set(g.f85354d);
            }
        }

        public b(c<T> cVar) {
            this.f85357a = cVar;
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(qb0.g<? super T> gVar) {
            boolean z11;
            if (!this.f85357a.a(null, gVar)) {
                gVar.onError(new IllegalStateException("Only one subscriber allowed!"));
                return;
            }
            gVar.add(ec0.f.a(new a()));
            synchronized (this.f85357a.f85359a) {
                try {
                    c<T> cVar = this.f85357a;
                    if (cVar.f85360b) {
                        z11 = false;
                    } else {
                        z11 = true;
                        cVar.f85360b = true;
                    }
                } finally {
                }
            }
            if (!z11) {
                return;
            }
            while (true) {
                Object poll = this.f85357a.f85361c.poll();
                if (poll != null) {
                    v.a(this.f85357a.get(), poll);
                } else {
                    synchronized (this.f85357a.f85359a) {
                        try {
                            if (this.f85357a.f85361c.isEmpty()) {
                                this.f85357a.f85360b = false;
                                return;
                            }
                        } finally {
                        }
                    }
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c<T> extends AtomicReference<qb0.c<? super T>> {
        private static final long serialVersionUID = 8026705089538090368L;

        /* renamed from: b, reason: collision with root package name */
        public boolean f85360b;

        /* renamed from: a, reason: collision with root package name */
        public final Object f85359a = new Object();

        /* renamed from: c, reason: collision with root package name */
        public final ConcurrentLinkedQueue<Object> f85361c = new ConcurrentLinkedQueue<>();

        public boolean a(qb0.c<? super T> cVar, qb0.c<? super T> cVar2) {
            return compareAndSet(cVar, cVar2);
        }
    }

    public g(c<T> cVar) {
        super(new b(cVar));
        this.f85355b = cVar;
    }

    public static <T> g<T> y7() {
        return new g<>(new c());
    }

    @Override // qb0.c
    public void onCompleted() {
        if (this.f85356c) {
            this.f85355b.get().onCompleted();
        } else {
            z7(v.b());
        }
    }

    @Override // qb0.c
    public void onError(Throwable th2) {
        if (this.f85356c) {
            this.f85355b.get().onError(th2);
        } else {
            z7(v.c(th2));
        }
    }

    @Override // qb0.c
    public void onNext(T t11) {
        if (this.f85356c) {
            this.f85355b.get().onNext(t11);
        } else {
            z7(v.j(t11));
        }
    }

    @Override // dc0.f
    public boolean w7() {
        boolean z11;
        synchronized (this.f85355b.f85359a) {
            z11 = this.f85355b.get() != null;
        }
        return z11;
    }

    public final void z7(Object obj) {
        synchronized (this.f85355b.f85359a) {
            try {
                this.f85355b.f85361c.add(obj);
                if (this.f85355b.get() != null) {
                    c<T> cVar = this.f85355b;
                    if (!cVar.f85360b) {
                        this.f85356c = true;
                        cVar.f85360b = true;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!this.f85356c) {
            return;
        }
        while (true) {
            Object poll = this.f85355b.f85361c.poll();
            if (poll == null) {
                return;
            } else {
                v.a(this.f85355b.get(), poll);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements qb0.c {
        @Override // qb0.c
        public void onCompleted() {
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
        }

        @Override // qb0.c
        public void onNext(Object obj) {
        }
    }
}
