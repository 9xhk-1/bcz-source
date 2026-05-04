package com.huawei.hms.framework.common;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Process;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class ContextCompat {
    private static final String TAG = "ContextCompat";

    public static boolean checkSelfPermission(Context context, String str) {
        if (context == null || str == null) {
            Logger.w(TAG, "param is null");
            return false;
        }
        try {
            return context.checkPermission(str, Process.myPid(), Process.myUid()) == 0;
        } catch (RuntimeException e11) {
            Logger.e(TAG, "dealType rethrowFromSystemServer:", e11);
            return false;
        }
    }

    public static Context getProtectedStorageContext(Context context) {
        if (context != null) {
            return context.createDeviceProtectedStorageContext();
        }
        Logger.w(TAG, "context is null");
        return null;
    }

    public static Object getSystemService(Context context, String str) {
        if (context == null) {
            Logger.w(TAG, "context is null");
            return null;
        }
        try {
            return context.getSystemService(str);
        } catch (RuntimeException e11) {
            Logger.e(TAG, "SystemServer error:", e11);
            return null;
        }
    }

    public static Intent registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (context == null) {
            Logger.w(TAG, "context is null");
            return null;
        }
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (RuntimeException e11) {
            Logger.e(TAG, "dealType rethrowFromSystemServer:", e11);
            return null;
        }
    }

    public static ComponentName startService(Context context, Intent intent) {
        if (context == null) {
            Logger.w(TAG, "context is null");
            return null;
        }
        try {
            return context.startService(intent);
        } catch (RuntimeException e11) {
            Logger.e(TAG, "SystemServer error:", e11);
            return null;
        }
    }

    public static void unregisterReceiver(Context context, BroadcastReceiver broadcastReceiver) {
        if (context == null) {
            Logger.w(TAG, "context is null");
            return;
        }
        try {
            context.unregisterReceiver(broadcastReceiver);
        } catch (RuntimeException e11) {
            Logger.e(TAG, "SystemServer error:", e11);
        }
    }

    public static Intent registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler) {
        if (context == null) {
            Logger.w(TAG, "context is null");
            return null;
        }
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler);
        } catch (RuntimeException e11) {
            Logger.e(TAG, "dealType rethrowFromSystemServer:", e11);
            return null;
        }
    }
}
