package com.xiaomi.push.service;

import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.bg;

/* loaded from: classes8.dex */
class bi extends XMPushService.j {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bg.b.c f46298a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi(bg.b.c cVar, int i11) {
        super(i11);
        this.f46298a = cVar;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a */
    public String mo6216a() {
        return "clear peer job";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a */
    public void mo5933a() {
        bg.b.c cVar = this.f46298a;
        if (cVar.f46292a == cVar.f972a.f959a) {
            com.xiaomi.channel.commonutils.logger.b.b("clean peer, chid = " + this.f46298a.f972a.f46286g);
            this.f46298a.f972a.f959a = null;
        }
    }
}
