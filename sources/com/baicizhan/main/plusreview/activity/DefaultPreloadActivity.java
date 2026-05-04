package com.baicizhan.main.plusreview.activity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import com.baicizhan.base.BaseAppCompatActivity;
import com.baicizhan.client.business.dataset.models.UserRecord;
import com.baicizhan.client.business.util.ThemeUtil;
import com.baicizhan.main.global.AppPageStatus;
import com.baicizhan.main.plusreview.data.MatchTestCache;
import com.baicizhan.main.plusreview.data.MatchTestlib;
import com.baicizhan.main.plusreview.data.load.MatchTestLoader;
import com.baicizhan.main.rx.SchedulePrepareObservables;
import com.baicizhan.main.selftest.activity.WalkListenActivity;
import com.baicizhan.online.advertise_api.AdvertiseLoadingModule;
import com.baicizhan.online.user_study_api.ModuleResourceType;
import com.jiongji.andriod.card.R;
import gi.f0;
import gi.m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import q9.x;
import qb0.g;
import qb0.h;
import r9.b;
import sh.f;
import sh.k;
import sh.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class DefaultPreloadActivity extends BaseAppCompatActivity implements MatchTestLoader.OnDownloadListener {

    /* renamed from: j, reason: collision with root package name */
    public static final String f24563j = "DefaultPreload_TAG";

    /* renamed from: k, reason: collision with root package name */
    public static final String f24564k = "type";

    /* renamed from: l, reason: collision with root package name */
    public static final int f24565l = 5;

    /* renamed from: a, reason: collision with root package name */
    public int f24566a;

    /* renamed from: b, reason: collision with root package name */
    public MatchTestLoader f24567b;

    /* renamed from: c, reason: collision with root package name */
    public h f24568c;

    /* renamed from: d, reason: collision with root package name */
    public h f24569d;

    /* renamed from: g, reason: collision with root package name */
    public r9.b f24572g;

    /* renamed from: h, reason: collision with root package name */
    public e f24573h;

    /* renamed from: e, reason: collision with root package name */
    public Handler f24570e = new Handler();

    /* renamed from: f, reason: collision with root package name */
    public Runnable f24571f = null;

    /* renamed from: i, reason: collision with root package name */
    public boolean f24574i = false;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends g<Boolean> {
        public a() {
        }

        @Override // qb0.c
        public void onNext(Boolean aBoolean) {
            if (aBoolean.booleanValue()) {
                if (DefaultPreloadActivity.this.f24569d != null) {
                    DefaultPreloadActivity.this.f24569d.unsubscribe();
                }
                DefaultPreloadActivity.this.e1();
            }
        }

        @Override // qb0.c
        public void onCompleted() {
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements Callable<Object> {
        public c() {
        }

        @Override // java.util.concurrent.Callable
        public Object call() throws Exception {
            k.D().L();
            return null;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DefaultPreloadActivity.this.R0();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e implements b.d {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<DefaultPreloadActivity> f24579a;

        @Override // r9.b.d
        public void a() {
            DefaultPreloadActivity defaultPreloadActivity = this.f24579a.get();
            if (defaultPreloadActivity == null) {
                return;
            }
            defaultPreloadActivity.f24574i = true;
            defaultPreloadActivity.N0();
        }

        public e(DefaultPreloadActivity activity) {
            this.f24579a = new WeakReference<>(activity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N0() {
        qb.c.b("CommonPreloadActivity", "ready count " + k.D().z(), new Object[0]);
        if (k.D().z() > 0 && this.f24574i && !isFinishing()) {
            if (this.f24571f == null) {
                this.f24571f = new d();
            }
            this.f24570e.postDelayed(this.f24571f, this.f24572g.k());
        }
    }

    private void Y0() {
        if (!k.D().A()) {
            va.g.g(R.string.no_word, 0);
            finish();
        } else {
            this.f24568c = k.D().y().I3(tb0.a.a()).r5(new b());
            k.D().Q(this);
            rx.c.z2(new c()).w5(bc0.c.e()).p5();
        }
    }

    public static boolean Z0(Context context, int type) {
        if (type != 23 && type != 5 && type != 4 && type != 6 && type != 24 && type != 21 && type != 22 && type != 7 && type != 3) {
            qb.c.d(f24563j, "ERROR type %d", Integer.valueOf(type));
            return false;
        }
        qb.c.i(f24563j, "type %d", Integer.valueOf(type));
        Intent intent = new Intent(context, (Class<?>) DefaultPreloadActivity.class);
        intent.putExtra("type", type);
        context.startActivity(intent);
        return true;
    }

    public static boolean a1(Context context) {
        return Z0(context, 22);
    }

    public static boolean b1(Context context) {
        return Z0(context, 21);
    }

    public static boolean c1(Context context) {
        return Z0(context, 3);
    }

    public static boolean d1(Context context) {
        return Z0(context, 23);
    }

    public static boolean f1(Context context) {
        return Z0(context, 6);
    }

    public static boolean g1(Context context) {
        return Z0(context, 24);
    }

    public static boolean h1(Context context) {
        return Z0(context, 5);
    }

    public static boolean i1(Context context) {
        return Z0(context, 7);
    }

    public static boolean j1(Context context) {
        return Z0(context, 4);
    }

    public final void O0() {
        gi.e.u(this);
        finish();
    }

    public final void P0() {
        DefaultReviewActivity.U1(this);
    }

    public final void Q0() {
        DefaultReviewActivity.V1(this);
    }

    public final void R0() {
        int i11 = this.f24566a;
        if (i11 == 3) {
            S0();
        } else if (i11 == 4) {
            X0();
        } else if (i11 == 5) {
            V0();
        } else if (i11 == 6) {
            U0();
        } else if (i11 != 7) {
            switch (i11) {
                case 21:
                    Q0();
                    break;
                case 22:
                    P0();
                    break;
                case 23:
                    T0();
                    break;
                case 24:
                    DefaultReviewActivity.T1(this, 24);
                    break;
            }
        } else {
            W0();
        }
        finish();
    }

    public final void S0() {
        DefaultReviewActivity.W1(this);
    }

    public final void T0() {
        DefaultReviewActivity.X1(this);
    }

    public final void U0() {
        MatchReviewActivity.a1(this);
    }

    public final void V0() {
        DefaultReviewActivity.Y1(this);
    }

    public final void W0() {
        WalkListenActivity.C1(this);
    }

    public final void X0() {
        DefaultReviewActivity.Z1(this);
    }

    public final void e1() {
        x.r().z0(true);
        String g11 = f.g(x.r().l(), this.f24566a);
        x r11 = x.r();
        int i11 = this.f24566a;
        int u11 = r11.u(g11, m.a(i11, m.b(i11)));
        qb.c.i(f24563j, "TYPE %d, remainder %d", Integer.valueOf(this.f24566a), Integer.valueOf(u11));
        int i12 = this.f24566a;
        if (6 == i12) {
            MatchTestLoader createInstance = MatchTestLoader.createInstance(this, this);
            this.f24567b = createInstance;
            createInstance.load();
            return;
        }
        if (5 == i12) {
            x.r().a(4);
            ad.a s11 = x.r().s();
            if (s11 == null) {
                O0();
                return;
            }
            s11.h(50, sh.e.c());
            List<yc.b> y11 = s11.u().y(0, 50);
            ArrayList arrayList = new ArrayList();
            Iterator<yc.b> it = y11.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(it.next().e0()));
            }
            k.D().C(new o(s11.u()));
            Y0();
            return;
        }
        x.r().a(4);
        ad.a s12 = x.r().s();
        if (s12 == null) {
            O0();
            return;
        }
        int i13 = this.f24566a;
        if (21 == i13 || 22 == i13) {
            s12.B(u11, sh.e.c());
        } else if (7 == i13) {
            yh.d.d().h();
            int a11 = m.a(7, 50);
            if (x.r().t(g11) < a11 || a11 <= 0) {
                yh.d.d().j(x.r().u(g11, a11));
            }
        } else {
            s12.h(u11, sh.e.c());
        }
        if (7 != this.f24566a) {
            k.D().C(new o(s12.u()));
        } else {
            k.D().C(yh.d.d().f());
        }
        Y0();
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.mClosedFit = true;
        ThemeUtil.setThemeOnAppCompatActivityCreate(this);
        if (x.r().c(this)) {
            return;
        }
        setVolumeControlStream(3);
        setContentView(R.layout.advertisement_layout);
        this.f24573h = new e();
        this.f24572g = r9.b.i(this, null).q(AdvertiseLoadingModule.MODULE_MAIN).p(this.f24573h);
        UserRecord p11 = x.r().p();
        if (p11 != null && p11.getIsNewUser()) {
            this.f24572g.u(true);
        }
        this.f24572g.m();
        Uri data = getIntent().getData();
        if (data != null) {
            this.f24566a = dh.b.a(ModuleResourceType.findByValue(Integer.parseInt(data.getQueryParameter("type"))));
        }
        if (this.f24566a == 0) {
            this.f24566a = getIntent().getIntExtra("type", -1);
        }
        f0.b(this, f0.f53762b);
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, com.baicizhan.base.LoadingDialogActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Runnable runnable = this.f24571f;
        if (runnable != null) {
            this.f24570e.removeCallbacks(runnable);
        }
        MatchTestLoader matchTestLoader = this.f24567b;
        if (matchTestLoader != null) {
            matchTestLoader.destroy();
        }
        r9.b bVar = this.f24572g;
        if (bVar != null) {
            bVar.h();
        }
        h hVar = this.f24568c;
        if (hVar != null && !hVar.isUnsubscribed()) {
            this.f24568c.unsubscribe();
        }
        h hVar2 = this.f24569d;
        if (hVar2 == null || hVar2.isUnsubscribed()) {
            return;
        }
        this.f24569d.unsubscribe();
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        h hVar = this.f24569d;
        if (hVar != null && !hVar.isUnsubscribed()) {
            this.f24569d.unsubscribe();
        }
        this.f24569d = null;
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f24569d != null) {
            return;
        }
        this.f24569d = SchedulePrepareObservables.E().I3(tb0.a.a()).r5(new a());
        ig.b.f60539a.c(AppPageStatus.STUDY_REINFORCE);
    }

    @Override // com.baicizhan.main.plusreview.data.load.MatchTestLoader.OnDownloadListener
    public void onTestlibLoaded(boolean success, MatchTestlib data, int errCode) {
        if (!success) {
            va.g.i(errCode != -2 ? errCode != -1 ? getString(R.string.plusreview_match_review_unkonwn_err) : getString(R.string.plusreview_match_review_net_err) : getString(R.string.plusreview_match_review_not_enough), 0);
            finish();
            return;
        }
        MatchTestCache.getCache().setTestlib(data);
        qb.c.b("whiz", "loaded match test data: " + data, new Object[0]);
        qb.c.b("whiz", "finish today for text, init data: " + data.getUnfinishedTopicIds(Integer.MAX_VALUE), new Object[0]);
        k.D().C(new sh.b(data.getUnfinishedTopicIds(Integer.MAX_VALUE)));
        Y0();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends g<f> {
        public b() {
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            qb.c.c(DefaultPreloadActivity.f24563j, "preload problems failed.", e11);
            va.g.g(R.string.main_unknown_info, 1);
            DefaultPreloadActivity.this.finish();
        }

        @Override // qb0.c
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void onNext(f problemAsset) {
            DefaultPreloadActivity.this.N0();
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }
}
