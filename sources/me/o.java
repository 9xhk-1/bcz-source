package me;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.baicizhan.client.business.webview.BczWebExecutorKt;
import com.baicizhan.online.bcz_system_api.BczSystemApiService;
import com.baicizhan.online.bcz_system_api.PrivacyAgreementInfo;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.jiongji.andriod.card.R;
import java.util.Map;
import kc.d;
import kc.u;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import ma.t;
import me.o;
import me.r;
import q9.x;
import u30.k0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nProtocolMgr.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProtocolMgr.kt\ncom/baicizhan/main/activity/protocol/ProtocolMgr\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 Delegates.kt\nkotlin/properties/Delegates\n*L\n1#1,137:1\n216#2,2:138\n33#3,3:140\n*S KotlinDebug\n*F\n+ 1 ProtocolMgr.kt\ncom/baicizhan/main/activity/protocol/ProtocolMgr\n*L\n99#1:138,2\n-1#1:140,3\n*E\n"})
/* loaded from: classes4.dex */
public final class o {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final String f73183c = "ProtocolMgr";

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final String f73184d = "key_protocol_activity_confirmed";

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final String f73186f = "key_last_confirm_version";

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final d10.f f73187g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public static final d10.f f73188h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public static final d10.f f73189i;

    /* renamed from: j, reason: collision with root package name */
    public static final int f73190j;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ h10.n<Object>[] f73182b = {o0.k(new MutablePropertyReference1Impl(o.class, "hasProtocolActivityConfirmed", "getHasProtocolActivityConfirmed()Z", 0)), o0.k(new MutablePropertyReference1Impl(o.class, "hasConfirm", "getHasConfirm()Z", 0)), o0.k(new MutablePropertyReference1Impl(o.class, "lastConfirmVersion", "getLastConfirmVersion()I", 0))};

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final o f73181a = new o();

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final String f73185e = "key_protocol_confirm";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends ClickableSpan {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f73191a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Map.Entry<String, String> f73192b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ TextView f73193c;

        public a(boolean z11, Map.Entry<String, String> entry, TextView textView) {
            this.f73191a = z11;
            this.f73192b = entry;
            this.f73193c = textView;
        }

        public static final void b(View view) {
            view.setEnabled(true);
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(final View widget) {
            g0.p(widget, "widget");
            widget.setEnabled(false);
            widget.postDelayed(new Runnable() { // from class: me.n
                @Override // java.lang.Runnable
                public final void run() {
                    o.a.b(widget);
                }
            }, 1000L);
            if (this.f73191a) {
                this.f73193c.getContext().startActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(this.f73192b.getValue())));
            } else {
                BczWebExecutorKt.startNormalWeb$default(pb.a.a(), this.f73192b.getValue(), null, true, 0, null, 52, null);
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds2) {
            g0.p(ds2, "ds");
            super.updateDrawState(ds2);
            ds2.setUnderlineText(false);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nDelegates.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delegates.kt\nkotlin/properties/Delegates$observable$1\n+ 2 ProtocolMgr.kt\ncom/baicizhan/main/activity/protocol/ProtocolMgr\n*L\n1#1,73:1\n45#2,2:74\n*E\n"})
    public static final class b extends d10.c<Boolean> {
        public b(Object obj) {
            super(obj);
        }

        @Override // d10.c
        public void afterChange(h10.n<?> property, Boolean bool, Boolean bool2) {
            g0.p(property, "property");
            boolean booleanValue = bool2.booleanValue();
            bool.getClass();
            nc.b.b().j(o.f73184d, booleanValue);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nDelegates.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delegates.kt\nkotlin/properties/Delegates$observable$1\n+ 2 ProtocolMgr.kt\ncom/baicizhan/main/activity/protocol/ProtocolMgr\n*L\n1#1,73:1\n50#2,4:74\n*E\n"})
    public static final class c extends d10.c<Boolean> {
        public c(Object obj) {
            super(obj);
        }

        @Override // d10.c
        public void afterChange(h10.n<?> property, Boolean bool, Boolean bool2) {
            g0.p(property, "property");
            boolean booleanValue = bool2.booleanValue();
            bool.getClass();
            if (booleanValue) {
                o.f73181a.E(-1);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nDelegates.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delegates.kt\nkotlin/properties/Delegates$observable$1\n+ 2 ProtocolMgr.kt\ncom/baicizhan/main/activity/protocol/ProtocolMgr\n*L\n1#1,73:1\n56#2,2:74\n*E\n"})
    public static final class d extends d10.c<Integer> {
        public d(Object obj) {
            super(obj);
        }

        @Override // d10.c
        public void afterChange(h10.n<?> property, Integer num, Integer num2) {
            g0.p(property, "property");
            int intValue = num2.intValue();
            num.intValue();
            nc.b.b().m(o.f73186f, intValue);
        }
    }

    static {
        d10.a aVar = d10.a.f47010a;
        f73187g = new b(Boolean.valueOf(nc.b.b().getBoolean(f73184d, false)));
        f73188h = new c(Boolean.FALSE);
        f73189i = new d(Integer.valueOf(nc.b.b().getInt(f73186f, -1)));
        f73190j = 8;
    }

    public static /* synthetic */ void B(o oVar, TextView textView, Map map, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        oVar.A(textView, map, str, z11);
    }

    public static final rx.c l(BczSystemApiService.Client client) {
        return rx.c.M2(client.get_privacy_agreement_version());
    }

    public static final rx.c m(x00.l lVar, Object obj) {
        return (rx.c) lVar.invoke(obj);
    }

    public static final g2 n(final Context context, final PrivacyAgreementInfo privacyAgreementInfo) {
        o oVar = f73181a;
        qb.c.i(f73183c, "%d -- %d", Integer.valueOf(oVar.z()), Integer.valueOf(privacyAgreementInfo.privacy_version));
        if (oVar.z() == -1) {
            oVar.E(privacyAgreementInfo.privacy_version);
        }
        if (oVar.z() < privacyAgreementInfo.privacy_version && x.r().l() != 0 && !TextUtils.isEmpty(privacyAgreementInfo.content)) {
            r.a aVar = new r.a(context);
            String str = privacyAgreementInfo.content;
            g0.m(str);
            r.a k11 = aVar.k(str);
            Map<String, String> map = privacyAgreementInfo.privacy_urls;
            g0.m(map);
            r a11 = k11.m(map).i(new View.OnClickListener() { // from class: me.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    o.o(PrivacyAgreementInfo.this, view);
                }
            }).g(new View.OnClickListener() { // from class: me.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    o.p(context, view);
                }
            }).a();
            if (a11 != null) {
                a11.setCancelable(false);
            }
            if (a11 != null) {
                a11.show();
            }
            ma.l.a(t.f73023v, ma.a.H2);
        }
        return g2.f100423a;
    }

    public static final void o(PrivacyAgreementInfo privacyAgreementInfo, View view) {
        f73181a.E(privacyAgreementInfo.privacy_version);
        ma.l.a(t.f73023v, ma.a.I2);
        qb.c.i(f73183c, "confirm " + privacyAgreementInfo.privacy_version, new Object[0]);
    }

    public static final void p(Context context, View view) {
        f73181a.u(context);
    }

    public static final void q(x00.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final g2 r(PrivacyAgreementInfo privacyAgreementInfo) {
        qb.c.i(f73183c, "%s", privacyAgreementInfo.toString());
        return g2.f100423a;
    }

    public static final void s(x00.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final void t(Throwable th2) {
        qb.c.c(f73183c, "", th2);
    }

    public static final g2 v(View it) {
        g0.p(it, "it");
        uf.a.c();
        return g2.f100423a;
    }

    public final void A(@m80.k TextView textView, @m80.k Map<String, String> links, @m80.k String content, boolean z11) {
        g0.p(textView, "<this>");
        g0.p(links, "links");
        g0.p(content, "content");
        SpannableString spannableString = new SpannableString(content);
        for (Map.Entry<String, String> entry : links.entrySet()) {
            if (k0.J3(spannableString, entry.getKey(), 0, false, 6, null) > 0) {
                spannableString.setSpan(new a(z11, entry, textView), k0.J3(spannableString, entry.getKey(), 0, false, 6, null), k0.J3(spannableString, entry.getKey(), 0, false, 6, null) + entry.getKey().length(), 34);
            }
        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setLinkTextColor(textView.getResources().getColor(R.color.main_blue));
        textView.setText(spannableString);
    }

    public final void C(boolean z11) {
        f73188h.setValue(this, f73182b[1], Boolean.valueOf(z11));
    }

    public final void D(boolean z11) {
        f73187g.setValue(this, f73182b[0], Boolean.valueOf(z11));
    }

    public final void E(int i11) {
        f73189i.setValue(this, f73182b[2], Integer.valueOf(i11));
    }

    public final void k(@m80.k final Context context) {
        g0.p(context, "context");
        rx.c a11 = com.baicizhan.client.business.thrift.p.a(new com.baicizhan.client.business.thrift.l("/rpc/bcz_system"));
        final x00.l lVar = new x00.l() { // from class: me.g
            @Override // x00.l
            public final Object invoke(Object obj) {
                rx.c l11;
                l11 = o.l((BczSystemApiService.Client) obj);
                return l11;
            }
        };
        rx.c I3 = a11.b2(new wb0.p() { // from class: me.h
            @Override // wb0.p
            public final Object call(Object obj) {
                rx.c m11;
                m11 = o.m(x00.l.this, obj);
                return m11;
            }
        }).w5(bc0.c.e()).I3(tb0.a.a());
        final x00.l lVar2 = new x00.l() { // from class: me.i
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 n11;
                n11 = o.n(context, (PrivacyAgreementInfo) obj);
                return n11;
            }
        };
        rx.c L1 = I3.L1(new wb0.b() { // from class: me.j
            @Override // wb0.b
            public final void call(Object obj) {
                o.q(x00.l.this, obj);
            }
        });
        final x00.l lVar3 = new x00.l() { // from class: me.k
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 r11;
                r11 = o.r((PrivacyAgreementInfo) obj);
                return r11;
            }
        };
        L1.u5(new wb0.b() { // from class: me.l
            @Override // wb0.b
            public final void call(Object obj) {
                o.s(x00.l.this, obj);
            }
        }, new wb0.b() { // from class: me.m
            @Override // wb0.b
            public final void call(Object obj) {
                o.t((Throwable) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v6, types: [kc.d, kc.h] */
    public final void u(Context context) {
        FragmentActivity fragmentActivity = context instanceof FragmentActivity ? (FragmentActivity) context : null;
        if (fragmentActivity != null) {
            mc.a.p(fragmentActivity, ((u.a) ((u.a) d.a.I(new u.a(context).U(R.string.app_protocol_refuse_confirm_content), R.string.app_protocol_refuse_confirm_ok, null, null, 6, null)).o(R.string.app_protocol_refuse_confirm_quit, new x00.l() { // from class: me.d
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 v11;
                    v11 = o.v((View) obj);
                    return v11;
                }
            })).d(), null, 2, null);
        }
    }

    public final boolean w() {
        return ((Boolean) f73188h.getValue(this, f73182b[1])).booleanValue();
    }

    public final boolean x() {
        return ((Boolean) f73187g.getValue(this, f73182b[0])).booleanValue();
    }

    @m80.k
    public final String y() {
        return f73185e;
    }

    public final int z() {
        return ((Number) f73189i.getValue(this, f73182b[2])).intValue();
    }
}
