package com.xiaomi.push.service;

import com.xiaomi.push.gg;
import com.xiaomi.push.service.XMPushService;

/* loaded from: classes8.dex */
class cj extends XMPushService.j {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ XMPushService f46356a;

    /* renamed from: a, reason: collision with other field name */
    final /* synthetic */ String f1002a;

    /* renamed from: a, reason: collision with other field name */
    final /* synthetic */ byte[] f1003a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cj(XMPushService xMPushService, int i11, String str, byte[] bArr) {
        super(i11);
        this.f46356a = xMPushService;
        this.f1002a = str;
        this.f1003a = bArr;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a */
    public String mo6216a() {
        return "send mi push message";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a */
    public void mo5933a() {
        try {
            ah.a(this.f46356a, this.f1002a, this.f1003a);
        } catch (gg e11) {
            com.xiaomi.channel.commonutils.logger.b.a(e11);
            this.f46356a.a(10, e11);
        }
    }
}
