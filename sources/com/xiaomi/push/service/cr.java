package com.xiaomi.push.service;

import android.database.ContentObserver;
import android.os.Handler;
import com.xiaomi.push.service.XMPushService.g;

/* loaded from: classes8.dex */
class cr extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ XMPushService f46364a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cr(XMPushService xMPushService, Handler handler) {
        super(handler);
        this.f46364a = xMPushService;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z11) {
        boolean m6203g;
        super.onChange(z11);
        m6203g = this.f46364a.m6203g();
        com.xiaomi.channel.commonutils.logger.b.m5639a("SuperPowerMode:" + m6203g);
        this.f46364a.e();
        if (!m6203g) {
            this.f46364a.a(true);
        } else {
            XMPushService xMPushService = this.f46364a;
            xMPushService.a(xMPushService.new g(24, null));
        }
    }
}
