package com.xiaomi.push.service;

/* loaded from: classes8.dex */
class cm implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ XMPushService f46359a;

    public cm(XMPushService xMPushService) {
        this.f46359a = xMPushService;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f46359a.f891a = true;
        try {
            com.xiaomi.channel.commonutils.logger.b.m5639a("try to trigger the wifi digest broadcast.");
            Object systemService = this.f46359a.getApplicationContext().getSystemService("MiuiWifiService");
            if (systemService != null) {
                com.xiaomi.push.bj.b(systemService, "sendCurrentWifiDigestInfo", new Object[0]);
            }
        } catch (Throwable unused) {
        }
    }
}
