package com.vivo.push;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private static final Handler f45038a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    private static final HandlerThread f45039b;

    /* renamed from: c, reason: collision with root package name */
    private static final Handler f45040c;

    static {
        HandlerThread handlerThread = new HandlerThread("push_client_thread");
        f45039b = handlerThread;
        handlerThread.start();
        f45040c = new n(handlerThread.getLooper());
    }

    public static void a(l lVar) {
        if (lVar == null) {
            com.vivo.push.util.p.a("PushClientThread", "client thread error, task is null!");
            return;
        }
        int a11 = lVar.a();
        Message message = new Message();
        message.what = a11;
        message.obj = lVar;
        f45040c.sendMessageDelayed(message, 0L);
    }

    public static void b(Runnable runnable) {
        f45038a.post(runnable);
    }

    public static void c(Runnable runnable) {
        Handler handler = f45040c;
        if (handler != null) {
            handler.post(runnable);
        }
    }

    public static void a(Runnable runnable) {
        Handler handler = f45040c;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, 15000L);
    }
}
