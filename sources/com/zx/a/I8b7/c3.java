package com.zx.a.I8b7;

import com.zx.a.I8b7.l2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class c3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f46492a;

    public c3(x2 x2Var, boolean z11) {
        this.f46492a = z11;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            u3 u3Var = l2.a.f46573a.f46572a;
            boolean z11 = this.f46492a;
            u3Var.getClass();
            if (z11 != m3.f46603s) {
                m3.f46603s = z11 ? 1 : 0;
                u3Var.a(20, m3.f46603s + "", false);
            }
        } catch (Throwable th2) {
            g3.a(th2, f3.a("ZXManager.allowPermissionDialog failed: "));
        }
    }
}
