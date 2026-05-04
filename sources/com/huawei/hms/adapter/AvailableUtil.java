package com.huawei.hms.adapter;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.AndroidException;
import com.huawei.hms.adapter.ui.UpdateAdapter;
import com.huawei.hms.common.HmsCheckedState;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.AgHmsUpdateState;
import ma.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class AvailableUtil {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f35269a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static boolean f35270b = false;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f35271c = false;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f35272a;

        public a(Context context) {
            this.f35272a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            HMSLog.i("AvailableUtil", "enter asyncCheckHmsV3UpdateInfo");
            if (AvailableUtil.isInstallerLibExist(this.f35272a)) {
                UpdateAdapter.invokeMethod("com.huawei.hms.adapter.ui.InstallerAdapter", "checkHmsUpdateInfo", new Object[]{this.f35272a});
                HMSLog.i("AvailableUtil", "quit asyncCheckHmsV3UpdateInfo");
            } else {
                AgHmsUpdateState.getInstance().setCheckedState(HmsCheckedState.NOT_NEED_UPDATE);
                HMSLog.e("AvailableUtil", "asyncCheckHmsV3UpdateInfo installer is not exist");
            }
        }
    }

    public static void asyncCheckHmsUpdateInfo(Context context) {
        if (HmsCheckedState.UNCHECKED != AgHmsUpdateState.getInstance().getCheckedState()) {
            HMSLog.i("AvailableUtil", "asyncCheckHmsUpdateInfo, not need to check");
        } else {
            new Thread(new a(context), "Thread-asyncCheckHmsV3UpdateInfo").start();
        }
    }

    public static boolean isInstallerLibExist(Context context) {
        boolean z11;
        Bundle bundle;
        Object obj;
        if (f35270b) {
            HMSLog.i("AvailableUtil", "installerInit exist: " + f35271c);
            return f35271c;
        }
        synchronized (f35269a) {
            if (!f35270b) {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    HMSLog.e("AvailableUtil", "In isAvailableLibExist, Failed to get 'PackageManager' instance.");
                } else {
                    try {
                        ApplicationInfo applicationInfo = packageManager.getPackageInfo(context.getPackageName(), 128).applicationInfo;
                        if (applicationInfo != null && (bundle = applicationInfo.metaData) != null && (obj = bundle.get("availableHMSCoreInstaller")) != null && String.valueOf(obj).equalsIgnoreCase(b.H0)) {
                            HMSLog.i("AvailableUtil", "available exist: true");
                        }
                    } catch (AndroidException unused) {
                        HMSLog.e("AvailableUtil", "In isInstallerLibExist, Failed to read meta data for the availableHMSCoreInstaller.");
                    } catch (RuntimeException e11) {
                        HMSLog.e("AvailableUtil", "In isInstallerLibExist, Failed to read meta data for the availableHMSCoreInstaller.", e11);
                    }
                    z11 = false;
                    f35271c = z11;
                    f35270b = true;
                }
                z11 = true;
                f35271c = z11;
                f35270b = true;
            }
        }
        HMSLog.i("AvailableUtil", "available exist: " + f35271c);
        return f35271c;
    }
}
