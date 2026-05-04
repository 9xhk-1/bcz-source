package com.huawei.hms.framework.common;

import android.content.Context;
import android.content.pm.PackageManager;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class PackageUtils {
    private static final String TAG = "PackageUtils";

    public static String getVersionName(Context context) {
        if (context == null) {
            return "";
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 16384).versionName;
        } catch (PackageManager.NameNotFoundException e11) {
            Logger.w(TAG, "", e11);
            return "";
        }
    }
}
