package com.zx.a.I8b7;

import com.zx.sdk.api.Callback;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class z2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f46765a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Callback f46766b;

    public z2(x2 x2Var, String str, Callback callback) {
        this.f46765a = str;
        this.f46766b = callback;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            x2.a().b(this.f46765a, this.f46766b);
        } catch (Throwable th2) {
            Callback callback = this.f46766b;
            if (callback != null) {
                callback.onFailed(10000, th2.getMessage());
            }
            g3.a(th2, f3.a("ZXManager.getTag() failed: "));
        }
    }
}
