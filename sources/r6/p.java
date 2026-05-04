package r6;

import c40.l3;
import c40.n0;
import c40.r0;
import c40.s0;
import com.microsoft.thrifty.service.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.x0;
import l7.i0;
import y7.d;
import yz.g2;
import z8.b2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r
@u0({"SMAP\nFetchRankInfoUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FetchRankInfoUC.kt\ncom/baicizhan/app/biz/game/uc/sync/atomic/FetchRankInfoUC\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 3 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService\n+ 4 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt\n+ 5 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService$thrift$1\n+ 6 Koin.kt\norg/koin/core/Koin\n+ 7 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,38:1\n47#2,4:39\n6#3:43\n64#4,2:44\n66#4:47\n67#4,2:53\n6#5:46\n124#6,4:48\n142#7:52\n*S KotlinDebug\n*F\n+ 1 FetchRankInfoUC.kt\ncom/baicizhan/app/biz/game/uc/sync/atomic/FetchRankInfoUC\n*L\n22#1:39,4\n20#1:43\n20#1:44,2\n20#1:47\n20#1:53,2\n20#1:46\n20#1:48,4\n20#1:52\n*E\n"})
/* loaded from: classes3.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final l7.p f83201a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final p5.c f83202b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final r0 f83203c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final u3.a<z8.t> f83204d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.sync.atomic.FetchRankInfoUC$invoke$2", f = "FetchRankInfoUC.kt", i = {1, 1}, l = {31, 32}, m = "invokeSuspend", n = {"it", "$i$a$-also-FetchRankInfoUC$invoke$2$1"}, s = {"L$1", "I$0"}, v = 1)
    public static final class a extends SuspendLambda implements x00.l<j00.c<? super z8.t>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f83205a;

        /* renamed from: b, reason: collision with root package name */
        public Object f83206b;

        /* renamed from: c, reason: collision with root package name */
        public int f83207c;

        /* renamed from: d, reason: collision with root package name */
        public int f83208d;

        public a(j00.c<? super a> cVar) {
            super(1, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(j00.c<?> cVar) {
            return p.this.new a(cVar);
        }

        @Override // x00.l
        public final Object invoke(j00.c<? super z8.t> cVar) {
            return ((a) create(cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
        
            if (r6 == r0) goto L16;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r5.f83208d
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L24
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                java.lang.Object r0 = r5.f83206b
                z8.t r0 = (z8.t) r0
                java.lang.Object r0 = r5.f83205a
                kotlin.e.n(r6)
                return r0
            L18:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L20:
                kotlin.e.n(r6)
                goto L36
            L24:
                kotlin.e.n(r6)
                r6.p r6 = r6.p.this
                z8.b2 r6 = r6.p.b(r6)
                r5.f83208d = r3
                java.lang.Object r6 = r6.m1(r5)
                if (r6 != r0) goto L36
                goto L52
            L36:
                r6.p r1 = r6.p.this
                r3 = r6
                z8.t r3 = (z8.t) r3
                p5.c r1 = r6.p.a(r1)
                r5.f83205a = r6
                java.lang.Object r4 = l00.k.a(r3)
                r5.f83206b = r4
                r4 = 0
                r5.f83207c = r4
                r5.f83208d = r2
                java.lang.Object r1 = r1.e(r3, r5)
                if (r1 != r0) goto L53
            L52:
                return r0
            L53:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: r6.p.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 FetchRankInfoUC.kt\ncom/baicizhan/app/biz/game/uc/sync/atomic/FetchRankInfoUC\n*L\n1#1,49:1\n23#2,2:50\n*E\n"})
    public static final class b extends kotlin.coroutines.a implements n0 {
        public b(n0.b bVar) {
            super(bVar);
        }

        @Override // c40.n0
        public void handleException(kotlin.coroutines.d dVar, Throwable th2) {
            z6.b.f101032b.e(q.f83216a, "Uncaught exception ", th2);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class c implements x00.l<w7.d<b2>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f83210a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f83211b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f83212c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        public static final class a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f83213a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f83214b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f83215c;

            public a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f83213a = eVar;
                this.f83214b = cVar;
                this.f83215c = dVar;
            }

            public final void a(d.a randomRetry) {
                g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f83213a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f83213a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f83214b.b(this.f83215c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public c(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f83210a = dVar;
            this.f83211b = eVar;
            this.f83212c = cVar;
        }

        public final void a(w7.d<b2> thriftBuilder) {
            g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new a(this.f83211b, this.f83212c, this.f83210a));
            x00.p<ws.i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f83210a);
            g0.n(pVar, "null cannot be cast to non-null type kotlin.Function2<com.microsoft.thrifty.protocol.Protocol, com.microsoft.thrifty.service.AsyncClientBase.Listener, T of com.baicizhan.app.biz.thrift.ThriftServiceImplKt.thriftImpl>");
            thriftBuilder.f((x00.p) x0.q(pVar, 2));
            thriftBuilder.g(i0.a.b.f70581a);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(w7.d<b2> dVar) {
            a(dVar);
            return g2.f100423a;
        }
    }

    public p(@m80.k l7.p thriftService, @m80.k p5.c rankRepo) {
        g0.p(thriftService, "thriftService");
        g0.p(rankRepo, "rankRepo");
        this.f83201a = thriftService;
        this.f83202b = rankRepo;
        r0 a11 = s0.a(c4.o.b().plus(l3.c(null, 1, null)).plus(new b(n0.f7891d0)));
        this.f83203c = a11;
        this.f83204d = new u3.a<>(a11);
    }

    public final b2 c() {
        return (b2) w7.f.b(new c(o0.d(b2.class), new l7.e(null, null, 3, null), (l7.c) c4.j.f7801a.a().P().h().i(o0.d(l7.c.class), null, null)));
    }

    @m80.l
    public final Object d(@m80.k j00.c<? super z8.t> cVar) {
        return this.f83204d.d(new a(null), cVar);
    }
}
