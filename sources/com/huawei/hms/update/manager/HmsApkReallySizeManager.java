package com.huawei.hms.update.manager;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.text.format.Formatter;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.updatesdk.UpdateSdkAPI;
import com.huawei.updatesdk.service.appmgr.bean.ApkUpgradeInfo;
import com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import java.io.Serializable;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class HmsApkReallySizeManager {
    public static final String INVALID_SIZE = "";

    /* renamed from: g, reason: collision with root package name */
    private static final HmsApkReallySizeManager f36488g = new HmsApkReallySizeManager();

    /* renamed from: a, reason: collision with root package name */
    private Context f36489a;

    /* renamed from: b, reason: collision with root package name */
    private volatile boolean f36490b;

    /* renamed from: d, reason: collision with root package name */
    private volatile long f36492d;

    /* renamed from: f, reason: collision with root package name */
    private WeakReference<CheckHmsApkSizeCallback> f36494f;

    /* renamed from: c, reason: collision with root package name */
    private volatile long f36491c = -1;

    /* renamed from: e, reason: collision with root package name */
    private final Handler f36493e = new Handler(Looper.getMainLooper());

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface CheckHmsApkSizeCallback {
        void onResult(String str);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements CheckUpdateCallBack {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f36495a;

        public a(Context context) {
            this.f36495a = context;
        }

        @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
        public void onMarketInstallInfo(Intent intent) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("<onMarketInstallInfo> intent: ");
            sb2.append(intent == null ? "is null" : "not null");
            HMSLog.i("HmsApkReallySizeManager", sb2.toString());
            HmsApkReallySizeManager.this.a("");
            HmsApkReallySizeManager.this.a();
        }

        @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
        public void onMarketStoreError(int i11) {
            HMSLog.e("HmsApkReallySizeManager", "<onMarketStoreError> responseCode: " + i11);
            HmsApkReallySizeManager.this.a("");
            HmsApkReallySizeManager.this.a();
        }

        @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
        public void onUpdateInfo(Intent intent) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("<onUpdateInfo> intent: ");
            sb2.append(intent == null ? "is null" : "not null");
            HMSLog.i("HmsApkReallySizeManager", sb2.toString());
            HmsApkReallySizeManager.this.a(this.f36495a, intent);
            HmsApkReallySizeManager.this.a();
        }

        @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
        public void onUpdateStoreError(int i11) {
            HMSLog.e("HmsApkReallySizeManager", "<onUpdateStoreError> responseCode: " + i11);
            HmsApkReallySizeManager.this.a("");
            HmsApkReallySizeManager.this.a();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final HmsApkReallySizeManager f36497a;

        public b(HmsApkReallySizeManager hmsApkReallySizeManager) {
            this.f36497a = hmsApkReallySizeManager;
        }

        @Override // java.lang.Runnable
        public void run() {
            HMSLog.e("HmsApkReallySizeManager", "<CheckTimeoutRunnable> get apk size timeout");
            this.f36497a.a("");
        }
    }

    private HmsApkReallySizeManager() {
    }

    private boolean b() {
        if (this.f36492d == 0) {
            HMSLog.i("HmsApkReallySizeManager", "<useCachedSize> no cachedHmsApkSize");
            return false;
        }
        boolean z11 = SystemClock.elapsedRealtime() - this.f36492d > 86400000;
        HMSLog.i("HmsApkReallySizeManager", "<useCachedSize> cachedHmsApkSize is expiration: " + z11);
        return !z11 && this.f36491c > 0;
    }

    public static HmsApkReallySizeManager getInstance() {
        return f36488g;
    }

    public void asyncGetSize(Context context, String str, CheckHmsApkSizeCallback checkHmsApkSizeCallback) {
        HMSLog.i("HmsApkReallySizeManager", "<asyncGetSize> start");
        if (context == null || TextUtils.isEmpty(str) || checkHmsApkSizeCallback == null) {
            HMSLog.e("HmsApkReallySizeManager", "<asyncGetSize> param contains null");
            return;
        }
        if (this.f36489a == null) {
            this.f36489a = context.getApplicationContext();
        }
        if (b()) {
            String a11 = a(context, this.f36491c);
            HMSLog.i("HmsApkReallySizeManager", "<asyncGetSize> useCachedSize: " + a11);
            checkHmsApkSizeCallback.onResult(a11);
            return;
        }
        if (this.f36490b) {
            HMSLog.e("HmsApkReallySizeManager", "<asyncGetSize> isChecking: " + this.f36490b);
            checkHmsApkSizeCallback.onResult("");
            return;
        }
        this.f36494f = new WeakReference<>(checkHmsApkSizeCallback);
        this.f36490b = true;
        this.f36493e.postDelayed(new b(this), 3000L);
        Context applicationContext = context.getApplicationContext();
        UpdateSdkAPI.checkTargetAppUpdate(applicationContext, str, new a(applicationContext));
    }

    public String getApkSize() {
        HMSLog.i("HmsApkReallySizeManager", "<getApkSize> start");
        if (this.f36489a == null) {
            HMSLog.e("HmsApkReallySizeManager", "<getApkSize> mAppContext is null, return INVALID_SIZE");
            return "";
        }
        if (!b()) {
            HMSLog.i("HmsApkReallySizeManager", "<getApkSize> return INVALID_SIZE");
            return "";
        }
        String a11 = a(this.f36489a, this.f36491c);
        HMSLog.i("HmsApkReallySizeManager", "<getApkSize> mCachedHmsApkSize: " + a11);
        return a11;
    }

    public void release() {
        HMSLog.i("HmsApkReallySizeManager", "<release> start isChecking: " + this.f36490b);
        if (this.f36490b) {
            UpdateSdkAPI.releaseCallBack();
            this.f36490b = false;
            a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        this.f36493e.removeCallbacksAndMessages(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, Intent intent) {
        if (intent != null) {
            try {
                int intExtra = intent.getIntExtra("status", -99);
                HMSLog.i("HmsApkReallySizeManager", "<checkHmsUpdateInfo> status is " + intExtra);
                String stringExtra = intent.getStringExtra(UpdateKey.FAIL_REASON);
                if (!TextUtils.isEmpty(stringExtra)) {
                    HMSLog.e("HmsApkReallySizeManager", "<checkHmsUpdateInfo> reason is " + stringExtra);
                }
                if (intExtra == 7) {
                    Serializable serializableExtra = intent.getSerializableExtra(UpdateKey.INFO);
                    if (serializableExtra instanceof ApkUpgradeInfo) {
                        this.f36491c = ((ApkUpgradeInfo) serializableExtra).getLongSize_();
                        String a11 = a(context, this.f36491c);
                        HMSLog.i("HmsApkReallySizeManager", "<checkHmsUpdateInfo> get HMS Core size: " + a11);
                        this.f36492d = SystemClock.elapsedRealtime();
                        a(a11);
                        return;
                    }
                } else if (intExtra == 3) {
                    HMSLog.e("HmsApkReallySizeManager", "<checkHmsUpdateInfo> UpdateStatusCode.NO_UPGRADE_INFO");
                } else {
                    HMSLog.e("HmsApkReallySizeManager", "<checkHmsUpdateInfo> other CHECK_FAILURE");
                }
            } catch (Exception e11) {
                HMSLog.e("HmsApkReallySizeManager", "<checkHmsUpdateInfo> intent has some error" + e11.getMessage());
                a("");
                return;
            }
        }
        a("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        HMSLog.i("HmsApkReallySizeManager", "<onResult> start");
        WeakReference<CheckHmsApkSizeCallback> weakReference = this.f36494f;
        if (weakReference == null) {
            HMSLog.e("HmsApkReallySizeManager", "<onResult> mWeakCallback is null");
            return;
        }
        CheckHmsApkSizeCallback checkHmsApkSizeCallback = weakReference.get();
        if (checkHmsApkSizeCallback == null) {
            HMSLog.e("HmsApkReallySizeManager", "<onResult> sizeCallback is null");
        } else {
            this.f36494f = null;
            checkHmsApkSizeCallback.onResult(str);
        }
    }

    private static String a(Context context, long j11) {
        return j11 > 0 ? Formatter.formatFileSize(context, j11) : "";
    }
}
