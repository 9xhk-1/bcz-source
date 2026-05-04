package com.igexin.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.getui.gtc.base.GtcProvider;
import com.igexin.push.core.ServiceManager;
import com.igexin.push.core.ServiceManager.AnonymousClass4;

/* loaded from: classes7.dex */
public class GTServiceManager {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final GTServiceManager f38757a = new GTServiceManager();

        private a() {
        }
    }

    private GTServiceManager() {
    }

    public static GTServiceManager getInstance() {
        return a.f38757a;
    }

    public void onActivityCreate(Activity activity) {
        Activity activity2;
        ServiceManager serviceManager = ServiceManager.getInstance();
        try {
            Context applicationContext = activity.getApplicationContext();
            ServiceManager.f37612b = applicationContext;
            GtcProvider.setContext(applicationContext);
            long currentTimeMillis = System.currentTimeMillis();
            String name = activity.getClass().getName();
            Intent intent = activity.getIntent();
            activity2 = activity;
            try {
                com.igexin.b.a.a().a("gd").execute(serviceManager.new AnonymousClass4(intent, currentTimeMillis, activity2, name));
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                activity2.finish();
                com.igexin.c.a.c.a.a(th3);
            }
        } catch (Throwable th4) {
            th = th4;
            activity2 = activity;
        }
    }

    public void onServiceCreate(Context context, Intent intent) {
        ServiceManager.getInstance().a(context, intent);
    }
}
