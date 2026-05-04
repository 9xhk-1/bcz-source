package com.huawei.updatesdk.service.otaupdate;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;
import com.huawei.updatesdk.service.appmgr.bean.ApkUpgradeInfo;
import com.huawei.updatesdk.service.appmgr.bean.AppInfoAdapter;
import com.huawei.updatesdk.service.otaupdate.UpdateParams;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class g {
    public static void a() {
        com.huawei.updatesdk.a.a.a.b("UpdateSDKImpl", "UpdateSDK releaseCallBack");
        d.a().a((CheckUpdateCallBack) null);
        List<AsyncTask> a11 = com.huawei.updatesdk.b.g.b.a();
        if (a11 == null || a11.isEmpty()) {
            return;
        }
        for (AsyncTask asyncTask : a11) {
            if (asyncTask != null) {
                asyncTask.cancel(true);
            }
            com.huawei.updatesdk.a.a.a.b("UpdateSDKImpl", "cancel task");
        }
        a11.clear();
    }

    public static void b(Context context, UpdateParams updateParams, CheckUpdateCallBack checkUpdateCallBack) {
        a(context, updateParams, checkUpdateCallBack, false);
    }

    private static void a(Context context) {
        com.huawei.updatesdk.a.b.a.a.a(context);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("UpdateSDK version is: ");
        sb2.append("4.0.5.300");
        sb2.append(" ,flavor: ");
        sb2.append("envrelease");
        sb2.append(" ,pkgName: ");
        sb2.append(context.getPackageName());
        com.huawei.updatesdk.a.a.a.b("UpdateSDKImpl", sb2.toString());
        Log.i("updatesdk", sb2.toString());
        if (com.huawei.updatesdk.a.a.d.i.c.e() == 3) {
            com.huawei.updatesdk.a.a.d.i.a.b(context);
        }
    }

    public static void a(Context context, ApkUpgradeInfo apkUpgradeInfo, AppInfoAdapter appInfoAdapter) {
        if (appInfoAdapter != null && !TextUtils.isEmpty(appInfoAdapter.getAppStorePkgName())) {
            f.e().c(appInfoAdapter.getAppStorePkgName());
        }
        a(context, apkUpgradeInfo, appInfoAdapter != null && appInfoAdapter.isMustBtnOne(), a(appInfoAdapter));
    }

    public static void a(Context context, ApkUpgradeInfo apkUpgradeInfo, boolean z11) {
        a(context, apkUpgradeInfo, z11, false);
    }

    private static void a(Context context, ApkUpgradeInfo apkUpgradeInfo, boolean z11, boolean z12) {
        StringBuilder sb2;
        String str;
        if (context == null || apkUpgradeInfo == null) {
            return;
        }
        Intent intent = new Intent(context, (Class<?>) AppUpdateActivity.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("app_update_parm", apkUpgradeInfo);
        bundle.putBoolean("app_must_btn", z11);
        bundle.putBoolean("is_apptouch", z12);
        intent.putExtras(bundle);
        if (!(context instanceof Activity)) {
            intent.setFlags(268435456);
        }
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e11) {
            e = e11;
            sb2 = new StringBuilder();
            str = "go AppUpdateActivity error: ";
            sb2.append(str);
            sb2.append(e.getMessage());
            com.huawei.updatesdk.a.a.a.a("UpdateSDKImpl", sb2.toString());
        } catch (SecurityException e12) {
            e = e12;
            sb2 = new StringBuilder();
            str = "go AppUpdateActivity security error: ";
            sb2.append(str);
            sb2.append(e.getMessage());
            com.huawei.updatesdk.a.a.a.a("UpdateSDKImpl", sb2.toString());
        }
    }

    public static void a(Context context, CheckUpdateCallBack checkUpdateCallBack, AppInfoAdapter appInfoAdapter) {
        if (context == null) {
            return;
        }
        UpdateParams.Builder builder = new UpdateParams.Builder();
        if (appInfoAdapter != null) {
            if (!TextUtils.isEmpty(appInfoAdapter.getServiceZone())) {
                builder.setServiceZone(appInfoAdapter.getServiceZone());
            }
            f.e().c(appInfoAdapter.getAppStorePkgName());
            builder.setTargetPkgName(appInfoAdapter.getTargetPkgName()).setPackageList(appInfoAdapter.getPackageList()).setMustBtnOne(appInfoAdapter.isMustBtnOne()).setIsShowImmediate(appInfoAdapter.isShowImmediate()).setMinIntervalDay(appInfoAdapter.getMinIntervalDay());
        }
        UpdateParams build = builder.build();
        build.resetParamList();
        a(context, build, checkUpdateCallBack, a(appInfoAdapter));
    }

    public static void a(Context context, CheckUpdateCallBack checkUpdateCallBack, boolean z11, int i11, boolean z12) {
        if (com.huawei.updatesdk.a.a.d.j.a.d(context)) {
            a(context);
            long currentTimeMillis = System.currentTimeMillis();
            long b11 = com.huawei.updatesdk.b.b.a.d().b();
            if (i11 != 0 && Math.abs(currentTimeMillis - b11) < i11 * 86400000) {
                com.huawei.updatesdk.a.a.a.b("UpdateSDKImpl", "Interval check time is limited and do not check app update.");
                return;
            }
            com.huawei.updatesdk.b.b.a.d().a(currentTimeMillis);
            e eVar = new e(context, new UpdateParams.Builder().setIsShowImmediate(z11).setMustBtnOne(z12).setMinIntervalDay(i11).build(), checkUpdateCallBack);
            eVar.b(true);
            eVar.executeOnExecutor(com.huawei.updatesdk.b.g.c.f36911b, new Void[0]);
        }
    }

    public static void a(Context context, CheckUpdateCallBack checkUpdateCallBack, boolean z11, boolean z12) {
        if (context == null) {
            return;
        }
        if (com.huawei.updatesdk.a.a.d.j.a.d(context)) {
            a(context);
            new e(context, new UpdateParams.Builder().setIsShowImmediate(z11).setMustBtnOne(z12).build(), checkUpdateCallBack).executeOnExecutor(com.huawei.updatesdk.b.g.c.f36911b, new Void[0]);
            return;
        }
        if (checkUpdateCallBack != null) {
            Intent intent = new Intent();
            intent.putExtra("status", 2);
            checkUpdateCallBack.onUpdateInfo(intent);
        }
        Toast.makeText(context, com.huawei.updatesdk.b.h.c.c(context, "upsdk_no_available_network_prompt_toast"), 0).show();
    }

    public static void a(Context context, UpdateParams updateParams, CheckUpdateCallBack checkUpdateCallBack) {
        if (context == null || updateParams == null || checkUpdateCallBack == null) {
            return;
        }
        updateParams.resetParamList();
        b(context, updateParams, checkUpdateCallBack);
    }

    private static void a(Context context, UpdateParams updateParams, CheckUpdateCallBack checkUpdateCallBack, boolean z11) {
        if (context == null || updateParams == null || checkUpdateCallBack == null) {
            return;
        }
        a(context);
        long currentTimeMillis = System.currentTimeMillis();
        long b11 = com.huawei.updatesdk.b.b.a.d().b();
        if (updateParams.getMinIntervalDay() != 0 && Math.abs(currentTimeMillis - b11) < updateParams.getMinIntervalDay() * 86400000) {
            com.huawei.updatesdk.a.a.a.b("UpdateSDKImpl", "Interval check time is limited and do not check app update.");
            return;
        }
        if (!com.huawei.updatesdk.a.a.d.j.a.d(context)) {
            Intent intent = new Intent();
            intent.putExtra("status", 2);
            checkUpdateCallBack.onUpdateInfo(intent);
        } else {
            com.huawei.updatesdk.b.b.a.d().a(currentTimeMillis);
            e eVar = new e(context, updateParams, checkUpdateCallBack);
            eVar.a(z11);
            eVar.executeOnExecutor(com.huawei.updatesdk.b.g.c.f36911b, new Void[0]);
        }
    }

    public static void a(Context context, String str, CheckUpdateCallBack checkUpdateCallBack) {
        if (context == null || TextUtils.isEmpty(str) || checkUpdateCallBack == null) {
            if (checkUpdateCallBack != null) {
                Intent intent = new Intent();
                intent.putExtra("status", 1);
                checkUpdateCallBack.onUpdateInfo(intent);
                return;
            }
            return;
        }
        if (com.huawei.updatesdk.a.a.d.j.a.d(context)) {
            a(context);
            new e(context, new UpdateParams.Builder().setMustBtnOne(false).setTargetPkgName(str).build(), checkUpdateCallBack).executeOnExecutor(com.huawei.updatesdk.b.g.c.f36911b, new Void[0]);
        } else {
            Intent intent2 = new Intent();
            intent2.putExtra("status", 2);
            checkUpdateCallBack.onUpdateInfo(intent2);
        }
    }

    public static void a(String str) {
        f.e().b(str);
    }

    private static boolean a(AppInfoAdapter appInfoAdapter) {
        return (appInfoAdapter == null || TextUtils.isEmpty(appInfoAdapter.getAppStorePkgName()) || !TextUtils.equals(appInfoAdapter.getBusiness(), "AppTouch")) ? false : true;
    }
}
