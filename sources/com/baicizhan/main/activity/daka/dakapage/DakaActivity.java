package com.baicizhan.main.activity.daka.dakapage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.transition.TransitionManager;
import com.baicizhan.client.business.auth.share.ShareChannel;
import com.baicizhan.client.business.auth.share.ShareParams;
import com.baicizhan.client.business.util.Fonts;
import com.baicizhan.client.business.webview.BczWebExecutorKt;
import com.baicizhan.client.business.widget.share.SharePickerSheetView;
import com.baicizhan.main.activity.DakaLottery;
import com.baicizhan.main.activity.cake.CakeWebActivity;
import com.baicizhan.main.activity.daka.dakapage.DakaActivity;
import com.baicizhan.main.activity.daka.datasource.k;
import com.baicizhan.main.activity.daka.imagedaka.imagedakav2.ImageDakaV2Activity;
import com.baicizhan.main.web.BczWebWorker;
import com.baicizhan.online.user_study_api.UserDakaShareInfo;
import com.jiongji.andriod.card.R;
import gs.w;
import java.util.HashMap;
import kc.r;
import kc.u;
import ma.l;
import od.n;
import od.t;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@qu.b
/* loaded from: classes4.dex */
public class DakaActivity extends t {

    /* renamed from: h, reason: collision with root package name */
    public static final String f18327h = "DakaActivity_TAG";

    /* renamed from: i, reason: collision with root package name */
    public static final String f18328i = "param_from_maintab";

    /* renamed from: e, reason: collision with root package name */
    public w f18329e;

    /* renamed from: f, reason: collision with root package name */
    public n f18330f;

    /* renamed from: g, reason: collision with root package name */
    public SharePickerSheetView f18331g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18332a;

        static {
            int[] iArr = new int[ShareChannel.values().length];
            f18332a = iArr;
            try {
                iArr[ShareChannel.QQ.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18332a[ShareChannel.QZONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18332a[ShareChannel.WEIBO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18332a[ShareChannel.WEIXIN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18332a[ShareChannel.WEIXIN_CIRCLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends HashMap<String, Object> {
        public b() {
            put(ma.b.M1, k.d() ? "classic" : "image");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements Observer<Void> {
        public c() {
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(@Nullable Void aVoid) {
            DakaActivity.this.finish();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements Observer<UserDakaShareInfo> {
        public d() {
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(@Nullable UserDakaShareInfo userDakaShareInfo) {
            DakaActivity.this.e1(userDakaShareInfo);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e implements Observer<ShareChannel> {
        public e() {
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(ShareChannel shareChannel) {
            if (shareChannel == null) {
                return;
            }
            DakaActivity.this.U0(shareChannel);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class f implements Observer<Void> {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements View.OnClickListener {
            public a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View v11) {
                DakaActivity.this.f18330f.o();
            }
        }

        public f() {
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(@Nullable Void aVoid) {
            Dialog b11 = nd.b.b(DakaActivity.this, new a());
            b11.setCancelable(false);
            b11.show();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class g implements Observer<String> {
        public g() {
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(@Nullable String s11) {
            va.g.i(s11, 0);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class h implements Observer<Void> {
        public h() {
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(@Nullable Void aVoid) {
            DakaLottery.V0(DakaActivity.this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class i implements Observer<Void> {
        public i() {
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(@Nullable Void aVoid) {
            DakaActivity.this.f18329e.f57233e.u();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class j extends r {
        public j() {
        }

        @Override // kc.r, kc.q
        public void onDialogPositiveClick(@NonNull View v11) {
            try {
                CakeWebActivity.N0(DakaActivity.this, hi.e.a().getFinal_exam_link_popup(), false);
            } catch (Exception e11) {
                qb.c.h(DakaActivity.f18327h, "", e11);
            }
        }
    }

    private void V0() {
        boolean booleanExtra = getIntent().getBooleanExtra(f18328i, false);
        n nVar = (n) new ViewModelProvider(this).get(n.class);
        this.f18330f = nVar;
        nVar.F(booleanExtra);
    }

    private void d1() {
        w e11 = w.e(LayoutInflater.from(this));
        this.f18329e = e11;
        e11.setLifecycleOwner(this);
        w wVar = this.f18329e;
        Fonts.setSafeFace(R.font.din_black_italic, wVar.f57241m, wVar.f57246r);
        ViewGroup.LayoutParams layoutParams = this.f18329e.f57230b.getLayoutParams();
        int i11 = xb.f.i(this) - xb.f.a(this, 40.0f);
        layoutParams.width = i11;
        layoutParams.height = (int) (i11 / 4.0d);
        this.f18329e.f57230b.setLayoutParams(layoutParams);
        this.f18329e.f57229a.setOnClickListener(new View.OnClickListener() { // from class: od.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DakaActivity.this.c1(view);
            }
        });
        setContentView(this.f18329e.getRoot());
    }

    public static void g1(Context context) {
        h1(context, false);
    }

    public static void h1(Context context, boolean fromMainTab) {
        qb.c.i(f18327h, "try to start: fromMain = " + fromMainTab, new Object[0]);
        if (context == null) {
            qb.c.d(f18327h, "null == context", new Object[0]);
            return;
        }
        Intent intent = new Intent(context, (Class<?>) DakaActivity.class);
        intent.putExtra(f18328i, fromMainTab);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        context.startActivity(intent);
        l.e(ma.t.f73023v, ma.a.f72809o5, new HashMap(new b()));
    }

    private void init() {
        this.f18329e.j(this.f18330f);
        this.f18330f.p().observe(this, new c());
        this.f18330f.s().observe(this, new d());
        this.f18330f.w().observe(this, new Observer() { // from class: od.b
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                DakaActivity.this.W0((Void) obj);
            }
        });
        this.f18330f.t().observe(this, new e());
        this.f18330f.u().observe(this, new f());
        this.f18330f.v().observe(this, new g());
        this.f18330f.r().observe(this, new h());
        this.f18330f.q().observe(this, new i());
        this.f18330f.f76806f.observe(this, new Observer() { // from class: od.c
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                DakaActivity.this.X0((String) obj);
            }
        });
        this.f18330f.f76822v.observe(this, new Observer() { // from class: od.d
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                DakaActivity.this.Y0((Void) obj);
            }
        });
        this.f18330f.f76823w.observe(this, new Observer() { // from class: od.e
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                DakaActivity.this.a1((Boolean) obj);
            }
        });
        this.f18330f.f76824x.observe(this, new Observer() { // from class: od.f
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                DakaActivity.this.b1((Integer) obj);
            }
        });
        this.f18330f.start();
    }

    public final void T0() {
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this.f18329e.f57236h);
        constraintSet.setVisibility(R.id.ad_image_container, 8);
        constraintSet.setVisibility(R.id.ad_closed, 8);
        TransitionManager.beginDelayedTransition(this.f18329e.f57236h);
        constraintSet.applyTo(this.f18329e.f57236h);
    }

    public final void U0(ShareChannel shareChannel) {
        if (this.f18331g == null) {
            qb.c.d(f18327h, "null mSharePickerSheetView", new Object[0]);
            return;
        }
        UserDakaShareInfo value = this.f18330f.s().getValue();
        if (value == null) {
            qb.c.d(f18327h, "null userDakaShareInfo", new Object[0]);
            return;
        }
        ShareParams shareParams = new ShareParams();
        shareParams.f16061e = ShareParams.ShareType.WEB;
        shareParams.f16062f = R.drawable.iph_xueba;
        int i11 = a.f18332a[shareChannel.ordinal()];
        if (i11 == 1 || i11 == 2) {
            shareParams.f16057a = value.getQzone_share_url();
            shareParams.f16058b = value.getWeixin_share_title();
        } else if (i11 == 3) {
            shareParams.f16061e = ShareParams.ShareType.TEXT;
            shareParams.f16059c = value.getWeibo_share_txt();
            shareParams.f16060d = value.getWeibo_share_img_url();
        } else if (i11 == 4 || i11 == 5) {
            shareParams.f16059c = value.getWeibo_share_txt();
            shareParams.f16057a = value.getWeixin_share_url();
            shareParams.f16058b = value.getWeixin_share_title();
        }
        this.f18331g.l(shareParams);
    }

    public final /* synthetic */ void W0(Void r12) {
        ImageDakaV2Activity.f18406d.a(this);
    }

    public final /* synthetic */ void X0(String str) {
        BczWebExecutorKt.startNormalWeb(this, str);
    }

    public final /* synthetic */ void Y0(Void r12) {
        f1();
    }

    public final /* synthetic */ void Z0(DialogInterface dialogInterface, int i11) {
        dialogInterface.dismiss();
        l.a("notify-popup", i11 == -1 ? ma.a.f72720c0 : ma.a.f72727d0);
        if (i11 == -1) {
            BczWebExecutorKt.startNormalWeb(this, getString(R.string.url_2026_new_year));
        }
    }

    public final /* synthetic */ void a1(Boolean bool) {
        if (bool == null || !bool.booleanValue()) {
            return;
        }
        l.a("notify-popup", ma.a.f72713b0);
        Dialog f11 = va.e.f(this, R.drawable.ic_20xx_newyear, new DialogInterface.OnClickListener() { // from class: od.g
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                DakaActivity.this.Z0(dialogInterface, i11);
            }
        });
        f11.setCancelable(false);
        f11.show();
    }

    public final /* synthetic */ void b1(Integer num) {
        BczWebExecutorKt.startNormalWeb(this, getString(R.string.url_winning_streak_daka) + "&wordCount=" + num, "", false, 0, new BczWebWorker());
        finish();
    }

    public final /* synthetic */ void c1(View view) {
        T0();
    }

    public final void e1(UserDakaShareInfo userDakaShareInfo) {
        if (userDakaShareInfo == null) {
            return;
        }
        ShareParams shareParams = new ShareParams();
        shareParams.f16061e = ShareParams.ShareType.WEB;
        shareParams.f16057a = userDakaShareInfo.getWeixin_share_url();
        shareParams.f16058b = userDakaShareInfo.getWeixin_share_title();
        shareParams.f16060d = userDakaShareInfo.getWeibo_share_img_url();
        SharePickerSheetView sharePickerSheetView = this.f18331g;
        if (sharePickerSheetView == null) {
            this.f18331g = new SharePickerSheetView.a().e(true).d(shareParams).b(this.f18330f).a(this);
        } else {
            sharePickerSheetView.l(shareParams);
        }
        this.f18329e.f57233e.u();
        this.f18329e.f57233e.L(this.f18331g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f1() {
        mc.a.m(this, ((u) ((u.a) new u.a(this).X(R.drawable.ic_cake_dialog_pop_test).L(R.string.daka_page_cake_dialog_title).U(R.string.daka_page_cake_dialog_message).C(R.string.daka_page_cake_dialog_confirm)).d()).f0(new j()));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        SharePickerSheetView sharePickerSheetView = this.f18331g;
        if (sharePickerSheetView != null) {
            sharePickerSheetView.h(requestCode, resultCode, data);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        this.f18330f.B();
    }

    @Override // od.t, com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        V0();
        d1();
        init();
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }
}
