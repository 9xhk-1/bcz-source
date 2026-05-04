package com.xiaomi.push.service;

import com.xiaomi.push.service.XMPushService;

/* loaded from: classes8.dex */
class ck extends XMPushService.j {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ XMPushService f46357a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ck(XMPushService xMPushService, int i11) {
        super(i11);
        this.f46357a = xMPushService;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a */
    public String mo6216a() {
        return "disconnect for service destroy.";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a */
    public void mo5933a() {
        if (this.f46357a.f876a != null) {
            this.f46357a.f876a.b(15, (Exception) null);
            this.f46357a.f876a = null;
        }
    }
}
