package com.vivo.push.d;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
final class v implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f44987a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Map f44988b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ u f44989c;

    public v(u uVar, Context context, Map map) {
        this.f44989c = uVar;
        this.f44987a = context;
        this.f44988b = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ComponentName componentName;
        String packageName = this.f44987a.getPackageName();
        try {
            List<ActivityManager.RunningTaskInfo> runningTasks = ((ActivityManager) this.f44987a.getSystemService("activity")).getRunningTasks(100);
            if (runningTasks != null) {
                Iterator<ActivityManager.RunningTaskInfo> it = runningTasks.iterator();
                while (it.hasNext()) {
                    componentName = it.next().topActivity;
                    if (componentName.getPackageName().equals(packageName)) {
                        com.vivo.push.util.p.d("OnNotificationClickTask", "topClassName=" + componentName.getClassName());
                        Intent intent = new Intent();
                        intent.setComponent(componentName);
                        intent.setFlags(335544320);
                        u.b(intent, this.f44988b);
                        this.f44987a.startActivity(intent);
                        return;
                    }
                }
            }
        } catch (Exception e11) {
            com.vivo.push.util.p.a("OnNotificationClickTask", "start recentIntent is error", e11);
        }
        Intent launchIntentForPackage = this.f44987a.getPackageManager().getLaunchIntentForPackage(this.f44987a.getPackageName());
        if (launchIntentForPackage == null) {
            com.vivo.push.util.p.a("OnNotificationClickTask", "LaunchIntent is null");
            return;
        }
        launchIntentForPackage.setFlags(268435456);
        u.b(launchIntentForPackage, this.f44988b);
        this.f44987a.startActivity(launchIntentForPackage);
    }
}
