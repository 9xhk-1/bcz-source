package com.alipay.sdk.m.c;

import android.content.Context;
import com.alipay.sdk.m.r0.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class c implements com.alipay.sdk.m.b.b {

    /* renamed from: d, reason: collision with root package name */
    public static final int f10492d = 1;

    /* renamed from: a, reason: collision with root package name */
    public com.alipay.sdk.m.r0.b f10493a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f10494b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f10495c = false;

    @Override // com.alipay.sdk.m.b.b
    public String a(Context context) {
        if (context == null) {
            return null;
        }
        if (!this.f10494b) {
            com.alipay.sdk.m.r0.b bVar = new com.alipay.sdk.m.r0.b();
            this.f10493a = bVar;
            this.f10495c = bVar.a(context, (b.InterfaceC0174b<String>) null) == 1;
            this.f10494b = true;
        }
        com.alipay.sdk.m.d.a.b("getOAID", "isSupported", Boolean.valueOf(this.f10495c));
        if (this.f10495c && this.f10493a.e()) {
            return this.f10493a.b();
        }
        return null;
    }
}
