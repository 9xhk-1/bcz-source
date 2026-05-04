package com.xiaomi.push.service;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

/* loaded from: classes8.dex */
class co extends Handler {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ XMPushService f46361a;

    public co(XMPushService xMPushService) {
        this.f46361a = xMPushService;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        super.handleMessage(message);
        if (message != null) {
            try {
                int i11 = message.what;
                if (i11 == 17) {
                    Object obj = message.obj;
                    if (obj != null) {
                        this.f46361a.onStart((Intent) obj, 1);
                        return;
                    }
                    return;
                }
                if (i11 != 18) {
                    return;
                }
                Message obtain = Message.obtain((Handler) null, 0);
                obtain.what = 18;
                Bundle bundle = new Bundle();
                bundle.putString("xmsf_region", a.a(this.f46361a.getApplicationContext()).a());
                obtain.setData(bundle);
                message.replyTo.send(obtain);
            } catch (Throwable unused) {
            }
        }
    }
}
