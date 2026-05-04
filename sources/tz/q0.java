package tz;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final x f91358a;

    /* renamed from: b, reason: collision with root package name */
    public final v0 f91359b;

    /* renamed from: d, reason: collision with root package name */
    public final y0 f91361d;

    /* renamed from: e, reason: collision with root package name */
    public final l f91362e;

    /* renamed from: g, reason: collision with root package name */
    public final e f91364g;

    /* renamed from: h, reason: collision with root package name */
    public final ThreadPoolExecutor f91365h;

    /* renamed from: i, reason: collision with root package name */
    public final ThreadPoolExecutor f91366i;

    /* renamed from: j, reason: collision with root package name */
    public final Handler f91367j;

    /* renamed from: c, reason: collision with root package name */
    public final o0 f91360c = new o0();

    /* renamed from: f, reason: collision with root package name */
    public final w0 f91363f = new w0();

    public q0(Context context) {
        v0 v0Var = new v0(new x0().a(context.getApplicationContext(), "FM_config", null));
        this.f91359b = v0Var;
        this.f91358a = x.f(this);
        this.f91361d = y0.b(context.getApplicationContext(), v0Var);
        this.f91362e = l.c(context.getApplicationContext());
        this.f91364g = e.b(context.getApplicationContext());
        this.f91367j = new Handler(Looper.getMainLooper());
        TimeUnit timeUnit = TimeUnit.SECONDS;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 10L, timeUnit, new LinkedBlockingQueue(10), new r0(this), new s0(this));
        this.f91365h = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(5, 10, 60L, timeUnit, new LinkedBlockingQueue(30), new t0(this), new u0(this));
        this.f91366i = threadPoolExecutor2;
        threadPoolExecutor2.allowCoreThreadTimeOut(true);
    }

    public x a() {
        return this.f91358a;
    }

    public v0 b() {
        return this.f91359b;
    }

    public o0 c() {
        return this.f91360c;
    }

    public y0 d() {
        return this.f91361d;
    }

    public w0 e() {
        return this.f91363f;
    }

    public l f() {
        return this.f91362e;
    }

    public e g() {
        return this.f91364g;
    }

    public ThreadPoolExecutor h() {
        return this.f91365h;
    }

    public ThreadPoolExecutor i() {
        return this.f91366i;
    }

    public Handler j() {
        return this.f91367j;
    }
}
