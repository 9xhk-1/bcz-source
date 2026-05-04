package com.zx.sdk.api;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import com.igexin.sdk.PushConsts;
import com.zx.a.I8b7.f3;
import com.zx.a.I8b7.g2;
import com.zx.a.I8b7.g3;
import com.zx.a.I8b7.r;
import com.zx.a.I8b7.x1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class ZXManager {
    public static final String TAG = "ZXManager";
    public static ZXApi api;
    public static Context ctx;

    static {
        try {
            System.loadLibrary("zxprotect");
        } catch (Throwable th2) {
            StringBuilder a11 = f3.a("ZXLoadLibraryError:");
            a11.append(th2.getMessage());
            Log.e(TAG, a11.toString());
        }
    }

    public static void addZXIDChangedListener(ZXIDChangedListener zXIDChangedListener) {
        try {
            if (checkAPI()) {
                api.addZXIDChangedListener(zXIDChangedListener);
            }
        } catch (Throwable th2) {
            g3.a(th2, f3.a("ZXManager.registerListener(listener) failed: "));
        }
    }

    public static void allowPermissionDialog(boolean z11) {
        try {
            if (checkAPI()) {
                api.allowPermissionDialog(z11);
            }
        } catch (Throwable th2) {
            g3.a(th2, f3.a("ZXManager.allowPermissionDialog failed: "));
        }
    }

    private static boolean checkAPI() {
        if (api != null) {
            return true;
        }
        r.b("ZXManager not init, should init firstly");
        return false;
    }

    public static void checkPermission(Activity activity, PermissionCallback permissionCallback) {
        if (permissionCallback == null) {
            return;
        }
        try {
            if (checkAPI()) {
                api.checkPermission(activity, permissionCallback);
            }
        } catch (Throwable th2) {
            r.b(th2.getMessage());
        }
    }

    public static void getAuthToken(Callback callback) {
        try {
            if (checkAPI() && callback != null) {
                api.getAuthToken(callback);
            }
        } catch (Throwable th2) {
            g3.a(th2, f3.a("ZXManager getAuthToken onFailed:"));
        }
    }

    public static void getOpenID(Callback callback) {
        try {
            if (checkAPI() && callback != null) {
                Context context = ctx;
                if (context != null) {
                    api.getOpenID(callback, context);
                } else {
                    r.b("Context is empty！Please should init firstly");
                    callback.onFailed(PushConsts.SET_TAG_RESULT, "Context is empty！Please should init firstly");
                }
            }
        } catch (Throwable th2) {
            if (callback != null) {
                callback.onFailed(10000, th2.getMessage());
            }
            g3.a(th2, f3.a("ZXManager.getOpenID(Callback) failed: "));
        }
    }

    public static void getSAID(String str, String str2, String str3, String str4, String str5, SAIDCallback sAIDCallback) {
        try {
            if (checkAPI() && sAIDCallback != null) {
                api.getSAID(str, str2, str3, str4, str5, sAIDCallback);
            }
        } catch (Throwable th2) {
            g3.a(th2, f3.a("ZXManager getSAID onFailed:"));
        }
    }

    public static void getTag(Callback callback) {
        try {
            if (checkAPI() && callback != null) {
                api.getTag(callback);
            }
        } catch (Throwable th2) {
            g3.a(th2, f3.a("ZXManager getTag onFailed:"));
        }
    }

    public static String getVersion() {
        try {
            if (!checkAPI()) {
                return "3.3.4.43514";
            }
            api.getVersion();
            return "3.3.4.43514";
        } catch (Throwable th2) {
            g3.a(th2, f3.a("ZXManager.getVersion failed: "));
            return "3.3.4.43514";
        }
    }

    public static void getZXID(ZXIDListener zXIDListener) {
        try {
            if (checkAPI() && zXIDListener != null) {
                api.getZXID(zXIDListener);
            }
        } catch (Throwable th2) {
            if (zXIDListener != null) {
                zXIDListener.onFailed(10000, th2.getMessage());
            }
            g3.a(th2, f3.a("ZXManager.getZXID(zxidListener) failed: "));
        }
    }

    public static void init(Context context) {
        try {
            if (api == null) {
                api = new g2(x1.a(context));
            }
            api.init(context);
            if (context != null) {
                ctx = context.getApplicationContext();
            }
        } catch (Throwable th2) {
            Log.e(TAG, "ZXManager.init failed: " + th2);
        }
    }

    public static String invoke(String str, String str2) {
        try {
            return !checkAPI() ? "ZXManager is not init" : api.invoke(str, str2);
        } catch (Throwable th2) {
            g3.a(th2, f3.a("ZXManager.invoke failed: "));
            return null;
        }
    }

    public static boolean isAllowPermissionDialog() {
        try {
            if (checkAPI()) {
                return api.isAllowPermissionDialog();
            }
            return false;
        } catch (Throwable th2) {
            g3.a(th2, f3.a("ZXManager.isAllowPermissionDialog failed: "));
            return false;
        }
    }

    public static boolean isEnable() {
        try {
            if (checkAPI()) {
                return api.isEnable();
            }
            return false;
        } catch (Throwable th2) {
            g3.a(th2, f3.a("ZXManager.isEnable failed: "));
            return false;
        }
    }

    public static ZXApi newSDK(String str) {
        try {
            return new g2(str);
        } catch (Throwable th2) {
            r.b("ZXManager.newProxy failed:" + th2);
            return null;
        }
    }

    public static void setDebug(boolean z11) {
        try {
            r.f46671a = z11;
            ZXApi zXApi = api;
            if (zXApi != null) {
                zXApi.setDebug(z11);
            }
        } catch (Throwable th2) {
            r.b(th2.getMessage());
        }
    }

    public static void setEnable(boolean z11) {
        try {
            if (checkAPI()) {
                api.setEnable(z11);
            }
        } catch (Throwable th2) {
            g3.a(th2, f3.a("ZXManager.setEnable failed: "));
        }
    }
}
