package com.xiaomi.push.service;

import com.xiaomi.push.gg;
import com.xiaomi.push.id;
import com.xiaomi.push.service.XMPushService;

/* loaded from: classes8.dex */
final class z extends XMPushService.j {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ id f46413a;

    /* renamed from: a, reason: collision with other field name */
    final /* synthetic */ XMPushService f1042a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(int i11, XMPushService xMPushService, id idVar) {
        super(i11);
        this.f1042a = xMPushService;
        this.f46413a = idVar;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a */
    public String mo6216a() {
        return "send app absent message.";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a */
    public void mo5933a() {
        try {
            ah.a(this.f1042a, ah.a(this.f46413a.b(), this.f46413a.m6086a()));
        } catch (gg e11) {
            com.xiaomi.channel.commonutils.logger.b.a(e11);
            this.f1042a.a(10, e11);
        }
    }
}
