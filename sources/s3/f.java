package s3;

import com.baicizhan.client.business.dataset.provider.a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import oa0.r;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r
@u0({"SMAP\nOncePerUserFetcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OncePerUserFetcher.kt\ncom/baicizhan/app/biz/base/OncePerUserFetcher\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,124:1\n116#2,11:125\n116#2,11:136\n116#2,11:147\n116#2,11:158\n116#2,11:169\n116#2,11:180\n116#2,11:191\n*S KotlinDebug\n*F\n+ 1 OncePerUserFetcher.kt\ncom/baicizhan/app/biz/base/OncePerUserFetcher\n*L\n31#1:125,11\n42#1:136,11\n57#1:147,11\n66#1:158,11\n86#1:169,11\n105#1:180,11\n120#1:191,11\n*E\n"})
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.baicizhan.app.biz.auth.r f87488a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public n40.a f87489b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Map<String, Boolean> f87490c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Map<String, Long> f87491d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.base.OncePerUserFetcher", f = "OncePerUserFetcher.kt", i = {0, 0}, l = {130}, m = "clearAllFetchRecords", n = {"$this$withLock_u24default$iv", "$i$f$withLock"}, s = {"L$0", "I$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f87492a;

        /* renamed from: b, reason: collision with root package name */
        public int f87493b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f87494c;

        /* renamed from: e, reason: collision with root package name */
        public int f87496e;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f87494c = obj;
            this.f87496e |= Integer.MIN_VALUE;
            return f.this.a(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.base.OncePerUserFetcher", f = "OncePerUserFetcher.kt", i = {0, 0, 0, 0, 0, 0}, l = {130}, m = "clearUserFetchRecord", n = {a.d.C0245a.f16161a, "bczId", "userId", "userKey", "$this$withLock_u24default$iv", "$i$f$withLock"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0"}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f87497a;

        /* renamed from: b, reason: collision with root package name */
        public Object f87498b;

        /* renamed from: c, reason: collision with root package name */
        public Object f87499c;

        /* renamed from: d, reason: collision with root package name */
        public Object f87500d;

        /* renamed from: e, reason: collision with root package name */
        public Object f87501e;

        /* renamed from: f, reason: collision with root package name */
        public int f87502f;

        /* renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f87503g;

        /* renamed from: i, reason: collision with root package name */
        public int f87505i;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f87503g = obj;
            this.f87505i |= Integer.MIN_VALUE;
            return f.this.b(null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.base.OncePerUserFetcher", f = "OncePerUserFetcher.kt", i = {0, 0, 0, 0, 0, 0}, l = {130}, m = "clearUserTimestamp", n = {a.d.C0245a.f16161a, "bczId", "userId", "userKey", "$this$withLock_u24default$iv", "$i$f$withLock"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0"}, v = 1)
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f87506a;

        /* renamed from: b, reason: collision with root package name */
        public Object f87507b;

        /* renamed from: c, reason: collision with root package name */
        public Object f87508c;

        /* renamed from: d, reason: collision with root package name */
        public Object f87509d;

        /* renamed from: e, reason: collision with root package name */
        public Object f87510e;

        /* renamed from: f, reason: collision with root package name */
        public int f87511f;

        /* renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f87512g;

        /* renamed from: i, reason: collision with root package name */
        public int f87514i;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f87512g = obj;
            this.f87514i |= Integer.MIN_VALUE;
            return f.this.d(null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.base.OncePerUserFetcher", f = "OncePerUserFetcher.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, l = {130, 40, 141}, m = "fetchOncePerUser", n = {a.d.C0245a.f16161a, "fetchAction", "userKey", "$this$withLock_u24default$iv", "bczId", "$i$f$withLock", a.d.C0245a.f16161a, "fetchAction", "userKey", "$this$fetchOncePerUser_u24lambda_u241", "bczId", "hasFetched", "$i$a$-runCatching-OncePerUserFetcher$fetchOncePerUser$2", a.d.C0245a.f16161a, "fetchAction", "userKey", "it", "$this$withLock_u24default$iv", "$completion$iv", "bczId", "hasFetched", "$i$a$-onSuccess-OncePerUserFetcher$fetchOncePerUser$3", "$i$f$withLock"}, s = {"L$0", "L$1", "L$2", "L$3", "J$0", "I$0", "L$0", "L$1", "L$2", "L$3", "J$0", "Z$0", "I$0", "L$0", "L$1", "L$2", "L$4", "L$5", "L$6", "J$0", "Z$0", "I$0", "I$1"}, v = 1)
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f87515a;

        /* renamed from: b, reason: collision with root package name */
        public Object f87516b;

        /* renamed from: c, reason: collision with root package name */
        public Object f87517c;

        /* renamed from: d, reason: collision with root package name */
        public Object f87518d;

        /* renamed from: e, reason: collision with root package name */
        public Object f87519e;

        /* renamed from: f, reason: collision with root package name */
        public Object f87520f;

        /* renamed from: g, reason: collision with root package name */
        public Object f87521g;

        /* renamed from: h, reason: collision with root package name */
        public long f87522h;

        /* renamed from: i, reason: collision with root package name */
        public int f87523i;

        /* renamed from: j, reason: collision with root package name */
        public int f87524j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f87525k;

        /* renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f87526l;

        /* renamed from: n, reason: collision with root package name */
        public int f87528n;

        public d(j00.c<? super d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f87526l = obj;
            this.f87528n |= Integer.MIN_VALUE;
            return f.this.f(null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.base.OncePerUserFetcher", f = "OncePerUserFetcher.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, l = {130, 103, 141}, m = "fetchWithInterval-dWUq8MI", n = {a.d.C0245a.f16161a, "fetchAction", "userKey", "$this$withLock_u24default$iv", "$v$c$kotlin-time-Duration$-interval$0", "bczId", "$i$f$withLock", a.d.C0245a.f16161a, "fetchAction", "userKey", "$this$fetchWithInterval_dWUq8MI_u24lambda_u241", "$v$c$kotlin-time-Duration$-interval$0", "bczId", "shouldFetch", "$i$a$-runCatching-OncePerUserFetcher$fetchWithInterval$2", a.d.C0245a.f16161a, "fetchAction", "userKey", "it", "$this$withLock_u24default$iv", "$completion$iv", "$v$c$kotlin-time-Duration$-interval$0", "bczId", "shouldFetch", "$i$a$-onSuccess-OncePerUserFetcher$fetchWithInterval$3", "$i$f$withLock"}, s = {"L$0", "L$1", "L$2", "L$3", "J$0", "J$1", "I$0", "L$0", "L$1", "L$2", "L$3", "J$0", "J$1", "Z$0", "I$0", "L$0", "L$1", "L$2", "L$4", "L$5", "L$6", "J$0", "J$1", "Z$0", "I$0", "I$1"}, v = 1)
    public static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f87529a;

        /* renamed from: b, reason: collision with root package name */
        public Object f87530b;

        /* renamed from: c, reason: collision with root package name */
        public Object f87531c;

        /* renamed from: d, reason: collision with root package name */
        public Object f87532d;

        /* renamed from: e, reason: collision with root package name */
        public Object f87533e;

        /* renamed from: f, reason: collision with root package name */
        public Object f87534f;

        /* renamed from: g, reason: collision with root package name */
        public Object f87535g;

        /* renamed from: h, reason: collision with root package name */
        public long f87536h;

        /* renamed from: i, reason: collision with root package name */
        public long f87537i;

        /* renamed from: j, reason: collision with root package name */
        public int f87538j;

        /* renamed from: k, reason: collision with root package name */
        public int f87539k;

        /* renamed from: l, reason: collision with root package name */
        public boolean f87540l;

        /* renamed from: m, reason: collision with root package name */
        public /* synthetic */ Object f87541m;

        /* renamed from: o, reason: collision with root package name */
        public int f87543o;

        public e(j00.c<? super e> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f87541m = obj;
            this.f87543o |= Integer.MIN_VALUE;
            return f.this.g(null, 0L, null, this);
        }
    }

    public f(@k com.baicizhan.app.biz.auth.r tokenProvider) {
        g0.p(tokenProvider, "tokenProvider");
        this.f87488a = tokenProvider;
        this.f87489b = n40.g.b(false, 1, null);
        this.f87490c = new LinkedHashMap();
        this.f87491d = new LinkedHashMap();
    }

    public static /* synthetic */ Object c(f fVar, String str, String str2, j00.c cVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        return fVar.b(str, str2, cVar);
    }

    public static /* synthetic */ Object e(f fVar, String str, String str2, j00.c cVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        return fVar.d(str, str2, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@m80.k j00.c<? super yz.g2> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof s3.f.a
            if (r0 == 0) goto L13
            r0 = r6
            s3.f$a r0 = (s3.f.a) r0
            int r1 = r0.f87496e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f87496e = r1
            goto L18
        L13:
            s3.f$a r0 = new s3.f$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f87494c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f87496e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r0 = r0.f87492a
            n40.a r0 = (n40.a) r0
            kotlin.e.n(r6)
            goto L4a
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L36:
            kotlin.e.n(r6)
            n40.a r6 = r5.f87489b
            r0.f87492a = r6
            r2 = 0
            r0.f87493b = r2
            r0.f87496e = r3
            java.lang.Object r0 = r6.lock(r4, r0)
            if (r0 != r1) goto L49
            return r1
        L49:
            r0 = r6
        L4a:
            java.util.Map<java.lang.String, java.lang.Boolean> r6 = r5.f87490c     // Catch: java.lang.Throwable -> L5a
            r6.clear()     // Catch: java.lang.Throwable -> L5a
            java.util.Map<java.lang.String, java.lang.Long> r6 = r5.f87491d     // Catch: java.lang.Throwable -> L5a
            r6.clear()     // Catch: java.lang.Throwable -> L5a
            yz.g2 r6 = yz.g2.f100423a     // Catch: java.lang.Throwable -> L5a
            r0.unlock(r4)
            return r6
        L5a:
            r6 = move-exception
            r0.unlock(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.f.a(j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@m80.k java.lang.String r7, @m80.l java.lang.String r8, @m80.k j00.c<? super yz.g2> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof s3.f.b
            if (r0 == 0) goto L13
            r0 = r9
            s3.f$b r0 = (s3.f.b) r0
            int r1 = r0.f87505i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f87505i = r1
            goto L18
        L13:
            s3.f$b r0 = new s3.f$b
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f87503g
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f87505i
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L42
            if (r2 != r3) goto L3a
            java.lang.Object r7 = r0.f87501e
            n40.a r7 = (n40.a) r7
            java.lang.Object r8 = r0.f87500d
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r1 = r0.f87498b
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.f87497a
            java.lang.String r0 = (java.lang.String) r0
            kotlin.e.n(r9)
            goto L8d
        L3a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L42:
            kotlin.e.n(r9)
            if (r8 != 0) goto L52
            com.baicizhan.app.biz.auth.r r9 = r6.f87488a
            java.lang.Long r9 = r9.b()
            if (r9 != 0) goto L53
            yz.g2 r7 = yz.g2.f100423a
            return r7
        L52:
            r9 = r8
        L53:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r9)
            r5 = 95
            r2.append(r5)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            n40.a r5 = r6.f87489b
            java.lang.Object r7 = l00.k.a(r7)
            r0.f87497a = r7
            java.lang.Object r7 = l00.k.a(r8)
            r0.f87498b = r7
            java.lang.Object r7 = l00.k.a(r9)
            r0.f87499c = r7
            r0.f87500d = r2
            r0.f87501e = r5
            r7 = 0
            r0.f87502f = r7
            r0.f87505i = r3
            java.lang.Object r7 = r5.lock(r4, r0)
            if (r7 != r1) goto L8b
            return r1
        L8b:
            r8 = r2
            r7 = r5
        L8d:
            java.util.Map<java.lang.String, java.lang.Boolean> r9 = r6.f87490c     // Catch: java.lang.Throwable -> L9b
            java.lang.Object r8 = r9.remove(r8)     // Catch: java.lang.Throwable -> L9b
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L9b
            r7.unlock(r4)
            yz.g2 r7 = yz.g2.f100423a
            return r7
        L9b:
            r8 = move-exception
            r7.unlock(r4)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.f.b(java.lang.String, java.lang.String, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(@m80.k java.lang.String r7, @m80.l java.lang.String r8, @m80.k j00.c<? super yz.g2> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof s3.f.c
            if (r0 == 0) goto L13
            r0 = r9
            s3.f$c r0 = (s3.f.c) r0
            int r1 = r0.f87514i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f87514i = r1
            goto L18
        L13:
            s3.f$c r0 = new s3.f$c
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f87512g
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f87514i
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L42
            if (r2 != r3) goto L3a
            java.lang.Object r7 = r0.f87510e
            n40.a r7 = (n40.a) r7
            java.lang.Object r8 = r0.f87509d
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r1 = r0.f87507b
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.f87506a
            java.lang.String r0 = (java.lang.String) r0
            kotlin.e.n(r9)
            goto L8d
        L3a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L42:
            kotlin.e.n(r9)
            if (r8 != 0) goto L52
            com.baicizhan.app.biz.auth.r r9 = r6.f87488a
            java.lang.Long r9 = r9.b()
            if (r9 != 0) goto L53
            yz.g2 r7 = yz.g2.f100423a
            return r7
        L52:
            r9 = r8
        L53:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r9)
            r5 = 95
            r2.append(r5)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            n40.a r5 = r6.f87489b
            java.lang.Object r7 = l00.k.a(r7)
            r0.f87506a = r7
            java.lang.Object r7 = l00.k.a(r8)
            r0.f87507b = r7
            java.lang.Object r7 = l00.k.a(r9)
            r0.f87508c = r7
            r0.f87509d = r2
            r0.f87510e = r5
            r7 = 0
            r0.f87511f = r7
            r0.f87514i = r3
            java.lang.Object r7 = r5.lock(r4, r0)
            if (r7 != r1) goto L8b
            return r1
        L8b:
            r8 = r2
            r7 = r5
        L8d:
            java.util.Map<java.lang.String, java.lang.Long> r9 = r6.f87491d     // Catch: java.lang.Throwable -> L9b
            java.lang.Object r8 = r9.remove(r8)     // Catch: java.lang.Throwable -> L9b
            java.lang.Long r8 = (java.lang.Long) r8     // Catch: java.lang.Throwable -> L9b
            r7.unlock(r4)
            yz.g2 r7 = yz.g2.f100423a
            return r7
        L9b:
            r8 = move-exception
            r7.unlock(r4)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.f.d(java.lang.String, java.lang.String, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00dc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(@m80.k java.lang.String r18, @m80.k x00.l<? super j00.c<? super yz.g2>, ? extends java.lang.Object> r19, @m80.k j00.c<? super yz.g2> r20) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.f.f(java.lang.String, x00.l, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0102 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ea A[Catch: all -> 0x01a5, TRY_LEAVE, TryCatch #1 {all -> 0x01a5, blocks: (B:40:0x00da, B:54:0x00ea), top: B:39:0x00da }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(@m80.k java.lang.String r21, long r22, @m80.k x00.l<? super j00.c<? super yz.g2>, ? extends java.lang.Object> r24, @m80.k j00.c<? super yz.g2> r25) {
        /*
            Method dump skipped, instructions count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.f.g(java.lang.String, long, x00.l, j00.c):java.lang.Object");
    }
}
