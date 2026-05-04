package c40;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.TimeoutCancellationException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class v3 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.TimeoutKt", f = "Timeout.kt", i = {0, 0, 0}, l = {102}, m = "withTimeoutOrNull", n = {"block", "coroutine", "timeMillis"}, s = {"L$0", "L$1", "J$0"})
    public static final class a<T> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f8002a;

        /* renamed from: b, reason: collision with root package name */
        public Object f8003b;

        /* renamed from: c, reason: collision with root package name */
        public Object f8004c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f8005d;

        /* renamed from: e, reason: collision with root package name */
        public int f8006e;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f8005d = obj;
            this.f8006e |= Integer.MIN_VALUE;
            return v3.e(0L, null, this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        if (r4 == null) goto L9;
     */
    @m80.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlinx.coroutines.TimeoutCancellationException a(long r2, @m80.k c40.z0 r4, @m80.k c40.l2 r5) {
        /*
            boolean r0 = r4 instanceof c40.b1
            if (r0 == 0) goto L7
            c40.b1 r4 = (c40.b1) r4
            goto L8
        L7:
            r4 = 0
        L8:
            if (r4 == 0) goto L18
            kotlin.time.e$a r0 = kotlin.time.e.f67757b
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MILLISECONDS
            long r0 = kotlin.time.f.x(r2, r0)
            java.lang.String r4 = r4.c(r0)
            if (r4 != 0) goto L2e
        L18:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Timed out waiting for "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r2 = " ms"
            r4.append(r2)
            java.lang.String r4 = r4.toString()
        L2e:
            kotlinx.coroutines.TimeoutCancellationException r2 = new kotlinx.coroutines.TimeoutCancellationException
            r2.<init>(r4, r5)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: c40.v3.a(long, c40.z0, c40.l2):kotlinx.coroutines.TimeoutCancellationException");
    }

    public static final <U, T extends U> Object b(u3<U, ? super T> u3Var, x00.p<? super r0, ? super j00.c<? super T>, ? extends Object> pVar) {
        n2.x(u3Var, a1.d(u3Var.f58273d.getContext()).f(u3Var.f7990e, u3Var, u3Var.getContext()));
        return i40.b.e(u3Var, u3Var, pVar);
    }

    @m80.l
    public static final <T> Object c(long j11, @m80.k x00.p<? super r0, ? super j00.c<? super T>, ? extends Object> pVar, @m80.k j00.c<? super T> cVar) {
        if (j11 <= 0) {
            throw new TimeoutCancellationException("Timed out immediately");
        }
        Object b11 = b(new u3(j11, cVar), pVar);
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @m80.l
    public static final <T> Object d(long j11, @m80.k x00.p<? super r0, ? super j00.c<? super T>, ? extends Object> pVar, @m80.k j00.c<? super T> cVar) {
        return c(a1.e(j11), pVar, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, c40.u3] */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object e(long r7, @m80.k x00.p<? super c40.r0, ? super j00.c<? super T>, ? extends java.lang.Object> r9, @m80.k j00.c<? super T> r10) {
        /*
            boolean r0 = r10 instanceof c40.v3.a
            if (r0 == 0) goto L13
            r0 = r10
            c40.v3$a r0 = (c40.v3.a) r0
            int r1 = r0.f8006e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8006e = r1
            goto L18
        L13:
            c40.v3$a r0 = new c40.v3$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f8005d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f8006e
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 != r4) goto L34
            java.lang.Object r7 = r0.f8004c
            kotlin.jvm.internal.Ref$ObjectRef r7 = (kotlin.jvm.internal.Ref.ObjectRef) r7
            java.lang.Object r8 = r0.f8003b
            x00.p r8 = (x00.p) r8
            kotlin.e.n(r10)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L32
            return r10
        L32:
            r8 = move-exception
            goto L6f
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            kotlin.e.n(r10)
            r5 = 0
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 > 0) goto L46
            return r3
        L46:
            kotlin.jvm.internal.Ref$ObjectRef r10 = new kotlin.jvm.internal.Ref$ObjectRef
            r10.<init>()
            r0.f8003b = r9     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            r0.f8004c = r10     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            r0.f8002a = r7     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            r0.f8006e = r4     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            c40.u3 r2 = new c40.u3     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            r2.<init>(r7, r0)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            r10.element = r2     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            java.lang.Object r7 = b(r2, r9)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            java.lang.Object r8 = kotlin.coroutines.intrinsics.b.l()     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            if (r7 != r8) goto L6b
            l00.f.c(r0)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            goto L6b
        L68:
            r8 = move-exception
            r7 = r10
            goto L6f
        L6b:
            if (r7 != r1) goto L6e
            return r1
        L6e:
            return r7
        L6f:
            c40.l2 r9 = r8.coroutine
            T r7 = r7.element
            if (r9 != r7) goto L76
            return r3
        L76:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: c40.v3.e(long, x00.p, j00.c):java.lang.Object");
    }

    @m80.l
    public static final <T> Object f(long j11, @m80.k x00.p<? super r0, ? super j00.c<? super T>, ? extends Object> pVar, @m80.k j00.c<? super T> cVar) {
        return e(a1.e(j11), pVar, cVar);
    }
}
