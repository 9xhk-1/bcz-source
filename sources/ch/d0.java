package ch;

import android.text.TextUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.main.module.AdItem;
import com.baicizhan.online.advertise_api.AdvertiseApiService;
import com.baicizhan.online.advertise_api.PracticePopupAdv;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nReviewPopAdModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReviewPopAdModule.kt\ncom/baicizhan/main/module/ReviewPopAdModule\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n*L\n1#1,76:1\n33#2,3:77\n*S KotlinDebug\n*F\n+ 1 ReviewPopAdModule.kt\ncom/baicizhan/main/module/ReviewPopAdModule\n*L\n-1#1:77,3\n*E\n"})
/* loaded from: classes4.dex */
public final class d0 {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final String f8625c = "ReviewPopAdModule";

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final String f8626d = "key_review_pop_ad";

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final String f8627e = "already_review_read_";

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final d10.f f8628f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final yz.c0 f8629g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f8630h;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ h10.n<Object>[] f8624b = {o0.k(new MutablePropertyReference1Impl(d0.class, "_adItem", "get_adItem()Lcom/baicizhan/main/module/AdItem;", 0))};

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final d0 f8623a = new d0();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nDelegates.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delegates.kt\nkotlin/properties/Delegates$observable$1\n+ 2 ReviewPopAdModule.kt\ncom/baicizhan/main/module/ReviewPopAdModule\n*L\n1#1,73:1\n26#2,2:74\n*E\n"})
    public static final class a extends d10.c<AdItem> {
        public a(Object obj) {
            super(obj);
        }

        @Override // d10.c
        public void afterChange(h10.n<?> property, AdItem adItem, AdItem adItem2) {
            g0.p(property, "property");
            d0.f8623a.l().p(d0.f8626d, new com.google.gson.d().z(adItem2));
        }
    }

    static {
        d10.a aVar = d10.a.f47010a;
        f8628f = new a((AdItem) new com.google.gson.d().n(nc.b.c(ch.a.f8618b).getString(f8626d, ""), AdItem.class));
        f8629g = yz.e0.c(new x00.a() { // from class: ch.v
            @Override // x00.a
            public final Object invoke() {
                nc.a j11;
                j11 = d0.j();
                return j11;
            }
        });
        f8630h = 8;
    }

    public static final nc.a j() {
        return nc.b.c(ch.a.f8618b);
    }

    public static final rx.c r(AdvertiseApiService.Client client) {
        return rx.c.M2(client.get_practice_popup_adv());
    }

    public static final rx.c s(x00.l lVar, Object obj) {
        return (rx.c) lVar.invoke(obj);
    }

    public static final g2 t(PracticePopupAdv practicePopupAdv) {
        if (!TextUtils.isEmpty(practicePopupAdv.f28144id) && !TextUtils.isEmpty(practicePopupAdv.img)) {
            d0 d0Var = f8623a;
            nc.a l11 = d0Var.l();
            String id2 = practicePopupAdv.f28144id;
            g0.o(id2, "id");
            if (l11.getLong(ch.a.a(f8627e, id2), 0L) == 0) {
                nc.a l12 = d0Var.l();
                g0.o(l12, "<get-bczkv>(...)");
                ch.a.b(l12, f8626d);
                AdItem adItem = new AdItem();
                adItem.setLink(practicePopupAdv.link);
                adItem.setReport(practicePopupAdv.f28144id);
                adItem.setImage(practicePopupAdv.img);
                d0Var.y(adItem);
                return g2.f100423a;
            }
        }
        f8623a.y(null);
        return g2.f100423a;
    }

    public static final void u(x00.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final g2 v(PracticePopupAdv practicePopupAdv) {
        qb.c.i(f8625c, "%s", practicePopupAdv.toString());
        return g2.f100423a;
    }

    public static final void w(x00.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final void x(Throwable th2) {
        qb.c.c(f8625c, "", th2);
    }

    public final void k() {
        String o11 = o();
        if (o11 != null) {
            f8623a.l().n(ch.a.a(f8627e, o11), System.currentTimeMillis());
        }
        y(null);
    }

    public final nc.a l() {
        return (nc.a) f8629g.getValue();
    }

    @m80.l
    public final String m() {
        AdItem p11 = p();
        if (p11 != null) {
            return p11.getImage();
        }
        return null;
    }

    @m80.l
    public final String n() {
        AdItem p11 = p();
        if (p11 != null) {
            return p11.getLink();
        }
        return null;
    }

    @m80.l
    public final String o() {
        AdItem p11 = p();
        if (p11 != null) {
            return p11.getReport();
        }
        return null;
    }

    public final AdItem p() {
        return (AdItem) f8628f.getValue(this, f8624b[0]);
    }

    public final void q() {
        rx.c a11 = com.baicizhan.client.business.thrift.p.a(new com.baicizhan.client.business.thrift.l("/rpc/advertise"));
        final x00.l lVar = new x00.l() { // from class: ch.w
            @Override // x00.l
            public final Object invoke(Object obj) {
                rx.c r11;
                r11 = d0.r((AdvertiseApiService.Client) obj);
                return r11;
            }
        };
        rx.c b22 = a11.b2(new wb0.p() { // from class: ch.x
            @Override // wb0.p
            public final Object call(Object obj) {
                rx.c s11;
                s11 = d0.s(x00.l.this, obj);
                return s11;
            }
        });
        final x00.l lVar2 = new x00.l() { // from class: ch.y
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 t11;
                t11 = d0.t((PracticePopupAdv) obj);
                return t11;
            }
        };
        rx.c w52 = b22.L1(new wb0.b() { // from class: ch.z
            @Override // wb0.b
            public final void call(Object obj) {
                d0.u(x00.l.this, obj);
            }
        }).w5(bc0.c.e());
        final x00.l lVar3 = new x00.l() { // from class: ch.a0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 v11;
                v11 = d0.v((PracticePopupAdv) obj);
                return v11;
            }
        };
        w52.u5(new wb0.b() { // from class: ch.b0
            @Override // wb0.b
            public final void call(Object obj) {
                d0.w(x00.l.this, obj);
            }
        }, new wb0.b() { // from class: ch.c0
            @Override // wb0.b
            public final void call(Object obj) {
                d0.x((Throwable) obj);
            }
        });
    }

    public final void y(AdItem adItem) {
        f8628f.setValue(this, f8624b[0], adItem);
    }
}
