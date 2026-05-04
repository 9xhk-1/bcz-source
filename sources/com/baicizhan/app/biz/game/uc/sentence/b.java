package com.baicizhan.app.biz.game.uc.sentence;

import com.baicizhan.app.biz.game.uc.abtest.GetABTestUC;
import com.microsoft.thrifty.service.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.x0;
import l7.i0;
import l7.p;
import oa0.r;
import p8.s;
import y7.d;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r
@u0({"SMAP\nConsumeSentenceEnergyUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConsumeSentenceEnergyUC.kt\ncom/baicizhan/app/biz/game/uc/sentence/ConsumeSentenceEnergyUC\n+ 2 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService\n+ 3 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt\n+ 4 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService$thrift$1\n+ 5 Koin.kt\norg/koin/core/Koin\n+ 6 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,55:1\n6#2:56\n64#3,2:57\n66#3:60\n67#3,2:66\n6#4:59\n124#5,4:61\n142#6:65\n*S KotlinDebug\n*F\n+ 1 ConsumeSentenceEnergyUC.kt\ncom/baicizhan/app/biz/game/uc/sentence/ConsumeSentenceEnergyUC\n*L\n29#1:56\n29#1:57,2\n29#1:60\n29#1:66,2\n29#1:59\n29#1:61,4\n29#1:65\n*E\n"})
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final p f15204a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final c6.b f15205b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final b6.a f15206c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final GetABTestUC f15207d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final s f15208e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.sentence.ConsumeSentenceEnergyUC", f = "ConsumeSentenceEnergyUC.kt", i = {1, 1, 2}, l = {34, 38, 48}, m = "invoke", n = {"$this$invoke_u24lambda_u240", "$i$a$-runCatching-ConsumeSentenceEnergyUC$invoke$energyInfo$1", "energyInfo"}, s = {"L$0", "I$0", "L$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f15209a;

        /* renamed from: b, reason: collision with root package name */
        public int f15210b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f15211c;

        /* renamed from: e, reason: collision with root package name */
        public int f15213e;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f15211c = obj;
            this.f15213e |= Integer.MIN_VALUE;
            return b.this.a(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    /* renamed from: com.baicizhan.app.biz.game.uc.sentence.b$b, reason: collision with other inner class name */
    public static final class C0223b implements x00.l<w7.d<s>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f15214a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f15215b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f15216c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        /* renamed from: com.baicizhan.app.biz.game.uc.sentence.b$b$a */
        public static final class a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f15217a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f15218b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f15219c;

            public a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f15217a = eVar;
                this.f15218b = cVar;
                this.f15219c = dVar;
            }

            public final void a(d.a randomRetry) {
                g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f15217a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f15217a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f15218b.b(this.f15219c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public C0223b(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f15214a = dVar;
            this.f15215b = eVar;
            this.f15216c = cVar;
        }

        public final void a(w7.d<s> thriftBuilder) {
            g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new a(this.f15215b, this.f15216c, this.f15214a));
            x00.p<ws.i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f15214a);
            g0.n(pVar, "null cannot be cast to non-null type kotlin.Function2<com.microsoft.thrifty.protocol.Protocol, com.microsoft.thrifty.service.AsyncClientBase.Listener, T of com.baicizhan.app.biz.thrift.ThriftServiceImplKt.thriftImpl>");
            thriftBuilder.f((x00.p) x0.q(pVar, 2));
            thriftBuilder.g(i0.a.b.f70581a);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(w7.d<s> dVar) {
            a(dVar);
            return g2.f100423a;
        }
    }

    public b(@m80.k p thriftService, @m80.k c6.b userInfo, @m80.k b6.a userGuideRepo, @m80.k GetABTestUC getABTestUC) {
        g0.p(thriftService, "thriftService");
        g0.p(userInfo, "userInfo");
        g0.p(userGuideRepo, "userGuideRepo");
        g0.p(getABTestUC, "getABTestUC");
        this.f15204a = thriftService;
        this.f15205b = userInfo;
        this.f15206c = userGuideRepo;
        this.f15207d = getABTestUC;
        l7.e eVar = new l7.e(null, null, 3, null);
        g2 g2Var = g2.f100423a;
        this.f15208e = (s) w7.f.b(new C0223b(o0.d(s.class), eVar, (l7.c) c4.j.f7801a.a().P().h().i(o0.d(l7.c.class), null, null)));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|8|(1:(1:(1:(3:13|14|15)(2:17|18))(8:19|20|21|22|(3:28|29|(2:31|(2:33|34)(1:35))(1:36))|24|(3:27|14|15)|26))(1:41))(1:49)|42|(2:44|45)(8:46|(2:48|26)|21|22|(0)|24|(0)|26)))|53|6|7|8|(0)(0)|42|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0069, code lost:
    
        if (r0 == r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0046, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0097, code lost:
    
        r2 = kotlin.Result.Companion;
        r0 = kotlin.Result.m6308constructorimpl(kotlin.e.a(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007b A[Catch: all -> 0x0046, TRY_ENTER, TryCatch #1 {all -> 0x0046, blocks: (B:20:0x0042, B:21:0x0090, B:46:0x007b), top: B:8:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x004c  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@m80.k j00.c<? super java.lang.Integer> r13) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.sentence.b.a(j00.c):java.lang.Object");
    }
}
