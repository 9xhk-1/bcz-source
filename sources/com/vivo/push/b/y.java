package com.vivo.push.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class y extends com.vivo.push.o {

    /* renamed from: a, reason: collision with root package name */
    private String f44930a;

    public y(String str) {
        super(2008);
        this.f44930a = str;
    }

    @Override // com.vivo.push.o
    public final void c(com.vivo.push.a aVar) {
        aVar.a("package_name", this.f44930a);
    }

    @Override // com.vivo.push.o
    public final void d(com.vivo.push.a aVar) {
        this.f44930a = aVar.a("package_name");
    }

    @Override // com.vivo.push.o
    public final String toString() {
        return "StopServiceCommand";
    }

    public y() {
        super(2008);
    }
}
