package com.igexin.push.f.b;

import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public abstract class f extends com.igexin.c.a.d.f {

    /* renamed from: d, reason: collision with root package name */
    long f38574d;

    private f(long j11) {
        super(5);
        this.f38574d = j11;
        a(j11, TimeUnit.MILLISECONDS);
    }

    @Override // com.igexin.c.a.d.f, com.igexin.c.a.d.a.f
    public final void b_() throws Exception {
        super.b_();
        h();
    }

    public abstract void h();

    public f(long j11, byte b11) {
        this(j11);
    }

    @Override // com.igexin.c.a.d.f
    public final void e() {
    }

    @Override // com.igexin.c.a.d.f
    public final void f() {
    }
}
