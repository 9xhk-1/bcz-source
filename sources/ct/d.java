package ct;

import com.nineoldandroids.util.NoSuchPropertyException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class d<T, V> extends c<T, V> {

    /* renamed from: f, reason: collision with root package name */
    public static final String f46852f = "get";

    /* renamed from: g, reason: collision with root package name */
    public static final String f46853g = "is";

    /* renamed from: h, reason: collision with root package name */
    public static final String f46854h = "set";

    /* renamed from: c, reason: collision with root package name */
    public Method f46855c;

    /* renamed from: d, reason: collision with root package name */
    public Method f46856d;

    /* renamed from: e, reason: collision with root package name */
    public Field f46857e;

    public d(Class<T> cls, Class<V> cls2, String str) {
        super(cls2, str);
        char upperCase = Character.toUpperCase(str.charAt(0));
        String str2 = String.valueOf(upperCase) + str.substring(1);
        String str3 = f46852f + str2;
        try {
            try {
                this.f46856d = cls.getMethod(str3, null);
            } catch (NoSuchMethodException unused) {
                String str4 = "is" + str2;
                try {
                    try {
                        try {
                            this.f46856d = cls.getMethod(str4, null);
                        } catch (NoSuchMethodException unused2) {
                            Field field = cls.getField(str);
                            this.f46857e = field;
                            Class<?> type = field.getType();
                            if (g(cls2, type)) {
                                return;
                            }
                            throw new NoSuchPropertyException("Underlying type (" + type + ") does not match Property type (" + cls2 + j.f81007d);
                        }
                    } catch (NoSuchFieldException unused3) {
                        throw new NoSuchPropertyException("No accessor method or field found for property with name " + str);
                    }
                } catch (NoSuchMethodException unused4) {
                    Method declaredMethod = cls.getDeclaredMethod(str4, null);
                    this.f46856d = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
            }
        } catch (NoSuchMethodException unused5) {
            Method declaredMethod2 = cls.getDeclaredMethod(str3, null);
            this.f46856d = declaredMethod2;
            declaredMethod2.setAccessible(true);
        }
        Class<?> returnType = this.f46856d.getReturnType();
        if (g(cls2, returnType)) {
            try {
                Method declaredMethod3 = cls.getDeclaredMethod(f46854h + str2, returnType);
                this.f46855c = declaredMethod3;
                declaredMethod3.setAccessible(true);
                return;
            } catch (NoSuchMethodException unused6) {
                return;
            }
        }
        throw new NoSuchPropertyException("Underlying type (" + returnType + ") does not match Property type (" + cls2 + j.f81007d);
    }

    @Override // ct.c
    public V a(T t11) {
        Method method = this.f46856d;
        if (method != null) {
            try {
                return (V) method.invoke(t11, null);
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            } catch (InvocationTargetException e11) {
                throw new RuntimeException(e11.getCause());
            }
        }
        Field field = this.f46857e;
        if (field == null) {
            throw new AssertionError();
        }
        try {
            return (V) field.get(t11);
        } catch (IllegalAccessException unused2) {
            throw new AssertionError();
        }
    }

    @Override // ct.c
    public boolean d() {
        return this.f46855c == null && this.f46857e == null;
    }

    @Override // ct.c
    public void f(T t11, V v11) {
        Method method = this.f46855c;
        if (method != null) {
            try {
                method.invoke(t11, v11);
                return;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            } catch (InvocationTargetException e11) {
                throw new RuntimeException(e11.getCause());
            }
        }
        Field field = this.f46857e;
        if (field != null) {
            try {
                field.set(t11, v11);
            } catch (IllegalAccessException unused2) {
                throw new AssertionError();
            }
        } else {
            throw new UnsupportedOperationException("Property " + b() + " is read-only");
        }
    }

    public final boolean g(Class<V> cls, Class cls2) {
        if (cls2 != cls) {
            return cls2.isPrimitive() && ((cls2 == Float.TYPE && cls == Float.class) || ((cls2 == Integer.TYPE && cls == Integer.class) || ((cls2 == Boolean.TYPE && cls == Boolean.class) || ((cls2 == Long.TYPE && cls == Long.class) || ((cls2 == Double.TYPE && cls == Double.class) || ((cls2 == Short.TYPE && cls == Short.class) || ((cls2 == Byte.TYPE && cls == Byte.class) || (cls2 == Character.TYPE && cls == Character.class))))))));
        }
        return true;
    }
}
