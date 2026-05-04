package com.xiaomi.push.service;

import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.bg;

/* loaded from: classes8.dex */
class bh implements bg.b.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bg.b f46297a;

    public bh(bg.b bVar) {
        this.f46297a = bVar;
    }

    @Override // com.xiaomi.push.service.bg.b.a
    public void a(bg.c cVar, bg.c cVar2, int i11) {
        XMPushService.c cVar3;
        XMPushService.c cVar4;
        if (cVar2 == bg.c.binding) {
            XMPushService xMPushService = this.f46297a.f961a;
            cVar4 = this.f46297a.f960a;
            xMPushService.a(cVar4, 60000L);
        } else {
            XMPushService xMPushService2 = this.f46297a.f961a;
            cVar3 = this.f46297a.f960a;
            xMPushService2.b(cVar3);
        }
    }
}
