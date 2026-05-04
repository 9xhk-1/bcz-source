package com.vivo.push.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class u extends v {

    /* renamed from: a, reason: collision with root package name */
    private long f44923a;

    /* renamed from: b, reason: collision with root package name */
    private int f44924b;

    public u() {
        super(20);
        this.f44923a = -1L;
    }

    @Override // com.vivo.push.b.v, com.vivo.push.b.s, com.vivo.push.o
    public final void c(com.vivo.push.a aVar) {
        super.c(aVar);
        aVar.a("undo_msg_v1", this.f44923a);
        aVar.a("undo_msg_type_v1", this.f44924b);
    }

    public final long d() {
        return this.f44923a;
    }

    public final String e() {
        long j11 = this.f44923a;
        if (j11 != -1) {
            return String.valueOf(j11);
        }
        return null;
    }

    @Override // com.vivo.push.b.s, com.vivo.push.o
    public final String toString() {
        return "OnUndoMsgCommand";
    }

    @Override // com.vivo.push.b.v, com.vivo.push.b.s, com.vivo.push.o
    public final void d(com.vivo.push.a aVar) {
        super.d(aVar);
        this.f44923a = aVar.b("undo_msg_v1", this.f44923a);
        this.f44924b = aVar.b("undo_msg_type_v1", 0);
    }
}
