package ig;

import a00.l1;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.baicizhan.main.activity.MainTabActivity;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import ma.t;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class a implements DefaultLifecycleObserver {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final b f60529e = new b(null);

    /* renamed from: f, reason: collision with root package name */
    public static final int f60530f = 8;

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final String f60531g = "AppLifeObserver";

    /* renamed from: h, reason: collision with root package name */
    public static final int f60532h = 30;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Application f60533a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public Timer f60534b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f60535c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public Boolean f60536d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: ig.a$a, reason: collision with other inner class name */
    public static final class C0699a implements Application.ActivityLifecycleCallbacks {
        public C0699a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            ig.c g11;
            g0.p(activity, "activity");
            if (!(activity instanceof MainTabActivity) || (g11 = a.this.g()) == null) {
                return;
            }
            g11.a(true);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            g0.p(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            g0.p(activity, "activity");
            if (activity instanceof MainTabActivity) {
                qb.c.b(a.f60531g, "sharing code disallowed", new Object[0]);
                ig.c g11 = a.this.g();
                if (g11 != null) {
                    g11.a(false);
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            g0.p(activity, "activity");
            if (g0.g(a.this.f60536d, Boolean.TRUE) && (activity instanceof MainTabActivity)) {
                a.this.f60536d = null;
                qb.c.b(a.f60531g, "sharing code allowed", new Object[0]);
                ig.c g11 = a.this.g();
                if (g11 != null) {
                    g11.a(true);
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
            g0.p(activity, "activity");
            g0.p(outState, "outState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            g0.p(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            g0.p(activity, "activity");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends TimerTask {
        public c() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            a.this.h();
        }
    }

    public a(@k Application application) {
        g0.p(application, "application");
        this.f60533a = application;
        this.f60535c = true;
        application.registerActivityLifecycleCallbacks(new C0699a());
    }

    @k
    public final Application f() {
        return this.f60533a;
    }

    public final ig.c g() {
        ComponentCallbacks2 componentCallbacks2 = this.f60533a;
        if (!(componentCallbacks2 instanceof ig.c)) {
            return null;
        }
        g0.n(componentCallbacks2, "null cannot be cast to non-null type com.baicizhan.main.global.SharingCodeStateListener");
        return (ig.c) componentCallbacks2;
    }

    public final void h() {
        ma.l.e(t.E, ma.a.f72801n4, l1.W(h1.a(TypedValues.CycleType.S_WAVE_PERIOD, 30), h1.a("plan_type", ig.b.f60539a.a().getValue())));
    }

    public final void i() {
        qb.c.b(f60531g, "startReport", new Object[0]);
        Timer timer = new Timer();
        this.f60534b = timer;
        timer.schedule(new c(), 0L, 30000L);
    }

    public final void j() {
        qb.c.b(f60531g, "stopReport", new Object[0]);
        Timer timer = this.f60534b;
        if (timer != null) {
            timer.cancel();
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onCreate(@k LifecycleOwner lifecycleOwner) {
        super.onCreate(lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onDestroy(@k LifecycleOwner lifecycleOwner) {
        super.onDestroy(lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onPause(@k LifecycleOwner lifecycleOwner) {
        super.onPause(lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(@k LifecycleOwner owner) {
        g0.p(owner, "owner");
        if (this.f60535c) {
            this.f60535c = false;
            qb.c.b(f60531g, "sharing code allowed: rendezvous", new Object[0]);
            ig.c g11 = g();
            if (g11 != null) {
                g11.a(true);
            }
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(@k LifecycleOwner owner) {
        g0.p(owner, "owner");
        qb.c.b(f60531g, "onStart: " + this.f60536d, new Object[0]);
        if (g0.g(this.f60536d, Boolean.FALSE)) {
            this.f60536d = Boolean.TRUE;
        }
        i();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(@k LifecycleOwner owner) {
        g0.p(owner, "owner");
        this.f60536d = Boolean.FALSE;
        j();
    }
}
