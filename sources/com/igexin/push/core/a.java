package com.igexin.push.core;

import android.os.Looper;

/* loaded from: classes7.dex */
public abstract class a extends Thread {
    public abstract void a();

    public abstract String b();

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Thread.currentThread().setName(b());
        if (Looper.myLooper() == null) {
            Looper.prepare();
            Looper.loop();
        }
    }
}
