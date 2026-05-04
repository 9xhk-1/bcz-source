package com.huawei.hms.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.huawei.hms.activity.BridgeActivity;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.adapter.sysobs.SystemManager;
import com.huawei.hms.adapter.sysobs.SystemObserver;
import com.huawei.hms.adapter.ui.NotInstalledHmsAdapter;
import com.huawei.hms.adapter.ui.UpdateAdapter;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.note.AppSpoofResolution;
import com.huawei.hms.utils.Checker;
import com.huawei.hms.utils.HMSBIInitializer;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.PackageManagerHelper;
import com.huawei.hms.utils.UIUtil;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class AvailableAdapter {

    /* renamed from: a, reason: collision with root package name */
    private final int f35264a;

    /* renamed from: b, reason: collision with root package name */
    private AvailableCallBack f35265b;

    /* renamed from: d, reason: collision with root package name */
    private SystemObserver f35267d = new a();

    /* renamed from: c, reason: collision with root package name */
    private boolean f35266c = false;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface AvailableCallBack {
        void onComplete(int i11);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements SystemObserver {
        public a() {
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemObserver
        public boolean onNoticeResult(int i11) {
            AvailableCallBack a11 = AvailableAdapter.this.a();
            if (a11 == null) {
                HMSLog.e("AvailableAdapter", "onNoticeResult baseCallBack null");
                return true;
            }
            a11.onComplete(i11);
            return true;
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemObserver
        public boolean onSolutionResult(Intent intent, String str) {
            return false;
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemObserver
        public boolean onUpdateResult(int i11) {
            AvailableCallBack a11 = AvailableAdapter.this.a();
            if (a11 == null) {
                HMSLog.e("AvailableAdapter", "onUpdateResult baseCallBack null");
                return true;
            }
            a11.onComplete(i11);
            return true;
        }
    }

    public AvailableAdapter(int i11) {
        this.f35264a = i11;
    }

    private void b(Context context) {
        HMSBIInitializer.getInstance(context).initBI();
    }

    public int checkHuaweiMobileServicesForUpdate(Context context) {
        Checker.checkNonNull(context, "context must not be null.");
        int a11 = a(context);
        if (a11 != 0 || !HMSPackageManager.getInstance(context).isApkNeedUpdate(this.f35264a)) {
            return a11;
        }
        HMSLog.i("AvailableAdapter", "The current version does not meet the target version requirements");
        return 2;
    }

    public int isHuaweiMobileServicesAvailable(Context context) {
        Checker.checkNonNull(context, "context must not be null.");
        int a11 = a(context);
        if (a11 != 0 || !HMSPackageManager.getInstance(context).isApkUpdateNecessary(this.f35264a)) {
            return a11;
        }
        HMSLog.i("AvailableAdapter", "The current version does not meet the minimum version requirements");
        return 2;
    }

    public boolean isUserNoticeError(int i11) {
        return i11 == 29;
    }

    public boolean isUserResolvableError(int i11) {
        return i11 == 1 || i11 == 2;
    }

    public void setCalledBySolutionInstallHms(boolean z11) {
        this.f35266c = z11;
    }

    public void startNotice(Activity activity, AvailableCallBack availableCallBack) {
        if (activity == null || availableCallBack == null) {
            return;
        }
        if (UIUtil.isBackground(activity)) {
            HMSLog.i("AvailableAdapter", "current app is in Background");
            availableCallBack.onComplete(28);
        } else {
            HMSLog.i("AvailableAdapter", "startNotice");
            this.f35265b = availableCallBack;
            SystemManager.getSystemNotifier().registerObserver(this.f35267d);
            activity.startActivity(BridgeActivity.getIntentStartBridgeActivity(activity, AppSpoofResolution.class.getName()));
        }
    }

    public void startResolution(Activity activity, AvailableCallBack availableCallBack) {
        if (activity == null || availableCallBack == null) {
            return;
        }
        b(activity);
        if (UIUtil.isBackground(activity)) {
            HMSLog.i("AvailableAdapter", "current app is in Background");
            availableCallBack.onComplete(28);
            return;
        }
        boolean a11 = a(activity);
        if (!AvailableUtil.isInstallerLibExist(activity) && !a11) {
            a(activity, availableCallBack);
            return;
        }
        HMSLog.i("AvailableAdapter", "startResolution");
        this.f35265b = availableCallBack;
        SystemManager.getSystemNotifier().registerObserver(this.f35267d);
        Intent intentStartBridgeActivity = BridgeActivity.getIntentStartBridgeActivity(activity, UpdateAdapter.class.getName());
        intentStartBridgeActivity.putExtra(CommonCode.MapKey.UPDATE_VERSION, this.f35264a);
        if (this.f35266c) {
            intentStartBridgeActivity.putExtra("installHMS", "installHMS");
        }
        intentStartBridgeActivity.putExtra(CommonCode.MapKey.NEW_UPDATE, a11);
        activity.startActivity(intentStartBridgeActivity);
    }

    private int a(Context context) {
        if (HMSPackageManager.getInstance(context).isUseOldCertificate()) {
            HMSLog.e("AvailableAdapter", "The CP uses the old certificate to terminate the connection.");
            return 13;
        }
        PackageManagerHelper.PackageStates hMSPackageStatesForMultiService = HMSPackageManager.getInstance(context).getHMSPackageStatesForMultiService();
        if (PackageManagerHelper.PackageStates.NOT_INSTALLED.equals(hMSPackageStatesForMultiService)) {
            HMSLog.i("AvailableAdapter", "HMS is not installed");
            return 1;
        }
        if (PackageManagerHelper.PackageStates.SPOOF.equals(hMSPackageStatesForMultiService)) {
            HMSLog.i("AvailableAdapter", "HMS is spoofed");
            return 29;
        }
        if (!PackageManagerHelper.PackageStates.DISABLED.equals(hMSPackageStatesForMultiService)) {
            return 0;
        }
        HMSLog.i("AvailableAdapter", "HMS is disabled");
        return 3;
    }

    private void a(Activity activity, AvailableCallBack availableCallBack) {
        HMSLog.i("AvailableAdapter", "<showHmsApkNotInstalledDialog> startResolution");
        if (NotInstalledHmsAdapter.getShowLock()) {
            this.f35265b = availableCallBack;
            SystemManager.getSystemNotifier().registerObserver(this.f35267d);
            activity.startActivity(BridgeActivity.getIntentStartBridgeActivity(activity, NotInstalledHmsAdapter.class.getName()));
            return;
        }
        availableCallBack.onComplete(31);
    }

    private boolean a(Activity activity) {
        if (HMSPackageManager.getInstance(activity).isUpdateHmsForThirdPartyDevice() || HMSPackageManager.getInstance(activity).getHmsVersionCode() < 40000000) {
            return false;
        }
        HMSLog.i("AvailableAdapter", "enter 4.0 HmsCore upgrade process");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AvailableCallBack a() {
        return this.f35265b;
    }
}
