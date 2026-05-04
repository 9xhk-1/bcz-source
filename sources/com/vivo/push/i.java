package com.vivo.push;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
final class i implements IPushActionListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ e f45029a;

    public i(e eVar) {
        this.f45029a = eVar;
    }

    @Override // com.vivo.push.IPushActionListener
    public final void onStateChanged(int i11) {
        com.vivo.push.util.b bVar;
        com.vivo.push.util.b bVar2;
        if (i11 != 0) {
            this.f45029a.f45005k = null;
            bVar = this.f45029a.f45004j;
            bVar.b("APP_TOKEN");
        } else {
            this.f45029a.f45005k = "";
            bVar2 = this.f45029a.f45004j;
            bVar2.a("APP_TOKEN", "");
            this.f45029a.m();
            this.f45029a.f45004j.b("APP_TAGS");
        }
    }
}
