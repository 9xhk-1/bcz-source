package com.tencent.bugly.proguard;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.baicizhan.main.activity.SingleFragmentActivity;
import com.bumptech.glide.load.engine.GlideException;
import com.tencent.bugly.BuglyStrategy;
import com.tencent.bugly.crashreport.biz.UserInfoBean;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.proguard.r.a;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f42639a = false;

    /* renamed from: b, reason: collision with root package name */
    public static r f42640b = null;

    /* renamed from: c, reason: collision with root package name */
    private static int f42641c = 10;

    /* renamed from: d, reason: collision with root package name */
    private static long f42642d = 300000;

    /* renamed from: e, reason: collision with root package name */
    private static long f42643e = 30000;

    /* renamed from: f, reason: collision with root package name */
    private static long f42644f = 0;

    /* renamed from: g, reason: collision with root package name */
    private static int f42645g = 0;

    /* renamed from: h, reason: collision with root package name */
    private static long f42646h = 0;

    /* renamed from: i, reason: collision with root package name */
    private static long f42647i = 0;

    /* renamed from: j, reason: collision with root package name */
    private static long f42648j = 0;

    /* renamed from: k, reason: collision with root package name */
    private static Application.ActivityLifecycleCallbacks f42649k = null;

    /* renamed from: l, reason: collision with root package name */
    private static Class<?> f42650l = null;

    /* renamed from: m, reason: collision with root package name */
    private static boolean f42651m = true;

    public static void a(final Context context, final BuglyStrategy buglyStrategy) {
        long j11;
        if (f42639a) {
            return;
        }
        f42651m = aa.a(context).f42189f;
        f42640b = new r(context, f42651m);
        f42639a = true;
        if (buglyStrategy != null) {
            f42650l = buglyStrategy.getUserInfoActivity();
            j11 = buglyStrategy.getAppReportDelay();
        } else {
            j11 = 0;
        }
        if (j11 <= 0) {
            c(context, buglyStrategy);
        } else {
            ak.a().a(new Runnable() { // from class: com.tencent.bugly.proguard.s.1
                @Override // java.lang.Runnable
                public final void run() {
                    s.c(context, buglyStrategy);
                }
            }, j11);
        }
    }

    public static /* synthetic */ int g() {
        int i11 = f42645g;
        f42645g = i11 + 1;
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Context context, BuglyStrategy buglyStrategy) {
        boolean z11;
        boolean z12;
        if (buglyStrategy != null) {
            z12 = buglyStrategy.recordUserInfoOnceADay();
            z11 = buglyStrategy.isEnableUserInfo();
        } else {
            z11 = true;
            z12 = false;
        }
        if (z12) {
            aa a11 = aa.a(context);
            List<UserInfoBean> a12 = r.a(a11.f42187d);
            if (a12 != null) {
                for (int i11 = 0; i11 < a12.size(); i11++) {
                    UserInfoBean userInfoBean = a12.get(i11);
                    if (userInfoBean.f42070n.equals(a11.f42198o) && userInfoBean.f42058b == 1) {
                        long b11 = ap.b();
                        if (b11 <= 0) {
                            break;
                        }
                        if (userInfoBean.f42061e >= b11) {
                            if (userInfoBean.f42062f <= 0) {
                                f42640b.b();
                                return;
                            }
                            return;
                        }
                    }
                }
            }
            z11 = false;
        }
        aa b12 = aa.b();
        if (b12 != null && z.a()) {
            b12.a(0, true);
        }
        if (z11) {
            Application application = context.getApplicationContext() instanceof Application ? (Application) context.getApplicationContext() : null;
            if (application != null) {
                try {
                    if (f42649k == null) {
                        f42649k = new a();
                    }
                    application.registerActivityLifecycleCallbacks(f42649k);
                } catch (Exception e11) {
                    if (!al.a(e11)) {
                        e11.printStackTrace();
                    }
                }
            }
        }
        if (f42651m) {
            f42647i = System.currentTimeMillis();
            f42640b.a(1, false);
            al.a("[session] launch app, new start", new Object[0]);
            f42640b.a();
            f42640b.a(21600000L);
        }
    }

    public static void a(long j11) {
        if (j11 < 0) {
            j11 = ac.a().c().f42094p;
        }
        f42644f = j11;
    }

    public static void a(StrategyBean strategyBean, boolean z11) {
        r rVar = f42640b;
        if (rVar != null && !z11) {
            rVar.b();
        }
        if (strategyBean == null) {
            return;
        }
        long j11 = strategyBean.f42094p;
        if (j11 > 0) {
            f42643e = j11;
        }
        int i11 = strategyBean.f42099u;
        if (i11 > 0) {
            f42641c = i11;
        }
        long j12 = strategyBean.f42100v;
        if (j12 > 0) {
            f42642d = j12;
        }
    }

    public static void a() {
        r rVar = f42640b;
        if (rVar != null) {
            rVar.a(2, false);
        }
    }

    public static void a(Context context) {
        if (!f42639a || context == null) {
            return;
        }
        Application application = context.getApplicationContext() instanceof Application ? (Application) context.getApplicationContext() : null;
        if (application != null) {
            try {
                Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = f42649k;
                if (activityLifecycleCallbacks != null) {
                    application.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
                }
            } catch (Exception e11) {
                if (!al.a(e11)) {
                    e11.printStackTrace();
                }
            }
        }
        f42639a = false;
    }

    public static /* synthetic */ String a(String str, String str2) {
        return ap.a() + GlideException.a.f28776d + str + GlideException.a.f28776d + str2 + "\n";
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            String name = activity.getClass().getName();
            if (s.f42650l == null || s.f42650l.getName().equals(name)) {
                al.c(">>> %s onCreated <<<", name);
                aa b11 = aa.b();
                if (b11 != null) {
                    b11.L.add(s.a(name, "onCreated"));
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            String name = activity.getClass().getName();
            if (s.f42650l == null || s.f42650l.getName().equals(name)) {
                al.c(">>> %s onDestroyed <<<", name);
                aa b11 = aa.b();
                if (b11 != null) {
                    b11.L.add(s.a(name, "onDestroyed"));
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            String name = activity.getClass().getName();
            if (s.f42650l == null || s.f42650l.getName().equals(name)) {
                al.c(">>> %s onPaused <<<", name);
                aa b11 = aa.b();
                if (b11 == null) {
                    return;
                }
                b11.L.add(s.a(name, "onPaused"));
                long currentTimeMillis = System.currentTimeMillis();
                b11.A = currentTimeMillis;
                b11.B = currentTimeMillis - b11.f42209z;
                long unused = s.f42646h = currentTimeMillis;
                if (b11.B < 0) {
                    b11.B = 0L;
                }
                b11.f42208y = SingleFragmentActivity.f18194n;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            String name = activity.getClass().getName();
            if (s.f42650l == null || s.f42650l.getName().equals(name)) {
                al.c(">>> %s onResumed <<<", name);
                aa b11 = aa.b();
                if (b11 == null) {
                    return;
                }
                b11.L.add(s.a(name, "onResumed"));
                b11.f42208y = name;
                long currentTimeMillis = System.currentTimeMillis();
                b11.f42209z = currentTimeMillis;
                b11.C = currentTimeMillis - s.f42647i;
                long j11 = b11.f42209z - s.f42646h;
                if (j11 > (s.f42644f > 0 ? s.f42644f : s.f42643e)) {
                    b11.c();
                    s.g();
                    al.a("[session] launch app one times (app in background %d seconds and over %d seconds)", Long.valueOf(j11 / 1000), Long.valueOf(s.f42643e / 1000));
                    if (s.f42645g % s.f42641c == 0) {
                        s.f42640b.a(4, s.f42651m);
                        return;
                    }
                    s.f42640b.a(4, false);
                    long currentTimeMillis2 = System.currentTimeMillis();
                    if (currentTimeMillis2 - s.f42648j > s.f42642d) {
                        long unused = s.f42648j = currentTimeMillis2;
                        al.a("add a timer to upload hot start user info", new Object[0]);
                        if (s.f42651m) {
                            ak.a().a(s.f42640b.new a(null, true), s.f42642d);
                        }
                    }
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            al.c(">>> %s onStart <<<", activity.getClass().getName());
            aa.b().a(activity.hashCode(), true);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            al.c(">>> %s onStop <<<", activity.getClass().getName());
            aa.b().a(activity.hashCode(), false);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }
}
