package com.vivo.push.b;

import com.tencent.liteav.TXLiteAVCode;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class l extends s {

    /* renamed from: a, reason: collision with root package name */
    private int f44905a;

    /* renamed from: b, reason: collision with root package name */
    private int f44906b;

    public l() {
        super(TXLiteAVCode.EVT_VOD_PLAY_TCP_CONNECT_SUCC);
        this.f44905a = -1;
        this.f44906b = -1;
    }

    @Override // com.vivo.push.b.s, com.vivo.push.o
    public final void c(com.vivo.push.a aVar) {
        super.c(aVar);
        aVar.a("key_dispatch_environment", this.f44905a);
        aVar.a("key_dispatch_area", this.f44906b);
    }

    @Override // com.vivo.push.b.s, com.vivo.push.o
    public final void d(com.vivo.push.a aVar) {
        super.d(aVar);
        this.f44905a = aVar.b("key_dispatch_environment", 1);
        this.f44906b = aVar.b("key_dispatch_area", 1);
    }

    public final int e() {
        return this.f44906b;
    }

    public final int d() {
        return this.f44905a;
    }
}
