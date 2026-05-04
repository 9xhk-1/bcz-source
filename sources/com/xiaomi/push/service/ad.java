package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.push.gg;
import com.xiaomi.push.id;
import com.xiaomi.push.service.XMPushService;

/* loaded from: classes8.dex */
final class ad extends XMPushService.j {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ id f46232a;

    /* renamed from: a, reason: collision with other field name */
    final /* synthetic */ XMPushService f911a;

    /* renamed from: a, reason: collision with other field name */
    final /* synthetic */ String f912a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ad(int i11, XMPushService xMPushService, id idVar, String str) {
        super(i11);
        this.f911a = xMPushService;
        this.f46232a = idVar;
        this.f912a = str;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a */
    public String mo6216a() {
        return "send app absent ack message for message.";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a */
    public void mo5933a() {
        try {
            id a11 = y.a((Context) this.f911a, this.f46232a);
            a11.m6085a().a("absent_target_package", this.f912a);
            ah.a(this.f911a, a11);
        } catch (gg e11) {
            com.xiaomi.channel.commonutils.logger.b.a(e11);
            this.f911a.a(10, e11);
        }
    }
}
