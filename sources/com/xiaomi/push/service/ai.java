package com.xiaomi.push.service;

import android.text.TextUtils;
import com.xiaomi.push.hh;
import com.xiaomi.push.hr;
import com.xiaomi.push.ig;
import com.xiaomi.push.ir;
import com.xiaomi.push.service.bx;
import java.util.HashMap;

/* loaded from: classes8.dex */
final class ai extends bx.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ XMPushService f46237a;

    /* renamed from: a, reason: collision with other field name */
    final /* synthetic */ t f918a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai(String str, long j11, XMPushService xMPushService, t tVar) {
        super(str, j11);
        this.f46237a = xMPushService;
        this.f918a = tVar;
    }

    @Override // com.xiaomi.push.service.bx.a
    public void a(bx bxVar) {
        com.xiaomi.push.az a11 = com.xiaomi.push.az.a(this.f46237a);
        String a12 = bxVar.a("MSAID", "msaid");
        String mo5724a = a11.mo5724a();
        if (TextUtils.isEmpty(mo5724a) || TextUtils.equals(a12, mo5724a)) {
            return;
        }
        bxVar.a("MSAID", "msaid", mo5724a);
        ig igVar = new ig();
        igVar.b(this.f918a.f46402d);
        igVar.c(hr.ClientInfoUpdate.f538a);
        igVar.a(bd.a());
        igVar.a(new HashMap());
        a11.a(igVar.m6101a());
        byte[] a13 = ir.a(ah.a(this.f46237a.getPackageName(), this.f918a.f46402d, igVar, hh.Notification));
        XMPushService xMPushService = this.f46237a;
        xMPushService.a(xMPushService.getPackageName(), a13, true);
    }
}
