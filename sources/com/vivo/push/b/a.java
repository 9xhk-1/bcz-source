package com.vivo.push.b;

import java.util.ArrayList;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class a extends c {

    /* renamed from: a, reason: collision with root package name */
    private ArrayList<String> f44886a;

    public a(boolean z11, String str, ArrayList<String> arrayList) {
        super(z11 ? 2002 : 2003, str);
        this.f44886a = arrayList;
    }

    @Override // com.vivo.push.b.c, com.vivo.push.o
    public final void c(com.vivo.push.a aVar) {
        super.c(aVar);
        aVar.a("tags", this.f44886a);
    }

    @Override // com.vivo.push.b.c, com.vivo.push.o
    public final void d(com.vivo.push.a aVar) {
        super.d(aVar);
        this.f44886a = aVar.c("tags");
    }

    @Override // com.vivo.push.b.c, com.vivo.push.o
    public final String toString() {
        return "AliasCommand:" + b();
    }
}
