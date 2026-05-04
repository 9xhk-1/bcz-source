package com.xiaomi.push;

import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.j2;

/* loaded from: classes8.dex */
public class bj {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<Class<?>, Class<?>> f45310a;

    public static class a<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Class<? extends T> f45311a;

        /* renamed from: a, reason: collision with other field name */
        public final T f174a;
    }

    static {
        HashMap hashMap = new HashMap();
        f45310a = hashMap;
        Class cls = Boolean.TYPE;
        hashMap.put(Boolean.class, cls);
        Class cls2 = Byte.TYPE;
        hashMap.put(Byte.class, cls2);
        Class cls3 = Character.TYPE;
        hashMap.put(Character.class, cls3);
        Class cls4 = Short.TYPE;
        hashMap.put(Short.class, cls4);
        Class cls5 = Integer.TYPE;
        hashMap.put(Integer.class, cls5);
        Class cls6 = Float.TYPE;
        hashMap.put(Float.class, cls6);
        Class cls7 = Long.TYPE;
        hashMap.put(Long.class, cls7);
        Class cls8 = Double.TYPE;
        hashMap.put(Double.class, cls8);
        hashMap.put(cls, cls);
        hashMap.put(cls2, cls2);
        hashMap.put(cls3, cls3);
        hashMap.put(cls4, cls4);
        hashMap.put(cls5, cls5);
        hashMap.put(cls6, cls6);
        hashMap.put(cls7, cls7);
        hashMap.put(cls8, cls8);
    }

    public static <T> T a(Class<? extends Object> cls, Object obj, String str) {
        Field field = null;
        while (field == null) {
            try {
                field = cls.getDeclaredField(str);
                field.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
            }
            if (cls == null) {
                throw new NoSuchFieldException();
            }
        }
        field.setAccessible(true);
        return (T) field.get(obj);
    }

    public static <T> T b(Object obj, String str, Object... objArr) {
        return (T) a(obj.getClass(), str, a(objArr)).invoke(obj, m5751a(objArr));
    }

    public static <T> T a(Class<? extends Object> cls, String str) {
        try {
            return (T) a(cls, (Object) null, str);
        } catch (Exception e11) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Meet exception when call getStaticField '");
            sb2.append(str);
            sb2.append("' in ");
            sb2.append(cls != null ? cls.getSimpleName() : "");
            sb2.append(j2.O);
            sb2.append(e11);
            Log.w("JavaCalls", sb2.toString());
            return null;
        }
    }

    public static void b(Object obj, String str, Object obj2) {
        Class<?> cls = obj.getClass();
        Field field = null;
        while (field == null) {
            try {
                field = cls.getDeclaredField(str);
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
            }
            if (cls == null) {
                throw new NoSuchFieldException();
            }
        }
        field.setAccessible(true);
        field.set(obj, obj2);
    }

    public static <T> T a(Class<?> cls, String str, Object... objArr) {
        return (T) a(cls, str, a(objArr)).invoke(null, m5751a(objArr));
    }

    public static <T> T a(Object obj, String str) {
        try {
            return (T) a((Class<? extends Object>) obj.getClass(), obj, str);
        } catch (Exception e11) {
            Log.w("JavaCalls", "Meet exception when call getField '" + str + "' in " + obj + j2.O + e11);
            return null;
        }
    }

    public static <T> T a(Object obj, String str, Object... objArr) {
        try {
            return (T) b(obj, str, objArr);
        } catch (Exception e11) {
            Log.w("JavaCalls", "Meet exception when call Method '" + str + "' in " + obj + j2.O + e11);
            return null;
        }
    }

    public static <T> T a(String str, String str2) {
        try {
            return (T) a((Class<? extends Object>) s.a(null, str), (Object) null, str2);
        } catch (Exception e11) {
            Log.w("JavaCalls", "Meet exception when call getStaticField '" + str2 + "' in " + str + j2.O + e11);
            return null;
        }
    }

    public static <T> T a(String str, String str2, Object... objArr) {
        try {
            return (T) a(s.a(null, str), str2, objArr);
        } catch (Exception e11) {
            Log.w("JavaCalls", "Meet exception when call Method '" + str2 + "' in " + str + j2.O + e11);
            return null;
        }
    }

    private static Method a(Class<?> cls, String str, Class<?>... clsArr) {
        Method a11 = a(cls.getDeclaredMethods(), str, clsArr);
        if (a11 != null) {
            a11.setAccessible(true);
            return a11;
        }
        if (cls.getSuperclass() != null) {
            return a((Class<?>) cls.getSuperclass(), str, clsArr);
        }
        throw new NoSuchMethodException();
    }

    private static Method a(Method[] methodArr, String str, Class<?>[] clsArr) {
        if (str == null) {
            throw new NullPointerException("Method name must not be null.");
        }
        for (Method method : methodArr) {
            if (method.getName().equals(str) && a(method.getParameterTypes(), clsArr)) {
                return method;
            }
        }
        return null;
    }

    public static void a(Object obj, String str, Object obj2) {
        try {
            b(obj, str, obj2);
        } catch (Exception e11) {
            Log.w("JavaCalls", "Meet exception when call setField '" + str + "' in " + obj + j2.O + e11);
        }
    }

    private static boolean a(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (clsArr == null) {
            return clsArr2 == null || clsArr2.length == 0;
        }
        if (clsArr2 == null) {
            return clsArr.length == 0;
        }
        if (clsArr.length != clsArr2.length) {
            return false;
        }
        for (int i11 = 0; i11 < clsArr.length; i11++) {
            Class<?> cls = clsArr2[i11];
            if (cls != null && !clsArr[i11].isAssignableFrom(cls)) {
                Map<Class<?>, Class<?>> map = f45310a;
                if (!map.containsKey(clsArr[i11]) || !map.get(clsArr[i11]).equals(map.get(clsArr2[i11]))) {
                    return false;
                }
            }
        }
        return true;
    }

    private static Class<?>[] a(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i11 = 0; i11 < objArr.length; i11++) {
            Object obj = objArr[i11];
            if (obj == null || !(obj instanceof a)) {
                clsArr[i11] = obj == null ? null : obj.getClass();
            } else {
                clsArr[i11] = ((a) obj).f45311a;
            }
        }
        return clsArr;
    }

    /* renamed from: a, reason: collision with other method in class */
    private static Object[] m5751a(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        Object[] objArr2 = new Object[objArr.length];
        for (int i11 = 0; i11 < objArr.length; i11++) {
            Object obj = objArr[i11];
            if (obj == null || !(obj instanceof a)) {
                objArr2[i11] = obj;
            } else {
                objArr2[i11] = ((a) obj).f174a;
            }
        }
        return objArr2;
    }
}
