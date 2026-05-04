package b7;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.microsoft.thrifty.service.a;
import k3.s1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.x0;
import l7.i0;
import l7.p;
import m80.k;
import m80.l;
import oa0.r;
import y7.d;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r(binds = {s1.class})
@u0({"SMAP\nMallServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MallServiceImpl.kt\ncom/baicizhan/app/biz/mall/MallServiceImpl\n+ 2 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService\n+ 3 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt\n+ 4 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService$thrift$1\n+ 5 Koin.kt\norg/koin/core/Koin\n+ 6 Scope.kt\norg/koin/core/scope/Scope\n+ 7 TimeMeasurer.kt\ncom/baicizhan/app/biz/base/TimeMeasurerKt\n+ 8 BizCatch.kt\ncom/baicizhan/app/biz/base/BizCatchKt\n+ 9 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 10 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,99:1\n6#2:100\n6#2:112\n64#3,2:101\n66#3:104\n67#3,2:110\n64#3,2:113\n66#3:116\n67#3,2:122\n6#4:103\n6#4:115\n124#5,4:105\n124#5,4:117\n142#6:109\n142#6:121\n12#7,3:124\n15#7,10:145\n12#8,2:127\n14#8,10:135\n1563#9:129\n1634#9,3:130\n1563#9:155\n1634#9,3:156\n37#10,2:133\n37#10,2:159\n*S KotlinDebug\n*F\n+ 1 MallServiceImpl.kt\ncom/baicizhan/app/biz/mall/MallServiceImpl\n*L\n26#1:100\n27#1:112\n26#1:101,2\n26#1:104\n26#1:110,2\n27#1:113,2\n27#1:116\n27#1:122,2\n26#1:103\n27#1:115\n26#1:105,4\n27#1:117,4\n26#1:109\n27#1:121\n-1#1:124,3\n-1#1:145,10\n-1#1:127,2\n-1#1:135,10\n31#1:129\n31#1:130,3\n36#1:155\n36#1:156,3\n31#1:133,2\n36#1:159,2\n*E\n"})
/* loaded from: classes3.dex */
public final class c implements s1 {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final p f6188b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.mall.MallServiceImpl", f = "MallServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1}, l = {41, 42}, m = "choiceAddress", n = {"tag$iv", "addressId", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-MallServiceImpl$choiceAddress$2", "$i$f$bizCatch", "$i$a$-bizCatch-MallServiceImpl$choiceAddress$2$1", "tag$iv", "addressId", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-MallServiceImpl$choiceAddress$2", "$i$f$bizCatch", "$i$a$-bizCatch-MallServiceImpl$choiceAddress$2$1"}, s = {"L$0", "I$0", "I$1", "J$0", "I$2", "I$3", "I$4", "L$0", "I$0", "I$1", "J$0", "I$2", "I$3", "I$4"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f6189a;

        /* renamed from: b, reason: collision with root package name */
        public int f6190b;

        /* renamed from: c, reason: collision with root package name */
        public int f6191c;

        /* renamed from: d, reason: collision with root package name */
        public int f6192d;

        /* renamed from: e, reason: collision with root package name */
        public int f6193e;

        /* renamed from: f, reason: collision with root package name */
        public Object f6194f;

        /* renamed from: g, reason: collision with root package name */
        public long f6195g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f6196h;

        /* renamed from: j, reason: collision with root package name */
        public int f6198j;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f6196h = obj;
            this.f6198j |= Integer.MIN_VALUE;
            return c.this.R1(0, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.mall.MallServiceImpl", f = "MallServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {49}, m = "createUserAddress", n = {"userAddressReq", "tag$iv", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-MallServiceImpl$createUserAddress$2", "$i$f$bizCatch", "$i$a$-bizCatch-MallServiceImpl$createUserAddress$2$1"}, s = {"L$0", "L$1", "I$0", "J$0", "I$1", "I$2", "I$3"}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f6199a;

        /* renamed from: b, reason: collision with root package name */
        public Object f6200b;

        /* renamed from: c, reason: collision with root package name */
        public int f6201c;

        /* renamed from: d, reason: collision with root package name */
        public int f6202d;

        /* renamed from: e, reason: collision with root package name */
        public int f6203e;

        /* renamed from: f, reason: collision with root package name */
        public int f6204f;

        /* renamed from: g, reason: collision with root package name */
        public long f6205g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f6206h;

        /* renamed from: j, reason: collision with root package name */
        public int f6208j;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f6206h = obj;
            this.f6208j |= Integer.MIN_VALUE;
            return c.this.f1(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.mall.MallServiceImpl", f = "MallServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {54}, m = "deleteUserAddress", n = {"tag$iv", "addressId", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-MallServiceImpl$deleteUserAddress$2", "$i$f$bizCatch", "$i$a$-bizCatch-MallServiceImpl$deleteUserAddress$2$1"}, s = {"L$0", "I$0", "I$1", "J$0", "I$2", "I$3", "I$4"}, v = 1)
    /* renamed from: b7.c$c, reason: collision with other inner class name */
    public static final class C0110c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f6209a;

        /* renamed from: b, reason: collision with root package name */
        public int f6210b;

        /* renamed from: c, reason: collision with root package name */
        public int f6211c;

        /* renamed from: d, reason: collision with root package name */
        public int f6212d;

        /* renamed from: e, reason: collision with root package name */
        public int f6213e;

        /* renamed from: f, reason: collision with root package name */
        public Object f6214f;

        /* renamed from: g, reason: collision with root package name */
        public long f6215g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f6216h;

        /* renamed from: j, reason: collision with root package name */
        public int f6218j;

        public C0110c(j00.c<? super C0110c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f6216h = obj;
            this.f6218j |= Integer.MIN_VALUE;
            return c.this.v0(0, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.mall.MallServiceImpl", f = "MallServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {36}, m = "getChildAddress", n = {"tag$iv", "parentId", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-MallServiceImpl$getChildAddress$2", "$i$f$bizCatch", "$i$a$-bizCatch-MallServiceImpl$getChildAddress$2$1"}, s = {"L$0", "I$0", "I$1", "J$0", "I$2", "I$3", "I$4"}, v = 1)
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f6219a;

        /* renamed from: b, reason: collision with root package name */
        public int f6220b;

        /* renamed from: c, reason: collision with root package name */
        public int f6221c;

        /* renamed from: d, reason: collision with root package name */
        public int f6222d;

        /* renamed from: e, reason: collision with root package name */
        public int f6223e;

        /* renamed from: f, reason: collision with root package name */
        public Object f6224f;

        /* renamed from: g, reason: collision with root package name */
        public long f6225g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f6226h;

        /* renamed from: j, reason: collision with root package name */
        public int f6228j;

        public d(j00.c<? super d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f6226h = obj;
            this.f6228j |= Integer.MIN_VALUE;
            return c.this.H2(0, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.mall.MallServiceImpl", f = "MallServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {31}, m = "getUserAddress", n = {"tag$iv", "status", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-MallServiceImpl$getUserAddress$2", "$i$f$bizCatch", "$i$a$-bizCatch-MallServiceImpl$getUserAddress$2$1"}, s = {"L$0", "I$0", "I$1", "J$0", "I$2", "I$3", "I$4"}, v = 1)
    public static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f6229a;

        /* renamed from: b, reason: collision with root package name */
        public int f6230b;

        /* renamed from: c, reason: collision with root package name */
        public int f6231c;

        /* renamed from: d, reason: collision with root package name */
        public int f6232d;

        /* renamed from: e, reason: collision with root package name */
        public int f6233e;

        /* renamed from: f, reason: collision with root package name */
        public Object f6234f;

        /* renamed from: g, reason: collision with root package name */
        public long f6235g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f6236h;

        /* renamed from: j, reason: collision with root package name */
        public int f6238j;

        public e(j00.c<? super e> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f6236h = obj;
            this.f6238j |= Integer.MIN_VALUE;
            return c.this.X0(0, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.mall.MallServiceImpl", f = "MallServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {91}, m = "hmPay", n = {"extra", "token", "tag$iv", HiAnalyticsConstant.Direction.REQUEST, "productType", "subItemId", "count", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-MallServiceImpl$hmPay$2", "$i$f$bizCatch", "$i$a$-bizCatch-MallServiceImpl$hmPay$2$1"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0", "I$1", "I$2", "I$3", "J$0", "I$4", "I$5", "I$6"}, v = 1)
    public static final class f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f6239a;

        /* renamed from: b, reason: collision with root package name */
        public int f6240b;

        /* renamed from: c, reason: collision with root package name */
        public int f6241c;

        /* renamed from: d, reason: collision with root package name */
        public int f6242d;

        /* renamed from: e, reason: collision with root package name */
        public int f6243e;

        /* renamed from: f, reason: collision with root package name */
        public int f6244f;

        /* renamed from: g, reason: collision with root package name */
        public int f6245g;

        /* renamed from: h, reason: collision with root package name */
        public Object f6246h;

        /* renamed from: i, reason: collision with root package name */
        public Object f6247i;

        /* renamed from: j, reason: collision with root package name */
        public Object f6248j;

        /* renamed from: k, reason: collision with root package name */
        public Object f6249k;

        /* renamed from: l, reason: collision with root package name */
        public long f6250l;

        /* renamed from: m, reason: collision with root package name */
        public /* synthetic */ Object f6251m;

        /* renamed from: o, reason: collision with root package name */
        public int f6253o;

        public f(j00.c<? super f> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f6251m = obj;
            this.f6253o |= Integer.MIN_VALUE;
            return c.this.n0(0, 0, 0, null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.mall.MallServiceImpl", f = "MallServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {64}, m = "matchAddress", n = {"province", "city", "district", "tag$iv", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-MallServiceImpl$matchAddress$2", "$i$f$bizCatch", "$i$a$-bizCatch-MallServiceImpl$matchAddress$2$1"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0", "J$0", "I$1", "I$2", "I$3"}, v = 1)
    public static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f6254a;

        /* renamed from: b, reason: collision with root package name */
        public Object f6255b;

        /* renamed from: c, reason: collision with root package name */
        public Object f6256c;

        /* renamed from: d, reason: collision with root package name */
        public Object f6257d;

        /* renamed from: e, reason: collision with root package name */
        public int f6258e;

        /* renamed from: f, reason: collision with root package name */
        public int f6259f;

        /* renamed from: g, reason: collision with root package name */
        public int f6260g;

        /* renamed from: h, reason: collision with root package name */
        public int f6261h;

        /* renamed from: i, reason: collision with root package name */
        public long f6262i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f6263j;

        /* renamed from: l, reason: collision with root package name */
        public int f6265l;

        public g(j00.c<? super g> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f6263j = obj;
            this.f6265l |= Integer.MIN_VALUE;
            return c.this.Q(null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class h implements x00.l<w7.d<q8.d>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f6266a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f6267b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f6268c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        public static final class a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f6269a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f6270b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f6271c;

            public a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f6269a = eVar;
                this.f6270b = cVar;
                this.f6271c = dVar;
            }

            public final void a(d.a randomRetry) {
                g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f6269a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f6269a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f6270b.b(this.f6271c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public h(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f6266a = dVar;
            this.f6267b = eVar;
            this.f6268c = cVar;
        }

        public final void a(w7.d<q8.d> thriftBuilder) {
            g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new a(this.f6267b, this.f6268c, this.f6266a));
            x00.p<ws.i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f6266a);
            g0.n(pVar, "null cannot be cast to non-null type kotlin.Function2<com.microsoft.thrifty.protocol.Protocol, com.microsoft.thrifty.service.AsyncClientBase.Listener, T of com.baicizhan.app.biz.thrift.ThriftServiceImplKt.thriftImpl>");
            thriftBuilder.f((x00.p) x0.q(pVar, 2));
            thriftBuilder.g(i0.a.b.f70581a);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(w7.d<q8.d> dVar) {
            a(dVar);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class i implements x00.l<w7.d<x8.h>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f6272a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f6273b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f6274c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        public static final class a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f6275a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f6276b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f6277c;

            public a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f6275a = eVar;
                this.f6276b = cVar;
                this.f6277c = dVar;
            }

            public final void a(d.a randomRetry) {
                g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f6275a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f6275a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f6276b.b(this.f6277c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public i(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f6272a = dVar;
            this.f6273b = eVar;
            this.f6274c = cVar;
        }

        public final void a(w7.d<x8.h> thriftBuilder) {
            g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new a(this.f6273b, this.f6274c, this.f6272a));
            x00.p<ws.i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f6272a);
            g0.n(pVar, "null cannot be cast to non-null type kotlin.Function2<com.microsoft.thrifty.protocol.Protocol, com.microsoft.thrifty.service.AsyncClientBase.Listener, T of com.baicizhan.app.biz.thrift.ThriftServiceImplKt.thriftImpl>");
            thriftBuilder.f((x00.p) x0.q(pVar, 2));
            thriftBuilder.g(i0.a.b.f70581a);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(w7.d<x8.h> dVar) {
            a(dVar);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.mall.MallServiceImpl", f = "MallServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {59}, m = "updateUserAddress", n = {"userAddressReq", "tag$iv", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-MallServiceImpl$updateUserAddress$2", "$i$f$bizCatch", "$i$a$-bizCatch-MallServiceImpl$updateUserAddress$2$1"}, s = {"L$0", "L$1", "I$0", "J$0", "I$1", "I$2", "I$3"}, v = 1)
    public static final class j extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f6278a;

        /* renamed from: b, reason: collision with root package name */
        public Object f6279b;

        /* renamed from: c, reason: collision with root package name */
        public int f6280c;

        /* renamed from: d, reason: collision with root package name */
        public int f6281d;

        /* renamed from: e, reason: collision with root package name */
        public int f6282e;

        /* renamed from: f, reason: collision with root package name */
        public int f6283f;

        /* renamed from: g, reason: collision with root package name */
        public long f6284g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f6285h;

        /* renamed from: j, reason: collision with root package name */
        public int f6287j;

        public j(j00.c<? super j> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f6285h = obj;
            this.f6287j |= Integer.MIN_VALUE;
            return c.this.L1(null, this);
        }
    }

    public c(@k p thrift) {
        g0.p(thrift, "thrift");
        this.f6188b = thrift;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0083 A[Catch: all -> 0x0032, LOOP:0: B:13:0x007d->B:15:0x0083, LOOP_END, TryCatch #1 {all -> 0x0032, blocks: (B:11:0x002e, B:12:0x006c, B:13:0x007d, B:15:0x0083, B:17:0x0091), top: B:10:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00dd A[Catch: all -> 0x00f5, TryCatch #2 {all -> 0x00f5, blocks: (B:27:0x00d6, B:29:0x00dd, B:31:0x00e1, B:33:0x00e5, B:35:0x00e9, B:37:0x00ed, B:48:0x0154, B:39:0x00f8, B:41:0x0103, B:43:0x0117, B:45:0x012b, B:47:0x0140), top: B:26:0x00d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0140 A[Catch: all -> 0x00f5, TryCatch #2 {all -> 0x00f5, blocks: (B:27:0x00d6, B:29:0x00dd, B:31:0x00e1, B:33:0x00e5, B:35:0x00e9, B:37:0x00ed, B:48:0x0154, B:39:0x00f8, B:41:0x0103, B:43:0x0117, B:45:0x012b, B:47:0x0140), top: B:26:0x00d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // k3.s1
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object H2(int r11, @m80.k j00.c<? super k3.a0[]> r12) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b7.c.H2(int, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c2 A[Catch: all -> 0x00da, TryCatch #2 {all -> 0x00da, blocks: (B:22:0x00bb, B:24:0x00c2, B:26:0x00c6, B:28:0x00ca, B:30:0x00ce, B:32:0x00d2, B:43:0x0139, B:34:0x00dd, B:36:0x00e8, B:38:0x00fc, B:40:0x0110, B:42:0x0125), top: B:21:0x00bb }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0125 A[Catch: all -> 0x00da, TryCatch #2 {all -> 0x00da, blocks: (B:22:0x00bb, B:24:0x00c2, B:26:0x00c6, B:28:0x00ca, B:30:0x00ce, B:32:0x00d2, B:43:0x0139, B:34:0x00dd, B:36:0x00e8, B:38:0x00fc, B:40:0x0110, B:42:0x0125), top: B:21:0x00bb }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // k3.s1
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object L1(@m80.k k3.g r11, @m80.k j00.c<? super k3.n3> r12) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b7.c.L1(k3.g, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0093 A[Catch: all -> 0x003d, TRY_LEAVE, TryCatch #1 {all -> 0x003d, blocks: (B:11:0x0039, B:12:0x008d, B:14:0x0093, B:20:0x00ce, B:21:0x00d9), top: B:10:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ce A[Catch: all -> 0x003d, TRY_ENTER, TryCatch #1 {all -> 0x003d, blocks: (B:11:0x0039, B:12:0x008d, B:14:0x0093, B:20:0x00ce, B:21:0x00d9), top: B:10:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e6 A[Catch: all -> 0x00fe, TryCatch #2 {all -> 0x00fe, blocks: (B:25:0x00df, B:27:0x00e6, B:29:0x00ea, B:31:0x00ee, B:33:0x00f2, B:35:0x00f6, B:46:0x015d, B:37:0x0101, B:39:0x010c, B:41:0x0120, B:43:0x0134, B:45:0x0149), top: B:24:0x00df }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0149 A[Catch: all -> 0x00fe, TryCatch #2 {all -> 0x00fe, blocks: (B:25:0x00df, B:27:0x00e6, B:29:0x00ea, B:31:0x00ee, B:33:0x00f2, B:35:0x00f6, B:46:0x015d, B:37:0x0101, B:39:0x010c, B:41:0x0120, B:43:0x0134, B:45:0x0149), top: B:24:0x00df }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // k3.s1
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object Q(@m80.k java.lang.String r11, @m80.k java.lang.String r12, @m80.k java.lang.String r13, @m80.k j00.c<? super k3.f> r14) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b7.c.Q(java.lang.String, java.lang.String, java.lang.String, j00.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c0 A[Catch: all -> 0x003f, TryCatch #4 {all -> 0x003f, blocks: (B:13:0x003a, B:14:0x00b4, B:15:0x00ba, B:17:0x00c0, B:21:0x00cd, B:23:0x00d1), top: B:12:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d1 A[Catch: all -> 0x003f, TRY_LEAVE, TryCatch #4 {all -> 0x003f, blocks: (B:13:0x003a, B:14:0x00b4, B:15:0x00ba, B:17:0x00c0, B:21:0x00cd, B:23:0x00d1), top: B:12:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0122 A[Catch: all -> 0x0111, TryCatch #1 {all -> 0x0111, blocks: (B:24:0x00d6, B:36:0x011b, B:38:0x0122, B:40:0x0126, B:42:0x012a, B:44:0x012e, B:46:0x0132, B:57:0x0196, B:48:0x013a, B:50:0x0145, B:52:0x0159, B:54:0x016d, B:56:0x0182), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0182 A[Catch: all -> 0x0111, TryCatch #1 {all -> 0x0111, blocks: (B:24:0x00d6, B:36:0x011b, B:38:0x0122, B:40:0x0126, B:42:0x012a, B:44:0x012e, B:46:0x0132, B:57:0x0196, B:48:0x013a, B:50:0x0145, B:52:0x0159, B:54:0x016d, B:56:0x0182), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2, types: [b7.c$a, j00.c, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, long] */
    @Override // k3.s1
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object R1(int r18, @m80.k j00.c<? super java.lang.Integer> r19) {
        /*
            Method dump skipped, instructions count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b7.c.R1(int, j00.c):java.lang.Object");
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0083 A[Catch: all -> 0x0032, LOOP:0: B:13:0x007d->B:15:0x0083, LOOP_END, TryCatch #1 {all -> 0x0032, blocks: (B:11:0x002e, B:12:0x006c, B:13:0x007d, B:15:0x0083, B:17:0x0091), top: B:10:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00dd A[Catch: all -> 0x00f5, TryCatch #2 {all -> 0x00f5, blocks: (B:27:0x00d6, B:29:0x00dd, B:31:0x00e1, B:33:0x00e5, B:35:0x00e9, B:37:0x00ed, B:48:0x0154, B:39:0x00f8, B:41:0x0103, B:43:0x0117, B:45:0x012b, B:47:0x0140), top: B:26:0x00d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0140 A[Catch: all -> 0x00f5, TryCatch #2 {all -> 0x00f5, blocks: (B:27:0x00d6, B:29:0x00dd, B:31:0x00e1, B:33:0x00e5, B:35:0x00e9, B:37:0x00ed, B:48:0x0154, B:39:0x00f8, B:41:0x0103, B:43:0x0117, B:45:0x012b, B:47:0x0140), top: B:26:0x00d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // k3.s1
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object X0(int r11, @m80.k j00.c<? super k3.n3[]> r12) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b7.c.X0(int, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c2 A[Catch: all -> 0x00da, TryCatch #2 {all -> 0x00da, blocks: (B:22:0x00bb, B:24:0x00c2, B:26:0x00c6, B:28:0x00ca, B:30:0x00ce, B:32:0x00d2, B:43:0x0139, B:34:0x00dd, B:36:0x00e8, B:38:0x00fc, B:40:0x0110, B:42:0x0125), top: B:21:0x00bb }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0125 A[Catch: all -> 0x00da, TryCatch #2 {all -> 0x00da, blocks: (B:22:0x00bb, B:24:0x00c2, B:26:0x00c6, B:28:0x00ca, B:30:0x00ce, B:32:0x00d2, B:43:0x0139, B:34:0x00dd, B:36:0x00e8, B:38:0x00fc, B:40:0x0110, B:42:0x0125), top: B:21:0x00bb }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // k3.s1
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f1(@m80.k k3.g r11, @m80.k j00.c<? super k3.n3> r12) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b7.c.f1(k3.g, j00.c):java.lang.Object");
    }

    public final x8.h h() {
        return (x8.h) w7.f.b(new i(o0.d(x8.h.class), new l7.e(null, null, 3, null), (l7.c) c4.j.f7801a.a().P().h().i(o0.d(l7.c.class), null, null)));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x010f A[Catch: all -> 0x0127, TryCatch #1 {all -> 0x0127, blocks: (B:21:0x0108, B:23:0x010f, B:25:0x0113, B:27:0x0117, B:29:0x011b, B:31:0x011f, B:42:0x0185, B:33:0x0129, B:35:0x0134, B:37:0x0148, B:39:0x015c, B:41:0x0171), top: B:20:0x0108 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0171 A[Catch: all -> 0x0127, TryCatch #1 {all -> 0x0127, blocks: (B:21:0x0108, B:23:0x010f, B:25:0x0113, B:27:0x0117, B:29:0x011b, B:31:0x011f, B:42:0x0185, B:33:0x0129, B:35:0x0134, B:37:0x0148, B:39:0x015c, B:41:0x0171), top: B:20:0x0108 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    @Override // k3.s1
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object n0(int r21, int r22, int r23, @m80.k java.lang.String r24, @m80.k java.lang.String r25, @m80.k j00.c<? super java.lang.String> r26) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b7.c.n0(int, int, int, java.lang.String, java.lang.String, j00.c):java.lang.Object");
    }

    public final q8.d r() {
        return (q8.d) w7.f.b(new h(o0.d(q8.d.class), new l7.e(null, null, 3, null), (l7.c) c4.j.f7801a.a().P().h().i(o0.d(l7.c.class), null, null)));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b0 A[Catch: all -> 0x00c8, TryCatch #2 {all -> 0x00c8, blocks: (B:22:0x00a9, B:24:0x00b0, B:26:0x00b4, B:28:0x00b8, B:30:0x00bc, B:32:0x00c0, B:43:0x0127, B:34:0x00cb, B:36:0x00d6, B:38:0x00ea, B:40:0x00fe, B:42:0x0113), top: B:21:0x00a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0113 A[Catch: all -> 0x00c8, TryCatch #2 {all -> 0x00c8, blocks: (B:22:0x00a9, B:24:0x00b0, B:26:0x00b4, B:28:0x00b8, B:30:0x00bc, B:32:0x00c0, B:43:0x0127, B:34:0x00cb, B:36:0x00d6, B:38:0x00ea, B:40:0x00fe, B:42:0x0113), top: B:21:0x00a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // k3.s1
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object v0(int r11, @m80.k j00.c<? super yz.g2> r12) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b7.c.v0(int, j00.c):java.lang.Object");
    }
}
