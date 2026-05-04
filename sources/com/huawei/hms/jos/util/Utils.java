package com.huawei.hms.jos.util;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.UiModeManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import com.huawei.hms.jos.JosConstant;
import com.huawei.hms.jos.manager.InnerActivityManager;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.HMSPackageManager;
import java.util.List;
import pq.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class Utils {
    public static final String TV_APPMARKET_PACKAGE_NAME = "com.huawei.appmarket.tv";
    public static final String TV_GAME_BOX_PACKAGE_NAME = "com.huawei.gamebox.tv";

    /* renamed from: a, reason: collision with root package name */
    private static int f36074a;

    /* renamed from: b, reason: collision with root package name */
    private static int f36075b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements DialogInterface.OnShowListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AlertDialog f36076a;

        public a(AlertDialog alertDialog) {
            this.f36076a = alertDialog;
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            Button button = this.f36076a.getButton(-1);
            if (button == null) {
                return;
            }
            button.setFocusable(true);
            button.requestFocus();
        }
    }

    private static int a(Context context) {
        return b(context) ? 4 : 5;
    }

    private static boolean b(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static int dp2Px(Context context, float f11) {
        return (int) ((f11 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int getActivityWidth(Activity activity) {
        if (activity == null || activity.isFinishing()) {
            HMSLog.e(b.f81108a, "activity is invalid");
            return 0;
        }
        View findViewById = activity.findViewById(R.id.content);
        if (findViewById != null) {
            return findViewById.getMeasuredWidth();
        }
        int screenW = getScreenW(activity);
        HMSLog.e(b.f81108a, "getActivityWidth error:android.R.id.content is null,return getScreenW");
        return screenW;
    }

    public static String getBuildVersion() {
        return String.valueOf(Build.DISPLAY);
    }

    public static String getDeviceModel() {
        return Build.MODEL;
    }

    public static int getDialogThemeId(Context context) {
        int identifier = context.getResources().getIdentifier("androidhwext:style/Theme.Emui.Dialog.Alert", null, null);
        return identifier == 0 ? a(context) : identifier;
    }

    public static String getHMSPackageName(Context context) {
        if (context != null) {
            return HMSPackageManager.getInstance(context).getHMSPackageNameForMultiService();
        }
        HMSLog.w(b.f81108a, "getHMSPackageName fail, context is null.");
        return "";
    }

    public static int getPackageVersionCode(String str) {
        PackageManager packageManager;
        if (TextUtils.isEmpty(str)) {
            HMSLog.w(b.f81108a, "getPackageVersionCode fail, packageName is " + str);
            return 0;
        }
        try {
            Activity currentActivity = InnerActivityManager.get().getCurrentActivity();
            packageManager = currentActivity == null ? null : currentActivity.getPackageManager();
        } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
        }
        if (packageManager == null) {
            HMSLog.e(b.f81108a, "getPackageVersionCode error, getCurrentActivity is null");
            return 0;
        }
        PackageInfo packageInfo = packageManager.getPackageInfo(str, 16);
        if (packageInfo != null) {
            return packageInfo.versionCode;
        }
        return 0;
    }

    public static int getSDKVersionCode(Context context) {
        if (context == null) {
            HMSLog.e(b.f81108a, "context is null, get getSDKVersionCode failed");
            return 0;
        }
        int i11 = f36074a;
        if (i11 > 0) {
            return i11;
        }
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle != null) {
                f36074a = bundle.getInt("com.huawei.hms.jos.versioncode");
                HMSLog.i(b.f81108a, "Jos Service Kit version:" + f36074a);
                return f36074a;
            }
        } catch (Exception unused) {
            HMSLog.e(b.f81108a, "get getSDKVersionCode ");
        }
        return 0;
    }

    public static int getScreenW(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        int i11 = displayMetrics.widthPixels;
        f36075b = i11;
        return i11;
    }

    public static void handleDlg(AlertDialog alertDialog) {
        alertDialog.setOnShowListener(new a(alertDialog));
    }

    public static boolean isAppVisible() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        try {
            Activity currentActivity = InnerActivityManager.get().getCurrentActivity();
            if (currentActivity == null) {
                HMSLog.e(b.f81108a, "get current activity failed");
                return false;
            }
            Object systemService = currentActivity.getSystemService("activity");
            if (!(systemService instanceof ActivityManager) || (runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses()) == null) {
                return true;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pkgList[0].equals(currentActivity.getPackageName()) && runningAppProcessInfo.importance < 200) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            HMSLog.e(b.f81108a, "check the app isBackground meet exception");
            return true;
        }
    }

    public static boolean isGameBoxTVInstalled(Context context) {
        return a(context, TV_GAME_BOX_PACKAGE_NAME) != null;
    }

    public static boolean isIntegratedGameAnalyticsSDK(Context context) {
        if (isTv(context)) {
            HMSLog.d(b.f81108a, "TV not support game analytics sdk.");
            return false;
        }
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle != null) {
                return 1 == bundle.getInt(JosConstant.HW_GAME_ANALYTICS_EXIST, 0);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            HMSLog.w(b.f81108a, "get analytics state meet exception.");
        }
        return false;
    }

    public static boolean isTv(Context context) {
        if (((UiModeManager) context.getSystemService("uimode")).getCurrentModeType() == 4) {
            HMSLog.d(b.f81108a, "Running on a TV Device");
            return true;
        }
        HMSLog.d(b.f81108a, "Running on a non-TV Device");
        return false;
    }

    private static PackageInfo a(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return null;
        }
        try {
            return packageManager.getPackageInfo(str, 64);
        } catch (Exception unused) {
            HMSLog.w(b.f81108a, "Valid Jos Application meet NameNotFoundException.");
            return null;
        }
    }
}
