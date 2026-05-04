package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.push.fw;
import com.xiaomi.push.service.XMPushService;

/* loaded from: classes8.dex */
class cu extends XMPushService.j {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ XMPushService f46367a;

    /* renamed from: a, reason: collision with other field name */
    final /* synthetic */ String f1005a;

    /* renamed from: a, reason: collision with other field name */
    final /* synthetic */ byte[] f1006a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f46368b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cu(XMPushService xMPushService, int i11, int i12, String str, byte[] bArr) {
        super(i11);
        this.f46367a = xMPushService;
        this.f46368b = i12;
        this.f1005a = str;
        this.f1006a = bArr;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a */
    public String mo6216a() {
        return "clear account cache.";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a */
    public void mo5933a() {
        fw fwVar;
        u.m6299a((Context) this.f46367a);
        bg.a().m6257a("5");
        com.xiaomi.push.ab.a(this.f46368b);
        fwVar = this.f46367a.f877a;
        fwVar.c(fw.a());
        com.xiaomi.channel.commonutils.logger.b.m5639a("clear account and start registration. " + this.f1005a);
        this.f46367a.a(this.f1006a, this.f1005a);
    }
}
