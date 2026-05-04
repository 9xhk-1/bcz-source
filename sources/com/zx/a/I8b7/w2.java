package com.zx.a.I8b7;

import android.app.Activity;
import android.os.Handler;
import com.zx.a.I8b7.k3;
import com.zx.sdk.api.PermissionCallback;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class w2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PermissionCallback f46731a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f46732b;

    public w2(x2 x2Var, PermissionCallback permissionCallback, Activity activity) {
        this.f46731a = permissionCallback;
        this.f46732b = activity;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            c1 c1Var = new c1(this.f46731a);
            Handler handler = k3.f46567a;
            k3 k3Var = k3.a.f46568a;
            if (k3Var.b()) {
                handler.post(new j3(k3Var, this.f46732b, c1Var));
            } else if (k3Var.a()) {
                c1Var.onAuthorized();
            } else {
                c1Var.onUnauthorized();
            }
        } catch (Throwable th2) {
            g3.a(th2, f3.a("ZXManager.registerListener(listener) failed: "));
        }
    }
}
