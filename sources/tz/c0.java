package tz;

import android.text.TextUtils;

/* loaded from: classes8.dex */
public abstract class c0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final q0 f91242a;

    /* renamed from: b, reason: collision with root package name */
    public final String f91243b = m0.a().j();

    /* renamed from: c, reason: collision with root package name */
    public final o0 f91244c;

    /* renamed from: d, reason: collision with root package name */
    public final v0 f91245d;

    /* renamed from: e, reason: collision with root package name */
    public final y0 f91246e;

    /* renamed from: f, reason: collision with root package name */
    public final w0 f91247f;

    /* renamed from: g, reason: collision with root package name */
    public final e f91248g;

    /* renamed from: h, reason: collision with root package name */
    public final x f91249h;

    /* renamed from: i, reason: collision with root package name */
    public final l f91250i;

    public c0(q0 q0Var) {
        this.f91242a = q0Var;
        this.f91244c = q0Var.c();
        this.f91245d = q0Var.b();
        this.f91246e = q0Var.d();
        this.f91247f = q0Var.e();
        this.f91248g = q0Var.g();
        this.f91249h = q0Var.a();
        this.f91250i = q0Var.f();
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        w0 f11 = w0.f(str);
        if (!this.f91247f.equals(f11)) {
            this.f91247f.e(f11);
            this.f91245d.g(this.f91247f);
            this.f91247f.q();
        }
        if (TextUtils.isEmpty(this.f91247f.p())) {
            return;
        }
        this.f91248g.d(this.f91243b, this.f91247f.p());
    }
}
