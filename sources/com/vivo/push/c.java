package com.vivo.push;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
final class c implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ b f44932a;

    public c(b bVar) {
        this.f44932a = bVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        AtomicInteger atomicInteger;
        AtomicInteger atomicInteger2;
        if (message == null) {
            com.vivo.push.util.p.a("AidlManager", "handleMessage error : msg is null");
            return false;
        }
        int i11 = message.what;
        if (i11 == 1) {
            com.vivo.push.util.p.a("AidlManager", "In connect, bind core service time out");
            atomicInteger = this.f44932a.f44881f;
            if (atomicInteger.get() == 2) {
                this.f44932a.a(1);
            }
        } else if (i11 != 2) {
            com.vivo.push.util.p.b("AidlManager", "unknow msg what [" + message.what + "]");
        } else {
            atomicInteger2 = this.f44932a.f44881f;
            if (atomicInteger2.get() == 4) {
                this.f44932a.f();
            }
            this.f44932a.a(1);
        }
        return true;
    }
}
