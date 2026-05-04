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
@u0({"SMAP\nSendBuddyTravelUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SendBuddyTravelUC.kt\ncom/baicizhan/app/biz/game/uc/ipavatar/SendBuddyTravelUC\n+ 2 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService\n+ 3 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt\n+ 4 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService$thrift$1\n+ 5 Koin.kt\norg/koin/core/Koin\n+ 6 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,21:1\n6#2:22\n64#3,2:23\n66#3:26\n67#3,2:32\n6#4:25\n124#5,4:27\n142#6:31\n*S KotlinDebug\n*F\n+ 1 SendBuddyTravelUC.kt\ncom/baicizhan/app/biz/game/uc/ipavatar/SendBuddyTravelUC\n*L\n14#1:22\n14#1:23,2\n14#1:26\n14#1:32,2\n14#1:25\n14#1:27,4\n14#1:31\n*E\n"})
/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final p f14852a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final q5.a f14853b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final h8.b f14854c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.ipavatar.SendBuddyTravelUC", f = "SendBuddyTravelUC.kt", i = {1}, l = {17, 18}, m = "invoke", n = {HiAnalyticsConstant.Direction.RESPONSE}, s = {"L$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f14855a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f14856b;

        /* renamed from: d, reason: collision with root package name */
        public int f14858d;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f14856b = obj;
            this.f14858d |= Integer.MIN_VALUE;
            return i.this.a(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class b implements x00.l<w7.d<h8.b>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f14859a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f14860b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f14861c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        public static final class a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f14862a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f14863b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f14864c;

            public a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f14862a = eVar;
                this.f14863b = cVar;
                this.f14864c = dVar;
            }

            public final void a(d.a randomRetry) {
                g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f14862a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f14862a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f14863b.b(this.f14864c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public b(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f14859a = dVar;
            this.f14860b = eVar;
            this.f14861c = cVar;
        }

        public final void a(w7.d<h8.b> thriftBuilder) {
            g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new a(this.f14860b, this.f14861c, this.f14859a));
            x00.p<ws.i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f14859a);
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

    public i(@m80.k p thriftService, @m80.k q5.a ipAvatarStateRepo) {
        g0.p(thriftService, "thriftService");
        g0.p(ipAvatarStateRepo, "ipAvatarStateRepo");
        this.f14852a = thriftService;
        this.f14853b = ipAvatarStateRepo;
        l7.e eVar = new l7.e(null, null, 3, null);
        g2 g2Var = g2.f100423a;
        this.f14854c = (h8.b) w7.f.b(new b(o0.d(h8.b.class), eVar, (l7.c) c4.j.f7801a.a().P().h().i(o0.d(l7.c.class), null, null)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
    
        if (r2.e(r9, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        if (r9 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@m80.k j00.c<? super yz.g2> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.baicizhan.app.biz.game.uc.ipavatar.i.a
            if (r0 == 0) goto L13
            r0 = r9
            com.baicizhan.app.biz.game.uc.ipavatar.i$a r0 = (com.baicizhan.app.biz.game.uc.ipavatar.i.a) r0
            int r1 = r0.f14858d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14858d = r1
            goto L18
        L13:
            com.baicizhan.app.biz.game.uc.ipavatar.i$a r0 = new com.baicizhan.app.biz.game.uc.ipavatar.i$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f14856b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f14858d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r0 = r0.f14855a
            h8.d r0 = (h8.d) r0
            kotlin.e.n(r9)
            goto L5d
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L38:
            kotlin.e.n(r9)
            goto L4a
        L3c:
            kotlin.e.n(r9)
            h8.b r9 = r8.f14854c
            r0.f14858d = r4
            java.lang.Object r9 = r9.c(r0)
            if (r9 != r1) goto L4a
            goto L5c
        L4a:
            h8.d r9 = (h8.d) r9
            q5.a r2 = r8.f14853b
            java.lang.Object r4 = l00.k.a(r9)
            r0.f14855a = r4
            r0.f14858d = r3
            java.lang.Object r9 = r2.e(r9, r0)
            if (r9 != r1) goto L5d
        L5c:
            return r1
        L5d:
            z6.b r2 = z6.b.f101032b
            r6 = 4
            r7 = 0
            java.lang.String r3 = "SendBuddyTravelUC"
            java.lang.String r4 = "travel success rsp"
            r5 = 0
            z6.b.j(r2, r3, r4, r5, r6, r7)
            yz.g2 r9 = yz.g2.f100423a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.ipavatar.i.a(j00.c):java.lang.Object");
    }
}
