package com.vivo.push.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class i extends s {

    /* renamed from: a, reason: collision with root package name */
    private String f44900a;

    /* renamed from: b, reason: collision with root package name */
    private String f44901b;

    /* renamed from: c, reason: collision with root package name */
    private String f44902c;

    public i(int i11) {
        super(i11);
    }

    @Override // com.vivo.push.b.s, com.vivo.push.o
    public final void c(com.vivo.push.a aVar) {
        super.c(aVar);
        aVar.a("app_id", this.f44900a);
        aVar.a("client_id", this.f44901b);
        aVar.a("client_token", this.f44902c);
    }

    public final String d() {
        return this.f44900a;
    }

    public final String e() {
        return this.f44902c;
    }

    @Override // com.vivo.push.b.s, com.vivo.push.o
    public final String toString() {
        return "OnBindCommand";
    }

    @Override // com.vivo.push.b.s, com.vivo.push.o
    public final void d(com.vivo.push.a aVar) {
        super.d(aVar);
        this.f44900a = aVar.a("app_id");
        this.f44901b = aVar.a("client_id");
        this.f44902c = aVar.a("client_token");
    }
}
