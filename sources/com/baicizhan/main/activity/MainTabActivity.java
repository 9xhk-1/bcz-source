package com.baicizhan.main.activity;

import android.app.Dialog;
import android.content.ClipData;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.view.DragEvent;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.core.util.Pair;
import androidx.databinding.DataBindingUtil;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import ch.d0;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;
import com.aurelhubert.ahbottomnavigation.a;
import com.aurelhubert.ahbottomnavigation.notification.AHNotification;
import com.baicizhan.client.business.dataset.models.BookRecord;
import com.baicizhan.client.business.dataset.models.UserRecord;
import com.baicizhan.client.business.managers.booklist.BookListManager;
import com.baicizhan.client.business.util.ActivityLifeController;
import com.baicizhan.client.business.util.AutoSizeMgr;
import com.baicizhan.client.business.util.BottomSheetUtils;
import com.baicizhan.client.business.util.StorageUtils;
import com.baicizhan.client.business.util.StoreEntryJumper;
import com.baicizhan.client.business.util.ThemeUtil;
import com.baicizhan.client.business.util.TimeUtil;
import com.baicizhan.client.business.util.navigate.NavigationIntent;
import com.baicizhan.client.business.util.navigate.NavigationIntentDescription;
import com.baicizhan.client.business.util.navigate.Navigator;
import com.baicizhan.client.business.util.navigate.OpenNavigateListener;
import com.baicizhan.client.business.webview.BczWebExecutorKt;
import com.baicizhan.client.business.webview.ui.BczWebFragment;
import com.baicizhan.framework.common.magicdialog.ButtonType;
import com.baicizhan.main.activity.MainTabActivity;
import com.baicizhan.main.activity.idenity.UserGradleActivity;
import com.baicizhan.main.activity.lookup.LookupWordActivity;
import com.baicizhan.main.activity.schedule_v2.AllBooksActivity;
import com.baicizhan.main.activity.schedule_v2.IdentityBooksActivity;
import com.baicizhan.main.home.plan.PrioritizedTask;
import com.baicizhan.main.home.plan.WordPlanFragment;
import com.baicizhan.main.receiver.NetworkChangeReceiver;
import com.baicizhan.main.rx.SchedulePrepareObservables;
import com.baicizhan.online.user_study_api.UserDakaShareInfo;
import com.baicizhan.online.user_study_api.UserLimitInfoV2;
import com.flipboard.bottomsheet.BottomSheetLayout;
import com.google.android.material.timepicker.TimeModel;
import com.jiongji.andriod.card.R;
import fd.e1;
import gi.k0;
import gi.x;
import gs.g1;
import hj.p;
import i9.m;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import kc.r;
import kc.u;
import ma.l;
import ma.t;
import pg.u0;
import q9.x;
import qg.l0;
import yg.h1;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@qu.b
/* loaded from: classes4.dex */
public class MainTabActivity extends e1 implements WordPlanFragment.f, AHBottomNavigation.g, zf.a, BczWebFragment.OnFragmentInteractionListener, x.a {
    public static final String O = "MainTabActivity";
    public static final String P = "extra_has_login";
    public static final String Q = "extra_to_words";
    public static final String R = "extra_pending_uri";
    public static final String S = "tabId";
    public static final String T = "extra_pending_nav_type";
    public static final String U = "current_tab_idx";
    public static final int V = 2;
    public static final int W = 3;
    public static final int X = 4;
    public static final int Y = 2;
    public static final int Z = 3;

    /* renamed from: f0, reason: collision with root package name */
    public static final int f18077f0 = 1;

    /* renamed from: f1, reason: collision with root package name */
    public static final int f18078f1 = 2;

    /* renamed from: h1, reason: collision with root package name */
    public static final int f18079h1 = 3;

    /* renamed from: i1, reason: collision with root package name */
    public static final int f18080i1 = 0;

    /* renamed from: j1, reason: collision with root package name */
    public static final int f18081j1 = 1;

    /* renamed from: k1, reason: collision with root package name */
    public static final int f18082k1 = 2;

    /* renamed from: l1, reason: collision with root package name */
    public static final int f18083l1 = 3;

    /* renamed from: m1, reason: collision with root package name */
    public static final int f18084m1 = 4;

    /* renamed from: n1, reason: collision with root package name */
    public static final int f18085n1 = 5;

    /* renamed from: o1, reason: collision with root package name */
    public static final int f18086o1 = 6;

    /* renamed from: p1, reason: collision with root package name */
    public static final int f18087p1 = 7;
    public de.a A;
    public bh.c D;

    @Inject
    public l0 E;
    public String F;
    public Pair<Long, Long> J;
    public NetworkChangeReceiver K;
    public qb0.h M;

    /* renamed from: f, reason: collision with root package name */
    public int f18089f;

    /* renamed from: k, reason: collision with root package name */
    public long f18094k;

    /* renamed from: m, reason: collision with root package name */
    public va.f f18096m;

    /* renamed from: n, reason: collision with root package name */
    public h1 f18097n;

    /* renamed from: s, reason: collision with root package name */
    public int f18102s;

    /* renamed from: u, reason: collision with root package name */
    public g1 f18104u;

    /* renamed from: x, reason: collision with root package name */
    public qb0.h f18107x;

    /* renamed from: z, reason: collision with root package name */
    public qb0.h f18109z;

    /* renamed from: e, reason: collision with root package name */
    public boolean f18088e = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f18090g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f18091h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f18092i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f18093j = false;

    /* renamed from: l, reason: collision with root package name */
    public gi.c f18095l = new gi.c();

    /* renamed from: o, reason: collision with root package name */
    public boolean f18098o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f18099p = false;

    /* renamed from: q, reason: collision with root package name */
    public int[] f18100q = {0, 4};

    /* renamed from: r, reason: collision with root package name */
    public fi.c f18101r = new fi.c(this);

    /* renamed from: t, reason: collision with root package name */
    public int f18103t = 0;

    /* renamed from: v, reason: collision with root package name */
    public AHNotification f18105v = new AHNotification.b().d("1").c(true).a();

    /* renamed from: w, reason: collision with root package name */
    public ec0.b f18106w = new ec0.b();

    /* renamed from: y, reason: collision with root package name */
    public volatile boolean f18108y = false;
    public boolean B = false;
    public Map<Integer, qb0.h> C = new HashMap();
    public boolean G = false;
    public String H = null;
    public StartupNavigationType I = null;
    public final DefaultLifecycleObserver L = new b();
    public int N = 0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Callable<Boolean> {
        public a() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() throws Exception {
            gi.e.q(MainTabActivity.this);
            return Boolean.TRUE;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements DefaultLifecycleObserver {

        /* renamed from: a, reason: collision with root package name */
        public boolean f18111a = false;

        public b() {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onResume(@NonNull LifecycleOwner owner) {
            if (this.f18111a) {
                return;
            }
            qb.c.i(MainTabActivity.O, "one-time wfs start and refresh", new Object[0]);
            MainTabActivity mainTabActivity = MainTabActivity.this;
            p.i(mainTabActivity, mainTabActivity);
            this.f18111a = true;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends qb0.g<Boolean> {
        public c() {
        }

        @Override // qb0.c
        public void onNext(Boolean aBoolean) {
            ad.c u11 = x.r().s().u();
            if (u11 != null && u11.k() >= 1 && u11.o() > 0) {
                l.a(t.f73003b, ma.a.B);
            }
            if (MainTabActivity.this.M == null || MainTabActivity.this.M.isUnsubscribed()) {
                return;
            }
            MainTabActivity.this.M.unsubscribe();
            MainTabActivity.this.M = null;
        }

        @Override // qb0.c
        public void onCompleted() {
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d extends qb0.g<Boolean> {
        public d() {
        }

        @Override // qb0.c
        public void onCompleted() {
            MainTabActivity.this.f18108y = true;
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            qb.c.c(MainTabActivity.O, "", e11);
        }

        @Override // qb0.c
        public void onNext(Boolean aBoolean) {
            u0.f80487a.y();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e extends qb0.g<SchedulePrepareObservables.f0> {

        /* renamed from: a, reason: collision with root package name */
        public int f18115a = 0;

        /* renamed from: b, reason: collision with root package name */
        public String f18116b = "";

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f18117c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends r {
            public a() {
            }

            @Override // kc.r, kc.q
            public void onDialogPositiveClick(@NonNull View v11) {
                MainTabActivity.this.T1();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class b extends r {
            public b() {
            }

            @Override // kc.r, kc.q
            public void onDialogNegativeClick(@NonNull View view) {
                MainTabActivity.this.T1();
            }

            @Override // kc.r, kc.q
            public void onDialogPositiveClick(@NonNull View v11) {
                MainTabActivity.this.V1(null);
                MainTabActivity.this.m1(1);
            }
        }

        public e(final int val$requestFlag) {
            this.f18117c = val$requestFlag;
        }

        @Override // qb0.c
        public void onCompleted() {
            if (MainTabActivity.this.f2(this.f18115a, this.f18116b)) {
                return;
            }
            MainTabActivity.this.N1(this.f18117c);
            if (MainTabActivity.this.e2(this.f18115a)) {
                this.f18115a = 0;
                this.f18116b = "";
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qb0.c
        public void onError(Throwable e11) {
            MainTabActivity.this.v1();
            qb.c.p(MainTabActivity.O, "PrepareException ", e11);
            if (!(e11 instanceof SchedulePrepareObservables.PrepareException)) {
                u0.f80487a.o().postValue(e11);
                return;
            }
            int code = ((SchedulePrepareObservables.PrepareException) e11).getCode();
            if (code == 1) {
                MainTabActivity.this.T1();
                return;
            }
            if (code == 2) {
                MainTabActivity.this.r1(((SchedulePrepareObservables.ForceSelectException) e11).grade);
                return;
            }
            if (code == 3) {
                if (rb.d.f(MainTabActivity.this)) {
                    AllBooksActivity.e1(MainTabActivity.this);
                    MainTabActivity.this.T1();
                    return;
                } else {
                    MainTabActivity mainTabActivity = MainTabActivity.this;
                    mc.a.n(mainTabActivity, ((u) new u.a(mainTabActivity).V("请联网，选择学习计划后，才能继续使用").b0(ButtonType.SINGLE_POSITIVE).d()).f0(new a()), "no-network");
                    return;
                }
            }
            if (code == 4) {
                MainTabActivity mainTabActivity2 = MainTabActivity.this;
                mc.a.n(mainTabActivity2, ((u) ((u.a) ((u.a) new u.a(mainTabActivity2).U(R.string.main_alert_no_road_map_info).C(R.string.main_alert_no_road_map_confirm)).n(R.string.main_alert_no_road_map_cancel)).d()).f0(new b()), "res-error");
            } else if (code == 6) {
                MainTabActivity.this.startActivity(new Intent(MainTabActivity.this, (Class<?>) IntroductionPageActivity.class));
                MainTabActivity.this.T1();
            } else if (code != 7) {
                va.g.i(e11.getMessage(), 1);
            } else {
                MainTabActivity.this.q1();
            }
        }

        @Override // qb0.c
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void onNext(SchedulePrepareObservables.f0 result) {
            qb.c.b(MainTabActivity.O, "load result status: " + result.f24849b, new Object[0]);
            this.f18115a = this.f18115a | result.f24849b;
            if (TextUtils.isEmpty(this.f18116b)) {
                this.f18116b = TextUtils.isEmpty(result.f24848a) ? "" : result.f24848a;
            }
            int i11 = result.f24849b;
            if (i11 == 4 || i11 == 8) {
                MainTabActivity.this.v1();
                MainTabActivity.this.M1();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class f extends r {
        public f() {
        }

        @Override // kc.r, kc.q
        public void onDialogPositiveClick(@NonNull View v11) {
            MainTabActivity.this.J1();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class g extends r {
        public g() {
        }

        @Override // kc.r, kc.q
        public void onDialogPositiveClick(@NonNull View v11) {
            MainTabActivity.this.T1();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class j extends qb0.g<Boolean> {
        public j() {
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            qb.c.c(MainTabActivity.O, "try relogin failed. ", e11);
            MainTabActivity.this.v1();
            MainTabActivity.this.T1();
        }

        @Override // qb0.c
        public void onNext(Boolean aBoolean) {
            MainTabActivity.this.v1();
            MainTabActivity.this.startActivity(new Intent(MainTabActivity.this, (Class<?>) IntroductionPageActivity.class));
            MainTabActivity.this.T1();
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class k {

        /* renamed from: a, reason: collision with root package name */
        public static final int f18127a = 0;

        /* renamed from: b, reason: collision with root package name */
        public static final int f18128b = 1;

        /* renamed from: c, reason: collision with root package name */
        public static final int f18129c = 2;

        /* renamed from: d, reason: collision with root package name */
        public static final int f18130d = 3;

        /* renamed from: e, reason: collision with root package name */
        public static final int f18131e = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J1() {
        qb0.h hVar = this.C.get(5);
        if (hVar == null || hVar.isUnsubscribed()) {
            qb0.h r52 = rx.c.z2(new a()).w5(bc0.c.a()).I3(tb0.a.a()).r5(new j());
            this.f18106w.a(r52);
            this.C.put(5, r52);
        }
    }

    public static void X1(Context context) {
        Y1(context, false);
    }

    public static void Y1(Context context, boolean isLogin) {
        Z1(context, isLogin, true);
    }

    public static void Z1(Context context, boolean isLogin, boolean notifyFinish) {
        a2(context, isLogin, notifyFinish, false);
    }

    public static void a2(Context context, boolean isLogin, boolean notifyFinish, boolean toWords) {
        if (notifyFinish) {
            ActivityLifeController.get().finishAll();
        }
        Intent intent = new Intent(context, (Class<?>) MainTabActivity.class);
        intent.putExtra(P, isLogin);
        intent.putExtra(Q, toWords);
        context.startActivity(intent);
    }

    public static boolean i1(Context context, String from, String to2, boolean ignoreFrom, boolean ignoreTo) {
        String u12 = u1(context);
        if (ignoreFrom || (!TextUtils.isEmpty(u12) && u12.equals(from))) {
            return ignoreTo || to2.equals(k0.c(context).first);
        }
        return false;
    }

    public static String u1(Context context) {
        String g11 = i9.f.g(context, i9.f.f60373g0, false);
        return g11 != null ? g11 : "";
    }

    public final /* synthetic */ g2 A1(Boolean bool) {
        if (bool.booleanValue()) {
            return null;
        }
        this.f18101r.c();
        return null;
    }

    public final /* synthetic */ boolean B1(View view, DragEvent dragEvent) {
        Log.d(O, "action: " + dragEvent.getAction());
        if (dragEvent.getAction() == 3) {
            if (dragEvent.getClipData().getItemCount() > 0 && dragEvent.getClipDescription().getMimeType(0).contentEquals("text/plain")) {
                ClipData.Item itemAt = dragEvent.getClipData().getItemAt(0);
                CharSequence text = itemAt.getText();
                Log.d(O, "text: " + ((Object) text));
                if (!TextUtils.isEmpty(text)) {
                    LookupWordActivity.o1(this, itemAt.getText());
                    return true;
                }
            }
        } else {
            if (dragEvent.getAction() == 1) {
                this.f18104u.f54977c.setForeground(getDrawable(R.drawable.fg_drag_area_highlight));
                return true;
            }
            if (dragEvent.getAction() == 4) {
                this.f18104u.f54977c.setForeground(null);
            }
        }
        return false;
    }

    public final /* synthetic */ void C1(SparseBooleanArray sparseBooleanArray) {
        int i11 = 0;
        if (!this.f18099p) {
            while (i11 < 5) {
                this.f18104u.f54976b.M((sparseBooleanArray == null || !sparseBooleanArray.get(i11)) ? null : this.f18105v, i11);
                i11++;
            }
        } else {
            while (true) {
                int[] iArr = this.f18100q;
                if (i11 >= iArr.length) {
                    return;
                }
                this.f18104u.f54976b.M((sparseBooleanArray == null || !sparseBooleanArray.get(iArr[i11])) ? null : this.f18105v, i11);
                i11++;
            }
        }
    }

    public final /* synthetic */ void D1(Boolean bool) {
        if (bool == null || !bool.booleanValue()) {
            return;
        }
        P1();
    }

    public final /* synthetic */ void E1(Integer num) {
        qb.c.b(O, "low priority task: %d", num);
        if (num.intValue() == 2) {
            g2();
        }
        if (num.intValue() == 0 || this.K != null) {
            return;
        }
        qb.c.b(O, "low priority task: register net change receiver", new Object[0]);
        NetworkChangeReceiver networkChangeReceiver = new NetworkChangeReceiver();
        this.K = networkChangeReceiver;
        NetworkChangeReceiver.b(this, networkChangeReceiver);
    }

    public final /* synthetic */ void F1(zg.g gVar) {
        if (this.f18104u.f54976b.getItemsCount() == 0) {
            z1(gVar);
        } else {
            j2(gVar);
        }
    }

    public final /* synthetic */ void G1(NavigationIntentDescription navigationIntentDescription, NavigationIntent navigationIntent) {
        StartupNavigationType startupNavigationType = this.I;
        if (startupNavigationType == StartupNavigationType.OPEN_INSTALL || startupNavigationType == StartupNavigationType.WE_CHAT) {
            Navigator.reportNavigation(this, navigationIntentDescription, navigationIntent, false, true);
        }
    }

    public final /* synthetic */ void H1(String str, int i11, Map map, DialogInterface dialogInterface, int i12) {
        if (i12 != -1 || TextUtils.isEmpty(str)) {
            if (i12 == -2) {
                l.e(t.f73010i, i11 == 1 ? ma.a.H0 : ma.a.E0, map);
            }
        } else {
            BczWebExecutorKt.startNormalWeb(this, str);
            l.e(t.f73010i, i11 == 1 ? ma.a.G0 : ma.a.D0, map);
            dialogInterface.dismiss();
        }
    }

    public final /* synthetic */ g2 I1(String str, final int i11, final String str2, Bitmap bitmap) {
        final HashMap hashMap = new HashMap();
        hashMap.put("id", str);
        hashMap.put("adv_id", str);
        l.e(t.f73010i, i11 == 1 ? ma.a.F0 : ma.a.C0, hashMap);
        Dialog h11 = va.e.h(this, bitmap, new DialogInterface.OnClickListener() { // from class: fd.s2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i12) {
                MainTabActivity.this.H1(str2, i11, hashMap, dialogInterface, i12);
            }
        });
        h11.setCancelable(false);
        h11.show();
        return null;
    }

    @Override // com.aurelhubert.ahbottomnavigation.AHBottomNavigation.g
    public void K(int position) {
        qb.c.i(O, TimeModel.f32588i, Integer.valueOf(position));
    }

    public final int K1(int displayIndex) {
        if (!this.f18099p) {
            return displayIndex;
        }
        int[] iArr = this.f18100q;
        return displayIndex < iArr.length ? iArr[displayIndex] : displayIndex;
    }

    public final void L1() {
        this.D.f();
    }

    public final void M1() {
        qb.c.b(O, ">>> onPrepared ....", new Object[0]);
        u0.f80487a.y();
    }

    public final void N1(int initRequestFlag) {
        this.f18089f = 0;
        if (!this.B) {
            c2();
        }
        if ((initRequestFlag & 32) > 0) {
            h1();
            w1();
        }
        if ((initRequestFlag & 1) > 0) {
            x.a aVar = new x.a();
            aVar.f53865b = true;
            i80.c.f().q(aVar);
        }
        o1();
    }

    public void O1() {
        BottomSheetUtils.showBaicizhanAppStoreBottomSheet(this, this.f18104u.f54975a, "打开方式", new BottomSheetUtils.PraiseStatsCallback(this));
    }

    public boolean P1() {
        boolean z11 = true;
        int i11 = 0;
        if (!BookListManager.getInstance().isLockModify()) {
            boolean z12 = TimeUtil.getBetweenDays(System.currentTimeMillis(), this.f18094k) > 0;
            int F0 = q9.x.r().F0() | this.f18089f;
            if (this.f18091h || z12) {
                F0 |= 33;
            }
            if (F0 <= 0 && !this.f18092i) {
                z11 = false;
            }
            i11 = F0;
        } else if (!hi.e.e(this)) {
            z11 = false;
        }
        if (z11) {
            m1(i11);
        }
        return z11;
    }

    public final void Q1() {
        this.f18097n.L(b2());
        this.f18097n.J().observe(this, new Observer() { // from class: fd.p2
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                MainTabActivity.this.F1((zg.g) obj);
            }
        });
        this.f18097n.I().observe(this, new Observer() { // from class: fd.q2
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                MainTabActivity.this.h2((Boolean) obj);
            }
        });
    }

    public final void R1() {
        qb.c.b(O, "resolvePendingLaunch %s", Boolean.valueOf(this.H != null));
        String str = this.H;
        if (str != null) {
            Navigator.navigate(this, str, new OpenNavigateListener() { // from class: fd.o2
                @Override // com.baicizhan.client.business.util.navigate.OpenNavigateListener
                public final void onOpenNavigate(NavigationIntentDescription navigationIntentDescription, NavigationIntent navigationIntent) {
                    MainTabActivity.this.G1(navigationIntentDescription, navigationIntent);
                }
            });
            this.H = null;
        }
    }

    public final void S1() {
        long j11;
        long j12;
        long j13;
        try {
            j12 = !TextUtils.isEmpty(this.F) ? gi.e.h(this.F) : 0L;
            try {
                j13 = gi.e.h(k0.a(this));
            } catch (Exception e11) {
                long j14 = j12;
                e = e11;
                j11 = j14;
                qb.c.c(O, "", e);
                j12 = j11;
                j13 = 0;
                qb.c.i(O, "calculated version code: " + j12 + " -> " + j13, new Object[0]);
                long h11 = gi.e.h("7.2.1");
                if (j12 != 0) {
                    return;
                } else {
                    return;
                }
            }
        } catch (Exception e12) {
            e = e12;
            j11 = 0;
        }
        qb.c.i(O, "calculated version code: " + j12 + " -> " + j13, new Object[0]);
        long h112 = gi.e.h("7.2.1");
        if (j12 != 0 || j12 > h112 || j13 == 0 || j13 <= h112) {
            return;
        }
        p.h(this, this);
    }

    public final void T1() {
        q9.x.r().d();
        q9.x.r().e();
        com.baicizhan.client.business.thrift.c.b().b(O);
        ia.a.l(ia.a.f60460k, 0L);
        finish();
    }

    public final void U1(final int pos) {
        final String o11;
        String m11;
        final String n11;
        if (pos == 1) {
            d0 d0Var = d0.f8623a;
            o11 = d0Var.o();
            m11 = d0Var.m();
            n11 = d0Var.n();
            d0Var.k();
        } else {
            ch.j jVar = ch.j.f8636a;
            o11 = jVar.o();
            m11 = jVar.m();
            n11 = jVar.n();
            jVar.k();
        }
        if (TextUtils.isEmpty(m11) || TextUtils.isEmpty(o11)) {
            return;
        }
        hc.c.p(m11).l(new x00.l() { // from class: fd.j2
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 I1;
                I1 = MainTabActivity.this.I1(o11, pos, n11, (Bitmap) obj);
                return I1;
            }
        }, null);
    }

    public void V1(String message) {
        if (this.f18096m.isShowing()) {
            qb.c.i(O, "isShowing", new Object[0]);
            this.f18096m.f(message);
        } else {
            qb.c.i(O, "loading", new Object[0]);
            this.f18096m.f(message);
            this.f18096m.show();
        }
    }

    public final void W1() {
        p1();
        qb.d.d(true);
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context newBase) {
        super.attachBaseContext(com.baicizhan.base.d.a(newBase));
    }

    public final boolean b2() {
        return StoreEntryJumper.shouldJumpToTaobao(this, StoreEntryJumper.TAOBAO_STORE_DEFAULT, 0);
    }

    public final void c2() {
        this.f18106w.e(this.C.get(2));
        qb0.h r52 = dg.b.g(this).I3(tb0.a.a()).r5(new h());
        this.f18106w.a(r52);
        this.C.put(2, r52);
    }

    public void d2() {
        if (q9.x.r().p() == null) {
            UserRecord c11 = m.c(this);
            if (c11 != null) {
                q9.x.r().q0(c11);
            } else {
                T1();
            }
        }
    }

    public final boolean e2(int resultStatus) {
        if (((resultStatus & 4) <= 0 && (resultStatus & 8) <= 0) || (resultStatus & 2) <= 0) {
            return false;
        }
        if (this.f18090g) {
            qb.c.i(O, "REFRESH AGAIN %d", Integer.valueOf(resultStatus));
            m1(1);
        } else {
            this.f18089f |= 1;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean f2(int status, String msg) {
        if (((status & 4) <= 0 && (status & 8) <= 0) || (status & 32) <= 0) {
            return false;
        }
        u.a aVar = new u.a(this);
        if (TextUtils.isEmpty(msg)) {
            msg = "登录过期";
        }
        mc.a.n(this, ((u) ((u.a) aVar.V(msg).C(R.string.verification_dialog_token_invalid)).b0(ButtonType.SINGLE_POSITIVE).d()).f0(new f()), "expired");
        return true;
    }

    public final void g2() {
        if (this.f18099p) {
            qb.c.b(O, "updateCourseTab: skipped in care mode", new Object[0]);
            return;
        }
        String t12 = t1(true);
        qb.c.b(O, "updateCourseTab: " + t12, new Object[0]);
        if (TextUtils.isEmpty(t12)) {
            return;
        }
        com.aurelhubert.ahbottomnavigation.a o11 = this.f18104u.f54976b.o(1);
        if (t12.equals(o11.f(this))) {
            qb.c.i(O, "tab training config: no change", new Object[0]);
        } else {
            o11.o(t12);
            this.f18104u.f54976b.C();
        }
    }

    @Override // zf.a, com.baicizhan.client.business.webview.ui.BczWebFragment.OnFragmentInteractionListener
    public BottomSheetLayout getBottomSheetLayout() {
        g1 g1Var = this.f18104u;
        if (g1Var == null) {
            return null;
        }
        return g1Var.f54975a;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        AutoSizeMgr.INSTANCE.adjust(super.getResources());
        return super.getResources();
    }

    @Override // com.baicizhan.client.business.webview.ui.BczWebFragment.OnFragmentInteractionListener
    public FrameLayout getVideoContainer() {
        return null;
    }

    public final void h1() {
        this.f18106w.e(this.C.get(3));
        BookRecord k11 = q9.x.r().k();
        qb0.h r52 = SchedulePrepareObservables.v(this, k11).I3(tb0.a.a()).r5(new i(k11));
        this.f18106w.a(r52);
        this.C.put(3, r52);
    }

    public final void h2(Boolean isLiving) {
        com.aurelhubert.ahbottomnavigation.a o11;
        if (this.f18099p || (o11 = this.f18104u.f54976b.o(1)) == null) {
            return;
        }
        a.C0186a c0186a = new a.C0186a();
        c0186a.f11324a = "直播中";
        c0186a.f11325b = R.drawable.bg_bottom_badge_round;
        if (!isLiving.booleanValue()) {
            c0186a = null;
        }
        o11.h(c0186a);
        this.f18104u.f54976b.C();
    }

    public final void i2(int position) {
        zg.g gVar;
        com.aurelhubert.ahbottomnavigation.a o11;
        if (this.f18099p || (o11 = this.f18104u.f54976b.o(3)) == null) {
            gVar = null;
        } else {
            gVar = (zg.g) o11.e();
            if (position == 3 && b2() && gVar != null && gVar.l() != 1) {
                this.f18098o = true;
                StoreEntryJumper.getInstance().jump(this, "app_main");
                l.a(t.f73003b, ma.a.f72880z);
                this.f18097n.U(b2(), 2, gVar);
                return;
            }
        }
        this.f18103t = position;
        this.f18104u.f54979e.setCurrentItem(position, false);
        if (position == 1) {
            l.a(t.f73003b, ma.a.f72873y);
            U1(position);
        } else if (position == 2) {
            HashMap hashMap = new HashMap();
            zd.a aVar = zd.a.f102549a;
            hashMap.put("id", aVar.c() ? aVar.b() : "1");
            l.e(t.f73020s, ma.a.V1, hashMap);
            zd.c.f102553a.a();
            if (aVar.c()) {
                this.D.k(4);
            }
            U1(position);
            zb.a.f(this, true);
        } else if (position == 3) {
            StoreEntryJumper.getInstance().recordJumpTime(this);
            l.a(t.f73003b, ma.a.f72880z);
            if (gVar != null) {
                this.f18097n.U(b2(), 1, gVar);
            }
        } else if (position == 4) {
            l.a(t.f73003b, ma.a.A);
        }
        if (position != 2) {
            zd.c.f102553a.c();
        }
    }

    public final void j1() {
        qb.c.b(O, "doOneTimeNetworkTask: guide: " + this.G, new Object[0]);
        if (this.f18093j || !rb.d.f(this) || this.G) {
            return;
        }
        fi.e.f51879a.a(this, new x00.l() { // from class: fd.r2
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 A1;
                A1 = MainTabActivity.this.A1((Boolean) obj);
                return A1;
            }
        });
        this.f18093j = true;
    }

    public final void j2(zg.g tabItemSimple) {
        com.aurelhubert.ahbottomnavigation.a o11;
        if (this.f18099p || (o11 = this.f18104u.f54976b.o(3)) == null) {
            return;
        }
        o11.o(tabItemSimple.o());
        o11.p(tabItemSimple.r());
        o11.l(tabItemSimple.m());
        o11.m(tabItemSimple);
        this.f18104u.f54976b.C();
    }

    public final void k1() {
        if (this.f18108y) {
            return;
        }
        qb0.h hVar = this.f18109z;
        if (hVar == null || hVar.isUnsubscribed()) {
            qb0.h r52 = th.e.i(this).I3(tb0.a.a()).r5(new d());
            this.f18109z = r52;
            this.f18106w.a(r52);
        }
    }

    public void l1() {
        Log.d(O, "pending flag: " + this.N);
        if (this.N != 0) {
            this.N = 0;
            m1(0);
        }
    }

    public final void m1(final int requestFlag) {
        qb0.h hVar = this.f18107x;
        if (hVar == null || hVar.isUnsubscribed() || requestFlag != this.f18089f) {
            this.f18089f = requestFlag;
            this.f18106w.e(this.f18107x);
            qb0.h r52 = SchedulePrepareObservables.F(this, requestFlag).I3(tb0.a.a()).r5(new e(requestFlag));
            this.f18107x = r52;
            this.f18106w.a(r52);
            if (requestFlag > 0 && this.f18091h) {
                V1(null);
            }
            this.f18092i = false;
            this.f18091h = false;
            this.f18088e = true;
            this.f18094k = System.currentTimeMillis();
        }
    }

    public final void n1() {
        if (P1()) {
            return;
        }
        qb.c.b(O, ">>> onPrepared direct ....", new Object[0]);
        M1();
        o1();
    }

    public final void o1() {
        j1();
        k1();
        L1();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (isFinishing()) {
            return;
        }
        super.onActivityResult(requestCode, resultCode, data);
        hg.b bVar = (hg.b) getSupportFragmentManager().findFragmentByTag(hg.b.f59252b);
        if (bVar != null) {
            bVar.onActivityResult(requestCode, resultCode, data);
        }
        if (requestCode == 3) {
            if (resultCode == -1 && data != null && data.getBooleanExtra(fc.a.f51504a, false)) {
                q9.x.r().a(1);
            }
        } else if (requestCode == 4 && resultCode == 0) {
            T1();
        }
        if (resultCode == 2) {
            ia.a.l(ia.a.f60460k, 0L);
            T1();
        } else {
            if (resultCode != 3) {
                return;
            }
            qb.c.b(O, "result reload theme", new Object[0]);
            if (this.f18102s != ThemeUtil.getCurrentAppCompatSettingThemeId()) {
                qb.c.b(O, "go result reload theme", new Object[0]);
                ThemeUtil.updateTheme(this);
            }
        }
    }

    @Override // fd.e1, com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        qb.c.b(O, "onCreate", new Object[0]);
        qb.c.i(O, "[FLAG,taskid, isRoot], [%d, %d, %b]", Integer.valueOf(getIntent().getFlags()), Integer.valueOf(getTaskId()), Boolean.valueOf(isTaskRoot()));
        long currentTimeMillis = System.currentTimeMillis();
        UserRecord p11 = q9.x.r().p();
        if (p11 != null) {
            uf.b.g(String.valueOf(p11.getUniqueId()));
        }
        this.f18102s = ThemeUtil.getCurrentAppCompatSettingThemeId();
        if (savedInstanceState != null) {
            this.f18103t = savedInstanceState.getInt(U, 0);
        }
        ThemeUtil.setThemeOnAppCompatActivityCreate(this);
        if (savedInstanceState != null) {
            this.f18088e = savedInstanceState.getBoolean(P);
        } else {
            this.f18088e = getIntent().getBooleanExtra(P, false);
        }
        super.onCreate(savedInstanceState);
        if (!q9.x.r().L()) {
            finish();
            overridePendingTransition(R.anim.business_no_fade_long, R.anim.business_no_fade_long);
            startActivity(new Intent(this, (Class<?>) LoadingPageActivity.class));
            overridePendingTransition(R.anim.business_no_fade_long, R.anim.business_no_fade_long);
            return;
        }
        this.f18097n = (h1) new ViewModelProvider(this).get(h1.class);
        q9.x.r().h0(true);
        q9.x.r().f0(this);
        ActivityLifeController.get().register(this);
        overridePendingTransition(R.anim.business_push_left_in, R.anim.business_push_left_out);
        setVolumeControlStream(3);
        c9.a.m(null);
        this.f18104u = (g1) DataBindingUtil.setContentView(this, R.layout.activity_main_tab);
        va.f fVar = new va.f(this);
        this.f18096m = fVar;
        fVar.setCancelable(false);
        y1();
        x1();
        Q1();
        W1();
        this.f18091h = true;
        i80.c.f().v(this);
        this.F = u1(this);
        S1();
        u0.f80487a.s().observe(this, new Observer() { // from class: fd.k2
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                MainTabActivity.this.D1((Boolean) obj);
            }
        });
        this.H = getIntent().getStringExtra(R);
        this.I = (StartupNavigationType) getIntent().getSerializableExtra(T);
        qb.c.b(O, "onCreate: time consumed " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
        getLifecycle().addObserver(this.L);
    }

    @Override // fd.e1, com.baicizhan.base.BaseAppCompatActivity, com.baicizhan.base.LoadingDialogActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        fi.c cVar = this.f18101r;
        if (cVar != null) {
            cVar.d();
        }
        this.C.clear();
        ec0.b bVar = this.f18106w;
        if (bVar != null) {
            bVar.unsubscribe();
        }
        va.f fVar = this.f18096m;
        if (fVar != null) {
            fVar.dismiss();
        }
        gi.c cVar2 = this.f18095l;
        if (cVar2 != null) {
            cVar2.a();
        }
        NetworkChangeReceiver networkChangeReceiver = this.K;
        if (networkChangeReceiver != null) {
            NetworkChangeReceiver.c(this, networkChangeReceiver);
            this.K = null;
        }
        if (com.baicizhan.client.business.thrift.c.b() != null) {
            com.baicizhan.client.business.thrift.c.b().b(O);
        }
        getLifecycle().removeObserver(this.L);
        p.k(this);
        ActivityLifeController.get().unregister(this);
        i80.c.f().A(this);
        this.J = null;
        q9.x.r().G0(this);
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity
    public boolean onEarlySystemBarSetting() {
        return true;
    }

    @i80.l
    public void onEventMainThread(ah.a event) {
        qb.c.b(O, "onEventMainThread: offline refresh", new Object[0]);
        int l11 = q9.x.r().l();
        if (sh.d.s().n() != l11) {
            sh.d.s().x(this, l11);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == 4) {
            if (this.f18104u.f54975a.C()) {
                this.f18104u.f54975a.u();
                return false;
            }
            if (moveTaskToBack(true)) {
                return false;
            }
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        int intExtra = intent.getIntExtra(S, 0);
        setIntent(intent);
        if (intent.getBooleanExtra(Q, false) || intExtra == 0) {
            this.f18104u.f54976b.setCurrentItem(0);
        }
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f18090g = false;
        this.f18104u.f54975a.u();
        q9.x.r().i0(false);
        ma.r.g().l();
        zd.c.f102553a.c();
        this.f18097n.o0(false);
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        ai.a.e().c(this);
        this.f18097n.o0(true);
        this.f18097n.P();
        ig.b.f60539a.b();
    }

    @Override // androidx.fragment.app.FragmentActivity
    public void onResumeFragments() {
        super.onResumeFragments();
        qb.c.b(O, "onResumeFragments", new Object[0]);
        this.f18090g = true;
        q9.x.r().z0(false);
        boolean z11 = this.f18098o;
        if (z11 || this.f18103t < 0) {
            if (z11) {
                this.f18098o = false;
            }
            this.f18104u.f54976b.setCurrentItem(0);
        }
        d2();
        n1();
        HashMap hashMap = new HashMap();
        hashMap.put(ma.b.U1, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS);
        l.e(t.f73003b, ma.a.f72705a, hashMap);
        qb0.h hVar = this.M;
        if (hVar != null && !hVar.isUnsubscribed()) {
            this.M.unsubscribe();
        }
        this.M = SchedulePrepareObservables.E().I3(tb0.a.a()).V1(new wb0.p() { // from class: fd.u2
            @Override // wb0.p
            public final Object call(Object obj) {
                return MainTabActivity.L0((Boolean) obj);
            }
        }).r5(new c());
        if (this.f18103t == 2) {
            zd.c.f102553a.a();
        }
        d0.f8623a.q();
        ch.j.f8636a.q();
        ma.r.g().l();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        qb.c.b(O, "onSaveInstanceState", new Object[0]);
        outState.putBoolean(P, this.f18088e);
        outState.putInt(U, this.f18103t);
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        qb0.h hVar;
        super.onStart();
        this.f18092i = !this.f18091h && ((hVar = this.f18107x) == null || hVar.isUnsubscribed());
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            th.k.d(this, this.E).u5(new wb0.b() { // from class: fd.m2
                @Override // wb0.b
                public final void call(Object obj) {
                    MainTabActivity.this.E1((Integer) obj);
                }
            }, new wb0.b() { // from class: fd.n2
                @Override // wb0.b
                public final void call(Object obj) {
                    qb.c.c(MainTabActivity.O, "onWindowFocusChanged ", (Throwable) obj);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [kc.d, kc.h] */
    public final void p1() {
        long j11;
        String h11 = i9.j.h(i9.j.f60412c);
        if (TextUtils.isEmpty(h11)) {
            return;
        }
        try {
            j11 = StorageUtils.getAvailableBytes(h11);
        } catch (Exception e11) {
            qb.c.c(O, "", e11);
            j11 = 104857600;
        }
        if (j11 < gi.e.f53744c) {
            mc.a.n(this, ((u) new u.a(this).L(R.string.attention).V(getString(R.string.main_insufficient_storage_space, 100L)).b0(ButtonType.SINGLE_POSITIVE).d()).f0(new g()), "no-space-exit");
        } else if (j11 < gi.e.f53746e) {
            mc.a.n(this, new u.a(this).L(R.string.attention).V(getString(R.string.main_warning_insufficient_storage_space, 300L)).b0(ButtonType.SINGLE_POSITIVE).d(), "no-space");
        }
    }

    public final void q1() {
        UserGradleActivity.o1(this, 0);
    }

    @Override // com.aurelhubert.ahbottomnavigation.AHBottomNavigation.g
    public boolean r(int position, boolean wasSelected) {
        qb.c.i(O, "%d %b", Integer.valueOf(position), Boolean.valueOf(wasSelected));
        if (!wasSelected) {
            i2(K1(position));
        }
        return !wasSelected;
    }

    public final void r1(int grade) {
        qb.c.b(O, "forceSelectSchedule " + q9.x.r().o() + " grade :" + grade, new Object[0]);
        if (grade != 0) {
            IdentityBooksActivity.f18933o.a(this, grade, "", 4, 1);
        } else {
            AllBooksActivity.g1(this, "", 4, 1);
        }
    }

    public int s1() {
        return this.f18103t;
    }

    public final String t1(boolean refresh) {
        Object c11;
        String obj = (!y9.e.f().e(y9.c.f99703k) || (c11 = y9.e.f().c(y9.c.f99703k, "text")) == null) ? null : c11.toString();
        qb.c.b(O, "getLocalCourseTabName: %s, %s", obj, Boolean.valueOf(refresh));
        return (TextUtils.isEmpty(obj) && refresh) ? getString(R.string.main_tab_name_training) : obj;
    }

    @Override // q9.x.a
    public void v(UserLimitInfoV2 pre, UserLimitInfoV2 now) {
        long j11 = pre == null ? 0L : pre.collect_words_updated_at;
        long j12 = now != null ? now.collect_words_updated_at : 0L;
        qb.c.i(O, "cur = %s ---- [%s, %s]", this.J, Long.valueOf(j11), Long.valueOf(j12));
        Pair<Long, Long> pair = this.J;
        if (pair != null) {
            if (pair.first.longValue() == j11 && this.J.second.longValue() == j12) {
                return;
            }
            if (pre != null && now != null && pre.collect_words_updated_at == now.collect_words_updated_at) {
                return;
            }
        }
        this.J = new Pair<>(Long.valueOf(j11), Long.valueOf(j12));
        qb.c.i(O, "onUserLimitUpdate to refresh", new Object[0]);
        p.i(this, this);
    }

    public void v1() {
        qb.c.i(O, "hideProgressDialog", new Object[0]);
        this.f18096m.dismiss();
    }

    public final void w1() {
        this.f18106w.e(this.C.get(4));
        qb0.h p52 = th.e.h(this, q9.x.r().l()).I3(tb0.a.a()).p5();
        this.f18106w.a(p52);
        this.C.put(4, p52);
    }

    public final void x1() {
        this.f18104u.f54977c.setOnDragListener(new View.OnDragListener() { // from class: fd.t2
            @Override // android.view.View.OnDragListener
            public final boolean onDrag(View view, DragEvent dragEvent) {
                boolean B1;
                B1 = MainTabActivity.this.B1(view, dragEvent);
                return B1;
            }
        });
    }

    @Override // com.baicizhan.main.home.plan.WordPlanFragment.f
    public void y(@NonNull PrioritizedTask task) {
        qb.c.b("MainTabActivity.Tasks", "new prioritized tasks: " + task, new Object[0]);
        this.G = task instanceof PrioritizedTask.NewUser;
        if (task instanceof PrioritizedTask.Done) {
            R1();
        }
    }

    public final void y1() {
        this.D = (bh.c) new ViewModelProvider(this).get(bh.c.class);
    }

    public final void z1(zg.g tabItemSimple) {
        String[] stringArray = getResources().getStringArray(R.array.main_tabs);
        boolean z11 = tabItemSimple.l() != 1;
        int[] iArr = {R.drawable.ic_state_word, R.drawable.ic_state_course, R.drawable.ic_state_together, z11 ? R.drawable.ic_state_taobao : R.drawable.ic_state_mall, R.drawable.ic_state_mine};
        if (stringArray.length != 5) {
            throw new RuntimeException("Not supported tab configuration");
        }
        String t12 = t1(false);
        if (!TextUtils.isEmpty(t12)) {
            stringArray[1] = t12;
        }
        stringArray[3] = getResources().getString(z11 ? R.string.main_tab_name_store : R.string.main_tab_name_store_mall);
        boolean a11 = com.baicizhan.base.a.a(this);
        this.f18099p = a11;
        if (a11) {
            for (int i11 : this.f18100q) {
                com.aurelhubert.ahbottomnavigation.a aVar = new com.aurelhubert.ahbottomnavigation.a(stringArray[i11], iArr[i11]);
                aVar.p(true);
                this.f18104u.f54976b.g(aVar);
            }
        } else {
            for (int i12 = 0; i12 < stringArray.length; i12++) {
                com.aurelhubert.ahbottomnavigation.a aVar2 = new com.aurelhubert.ahbottomnavigation.a(stringArray[i12], iArr[i12]);
                aVar2.p(true);
                this.f18104u.f54976b.g(aVar2);
            }
        }
        float a12 = xb.i.a(this, this.f18099p ? 14.0f : 10.0f);
        this.f18104u.f54976b.setTitleState(AHBottomNavigation.TitleState.ALWAYS_SHOW);
        this.f18104u.f54976b.P(a12, a12);
        this.f18104u.f54976b.setAccentColor(Color.parseColor("#283044"));
        this.f18104u.f54976b.setInactiveColor(Color.parseColor("#9CA6B8"));
        this.f18104u.f54976b.setDefaultBackgroundColor(-1);
        this.f18104u.f54976b.setNotificationBackground(ContextCompat.getDrawable(this, R.drawable.ic_unread_red_dot));
        this.f18104u.f54976b.setOnTabSelectedListener(this);
        j2(tabItemSimple);
        h2(Boolean.valueOf(this.f18097n.I().getValue() != null ? this.f18097n.I().getValue().booleanValue() : false));
        this.D.f6822c.observe(this, new Observer() { // from class: fd.l2
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                MainTabActivity.this.C1((SparseBooleanArray) obj);
            }
        });
        this.A = new de.a(getSupportFragmentManager(), getLifecycle());
        this.f18104u.f54979e.setSaveEnabled(false);
        this.f18104u.f54979e.setAdapter(this.A);
        this.f18104u.f54979e.setUserInputEnabled(false);
        this.f18104u.f54979e.setOffscreenPageLimit(3);
        this.f18104u.f54979e.setCurrentItem(0, false);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class h extends qb0.g<UserDakaShareInfo> {
        public h() {
        }

        @Override // qb0.c
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void onNext(UserDakaShareInfo dakaShareInfo) {
            if (dakaShareInfo != null) {
                bg.c.d(MainTabActivity.this, dakaShareInfo.special_days);
                MainTabActivity.this.B = true;
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
    public class i extends qb0.g<Void> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ BookRecord f18124a;

        public i(final BookRecord val$bookRecord) {
            this.f18124a = val$bookRecord;
        }

        @Override // qb0.c
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void onNext(Void aVoid) {
            BookRecord bookRecord = this.f18124a;
            if (bookRecord.localRoadmapVer != bookRecord.remoteRoadmapVer) {
                q9.x.r().a(1);
            }
        }

        @Override // qb0.c
        public void onCompleted() {
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
        }
    }

    @Override // com.baicizhan.client.business.webview.ui.BczWebFragment.OnFragmentInteractionListener
    public void onShareDefault() {
    }

    public static /* synthetic */ Boolean L0(Boolean bool) {
        return bool;
    }

    @Override // com.baicizhan.client.business.webview.ui.BczWebFragment.OnFragmentInteractionListener
    public void addJavascriptInterfaces(WebView webView) {
    }

    @Override // com.baicizhan.client.business.webview.ui.BczWebFragment.OnFragmentInteractionListener
    public void onSetShareVisibility(int visibility) {
    }

    @Override // com.baicizhan.client.business.webview.ui.BczWebFragment.OnFragmentInteractionListener
    public void onSetTitle(String title) {
    }

    @Override // com.baicizhan.client.business.webview.ui.BczWebFragment.OnFragmentInteractionListener
    public void onActionBar(int bgColor, boolean iconBlack) {
    }

    @Override // com.baicizhan.client.business.webview.ui.BczWebFragment.OnFragmentInteractionListener
    public void onSetCloseVisibility(int visibility, int type) {
    }
}
