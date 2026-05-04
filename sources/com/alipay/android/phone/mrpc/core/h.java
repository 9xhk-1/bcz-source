package com.alipay.android.phone.mrpc.core;

import android.content.Context;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class h extends w {

    /* renamed from: a, reason: collision with root package name */
    public Context f10281a;

    public h(Context context) {
        this.f10281a = context;
    }

    @Override // com.alipay.android.phone.mrpc.core.w
    public final <T> T a(Class<T> cls, aa aaVar) {
        return (T) new x(new i(this, aaVar)).a(cls);
    }
}
