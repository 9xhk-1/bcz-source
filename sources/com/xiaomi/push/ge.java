package com.xiaomi.push;

import com.xiaomi.push.service.XMPushService;
import org.junit.jupiter.api.j2;

/* loaded from: classes8.dex */
class ge extends XMPushService.j {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ gc f45614a;

    /* renamed from: a, reason: collision with other field name */
    final /* synthetic */ Exception f461a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f45615b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ge(gc gcVar, int i11, int i12, Exception exc) {
        super(i11);
        this.f45614a = gcVar;
        this.f45615b = i12;
        this.f461a = exc;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a */
    public String mo6216a() {
        return "shutdown the connection. " + this.f45615b + j2.O + this.f461a;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a */
    public void mo5933a() {
        this.f45614a.f45605b.a(this.f45615b, this.f461a);
    }
}
