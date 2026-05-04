package com.alipay.android.phone.mrpc.core;

import java.lang.reflect.Proxy;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public g f10336a;

    /* renamed from: b, reason: collision with root package name */
    public z f10337b = new z(this);

    public x(g gVar) {
        this.f10336a = gVar;
    }

    public final g a() {
        return this.f10336a;
    }

    public final <T> T a(Class<T> cls) {
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new y(this.f10336a, cls, this.f10337b));
    }
}
