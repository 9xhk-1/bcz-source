package com.vivo.push.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class w extends com.vivo.push.o {

    /* renamed from: a, reason: collision with root package name */
    private int f44927a;

    public w() {
        super(2011);
        this.f44927a = 0;
    }

    @Override // com.vivo.push.o
    public final boolean c() {
        return true;
    }

    public final int d() {
        return this.f44927a;
    }

    @Override // com.vivo.push.o
    public final String toString() {
        return "PushModeCommand";
    }

    @Override // com.vivo.push.o
    public final void c(com.vivo.push.a aVar) {
        aVar.a("com.bbk.push.ikey.MODE_TYPE", this.f44927a);
    }

    @Override // com.vivo.push.o
    public final void d(com.vivo.push.a aVar) {
        this.f44927a = aVar.b("com.bbk.push.ikey.MODE_TYPE", 0);
    }
}
