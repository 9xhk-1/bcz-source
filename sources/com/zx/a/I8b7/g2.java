package com.zx.a.I8b7;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.zx.a.I8b7.v3;
import com.zx.a.I8b7.y;
import com.zx.sdk.api.Callback;
import com.zx.sdk.api.PermissionCallback;
import com.zx.sdk.api.SAIDCallback;
import com.zx.sdk.api.ZXApi;
import com.zx.sdk.api.ZXIDChangedListener;
import com.zx.sdk.api.ZXIDListener;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class g2 implements ZXApi {

    /* renamed from: a, reason: collision with root package name */
    public String f46517a;

    public g2(String str) throws IllegalStateException {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalStateException("ZX_APPID not found");
        }
        this.f46517a = str;
    }

    @Override // com.zx.sdk.api.ZXApi
    public void addZXIDChangedListener(ZXIDChangedListener zXIDChangedListener) {
        try {
            y.b.f46753a.a(this.f46517a, "addZXIDChangedListener", "");
            x2 b11 = x2.b();
            String str = this.f46517a;
            b11.getClass();
            v3.f.f46726a.f46721a.execute(new e3(b11, str, zXIDChangedListener));
        } catch (Throwable th2) {
            g3.a(th2, f3.a("ZXManager.registerListener(listener) failed: "));
        }
    }

    @Override // com.zx.sdk.api.ZXApi
    public void allowPermissionDialog(boolean z11) {
        try {
            y.b.f46753a.a(this.f46517a, "allowPermissionDialog", "enable=" + z11);
            x2 b11 = x2.b();
            b11.getClass();
            v3.f.f46726a.f46721a.execute(new c3(b11, z11));
        } catch (Throwable th2) {
            g3.a(th2, f3.a("ZXManager.allowPermissionDialog failed: "));
        }
    }

    @Override // com.zx.sdk.api.ZXApi
    public void checkPermission(Activity activity, PermissionCallback permissionCallback) {
        try {
            y.b.f46753a.a(this.f46517a, "checkPermission", "");
            if (permissionCallback == null) {
                return;
            }
            x2 b11 = x2.b();
            b11.getClass();
            v3.f.f46726a.f46721a.execute(new w2(b11, permissionCallback, activity));
        } catch (Throwable th2) {
            r.b(th2.getMessage());
        }
    }

    @Override // com.zx.sdk.api.ZXApi
    public void getAuthToken(Callback callback) {
        try {
            y.b.f46753a.a(this.f46517a, "getAuthToken", "");
            if (callback == null) {
                return;
            }
            x2 b11 = x2.b();
            String str = this.f46517a;
            b11.getClass();
            v3.f.f46726a.f46721a.execute(new a3(b11, str, callback));
        } catch (Throwable th2) {
            r.b(th2.getMessage());
        }
    }

    @Override // com.zx.sdk.api.ZXApi
    public void getOpenID(Callback callback, Context context) {
        try {
            y.b.f46753a.a(this.f46517a, "getOpenID", "");
            if (callback != null) {
                x2 b11 = x2.b();
                b11.getClass();
                v3.f.f46726a.f46723c.execute(new t2(b11, context, callback));
            }
        } catch (Throwable th2) {
            if (callback != null) {
                callback.onFailed(10000, th2.getMessage());
            }
            g3.a(th2, f3.a("ZXManager.getOpenID(cb) failed: "));
        }
    }

    @Override // com.zx.sdk.api.ZXApi
    public void getSAID(String str, String str2, String str3, String str4, String str5, SAIDCallback sAIDCallback) {
        try {
            y.b.f46753a.a(this.f46517a, "getUAID", "");
            if (sAIDCallback != null) {
                x2 b11 = x2.b();
                String str6 = this.f46517a;
                b11.getClass();
                v3.f.f46726a.f46721a.execute(new y2(b11, str6, str, str2, str3, str4, str5, sAIDCallback));
            }
        } catch (Throwable th2) {
            g3.a(th2, f3.a("ZXManager getSAID onFailed:"));
        }
    }

    @Override // com.zx.sdk.api.ZXApi
    public void getTag(Callback callback) {
        try {
            y.b.f46753a.a(this.f46517a, "getTag", "");
            if (callback == null) {
                return;
            }
            x2 b11 = x2.b();
            String str = this.f46517a;
            b11.getClass();
            v3.f.f46726a.f46721a.execute(new z2(b11, str, callback));
        } catch (Throwable th2) {
            r.b(th2.getMessage());
        }
    }

    @Override // com.zx.sdk.api.ZXApi
    public String getVersion() {
        y.b.f46753a.a(this.f46517a, "getVersion", "");
        return "3.3.4.43514";
    }

    @Override // com.zx.sdk.api.ZXApi
    public void getZXID(ZXIDListener zXIDListener) {
        try {
            y.b.f46753a.a(this.f46517a, "getZXID", "");
            if (zXIDListener != null) {
                x2 b11 = x2.b();
                String str = this.f46517a;
                b11.getClass();
                v3.f.f46726a.f46721a.execute(new s2(b11, str, zXIDListener));
            }
        } catch (Throwable th2) {
            if (zXIDListener != null) {
                zXIDListener.onFailed(10000, th2.getMessage());
            }
            g3.a(th2, f3.a("ZXManager.getZXID(zxidListener) failed: "));
        }
    }

    @Override // com.zx.sdk.api.ZXApi
    public void init(Context context) {
        try {
            y.b.f46753a.a(this.f46517a, "init", "");
            x2.a(context);
        } catch (Throwable th2) {
            r.b("ZXManager.init failed:" + th2);
        }
    }

    @Override // com.zx.sdk.api.ZXApi
    public String invoke(String str, String str2) {
        try {
            y.b.f46753a.a(this.f46517a, "invoke", "method=" + str + "&argument" + str2);
            return x2.b().a(str, str2);
        } catch (Throwable th2) {
            g3.a(th2, f3.a("ZXManager.invoke failed: "));
            return null;
        }
    }

    @Override // com.zx.sdk.api.ZXApi
    public boolean isAllowPermissionDialog() {
        try {
            y.b.f46753a.a(this.f46517a, "isAllowPermissionDialog", "");
            x2.b().getClass();
            return m3.f46603s == 1;
        } catch (Throwable th2) {
            g3.a(th2, f3.a("ZXManager.isAllowPermissionDialog failed: "));
            return false;
        }
    }

    @Override // com.zx.sdk.api.ZXApi
    public boolean isEnable() {
        try {
            y.b.f46753a.a(this.f46517a, "isEnable", "");
            x2.b().getClass();
            return m3.f46602r == 1;
        } catch (Throwable th2) {
            g3.a(th2, f3.a("ZXManager.isEnable failed: "));
            return false;
        }
    }

    @Override // com.zx.sdk.api.ZXApi
    public void setDebug(boolean z11) {
        try {
            y.b.f46753a.a(this.f46517a, "setDebug", "isDebug=" + z11);
            x2 b11 = x2.b();
            b11.getClass();
            v3.f.f46726a.f46721a.execute(new d3(b11, z11));
        } catch (Throwable th2) {
            r.b(th2.getMessage());
        }
    }

    @Override // com.zx.sdk.api.ZXApi
    public void setEnable(boolean z11) {
        try {
            y.b.f46753a.a(this.f46517a, "setEnable", "enable=" + z11);
            x2 b11 = x2.b();
            b11.getClass();
            v3.f.f46726a.f46721a.execute(new b3(b11, z11));
        } catch (Throwable th2) {
            g3.a(th2, f3.a("ZXManager.setEnable failed: "));
        }
    }
}
