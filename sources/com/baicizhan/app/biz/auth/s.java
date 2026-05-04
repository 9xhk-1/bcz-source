package com.baicizhan.app.biz.auth;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r(binds = {r.class, s.class})
@u0({"SMAP\nTokenProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TokenProvider.kt\ncom/baicizhan/app/biz/auth/TokenProviderImpl\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,50:1\n116#2,11:51\n116#2,11:62\n*S KotlinDebug\n*F\n+ 1 TokenProvider.kt\ncom/baicizhan/app/biz/auth/TokenProviderImpl\n*L\n34#1:51,11\n44#1:62,11\n*E\n"})
/* loaded from: classes3.dex */
public final class s implements r {

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    public volatile String f13749a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public volatile Long f13750b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final n40.a f13751c = n40.g.b(false, 1, null);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.auth.TokenProviderImpl", f = "TokenProvider.kt", i = {0, 0}, l = {56}, m = "clearCredentials", n = {"$this$withLock_u24default$iv", "$i$f$withLock"}, s = {"L$0", "I$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f13752a;

        /* renamed from: b, reason: collision with root package name */
        public int f13753b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f13754c;

        /* renamed from: e, reason: collision with root package name */
        public int f13756e;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f13754c = obj;
            this.f13756e |= Integer.MIN_VALUE;
            return s.this.c(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.auth.TokenProviderImpl", f = "TokenProvider.kt", i = {0, 0, 0, 0}, l = {56}, m = "setCredentials", n = {"token", "bczId", "$this$withLock_u24default$iv", "$i$f$withLock"}, s = {"L$0", "L$1", "L$2", "I$0"}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f13757a;

        /* renamed from: b, reason: collision with root package name */
        public Object f13758b;

        /* renamed from: c, reason: collision with root package name */
        public Object f13759c;

        /* renamed from: d, reason: collision with root package name */
        public int f13760d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f13761e;

        /* renamed from: g, reason: collision with root package name */
        public int f13763g;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f13761e = obj;
            this.f13763g |= Integer.MIN_VALUE;
            return s.this.d(null, null, this);
        }
    }

    @Override // com.baicizhan.app.biz.auth.r
    @m80.l
    public String a() {
        return this.f13749a;
    }

    @Override // com.baicizhan.app.biz.auth.r
    @m80.l
    public Long b() {
        return this.f13750b;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(@m80.k j00.c<? super yz.g2> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.baicizhan.app.biz.auth.s.a
            if (r0 == 0) goto L13
            r0 = r6
            com.baicizhan.app.biz.auth.s$a r0 = (com.baicizhan.app.biz.auth.s.a) r0
            int r1 = r0.f13756e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13756e = r1
            goto L18
        L13:
            com.baicizhan.app.biz.auth.s$a r0 = new com.baicizhan.app.biz.auth.s$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f13754c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f13756e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r0 = r0.f13752a
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
            n40.a r6 = r5.f13751c
            r0.f13752a = r6
            r2 = 0
            r0.f13753b = r2
            r0.f13756e = r3
            java.lang.Object r0 = r6.lock(r4, r0)
            if (r0 != r1) goto L49
            return r1
        L49:
            r0 = r6
        L4a:
            r5.f13749a = r4     // Catch: java.lang.Throwable -> L54
            r5.f13750b = r4     // Catch: java.lang.Throwable -> L54
            yz.g2 r6 = yz.g2.f100423a     // Catch: java.lang.Throwable -> L54
            r0.unlock(r4)
            return r6
        L54:
            r6 = move-exception
            r0.unlock(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.auth.s.c(j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(@m80.l java.lang.String r6, @m80.l java.lang.Long r7, @m80.k j00.c<? super yz.g2> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.baicizhan.app.biz.auth.s.b
            if (r0 == 0) goto L13
            r0 = r8
            com.baicizhan.app.biz.auth.s$b r0 = (com.baicizhan.app.biz.auth.s.b) r0
            int r1 = r0.f13763g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13763g = r1
            goto L18
        L13:
            com.baicizhan.app.biz.auth.s$b r0 = new com.baicizhan.app.biz.auth.s$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f13761e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f13763g
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r6 = r0.f13759c
            n40.a r6 = (n40.a) r6
            java.lang.Object r7 = r0.f13758b
            java.lang.Long r7 = (java.lang.Long) r7
            java.lang.Object r0 = r0.f13757a
            java.lang.String r0 = (java.lang.String) r0
            kotlin.e.n(r8)
            r8 = r6
            r6 = r0
            goto L57
        L38:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L40:
            kotlin.e.n(r8)
            n40.a r8 = r5.f13751c
            r0.f13757a = r6
            r0.f13758b = r7
            r0.f13759c = r8
            r2 = 0
            r0.f13760d = r2
            r0.f13763g = r3
            java.lang.Object r0 = r8.lock(r4, r0)
            if (r0 != r1) goto L57
            return r1
        L57:
            r5.f13749a = r6     // Catch: java.lang.Throwable -> L61
            r5.f13750b = r7     // Catch: java.lang.Throwable -> L61
            yz.g2 r6 = yz.g2.f100423a     // Catch: java.lang.Throwable -> L61
            r8.unlock(r4)
            return r6
        L61:
            r6 = move-exception
            r8.unlock(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.auth.s.d(java.lang.String, java.lang.Long, j00.c):java.lang.Object");
    }
}
