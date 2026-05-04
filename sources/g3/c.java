package g3;

import com.badlogic.gdx.utils.reflect.ReflectionException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class c {
    public static boolean A(Class cls, Object obj) {
        return cls.isInstance(obj);
    }

    public static boolean B(Class cls) {
        return cls.isInterface();
    }

    public static boolean C(Class cls) {
        return cls.isMemberClass();
    }

    public static boolean D(Class cls) {
        return cls.isPrimitive();
    }

    public static boolean E(Class cls) {
        return Modifier.isStatic(cls.getModifiers());
    }

    public static <T> T F(Class<T> cls) throws ReflectionException {
        try {
            return cls.newInstance();
        } catch (IllegalAccessException e11) {
            throw new ReflectionException("Could not instantiate instance of class: " + cls.getName(), e11);
        } catch (InstantiationException e12) {
            throw new ReflectionException("Could not instantiate instance of class: " + cls.getName(), e12);
        }
    }

    public static Class a(String str) throws ReflectionException {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e11) {
            throw new ReflectionException("Class not found: " + str, e11);
        }
    }

    public static a b(Class cls, Class<? extends Annotation> cls2) {
        Annotation annotation = cls.getAnnotation(cls2);
        if (annotation != null) {
            return new a(annotation);
        }
        return null;
    }

    public static a[] c(Class cls) {
        Annotation[] annotations = cls.getAnnotations();
        a[] aVarArr = new a[annotations.length];
        for (int i11 = 0; i11 < annotations.length; i11++) {
            aVarArr[i11] = new a(annotations[i11]);
        }
        return aVarArr;
    }

    public static Class d(Class cls) {
        return cls.getComponentType();
    }

    public static d e(Class cls, Class... clsArr) throws ReflectionException {
        try {
            return new d(cls.getConstructor(clsArr));
        } catch (NoSuchMethodException e11) {
            throw new ReflectionException("Constructor not found for class: " + cls.getName(), e11);
        } catch (SecurityException e12) {
            throw new ReflectionException("Security violation occurred while getting constructor for class: '" + cls.getName() + "'.", e12);
        }
    }

    public static d[] f(Class cls) {
        Constructor<?>[] constructors = cls.getConstructors();
        d[] dVarArr = new d[constructors.length];
        int length = constructors.length;
        for (int i11 = 0; i11 < length; i11++) {
            dVarArr[i11] = new d(constructors[i11]);
        }
        return dVarArr;
    }

    public static a g(Class cls, Class<? extends Annotation> cls2) {
        for (Annotation annotation : cls.getDeclaredAnnotations()) {
            if (annotation.annotationType().equals(cls2)) {
                return new a(annotation);
            }
        }
        return null;
    }

    public static a[] h(Class cls) {
        Annotation[] declaredAnnotations = cls.getDeclaredAnnotations();
        a[] aVarArr = new a[declaredAnnotations.length];
        for (int i11 = 0; i11 < declaredAnnotations.length; i11++) {
            aVarArr[i11] = new a(declaredAnnotations[i11]);
        }
        return aVarArr;
    }

    public static d i(Class cls, Class... clsArr) throws ReflectionException {
        try {
            return new d(cls.getDeclaredConstructor(clsArr));
        } catch (NoSuchMethodException e11) {
            throw new ReflectionException("Constructor not found for class: " + cls.getName(), e11);
        } catch (SecurityException e12) {
            throw new ReflectionException("Security violation while getting constructor for class: " + cls.getName(), e12);
        }
    }

    public static e j(Class cls, String str) throws ReflectionException {
        try {
            return new e(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e11) {
            throw new ReflectionException("Field not found: " + str + ", for class: " + cls.getName(), e11);
        } catch (SecurityException e12) {
            throw new ReflectionException("Security violation while getting field: " + str + ", for class: " + cls.getName(), e12);
        }
    }

    public static e[] k(Class cls) {
        Field[] declaredFields = cls.getDeclaredFields();
        e[] eVarArr = new e[declaredFields.length];
        int length = declaredFields.length;
        for (int i11 = 0; i11 < length; i11++) {
            eVarArr[i11] = new e(declaredFields[i11]);
        }
        return eVarArr;
    }

    public static f l(Class cls, String str, Class... clsArr) throws ReflectionException {
        try {
            return new f(cls.getDeclaredMethod(str, clsArr));
        } catch (NoSuchMethodException e11) {
            throw new ReflectionException("Method not found: " + str + ", for class: " + cls.getName(), e11);
        } catch (SecurityException e12) {
            throw new ReflectionException("Security violation while getting method: " + str + ", for class: " + cls.getName(), e12);
        }
    }

    public static f[] m(Class cls) {
        Method[] declaredMethods = cls.getDeclaredMethods();
        f[] fVarArr = new f[declaredMethods.length];
        int length = declaredMethods.length;
        for (int i11 = 0; i11 < length; i11++) {
            fVarArr[i11] = new f(declaredMethods[i11]);
        }
        return fVarArr;
    }

    public static Object[] n(Class cls) {
        return cls.getEnumConstants();
    }

    public static e o(Class cls, String str) throws ReflectionException {
        try {
            return new e(cls.getField(str));
        } catch (NoSuchFieldException e11) {
            throw new ReflectionException("Field not found: " + str + ", for class: " + cls.getName(), e11);
        } catch (SecurityException e12) {
            throw new ReflectionException("Security violation while getting field: " + str + ", for class: " + cls.getName(), e12);
        }
    }

    public static e[] p(Class cls) {
        Field[] fields = cls.getFields();
        e[] eVarArr = new e[fields.length];
        int length = fields.length;
        for (int i11 = 0; i11 < length; i11++) {
            eVarArr[i11] = new e(fields[i11]);
        }
        return eVarArr;
    }

    public static Class[] q(Class cls) {
        return cls.getInterfaces();
    }

    public static f r(Class cls, String str, Class... clsArr) throws ReflectionException {
        try {
            return new f(cls.getMethod(str, clsArr));
        } catch (NoSuchMethodException e11) {
            throw new ReflectionException("Method not found: " + str + ", for class: " + cls.getName(), e11);
        } catch (SecurityException e12) {
            throw new ReflectionException("Security violation while getting method: " + str + ", for class: " + cls.getName(), e12);
        }
    }

    public static f[] s(Class cls) {
        Method[] methods = cls.getMethods();
        f[] fVarArr = new f[methods.length];
        int length = methods.length;
        for (int i11 = 0; i11 < length; i11++) {
            fVarArr[i11] = new f(methods[i11]);
        }
        return fVarArr;
    }

    public static String t(Class cls) {
        return cls.getSimpleName();
    }

    public static boolean u(Class cls) {
        return Modifier.isAbstract(cls.getModifiers());
    }

    public static boolean v(Class cls) {
        return cls.isAnnotation();
    }

    public static boolean w(Class cls, Class<? extends Annotation> cls2) {
        return cls.isAnnotationPresent(cls2);
    }

    public static boolean x(Class cls) {
        return cls.isArray();
    }

    public static boolean y(Class cls, Class cls2) {
        return cls.isAssignableFrom(cls2);
    }

    public static boolean z(Class cls) {
        return cls.isEnum();
    }
}
