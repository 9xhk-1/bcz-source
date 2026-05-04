package com.baicizhan.app.biz.game.uc.monetization;

import com.microsoft.thrifty.service.a;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.x0;
import l7.i0;
import l7.p;
import oa0.r;
import p8.s;
import p8.z;
import y7.d;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r
@u0({"SMAP\nRechargeLifeUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RechargeLifeUC.kt\ncom/baicizhan/app/biz/game/uc/monetization/RechargeLifeUC\n+ 2 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService\n+ 3 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt\n+ 4 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService$thrift$1\n+ 5 Koin.kt\norg/koin/core/Koin\n+ 6 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,29:1\n6#2:30\n64#3,2:31\n66#3:34\n67#3,2:40\n6#4:33\n124#5,4:35\n142#6:39\n*S KotlinDebug\n*F\n+ 1 RechargeLifeUC.kt\ncom/baicizhan/app/biz/game/uc/monetization/RechargeLifeUC\n*L\n15#1:30\n15#1:31,2\n15#1:34\n15#1:40,2\n15#1:33\n15#1:35,4\n15#1:39\n*E\n"})
/* loaded from: classes3.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final p f14980a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final n5.c f14981b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class a implements x00.l<w7.d<s>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f14982a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f14983b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f14984c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        /* renamed from: com.baicizhan.app.biz.game.uc.monetization.n$a$a, reason: collision with other inner class name */
        public static final class C0218a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f14985a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f14986b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f14987c;

            public C0218a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f14985a = eVar;
                this.f14986b = cVar;
                this.f14987c = dVar;
            }

            public final void a(d.a randomRetry) {
                g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f14985a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f14985a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f14986b.b(this.f14987c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public a(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f14982a = dVar;
            this.f14983b = eVar;
            this.f14984c = cVar;
        }

        public final void a(w7.d<s> thriftBuilder) {
            g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new C0218a(this.f14983b, this.f14984c, this.f14982a));
            x00.p<ws.i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f14982a);
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

    public n(@m80.k p thrift, @m80.k n5.c freeRecharge) {
        g0.p(thrift, "thrift");
        g0.p(freeRecharge, "freeRecharge");
        this.f14980a = thrift;
        this.f14981b = freeRecharge;
    }

    @m80.k
    public final s a() {
        return (s) w7.f.b(new a(o0.d(s.class), new l7.e(null, null, 3, null), (l7.c) c4.j.f7801a.a().P().h().i(o0.d(l7.c.class), null, null)));
    }

    @m80.l
    public final Object b(@m80.k String str, int i11, @m80.k j00.c<? super g2> cVar) {
        if (i11 == 0) {
            Object b11 = this.f14981b.b(w3.g.l(), cVar);
            return b11 == kotlin.coroutines.intrinsics.b.l() ? b11 : g2.f100423a;
        }
        Object w11 = a().w(new z.a().b(str).build(), cVar);
        return w11 == kotlin.coroutines.intrinsics.b.l() ? w11 : g2.f100423a;
    }
}
