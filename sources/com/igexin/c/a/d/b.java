package com.igexin.c.a.d;

/* loaded from: classes7.dex */
public abstract class b implements com.igexin.c.a.d.a.e {

    /* renamed from: a, reason: collision with root package name */
    private volatile boolean f37206a;

    /* renamed from: b, reason: collision with root package name */
    private long f37207b;

    /* renamed from: y, reason: collision with root package name */
    protected String f37208y = getClass().getName();

    @Override // com.igexin.c.a.d.a.e
    public final void a(boolean z11) {
        this.f37206a = !z11;
    }

    @Override // com.igexin.c.a.d.a.e
    public final void b(long j11) {
        this.f37207b = j11;
    }

    @Override // com.igexin.c.a.d.a.e
    public final boolean j() {
        return this.f37206a;
    }

    @Override // com.igexin.c.a.d.a.e
    public final long k() {
        return this.f37207b;
    }
}
