package com.meizu.cloud.pushsdk.b.b;

import java.util.HashMap;

/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final HashMap<String, Class<?>> f39368a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private Class<?> f39369b;

    /* renamed from: c, reason: collision with root package name */
    private String f39370c;

    /* renamed from: d, reason: collision with root package name */
    private Object f39371d;

    private a(Object obj) {
        this.f39371d = obj;
    }

    public static a a(Object obj) {
        return new a(obj);
    }

    private a(String str) {
        this.f39370c = str;
    }

    public static a a(String str) {
        return new a(str);
    }

    public b a(Class<?>... clsArr) {
        return new b(this, clsArr);
    }

    public c a(String str, Class<?>... clsArr) {
        return new c(this, str, clsArr);
    }

    public Class<?> a() throws ClassNotFoundException {
        Class<?> cls = this.f39369b;
        if (cls != null) {
            return cls;
        }
        Object obj = this.f39371d;
        if (obj != null) {
            return obj.getClass();
        }
        HashMap<String, Class<?>> hashMap = f39368a;
        Class<?> cls2 = hashMap.get(this.f39370c);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(this.f39370c);
        hashMap.put(this.f39370c, cls3);
        return cls3;
    }
}
