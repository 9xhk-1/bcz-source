package com.baicizhan.main.module;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.client.business.thrift.p;
import com.baicizhan.client.business.util.NoProguard;
import com.baicizhan.main.module.ReviewAdModule;
import com.baicizhan.online.advertise_api.AdvertiseApiService;
import com.baicizhan.online.advertise_api.PracticeBannerAdv;
import com.google.gson.d;
import d10.c;
import d10.f;
import h10.n;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import me.o;
import nc.b;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nReviewAdModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReviewAdModule.kt\ncom/baicizhan/main/module/ReviewAdModule\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n*L\n1#1,62:1\n33#2,3:63\n*S KotlinDebug\n*F\n+ 1 ReviewAdModule.kt\ncom/baicizhan/main/module/ReviewAdModule\n*L\n-1#1:63,3\n*E\n"})
/* loaded from: classes4.dex */
public final class ReviewAdModule {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final String f24426c = "ReviewAdModule";

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final String f24427d = "key_review_ad";

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final f f24428e;

    /* renamed from: f, reason: collision with root package name */
    public static final int f24429f;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f24425b = {o0.k(new MutablePropertyReference1Impl(ReviewAdModule.class, "_adItem", "get_adItem()Lcom/baicizhan/main/module/ReviewAdModule$AdItem;", 0))};

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final ReviewAdModule f24424a = new ReviewAdModule();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class AdItem implements NoProguard {
        public static final int $stable = 8;

        @l
        private String image;

        @l
        private String link;

        @l
        private String report;

        @l
        public final String getImage() {
            return this.image;
        }

        @l
        public final String getLink() {
            return this.link;
        }

        @l
        public final String getReport() {
            return this.report;
        }

        public final void setImage(@l String str) {
            this.image = str;
        }

        public final void setLink(@l String str) {
            this.link = str;
        }

        public final void setReport(@l String str) {
            this.report = str;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nDelegates.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delegates.kt\nkotlin/properties/Delegates$observable$1\n+ 2 ReviewAdModule.kt\ncom/baicizhan/main/module/ReviewAdModule\n*L\n1#1,73:1\n25#2,2:74\n*E\n"})
    public static final class a extends c<AdItem> {
        public a(Object obj) {
            super(obj);
        }

        @Override // d10.c
        public void afterChange(n<?> property, AdItem adItem, AdItem adItem2) {
            g0.p(property, "property");
            b.c(ch.a.f8618b).p(ReviewAdModule.f24427d, new d().z(adItem2));
        }
    }

    static {
        d10.a aVar = d10.a.f47010a;
        f24428e = new a((AdItem) new d().n(b.c(ch.a.f8618b).getString(f24427d, ""), AdItem.class));
        f24429f = 8;
    }

    public static final rx.c m(AdvertiseApiService.Client client) {
        return rx.c.M2(client.get_practice_banner_adv());
    }

    public static final rx.c n(x00.l lVar, Object obj) {
        return (rx.c) lVar.invoke(obj);
    }

    public static final g2 o(PracticeBannerAdv practiceBannerAdv) {
        ReviewAdModule reviewAdModule = f24424a;
        AdItem adItem = new AdItem();
        adItem.setLink(practiceBannerAdv.link);
        adItem.setReport(practiceBannerAdv.f28143id);
        adItem.setImage(practiceBannerAdv.img);
        reviewAdModule.t(adItem);
        return g2.f100423a;
    }

    public static final void p(x00.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final g2 q(PracticeBannerAdv practiceBannerAdv) {
        qb.c.i(o.f73183c, "%s", practiceBannerAdv.toString());
        return g2.f100423a;
    }

    public static final void r(x00.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final void s(Throwable th2) {
        qb.c.c(o.f73183c, "", th2);
    }

    @l
    public final String h() {
        AdItem k11 = k();
        if (k11 != null) {
            return k11.getImage();
        }
        return null;
    }

    @l
    public final String i() {
        AdItem k11 = k();
        if (k11 != null) {
            return k11.getLink();
        }
        return null;
    }

    @l
    public final String j() {
        AdItem k11 = k();
        if (k11 != null) {
            return k11.getReport();
        }
        return null;
    }

    public final AdItem k() {
        return (AdItem) f24428e.getValue(this, f24425b[0]);
    }

    public final void l() {
        rx.c a11 = p.a(new com.baicizhan.client.business.thrift.l("/rpc/advertise"));
        final x00.l lVar = new x00.l() { // from class: ch.o
            @Override // x00.l
            public final Object invoke(Object obj) {
                rx.c m11;
                m11 = ReviewAdModule.m((AdvertiseApiService.Client) obj);
                return m11;
            }
        };
        rx.c b22 = a11.b2(new wb0.p() { // from class: ch.p
            @Override // wb0.p
            public final Object call(Object obj) {
                rx.c n11;
                n11 = ReviewAdModule.n(x00.l.this, obj);
                return n11;
            }
        });
        final x00.l lVar2 = new x00.l() { // from class: ch.q
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 o11;
                o11 = ReviewAdModule.o((PracticeBannerAdv) obj);
                return o11;
            }
        };
        rx.c w52 = b22.L1(new wb0.b() { // from class: ch.r
            @Override // wb0.b
            public final void call(Object obj) {
                ReviewAdModule.p(x00.l.this, obj);
            }
        }).w5(bc0.c.e());
        final x00.l lVar3 = new x00.l() { // from class: ch.s
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 q11;
                q11 = ReviewAdModule.q((PracticeBannerAdv) obj);
                return q11;
            }
        };
        w52.u5(new wb0.b() { // from class: ch.t
            @Override // wb0.b
            public final void call(Object obj) {
                ReviewAdModule.r(x00.l.this, obj);
            }
        }, new wb0.b() { // from class: ch.u
            @Override // wb0.b
            public final void call(Object obj) {
                ReviewAdModule.s((Throwable) obj);
            }
        });
    }

    public final void t(AdItem adItem) {
        f24428e.setValue(this, f24425b[0], adItem);
    }
}
