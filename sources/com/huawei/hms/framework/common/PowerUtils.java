package com.huawei.hms.framework.common;

import android.annotation.SuppressLint;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.os.PowerManager;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class PowerUtils {
    private static final String TAG = "PowerUtils";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class PowerMode {
        static final int POWER_MODE_DEFAULT_RETURN_VALUE = 0;
        static final int POWER_SAVER_MODE = 4;
        static final String SMART_MODE_STATUS = "SmartModeStatus";
    }

    public static boolean isAppIdleMode(Context context) {
        if (context == null) {
            Logger.i(TAG, "isAppIdleMode Context is null!");
            return false;
        }
        String packageName = context.getPackageName();
        Object systemService = context.getSystemService("usagestats");
        if (systemService instanceof UsageStatsManager) {
            return ((UsageStatsManager) systemService).isAppInactive(packageName);
        }
        return false;
    }

    public static boolean isDozeIdleMode(Context context) {
        if (context == null) {
            Logger.i(TAG, "isDozeIdleMode Context is null!");
            return false;
        }
        Object systemService = ContextCompat.getSystemService(context, c6.d.f8118j);
        PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
        if (powerManager == null) {
            Logger.i(TAG, "isDozeIdleMode powerManager is null!");
            return false;
        }
        try {
            return powerManager.isDeviceIdleMode();
        } catch (RuntimeException e11) {
            Logger.e(TAG, "dealType rethrowFromSystemServer:", e11);
            return false;
        }
    }

    public static boolean isInteractive(Context context) {
        if (context == null) {
            return false;
        }
        Object systemService = ContextCompat.getSystemService(context, c6.d.f8118j);
        if (!(systemService instanceof PowerManager)) {
            return false;
        }
        try {
            return ((PowerManager) systemService).isInteractive();
        } catch (RuntimeException e11) {
            Logger.i(TAG, "getActiveNetworkInfo failed, exception:" + e11.getClass().getSimpleName() + e11.getMessage());
            return false;
        }
    }

    public static boolean isWhilteList(Context context) {
        if (context == null) {
            return false;
        }
        Object systemService = ContextCompat.getSystemService(context, c6.d.f8118j);
        PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
        String packageName = context.getPackageName();
        if (powerManager == null) {
            return false;
        }
        try {
            return powerManager.isIgnoringBatteryOptimizations(packageName);
        } catch (RuntimeException e11) {
            Logger.e(TAG, "dealType rethrowFromSystemServer:", e11);
            return false;
        }
    }

    @SuppressLint({"MissingPermission"})
    public static int readDataSaverMode(Context context) {
        if (context == null) {
            Logger.i(TAG, "readDataSaverMode manager is null!");
            return 0;
        }
        Object systemService = context.getSystemService("connectivity");
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        if (connectivityManager == null) {
            Logger.i(TAG, "readDataSaverMode Context is null!");
            return 0;
        }
        if (ContextCompat.checkSelfPermission(context, yk.e.f100168b)) {
            return 0;
        }
        if (connectivityManager.isActiveNetworkMetered()) {
            return connectivityManager.getRestrictBackgroundStatus();
        }
        Logger.v(TAG, "ConnectType is not Mobile Network!");
        return 0;
    }

    public static int readPowerSaverMode(Context context) {
        if (context == null) {
            Logger.i(TAG, "readPowerSaverMode Context is null!");
            return 0;
        }
        int systemInt = SettingUtil.getSystemInt(context.getContentResolver(), "SmartModeStatus", 0);
        if (systemInt != 0) {
            return systemInt;
        }
        Object systemService = ContextCompat.getSystemService(context, c6.d.f8118j);
        PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
        if (powerManager == null) {
            return systemInt;
        }
        try {
            return powerManager.isPowerSaveMode() ? 4 : 0;
        } catch (RuntimeException e11) {
            Logger.e(TAG, "dealType rethrowFromSystemServer:", e11);
            return systemInt;
        }
    }
}
