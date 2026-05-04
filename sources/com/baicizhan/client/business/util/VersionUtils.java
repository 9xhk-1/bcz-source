package com.baicizhan.client.business.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Pair;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class VersionUtils {
    public static String getVerName(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e11) {
            e11.printStackTrace();
            return "";
        }
    }

    public static int getVersionCode(Context mContext) {
        try {
            return mContext.getPackageManager().getPackageInfo(mContext.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e11) {
            e11.printStackTrace();
            return 0;
        }
    }

    public static Pair<String, Integer> getVersionInfo(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            return new Pair<>(packageInfo.versionName, Integer.valueOf(packageInfo.versionCode));
        } catch (PackageManager.NameNotFoundException e11) {
            e11.printStackTrace();
            return new Pair<>("", 0);
        }
    }
}
