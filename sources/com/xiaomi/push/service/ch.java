package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.push.hh;
import com.xiaomi.push.ig;
import com.xiaomi.push.ir;

/* loaded from: classes8.dex */
final class ch implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ig f46354a;

    public ch(ig igVar) {
        this.f46354a = igVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        Context context;
        Context context2;
        byte[] a11 = ir.a(ah.a(this.f46354a.c(), this.f46354a.b(), this.f46354a, hh.Notification));
        context = cg.f46353a;
        if (!(context instanceof XMPushService)) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("UNDatas UploadNotificationDatas failed because not xmsf");
        } else {
            context2 = cg.f46353a;
            ((XMPushService) context2).a(this.f46354a.c(), a11, true);
        }
    }
}
