package com.vivo.push.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
final class a extends com.vivo.push.l {
    public a(com.vivo.push.o oVar) {
        super(oVar);
    }

    @Override // com.vivo.push.l
    public final void a(com.vivo.push.o oVar) {
        com.vivo.push.b.c cVar = (com.vivo.push.b.c) oVar;
        com.vivo.push.model.b a11 = com.vivo.push.util.t.a(this.f45035a);
        if (a11 == null) {
            com.vivo.push.e.a().a(cVar.h(), 1005, new Object[0]);
            return;
        }
        String a12 = a11.a();
        if (a11.c()) {
            com.vivo.push.e.a().a(cVar.h(), 1004, new Object[0]);
            oVar = new com.vivo.push.b.e();
        } else {
            int a13 = com.vivo.push.util.s.a(cVar);
            if (a13 != 0) {
                com.vivo.push.e.a().a(cVar.h(), a13, new Object[0]);
                return;
            }
        }
        com.vivo.push.a.a.a(this.f45035a, a12, oVar);
    }
}
