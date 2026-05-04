package tz;

import android.app.Application;
import android.content.Context;
import java.lang.ref.WeakReference;

/* loaded from: classes8.dex */
public class l {

    /* renamed from: h, reason: collision with root package name */
    public static l f91316h;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f91317a;

    /* renamed from: b, reason: collision with root package name */
    public p f91318b;

    /* renamed from: e, reason: collision with root package name */
    public Application f91321e;

    /* renamed from: f, reason: collision with root package name */
    public Application.ActivityLifecycleCallbacks f91322f;

    /* renamed from: c, reason: collision with root package name */
    public boolean f91319c = true;

    /* renamed from: d, reason: collision with root package name */
    public WeakReference f91320d = null;

    /* renamed from: g, reason: collision with root package name */
    public final Runnable f91323g = new n(this);

    public l(Context context) {
        boolean booleanValue = m0.a().m().booleanValue();
        this.f91317a = booleanValue;
        if (!booleanValue) {
            if (j0.f91313a) {
                j0.a("clipBoardEnabled = false", new Object[0]);
            }
        } else {
            this.f91318b = new p(context);
            this.f91321e = (Application) context.getApplicationContext();
            m mVar = new m(this);
            this.f91322f = mVar;
            this.f91321e.registerActivityLifecycleCallbacks(mVar);
        }
    }

    public static l c(Context context) {
        if (f91316h == null) {
            synchronized (l.class) {
                try {
                    if (f91316h == null) {
                        f91316h = new l(context);
                    }
                } finally {
                }
            }
        }
        return f91316h;
    }

    public void d(String str) {
        if (this.f91317a && this.f91319c) {
            if (j0.f91313a) {
                j0.a("%s release", str);
            }
            this.f91318b.d();
        }
    }

    public void e(WeakReference weakReference) {
        if (!this.f91317a || weakReference == null) {
            return;
        }
        this.f91318b.c(weakReference);
    }

    public void f(boolean z11) {
        this.f91319c = z11;
    }

    public boolean g() {
        return this.f91317a;
    }

    public o i() {
        return j(false);
    }

    public o j(boolean z11) {
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks;
        if (!this.f91317a) {
            return null;
        }
        o b11 = o.b(this.f91318b.a(z11));
        boolean z12 = j0.f91313a;
        if (b11 != null) {
            if (z12) {
                j0.a("data type is %d", Integer.valueOf(b11.i()));
            }
            Application application = this.f91321e;
            if (application != null && (activityLifecycleCallbacks = this.f91322f) != null) {
                application.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
                this.f91322f = null;
                return b11;
            }
        } else if (z12) {
            j0.a("data is null", new Object[0]);
        }
        return b11;
    }

    public void k(String str) {
        if (this.f91317a && this.f91319c) {
            if (j0.f91313a) {
                j0.a("%s access", str);
            }
            this.f91318b.b();
        }
    }
}
