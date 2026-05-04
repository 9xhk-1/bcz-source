package rx.internal.operators;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.c;
import rx.internal.util.ExceptionsUtils;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class j0<T, R> implements c.a<R> {

    /* renamed from: a, reason: collision with root package name */
    public final rx.c<T> f85540a;

    /* renamed from: b, reason: collision with root package name */
    public final wb0.p<? super T, ? extends rx.e<? extends R>> f85541b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f85542c;

    /* renamed from: d, reason: collision with root package name */
    public final int f85543d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<T, R> extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public final qb0.g<? super R> f85544a;

        /* renamed from: b, reason: collision with root package name */
        public final wb0.p<? super T, ? extends rx.e<? extends R>> f85545b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f85546c;

        /* renamed from: d, reason: collision with root package name */
        public final int f85547d;

        /* renamed from: i, reason: collision with root package name */
        public final Queue<Object> f85552i;

        /* renamed from: k, reason: collision with root package name */
        public volatile boolean f85554k;

        /* renamed from: l, reason: collision with root package name */
        public volatile boolean f85555l;

        /* renamed from: e, reason: collision with root package name */
        public final AtomicInteger f85548e = new AtomicInteger();

        /* renamed from: h, reason: collision with root package name */
        public final AtomicReference<Throwable> f85551h = new AtomicReference<>();

        /* renamed from: j, reason: collision with root package name */
        public final a<T, R>.b f85553j = new b();

        /* renamed from: g, reason: collision with root package name */
        public final ec0.b f85550g = new ec0.b();

        /* renamed from: f, reason: collision with root package name */
        public final AtomicInteger f85549f = new AtomicInteger();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: rx.internal.operators.j0$a$a, reason: collision with other inner class name */
        public final class C1087a extends qb0.f<R> {
            public C1087a() {
            }

            @Override // qb0.f
            public void h(R r11) {
                a.this.D(this, r11);
            }

            @Override // qb0.f
            public void onError(Throwable th2) {
                a.this.C(this, th2);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public final class b extends AtomicLong implements qb0.d, qb0.h {
            private static final long serialVersionUID = -887187595446742742L;

            public b() {
            }

            public void a(long j11) {
                rx.internal.operators.a.i(this, j11);
            }

            @Override // qb0.h
            public boolean isUnsubscribed() {
                return a.this.f85555l;
            }

            @Override // qb0.d
            public void request(long j11) {
                if (j11 > 0) {
                    rx.internal.operators.a.b(this, j11);
                    a.this.q();
                }
            }

            @Override // qb0.h
            public void unsubscribe() {
                a.this.f85555l = true;
                a.this.unsubscribe();
                if (a.this.f85548e.getAndIncrement() == 0) {
                    a.this.f85552i.clear();
                }
            }
        }

        public a(qb0.g<? super R> gVar, wb0.p<? super T, ? extends rx.e<? extends R>> pVar, boolean z11, int i11) {
            this.f85544a = gVar;
            this.f85545b = pVar;
            this.f85546c = z11;
            this.f85547d = i11;
            if (rx.internal.util.unsafe.n0.f()) {
                this.f85552i = new rx.internal.util.unsafe.o();
            } else {
                this.f85552i = new rx.internal.util.atomic.c();
            }
            request(i11 != Integer.MAX_VALUE ? i11 : Long.MAX_VALUE);
        }

        public void C(a<T, R>.C1087a c1087a, Throwable th2) {
            if (this.f85546c) {
                ExceptionsUtils.addThrowable(this.f85551h, th2);
                this.f85550g.e(c1087a);
                if (!this.f85554k && this.f85547d != Integer.MAX_VALUE) {
                    request(1L);
                }
            } else {
                this.f85550g.unsubscribe();
                unsubscribe();
                if (!androidx.camera.view.q.a(this.f85551h, null, th2)) {
                    ac0.c.I(th2);
                    return;
                }
                this.f85554k = true;
            }
            this.f85549f.decrementAndGet();
            q();
        }

        public void D(a<T, R>.C1087a c1087a, R r11) {
            this.f85552i.offer(v.j(r11));
            this.f85550g.e(c1087a);
            this.f85549f.decrementAndGet();
            q();
        }

        @Override // qb0.c
        public void onCompleted() {
            this.f85554k = true;
            q();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            if (this.f85546c) {
                ExceptionsUtils.addThrowable(this.f85551h, th2);
            } else {
                this.f85550g.unsubscribe();
                if (!androidx.camera.view.q.a(this.f85551h, null, th2)) {
                    ac0.c.I(th2);
                    return;
                }
            }
            this.f85554k = true;
            q();
        }

        @Override // qb0.c
        public void onNext(T t11) {
            try {
                rx.e<? extends R> call = this.f85545b.call(t11);
                if (call == null) {
                    throw new NullPointerException("The mapper returned a null Single");
                }
                C1087a c1087a = new C1087a();
                this.f85550g.a(c1087a);
                this.f85549f.incrementAndGet();
                call.j0(c1087a);
            } catch (Throwable th2) {
                vb0.a.e(th2);
                unsubscribe();
                onError(th2);
            }
        }

        public void q() {
            if (this.f85548e.getAndIncrement() != 0) {
                return;
            }
            qb0.g<? super R> gVar = this.f85544a;
            Queue<Object> queue = this.f85552i;
            boolean z11 = this.f85546c;
            AtomicInteger atomicInteger = this.f85549f;
            int i11 = 1;
            do {
                long j11 = this.f85553j.get();
                long j12 = 0;
                while (j12 != j11) {
                    if (this.f85555l) {
                        queue.clear();
                        return;
                    }
                    boolean z12 = this.f85554k;
                    if (!z11 && z12 && this.f85551h.get() != null) {
                        queue.clear();
                        gVar.onError(ExceptionsUtils.terminate(this.f85551h));
                        return;
                    }
                    Object poll = queue.poll();
                    boolean z13 = poll == null;
                    if (z12 && atomicInteger.get() == 0 && z13) {
                        if (this.f85551h.get() != null) {
                            gVar.onError(ExceptionsUtils.terminate(this.f85551h));
                            return;
                        } else {
                            gVar.onCompleted();
                            return;
                        }
                    }
                    if (z13) {
                        break;
                    }
                    gVar.onNext((Object) v.e(poll));
                    j12++;
                }
                if (j12 == j11) {
                    if (this.f85555l) {
                        queue.clear();
                        return;
                    }
                    if (this.f85554k) {
                        if (z11) {
                            if (atomicInteger.get() == 0 && queue.isEmpty()) {
                                if (this.f85551h.get() != null) {
                                    gVar.onError(ExceptionsUtils.terminate(this.f85551h));
                                    return;
                                } else {
                                    gVar.onCompleted();
                                    return;
                                }
                            }
                        } else if (this.f85551h.get() != null) {
                            queue.clear();
                            gVar.onError(ExceptionsUtils.terminate(this.f85551h));
                            return;
                        } else if (atomicInteger.get() == 0 && queue.isEmpty()) {
                            gVar.onCompleted();
                            return;
                        }
                    }
                }
                if (j12 != 0) {
                    this.f85553j.a(j12);
                    if (!this.f85554k && this.f85547d != Integer.MAX_VALUE) {
                        request(j12);
                    }
                }
                i11 = this.f85548e.addAndGet(-i11);
            } while (i11 != 0);
        }
    }

    public j0(rx.c<T> cVar, wb0.p<? super T, ? extends rx.e<? extends R>> pVar, boolean z11, int i11) {
        if (pVar == null) {
            throw new NullPointerException("mapper is null");
        }
        if (i11 <= 0) {
            throw new IllegalArgumentException("maxConcurrency > 0 required but it was " + i11);
        }
        this.f85540a = cVar;
        this.f85541b = pVar;
        this.f85542c = z11;
        this.f85543d = i11;
    }

    @Override // wb0.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(qb0.g<? super R> gVar) {
        a aVar = new a(gVar, this.f85541b, this.f85542c, this.f85543d);
        gVar.add(aVar.f85550g);
        gVar.add(aVar.f85553j);
        gVar.setProducer(aVar.f85553j);
        this.f85540a.J6(aVar);
    }
}
