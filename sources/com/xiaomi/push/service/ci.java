package com.xiaomi.push.service;

import com.xiaomi.push.fk;
import com.xiaomi.push.ga;
import com.xiaomi.push.gm;
import com.xiaomi.push.service.XMPushService.d;
import com.xiaomi.push.service.XMPushService.m;

/* loaded from: classes8.dex */
class ci implements ga {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ XMPushService f46355a;

    public ci(XMPushService xMPushService) {
        this.f46355a = xMPushService;
    }

    @Override // com.xiaomi.push.ga
    public void a(fk fkVar) {
        XMPushService xMPushService = this.f46355a;
        xMPushService.a(xMPushService.new d(fkVar));
    }

    @Override // com.xiaomi.push.ga
    public void a(gm gmVar) {
        XMPushService xMPushService = this.f46355a;
        xMPushService.a(xMPushService.new m(gmVar));
    }
}
