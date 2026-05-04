package com.vivo.push.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class h extends com.vivo.push.o {

    /* renamed from: a, reason: collision with root package name */
    private String f44899a;

    public h() {
        super(2013);
    }

    @Override // com.vivo.push.o
    public final void c(com.vivo.push.a aVar) {
        aVar.a("MsgArriveCommand.MSG_TAG", this.f44899a);
    }

    @Override // com.vivo.push.o
    public final void d(com.vivo.push.a aVar) {
        this.f44899a = aVar.a("MsgArriveCommand.MSG_TAG");
    }

    public h(String str) {
        this();
        this.f44899a = str;
    }
}
