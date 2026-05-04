package com.xiaomi.push.service;

import com.xiaomi.push.service.XMPushService;

/* loaded from: classes8.dex */
class cs extends XMPushService.j {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ XMPushService f46365a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cs(XMPushService xMPushService, int i11) {
        super(i11);
        this.f46365a = xMPushService;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a */
    public String mo6216a() {
        return "prepare the mi push account.";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a */
    public void mo5933a() {
        ah.a(this.f46365a);
        if (com.xiaomi.push.bi.b(this.f46365a)) {
            this.f46365a.a(true);
        }
    }
}
