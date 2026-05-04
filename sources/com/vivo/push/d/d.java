package com.vivo.push.d;

import android.text.TextUtils;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
final class d extends z {
    public d(com.vivo.push.o oVar) {
        super(oVar);
    }

    @Override // com.vivo.push.l
    public final void a(com.vivo.push.o oVar) {
        com.vivo.push.b.i iVar = (com.vivo.push.b.i) oVar;
        String e11 = iVar.e();
        com.vivo.push.e.a().a(iVar.g(), iVar.h(), e11);
        if (TextUtils.isEmpty(iVar.g()) && !TextUtils.isEmpty(e11)) {
            com.vivo.push.e.a().a(e11);
        }
        com.vivo.push.m.b(new e(this, e11, iVar));
    }
}
