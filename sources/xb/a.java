package xb;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a {

    /* renamed from: e, reason: collision with root package name */
    public static a f97927e;

    /* renamed from: a, reason: collision with root package name */
    public int f97928a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f97929b = false;

    /* renamed from: c, reason: collision with root package name */
    public long f97930c = 0;

    /* renamed from: d, reason: collision with root package name */
    public Application.ActivityLifecycleCallbacks f97931d = new C1318a();

    public static /* synthetic */ int b(a aVar) {
        int i11 = aVar.f97928a + 1;
        aVar.f97928a = i11;
        return i11;
    }

    public static /* synthetic */ int c(a aVar) {
        int i11 = aVar.f97928a - 1;
        aVar.f97928a = i11;
        return i11;
    }

    public static a h() {
        if (f97927e == null) {
            synchronized (a.class) {
                try {
                    if (f97927e == null) {
                        f97927e = new a();
                    }
                } finally {
                }
            }
        }
        return f97927e;
    }

    public long f() {
        return this.f97930c;
    }

    public void g(Application application) {
        application.registerActivityLifecycleCallbacks(this.f97931d);
    }

    public boolean i() {
        return this.f97929b;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: xb.a$a, reason: collision with other inner class name */
    public class C1318a implements Application.ActivityLifecycleCallbacks {
        public C1318a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            a.this.f97929b = true;
            a.this.f97930c = 0L;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            a.b(a.this);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            a.c(a.this);
            if (a.this.f97928a == 0) {
                a.this.f97929b = false;
                a.this.f97930c = System.currentTimeMillis();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        }
    }
}
