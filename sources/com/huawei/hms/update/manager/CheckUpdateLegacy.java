package com.huawei.hms.update.manager;

import android.app.Activity;
import android.content.Intent;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.updatesdk.UpdateSdkAPI;
import com.huawei.updatesdk.service.appmgr.bean.ApkUpgradeInfo;
import com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class CheckUpdateLegacy {

    /* renamed from: a, reason: collision with root package name */
    private CheckUpdateCallBack f36485a;

    public void initCheckUpdateCallBack(Object obj, Activity activity) {
        final WeakReference weakReference = new WeakReference(obj);
        WeakReference weakReference2 = new WeakReference(activity);
        if (this.f36485a == null) {
            this.f36485a = new CheckUpdateCallBack() { // from class: com.huawei.hms.update.manager.CheckUpdateLegacy.1
                @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
                public void onMarketInstallInfo(Intent intent) {
                    if (intent != null) {
                        int intExtra = intent.getIntExtra(UpdateKey.MARKET_DLD_STATUS, -99);
                        HMSLog.i("CheckUpdateLegacy", "onMarketInstallInfo installState: " + intent.getIntExtra(UpdateKey.MARKET_INSTALL_STATE, -99) + ",installType: " + intent.getIntExtra(UpdateKey.MARKET_INSTALL_TYPE, -99) + ",downloadCode: " + intExtra);
                    }
                }

                @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
                public void onMarketStoreError(int i11) {
                    HMSLog.e("CheckUpdateLegacy", "onMarketStoreError responseCode: " + i11);
                }

                @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
                public void onUpdateInfo(Intent intent) {
                    if (intent == null || weakReference == null) {
                        return;
                    }
                    try {
                        int intExtra = intent.getIntExtra("status", -99);
                        HMSLog.i("CheckUpdateLegacy", "onUpdateInfo status: " + intExtra + ",failcause: " + intent.getIntExtra(UpdateKey.FAIL_CODE, -99) + ",isExit: " + intent.getBooleanExtra(UpdateKey.MUST_UPDATE, false));
                        if (intExtra == 7) {
                            ApkUpgradeInfo apkUpgradeInfo = (ApkUpgradeInfo) intent.getSerializableExtra(UpdateKey.INFO);
                            if (apkUpgradeInfo != null) {
                                HMSLog.i("CheckUpdateLegacy", "onUpdateInfo: " + apkUpgradeInfo.toString());
                            }
                            CheckUpdateLegacy.this.a((WeakReference<Object>) weakReference, 1);
                        } else if (intExtra == 3) {
                            CheckUpdateLegacy.this.a((WeakReference<Object>) weakReference, 0);
                        } else {
                            CheckUpdateLegacy.this.a((WeakReference<Object>) weakReference, -1);
                        }
                        CheckUpdateLegacy.this.a(weakReference);
                    } catch (Exception e11) {
                        HMSLog.e("CheckUpdateLegacy", "intent has some error" + e11.getMessage());
                        CheckUpdateLegacy.this.a((WeakReference<Object>) weakReference, -1);
                    }
                }

                @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
                public void onUpdateStoreError(int i11) {
                    HMSLog.e("CheckUpdateLegacy", "onUpdateStoreError responseCode: " + i11);
                }
            };
        }
        Activity activity2 = (Activity) weakReference2.get();
        if (activity2 == null) {
            HMSLog.e("CheckUpdateLegacy", "cpActivity is null");
        } else {
            UpdateSdkAPI.checkClientOTAUpdate(activity2, this.f36485a, true, 0, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(WeakReference<Object> weakReference, int i11) {
        Object obj = weakReference.get();
        if (obj == null) {
            HMSLog.e("CheckUpdateLegacy", "invokeOnResult: weakObj.get() is null");
            return;
        }
        try {
            Class.forName("com.huawei.hms.api.HuaweiApiClientImpl").getMethod("onResult", Integer.TYPE).invoke(obj, Integer.valueOf(i11));
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException e11) {
            HMSLog.e("CheckUpdateLegacy", "invoke HuaweiApiClientImpl.onResult fail. " + e11.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(WeakReference<Object> weakReference) {
        Object obj = weakReference.get();
        if (obj == null) {
            HMSLog.e("CheckUpdateLegacy", "invokeResetListener: weakObj.get() is null");
            return;
        }
        try {
            Class.forName("com.huawei.hms.api.HuaweiApiClientImpl").getMethod("resetListener", null).invoke(obj, null);
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException e11) {
            HMSLog.e("CheckUpdateLegacy", "invoke HuaweiApiClientImpl.resetListener fail. " + e11.getMessage());
        }
    }
}
