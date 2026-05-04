package com.huawei.updatesdk.service.otaupdate;

import android.content.Intent;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public interface CheckUpdateCallBack {
    void onMarketInstallInfo(Intent intent);

    void onMarketStoreError(int i11);

    void onUpdateInfo(Intent intent);

    void onUpdateStoreError(int i11);
}
