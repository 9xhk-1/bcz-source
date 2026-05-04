package com.xiaomi.push.service;

import com.xiaomi.push.fk;
import com.xiaomi.push.gg;
import com.xiaomi.push.service.XMPushService;

/* loaded from: classes8.dex */
class c extends XMPushService.j {

    /* renamed from: a, reason: collision with root package name */
    private XMPushService f46347a;

    /* renamed from: a, reason: collision with other field name */
    private fk[] f995a;

    public c(XMPushService xMPushService, fk[] fkVarArr) {
        super(4);
        this.f46347a = xMPushService;
        this.f995a = fkVarArr;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a */
    public String mo6216a() {
        return "batch send message.";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a */
    public void mo5933a() {
        try {
            fk[] fkVarArr = this.f995a;
            if (fkVarArr != null) {
                this.f46347a.a(fkVarArr);
            }
        } catch (gg e11) {
            com.xiaomi.channel.commonutils.logger.b.a(e11);
            this.f46347a.a(10, e11);
        }
    }
}
