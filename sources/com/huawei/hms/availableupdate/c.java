package com.huawei.hms.availableupdate;

import android.app.Activity;
import com.huawei.hms.support.log.HMSLog;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class c {

    /* renamed from: b, reason: collision with root package name */
    public static final c f35464b = new c();

    /* renamed from: a, reason: collision with root package name */
    private WeakReference<Activity> f35465a;

    public boolean a(Activity activity) {
        HMSLog.i("UpdateAdapterMgr", "onActivityCreate");
        Activity a11 = a();
        if (a11 == null || a11.isFinishing()) {
            this.f35465a = new WeakReference<>(activity);
            return true;
        }
        activity.finish();
        HMSLog.i("UpdateAdapterMgr", "finish one");
        return false;
    }

    public void b(Activity activity) {
        HMSLog.i("UpdateAdapterMgr", "onActivityDestroy");
        Activity a11 = a();
        if (activity == null || !activity.equals(a11)) {
            return;
        }
        HMSLog.i("UpdateAdapterMgr", "reset");
        this.f35465a = null;
    }

    private Activity a() {
        WeakReference<Activity> weakReference = this.f35465a;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }
}
