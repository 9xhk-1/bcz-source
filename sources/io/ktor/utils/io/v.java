package io.ktor.utils.io;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class v implements g {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final g f62300b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final y40.b f62301c;

    /* renamed from: d, reason: collision with root package name */
    public long f62302d;

    /* renamed from: e, reason: collision with root package name */
    public long f62303e;

    public v(@m80.k g delegate) {
        kotlin.jvm.internal.g0.p(delegate, "delegate");
        this.f62300b = delegate;
        this.f62301c = new y40.b();
    }

    @Override // io.ktor.utils.io.g, io.ktor.utils.io.m
    public void a(@m80.l Throwable th2) {
        this.f62300b.a(th2);
        this.f62301c.close();
    }

    @Override // io.ktor.utils.io.g, io.ktor.utils.io.m
    @m80.l
    public Throwable b() {
        return this.f62300b.b();
    }

    @m80.k
    public final g c() {
        return this.f62300b;
    }

    @Override // io.ktor.utils.io.g
    @m80.l
    public Object d(int i11, @m80.k j00.c<? super Boolean> cVar) {
        return e().r() < ((long) i11) ? this.f62300b.d(i11, cVar) : l00.a.a(true);
    }

    @Override // io.ktor.utils.io.g
    public boolean f() {
        return this.f62301c.J() && this.f62300b.f();
    }

    @Override // io.ktor.utils.io.g
    @m80.k
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public y40.b e() {
        j();
        this.f62302d += this.f62301c.T(this.f62300b.e());
        return this.f62301c;
    }

    public final long i() {
        j();
        return this.f62303e;
    }

    public final void j() {
        this.f62303e += this.f62302d - this.f62301c.r();
        this.f62302d = this.f62301c.r();
    }

    @b0
    public static /* synthetic */ void h() {
    }
}
