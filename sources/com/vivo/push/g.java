package com.vivo.push;

import com.vivo.push.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
final class g implements IPushActionListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ e.a f45024a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f45025b;

    public g(e eVar, e.a aVar) {
        this.f45025b = eVar;
        this.f45024a = aVar;
    }

    @Override // com.vivo.push.IPushActionListener
    public final void onStateChanged(int i11) {
        com.vivo.push.util.b bVar;
        if (i11 != 0) {
            this.f45025b.f45005k = null;
            bVar = this.f45025b.f45004j;
            bVar.b("APP_TOKEN");
        } else {
            Object[] b11 = this.f45024a.b();
            if (b11 == null || b11.length == 0) {
                com.vivo.push.util.p.a("PushClientManager", "bind app result is null");
            } else {
                this.f45025b.a((String) this.f45024a.b()[0]);
            }
        }
    }
}
