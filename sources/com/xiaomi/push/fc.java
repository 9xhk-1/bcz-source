package com.xiaomi.push;

import com.xiaomi.push.service.XMPushService;

/* loaded from: classes8.dex */
class fc extends XMPushService.j {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ fb f45553a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fc(fb fbVar, int i11) {
        super(i11);
        this.f45553a = fbVar;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a */
    public String mo6216a() {
        return "Handling bind stats";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a, reason: collision with other method in class */
    public void mo5933a() {
        this.f45553a.c();
    }
}
