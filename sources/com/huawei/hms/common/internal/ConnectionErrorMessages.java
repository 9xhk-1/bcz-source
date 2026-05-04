package com.huawei.hms.common.internal;

import android.app.Activity;
import android.content.Context;
import com.huawei.hms.adapter.AvailableUtil;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.ResourceLoaderUtil;
import com.huawei.hms.utils.Util;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class ConnectionErrorMessages {
    private static boolean a(Context context) {
        return context != null && Util.isAvailableLibExist(context) && AvailableUtil.isInstallerLibExist(context);
    }

    public static String getErrorDialogButtonMessage(Activity activity, int i11) {
        if (activity == null) {
            return null;
        }
        if (ResourceLoaderUtil.getmContext() == null) {
            ResourceLoaderUtil.setmContext(activity.getApplicationContext());
        }
        return i11 != 1 ? i11 != 2 ? ResourceLoaderUtil.getString("hms_confirm") : a(activity) ? ResourceLoaderUtil.getString("hms_update") : ResourceLoaderUtil.getString("hms_confirm") : a(activity) ? ResourceLoaderUtil.getString("hms_install") : ResourceLoaderUtil.getString("hms_confirm");
    }

    public static String getErrorMessage(Activity activity, int i11) {
        if (activity == null) {
            return null;
        }
        if (ResourceLoaderUtil.getmContext() == null) {
            ResourceLoaderUtil.setmContext(activity.getApplicationContext());
        }
        if (i11 == 1 || i11 == 2) {
            return a(activity) ? ResourceLoaderUtil.getString("hms_update_title") : activity.getString(ResourceLoaderUtil.getStringId("hms_apk_not_installed_hints"), Util.getAppName(activity, activity.getPackageName()));
        }
        return null;
    }

    public static String getErrorTitle(Activity activity, int i11) {
        if (activity == null) {
            return null;
        }
        if (ResourceLoaderUtil.getmContext() == null) {
            ResourceLoaderUtil.setmContext(activity.getApplicationContext());
        }
        if (i11 == 1) {
            if (a(activity)) {
                return ResourceLoaderUtil.getString("hms_install_message");
            }
            return null;
        }
        if (i11 == 2) {
            if (a(activity)) {
                return ResourceLoaderUtil.getString("hms_update_message");
            }
            return null;
        }
        if (i11 == 3) {
            return ResourceLoaderUtil.getString("hms_bindfaildlg_message");
        }
        if (i11 == 9) {
            HMSLog.e("HuaweiApiAvailability", "Huawei Mobile Services is invalid. Cannot recover.");
            return null;
        }
        HMSLog.e("HuaweiApiAvailability", "Unexpected error code " + i11);
        return null;
    }
}
