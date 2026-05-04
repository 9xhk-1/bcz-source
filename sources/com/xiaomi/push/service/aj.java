package com.xiaomi.push.service;

import com.xiaomi.mipush.sdk.ErrorCode;
import com.xiaomi.push.service.bg;

/* loaded from: classes8.dex */
final class aj implements bg.b.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ XMPushService f46238a;

    public aj(XMPushService xMPushService) {
        this.f46238a = xMPushService;
    }

    @Override // com.xiaomi.push.service.bg.b.a
    public void a(bg.c cVar, bg.c cVar2, int i11) {
        if (cVar2 == bg.c.binded) {
            x.a(this.f46238a, true);
            x.a(this.f46238a);
        } else if (cVar2 == bg.c.unbind) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("onChange unbind");
            x.a(this.f46238a, ErrorCode.ERROR_SERVICE_UNAVAILABLE, " the push is not connected.");
        }
    }
}
