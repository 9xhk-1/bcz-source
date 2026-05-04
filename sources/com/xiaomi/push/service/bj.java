package com.xiaomi.push.service;

import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.bg;

/* loaded from: classes8.dex */
class bj extends XMPushService.j {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bg.b.c f46299a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj(bg.b.c cVar, int i11) {
        super(i11);
        this.f46299a = cVar;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a */
    public String mo6216a() {
        return "check peer job";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a */
    public void mo5933a() {
        bg a11 = bg.a();
        bg.b bVar = this.f46299a.f972a;
        if (a11.a(bVar.f46286g, bVar.f968b).f959a == null) {
            XMPushService xMPushService = bg.b.this.f961a;
            bg.b bVar2 = this.f46299a.f972a;
            xMPushService.a(bVar2.f46286g, bVar2.f968b, 2, null, null);
        }
    }
}
