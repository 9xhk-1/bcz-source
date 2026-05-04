package com.alipay.sdk.m.c;

import android.content.Context;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class h implements com.alipay.sdk.m.b.b {
    @Override // com.alipay.sdk.m.b.b
    public String a(Context context) {
        if (context == null) {
            return null;
        }
        boolean c11 = com.alipay.sdk.m.p0.e.c(context);
        com.alipay.sdk.m.d.a.b("getOAID", "isSupported", Boolean.valueOf(c11));
        if (c11) {
            return com.alipay.sdk.m.p0.e.a(context);
        }
        return null;
    }
}
