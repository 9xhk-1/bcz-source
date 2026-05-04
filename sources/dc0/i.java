package dc0;

import androidx.camera.view.q;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.c;
import rx.internal.operators.v;
import rx.internal.util.unsafe.g0;
import rx.internal.util.unsafe.h0;
import rx.internal.util.unsafe.n0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class i<T> extends f<T, T> {

    /* renamed from: b, reason: collision with root package name */
    public final a<T> f47810b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<T> extends AtomicLong implements qb0.d, qb0.c<T>, c.a<T>, qb0.h {
        private static final long serialVersionUID = -9044104859202255786L;

        /* renamed from: a, reason: collision with root package name */
        public final AtomicReference<qb0.g<? super T>> f47811a = new AtomicReference<>();

        /* renamed from: b, reason: collision with root package name */
        public final Queue<Object> f47812b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f47813c;

        /* renamed from: d, reason: collision with root package name */
        public final AtomicReference<wb0.a> f47814d;

        /* renamed from: e, reason: collision with root package name */
        public Throwable f47815e;

        /* renamed from: f, reason: collision with root package name */
        public volatile boolean f47816f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f47817g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f47818h;

        /* renamed from: i, reason: collision with root package name */
        public volatile boolean f47819i;

        public a(int i11, boolean z11, wb0.a aVar) {
            Queue<Object> g0Var;
            this.f47814d = aVar != null ? new AtomicReference<>(aVar) : null;
            this.f47813c = z11;
            if (i11 > 1) {
                g0Var = n0.f() ? new h0<>(i11) : new rx.internal.util.atomic.g<>(i11);
            } else {
                g0Var = n0.f() ? new g0<>() : new rx.internal.util.atomic.f<>();
            }
            this.f47812b = g0Var;
        }

        @Override // wb0.b
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void call(qb0.g<? super T> gVar) {
            if (!q.a(this.f47811a, null, gVar)) {
                gVar.onError(new IllegalStateException("Only a single subscriber is allowed"));
            } else {
                gVar.add(this);
                gVar.setProducer(this);
            }
        }

        @Override // qb0.h
        public boolean isUnsubscribed() {
            return this.f47816f;
        }

        public boolean n(boolean z11, boolean z12, boolean z13, qb0.g<? super T> gVar) {
            if (gVar.isUnsubscribed()) {
                this.f47812b.clear();
                return true;
            }
            if (!z11) {
                return false;
            }
            Throwable th2 = this.f47815e;
            if (th2 != null && !z13) {
                this.f47812b.clear();
                gVar.onError(th2);
                return true;
            }
            if (!z12) {
                return false;
            }
            if (th2 != null) {
                gVar.onError(th2);
            } else {
                gVar.onCompleted();
            }
            return true;
        }

        @Override // qb0.c
        public void onCompleted() {
            boolean z11;
            if (this.f47816f) {
                return;
            }
            q();
            this.f47816f = true;
            if (!this.f47819i) {
                synchronized (this) {
                    z11 = this.f47819i;
                }
                if (!z11) {
                    r();
                    return;
                }
            }
            this.f47811a.get().onCompleted();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            boolean z11;
            if (this.f47816f) {
                return;
            }
            q();
            this.f47815e = th2;
            this.f47816f = true;
            if (!this.f47819i) {
                synchronized (this) {
                    z11 = this.f47819i;
                }
                if (!z11) {
                    r();
                    return;
                }
            }
            this.f47811a.get().onError(th2);
        }

        @Override // qb0.c
        public void onNext(T t11) {
            boolean z11;
            if (this.f47816f) {
                return;
            }
            if (!this.f47819i) {
                synchronized (this) {
                    try {
                        if (this.f47819i) {
                            z11 = false;
                        } else {
                            this.f47812b.offer(v.j(t11));
                            z11 = true;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (z11) {
                    r();
                    return;
                }
            }
            qb0.g<? super T> gVar = this.f47811a.get();
            try {
                gVar.onNext(t11);
            } catch (Throwable th3) {
                vb0.a.g(th3, gVar, t11);
            }
        }

        public void q() {
            wb0.a aVar;
            AtomicReference<wb0.a> atomicReference = this.f47814d;
            if (atomicReference == null || (aVar = atomicReference.get()) == null || !q.a(atomicReference, aVar, null)) {
                return;
            }
            aVar.call();
        }

        /* JADX WARN: Code restructure failed: missing block: B:49:0x0084, code lost:
        
            if (r7 == false) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x008a, code lost:
        
            if (r0.isEmpty() == false) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x008c, code lost:
        
            r15.f47819i = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x0091, code lost:
        
            r15.f47817g = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x0094, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void r() {
            /*
                r15 = this;
                monitor-enter(r15)
                boolean r0 = r15.f47817g     // Catch: java.lang.Throwable -> La
                r1 = 1
                if (r0 == 0) goto Ld
                r15.f47818h = r1     // Catch: java.lang.Throwable -> La
                monitor-exit(r15)     // Catch: java.lang.Throwable -> La
                return
            La:
                r0 = move-exception
                goto L9c
            Ld:
                r15.f47817g = r1     // Catch: java.lang.Throwable -> La
                monitor-exit(r15)     // Catch: java.lang.Throwable -> La
                java.util.Queue<java.lang.Object> r0 = r15.f47812b
                boolean r2 = r15.f47813c
            L14:
                java.util.concurrent.atomic.AtomicReference<qb0.g<? super T>> r3 = r15.f47811a
                java.lang.Object r3 = r3.get()
                qb0.g r3 = (qb0.g) r3
                r4 = 0
                if (r3 == 0) goto L7e
                boolean r5 = r15.f47816f
                boolean r6 = r0.isEmpty()
                boolean r5 = r15.n(r5, r6, r2, r3)
                if (r5 == 0) goto L2c
                goto L54
            L2c:
                long r5 = r15.get()
                r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r7 != 0) goto L3b
                r7 = r1
                goto L3c
            L3b:
                r7 = r4
            L3c:
                r8 = 0
                r10 = r8
            L3f:
                int r12 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
                if (r12 == 0) goto L73
                boolean r12 = r15.f47816f
                java.lang.Object r13 = r0.poll()
                if (r13 != 0) goto L4d
                r14 = r1
                goto L4e
            L4d:
                r14 = r4
            L4e:
                boolean r12 = r15.n(r12, r14, r2, r3)
                if (r12 == 0) goto L55
            L54:
                return
            L55:
                if (r14 == 0) goto L58
                goto L73
            L58:
                java.lang.Object r12 = rx.internal.operators.v.e(r13)
                r3.onNext(r12)     // Catch: java.lang.Throwable -> L64
                r12 = 1
                long r5 = r5 - r12
                long r10 = r10 + r12
                goto L3f
            L64:
                r1 = move-exception
                r0.clear()
                vb0.a.e(r1)
                java.lang.Throwable r0 = rx.exceptions.OnErrorThrowable.addValueAsLastCause(r1, r12)
                r3.onError(r0)
                return
            L73:
                if (r7 != 0) goto L7f
                int r3 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
                if (r3 == 0) goto L7f
                long r5 = -r10
                r15.addAndGet(r5)
                goto L7f
            L7e:
                r7 = r4
            L7f:
                monitor-enter(r15)
                boolean r3 = r15.f47818h     // Catch: java.lang.Throwable -> L8f
                if (r3 != 0) goto L95
                if (r7 == 0) goto L91
                boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L8f
                if (r0 == 0) goto L91
                r15.f47819i = r1     // Catch: java.lang.Throwable -> L8f
                goto L91
            L8f:
                r0 = move-exception
                goto L9a
            L91:
                r15.f47817g = r4     // Catch: java.lang.Throwable -> L8f
                monitor-exit(r15)     // Catch: java.lang.Throwable -> L8f
                return
            L95:
                r15.f47818h = r4     // Catch: java.lang.Throwable -> L8f
                monitor-exit(r15)     // Catch: java.lang.Throwable -> L8f
                goto L14
            L9a:
                monitor-exit(r15)     // Catch: java.lang.Throwable -> L8f
                throw r0
            L9c:
                monitor-exit(r15)     // Catch: java.lang.Throwable -> La
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: dc0.i.a.r():void");
        }

        @Override // qb0.d
        public void request(long j11) {
            if (j11 < 0) {
                throw new IllegalArgumentException("n >= 0 required");
            }
            if (j11 > 0) {
                rx.internal.operators.a.b(this, j11);
                r();
            } else if (this.f47816f) {
                r();
            }
        }

        @Override // qb0.h
        public void unsubscribe() {
            q();
            this.f47816f = true;
            synchronized (this) {
                try {
                    if (this.f47817g) {
                        return;
                    }
                    this.f47817g = true;
                    this.f47812b.clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public i(a<T> aVar) {
        super(aVar);
        this.f47810b = aVar;
    }

    public static <T> i<T> A7(int i11, wb0.a aVar) {
        return new i<>(new a(i11, false, aVar));
    }

    public static <T> i<T> B7(int i11, wb0.a aVar, boolean z11) {
        return new i<>(new a(i11, z11, aVar));
    }

    public static <T> i<T> C7(boolean z11) {
        return new i<>(new a(16, z11, null));
    }

    public static <T> i<T> y7() {
        return z7(16);
    }

    public static <T> i<T> z7(int i11) {
        return new i<>(new a(i11, false, null));
    }

    @Override // qb0.c
    public void onCompleted() {
        this.f47810b.onCompleted();
    }

    @Override // qb0.c
    public void onError(Throwable th2) {
        this.f47810b.onError(th2);
    }

    @Override // qb0.c
    public void onNext(T t11) {
        this.f47810b.onNext(t11);
    }

    @Override // dc0.f
    public boolean w7() {
        return this.f47810b.f47811a.get() != null;
    }
}
