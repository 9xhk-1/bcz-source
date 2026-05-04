package tz;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes8.dex */
public abstract class d1 extends a {

    /* renamed from: a, reason: collision with root package name */
    public Runnable f91257a = null;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f91258b = new Handler(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f91259c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f91260d;

    public d1() {
        this.f91259c = false;
        this.f91260d = true;
        this.f91259c = true;
        this.f91260d = false;
    }

    public abstract void a(long j11);

    public abstract void d(long j11);

    @Override // tz.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        super.onActivityPaused(activity);
        this.f91260d = true;
        Runnable runnable = this.f91257a;
        if (runnable != null) {
            this.f91258b.removeCallbacks(runnable);
        }
        e1 e1Var = new e1(this);
        this.f91257a = e1Var;
        this.f91258b.postDelayed(e1Var, 500L);
    }

    @Override // tz.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        super.onActivityResumed(activity);
        boolean z11 = this.f91259c;
        this.f91259c = true;
        this.f91260d = false;
        Runnable runnable = this.f91257a;
        if (runnable != null) {
            this.f91258b.removeCallbacks(runnable);
            this.f91257a = null;
        }
        if (z11) {
            return;
        }
        a(System.currentTimeMillis());
    }
}
