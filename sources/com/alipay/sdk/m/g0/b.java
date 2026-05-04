package com.alipay.sdk.m.g0;

import android.content.Context;
import com.alipay.sdk.m.f0.c;
import com.alipay.sdk.m.f0.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class b implements a {

    /* renamed from: a, reason: collision with root package name */
    public static a f10562a;

    /* renamed from: b, reason: collision with root package name */
    public static com.alipay.sdk.m.d0.a f10563b;

    @Override // com.alipay.sdk.m.g0.a
    public c a(d dVar) {
        return com.alipay.sdk.m.f0.b.a(f10563b.a(com.alipay.sdk.m.f0.b.a(dVar)));
    }

    @Override // com.alipay.sdk.m.g0.a
    public boolean logCollect(String str) {
        return f10563b.logCollect(str);
    }

    public static a a(Context context, String str) {
        if (context == null) {
            return null;
        }
        if (f10562a == null) {
            f10563b = com.alipay.sdk.m.d0.d.a(context, str);
            f10562a = new b();
        }
        return f10562a;
    }
}
