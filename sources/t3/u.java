package t3;

import androidx.core.app.NotificationCompat;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class u<T> extends d<T> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.base.cache.NetworkFirstCache", f = "CacheImpl.kt", i = {1, 1, 2, 2, 3, 3}, l = {43, 49, 50, 53}, m = "doFetch", n = {NotificationCompat.CATEGORY_ERROR, "data", NotificationCompat.CATEGORY_ERROR, "data", NotificationCompat.CATEGORY_ERROR, "data"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f89288a;

        /* renamed from: b, reason: collision with root package name */
        public Object f89289b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f89290c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ u<T> f89291d;

        /* renamed from: e, reason: collision with root package name */
        public int f89292e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(u<T> uVar, j00.c<? super a> cVar) {
            super(cVar);
            this.f89291d = uVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f89290c = obj;
            this.f89292e |= Integer.MIN_VALUE;
            return this.f89291d.d(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(@m80.k j<T> storage, @m80.k x00.l<? super j00.c<? super T>, ? extends Object> remote, @m80.k h checker) {
        super(storage, remote, checker);
        g0.p(storage, "storage");
        g0.p(remote, "remote");
        g0.p(checker, "checker");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:(2:(1:(1:13)(2:19|20))(1:21)|(1:15)(2:17|18))(4:22|23|(2:25|(0)(0))|26))(1:27))(2:37|38)|28|(2:30|(3:32|23|(0)))(2:33|(2:35|(0)(0)))|26))|41|6|7|(0)(0)|28|(0)(0)|26) */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0069, code lost:
    
        if (r10 == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x005a, code lost:
    
        r10 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    @Override // t3.d
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(@m80.k j00.c<? super T> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof t3.u.a
            if (r0 == 0) goto L13
            r0 = r10
            t3.u$a r0 = (t3.u.a) r0
            int r1 = r0.f89292e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f89292e = r1
            goto L18
        L13:
            t3.u$a r0 = new t3.u$a
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.f89290c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f89292e
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L5c
            if (r2 == r6) goto L56
            if (r2 == r5) goto L4c
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r0 = r0.f89288a
            java.lang.Exception r0 = (java.lang.Exception) r0
            kotlin.e.n(r10)
            goto Lb0
        L38:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L40:
            java.lang.Object r1 = r0.f89289b
            java.lang.Object r0 = r0.f89288a
            java.lang.Exception r0 = (java.lang.Exception) r0
            kotlin.e.n(r10)
            r10 = r1
            goto Lb0
        L4c:
            java.lang.Object r2 = r0.f89289b
            java.lang.Object r3 = r0.f89288a
            java.lang.Exception r3 = (java.lang.Exception) r3
            kotlin.e.n(r10)
            goto L84
        L56:
            kotlin.e.n(r10)     // Catch: java.lang.Exception -> L5a
            goto L6c
        L5a:
            r10 = move-exception
            goto L6f
        L5c:
            kotlin.e.n(r10)
            x00.l r10 = r9.h()     // Catch: java.lang.Exception -> L5a
            r0.f89292e = r6     // Catch: java.lang.Exception -> L5a
            java.lang.Object r10 = r10.invoke(r0)     // Catch: java.lang.Exception -> L5a
            if (r10 != r1) goto L6c
            goto Lac
        L6c:
            r8 = r7
            r7 = r10
            r10 = r8
        L6f:
            if (r7 == 0) goto L98
            t3.j r2 = r9.i()
            r0.f89288a = r10
            r0.f89289b = r7
            r0.f89292e = r5
            java.lang.Object r2 = r2.c(r7, r0)
            if (r2 != r1) goto L82
            goto Lac
        L82:
            r3 = r10
            r2 = r7
        L84:
            t3.h r10 = r9.g()
            r0.f89288a = r3
            r0.f89289b = r2
            r0.f89292e = r4
            java.lang.Object r10 = r10.b(r0)
            if (r10 != r1) goto L95
            goto Lac
        L95:
            r10 = r2
            r0 = r3
            goto Lb0
        L98:
            t3.j r2 = r9.i()
            r0.f89288a = r10
            java.lang.Object r4 = l00.k.a(r7)
            r0.f89289b = r4
            r0.f89292e = r3
            java.lang.Object r0 = r2.b(r0)
            if (r0 != r1) goto Lad
        Lac:
            return r1
        Lad:
            r8 = r0
            r0 = r10
            r10 = r8
        Lb0:
            if (r10 == 0) goto Lb3
            return r10
        Lb3:
            kotlin.jvm.internal.g0.m(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.u.d(j00.c):java.lang.Object");
    }
}
