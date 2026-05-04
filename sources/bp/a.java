package bp;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class a<T> {
    private final int hashCode;
    private final Class<? super T> rawType;
    private final Type type;

    public a() {
        Type b11 = b();
        this.type = b11;
        this.rawType = (Class<? super T>) com.google.gson.internal.b.k(b11);
        this.hashCode = b11.hashCode();
    }

    public static AssertionError a(Type type, Class<?>... clsArr) {
        StringBuilder sb2 = new StringBuilder("Unexpected type. Expected one of: ");
        for (Class<?> cls : clsArr) {
            sb2.append(cls.getName());
            sb2.append(j2.O);
        }
        sb2.append("but got: ");
        sb2.append(type.getClass().getName());
        sb2.append(", for type token: ");
        sb2.append(type.toString());
        sb2.append('.');
        return new AssertionError(sb2.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r1v9 */
    public static boolean c(Type type, GenericArrayType genericArrayType) {
        Type genericComponentType = genericArrayType.getGenericComponentType();
        if (!(genericComponentType instanceof ParameterizedType)) {
            return true;
        }
        if (type instanceof GenericArrayType) {
            type = ((GenericArrayType) type).getGenericComponentType();
        } else if (type instanceof Class) {
            type = (Class) type;
            while (type.isArray()) {
                type = type.getComponentType();
            }
        }
        return d(type, (ParameterizedType) genericComponentType, new HashMap());
    }

    public static boolean d(Type type, ParameterizedType parameterizedType, Map<String, Type> map) {
        if (type == null) {
            return false;
        }
        if (parameterizedType.equals(type)) {
            return true;
        }
        Class<?> k11 = com.google.gson.internal.b.k(type);
        ParameterizedType parameterizedType2 = type instanceof ParameterizedType ? (ParameterizedType) type : null;
        if (parameterizedType2 != null) {
            Type[] actualTypeArguments = parameterizedType2.getActualTypeArguments();
            TypeVariable<Class<?>>[] typeParameters = k11.getTypeParameters();
            for (int i11 = 0; i11 < actualTypeArguments.length; i11++) {
                Type type2 = actualTypeArguments[i11];
                TypeVariable<Class<?>> typeVariable = typeParameters[i11];
                while (type2 instanceof TypeVariable) {
                    type2 = map.get(((TypeVariable) type2).getName());
                }
                map.put(typeVariable.getName(), type2);
            }
            if (f(parameterizedType2, parameterizedType, map)) {
                return true;
            }
        }
        for (Type type3 : k11.getGenericInterfaces()) {
            if (d(type3, parameterizedType, new HashMap(map))) {
                return true;
            }
        }
        return d(k11.getGenericSuperclass(), parameterizedType, new HashMap(map));
    }

    public static boolean e(Type type, Type type2, Map<String, Type> map) {
        if (type2.equals(type)) {
            return true;
        }
        return (type instanceof TypeVariable) && type2.equals(map.get(((TypeVariable) type).getName()));
    }

    public static boolean f(ParameterizedType parameterizedType, ParameterizedType parameterizedType2, Map<String, Type> map) {
        if (!parameterizedType.getRawType().equals(parameterizedType2.getRawType())) {
            return false;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        Type[] actualTypeArguments2 = parameterizedType2.getActualTypeArguments();
        for (int i11 = 0; i11 < actualTypeArguments.length; i11++) {
            if (!e(actualTypeArguments[i11], actualTypeArguments2[i11], map)) {
                return false;
            }
        }
        return true;
    }

    public static a<?> get(Type type) {
        return new a<>(type);
    }

    public static a<?> getArray(Type type) {
        return new a<>(com.google.gson.internal.b.a(type));
    }

    public static a<?> getParameterized(Type type, Type... typeArr) {
        return new a<>(com.google.gson.internal.b.n(null, type, typeArr));
    }

    public final Type b() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
            if (parameterizedType.getRawType() == a.class) {
                return com.google.gson.internal.b.b(parameterizedType.getActualTypeArguments()[0]);
            }
        } else if (genericSuperclass == a.class) {
            throw new IllegalStateException("TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved.");
        }
        throw new IllegalStateException("Must only create direct subclasses of TypeToken");
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && com.google.gson.internal.b.f(this.type, ((a) obj).type);
    }

    public final Class<? super T> getRawType() {
        return this.rawType;
    }

    public final Type getType() {
        return this.type;
    }

    public final int hashCode() {
        return this.hashCode;
    }

    @Deprecated
    public boolean isAssignableFrom(Class<?> cls) {
        return isAssignableFrom((Type) cls);
    }

    public final String toString() {
        return com.google.gson.internal.b.t(this.type);
    }

    public static <T> a<T> get(Class<T> cls) {
        return new a<>(cls);
    }

    @Deprecated
    public boolean isAssignableFrom(Type type) {
        if (type == null) {
            return false;
        }
        if (this.type.equals(type)) {
            return true;
        }
        Type type2 = this.type;
        if (type2 instanceof Class) {
            return this.rawType.isAssignableFrom(com.google.gson.internal.b.k(type));
        }
        if (type2 instanceof ParameterizedType) {
            return d(type, (ParameterizedType) type2, new HashMap());
        }
        if (type2 instanceof GenericArrayType) {
            return this.rawType.isAssignableFrom(com.google.gson.internal.b.k(type)) && c(type, (GenericArrayType) this.type);
        }
        throw a(type2, Class.class, ParameterizedType.class, GenericArrayType.class);
    }

    public a(Type type) {
        Type b11 = com.google.gson.internal.b.b((Type) com.google.gson.internal.a.b(type));
        this.type = b11;
        this.rawType = (Class<? super T>) com.google.gson.internal.b.k(b11);
        this.hashCode = b11.hashCode();
    }

    @Deprecated
    public boolean isAssignableFrom(a<?> aVar) {
        return isAssignableFrom(aVar.getType());
    }
}
