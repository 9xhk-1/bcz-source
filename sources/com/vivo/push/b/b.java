package com.vivo.push.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class b extends c {

    /* renamed from: a, reason: collision with root package name */
    private String f44887a;

    /* renamed from: b, reason: collision with root package name */
    private String f44888b;

    /* renamed from: c, reason: collision with root package name */
    private String f44889c;

    /* renamed from: d, reason: collision with root package name */
    private String f44890d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f44891e;

    public b(boolean z11, String str) {
        super(z11 ? 2006 : 2007, str);
        this.f44891e = false;
    }

    @Override // com.vivo.push.b.c, com.vivo.push.o
    public final void c(com.vivo.push.a aVar) {
        super.c(aVar);
        aVar.a("sdk_clients", this.f44887a);
        aVar.a("sdk_version", 323L);
        aVar.a("BaseAppCommand.EXTRA_APPID", this.f44889c);
        aVar.a("BaseAppCommand.EXTRA_APPKEY", this.f44888b);
        aVar.a("PUSH_REGID", this.f44890d);
    }

    public final void d() {
        this.f44889c = null;
    }

    public final void e() {
        this.f44888b = null;
    }

    @Override // com.vivo.push.b.c, com.vivo.push.o
    public final String toString() {
        return "AppCommand:" + b();
    }

    @Override // com.vivo.push.b.c, com.vivo.push.o
    public final void d(com.vivo.push.a aVar) {
        super.d(aVar);
        this.f44887a = aVar.a("sdk_clients");
        this.f44889c = aVar.a("BaseAppCommand.EXTRA_APPID");
        this.f44888b = aVar.a("BaseAppCommand.EXTRA_APPKEY");
        this.f44890d = aVar.a("PUSH_REGID");
    }
}
