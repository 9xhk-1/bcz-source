package com.igexin.push.f;

/* loaded from: classes7.dex */
public final class f implements com.igexin.push.f.b.c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f38584a = "SilentTask";

    /* renamed from: b, reason: collision with root package name */
    private static f f38585b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f38586c = com.igexin.push.g.c.a(System.currentTimeMillis());

    private f() {
    }

    public static f a() {
        if (f38585b == null) {
            f38585b = new f();
        }
        return f38585b;
    }

    @Override // com.igexin.push.f.b.c
    public final void b() {
        d();
    }

    @Override // com.igexin.push.f.b.c
    public final boolean c() {
        return com.igexin.push.config.d.f37583c != 0;
    }

    public final void d() {
        boolean z11 = this.f38586c;
        boolean a11 = com.igexin.push.g.c.a(System.currentTimeMillis());
        this.f38586c = a11;
        if (!z11 || a11) {
            return;
        }
        com.igexin.c.a.c.a.b(f38584a, "out silence time");
        a.a().a(false);
    }

    @Override // com.igexin.push.f.b.c
    public final void a(long j11) {
    }
}
