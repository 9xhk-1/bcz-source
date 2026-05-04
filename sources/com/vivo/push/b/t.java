package com.vivo.push.b;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class t extends s {

    /* renamed from: a, reason: collision with root package name */
    private ArrayList<String> f44921a;

    /* renamed from: b, reason: collision with root package name */
    private ArrayList<String> f44922b;

    public t(int i11) {
        super(i11);
        this.f44921a = null;
        this.f44922b = null;
    }

    @Override // com.vivo.push.b.s, com.vivo.push.o
    public final void c(com.vivo.push.a aVar) {
        super.c(aVar);
        aVar.a("content", this.f44921a);
        aVar.a(ma.b.f72951v, this.f44922b);
    }

    public final ArrayList<String> d() {
        return this.f44921a;
    }

    public final List<String> e() {
        return this.f44922b;
    }

    @Override // com.vivo.push.b.s, com.vivo.push.o
    public final String toString() {
        return "OnSetTagsCommand";
    }

    @Override // com.vivo.push.b.s, com.vivo.push.o
    public final void d(com.vivo.push.a aVar) {
        super.d(aVar);
        this.f44921a = aVar.c("content");
        this.f44922b = aVar.c(ma.b.f72951v);
    }
}
