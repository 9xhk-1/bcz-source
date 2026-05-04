package com.huawei.updatesdk.service.otaupdate;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.huawei.updatesdk.service.appmgr.bean.ApkUpgradeInfo;
import com.huawei.updatesdk.service.appmgr.bean.Param;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class e extends AsyncTask<Void, Void, com.huawei.updatesdk.a.b.c.c.d> {

    /* renamed from: b, reason: collision with root package name */
    private final Context f36983b;

    /* renamed from: c, reason: collision with root package name */
    private final CheckUpdateCallBack f36984c;

    /* renamed from: d, reason: collision with root package name */
    private final UpdateParams f36985d;

    /* renamed from: e, reason: collision with root package name */
    private Toast f36986e;

    /* renamed from: g, reason: collision with root package name */
    private com.huawei.updatesdk.a.b.c.b f36988g;

    /* renamed from: a, reason: collision with root package name */
    private final List<String> f36982a = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private boolean f36987f = false;

    /* renamed from: h, reason: collision with root package name */
    private boolean f36989h = false;

    public e(Context context, UpdateParams updateParams, CheckUpdateCallBack checkUpdateCallBack) {
        this.f36985d = updateParams;
        this.f36983b = context;
        this.f36984c = checkUpdateCallBack;
        f.e().b(updateParams.getServiceZone());
    }

    private PackageInfo a(Context context, String str) {
        PackageInfo a11 = com.huawei.updatesdk.b.h.b.a(str, context);
        if (a11 == null) {
            a11 = new PackageInfo();
            a11.packageName = str;
            a11.versionName = "1.0";
            a11.versionCode = 1;
            ApplicationInfo applicationInfo = new ApplicationInfo();
            applicationInfo.targetSdkVersion = 19;
            a11.applicationInfo = applicationInfo;
        }
        return com.huawei.updatesdk.a.a.d.e.a(a11);
    }

    private void b() {
        if (!com.huawei.updatesdk.b.h.d.a(this.f36985d.getParamList())) {
            Iterator<Param> it = this.f36985d.getParamList().iterator();
            while (it.hasNext()) {
                this.f36982a.add(it.next().getPackageName());
            }
            return;
        }
        if (!com.huawei.updatesdk.b.h.d.a(this.f36985d.getPackageList())) {
            this.f36982a.addAll(this.f36985d.getPackageList());
            return;
        }
        String targetPkgName = this.f36985d.getTargetPkgName();
        if (TextUtils.isEmpty(targetPkgName)) {
            targetPkgName = this.f36983b.getPackageName();
        }
        if (TextUtils.isEmpty(targetPkgName)) {
            return;
        }
        this.f36982a.add(targetPkgName);
    }

    private boolean c() {
        return !this.f36987f && TextUtils.isEmpty(this.f36985d.getTargetPkgName()) && com.huawei.updatesdk.b.h.d.a(this.f36985d.getPackageList()) && com.huawei.updatesdk.b.h.d.a(this.f36985d.getParamList());
    }

    @Override // android.os.AsyncTask
    public void onCancelled() {
        super.onCancelled();
        com.huawei.updatesdk.a.b.c.b bVar = this.f36988g;
        if (bVar != null) {
            bVar.b();
        }
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        super.onPreExecute();
        if (c()) {
            Context context = this.f36983b;
            Toast makeText = Toast.makeText(context, com.huawei.updatesdk.b.h.c.c(context, "upsdk_checking_update_prompt"), 1);
            this.f36986e = makeText;
            makeText.show();
        }
    }

    private com.huawei.updatesdk.a.b.c.c.d a(Context context, List<String> list) {
        com.huawei.updatesdk.service.appmgr.bean.d a11;
        String str;
        if (com.huawei.updatesdk.b.h.d.a(this.f36985d.getParamList())) {
            ArrayList arrayList = new ArrayList();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(a(context, it.next()));
            }
            a11 = com.huawei.updatesdk.service.appmgr.bean.d.a(arrayList);
        } else {
            a11 = new com.huawei.updatesdk.service.appmgr.bean.d(this.f36985d.getParamList());
        }
        com.huawei.updatesdk.b.e.a a12 = com.huawei.updatesdk.b.e.e.a(this.f36989h);
        a11.e(a12.c());
        a11.b(0);
        a11.d(com.huawei.updatesdk.a.a.d.i.c.b(context, a12.b()));
        try {
            Context createPackageContext = this.f36983b.createPackageContext(a12.b(), 3);
            str = createPackageContext.getResources().getString(createPackageContext.getResources().getIdentifier("wd_cno", TypedValues.Custom.S_STRING, a12.b()));
        } catch (Throwable th2) {
            com.huawei.updatesdk.a.a.c.a.a.a.b("UpdateSDKCheckTask", "get cno error: " + th2.getMessage());
            str = "";
        }
        a11.e(str);
        if (isCancelled()) {
            com.huawei.updatesdk.a.a.a.c("UpdateSDKCheckTask", "UpdateSDK task is canceled and return empty upgradeInfo");
            return null;
        }
        com.huawei.updatesdk.a.b.c.b bVar = new com.huawei.updatesdk.a.b.c.b(a11, null);
        this.f36988g = bVar;
        return bVar.c();
    }

    private void b(com.huawei.updatesdk.a.b.c.c.d dVar) {
        if (this.f36984c != null) {
            Intent intent = new Intent();
            intent.putExtra("status", 6);
            if (dVar.a() != null) {
                intent.putExtra(UpdateKey.FAIL_CODE, dVar.a().ordinal());
            }
            intent.putExtra(UpdateKey.FAIL_REASON, dVar.c());
            intent.putExtra(UpdateKey.RESPONSE_CODE, dVar.b());
            this.f36984c.onUpdateInfo(intent);
            this.f36984c.onUpdateStoreError(dVar.d());
        }
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.huawei.updatesdk.a.b.c.c.d doInBackground(Void... voidArr) {
        com.huawei.updatesdk.a.a.c.a.a.a.a("UpdateSDKCheckTask", "CheckOtaAndUpdataTask doInBackground");
        com.huawei.updatesdk.b.g.b.a(this);
        b();
        com.huawei.updatesdk.a.a.a.b("UpdateSDKCheckTask", "start check update and packageNames are: " + this.f36982a.toString());
        com.huawei.updatesdk.b.e.a a11 = com.huawei.updatesdk.b.e.e.a(this.f36989h);
        a11.a(this.f36982a);
        com.huawei.updatesdk.b.b.a.d().c();
        com.huawei.updatesdk.a.b.c.c.c.c(a11.b(this.f36983b));
        com.huawei.updatesdk.b.b.a.d().c(f.e().a());
        return a(this.f36983b, this.f36982a);
    }

    public void b(boolean z11) {
        this.f36987f = z11;
    }

    private void a() {
        Toast toast = this.f36986e;
        if (toast != null) {
            toast.cancel();
        }
    }

    private void a(Context context, ApkUpgradeInfo apkUpgradeInfo) {
        if (context == null) {
            return;
        }
        Intent intent = new Intent(context, (Class<?>) AppUpdateActivity.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("app_update_parm", apkUpgradeInfo);
        bundle.putBoolean("app_must_btn", this.f36985d.isMustBtnOne());
        bundle.putBoolean("is_apptouch", this.f36989h);
        intent.putExtras(bundle);
        if (!(context instanceof Activity)) {
            intent.setFlags(268435456);
        }
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e11) {
            com.huawei.updatesdk.a.a.c.a.a.a.b("UpdateSDKCheckTask", "go AppUpdateActivity error: " + e11.getMessage());
        }
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(com.huawei.updatesdk.a.b.c.c.d dVar) {
        ArrayList<ApkUpgradeInfo> arrayList;
        com.huawei.updatesdk.b.g.b.a().remove(this);
        a();
        if (this.f36984c == null) {
            com.huawei.updatesdk.a.a.a.c("UpdateSDKCheckTask", "UpdateSDK callback is null");
        }
        if (dVar == null) {
            if (this.f36984c != null) {
                Intent intent = new Intent();
                intent.putExtra("status", 3);
                this.f36984c.onUpdateInfo(intent);
                return;
            }
            return;
        }
        int b11 = dVar.b();
        if (dVar.e()) {
            com.huawei.updatesdk.service.appmgr.bean.e eVar = (com.huawei.updatesdk.service.appmgr.bean.e) dVar;
            arrayList = eVar.list;
            if (!com.huawei.updatesdk.b.h.d.a(eVar.notRcmList)) {
                ApkUpgradeInfo apkUpgradeInfo = eVar.notRcmList.get(0);
                com.huawei.updatesdk.a.a.a.a("UpdateSDKCheckTask", "Updateinfo is not recommend, reason: " + apkUpgradeInfo.getNotRcmReason_() + " ,is same signature: " + apkUpgradeInfo.getSameS_());
            }
            a((List<ApkUpgradeInfo>) arrayList);
            if (com.huawei.updatesdk.b.h.d.a(arrayList) && this.f36984c != null) {
                com.huawei.updatesdk.a.a.a.b("UpdateSDKCheckTask", "no upgrade info");
                Intent intent2 = new Intent();
                intent2.putExtra("status", 3);
                intent2.putExtra(UpdateKey.RESPONSE_CODE, b11);
                this.f36984c.onUpdateInfo(intent2);
            }
        } else {
            b(dVar);
            com.huawei.updatesdk.a.a.a.a("UpdateSDKCheckTask", "get app update msg failed,responseCode is " + dVar.d() + ",failreason: " + dVar.c() + ",response: " + dVar);
            arrayList = null;
        }
        if (com.huawei.updatesdk.b.h.d.a(arrayList)) {
            if (c()) {
                com.huawei.updatesdk.a.a.a.b("UpdateSDKCheckTask", "show no upgrade info toast.");
                Context context = this.f36983b;
                Toast.makeText(context, com.huawei.updatesdk.b.h.c.c(context, "upsdk_update_check_no_new_version"), 0).show();
                return;
            } else {
                com.huawei.updatesdk.a.a.a.b("UpdateSDKCheckTask", "no upgrade info: " + this.f36982a.toString());
                return;
            }
        }
        ApkUpgradeInfo apkUpgradeInfo2 = arrayList.get(0);
        d.a().a(this.f36984c);
        if (this.f36984c != null) {
            Intent intent3 = new Intent();
            intent3.putExtra(UpdateKey.INFO, (Serializable) apkUpgradeInfo2);
            intent3.putParcelableArrayListExtra(UpdateKey.INFO_LIST, arrayList);
            intent3.putExtra("status", 7);
            intent3.putExtra(UpdateKey.RESPONSE_CODE, b11);
            this.f36984c.onUpdateInfo(intent3);
        }
        a(arrayList);
        if (this.f36985d.isShowImmediate()) {
            a(this.f36983b, apkUpgradeInfo2);
        }
    }

    private void a(ArrayList<ApkUpgradeInfo> arrayList) {
        Iterator<ApkUpgradeInfo> it = arrayList.iterator();
        while (it.hasNext()) {
            ApkUpgradeInfo next = it.next();
            com.huawei.updatesdk.a.a.a.b("UpdateSDKCheckTask", "ApkUpgradeInfo, version=" + next.getVersion_() + ", versionCode=" + next.getVersionCode_() + ", detailId=" + next.getDetailId_() + ", devType=" + next.getDevType_() + ", packageName=" + next.getPackage_() + ", oldVersionCode=" + next.getOldVersionCode_());
        }
    }

    private void a(List<ApkUpgradeInfo> list) {
        if (com.huawei.updatesdk.b.h.d.a(list)) {
            return;
        }
        for (ApkUpgradeInfo apkUpgradeInfo : list) {
            if (apkUpgradeInfo != null && !TextUtils.isEmpty(apkUpgradeInfo.getFullDownUrl_())) {
                if (apkUpgradeInfo.getDiffSize_() > 0) {
                    apkUpgradeInfo.setDiffDownUrl_(apkUpgradeInfo.getDownurl_());
                }
                apkUpgradeInfo.setDownurl_(apkUpgradeInfo.getFullDownUrl_());
            }
        }
    }

    public void a(boolean z11) {
        this.f36989h = z11;
    }
}
