package b5;

import com.igexin.assist.sdk.AssistPushConsts;
import com.microsoft.thrifty.service.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import l7.i0;
import y7.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r(binds = {d5.f.class})
@kotlin.jvm.internal.u0({"SMAP\nGetUserEntitlementSaleInfoCommand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetUserEntitlementSaleInfoCommand.kt\ncom/baicizhan/app/biz/game/impl/unity/command/GetUserEntitlementSaleInfoCommand\n+ 2 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService\n+ 3 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt\n+ 4 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService$thrift$1\n+ 5 Koin.kt\norg/koin/core/Koin\n+ 6 Scope.kt\norg/koin/core/scope/Scope\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,45:1\n6#2:46\n64#3,2:47\n66#3:50\n67#3,2:56\n6#4:49\n124#5,4:51\n142#6:55\n1#7:58\n1563#8:59\n1634#8,3:60\n*S KotlinDebug\n*F\n+ 1 GetUserEntitlementSaleInfoCommand.kt\ncom/baicizhan/app/biz/game/impl/unity/command/GetUserEntitlementSaleInfoCommand\n*L\n29#1:46\n29#1:47,2\n29#1:50\n29#1:56,2\n29#1:49\n29#1:51,4\n29#1:55\n40#1:59\n40#1:60,3\n*E\n"})
/* loaded from: classes3.dex */
public final class l0 implements d5.f<x0, f2> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final l7.p f5922a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f5923b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final f50.e<x0> f5924c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.unity.command.GetUserEntitlementSaleInfoCommand", f = "GetUserEntitlementSaleInfoCommand.kt", i = {0, 0, 0}, l = {32}, m = "execute-34gZU68", n = {AssistPushConsts.MSG_TYPE_PAYLOAD, "$this$execute_34gZU68_u24lambda_u240", "$i$a$-runCatching-GetUserEntitlementSaleInfoCommand$execute$rsp$1"}, s = {"L$0", "L$1", "I$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f5925a;

        /* renamed from: b, reason: collision with root package name */
        public Object f5926b;

        /* renamed from: c, reason: collision with root package name */
        public int f5927c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f5928d;

        /* renamed from: f, reason: collision with root package name */
        public int f5930f;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f5928d = obj;
            this.f5930f |= Integer.MIN_VALUE;
            return l0.this.a(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class b implements x00.l<w7.d<u8.h>, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f5931a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f5932b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f5933c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @kotlin.jvm.internal.u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        public static final class a implements x00.l<d.a, yz.g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f5934a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f5935b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f5936c;

            public a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f5934a = eVar;
                this.f5935b = cVar;
                this.f5936c = dVar;
            }

            public final void a(d.a randomRetry) {
                kotlin.jvm.internal.g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f5934a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f5934a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f5935b.b(this.f5936c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ yz.g2 invoke(d.a aVar) {
                a(aVar);
                return yz.g2.f100423a;
            }
        }

        public b(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f5931a = dVar;
            this.f5932b = eVar;
            this.f5933c = cVar;
        }

        public final void a(w7.d<u8.h> thriftBuilder) {
            kotlin.jvm.internal.g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new a(this.f5932b, this.f5933c, this.f5931a));
            x00.p<ws.i, a.InterfaceC0480a, ?> pVar = l7.i0.o().get(this.f5931a);
            kotlin.jvm.internal.g0.n(pVar, "null cannot be cast to non-null type kotlin.Function2<com.microsoft.thrifty.protocol.Protocol, com.microsoft.thrifty.service.AsyncClientBase.Listener, T of com.baicizhan.app.biz.thrift.ThriftServiceImplKt.thriftImpl>");
            thriftBuilder.f((x00.p) kotlin.jvm.internal.x0.q(pVar, 2));
            thriftBuilder.g(i0.a.b.f70581a);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ yz.g2 invoke(w7.d<u8.h> dVar) {
            a(dVar);
            return yz.g2.f100423a;
        }
    }

    public l0(@m80.k l7.p thrift) {
        kotlin.jvm.internal.g0.p(thrift, "thrift");
        this.f5922a = thrift;
        this.f5923b = "biz.wordsgame.getentitlementsaleinfo";
    }

    @Override // d5.f
    @m80.l
    public f50.e<x0> b() {
        return this.f5924c;
    }

    @Override // d5.f
    @m80.k
    public String c() {
        return this.f5923b;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:0|1|(2:3|(15:5|6|7|(1:(2:10|11)(2:40|41))(3:42|43|(1:45))|12|13|(3:33|34|35)|15|(1:17)(1:32)|18|(1:20)|21|(3:23|(2:26|24)|27)(1:31)|28|29))|48|6|7|(0)(0)|12|13|(0)|15|(0)(0)|18|(0)|21|(0)(0)|28|29) */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0031, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0063, code lost:
    
        r6 = kotlin.Result.Companion;
        r5 = kotlin.Result.m6308constructorimpl(kotlin.e.a(r5));
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0074 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // d5.f
    @m80.l
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@m80.k b5.x0 r5, @m80.k j00.c<? super b5.f2> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof b5.l0.a
            if (r0 == 0) goto L13
            r0 = r6
            b5.l0$a r0 = (b5.l0.a) r0
            int r1 = r0.f5930f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5930f = r1
            goto L18
        L13:
            b5.l0$a r0 = new b5.l0$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f5928d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f5930f
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r5 = r0.f5926b
            b5.l0 r5 = (b5.l0) r5
            java.lang.Object r5 = r0.f5925a
            b5.x0 r5 = (b5.x0) r5
            kotlin.e.n(r6)     // Catch: java.lang.Throwable -> L31
            goto L5c
        L31:
            r5 = move-exception
            goto L63
        L33:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3b:
            kotlin.e.n(r6)
            kotlin.Result$a r6 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L31
            u8.h r6 = r4.e()     // Catch: java.lang.Throwable -> L31
            java.lang.Object r5 = l00.k.a(r5)     // Catch: java.lang.Throwable -> L31
            r0.f5925a = r5     // Catch: java.lang.Throwable -> L31
            java.lang.Object r5 = l00.k.a(r4)     // Catch: java.lang.Throwable -> L31
            r0.f5926b = r5     // Catch: java.lang.Throwable -> L31
            r5 = 0
            r0.f5927c = r5     // Catch: java.lang.Throwable -> L31
            r0.f5930f = r3     // Catch: java.lang.Throwable -> L31
            java.lang.Object r6 = r6.t7(r5, r0)     // Catch: java.lang.Throwable -> L31
            if (r6 != r1) goto L5c
            return r1
        L5c:
            u8.l r6 = (u8.l) r6     // Catch: java.lang.Throwable -> L31
            java.lang.Object r5 = kotlin.Result.m6308constructorimpl(r6)     // Catch: java.lang.Throwable -> L31
            goto L6d
        L63:
            kotlin.Result$a r6 = kotlin.Result.Companion
            java.lang.Object r5 = kotlin.e.a(r5)
            java.lang.Object r5 = kotlin.Result.m6308constructorimpl(r5)
        L6d:
            java.lang.Throwable r6 = kotlin.Result.m6311exceptionOrNullimpl(r5)
            if (r6 != 0) goto L74
            goto L87
        L74:
            kotlin.Result$a r5 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L7c
            com.baicizhan.app.net.exception.NetworkException r5 = new com.baicizhan.app.net.exception.NetworkException     // Catch: java.lang.Throwable -> L7c
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L7c
            throw r5     // Catch: java.lang.Throwable -> L7c
        L7c:
            r5 = move-exception
            kotlin.Result$a r6 = kotlin.Result.Companion
            java.lang.Object r5 = kotlin.e.a(r5)
            java.lang.Object r5 = kotlin.Result.m6308constructorimpl(r5)
        L87:
            kotlin.e.n(r5)
            u8.l r5 = (u8.l) r5
            u8.f r6 = r5.f91976a
            r0 = 0
            if (r6 == 0) goto L96
            m3.h0 r6 = e5.a.o(r6)
            goto L97
        L96:
            r6 = r0
        L97:
            u8.c r1 = r5.f91977b
            if (r1 == 0) goto L9f
            m3.p r0 = e5.a.l(r1)
        L9f:
            java.util.List<u8.f> r5 = r5.f91982g
            if (r5 == 0) goto Lc8
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = a00.i0.d0(r5, r2)
            r1.<init>(r2)
            java.util.Iterator r5 = r5.iterator()
        Lb4:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto Lcc
            java.lang.Object r2 = r5.next()
            u8.f r2 = (u8.f) r2
            m3.h0 r2 = e5.a.o(r2)
            r1.add(r2)
            goto Lb4
        Lc8:
            java.util.List r1 = a00.h0.J()
        Lcc:
            m3.y1 r5 = new m3.y1
            r5.<init>(r6, r0, r1)
            m3.y1 r5 = b5.f2.b(r5)
            b5.f2 r5 = b5.f2.a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.l0.a(b5.x0, j00.c):java.lang.Object");
    }

    public final u8.h e() {
        return (u8.h) w7.f.b(new b(kotlin.jvm.internal.o0.d(u8.h.class), new l7.e(null, null, 3, null), (l7.c) c4.j.f7801a.a().P().h().i(kotlin.jvm.internal.o0.d(l7.c.class), null, null)));
    }
}
