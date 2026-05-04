package lb0;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Objects;
import javax.annotation.Nullable;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Type[] f70853a = new Type[0];

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements GenericArrayType {

        /* renamed from: a, reason: collision with root package name */
        public final Type f70854a;

        public a(Type type) {
            this.f70854a = type;
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && d0.d(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f70854a;
        }

        public int hashCode() {
            return this.f70854a.hashCode();
        }

        public String toString() {
            return d0.t(this.f70854a) + okhttp3.i.f77289p;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements ParameterizedType {

        /* renamed from: a, reason: collision with root package name */
        @Nullable
        public final Type f70855a;

        /* renamed from: b, reason: collision with root package name */
        public final Type f70856b;

        /* renamed from: c, reason: collision with root package name */
        public final Type[] f70857c;

        public b(@Nullable Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                if ((type == null) != (((Class) type2).getEnclosingClass() == null)) {
                    throw new IllegalArgumentException();
                }
            }
            for (Type type3 : typeArr) {
                Objects.requireNonNull(type3, "typeArgument == null");
                d0.b(type3);
            }
            this.f70855a = type;
            this.f70856b = type2;
            this.f70857c = (Type[]) typeArr.clone();
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && d0.d(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.f70857c.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        @Nullable
        public Type getOwnerType() {
            return this.f70855a;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f70856b;
        }

        public int hashCode() {
            int hashCode = Arrays.hashCode(this.f70857c) ^ this.f70856b.hashCode();
            Type type = this.f70855a;
            return hashCode ^ (type != null ? type.hashCode() : 0);
        }

        public String toString() {
            Type[] typeArr = this.f70857c;
            if (typeArr.length == 0) {
                return d0.t(this.f70856b);
            }
            StringBuilder sb2 = new StringBuilder((typeArr.length + 1) * 30);
            sb2.append(d0.t(this.f70856b));
            sb2.append("<");
            sb2.append(d0.t(this.f70857c[0]));
            for (int i11 = 1; i11 < this.f70857c.length; i11++) {
                sb2.append(j2.O);
                sb2.append(d0.t(this.f70857c[i11]));
            }
            sb2.append(">");
            return sb2.toString();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements WildcardType {

        /* renamed from: a, reason: collision with root package name */
        public final Type f70858a;

        /* renamed from: b, reason: collision with root package name */
        @Nullable
        public final Type f70859b;

        public c(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr.length != 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr2.length != 1) {
                typeArr[0].getClass();
                d0.b(typeArr[0]);
                this.f70859b = null;
                this.f70858a = typeArr[0];
                return;
            }
            typeArr2[0].getClass();
            d0.b(typeArr2[0]);
            if (typeArr[0] != Object.class) {
                throw new IllegalArgumentException();
            }
            this.f70859b = typeArr2[0];
            this.f70858a = Object.class;
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && d0.d(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.f70859b;
            return type != null ? new Type[]{type} : d0.f70853a;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.f70858a};
        }

        public int hashCode() {
            Type type = this.f70859b;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f70858a.hashCode() + 31);
        }

        public String toString() {
            if (this.f70859b != null) {
                return "? super " + d0.t(this.f70859b);
            }
            if (this.f70858a == Object.class) {
                return "?";
            }
            return "? extends " + d0.t(this.f70858a);
        }
    }

    public static okhttp3.o a(okhttp3.o oVar) throws IOException {
        l60.k kVar = new l60.k();
        oVar.V().z7(kVar);
        return okhttp3.o.E(oVar.r(), oVar.q(), kVar);
    }

    public static void b(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    @Nullable
    public static Class<?> c(TypeVariable<?> typeVariable) {
        Object genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    public static boolean d(Type type, Type type2) {
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
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            return (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return d(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
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

    public static Type e(Type type, Class<?> cls, Class<?> cls2) {
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
                    return e(cls.getGenericInterfaces()[i11], interfaces[i11], cls2);
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
                    return e(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Type f(int i11, ParameterizedType parameterizedType) {
        Type type = parameterizedType.getActualTypeArguments()[i11];
        return type instanceof WildcardType ? ((WildcardType) type).getLowerBounds()[0] : type;
    }

    public static Type g(int i11, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i11 >= 0 && i11 < actualTypeArguments.length) {
            Type type = actualTypeArguments[i11];
            return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
        }
        throw new IllegalArgumentException("Index " + i11 + " not in range [0," + actualTypeArguments.length + ") for " + parameterizedType);
    }

    public static Class<?> h(Type type) {
        Objects.requireNonNull(type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            throw new IllegalArgumentException();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(h(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return h(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + type.getClass().getName());
    }

    public static Type i(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return q(type, cls, e(type, cls, cls2));
        }
        throw new IllegalArgumentException();
    }

    public static boolean j(@Nullable Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
                if (j(type2)) {
                    return true;
                }
            }
            return false;
        }
        if (type instanceof GenericArrayType) {
            return j(((GenericArrayType) type).getGenericComponentType());
        }
        if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
            return true;
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    public static int k(Object[] objArr, Object obj) {
        for (int i11 = 0; i11 < objArr.length; i11++) {
            if (obj.equals(objArr[i11])) {
                return i11;
            }
        }
        throw new NoSuchElementException();
    }

    public static boolean l(Annotation[] annotationArr, Class<? extends Annotation> cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    public static RuntimeException m(Method method, String str, Object... objArr) {
        return n(method, null, str, objArr);
    }

    public static RuntimeException n(Method method, @Nullable Throwable th2, String str, Object... objArr) {
        return new IllegalArgumentException(String.format(str, objArr) + "\n    for method " + method.getDeclaringClass().getSimpleName() + "." + method.getName(), th2);
    }

    public static RuntimeException o(Method method, int i11, String str, Object... objArr) {
        return m(method, str + " (parameter #" + (i11 + 1) + pn.j.f81007d, objArr);
    }

    public static RuntimeException p(Method method, Throwable th2, int i11, String str, Object... objArr) {
        return n(method, th2, str + " (parameter #" + (i11 + 1) + pn.j.f81007d, objArr);
    }

    public static Type q(Type type, Class<?> cls, Type type2) {
        Type type3 = type2;
        while (type3 instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type3;
            Type r11 = r(type, cls, typeVariable);
            if (r11 == typeVariable) {
                return r11;
            }
            type3 = r11;
        }
        if (type3 instanceof Class) {
            Class cls2 = (Class) type3;
            if (cls2.isArray()) {
                Class<?> componentType = cls2.getComponentType();
                Type q11 = q(type, cls, componentType);
                return componentType == q11 ? cls2 : new a(q11);
            }
        }
        if (type3 instanceof GenericArrayType) {
            GenericArrayType genericArrayType = (GenericArrayType) type3;
            Type genericComponentType = genericArrayType.getGenericComponentType();
            Type q12 = q(type, cls, genericComponentType);
            return genericComponentType == q12 ? genericArrayType : new a(q12);
        }
        if (type3 instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type3;
            Type ownerType = parameterizedType.getOwnerType();
            Type q13 = q(type, cls, ownerType);
            boolean z11 = q13 != ownerType;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            for (int i11 = 0; i11 < length; i11++) {
                Type q14 = q(type, cls, actualTypeArguments[i11]);
                if (q14 != actualTypeArguments[i11]) {
                    if (!z11) {
                        actualTypeArguments = (Type[]) actualTypeArguments.clone();
                        z11 = true;
                    }
                    actualTypeArguments[i11] = q14;
                }
            }
            return z11 ? new b(q13, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
        }
        boolean z12 = type3 instanceof WildcardType;
        Type type4 = type3;
        if (z12) {
            WildcardType wildcardType = (WildcardType) type3;
            Type[] lowerBounds = wildcardType.getLowerBounds();
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (lowerBounds.length == 1) {
                Type q15 = q(type, cls, lowerBounds[0]);
                type4 = wildcardType;
                if (q15 != lowerBounds[0]) {
                    return new c(new Type[]{Object.class}, new Type[]{q15});
                }
            } else {
                type4 = wildcardType;
                if (upperBounds.length == 1) {
                    Type q16 = q(type, cls, upperBounds[0]);
                    type4 = wildcardType;
                    if (q16 != upperBounds[0]) {
                        return new c(new Type[]{q16}, f70853a);
                    }
                }
            }
        }
        return type4;
    }

    public static Type r(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> c11 = c(typeVariable);
        if (c11 != null) {
            Type e11 = e(type, cls, c11);
            if (e11 instanceof ParameterizedType) {
                return ((ParameterizedType) e11).getActualTypeArguments()[k(c11.getTypeParameters(), typeVariable)];
            }
        }
        return typeVariable;
    }

    public static void s(Throwable th2) {
        if (th2 instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th2);
        }
        if (th2 instanceof ThreadDeath) {
            throw ((ThreadDeath) th2);
        }
        if (th2 instanceof LinkageError) {
            throw ((LinkageError) th2);
        }
    }

    public static String t(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
