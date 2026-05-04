package com.bun.miitmdid.provider.nubia;

import android.content.ContentProviderClient;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.bun.miitmdid.i0;

/* loaded from: classes6.dex */
public class NubiaIdentityImpl {
    private static final String TAG = "NubiaIdentityImpl";
    private static Uri uri = Uri.parse("content://cn.nubia.identity/identity");

    private static Object generalMethod(Context context, String str, @Nullable String str2, String str3, Class<?> cls) {
        try {
            ContentProviderClient acquireContentProviderClient = context.getContentResolver().acquireContentProviderClient(uri);
            if (acquireContentProviderClient == null) {
                i0.d(TAG, "generalMethod: contentResolver is null");
                return null;
            }
            Bundle call = acquireContentProviderClient.call(str, str2, null);
            acquireContentProviderClient.close();
            if (call == null) {
                i0.d(TAG, "generalMethod: bundle is null");
                return null;
            }
            if (call.getInt("code", -1) == 0) {
                i0.c(TAG, "generalMethod: success");
                if (cls == Boolean.class) {
                    return Boolean.valueOf(call.getBoolean(str3, false));
                }
                if (cls == String.class) {
                    return call.getString(str3, "");
                }
                return null;
            }
            i0.d(TAG, "generalMethod: failed:" + call.getString("message"));
            return null;
        } catch (Exception e11) {
            i0.d(TAG, "generalMethod: Exception: " + e11.getMessage());
            return null;
        }
    }

    public static String getAAID(Context context, String str) {
        Object generalMethod = generalMethod(context, "getAAID", str, "id", String.class);
        return generalMethod == null ? "" : (String) generalMethod;
    }

    public static String getOAID(Context context) {
        Object generalMethod = generalMethod(context, "getOAID", null, "id", String.class);
        return generalMethod == null ? "" : (String) generalMethod;
    }

    public static String getVAID(Context context, String str) {
        Object generalMethod = generalMethod(context, "getVAID", str, "id", String.class);
        return generalMethod == null ? "" : (String) generalMethod;
    }

    public static boolean isSupported(Context context) {
        Object generalMethod = generalMethod(context, "isSupport", null, "issupport", Boolean.class);
        if (generalMethod == null) {
            return false;
        }
        return ((Boolean) generalMethod).booleanValue();
    }
}
