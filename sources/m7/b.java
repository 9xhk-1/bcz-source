package m7;

import c4.j;
import com.microsoft.thrifty.service.a;
import k3.z1;
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
import ws.i;
import y7.d;
import y8.h;
import yz.g2;
import z8.b2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r(binds = {z1.class})
@u0({"SMAP\nNetworkProxyServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkProxyServiceImpl.kt\ncom/baicizhan/app/biz/thrifttransparent/NetworkProxyServiceImpl\n+ 2 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService\n+ 3 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt\n+ 4 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService$thrift$1\n+ 5 Koin.kt\norg/koin/core/Koin\n+ 6 Scope.kt\norg/koin/core/scope/Scope\n+ 7 TimeMeasurer.kt\ncom/baicizhan/app/biz/base/TimeMeasurerKt\n+ 8 BizCatch.kt\ncom/baicizhan/app/biz/base/BizCatchKt\n*L\n1#1,69:1\n6#2:70\n6#2:82\n6#2:94\n64#3,2:71\n66#3:74\n67#3,2:80\n64#3,2:83\n66#3:86\n67#3,2:92\n64#3,2:95\n66#3:98\n67#3,2:104\n6#4:73\n6#4:85\n6#4:97\n124#5,4:75\n124#5,4:87\n124#5,4:99\n142#6:79\n142#6:91\n142#6:103\n12#7,3:106\n15#7,10:121\n12#8,12:109\n*S KotlinDebug\n*F\n+ 1 NetworkProxyServiceImpl.kt\ncom/baicizhan/app/biz/thrifttransparent/NetworkProxyServiceImpl\n*L\n18#1:70\n19#1:82\n22#1:94\n18#1:71,2\n18#1:74\n18#1:80,2\n19#1:83,2\n19#1:86\n19#1:92,2\n22#1:95,2\n22#1:98\n22#1:104,2\n18#1:73\n19#1:85\n22#1:97\n18#1:75,4\n19#1:87,4\n22#1:99,4\n18#1:79\n19#1:91\n22#1:103\n-1#1:106,3\n-1#1:121,10\n-1#1:109,12\n*E\n"})
/* loaded from: classes3.dex */
public final class b implements z1 {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final p f72515b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.thrifttransparent.NetworkProxyServiceImpl", f = "NetworkProxyServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {31}, m = "analyzeClipboard", n = {"code", "tag$iv", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-NetworkProxyServiceImpl$analyzeClipboard$2", "$i$f$bizCatch", "$i$a$-bizCatch-NetworkProxyServiceImpl$analyzeClipboard$2$1"}, s = {"L$0", "L$1", "I$0", "J$0", "I$1", "I$2", "I$3"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f72516a;

        /* renamed from: b, reason: collision with root package name */
        public Object f72517b;

        /* renamed from: c, reason: collision with root package name */
        public int f72518c;

        /* renamed from: d, reason: collision with root package name */
        public int f72519d;

        /* renamed from: e, reason: collision with root package name */
        public int f72520e;

        /* renamed from: f, reason: collision with root package name */
        public int f72521f;

        /* renamed from: g, reason: collision with root package name */
        public long f72522g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f72523h;

        /* renamed from: j, reason: collision with root package name */
        public int f72525j;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f72523h = obj;
            this.f72525j |= Integer.MIN_VALUE;
            return b.this.N0(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.thrifttransparent.NetworkProxyServiceImpl", f = "NetworkProxyServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {36}, m = "selectUserBook", n = {"deviceId", "userBookId", "tag$iv", "dailyPlanCount", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-NetworkProxyServiceImpl$selectUserBook$2", "$i$f$bizCatch", "$i$a$-bizCatch-NetworkProxyServiceImpl$selectUserBook$2$1"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "J$0", "I$2", "I$3", "I$4"}, v = 1)
    /* renamed from: m7.b$b, reason: collision with other inner class name */
    public static final class C0872b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f72526a;

        /* renamed from: b, reason: collision with root package name */
        public Object f72527b;

        /* renamed from: c, reason: collision with root package name */
        public Object f72528c;

        /* renamed from: d, reason: collision with root package name */
        public int f72529d;

        /* renamed from: e, reason: collision with root package name */
        public int f72530e;

        /* renamed from: f, reason: collision with root package name */
        public int f72531f;

        /* renamed from: g, reason: collision with root package name */
        public int f72532g;

        /* renamed from: h, reason: collision with root package name */
        public int f72533h;

        /* renamed from: i, reason: collision with root package name */
        public long f72534i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f72535j;

        /* renamed from: l, reason: collision with root package name */
        public int f72537l;

        public C0872b(j00.c<? super C0872b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f72535j = obj;
            this.f72537l |= Integer.MIN_VALUE;
            return b.this.Y0(null, null, 0, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.thrifttransparent.NetworkProxyServiceImpl", f = "NetworkProxyServiceImpl.kt", i = {0, 0, 0, 0, 0, 0}, l = {26}, m = "shareBonus", n = {"tag$iv", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-NetworkProxyServiceImpl$shareBonus$2", "$i$f$bizCatch", "$i$a$-bizCatch-NetworkProxyServiceImpl$shareBonus$2$1"}, s = {"L$0", "I$0", "J$0", "I$1", "I$2", "I$3"}, v = 1)
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f72538a;

        /* renamed from: b, reason: collision with root package name */
        public int f72539b;

        /* renamed from: c, reason: collision with root package name */
        public int f72540c;

        /* renamed from: d, reason: collision with root package name */
        public int f72541d;

        /* renamed from: e, reason: collision with root package name */
        public int f72542e;

        /* renamed from: f, reason: collision with root package name */
        public long f72543f;

        /* renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f72544g;

        /* renamed from: i, reason: collision with root package name */
        public int f72546i;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f72544g = obj;
            this.f72546i |= Integer.MIN_VALUE;
            return b.this.P1(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class d implements x00.l<w7.d<b2>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f72547a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f72548b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f72549c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        public static final class a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f72550a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f72551b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f72552c;

            public a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f72550a = eVar;
                this.f72551b = cVar;
                this.f72552c = dVar;
            }

            public final void a(d.a randomRetry) {
                g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f72550a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f72550a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f72551b.b(this.f72552c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public d(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f72547a = dVar;
            this.f72548b = eVar;
            this.f72549c = cVar;
        }

        public final void a(w7.d<b2> thriftBuilder) {
            g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new a(this.f72548b, this.f72549c, this.f72547a));
            x00.p<i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f72547a);
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

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class e implements x00.l<w7.d<h>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f72553a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f72554b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f72555c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        public static final class a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f72556a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f72557b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f72558c;

            public a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f72556a = eVar;
                this.f72557b = cVar;
                this.f72558c = dVar;
            }

            public final void a(d.a randomRetry) {
                g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f72556a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f72556a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f72557b.b(this.f72558c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public e(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f72553a = dVar;
            this.f72554b = eVar;
            this.f72555c = cVar;
        }

        public final void a(w7.d<h> thriftBuilder) {
            g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new a(this.f72554b, this.f72555c, this.f72553a));
            x00.p<i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f72553a);
            g0.n(pVar, "null cannot be cast to non-null type kotlin.Function2<com.microsoft.thrifty.protocol.Protocol, com.microsoft.thrifty.service.AsyncClientBase.Listener, T of com.baicizhan.app.biz.thrift.ThriftServiceImplKt.thriftImpl>");
            thriftBuilder.f((x00.p) x0.q(pVar, 2));
            thriftBuilder.g(i0.a.b.f70581a);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(w7.d<h> dVar) {
            a(dVar);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class f implements x00.l<w7.d<x8.h>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f72559a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f72560b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f72561c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        public static final class a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f72562a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f72563b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f72564c;

            public a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f72562a = eVar;
                this.f72563b = cVar;
                this.f72564c = dVar;
            }

            public final void a(d.a randomRetry) {
                g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f72562a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f72562a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f72563b.b(this.f72564c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public f(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f72559a = dVar;
            this.f72560b = eVar;
            this.f72561c = cVar;
        }

        public final void a(w7.d<x8.h> thriftBuilder) {
            g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new a(this.f72560b, this.f72561c, this.f72559a));
            x00.p<i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f72559a);
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

    public b(@k p thriftService) {
        g0.p(thriftService, "thriftService");
        this.f72515b = thriftService;
    }

    private final b2 r() {
        return (b2) w7.f.b(new d(o0.d(b2.class), new l7.e(null, null, 3, null), (l7.c) j.f7801a.a().P().h().i(o0.d(l7.c.class), null, null)));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00be A[Catch: all -> 0x00d6, TryCatch #2 {all -> 0x00d6, blocks: (B:22:0x00b7, B:24:0x00be, B:26:0x00c2, B:28:0x00c6, B:30:0x00ca, B:32:0x00ce, B:43:0x0135, B:34:0x00d9, B:36:0x00e4, B:38:0x00f8, B:40:0x010c, B:42:0x0121), top: B:21:0x00b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0121 A[Catch: all -> 0x00d6, TryCatch #2 {all -> 0x00d6, blocks: (B:22:0x00b7, B:24:0x00be, B:26:0x00c2, B:28:0x00c6, B:30:0x00ca, B:32:0x00ce, B:43:0x0135, B:34:0x00d9, B:36:0x00e4, B:38:0x00f8, B:40:0x010c, B:42:0x0121), top: B:21:0x00b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // k3.z1
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object N0(@m80.k java.lang.String r11, @m80.k j00.c<? super k3.b0> r12) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m7.b.N0(java.lang.String, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b6 A[Catch: all -> 0x00ce, TryCatch #2 {all -> 0x00ce, blocks: (B:22:0x00af, B:24:0x00b6, B:26:0x00ba, B:28:0x00be, B:30:0x00c2, B:32:0x00c6, B:43:0x012d, B:34:0x00d1, B:36:0x00dc, B:38:0x00f0, B:40:0x0104, B:42:0x0119), top: B:21:0x00af }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0119 A[Catch: all -> 0x00ce, TryCatch #2 {all -> 0x00ce, blocks: (B:22:0x00af, B:24:0x00b6, B:26:0x00ba, B:28:0x00be, B:30:0x00c2, B:32:0x00c6, B:43:0x012d, B:34:0x00d1, B:36:0x00dc, B:38:0x00f0, B:40:0x0104, B:42:0x0119), top: B:21:0x00af }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // k3.z1
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object P1(@m80.k j00.c<? super k3.g0> r12) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m7.b.P1(j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d0 A[Catch: all -> 0x00e8, TryCatch #1 {all -> 0x00e8, blocks: (B:23:0x00c9, B:25:0x00d0, B:27:0x00d4, B:29:0x00d8, B:31:0x00dc, B:33:0x00e0, B:44:0x0147, B:35:0x00eb, B:37:0x00f6, B:39:0x010a, B:41:0x011e, B:43:0x0133), top: B:22:0x00c9 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0133 A[Catch: all -> 0x00e8, TryCatch #1 {all -> 0x00e8, blocks: (B:23:0x00c9, B:25:0x00d0, B:27:0x00d4, B:29:0x00d8, B:31:0x00dc, B:33:0x00e0, B:44:0x0147, B:35:0x00eb, B:37:0x00f6, B:39:0x010a, B:41:0x011e, B:43:0x0133), top: B:22:0x00c9 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    @Override // k3.z1
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object Y0(@m80.k java.lang.String r12, @m80.k java.lang.String r13, int r14, @m80.k j00.c<? super yz.g2> r15) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m7.b.Y0(java.lang.String, java.lang.String, int, j00.c):java.lang.Object");
    }

    public final x8.h h() {
        return (x8.h) w7.f.b(new f(o0.d(x8.h.class), new l7.e(null, null, 3, null), (l7.c) j.f7801a.a().P().h().i(o0.d(l7.c.class), null, null)));
    }

    public final h v() {
        return (h) w7.f.b(new e(o0.d(h.class), new l7.e(null, null, 3, null), (l7.c) j.f7801a.a().P().h().i(o0.d(l7.c.class), null, null)));
    }
}
