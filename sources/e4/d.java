package e4;

import c4.j;
import com.microsoft.thrifty.service.a;
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
import yz.c0;
import yz.e0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r(binds = {g.class})
@u0({"SMAP\nMyTabDeviceRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyTabDeviceRepo.kt\ncom/baicizhan/app/biz/device/DeviceRepoImpl\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService\n+ 4 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt\n+ 5 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService$thrift$1\n+ 6 Koin.kt\norg/koin/core/Koin\n+ 7 Scope.kt\norg/koin/core/scope/Scope\n+ 8 TimeMeasurer.kt\ncom/baicizhan/app/biz/base/TimeMeasurerKt\n+ 9 BizCatch.kt\ncom/baicizhan/app/biz/base/BizCatchKt\n+ 10 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,63:1\n58#2,6:64\n6#3:70\n64#4,2:71\n66#4:74\n67#4,2:80\n6#5:73\n124#6,4:75\n142#7:79\n12#8,3:82\n15#8,10:109\n12#9,2:85\n14#9,10:99\n1563#10:87\n1634#10,3:88\n1669#10,8:91\n*S KotlinDebug\n*F\n+ 1 MyTabDeviceRepo.kt\ncom/baicizhan/app/biz/device/DeviceRepoImpl\n*L\n27#1:64,6\n26#1:70\n26#1:71,2\n26#1:74\n26#1:80,2\n26#1:73\n26#1:75,4\n26#1:79\n-1#1:82,3\n-1#1:109,10\n-1#1:85,2\n-1#1:99,10\n33#1:87\n33#1:88,3\n48#1:91,8\n*E\n"})
/* loaded from: classes3.dex */
public final class d implements g, j {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final p f48712b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final c0 f48713c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.device.DeviceRepoImpl", f = "MyTabDeviceRepo.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {56}, m = "deviceRead", n = {"tag$iv", "deviceType", "time", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-DeviceRepoImpl$deviceRead$2", "$i$f$bizCatch", "$i$a$-bizCatch-DeviceRepoImpl$deviceRead$2$1"}, s = {"L$0", "I$0", "I$1", "I$2", "J$0", "I$3", "I$4", "I$5"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f48714a;

        /* renamed from: b, reason: collision with root package name */
        public int f48715b;

        /* renamed from: c, reason: collision with root package name */
        public int f48716c;

        /* renamed from: d, reason: collision with root package name */
        public int f48717d;

        /* renamed from: e, reason: collision with root package name */
        public int f48718e;

        /* renamed from: f, reason: collision with root package name */
        public int f48719f;

        /* renamed from: g, reason: collision with root package name */
        public Object f48720g;

        /* renamed from: h, reason: collision with root package name */
        public long f48721h;

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f48722i;

        /* renamed from: k, reason: collision with root package name */
        public int f48724k;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f48722i = obj;
            this.f48724k |= Integer.MIN_VALUE;
            return d.this.a(0, 0, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.device.DeviceRepoImpl", f = "MyTabDeviceRepo.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {33, 44}, m = "getMyDevices", n = {"tag$iv", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-DeviceRepoImpl$getMyDevices$2", "$i$f$bizCatch", "$i$a$-bizCatch-DeviceRepoImpl$getMyDevices$2$1", "tag$iv", "$this$map$iv", "$this$mapTo$iv$iv", "destination$iv$iv", "item$iv$iv", "device", "it", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-DeviceRepoImpl$getMyDevices$2", "$i$f$bizCatch", "$i$a$-bizCatch-DeviceRepoImpl$getMyDevices$2$1", "$i$f$map", "$i$f$mapTo", "$i$a$-map-DeviceRepoImpl$getMyDevices$2$1$1", "superTime", "$i$a$-takeIf-DeviceRepoImpl$getMyDevices$2$1$1$1"}, s = {"L$0", "I$0", "J$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$2", "L$3", "L$5", "L$6", "L$9", "I$0", "J$0", "I$1", "I$2", "I$3", "I$4", "I$5", "I$6", "I$7", "I$9"}, v = 1)
    public static final class b extends ContinuationImpl {
        public int B;

        /* renamed from: a, reason: collision with root package name */
        public Object f48725a;

        /* renamed from: b, reason: collision with root package name */
        public Object f48726b;

        /* renamed from: c, reason: collision with root package name */
        public Object f48727c;

        /* renamed from: d, reason: collision with root package name */
        public Object f48728d;

        /* renamed from: e, reason: collision with root package name */
        public Object f48729e;

        /* renamed from: f, reason: collision with root package name */
        public Object f48730f;

        /* renamed from: g, reason: collision with root package name */
        public Object f48731g;

        /* renamed from: h, reason: collision with root package name */
        public Object f48732h;

        /* renamed from: i, reason: collision with root package name */
        public Object f48733i;

        /* renamed from: j, reason: collision with root package name */
        public Object f48734j;

        /* renamed from: k, reason: collision with root package name */
        public Object f48735k;

        /* renamed from: l, reason: collision with root package name */
        public Object f48736l;

        /* renamed from: m, reason: collision with root package name */
        public Object f48737m;

        /* renamed from: n, reason: collision with root package name */
        public int f48738n;

        /* renamed from: o, reason: collision with root package name */
        public int f48739o;

        /* renamed from: p, reason: collision with root package name */
        public int f48740p;

        /* renamed from: q, reason: collision with root package name */
        public int f48741q;

        /* renamed from: r, reason: collision with root package name */
        public int f48742r;

        /* renamed from: s, reason: collision with root package name */
        public int f48743s;

        /* renamed from: t, reason: collision with root package name */
        public int f48744t;

        /* renamed from: u, reason: collision with root package name */
        public int f48745u;

        /* renamed from: v, reason: collision with root package name */
        public int f48746v;

        /* renamed from: w, reason: collision with root package name */
        public int f48747w;

        /* renamed from: x, reason: collision with root package name */
        public int f48748x;

        /* renamed from: y, reason: collision with root package name */
        public long f48749y;

        /* renamed from: z, reason: collision with root package name */
        public /* synthetic */ Object f48750z;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f48750z = obj;
            this.B |= Integer.MIN_VALUE;
            return d.this.b(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nKoinComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KoinComponent.kt\norg/koin/core/component/KoinComponentKt$inject$1\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n+ 4 Koin.kt\norg/koin/core/Koin\n*L\n1#1,64:1\n45#2,2:65\n48#2:68\n142#3:67\n127#4:69\n*S KotlinDebug\n*F\n+ 1 KoinComponent.kt\norg/koin/core/component/KoinComponentKt$inject$1\n*L\n63#1:65,2\n63#1:68\n63#1:67\n63#1:69\n*E\n"})
    public static final class c implements x00.a<com.baicizhan.app.preferences.g> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ pa0.a f48751a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ za0.a f48752b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x00.a f48753c;

        public c(pa0.a aVar, za0.a aVar2, x00.a aVar3) {
            this.f48751a = aVar;
            this.f48752b = aVar2;
            this.f48753c = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [com.baicizhan.app.preferences.g, java.lang.Object] */
        @Override // x00.a
        public final com.baicizhan.app.preferences.g invoke() {
            pa0.a aVar = this.f48751a;
            return (aVar instanceof pa0.c ? ((pa0.c) aVar).getScope() : aVar.r().P().h()).i(o0.d(com.baicizhan.app.preferences.g.class), this.f48752b, this.f48753c);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    /* renamed from: e4.d$d, reason: collision with other inner class name */
    public static final class C0587d implements x00.l<w7.d<y8.h>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f48754a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f48755b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f48756c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        /* renamed from: e4.d$d$a */
        public static final class a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f48757a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f48758b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f48759c;

            public a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f48757a = eVar;
                this.f48758b = cVar;
                this.f48759c = dVar;
            }

            public final void a(d.a randomRetry) {
                g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f48757a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f48757a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f48758b.b(this.f48759c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public C0587d(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f48754a = dVar;
            this.f48755b = eVar;
            this.f48756c = cVar;
        }

        public final void a(w7.d<y8.h> thriftBuilder) {
            g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new a(this.f48755b, this.f48756c, this.f48754a));
            x00.p<i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f48754a);
            g0.n(pVar, "null cannot be cast to non-null type kotlin.Function2<com.microsoft.thrifty.protocol.Protocol, com.microsoft.thrifty.service.AsyncClientBase.Listener, T of com.baicizhan.app.biz.thrift.ThriftServiceImplKt.thriftImpl>");
            thriftBuilder.f((x00.p) x0.q(pVar, 2));
            thriftBuilder.g(i0.a.b.f70581a);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(w7.d<y8.h> dVar) {
            a(dVar);
            return g2.f100423a;
        }
    }

    public d(@k p thrift) {
        g0.p(thrift, "thrift");
        this.f48712b = thrift;
        this.f48713c = e0.b(jb0.c.f64013a.b(), new c(this, null, new x00.a() { // from class: e4.c
            @Override // x00.a
            public final Object invoke() {
                ya0.a f11;
                f11 = d.f();
                return f11;
            }
        }));
    }

    private final com.baicizhan.app.preferences.g d() {
        return (com.baicizhan.app.preferences.g) this.f48713c.getValue();
    }

    public static final ya0.a f() {
        return ya0.b.d(h.f48823a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c6 A[Catch: all -> 0x00de, TryCatch #2 {all -> 0x00de, blocks: (B:22:0x00bf, B:24:0x00c6, B:26:0x00ca, B:28:0x00ce, B:30:0x00d2, B:32:0x00d6, B:43:0x013d, B:34:0x00e1, B:36:0x00ec, B:38:0x0100, B:40:0x0114, B:42:0x0129), top: B:21:0x00bf }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0129 A[Catch: all -> 0x00de, TryCatch #2 {all -> 0x00de, blocks: (B:22:0x00bf, B:24:0x00c6, B:26:0x00ca, B:28:0x00ce, B:30:0x00d2, B:32:0x00d6, B:43:0x013d, B:34:0x00e1, B:36:0x00ec, B:38:0x0100, B:40:0x0114, B:42:0x0129), top: B:21:0x00bf }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // e4.g
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(int r11, int r12, @m80.k j00.c<? super yz.g2> r13) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.d.a(int, int, j00.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|(5:(1:(7:10|11|12|13|14|15|(10:17|(1:19)(1:97)|20|21|22|23|24|25|26|(4:28|(1:30)(1:44)|31|(8:43|21|22|23|24|25|26|(6:45|(4:48|(3:50|51|52)(1:54)|53|46)|55|56|(1:58)|59)(0))(1:(3:34|35|(1:38)(4:37|14|15|(12:98|41|42|(0)(0)|20|21|22|23|24|25|26|(0)(0))(0)))(12:40|41|42|(0)(0)|20|21|22|23|24|25|26|(0)(0))))(0))(0))(2:105|106))(4:107|108|109|110)|104|63|64|(2:66|(2:68|(2:70|(2:72|(2:74|75)(2:76|77))(2:78|79))(2:80|81))(2:82|83))(2:84|85))(4:120|121|122|(2:124|125)(1:126))|111|112|113|25|26|(0)(0)))|130|6|(0)(0)|111|112|113|25|26|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x030e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x030f, code lost:
    
        r5 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0147, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0148, code lost:
    
        r5 = r8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x012c A[Catch: all -> 0x0147, TryCatch #4 {all -> 0x0147, blocks: (B:26:0x0126, B:28:0x012c, B:30:0x013a, B:31:0x014e, B:34:0x0164, B:45:0x02a4, B:46:0x02b6, B:48:0x02bc, B:51:0x02d1), top: B:25:0x0126 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02a4 A[Catch: all -> 0x0147, TRY_ENTER, TryCatch #4 {all -> 0x0147, blocks: (B:26:0x0126, B:28:0x012c, B:30:0x013a, B:31:0x014e, B:34:0x0164, B:45:0x02a4, B:46:0x02b6, B:48:0x02bc, B:51:0x02d1), top: B:25:0x0126 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x031b A[Catch: all -> 0x0333, TryCatch #3 {all -> 0x0333, blocks: (B:64:0x0314, B:66:0x031b, B:68:0x031f, B:70:0x0323, B:72:0x0327, B:74:0x032b, B:85:0x0391, B:76:0x0335, B:78:0x0340, B:80:0x0354, B:82:0x0368, B:84:0x037d), top: B:63:0x0314 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x037d A[Catch: all -> 0x0333, TryCatch #3 {all -> 0x0333, blocks: (B:64:0x0314, B:66:0x031b, B:68:0x031f, B:70:0x0323, B:72:0x0327, B:74:0x032b, B:85:0x0391, B:76:0x0335, B:78:0x0340, B:80:0x0354, B:82:0x0368, B:84:0x037d), top: B:63:0x0314 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x020c  */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x01ec -> B:14:0x01fd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0236 -> B:18:0x023f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0260 -> B:21:0x0252). Please report as a decompilation issue!!! */
    @Override // e4.g
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(@m80.k j00.c<? super java.util.List<k3.v1>> r30) {
        /*
            Method dump skipped, instructions count: 968
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.d.b(j00.c):java.lang.Object");
    }

    public final y8.h e() {
        return (y8.h) w7.f.b(new C0587d(o0.d(y8.h.class), new l7.e(null, null, 3, null), (l7.c) j.f7801a.a().P().h().i(o0.d(l7.c.class), null, null)));
    }

    @Override // c4.j, pa0.a
    @k
    public /* bridge */ na0.a r() {
        return super.r();
    }
}
