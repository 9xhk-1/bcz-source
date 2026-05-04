package com.huawei.updatesdk.service.otaupdate;

import android.content.Intent;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private WeakReference<CheckUpdateCallBack> f36980a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final d f36981a = new d();
    }

    public static d a() {
        return a.f36981a;
    }

    public void b(Intent intent) {
        String str;
        WeakReference<CheckUpdateCallBack> weakReference = this.f36980a;
        if (weakReference != null) {
            CheckUpdateCallBack checkUpdateCallBack = weakReference.get();
            if (checkUpdateCallBack != null) {
                checkUpdateCallBack.onUpdateInfo(intent);
                return;
            }
            str = "setUpdateCallBackMsg callBack is null";
        } else {
            str = "setUpdateCallBackMsg updateCallBack is null";
        }
        com.huawei.updatesdk.a.a.a.c("CallbackManager", str);
    }

    public void a(int i11) {
        String str;
        WeakReference<CheckUpdateCallBack> weakReference = this.f36980a;
        if (weakReference != null) {
            CheckUpdateCallBack checkUpdateCallBack = weakReference.get();
            if (checkUpdateCallBack != null) {
                checkUpdateCallBack.onMarketStoreError(i11);
                return;
            }
            str = "setGetMarketInfoCallBack callBack is null";
        } else {
            str = "setGetMarketInfoCallBack updateCallBack is null";
        }
        com.huawei.updatesdk.a.a.a.c("CallbackManager", str);
    }

    public void a(Intent intent) {
        CheckUpdateCallBack checkUpdateCallBack;
        WeakReference<CheckUpdateCallBack> weakReference = this.f36980a;
        if (weakReference == null || (checkUpdateCallBack = weakReference.get()) == null) {
            return;
        }
        checkUpdateCallBack.onMarketInstallInfo(intent);
    }

    public void a(CheckUpdateCallBack checkUpdateCallBack) {
        this.f36980a = new WeakReference<>(checkUpdateCallBack);
    }
}
