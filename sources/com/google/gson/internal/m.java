package com.google.gson.internal;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class m {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends m {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Method f35042a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f35043b;

        public a(Method method, Object obj) {
            this.f35042a = method;
            this.f35043b = obj;
        }

        @Override // com.google.gson.internal.m
        public <T> T e(Class<T> cls) throws Exception {
            m.b(cls);
            return (T) this.f35042a.invoke(this.f35043b, cls);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends m {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Method f35044a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f35045b;

        public b(Method method, int i11) {
            this.f35044a = method;
            this.f35045b = i11;
        }

        @Override // com.google.gson.internal.m
        public <T> T e(Class<T> cls) throws Exception {
            m.b(cls);
            return (T) this.f35044a.invoke(null, cls, Integer.valueOf(this.f35045b));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends m {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Method f35046a;

        public c(Method method) {
            this.f35046a = method;
        }

        @Override // com.google.gson.internal.m
        public <T> T e(Class<T> cls) throws Exception {
            m.b(cls);
            return (T) this.f35046a.invoke(null, cls, Object.class);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d extends m {
        @Override // com.google.gson.internal.m
        public <T> T e(Class<T> cls) {
            throw new UnsupportedOperationException("Cannot allocate " + cls + ". Usage of JDK sun.misc.Unsafe is enabled, but it could not be used. Make sure your runtime is configured correctly.");
        }
    }

    public static void b(Class<?> cls) {
        String c11 = c(cls);
        if (c11 == null) {
            return;
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: " + c11);
    }

    public static String c(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: " + cls.getName();
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName();
    }

    public static m d() {
        try {
            try {
                try {
                    Class<?> cls = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    return new a(cls.getMethod("allocateInstance", Class.class), declaredField.get(null));
                } catch (Exception unused) {
                    return new d();
                }
            } catch (Exception unused2) {
                Method declaredMethod = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                declaredMethod.setAccessible(true);
                return new c(declaredMethod);
            }
        } catch (Exception unused3) {
            Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
            declaredMethod2.setAccessible(true);
            int intValue = ((Integer) declaredMethod2.invoke(null, Object.class)).intValue();
            Method declaredMethod3 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
            declaredMethod3.setAccessible(true);
            return new b(declaredMethod3, intValue);
        }
    }

    public abstract <T> T e(Class<T> cls) throws Exception;
}
