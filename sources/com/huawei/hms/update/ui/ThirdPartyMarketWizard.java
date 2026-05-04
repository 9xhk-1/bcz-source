package com.huawei.hms.update.ui;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.view.KeyEvent;
import com.huawei.hms.activity.IBridgeActivityDelegate;
import com.huawei.hms.android.SystemUtils;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.ui.SafeIntent;
import com.huawei.hms.update.manager.HmsApkReallySizeManager;
import com.huawei.hms.update.manager.ThirdPartyMarketConfigManager;
import com.huawei.hms.utils.AgHmsUpdateState;
import com.huawei.hms.utils.ResourceLoaderUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class ThirdPartyMarketWizard extends AbsUpdateWizard {

    /* renamed from: a, reason: collision with root package name */
    private final List<c> f36645a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private HandlerThread f36646b;

    /* renamed from: c, reason: collision with root package name */
    private Handler f36647c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f36648d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f36649e;

    /* renamed from: f, reason: collision with root package name */
    private ThirdPartyMarketConfigManager.MarketConfig f36650f;

    /* renamed from: g, reason: collision with root package name */
    private String f36651g;

    /* renamed from: h, reason: collision with root package name */
    private b f36652h;

    /* renamed from: i, reason: collision with root package name */
    private d f36653i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f36654j;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b implements ThirdPartyMarketConfigManager.MarketConfigCallback {

        /* renamed from: a, reason: collision with root package name */
        final ThirdPartyMarketWizard f36655a;

        /* renamed from: b, reason: collision with root package name */
        final AbstractDialog f36656b;

        public b(ThirdPartyMarketWizard thirdPartyMarketWizard, AbstractDialog abstractDialog) {
            this.f36655a = thirdPartyMarketWizard;
            this.f36656b = abstractDialog;
        }

        @Override // com.huawei.hms.update.manager.ThirdPartyMarketConfigManager.MarketConfigCallback
        public void onResult(ThirdPartyMarketConfigManager.MarketConfig marketConfig) {
            this.f36655a.f36648d = true;
            this.f36655a.f36650f = marketConfig;
            ThirdPartyMarketWizard thirdPartyMarketWizard = this.f36655a;
            thirdPartyMarketWizard.b(thirdPartyMarketWizard, this.f36656b);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        private String f36657a;

        /* renamed from: b, reason: collision with root package name */
        private int f36658b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f36659c;

        private c() {
        }

        public int a() {
            return this.f36658b;
        }

        public boolean b() {
            return this.f36659c;
        }

        public String toString() {
            return "JumpMarketState{packageName='" + this.f36657a + "', requestCode=" + this.f36658b + ", isJumpSuccessful=" + this.f36659c + l50.b.f69928j;
        }

        public void a(String str) {
            this.f36657a = str;
        }

        public void a(int i11) {
            this.f36658b = i11;
        }

        public void a(boolean z11) {
            this.f36659c = z11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d implements HmsApkReallySizeManager.CheckHmsApkSizeCallback {

        /* renamed from: a, reason: collision with root package name */
        final ThirdPartyMarketWizard f36660a;

        /* renamed from: b, reason: collision with root package name */
        final AbsUpdateWizard f36661b;

        /* renamed from: c, reason: collision with root package name */
        final AbstractDialog f36662c;

        public d(ThirdPartyMarketWizard thirdPartyMarketWizard, AbsUpdateWizard absUpdateWizard, AbstractDialog abstractDialog) {
            this.f36660a = thirdPartyMarketWizard;
            this.f36661b = absUpdateWizard;
            this.f36662c = abstractDialog;
        }

        @Override // com.huawei.hms.update.manager.HmsApkReallySizeManager.CheckHmsApkSizeCallback
        public void onResult(String str) {
            this.f36660a.f36649e = true;
            this.f36660a.f36651g = str;
            this.f36660a.b(this.f36661b, this.f36662c);
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public int getRequestCode() {
        return 2008;
    }

    @Override // com.huawei.hms.update.ui.AbsUpdateWizard, com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityCreate(Activity activity) {
        super.onBridgeActivityCreate(activity);
        HMSLog.i("ThirdPartyMarketWizard", "<onBridgeActivityCreate>");
        if (this.bean == null) {
            HMSLog.i("ThirdPartyMarketWizard", "<onBridgeActivityCreate>");
            finishBridgeActivity(8, 9);
            return;
        }
        HandlerThread handlerThread = new HandlerThread("ThirdPartyMarketWizard");
        this.f36646b = handlerThread;
        handlerThread.start();
        this.f36647c = new Handler(this.f36646b.getLooper());
        this.updateType = 9;
        if (this.bean.isNeedConfirm() && !TextUtils.isEmpty(this.mClientAppName)) {
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
        HMSLog.i("ThirdPartyMarketWizard", "<onBridgeActivityDestroy>");
        Handler handler = this.f36647c;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f36647c = null;
        }
        HandlerThread handlerThread = this.f36646b;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f36646b = null;
        }
        HmsApkReallySizeManager.getInstance().release();
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public boolean onBridgeActivityResult(int i11, int i12, Intent intent) {
        IBridgeActivityDelegate iBridgeActivityDelegate;
        HMSLog.i("ThirdPartyMarketWizard", "<onBridgeActivityResult> requestCode: " + i11 + ", updateType: " + this.updateType);
        for (c cVar : this.f36645a) {
            if (i11 == cVar.a()) {
                HMSLog.i("ThirdPartyMarketWizard", "<onBridgeActivityResult> " + cVar);
                if (!cVar.b()) {
                    return true;
                }
            }
        }
        if (this.needTransfer && (iBridgeActivityDelegate = this.mBridgeActivityDelegate) != null) {
            return iBridgeActivityDelegate.onBridgeActivityResult(i11, i12, intent);
        }
        HMSLog.i("ThirdPartyMarketWizard", "mPackageName: " + this.mPackageName + ", mClientVersionCode: " + this.mClientVersionCode);
        if (this.updateType != 9 || !a(i11)) {
            return false;
        }
        if (isUpdated(this.mPackageName, this.mClientVersionCode)) {
            finishBridgeActivity(0, this.updateType);
        } else {
            finishBridgeActivity(8, this.updateType);
        }
        return true;
    }

    @Override // com.huawei.hms.update.ui.AbsUpdateWizard, com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeConfigurationChanged() {
        super.onBridgeConfigurationChanged();
        HMSLog.i("ThirdPartyMarketWizard", "<onBridgeConfigurationChanged>");
    }

    @Override // com.huawei.hms.update.ui.AbsUpdateWizard
    public void onCancel(AbstractDialog abstractDialog) {
        HMSLog.i("ThirdPartyMarketWizard", "Enter onCancel.");
        if (abstractDialog instanceof InstallConfirm) {
            b();
        }
    }

    @Override // com.huawei.hms.update.ui.AbsUpdateWizard
    public void onDoWork(AbstractDialog abstractDialog) {
        HMSLog.i("ThirdPartyMarketWizard", "Enter onDoWork.");
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
            HMSLog.i("ThirdPartyMarketWizard", "In onKeyUp, Call finish.");
            Activity activity = getActivity();
            if (activity == null || activity.isFinishing()) {
                return;
            }
            activity.setResult(0, null);
            activity.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(AbsUpdateWizard absUpdateWizard, AbstractDialog abstractDialog) {
        HMSLog.i("ThirdPartyMarketWizard", "<onResultShowDialog> isSizeDone: " + this.f36649e + ", mMarketConfig: " + this.f36650f);
        if (this.f36649e && this.f36648d) {
            boolean z11 = false;
            this.f36654j = false;
            Activity activity = getActivity();
            boolean z12 = activity == null || activity.isFinishing() || activity.isDestroyed();
            AbstractDialog abstractDialog2 = this.mLatestDialog;
            if (abstractDialog2 != null && abstractDialog2.isShowing()) {
                z11 = true;
            }
            if (z12 || z11) {
                HMSLog.e("ThirdPartyMarketWizard", "<onResultShowDialog> Activity Destroyed or Dialog isShoing");
                return;
            }
            if (TextUtils.isEmpty(this.f36651g)) {
                this.f36651g = a(activity);
            }
            if (!TextUtils.isEmpty(this.mClientAppName) && (abstractDialog instanceof InstallConfirm)) {
                String string = ResourceLoaderUtil.getString("hms_update_title");
                this.mClientAppName = string;
                InstallConfirm installConfirm = (InstallConfirm) abstractDialog;
                installConfirm.intAppName(string);
                installConfirm.setHmsApkSize(this.f36651g);
            }
            abstractDialog.show(absUpdateWizard);
            this.mLatestDialog = abstractDialog;
        }
    }

    private boolean a() {
        HMSLog.i("ThirdPartyMarketWizard", "<gotoAppMarketForUpdate> start");
        if (AgHmsUpdateState.getInstance().isUpdateHms()) {
            HMSLog.i("ThirdPartyMarketWizard", "<gotoAppMarketForUpdate> need go to HUAWEI app market server for update");
            this.bean.setClientVersionCode(AgHmsUpdateState.getInstance().getTargetVersionCode());
            return false;
        }
        Activity activity = getActivity();
        if (activity != null && !activity.isFinishing()) {
            if (TextUtils.isEmpty(this.mPackageName)) {
                HMSLog.e("ThirdPartyMarketWizard", "<gotoAppMarketForUpdate> mPackageName is empty");
                return false;
            }
            ThirdPartyMarketConfigManager.MarketConfig marketConfig = this.f36650f;
            if (marketConfig != null && marketConfig.getAppMarketList().size() != 0) {
                for (int i11 = 0; i11 < this.f36650f.getAppMarketList().size(); i11++) {
                    String packageName = this.f36650f.getAppMarketList().get(i11).getPackageName();
                    c cVar = new c();
                    cVar.a(packageName);
                    cVar.a(getRequestCode() + 1000 + i11);
                    try {
                        SafeIntent safeIntent = new SafeIntent(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL));
                        safeIntent.setData(Uri.parse("market://details?id=" + this.mPackageName));
                        safeIntent.setPackage(packageName);
                        HMSLog.i("ThirdPartyMarketWizard", "startActivityForResult");
                        activity.startActivityForResult(safeIntent, cVar.a());
                        cVar.a(true);
                        this.f36645a.add(cVar);
                        HMSLog.i("ThirdPartyMarketWizard", "open AppMarket successful: " + packageName + ", requestCode: " + cVar.a());
                        return true;
                    } catch (ActivityNotFoundException | IllegalArgumentException unused) {
                        cVar.a(false);
                        this.f36645a.add(cVar);
                        HMSLog.e("ThirdPartyMarketWizard", "can not open AppMarket: " + packageName + ", requestCode: " + cVar.a());
                    }
                }
                return false;
            }
            HMSLog.e("ThirdPartyMarketWizard", "<gotoAppMarketForUpdate> mMarketConfig is null or marketlist is 0");
            return false;
        }
        HMSLog.e("ThirdPartyMarketWizard", "<gotoAppMarketForUpdate> activity is null or isFinishing");
        return false;
    }

    public void b() {
        HMSLog.i("ThirdPartyMarketWizard", "<userCancelUpdate>");
        finishBridgeActivity(13, this.updateType);
    }

    @Override // com.huawei.hms.update.ui.AbsUpdateWizard
    public void a(Class<? extends AbstractDialog> cls) {
        HMSLog.i("ThirdPartyMarketWizard", "<showDialog> start");
        if (this.f36654j) {
            HMSLog.i("ThirdPartyMarketWizard", "<showDialog> isChecking true, return");
            return;
        }
        dismissDialog();
        try {
            AbstractDialog newInstance = cls.newInstance();
            ThirdPartyMarketConfigManager.MarketConfig marketConfig = ThirdPartyMarketConfigManager.getInstance().getMarketConfig();
            String apkSize = HmsApkReallySizeManager.getInstance().getApkSize();
            if (marketConfig != null && !TextUtils.isEmpty(apkSize)) {
                this.f36650f = marketConfig;
                this.f36651g = apkSize;
                Activity activity = getActivity();
                if (activity != null && !activity.isFinishing() && !activity.isDestroyed()) {
                    if (!TextUtils.isEmpty(this.mClientAppName) && (newInstance instanceof InstallConfirm)) {
                        String string = ResourceLoaderUtil.getString("hms_update_title");
                        this.mClientAppName = string;
                        ((InstallConfirm) newInstance).intAppName(string);
                        ((InstallConfirm) newInstance).setHmsApkSize(this.f36651g);
                    }
                    newInstance.show(this);
                    this.mLatestDialog = newInstance;
                    return;
                }
                HMSLog.e("ThirdPartyMarketWizard", "<showDialog> not show Dialog, activity is null or finishing.");
                return;
            }
            HMSLog.i("ThirdPartyMarketWizard", "<showDialog> checkAndShowDialog.");
            a(this, newInstance);
        } catch (IllegalAccessException e11) {
            e = e11;
            HMSLog.e("ThirdPartyMarketWizard", "In showDialog, Failed to show the dialog." + e.getMessage());
        } catch (IllegalStateException e12) {
            e = e12;
            HMSLog.e("ThirdPartyMarketWizard", "In showDialog, Failed to show the dialog." + e.getMessage());
        } catch (InstantiationException e13) {
            e = e13;
            HMSLog.e("ThirdPartyMarketWizard", "In showDialog, Failed to show the dialog." + e.getMessage());
        }
    }

    private void a(AbsUpdateWizard absUpdateWizard, AbstractDialog abstractDialog) {
        Activity activity = getActivity();
        if (activity != null && !activity.isFinishing() && !activity.isDestroyed()) {
            String clientPackageName = this.bean.getClientPackageName();
            HMSLog.i("ThirdPartyMarketWizard", "<checkAndShowDialog> pkgName: " + clientPackageName);
            this.f36654j = true;
            if (this.f36652h == null) {
                this.f36652h = new b(this, abstractDialog);
            }
            ThirdPartyMarketConfigManager.getInstance().asyncGetMarketConfig(activity, this.f36647c, this.f36652h);
            if (this.f36653i == null) {
                this.f36653i = new d(this, absUpdateWizard, abstractDialog);
            }
            HmsApkReallySizeManager.getInstance().asyncGetSize(activity, clientPackageName, this.f36653i);
            return;
        }
        HMSLog.e("ThirdPartyMarketWizard", "<checkHmsSizeAndShowDialog> not show Dialog, activity is null or finishing.");
    }

    private String a(Activity activity) {
        ThirdPartyMarketConfigManager.MarketConfig marketConfig = this.f36650f;
        if (marketConfig != null && marketConfig.getAppMarketList().size() > 0) {
            try {
                String formatFileSize = Formatter.formatFileSize(activity, SystemUtils.getMegabyte(Double.parseDouble(this.f36650f.getAppMarketList().get(0).getPackageSize())));
                HMSLog.e("ThirdPartyMarketWizard", "<getConfigPkgSize> configPkgSize: " + formatFileSize);
                return formatFileSize;
            } catch (RuntimeException e11) {
                HMSLog.e("ThirdPartyMarketWizard", "<getConfigPkgSize> parse config size failed. " + e11.getMessage());
                return "";
            }
        }
        return "";
    }

    private boolean a(int i11) {
        Iterator<c> it = this.f36645a.iterator();
        while (it.hasNext()) {
            if (i11 == it.next().a()) {
                return true;
            }
        }
        return false;
    }
}
