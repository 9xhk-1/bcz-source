package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.q0;
import java.lang.Throwable;
import java.util.concurrent.Executor;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l0
@go.b
/* loaded from: classes7.dex */
public abstract class a<V, X extends Throwable, F, T> extends q0.a<V> implements Runnable {

    /* renamed from: i, reason: collision with root package name */
    @CheckForNull
    @vo.b
    public p1<? extends V> f34477i;

    /* renamed from: j, reason: collision with root package name */
    @CheckForNull
    @vo.b
    public Class<X> f34478j;

    /* renamed from: k, reason: collision with root package name */
    @CheckForNull
    @vo.b
    public F f34479k;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.google.common.util.concurrent.a$a, reason: collision with other inner class name */
    public static final class C0429a<V, X extends Throwable> extends a<V, X, x<? super X, ? extends V>, p1<? extends V>> {
        public C0429a(p1<? extends V> input, Class<X> exceptionType, x<? super X, ? extends V> fallback) {
            super(input, exceptionType, fallback);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.util.concurrent.a
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public p1<? extends V> P(x<? super X, ? extends V> fallback, X cause) throws Exception {
            p1<? extends V> apply = fallback.apply(cause);
            Preconditions.checkNotNull(apply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", fallback);
            return apply;
        }

        @Override // com.google.common.util.concurrent.a
        /* renamed from: S, reason: merged with bridge method [inline-methods] */
        public void Q(p1<? extends V> result) {
            D(result);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b<V, X extends Throwable> extends a<V, X, ho.r<? super X, ? extends V>, V> {
        public b(p1<? extends V> input, Class<X> exceptionType, ho.r<? super X, ? extends V> fallback) {
            super(input, exceptionType, fallback);
        }

        @Override // com.google.common.util.concurrent.a
        public void Q(@z1 V result) {
            B(result);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.util.concurrent.a
        @z1
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public V P(ho.r<? super X, ? extends V> fallback, X cause) throws Exception {
            return fallback.apply(cause);
        }
    }

    public a(p1<? extends V> p1Var, Class<X> cls, F f11) {
        this.f34477i = (p1) Preconditions.checkNotNull(p1Var);
        this.f34478j = (Class) Preconditions.checkNotNull(cls);
        this.f34479k = (F) Preconditions.checkNotNull(f11);
    }

    public static <V, X extends Throwable> p1<V> N(p1<? extends V> input, Class<X> exceptionType, ho.r<? super X, ? extends V> fallback, Executor executor) {
        b bVar = new b(input, exceptionType, fallback);
        input.addListener(bVar, w1.p(executor, bVar));
        return bVar;
    }

    public static <X extends Throwable, V> p1<V> O(p1<? extends V> input, Class<X> exceptionType, x<? super X, ? extends V> fallback, Executor executor) {
        C0429a c0429a = new C0429a(input, exceptionType, fallback);
        input.addListener(c0429a, w1.p(executor, c0429a));
        return c0429a;
    }

    @uo.g
    @z1
    public abstract T P(F fallback, X throwable) throws Exception;

    @uo.g
    public abstract void Q(@z1 T result);

    @Override // com.google.common.util.concurrent.f
    public final void m() {
        x(this.f34477i);
        this.f34477i = null;
        this.f34478j = null;
        this.f34479k = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARN: Type inference failed for: r3v4, types: [F, java.lang.Class<X extends java.lang.Throwable>] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r8 = this;
            com.google.common.util.concurrent.p1<? extends V> r0 = r8.f34477i
            java.lang.Class<X extends java.lang.Throwable> r1 = r8.f34478j
            F r2 = r8.f34479k
            r3 = 0
            r4 = 1
            if (r0 != 0) goto Lc
            r5 = r4
            goto Ld
        Lc:
            r5 = r3
        Ld:
            if (r1 != 0) goto L11
            r6 = r4
            goto L12
        L11:
            r6 = r3
        L12:
            r5 = r5 | r6
            if (r2 != 0) goto L16
            r3 = r4
        L16:
            r3 = r3 | r5
            if (r3 != 0) goto La3
            boolean r3 = r8.isCancelled()
            if (r3 == 0) goto L21
            goto La3
        L21:
            r3 = 0
            r8.f34477i = r3
            boolean r4 = r0 instanceof so.a     // Catch: java.lang.Throwable -> L30 java.util.concurrent.ExecutionException -> L32
            if (r4 == 0) goto L34
            r4 = r0
            so.a r4 = (so.a) r4     // Catch: java.lang.Throwable -> L30 java.util.concurrent.ExecutionException -> L32
            java.lang.Throwable r4 = so.b.a(r4)     // Catch: java.lang.Throwable -> L30 java.util.concurrent.ExecutionException -> L32
            goto L35
        L30:
            r4 = move-exception
            goto L3c
        L32:
            r4 = move-exception
            goto L3e
        L34:
            r4 = r3
        L35:
            if (r4 != 0) goto L3c
            java.lang.Object r5 = com.google.common.util.concurrent.d1.j(r0)     // Catch: java.lang.Throwable -> L30 java.util.concurrent.ExecutionException -> L32
            goto L71
        L3c:
            r5 = r3
            goto L71
        L3e:
            java.lang.Throwable r5 = r4.getCause()
            if (r5 != 0) goto L6f
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Future type "
            r6.append(r7)
            java.lang.Class r7 = r0.getClass()
            r6.append(r7)
            java.lang.String r7 = " threw "
            r6.append(r7)
            java.lang.Class r4 = r4.getClass()
            r6.append(r4)
            java.lang.String r4 = " without a cause"
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r5.<init>(r4)
        L6f:
            r4 = r5
            goto L3c
        L71:
            if (r4 != 0) goto L7b
            java.lang.Object r0 = com.google.common.util.concurrent.x1.a(r5)
            r8.B(r0)
            return
        L7b:
            boolean r1 = com.google.common.util.concurrent.b2.a(r4, r1)
            if (r1 != 0) goto L85
            r8.D(r0)
            return
        L85:
            java.lang.Object r0 = r8.P(r2, r4)     // Catch: java.lang.Throwable -> L91
            r8.f34478j = r3
            r8.f34479k = r3
            r8.Q(r0)
            return
        L91:
            r0 = move-exception
            com.google.common.util.concurrent.b2.b(r0)     // Catch: java.lang.Throwable -> L9d
            r8.C(r0)     // Catch: java.lang.Throwable -> L9d
            r8.f34478j = r3
            r8.f34479k = r3
            return
        L9d:
            r0 = move-exception
            r8.f34478j = r3
            r8.f34479k = r3
            throw r0
        La3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.a.run():void");
    }

    @Override // com.google.common.util.concurrent.f
    @CheckForNull
    public String y() {
        String str;
        p1<? extends V> p1Var = this.f34477i;
        Class<X> cls = this.f34478j;
        F f11 = this.f34479k;
        String y11 = super.y();
        if (p1Var != null) {
            str = "inputFuture=[" + p1Var + "], ";
        } else {
            str = "";
        }
        if (cls == null || f11 == null) {
            if (y11 == null) {
                return null;
            }
            return str + y11;
        }
        return str + "exceptionType=[" + cls + "], fallback=[" + f11 + "]";
    }
}
