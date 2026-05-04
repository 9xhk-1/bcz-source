package com.baicizhan.main.activity.daka.imagedaka.imagedakav2;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.activity.result.ActivityResultCaller;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.baicizhan.base.BaseAppCompatActivity;
import com.baicizhan.client.business.auth.share.ShareChannel;
import com.baicizhan.client.business.auth.share.ShareDelegate;
import com.baicizhan.client.business.auth.share.ShareParams;
import com.baicizhan.client.business.util.KotlinExtKt;
import com.baicizhan.client.business.webview.BczWebExecutorKt;
import com.baicizhan.client.business.widget.share.SharePanelViewV2;
import com.baicizhan.main.activity.daka.datasource.g;
import com.baicizhan.main.activity.daka.imagedaka.imagedakav2.BonusActivityDialog;
import com.baicizhan.main.activity.daka.imagedaka.imagedakav2.ImageDakaV2Activity;
import com.baicizhan.online.user_study_api.DakaShareBonusResult;
import com.baicizhan.online.user_study_api.UserDakaShareInfo;
import com.jiongji.andriod.card.R;
import gs.ad;
import gs.w0;
import gs.yc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jg.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import ma.t;
import pd.h;
import sa.q;
import x00.l;
import yz.c0;
import yz.e0;
import yz.g2;
import yz.w;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nImageDakaV2Activity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageDakaV2Activity.kt\ncom/baicizhan/main/activity/daka/imagedaka/imagedakav2/ImageDakaV2Activity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,363:1\n1869#2,2:364\n*S KotlinDebug\n*F\n+ 1 ImageDakaV2Activity.kt\ncom/baicizhan/main/activity/daka/imagedaka/imagedakav2/ImageDakaV2Activity\n*L\n158#1:364,2\n*E\n"})
/* loaded from: classes4.dex */
public final class ImageDakaV2Activity extends BaseAppCompatActivity {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f18406d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final int f18407e = 8;

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final String f18408f = "ImageDakaV2Activity";

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c0 f18409a = e0.c(new x00.a() { // from class: sd.g0
        @Override // x00.a
        public final Object invoke() {
            gs.w0 m12;
            m12 = ImageDakaV2Activity.m1(ImageDakaV2Activity.this);
            return m12;
        }
    });

    /* renamed from: b, reason: collision with root package name */
    @k
    public final c0 f18410b = e0.c(new x00.a() { // from class: sd.h0
        @Override // x00.a
        public final Object invoke() {
            u0 n12;
            n12 = ImageDakaV2Activity.n1(ImageDakaV2Activity.this);
            return n12;
        }
    });

    /* renamed from: c, reason: collision with root package name */
    public boolean f18411c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public final void a(@k Context context) {
            g0.p(context, "context");
            context.startActivity(new Intent(context, (Class<?>) ImageDakaV2Activity.class));
            if (context instanceof Activity) {
                ((Activity) context).overridePendingTransition(R.anim.business_push_up_in, R.anim.activity_nothing);
            }
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends FragmentStateAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List<Fragment> f18412a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ImageDakaV2Activity imageDakaV2Activity, List<Fragment> list) {
            super(imageDakaV2Activity);
            this.f18412a = list;
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        public Fragment createFragment(int i11) {
            qb.c.b(ImageDakaV2Activity.f18408f, "create fragment " + i11, new Object[0]);
            return this.f18412a.get(i11);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f18412a.size();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends ViewPager2.OnPageChangeCallback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List<Fragment> f18413a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ImageDakaV2Activity f18414b;

        public c(List<Fragment> list, ImageDakaV2Activity imageDakaV2Activity) {
            this.f18413a = list;
            this.f18414b = imageDakaV2Activity;
        }

        public static final g2 b(ImageDakaV2Activity imageDakaV2Activity, pd.c cVar, Boolean bool) {
            if (bool.booleanValue()) {
                imageDakaV2Activity.a1(cVar);
            }
            return g2.f100423a;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i11) {
            qb.c.b(ImageDakaV2Activity.f18408f, "page selected " + i11, new Object[0]);
            ActivityResultCaller activityResultCaller = this.f18413a.get(i11);
            g0.n(activityResultCaller, "null cannot be cast to non-null type com.baicizhan.main.activity.daka.imagedaka.IContentFragment");
            final pd.c cVar = (pd.c) activityResultCaller;
            LiveData<Boolean> l11 = cVar.l();
            final ImageDakaV2Activity imageDakaV2Activity = this.f18414b;
            l11.observe(imageDakaV2Activity, new f(new l() { // from class: sd.j0
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 b11;
                    b11 = ImageDakaV2Activity.c.b(ImageDakaV2Activity.this, cVar, (Boolean) obj);
                    return b11;
                }
            }));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d implements ShareDelegate.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SharePanelViewV2 f18415a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ImageDakaV2Activity f18416b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f18417a;

            static {
                int[] iArr = new int[ShareChannel.values().length];
                try {
                    iArr[ShareChannel.WEIBO.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ShareChannel.QQ.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ShareChannel.QZONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ShareChannel.WEIXIN.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[ShareChannel.WEIXIN_CIRCLE.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[ShareChannel.SAVE_PHOTO.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                f18417a = iArr;
            }
        }

        public d(SharePanelViewV2 sharePanelViewV2, ImageDakaV2Activity imageDakaV2Activity) {
            this.f18415a = sharePanelViewV2;
            this.f18416b = imageDakaV2Activity;
        }

        @Override // com.baicizhan.client.business.auth.share.ShareDelegate.b
        public void onShareCancel() {
            qb.c.b(ImageDakaV2Activity.f18408f, "share cancel", new Object[0]);
        }

        @Override // com.baicizhan.client.business.auth.share.ShareDelegate.b
        public void onShareError(ShareChannel media, Throwable th2) {
            g0.p(media, "media");
            qb.c.d(ImageDakaV2Activity.f18408f, "share error : " + (th2 != null ? th2.getMessage() : null), new Object[0]);
            if (th2 != null) {
                KotlinExtKt.showToast(th2);
            }
        }

        @Override // com.baicizhan.client.business.auth.share.ShareDelegate.b
        public void onShareSend(ShareChannel media) {
            g0.p(media, "media");
            qb.c.b(ImageDakaV2Activity.f18408f, "share send " + media, new Object[0]);
        }

        @Override // com.baicizhan.client.business.auth.share.ShareDelegate.b
        public void onShareStart(ShareChannel media) {
            UserDakaShareInfo userDakaShareInfo;
            UserDakaShareInfo userDakaShareInfo2;
            g0.p(media, "media");
            int[] iArr = a.f18417a;
            int i11 = iArr[media.ordinal()];
            String str = null;
            if (i11 == 1) {
                ShareParams shareParams = this.f18415a.getShareParams();
                g.j z11 = this.f18416b.X0().z();
                if (z11 != null && (userDakaShareInfo = z11.f18380b) != null) {
                    str = userDakaShareInfo.getWeibo_share_txt();
                }
                shareParams.f16058b = str;
                this.f18416b.f18411c = true;
            } else if (i11 == 2 || i11 == 3) {
                this.f18416b.f18411c = true;
                this.f18415a.getShareParams().f16058b = this.f18416b.getString(R.string.daka_share_share_title);
            } else if (i11 == 4 || i11 == 5) {
                ShareParams shareParams2 = this.f18415a.getShareParams();
                g.j z12 = this.f18416b.X0().z();
                if (z12 != null && (userDakaShareInfo2 = z12.f18380b) != null) {
                    str = userDakaShareInfo2.getWeixin_share_title();
                }
                shareParams2.f16058b = str;
            }
            switch (iArr[media.ordinal()]) {
                case 1:
                    ma.l.a(t.f73003b, ma.a.f72852v);
                    return;
                case 2:
                    ma.l.a(t.f73003b, ma.a.f72838t);
                    return;
                case 3:
                    ma.l.a(t.f73003b, ma.a.f72845u);
                    return;
                case 4:
                    ma.l.a(t.f73003b, ma.a.f72824r);
                    return;
                case 5:
                    ma.l.a(t.f73003b, ma.a.f72831s);
                    return;
                case 6:
                    ma.l.a(t.f73003b, ma.a.f72859w);
                    return;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }

        @Override // com.baicizhan.client.business.auth.share.ShareDelegate.b
        public void onShareSuccess(ShareChannel media) {
            g0.p(media, "media");
            this.f18416b.X0().R(media);
            qb.c.i(ImageDakaV2Activity.f18408f, "share success:" + media.name(), new Object[0]);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e implements SharePanelViewV2.b {
        public e() {
        }

        @Override // com.baicizhan.client.business.widget.share.SharePanelViewV2.b
        public void a(ShareChannel media) {
            g0.p(media, "media");
            ImageDakaV2Activity.this.X0().I();
            ImageDakaV2Activity.this.X0().v(media);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class f implements Observer, b0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f18419a;

        public f(l function) {
            g0.p(function, "function");
            this.f18419a = function;
        }

        public final boolean equals(@m80.l Object obj) {
            if ((obj instanceof Observer) && (obj instanceof b0)) {
                return g0.g(getFunctionDelegate(), ((b0) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.b0
        @k
        public final w<?> getFunctionDelegate() {
            return this.f18419a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f18419a.invoke(obj);
        }
    }

    public static final void Z0(ImageDakaV2Activity imageDakaV2Activity, w0 w0Var, int i11) {
        yc ycVar = (yc) DataBindingUtil.inflate(LayoutInflater.from(imageDakaV2Activity), R.layout.guide_image_daka_v2_1, null, false);
        ViewGroup.LayoutParams layoutParams = ycVar.f57587a.getLayoutParams();
        g0.n(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = (((int) w0Var.f57251c.getY()) + KotlinExtKt.getDimenPx(R.dimen.daka_image_pager_shadow_blur)) - KotlinExtKt.getDimenPx(R.dimen.daka_image_pager_shadow_y);
        int dimenPx = i11 - (KotlinExtKt.getDimenPx(R.dimen.daka_image_pager_shadow_blur) * 2);
        ((ViewGroup.MarginLayoutParams) layoutParams2).height = dimenPx;
        ((ViewGroup.MarginLayoutParams) layoutParams2).width = (dimenPx * 3) / 4;
        ycVar.f57587a.setLayoutParams(layoutParams2);
        ad adVar = (ad) DataBindingUtil.inflate(LayoutInflater.from(imageDakaV2Activity), R.layout.guide_image_daka_v2_2, null, false);
        ViewGroup.LayoutParams layoutParams3 = adVar.f54172a.getLayoutParams();
        g0.n(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
        int i12 = ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
        int i13 = ((ViewGroup.MarginLayoutParams) layoutParams2).height;
        ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin = i12 + ((int) (i13 * 0.05d));
        int i14 = (int) (i13 * 0.9d);
        ((ViewGroup.MarginLayoutParams) layoutParams4).height = i14;
        ((ViewGroup.MarginLayoutParams) layoutParams4).width = (i14 * 66) / pd.a.f80340j;
        adVar.f54172a.setLayoutParams(layoutParams4);
        g.a aVar = new g.a();
        View root = ycVar.getRoot();
        g0.o(root, "getRoot(...)");
        ImageView next = ycVar.f57591e;
        g0.o(next, "next");
        g.a a11 = aVar.a(jg.d.b(root, next));
        View root2 = adVar.getRoot();
        g0.o(root2, "getRoot(...)");
        ImageView next2 = adVar.f54175d;
        g0.o(next2, "next");
        g.a a12 = a11.a(jg.d.b(root2, next2));
        View decorView = imageDakaV2Activity.getWindow().getDecorView();
        g0.n(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
        a12.b((ViewGroup) decorView).j();
        jg.d.g(h.f80365b);
    }

    public static final g2 b1(ImageDakaV2Activity imageDakaV2Activity, String str) {
        sd.u0 X0 = imageDakaV2Activity.X0();
        g0.m(str);
        X0.V(str);
        return g2.f100423a;
    }

    private final void d1() {
        w0 W0 = W0();
        ImageView actionBarClose = W0.f57249a;
        g0.o(actionBarClose, "actionBarClose");
        q.t(actionBarClose, 0, new l() { // from class: sd.i0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 e12;
                e12 = ImageDakaV2Activity.e1(ImageDakaV2Activity.this, (View) obj);
                return e12;
            }
        }, 1, null);
        ImageView actionBarMore = W0.f57250b;
        g0.o(actionBarMore, "actionBarMore");
        q.t(actionBarMore, 0, new l() { // from class: sd.z
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 f12;
                f12 = ImageDakaV2Activity.f1(ImageDakaV2Activity.this, (View) obj);
                return f12;
            }
        }, 1, null);
        W0.l(X0());
        c1();
    }

    public static final g2 e1(ImageDakaV2Activity imageDakaV2Activity, View it) {
        g0.p(it, "it");
        imageDakaV2Activity.finish();
        imageDakaV2Activity.overridePendingTransition(R.anim.activity_nothing, R.anim.business_push_down_out);
        return g2.f100423a;
    }

    public static final g2 f1(ImageDakaV2Activity imageDakaV2Activity, View it) {
        g0.p(it, "it");
        DakaBonusDocActivity.f18399b.a(imageDakaV2Activity);
        return g2.f100423a;
    }

    private final void g1() {
        sd.u0 X0 = X0();
        X0.x().observe(this, new f(new l() { // from class: sd.b0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 h12;
                h12 = ImageDakaV2Activity.h1(ImageDakaV2Activity.this, (List) obj);
                return h12;
            }
        }));
        X0.F().observe(this, new f(new l() { // from class: sd.c0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 i12;
                i12 = ImageDakaV2Activity.i1(ImageDakaV2Activity.this, (Boolean) obj);
                return i12;
            }
        }));
        X0.D().observe(this, new f(new l() { // from class: sd.d0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 k12;
                k12 = ImageDakaV2Activity.k1(ImageDakaV2Activity.this, (String) obj);
                return k12;
            }
        }));
        X0.C().observe(this, new f(new l() { // from class: sd.e0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 l12;
                l12 = ImageDakaV2Activity.l1(ImageDakaV2Activity.this, (DakaShareBonusResult) obj);
                return l12;
            }
        }));
        X0.start();
    }

    public static final g2 h1(ImageDakaV2Activity imageDakaV2Activity, List list) {
        g0.m(list);
        imageDakaV2Activity.Y0(list);
        return g2.f100423a;
    }

    public static final g2 i1(final ImageDakaV2Activity imageDakaV2Activity, Boolean bool) {
        if (bool != null && bool.booleanValue()) {
            ma.l.a("notify-popup", ma.a.f72713b0);
            Dialog f11 = va.e.f(imageDakaV2Activity, R.drawable.ic_20xx_newyear, new DialogInterface.OnClickListener() { // from class: sd.f0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) {
                    ImageDakaV2Activity.j1(ImageDakaV2Activity.this, dialogInterface, i11);
                }
            });
            f11.setCancelable(false);
            f11.show();
        }
        return g2.f100423a;
    }

    public static final void j1(ImageDakaV2Activity imageDakaV2Activity, DialogInterface dialogInterface, int i11) {
        dialogInterface.dismiss();
        ma.l.a("notify-popup", i11 == -1 ? ma.a.f72720c0 : ma.a.f72727d0);
        if (i11 == -1) {
            BczWebExecutorKt.startNormalWeb$default(imageDakaV2Activity, imageDakaV2Activity.getString(R.string.url_2026_new_year), null, false, 0, null, 60, null);
        }
    }

    public static final g2 k1(ImageDakaV2Activity imageDakaV2Activity, String str) {
        SharePanelViewV2 sharePanelViewV2 = imageDakaV2Activity.W0().f57253e;
        sharePanelViewV2.getShareParams().f16061e = ShareParams.ShareType.IMAGE;
        sharePanelViewV2.getShareParams().f16060d = str;
        sharePanelViewV2.a();
        return g2.f100423a;
    }

    public static final g2 l1(ImageDakaV2Activity imageDakaV2Activity, DakaShareBonusResult dakaShareBonusResult) {
        if (dakaShareBonusResult.status == 1) {
            BonusActivityDialog.a aVar = BonusActivityDialog.f18390f;
            g0.m(dakaShareBonusResult);
            aVar.a(imageDakaV2Activity, dakaShareBonusResult);
            return g2.f100423a;
        }
        String message = dakaShareBonusResult.message;
        g0.o(message, "message");
        KotlinExtKt.showToast(message);
        return g2.f100423a;
    }

    public static final w0 m1(ImageDakaV2Activity imageDakaV2Activity) {
        return (w0) DataBindingUtil.setContentView(imageDakaV2Activity, R.layout.activity_image_daka_v2);
    }

    public static final sd.u0 n1(ImageDakaV2Activity imageDakaV2Activity) {
        return (sd.u0) new ViewModelProvider(imageDakaV2Activity).get(sd.u0.class);
    }

    public final w0 W0() {
        return (w0) this.f18409a.getValue();
    }

    public final sd.u0 X0() {
        return (sd.u0) this.f18410b.getValue();
    }

    public final void Y0(@k List<Integer> orders) {
        Integer valueOf = Integer.valueOf(R.drawable.ic_image_daka_calendar);
        g0.p(orders, "orders");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator<T> it = orders.iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            if (intValue == 1) {
                arrayList.add("海报");
                arrayList2.add(Integer.valueOf(R.drawable.ic_image_daka_poster));
                rd.a w11 = rd.a.w(intValue);
                g0.o(w11, "create(...)");
                arrayList3.add(w11);
            } else if (intValue == 2) {
                arrayList.add("照片");
                arrayList2.add(Integer.valueOf(R.drawable.ic_image_daka_photo));
                td.a w12 = td.a.w();
                g0.o(w12, "create(...)");
                arrayList3.add(w12);
            } else if (intValue == 3) {
                arrayList.add("日历");
                arrayList2.add(valueOf);
                rd.a w13 = rd.a.w(intValue);
                g0.o(w13, "create(...)");
                arrayList3.add(w13);
            } else if (intValue == 5) {
                arrayList.add("连胜");
                arrayList2.add(valueOf);
                rd.a w14 = rd.a.w(intValue);
                g0.o(w14, "create(...)");
                arrayList3.add(w14);
            } else if (intValue == 6) {
                arrayList.add("每日一句");
                arrayList2.add(valueOf);
                rd.a w15 = rd.a.w(intValue);
                g0.o(w15, "create(...)");
                arrayList3.add(w15);
            }
        }
        final int min = Math.min((KotlinExtKt.getScreenHeight() - KotlinExtKt.getStatusBarHeight()) - KotlinExtKt.getDimenPx(R.dimen.daka_image_pager_other_height), KotlinExtKt.getDimenPx(R.dimen.daka_image_pager_max_height));
        final w0 W0 = W0();
        ViewPager2 viewPager2 = W0.f57251c;
        viewPager2.setAdapter(new b(this, arrayList3));
        viewPager2.registerOnPageChangeCallback(new c(arrayList3, this));
        int dpValue = KotlinExtKt.getDpValue(20);
        int i11 = dpValue * 2;
        int min2 = Math.min((KotlinExtKt.getScreenWidth() - i11) - (KotlinExtKt.getDpValue(20) * 2), (min * 3) / 4);
        ViewGroup.LayoutParams layoutParams = viewPager2.getLayoutParams();
        layoutParams.height = (min2 * 4) / 3;
        viewPager2.setLayoutParams(layoutParams);
        int screenWidth = ((KotlinExtKt.getScreenWidth() - min2) - i11) / 2;
        g0.m(viewPager2);
        cg.b.a(viewPager2, screenWidth + dpValue, dpValue);
        W0().f57252d.a(viewPager2);
        if (jg.d.e(h.f80365b)) {
            W0.f57251c.post(new Runnable() { // from class: sd.a0
                @Override // java.lang.Runnable
                public final void run() {
                    ImageDakaV2Activity.Z0(ImageDakaV2Activity.this, W0, min);
                }
            });
        }
    }

    public final void a1(pd.c cVar) {
        W0().k(cVar.g());
        X0().Q(cVar.f());
        cVar.f().e().observe(this, new f(new l() { // from class: sd.y
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 b12;
                b12 = ImageDakaV2Activity.b1(ImageDakaV2Activity.this, (String) obj);
                return b12;
            }
        }));
    }

    public final void c1() {
        SharePanelViewV2 sharePanelViewV2 = W0().f57253e;
        sharePanelViewV2.setMListener(new d(sharePanelViewV2, this));
        sharePanelViewV2.setMShareClickListener(new e());
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i11, int i12, @m80.l Intent intent) {
        super.onActivityResult(i11, i12, intent);
        if (this.f18411c) {
            W0().f57253e.d(i11, i12, intent);
            this.f18411c = false;
        }
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@m80.l Bundle bundle) {
        super.onCreate(bundle);
        d1();
        g1();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i11, @k String[] permissions, @k int[] grantResults) {
        g0.p(permissions, "permissions");
        g0.p(grantResults, "grantResults");
        super.onRequestPermissionsResult(i11, permissions, grantResults);
        W0().f57253e.e(i11, permissions, grantResults);
    }
}
