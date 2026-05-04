package com.xiaomi.push.service;

import com.xiaomi.push.fk;
import com.xiaomi.push.gg;
import com.xiaomi.push.service.XMPushService;

/* loaded from: classes8.dex */
class bt extends XMPushService.j {

    /* renamed from: a, reason: collision with root package name */
    private fk f46339a;

    /* renamed from: a, reason: collision with other field name */
    private XMPushService f981a;

    public bt(XMPushService xMPushService, fk fkVar) {
        super(4);
        this.f981a = xMPushService;
        this.f46339a = fkVar;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a */
    public String mo6216a() {
        return "send a message.";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a */
    public void mo5933a() {
        try {
            fk fkVar = this.f46339a;
            if (fkVar != null) {
                this.f981a.a(fkVar);
                an anVar = this.f46339a.f405a;
                if (anVar != null) {
                    anVar.f46248d = System.currentTimeMillis();
                    ao.a(this.f981a, "coord_up", this.f46339a.f405a);
                }
            }
        } catch (gg e11) {
            com.xiaomi.channel.commonutils.logger.b.a(e11);
            this.f981a.a(10, e11);
        }
    }
}
