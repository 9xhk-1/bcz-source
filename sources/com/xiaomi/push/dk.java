package com.xiaomi.push;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;

/* loaded from: classes8.dex */
public class dk implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    private Context f45393a;

    /* renamed from: a, reason: collision with other field name */
    private String f260a;

    /* renamed from: b, reason: collision with root package name */
    private String f45394b;

    public dk(Context context, String str) {
        this.f45393a = context;
        this.f260a = str;
    }

    private void a(String str) {
        hp hpVar = new hp();
        hpVar.a(str);
        hpVar.a(System.currentTimeMillis());
        hpVar.a(hj.ActivityActiveTimeStamp);
        ds.a(this.f45393a, hpVar);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        String localClassName = activity.getLocalClassName();
        if (TextUtils.isEmpty(this.f260a) || TextUtils.isEmpty(localClassName)) {
            return;
        }
        this.f45394b = "";
        if (!TextUtils.isEmpty("") && !TextUtils.equals(this.f45394b, localClassName)) {
            this.f260a = "";
            return;
        }
        a(this.f45393a.getPackageName() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + localClassName + ":" + this.f260a + "," + String.valueOf(System.currentTimeMillis() / 1000));
        this.f260a = "";
        this.f45394b = "";
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        if (TextUtils.isEmpty(this.f45394b)) {
            this.f45394b = activity.getLocalClassName();
        }
        this.f260a = String.valueOf(System.currentTimeMillis() / 1000);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
