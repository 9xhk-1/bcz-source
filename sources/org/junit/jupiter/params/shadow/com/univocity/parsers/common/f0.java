package org.junit.jupiter.params.shadow.com.univocity.parsers.common;

import java.lang.ref.SoftReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class f0<T> {

    /* renamed from: d, reason: collision with root package name */
    public static final int f78106d = 16384;

    /* renamed from: e, reason: collision with root package name */
    public static final int f78107e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Map<String, SoftReference<T>> f78108a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public int f78109b = 16384;

    /* renamed from: c, reason: collision with root package name */
    public int f78110c = 0;

    public void a() {
        this.f78108a.clear();
    }

    public boolean b(String str) {
        return this.f78108a.containsKey(str);
    }

    public T c(String str) {
        if (str == null) {
            return null;
        }
        if (this.f78110c > 0 && str.length() > this.f78110c) {
            return null;
        }
        SoftReference<T> softReference = this.f78108a.get(str);
        if (softReference != null && softReference.get() != null) {
            return softReference.get();
        }
        T f11 = f(str);
        this.f78108a.put(str, new SoftReference<>(f11));
        return f11;
    }

    public int d() {
        return this.f78110c;
    }

    public int e() {
        return this.f78109b;
    }

    public abstract T f(String str);

    public void g(String str, T t11) {
        if (str == null || str.length() > this.f78110c) {
            return;
        }
        if (this.f78108a.size() >= this.f78109b) {
            this.f78108a.clear();
        }
        this.f78108a.put(str, new SoftReference<>(t11));
    }

    public void h(int i11) {
        this.f78110c = i11;
    }

    public void i(int i11) {
        if (i11 <= 0) {
            i11 = 16384;
        }
        this.f78109b = i11;
    }
}
