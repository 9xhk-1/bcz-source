package com.xiaomi.push;

import com.xiaomi.push.am;
import com.xiaomi.push.de;

/* loaded from: classes8.dex */
class dg extends am.b {

    /* renamed from: a, reason: collision with root package name */
    am.b f45386a;

    /* renamed from: a, reason: collision with other field name */
    final /* synthetic */ de f252a;

    public dg(de deVar) {
        this.f252a = deVar;
    }

    @Override // com.xiaomi.push.am.b
    public void b() {
        de.b bVar = (de.b) this.f252a.f240a.peek();
        if (bVar == null || !bVar.a()) {
            return;
        }
        if (this.f252a.f240a.remove(bVar)) {
            this.f45386a = bVar;
        }
        am.b bVar2 = this.f45386a;
        if (bVar2 != null) {
            bVar2.b();
        }
    }

    @Override // com.xiaomi.push.am.b
    /* renamed from: c */
    public void mo5820c() {
        am.b bVar = this.f45386a;
        if (bVar != null) {
            bVar.mo5820c();
        }
    }
}
