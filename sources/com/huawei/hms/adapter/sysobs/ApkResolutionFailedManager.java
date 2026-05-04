package com.huawei.hms.adapter.sysobs;

import android.os.Handler;
import android.os.Looper;
import com.huawei.hms.support.log.HMSLog;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class ApkResolutionFailedManager {

    /* renamed from: c, reason: collision with root package name */
    private static final ApkResolutionFailedManager f35309c = new ApkResolutionFailedManager();

    /* renamed from: a, reason: collision with root package name */
    private final Handler f35310a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, Runnable> f35311b = new HashMap(2);

    private ApkResolutionFailedManager() {
    }

    public static ApkResolutionFailedManager getInstance() {
        return f35309c;
    }

    public void postTask(String str, Runnable runnable) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            HMSLog.e("ApkResolutionFailedManager", "postTask is not in main thread");
        } else {
            this.f35311b.put(str, runnable);
            this.f35310a.postDelayed(runnable, 2000L);
        }
    }

    public void removeTask(String str) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            HMSLog.e("ApkResolutionFailedManager", "removeTask is not in main thread");
            return;
        }
        Runnable remove = this.f35311b.remove(str);
        if (remove == null) {
            HMSLog.e("ApkResolutionFailedManager", "cancel runnable is null");
        } else {
            this.f35310a.removeCallbacks(remove);
        }
    }

    public void removeValueOnly(String str) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            HMSLog.e("ApkResolutionFailedManager", "removeValueOnly is not in main thread");
        } else {
            this.f35311b.remove(str);
        }
    }
}
