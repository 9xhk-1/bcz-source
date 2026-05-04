package com.mob.mgs.impl;

/* loaded from: classes7.dex */
public abstract class h extends Thread {
    public abstract void a() throws Throwable;

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Throwable th2) {
            e.a().a(th2);
        }
    }
}
