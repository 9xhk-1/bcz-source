package ku;

import com.typesafe.config.ConfigException;
import com.typesafe.config.ConfigValueType;
import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class g {
    public static <T> T a(ju.a aVar, Class<T> cls) {
        if (((t1) aVar).root().N0() != b1.RESOLVED) {
            throw new ConfigException.NotResolved("need to Config#resolve() a config before using it to initialize a bean, see the API docs for Config#resolve()");
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        for (Map.Entry<String, ju.t> entry : aVar.root().entrySet()) {
            String key = entry.getKey();
            String m11 = q.m(key);
            if (!hashMap2.containsKey(m11) || key.equals(m11)) {
                hashMap.put(m11, (d) entry.getValue());
                hashMap2.put(m11, key);
            }
        }
        try {
            BeanInfo beanInfo = Introspector.getBeanInfo(cls);
            try {
                ArrayList<PropertyDescriptor> arrayList = new ArrayList();
                for (PropertyDescriptor propertyDescriptor : beanInfo.getPropertyDescriptors()) {
                    if (propertyDescriptor.getReadMethod() != null && propertyDescriptor.getWriteMethod() != null) {
                        arrayList.add(propertyDescriptor);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (PropertyDescriptor propertyDescriptor2 : arrayList) {
                    ConfigValueType f11 = f(propertyDescriptor2.getWriteMethod().getParameterTypes()[0]);
                    if (f11 != null) {
                        String str = (String) hashMap2.get(propertyDescriptor2.getName());
                        if (str == null) {
                            str = propertyDescriptor2.getName();
                        }
                        s0 f12 = s0.f(str);
                        d dVar = (d) hashMap.get(propertyDescriptor2.getName());
                        if (dVar != null) {
                            t1.p0(f12, f11, dVar, arrayList2);
                        } else if (!h(cls, propertyDescriptor2)) {
                            t1.q(arrayList2, f11, f12, aVar.g());
                        }
                    }
                }
                if (!arrayList2.isEmpty()) {
                    throw new ConfigException.ValidationFailed(arrayList2);
                }
                T newInstance = cls.getDeclaredConstructor(null).newInstance(null);
                for (PropertyDescriptor propertyDescriptor3 : arrayList) {
                    Method writeMethod = propertyDescriptor3.getWriteMethod();
                    Type type = writeMethod.getGenericParameterTypes()[0];
                    Class<?> cls2 = writeMethod.getParameterTypes()[0];
                    String str2 = (String) hashMap2.get(propertyDescriptor3.getName());
                    if (str2 != null) {
                        writeMethod.invoke(newInstance, e(cls, type, cls2, aVar, str2));
                    } else if (!h(cls, propertyDescriptor3)) {
                        throw new ConfigException.Missing(propertyDescriptor3.getName());
                    }
                }
                return newInstance;
            } catch (IllegalAccessException e11) {
                throw new ConfigException.BadBean(cls.getName() + " getters and setters are not accessible, they must be for use as a bean", e11);
            } catch (InstantiationException e12) {
                throw new ConfigException.BadBean(cls.getName() + " needs to be instantiable to be used as a bean", e12);
            } catch (NoSuchMethodException e13) {
                throw new ConfigException.BadBean(cls.getName() + " needs a public no-args constructor to be used as a bean", e13);
            } catch (InvocationTargetException e14) {
                throw new ConfigException.BadBean("Calling bean method on " + cls.getName() + " caused an exception", e14);
            }
        } catch (IntrospectionException e15) {
            throw new ConfigException.BadBean("Could not get bean information for class " + cls.getName(), e15);
        }
    }

    public static Field b(Class cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (NoSuchFieldException unused) {
            Class superclass = cls.getSuperclass();
            if (superclass == null) {
                return null;
            }
            return b(superclass, str);
        }
    }

    public static Object c(Class<?> cls, Type type, Class<?> cls2, ju.a aVar, String str) {
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 == Boolean.class) {
            return aVar.J(str);
        }
        if (type2 == Integer.class) {
            return aVar.R(str);
        }
        if (type2 == Double.class) {
            return aVar.n(str);
        }
        if (type2 == Long.class) {
            return aVar.K(str);
        }
        if (type2 == String.class) {
            return aVar.s(str);
        }
        if (type2 == f.a()) {
            return aVar.D(str);
        }
        if (type2 == ju.j.class) {
            return aVar.u(str);
        }
        if (type2 == Object.class) {
            return aVar.r(str);
        }
        if (type2 == ju.a.class) {
            return aVar.y(str);
        }
        if (type2 == ju.l.class) {
            return aVar.b0(str);
        }
        if (type2 == ju.t.class) {
            return aVar.w(str);
        }
        Class cls3 = (Class) type2;
        if (cls3.isEnum()) {
            return aVar.L(cls3, str);
        }
        if (g(cls3)) {
            ArrayList arrayList = new ArrayList();
            Iterator<? extends ju.a> it = aVar.y(str).iterator();
            while (it.hasNext()) {
                arrayList.add(a(it.next(), cls3));
            }
            return arrayList;
        }
        throw new ConfigException.BadBean("Bean property '" + str + "' of class " + cls.getName() + " has unsupported list element type " + type2);
    }

    public static Object d(Class<?> cls, Type type, Class<?> cls2, ju.a aVar, String str) {
        return new HashSet((List) c(cls, type, cls2, aVar, str));
    }

    public static Object e(Class<?> cls, Type type, Class<?> cls2, ju.a aVar, String str) {
        if (cls2 == Boolean.class || cls2 == Boolean.TYPE) {
            return Boolean.valueOf(aVar.getBoolean(str));
        }
        if (cls2 == Integer.class || cls2 == Integer.TYPE) {
            return Integer.valueOf(aVar.getInt(str));
        }
        if (cls2 == Double.class || cls2 == Double.TYPE) {
            return Double.valueOf(aVar.getDouble(str));
        }
        if (cls2 == Long.class || cls2 == Long.TYPE) {
            return Long.valueOf(aVar.getLong(str));
        }
        if (cls2 == String.class) {
            return aVar.getString(str);
        }
        if (cls2 == f.a()) {
            return aVar.W(str);
        }
        if (cls2 == ju.j.class) {
            return aVar.t(str);
        }
        if (cls2 == Object.class) {
            return aVar.M(str);
        }
        if (cls2 == List.class) {
            return c(cls, type, cls2, aVar, str);
        }
        if (cls2 == Set.class) {
            return d(cls, type, cls2, aVar, str);
        }
        if (cls2 == Map.class) {
            Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
            if (actualTypeArguments[0] == String.class && actualTypeArguments[1] == Object.class) {
                return aVar.getObject(str).c();
            }
            throw new ConfigException.BadBean("Bean property '" + str + "' of class " + cls.getName() + " has unsupported Map<" + actualTypeArguments[0] + "," + actualTypeArguments[1] + ">, only Map<String,Object> is supported right now");
        }
        if (cls2 == ju.a.class) {
            return aVar.O(str);
        }
        if (cls2 == ju.l.class) {
            return aVar.getObject(str);
        }
        if (cls2 == ju.t.class) {
            return aVar.getValue(str);
        }
        if (cls2 == ju.h.class) {
            return aVar.w(str);
        }
        if (cls2.isEnum()) {
            return aVar.v(cls2, str);
        }
        if (g(cls2)) {
            return a(aVar.O(str), cls2);
        }
        throw new ConfigException.BadBean("Bean property " + str + " of class " + cls.getName() + " has unsupported type " + type);
    }

    public static ConfigValueType f(Class<?> cls) {
        if (cls == Boolean.class || cls == Boolean.TYPE) {
            return ConfigValueType.BOOLEAN;
        }
        if (cls == Integer.class || cls == Integer.TYPE) {
            return ConfigValueType.NUMBER;
        }
        if (cls == Double.class || cls == Double.TYPE) {
            return ConfigValueType.NUMBER;
        }
        if (cls == Long.class || cls == Long.TYPE) {
            return ConfigValueType.NUMBER;
        }
        if (cls == String.class) {
            return ConfigValueType.STRING;
        }
        if (cls == f.a() || cls == ju.j.class) {
            return null;
        }
        if (cls == List.class) {
            return ConfigValueType.LIST;
        }
        if (cls == Map.class) {
            return ConfigValueType.OBJECT;
        }
        if (cls == ju.a.class) {
            return ConfigValueType.OBJECT;
        }
        if (cls == ju.l.class) {
            return ConfigValueType.OBJECT;
        }
        if (cls == ju.h.class) {
            return ConfigValueType.LIST;
        }
        return null;
    }

    public static boolean g(Class<?> cls) {
        try {
            for (PropertyDescriptor propertyDescriptor : Introspector.getBeanInfo(cls).getPropertyDescriptors()) {
                if (propertyDescriptor.getReadMethod() != null && propertyDescriptor.getWriteMethod() != null) {
                    return true;
                }
            }
        } catch (IntrospectionException unused) {
        }
        return false;
    }

    public static boolean h(Class cls, PropertyDescriptor propertyDescriptor) {
        Field b11 = b(cls, propertyDescriptor.getName());
        return b11 != null ? ((ju.x[]) b11.getAnnotationsByType(ju.x.class)).length > 0 : ((ju.x[]) propertyDescriptor.getReadMethod().getAnnotationsByType(ju.x.class)).length > 0;
    }
}
