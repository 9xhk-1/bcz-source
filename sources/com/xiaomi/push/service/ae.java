package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.push.gg;
import com.xiaomi.push.id;
import com.xiaomi.push.service.XMPushService;

/* loaded from: classes8.dex */
final class ae extends XMPushService.j {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ id f46233a;

    /* renamed from: a, reason: collision with other field name */
    final /* synthetic */ XMPushService f913a;

    /* renamed from: a, reason: collision with other field name */
    final /* synthetic */ String f914a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f46234b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ae(int i11, XMPushService xMPushService, id idVar, String str, String str2) {
        super(i11);
        this.f913a = xMPushService;
        this.f46233a = idVar;
        this.f914a = str;
        this.f46234b = str2;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a */
    public String mo6216a() {
        return "send wrong message ack for message.";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a */
    public void mo5933a() {
        try {
            id a11 = y.a((Context) this.f913a, this.f46233a);
            a11.f662a.a("error", this.f914a);
            a11.f662a.a("reason", this.f46234b);
            ah.a(this.f913a, a11);
        } catch (gg e11) {
            com.xiaomi.channel.commonutils.logger.b.a(e11);
            this.f913a.a(10, e11);
        }
    }
}
