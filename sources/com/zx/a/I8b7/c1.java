package com.zx.a.I8b7;

import com.zx.a.I8b7.v3;
import com.zx.sdk.api.PermissionCallback;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class c1 implements PermissionCallback {

    /* renamed from: a, reason: collision with root package name */
    public PermissionCallback f46491a;

    public c1(PermissionCallback permissionCallback) {
        this.f46491a = permissionCallback;
    }

    @Override // com.zx.sdk.api.PermissionCallback
    public void onAuthorized() {
        try {
            if (this.f46491a != null) {
                x2 b11 = x2.b();
                PermissionCallback permissionCallback = this.f46491a;
                b11.getClass();
                v3.f.f46726a.f46721a.execute(new u2(b11, permissionCallback));
            }
        } catch (Throwable th2) {
            r2.a(th2);
        }
    }

    @Override // com.zx.sdk.api.PermissionCallback
    public void onUnauthorized() {
        try {
            if (this.f46491a != null) {
                x2 b11 = x2.b();
                b11.getClass();
                v3.f.f46726a.f46721a.execute(new v2(b11));
                this.f46491a.onUnauthorized();
            }
        } catch (Throwable th2) {
            r2.a(th2);
        }
    }
}
