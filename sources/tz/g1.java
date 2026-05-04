package tz;

import android.app.Application;
import android.os.HandlerThread;
import android.text.TextUtils;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes8.dex */
public class g1 {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedBlockingQueue f91283a = new LinkedBlockingQueue(1);

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f91284b = true;

    /* renamed from: c, reason: collision with root package name */
    public final Thread f91285c;

    /* renamed from: d, reason: collision with root package name */
    public final Application f91286d;

    /* renamed from: e, reason: collision with root package name */
    public Application.ActivityLifecycleCallbacks f91287e;

    /* renamed from: f, reason: collision with root package name */
    public final io.openinstall.sdk.o f91288f;

    public g1(q0 q0Var) {
        Application application = (Application) m0.a().h();
        this.f91286d = application;
        HandlerThread handlerThread = new HandlerThread("EventsHandler");
        handlerThread.start();
        this.f91288f = new io.openinstall.sdk.o(application, handlerThread.getLooper(), q0Var);
        Thread thread = new Thread(new h1(this));
        this.f91285c = thread;
        thread.setName("el");
        f();
    }

    public void a() {
        c1 a11 = c1.a();
        a11.d(true);
        this.f91288f.c(a11);
    }

    public void b(long j11) {
        if (j11 >= 1) {
            this.f91288f.c(c1.b(j11));
        }
    }

    public void c(String str, long j11) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f91288f.c(c1.c(str, j11));
    }

    public final void f() {
        this.f91284b = true;
        this.f91285c.start();
        h();
    }

    public final void h() {
        i1 i1Var = new i1(this);
        this.f91287e = i1Var;
        this.f91286d.registerActivityLifecycleCallbacks(i1Var);
    }
}
