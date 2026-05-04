package com.xiaomi.push;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.xiaomi.push.am;

/* loaded from: classes8.dex */
class an extends Handler {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ am f45256a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public an(am amVar, Looper looper) {
        super(looper);
        this.f45256a = amVar;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        am.b bVar = (am.b) message.obj;
        int i11 = message.what;
        if (i11 == 0) {
            bVar.a();
        } else if (i11 == 1) {
            bVar.mo5820c();
        }
        super.handleMessage(message);
    }
}
