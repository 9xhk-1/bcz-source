package com.baicizhan.app.biz.auth;

import androidx.autofill.HintConstants;
import c40.s0;
import com.baicizhan.main.auth.AccountVerificationActivity;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.jiongji.andriod.card.R;
import com.microsoft.thrifty.service.a;
import com.tencent.open.SocialConstants;
import k3.m1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.x0;
import kotlinx.coroutines.flow.h0;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.y;
import l7.i0;
import y7.d;
import yz.c0;
import yz.e0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r(binds = {k3.j.class})
@u0({"SMAP\nAuthServiceImp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuthServiceImp.kt\ncom/baicizhan/app/biz/auth/AuthServiceImpl\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 6 TimeMeasurer.kt\ncom/baicizhan/app/biz/base/TimeMeasurerKt\n+ 7 BizCatch.kt\ncom/baicizhan/app/biz/base/BizCatchKt\n+ 8 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService\n+ 9 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt\n+ 10 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService$thrift$1\n+ 11 Koin.kt\norg/koin/core/Koin\n+ 12 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,255:1\n49#2:256\n51#2:260\n46#3:257\n51#3:259\n105#4:258\n58#5,6:261\n41#5,6:388\n48#5:395\n41#5,6:397\n48#5:404\n12#6,3:267\n15#6,10:294\n12#7,2:270\n14#7,10:284\n6#8:272\n6#8:304\n6#8:316\n6#8:328\n6#8:340\n6#8:352\n6#8:364\n6#8:376\n64#9,2:273\n66#9:276\n67#9,2:282\n64#9,2:305\n66#9:308\n67#9,2:314\n64#9,2:317\n66#9:320\n67#9,2:326\n64#9,2:329\n66#9:332\n67#9,2:338\n64#9,2:341\n66#9:344\n67#9,2:350\n64#9,2:353\n66#9:356\n67#9,2:362\n64#9,2:365\n66#9:368\n67#9,2:374\n64#9,2:377\n66#9:380\n67#9,2:386\n6#10:275\n6#10:307\n6#10:319\n6#10:331\n6#10:343\n6#10:355\n6#10:367\n6#10:379\n124#11,4:277\n124#11,4:309\n124#11,4:321\n124#11,4:333\n124#11,4:345\n124#11,4:357\n124#11,4:369\n124#11,4:381\n127#11:396\n127#11:405\n142#12:281\n142#12:313\n142#12:325\n142#12:337\n142#12:349\n142#12:361\n142#12:373\n142#12:385\n142#12:394\n142#12:403\n*S KotlinDebug\n*F\n+ 1 AuthServiceImp.kt\ncom/baicizhan/app/biz/auth/AuthServiceImpl\n*L\n75#1:256\n75#1:260\n75#1:257\n75#1:259\n75#1:258\n81#1:261,6\n79#1:388,6\n79#1:395\n83#1:397,6\n83#1:404\n-1#1:267,3\n-1#1:294,10\n-1#1:270,2\n-1#1:284,10\n88#1:272\n96#1:304\n102#1:316\n114#1:328\n129#1:340\n146#1:352\n209#1:364\n217#1:376\n88#1:273,2\n88#1:276\n88#1:282,2\n96#1:305,2\n96#1:308\n96#1:314,2\n102#1:317,2\n102#1:320\n102#1:326,2\n114#1:329,2\n114#1:332\n114#1:338,2\n129#1:341,2\n129#1:344\n129#1:350,2\n146#1:353,2\n146#1:356\n146#1:362,2\n209#1:365,2\n209#1:368\n209#1:374,2\n217#1:377,2\n217#1:380\n217#1:386,2\n88#1:275\n96#1:307\n102#1:319\n114#1:331\n129#1:343\n146#1:355\n209#1:367\n217#1:379\n88#1:277,4\n96#1:309,4\n102#1:321,4\n114#1:333,4\n129#1:345,4\n146#1:357,4\n209#1:369,4\n217#1:381,4\n79#1:396\n83#1:405\n88#1:281\n96#1:313\n102#1:325\n114#1:337\n129#1:349\n146#1:361\n209#1:373\n217#1:385\n79#1:394\n83#1:403\n*E\n"})
/* loaded from: classes3.dex */
public final class AuthServiceImpl implements k3.j, c4.j {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.auth.s f13477b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final r3.d f13478c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final IAuthRepo f13479d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final b6.a f13480e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final y5.a f13481f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final w3.a f13482g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final y<Boolean> f13483h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public final m0<m1> f13484i;

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public final c0 f13485j;

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public final c0 f13486k;

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public final c0 f13487l;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class a implements x00.l<w7.d<v8.t>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f13490a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f13491b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f13492c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        /* renamed from: com.baicizhan.app.biz.auth.AuthServiceImpl$a$a, reason: collision with other inner class name */
        public static final class C0199a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f13493a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f13494b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f13495c;

            public C0199a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f13493a = eVar;
                this.f13494b = cVar;
                this.f13495c = dVar;
            }

            public final void a(d.a randomRetry) {
                g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f13493a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f13493a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f13494b.b(this.f13495c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public a(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f13490a = dVar;
            this.f13491b = eVar;
            this.f13492c = cVar;
        }

        public final void a(w7.d<v8.t> thriftBuilder) {
            g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new C0199a(this.f13491b, this.f13492c, this.f13490a));
            x00.p<ws.i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f13490a);
            g0.n(pVar, "null cannot be cast to non-null type kotlin.Function2<com.microsoft.thrifty.protocol.Protocol, com.microsoft.thrifty.service.AsyncClientBase.Listener, T of com.baicizhan.app.biz.thrift.ThriftServiceImplKt.thriftImpl>");
            thriftBuilder.f((x00.p) x0.q(pVar, 2));
            thriftBuilder.g(i0.a.b.f70581a);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(w7.d<v8.t> dVar) {
            a(dVar);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class b implements x00.l<w7.d<v8.t>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f13496a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f13497b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f13498c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        public static final class a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f13499a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f13500b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f13501c;

            public a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f13499a = eVar;
                this.f13500b = cVar;
                this.f13501c = dVar;
            }

            public final void a(d.a randomRetry) {
                g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f13499a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f13499a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f13500b.b(this.f13501c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public b(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f13496a = dVar;
            this.f13497b = eVar;
            this.f13498c = cVar;
        }

        public final void a(w7.d<v8.t> thriftBuilder) {
            g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new a(this.f13497b, this.f13498c, this.f13496a));
            x00.p<ws.i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f13496a);
            g0.n(pVar, "null cannot be cast to non-null type kotlin.Function2<com.microsoft.thrifty.protocol.Protocol, com.microsoft.thrifty.service.AsyncClientBase.Listener, T of com.baicizhan.app.biz.thrift.ThriftServiceImplKt.thriftImpl>");
            thriftBuilder.f((x00.p) x0.q(pVar, 2));
            thriftBuilder.g(i0.a.b.f70581a);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(w7.d<v8.t> dVar) {
            a(dVar);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class c implements x00.l<w7.d<v8.t>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f13502a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f13503b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f13504c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        public static final class a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f13505a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f13506b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f13507c;

            public a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f13505a = eVar;
                this.f13506b = cVar;
                this.f13507c = dVar;
            }

            public final void a(d.a randomRetry) {
                g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f13505a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f13505a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f13506b.b(this.f13507c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public c(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f13502a = dVar;
            this.f13503b = eVar;
            this.f13504c = cVar;
        }

        public final void a(w7.d<v8.t> thriftBuilder) {
            g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new a(this.f13503b, this.f13504c, this.f13502a));
            x00.p<ws.i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f13502a);
            g0.n(pVar, "null cannot be cast to non-null type kotlin.Function2<com.microsoft.thrifty.protocol.Protocol, com.microsoft.thrifty.service.AsyncClientBase.Listener, T of com.baicizhan.app.biz.thrift.ThriftServiceImplKt.thriftImpl>");
            thriftBuilder.f((x00.p) x0.q(pVar, 2));
            thriftBuilder.g(i0.a.b.f70581a);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(w7.d<v8.t> dVar) {
            a(dVar);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.auth.AuthServiceImpl", f = "AuthServiceImp.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {88, 89}, m = "haveATryLogin", n = {"tag$iv", "$this$haveATryLogin_u240", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-AuthServiceImpl$haveATryLogin$2", "$i$f$bizCatch", "$i$a$-bizCatch-AuthServiceImpl$haveATryLogin$2$1", "$i$a$-run-AuthServiceImpl$haveATryLogin$2$1$1", "tag$iv", "$this$haveATryLogin_u240", "user", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-AuthServiceImpl$haveATryLogin$2", "$i$f$bizCatch", "$i$a$-bizCatch-AuthServiceImpl$haveATryLogin$2$1", "$i$a$-run-AuthServiceImpl$haveATryLogin$2$1$1"}, s = {"L$0", "L$1", "I$0", "J$0", "I$1", "I$2", "I$3", "I$4", "L$0", "L$1", "L$2", "I$0", "J$0", "I$1", "I$2", "I$3", "I$4"}, v = 1)
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f13508a;

        /* renamed from: b, reason: collision with root package name */
        public Object f13509b;

        /* renamed from: c, reason: collision with root package name */
        public Object f13510c;

        /* renamed from: d, reason: collision with root package name */
        public int f13511d;

        /* renamed from: e, reason: collision with root package name */
        public int f13512e;

        /* renamed from: f, reason: collision with root package name */
        public int f13513f;

        /* renamed from: g, reason: collision with root package name */
        public int f13514g;

        /* renamed from: h, reason: collision with root package name */
        public int f13515h;

        /* renamed from: i, reason: collision with root package name */
        public long f13516i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f13517j;

        /* renamed from: l, reason: collision with root package name */
        public int f13519l;

        public d(j00.c<? super d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f13517j = obj;
            this.f13519l |= Integer.MIN_VALUE;
            return AuthServiceImpl.this.S0(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class e implements x00.l<w7.d<v8.t>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f13520a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f13521b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f13522c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        public static final class a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f13523a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f13524b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f13525c;

            public a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f13523a = eVar;
                this.f13524b = cVar;
                this.f13525c = dVar;
            }

            public final void a(d.a randomRetry) {
                g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f13523a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f13523a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f13524b.b(this.f13525c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public e(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f13520a = dVar;
            this.f13521b = eVar;
            this.f13522c = cVar;
        }

        public final void a(w7.d<v8.t> thriftBuilder) {
            g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new a(this.f13521b, this.f13522c, this.f13520a));
            x00.p<ws.i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f13520a);
            g0.n(pVar, "null cannot be cast to non-null type kotlin.Function2<com.microsoft.thrifty.protocol.Protocol, com.microsoft.thrifty.service.AsyncClientBase.Listener, T of com.baicizhan.app.biz.thrift.ThriftServiceImplKt.thriftImpl>");
            thriftBuilder.f((x00.p) x0.q(pVar, 2));
            thriftBuilder.g(i0.a.b.f70581a);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(w7.d<v8.t> dVar) {
            a(dVar);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.auth.AuthServiceImpl", f = "AuthServiceImp.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {114, 124}, m = "hwLogin", n = {"authorizationCode", "tag$iv", "$this$hwLogin_u240", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-AuthServiceImpl$hwLogin$2", "$i$f$bizCatch", "$i$a$-bizCatch-AuthServiceImpl$hwLogin$2$1", "$i$a$-run-AuthServiceImpl$hwLogin$2$1$1", "authorizationCode", "tag$iv", "$this$hwLogin_u240", "user", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-AuthServiceImpl$hwLogin$2", "$i$f$bizCatch", "$i$a$-bizCatch-AuthServiceImpl$hwLogin$2$1", "$i$a$-run-AuthServiceImpl$hwLogin$2$1$1"}, s = {"L$0", "L$1", "L$2", "I$0", "J$0", "I$1", "I$2", "I$3", "I$4", "L$0", "L$1", "L$2", "L$3", "I$0", "J$0", "I$1", "I$2", "I$3", "I$4"}, v = 1)
    public static final class f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f13526a;

        /* renamed from: b, reason: collision with root package name */
        public Object f13527b;

        /* renamed from: c, reason: collision with root package name */
        public Object f13528c;

        /* renamed from: d, reason: collision with root package name */
        public Object f13529d;

        /* renamed from: e, reason: collision with root package name */
        public int f13530e;

        /* renamed from: f, reason: collision with root package name */
        public int f13531f;

        /* renamed from: g, reason: collision with root package name */
        public int f13532g;

        /* renamed from: h, reason: collision with root package name */
        public int f13533h;

        /* renamed from: i, reason: collision with root package name */
        public int f13534i;

        /* renamed from: j, reason: collision with root package name */
        public long f13535j;

        /* renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f13536k;

        /* renamed from: m, reason: collision with root package name */
        public int f13538m;

        public f(j00.c<? super f> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f13536k = obj;
            this.f13538m |= Integer.MIN_VALUE;
            return AuthServiceImpl.this.l0(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.auth.AuthServiceImpl", f = "AuthServiceImp.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6}, l = {164, 168, 170, 174, 177, 178, 179}, m = "localLogin", n = {"tag$iv", "$this$localLogin_u240", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-AuthServiceImpl$localLogin$2", "$i$f$bizCatch", "$i$a$-bizCatch-AuthServiceImpl$localLogin$2$1", "$i$a$-run-AuthServiceImpl$localLogin$2$1$1", "tag$iv", "$this$localLogin_u240", "token", "user", "bczId", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-AuthServiceImpl$localLogin$2", "$i$f$bizCatch", "$i$a$-bizCatch-AuthServiceImpl$localLogin$2$1", "$i$a$-run-AuthServiceImpl$localLogin$2$1$1", "tag$iv", "$this$localLogin_u240", "token", "user", "bczId", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-AuthServiceImpl$localLogin$2", "$i$f$bizCatch", "$i$a$-bizCatch-AuthServiceImpl$localLogin$2$1", "$i$a$-run-AuthServiceImpl$localLogin$2$1$1", "tag$iv", "$this$localLogin_u240", "token", "user", "bczId", "e", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-AuthServiceImpl$localLogin$2", "$i$f$bizCatch", "$i$a$-bizCatch-AuthServiceImpl$localLogin$2$1", "$i$a$-run-AuthServiceImpl$localLogin$2$1$1", "tag$iv", "$this$localLogin_u240", "token", "user", "bczId", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-AuthServiceImpl$localLogin$2", "$i$f$bizCatch", "$i$a$-bizCatch-AuthServiceImpl$localLogin$2$1", "$i$a$-run-AuthServiceImpl$localLogin$2$1$1", "tag$iv", "$this$localLogin_u240", "token", "user", "bczId", "it", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-AuthServiceImpl$localLogin$2", "$i$f$bizCatch", "$i$a$-bizCatch-AuthServiceImpl$localLogin$2$1", "$i$a$-run-AuthServiceImpl$localLogin$2$1$1", "$i$a$-let-AuthServiceImpl$localLogin$2$1$1$1", "tag$iv", "$this$localLogin_u240", "token", "user", "bczId", "it", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-AuthServiceImpl$localLogin$2", "$i$f$bizCatch", "$i$a$-bizCatch-AuthServiceImpl$localLogin$2$1", "$i$a$-run-AuthServiceImpl$localLogin$2$1$1", "$i$a$-let-AuthServiceImpl$localLogin$2$1$1$1"}, s = {"L$0", "L$1", "I$0", "J$0", "I$1", "I$2", "I$3", "I$4", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "J$0", "I$1", "I$2", "I$3", "I$4", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "J$0", "I$1", "I$2", "I$3", "I$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "J$0", "I$1", "I$2", "I$3", "I$4", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "J$0", "I$1", "I$2", "I$3", "I$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "J$0", "I$1", "I$2", "I$3", "I$4", "I$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "J$0", "I$1", "I$2", "I$3", "I$4", "I$5"}, v = 1)
    public static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f13539a;

        /* renamed from: b, reason: collision with root package name */
        public Object f13540b;

        /* renamed from: c, reason: collision with root package name */
        public Object f13541c;

        /* renamed from: d, reason: collision with root package name */
        public Object f13542d;

        /* renamed from: e, reason: collision with root package name */
        public Object f13543e;

        /* renamed from: f, reason: collision with root package name */
        public Object f13544f;

        /* renamed from: g, reason: collision with root package name */
        public int f13545g;

        /* renamed from: h, reason: collision with root package name */
        public int f13546h;

        /* renamed from: i, reason: collision with root package name */
        public int f13547i;

        /* renamed from: j, reason: collision with root package name */
        public int f13548j;

        /* renamed from: k, reason: collision with root package name */
        public int f13549k;

        /* renamed from: l, reason: collision with root package name */
        public int f13550l;

        /* renamed from: m, reason: collision with root package name */
        public long f13551m;

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f13552n;

        /* renamed from: p, reason: collision with root package name */
        public int f13554p;

        public g(j00.c<? super g> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f13552n = obj;
            this.f13554p |= Integer.MIN_VALUE;
            return AuthServiceImpl.this.v1(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class h implements x00.l<w7.d<v8.t>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f13555a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f13556b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f13557c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        public static final class a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f13558a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f13559b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f13560c;

            public a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f13558a = eVar;
                this.f13559b = cVar;
                this.f13560c = dVar;
            }

            public final void a(d.a randomRetry) {
                g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f13558a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f13558a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f13559b.b(this.f13560c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public h(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f13555a = dVar;
            this.f13556b = eVar;
            this.f13557c = cVar;
        }

        public final void a(w7.d<v8.t> thriftBuilder) {
            g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new a(this.f13556b, this.f13557c, this.f13555a));
            x00.p<ws.i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f13555a);
            g0.n(pVar, "null cannot be cast to non-null type kotlin.Function2<com.microsoft.thrifty.protocol.Protocol, com.microsoft.thrifty.service.AsyncClientBase.Listener, T of com.baicizhan.app.biz.thrift.ThriftServiceImplKt.thriftImpl>");
            thriftBuilder.f((x00.p) x0.q(pVar, 2));
            thriftBuilder.g(i0.a.b.f70581a);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(w7.d<v8.t> dVar) {
            a(dVar);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.auth.AuthServiceImpl", f = "AuthServiceImp.kt", i = {0, 0, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4}, l = {R.styleable.Theme_drawable_right_arrow, 217, R.styleable.Theme_drawable_tab_friends_new, R.styleable.Theme_drawable_tab_home, R.styleable.Theme_drawable_tab_mall_1111}, m = "loginImpl", n = {"user", "loginType", "user", "loginType", "user", "loginType", CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE, "userRecord", "user", "loginType", CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE, "userRecord", "user", "loginType", "e"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2"}, v = 1)
    public static final class i extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f13561a;

        /* renamed from: b, reason: collision with root package name */
        public Object f13562b;

        /* renamed from: c, reason: collision with root package name */
        public Object f13563c;

        /* renamed from: d, reason: collision with root package name */
        public Object f13564d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f13565e;

        /* renamed from: g, reason: collision with root package name */
        public int f13567g;

        public i(j00.c<? super i> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f13565e = obj;
            this.f13567g |= Integer.MIN_VALUE;
            return AuthServiceImpl.this.S2(null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.auth.AuthServiceImpl$loginUser$1", f = "AuthServiceImp.kt", i = {0, 0, 0, 1, 1}, l = {66, 71}, m = "invokeSuspend", n = {"user", "bczId", "login", "user", "login"}, s = {"L$0", "L$1", "Z$0", "L$0", "Z$0"}, v = 1)
    public static final class j extends SuspendLambda implements x00.q<Boolean, r3.a, j00.c<? super m1.a>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f13568a;

        /* renamed from: b, reason: collision with root package name */
        public int f13569b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ boolean f13570c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f13571d;

        public j(j00.c<? super j> cVar) {
            super(3, cVar);
        }

        public final Object i(boolean z11, r3.a aVar, j00.c<? super m1.a> cVar) {
            j jVar = AuthServiceImpl.this.new j(cVar);
            jVar.f13570c = z11;
            jVar.f13571d = aVar;
            return jVar.invokeSuspend(g2.f100423a);
        }

        @Override // x00.q
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, r3.a aVar, j00.c<? super m1.a> cVar) {
            return i(bool.booleanValue(), aVar, cVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0076, code lost:
        
            if (r3.d(r4, r13, r12) == r2) goto L20;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                boolean r0 = r12.f13570c
                java.lang.Object r1 = r12.f13571d
                r3.a r1 = (r3.a) r1
                java.lang.Object r2 = kotlin.coroutines.intrinsics.b.l()
                int r3 = r12.f13569b
                r4 = 2
                r5 = 1
                if (r3 == 0) goto L29
                if (r3 == r5) goto L21
                if (r3 != r4) goto L19
                kotlin.e.n(r13)
                goto La6
            L19:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L21:
                java.lang.Object r0 = r12.f13568a
                java.lang.Long r0 = (java.lang.Long) r0
                kotlin.e.n(r13)
                goto L79
            L29:
                kotlin.e.n(r13)
                if (r0 == 0) goto L83
                if (r1 == 0) goto L83
                z6.b r6 = z6.b.f101032b
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r3 = "loginUser: login success, "
                r13.append(r3)
                java.lang.String r3 = r1.v()
                r4 = 5
                java.lang.String r3 = u30.r0.A9(r3, r4)
                r13.append(r3)
                java.lang.String r8 = r13.toString()
                r10 = 4
                r11 = 0
                java.lang.String r7 = "AuthService"
                r9 = 0
                z6.b.j(r6, r7, r8, r9, r10, r11)
                java.lang.String r13 = r1.w()
                java.lang.Long r13 = u30.e0.r1(r13)
                com.baicizhan.app.biz.auth.AuthServiceImpl r3 = com.baicizhan.app.biz.auth.AuthServiceImpl.this
                com.baicizhan.app.biz.auth.s r3 = com.baicizhan.app.biz.auth.AuthServiceImpl.L2(r3)
                java.lang.String r4 = r1.v()
                r12.f13571d = r1
                java.lang.Object r6 = l00.k.a(r13)
                r12.f13568a = r6
                r12.f13570c = r0
                r12.f13569b = r5
                java.lang.Object r13 = r3.d(r4, r13, r12)
                if (r13 != r2) goto L79
                goto La5
            L79:
                k3.m1$a r13 = new k3.m1$a
                k3.w3 r0 = r3.b.c(r1)
                r13.<init>(r0)
                return r13
            L83:
                z6.b r5 = z6.b.f101032b
                r9 = 4
                r10 = 0
                java.lang.String r6 = "AuthService"
                java.lang.String r7 = "loginUser: not login, CLEAN TOKEN"
                r8 = 0
                z6.b.j(r5, r6, r7, r8, r9, r10)
                com.baicizhan.app.biz.auth.AuthServiceImpl r13 = com.baicizhan.app.biz.auth.AuthServiceImpl.this
                com.baicizhan.app.biz.auth.s r13 = com.baicizhan.app.biz.auth.AuthServiceImpl.L2(r13)
                java.lang.Object r1 = l00.k.a(r1)
                r12.f13571d = r1
                r12.f13570c = r0
                r12.f13569b = r4
                java.lang.Object r13 = r13.c(r12)
                if (r13 != r2) goto La6
            La5:
                return r2
            La6:
                r13 = 0
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.auth.AuthServiceImpl.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.auth.AuthServiceImpl", f = "AuthServiceImp.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2}, l = {201, 202, 203}, m = "logout", n = {"tag$iv", "$this$logout_u240", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-AuthServiceImpl$logout$2", "$i$f$bizCatch", "$i$a$-bizCatch-AuthServiceImpl$logout$2$1", "$i$a$-run-AuthServiceImpl$logout$2$1$1", "tag$iv", "$this$logout_u240", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-AuthServiceImpl$logout$2", "$i$f$bizCatch", "$i$a$-bizCatch-AuthServiceImpl$logout$2$1", "$i$a$-run-AuthServiceImpl$logout$2$1$1", "tag$iv", "$this$logout_u240", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-AuthServiceImpl$logout$2", "$i$f$bizCatch", "$i$a$-bizCatch-AuthServiceImpl$logout$2$1", "$i$a$-run-AuthServiceImpl$logout$2$1$1"}, s = {"L$0", "L$1", "I$0", "J$0", "I$1", "I$2", "I$3", "I$4", "L$0", "L$1", "I$0", "J$0", "I$1", "I$2", "I$3", "I$4", "L$0", "L$1", "I$0", "J$0", "I$1", "I$2", "I$3", "I$4"}, v = 1)
    public static final class k extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f13573a;

        /* renamed from: b, reason: collision with root package name */
        public Object f13574b;

        /* renamed from: c, reason: collision with root package name */
        public int f13575c;

        /* renamed from: d, reason: collision with root package name */
        public int f13576d;

        /* renamed from: e, reason: collision with root package name */
        public int f13577e;

        /* renamed from: f, reason: collision with root package name */
        public int f13578f;

        /* renamed from: g, reason: collision with root package name */
        public int f13579g;

        /* renamed from: h, reason: collision with root package name */
        public long f13580h;

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f13581i;

        /* renamed from: k, reason: collision with root package name */
        public int f13583k;

        public k(j00.c<? super k> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f13581i = obj;
            this.f13583k |= Integer.MIN_VALUE;
            return AuthServiceImpl.this.s1(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class l implements x00.l<w7.d<v8.t>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f13584a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f13585b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f13586c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        public static final class a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f13587a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f13588b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f13589c;

            public a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f13587a = eVar;
                this.f13588b = cVar;
                this.f13589c = dVar;
            }

            public final void a(d.a randomRetry) {
                g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f13587a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f13587a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f13588b.b(this.f13589c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public l(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f13584a = dVar;
            this.f13585b = eVar;
            this.f13586c = cVar;
        }

        public final void a(w7.d<v8.t> thriftBuilder) {
            g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new a(this.f13585b, this.f13586c, this.f13584a));
            x00.p<ws.i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f13584a);
            g0.n(pVar, "null cannot be cast to non-null type kotlin.Function2<com.microsoft.thrifty.protocol.Protocol, com.microsoft.thrifty.service.AsyncClientBase.Listener, T of com.baicizhan.app.biz.thrift.ThriftServiceImplKt.thriftImpl>");
            thriftBuilder.f((x00.p) x0.q(pVar, 2));
            thriftBuilder.g(i0.a.b.f70581a);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(w7.d<v8.t> dVar) {
            a(dVar);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.auth.AuthServiceImpl", f = "AuthServiceImp.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {209, 210}, m = "passwordLogin", n = {AccountVerificationActivity.f19910x, HintConstants.AUTOFILL_HINT_PASSWORD, "loginType", "digest", SocialConstants.TYPE_REQUEST, AccountVerificationActivity.f19910x, HintConstants.AUTOFILL_HINT_PASSWORD, "loginType", "digest", SocialConstants.TYPE_REQUEST, "user"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"}, v = 1)
    public static final class m extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f13590a;

        /* renamed from: b, reason: collision with root package name */
        public Object f13591b;

        /* renamed from: c, reason: collision with root package name */
        public Object f13592c;

        /* renamed from: d, reason: collision with root package name */
        public Object f13593d;

        /* renamed from: e, reason: collision with root package name */
        public Object f13594e;

        /* renamed from: f, reason: collision with root package name */
        public Object f13595f;

        /* renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f13596g;

        /* renamed from: i, reason: collision with root package name */
        public int f13598i;

        public m(j00.c<? super m> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f13596g = obj;
            this.f13598i |= Integer.MIN_VALUE;
            return AuthServiceImpl.this.T2(null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.auth.AuthServiceImpl", f = "AuthServiceImp.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1}, l = {129, 141}, m = "qqLogin", n = {HiAnalyticsConstant.Direction.REQUEST, "tag$iv", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-AuthServiceImpl$qqLogin$2", "$i$f$bizCatch", "$i$a$-bizCatch-AuthServiceImpl$qqLogin$2$1", HiAnalyticsConstant.Direction.REQUEST, "tag$iv", "user", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-AuthServiceImpl$qqLogin$2", "$i$f$bizCatch", "$i$a$-bizCatch-AuthServiceImpl$qqLogin$2$1"}, s = {"L$0", "L$1", "I$0", "J$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$2", "I$0", "J$0", "I$1", "I$2", "I$3"}, v = 1)
    public static final class n extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f13599a;

        /* renamed from: b, reason: collision with root package name */
        public Object f13600b;

        /* renamed from: c, reason: collision with root package name */
        public Object f13601c;

        /* renamed from: d, reason: collision with root package name */
        public int f13602d;

        /* renamed from: e, reason: collision with root package name */
        public int f13603e;

        /* renamed from: f, reason: collision with root package name */
        public int f13604f;

        /* renamed from: g, reason: collision with root package name */
        public int f13605g;

        /* renamed from: h, reason: collision with root package name */
        public long f13606h;

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f13607i;

        /* renamed from: k, reason: collision with root package name */
        public int f13609k;

        public n(j00.c<? super n> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f13607i = obj;
            this.f13609k |= Integer.MIN_VALUE;
            return AuthServiceImpl.this.k2(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class o implements x00.l<w7.d<v8.t>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f13610a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f13611b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f13612c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        public static final class a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f13613a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f13614b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f13615c;

            public a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f13613a = eVar;
                this.f13614b = cVar;
                this.f13615c = dVar;
            }

            public final void a(d.a randomRetry) {
                g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f13613a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f13613a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f13614b.b(this.f13615c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public o(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f13610a = dVar;
            this.f13611b = eVar;
            this.f13612c = cVar;
        }

        public final void a(w7.d<v8.t> thriftBuilder) {
            g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new a(this.f13611b, this.f13612c, this.f13610a));
            x00.p<ws.i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f13610a);
            g0.n(pVar, "null cannot be cast to non-null type kotlin.Function2<com.microsoft.thrifty.protocol.Protocol, com.microsoft.thrifty.service.AsyncClientBase.Listener, T of com.baicizhan.app.biz.thrift.ThriftServiceImplKt.thriftImpl>");
            thriftBuilder.f((x00.p) x0.q(pVar, 2));
            thriftBuilder.g(i0.a.b.f70581a);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(w7.d<v8.t> dVar) {
            a(dVar);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.auth.AuthServiceImpl", f = "AuthServiceImp.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {96}, m = "requestSms", n = {"phone", "requestType", "tag$iv", "$this$requestSms_u240", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-AuthServiceImpl$requestSms$2", "$i$f$bizCatch", "$i$a$-bizCatch-AuthServiceImpl$requestSms$2$1", "$i$a$-run-AuthServiceImpl$requestSms$2$1$1"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0", "J$0", "I$1", "I$2", "I$3", "I$4"}, v = 1)
    public static final class p extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f13616a;

        /* renamed from: b, reason: collision with root package name */
        public Object f13617b;

        /* renamed from: c, reason: collision with root package name */
        public Object f13618c;

        /* renamed from: d, reason: collision with root package name */
        public Object f13619d;

        /* renamed from: e, reason: collision with root package name */
        public int f13620e;

        /* renamed from: f, reason: collision with root package name */
        public int f13621f;

        /* renamed from: g, reason: collision with root package name */
        public int f13622g;

        /* renamed from: h, reason: collision with root package name */
        public int f13623h;

        /* renamed from: i, reason: collision with root package name */
        public int f13624i;

        /* renamed from: j, reason: collision with root package name */
        public long f13625j;

        /* renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f13626k;

        /* renamed from: m, reason: collision with root package name */
        public int f13628m;

        public p(j00.c<? super p> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f13626k = obj;
            this.f13628m |= Integer.MIN_VALUE;
            return AuthServiceImpl.this.K1(null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class q implements x00.l<w7.d<v8.t>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f13629a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f13630b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f13631c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        public static final class a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f13632a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f13633b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f13634c;

            public a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f13632a = eVar;
                this.f13633b = cVar;
                this.f13634c = dVar;
            }

            public final void a(d.a randomRetry) {
                g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f13632a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f13632a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f13633b.b(this.f13634c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public q(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f13629a = dVar;
            this.f13630b = eVar;
            this.f13631c = cVar;
        }

        public final void a(w7.d<v8.t> thriftBuilder) {
            g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new a(this.f13630b, this.f13631c, this.f13629a));
            x00.p<ws.i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f13629a);
            g0.n(pVar, "null cannot be cast to non-null type kotlin.Function2<com.microsoft.thrifty.protocol.Protocol, com.microsoft.thrifty.service.AsyncClientBase.Listener, T of com.baicizhan.app.biz.thrift.ThriftServiceImplKt.thriftImpl>");
            thriftBuilder.f((x00.p) x0.q(pVar, 2));
            thriftBuilder.g(i0.a.b.f70581a);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(w7.d<v8.t> dVar) {
            a(dVar);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.auth.AuthServiceImpl", f = "AuthServiceImp.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {102, 109}, m = "smsLogin", n = {"phone", "code", "tag$iv", "$this$smsLogin_u240", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-AuthServiceImpl$smsLogin$2", "$i$f$bizCatch", "$i$a$-bizCatch-AuthServiceImpl$smsLogin$2$1", "$i$a$-run-AuthServiceImpl$smsLogin$2$1$1", "phone", "code", "tag$iv", "$this$smsLogin_u240", "user", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-AuthServiceImpl$smsLogin$2", "$i$f$bizCatch", "$i$a$-bizCatch-AuthServiceImpl$smsLogin$2$1", "$i$a$-run-AuthServiceImpl$smsLogin$2$1$1"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0", "J$0", "I$1", "I$2", "I$3", "I$4", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "J$0", "I$1", "I$2", "I$3", "I$4"}, v = 1)
    public static final class r extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f13635a;

        /* renamed from: b, reason: collision with root package name */
        public Object f13636b;

        /* renamed from: c, reason: collision with root package name */
        public Object f13637c;

        /* renamed from: d, reason: collision with root package name */
        public Object f13638d;

        /* renamed from: e, reason: collision with root package name */
        public Object f13639e;

        /* renamed from: f, reason: collision with root package name */
        public int f13640f;

        /* renamed from: g, reason: collision with root package name */
        public int f13641g;

        /* renamed from: h, reason: collision with root package name */
        public int f13642h;

        /* renamed from: i, reason: collision with root package name */
        public int f13643i;

        /* renamed from: j, reason: collision with root package name */
        public int f13644j;

        /* renamed from: k, reason: collision with root package name */
        public long f13645k;

        /* renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f13646l;

        /* renamed from: n, reason: collision with root package name */
        public int f13648n;

        public r(j00.c<? super r> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f13646l = obj;
            this.f13648n |= Integer.MIN_VALUE;
            return AuthServiceImpl.this.e2(null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nKoinComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KoinComponent.kt\norg/koin/core/component/KoinComponentKt$inject$1\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n+ 4 Koin.kt\norg/koin/core/Koin\n*L\n1#1,64:1\n45#2,2:65\n48#2:68\n142#3:67\n127#4:69\n*S KotlinDebug\n*F\n+ 1 KoinComponent.kt\norg/koin/core/component/KoinComponentKt$inject$1\n*L\n63#1:65,2\n63#1:68\n63#1:67\n63#1:69\n*E\n"})
    public static final class s implements x00.a<com.baicizhan.app.biz.auth.o> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ pa0.a f13649a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ za0.a f13650b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x00.a f13651c;

        public s(pa0.a aVar, za0.a aVar2, x00.a aVar3) {
            this.f13649a = aVar;
            this.f13650b = aVar2;
            this.f13651c = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [com.baicizhan.app.biz.auth.o, java.lang.Object] */
        @Override // x00.a
        public final com.baicizhan.app.biz.auth.o invoke() {
            pa0.a aVar = this.f13649a;
            return (aVar instanceof pa0.c ? ((pa0.c) aVar).getScope() : aVar.r().P().h()).i(o0.d(com.baicizhan.app.biz.auth.o.class), this.f13650b, this.f13651c);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.auth.AuthServiceImpl", f = "AuthServiceImp.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5}, l = {187, 188, 189, 191, 193, 195}, m = "tokenAuth", n = {"token", "tag$iv", "$this$tokenAuth_u240", "bczId", "isNewUser", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-AuthServiceImpl$tokenAuth$2", "$i$f$bizCatch", "$i$a$-bizCatch-AuthServiceImpl$tokenAuth$2$1", "$i$a$-run-AuthServiceImpl$tokenAuth$2$1$1", "token", "tag$iv", "$this$tokenAuth_u240", "bczId", "isNewUser", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-AuthServiceImpl$tokenAuth$2", "$i$f$bizCatch", "$i$a$-bizCatch-AuthServiceImpl$tokenAuth$2$1", "$i$a$-run-AuthServiceImpl$tokenAuth$2$1$1", "token", "tag$iv", "$this$tokenAuth_u240", "bczId", "isNewUser", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-AuthServiceImpl$tokenAuth$2", "$i$f$bizCatch", "$i$a$-bizCatch-AuthServiceImpl$tokenAuth$2$1", "$i$a$-run-AuthServiceImpl$tokenAuth$2$1$1", "token", "tag$iv", "$this$tokenAuth_u240", "bczId", "isNewUser", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-AuthServiceImpl$tokenAuth$2", "$i$f$bizCatch", "$i$a$-bizCatch-AuthServiceImpl$tokenAuth$2$1", "$i$a$-run-AuthServiceImpl$tokenAuth$2$1$1", "token", "tag$iv", "$this$tokenAuth_u240", "bczId", "isNewUser", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-AuthServiceImpl$tokenAuth$2", "$i$f$bizCatch", "$i$a$-bizCatch-AuthServiceImpl$tokenAuth$2$1", "$i$a$-run-AuthServiceImpl$tokenAuth$2$1$1", "token", "tag$iv", "$this$tokenAuth_u240", "bczId", "isNewUser", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-AuthServiceImpl$tokenAuth$2", "$i$f$bizCatch", "$i$a$-bizCatch-AuthServiceImpl$tokenAuth$2$1", "$i$a$-run-AuthServiceImpl$tokenAuth$2$1$1"}, s = {"L$0", "L$1", "L$2", "J$0", "Z$0", "I$0", "J$1", "I$1", "I$2", "I$3", "I$4", "L$0", "L$1", "L$2", "J$0", "Z$0", "I$0", "J$1", "I$1", "I$2", "I$3", "I$4", "L$0", "L$1", "L$2", "J$0", "Z$0", "I$0", "J$1", "I$1", "I$2", "I$3", "I$4", "L$0", "L$1", "L$2", "J$0", "Z$0", "I$0", "J$1", "I$1", "I$2", "I$3", "I$4", "L$0", "L$1", "L$2", "J$0", "Z$0", "I$0", "J$1", "I$1", "I$2", "I$3", "I$4", "L$0", "L$1", "L$2", "J$0", "Z$0", "I$0", "J$1", "I$1", "I$2", "I$3", "I$4"}, v = 1)
    public static final class t extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f13652a;

        /* renamed from: b, reason: collision with root package name */
        public Object f13653b;

        /* renamed from: c, reason: collision with root package name */
        public Object f13654c;

        /* renamed from: d, reason: collision with root package name */
        public long f13655d;

        /* renamed from: e, reason: collision with root package name */
        public long f13656e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f13657f;

        /* renamed from: g, reason: collision with root package name */
        public int f13658g;

        /* renamed from: h, reason: collision with root package name */
        public int f13659h;

        /* renamed from: i, reason: collision with root package name */
        public int f13660i;

        /* renamed from: j, reason: collision with root package name */
        public int f13661j;

        /* renamed from: k, reason: collision with root package name */
        public int f13662k;

        /* renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f13663l;

        /* renamed from: n, reason: collision with root package name */
        public int f13665n;

        public t(j00.c<? super t> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f13663l = obj;
            this.f13665n |= Integer.MIN_VALUE;
            return AuthServiceImpl.this.G1(null, 0L, false, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.auth.AuthServiceImpl", f = "AuthServiceImp.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1}, l = {146, 158}, m = "wechatLogin", n = {HiAnalyticsConstant.Direction.REQUEST, "tag$iv", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-AuthServiceImpl$wechatLogin$2", "$i$f$bizCatch", "$i$a$-bizCatch-AuthServiceImpl$wechatLogin$2$1", HiAnalyticsConstant.Direction.REQUEST, "tag$iv", "user", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-AuthServiceImpl$wechatLogin$2", "$i$f$bizCatch", "$i$a$-bizCatch-AuthServiceImpl$wechatLogin$2$1"}, s = {"L$0", "L$1", "I$0", "J$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$2", "I$0", "J$0", "I$1", "I$2", "I$3"}, v = 1)
    public static final class u extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f13666a;

        /* renamed from: b, reason: collision with root package name */
        public Object f13667b;

        /* renamed from: c, reason: collision with root package name */
        public Object f13668c;

        /* renamed from: d, reason: collision with root package name */
        public int f13669d;

        /* renamed from: e, reason: collision with root package name */
        public int f13670e;

        /* renamed from: f, reason: collision with root package name */
        public int f13671f;

        /* renamed from: g, reason: collision with root package name */
        public int f13672g;

        /* renamed from: h, reason: collision with root package name */
        public long f13673h;

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f13674i;

        /* renamed from: k, reason: collision with root package name */
        public int f13676k;

        public u(j00.c<? super u> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f13674i = obj;
            this.f13676k |= Integer.MIN_VALUE;
            return AuthServiceImpl.this.Q1(null, this);
        }
    }

    public AuthServiceImpl(@m80.k com.baicizhan.app.biz.auth.s tokenHolder, @m80.k r3.d localStorage, @m80.k IAuthRepo tokenRepo, @m80.k b6.a userGuideRepo, @m80.k y5.a settingRepo, @m80.k w3.a serverTimeProvider) {
        g0.p(tokenHolder, "tokenHolder");
        g0.p(localStorage, "localStorage");
        g0.p(tokenRepo, "tokenRepo");
        g0.p(userGuideRepo, "userGuideRepo");
        g0.p(settingRepo, "settingRepo");
        g0.p(serverTimeProvider, "serverTimeProvider");
        this.f13477b = tokenHolder;
        this.f13478c = localStorage;
        this.f13479d = tokenRepo;
        this.f13480e = userGuideRepo;
        this.f13481f = settingRepo;
        this.f13482g = serverTimeProvider;
        y<Boolean> a11 = kotlinx.coroutines.flow.o0.a(Boolean.FALSE);
        this.f13483h = a11;
        final kotlinx.coroutines.flow.i I = kotlinx.coroutines.flow.k.I(a11, localStorage.e(), new j(null));
        this.f13484i = kotlinx.coroutines.flow.k.Q1(new kotlinx.coroutines.flow.i<m1>() { // from class: com.baicizhan.app.biz.auth.AuthServiceImpl$special$$inlined$map$1

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @u0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 AuthServiceImp.kt\ncom/baicizhan/app/biz/auth/AuthServiceImpl\n*L\n1#1,49:1\n50#2:50\n76#3:51\n*E\n"})
            /* renamed from: com.baicizhan.app.biz.auth.AuthServiceImpl$special$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.j {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ kotlinx.coroutines.flow.j f13489a;

                @l00.d(c = "com.baicizhan.app.biz.auth.AuthServiceImpl$special$$inlined$map$1$2", f = "AuthServiceImp.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 1)
                /* renamed from: com.baicizhan.app.biz.auth.AuthServiceImpl$special$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(j00.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.j jVar) {
                    this.f13489a = jVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r6, j00.c r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof com.baicizhan.app.biz.auth.AuthServiceImpl$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.baicizhan.app.biz.auth.AuthServiceImpl$special$$inlined$map$1$2$1 r0 = (com.baicizhan.app.biz.auth.AuthServiceImpl$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.baicizhan.app.biz.auth.AuthServiceImpl$special$$inlined$map$1$2$1 r0 = new com.baicizhan.app.biz.auth.AuthServiceImpl$special$$inlined$map$1$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L39
                        if (r2 != r3) goto L31
                        java.lang.Object r6 = r0.L$3
                        kotlinx.coroutines.flow.j r6 = (kotlinx.coroutines.flow.j) r6
                        java.lang.Object r6 = r0.L$1
                        com.baicizhan.app.biz.auth.AuthServiceImpl$special$$inlined$map$1$2$1 r6 = (com.baicizhan.app.biz.auth.AuthServiceImpl$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r6
                        kotlin.e.n(r7)
                        goto L6a
                    L31:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L39:
                        kotlin.e.n(r7)
                        kotlinx.coroutines.flow.j r7 = r5.f13489a
                        r2 = r6
                        k3.m1$a r2 = (k3.m1.a) r2
                        if (r2 == 0) goto L44
                        goto L46
                    L44:
                        k3.m1$b r2 = k3.m1.b.f65443a
                    L46:
                        java.lang.Object r4 = l00.k.a(r6)
                        r0.L$0 = r4
                        java.lang.Object r4 = l00.k.a(r0)
                        r0.L$1 = r4
                        java.lang.Object r6 = l00.k.a(r6)
                        r0.L$2 = r6
                        java.lang.Object r6 = l00.k.a(r7)
                        r0.L$3 = r6
                        r6 = 0
                        r0.I$0 = r6
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r2, r0)
                        if (r6 != r1) goto L6a
                        return r1
                    L6a:
                        yz.g2 r6 = yz.g2.f100423a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.auth.AuthServiceImpl$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, j00.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.i
            public Object collect(kotlinx.coroutines.flow.j<? super m1> jVar, j00.c cVar) {
                Object collect = kotlinx.coroutines.flow.i.this.collect(new AnonymousClass2(jVar), cVar);
                return collect == kotlin.coroutines.intrinsics.b.l() ? collect : g2.f100423a;
            }
        }, s0.a(c4.o.c()), h0.f68148a.c(), m1.b.f65443a);
        this.f13485j = e0.c(new x00.a() { // from class: com.baicizhan.app.biz.auth.g
            @Override // x00.a
            public final Object invoke() {
                l7.p U2;
                U2 = AuthServiceImpl.U2(AuthServiceImpl.this);
                return U2;
            }
        });
        this.f13486k = e0.b(jb0.c.f64013a.b(), new s(this, null, null));
        this.f13487l = e0.c(new x00.a() { // from class: com.baicizhan.app.biz.auth.h
            @Override // x00.a
            public final Object invoke() {
                String O2;
                O2 = AuthServiceImpl.O2(AuthServiceImpl.this);
                return O2;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final String O2(AuthServiceImpl authServiceImpl) {
        return ((c7.e) (authServiceImpl instanceof pa0.c ? ((pa0.c) authServiceImpl).getScope() : authServiceImpl.r().P().h()).i(o0.d(c7.e.class), null, null)).e();
    }

    private final String P2() {
        return (String) this.f13487l.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final l7.p U2(AuthServiceImpl authServiceImpl) {
        return (l7.p) (authServiceImpl instanceof pa0.c ? ((pa0.c) authServiceImpl).getScope() : authServiceImpl.r().P().h()).i(o0.d(l7.p.class), null, null);
    }

    @Override // k3.j
    @m80.k
    public m0<m1> B1() {
        return this.f13484i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 15, insn: 0x00aa: MOVE (r4 I:??[OBJECT, ARRAY]) = (r15 I:??[OBJECT, ARRAY]) (LINE:171), block:B:120:0x00a9 */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x02b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0332 A[Catch: all -> 0x034a, TryCatch #7 {all -> 0x034a, blocks: (B:34:0x032b, B:36:0x0332, B:38:0x0336, B:40:0x033a, B:42:0x033e, B:44:0x0342, B:55:0x03a8, B:46:0x034c, B:48:0x0357, B:50:0x036b, B:52:0x037f, B:54:0x0394), top: B:33:0x032b }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0394 A[Catch: all -> 0x034a, TryCatch #7 {all -> 0x034a, blocks: (B:34:0x032b, B:36:0x0332, B:38:0x0336, B:40:0x033a, B:42:0x033e, B:44:0x0342, B:55:0x03a8, B:46:0x034c, B:48:0x0357, B:50:0x036b, B:52:0x037f, B:54:0x0394), top: B:33:0x032b }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r1v32, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r4v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.StringBuilder] */
    @Override // k3.j
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object G1(@m80.k java.lang.String r34, long r35, boolean r37, @m80.k j00.c<? super yz.g2> r38) {
        /*
            Method dump skipped, instructions count: 1010
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.auth.AuthServiceImpl.G1(java.lang.String, long, boolean, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0125 A[Catch: all -> 0x013d, TryCatch #2 {all -> 0x013d, blocks: (B:22:0x011e, B:24:0x0125, B:26:0x0129, B:28:0x012d, B:30:0x0131, B:32:0x0135, B:43:0x019b, B:34:0x013f, B:36:0x014a, B:38:0x015e, B:40:0x0172, B:42:0x0187), top: B:21:0x011e }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0187 A[Catch: all -> 0x013d, TryCatch #2 {all -> 0x013d, blocks: (B:22:0x011e, B:24:0x0125, B:26:0x0129, B:28:0x012d, B:30:0x0131, B:32:0x0135, B:43:0x019b, B:34:0x013f, B:36:0x014a, B:38:0x015e, B:40:0x0172, B:42:0x0187), top: B:21:0x011e }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    @Override // k3.j
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object K1(@m80.k java.lang.String r18, @m80.k k3.i2 r19, @m80.k j00.c<? super yz.g2> r20) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.auth.AuthServiceImpl.K1(java.lang.String, k3.i2, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x018d A[Catch: all -> 0x01a5, TryCatch #1 {all -> 0x01a5, blocks: (B:23:0x0186, B:25:0x018d, B:27:0x0191, B:29:0x0195, B:31:0x0199, B:33:0x019d, B:44:0x0204, B:35:0x01a8, B:37:0x01b3, B:39:0x01c7, B:41:0x01db, B:43:0x01f0), top: B:22:0x0186 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01f0 A[Catch: all -> 0x01a5, TryCatch #1 {all -> 0x01a5, blocks: (B:23:0x0186, B:25:0x018d, B:27:0x0191, B:29:0x0195, B:31:0x0199, B:33:0x019d, B:44:0x0204, B:35:0x01a8, B:37:0x01b3, B:39:0x01c7, B:41:0x01db, B:43:0x01f0), top: B:22:0x0186 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // k3.j
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object Q1(@m80.k k3.h3 r14, @m80.k j00.c<? super k3.l1> r15) {
        /*
            Method dump skipped, instructions count: 569
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.auth.AuthServiceImpl.Q1(k3.h3, j00.c):java.lang.Object");
    }

    public final com.baicizhan.app.biz.auth.o Q2() {
        return (com.baicizhan.app.biz.auth.o) this.f13486k.getValue();
    }

    public final l7.p R2() {
        return (l7.p) this.f13485j.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0167 A[Catch: all -> 0x017f, TryCatch #3 {all -> 0x017f, blocks: (B:22:0x0160, B:24:0x0167, B:26:0x016b, B:28:0x016f, B:30:0x0173, B:32:0x0177, B:43:0x01dd, B:34:0x0181, B:36:0x018c, B:38:0x01a0, B:40:0x01b4, B:42:0x01c9), top: B:21:0x0160 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01c9 A[Catch: all -> 0x017f, TryCatch #3 {all -> 0x017f, blocks: (B:22:0x0160, B:24:0x0167, B:26:0x016b, B:28:0x016f, B:30:0x0173, B:32:0x0177, B:43:0x01dd, B:34:0x0181, B:36:0x018c, B:38:0x01a0, B:40:0x01b4, B:42:0x01c9), top: B:21:0x0160 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // k3.j
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object S0(@m80.k j00.c<? super k3.l1> r20) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.auth.AuthServiceImpl.S0(j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0128 A[Catch: Exception -> 0x012d, TryCatch #1 {Exception -> 0x012d, blocks: (B:42:0x01a6, B:39:0x0183, B:21:0x010b, B:25:0x0121, B:27:0x0128, B:29:0x0134, B:30:0x0136, B:33:0x0143, B:36:0x015b, B:18:0x00ca, B:13:0x00be), top: B:12:0x00be }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0134 A[Catch: Exception -> 0x012d, TryCatch #1 {Exception -> 0x012d, blocks: (B:42:0x01a6, B:39:0x0183, B:21:0x010b, B:25:0x0121, B:27:0x0128, B:29:0x0134, B:30:0x0136, B:33:0x0143, B:36:0x015b, B:18:0x00ca, B:13:0x00be), top: B:12:0x00be }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x002e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00ad  */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object S2(v8.x r28, com.baicizhan.app.biz.auth.m r29, j00.c<? super k3.l1> r30) {
        /*
            Method dump skipped, instructions count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.auth.AuthServiceImpl.S2(v8.x, com.baicizhan.app.biz.auth.m, j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ff, code lost:
    
        if (S2(r4, r13, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0101, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00d0, code lost:
    
        if (r4 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object T2(java.lang.String r11, java.lang.String r12, com.baicizhan.app.biz.auth.m r13, j00.c<? super yz.g2> r14) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.auth.AuthServiceImpl.T2(java.lang.String, java.lang.String, com.baicizhan.app.biz.auth.m, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0194 A[Catch: all -> 0x01ac, TryCatch #4 {all -> 0x01ac, blocks: (B:22:0x018d, B:24:0x0194, B:26:0x0198, B:28:0x019c, B:30:0x01a0, B:32:0x01a4, B:43:0x020a, B:34:0x01ae, B:36:0x01b9, B:38:0x01cd, B:40:0x01e1, B:42:0x01f6), top: B:21:0x018d }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01f6 A[Catch: all -> 0x01ac, TryCatch #4 {all -> 0x01ac, blocks: (B:22:0x018d, B:24:0x0194, B:26:0x0198, B:28:0x019c, B:30:0x01a0, B:32:0x01a4, B:43:0x020a, B:34:0x01ae, B:36:0x01b9, B:38:0x01cd, B:40:0x01e1, B:42:0x01f6), top: B:21:0x018d }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // k3.j
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e2(@m80.k java.lang.String r26, @m80.k java.lang.String r27, @m80.k j00.c<? super k3.l1> r28) {
        /*
            Method dump skipped, instructions count: 577
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.auth.AuthServiceImpl.e2(java.lang.String, java.lang.String, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x018d A[Catch: all -> 0x01a5, TryCatch #1 {all -> 0x01a5, blocks: (B:23:0x0186, B:25:0x018d, B:27:0x0191, B:29:0x0195, B:31:0x0199, B:33:0x019d, B:44:0x0204, B:35:0x01a8, B:37:0x01b3, B:39:0x01c7, B:41:0x01db, B:43:0x01f0), top: B:22:0x0186 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01f0 A[Catch: all -> 0x01a5, TryCatch #1 {all -> 0x01a5, blocks: (B:23:0x0186, B:25:0x018d, B:27:0x0191, B:29:0x0195, B:31:0x0199, B:33:0x019d, B:44:0x0204, B:35:0x01a8, B:37:0x01b3, B:39:0x01c7, B:41:0x01db, B:43:0x01f0), top: B:22:0x0186 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // k3.j
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object k2(@m80.k k3.h3 r14, @m80.k j00.c<? super k3.l1> r15) {
        /*
            Method dump skipped, instructions count: 569
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.auth.AuthServiceImpl.k2(k3.h3, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0189 A[Catch: all -> 0x01a1, TryCatch #0 {all -> 0x01a1, blocks: (B:22:0x0182, B:24:0x0189, B:26:0x018d, B:28:0x0191, B:30:0x0195, B:32:0x0199, B:43:0x01ff, B:34:0x01a3, B:36:0x01ae, B:38:0x01c2, B:40:0x01d6, B:42:0x01eb), top: B:21:0x0182 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01eb A[Catch: all -> 0x01a1, TryCatch #0 {all -> 0x01a1, blocks: (B:22:0x0182, B:24:0x0189, B:26:0x018d, B:28:0x0191, B:30:0x0195, B:32:0x0199, B:43:0x01ff, B:34:0x01a3, B:36:0x01ae, B:38:0x01c2, B:40:0x01d6, B:42:0x01eb), top: B:21:0x0182 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // k3.j
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object l0(@m80.k java.lang.String r19, @m80.k j00.c<? super k3.l1> r20) {
        /*
            Method dump skipped, instructions count: 566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.auth.AuthServiceImpl.l0(java.lang.String, j00.c):java.lang.Object");
    }

    @Override // c4.j, pa0.a
    @m80.k
    public /* bridge */ na0.a r() {
        return super.r();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x014b A[Catch: all -> 0x0163, TryCatch #2 {all -> 0x0163, blocks: (B:23:0x0144, B:25:0x014b, B:27:0x014f, B:29:0x0153, B:31:0x0157, B:33:0x015b, B:44:0x01c1, B:35:0x0165, B:37:0x0170, B:39:0x0184, B:41:0x0198, B:43:0x01ad), top: B:22:0x0144 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01ad A[Catch: all -> 0x0163, TryCatch #2 {all -> 0x0163, blocks: (B:23:0x0144, B:25:0x014b, B:27:0x014f, B:29:0x0153, B:31:0x0157, B:33:0x015b, B:44:0x01c1, B:35:0x0165, B:37:0x0170, B:39:0x0184, B:41:0x0198, B:43:0x01ad), top: B:22:0x0144 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // k3.j
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object s1(@m80.k j00.c<? super yz.g2> r19) {
        /*
            Method dump skipped, instructions count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.auth.AuthServiceImpl.s1(j00.c):java.lang.Object");
    }

    /* JADX WARN: Not initialized variable reg: 15, insn: 0x00ce: MOVE (r2 I:??[OBJECT, ARRAY]) = (r15 I:??[OBJECT, ARRAY]) (LINE:207), block:B:134:0x00ce */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x00cd: MOVE (r3 I:??[long, double]) = (r8 I:??[long, double]) (LINE:206), block:B:136:0x00cd */
    /* JADX WARN: Removed duplicated region for block: B:103:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01e9 A[Catch: all -> 0x03e6, TRY_LEAVE, TryCatch #3 {all -> 0x03e6, blocks: (B:111:0x01e5, B:113:0x01e9, B:116:0x03ea, B:117:0x03f8), top: B:110:0x01e5 }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03ea A[Catch: all -> 0x03e6, TRY_ENTER, TryCatch #3 {all -> 0x03e6, blocks: (B:111:0x01e5, B:113:0x01e9, B:116:0x03ea, B:117:0x03f8), top: B:110:0x01e5 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0403 A[Catch: all -> 0x041b, TryCatch #7 {all -> 0x041b, blocks: (B:23:0x03fc, B:25:0x0403, B:27:0x0407, B:29:0x040b, B:31:0x040f, B:33:0x0413, B:44:0x0479, B:35:0x041d, B:37:0x0428, B:39:0x043c, B:41:0x0450, B:43:0x0465), top: B:22:0x03fc }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0465 A[Catch: all -> 0x041b, TryCatch #7 {all -> 0x041b, blocks: (B:23:0x03fc, B:25:0x0403, B:27:0x0407, B:29:0x040b, B:31:0x040f, B:33:0x0413, B:44:0x0479, B:35:0x041d, B:37:0x0428, B:39:0x043c, B:41:0x0450, B:43:0x0465), top: B:22:0x03fc }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x031c A[Catch: all -> 0x0274, TryCatch #2 {all -> 0x0274, blocks: (B:56:0x0355, B:66:0x0318, B:68:0x031c, B:72:0x03da, B:73:0x03e5, B:78:0x02e2, B:89:0x0279, B:91:0x027d, B:101:0x022c), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x03da A[Catch: all -> 0x0274, TRY_ENTER, TryCatch #2 {all -> 0x0274, blocks: (B:56:0x0355, B:66:0x0318, B:68:0x031c, B:72:0x03da, B:73:0x03e5, B:78:0x02e2, B:89:0x0279, B:91:0x027d, B:101:0x022c), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x027d A[Catch: all -> 0x0274, TryCatch #2 {all -> 0x0274, blocks: (B:56:0x0355, B:66:0x0318, B:68:0x031c, B:72:0x03da, B:73:0x03e5, B:78:0x02e2, B:89:0x0279, B:91:0x027d, B:101:0x022c), top: B:7:0x0025 }] */
    @Override // k3.j
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object v1(@m80.k j00.c<? super k3.l1> r28) {
        /*
            Method dump skipped, instructions count: 1220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.auth.AuthServiceImpl.v1(j00.c):java.lang.Object");
    }
}
