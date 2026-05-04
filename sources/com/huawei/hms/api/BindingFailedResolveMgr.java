package com.huawei.hms.api;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
class BindingFailedResolveMgr {

    /* renamed from: b, reason: collision with root package name */
    static final BindingFailedResolveMgr f35389b = new BindingFailedResolveMgr();

    /* renamed from: c, reason: collision with root package name */
    private static final Object f35390c = new Object();

    /* renamed from: a, reason: collision with root package name */
    List<Activity> f35391a = new ArrayList(1);

    public void a(Activity activity) {
        synchronized (f35390c) {
            try {
                for (Activity activity2 : this.f35391a) {
                    if (activity2 != null && activity2 != activity && !activity2.isFinishing()) {
                        activity2.finish();
                    }
                }
                this.f35391a.add(activity);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void b(Activity activity) {
        synchronized (f35390c) {
            this.f35391a.remove(activity);
        }
    }
}
