package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.push.gg;
import com.xiaomi.push.id;
import com.xiaomi.push.service.XMPushService;

/* loaded from: classes8.dex */
final class ab extends XMPushService.j {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ id f46230a;

    /* renamed from: a, reason: collision with other field name */
    final /* synthetic */ XMPushService f909a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab(int i11, XMPushService xMPushService, id idVar) {
        super(i11);
        this.f909a = xMPushService;
        this.f46230a = idVar;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a */
    public String mo6216a() {
        return "send ack message for obsleted message.";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a */
    public void mo5933a() {
        try {
            id a11 = y.a((Context) this.f909a, this.f46230a);
            a11.m6085a().a("message_obsleted", "1");
            ah.a(this.f909a, a11);
        } catch (gg e11) {
            com.xiaomi.channel.commonutils.logger.b.a(e11);
            this.f909a.a(10, e11);
        }
    }
}
