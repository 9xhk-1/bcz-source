package com.huawei.hms.update.ui;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.huawei.hms.activity.IBridgeActivityDelegate;
import com.huawei.hms.iap.entity.OrderStatusCode;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.ui.SafeBundle;
import com.huawei.hms.update.UpdateConstants;
import com.huawei.hms.update.receive.SilentInstallReceive;
import com.huawei.hms.utils.ResourceLoaderUtil;
import com.vivo.push.PushClientConstants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class SilentUpdateWizard extends AbsUpdateWizard {

    /* renamed from: a, reason: collision with root package name */
    private BroadcastReceiver f36639a;

    /* renamed from: b, reason: collision with root package name */
    private Handler f36640b = new Handler();

    /* renamed from: c, reason: collision with root package name */
    private int f36641c = 0;

    /* renamed from: d, reason: collision with root package name */
    private Handler f36642d = new a();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            SafeBundle safeBundle = new SafeBundle((Bundle) message.obj);
            switch (message.what) {
                case 101:
                    SilentUpdateWizard.this.a(safeBundle);
                    break;
                case 102:
                    SilentUpdateWizard.this.b(safeBundle);
                    break;
                case 103:
                    SilentUpdateWizard.this.c(safeBundle);
                    break;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements Runnable {
        private b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SilentUpdateWizard.this.b(14);
        }

        public /* synthetic */ b(SilentUpdateWizard silentUpdateWizard, a aVar) {
            this();
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public int getRequestCode() {
        return 2000;
    }

    @Override // com.huawei.hms.update.ui.AbsUpdateWizard, com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityCreate(Activity activity) {
        super.onBridgeActivityCreate(activity);
        if (this.bean == null) {
            finishBridgeActivity(8, 0);
            return;
        }
        this.updateType = 0;
        if (a(activity)) {
            return;
        }
        if (startNextWizard(true)) {
            biReportEvent(8, this.updateType);
        } else {
            finishBridgeActivity(8, this.updateType);
        }
    }

    @Override // com.huawei.hms.update.ui.AbsUpdateWizard, com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityDestroy() {
        this.f36640b.removeCallbacksAndMessages(null);
        b();
        super.onBridgeActivityDestroy();
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public boolean onBridgeActivityResult(int i11, int i12, Intent intent) {
        IBridgeActivityDelegate iBridgeActivityDelegate;
        if (this.needTransfer && (iBridgeActivityDelegate = this.mBridgeActivityDelegate) != null) {
            return iBridgeActivityDelegate.onBridgeActivityResult(i11, i12, intent);
        }
        HMSLog.i("SilentUpdateWizard", "onBridgeActivityResult requestCode is " + i11 + "resultCode is " + i12);
        if (i11 != getRequestCode()) {
            return false;
        }
        if (i12 == 0) {
            a();
            a(20000);
            return true;
        }
        if (i12 == 4) {
            c();
            return true;
        }
        if (startNextWizard(true)) {
            biReportEvent(i12, this.updateType);
        } else {
            finishBridgeActivity(i12, this.updateType);
        }
        return true;
    }

    @Override // com.huawei.hms.update.ui.AbsUpdateWizard, com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeConfigurationChanged() {
        super.onBridgeConfigurationChanged();
    }

    @Override // com.huawei.hms.update.ui.AbsUpdateWizard, com.huawei.hms.activity.IBridgeActivityDelegate
    public void onKeyUp(int i11, KeyEvent keyEvent) {
        super.onKeyUp(i11, keyEvent);
    }

    private void b() {
        BroadcastReceiver broadcastReceiver;
        Activity activity = getActivity();
        if (activity == null || (broadcastReceiver = this.f36639a) == null) {
            return;
        }
        activity.unregisterReceiver(broadcastReceiver);
        this.f36639a = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(SafeBundle safeBundle) {
        if (safeBundle.containsKey("packagename") && safeBundle.containsKey("status")) {
            String string = safeBundle.getString("packagename");
            int i11 = safeBundle.getInt("status");
            HMSLog.i("SilentUpdateWizard", "handlerInstallStatus-status is " + i11);
            if (string == null || !string.equals(this.mPackageName)) {
                return;
            }
            if (i11 == 2) {
                this.f36640b.removeCallbacksAndMessages(null);
                AbstractDialog abstractDialog = this.mLatestDialog;
                if (abstractDialog != null) {
                    ((DownloadProgress) abstractDialog).a(100);
                }
                finishBridgeActivity(0, this.updateType);
                return;
            }
            if (i11 == -1 || i11 == -2) {
                b(i11);
            } else {
                a(OrderStatusCode.ORDER_STATE_CANCEL);
            }
        }
    }

    private boolean a(Activity activity) {
        if (TextUtils.isEmpty(this.mPackageName)) {
            return false;
        }
        Intent intent = new Intent(UpdateConstants.ACTION_NAME_HIAPP_SILENT_DOWNLOAD);
        try {
            intent.setPackage("com.huawei.appmarket");
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(PushClientConstants.TAG_PKG_NAME, this.mPackageName);
                jSONObject.put("versioncode", this.mClientVersionCode);
                jSONArray.put(jSONObject);
                intent.putExtra("params", jSONArray.toString());
                intent.putExtra("isHmsOrApkUpgrade", this.bean.isHmsOrApkUpgrade());
                intent.putExtra("buttonDlgY", ResourceLoaderUtil.getString("hms_install"));
                intent.putExtra("buttonDlgN", ResourceLoaderUtil.getString("hms_cancel"));
                intent.putExtra("upgradeDlgContent", ResourceLoaderUtil.getString("hms_update_message_new", "%P"));
                try {
                    HMSLog.i("SilentUpdateWizard", "start silent activity of AppMarket");
                    activity.startActivityForResult(intent, getRequestCode());
                    HMSLog.i("SilentUpdateWizard", "start silent activity finished");
                    return true;
                } catch (ActivityNotFoundException unused) {
                    HMSLog.e("SilentUpdateWizard", "ActivityNotFoundException");
                    return false;
                }
            } catch (JSONException e11) {
                HMSLog.e("SilentUpdateWizard", "create hmsJsonObject fail" + e11.getMessage());
                return false;
            }
        } catch (IllegalArgumentException unused2) {
            HMSLog.e("SilentUpdateWizard", "IllegalArgumentException when silentInstall intent.setPackage");
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i11) {
        this.f36640b.removeCallbacksAndMessages(null);
        b();
        dismissDialog();
        if (!startNextWizard(false)) {
            finishBridgeActivity(i11, this.updateType);
        } else {
            biReportEvent(i11, this.updateType);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(SafeBundle safeBundle) {
        String string = safeBundle.containsKey("UpgradePkgName") ? safeBundle.getString("UpgradePkgName") : null;
        if (string != null && string.equals(this.mPackageName) && safeBundle.containsKey("UpgradeDownloadProgress") && safeBundle.containsKey("UpgradeAppName")) {
            int i11 = safeBundle.getInt("UpgradeDownloadProgress");
            HMSLog.i("SilentUpdateWizard", "handlerDownloadProgress-progress is " + i11);
            a(20000);
            if (i11 >= 99) {
                i11 = 99;
            }
            this.f36641c = i11;
            if (this.mLatestDialog == null) {
                a(DownloadProgress.class);
            }
            AbstractDialog abstractDialog = this.mLatestDialog;
            if (abstractDialog != null) {
                ((DownloadProgress) abstractDialog).a(i11);
            }
        }
    }

    public void c() {
        finishBridgeActivity(13, this.updateType);
    }

    private void a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(UpdateConstants.DOWNLOAD_STATUS_ACTION);
        intentFilter.addAction(UpdateConstants.DOWNLOAD_PROGRESS_ACTION);
        intentFilter.addAction(UpdateConstants.INSTALL_ACTION);
        this.f36639a = new SilentInstallReceive(this.f36642d);
        Activity activity = getActivity();
        if (activity != null) {
            activity.registerReceiver(this.f36639a, intentFilter);
        }
    }

    private void a(int i11) {
        this.f36640b.removeCallbacksAndMessages(null);
        this.f36640b.postDelayed(new b(this, null), i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(SafeBundle safeBundle) {
        String string = safeBundle.containsKey("UpgradePkgName") ? safeBundle.getString("UpgradePkgName") : null;
        if (string != null && string.equals(this.mPackageName) && safeBundle.containsKey("downloadtask.status")) {
            int i11 = safeBundle.getInt("downloadtask.status");
            HMSLog.i("SilentUpdateWizard", "handleDownloadStatus-status is " + i11);
            if (i11 == 3 || i11 == 5 || i11 == 6 || i11 == 8) {
                b(i11);
            } else if (i11 == 4) {
                a(OrderStatusCode.ORDER_STATE_CANCEL);
            } else {
                a(20000);
            }
        }
    }

    @Override // com.huawei.hms.update.ui.AbsUpdateWizard
    public void a(Class<? extends AbstractDialog> cls) {
        try {
            AbstractDialog newInstance = cls.newInstance();
            int i11 = this.f36641c;
            if (i11 > 0 && (newInstance instanceof DownloadProgress)) {
                ((DownloadProgress) newInstance).intProgress(i11);
            }
            newInstance.show(this);
            this.mLatestDialog = newInstance;
        } catch (IllegalAccessException e11) {
            e = e11;
            HMSLog.e("SilentUpdateWizard", "In showDialog, Failed to show the dialog." + e.getMessage());
        } catch (IllegalStateException e12) {
            e = e12;
            HMSLog.e("SilentUpdateWizard", "In showDialog, Failed to show the dialog." + e.getMessage());
        } catch (InstantiationException e13) {
            e = e13;
            HMSLog.e("SilentUpdateWizard", "In showDialog, Failed to show the dialog." + e.getMessage());
        }
    }
}
