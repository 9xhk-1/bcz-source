package com.vivo.push.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class j extends s {

    /* renamed from: a, reason: collision with root package name */
    private int f44903a;

    /* renamed from: b, reason: collision with root package name */
    private int f44904b;

    public j() {
        super(12);
        this.f44903a = -1;
        this.f44904b = -1;
    }

    @Override // com.vivo.push.b.s, com.vivo.push.o
    public final void c(com.vivo.push.a aVar) {
        super.c(aVar);
        aVar.a("OnChangePushStatus.EXTRA_REQ_SERVICE_STATUS", this.f44903a);
        aVar.a("OnChangePushStatus.EXTRA_REQ_RECEIVER_STATUS", this.f44904b);
    }

    public final int d() {
        return this.f44903a;
    }

    public final int e() {
        return this.f44904b;
    }

    @Override // com.vivo.push.b.s, com.vivo.push.o
    public final String toString() {
        return "OnChangePushStatusCommand";
    }

    @Override // com.vivo.push.b.s, com.vivo.push.o
    public final void d(com.vivo.push.a aVar) {
        super.d(aVar);
        this.f44903a = aVar.b("OnChangePushStatus.EXTRA_REQ_SERVICE_STATUS", this.f44903a);
        this.f44904b = aVar.b("OnChangePushStatus.EXTRA_REQ_RECEIVER_STATUS", this.f44904b);
    }
}
