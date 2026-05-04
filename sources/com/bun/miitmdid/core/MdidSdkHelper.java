package com.bun.miitmdid.core;

import android.content.Context;
import com.bun.miitmdid.e;
import com.bun.miitmdid.interfaces.IIdentifierListener;
import com.bun.miitmdid.interfaces.IPermissionCallbackListener;

/* loaded from: classes6.dex */
public class MdidSdkHelper {
    public static final int SDK_VERSION_CODE = e.a();
    private static long globalTimeout = 5000;

    public static boolean InitCert(Context context, String str) {
        try {
            return e.a(context, str);
        } catch (AbstractMethodError | Error | Exception unused) {
            return false;
        }
    }

    public static int InitSdk(Context context, boolean z11, IIdentifierListener iIdentifierListener) {
        try {
            return new e(z11, globalTimeout).a(context, iIdentifierListener);
        } catch (UnsatisfiedLinkError | Error | Exception unused) {
            return 1008615;
        }
    }

    public static void requestOAIDPermission(Context context, IPermissionCallbackListener iPermissionCallbackListener) {
        e.a(context, iPermissionCallbackListener);
    }

    public static boolean setGlobalTimeout(long j11) {
        if (j11 <= 0) {
            return false;
        }
        globalTimeout = j11;
        return true;
    }

    public static int InitSdk(Context context, boolean z11, boolean z12, boolean z13, boolean z14, IIdentifierListener iIdentifierListener) {
        try {
            return new e(z11, globalTimeout, z12, z13, z14).a(context, iIdentifierListener);
        } catch (UnsatisfiedLinkError | Error | Exception unused) {
            return 1008615;
        }
    }
}
