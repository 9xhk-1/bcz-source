package com.meizu.cloud.pushsdk.c.a;

import com.meizu.cloud.pushsdk.c.c.k;

/* loaded from: classes7.dex */
public class c<T> {

    /* renamed from: a, reason: collision with root package name */
    private final T f39512a;

    /* renamed from: b, reason: collision with root package name */
    private final com.meizu.cloud.pushsdk.c.b.a f39513b;

    /* renamed from: c, reason: collision with root package name */
    private k f39514c;

    public c(com.meizu.cloud.pushsdk.c.b.a aVar) {
        this.f39512a = null;
        this.f39513b = aVar;
    }

    public static <T> c<T> a(com.meizu.cloud.pushsdk.c.b.a aVar) {
        return new c<>(aVar);
    }

    public boolean b() {
        return this.f39513b == null;
    }

    public com.meizu.cloud.pushsdk.c.b.a c() {
        return this.f39513b;
    }

    public c(T t11) {
        this.f39512a = t11;
        this.f39513b = null;
    }

    public static <T> c<T> a(T t11) {
        return new c<>(t11);
    }

    public T a() {
        return this.f39512a;
    }

    public void a(k kVar) {
        this.f39514c = kVar;
    }
}
