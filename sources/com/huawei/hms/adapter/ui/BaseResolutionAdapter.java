package com.huawei.hms.adapter.ui;

import android.app.Activity;
import android.content.Intent;
import android.view.KeyEvent;
import com.huawei.hms.activity.IBridgeActivityDelegate;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.adapter.sysobs.SystemManager;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hms.support.hianalytics.HiAnalyticsUtils;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.kpms.KpmsConstant;
import com.huawei.hms.utils.RegionUtils;
import com.huawei.hms.utils.ResolutionFlagUtil;
import com.xiaomi.mipush.sdk.Constants;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class BaseResolutionAdapter implements IBridgeActivityDelegate {

    /* renamed from: a, reason: collision with root package name */
    private WeakReference<Activity> f35316a;

    /* renamed from: b, reason: collision with root package name */
    private String f35317b = "";

    /* renamed from: c, reason: collision with root package name */
    private long f35318c = 0;

    private void a(long j11) {
        if (!RegionUtils.isChinaROM(c())) {
            HMSLog.i("BaseResolutionAdapter", "not ChinaROM");
            return;
        }
        Activity c11 = c();
        if (c11 == null || c11.isFinishing()) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("package", c11.getPackageName());
        hashMap.put(CommonCode.MapKey.RESOLUTION_FLAG, this.f35318c + Constants.ACCEPT_TIME_SEPARATOR_SERVER + j11);
        HiAnalyticsUtils.getInstance().onEvent(c11, HiAnalyticsConstant.HMS_SDK_BASE_START_RESOLUTION, hashMap);
        HMSLog.e("BaseResolutionAdapter", "check resolution flag failed, transactionId: " + this.f35317b + ", carriedTimeStamp: " + this.f35318c + ", savedTimeStamp: " + j11);
    }

    private void b() {
        Activity c11 = c();
        if (c11 == null || c11.isFinishing()) {
            return;
        }
        c11.finish();
    }

    private Activity c() {
        WeakReference<Activity> weakReference = this.f35316a;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    private void d() {
        SystemManager.getInstance().notifyResolutionResult(null, this.f35317b);
        b();
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public int getRequestCode() {
        return 1001;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBridgeActivityCreate(android.app.Activity r10) {
        /*
            r9 = this;
            java.lang.String r1 = "BaseResolutionAdapter"
            if (r10 != 0) goto Ld
            java.lang.String r10 = "activity is null"
            com.huawei.hms.support.log.HMSLog.e(r1, r10)
            r9.d()
            return
        Ld:
            boolean r0 = r10.isFinishing()
            if (r0 == 0) goto L19
            java.lang.String r10 = "activity is finishing"
            com.huawei.hms.support.log.HMSLog.e(r1, r10)
            return
        L19:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r10)
            r9.f35316a = r0
            android.content.Intent r0 = r10.getIntent()
            if (r0 != 0) goto L2a
            r9.d()
            return
        L2a:
            android.os.Bundle r2 = r0.getExtras()     // Catch: java.lang.Throwable -> L43
            java.lang.String r3 = "transaction_id"
            java.lang.String r3 = r0.getStringExtra(r3)     // Catch: java.lang.Throwable -> L41
            r9.f35317b = r3     // Catch: java.lang.Throwable -> L41
            java.lang.String r3 = "resolution_flag"
            r4 = 0
            long r3 = r0.getLongExtra(r3, r4)     // Catch: java.lang.Throwable -> L41
            r9.f35318c = r3     // Catch: java.lang.Throwable -> L41
            goto L61
        L41:
            r0 = move-exception
            goto L45
        L43:
            r0 = move-exception
            r2 = 0
        L45:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "get transaction_id or resolution_flag exception:"
            r3.append(r4)
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.huawei.hms.support.log.HMSLog.e(r1, r0)
        L61:
            boolean r0 = r9.a()
            if (r0 != 0) goto L6b
            r9.d()
            return
        L6b:
            java.lang.String r0 = r9.f35317b
            if (r0 == 0) goto L83
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            if (r0 < r3) goto L83
            java.lang.String r0 = "remove apk resolution failed task."
            com.huawei.hms.support.log.HMSLog.i(r1, r0)
            com.huawei.hms.adapter.sysobs.ApkResolutionFailedManager r0 = com.huawei.hms.adapter.sysobs.ApkResolutionFailedManager.getInstance()
            java.lang.String r3 = r9.f35317b
            r0.removeTask(r3)
        L83:
            if (r2 != 0) goto L89
            r9.d()
            return
        L89:
            java.lang.String r0 = "resolution"
            android.os.Parcelable r0 = r2.getParcelable(r0)
            if (r0 != 0) goto L95
            r9.d()
            return
        L95:
            boolean r2 = r0 instanceof android.content.Intent
            if (r2 == 0) goto Lae
            android.content.Intent r0 = (android.content.Intent) r0     // Catch: java.lang.Throwable -> La5
            android.content.Intent r0 = com.huawei.hms.utils.IntentUtil.modifyIntentBehaviorsSafe(r0)     // Catch: java.lang.Throwable -> La5
            r2 = 1001(0x3e9, float:1.403E-42)
            r10.startActivityForResult(r0, r2)     // Catch: java.lang.Throwable -> La5
            goto Lcb
        La5:
            r9.d()
            java.lang.String r10 = "ActivityNotFoundException:exception"
            com.huawei.hms.support.log.HMSLog.e(r1, r10)
            goto Lcb
        Lae:
            boolean r2 = r0 instanceof android.app.PendingIntent
            if (r2 == 0) goto Lcb
            android.app.PendingIntent r0 = (android.app.PendingIntent) r0     // Catch: android.content.IntentSender.SendIntentException -> Lc3
            android.content.IntentSender r3 = r0.getIntentSender()     // Catch: android.content.IntentSender.SendIntentException -> Lc3
            r7 = 0
            r8 = 0
            r4 = 1001(0x3e9, float:1.403E-42)
            r5 = 0
            r6 = 0
            r2 = r10
            r2.startIntentSenderForResult(r3, r4, r5, r6, r7, r8)     // Catch: android.content.IntentSender.SendIntentException -> Lc3
            goto Lcb
        Lc3:
            r9.d()
            java.lang.String r10 = "SendIntentException:exception"
            com.huawei.hms.support.log.HMSLog.e(r1, r10)
        Lcb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.adapter.ui.BaseResolutionAdapter.onBridgeActivityCreate(android.app.Activity):void");
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityDestroy() {
        HMSLog.i("BaseResolutionAdapter", "onBridgeActivityDestroy");
        this.f35316a = null;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public boolean onBridgeActivityResult(int i11, int i12, Intent intent) {
        if (i11 != getRequestCode()) {
            return false;
        }
        HMSLog.i("BaseResolutionAdapter", "onBridgeActivityResult, resultCode: " + i12);
        if (i12 == 1001 || i12 == 1002) {
            if (intent == null) {
                intent = new Intent();
            }
            intent.putExtra(CommonCode.MapKey.PRIVACY_STATEMENT_CONFIRM_RESULT, i12);
        }
        if (i12 == -1 || intent.hasExtra(KpmsConstant.KIT_UPDATE_RESULT) || intent.hasExtra(CommonCode.MapKey.PRIVACY_STATEMENT_CONFIRM_RESULT)) {
            SystemManager.getInstance().notifyResolutionResult(intent, this.f35317b);
        } else {
            SystemManager.getInstance().notifyResolutionResult(null, this.f35317b);
        }
        b();
        return true;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeConfigurationChanged() {
        HMSLog.i("BaseResolutionAdapter", "onBridgeConfigurationChanged");
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onKeyUp(int i11, KeyEvent keyEvent) {
        HMSLog.i("BaseResolutionAdapter", "On key up when resolve conn error");
    }

    private boolean a() {
        long resolutionFlag = ResolutionFlagUtil.getInstance().getResolutionFlag(this.f35317b);
        ResolutionFlagUtil.getInstance().removeResolutionFlag(this.f35317b);
        if (resolutionFlag != 0 && resolutionFlag == this.f35318c) {
            return true;
        }
        a(resolutionFlag);
        return false;
    }
}
