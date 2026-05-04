package com.vivo.push;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
final class n extends Handler {
    public n(Looper looper) {
        super(looper);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Object obj = message.obj;
        if (obj instanceof l) {
            l lVar = (l) obj;
            com.vivo.push.util.p.c("PushClientThread", "PushClientThread-handleMessage, task = ".concat(String.valueOf(lVar)));
            lVar.run();
        }
    }
}
