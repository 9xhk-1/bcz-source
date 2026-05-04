package com.igexin.push.core.i;

import android.app.Activity;

/* loaded from: classes7.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    protected Long f38184a = Long.valueOf(System.currentTimeMillis());

    /* renamed from: b, reason: collision with root package name */
    protected Activity f38185b;

    /* renamed from: c, reason: collision with root package name */
    protected String f38186c;

    private Activity n() {
        return this.f38185b;
    }

    public final Long a() {
        return this.f38184a;
    }

    public final String b() {
        return this.f38186c;
    }

    public abstract void c();

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public abstract void g();

    public abstract void h();

    public abstract void i();

    public abstract boolean j();

    public abstract void k();

    public abstract boolean l();

    public abstract void m();

    public final void a(Activity activity) {
        this.f38185b = activity;
    }

    private void a(Long l11) {
        this.f38184a = l11;
    }

    private void a(String str) {
        this.f38186c = str;
    }
}
