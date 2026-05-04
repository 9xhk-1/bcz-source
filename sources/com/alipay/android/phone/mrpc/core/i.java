package com.alipay.android.phone.mrpc.core;

import android.content.Context;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class i implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ aa f10282a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f10283b;

    public i(h hVar, aa aaVar) {
        this.f10283b = hVar;
        this.f10282a = aaVar;
    }

    @Override // com.alipay.android.phone.mrpc.core.g
    public final String a() {
        return this.f10282a.a();
    }

    @Override // com.alipay.android.phone.mrpc.core.g
    public final ab b() {
        Context context;
        context = this.f10283b.f10281a;
        return l.a(context.getApplicationContext());
    }

    @Override // com.alipay.android.phone.mrpc.core.g
    public final aa c() {
        return this.f10282a;
    }

    @Override // com.alipay.android.phone.mrpc.core.g
    public final boolean d() {
        return this.f10282a.c();
    }
}
