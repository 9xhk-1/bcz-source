package com.alipay.android.phone.mrpc.core;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class y implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public g f10338a;

    /* renamed from: b, reason: collision with root package name */
    public Class<?> f10339b;

    /* renamed from: c, reason: collision with root package name */
    public z f10340c;

    public y(g gVar, Class<?> cls, z zVar) {
        this.f10338a = gVar;
        this.f10339b = cls;
        this.f10340c = zVar;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        return this.f10340c.a(method, objArr);
    }
}
