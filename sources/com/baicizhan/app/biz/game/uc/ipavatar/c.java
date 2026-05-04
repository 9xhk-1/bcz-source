package com.baicizhan.app.biz.game.uc.ipavatar;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.microsoft.thrifty.service.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.x0;
import l7.i0;
import l7.p;
import m80.l;
import oa0.r;
import y7.d;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r
@u0({"SMAP\nFetchIpAvatarHomeUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FetchIpAvatarHomeUC.kt\ncom/baicizhan/app/biz/game/uc/ipavatar/FetchIpAvatarHomeUC\n+ 2 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService\n+ 3 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt\n+ 4 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService$thrift$1\n+ 5 Koin.kt\norg/koin/core/Koin\n+ 6 Scope.kt\norg/koin/core/scope/Scope\n+ 7 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,45:1\n6#2:46\n64#3,2:47\n66#3:50\n67#3,2:56\n6#4:49\n124#5,4:51\n142#6:55\n116#7,11:58\n116#7,11:69\n*S KotlinDebug\n*F\n+ 1 FetchIpAvatarHomeUC.kt\ncom/baicizhan/app/biz/game/uc/ipavatar/FetchIpAvatarHomeUC\n*L\n19#1:46\n19#1:47,2\n19#1:50\n19#1:56,2\n19#1:49\n19#1:51,4\n19#1:55\n24#1:58,11\n33#1:69,11\n*E\n"})
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final p f14794a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final q5.a f14795b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final a6.a f14796c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final n40.a f14797d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.ipavatar.FetchIpAvatarHomeUC", f = "FetchIpAvatarHomeUC.kt", i = {0, 0, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3}, l = {51, 25, 26, 27}, m = "checkFetch", n = {"$this$withLock_u24default$iv", "$i$f$withLock", "$this$withLock_u24default$iv", "$i$f$withLock", "$i$a$-withLock$default-FetchIpAvatarHomeUC$checkFetch$2", "$this$withLock_u24default$iv", "ipState", "$i$f$withLock", "$i$a$-withLock$default-FetchIpAvatarHomeUC$checkFetch$2", "$this$withLock_u24default$iv", "ipState", "$i$f$withLock", "$i$a$-withLock$default-FetchIpAvatarHomeUC$checkFetch$2"}, s = {"L$0", "I$0", "L$0", "I$0", "I$1", "L$0", "L$1", "I$0", "I$1", "L$0", "L$1", "I$0", "I$1"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f14798a;

        /* renamed from: b, reason: collision with root package name */
        public Object f14799b;

        /* renamed from: c, reason: collision with root package name */
        public int f14800c;

        /* renamed from: d, reason: collision with root package name */
        public int f14801d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f14802e;

        /* renamed from: g, reason: collision with root package name */
        public int f14804g;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f14802e = obj;
            this.f14804g |= Integer.MIN_VALUE;
            return c.this.b(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.ipavatar.FetchIpAvatarHomeUC", f = "FetchIpAvatarHomeUC.kt", i = {0, 1, 1}, l = {39, 41}, m = "fetch", n = {"update", HiAnalyticsConstant.Direction.RESPONSE, "update"}, s = {"Z$0", "L$0", "Z$0"}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public boolean f14805a;

        /* renamed from: b, reason: collision with root package name */
        public Object f14806b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f14807c;

        /* renamed from: e, reason: collision with root package name */
        public int f14809e;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f14807c = obj;
            this.f14809e |= Integer.MIN_VALUE;
            return c.this.c(false, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.ipavatar.FetchIpAvatarHomeUC", f = "FetchIpAvatarHomeUC.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {51, 34}, m = "invoke", n = {"$this$withLock_u24default$iv", "update", "$i$f$withLock", "$this$withLock_u24default$iv", "update", "$i$f$withLock", "$i$a$-withLock$default-FetchIpAvatarHomeUC$invoke$2"}, s = {"L$0", "Z$0", "I$0", "L$0", "Z$0", "I$0", "I$1"}, v = 1)
    /* renamed from: com.baicizhan.app.biz.game.uc.ipavatar.c$c, reason: collision with other inner class name */
    public static final class C0216c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public boolean f14810a;

        /* renamed from: b, reason: collision with root package name */
        public Object f14811b;

        /* renamed from: c, reason: collision with root package name */
        public int f14812c;

        /* renamed from: d, reason: collision with root package name */
        public int f14813d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f14814e;

        /* renamed from: g, reason: collision with root package name */
        public int f14816g;

        public C0216c(j00.c<? super C0216c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f14814e = obj;
            this.f14816g |= Integer.MIN_VALUE;
            return c.this.f(false, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class d implements x00.l<w7.d<h8.b>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f14817a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f14818b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f14819c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        public static final class a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f14820a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f14821b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f14822c;

            public a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f14820a = eVar;
                this.f14821b = cVar;
                this.f14822c = dVar;
            }

            public final void a(d.a randomRetry) {
                g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f14820a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f14820a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f14821b.b(this.f14822c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public d(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f14817a = dVar;
            this.f14818b = eVar;
            this.f14819c = cVar;
        }

        public final void a(w7.d<h8.b> thriftBuilder) {
            g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new a(this.f14818b, this.f14819c, this.f14817a));
            x00.p<ws.i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f14817a);
            g0.n(pVar, "null cannot be cast to non-null type kotlin.Function2<com.microsoft.thrifty.protocol.Protocol, com.microsoft.thrifty.service.AsyncClientBase.Listener, T of com.baicizhan.app.biz.thrift.ThriftServiceImplKt.thriftImpl>");
            thriftBuilder.f((x00.p) x0.q(pVar, 2));
            thriftBuilder.g(i0.a.b.f70581a);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(w7.d<h8.b> dVar) {
            a(dVar);
            return g2.f100423a;
        }
    }

    public c(@m80.k p thriftService, @m80.k q5.a ipAvatarStateRepo, @m80.k a6.a studyRoundStatsRepo) {
        g0.p(thriftService, "thriftService");
        g0.p(ipAvatarStateRepo, "ipAvatarStateRepo");
        g0.p(studyRoundStatsRepo, "studyRoundStatsRepo");
        this.f14794a = thriftService;
        this.f14795b = ipAvatarStateRepo;
        this.f14796c = studyRoundStatsRepo;
        this.f14797d = n40.g.b(false, 1, null);
    }

    public static /* synthetic */ Object d(c cVar, boolean z11, j00.c cVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        return cVar.c(z11, cVar2);
    }

    public static /* synthetic */ Object g(c cVar, boolean z11, j00.c cVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        return cVar.f(z11, cVar2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(5:(2:3|(8:5|6|7|(1:(1:(1:(1:(6:13|14|15|16|17|18)(2:24|25))(8:26|27|28|(2:30|31)|35|16|17|18))(6:36|37|38|39|(2:41|(5:(2:44|(2:46|33)(3:47|28|(0)))|35|16|17|18))|31))(1:48))(3:56|(1:58)|33)|49|50|(5:52|38|39|(0)|31)|33))|49|50|(0)|33)|61|6|7|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e2, code lost:
    
        if (c(true, r0) == r1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0059, code lost:
    
        r13 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x005a, code lost:
    
        r0 = r6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4 A[Catch: all -> 0x0059, TryCatch #0 {all -> 0x0059, blocks: (B:27:0x0054, B:28:0x00c4, B:31:0x00d0, B:37:0x0065, B:39:0x00a0, B:41:0x00a4, B:44:0x00aa), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Type inference failed for: r12v0, types: [com.baicizhan.app.biz.game.uc.ipavatar.c] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object] */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@m80.k j00.c<? super yz.g2> r13) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.ipavatar.c.b(j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004d, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(boolean r6, j00.c<? super h8.d> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.baicizhan.app.biz.game.uc.ipavatar.c.b
            if (r0 == 0) goto L13
            r0 = r7
            com.baicizhan.app.biz.game.uc.ipavatar.c$b r0 = (com.baicizhan.app.biz.game.uc.ipavatar.c.b) r0
            int r1 = r0.f14809e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14809e = r1
            goto L18
        L13:
            com.baicizhan.app.biz.game.uc.ipavatar.c$b r0 = new com.baicizhan.app.biz.game.uc.ipavatar.c$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f14807c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f14809e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r6 = r0.f14806b
            h8.d r6 = (h8.d) r6
            kotlin.e.n(r7)
            return r6
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            boolean r6 = r0.f14805a
            kotlin.e.n(r7)
            goto L50
        L3e:
            kotlin.e.n(r7)
            h8.b r7 = r5.e()
            r0.f14805a = r6
            r0.f14809e = r4
            java.lang.Object r7 = r7.p4(r0)
            if (r7 != r1) goto L50
            goto L62
        L50:
            h8.d r7 = (h8.d) r7
            if (r6 == 0) goto L63
            q5.a r2 = r5.f14795b
            r0.f14806b = r7
            r0.f14805a = r6
            r0.f14809e = r3
            java.lang.Object r6 = r2.e(r7, r0)
            if (r6 != r1) goto L63
        L62:
            return r1
        L63:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.ipavatar.c.c(boolean, j00.c):java.lang.Object");
    }

    public final h8.b e() {
        return (h8.b) w7.f.b(new d(o0.d(h8.b.class), new l7.e(null, null, 3, null), (l7.c) c4.j.f7801a.a().P().h().i(o0.d(l7.c.class), null, null)));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(boolean r9, @m80.k j00.c<? super h8.d> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.baicizhan.app.biz.game.uc.ipavatar.c.C0216c
            if (r0 == 0) goto L13
            r0 = r10
            com.baicizhan.app.biz.game.uc.ipavatar.c$c r0 = (com.baicizhan.app.biz.game.uc.ipavatar.c.C0216c) r0
            int r1 = r0.f14816g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14816g = r1
            goto L18
        L13:
            com.baicizhan.app.biz.game.uc.ipavatar.c$c r0 = new com.baicizhan.app.biz.game.uc.ipavatar.c$c
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f14814e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f14816g
            r3 = 0
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L4c
            if (r2 == r5) goto L3c
            if (r2 != r4) goto L34
            java.lang.Object r9 = r0.f14811b
            n40.a r9 = (n40.a) r9
            kotlin.e.n(r10)     // Catch: java.lang.Throwable -> L32
            goto L75
        L32:
            r10 = move-exception
            goto L7f
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3c:
            int r9 = r0.f14812c
            boolean r2 = r0.f14810a
            java.lang.Object r5 = r0.f14811b
            n40.a r5 = (n40.a) r5
            kotlin.e.n(r10)
            r10 = r2
            r2 = r9
            r9 = r10
            r10 = r5
            goto L61
        L4c:
            kotlin.e.n(r10)
            n40.a r10 = r8.f14797d
            r0.f14811b = r10
            r0.f14810a = r9
            r0.f14812c = r3
            r0.f14816g = r5
            java.lang.Object r2 = r10.lock(r6, r0)
            if (r2 != r1) goto L60
            goto L71
        L60:
            r2 = r3
        L61:
            r0.f14811b = r10     // Catch: java.lang.Throwable -> L7b
            r0.f14810a = r9     // Catch: java.lang.Throwable -> L7b
            r0.f14812c = r2     // Catch: java.lang.Throwable -> L7b
            r0.f14813d = r3     // Catch: java.lang.Throwable -> L7b
            r0.f14816g = r4     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r9 = r8.c(r9, r0)     // Catch: java.lang.Throwable -> L7b
            if (r9 != r1) goto L72
        L71:
            return r1
        L72:
            r7 = r10
            r10 = r9
            r9 = r7
        L75:
            h8.d r10 = (h8.d) r10     // Catch: java.lang.Throwable -> L32
            r9.unlock(r6)
            return r10
        L7b:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L7f:
            r9.unlock(r6)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.ipavatar.c.f(boolean, j00.c):java.lang.Object");
    }
}
