package com.xiaomi.push;

import com.xiaomi.push.service.XMPushService;

/* loaded from: classes8.dex */
class gd extends XMPushService.j {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f45612a;

    /* renamed from: a, reason: collision with other field name */
    final /* synthetic */ gc f460a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f45613b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gd(gc gcVar, int i11, long j11, long j12) {
        super(i11);
        this.f460a = gcVar;
        this.f45612a = j11;
        this.f45613b = j12;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a */
    public String mo6216a() {
        return "check the ping-pong." + this.f45613b;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a */
    public void mo5933a() {
        Thread.yield();
        if (!this.f460a.m5970c() || this.f460a.a(this.f45612a)) {
            return;
        }
        com.xiaomi.push.service.o.a(this.f460a.f45605b).m6283b();
        this.f460a.f45605b.a(22, (Exception) null);
    }
}
