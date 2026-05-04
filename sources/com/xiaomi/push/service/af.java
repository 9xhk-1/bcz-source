package com.xiaomi.push.service;

import com.xiaomi.push.gg;
import com.xiaomi.push.hh;
import com.xiaomi.push.hr;
import com.xiaomi.push.hy;
import com.xiaomi.push.id;
import com.xiaomi.push.ig;
import com.xiaomi.push.service.XMPushService;

/* loaded from: classes8.dex */
final class af extends XMPushService.j {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ id f46235a;

    /* renamed from: a, reason: collision with other field name */
    final /* synthetic */ ig f915a;

    /* renamed from: a, reason: collision with other field name */
    final /* synthetic */ XMPushService f916a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af(int i11, ig igVar, id idVar, XMPushService xMPushService) {
        super(i11);
        this.f915a = igVar;
        this.f46235a = idVar;
        this.f916a = xMPushService;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a */
    public String mo6216a() {
        return "send ack message for clear push message.";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a */
    public void mo5933a() {
        try {
            hy hyVar = new hy();
            hyVar.c(hr.CancelPushMessageACK.f538a);
            hyVar.a(this.f915a.m6100a());
            hyVar.a(this.f915a.a());
            hyVar.b(this.f915a.b());
            hyVar.e(this.f915a.c());
            hyVar.a(0L);
            hyVar.d("success clear push message.");
            ah.a(this.f916a, ah.b(this.f46235a.b(), this.f46235a.m6086a(), hyVar, hh.Notification));
        } catch (gg e11) {
            com.xiaomi.channel.commonutils.logger.b.d("clear push message. " + e11);
            this.f916a.a(10, e11);
        }
    }
}
