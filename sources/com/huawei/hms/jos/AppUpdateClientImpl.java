package com.huawei.hms.jos;

import android.app.Activity;
import android.content.Context;
import com.huawei.hms.apptouch.AppInfo;
import com.huawei.hms.apptouch.AppTouch;
import com.huawei.hms.apptouch.AppTouchClient;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.updatesdk.UpdateSdkAPI;
import com.huawei.updatesdk.service.appmgr.bean.ApkUpgradeInfo;
import com.huawei.updatesdk.service.appmgr.bean.AppInfoAdapter;
import com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack;
import com.huawei.updatesdk.service.otaupdate.UpdateParams;
import fr.h;
import fr.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class AppUpdateClientImpl implements AppUpdateClient {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements h {

        /* renamed from: a, reason: collision with root package name */
        Context f36046a;

        /* renamed from: b, reason: collision with root package name */
        CheckUpdateCallBack f36047b;

        public a(Context context, CheckUpdateCallBack checkUpdateCallBack) {
            this.f36046a = context;
            this.f36047b = checkUpdateCallBack;
        }

        @Override // fr.h
        public void onFailure(Exception exc) {
            HMSLog.w("AppUpdateClientImpl", "GetAppInfos onFailure: " + exc.getMessage());
            UpdateSdkAPI.checkAppUpdate(this.f36046a, new UpdateParams.Builder().setTargetPkgName(this.f36046a.getPackageName()).build(), this.f36047b);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b implements i<AppInfo> {

        /* renamed from: a, reason: collision with root package name */
        Context f36048a;

        /* renamed from: b, reason: collision with root package name */
        CheckUpdateCallBack f36049b;

        public b(Context context, CheckUpdateCallBack checkUpdateCallBack) {
            this.f36048a = context;
            this.f36049b = checkUpdateCallBack;
        }

        @Override // fr.i
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(AppInfo appInfo) {
            if (appInfo != null) {
                AppInfoAdapter appInfoAdapter = new AppInfoAdapter();
                appInfoAdapter.setAppId(appInfo.getAppId());
                appInfoAdapter.setTargetPkgName(appInfo.getAppPackageName());
                appInfoAdapter.setAppStorePkgName(appInfo.getAppTouchPackageName());
                appInfoAdapter.setBusiness(appInfo.getBusiness());
                appInfoAdapter.setCarrierId(appInfo.getCarrierId());
                appInfoAdapter.setServiceZone(appInfo.getHomeCountry());
                UpdateSdkAPI.checkAppUpdateByAppInfo(this.f36048a, this.f36049b, appInfoAdapter);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c implements h {

        /* renamed from: a, reason: collision with root package name */
        Context f36050a;

        /* renamed from: b, reason: collision with root package name */
        ApkUpgradeInfo f36051b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f36052c;

        public c(Context context, ApkUpgradeInfo apkUpgradeInfo, boolean z11) {
            this.f36050a = context;
            this.f36051b = apkUpgradeInfo;
            this.f36052c = z11;
        }

        @Override // fr.h
        public void onFailure(Exception exc) {
            HMSLog.w("AppUpdateClientImpl", "GetAppInfos onFailure: " + exc.getMessage());
            UpdateSdkAPI.showUpdateDialog(this.f36050a, this.f36051b, this.f36052c);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d implements i<AppInfo> {

        /* renamed from: a, reason: collision with root package name */
        Context f36053a;

        /* renamed from: b, reason: collision with root package name */
        ApkUpgradeInfo f36054b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f36055c;

        public d(Context context, ApkUpgradeInfo apkUpgradeInfo, boolean z11) {
            this.f36053a = context;
            this.f36054b = apkUpgradeInfo;
            this.f36055c = z11;
        }

        @Override // fr.i
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(AppInfo appInfo) {
            if (appInfo != null) {
                AppInfoAdapter appInfoAdapter = new AppInfoAdapter();
                appInfoAdapter.setAppId(appInfo.getAppId());
                appInfoAdapter.setTargetPkgName(appInfo.getAppPackageName());
                appInfoAdapter.setAppStorePkgName(appInfo.getAppTouchPackageName());
                appInfoAdapter.setBusiness(appInfo.getBusiness());
                appInfoAdapter.setCarrierId(appInfo.getCarrierId());
                appInfoAdapter.setServiceZone(appInfo.getHomeCountry());
                appInfoAdapter.setMustBtnOne(this.f36055c);
                UpdateSdkAPI.showUpdateDialogByAppInfo(this.f36053a, this.f36054b, appInfoAdapter);
            }
        }
    }

    @Override // com.huawei.hms.jos.AppUpdateClient
    public void checkAppUpdate(Context context, CheckUpdateCallBack checkUpdateCallBack) {
        if (context != null) {
            getAppClient(context).getAppInfo().addOnFailureListener(new a(context, checkUpdateCallBack)).addOnSuccessListener(new b(context, checkUpdateCallBack));
        }
    }

    public AppTouchClient getAppClient(Context context) {
        return context instanceof Activity ? AppTouch.getAppClientImpl((Activity) context) : AppTouch.getAppClientImpl(context);
    }

    @Override // com.huawei.hms.jos.AppUpdateClient
    public void releaseCallBack() {
        UpdateSdkAPI.releaseCallBack();
    }

    @Override // com.huawei.hms.jos.AppUpdateClient
    public void showUpdateDialog(Context context, ApkUpgradeInfo apkUpgradeInfo, boolean z11) {
        getAppClient(context).getAppInfo().addOnFailureListener(new c(context, apkUpgradeInfo, z11)).addOnSuccessListener(new d(context, apkUpgradeInfo, z11));
    }
}
