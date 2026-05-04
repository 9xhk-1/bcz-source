package com.huawei.hms.jos.manager;

import android.app.Activity;
import com.huawei.hms.support.common.ActivityMgr;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class InnerActivityManager {

    /* renamed from: b, reason: collision with root package name */
    private static InnerActivityManager f36067b;

    /* renamed from: a, reason: collision with root package name */
    private WeakReference<Activity> f36068a;

    public static synchronized InnerActivityManager get() {
        InnerActivityManager innerActivityManager;
        synchronized (InnerActivityManager.class) {
            try {
                if (f36067b == null) {
                    f36067b = new InnerActivityManager();
                }
                innerActivityManager = f36067b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return innerActivityManager;
    }

    public Activity getCurrentActivity() {
        Activity activity;
        WeakReference<Activity> weakReference = this.f36068a;
        return (weakReference == null || weakReference.get() == null || (activity = this.f36068a.get()) == null || activity.isFinishing() || activity.isDestroyed()) ? ActivityMgr.INST.getCurrentActivity() : activity;
    }

    public void setCurrentActivity(Activity activity) {
        this.f36068a = new WeakReference<>(activity);
    }
}
