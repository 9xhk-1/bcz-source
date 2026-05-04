package com.huawei.hms.availableupdate;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    public static final a f35457c = new a();

    /* renamed from: d, reason: collision with root package name */
    private static final Object f35458d = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f35459a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    private final List<Activity> f35460b = new ArrayList(1);

    public void a(Activity activity) {
        synchronized (f35458d) {
            try {
                for (Activity activity2 : this.f35460b) {
                    if (activity2 != null && activity2 != activity && !activity2.isFinishing()) {
                        activity2.finish();
                    }
                }
                this.f35460b.add(activity);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void b(Activity activity) {
        synchronized (f35458d) {
            this.f35460b.remove(activity);
        }
    }

    public void a(boolean z11) {
        this.f35459a.set(z11);
    }

    public AtomicBoolean a() {
        return this.f35459a;
    }
}
