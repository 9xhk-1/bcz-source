package com.xiaomi.mipush.sdk;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.liteav.TXLiteAVCode;
import com.xiaomi.push.em;
import com.xiaomi.push.en;
import java.util.HashSet;
import java.util.Set;

@TargetApi(14)
/* loaded from: classes6.dex */
public class a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    private Set<String> f45172a = new HashSet();

    private static void a(Application application) {
        application.registerActivityLifecycleCallbacks(new a());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        en a11;
        String packageName;
        String m5913a;
        int i11;
        Intent intent = activity.getIntent();
        if (intent == null) {
            return;
        }
        String stringExtra = intent.getStringExtra("messageId");
        int intExtra = intent.getIntExtra("eventMessageType", -1);
        if (TextUtils.isEmpty(stringExtra) || intExtra <= 0 || this.f45172a.contains(stringExtra)) {
            return;
        }
        this.f45172a.add(stringExtra);
        if (intExtra == 3000) {
            a11 = en.a(activity.getApplicationContext());
            packageName = activity.getPackageName();
            m5913a = em.m5913a(intExtra);
            i11 = TXLiteAVCode.WARNING_RTMP_NO_DATA;
        } else {
            if (intExtra != 1000) {
                return;
            }
            a11 = en.a(activity.getApplicationContext());
            packageName = activity.getPackageName();
            m5913a = em.m5913a(intExtra);
            i11 = 1008;
        }
        a11.a(packageName, m5913a, stringExtra, i11, null);
    }

    public static void a(Context context) {
        a((Application) context.getApplicationContext());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
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
