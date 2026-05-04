package com.vivo.push;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    protected Context f45055a;

    /* renamed from: b, reason: collision with root package name */
    protected Handler f45056b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f45057c = new Object();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            q.this.b(message);
        }
    }

    public q() {
        HandlerThread handlerThread = new HandlerThread(getClass().getSimpleName(), 1);
        handlerThread.start();
        this.f45056b = new a(handlerThread.getLooper());
    }

    public final void a(Context context) {
        this.f45055a = context;
    }

    public abstract void b(Message message);

    public final void a(Message message) {
        synchronized (this.f45057c) {
            try {
                Handler handler = this.f45056b;
                if (handler == null) {
                    String str = "Dead worker dropping a message: " + message.what;
                    com.vivo.push.util.p.e(getClass().getSimpleName(), str + " (Thread " + Thread.currentThread().getId() + pn.j.f81007d);
                } else {
                    handler.sendMessage(message);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
