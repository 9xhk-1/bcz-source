package com.huawei.hms.update.manager;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.huawei.hms.common.HmsCheckedState;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.ui.SafeIntent;
import com.huawei.hms.update.http.HttpWiseContentHelper;
import com.huawei.hms.update.http.WiseContentUrlHelper;
import com.huawei.hms.utils.AgHmsUpdateState;
import com.huawei.updatesdk.UpdateSdkAPI;
import com.huawei.updatesdk.service.appmgr.bean.ApkUpgradeInfo;
import com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import java.io.Serializable;
import n6.m;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class AgHmsUpdateInfo {

    /* renamed from: c, reason: collision with root package name */
    private static final AgHmsUpdateInfo f36478c = new AgHmsUpdateInfo();

    /* renamed from: a, reason: collision with root package name */
    private final Handler f36479a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    private boolean f36480b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class CheckTimeoutRunnable implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final AgHmsUpdateInfo f36484a;

        public CheckTimeoutRunnable(AgHmsUpdateInfo agHmsUpdateInfo) {
            this.f36484a = agHmsUpdateInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            HMSLog.w("CheckAgHmsUpdateInfo", "updateSDK check timeout, set NOT_NEED_UPDATE");
            this.f36484a.a(HmsCheckedState.NOT_NEED_UPDATE, 0);
        }
    }

    private AgHmsUpdateInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b(Context context) {
        if (context == null) {
            HMSLog.e("CheckAgHmsUpdateInfo", "<getHmsAuth> context is null");
            return "false";
        }
        String syncGetUrl = WiseContentUrlHelper.syncGetUrl(context);
        if (TextUtils.isEmpty(syncGetUrl)) {
            HMSLog.e("CheckAgHmsUpdateInfo", "<getHmsAuth> get url failed.");
            return "false";
        }
        HMSLog.i("CheckAgHmsUpdateInfo", "<getHmsAuth> get url successful.");
        String syncGetContent = HttpWiseContentHelper.syncGetContent(context, syncGetUrl);
        if (TextUtils.isEmpty(syncGetContent)) {
            HMSLog.e("CheckAgHmsUpdateInfo", "<getHmsAuth> download h5 config failed.");
            return "false";
        }
        HMSLog.i("CheckAgHmsUpdateInfo", "<getHmsAuth> download h5 config successful.");
        return a(syncGetContent);
    }

    public static AgHmsUpdateInfo getInstance() {
        return f36478c;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void checkHmsAuthAndUpdateInfo(final android.content.Context r9) {
        /*
            r8 = this;
            java.lang.String r0 = "<checkHmsAuthAndUpdateInfo> enter"
            java.lang.String r1 = "CheckAgHmsUpdateInfo"
            com.huawei.hms.support.log.HMSLog.i(r1, r0)
            java.util.concurrent.FutureTask r0 = new java.util.concurrent.FutureTask
            com.huawei.hms.update.manager.AgHmsUpdateInfo$1 r2 = new com.huawei.hms.update.manager.AgHmsUpdateInfo$1
            r2.<init>()
            r0.<init>(r2)
            java.lang.String r2 = "false"
            r3 = 10000(0x2710, double:4.9407E-320)
            java.util.concurrent.ExecutorService r5 = java.util.concurrent.Executors.newSingleThreadExecutor()     // Catch: java.util.concurrent.RejectedExecutionException -> L43 java.util.concurrent.TimeoutException -> L46 java.lang.InterruptedException -> L48 java.util.concurrent.ExecutionException -> L4a java.util.concurrent.CancellationException -> L4c
            r5.execute(r0)     // Catch: java.util.concurrent.RejectedExecutionException -> L43 java.util.concurrent.TimeoutException -> L46 java.lang.InterruptedException -> L48 java.util.concurrent.ExecutionException -> L4a java.util.concurrent.CancellationException -> L4c
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.util.concurrent.RejectedExecutionException -> L43 java.util.concurrent.TimeoutException -> L46 java.lang.InterruptedException -> L48 java.util.concurrent.ExecutionException -> L4a java.util.concurrent.CancellationException -> L4c
            java.lang.Object r5 = r0.get(r3, r5)     // Catch: java.util.concurrent.RejectedExecutionException -> L43 java.util.concurrent.TimeoutException -> L46 java.lang.InterruptedException -> L48 java.util.concurrent.ExecutionException -> L4a java.util.concurrent.CancellationException -> L4c
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.util.concurrent.RejectedExecutionException -> L43 java.util.concurrent.TimeoutException -> L46 java.lang.InterruptedException -> L48 java.util.concurrent.ExecutionException -> L4a java.util.concurrent.CancellationException -> L4c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.util.concurrent.RejectedExecutionException -> L39 java.util.concurrent.TimeoutException -> L3b java.lang.InterruptedException -> L3d java.util.concurrent.ExecutionException -> L3f java.util.concurrent.CancellationException -> L41
            r6.<init>()     // Catch: java.util.concurrent.RejectedExecutionException -> L39 java.util.concurrent.TimeoutException -> L3b java.lang.InterruptedException -> L3d java.util.concurrent.ExecutionException -> L3f java.util.concurrent.CancellationException -> L41
            java.lang.String r7 = "authTask get recommendV3: "
            r6.append(r7)     // Catch: java.util.concurrent.RejectedExecutionException -> L39 java.util.concurrent.TimeoutException -> L3b java.lang.InterruptedException -> L3d java.util.concurrent.ExecutionException -> L3f java.util.concurrent.CancellationException -> L41
            r6.append(r5)     // Catch: java.util.concurrent.RejectedExecutionException -> L39 java.util.concurrent.TimeoutException -> L3b java.lang.InterruptedException -> L3d java.util.concurrent.ExecutionException -> L3f java.util.concurrent.CancellationException -> L41
            java.lang.String r6 = r6.toString()     // Catch: java.util.concurrent.RejectedExecutionException -> L39 java.util.concurrent.TimeoutException -> L3b java.lang.InterruptedException -> L3d java.util.concurrent.ExecutionException -> L3f java.util.concurrent.CancellationException -> L41
            com.huawei.hms.support.log.HMSLog.i(r1, r6)     // Catch: java.util.concurrent.RejectedExecutionException -> L39 java.util.concurrent.TimeoutException -> L3b java.lang.InterruptedException -> L3d java.util.concurrent.ExecutionException -> L3f java.util.concurrent.CancellationException -> L41
            goto L6a
        L39:
            r6 = move-exception
            goto L4e
        L3b:
            r6 = move-exception
            goto L4e
        L3d:
            r6 = move-exception
            goto L4e
        L3f:
            r6 = move-exception
            goto L4e
        L41:
            r6 = move-exception
            goto L4e
        L43:
            r6 = move-exception
        L44:
            r5 = r2
            goto L4e
        L46:
            r6 = move-exception
            goto L44
        L48:
            r6 = move-exception
            goto L44
        L4a:
            r6 = move-exception
            goto L44
        L4c:
            r6 = move-exception
            goto L44
        L4e:
            r7 = 1
            r0.cancel(r7)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r7 = "authTask get result has exception: "
            r0.append(r7)
            java.lang.String r6 = r6.getMessage()
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.huawei.hms.support.log.HMSLog.w(r1, r0)
        L6a:
            boolean r0 = r2.equalsIgnoreCase(r5)
            if (r0 == 0) goto L8e
            com.huawei.hms.utils.AgHmsUpdateState r9 = com.huawei.hms.utils.AgHmsUpdateState.getInstance()
            com.huawei.hms.common.HmsCheckedState r0 = com.huawei.hms.common.HmsCheckedState.NOT_NEED_UPDATE
            r9.setCheckedState(r0)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "not need to check update, recommendV3: "
            r9.append(r0)
            r9.append(r5)
            java.lang.String r9 = r9.toString()
            com.huawei.hms.support.log.HMSLog.w(r1, r9)
            return
        L8e:
            r0 = 0
            r8.f36480b = r0
            com.huawei.hms.update.manager.AgHmsUpdateInfo$CheckTimeoutRunnable r0 = new com.huawei.hms.update.manager.AgHmsUpdateInfo$CheckTimeoutRunnable
            r0.<init>(r8)
            android.os.Handler r1 = r8.f36479a
            r1.postDelayed(r0, r3)
            r8.a(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.update.manager.AgHmsUpdateInfo.checkHmsAuthAndUpdateInfo(android.content.Context):void");
    }

    private String a(String str) {
        String str2 = "false";
        try {
            String string = new JSONObject(str).getJSONObject("hmscoreAuth").getString("recommendV3");
            if (!m.f74525c.equalsIgnoreCase(string)) {
                if ("false".equalsIgnoreCase(string)) {
                }
                HMSLog.i("CheckAgHmsUpdateInfo", "<parseHmsAuthJson> parse H5 config successful, recommendV3: " + str2);
                return str2;
            }
            str2 = string;
            HMSLog.i("CheckAgHmsUpdateInfo", "<parseHmsAuthJson> parse H5 config successful, recommendV3: " + str2);
            return str2;
        } catch (RuntimeException e11) {
            HMSLog.e("CheckAgHmsUpdateInfo", "parse H5 config RuntimeException: " + e11.getMessage());
            return str2;
        } catch (JSONException e12) {
            HMSLog.e("CheckAgHmsUpdateInfo", "parse H5 config JSONException: " + e12.getMessage());
            return str2;
        }
    }

    private void a(Context context) {
        UpdateSdkAPI.checkTargetAppUpdate(context.getApplicationContext(), "com.huawei.hwid", new CheckUpdateCallBack() { // from class: com.huawei.hms.update.manager.AgHmsUpdateInfo.2
            @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
            public void onMarketInstallInfo(Intent intent) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("<onMarketInstallInfo> intent: ");
                sb2.append(intent == null ? "is null" : "not null");
                HMSLog.i("CheckAgHmsUpdateInfo", sb2.toString());
                AgHmsUpdateInfo.this.a(HmsCheckedState.NOT_NEED_UPDATE, 0);
            }

            @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
            public void onMarketStoreError(int i11) {
                HMSLog.e("CheckAgHmsUpdateInfo", "<onMarketStoreError> responseCode: " + i11);
                AgHmsUpdateInfo.this.a(HmsCheckedState.NOT_NEED_UPDATE, 0);
            }

            @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
            public void onUpdateInfo(Intent intent) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("<onUpdateInfo> intent: ");
                sb2.append(intent == null ? "is null" : "not null");
                HMSLog.i("CheckAgHmsUpdateInfo", sb2.toString());
                AgHmsUpdateInfo.this.a(intent);
            }

            @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
            public void onUpdateStoreError(int i11) {
                HMSLog.e("CheckAgHmsUpdateInfo", "<onUpdateStoreError> responseCode: " + i11);
                AgHmsUpdateInfo.this.a(HmsCheckedState.NOT_NEED_UPDATE, 0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Intent intent) {
        SafeIntent safeIntent = new SafeIntent(intent);
        try {
            int intExtra = safeIntent.getIntExtra("status", -99);
            HMSLog.i("CheckAgHmsUpdateInfo", "<checkHmsUpdateInfo> status is " + intExtra);
            String stringExtra = safeIntent.getStringExtra(UpdateKey.FAIL_REASON);
            if (!TextUtils.isEmpty(stringExtra)) {
                HMSLog.e("CheckAgHmsUpdateInfo", "<checkHmsUpdateInfo> reason is " + stringExtra);
            }
            if (intExtra != 7) {
                if (intExtra == 3) {
                    HMSLog.e("CheckAgHmsUpdateInfo", "<checkHmsUpdateInfo> UpdateStatusCode.NO_UPGRADE_INFO");
                    a(HmsCheckedState.NOT_NEED_UPDATE, 0);
                    return;
                } else {
                    HMSLog.e("CheckAgHmsUpdateInfo", "<checkHmsUpdateInfo> other CHECK_FAILURE");
                    a(HmsCheckedState.NOT_NEED_UPDATE, 0);
                    return;
                }
            }
            Serializable serializableExtra = safeIntent.getSerializableExtra(UpdateKey.INFO);
            if (serializableExtra instanceof ApkUpgradeInfo) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("HMS new version code: ");
                ApkUpgradeInfo apkUpgradeInfo = (ApkUpgradeInfo) serializableExtra;
                sb2.append(apkUpgradeInfo.getVersionCode_());
                HMSLog.i("CheckAgHmsUpdateInfo", sb2.toString());
                a(HmsCheckedState.NEED_UPDATE, apkUpgradeInfo.getVersionCode_());
            }
        } catch (Throwable th2) {
            HMSLog.e("CheckAgHmsUpdateInfo", "<checkHmsUpdateInfo> intent has some error" + th2.getMessage());
            a(HmsCheckedState.NOT_NEED_UPDATE, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(HmsCheckedState hmsCheckedState, int i11) {
        synchronized (this) {
            try {
                if (this.f36480b) {
                    return;
                }
                AgHmsUpdateState.getInstance().setCheckedState(hmsCheckedState);
                AgHmsUpdateState.getInstance().setTargetVersionCode(i11);
                a();
                this.f36480b = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void a() {
        this.f36479a.removeCallbacksAndMessages(null);
    }
}
