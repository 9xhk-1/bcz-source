package com.xiaomi.push.service;

import android.content.ComponentName;
import android.content.pm.PackageManager;

/* loaded from: classes8.dex */
class cn implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ XMPushService f46360a;

    public cn(XMPushService xMPushService) {
        this.f46360a = xMPushService;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            PackageManager packageManager = this.f46360a.getApplicationContext().getPackageManager();
            ComponentName componentName = new ComponentName(this.f46360a.getApplicationContext(), "com.xiaomi.push.service.receivers.PingReceiver");
            if (packageManager.getComponentEnabledSetting(componentName) != 2) {
                packageManager.setComponentEnabledSetting(componentName, 2, 1);
            }
        } catch (Throwable th2) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("[Alarm] disable ping receiver may be failure. " + th2);
        }
    }
}
