package t3;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nCacheImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CacheImpl.kt\ncom/baicizhan/app/biz/base/cache/CacheImpl\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,83:1\n116#2,11:84\n*S KotlinDebug\n*F\n+ 1 CacheImpl.kt\ncom/baicizhan/app/biz/base/cache/CacheImpl\n*L\n18#1:84,11\n*E\n"})
/* loaded from: classes3.dex */
public abstract class d<T> implements g<T> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final j<T> f89225a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final x00.l<j00.c<? super T>, Object> f89226b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final h f89227c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final n40.a f89228d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.base.cache.CacheImpl", f = "CacheImpl.kt", i = {0, 1}, l = {24, 26}, m = "fetch$suspendImpl", n = {"$this", "$this"}, s = {"L$0", "L$0"}, v = 1)
    public static final class a<T> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f89229a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f89230b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ d<T> f89231c;

        /* renamed from: d, reason: collision with root package name */
        public int f89232d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d<T> dVar, j00.c<? super a> cVar) {
            super(cVar);
            this.f89231c = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f89230b = obj;
            this.f89232d |= Integer.MIN_VALUE;
            return d.e(this.f89231c, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.base.cache.CacheImpl", f = "CacheImpl.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {89, 19}, m = "getCache$suspendImpl", n = {"$this", "$this$withLock_u24default$iv", "$i$f$withLock", "$this", "$this$withLock_u24default$iv", "$i$f$withLock", "$i$a$-withLock$default-CacheImpl$getCache$2"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "I$0", "I$1"}, v = 1)
    public static final class b<T> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f89233a;

        /* renamed from: b, reason: collision with root package name */
        public Object f89234b;

        /* renamed from: c, reason: collision with root package name */
        public int f89235c;

        /* renamed from: d, reason: collision with root package name */
        public int f89236d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f89237e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ d<T> f89238f;

        /* renamed from: g, reason: collision with root package name */
        public int f89239g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(d<T> dVar, j00.c<? super b> cVar) {
            super(cVar);
            this.f89238f = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f89237e = obj;
            this.f89239g |= Integer.MIN_VALUE;
            return d.f(this.f89238f, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(@m80.k j<T> storage, @m80.k x00.l<? super j00.c<? super T>, ? extends Object> remote, @m80.k h checker) {
        g0.p(storage, "storage");
        g0.p(remote, "remote");
        g0.p(checker, "checker");
        this.f89225a = storage;
        this.f89226b = remote;
        this.f89227c = checker;
        this.f89228d = n40.g.b(false, 1, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
    
        if (r7 != r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
    
        if (n40.a.C0899a.b(r7, null, r0, 1, null) == r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, t3.d, t3.d<T>] */
    /* JADX WARN: Type inference failed for: r6v1, types: [t3.d] */
    /* JADX WARN: Type inference failed for: r6v5, types: [n40.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ <T> java.lang.Object e(t3.d<T> r6, j00.c<? super T> r7) {
        /*
            boolean r0 = r7 instanceof t3.d.a
            if (r0 == 0) goto L13
            r0 = r7
            t3.d$a r0 = (t3.d.a) r0
            int r1 = r0.f89232d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f89232d = r1
            goto L18
        L13:
            t3.d$a r0 = new t3.d$a
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f89230b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f89232d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L43
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r6 = r0.f89229a
            t3.d r6 = (t3.d) r6
            kotlin.e.n(r7)     // Catch: java.lang.Throwable -> L31
            goto L5e
        L31:
            r7 = move-exception
            goto L64
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            java.lang.Object r6 = r0.f89229a
            t3.d r6 = (t3.d) r6
            kotlin.e.n(r7)
            goto L53
        L43:
            kotlin.e.n(r7)
            n40.a r7 = r6.f89228d
            r0.f89229a = r6
            r0.f89232d = r4
            java.lang.Object r7 = n40.a.C0899a.b(r7, r5, r0, r4, r5)
            if (r7 != r1) goto L53
            goto L5d
        L53:
            r0.f89229a = r6     // Catch: java.lang.Throwable -> L31
            r0.f89232d = r3     // Catch: java.lang.Throwable -> L31
            java.lang.Object r7 = r6.d(r0)     // Catch: java.lang.Throwable -> L31
            if (r7 != r1) goto L5e
        L5d:
            return r1
        L5e:
            n40.a r6 = r6.f89228d
            n40.a.C0899a.d(r6, r5, r4, r5)
            return r7
        L64:
            n40.a r6 = r6.f89228d
            n40.a.C0899a.d(r6, r5, r4, r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.d.e(t3.d, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0087 A[Catch: all -> 0x0036, TRY_ENTER, TryCatch #1 {all -> 0x0036, blocks: (B:12:0x0032, B:17:0x0087, B:18:0x0092), top: B:11:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ <T> java.lang.Object f(t3.d<T> r8, j00.c<? super T> r9) {
        /*
            boolean r0 = r9 instanceof t3.d.b
            if (r0 == 0) goto L13
            r0 = r9
            t3.d$b r0 = (t3.d.b) r0
            int r1 = r0.f89239g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f89239g = r1
            goto L18
        L13:
            t3.d$b r0 = new t3.d$b
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f89237e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f89239g
            r3 = 0
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L52
            if (r2 == r5) goto L41
            if (r2 != r4) goto L39
            java.lang.Object r8 = r0.f89234b
            n40.a r8 = (n40.a) r8
            java.lang.Object r0 = r0.f89233a
            t3.d r0 = (t3.d) r0
            kotlin.e.n(r9)     // Catch: java.lang.Throwable -> L36
            goto L81
        L36:
            r0 = move-exception
            r9 = r0
            goto L98
        L39:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L41:
            int r8 = r0.f89235c
            java.lang.Object r2 = r0.f89234b
            n40.a r2 = (n40.a) r2
            java.lang.Object r5 = r0.f89233a
            t3.d r5 = (t3.d) r5
            kotlin.e.n(r9)
            r9 = r2
            r2 = r8
            r8 = r5
            goto L67
        L52:
            kotlin.e.n(r9)
            n40.a r9 = r8.f89228d
            r0.f89233a = r8
            r0.f89234b = r9
            r0.f89235c = r3
            r0.f89239g = r5
            java.lang.Object r2 = r9.lock(r6, r0)
            if (r2 != r1) goto L66
            goto L7d
        L66:
            r2 = r3
        L67:
            t3.j<T> r5 = r8.f89225a     // Catch: java.lang.Throwable -> L93
            java.lang.Object r8 = l00.k.a(r8)     // Catch: java.lang.Throwable -> L93
            r0.f89233a = r8     // Catch: java.lang.Throwable -> L93
            r0.f89234b = r9     // Catch: java.lang.Throwable -> L93
            r0.f89235c = r2     // Catch: java.lang.Throwable -> L93
            r0.f89236d = r3     // Catch: java.lang.Throwable -> L93
            r0.f89239g = r4     // Catch: java.lang.Throwable -> L93
            java.lang.Object r8 = r5.b(r0)     // Catch: java.lang.Throwable -> L93
            if (r8 != r1) goto L7e
        L7d:
            return r1
        L7e:
            r7 = r9
            r9 = r8
            r8 = r7
        L81:
            if (r9 == 0) goto L87
            r8.unlock(r6)
            return r9
        L87:
            com.baicizhan.app.biz.base.BizInternalException r0 = new com.baicizhan.app.biz.base.BizInternalException     // Catch: java.lang.Throwable -> L36
            java.lang.String r1 = "cache not found"
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L36
            throw r0     // Catch: java.lang.Throwable -> L36
        L93:
            r0 = move-exception
            r8 = r0
            r7 = r9
            r9 = r8
            r8 = r7
        L98:
            r8.unlock(r6)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.d.f(t3.d, j00.c):java.lang.Object");
    }

    public static /* synthetic */ <T> Object j(d<T> dVar, j00.c<? super g2> cVar) {
        Object c11 = dVar.f89227c.c(cVar);
        return c11 == kotlin.coroutines.intrinsics.b.l() ? c11 : g2.f100423a;
    }

    @Override // t3.g
    @m80.l
    public Object a(@m80.k j00.c<? super T> cVar) {
        return f(this, cVar);
    }

    @Override // t3.g
    @m80.l
    public Object b(@m80.k j00.c<? super T> cVar) {
        return e(this, cVar);
    }

    @Override // t3.g
    @m80.l
    public Object c(@m80.k j00.c<? super g2> cVar) {
        return j(this, cVar);
    }

    @m80.l
    public abstract Object d(@m80.k j00.c<? super T> cVar);

    @m80.k
    public final h g() {
        return this.f89227c;
    }

    @m80.k
    public final x00.l<j00.c<? super T>, Object> h() {
        return this.f89226b;
    }

    @m80.k
    public final j<T> i() {
        return this.f89225a;
    }
}
