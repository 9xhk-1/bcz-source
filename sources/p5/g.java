package p5;

import com.baicizhan.online.playground_api.PlaygroundApiService;
import com.microsoft.thrifty.service.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.x0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e0;
import kotlinx.coroutines.flow.x;
import l7.i0;
import y7.d;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r(binds = {p5.a.class})
@u0({"SMAP\nLavaQuestRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LavaQuestRepo.kt\ncom/baicizhan/app/biz/game/repo/incentive/LavaQuestRepoImpl\n+ 2 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService\n+ 3 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt\n+ 4 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService$thrift$1\n+ 5 Koin.kt\norg/koin/core/Koin\n+ 6 Scope.kt\norg/koin/core/scope/Scope\n+ 7 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,84:1\n6#2:85\n64#3,2:86\n66#3:89\n67#3,2:95\n6#4:88\n124#5,4:90\n142#6:94\n116#7,11:97\n*S KotlinDebug\n*F\n+ 1 LavaQuestRepo.kt\ncom/baicizhan/app/biz/game/repo/incentive/LavaQuestRepoImpl\n*L\n37#1:85\n37#1:86,2\n37#1:89\n37#1:95,2\n37#1:88\n37#1:90,4\n37#1:94\n71#1:97,11\n*E\n"})
/* loaded from: classes3.dex */
public final class g implements p5.a {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final l7.p f78923a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.preferences.a f78924b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.auth.r f78925c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final n40.a f78926d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final x<Boolean> f78927e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.incentive.LavaQuestRepoImpl", f = "LavaQuestRepo.kt", i = {1, 1, 1, 2, 2, 2, 2, 3}, l = {70, 90, 72, 77}, m = "fetch", n = {"questInfo", "$this$withLock_u24default$iv", "$i$f$withLock", "questInfo", "$this$withLock_u24default$iv", "$i$f$withLock", "$i$a$-withLock$default-LavaQuestRepoImpl$fetch$2", "questInfo"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "I$0", "I$1", "L$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f78928a;

        /* renamed from: b, reason: collision with root package name */
        public Object f78929b;

        /* renamed from: c, reason: collision with root package name */
        public int f78930c;

        /* renamed from: d, reason: collision with root package name */
        public int f78931d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f78932e;

        /* renamed from: g, reason: collision with root package name */
        public int f78934g;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f78932e = obj;
            this.f78934g |= Integer.MIN_VALUE;
            return g.this.b(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.incentive.LavaQuestRepoImpl", f = "LavaQuestRepo.kt", i = {}, l = {58}, m = "getQuestInfo", n = {}, s = {}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f78935a;

        /* renamed from: c, reason: collision with root package name */
        public int f78937c;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f78935a = obj;
            this.f78937c |= Integer.MIN_VALUE;
            return g.this.d(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class c implements x00.l<w7.d<PlaygroundApiService>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f78938a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f78939b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f78940c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        public static final class a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f78941a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f78942b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f78943c;

            public a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f78941a = eVar;
                this.f78942b = cVar;
                this.f78943c = dVar;
            }

            public final void a(d.a randomRetry) {
                g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f78941a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f78941a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f78942b.b(this.f78943c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public c(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f78938a = dVar;
            this.f78939b = eVar;
            this.f78940c = cVar;
        }

        public final void a(w7.d<PlaygroundApiService> thriftBuilder) {
            g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new a(this.f78939b, this.f78940c, this.f78938a));
            x00.p<ws.i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f78938a);
            g0.n(pVar, "null cannot be cast to non-null type kotlin.Function2<com.microsoft.thrifty.protocol.Protocol, com.microsoft.thrifty.service.AsyncClientBase.Listener, T of com.baicizhan.app.biz.thrift.ThriftServiceImplKt.thriftImpl>");
            thriftBuilder.f((x00.p) x0.q(pVar, 2));
            thriftBuilder.g(i0.a.b.f70581a);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(w7.d<PlaygroundApiService> dVar) {
            a(dVar);
            return g2.f100423a;
        }
    }

    public g(@m80.k l7.p thriftService, @m80.k com.baicizhan.app.preferences.a factory, @m80.k com.baicizhan.app.biz.auth.r tokenProvider) {
        g0.p(thriftService, "thriftService");
        g0.p(factory, "factory");
        g0.p(tokenProvider, "tokenProvider");
        this.f78923a = thriftService;
        this.f78924b = factory;
        this.f78925c = tokenProvider;
        this.f78926d = n40.g.b(false, 1, null);
        x<Boolean> a11 = e0.a(1, 0, BufferOverflow.DROP_OLDEST);
        a11.d(Boolean.TRUE);
        this.f78927e = a11;
    }

    @Override // p5.a
    @m80.k
    public kotlinx.coroutines.flow.i<Boolean> a() {
        return this.f78927e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c4, code lost:
    
        if (r14.emit(r2, r0) != r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0071, code lost:
    
        if (r14 == r1) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [n40.a] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v4, types: [n40.a] */
    @Override // p5.a
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(@m80.k j00.c<? super yz.g2> r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof p5.g.a
            if (r0 == 0) goto L13
            r0 = r14
            p5.g$a r0 = (p5.g.a) r0
            int r1 = r0.f78934g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f78934g = r1
            goto L18
        L13:
            p5.g$a r0 = new p5.g$a
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f78932e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f78934g
            r3 = 0
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            if (r2 == 0) goto L64
            if (r2 == r7) goto L60
            if (r2 == r6) goto L50
            if (r2 == r5) goto L41
            if (r2 != r4) goto L39
            java.lang.Object r0 = r0.f78928a
            com.baicizhan.online.playground_api.LavaquestGameInfo r0 = (com.baicizhan.online.playground_api.LavaquestGameInfo) r0
            kotlin.e.n(r14)
            goto Lc7
        L39:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L41:
            java.lang.Object r2 = r0.f78929b
            n40.a r2 = (n40.a) r2
            java.lang.Object r3 = r0.f78928a
            com.baicizhan.online.playground_api.LavaquestGameInfo r3 = (com.baicizhan.online.playground_api.LavaquestGameInfo) r3
            kotlin.e.n(r14)     // Catch: java.lang.Throwable -> L4d
            goto Lab
        L4d:
            r14 = move-exception
            goto Lca
        L50:
            int r2 = r0.f78930c
            java.lang.Object r6 = r0.f78929b
            n40.a r6 = (n40.a) r6
            java.lang.Object r9 = r0.f78928a
            com.baicizhan.online.playground_api.LavaquestGameInfo r9 = (com.baicizhan.online.playground_api.LavaquestGameInfo) r9
            kotlin.e.n(r14)
            r14 = r2
            r2 = r6
            goto L89
        L60:
            kotlin.e.n(r14)
            goto L74
        L64:
            kotlin.e.n(r14)
            com.baicizhan.online.playground_api.PlaygroundApiService r14 = r13.g()
            r0.f78934g = r7
            java.lang.Object r14 = r14.get_lavaquest_game_info(r0)
            if (r14 != r1) goto L74
            goto Lc6
        L74:
            com.baicizhan.online.playground_api.LavaquestGameInfo r14 = (com.baicizhan.online.playground_api.LavaquestGameInfo) r14
            n40.a r2 = r13.f78926d
            r0.f78928a = r14
            r0.f78929b = r2
            r0.f78930c = r3
            r0.f78934g = r6
            java.lang.Object r6 = r2.lock(r8, r0)
            if (r6 != r1) goto L87
            goto Lc6
        L87:
            r9 = r14
            r14 = r3
        L89:
            com.baicizhan.app.preferences.g r6 = r13.f()     // Catch: java.lang.Throwable -> L4d
            java.lang.String r10 = "lava_quest_info"
            ts.a<com.baicizhan.online.playground_api.LavaquestGameInfo, com.baicizhan.online.playground_api.LavaquestGameInfo$Builder> r11 = com.baicizhan.online.playground_api.LavaquestGameInfo.ADAPTER     // Catch: java.lang.Throwable -> L4d
            byte[] r11 = l7.d.a(r9, r11)     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r12 = l00.k.a(r9)     // Catch: java.lang.Throwable -> L4d
            r0.f78928a = r12     // Catch: java.lang.Throwable -> L4d
            r0.f78929b = r2     // Catch: java.lang.Throwable -> L4d
            r0.f78930c = r14     // Catch: java.lang.Throwable -> L4d
            r0.f78931d = r3     // Catch: java.lang.Throwable -> L4d
            r0.f78934g = r5     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r14 = r6.e(r10, r11, r0)     // Catch: java.lang.Throwable -> L4d
            if (r14 != r1) goto Laa
            goto Lc6
        Laa:
            r3 = r9
        Lab:
            yz.g2 r14 = yz.g2.f100423a     // Catch: java.lang.Throwable -> L4d
            r2.unlock(r8)
            kotlinx.coroutines.flow.x<java.lang.Boolean> r14 = r13.f78927e
            java.lang.Boolean r2 = l00.a.a(r7)
            java.lang.Object r3 = l00.k.a(r3)
            r0.f78928a = r3
            r0.f78929b = r8
            r0.f78934g = r4
            java.lang.Object r14 = r14.emit(r2, r0)
            if (r14 != r1) goto Lc7
        Lc6:
            return r1
        Lc7:
            yz.g2 r14 = yz.g2.f100423a
            return r14
        Lca:
            r2.unlock(r8)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p5.g.b(j00.c):java.lang.Object");
    }

    @Override // p5.a
    @m80.l
    public Object c(boolean z11, @m80.k j00.c<? super g2> cVar) {
        Object g11 = f().g(h.f78946c, z11, cVar);
        return g11 == kotlin.coroutines.intrinsics.b.l() ? g11 : g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // p5.a
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(@m80.k j00.c<? super com.baicizhan.online.playground_api.LavaquestGameInfo> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof p5.g.b
            if (r0 == 0) goto L13
            r0 = r6
            p5.g$b r0 = (p5.g.b) r0
            int r1 = r0.f78937c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f78937c = r1
            goto L18
        L13:
            p5.g$b r0 = new p5.g$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f78935a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f78937c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            kotlin.e.n(r6)
            goto L44
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            kotlin.e.n(r6)
            com.baicizhan.app.preferences.g r6 = r5.f()
            r0.f78937c = r4
            java.lang.String r2 = "lava_quest_info"
            java.lang.Object r6 = r6.c(r2, r3, r0)
            if (r6 != r1) goto L44
            return r1
        L44:
            byte[] r6 = (byte[]) r6
            if (r6 == 0) goto L51
            ts.a<com.baicizhan.online.playground_api.LavaquestGameInfo, com.baicizhan.online.playground_api.LavaquestGameInfo$Builder> r0 = com.baicizhan.online.playground_api.LavaquestGameInfo.ADAPTER
            java.lang.Object r6 = l7.d.c(r6, r0)
            com.baicizhan.online.playground_api.LavaquestGameInfo r6 = (com.baicizhan.online.playground_api.LavaquestGameInfo) r6
            return r6
        L51:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p5.g.d(j00.c):java.lang.Object");
    }

    @Override // p5.a
    @m80.l
    public Object e(@m80.k j00.c<? super Boolean> cVar) {
        return f().b(h.f78946c, false, cVar);
    }

    public final com.baicizhan.app.preferences.g f() {
        com.baicizhan.app.preferences.a aVar = this.f78924b;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("lava_quest_scope-");
        Long b11 = this.f78925c.b();
        g0.m(b11);
        sb2.append(b11.longValue());
        return aVar.a(sb2.toString());
    }

    public final PlaygroundApiService g() {
        return (PlaygroundApiService) w7.f.b(new c(o0.d(PlaygroundApiService.class), new l7.e(null, null, 3, null), (l7.c) c4.j.f7801a.a().P().h().i(o0.d(l7.c.class), null, null)));
    }
}
