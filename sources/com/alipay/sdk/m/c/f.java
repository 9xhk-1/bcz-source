package com.alipay.sdk.m.c;

import android.content.Context;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class f implements com.alipay.sdk.m.b.b {

    /* renamed from: a, reason: collision with root package name */
    public boolean f10497a = false;

    @Override // com.alipay.sdk.m.b.b
    public String a(Context context) {
        if (context == null) {
            return null;
        }
        if (!this.f10497a) {
            com.alipay.sdk.m.h0.a.e(context);
            this.f10497a = true;
        }
        boolean a11 = com.alipay.sdk.m.h0.a.a();
        com.alipay.sdk.m.d.a.b("getOAID", "isSupported", Boolean.valueOf(a11));
        if (a11) {
            return com.alipay.sdk.m.h0.a.b(context);
        }
        return null;
    }
}
