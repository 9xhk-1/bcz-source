package com.vivo.push.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class n extends s {

    /* renamed from: a, reason: collision with root package name */
    private String f44908a;

    /* renamed from: b, reason: collision with root package name */
    private int f44909b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f44910c;

    public n() {
        super(7);
        this.f44909b = 0;
        this.f44910c = false;
    }

    public final void a(int i11) {
        this.f44909b = i11;
    }

    public final void b(String str) {
        this.f44908a = str;
    }

    @Override // com.vivo.push.b.s, com.vivo.push.o
    public final void c(com.vivo.push.a aVar) {
        super.c(aVar);
        aVar.a("content", this.f44908a);
        aVar.a("log_level", this.f44909b);
        aVar.a("is_server_log", this.f44910c);
    }

    public final String d() {
        return this.f44908a;
    }

    public final int e() {
        return this.f44909b;
    }

    public final boolean f() {
        return this.f44910c;
    }

    @Override // com.vivo.push.b.s, com.vivo.push.o
    public final String toString() {
        return "OnLogCommand";
    }

    public final void a(boolean z11) {
        this.f44910c = z11;
    }

    @Override // com.vivo.push.b.s, com.vivo.push.o
    public final void d(com.vivo.push.a aVar) {
        super.d(aVar);
        this.f44908a = aVar.a("content");
        this.f44909b = aVar.b("log_level", 0);
        this.f44910c = aVar.e("is_server_log");
    }
}
