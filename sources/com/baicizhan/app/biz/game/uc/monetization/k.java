package com.baicizhan.app.biz.game.uc.monetization;

import com.microsoft.thrifty.service.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.x0;
import l7.i0;
import l7.p;
import oa0.r;
import r6.u;
import y7.d;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r
@u0({"SMAP\nGetRechargeInfoUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetRechargeInfoUC.kt\ncom/baicizhan/app/biz/game/uc/monetization/GetRechargeInfoUC\n+ 2 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService\n+ 3 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt\n+ 4 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService$thrift$1\n+ 5 Koin.kt\norg/koin/core/Koin\n+ 6 Scope.kt\norg/koin/core/scope/Scope\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,41:1\n6#2:42\n64#3,2:43\n66#3:46\n67#3,2:52\n6#4:45\n124#5,4:47\n142#6:51\n1#7:54\n*S KotlinDebug\n*F\n+ 1 GetRechargeInfoUC.kt\ncom/baicizhan/app/biz/game/uc/monetization/GetRechargeInfoUC\n*L\n22#1:42\n22#1:43,2\n22#1:46\n22#1:52,2\n22#1:45\n22#1:47,4\n22#1:51\n*E\n"})
/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final n5.c f14960a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final u f14961b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final c6.b f14962c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final p f14963d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.monetization.GetRechargeInfoUC", f = "GetRechargeInfoUC.kt", i = {0, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3}, l = {26, 27, 28, 35}, m = "invoke", n = {"today", "$this$invoke_u24lambda_u240", "today", "hasFree", "$i$a$-runCatching-GetRechargeInfoUC$invoke$userEntitlementSaleInfo$1", "userEntitlementSaleInfo", "$this$invoke_u24lambda_u241", "today", "hasFree", "$i$a$-runCatching-GetRechargeInfoUC$invoke$2", "userEntitlementSaleInfo", "today", "hasFree"}, s = {"J$0", "L$0", "J$0", "I$0", "I$1", "L$0", "L$1", "J$0", "I$0", "I$1", "L$0", "J$0", "I$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f14964a;

        /* renamed from: b, reason: collision with root package name */
        public int f14965b;

        /* renamed from: c, reason: collision with root package name */
        public int f14966c;

        /* renamed from: d, reason: collision with root package name */
        public Object f14967d;

        /* renamed from: e, reason: collision with root package name */
        public Object f14968e;

        /* renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f14969f;

        /* renamed from: h, reason: collision with root package name */
        public int f14971h;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f14969f = obj;
            this.f14971h |= Integer.MIN_VALUE;
            return k.this.b(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class b implements x00.l<w7.d<u8.h>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f14972a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f14973b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f14974c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        public static final class a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f14975a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f14976b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f14977c;

            public a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f14975a = eVar;
                this.f14976b = cVar;
                this.f14977c = dVar;
            }

            public final void a(d.a randomRetry) {
                g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f14975a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f14975a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f14976b.b(this.f14977c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public b(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f14972a = dVar;
            this.f14973b = eVar;
            this.f14974c = cVar;
        }

        public final void a(w7.d<u8.h> thriftBuilder) {
            g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new a(this.f14973b, this.f14974c, this.f14972a));
            x00.p<ws.i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f14972a);
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

    public k(@m80.k n5.c freeRechargeRepo, @m80.k u fetchVersionInfoUC, @m80.k c6.b userRepo, @m80.k p thrift) {
        g0.p(freeRechargeRepo, "freeRechargeRepo");
        g0.p(fetchVersionInfoUC, "fetchVersionInfoUC");
        g0.p(userRepo, "userRepo");
        g0.p(thrift, "thrift");
        this.f14960a = freeRechargeRepo;
        this.f14961b = fetchVersionInfoUC;
        this.f14962c = userRepo;
        this.f14963d = thrift;
    }

    public final u8.h a() {
        return (u8.h) w7.f.b(new b(o0.d(u8.h.class), new l7.e(null, null, 3, null), (l7.c) c4.j.f7801a.a().P().h().i(o0.d(l7.c.class), null, null)));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:0|1|(2:3|(16:5|6|7|(1:(1:(1:(1:(3:13|14|15)(2:17|18))(11:19|20|21|22|23|(1:25)|26|(1:28)|29|(3:32|14|15)|31))(10:36|37|38|39|(1:41)|42|43|44|(8:46|22|23|(0)|26|(0)|29|(0))|31))(1:51))(1:59)|52|(1:54)(1:58)|55|(2:57|31)|38|39|(0)|42|43|44|(0)|31))|63|6|7|(0)(0)|52|(0)(0)|55|(0)|38|39|(0)|42|43|44|(0)|31|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f0, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f1, code lost:
    
        r15 = r10;
        r10 = r7;
        r6 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0081, code lost:
    
        if (r0 == r3) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0068, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00b5, code lost:
    
        r7 = kotlin.Result.Companion;
        r0 = kotlin.Result.m6308constructorimpl(kotlin.e.a(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@m80.k j00.c<? super kotlin.Triple<java.lang.Integer, java.lang.Long, u8.l>> r18) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.monetization.k.b(j00.c):java.lang.Object");
    }
}
