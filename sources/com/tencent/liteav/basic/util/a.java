package com.tencent.liteav.basic.util;

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class a<T> {

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0512a<T> f43422b;

    /* renamed from: a, reason: collision with root package name */
    private final ThreadLocal<T> f43421a = new ThreadLocal<>();

    /* renamed from: c, reason: collision with root package name */
    private WeakReference<T> f43423c = new WeakReference<>(null);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.tencent.liteav.basic.util.a$a, reason: collision with other inner class name */
    public interface InterfaceC0512a<T> {
        T a();
    }

    public a(InterfaceC0512a<T> interfaceC0512a) {
        this.f43422b = interfaceC0512a;
    }

    private T b() {
        T t11;
        T t12 = this.f43423c.get();
        if (t12 != null) {
            return t12;
        }
        synchronized (this) {
            try {
                t11 = this.f43423c.get();
                if (t11 == null) {
                    t11 = this.f43422b.a();
                    this.f43423c = new WeakReference<>(t11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t11;
    }

    public T a() {
        T t11 = this.f43421a.get();
        if (t11 != null) {
            return t11;
        }
        T b11 = b();
        this.f43421a.set(b11);
        return b11;
    }
}
