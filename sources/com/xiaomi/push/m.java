package com.xiaomi.push;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;

/* loaded from: classes8.dex */
final class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ComponentName f46183a;

    /* renamed from: a, reason: collision with other field name */
    final /* synthetic */ Context f851a;

    public m(Context context, ComponentName componentName) {
        this.f851a = context;
        this.f46183a = componentName;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            PackageManager packageManager = this.f851a.getPackageManager();
            if (packageManager.getComponentEnabledSetting(this.f46183a) != 2) {
                packageManager.setComponentEnabledSetting(this.f46183a, 2, 1);
            }
        } catch (Throwable th2) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("close static register of network status receiver failed:" + th2);
        }
    }
}
