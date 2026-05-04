package io.openinstall.sdk;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import io.openinstall.sdk.az;
import tz.c1;
import tz.f1;
import tz.j0;
import tz.m0;
import tz.o0;
import tz.q0;
import tz.v0;
import tz.w0;
import tz.x;

/* loaded from: classes8.dex */
public class o extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public o0 f62626a;

    /* renamed from: b, reason: collision with root package name */
    public w0 f62627b;

    /* renamed from: c, reason: collision with root package name */
    public String f62628c;

    /* renamed from: d, reason: collision with root package name */
    public x f62629d;

    /* renamed from: e, reason: collision with root package name */
    public v0 f62630e;

    /* renamed from: f, reason: collision with root package name */
    public tz.e f62631f;

    /* renamed from: g, reason: collision with root package name */
    public final f1 f62632g;

    /* renamed from: h, reason: collision with root package name */
    public long f62633h;

    /* renamed from: i, reason: collision with root package name */
    public int f62634i;

    public o(Context context, Looper looper, q0 q0Var) {
        super(looper);
        this.f62634i = 0;
        this.f62626a = q0Var.c();
        this.f62627b = q0Var.e();
        this.f62628c = m0.a().j();
        this.f62629d = q0Var.a();
        this.f62630e = q0Var.b();
        this.f62631f = q0Var.g();
        this.f62632g = new f1(context, this.f62628c);
        this.f62633h = this.f62630e.h("FM_last_time");
    }

    public void a() {
        Message obtain = Message.obtain();
        obtain.what = 23;
        obtain.obj = null;
        sendMessage(obtain);
    }

    public void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        w0 f11 = w0.f(str);
        if (!this.f62627b.equals(f11)) {
            this.f62627b.e(f11);
            this.f62630e.g(this.f62627b);
            this.f62627b.q();
        }
        if (TextUtils.isEmpty(this.f62627b.p())) {
            return;
        }
        this.f62631f.d(this.f62628c, this.f62627b.p());
    }

    public void c(c1 c1Var) {
        Message obtain = Message.obtain();
        obtain.what = 21;
        obtain.obj = c1Var;
        sendMessage(obtain);
    }

    public void d(boolean z11) {
        Message obtain = Message.obtain();
        obtain.what = 22;
        obtain.obj = Boolean.valueOf(z11);
        sendMessage(obtain);
    }

    public final void e() {
        this.f62634i = 0;
    }

    public final boolean f(c1 c1Var) {
        if (c1Var.e() == 2 && !this.f62627b.m()) {
            if (j0.f91313a) {
                j0.b("eventStatsEnabled is false", new Object[0]);
            }
            return false;
        }
        if (c1Var.e() == 1 && !this.f62627b.m()) {
            if (j0.f91313a) {
                j0.b("eventStatsEnabled is false", new Object[0]);
            }
            return false;
        }
        if (c1Var.e() != 0 || this.f62627b.n()) {
            return true;
        }
        if (j0.f91313a) {
            j0.b("registerStatsEnabled is false", new Object[0]);
        }
        return false;
    }

    public final boolean g(boolean z11) {
        if (z11) {
            if (!this.f62627b.m() && !this.f62627b.n()) {
                this.f62632g.e();
                return false;
            }
            if (!this.f62632g.c()) {
                return false;
            }
        }
        if (this.f62626a.d() && this.f62627b.o() != null) {
            if (this.f62627b.o().longValue() * 1000 < System.currentTimeMillis() - this.f62633h) {
                return true;
            }
        }
        return false;
    }

    public final void h() {
        int i11 = this.f62634i;
        if (i11 < 10) {
            this.f62634i = i11 + 1;
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        int i11 = message.what;
        if (i11 == 21) {
            i((c1) message.obj);
            return;
        }
        if (i11 == 22) {
            if (((Boolean) message.obj).booleanValue() || g(false)) {
                k();
                return;
            }
            return;
        }
        if (i11 == 23 && g(true) && j()) {
            k();
        }
    }

    public final void i(c1 c1Var) {
        boolean f11;
        if (f(c1Var)) {
            this.f62632g.d();
            this.f62632g.a(c1Var.toString());
            f11 = c1Var.f();
        } else {
            f11 = false;
        }
        d(f11);
    }

    public final boolean j() {
        return this.f62634i < 10;
    }

    public final void k() {
        if (this.f62626a.d()) {
            az a11 = this.f62629d.a(this.f62632g.f());
            b(a11.k());
            this.f62633h = System.currentTimeMillis();
            if (a11.a() != az.a.SUCCESS) {
                if (j0.f91313a) {
                    j0.c("statEvents fail : %s", a11.g());
                }
                h();
                if (this.f62632g.b()) {
                    this.f62632g.e();
                    return;
                }
                return;
            }
            if (j0.f91313a) {
                j0.a("statEvents success", new Object[0]);
            }
            if (!TextUtils.isEmpty(a11.g()) && j0.f91313a) {
                j0.b("statEvents warning : %s", a11.g());
            }
            e();
            this.f62632g.e();
            this.f62630e.c("FM_last_time", this.f62633h);
        }
    }
}
