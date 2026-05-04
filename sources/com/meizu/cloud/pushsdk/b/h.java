package com.meizu.cloud.pushsdk.b;

/* loaded from: classes7.dex */
public class h<T> {

    /* renamed from: a, reason: collision with root package name */
    private T f39416a;

    /* renamed from: b, reason: collision with root package name */
    private T f39417b;

    public h(T t11) {
        if (t11 == null) {
            throw new RuntimeException("proxy must be has a default implementation");
        }
        this.f39417b = t11;
    }

    public T c() {
        T t11 = this.f39416a;
        return t11 != null ? t11 : this.f39417b;
    }
}
