package com.huawei.hms.update.ui;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.huawei.hms.activity.IBridgeActivityDelegate;
import com.huawei.hms.adapter.sysobs.SystemManager;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.download.ThreadWrapper;
import com.huawei.hms.update.download.UpdateDownload;
import com.huawei.hms.update.download.api.IOtaUpdate;
import com.huawei.hms.update.download.api.IUpdateCallback;
import com.huawei.hms.update.download.api.UpdateInfo;
import com.huawei.hms.update.download.api.UpdateStatus;
import com.huawei.hms.update.manager.HmsApkReallySizeManager;
import com.huawei.hms.update.ui.ConfirmDialogs;
import com.huawei.hms.update.ui.PromptDialogs;
import com.huawei.hms.utils.FileUtil;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.NetWorkUtil;
import com.huawei.hms.utils.ResourceLoaderUtil;
import com.huawei.updatesdk.UpdateSdkAPI;
import com.huawei.updatesdk.service.appmgr.bean.ApkUpgradeInfo;
import com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import java.io.File;
import java.io.Serializable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class UpdateWizard extends AbsUpdateWizard implements IUpdateCallback {

    /* renamed from: a, reason: collision with root package name */
    private IOtaUpdate f36671a;

    /* renamed from: b, reason: collision with root package name */
    private UpdateInfo f36672b;

    /* renamed from: c, reason: collision with root package name */
    private int f36673c = 0;

    /* renamed from: d, reason: collision with root package name */
    private boolean f36674d;

    /* renamed from: e, reason: collision with root package name */
    private a f36675e;

    /* renamed from: f, reason: collision with root package name */
    private String f36676f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements HmsApkReallySizeManager.CheckHmsApkSizeCallback {

        /* renamed from: a, reason: collision with root package name */
        final UpdateWizard f36682a;

        /* renamed from: b, reason: collision with root package name */
        final AbstractDialog f36683b;

        public a(UpdateWizard updateWizard, AbstractDialog abstractDialog) {
            this.f36682a = updateWizard;
            this.f36683b = abstractDialog;
        }

        @Override // com.huawei.hms.update.manager.HmsApkReallySizeManager.CheckHmsApkSizeCallback
        public void onResult(String str) {
            this.f36682a.f36676f = str;
            UpdateWizard updateWizard = this.f36682a;
            updateWizard.b(updateWizard, this.f36683b);
        }
    }

    private boolean a(int i11) {
        return i11 == 9;
    }

    private boolean b(Activity activity) {
        if (this.bean.getResolutionInstallHMS()) {
            HMSLog.i("UpdateWizard", "getResolutionInstallHMS, status: true");
            return true;
        }
        if (HMSPackageManager.getInstance(activity).isApkUpdateNecessary(this.bean.getClientVersionCode())) {
            return true;
        }
        dismissDialog();
        SystemManager.getInstance().notifyUpdateResult(0);
        return false;
    }

    private void c() {
        if (startNextWizard(false)) {
            biReportEvent(8, this.updateType);
        } else {
            finishBridgeActivity(8, this.updateType);
        }
    }

    private void d() {
        Activity activity = getActivity();
        if (activity == null || activity.isFinishing()) {
            a(PromptDialogs.DownloadFailurePrompt.class);
        } else if (b(activity)) {
            a();
            ThreadWrapper threadWrapper = new ThreadWrapper(new UpdateDownload(activity));
            this.f36671a = threadWrapper;
            threadWrapper.downloadPackage(this, this.f36672b);
        }
    }

    public void e() {
        finishBridgeActivity(13, this.updateType);
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public int getRequestCode() {
        return 2006;
    }

    @Override // com.huawei.hms.update.ui.AbsUpdateWizard, com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityCreate(Activity activity) {
        super.onBridgeActivityCreate(activity);
        if (this.bean == null) {
            finishBridgeActivity(8, 6);
            return;
        }
        this.updateType = 6;
        if (!b(activity)) {
            finishBridgeActivity(8, this.updateType);
        } else if (this.bean.isNeedConfirm() && !TextUtils.isEmpty(this.mClientAppName)) {
            a(InstallConfirm.class);
        } else {
            a(CheckProgress.class);
            a(this);
        }
    }

    @Override // com.huawei.hms.update.ui.AbsUpdateWizard, com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityDestroy() {
        a();
        super.onBridgeActivityDestroy();
        HmsApkReallySizeManager.getInstance().release();
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public boolean onBridgeActivityResult(int i11, int i12, Intent intent) {
        IBridgeActivityDelegate iBridgeActivityDelegate;
        if (this.needTransfer && (iBridgeActivityDelegate = this.mBridgeActivityDelegate) != null) {
            return iBridgeActivityDelegate.onBridgeActivityResult(i11, i12, intent);
        }
        if (this.updateType != 6 || i11 != getRequestCode()) {
            return false;
        }
        if (isUpdated(this.mPackageName, this.mClientVersionCode)) {
            finishBridgeActivity(0, this.updateType);
            return true;
        }
        c();
        return true;
    }

    @Override // com.huawei.hms.update.ui.AbsUpdateWizard
    public void onCancel(AbstractDialog abstractDialog) {
        HMSLog.i("UpdateWizard", "Enter onCancel.");
        if (abstractDialog instanceof InstallConfirm) {
            e();
            return;
        }
        if (abstractDialog instanceof CheckProgress) {
            a();
            e();
            return;
        }
        if (abstractDialog instanceof DownloadProgress) {
            a();
            a(ConfirmDialogs.StopConfirm.class);
            return;
        }
        if (abstractDialog instanceof ConfirmDialogs.StopConfirm) {
            a(DownloadProgress.class);
            d();
        } else if (abstractDialog instanceof ConfirmDialogs.RetryConfirm) {
            e();
        } else if (abstractDialog instanceof ConfirmDialogs.NetTypeConfirm) {
            e();
        } else {
            c();
        }
    }

    @Override // com.huawei.hms.update.download.api.IUpdateCallback
    public void onCheckUpdate(int i11, UpdateInfo updateInfo) {
        HMSLog.i("UpdateWizard", "Enter onCheckUpdate, status: " + UpdateStatus.statusToString(i11));
        if (i11 == 1000) {
            this.f36672b = updateInfo;
            b();
            return;
        }
        switch (i11) {
            case 1201:
            case 1202:
            case 1203:
                a(PromptDialogs.CheckFailurePrompt.class);
                break;
            default:
                a(PromptDialogs.CheckFailurePrompt.class);
                break;
        }
    }

    @Override // com.huawei.hms.update.ui.AbsUpdateWizard
    public void onDoWork(AbstractDialog abstractDialog) {
        HMSLog.i("UpdateWizard", "Enter onDoWork.");
        if (abstractDialog instanceof InstallConfirm) {
            abstractDialog.dismiss();
            a(CheckProgress.class);
            a(this);
            return;
        }
        if (abstractDialog instanceof ConfirmDialogs.StopConfirm) {
            abstractDialog.dismiss();
            e();
            return;
        }
        if (abstractDialog instanceof ConfirmDialogs.RetryConfirm) {
            a(DownloadProgress.class);
            d();
            return;
        }
        if (abstractDialog instanceof ConfirmDialogs.NetTypeConfirm) {
            a(DownloadProgress.class);
            d();
        } else if (abstractDialog instanceof PromptDialogs.CheckFailurePrompt) {
            c();
        } else if (abstractDialog instanceof PromptDialogs.DownloadFailurePrompt) {
            c();
        } else if (abstractDialog instanceof PromptDialogs.DownloadNoSpacePrompt) {
            c();
        }
    }

    @Override // com.huawei.hms.update.download.api.IUpdateCallback
    public void onDownloadPackage(int i11, int i12, int i13, File file) {
        HMSLog.i("UpdateWizard", "Enter onDownloadPackage, status: " + UpdateStatus.statusToString(i11) + ", reveived: " + i12 + ", total: " + i13);
        if (i11 == 2000) {
            dismissDialog();
            if (file == null) {
                c();
                return;
            } else if (FileUtil.verifyHash(this.f36672b.mHash, file)) {
                a(file);
                return;
            } else {
                HMSLog.i("UpdateWizard", "Hash value mismatch for download file");
                return;
            }
        }
        if (i11 != 2100) {
            switch (i11) {
                case 2201:
                    a(PromptDialogs.DownloadFailurePrompt.class);
                    break;
                case 2202:
                    a(ConfirmDialogs.RetryConfirm.class);
                    break;
                case UpdateStatus.DOWNLOAD_NO_SPACE /* 2203 */:
                case UpdateStatus.DOWNLOAD_NO_STORAGE /* 2204 */:
                    a(PromptDialogs.DownloadNoSpacePrompt.class);
                    break;
            }
            return;
        }
        AbstractDialog abstractDialog = this.mLatestDialog;
        if (abstractDialog == null || !(abstractDialog instanceof DownloadProgress)) {
            return;
        }
        int i14 = (i12 < 0 || i13 <= 0) ? 0 : (int) ((i12 * 100) / i13);
        this.f36673c = i14;
        ((DownloadProgress) abstractDialog).a(i14);
    }

    @Override // com.huawei.hms.update.ui.AbsUpdateWizard, com.huawei.hms.activity.IBridgeActivityDelegate
    public void onKeyUp(int i11, KeyEvent keyEvent) {
        IBridgeActivityDelegate iBridgeActivityDelegate;
        if (this.needTransfer && (iBridgeActivityDelegate = this.mBridgeActivityDelegate) != null) {
            iBridgeActivityDelegate.onKeyUp(i11, keyEvent);
            return;
        }
        if (4 == i11) {
            HMSLog.i("UpdateWizard", "In onKeyUp, Call finish.");
            Activity activity = getActivity();
            if (activity == null || activity.isFinishing()) {
                return;
            }
            activity.setResult(0, null);
            activity.finish();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        if (r0.hasProvider(r1, r2) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.net.Uri a(android.content.Context r5, java.io.File r6) {
        /*
            com.huawei.hms.utils.PackageManagerHelper r0 = new com.huawei.hms.utils.PackageManagerHelper
            r0.<init>(r5)
            java.lang.String r1 = r5.getPackageName()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r3 = ".hms.update.provider"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.content.pm.ApplicationInfo r3 = r5.getApplicationInfo()     // Catch: java.lang.RuntimeException -> L30
            int r3 = r3.targetSdkVersion     // Catch: java.lang.RuntimeException -> L30
            r4 = 23
            if (r3 <= r4) goto L25
            goto L2b
        L25:
            boolean r0 = r0.hasProvider(r1, r2)     // Catch: java.lang.RuntimeException -> L30
            if (r0 == 0) goto L4b
        L2b:
            android.net.Uri r5 = com.huawei.hms.update.provider.UpdateProvider.getUriForFile(r5, r2, r6)
            return r5
        L30:
            r5 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "In contentUriFromFile, getApplicationInfo error: "
            r0.append(r1)
            java.lang.String r5 = r5.getMessage()
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "UpdateWizard"
            com.huawei.hms.support.log.HMSLog.i(r0, r5)
        L4b:
            android.net.Uri r5 = android.net.Uri.fromFile(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.update.ui.UpdateWizard.a(android.content.Context, java.io.File):android.net.Uri");
    }

    private void b() {
        int a11 = a(getActivity());
        HMSLog.i("UpdateWizard", "current network is " + a11);
        if (a11 != 1 && !a(a11)) {
            a(ConfirmDialogs.NetTypeConfirm.class);
            HMSLog.i("UpdateWizard", "current network is not wifi");
        } else {
            a(DownloadProgress.class);
            d();
            HMSLog.i("UpdateWizard", "current network is wifi");
        }
    }

    private static void a(final IUpdateCallback iUpdateCallback, final int i11, final UpdateInfo updateInfo) {
        if (iUpdateCallback != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.huawei.hms.update.ui.UpdateWizard.1
                @Override // java.lang.Runnable
                public void run() {
                    IUpdateCallback.this.onCheckUpdate(i11, updateInfo);
                }
            });
        }
    }

    private int a(Activity activity) {
        if (activity != null) {
            return NetWorkUtil.getNetworkType(activity);
        }
        return 0;
    }

    private void a(File file) {
        Activity activity = getActivity();
        if (activity == null || activity.isFinishing()) {
            return;
        }
        Uri a11 = a(activity, file);
        if (a11 == null) {
            HMSLog.e("UpdateWizard", "In startInstaller, Failed to creates a Uri from a file.");
            c();
            return;
        }
        if (b(activity)) {
            try {
                activity.startActivityForResult(a(a11, activity), getRequestCode());
            } catch (ActivityNotFoundException | SecurityException e11) {
                HMSLog.e("UpdateWizard", "In startInstaller, Failed to start package installer." + e11.getMessage());
                c();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(UpdateWizard updateWizard, AbstractDialog abstractDialog) {
        HMSLog.i("UpdateWizard", "<onResultShowDialog> start");
        boolean z11 = false;
        this.f36674d = false;
        Activity activity = getActivity();
        boolean z12 = activity == null || activity.isFinishing() || activity.isDestroyed();
        AbstractDialog abstractDialog2 = this.mLatestDialog;
        if (abstractDialog2 != null && abstractDialog2.isShowing()) {
            z11 = true;
        }
        if (!z12 && !z11) {
            if (!TextUtils.isEmpty(this.mClientAppName) && (abstractDialog instanceof InstallConfirm)) {
                String string = ResourceLoaderUtil.getString("hms_update_title");
                this.mClientAppName = string;
                InstallConfirm installConfirm = (InstallConfirm) abstractDialog;
                installConfirm.intAppName(string);
                installConfirm.setHmsApkSize(this.f36676f);
            }
            abstractDialog.show(updateWizard);
            this.mLatestDialog = abstractDialog;
            return;
        }
        HMSLog.e("UpdateWizard", "<onResultShowDialog> Activity Destroyed or Dialog isShoing");
    }

    private Intent a(Uri uri, Activity activity) {
        Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL);
        intent.setDataAndType(uri, "application/vnd.android.package-archive");
        intent.setFlags(1);
        intent.putExtra("android.intent.extra.NOT_UNKNOWN_SOURCE", true);
        intent.putExtra("android.intent.extra.INSTALLER_PACKAGE_NAME", activity.getPackageName());
        return intent;
    }

    @Override // com.huawei.hms.update.ui.AbsUpdateWizard
    public void a(Class<? extends AbstractDialog> cls) {
        if (b(getActivity())) {
            dismissDialog();
            try {
                AbstractDialog newInstance = cls.newInstance();
                if (newInstance instanceof InstallConfirm) {
                    Activity activity = getActivity();
                    if (activity != null && !activity.isFinishing() && !activity.isDestroyed()) {
                        if (this.f36674d) {
                            HMSLog.i("UpdateWizard", "<showDialog> isChecking true. return");
                            return;
                        }
                        String apkSize = HmsApkReallySizeManager.getInstance().getApkSize();
                        if (TextUtils.isEmpty(apkSize)) {
                            HMSLog.i("UpdateWizard", "<showDialog> checkAndShowDialog.");
                            a(this, newInstance);
                            return;
                        }
                        this.f36676f = apkSize;
                    }
                    HMSLog.e("UpdateWizard", "<checkHmsSizeAndShowDialog> not show Dialog, activity is null or finishing.");
                    return;
                }
                if (!TextUtils.isEmpty(this.mClientAppName) && (newInstance instanceof InstallConfirm)) {
                    String string = ResourceLoaderUtil.getString("hms_update_title");
                    this.mClientAppName = string;
                    ((InstallConfirm) newInstance).intAppName(string);
                    ((InstallConfirm) newInstance).setHmsApkSize(this.f36676f);
                }
                int i11 = this.f36673c;
                if (i11 > 0 && (newInstance instanceof DownloadProgress)) {
                    ((DownloadProgress) newInstance).intProgress(i11);
                }
                newInstance.show(this);
                this.mLatestDialog = newInstance;
            } catch (IllegalAccessException e11) {
                e = e11;
                HMSLog.e("UpdateWizard", "In showDialog, Failed to show the dialog." + e.getMessage());
            } catch (IllegalStateException e12) {
                e = e12;
                HMSLog.e("UpdateWizard", "In showDialog, Failed to show the dialog." + e.getMessage());
            } catch (InstantiationException e13) {
                e = e13;
                HMSLog.e("UpdateWizard", "In showDialog, Failed to show the dialog." + e.getMessage());
            }
        }
    }

    private void a(UpdateWizard updateWizard, AbstractDialog abstractDialog) {
        Activity activity = getActivity();
        if (activity != null && !activity.isFinishing() && !activity.isDestroyed()) {
            String clientPackageName = this.bean.getClientPackageName();
            HMSLog.i("UpdateWizard", "<checkAndShowDialog> pkgName: " + clientPackageName);
            this.f36674d = true;
            if (this.f36675e == null) {
                this.f36675e = new a(updateWizard, abstractDialog);
            }
            HmsApkReallySizeManager.getInstance().asyncGetSize(activity, clientPackageName, this.f36675e);
            return;
        }
        HMSLog.e("UpdateWizard", "<checkHmsSizeAndShowDialog> not show Dialog, activity is null or finishing.");
    }

    private void a(final IUpdateCallback iUpdateCallback) {
        if (iUpdateCallback == null) {
            return;
        }
        Activity activity = getActivity();
        if (activity != null && !activity.isFinishing()) {
            if (b(activity)) {
                UpdateSdkAPI.checkTargetAppUpdate(activity, this.bean.getClientPackageName(), new CheckUpdateCallBack() { // from class: com.huawei.hms.update.ui.UpdateWizard.2
                    @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
                    public void onMarketStoreError(int i11) {
                        HMSLog.e("UpdateWizard", "onMarketStoreError responseCode: " + i11);
                    }

                    @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
                    public void onUpdateInfo(Intent intent) {
                        if (intent != null) {
                            UpdateWizard.this.a(intent, iUpdateCallback);
                        }
                    }

                    @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
                    public void onUpdateStoreError(int i11) {
                        HMSLog.e("UpdateWizard", "onUpdateStoreError responseCode: " + i11);
                    }

                    @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
                    public void onMarketInstallInfo(Intent intent) {
                    }
                });
                return;
            }
            return;
        }
        a(iUpdateCallback, 1201, (UpdateInfo) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Intent intent, IUpdateCallback iUpdateCallback) {
        try {
            int intExtra = intent.getIntExtra("status", -99);
            HMSLog.i("UpdateWizard", "CheckUpdateCallBack status is " + intExtra);
            String stringExtra = intent.getStringExtra(UpdateKey.FAIL_REASON);
            if (!TextUtils.isEmpty(stringExtra)) {
                HMSLog.e("UpdateWizard", "checkTargetAppUpdate reason is " + stringExtra);
            }
            if (intExtra != 7) {
                if (intExtra == 3) {
                    a(iUpdateCallback, 1202, (UpdateInfo) null);
                    return;
                } else {
                    a(iUpdateCallback, 1201, (UpdateInfo) null);
                    return;
                }
            }
            Serializable serializableExtra = intent.getSerializableExtra(UpdateKey.INFO);
            if (serializableExtra instanceof ApkUpgradeInfo) {
                ApkUpgradeInfo apkUpgradeInfo = (ApkUpgradeInfo) serializableExtra;
                String package_ = apkUpgradeInfo.getPackage_();
                int versionCode_ = apkUpgradeInfo.getVersionCode_();
                String downurl_ = apkUpgradeInfo.getDownurl_();
                int size_ = apkUpgradeInfo.getSize_();
                String sha256_ = apkUpgradeInfo.getSha256_();
                if (!TextUtils.isEmpty(package_) && package_.equals(this.bean.getClientPackageName())) {
                    if (versionCode_ < this.bean.getClientVersionCode()) {
                        HMSLog.e("UpdateWizard", "CheckUpdateCallBack versionCode is " + versionCode_ + "bean.getClientVersionCode() is " + this.bean.getClientVersionCode());
                        a(iUpdateCallback, 1203, (UpdateInfo) null);
                        return;
                    }
                    if (!TextUtils.isEmpty(downurl_) && !TextUtils.isEmpty(sha256_)) {
                        a(iUpdateCallback, 1000, new UpdateInfo(package_, versionCode_, downurl_, size_, sha256_));
                        return;
                    } else {
                        a(iUpdateCallback, 1201, (UpdateInfo) null);
                        return;
                    }
                }
                a(iUpdateCallback, 1201, (UpdateInfo) null);
            }
        } catch (Exception e11) {
            HMSLog.e("UpdateWizard", "intent has some error" + e11.getMessage());
            a(iUpdateCallback, 1201, (UpdateInfo) null);
        }
    }

    private void a() {
        IOtaUpdate iOtaUpdate = this.f36671a;
        if (iOtaUpdate != null) {
            iOtaUpdate.cancel();
            this.f36671a = null;
        }
    }
}
