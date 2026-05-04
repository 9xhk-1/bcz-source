package uf;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import com.baicizhan.main.activity.LoadingPageActivity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import q9.x;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f92184a = "AppUtils";

    /* renamed from: b, reason: collision with root package name */
    public static List<WeakReference<Activity>> f92185b = new ArrayList();

    public static void c() {
        d();
        Process.killProcess(Process.myPid());
    }

    public static void d() {
        Iterator<WeakReference<Activity>> it = f92185b.iterator();
        while (it.hasNext()) {
            Activity activity = it.next().get();
            if (activity != null && !activity.isFinishing()) {
                activity.finish();
            }
        }
        f92185b.clear();
    }

    public static void e(Application app2) {
        if (app2 != null) {
            app2.registerActivityLifecycleCallbacks(new C1237a());
        }
    }

    public static void f(Activity a11) {
        if (a11 == null) {
            qb.c.d(f92184a, "reboot failed , Activity == null", new Object[0]);
            return;
        }
        d();
        x.r().d();
        a11.startActivity(new Intent(a11, (Class<?>) LoadingPageActivity.class));
    }

    public static void g(Activity activity) {
        Iterator<WeakReference<Activity>> it = f92185b.iterator();
        while (it.hasNext()) {
            WeakReference<Activity> next = it.next();
            if (next == null || next.get() == null || activity == next.get()) {
                it.remove();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: uf.a$a, reason: collision with other inner class name */
    public class C1237a implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
            a.f92185b.add(new WeakReference(activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            a.g(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        }
    }
}
