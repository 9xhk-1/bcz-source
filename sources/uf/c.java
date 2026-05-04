package uf;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import com.baicizhan.client.business.util.ChannelUtils;
import xb.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static final String f92191a = "BaseLog";

    public static void a() {
        pb.a.a().registerActivityLifecycleCallbacks(new a());
    }

    public static void b() {
        qb.c.i(f92191a, "app init (channel, processId, version, model, manufacturer) (%s, %s, %s, %s, %s)", ChannelUtils.getChannel(pb.a.a()), Integer.valueOf(Process.myPid()), o.f(pb.a.a()), Build.MODEL, Build.MANUFACTURER);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
            qb.c.i(c.f92191a, "App onCreated " + activity.getClass().getSimpleName(), new Object[0]);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            qb.c.i(c.f92191a, "onDestroyed " + activity.getClass().getSimpleName(), new Object[0]);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            qb.c.i(c.f92191a, "onPaused " + activity.getClass().getSimpleName(), new Object[0]);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            qb.c.i(c.f92191a, "onResumed " + activity.getClass().getSimpleName(), new Object[0]);
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
