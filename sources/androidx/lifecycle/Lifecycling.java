package androidx.lifecycle;

import androidx.annotation.RestrictTo;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.g0;
import m80.k;
import u30.f0;
import w00.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes2.dex */
public final class Lifecycling {
    private static final int GENERATED_CALLBACK = 2;
    private static final int REFLECTIVE_CALLBACK = 1;

    @k
    public static final Lifecycling INSTANCE = new Lifecycling();

    @k
    private static final Map<Class<?>, Integer> callbackCache = new HashMap();

    @k
    private static final Map<Class<?>, List<Constructor<? extends GeneratedAdapter>>> classToAdapters = new HashMap();

    private Lifecycling() {
    }

    private final GeneratedAdapter createGeneratedAdapter(Constructor<? extends GeneratedAdapter> constructor, Object obj) {
        try {
            GeneratedAdapter newInstance = constructor.newInstance(obj);
            g0.o(newInstance, "{\n            constructo…tance(`object`)\n        }");
            return newInstance;
        } catch (IllegalAccessException e11) {
            throw new RuntimeException(e11);
        } catch (InstantiationException e12) {
            throw new RuntimeException(e12);
        } catch (InvocationTargetException e13) {
            throw new RuntimeException(e13);
        }
    }

    private final Constructor<? extends GeneratedAdapter> generatedConstructor(Class<?> cls) {
        try {
            Package r02 = cls.getPackage();
            String name = cls.getCanonicalName();
            String fullPackage = r02 != null ? r02.getName() : "";
            g0.o(fullPackage, "fullPackage");
            if (fullPackage.length() != 0) {
                g0.o(name, "name");
                name = name.substring(fullPackage.length() + 1);
                g0.o(name, "this as java.lang.String).substring(startIndex)");
            }
            g0.o(name, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
            String adapterName = getAdapterName(name);
            if (fullPackage.length() != 0) {
                adapterName = fullPackage + '.' + adapterName;
            }
            Class<?> cls2 = Class.forName(adapterName);
            g0.n(cls2, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            Constructor declaredConstructor = cls2.getDeclaredConstructor(cls);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e11) {
            throw new RuntimeException(e11);
        }
    }

    @o
    @k
    public static final String getAdapterName(@k String className) {
        g0.p(className, "className");
        return f0.z2(className, ".", "_", false, 4, null) + "_LifecycleAdapter";
    }

    private final int getObserverConstructorType(Class<?> cls) {
        Map<Class<?>, Integer> map = callbackCache;
        Integer num = map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int resolveObserverCallbackType = resolveObserverCallbackType(cls);
        map.put(cls, Integer.valueOf(resolveObserverCallbackType));
        return resolveObserverCallbackType;
    }

    private final boolean isLifecycleParent(Class<?> cls) {
        return cls != null && LifecycleObserver.class.isAssignableFrom(cls);
    }

    @o
    @k
    public static final LifecycleEventObserver lifecycleEventObserver(@k Object object) {
        g0.p(object, "object");
        boolean z11 = object instanceof LifecycleEventObserver;
        boolean z12 = object instanceof DefaultLifecycleObserver;
        if (z11 && z12) {
            return new DefaultLifecycleObserverAdapter((DefaultLifecycleObserver) object, (LifecycleEventObserver) object);
        }
        if (z12) {
            return new DefaultLifecycleObserverAdapter((DefaultLifecycleObserver) object, null);
        }
        if (z11) {
            return (LifecycleEventObserver) object;
        }
        Class<?> cls = object.getClass();
        Lifecycling lifecycling = INSTANCE;
        if (lifecycling.getObserverConstructorType(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(object);
        }
        List<Constructor<? extends GeneratedAdapter>> list = classToAdapters.get(cls);
        g0.m(list);
        List<Constructor<? extends GeneratedAdapter>> list2 = list;
        if (list2.size() == 1) {
            return new SingleGeneratedAdapterObserver(lifecycling.createGeneratedAdapter(list2.get(0), object));
        }
        int size = list2.size();
        GeneratedAdapter[] generatedAdapterArr = new GeneratedAdapter[size];
        for (int i11 = 0; i11 < size; i11++) {
            generatedAdapterArr[i11] = INSTANCE.createGeneratedAdapter(list2.get(i11), object);
        }
        return new CompositeGeneratedAdaptersObserver(generatedAdapterArr);
    }

    private final int resolveObserverCallbackType(Class<?> cls) {
        ArrayList arrayList;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends GeneratedAdapter> generatedConstructor = generatedConstructor(cls);
        if (generatedConstructor != null) {
            classToAdapters.put(cls, a00.g0.l(generatedConstructor));
            return 2;
        }
        if (ClassesInfoCache.sInstance.hasLifecycleMethods(cls)) {
            return 1;
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (isLifecycleParent(superclass)) {
            g0.o(superclass, "superclass");
            if (getObserverConstructorType(superclass) == 1) {
                return 1;
            }
            List<Constructor<? extends GeneratedAdapter>> list = classToAdapters.get(superclass);
            g0.m(list);
            arrayList = new ArrayList(list);
        } else {
            arrayList = null;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        g0.o(interfaces, "klass.interfaces");
        for (Class<?> intrface : interfaces) {
            if (isLifecycleParent(intrface)) {
                g0.o(intrface, "intrface");
                if (getObserverConstructorType(intrface) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                List<Constructor<? extends GeneratedAdapter>> list2 = classToAdapters.get(intrface);
                g0.m(list2);
                arrayList.addAll(list2);
            }
        }
        if (arrayList == null) {
            return 1;
        }
        classToAdapters.put(cls, arrayList);
        return 2;
    }
}
