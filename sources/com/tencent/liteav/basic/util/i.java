package com.tencent.liteav.basic.util;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private Handler f43461a;

    /* renamed from: b, reason: collision with root package name */
    private Looper f43462b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f43463c;

    /* renamed from: d, reason: collision with root package name */
    private Thread f43464d;

    public i(String str) {
        HandlerThread handlerThread = new HandlerThread(str);
        this.f43463c = true;
        handlerThread.start();
        this.f43462b = handlerThread.getLooper();
        this.f43461a = new Handler(this.f43462b);
        this.f43464d = handlerThread;
    }

    public void b(Runnable runnable) {
        this.f43461a.post(runnable);
    }

    public void finalize() throws Throwable {
        if (this.f43463c) {
            this.f43461a.getLooper().quit();
        }
        super.finalize();
    }

    public Handler a() {
        return this.f43461a;
    }

    public void a(final Runnable runnable) {
        final boolean[] zArr = new boolean[1];
        if (Thread.currentThread().equals(this.f43464d)) {
            runnable.run();
            return;
        }
        synchronized (this.f43461a) {
            zArr[0] = false;
            this.f43461a.post(new Runnable() { // from class: com.tencent.liteav.basic.util.i.1
                @Override // java.lang.Runnable
                public void run() {
                    runnable.run();
                    zArr[0] = true;
                    synchronized (i.this.f43461a) {
                        i.this.f43461a.notifyAll();
                    }
                }
            });
            while (!zArr[0]) {
                try {
                    this.f43461a.wait();
                } catch (Exception unused) {
                }
            }
        }
    }

    public void a(Runnable runnable, long j11) {
        this.f43461a.postDelayed(runnable, j11);
    }
}
