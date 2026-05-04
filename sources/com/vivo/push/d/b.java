package com.vivo.push.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
final class b extends com.vivo.push.l {
    public b(com.vivo.push.o oVar) {
        super(oVar);
    }

    @Override // com.vivo.push.l
    public final void a(com.vivo.push.o oVar) {
        com.vivo.push.model.b a11 = com.vivo.push.util.t.a(this.f45035a);
        try {
            if (((com.vivo.push.b.d) oVar).d() ? f.a(this.f45035a) : f.b(this.f45035a)) {
                com.vivo.push.model.b a12 = com.vivo.push.util.t.a(this.f45035a);
                if (a11 == null || a12 == null || a12.a() == null || !a12.a().equals(a11.a())) {
                    if (a11 != null && a11.a() != null) {
                        com.vivo.push.a.a.a(this.f45035a, a11.a(), new com.vivo.push.b.y(a11.a()));
                    }
                    if (a12 == null || a12.a() == null) {
                        return;
                    }
                    com.vivo.push.a.a.a(this.f45035a, a12.a(), new com.vivo.push.b.f());
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
