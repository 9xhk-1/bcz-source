package n4;

import a00.h0;
import com.tencent.open.SocialConstants;
import ix.y0;
import k3.c1;
import k50.a0;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import oa0.r;
import yz.c0;
import yz.e0;
import yz.g2;
import zx.q;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r(binds = {c1.class})
@u0({"SMAP\nH5EnhanceServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 H5EnhanceServiceImpl.kt\ncom/baicizhan/app/biz/game/impl/h5enhance/H5EnhanceServiceImpl\n+ 2 TimeMeasurer.kt\ncom/baicizhan/app/biz/base/TimeMeasurerKt\n+ 3 BizCatch.kt\ncom/baicizhan/app/biz/base/BizCatchKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,98:1\n12#2,3:99\n15#2,10:120\n12#3,2:102\n14#3,10:110\n463#4:104\n413#4:105\n1252#5,4:106\n*S KotlinDebug\n*F\n+ 1 H5EnhanceServiceImpl.kt\ncom/baicizhan/app/biz/game/impl/h5enhance/H5EnhanceServiceImpl\n*L\n-1#1:99,3\n-1#1:120,10\n-1#1:102,2\n-1#1:110,10\n94#1:104\n94#1:105\n94#1:106,4\n*E\n"})
/* loaded from: classes3.dex */
public final class h implements c1 {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final r4.c f74402b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final p4.a f74403c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final t4.b f74404d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final c0 f74405e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.impl.h5enhance.H5EnhanceServiceImpl", f = "H5EnhanceServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {86}, m = SocialConstants.TYPE_REQUEST, n = {SocialConstants.TYPE_REQUEST, "tag$iv", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-H5EnhanceServiceImpl$request$2", "$i$f$bizCatch", "$i$a$-bizCatch-H5EnhanceServiceImpl$request$2$1"}, s = {"L$0", "L$1", "I$0", "J$0", "I$1", "I$2", "I$3"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f74406a;

        /* renamed from: b, reason: collision with root package name */
        public Object f74407b;

        /* renamed from: c, reason: collision with root package name */
        public int f74408c;

        /* renamed from: d, reason: collision with root package name */
        public int f74409d;

        /* renamed from: e, reason: collision with root package name */
        public int f74410e;

        /* renamed from: f, reason: collision with root package name */
        public int f74411f;

        /* renamed from: g, reason: collision with root package name */
        public long f74412g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f74413h;

        /* renamed from: j, reason: collision with root package name */
        public int f74415j;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f74413h = obj;
            this.f74415j |= Integer.MIN_VALUE;
            return h.this.P0(null, this);
        }
    }

    public h(@k r4.c aiStudyRouteProvider, @k p4.a resourceRouteProvider, @k t4.b webAppRouteProvider) {
        g0.p(aiStudyRouteProvider, "aiStudyRouteProvider");
        g0.p(resourceRouteProvider, "resourceRouteProvider");
        g0.p(webAppRouteProvider, "webAppRouteProvider");
        this.f74402b = aiStudyRouteProvider;
        this.f74403c = resourceRouteProvider;
        this.f74404d = webAppRouteProvider;
        this.f74405e = e0.c(new x00.a() { // from class: n4.e
            @Override // x00.a
            public final Object invoke() {
                q4.c p12;
                p12 = h.p1(h.this);
                return p12;
            }
        });
    }

    public static final g2 A2(k50.a aVar, ly.a install) {
        g0.p(install, "$this$install");
        io.ktor.serialization.kotlinx.json.e.e(install, aVar, null, 2, null);
        return g2.f100423a;
    }

    public static final g2 K2(my.c install) {
        g0.p(install, "$this$install");
        install.r();
        install.G(true);
        my.c.m(install, "*.baicizhan.com", h0.Q("bcz-local", "http", "https"), null, 4, null);
        install.F(true);
        install.H(true);
        y0 y0Var = y0.f63006a;
        install.h(y0Var.C());
        install.h(y0Var.t());
        install.h(y0Var.u());
        install.h(y0Var.L0());
        install.h(o4.b.f75714b);
        install.h(qo.c.P0);
        install.h("X-Mx-ReqToken");
        install.h("Keep-Alive");
        install.h(qo.c.f82394f1);
        install.h("If-Modified-Since");
        install.i(new x00.l() { // from class: n4.f
            @Override // x00.l
            public final Object invoke(Object obj) {
                boolean L2;
                L2 = h.L2((String) obj);
                return Boolean.valueOf(L2);
            }
        });
        return g2.f100423a;
    }

    public static final boolean L2(String it) {
        g0.p(it, "it");
        return true;
    }

    public static final g2 N1(zx.a addPlugin) {
        g0.p(addPlugin, "$this$addPlugin");
        q.j(addPlugin, oy.f.d(), new x00.l() { // from class: n4.a
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 T1;
                T1 = h.T1((oy.d) obj);
                return T1;
            }
        });
        final k50.a b11 = a0.b(null, new x00.l() { // from class: n4.b
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 u22;
                u22 = h.u2((k50.e) obj);
                return u22;
            }
        }, 1, null);
        q.j(addPlugin, ly.d.c(), new x00.l() { // from class: n4.c
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 A2;
                A2 = h.A2(k50.a.this, (ly.a) obj);
                return A2;
            }
        });
        q.j(addPlugin, ny.b.c(), new x00.l() { // from class: n4.d
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 K2;
                K2 = h.K2((my.c) obj);
                return K2;
            }
        });
        addPlugin.getAttributes().e(o4.b.d(), b11);
        return g2.f100423a;
    }

    public static final g2 T1(oy.d install) {
        g0.p(install, "$this$install");
        install.b(10);
        return g2.f100423a;
    }

    public static final q4.c p1(h hVar) {
        return new q4.f().c(new x00.l() { // from class: n4.g
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 N1;
                N1 = h.N1((zx.a) obj);
                return N1;
            }
        }).d(hVar.f74402b).d(hVar.f74403c).d(hVar.f74404d).f();
    }

    public static final g2 u2(k50.e Json) {
        g0.p(Json, "$this$Json");
        Json.M(true);
        Json.K(true);
        Json.J(true);
        return g2.f100423a;
    }

    public final q4.c M2() {
        return (q4.c) this.f74405e.getValue();
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a7 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:11:0x0031, B:12:0x0080, B:13:0x00a1, B:15:0x00a7, B:19:0x00c4, B:22:0x00c8), top: B:10:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0115 A[Catch: all -> 0x012d, TryCatch #2 {all -> 0x012d, blocks: (B:32:0x010e, B:34:0x0115, B:36:0x0119, B:38:0x011d, B:40:0x0121, B:42:0x0125, B:53:0x018c, B:44:0x0130, B:46:0x013b, B:48:0x014f, B:50:0x0163, B:52:0x0178), top: B:31:0x010e }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0178 A[Catch: all -> 0x012d, TryCatch #2 {all -> 0x012d, blocks: (B:32:0x010e, B:34:0x0115, B:36:0x0119, B:38:0x011d, B:40:0x0121, B:42:0x0125, B:53:0x018c, B:44:0x0130, B:46:0x013b, B:48:0x014f, B:50:0x0163, B:52:0x0178), top: B:31:0x010e }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // k3.c1
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object P0(@m80.k k3.a1 r12, @m80.k j00.c<? super k3.b1> r13) throws com.baicizhan.app.api.service.BizException, java.util.concurrent.CancellationException {
        /*
            Method dump skipped, instructions count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.h.P0(k3.a1, j00.c):java.lang.Object");
    }
}
