package com.huawei.hms.update.ui;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.huawei.hms.activity.IBridgeActivityDelegate;
import com.huawei.hms.android.SystemUtils;
import com.huawei.hms.jos.util.Utils;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.manager.HmsApkReallySizeManager;
import com.huawei.hms.utils.PackageManagerHelper;
import com.huawei.hms.utils.ResourceLoaderUtil;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class HiappWizard extends AbsUpdateWizard {

    /* renamed from: a, reason: collision with root package name */
    private boolean f36553a;

    /* renamed from: b, reason: collision with root package name */
    private a f36554b;

    /* renamed from: c, reason: collision with root package name */
    private String f36555c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements HmsApkReallySizeManager.CheckHmsApkSizeCallback {

        /* renamed from: a, reason: collision with root package name */
        final HiappWizard f36556a;

        /* renamed from: b, reason: collision with root package name */
        final AbstractDialog f36557b;

        public a(HiappWizard hiappWizard, AbstractDialog abstractDialog) {
            this.f36556a = hiappWizard;
            this.f36557b = abstractDialog;
        }

        @Override // com.huawei.hms.update.manager.HmsApkReallySizeManager.CheckHmsApkSizeCallback
        public void onResult(String str) {
            this.f36556a.f36555c = str;
            HiappWizard hiappWizard = this.f36556a;
            hiappWizard.b(hiappWizard, this.f36557b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(HiappWizard hiappWizard, AbstractDialog abstractDialog) {
        HMSLog.i("HiappWizard", "<onResultShowDialog> start");
        boolean z11 = false;
        this.f36553a = false;
        Activity activity = getActivity();
        boolean z12 = activity == null || activity.isFinishing() || activity.isDestroyed();
        AbstractDialog abstractDialog2 = this.mLatestDialog;
        if (abstractDialog2 != null && abstractDialog2.isShowing()) {
            z11 = true;
        }
        if (z12 || z11) {
            HMSLog.e("HiappWizard", "<onResultShowDialog> Activity Destroyed or Dialog isShoing");
            return;
        }
        if (!TextUtils.isEmpty(this.mClientAppName) && (abstractDialog instanceof InstallConfirm)) {
            String string = ResourceLoaderUtil.getString("hms_update_title");
            this.mClientAppName = string;
            InstallConfirm installConfirm = (InstallConfirm) abstractDialog;
            installConfirm.intAppName(string);
            installConfirm.setHmsApkSize(this.f36555c);
        }
        abstractDialog.show(hiappWizard);
        this.mLatestDialog = abstractDialog;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public int getRequestCode() {
        return 2005;
    }

    @Override // com.huawei.hms.update.ui.AbsUpdateWizard, com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityCreate(Activity activity) {
        super.onBridgeActivityCreate(activity);
        UpdateBean updateBean = this.bean;
        if (updateBean == null) {
            finishBridgeActivity(8, 5);
            return;
        }
        this.updateType = 5;
        if (updateBean.isNeedConfirm() && !TextUtils.isEmpty(this.mClientAppName)) {
            a(InstallConfirm.class);
        } else {
            if (a()) {
                return;
            }
            if (startNextWizard(false)) {
                biReportEvent(8, this.updateType);
            } else {
                finishBridgeActivity(8, this.updateType);
            }
        }
    }

    @Override // com.huawei.hms.update.ui.AbsUpdateWizard, com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityDestroy() {
        super.onBridgeActivityDestroy();
        HmsApkReallySizeManager.getInstance().release();
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public boolean onBridgeActivityResult(int i11, int i12, Intent intent) {
        IBridgeActivityDelegate iBridgeActivityDelegate;
        if (this.needTransfer && (iBridgeActivityDelegate = this.mBridgeActivityDelegate) != null) {
            return iBridgeActivityDelegate.onBridgeActivityResult(i11, i12, intent);
        }
        if (this.updateType != 5 || i11 != getRequestCode()) {
            return false;
        }
        if (isUpdated(this.mPackageName, this.mClientVersionCode)) {
            finishBridgeActivity(0, this.updateType);
            return true;
        }
        finishBridgeActivity(8, this.updateType);
        return true;
    }

    @Override // com.huawei.hms.update.ui.AbsUpdateWizard, com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeConfigurationChanged() {
        super.onBridgeConfigurationChanged();
    }

    @Override // com.huawei.hms.update.ui.AbsUpdateWizard
    public void onCancel(AbstractDialog abstractDialog) {
        HMSLog.i("HiappWizard", "Enter onCancel.");
        if (abstractDialog instanceof InstallConfirm) {
            b();
        }
    }

    @Override // com.huawei.hms.update.ui.AbsUpdateWizard
    public void onDoWork(AbstractDialog abstractDialog) {
        HMSLog.i("HiappWizard", "Enter onDoWork.");
        if (abstractDialog instanceof InstallConfirm) {
            abstractDialog.dismiss();
            if (a()) {
                return;
            }
            if (startNextWizard(false)) {
                biReportEvent(8, this.updateType);
            } else {
                finishBridgeActivity(8, this.updateType);
            }
        }
    }

    @Override // com.huawei.hms.update.ui.AbsUpdateWizard, com.huawei.hms.activity.IBridgeActivityDelegate
    public void onKeyUp(int i11, KeyEvent keyEvent) {
        IBridgeActivityDelegate iBridgeActivityDelegate;
        if (this.needTransfer && (iBridgeActivityDelegate = this.mBridgeActivityDelegate) != null) {
            iBridgeActivityDelegate.onKeyUp(i11, keyEvent);
            return;
        }
        if (4 == i11) {
            HMSLog.i("HiappWizard", "In onKeyUp, Call finish.");
            Activity activity = getActivity();
            if (activity == null || activity.isFinishing()) {
                return;
            }
            activity.setResult(0, null);
            activity.finish();
        }
    }

    private boolean a() {
        Activity activity = getActivity();
        if (activity == null || activity.isFinishing() || TextUtils.isEmpty(this.mPackageName)) {
            return false;
        }
        try {
            Intent intent = new Intent();
            intent.setAction("com.huawei.appmarket.intent.action.AppDetail");
            intent.putExtra("APP_PACKAGENAME", this.mPackageName);
            if (SystemUtils.isTVDevice()) {
                int packageVersionCode = new PackageManagerHelper(activity).getPackageVersionCode("com.hisilicon.android.hiRMService");
                HMSLog.i("HiappWizard", "version " + packageVersionCode);
                if (packageVersionCode == 1) {
                    HMSLog.i("HiappWizard", "startActivity");
                    intent.addFlags(268435456);
                    return a(intent, activity);
                }
            }
            HMSLog.i("HiappWizard", "startActivityForResult");
            if (a(intent)) {
                activity.startActivityForResult(intent, getRequestCode());
                return true;
            }
        } catch (ActivityNotFoundException | IllegalArgumentException unused) {
            HMSLog.e("HiappWizard", "can not open hiapp");
        }
        return false;
    }

    public void b() {
        finishBridgeActivity(13, this.updateType);
    }

    private boolean a(Intent intent, Activity activity) {
        boolean a11 = a(intent);
        if (a11) {
            activity.startActivity(intent);
            activity.finish();
        }
        return a11;
    }

    private boolean a(Intent intent) {
        try {
            List<ResolveInfo> queryIntentActivities = getActivity().getPackageManager().queryIntentActivities(intent, 65536);
            if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Utils.TV_APPMARKET_PACKAGE_NAME);
                arrayList.add("com.huawei.appmarket.car");
                arrayList.add("com.huawei.appmarket");
                for (ResolveInfo resolveInfo : queryIntentActivities) {
                    if (arrayList.contains(resolveInfo.activityInfo.packageName)) {
                        try {
                            intent.setPackage(resolveInfo.activityInfo.packageName);
                            return true;
                        } catch (IllegalArgumentException unused) {
                            HMSLog.e("HiappWizard", "IllegalArgumentException when HiappWizard-setIntentPackageName");
                        }
                    }
                }
            }
            return false;
        } catch (Exception e11) {
            HMSLog.e("HiappWizard", "setIntentPackageName query intent failed. " + e11.getMessage());
            return false;
        }
    }

    @Override // com.huawei.hms.update.ui.AbsUpdateWizard
    public void a(Class<? extends AbstractDialog> cls) {
        dismissDialog();
        try {
            AbstractDialog newInstance = cls.newInstance();
            Activity activity = getActivity();
            if (activity != null && !activity.isFinishing() && !activity.isDestroyed()) {
                if (this.f36553a) {
                    HMSLog.i("HiappWizard", "<showDialog> isChecking true. return");
                    return;
                }
                String apkSize = HmsApkReallySizeManager.getInstance().getApkSize();
                if (TextUtils.isEmpty(apkSize)) {
                    HMSLog.i("HiappWizard", "<showDialog> checkAndShowDialog.");
                    a(this, newInstance);
                    return;
                }
                this.f36555c = apkSize;
                if (!TextUtils.isEmpty(this.mClientAppName) && (newInstance instanceof InstallConfirm)) {
                    String string = ResourceLoaderUtil.getString("hms_update_title");
                    this.mClientAppName = string;
                    ((InstallConfirm) newInstance).intAppName(string);
                    ((InstallConfirm) newInstance).setHmsApkSize(this.f36555c);
                }
                newInstance.show(this);
                this.mLatestDialog = newInstance;
                return;
            }
            HMSLog.e("HiappWizard", "<checkHmsSizeAndShowDialog> not show Dialog, activity is null or finishing.");
        } catch (IllegalAccessException e11) {
            e = e11;
            HMSLog.e("HiappWizard", "In showDialog, Failed to show the dialog." + e.getMessage());
        } catch (IllegalStateException e12) {
            e = e12;
            HMSLog.e("HiappWizard", "In showDialog, Failed to show the dialog." + e.getMessage());
        } catch (InstantiationException e13) {
            e = e13;
            HMSLog.e("HiappWizard", "In showDialog, Failed to show the dialog." + e.getMessage());
        }
    }

    private void a(HiappWizard hiappWizard, AbstractDialog abstractDialog) {
        Activity activity = getActivity();
        if (activity != null && !activity.isFinishing() && !activity.isDestroyed()) {
            String clientPackageName = this.bean.getClientPackageName();
            HMSLog.i("HiappWizard", "<checkAndShowDialog> pkgName: " + clientPackageName);
            this.f36553a = true;
            if (this.f36554b == null) {
                this.f36554b = new a(hiappWizard, abstractDialog);
            }
            HmsApkReallySizeManager.getInstance().asyncGetSize(activity, clientPackageName, this.f36554b);
            return;
        }
        HMSLog.e("HiappWizard", "<checkHmsSizeAndShowDialog> not show Dialog, activity is null or finishing.");
    }
}
