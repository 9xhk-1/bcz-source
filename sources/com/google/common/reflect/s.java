package com.google.common.reflect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.aa;
import com.google.common.collect.k6;
import com.google.common.reflect.s;
import ho.a0;
import ho.d0;
import ho.j0;
import java.io.Serializable;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.security.AccessControlException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.CheckForNull;
import org.junit.jupiter.api.j2;
import u30.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@com.google.common.reflect.d
/* loaded from: classes7.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final a0 f34433a = a0.p(j2.O).s("null");

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends r {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AtomicReference f34434b;

        public a(final AtomicReference val$result) {
            this.f34434b = val$result;
        }

        @Override // com.google.common.reflect.r
        public void b(Class<?> t11) {
            this.f34434b.set(t11.getComponentType());
        }

        @Override // com.google.common.reflect.r
        public void c(GenericArrayType t11) {
            this.f34434b.set(t11.getGenericComponentType());
        }

        @Override // com.google.common.reflect.r
        public void e(TypeVariable<?> t11) {
            this.f34434b.set(s.p(t11.getBounds()));
        }

        @Override // com.google.common.reflect.r
        public void f(WildcardType t11) {
            this.f34434b.set(s.p(t11.getUpperBounds()));
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f34435a = new a("OWNED_BY_ENCLOSING_CLASS", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final b f34436b = new c("LOCAL_CLASS_HAS_NO_OWNER", 1);

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ b[] f34438d = a();

        /* renamed from: c, reason: collision with root package name */
        public static final b f34437c = b();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum a extends b {
            public a(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // com.google.common.reflect.s.b
            @CheckForNull
            public Class<?> c(Class<?> rawType) {
                return rawType.getEnclosingClass();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.google.common.reflect.s$b$b, reason: collision with other inner class name */
        public class C0427b<T> {
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum c extends b {
            public c(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // com.google.common.reflect.s.b
            @CheckForNull
            public Class<?> c(Class<?> rawType) {
                if (rawType.isLocalClass()) {
                    return null;
                }
                return rawType.getEnclosingClass();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class d extends C0427b<String> {
        }

        public b(String $enum$name, int $enum$ordinal) {
        }

        public static /* synthetic */ b[] a() {
            return new b[]{f34435a, f34436b};
        }

        public static b b() {
            new d();
            ParameterizedType parameterizedType = (ParameterizedType) d.class.getGenericSuperclass();
            Objects.requireNonNull(parameterizedType);
            ParameterizedType parameterizedType2 = parameterizedType;
            for (b bVar : values()) {
                if (bVar.c(C0427b.class) == parameterizedType2.getOwnerType()) {
                    return bVar;
                }
            }
            throw new AssertionError();
        }

        public static b valueOf(String name) {
            return (b) Enum.valueOf(b.class, name);
        }

        public static b[] values() {
            return (b[]) f34438d.clone();
        }

        @CheckForNull
        public abstract Class<?> c(Class<?> rawType);

        public /* synthetic */ b(String str, int i11, a aVar) {
            this(str, i11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements GenericArrayType, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final Type f34439a;

        public c(Type componentType) {
            this.f34439a = d.f34444e.f(componentType);
        }

        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof GenericArrayType) {
                return d0.a(getGenericComponentType(), ((GenericArrayType) obj).getGenericComponentType());
            }
            return false;
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f34439a;
        }

        public int hashCode() {
            return this.f34439a.hashCode();
        }

        public String toString() {
            return s.s(this.f34439a) + okhttp3.i.f77289p;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class d {

        /* renamed from: a, reason: collision with root package name */
        public static final d f34440a;

        /* renamed from: b, reason: collision with root package name */
        public static final d f34441b;

        /* renamed from: c, reason: collision with root package name */
        public static final d f34442c;

        /* renamed from: d, reason: collision with root package name */
        public static final d f34443d;

        /* renamed from: e, reason: collision with root package name */
        public static final d f34444e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ d[] f34445f;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum a extends d {
            public a(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // com.google.common.reflect.s.d
            public Type f(Type type) {
                Preconditions.checkNotNull(type);
                if (!(type instanceof Class)) {
                    return type;
                }
                Class cls = (Class) type;
                return cls.isArray() ? new c(cls.getComponentType()) : type;
            }

            @Override // com.google.common.reflect.s.d
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public GenericArrayType c(Type componentType) {
                return new c(componentType);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum b extends d {
            public b(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // com.google.common.reflect.s.d
            public Type c(Type componentType) {
                return componentType instanceof Class ? s.h((Class) componentType) : new c(componentType);
            }

            @Override // com.google.common.reflect.s.d
            public Type f(Type type) {
                return (Type) Preconditions.checkNotNull(type);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum c extends d {
            public c(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // com.google.common.reflect.s.d
            public Type c(Type componentType) {
                return d.f34441b.c(componentType);
            }

            @Override // com.google.common.reflect.s.d
            public String d(Type type) {
                try {
                    return (String) Type.class.getMethod("getTypeName", null).invoke(type, null);
                } catch (IllegalAccessException e11) {
                    e = e11;
                    throw new RuntimeException(e);
                } catch (NoSuchMethodException unused) {
                    throw new AssertionError("Type.getTypeName should be available in Java 8");
                } catch (InvocationTargetException e12) {
                    e = e12;
                    throw new RuntimeException(e);
                }
            }

            @Override // com.google.common.reflect.s.d
            public Type f(Type type) {
                return d.f34441b.f(type);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.google.common.reflect.s$d$d, reason: collision with other inner class name */
        public enum C0428d extends d {
            public C0428d(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // com.google.common.reflect.s.d
            public boolean b() {
                return false;
            }

            @Override // com.google.common.reflect.s.d
            public Type c(Type componentType) {
                return d.f34442c.c(componentType);
            }

            @Override // com.google.common.reflect.s.d
            public String d(Type type) {
                return d.f34442c.d(type);
            }

            @Override // com.google.common.reflect.s.d
            public Type f(Type type) {
                return d.f34442c.f(type);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class e extends m<Map.Entry<String, int[][]>> {
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class f extends m<int[]> {
        }

        static {
            a aVar = new a("JAVA6", 0);
            f34440a = aVar;
            b bVar = new b("JAVA7", 1);
            f34441b = bVar;
            c cVar = new c("JAVA8", 2);
            f34442c = cVar;
            C0428d c0428d = new C0428d("JAVA9", 3);
            f34443d = c0428d;
            f34445f = a();
            if (AnnotatedElement.class.isAssignableFrom(TypeVariable.class)) {
                if (new e().capture().toString().contains("java.util.Map.java.util.Map")) {
                    f34444e = cVar;
                    return;
                } else {
                    f34444e = c0428d;
                    return;
                }
            }
            if (new f().capture() instanceof Class) {
                f34444e = bVar;
            } else {
                f34444e = aVar;
            }
        }

        public d(String $enum$name, int $enum$ordinal) {
        }

        public static /* synthetic */ d[] a() {
            return new d[]{f34440a, f34441b, f34442c, f34443d};
        }

        public static d valueOf(String name) {
            return (d) Enum.valueOf(d.class, name);
        }

        public static d[] values() {
            return (d[]) f34445f.clone();
        }

        public boolean b() {
            return true;
        }

        public abstract Type c(Type componentType);

        public String d(Type type) {
            return s.s(type);
        }

        public final ImmutableList<Type> e(Type[] types) {
            ImmutableList.a builder = ImmutableList.builder();
            for (Type type : types) {
                builder.g(f(type));
            }
            return builder.e();
        }

        public abstract Type f(Type type);

        public /* synthetic */ d(String str, int i11, a aVar) {
            this(str, i11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e<X> {

        /* renamed from: a, reason: collision with root package name */
        public static final boolean f34446a = !e.class.getTypeParameters()[0].equals(s.k(e.class, "X", new Type[0]));
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class f implements ParameterizedType, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        @CheckForNull
        public final Type f34447a;

        /* renamed from: b, reason: collision with root package name */
        public final ImmutableList<Type> f34448b;

        /* renamed from: c, reason: collision with root package name */
        public final Class<?> f34449c;

        public f(@CheckForNull Type ownerType, Class<?> rawType, Type[] typeArguments) {
            Preconditions.checkNotNull(rawType);
            Preconditions.checkArgument(typeArguments.length == rawType.getTypeParameters().length);
            s.f(typeArguments, "type parameter");
            this.f34447a = ownerType;
            this.f34449c = rawType;
            this.f34448b = d.f34444e.e(typeArguments);
        }

        public boolean equals(@CheckForNull Object other) {
            if (!(other instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) other;
            return getRawType().equals(parameterizedType.getRawType()) && d0.a(getOwnerType(), parameterizedType.getOwnerType()) && Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments());
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return s.r(this.f34448b);
        }

        @Override // java.lang.reflect.ParameterizedType
        @CheckForNull
        public Type getOwnerType() {
            return this.f34447a;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f34449c;
        }

        public int hashCode() {
            Type type = this.f34447a;
            return ((type == null ? 0 : type.hashCode()) ^ this.f34448b.hashCode()) ^ this.f34449c.hashCode();
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            if (this.f34447a != null) {
                d dVar = d.f34444e;
                if (dVar.b()) {
                    sb2.append(dVar.d(this.f34447a));
                    sb2.append('.');
                }
            }
            sb2.append(this.f34449c.getName());
            sb2.append(u0.f91709e);
            a0 a0Var = s.f34433a;
            ImmutableList<Type> immutableList = this.f34448b;
            final d dVar2 = d.f34444e;
            Objects.requireNonNull(dVar2);
            sb2.append(a0Var.k(k6.T(immutableList, new ho.r() { // from class: com.google.common.reflect.t
                @Override // ho.r
                public final Object apply(Object obj) {
                    return s.d.this.d((Type) obj);
                }
            })));
            sb2.append(u0.f91710f);
            return sb2.toString();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class g<D extends GenericDeclaration> {

        /* renamed from: a, reason: collision with root package name */
        public final D f34450a;

        /* renamed from: b, reason: collision with root package name */
        public final String f34451b;

        /* renamed from: c, reason: collision with root package name */
        public final ImmutableList<Type> f34452c;

        public g(D genericDeclaration, String name, Type[] bounds) {
            s.f(bounds, "bound for type variable");
            this.f34450a = (D) Preconditions.checkNotNull(genericDeclaration);
            this.f34451b = (String) Preconditions.checkNotNull(name);
            this.f34452c = ImmutableList.copyOf(bounds);
        }

        public Type[] a() {
            return s.r(this.f34452c);
        }

        public D b() {
            return this.f34450a;
        }

        public String c() {
            return this.f34451b;
        }

        public String d() {
            return this.f34451b;
        }

        public boolean equals(@CheckForNull Object obj) {
            if (!e.f34446a) {
                if (obj instanceof TypeVariable) {
                    TypeVariable typeVariable = (TypeVariable) obj;
                    if (this.f34451b.equals(typeVariable.getName()) && this.f34450a.equals(typeVariable.getGenericDeclaration())) {
                        return true;
                    }
                }
                return false;
            }
            if (obj != null && Proxy.isProxyClass(obj.getClass()) && (Proxy.getInvocationHandler(obj) instanceof h)) {
                g gVar = ((h) Proxy.getInvocationHandler(obj)).f34454a;
                if (this.f34451b.equals(gVar.c()) && this.f34450a.equals(gVar.b()) && this.f34452c.equals(gVar.f34452c)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.f34450a.hashCode() ^ this.f34451b.hashCode();
        }

        public String toString() {
            return this.f34451b;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class h implements InvocationHandler {

        /* renamed from: b, reason: collision with root package name */
        public static final ImmutableMap<String, Method> f34453b;

        /* renamed from: a, reason: collision with root package name */
        public final g<?> f34454a;

        static {
            ImmutableMap.b builder = ImmutableMap.builder();
            for (Method method : g.class.getMethods()) {
                if (method.getDeclaringClass().equals(g.class)) {
                    try {
                        method.setAccessible(true);
                    } catch (AccessControlException unused) {
                    }
                    builder.i(method.getName(), method);
                }
            }
            f34453b = builder.c();
        }

        public h(g<?> typeVariableImpl) {
            this.f34454a = typeVariableImpl;
        }

        @Override // java.lang.reflect.InvocationHandler
        @CheckForNull
        public Object invoke(Object proxy, Method method, @CheckForNull Object[] args) throws Throwable {
            String name = method.getName();
            Method method2 = f34453b.get(name);
            if (method2 == null) {
                throw new UnsupportedOperationException(name);
            }
            try {
                return method2.invoke(this.f34454a, args);
            } catch (InvocationTargetException e11) {
                throw e11.getCause();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class i implements WildcardType, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final ImmutableList<Type> f34455a;

        /* renamed from: b, reason: collision with root package name */
        public final ImmutableList<Type> f34456b;

        public i(Type[] lowerBounds, Type[] upperBounds) {
            s.f(lowerBounds, "lower bound for wildcard");
            s.f(upperBounds, "upper bound for wildcard");
            d dVar = d.f34444e;
            this.f34455a = dVar.e(lowerBounds);
            this.f34456b = dVar.e(upperBounds);
        }

        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) obj;
                if (this.f34455a.equals(Arrays.asList(wildcardType.getLowerBounds())) && this.f34456b.equals(Arrays.asList(wildcardType.getUpperBounds()))) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            return s.r(this.f34455a);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return s.r(this.f34456b);
        }

        public int hashCode() {
            return this.f34455a.hashCode() ^ this.f34456b.hashCode();
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("?");
            aa<Type> it = this.f34455a.iterator();
            while (it.hasNext()) {
                Type next = it.next();
                sb2.append(" super ");
                sb2.append(d.f34444e.d(next));
            }
            for (Type type : s.g(this.f34456b)) {
                sb2.append(" extends ");
                sb2.append(d.f34444e.d(type));
            }
            return sb2.toString();
        }
    }

    public static void f(Type[] types, String usedAs) {
        for (Type type : types) {
            if (type instanceof Class) {
                Preconditions.checkArgument(!r2.isPrimitive(), "Primitive type '%s' used as %s", (Class) type, usedAs);
            }
        }
    }

    public static Iterable<Type> g(Iterable<Type> bounds) {
        return k6.o(bounds, j0.q(j0.m(Object.class)));
    }

    public static Class<?> h(Class<?> componentType) {
        return Array.newInstance(componentType, 0).getClass();
    }

    @CheckForNull
    public static Type i(Type type) {
        Preconditions.checkNotNull(type);
        AtomicReference atomicReference = new AtomicReference();
        new a(atomicReference).a(type);
        return (Type) atomicReference.get();
    }

    public static Type j(Type componentType) {
        if (!(componentType instanceof WildcardType)) {
            return d.f34444e.c(componentType);
        }
        WildcardType wildcardType = (WildcardType) componentType;
        Type[] lowerBounds = wildcardType.getLowerBounds();
        Preconditions.checkArgument(lowerBounds.length <= 1, "Wildcard cannot have more than one lower bounds.");
        if (lowerBounds.length == 1) {
            return q(j(lowerBounds[0]));
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        Preconditions.checkArgument(upperBounds.length == 1, "Wildcard should have only one upper bound.");
        return o(j(upperBounds[0]));
    }

    public static <D extends GenericDeclaration> TypeVariable<D> k(D declaration, String name, Type... bounds) {
        if (bounds.length == 0) {
            bounds = new Type[]{Object.class};
        }
        return n(declaration, name, bounds);
    }

    public static ParameterizedType l(Class<?> rawType, Type... arguments) {
        return new f(b.f34437c.c(rawType), rawType, arguments);
    }

    public static ParameterizedType m(@CheckForNull Type ownerType, Class<?> rawType, Type... arguments) {
        if (ownerType == null) {
            return l(rawType, arguments);
        }
        Preconditions.checkNotNull(arguments);
        Preconditions.checkArgument(rawType.getEnclosingClass() != null, "Owner type for unenclosed %s", rawType);
        return new f(ownerType, rawType, arguments);
    }

    public static <D extends GenericDeclaration> TypeVariable<D> n(D genericDeclaration, String name, Type[] bounds) {
        return (TypeVariable) l.d(TypeVariable.class, new h(new g(genericDeclaration, name, bounds)));
    }

    @go.e
    public static WildcardType o(Type upperBound) {
        return new i(new Type[0], new Type[]{upperBound});
    }

    @CheckForNull
    public static Type p(Type[] bounds) {
        for (Type type : bounds) {
            Type i11 = i(type);
            if (i11 != null) {
                if (i11 instanceof Class) {
                    Class cls = (Class) i11;
                    if (cls.isPrimitive()) {
                        return cls;
                    }
                }
                return o(i11);
            }
        }
        return null;
    }

    @go.e
    public static WildcardType q(Type lowerBound) {
        return new i(new Type[]{lowerBound}, new Type[]{Object.class});
    }

    public static Type[] r(Collection<Type> types) {
        return (Type[]) types.toArray(new Type[0]);
    }

    public static String s(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
