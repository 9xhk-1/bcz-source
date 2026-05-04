package com.vivo.push.b;

import java.util.ArrayList;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class m extends s {

    /* renamed from: a, reason: collision with root package name */
    private ArrayList<String> f44907a;

    public m() {
        super(8);
    }

    @Override // com.vivo.push.b.s, com.vivo.push.o
    public final void c(com.vivo.push.a aVar) {
        super.c(aVar);
        aVar.a("tags_list", this.f44907a);
    }

    public final ArrayList<String> d() {
        return this.f44907a;
    }

    @Override // com.vivo.push.b.s, com.vivo.push.o
    public final String toString() {
        return "OnListTagCommand";
    }

    @Override // com.vivo.push.b.s, com.vivo.push.o
    public final void d(com.vivo.push.a aVar) {
        super.d(aVar);
        this.f44907a = aVar.c("tags_list");
    }
}
