package com.baicizhan.main.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.splashscreen.SplashScreen;
import androidx.core.view.WindowCompat;
import ch.e0;
import com.baicizhan.base.BaseAppCompatActivity;
import com.baicizhan.client.business.dataset.models.UserRecord;
import com.baicizhan.client.business.util.ActivityLifeController;
import com.baicizhan.client.business.util.AdCommonHelper;
import com.baicizhan.client.business.util.ChannelUtils;
import com.baicizhan.client.business.util.DeviceUtil;
import com.baicizhan.client.business.util.FileUtils;
import com.baicizhan.client.business.util.Redirector;
import com.baicizhan.client.business.util.SpKeys;
import com.baicizhan.client.business.util.ThemeResUtil;
import com.baicizhan.client.business.util.navigate.NavigationIntent;
import com.baicizhan.client.business.util.navigate.NavigationIntentDescription;
import com.baicizhan.client.business.util.navigate.Navigator;
import com.baicizhan.client.business.util.navigate.OpenNavigateListener;
import com.baicizhan.client.business.webview.hwpay.HwPayManager;
import com.baicizhan.main.BaicizhanApp;
import com.baicizhan.main.activity.LoadingPageActivity;
import com.baicizhan.main.activity.protocol.ProtocolActivity;
import com.baicizhan.main.home.experiment.q0;
import com.baicizhan.main.rx.SchedulePrepareObservables;
import com.fm.openinstall.model.AppData;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.jiongji.andriod.card.R;
import com.tencent.connect.common.Constants;
import fd.i3;
import gi.k;
import gi.k0;
import java.util.HashMap;
import ma.l;
import ma.r;
import ma.t;
import me.jessyan.autosize.internal.CancelAdapt;
import me.o;
import pg.v0;
import q9.x;
import qb0.g;
import qb0.h;
import r9.e;
import r9.u;
import r9.v;
import r9.w;
import tf.i0;
import tf.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class LoadingPageActivity extends BaseAppCompatActivity implements View.OnClickListener, CancelAdapt {

    /* renamed from: n, reason: collision with root package name */
    public static final String f18050n = "LoadingPageActivity_tag";

    /* renamed from: o, reason: collision with root package name */
    public static final String f18051o = "from_notice";

    /* renamed from: p, reason: collision with root package name */
    public static final String f18052p = "intent";

    /* renamed from: q, reason: collision with root package name */
    public static final int f18053q = 100;

    /* renamed from: r, reason: collision with root package name */
    public static final String f18054r = "nav_data";

    /* renamed from: a, reason: collision with root package name */
    public View f18055a;

    /* renamed from: b, reason: collision with root package name */
    public ProgressBar f18056b;

    /* renamed from: c, reason: collision with root package name */
    public TextView f18057c;

    /* renamed from: d, reason: collision with root package name */
    public View f18058d;

    /* renamed from: e, reason: collision with root package name */
    public View f18059e;

    /* renamed from: f, reason: collision with root package name */
    public e.d f18060f;

    /* renamed from: g, reason: collision with root package name */
    public SplashScreen f18061g;

    /* renamed from: i, reason: collision with root package name */
    public h f18063i;

    /* renamed from: j, reason: collision with root package name */
    public h f18064j;

    /* renamed from: h, reason: collision with root package name */
    public int f18062h = 0;

    /* renamed from: k, reason: collision with root package name */
    public boolean f18065k = false;

    /* renamed from: l, reason: collision with root package name */
    public StartupNavigationType f18066l = StartupNavigationType.OTHERS;

    /* renamed from: m, reason: collision with root package name */
    public boolean f18067m = false;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends g<Integer> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f18068a;

        public a(final long val$current) {
            this.f18068a = val$current;
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            qb.c.b(LoadingPageActivity.f18050n, e11.toString(), new Object[0]);
        }

        @Override // qb0.c
        public void onNext(Integer result) {
            qb.c.b(LoadingPageActivity.f18050n, "onNext " + result, new Object[0]);
            qb.c.b(LoadingPageActivity.f18050n, "init consume total: " + (System.currentTimeMillis() - this.f18068a), new Object[0]);
            if (result.intValue() == -1) {
                va.g.i("初始化数据失败", 0);
                LoadingPageActivity.this.finish();
                return;
            }
            x.r().h0(true);
            LoadingPageActivity.this.f18062h = result.intValue();
            LoadingPageActivity.this.B1();
            i0.f90531a.g();
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends g<FileUtils.DirCopyProgress> {
        public b() {
        }

        @Override // qb0.c
        public void onCompleted() {
            LoadingPageActivity.this.f18056b.setProgress(LoadingPageActivity.this.f18056b.getMax());
            LoadingPageActivity.this.f18057c.setText("初始化即将完成");
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            qb.c.c(LoadingPageActivity.f18050n, "app root dir copy progress error: ", e11);
            LoadingPageActivity.this.f18057c.setText(LoadingPageActivity.this.getString(R.string.toast_init_error, e11.getMessage()));
        }

        @Override // qb0.c
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void onNext(FileUtils.DirCopyProgress progress) {
            LoadingPageActivity.this.f18055a.setVisibility(0);
            int max = LoadingPageActivity.this.f18056b.getMax();
            ProgressBar progressBar = LoadingPageActivity.this.f18056b;
            int i11 = progress.total;
            if (i11 != 0) {
                max = (max * progress.current) / i11;
            }
            progressBar.setProgress(max);
            qb.c.b(LoadingPageActivity.f18050n, "app root dir copy, total: " + progress.total + "; current: " + progress.current, new Object[0]);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e extends sl.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ hj.a f18074a;

        public e(final hj.a val$callback) {
            this.f18074a = val$callback;
        }

        @Override // sl.a
        public void b(@NonNull AppData appData) {
            qb.c.b(LoadingPageActivity.f18050n, "install: installedData = " + appData, new Object[0]);
            try {
                f fVar = (f) new com.google.gson.d().n(appData.getData(), f.class);
                this.f18074a.onResult(fVar != null ? fVar.f18076a : null);
            } catch (Exception e11) {
                qb.c.c(LoadingPageActivity.f18050n, "", e11);
                this.f18074a.onResult(null);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class f {

        /* renamed from: a, reason: collision with root package name */
        @wo.c(LoadingPageActivity.f18054r)
        public String f18076a;
    }

    public static void A1(Context context) {
        context.startActivity(new Intent(context, (Class<?>) LoadingPageActivity.class));
    }

    public static /* synthetic */ boolean K0() {
        return true;
    }

    public static /* synthetic */ boolean L0() {
        return false;
    }

    public static /* synthetic */ g2 M0() {
        va.g.i("请求剪贴板以识别口令", 0);
        return g2.f100423a;
    }

    private void i1() {
        this.f18055a = findViewById(R.id.copy_root_progress_wrap);
        this.f18057c = (TextView) findViewById(R.id.copy_root_progress_text);
        this.f18056b = (ProgressBar) findViewById(R.id.copy_root_progress);
        g1();
        this.f18058d = findViewById(R.id.ad_click_rect);
        View findViewById = findViewById(R.id.close);
        this.f18059e = findViewById;
        findViewById.setVisibility(4);
        this.f18058d.setOnClickListener(this);
        this.f18059e.setOnClickListener(this);
        if (k.l(this)) {
            return;
        }
        findViewById(R.id.extra_padding_top).setVisibility(8);
    }

    private void j1() {
        qb.c.b(f18050n, "start initializing", new Object[0]);
        if (nc.b.b().getBoolean(SpKeys.VERIFICATION_LOGIN_BINDING_UNDONE, false)) {
            qb.c.b(f18050n, "reset previous binding", new Object[0]);
            gi.e.t(this);
            c9.a.a();
            nc.b.b().j(SpKeys.VERIFICATION_LOGIN_BINDING_UNDONE, false);
        }
        dd.a.f47820a.b(getApplicationContext());
        long currentTimeMillis = System.currentTimeMillis();
        dc0.c y72 = dc0.c.y7();
        this.f18063i = th.g.l(this, y72).I3(tb0.a.a()).r5(new a(currentTimeMillis));
        this.f18064j = y72.R3().I3(tb0.a.a()).r5(new b());
        q.f90552a.a().d(this);
        HwPayManager.INSTANCE.checkHwPayEnv(this);
        AdCommonHelper.INSTANCE.initDefaultUAString(this);
    }

    public final void B1() {
        int i11 = this.f18062h;
        if (i11 == 0) {
            return;
        }
        v1(true, i11 == 1);
        e1();
    }

    public final void e1() {
        boolean i12 = MainTabActivity.i1(this, "", "", MainTabActivity.u1(this).startsWith(Constants.VIA_SHARE_TYPE_INFO), ((String) k0.c(this).first).startsWith("7"));
        if (!this.f18065k || !i12 || ia.a.a(GuideActivity.L0(), false)) {
            u.k().I3(tb0.a.a()).r5(new c());
        } else {
            GuideActivity.Q0(this, this.f18062h);
            finish();
        }
    }

    public final void f1(Runnable finalTask) {
        startActivity(new Intent(this, (Class<?>) IntroductionPageActivity.class));
        if (finalTask != null) {
            finalTask.run();
        }
        finish();
    }

    public final void g1() {
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{new ThemeResUtil.ShapeDrawableBuilder().with(this).setColor(getResources().getColor(R.color.main_color_weak_bg)).build(), new ClipDrawable(new ThemeResUtil.ShapeDrawableBuilder().with(this).setColor(getResources().getColor(R.color.main_color_link_blue)).build(), 3, 1)});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.progress);
        this.f18056b.setProgressDrawable(layerDrawable);
    }

    public final void h1() {
        UserRecord p11 = x.r().p();
        if (p11 != null && p11.getIsNewUser()) {
            t1();
            return;
        }
        TextView textView = (TextView) findViewById(R.id.thrid_exit_button);
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.third_ad_containner);
        View findViewById = findViewById(R.id.ad_bottom);
        if (constraintLayout == null || textView == null) {
            return;
        }
        u.f().d(new w(findViewById(R.id.third_ad), constraintLayout, findViewById, textView, (TextView) findViewById(R.id.ad_click_text), (TextView) findViewById(R.id.splash_ad_mark), (ImageView) findViewById(R.id.logo), (ImageView) findViewById(R.id.iv_copyright)), new r9.q() { // from class: fd.v1
            @Override // r9.q
            public final void a(boolean z11) {
                LoadingPageActivity.this.m1(z11);
            }
        }, new Runnable() { // from class: fd.w1
            @Override // java.lang.Runnable
            public final void run() {
                LoadingPageActivity.this.y1();
            }
        }, new v() { // from class: fd.x1
            @Override // r9.v
            public final void a() {
                LoadingPageActivity.this.z1();
            }
        });
    }

    public final boolean k1() {
        return x.r().l() > 0 && !eh.c.b(this, new x00.a() { // from class: fd.z1
            @Override // x00.a
            public final Object invoke() {
                return LoadingPageActivity.M0();
            }
        });
    }

    public final boolean l1() {
        o oVar = o.f73181a;
        return oVar.x() || oVar.z() != -1;
    }

    public final /* synthetic */ void m1(boolean z11) {
        if (z11 || this.f18067m || Build.VERSION.SDK_INT < 31) {
            t1();
            return;
        }
        y1();
        ((ImageView) findViewById(R.id.slogan_of_s)).setVisibility(0);
        this.mHandler.postDelayed(new Runnable() { // from class: fd.b2
            @Override // java.lang.Runnable
            public final void run() {
                LoadingPageActivity.this.t1();
            }
        }, 2000L);
    }

    public final /* synthetic */ void n1(String str) {
        gi.e.p(this, false, StartupNavigationType.OPEN_INSTALL, str);
        finish();
    }

    public final /* synthetic */ void o1() {
        String c11 = i3.c(getIntent().getData());
        if (TextUtils.isEmpty(c11)) {
            return;
        }
        Navigator.reportNavigation(this, c11, false, false);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode != 100) {
            return;
        }
        if (resultCode != -1) {
            finish();
        } else {
            this.f18067m = true;
            j1();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v11) {
        if (v11 == this.f18058d && this.f18060f != null) {
            new Redirector(this).redirect(this.f18060f.e());
        } else if (v11 == this.f18059e) {
            B1();
        }
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        qb.c.b(f18050n, "onCreate", new Object[0]);
        ActivityLifeController.get().register(this);
        setVolumeControlStream(3);
        qb.c.q(f18050n, "intent action " + getIntent().getAction(), new Object[0]);
        if (getIntent().getCategories() != null) {
            qb.c.q(f18050n, "intent categories " + TextUtils.join(",", getIntent().getCategories()), new Object[0]);
        }
        qb.c.i(f18050n, "[FLAG,taskid, isRoot], [%d, %d, %b]", Integer.valueOf(getIntent().getFlags()), Integer.valueOf(getTaskId()), Boolean.valueOf(isTaskRoot()));
        this.f18066l = i3.b(this);
        if (!isTaskRoot()) {
            Intent intent = getIntent();
            String action = intent.getAction();
            intent.getData();
            if (action != null) {
                qb.c.q(f18050n, "Main Activity is not the root. Finishing Main Activity instead of launching. " + intent, new Object[0]);
                if (l1() && q0.f21394a.c()) {
                    if ((intent.hasCategory("android.intent.category.LAUNCHER") && action.equals("android.intent.action.MAIN")) || (action.equals(CommonConstant.ACTION.HWID_SCHEME_URL) && i3.a(this.f18066l))) {
                        v1(false, gi.e.j());
                    } else if (action.equals(CommonConstant.ACTION.HWID_SCHEME_URL) && this.f18066l == StartupNavigationType.OPEN_INSTALL) {
                        w1(null);
                    }
                }
                finish();
                return;
            }
        }
        this.f18065k = GuideActivity.M0(this);
        WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
        this.f18061g = SplashScreen.installSplashScreen(this);
        s1();
        setContentView(R.layout.activity_loading_page);
        qb.c.b(f18050n, "start initViews", new Object[0]);
        i1();
        qb.c.b(f18050n, "end initViews", new Object[0]);
        SchedulePrepareObservables.P();
        qb.c.b(f18050n, "onCreate end", new Object[0]);
        e0.f8632a.a(this);
        if (l1()) {
            j1();
        } else {
            ProtocolActivity.f18891b.b(this, 100);
            overridePendingTransition(R.anim.alpha_fade_in, R.anim.alpha_fade_out);
        }
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, com.baicizhan.base.LoadingDialogActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (com.baicizhan.client.business.thrift.c.b() == null) {
            qb.c.d("", "BaicizhanThrifts has not been initialized.", new Object[0]);
        }
        h hVar = this.f18063i;
        if (hVar != null && !hVar.isUnsubscribed()) {
            this.f18063i.unsubscribe();
        }
        h hVar2 = this.f18064j;
        if (hVar2 != null && !hVar2.isUnsubscribed()) {
            this.f18064j.unsubscribe();
        }
        ActivityLifeController.get().unregister(this);
        u.f().m();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        return keyCode != 4 && super.onKeyDown(keyCode, event);
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        u.f().i();
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        u.f().l();
    }

    public final /* synthetic */ void p1(final String str) {
        f1(new Runnable() { // from class: fd.y1
            @Override // java.lang.Runnable
            public final void run() {
                qb.c.i(LoadingPageActivity.f18050n, "%s", str);
            }
        });
    }

    public final /* synthetic */ void q1(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Navigator.reportNavigation(this, str, true, false);
    }

    public final /* synthetic */ void r1(final String str) {
        f1(new Runnable() { // from class: fd.c2
            @Override // java.lang.Runnable
            public final void run() {
                LoadingPageActivity.this.q1(str);
            }
        });
    }

    public final void s1() {
        this.f18061g.setKeepOnScreenCondition(new SplashScreen.KeepOnScreenCondition() { // from class: fd.a2
            @Override // androidx.core.splashscreen.SplashScreen.KeepOnScreenCondition
            public final boolean shouldKeepOnScreen() {
                return LoadingPageActivity.K0();
            }
        });
    }

    public final void t1() {
        int i11 = this.f18062h;
        if (i11 == 1) {
            qb.c.i(f18050n, "Leave !!!!", new Object[0]);
            StartupNavigationType startupNavigationType = this.f18066l;
            if (startupNavigationType == StartupNavigationType.OPEN_INSTALL) {
                w1(new hj.a() { // from class: fd.d2
                    @Override // hj.a
                    public final void onResult(Object obj) {
                        LoadingPageActivity.this.n1((String) obj);
                    }
                });
            } else {
                gi.e.p(this, false, startupNavigationType, i3.c(getIntent().getData()));
                finish();
            }
        } else if (i11 == 2) {
            qb.c.i(f18050n, "mDelayedResult is reLogin, jump IntroductionPageActivity", new Object[0]);
            StartupNavigationType startupNavigationType2 = this.f18066l;
            if (startupNavigationType2 == StartupNavigationType.WE_CHAT) {
                f1(new Runnable() { // from class: fd.e2
                    @Override // java.lang.Runnable
                    public final void run() {
                        LoadingPageActivity.this.o1();
                    }
                });
            } else if (startupNavigationType2 == StartupNavigationType.OPEN_INSTALL) {
                w1(new hj.a() { // from class: fd.f2
                    @Override // hj.a
                    public final void onResult(Object obj) {
                        LoadingPageActivity.this.p1((String) obj);
                    }
                });
            } else {
                x1(new hj.a() { // from class: fd.g2
                    @Override // hj.a
                    public final void onResult(Object obj) {
                        LoadingPageActivity.this.r1((String) obj);
                    }
                });
            }
        } else {
            qb.c.d(f18050n, "unknown result: " + this.f18062h, new Object[0]);
        }
        u1();
    }

    public final void u1() {
        HashMap hashMap = new HashMap();
        hashMap.put("device_id", DeviceUtil.getUniqueID(this));
        hashMap.put("channel", ChannelUtils.getChannel(this));
        if (gi.e.j()) {
            l.e(t.f73003b, ma.a.f72864w4, hashMap);
        } else {
            l.g(t.f73003b, ma.a.f72864w4, hashMap);
        }
    }

    public final void v1(boolean cold, boolean loggedIn) {
        Uri data = getIntent().getData();
        qb.c.b(f18050n, "try to resolve common data", new Object[0]);
        if (data != null) {
            String queryParameter = data.getQueryParameter("pushId");
            String queryParameter2 = data.getQueryParameter("msgId");
            qb.c.i(f18050n, "pending report pushId: %s, msgId: %s - cold[%s] logged[%s]", queryParameter, queryParameter2, Boolean.valueOf(cold), Boolean.valueOf(loggedIn));
            if (!TextUtils.isEmpty(queryParameter)) {
                HashMap<String, String> b11 = !TextUtils.isEmpty(queryParameter2) ? ma.u.b(new String[]{"pushId", "msgId"}, new String[]{queryParameter, queryParameter2}) : ma.u.a("pushId", queryParameter);
                if (loggedIn) {
                    r.g().k(t.A, ma.a.f72730d3, b11);
                } else {
                    r.g().m(t.A, ma.a.f72730d3, b11);
                }
            }
            if (cold) {
                v0.f80507a.a();
                return;
            }
            String c11 = i3.c(data);
            StartupNavigationType startupNavigationType = this.f18066l;
            if (startupNavigationType == StartupNavigationType.OPEN_INSTALL || startupNavigationType == StartupNavigationType.WE_CHAT) {
                Navigator.reportNavigation(this, c11, false, loggedIn);
            }
            if (loggedIn) {
                if (k1()) {
                    Navigator.navigate(this, c11, new OpenNavigateListener() { // from class: fd.u1
                        @Override // com.baicizhan.client.business.util.navigate.OpenNavigateListener
                        public final void onOpenNavigate(NavigationIntentDescription navigationIntentDescription, NavigationIntent navigationIntent) {
                            LoadingPageActivity.S0(navigationIntentDescription, navigationIntent);
                        }
                    });
                } else {
                    qb.c.q(f18050n, "navigation not allowed!", new Object[0]);
                }
            }
        }
    }

    public final void w1(hj.a<String> callback) {
        qb.c.b(f18050n, "try to resolve open navigation data", new Object[0]);
        rl.c.l(getIntent(), new d(callback));
    }

    public final void x1(hj.a<String> callback) {
        qb.c.b(f18050n, "try to resolve open navigation installed data", new Object[0]);
        rl.c.f(new e(callback));
    }

    public final void y1() {
        this.f18061g.setKeepOnScreenCondition(new SplashScreen.KeepOnScreenCondition() { // from class: fd.h2
            @Override // androidx.core.splashscreen.SplashScreen.KeepOnScreenCondition
            public final boolean shouldKeepOnScreen() {
                return LoadingPageActivity.L0();
            }
        });
    }

    public final void z1() {
        ((BaicizhanApp) getApplication()).g();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends g<Object> {
        public c() {
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            LoadingPageActivity.this.h1();
            qb.c.c(LoadingPageActivity.f18050n, "requestAdInfo", e11);
        }

        @Override // qb0.c
        public void onNext(Object aVoid) {
            LoadingPageActivity.this.h1();
            qb.c.i(LoadingPageActivity.f18050n, "initThirdAd timeout %b", Boolean.valueOf(aVoid != null));
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements sl.e {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ hj.a f18072a;

        public d(final hj.a val$callback) {
            this.f18072a = val$callback;
        }

        @Override // sl.e
        public void a(@Nullable AppData appData, @Nullable tl.a error) {
            if (error == null && appData != null && !appData.isEmpty()) {
                c(appData);
                return;
            }
            hj.a aVar = this.f18072a;
            if (aVar != null) {
                aVar.onResult("");
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
        
            if (r5.f18073b.f18066l == com.baicizhan.main.activity.StartupNavigationType.WE_CHAT) goto L12;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void c(@androidx.annotation.NonNull com.fm.openinstall.model.AppData r6) {
            /*
                r5 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "woken: wakeupData = "
                r0.append(r1)
                r0.append(r6)
                java.lang.String r0 = r0.toString()
                r1 = 0
                java.lang.Object[] r2 = new java.lang.Object[r1]
                java.lang.String r3 = "LoadingPageActivity_tag"
                qb.c.b(r3, r0, r2)
                java.lang.String r6 = r6.getData()
                com.google.gson.d r0 = new com.google.gson.d     // Catch: java.lang.Exception -> L3d
                r0.<init>()     // Catch: java.lang.Exception -> L3d
                java.lang.Class<com.baicizhan.main.activity.LoadingPageActivity$f> r2 = com.baicizhan.main.activity.LoadingPageActivity.f.class
                java.lang.Object r6 = r0.n(r6, r2)     // Catch: java.lang.Exception -> L3d
                com.baicizhan.main.activity.LoadingPageActivity$f r6 = (com.baicizhan.main.activity.LoadingPageActivity.f) r6     // Catch: java.lang.Exception -> L3d
                java.lang.String r0 = r6.f18076a     // Catch: java.lang.Exception -> L3d
                boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L3d
                if (r0 != 0) goto L3f
                com.baicizhan.main.activity.LoadingPageActivity r0 = com.baicizhan.main.activity.LoadingPageActivity.this     // Catch: java.lang.Exception -> L3d
                com.baicizhan.main.activity.StartupNavigationType r0 = com.baicizhan.main.activity.LoadingPageActivity.Z0(r0)     // Catch: java.lang.Exception -> L3d
                com.baicizhan.main.activity.StartupNavigationType r2 = com.baicizhan.main.activity.StartupNavigationType.OPEN_INSTALL     // Catch: java.lang.Exception -> L3d
                if (r0 == r2) goto L49
                goto L3f
            L3d:
                r6 = move-exception
                goto L7b
            L3f:
                com.baicizhan.main.activity.LoadingPageActivity r0 = com.baicizhan.main.activity.LoadingPageActivity.this     // Catch: java.lang.Exception -> L3d
                com.baicizhan.main.activity.StartupNavigationType r0 = com.baicizhan.main.activity.LoadingPageActivity.Z0(r0)     // Catch: java.lang.Exception -> L3d
                com.baicizhan.main.activity.StartupNavigationType r2 = com.baicizhan.main.activity.StartupNavigationType.WE_CHAT     // Catch: java.lang.Exception -> L3d
                if (r0 != r2) goto L54
            L49:
                com.baicizhan.main.activity.LoadingPageActivity r0 = com.baicizhan.main.activity.LoadingPageActivity.this     // Catch: java.lang.Exception -> L3d
                java.lang.String r2 = r6.f18076a     // Catch: java.lang.Exception -> L3d
                boolean r4 = gi.e.j()     // Catch: java.lang.Exception -> L3d
                com.baicizhan.client.business.util.navigate.Navigator.reportNavigation(r0, r2, r1, r4)     // Catch: java.lang.Exception -> L3d
            L54:
                hj.a r0 = r5.f18072a     // Catch: java.lang.Exception -> L3d
                if (r0 != 0) goto L75
                com.baicizhan.main.activity.LoadingPageActivity r0 = com.baicizhan.main.activity.LoadingPageActivity.this     // Catch: java.lang.Exception -> L3d
                boolean r0 = com.baicizhan.main.activity.LoadingPageActivity.c1(r0)     // Catch: java.lang.Exception -> L3d
                if (r0 != 0) goto L68
                java.lang.String r6 = "woken: navigation not allowed!"
                java.lang.Object[] r0 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L3d
                qb.c.q(r3, r6, r0)     // Catch: java.lang.Exception -> L3d
                return
            L68:
                com.baicizhan.main.activity.LoadingPageActivity r0 = com.baicizhan.main.activity.LoadingPageActivity.this     // Catch: java.lang.Exception -> L3d
                java.lang.String r6 = r6.f18076a     // Catch: java.lang.Exception -> L3d
                fd.i2 r1 = new fd.i2     // Catch: java.lang.Exception -> L3d
                r1.<init>()     // Catch: java.lang.Exception -> L3d
                com.baicizhan.client.business.util.navigate.Navigator.navigate(r0, r6, r1)     // Catch: java.lang.Exception -> L3d
                return
            L75:
                java.lang.String r6 = r6.f18076a     // Catch: java.lang.Exception -> L3d
                r0.onResult(r6)     // Catch: java.lang.Exception -> L3d
                return
            L7b:
                hj.a r0 = r5.f18072a
                java.lang.String r1 = ""
                if (r0 == 0) goto L84
                r0.onResult(r1)
            L84:
                qb.c.c(r3, r1, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.activity.LoadingPageActivity.d.c(com.fm.openinstall.model.AppData):void");
        }

        public static /* synthetic */ void b(NavigationIntentDescription navigationIntentDescription, NavigationIntent navigationIntent) {
        }
    }

    public static /* synthetic */ void S0(NavigationIntentDescription navigationIntentDescription, NavigationIntent navigationIntent) {
    }
}
