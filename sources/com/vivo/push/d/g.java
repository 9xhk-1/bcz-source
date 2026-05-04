package com.vivo.push.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
final class g extends z {
    public g(com.vivo.push.o oVar) {
        super(oVar);
    }

    @Override // com.vivo.push.l
    public final void a(com.vivo.push.o oVar) {
        com.vivo.push.util.p.d("OnClearCacheTask", "delete push info " + this.f45035a.getPackageName());
        com.vivo.push.util.y.b(this.f45035a).a();
    }
}
