package i90;

import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final b[] f60436a = new b[0];

    /* renamed from: b, reason: collision with root package name */
    public static final Class<?> f60437b = a();

    /* renamed from: c, reason: collision with root package name */
    public static final Method f60438c;

    /* renamed from: d, reason: collision with root package name */
    public static final Method f60439d;

    /* renamed from: e, reason: collision with root package name */
    public static Method f60440e;

    /* renamed from: f, reason: collision with root package name */
    public static Method f60441f;

    /* renamed from: g, reason: collision with root package name */
    public static Method f60442g;

    /* renamed from: h, reason: collision with root package name */
    public static final Map<Class<?>, WeakReference<b[]>> f60443h;

    static {
        Method b11 = b();
        f60438c = b11;
        Method c11 = c("getPropertyDescriptors", b11, false);
        f60439d = c11;
        f60440e = c("getWriteMethod", c11, true);
        f60441f = c("getReadMethod", c11, true);
        f60442g = c("getName", c11, true);
        f60443h = new ConcurrentHashMap();
    }

    public static Class<?> a() {
        try {
            try {
                return Class.forName("com.googlecode.openbeans.Introspector");
            } catch (Throwable unused) {
                return Class.forName("java.beans.Introspector");
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static Method b() {
        Class<?> cls = f60437b;
        if (cls == null) {
            return null;
        }
        try {
            return cls.getMethod("getBeanInfo", Class.class, Class.class);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Method c(String str, Method method, boolean z11) {
        if (method == null) {
            return null;
        }
        try {
            Class<?> returnType = method.getReturnType();
            if (z11) {
                returnType = returnType.getComponentType();
            }
            return returnType.getMethod(str, null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static b[] d(Class<?> cls) {
        Method method = f60439d;
        if (method == null) {
            return f60436a;
        }
        WeakReference<b[]> weakReference = f60443h.get(cls);
        b[] bVarArr = weakReference != null ? weakReference.get() : null;
        if (bVarArr == null) {
            try {
                Object[] objArr = (Object[]) method.invoke(f60438c.invoke(null, cls, Object.class), null);
                bVarArr = new b[objArr.length];
                for (int i11 = 0; i11 < objArr.length; i11++) {
                    bVarArr[i11] = new b(objArr[i11]);
                }
            } catch (Exception unused) {
                bVarArr = f60436a;
            }
            f60443h.put(cls, new WeakReference<>(bVarArr));
        }
        return bVarArr;
    }
}
