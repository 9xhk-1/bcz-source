package com.xiaomi.push.service;

import com.xiaomi.push.service.XMPushService.g;
import com.xiaomi.push.service.bg;

/* loaded from: classes8.dex */
class cq implements bg.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ XMPushService f46363a;

    public cq(XMPushService xMPushService) {
        this.f46363a = xMPushService;
    }

    @Override // com.xiaomi.push.service.bg.a
    public void a() {
        this.f46363a.e();
        if (bg.a().m6252a() <= 0) {
            XMPushService xMPushService = this.f46363a;
            xMPushService.a(xMPushService.new g(12, null));
        }
    }
}
