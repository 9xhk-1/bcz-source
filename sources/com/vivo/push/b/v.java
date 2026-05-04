package com.vivo.push.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public abstract class v extends s {

    /* renamed from: a, reason: collision with root package name */
    private String f44925a;

    /* renamed from: b, reason: collision with root package name */
    private long f44926b;

    public v(int i11) {
        super(i11);
    }

    @Override // com.vivo.push.b.s, com.vivo.push.o
    public void c(com.vivo.push.a aVar) {
        super.c(aVar);
        aVar.a("OnVerifyCallBackCommand.EXTRA_SECURITY_CONTENT", this.f44925a);
        aVar.a("notify_id", this.f44926b);
    }

    @Override // com.vivo.push.b.s, com.vivo.push.o
    public void d(com.vivo.push.a aVar) {
        super.d(aVar);
        this.f44925a = aVar.a("OnVerifyCallBackCommand.EXTRA_SECURITY_CONTENT");
        this.f44926b = aVar.b("notify_id", -1L);
    }

    public final long f() {
        return this.f44926b;
    }

    public final String i() {
        return this.f44925a;
    }
}
