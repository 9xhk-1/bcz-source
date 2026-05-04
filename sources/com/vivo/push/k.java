package com.vivo.push;

import com.vivo.push.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
final class k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f45033a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f45034b;

    public k(e eVar, String str) {
        this.f45034b = eVar;
        this.f45033a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e.a d11;
        d11 = this.f45034b.d(this.f45033a);
        if (d11 != null) {
            d11.a(1003, new Object[0]);
        }
    }
}
