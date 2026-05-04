package rx.internal.operators;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import rx.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class p0<TLeft, TRight, TLeftDuration, TRightDuration, R> implements c.a<R> {

    /* renamed from: a, reason: collision with root package name */
    public final rx.c<TLeft> f85873a;

    /* renamed from: b, reason: collision with root package name */
    public final rx.c<TRight> f85874b;

    /* renamed from: c, reason: collision with root package name */
    public final wb0.p<TLeft, rx.c<TLeftDuration>> f85875c;

    /* renamed from: d, reason: collision with root package name */
    public final wb0.p<TRight, rx.c<TRightDuration>> f85876d;

    /* renamed from: e, reason: collision with root package name */
    public final wb0.q<TLeft, TRight, R> f85877e;

    public p0(rx.c<TLeft> cVar, rx.c<TRight> cVar2, wb0.p<TLeft, rx.c<TLeftDuration>> pVar, wb0.p<TRight, rx.c<TRightDuration>> pVar2, wb0.q<TLeft, TRight, R> qVar) {
        this.f85873a = cVar;
        this.f85874b = cVar2;
        this.f85875c = pVar;
        this.f85876d = pVar2;
        this.f85877e = qVar;
    }

    @Override // wb0.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(qb0.g<? super R> gVar) {
        new a(new zb0.g(gVar)).d();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class a extends HashMap<Integer, TLeft> {
        private static final long serialVersionUID = 3491669543549085380L;

        /* renamed from: b, reason: collision with root package name */
        public final qb0.g<? super R> f85879b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f85880c;

        /* renamed from: d, reason: collision with root package name */
        public int f85881d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f85882e;

        /* renamed from: f, reason: collision with root package name */
        public int f85883f;

        /* renamed from: a, reason: collision with root package name */
        public final ec0.b f85878a = new ec0.b();

        /* renamed from: g, reason: collision with root package name */
        public final Map<Integer, TRight> f85884g = new HashMap();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: rx.internal.operators.p0$a$a, reason: collision with other inner class name */
        public final class C1095a extends qb0.g<TLeft> {

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            /* renamed from: rx.internal.operators.p0$a$a$a, reason: collision with other inner class name */
            public final class C1096a extends qb0.g<TLeftDuration> {

                /* renamed from: a, reason: collision with root package name */
                public final int f85887a;

                /* renamed from: b, reason: collision with root package name */
                public boolean f85888b = true;

                public C1096a(int i11) {
                    this.f85887a = i11;
                }

                @Override // qb0.c
                public void onCompleted() {
                    if (this.f85888b) {
                        this.f85888b = false;
                        C1095a.this.q(this.f85887a, this);
                    }
                }

                @Override // qb0.c
                public void onError(Throwable th2) {
                    C1095a.this.onError(th2);
                }

                @Override // qb0.c
                public void onNext(TLeftDuration tleftduration) {
                    onCompleted();
                }
            }

            public C1095a() {
            }

            @Override // qb0.c
            public void onCompleted() {
                boolean z11;
                synchronized (a.this) {
                    try {
                        a aVar = a.this;
                        z11 = true;
                        aVar.f85880c = true;
                        if (!aVar.f85882e && !aVar.b().isEmpty()) {
                            z11 = false;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (!z11) {
                    a.this.f85878a.e(this);
                } else {
                    a.this.f85879b.onCompleted();
                    a.this.f85879b.unsubscribe();
                }
            }

            @Override // qb0.c
            public void onError(Throwable th2) {
                a.this.f85879b.onError(th2);
                a.this.f85879b.unsubscribe();
            }

            @Override // qb0.c
            public void onNext(TLeft tleft) {
                int i11;
                a aVar;
                int i12;
                synchronized (a.this) {
                    a aVar2 = a.this;
                    i11 = aVar2.f85881d;
                    aVar2.f85881d = i11 + 1;
                    aVar2.b().put(Integer.valueOf(i11), tleft);
                    aVar = a.this;
                    i12 = aVar.f85883f;
                }
                try {
                    rx.c<TLeftDuration> call = p0.this.f85875c.call(tleft);
                    C1096a c1096a = new C1096a(i11);
                    a.this.f85878a.a(c1096a);
                    call.J6(c1096a);
                    ArrayList arrayList = new ArrayList();
                    synchronized (a.this) {
                        try {
                            for (Map.Entry<Integer, TRight> entry : a.this.f85884g.entrySet()) {
                                if (entry.getKey().intValue() < i12) {
                                    arrayList.add(entry.getValue());
                                }
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        a.this.f85879b.onNext(p0.this.f85877e.call(tleft, it.next()));
                    }
                } catch (Throwable th3) {
                    vb0.a.f(th3, this);
                }
            }

            public void q(int i11, qb0.h hVar) {
                boolean z11;
                synchronized (a.this) {
                    try {
                        z11 = a.this.b().remove(Integer.valueOf(i11)) != null && a.this.b().isEmpty() && a.this.f85880c;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (!z11) {
                    a.this.f85878a.e(hVar);
                } else {
                    a.this.f85879b.onCompleted();
                    a.this.f85879b.unsubscribe();
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public final class b extends qb0.g<TRight> {

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            /* renamed from: rx.internal.operators.p0$a$b$a, reason: collision with other inner class name */
            public final class C1097a extends qb0.g<TRightDuration> {

                /* renamed from: a, reason: collision with root package name */
                public final int f85891a;

                /* renamed from: b, reason: collision with root package name */
                public boolean f85892b = true;

                public C1097a(int i11) {
                    this.f85891a = i11;
                }

                @Override // qb0.c
                public void onCompleted() {
                    if (this.f85892b) {
                        this.f85892b = false;
                        b.this.q(this.f85891a, this);
                    }
                }

                @Override // qb0.c
                public void onError(Throwable th2) {
                    b.this.onError(th2);
                }

                @Override // qb0.c
                public void onNext(TRightDuration trightduration) {
                    onCompleted();
                }
            }

            public b() {
            }

            @Override // qb0.c
            public void onCompleted() {
                boolean z11;
                synchronized (a.this) {
                    try {
                        a aVar = a.this;
                        z11 = true;
                        aVar.f85882e = true;
                        if (!aVar.f85880c && !aVar.f85884g.isEmpty()) {
                            z11 = false;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (!z11) {
                    a.this.f85878a.e(this);
                } else {
                    a.this.f85879b.onCompleted();
                    a.this.f85879b.unsubscribe();
                }
            }

            @Override // qb0.c
            public void onError(Throwable th2) {
                a.this.f85879b.onError(th2);
                a.this.f85879b.unsubscribe();
            }

            @Override // qb0.c
            public void onNext(TRight tright) {
                int i11;
                int i12;
                synchronized (a.this) {
                    a aVar = a.this;
                    i11 = aVar.f85883f;
                    aVar.f85883f = i11 + 1;
                    aVar.f85884g.put(Integer.valueOf(i11), tright);
                    i12 = a.this.f85881d;
                }
                a.this.f85878a.a(new ec0.e());
                try {
                    rx.c<TRightDuration> call = p0.this.f85876d.call(tright);
                    C1097a c1097a = new C1097a(i11);
                    a.this.f85878a.a(c1097a);
                    call.J6(c1097a);
                    ArrayList arrayList = new ArrayList();
                    synchronized (a.this) {
                        try {
                            for (Map.Entry<Integer, TLeft> entry : a.this.b().entrySet()) {
                                if (entry.getKey().intValue() < i12) {
                                    arrayList.add(entry.getValue());
                                }
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        a.this.f85879b.onNext(p0.this.f85877e.call(it.next(), tright));
                    }
                } catch (Throwable th3) {
                    vb0.a.f(th3, this);
                }
            }

            public void q(int i11, qb0.h hVar) {
                boolean z11;
                synchronized (a.this) {
                    try {
                        z11 = a.this.f85884g.remove(Integer.valueOf(i11)) != null && a.this.f85884g.isEmpty() && a.this.f85882e;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (!z11) {
                    a.this.f85878a.e(hVar);
                } else {
                    a.this.f85879b.onCompleted();
                    a.this.f85879b.unsubscribe();
                }
            }
        }

        public a(qb0.g<? super R> gVar) {
            this.f85879b = gVar;
        }

        public void d() {
            this.f85879b.add(this.f85878a);
            C1095a c1095a = new C1095a();
            b bVar = new b();
            this.f85878a.a(c1095a);
            this.f85878a.a(bVar);
            p0.this.f85873a.J6(c1095a);
            p0.this.f85874b.J6(bVar);
        }

        public HashMap<Integer, TLeft> b() {
            return this;
        }
    }
}
