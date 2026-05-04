package com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final Type[] f34989a = new Type[0];

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ boolean f34990b = false;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements GenericArrayType, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final Type f34991a;

        public a(Type type) {
            this.f34991a = b.b(type);
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && b.f(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f34991a;
        }

        public int hashCode() {
            return this.f34991a.hashCode();
        }

        public String toString() {
            return b.t(this.f34991a) + okhttp3.i.f77289p;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.google.gson.internal.b$b, reason: collision with other inner class name */
    public static final class C0433b implements ParameterizedType, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final Type f34992a;

        /* renamed from: b, reason: collision with root package name */
        public final Type f34993b;

        /* renamed from: c, reason: collision with root package name */
        public final Type[] f34994c;

        public C0433b(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z11 = true;
                boolean z12 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
                if (type == null && !z12) {
                    z11 = false;
                }
                com.google.gson.internal.a.a(z11);
            }
            this.f34992a = type == null ? null : b.b(type);
            this.f34993b = b.b(type2);
            Type[] typeArr2 = (Type[]) typeArr.clone();
            this.f34994c = typeArr2;
            int length = typeArr2.length;
            for (int i11 = 0; i11 < length; i11++) {
                com.google.gson.internal.a.b(this.f34994c[i11]);
                b.c(this.f34994c[i11]);
                Type[] typeArr3 = this.f34994c;
                typeArr3[i11] = b.b(typeArr3[i11]);
            }
        }

        public static int a(Object obj) {
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && b.f(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.f34994c.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.f34992a;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f34993b;
        }

        public int hashCode() {
            return (Arrays.hashCode(this.f34994c) ^ this.f34993b.hashCode()) ^ a(this.f34992a);
        }

        public String toString() {
            int length = this.f34994c.length;
            if (length == 0) {
                return b.t(this.f34993b);
            }
            StringBuilder sb2 = new StringBuilder((length + 1) * 30);
            sb2.append(b.t(this.f34993b));
            sb2.append("<");
            sb2.append(b.t(this.f34994c[0]));
            for (int i11 = 1; i11 < length; i11++) {
                sb2.append(j2.O);
                sb2.append(b.t(this.f34994c[i11]));
            }
            sb2.append(">");
            return sb2.toString();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements WildcardType, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final Type f34995a;

        /* renamed from: b, reason: collision with root package name */
        public final Type f34996b;

        public c(Type[] typeArr, Type[] typeArr2) {
            com.google.gson.internal.a.a(typeArr2.length <= 1);
            com.google.gson.internal.a.a(typeArr.length == 1);
            if (typeArr2.length != 1) {
                com.google.gson.internal.a.b(typeArr[0]);
                b.c(typeArr[0]);
                this.f34996b = null;
                this.f34995a = b.b(typeArr[0]);
                return;
            }
            com.google.gson.internal.a.b(typeArr2[0]);
            b.c(typeArr2[0]);
            com.google.gson.internal.a.a(typeArr[0] == Object.class);
            this.f34996b = b.b(typeArr2[0]);
            this.f34995a = Object.class;
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && b.f(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.f34996b;
            return type != null ? new Type[]{type} : b.f34989a;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.f34995a};
        }

        public int hashCode() {
            Type type = this.f34996b;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f34995a.hashCode() + 31);
        }

        public String toString() {
            if (this.f34996b != null) {
                return "? super " + b.t(this.f34996b);
            }
            if (this.f34995a == Object.class) {
                return "?";
            }
            return "? extends " + b.t(this.f34995a);
        }
    }

    public b() {
        throw new UnsupportedOperationException();
    }

    public static GenericArrayType a(Type type) {
        return new a(type);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.google.gson.internal.b$a] */
    public static Type b(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isArray()) {
                cls = new a(b(cls.getComponentType()));
            }
            return cls;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new C0433b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new a(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    public static void c(Type type) {
        com.google.gson.internal.a.a(((type instanceof Class) && ((Class) type).isPrimitive()) ? false : true);
    }

    public static Class<?> d(TypeVariable<?> typeVariable) {
        Object genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    public static boolean e(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static boolean f(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return e(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return f(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    public static Type g(Type type) {
        return type instanceof GenericArrayType ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
    }

    public static Type h(Type type, Class<?> cls) {
        Type l11 = l(type, cls, Collection.class);
        return l11 instanceof ParameterizedType ? ((ParameterizedType) l11).getActualTypeArguments()[0] : Object.class;
    }

    public static Type i(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i11 = 0; i11 < length; i11++) {
                Class<?> cls3 = interfaces[i11];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i11];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return i(cls.getGenericInterfaces()[i11], interfaces[i11], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return i(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Type[] j(Type type, Class<?> cls) {
        if (type == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        Type l11 = l(type, cls, Map.class);
        return l11 instanceof ParameterizedType ? ((ParameterizedType) l11).getActualTypeArguments() : new Type[]{Object.class, Object.class};
    }

    public static Class<?> k(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            com.google.gson.internal.a.a(rawType instanceof Class);
            return (Class) rawType;
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(k(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return k(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    public static Type l(Type type, Class<?> cls, Class<?> cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        com.google.gson.internal.a.a(cls2.isAssignableFrom(cls));
        return o(type, cls, i(type, cls, cls2));
    }

    public static int m(Object[] objArr, Object obj) {
        int length = objArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (obj.equals(objArr[i11])) {
                return i11;
            }
        }
        throw new NoSuchElementException();
    }

    public static ParameterizedType n(Type type, Type type2, Type... typeArr) {
        return new C0433b(type, type2, typeArr);
    }

    public static Type o(Type type, Class<?> cls, Type type2) {
        return p(type, cls, type2, new HashMap());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object, java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.reflect.ParameterizedType] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.reflect.GenericArrayType] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.Map, java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type>] */
    public static Type p(Type type, Class<?> cls, Type type2, Map<TypeVariable<?>, Type> map) {
        Type p11;
        Type n11;
        TypeVariable typeVariable = null;
        while (true) {
            if (type2 instanceof TypeVariable) {
                TypeVariable typeVariable2 = type2;
                Type type3 = (Type) map.get(typeVariable2);
                Class cls2 = Void.TYPE;
                if (type3 != null) {
                    return type3 == cls2 ? type2 : type3;
                }
                map.put(typeVariable2, cls2);
                if (typeVariable == null) {
                    typeVariable = typeVariable2;
                }
                type2 = q(type, cls, typeVariable2);
                if (type2 == typeVariable2) {
                    break;
                }
            } else {
                if (type2 instanceof Class) {
                    Class cls3 = type2;
                    if (cls3.isArray()) {
                        Class<?> componentType = cls3.getComponentType();
                        Type p12 = p(type, cls, componentType, map);
                        if (e(componentType, p12)) {
                            type2 = cls3;
                        } else {
                            n11 = a(p12);
                            type2 = n11;
                        }
                    }
                }
                if (type2 instanceof GenericArrayType) {
                    type2 = (GenericArrayType) type2;
                    Type genericComponentType = type2.getGenericComponentType();
                    Type p13 = p(type, cls, genericComponentType, map);
                    if (!e(genericComponentType, p13)) {
                        n11 = a(p13);
                        type2 = n11;
                    }
                } else {
                    if (type2 instanceof ParameterizedType) {
                        type2 = (ParameterizedType) type2;
                        Type ownerType = type2.getOwnerType();
                        Type p14 = p(type, cls, ownerType, map);
                        boolean z11 = !e(p14, ownerType);
                        Type[] actualTypeArguments = type2.getActualTypeArguments();
                        int length = actualTypeArguments.length;
                        for (int i11 = 0; i11 < length; i11++) {
                            Type p15 = p(type, cls, actualTypeArguments[i11], map);
                            if (!e(p15, actualTypeArguments[i11])) {
                                if (!z11) {
                                    actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                    z11 = true;
                                }
                                actualTypeArguments[i11] = p15;
                            }
                        }
                        if (z11) {
                            n11 = n(p14, type2.getRawType(), actualTypeArguments);
                            type2 = n11;
                        }
                    } else if (type2 instanceof WildcardType) {
                        type2 = (WildcardType) type2;
                        Type[] lowerBounds = type2.getLowerBounds();
                        Type[] upperBounds = type2.getUpperBounds();
                        if (lowerBounds.length == 1) {
                            Type p16 = p(type, cls, lowerBounds[0], map);
                            if (p16 != lowerBounds[0]) {
                                type2 = s(p16);
                            }
                        } else if (upperBounds.length == 1 && (p11 = p(type, cls, upperBounds[0], map)) != upperBounds[0]) {
                            type2 = r(p11);
                        }
                    }
                }
            }
        }
        if (typeVariable != null) {
            map.put(typeVariable, type2);
        }
        return type2;
    }

    public static Type q(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> d11 = d(typeVariable);
        if (d11 != null) {
            Type i11 = i(type, cls, d11);
            if (i11 instanceof ParameterizedType) {
                return ((ParameterizedType) i11).getActualTypeArguments()[m(d11.getTypeParameters(), typeVariable)];
            }
        }
        return typeVariable;
    }

    public static WildcardType r(Type type) {
        return new c(type instanceof WildcardType ? ((WildcardType) type).getUpperBounds() : new Type[]{type}, f34989a);
    }

    public static WildcardType s(Type type) {
        return new c(new Type[]{Object.class}, type instanceof WildcardType ? ((WildcardType) type).getLowerBounds() : new Type[]{type});
    }

    public static String t(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
