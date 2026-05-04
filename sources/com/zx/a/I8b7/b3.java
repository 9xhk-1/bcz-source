package com.zx.a.I8b7;

import com.zx.a.I8b7.l2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class b3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f46489a;

    public b3(x2 x2Var, boolean z11) {
        this.f46489a = z11;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            l2.a.f46573a.f46572a.b(this.f46489a ? 1 : 0);
        } catch (Throwable th2) {
            g3.a(th2, f3.a("ZXCore setEnable failed: "));
        }
    }
}
