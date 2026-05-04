package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.push.gg;
import com.xiaomi.push.id;
import com.xiaomi.push.service.XMPushService;
import java.util.Map;

/* loaded from: classes8.dex */
final class aa extends XMPushService.j {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ id f46229a;

    /* renamed from: a, reason: collision with other field name */
    final /* synthetic */ XMPushService f908a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa(int i11, XMPushService xMPushService, id idVar) {
        super(i11);
        this.f908a = xMPushService;
        this.f46229a = idVar;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a */
    public String mo6216a() {
        return "send ack message for message.";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a */
    public void mo5933a() {
        Map<String, String> a11;
        try {
            if (com.xiaomi.push.j.m6172a((Context) this.f908a)) {
                try {
                    a11 = ag.a((Context) this.f908a, this.f46229a);
                } catch (Throwable unused) {
                }
                ah.a(this.f908a, y.a(this.f908a, this.f46229a, a11));
            }
            a11 = null;
            ah.a(this.f908a, y.a(this.f908a, this.f46229a, a11));
        } catch (gg e11) {
            com.xiaomi.channel.commonutils.logger.b.a(e11);
            this.f908a.a(10, e11);
        }
    }
}
