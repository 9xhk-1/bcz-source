package e7;

import c4.j;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.microsoft.thrifty.service.a;
import j8.g;
import k3.f2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.x0;
import l00.d;
import l7.e;
import l7.i0;
import l7.p;
import m80.k;
import m80.l;
import oa0.r;
import ws.i;
import y7.d;
import y7.f;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r(binds = {f2.class})
@u0({"SMAP\nQrcodeServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QrcodeServiceImpl.kt\ncom/baicizhan/app/biz/qrcode/QrcodeServiceImpl\n+ 2 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService\n+ 3 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt\n+ 4 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService$thrift$1\n+ 5 Koin.kt\norg/koin/core/Koin\n+ 6 Scope.kt\norg/koin/core/scope/Scope\n+ 7 TimeMeasurer.kt\ncom/baicizhan/app/biz/base/TimeMeasurerKt\n+ 8 BizCatch.kt\ncom/baicizhan/app/biz/base/BizCatchKt\n*L\n1#1,25:1\n6#2:26\n64#3,2:27\n66#3:30\n67#3,2:36\n6#4:29\n124#5,4:31\n142#6:35\n12#7,3:38\n15#7,10:53\n12#8,12:41\n*S KotlinDebug\n*F\n+ 1 QrcodeServiceImpl.kt\ncom/baicizhan/app/biz/qrcode/QrcodeServiceImpl\n*L\n16#1:26\n16#1:27,2\n16#1:30\n16#1:36,2\n16#1:29\n16#1:31,4\n16#1:35\n-1#1:38,3\n-1#1:53,10\n-1#1:41,12\n*E\n"})
/* loaded from: classes3.dex */
public final class c implements f2 {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final p f49495a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @d(c = "com.baicizhan.app.biz.qrcode.QrcodeServiceImpl", f = "QrcodeServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {21}, m = CommonConstant.KEY_QR_CODE, n = {"code", "tag$iv", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-QrcodeServiceImpl$qrCode$2", "$i$f$bizCatch", "$i$a$-bizCatch-QrcodeServiceImpl$qrCode$2$1"}, s = {"L$0", "L$1", "I$0", "J$0", "I$1", "I$2", "I$3"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f49496a;

        /* renamed from: b, reason: collision with root package name */
        public Object f49497b;

        /* renamed from: c, reason: collision with root package name */
        public int f49498c;

        /* renamed from: d, reason: collision with root package name */
        public int f49499d;

        /* renamed from: e, reason: collision with root package name */
        public int f49500e;

        /* renamed from: f, reason: collision with root package name */
        public int f49501f;

        /* renamed from: g, reason: collision with root package name */
        public long f49502g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f49503h;

        /* renamed from: j, reason: collision with root package name */
        public int f49505j;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f49503h = obj;
            this.f49505j |= Integer.MIN_VALUE;
            return c.this.a(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class b implements x00.l<w7.d<g>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f49506a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e f49507b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f49508c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        public static final class a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ e f49509a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f49510b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f49511c;

            public a(e eVar, l7.c cVar, h10.d dVar) {
                this.f49509a = eVar;
                this.f49510b = cVar;
                this.f49511c = dVar;
            }

            public final void a(d.a randomRetry) {
                g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f49509a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f49509a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f49510b.b(this.f49511c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public b(h10.d dVar, e eVar, l7.c cVar) {
            this.f49506a = dVar;
            this.f49507b = eVar;
            this.f49508c = cVar;
        }

        public final void a(w7.d<g> thriftBuilder) {
            g0.p(thriftBuilder, "$this$thriftBuilder");
            f.a(thriftBuilder, new a(this.f49507b, this.f49508c, this.f49506a));
            x00.p<i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f49506a);
            g0.n(pVar, "null cannot be cast to non-null type kotlin.Function2<com.microsoft.thrifty.protocol.Protocol, com.microsoft.thrifty.service.AsyncClientBase.Listener, T of com.baicizhan.app.biz.thrift.ThriftServiceImplKt.thriftImpl>");
            thriftBuilder.f((x00.p) x0.q(pVar, 2));
            thriftBuilder.g(i0.a.b.f70581a);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(w7.d<g> dVar) {
            a(dVar);
            return g2.f100423a;
        }
    }

    public c(@k p thrift) {
        g0.p(thrift, "thrift");
        this.f49495a = thrift;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00be A[Catch: all -> 0x00d6, TryCatch #2 {all -> 0x00d6, blocks: (B:22:0x00b7, B:24:0x00be, B:26:0x00c2, B:28:0x00c6, B:30:0x00ca, B:32:0x00ce, B:43:0x0135, B:34:0x00d9, B:36:0x00e4, B:38:0x00f8, B:40:0x010c, B:42:0x0121), top: B:21:0x00b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0121 A[Catch: all -> 0x00d6, TryCatch #2 {all -> 0x00d6, blocks: (B:22:0x00b7, B:24:0x00be, B:26:0x00c2, B:28:0x00c6, B:30:0x00ca, B:32:0x00ce, B:43:0x0135, B:34:0x00d9, B:36:0x00e4, B:38:0x00f8, B:40:0x010c, B:42:0x0121), top: B:21:0x00b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // k3.f2
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@m80.k java.lang.String r11, @m80.k j00.c<? super k3.e2> r12) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.c.a(java.lang.String, j00.c):java.lang.Object");
    }

    public final g b() {
        return (g) w7.f.b(new b(o0.d(g.class), new e(null, null, 3, null), (l7.c) j.f7801a.a().P().h().i(o0.d(l7.c.class), null, null)));
    }
}
