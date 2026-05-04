package com.huawei.hms.jos;

import android.content.Context;
import com.huawei.updatesdk.service.appmgr.bean.ApkUpgradeInfo;
import com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public interface AppUpdateClient {
    void checkAppUpdate(Context context, CheckUpdateCallBack checkUpdateCallBack);

    void releaseCallBack();

    void showUpdateDialog(Context context, ApkUpgradeInfo apkUpgradeInfo, boolean z11);
}
