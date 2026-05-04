package com.vivo.push.b;

import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class z extends c {

    /* renamed from: a, reason: collision with root package name */
    private ArrayList<String> f44931a;

    public z(boolean z11, String str, ArrayList<String> arrayList) {
        super(z11 ? 2004 : 2005, str);
        this.f44931a = arrayList;
    }

    @Override // com.vivo.push.b.c, com.vivo.push.o
    public final void c(com.vivo.push.a aVar) {
        super.c(aVar);
        aVar.a("tags", (Serializable) this.f44931a);
    }

    @Override // com.vivo.push.b.c, com.vivo.push.o
    public final void d(com.vivo.push.a aVar) {
        super.d(aVar);
        this.f44931a = aVar.c("tags");
    }

    @Override // com.vivo.push.b.c, com.vivo.push.o
    public final String toString() {
        return "TagCommand";
    }
}
