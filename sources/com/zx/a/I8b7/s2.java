package com.zx.a.I8b7;

import com.zx.sdk.api.ZXIDListener;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class s2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f46684a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ZXIDListener f46685b;

    public s2(x2 x2Var, String str, ZXIDListener zXIDListener) {
        this.f46684a = str;
        this.f46685b = zXIDListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            x2.a().a(this.f46684a, this.f46685b);
        } catch (Throwable th2) {
            ZXIDListener zXIDListener = this.f46685b;
            if (zXIDListener != null) {
                zXIDListener.onFailed(10000, th2.getMessage());
            }
            g3.a(th2, f3.a("ZXManager.getZXID(zxidListener) failed: "));
        }
    }
}
