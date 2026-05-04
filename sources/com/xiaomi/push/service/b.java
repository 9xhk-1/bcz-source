package com.xiaomi.push.service;

import com.tencent.connect.common.Constants;
import com.xiaomi.push.aj;
import com.xiaomi.push.hh;
import com.xiaomi.push.ig;
import com.xiaomi.push.ir;
import java.lang.ref.WeakReference;

/* loaded from: classes8.dex */
public class b extends aj.a {

    /* renamed from: a, reason: collision with root package name */
    private ig f46271a;

    /* renamed from: a, reason: collision with other field name */
    private WeakReference<XMPushService> f950a;

    /* renamed from: a, reason: collision with other field name */
    private boolean f951a;

    public b(ig igVar, WeakReference<XMPushService> weakReference, boolean z11) {
        this.f46271a = igVar;
        this.f950a = weakReference;
        this.f951a = z11;
    }

    @Override // com.xiaomi.push.aj.a
    /* renamed from: a */
    public String mo5759a() {
        return Constants.VIA_REPORT_TYPE_DATALINE;
    }

    @Override // java.lang.Runnable
    public void run() {
        XMPushService xMPushService;
        WeakReference<XMPushService> weakReference = this.f950a;
        if (weakReference == null || this.f46271a == null || (xMPushService = weakReference.get()) == null) {
            return;
        }
        this.f46271a.a(bd.a());
        this.f46271a.a(false);
        com.xiaomi.channel.commonutils.logger.b.c("MoleInfo aw_ping : send aw_Ping msg " + this.f46271a.m6100a());
        try {
            String c11 = this.f46271a.c();
            xMPushService.a(c11, ir.a(ah.a(c11, this.f46271a.b(), this.f46271a, hh.Notification)), this.f951a);
        } catch (Exception e11) {
            com.xiaomi.channel.commonutils.logger.b.d("MoleInfo aw_ping : send help app ping error" + e11.toString());
        }
    }
}
