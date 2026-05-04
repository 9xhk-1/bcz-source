package com.meizu.cloud.pushsdk.b.b;

import com.meizu.cloud.pushinternal.DebugLogger;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes7.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static final HashMap<String, Method> f39378a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private final com.meizu.cloud.pushsdk.b.b.a f39379b;

    /* renamed from: c, reason: collision with root package name */
    private final String f39380c;

    /* renamed from: d, reason: collision with root package name */
    private Class<?>[] f39381d;

    public class a {
    }

    public c(com.meizu.cloud.pushsdk.b.b.a aVar, String str, Class<?>... clsArr) {
        this.f39379b = aVar;
        this.f39380c = str;
        this.f39381d = clsArr;
    }

    private String b() throws ClassNotFoundException {
        StringBuilder sb2 = new StringBuilder(this.f39379b.a().getName());
        sb2.append(this.f39380c);
        for (Class<?> cls : this.f39381d) {
            sb2.append(cls.getName());
        }
        return sb2.toString();
    }

    public <T> d<T> a(Object obj, Object... objArr) {
        d<T> dVar = new d<>();
        try {
            String b11 = b();
            Method method = f39378a.get(b11);
            if (method == null) {
                if (this.f39381d.length == objArr.length) {
                    method = this.f39379b.a().getMethod(this.f39380c, this.f39381d);
                } else {
                    if (objArr.length > 0) {
                        this.f39381d = new Class[objArr.length];
                        for (int i11 = 0; i11 < objArr.length; i11++) {
                            this.f39381d[i11] = objArr[i11].getClass();
                        }
                    }
                    method = a();
                }
                f39378a.put(b11, method);
            }
            method.setAccessible(true);
            dVar.f39383b = (T) method.invoke(obj, objArr);
            dVar.f39382a = true;
            return dVar;
        } catch (Exception e11) {
            DebugLogger.d("ReflectMethod", "invoke exception, " + e11.getMessage());
            return dVar;
        }
    }

    public <T> d<T> a(Object... objArr) {
        try {
            return a(this.f39379b.a(), objArr);
        } catch (ClassNotFoundException unused) {
            return new d<>();
        }
    }

    private Class<?> a(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        return cls.isPrimitive() ? Boolean.TYPE == cls ? Boolean.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : Byte.TYPE == cls ? Byte.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Character.TYPE == cls ? Character.class : Void.TYPE == cls ? Void.class : cls : cls;
    }

    private Method a() throws NoSuchMethodException, ClassNotFoundException {
        Class<?> a11 = this.f39379b.a();
        for (Method method : a11.getMethods()) {
            if (a(method, this.f39380c, this.f39381d)) {
                return method;
            }
        }
        for (Method method2 : a11.getDeclaredMethods()) {
            if (a(method2, this.f39380c, this.f39381d)) {
                return method2;
            }
        }
        throw new NoSuchMethodException("No similar method " + this.f39380c + " with params " + Arrays.toString(this.f39381d) + " could be found on type " + a11);
    }

    private boolean a(Method method, String str, Class<?>[] clsArr) {
        return method.getName().equals(str) && a(method.getParameterTypes(), clsArr);
    }

    private boolean a(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (clsArr.length != clsArr2.length) {
            return false;
        }
        for (int i11 = 0; i11 < clsArr2.length; i11++) {
            if (clsArr2[i11] != a.class && !a(clsArr[i11]).isAssignableFrom(a(clsArr2[i11]))) {
                return false;
            }
        }
        return true;
    }
}
