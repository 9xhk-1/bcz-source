package com.huawei.hms.availableupdate;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    public static final b f35461b = new b();

    /* renamed from: c, reason: collision with root package name */
    private static final Object f35462c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final List<Activity> f35463a = new ArrayList(1);

    public void a(Activity activity) {
        synchronized (f35462c) {
            try {
                for (Activity activity2 : this.f35463a) {
                    if (activity2 != null && activity2 != activity && !activity2.isFinishing()) {
                        activity2.finish();
                    }
                }
                this.f35463a.add(activity);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void b(Activity activity) {
        synchronized (f35462c) {
            this.f35463a.remove(activity);
        }
    }
}
