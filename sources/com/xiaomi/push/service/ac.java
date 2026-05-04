package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.push.gg;
import com.xiaomi.push.id;
import com.xiaomi.push.service.XMPushService;

/* loaded from: classes8.dex */
final class ac extends XMPushService.j {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ id f46231a;

    /* renamed from: a, reason: collision with other field name */
    final /* synthetic */ XMPushService f910a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac(int i11, XMPushService xMPushService, id idVar) {
        super(i11);
        this.f910a = xMPushService;
        this.f46231a = idVar;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a */
    public String mo6216a() {
        return "send ack message for unrecognized new miui message.";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a */
    public void mo5933a() {
        try {
            id a11 = y.a((Context) this.f910a, this.f46231a);
            a11.m6085a().a("miui_message_unrecognized", "1");
            ah.a(this.f910a, a11);
        } catch (gg e11) {
            com.xiaomi.channel.commonutils.logger.b.a(e11);
            this.f910a.a(10, e11);
        }
    }
}
