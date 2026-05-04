package com.xiaomi.push.service;

import com.xiaomi.push.dw;
import com.xiaomi.push.fw;
import com.xiaomi.push.fz;
import java.util.Map;

/* loaded from: classes8.dex */
class cp extends fw {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ XMPushService f46362a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cp(XMPushService xMPushService, Map map, int i11, String str, fz fzVar) {
        super(map, i11, str, fzVar);
        this.f46362a = xMPushService;
    }

    @Override // com.xiaomi.push.fw
    /* renamed from: a */
    public byte[] mo5973a() {
        try {
            dw.b bVar = new dw.b();
            bVar.a(bv.a().m6268a());
            return bVar.m5907a();
        } catch (Exception e11) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("getOBBString err: " + e11.toString());
            return null;
        }
    }
}
