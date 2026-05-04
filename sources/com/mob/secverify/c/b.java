package com.mob.secverify.c;

import android.os.Process;
import com.mob.secverify.e.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class b extends Thread {

    /* renamed from: a, reason: collision with root package name */
    private boolean f40714a;

    public abstract void a();

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (this.f40714a) {
                Process.setThreadPriority(-19);
            }
            a();
        } catch (Throwable th2) {
            com.mob.secverify.b.c.a().b("SecPure", "unexpected: " + h.a(th2));
        }
    }
}
