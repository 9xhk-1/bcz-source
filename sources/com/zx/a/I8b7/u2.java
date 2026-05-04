package com.zx.a.I8b7;

import com.zx.a.I8b7.l2;
import com.zx.sdk.api.PermissionCallback;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class u2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PermissionCallback f46714a;

    public u2(x2 x2Var, PermissionCallback permissionCallback) {
        this.f46714a = permissionCallback;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            l2.a.f46573a.f46572a.c(1);
            r.a("用户已授权获取卓信ID");
            try {
                x2.a().a(m3.f46585a);
            } catch (Exception e11) {
                r.b(e11.getMessage());
            }
            this.f46714a.onAuthorized();
        } catch (Throwable th2) {
            g3.a(th2, f3.a("卓信ID授权失败 error: "));
        }
    }
}
