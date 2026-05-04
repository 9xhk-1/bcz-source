package com.vivo.push.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class s extends com.vivo.push.o {

    /* renamed from: a, reason: collision with root package name */
    private String f44919a;

    /* renamed from: b, reason: collision with root package name */
    private int f44920b;

    public s(int i11) {
        super(i11);
        this.f44919a = null;
        this.f44920b = 0;
    }

    @Override // com.vivo.push.o
    public void c(com.vivo.push.a aVar) {
        aVar.a("req_id", this.f44919a);
        aVar.a("status_msg_code", this.f44920b);
    }

    @Override // com.vivo.push.o
    public void d(com.vivo.push.a aVar) {
        this.f44919a = aVar.a("req_id");
        this.f44920b = aVar.b("status_msg_code", this.f44920b);
    }

    public final String g() {
        return this.f44919a;
    }

    public final int h() {
        return this.f44920b;
    }

    @Override // com.vivo.push.o
    public String toString() {
        return "OnReceiveCommand";
    }
}
