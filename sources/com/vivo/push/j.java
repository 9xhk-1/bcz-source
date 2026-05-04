package com.vivo.push;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
final class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.vivo.push.b.b f45030a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f45031b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ e f45032c;

    public j(e eVar, com.vivo.push.b.b bVar, String str) {
        this.f45032c = eVar;
        this.f45030a = bVar;
        this.f45031b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f45032c.a(this.f45030a);
        this.f45032c.e(this.f45031b);
    }
}
