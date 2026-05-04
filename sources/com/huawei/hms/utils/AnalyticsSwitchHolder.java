package com.huawei.hms.utils;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.AndroidException;
import com.huawei.hms.support.hianalytics.HiAnalyticsUtils;
import com.huawei.hms.support.log.HMSLog;
import java.sql.Timestamp;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class AnalyticsSwitchHolder {
    public static final int ANALYTICS_DISABLED = 2;
    public static final int ANALYTICS_ENABLED = 1;

    /* renamed from: a, reason: collision with root package name */
    private static volatile int f36694a;

    /* renamed from: b, reason: collision with root package name */
    private static final Object f36695b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static volatile Long f36696c = 0L;

    /* renamed from: d, reason: collision with root package name */
    private static volatile boolean f36697d = false;

    /* renamed from: e, reason: collision with root package name */
    private static volatile boolean f36698e = false;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f36699a;

        public a(Context context) {
            this.f36699a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            AnalyticsSwitchHolder.f(this.f36699a);
            HMSLog.i("AnalyticsSwitchHolder", "getStateForHmsAnalyticsProvider");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f36700a;

        public b(Context context) {
            this.f36700a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            HMSLog.i("AnalyticsSwitchHolder", "enter setAnalyticsStateAndTimestamp");
            AnalyticsSwitchHolder.f(this.f36700a);
            HMSLog.i("AnalyticsSwitchHolder", "quit setAnalyticsStateAndTimestamp");
        }
    }

    private static boolean b(Context context) {
        Bundle bundle;
        if (context == null) {
            HMSLog.e("AnalyticsSwitchHolder", "In getBiIsReportSetting, context is null.");
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                ApplicationInfo applicationInfo = packageManager.getPackageInfo(context.getPackageName(), 128).applicationInfo;
                if (applicationInfo != null && (bundle = applicationInfo.metaData) != null) {
                    return bundle.getBoolean("com.huawei.hms.client.bireport.setting");
                }
            } catch (AndroidException unused) {
                HMSLog.e("AnalyticsSwitchHolder", "In getBiIsReportSetting, Failed to read meta data bi report setting.");
            } catch (RuntimeException e11) {
                HMSLog.e("AnalyticsSwitchHolder", "In getBiIsReportSetting, Failed to read meta data bi report setting.", e11);
            }
        }
        HMSLog.i("AnalyticsSwitchHolder", "In getBiIsReportSetting, configuration not found for bi report setting.");
        return false;
    }

    private static void c(Context context) {
        f36696c = Long.valueOf(new Timestamp(System.currentTimeMillis()).getTime());
        new Thread(new a(context), "Thread-getStateForHmsAnalyticsProvider").start();
    }

    private static boolean d(Context context) {
        return RegionUtils.isChinaROM(context);
    }

    private static void e(Context context) {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        if (timestamp.getTime() - f36696c.longValue() < 86400000 || f36696c.longValue() <= 0) {
            return;
        }
        f36696c = Long.valueOf(timestamp.getTime());
        new Thread(new b(context), "Thread-refreshOobeAnalyticsState").start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f(Context context) {
        if (context == null) {
            HMSLog.e("AnalyticsSwitchHolder", "In setAnalyticsState、, context is null.");
            return;
        }
        if (HiAnalyticsUtils.getInstance().getOobeAnalyticsState(context) != 1) {
            synchronized (f36695b) {
                f36694a = 2;
            }
            com.huawei.hms.stats.a.c().a();
            return;
        }
        synchronized (f36695b) {
            f36694a = 1;
        }
        if (HiAnalyticsUtils.getInstance().getInitFlag() || f36697d) {
            return;
        }
        HMSBIInitializer.getInstance(context).initHaSDK();
        f36697d = true;
    }

    public static int getAndRefreshAnalyticsState(Context context) {
        int i11;
        synchronized (f36695b) {
            isAnalyticsDisabled(context);
            i11 = f36694a;
        }
        return i11;
    }

    public static boolean getBiSetting(Context context) {
        Bundle bundle;
        if (context == null) {
            HMSLog.e("AnalyticsSwitchHolder", "In getBiSetting, context is null.");
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                ApplicationInfo applicationInfo = packageManager.getPackageInfo(context.getPackageName(), 128).applicationInfo;
                if (applicationInfo != null && (bundle = applicationInfo.metaData) != null) {
                    return bundle.getBoolean("com.huawei.hms.client.bi.setting");
                }
            } catch (AndroidException unused) {
                HMSLog.e("AnalyticsSwitchHolder", "In getBiSetting, Failed to read meta data bisetting.");
            } catch (RuntimeException e11) {
                HMSLog.e("AnalyticsSwitchHolder", "In getBiSetting, Failed to read meta data bisetting.", e11);
            }
        }
        HMSLog.i("AnalyticsSwitchHolder", "In getBiSetting, configuration not found for bisetting.");
        return false;
    }

    public static boolean isAnalyticsDisabled(Context context) {
        synchronized (f36695b) {
            try {
                if (f36694a == 0) {
                    if (context == null) {
                        return true;
                    }
                    if (b(context)) {
                        HMSLog.i("AnalyticsSwitchHolder", "Builder->biReportSetting :true");
                        f36694a = 1;
                    } else if (getBiSetting(context)) {
                        HMSLog.i("AnalyticsSwitchHolder", "Builder->biSetting :true");
                        f36694a = 2;
                    } else if (d(context)) {
                        f36694a = 1;
                    } else {
                        HMSLog.i("AnalyticsSwitchHolder", "not ChinaROM");
                        f36694a = 3;
                        f36698e = true;
                        c(context);
                    }
                } else if (f36698e) {
                    e(context);
                }
                return f36694a != 1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
