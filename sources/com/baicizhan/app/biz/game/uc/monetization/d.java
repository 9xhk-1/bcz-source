package com.baicizhan.app.biz.game.uc.monetization;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.microsoft.thrifty.service.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.x0;
import l7.i0;
import l7.p;
import oa0.r;
import y7.d;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r
@u0({"SMAP\nClaimFreeMemberUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClaimFreeMemberUC.kt\ncom/baicizhan/app/biz/game/uc/monetization/ClaimFreeMemberUC\n+ 2 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService\n+ 3 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt\n+ 4 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService$thrift$1\n+ 5 Koin.kt\norg/koin/core/Koin\n+ 6 Scope.kt\norg/koin/core/scope/Scope\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,29:1\n6#2:30\n64#3,2:31\n66#3:34\n67#3,2:40\n6#4:33\n124#5,4:35\n142#6:39\n1#7:42\n*S KotlinDebug\n*F\n+ 1 ClaimFreeMemberUC.kt\ncom/baicizhan/app/biz/game/uc/monetization/ClaimFreeMemberUC\n*L\n17#1:30\n17#1:31,2\n17#1:34\n17#1:40,2\n17#1:33\n17#1:35,4\n17#1:39\n*E\n"})
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final p f14905a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final c6.b f14906b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final c f14907c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.monetization.ClaimFreeMemberUC", f = "ClaimFreeMemberUC.kt", i = {0, 1, 1, 2, 2, 2, 2}, l = {20, 21, 22}, m = "invoke", n = {"memberType", HiAnalyticsConstant.Direction.RESPONSE, "memberType", HiAnalyticsConstant.Direction.RESPONSE, "$this$invoke_u24lambda_u240", "memberType", "$i$a$-runCatching-ClaimFreeMemberUC$invoke$2"}, s = {"I$0", "L$0", "I$0", "L$0", "L$1", "I$0", "I$1"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f14908a;

        /* renamed from: b, reason: collision with root package name */
        public int f14909b;

        /* renamed from: c, reason: collision with root package name */
        public Object f14910c;

        /* renamed from: d, reason: collision with root package name */
        public Object f14911d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f14912e;

        /* renamed from: g, reason: collision with root package name */
        public int f14914g;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f14912e = obj;
            this.f14914g |= Integer.MIN_VALUE;
            return d.this.b(0, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class b implements x00.l<w7.d<u8.h>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f14915a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f14916b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f14917c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        public static final class a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f14918a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f14919b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f14920c;

            public a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f14918a = eVar;
                this.f14919b = cVar;
                this.f14920c = dVar;
            }

            public final void a(d.a randomRetry) {
                g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f14918a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f14918a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f14919b.b(this.f14920c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public b(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f14915a = dVar;
            this.f14916b = eVar;
            this.f14917c = cVar;
        }

        public final void a(w7.d<u8.h> thriftBuilder) {
            g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new a(this.f14916b, this.f14917c, this.f14915a));
            x00.p<ws.i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f14915a);
            g0.n(pVar, "null cannot be cast to non-null type kotlin.Function2<com.microsoft.thrifty.protocol.Protocol, com.microsoft.thrifty.service.AsyncClientBase.Listener, T of com.baicizhan.app.biz.thrift.ThriftServiceImplKt.thriftImpl>");
            thriftBuilder.f((x00.p) x0.q(pVar, 2));
            thriftBuilder.g(i0.a.b.f70581a);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(w7.d<u8.h> dVar) {
            a(dVar);
            return g2.f100423a;
        }
    }

    public d(@m80.k p thrift, @m80.k c6.b userGameInfoRepo, @m80.k c checkFetchPromotionUC) {
        g0.p(thrift, "thrift");
        g0.p(userGameInfoRepo, "userGameInfoRepo");
        g0.p(checkFetchPromotionUC, "checkFetchPromotionUC");
        this.f14905a = thrift;
        this.f14906b = userGameInfoRepo;
        this.f14907c = checkFetchPromotionUC;
    }

    public final u8.h a() {
        return (u8.h) w7.f.b(new b(o0.d(u8.h.class), new l7.e(null, null, 3, null), (l7.c) c4.j.f7801a.a().P().h().i(o0.d(l7.c.class), null, null)));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(5:5|6|7|(1:(1:(1:(7:12|13|14|15|(1:17)|18|19)(2:22|23))(2:24|25))(1:28))(1:31)|29))|36|6|7|(0)(0)|29) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009b, code lost:
    
        if (r11.a(true, r0) == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007d, code lost:
    
        if (r11.e(r6, r0) != r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0063, code lost:
    
        if (r11 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0039, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a5, code lost:
    
        r0 = kotlin.Result.Companion;
        r11 = kotlin.Result.m6308constructorimpl(kotlin.e.a(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(int r10, @m80.k j00.c<? super yz.g2> r11) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.monetization.d.b(int, j00.c):java.lang.Object");
    }
}
