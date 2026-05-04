package pg;

import android.graphics.Color;
import android.text.TextUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.client.business.util.BczJson;
import com.baicizhan.client.business.util.PathUtil;
import com.baicizhan.main.home.plan.data.DataType;
import com.baicizhan.main.home.plan.data.WordBanner;
import com.baicizhan.online.advertise_api.AdvertiseApiService;
import com.baicizhan.online.advertise_api.MainViewTopBannerAdv;
import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import pg.d0;
import ub.a;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@kotlin.jvm.internal.u0({"SMAP\nBannerModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BannerModule.kt\ncom/baicizhan/main/home/plan/module/BannerModule\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,210:1\n1#2:211\n1869#3,2:212\n1869#3,2:214\n*S KotlinDebug\n*F\n+ 1 BannerModule.kt\ncom/baicizhan/main/home/plan/module/BannerModule\n*L\n69#1:212,2\n115#1:214,2\n*E\n"})
/* loaded from: classes4.dex */
public final class d0 {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final String f80439b = "BannerModule";

    /* renamed from: c, reason: collision with root package name */
    public static final long f80440c = 11534336;

    /* renamed from: d, reason: collision with root package name */
    public static final int f80441d = 100;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final String f80442e = "res/top_ad";

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final String f80443f = "TopAdModule";

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final String f80444g = "key_top_ad_items";

    /* renamed from: k, reason: collision with root package name */
    @m80.l
    public static qb0.h f80448k;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final d0 f80438a = new d0();

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public static final yz.c0 f80445h = yz.e0.c(new x00.a() { // from class: pg.x
        @Override // x00.a
        public final Object invoke() {
            String A;
            A = d0.A();
            return A;
        }
    });

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public static final yz.c0 f80446i = yz.e0.c(new x00.a() { // from class: pg.y
        @Override // x00.a
        public final Object invoke() {
            vb.a i02;
            i02 = d0.i0();
            return i02;
        }
    });

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public static final yz.c0 f80447j = yz.e0.c(new x00.a() { // from class: pg.z
        @Override // x00.a
        public final Object invoke() {
            nc.a M;
            M = d0.M();
            return M;
        }
    });

    /* renamed from: l, reason: collision with root package name */
    public static final int f80449l = 8;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f80450a;

        static {
            int[] iArr = new int[DataType.values().length];
            try {
                iArr[DataType.LOTTERY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DataType.PNG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f80450a = iArr;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class b {

        /* renamed from: i, reason: collision with root package name */
        public static final int f80451i = 8;

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public String f80452a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f80453b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public String f80454c;

        /* renamed from: d, reason: collision with root package name */
        @m80.k
        public String f80455d;

        /* renamed from: e, reason: collision with root package name */
        @m80.k
        public DataType f80456e;

        /* renamed from: f, reason: collision with root package name */
        public long f80457f;

        /* renamed from: g, reason: collision with root package name */
        public long f80458g;

        /* renamed from: h, reason: collision with root package name */
        @m80.l
        public String f80459h;

        public b(@m80.k String id2, boolean z11, @m80.k String imageUrl, @m80.k String imageGradientColor, @m80.k DataType type, long j11, long j12, @m80.l String str) {
            kotlin.jvm.internal.g0.p(id2, "id");
            kotlin.jvm.internal.g0.p(imageUrl, "imageUrl");
            kotlin.jvm.internal.g0.p(imageGradientColor, "imageGradientColor");
            kotlin.jvm.internal.g0.p(type, "type");
            this.f80452a = id2;
            this.f80453b = z11;
            this.f80454c = imageUrl;
            this.f80455d = imageGradientColor;
            this.f80456e = type;
            this.f80457f = j11;
            this.f80458g = j12;
            this.f80459h = str;
        }

        public final long a() {
            return this.f80458g;
        }

        @m80.k
        public final String b() {
            return this.f80452a;
        }

        @m80.k
        public final String c() {
            return this.f80455d;
        }

        @m80.k
        public final String d() {
            return this.f80454c;
        }

        @m80.l
        public final String e() {
            return this.f80459h;
        }

        public final long f() {
            return this.f80457f;
        }

        @m80.k
        public final DataType g() {
            return this.f80456e;
        }

        public final boolean h() {
            return this.f80453b;
        }

        public final void i(boolean z11) {
            this.f80453b = z11;
        }

        public final void j(long j11) {
            this.f80458g = j11;
        }

        public final void k(@m80.k String str) {
            kotlin.jvm.internal.g0.p(str, "<set-?>");
            this.f80452a = str;
        }

        public final void l(@m80.k String str) {
            kotlin.jvm.internal.g0.p(str, "<set-?>");
            this.f80455d = str;
        }

        public final void m(@m80.k String str) {
            kotlin.jvm.internal.g0.p(str, "<set-?>");
            this.f80454c = str;
        }

        public final void n(@m80.l String str) {
            this.f80459h = str;
        }

        public final void o(long j11) {
            this.f80457f = j11;
        }

        public final void p(@m80.k DataType dataType) {
            kotlin.jvm.internal.g0.p(dataType, "<set-?>");
            this.f80456e = dataType;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends bp.a<List<? extends b>> {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d extends bp.a<List<? extends b>> {
    }

    public static final String A() {
        return PathUtil.getBaicizhanFile("res/top_ad/download_cache").getAbsolutePath();
    }

    public static final List B(String str) {
        try {
            Object readFromJson = BczJson.readFromJson(str, new d().getType());
            if (readFromJson instanceof List) {
                return (List) readFromJson;
            }
            return null;
        } catch (Throwable th2) {
            qb.c.c(f80439b, "", th2);
            return null;
        }
    }

    public static final List C(x00.l lVar, Object obj) {
        return (List) lVar.invoke(obj);
    }

    public static final WordBanner G(List list) {
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            d0 d0Var = f80438a;
            if (d0Var.K(bVar) && d0Var.J().g(bVar.d())) {
                return new WordBanner(bVar.b(), bVar.h(), d0Var.J().j(bVar.d()).getAbsolutePath(), Color.parseColor("#" + bVar.c()), bVar.g(), bVar.e());
            }
        }
        return null;
    }

    public static final WordBanner H(x00.l lVar, Object obj) {
        return (WordBanner) lVar.invoke(obj);
    }

    public static final nc.a M() {
        return nc.b.c(f80443f);
    }

    public static final rx.c O(AdvertiseApiService.Client client) {
        return rx.c.u2(client.get_main_view_top_banner_advs());
    }

    public static final rx.c P(x00.l lVar, Object obj) {
        return (rx.c) lVar.invoke(obj);
    }

    public static final rx.c Q(List list) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                d0 d0Var = f80438a;
                kotlin.jvm.internal.g0.m(bVar);
                if (d0Var.K(bVar)) {
                    list.remove(bVar);
                    d0Var.c0(list);
                    return rx.c.M2(bVar);
                }
            }
        }
        return rx.c.M2(null);
    }

    public static final rx.c R(x00.l lVar, Object obj) {
        return (rx.c) lVar.invoke(obj);
    }

    public static final WordBanner S(b bVar) {
        if (bVar != null) {
            d0 d0Var = f80438a;
            if (!d0Var.j0(bVar)) {
                bVar = null;
            }
            if (bVar != null) {
                return new WordBanner(bVar.b(), bVar.h(), d0Var.J().j(bVar.d()).getAbsolutePath(), Color.parseColor("#" + bVar.c()), bVar.g(), bVar.e());
            }
        }
        return null;
    }

    public static final WordBanner T(x00.l lVar, Object obj) {
        return (WordBanner) lVar.invoke(obj);
    }

    public static final Boolean U(MainViewTopBannerAdv mainViewTopBannerAdv) {
        d0 d0Var = f80438a;
        String img_gradient_color = mainViewTopBannerAdv.img_gradient_color;
        kotlin.jvm.internal.g0.o(img_gradient_color, "img_gradient_color");
        return Boolean.valueOf(d0Var.L(img_gradient_color));
    }

    public static final Boolean V(x00.l lVar, Object obj) {
        return (Boolean) lVar.invoke(obj);
    }

    public static final b W(MainViewTopBannerAdv mainViewTopBannerAdv) {
        String aid = mainViewTopBannerAdv.aid;
        kotlin.jvm.internal.g0.o(aid, "aid");
        boolean z11 = mainViewTopBannerAdv.isDark;
        String img_url = mainViewTopBannerAdv.img_url;
        kotlin.jvm.internal.g0.o(img_url, "img_url");
        String img_gradient_color = mainViewTopBannerAdv.img_gradient_color;
        kotlin.jvm.internal.g0.o(img_gradient_color, "img_gradient_color");
        return new b(aid, z11, img_url, img_gradient_color, mainViewTopBannerAdv.img_type == 1 ? DataType.LOTTERY : DataType.PNG, mainViewTopBannerAdv.start_time, mainViewTopBannerAdv.end_time, mainViewTopBannerAdv.link);
    }

    public static final b X(x00.l lVar, Object obj) {
        return (b) lVar.invoke(obj);
    }

    public static final rx.c Y(Throwable th2) {
        qb.c.h(f80439b, "error resume Local", th2);
        return f80438a.I();
    }

    public static final rx.c Z(x00.l lVar, Object obj) {
        return (rx.c) lVar.invoke(obj);
    }

    public static final List a0(List list) {
        if (list == null) {
            return null;
        }
        f80438a.E().p(f80444g, BczJson.writeToJson(list, new c().getType()));
        return list;
    }

    public static final List b0(x00.l lVar, Object obj) {
        return (List) lVar.invoke(obj);
    }

    public static final Boolean d0(b bVar) {
        d0 d0Var = f80438a;
        kotlin.jvm.internal.g0.m(bVar);
        return Boolean.valueOf(d0Var.j0(bVar));
    }

    public static final Boolean e0(x00.l lVar, Object obj) {
        return (Boolean) lVar.invoke(obj);
    }

    public static final g2 f0(Boolean bool) {
        return g2.f100423a;
    }

    public static final void g0(x00.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final void h0(Throwable th2) {
        qb.c.c(f80439b, "", th2);
    }

    public static final vb.a i0() {
        vb.a aVar = new vb.a(PathUtil.getBaicizhanFile(f80442e).getAbsolutePath(), f80440c, 100);
        aVar.q(true);
        return aVar;
    }

    public final String D() {
        return (String) f80445h.getValue();
    }

    @m80.k
    public final nc.a E() {
        Object value = f80447j.getValue();
        kotlin.jvm.internal.g0.o(value, "getValue(...)");
        return (nc.a) value;
    }

    @m80.k
    public final rx.c<WordBanner> F() {
        rx.c<List<b>> I = I();
        final x00.l lVar = new x00.l() { // from class: pg.v
            @Override // x00.l
            public final Object invoke(Object obj) {
                WordBanner G;
                G = d0.G((List) obj);
                return G;
            }
        };
        rx.c c32 = I.c3(new wb0.p() { // from class: pg.w
            @Override // wb0.p
            public final Object call(Object obj) {
                WordBanner H;
                H = d0.H(x00.l.this, obj);
                return H;
            }
        });
        kotlin.jvm.internal.g0.o(c32, "map(...)");
        return c32;
    }

    public final rx.c<List<b>> I() {
        rx.c w52 = rx.c.M2(E().getString(f80444g, "")).w5(bc0.c.a());
        final x00.l lVar = new x00.l() { // from class: pg.d
            @Override // x00.l
            public final Object invoke(Object obj) {
                List B;
                B = d0.B((String) obj);
                return B;
            }
        };
        rx.c<List<b>> c32 = w52.c3(new wb0.p() { // from class: pg.o
            @Override // wb0.p
            public final Object call(Object obj) {
                List C;
                C = d0.C(x00.l.this, obj);
                return C;
            }
        });
        kotlin.jvm.internal.g0.o(c32, "map(...)");
        return c32;
    }

    public final vb.a J() {
        return (vb.a) f80446i.getValue();
    }

    public final boolean K(b bVar) {
        long currentTimeMillis = System.currentTimeMillis();
        return currentTimeMillis <= bVar.a() && bVar.f() <= currentTimeMillis && !TextUtils.isEmpty(bVar.d()) && L(bVar.c());
    }

    public final boolean L(String str) {
        try {
            Color.parseColor("#" + str);
            return true;
        } catch (Exception e11) {
            qb.c.c(f80439b, "color " + str, e11);
            return false;
        }
    }

    @m80.k
    public final rx.c<WordBanner> N() {
        rx.c w52 = com.baicizhan.client.business.thrift.p.a(new com.baicizhan.client.business.thrift.l("/rpc/advertise")).w5(bc0.c.e());
        final x00.l lVar = new x00.l() { // from class: pg.a0
            @Override // x00.l
            public final Object invoke(Object obj) {
                rx.c O;
                O = d0.O((AdvertiseApiService.Client) obj);
                return O;
            }
        };
        rx.c b22 = w52.b2(new wb0.p() { // from class: pg.g
            @Override // wb0.p
            public final Object call(Object obj) {
                rx.c P;
                P = d0.P(x00.l.this, obj);
                return P;
            }
        });
        final x00.l lVar2 = new x00.l() { // from class: pg.h
            @Override // x00.l
            public final Object invoke(Object obj) {
                Boolean U;
                U = d0.U((MainViewTopBannerAdv) obj);
                return U;
            }
        };
        rx.c V1 = b22.V1(new wb0.p() { // from class: pg.i
            @Override // wb0.p
            public final Object call(Object obj) {
                Boolean V;
                V = d0.V(x00.l.this, obj);
                return V;
            }
        });
        final x00.l lVar3 = new x00.l() { // from class: pg.j
            @Override // x00.l
            public final Object invoke(Object obj) {
                d0.b W;
                W = d0.W((MainViewTopBannerAdv) obj);
                return W;
            }
        };
        rx.c v62 = V1.c3(new wb0.p() { // from class: pg.k
            @Override // wb0.p
            public final Object call(Object obj) {
                d0.b X;
                X = d0.X(x00.l.this, obj);
                return X;
            }
        }).v6();
        final x00.l lVar4 = new x00.l() { // from class: pg.l
            @Override // x00.l
            public final Object invoke(Object obj) {
                rx.c Y;
                Y = d0.Y((Throwable) obj);
                return Y;
            }
        };
        rx.c V3 = v62.V3(new wb0.p() { // from class: pg.m
            @Override // wb0.p
            public final Object call(Object obj) {
                rx.c Z;
                Z = d0.Z(x00.l.this, obj);
                return Z;
            }
        });
        final x00.l lVar5 = new x00.l() { // from class: pg.n
            @Override // x00.l
            public final Object invoke(Object obj) {
                List a02;
                a02 = d0.a0((List) obj);
                return a02;
            }
        };
        rx.c c32 = V3.c3(new wb0.p() { // from class: pg.p
            @Override // wb0.p
            public final Object call(Object obj) {
                List b02;
                b02 = d0.b0(x00.l.this, obj);
                return b02;
            }
        });
        final x00.l lVar6 = new x00.l() { // from class: pg.b0
            @Override // x00.l
            public final Object invoke(Object obj) {
                rx.c Q;
                Q = d0.Q((List) obj);
                return Q;
            }
        };
        rx.c b23 = c32.b2(new wb0.p() { // from class: pg.c0
            @Override // wb0.p
            public final Object call(Object obj) {
                rx.c R;
                R = d0.R(x00.l.this, obj);
                return R;
            }
        });
        final x00.l lVar7 = new x00.l() { // from class: pg.e
            @Override // x00.l
            public final Object invoke(Object obj) {
                WordBanner S;
                S = d0.S((d0.b) obj);
                return S;
            }
        };
        rx.c<WordBanner> c33 = b23.c3(new wb0.p() { // from class: pg.f
            @Override // wb0.p
            public final Object call(Object obj) {
                WordBanner T;
                T = d0.T(x00.l.this, obj);
                return T;
            }
        });
        kotlin.jvm.internal.g0.o(c33, "map(...)");
        return c33;
    }

    public final void c0(List<b> list) {
        qb0.h hVar = f80448k;
        if (hVar != null && !hVar.isUnsubscribed()) {
            hVar.unsubscribe();
        }
        rx.c w52 = rx.c.u2(list).w5(bc0.c.e());
        final x00.l lVar = new x00.l() { // from class: pg.q
            @Override // x00.l
            public final Object invoke(Object obj) {
                Boolean d02;
                d02 = d0.d0((d0.b) obj);
                return d02;
            }
        };
        rx.c c32 = w52.c3(new wb0.p() { // from class: pg.r
            @Override // wb0.p
            public final Object call(Object obj) {
                Boolean e02;
                e02 = d0.e0(x00.l.this, obj);
                return e02;
            }
        });
        final x00.l lVar2 = new x00.l() { // from class: pg.s
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 f02;
                f02 = d0.f0((Boolean) obj);
                return f02;
            }
        };
        f80448k = c32.u5(new wb0.b() { // from class: pg.t
            @Override // wb0.b
            public final void call(Object obj) {
                d0.g0(x00.l.this, obj);
            }
        }, new wb0.b() { // from class: pg.u
            @Override // wb0.b
            public final void call(Object obj) {
                d0.h0((Throwable) obj);
            }
        });
    }

    public final boolean j0(b bVar) {
        Throwable a11;
        qb.c.i(f80439b, "download %s", bVar.d());
        if (J().g(bVar.d())) {
            qb.c.i(f80439b, "exists %s", bVar.d());
            return true;
        }
        try {
            boolean I = new a.b().j(bVar.d()).f(1000).i(3000).h(1).g(D() + "/" + bVar.d().hashCode()).a().I();
            Boolean valueOf = Boolean.valueOf(I);
            if (!I) {
                valueOf = null;
            }
            if (valueOf == null) {
                return false;
            }
            int i11 = a.f80450a[bVar.g().ordinal()];
            if (i11 == 1) {
                com.airbnb.lottie.u0<com.airbnb.lottie.k> u11 = com.airbnb.lottie.x.u(new FileInputStream(f80438a.D() + "/" + bVar.d().hashCode()), null);
                if (u11 != null && (a11 = u11.a()) != null) {
                    throw a11;
                }
            } else {
                if (i11 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                hc.c.n(new File(f80438a.D() + "/" + bVar.d().hashCode())).get();
            }
            d0 d0Var = f80438a;
            return d0Var.J().r(bVar.d(), new File(d0Var.D() + "/" + bVar.d().hashCode()), true);
        } catch (Exception e11) {
            qb.c.c(f80439b, "", e11);
            return false;
        }
    }
}
