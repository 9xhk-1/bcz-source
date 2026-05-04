package dc0;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import rx.c;
import rx.internal.operators.v;
import wb0.m;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class g<T> extends AtomicReference<b<T>> implements c.a<T> {
    private static final long serialVersionUID = 6035251036011671568L;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f47783a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f47784b;

    /* renamed from: c, reason: collision with root package name */
    public wb0.b<c<T>> f47785c;

    /* renamed from: d, reason: collision with root package name */
    public wb0.b<c<T>> f47786d;

    /* renamed from: e, reason: collision with root package name */
    public wb0.b<c<T>> f47787e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements wb0.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f47788a;

        public a(c cVar) {
            this.f47788a = cVar;
        }

        @Override // wb0.a
        public void call() {
            g.this.n(this.f47788a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b<T> {

        /* renamed from: c, reason: collision with root package name */
        public static final c[] f47790c;

        /* renamed from: d, reason: collision with root package name */
        public static final b f47791d;

        /* renamed from: e, reason: collision with root package name */
        public static final b f47792e;

        /* renamed from: a, reason: collision with root package name */
        public final boolean f47793a;

        /* renamed from: b, reason: collision with root package name */
        public final c[] f47794b;

        static {
            c[] cVarArr = new c[0];
            f47790c = cVarArr;
            f47791d = new b(true, cVarArr);
            f47792e = new b(false, cVarArr);
        }

        public b(boolean z11, c[] cVarArr) {
            this.f47793a = z11;
            this.f47794b = cVarArr;
        }

        public b a(c cVar) {
            c[] cVarArr = this.f47794b;
            int length = cVarArr.length;
            c[] cVarArr2 = new c[length + 1];
            System.arraycopy(cVarArr, 0, cVarArr2, 0, length);
            cVarArr2[length] = cVar;
            return new b(this.f47793a, cVarArr2);
        }

        public b b(c cVar) {
            c[] cVarArr = this.f47794b;
            int length = cVarArr.length;
            if (length == 1 && cVarArr[0] == cVar) {
                return f47792e;
            }
            if (length != 0) {
                int i11 = length - 1;
                c[] cVarArr2 = new c[i11];
                int i12 = 0;
                for (c cVar2 : cVarArr) {
                    if (cVar2 != cVar) {
                        if (i12 != i11) {
                            cVarArr2[i12] = cVar2;
                            i12++;
                        }
                    }
                }
                if (i12 == 0) {
                    return f47792e;
                }
                if (i12 < i11) {
                    c[] cVarArr3 = new c[i12];
                    System.arraycopy(cVarArr2, 0, cVarArr3, 0, i12);
                    cVarArr2 = cVarArr3;
                }
                return new b(this.f47793a, cVarArr2);
            }
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c<T> implements qb0.c<T> {

        /* renamed from: a, reason: collision with root package name */
        public final qb0.g<? super T> f47795a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f47796b = true;

        /* renamed from: c, reason: collision with root package name */
        public boolean f47797c;

        /* renamed from: d, reason: collision with root package name */
        public List<Object> f47798d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f47799e;

        /* renamed from: f, reason: collision with root package name */
        public volatile boolean f47800f;

        /* renamed from: g, reason: collision with root package name */
        public volatile Object f47801g;

        public c(qb0.g<? super T> gVar) {
            this.f47795a = gVar;
        }

        public void c(Object obj) {
            if (obj != null) {
                v.a(this.f47795a, obj);
            }
        }

        public void d(Object obj) {
            synchronized (this) {
                if (this.f47796b && !this.f47797c) {
                    this.f47796b = false;
                    this.f47797c = obj != null;
                    if (obj != null) {
                        e(null, obj);
                    }
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0038  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void e(java.util.List<java.lang.Object> r5, java.lang.Object r6) {
            /*
                r4 = this;
                r0 = 1
                r1 = r0
            L2:
                r2 = 0
                if (r5 == 0) goto L1a
                java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L17
            L9:
                boolean r3 = r5.hasNext()     // Catch: java.lang.Throwable -> L17
                if (r3 == 0) goto L1a
                java.lang.Object r3 = r5.next()     // Catch: java.lang.Throwable -> L17
                r4.c(r3)     // Catch: java.lang.Throwable -> L17
                goto L9
            L17:
                r5 = move-exception
                r0 = r2
                goto L36
            L1a:
                if (r1 == 0) goto L20
                r4.c(r6)     // Catch: java.lang.Throwable -> L17
                r1 = r2
            L20:
                monitor-enter(r4)     // Catch: java.lang.Throwable -> L17
                java.util.List<java.lang.Object> r5 = r4.f47798d     // Catch: java.lang.Throwable -> L2e
                r3 = 0
                r4.f47798d = r3     // Catch: java.lang.Throwable -> L2e
                if (r5 != 0) goto L31
                r4.f47797c = r2     // Catch: java.lang.Throwable -> L2e
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L2c
                return
            L2c:
                r5 = move-exception
                goto L33
            L2e:
                r5 = move-exception
                r0 = r2
                goto L33
            L31:
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L2e
                goto L2
            L33:
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L2c
                throw r5     // Catch: java.lang.Throwable -> L35
            L35:
                r5 = move-exception
            L36:
                if (r0 != 0) goto L40
                monitor-enter(r4)
                r4.f47797c = r2     // Catch: java.lang.Throwable -> L3d
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L3d
                goto L40
            L3d:
                r5 = move-exception
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L3d
                throw r5
            L40:
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: dc0.g.c.e(java.util.List, java.lang.Object):void");
        }

        public void f(Object obj) {
            if (!this.f47799e) {
                synchronized (this) {
                    try {
                        this.f47796b = false;
                        if (this.f47797c) {
                            if (this.f47798d == null) {
                                this.f47798d = new ArrayList();
                            }
                            this.f47798d.add(obj);
                            return;
                        }
                        this.f47799e = true;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            v.a(this.f47795a, obj);
        }

        public qb0.c<? super T> g() {
            return this.f47795a;
        }

        public <I> I h() {
            return (I) this.f47801g;
        }

        public void i(Object obj) {
            this.f47801g = obj;
        }

        @Override // qb0.c
        public void onCompleted() {
            this.f47795a.onCompleted();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            this.f47795a.onError(th2);
        }

        @Override // qb0.c
        public void onNext(T t11) {
            this.f47795a.onNext(t11);
        }
    }

    public g() {
        super(b.f47792e);
        this.f47784b = true;
        this.f47785c = m.a();
        this.f47786d = m.a();
        this.f47787e = m.a();
    }

    public boolean a(c<T> cVar) {
        b<T> bVar;
        do {
            bVar = get();
            if (bVar.f47793a) {
                this.f47787e.call(cVar);
                return false;
            }
        } while (!compareAndSet(bVar, bVar.a(cVar)));
        this.f47786d.call(cVar);
        return true;
    }

    public void b(qb0.g<? super T> gVar, c<T> cVar) {
        gVar.add(ec0.f.a(new a(cVar)));
    }

    @Override // wb0.b
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void call(qb0.g<? super T> gVar) {
        c<T> cVar = new c<>(gVar);
        b(gVar, cVar);
        this.f47785c.call(cVar);
        if (!gVar.isUnsubscribed() && a(cVar) && gVar.isUnsubscribed()) {
            n(cVar);
        }
    }

    public Object j() {
        return this.f47783a;
    }

    public c<T>[] l(Object obj) {
        o(obj);
        return get().f47794b;
    }

    public c<T>[] m() {
        return get().f47794b;
    }

    public void n(c<T> cVar) {
        b<T> bVar;
        b<T> b11;
        do {
            bVar = get();
            if (bVar.f47793a || (b11 = bVar.b(cVar)) == bVar) {
                return;
            }
        } while (!compareAndSet(bVar, b11));
    }

    public void o(Object obj) {
        this.f47783a = obj;
    }

    public c<T>[] p(Object obj) {
        o(obj);
        this.f47784b = false;
        return get().f47793a ? b.f47790c : getAndSet(b.f47791d).f47794b;
    }
}
