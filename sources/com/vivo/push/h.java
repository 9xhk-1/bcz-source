package com.vivo.push;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
final class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.vivo.push.b.b f45026a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f45027b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ e f45028c;

    public h(e eVar, com.vivo.push.b.b bVar, String str) {
        this.f45028c = eVar;
        this.f45026a = bVar;
        this.f45027b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f45028c.a(this.f45026a);
        this.f45028c.e(this.f45027b);
    }
}
