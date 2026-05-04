package zb0;

import rx.internal.operators.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class f<T> implements qb0.c<T> {

    /* renamed from: a, reason: collision with root package name */
    public final qb0.c<? super T> f102515a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f102516b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f102517c;

    /* renamed from: d, reason: collision with root package name */
    public a f102518d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public Object[] f102519a;

        /* renamed from: b, reason: collision with root package name */
        public int f102520b;

        public void a(Object obj) {
            int i11 = this.f102520b;
            Object[] objArr = this.f102519a;
            if (objArr == null) {
                objArr = new Object[16];
                this.f102519a = objArr;
            } else if (i11 == objArr.length) {
                Object[] objArr2 = new Object[(i11 >> 2) + i11];
                System.arraycopy(objArr, 0, objArr2, 0, i11);
                this.f102519a = objArr2;
                objArr = objArr2;
            }
            objArr[i11] = obj;
            this.f102520b = i11 + 1;
        }
    }

    public f(qb0.c<? super T> cVar) {
        this.f102515a = cVar;
    }

    @Override // qb0.c
    public void onCompleted() {
        if (this.f102517c) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f102517c) {
                    return;
                }
                this.f102517c = true;
                if (!this.f102516b) {
                    this.f102516b = true;
                    this.f102515a.onCompleted();
                    return;
                }
                a aVar = this.f102518d;
                if (aVar == null) {
                    aVar = new a();
                    this.f102518d = aVar;
                }
                aVar.a(v.b());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // qb0.c
    public void onError(Throwable th2) {
        vb0.a.e(th2);
        if (this.f102517c) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f102517c) {
                    return;
                }
                this.f102517c = true;
                if (!this.f102516b) {
                    this.f102516b = true;
                    this.f102515a.onError(th2);
                    return;
                }
                a aVar = this.f102518d;
                if (aVar == null) {
                    aVar = new a();
                    this.f102518d = aVar;
                }
                aVar.a(v.c(th2));
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x002f, code lost:
    
        continue;
     */
    @Override // qb0.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onNext(T r7) {
        /*
            r6 = this;
            boolean r0 = r6.f102517c
            if (r0 == 0) goto L5
            return
        L5:
            monitor-enter(r6)
            boolean r0 = r6.f102517c     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto Le
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lc
            return
        Lc:
            r7 = move-exception
            goto L73
        Le:
            boolean r0 = r6.f102516b     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto L26
            zb0.f$a r0 = r6.f102518d     // Catch: java.lang.Throwable -> Lc
            if (r0 != 0) goto L1d
            zb0.f$a r0 = new zb0.f$a     // Catch: java.lang.Throwable -> Lc
            r0.<init>()     // Catch: java.lang.Throwable -> Lc
            r6.f102518d = r0     // Catch: java.lang.Throwable -> Lc
        L1d:
            java.lang.Object r7 = rx.internal.operators.v.j(r7)     // Catch: java.lang.Throwable -> Lc
            r0.a(r7)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lc
            return
        L26:
            r0 = 1
            r6.f102516b = r0     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lc
            qb0.c<? super T> r1 = r6.f102515a     // Catch: java.lang.Throwable -> L6a
            r1.onNext(r7)     // Catch: java.lang.Throwable -> L6a
        L2f:
            monitor-enter(r6)
            zb0.f$a r1 = r6.f102518d     // Catch: java.lang.Throwable -> L39
            r2 = 0
            if (r1 != 0) goto L3b
            r6.f102516b = r2     // Catch: java.lang.Throwable -> L39
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L39
            return
        L39:
            r7 = move-exception
            goto L68
        L3b:
            r3 = 0
            r6.f102518d = r3     // Catch: java.lang.Throwable -> L39
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L39
            java.lang.Object[] r1 = r1.f102519a
            int r3 = r1.length
        L42:
            if (r2 >= r3) goto L2f
            r4 = r1[r2]
            if (r4 != 0) goto L49
            goto L2f
        L49:
            qb0.c<? super T> r5 = r6.f102515a     // Catch: java.lang.Throwable -> L54
            boolean r4 = rx.internal.operators.v.a(r5, r4)     // Catch: java.lang.Throwable -> L54
            if (r4 == 0) goto L56
            r6.f102517c = r0     // Catch: java.lang.Throwable -> L54
            return
        L54:
            r1 = move-exception
            goto L59
        L56:
            int r2 = r2 + 1
            goto L42
        L59:
            r6.f102517c = r0
            vb0.a.e(r1)
            qb0.c<? super T> r0 = r6.f102515a
            java.lang.Throwable r7 = rx.exceptions.OnErrorThrowable.addValueAsLastCause(r1, r7)
            r0.onError(r7)
            return
        L68:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L39
            throw r7
        L6a:
            r1 = move-exception
            r6.f102517c = r0
            qb0.c<? super T> r0 = r6.f102515a
            vb0.a.g(r1, r0, r7)
            return
        L73:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lc
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: zb0.f.onNext(java.lang.Object):void");
    }
}
