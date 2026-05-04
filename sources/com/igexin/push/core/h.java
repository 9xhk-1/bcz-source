package com.igexin.push.core;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.igexin.sdk.PushConsts;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes7.dex */
public final class h implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    private static final String f38162a = "GALC";

    /* renamed from: b, reason: collision with root package name */
    private AtomicLong f38163b = new AtomicLong(0);

    /* renamed from: c, reason: collision with root package name */
    private volatile int f38164c;

    /* renamed from: com.igexin.push.core.h$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f38165a;

        public AnonymousClass1(Context context) {
            this.f38165a = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                Thread.currentThread().getName();
                com.igexin.c.a.c.a.a("GALC|>>>>>> FG threadName=" + Thread.currentThread().getName(), new Object[0]);
                if (com.igexin.push.g.j.a(this.f38165a) || System.currentTimeMillis() - h.this.f38163b.get() <= 20000) {
                    return;
                }
                Context context = this.f38165a;
                com.igexin.push.core.a.b.d();
                Intent intent = new Intent(context, (Class<?>) com.igexin.push.core.a.b.a(this.f38165a));
                intent.putExtra("action", PushConsts.ACTION_SERVICE_ONRESUME);
                ServiceManager.getInstance().b(this.f38165a, intent);
                com.igexin.c.a.c.a.a("GALC|on fg, start>>>>>>", new Object[0]);
                h.this.f38163b.set(System.currentTimeMillis());
            } catch (Throwable th2) {
                com.igexin.c.a.c.a.a(th2);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (activity == null) {
            return;
        }
        Context applicationContext = activity.getApplicationContext();
        activity.getComponentName().getClassName();
        com.igexin.c.a.c.a.a("GALC|" + activity.getComponentName().getClassName() + " onAStart " + this.f38164c, new Object[0]);
        if (this.f38164c == 0) {
            com.igexin.b.a.a().a("GTALCallback").execute(new AnonymousClass1(applicationContext));
        }
        this.f38164c++;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        if (activity == null) {
            return;
        }
        this.f38164c--;
        this.f38164c = Math.max(this.f38164c, 0);
        com.igexin.c.a.c.a.b(f38162a, HiAnalyticsConstant.REPORT_VAL_SEPARATOR + activity.getComponentName().getClassName() + " onAStopp " + this.f38164c);
        if (this.f38164c == 0) {
            com.igexin.c.a.c.a.a("GALC|>>>>>> on bg", new Object[0]);
        }
    }

    private void a(Activity activity) {
        Context applicationContext = activity.getApplicationContext();
        activity.getComponentName().getClassName();
        com.igexin.c.a.c.a.a("GALC|" + activity.getComponentName().getClassName() + " onAStart " + this.f38164c, new Object[0]);
        if (this.f38164c == 0) {
            com.igexin.b.a.a().a("GTALCallback").execute(new AnonymousClass1(applicationContext));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
