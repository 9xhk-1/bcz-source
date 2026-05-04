package com.baicizhan.client.business.util;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class SystemUtil {
    public static boolean DEBUG = false;

    private SystemUtil() {
    }

    public static void copyToClipboard(@NonNull Context context, String toCopy) {
        ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", toCopy));
    }

    public static void hideIME(View holder) {
        if (holder == null) {
            return;
        }
        ((InputMethodManager) holder.getContext().getSystemService("input_method")).hideSoftInputFromWindow(holder.getWindowToken(), 0);
    }

    public static boolean isAppInstalled(Context context, String appPackageName) {
        try {
            context.getPackageManager().getPackageInfo(appPackageName, 1);
            return true;
        } catch (PackageManager.NameNotFoundException e11) {
            e11.printStackTrace();
            return false;
        }
    }

    public static boolean isProcessAlive(Context context, String process) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(it.next().processName, process)) {
                return true;
            }
        }
        return false;
    }

    public static void showIME(View holder) {
        if (holder == null) {
            return;
        }
        ((InputMethodManager) holder.getContext().getSystemService("input_method")).showSoftInput(holder, 2);
    }

    public static void toast(final Context context, final String msg) {
        if ((context instanceof Activity) && DEBUG) {
            ((Activity) context).runOnUiThread(new Runnable() { // from class: com.baicizhan.client.business.util.SystemUtil.1
                @Override // java.lang.Runnable
                public void run() {
                    va.g.i(msg, 0);
                }
            });
        }
    }
}
