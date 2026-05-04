package com.google.common.reflect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.aa;
import com.google.common.collect.e5;
import com.google.common.collect.i4;
import com.google.common.collect.s7;
import com.google.common.collect.u6;
import com.google.common.reflect.g;
import com.google.common.reflect.o;
import com.google.common.reflect.s;
import ho.a0;
import ho.i0;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@com.google.common.reflect.d
/* loaded from: classes7.dex */
public abstract class TypeToken<T> extends m<T> implements Serializable {
    private static final long serialVersionUID = 3637540370352322684L;

    @CheckForNull
    @vo.b
    private transient o covariantTypeResolver;

    @CheckForNull
    @vo.b
    private transient o invariantTypeResolver;
    private final Type runtimeType;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends g.b<T> {
        public a(Method method) {
            super(method);
        }

        @Override // com.google.common.reflect.g.b, com.google.common.reflect.g
        public Type[] d() {
            return TypeToken.this.getCovariantTypeResolver().l(super.d());
        }

        @Override // com.google.common.reflect.g.b, com.google.common.reflect.g
        public Type[] e() {
            return TypeToken.this.getInvariantTypeResolver().l(super.e());
        }

        @Override // com.google.common.reflect.g.b, com.google.common.reflect.g
        public Type f() {
            return TypeToken.this.getCovariantTypeResolver().j(super.f());
        }

        @Override // com.google.common.reflect.g
        public TypeToken<T> g() {
            return TypeToken.this;
        }

        @Override // com.google.common.reflect.g
        public String toString() {
            return g() + "." + super.toString();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends g.a<T> {
        public b(Constructor constructor) {
            super(constructor);
        }

        @Override // com.google.common.reflect.g.a, com.google.common.reflect.g
        public Type[] d() {
            return TypeToken.this.getCovariantTypeResolver().l(super.d());
        }

        @Override // com.google.common.reflect.g.a, com.google.common.reflect.g
        public Type[] e() {
            return TypeToken.this.getInvariantTypeResolver().l(super.e());
        }

        @Override // com.google.common.reflect.g.a, com.google.common.reflect.g
        public Type f() {
            return TypeToken.this.getCovariantTypeResolver().j(super.f());
        }

        @Override // com.google.common.reflect.g
        public TypeToken<T> g() {
            return TypeToken.this;
        }

        @Override // com.google.common.reflect.g
        public String toString() {
            return g() + pn.j.f81006c + a0.p(j2.O).n(e()) + pn.j.f81007d;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends r {
        public c() {
        }

        @Override // com.google.common.reflect.r
        public void c(GenericArrayType type) {
            a(type.getGenericComponentType());
        }

        @Override // com.google.common.reflect.r
        public void d(ParameterizedType type) {
            a(type.getActualTypeArguments());
            a(type.getOwnerType());
        }

        @Override // com.google.common.reflect.r
        public void e(TypeVariable<?> type) {
            throw new IllegalArgumentException(TypeToken.this.runtimeType + "contains a type variable and is not safe for the operation");
        }

        @Override // com.google.common.reflect.r
        public void f(WildcardType type) {
            a(type.getLowerBounds());
            a(type.getUpperBounds());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d extends r {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ImmutableSet.a f34374b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ TypeToken f34375c;

        public d(final TypeToken this$0, final ImmutableSet.a val$builder) {
            this.f34374b = val$builder;
            this.f34375c = this$0;
        }

        @Override // com.google.common.reflect.r
        public void b(Class<?> t11) {
            this.f34374b.a(t11);
        }

        @Override // com.google.common.reflect.r
        public void c(GenericArrayType t11) {
            this.f34374b.a(s.h(TypeToken.of(t11.getGenericComponentType()).getRawType()));
        }

        @Override // com.google.common.reflect.r
        public void d(ParameterizedType t11) {
            this.f34374b.a((Class) t11.getRawType());
        }

        @Override // com.google.common.reflect.r
        public void e(TypeVariable<?> t11) {
            a(t11.getBounds());
        }

        @Override // com.google.common.reflect.r
        public void f(WildcardType t11) {
            a(t11.getUpperBounds());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public final Type[] f34376a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f34377b;

        public e(Type[] bounds, boolean target) {
            this.f34376a = bounds;
            this.f34377b = target;
        }

        public boolean a(Type supertype) {
            for (Type type : this.f34376a) {
                boolean isSubtypeOf = TypeToken.of(type).isSubtypeOf(supertype);
                boolean z11 = this.f34377b;
                if (isSubtypeOf == z11) {
                    return z11;
                }
            }
            return !this.f34377b;
        }

        public boolean b(Type subtype) {
            TypeToken<?> of2 = TypeToken.of(subtype);
            for (Type type : this.f34376a) {
                boolean isSubtypeOf = of2.isSubtypeOf(type);
                boolean z11 = this.f34377b;
                if (isSubtypeOf == z11) {
                    return z11;
                }
            }
            return !this.f34377b;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class f extends TypeToken<T>.TypeSet {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        @CheckForNull
        public transient ImmutableSet<TypeToken<? super T>> f34378a;

        public f() {
            super();
        }

        private Object readResolve() {
            return TypeToken.this.getTypes().classes();
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet
        public TypeToken<T>.TypeSet interfaces() {
            throw new UnsupportedOperationException("classes().interfaces() not supported.");
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet
        public Set<Class<? super T>> rawTypes() {
            return ImmutableSet.copyOf((Collection) i.f34384b.a().c(TypeToken.this.getRawTypes()));
        }

        public /* synthetic */ f(TypeToken typeToken, a aVar) {
            this();
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet, com.google.common.collect.e5, com.google.common.collect.l4, com.google.common.collect.c5
        public Set<TypeToken<? super T>> delegate() {
            ImmutableSet<TypeToken<? super T>> immutableSet = this.f34378a;
            if (immutableSet != null) {
                return immutableSet;
            }
            ImmutableSet<TypeToken<? super T>> I = i4.u(i.f34383a.a().d(TypeToken.this)).p(j.f34389a).I();
            this.f34378a = I;
            return I;
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet
        public TypeToken<T>.TypeSet classes() {
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class h<T> extends TypeToken<T> {
        private static final long serialVersionUID = 0;

        public h(Type type) {
            super(type, null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class i<K> {

        /* renamed from: a, reason: collision with root package name */
        public static final i<TypeToken<?>> f34383a = new a();

        /* renamed from: b, reason: collision with root package name */
        public static final i<Class<?>> f34384b = new b();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends i<TypeToken<?>> {
            public a() {
                super(null);
            }

            @Override // com.google.common.reflect.TypeToken.i
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public Iterable<? extends TypeToken<?>> e(TypeToken<?> type) {
                return type.getGenericInterfaces();
            }

            @Override // com.google.common.reflect.TypeToken.i
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public Class<?> f(TypeToken<?> type) {
                return type.getRawType();
            }

            @Override // com.google.common.reflect.TypeToken.i
            @CheckForNull
            /* renamed from: k, reason: merged with bridge method [inline-methods] */
            public TypeToken<?> g(TypeToken<?> type) {
                return type.getGenericSuperclass();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class c extends e<K> {
            public c(i delegate) {
                super(delegate);
            }

            @Override // com.google.common.reflect.TypeToken.i
            public ImmutableList<K> c(Iterable<? extends K> types) {
                ImmutableList.a builder = ImmutableList.builder();
                for (K k11 : types) {
                    if (!f(k11).isInterface()) {
                        builder.g(k11);
                    }
                }
                return super.c(builder.e());
            }

            @Override // com.google.common.reflect.TypeToken.i.e, com.google.common.reflect.TypeToken.i
            public Iterable<? extends K> e(K type) {
                return ImmutableSet.of();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class d extends s7<K> {

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Comparator f34386c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Map f34387d;

            public d(final Comparator val$valueComparator, final Map val$map) {
                this.f34386c = val$valueComparator;
                this.f34387d = val$map;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.s7, java.util.Comparator
            public int compare(K left, K right) {
                Comparator comparator = this.f34386c;
                Object obj = this.f34387d.get(left);
                Objects.requireNonNull(obj);
                Object obj2 = this.f34387d.get(right);
                Objects.requireNonNull(obj2);
                return comparator.compare(obj, obj2);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class e<K> extends i<K> {

            /* renamed from: c, reason: collision with root package name */
            public final i<K> f34388c;

            public e(i<K> delegate) {
                super(null);
                this.f34388c = delegate;
            }

            @Override // com.google.common.reflect.TypeToken.i
            public Iterable<? extends K> e(K type) {
                return this.f34388c.e(type);
            }

            @Override // com.google.common.reflect.TypeToken.i
            public Class<?> f(K type) {
                return this.f34388c.f(type);
            }

            @Override // com.google.common.reflect.TypeToken.i
            @CheckForNull
            public K g(K type) {
                return this.f34388c.g(type);
            }
        }

        public i() {
        }

        public static <K, V> ImmutableList<K> h(Map<K, V> map, Comparator<? super V> comparator) {
            return (ImmutableList<K>) new d(comparator, map).l(map.keySet());
        }

        public final i<K> a() {
            return new c(this);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @uo.a
        public final int b(K k11, Map<? super K, Integer> map) {
            Integer num = map.get(k11);
            if (num != null) {
                return num.intValue();
            }
            boolean isInterface = f(k11).isInterface();
            Iterator<? extends K> it = e(k11).iterator();
            int i11 = isInterface;
            while (it.hasNext()) {
                i11 = Math.max(i11, b(it.next(), map));
            }
            K g11 = g(k11);
            int i12 = i11;
            if (g11 != null) {
                i12 = Math.max(i11, b(g11, map));
            }
            int i13 = i12 + 1;
            map.put(k11, Integer.valueOf(i13));
            return i13;
        }

        public ImmutableList<K> c(Iterable<? extends K> types) {
            HashMap Y = u6.Y();
            Iterator<? extends K> it = types.iterator();
            while (it.hasNext()) {
                b(it.next(), Y);
            }
            return h(Y, s7.z().F());
        }

        public final ImmutableList<K> d(K type) {
            return c(ImmutableList.of(type));
        }

        public abstract Iterable<? extends K> e(K type);

        public abstract Class<?> f(K type);

        @CheckForNull
        public abstract K g(K type);

        public /* synthetic */ i(a aVar) {
            this();
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class b extends i<Class<?>> {
            public b() {
                super(null);
            }

            @Override // com.google.common.reflect.TypeToken.i
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public Iterable<? extends Class<?>> e(Class<?> type) {
                return Arrays.asList(type.getInterfaces());
            }

            @Override // com.google.common.reflect.TypeToken.i
            @CheckForNull
            /* renamed from: k, reason: merged with bridge method [inline-methods] */
            public Class<?> g(Class<?> type) {
                return type.getSuperclass();
            }

            @Override // com.google.common.reflect.TypeToken.i
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public Class<?> f(Class<?> type) {
                return type;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class j implements i0<TypeToken<?>> {

        /* renamed from: a, reason: collision with root package name */
        public static final j f34389a = new a("IGNORE_TYPE_VARIABLE_OR_WILDCARD", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final j f34390b = new b("INTERFACE_ONLY", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ j[] f34391c = a();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum a extends j {
            public a(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // ho.i0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public boolean apply(TypeToken<?> type) {
                return ((((TypeToken) type).runtimeType instanceof TypeVariable) || (((TypeToken) type).runtimeType instanceof WildcardType)) ? false : true;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum b extends j {
            public b(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // ho.i0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public boolean apply(TypeToken<?> type) {
                return type.getRawType().isInterface();
            }
        }

        public j(String $enum$name, int $enum$ordinal) {
        }

        public static /* synthetic */ j[] a() {
            return new j[]{f34389a, f34390b};
        }

        public static j valueOf(String name) {
            return (j) Enum.valueOf(j.class, name);
        }

        public static j[] values() {
            return (j[]) f34391c.clone();
        }

        public /* synthetic */ j(String str, int i11, a aVar) {
            this(str, i11);
        }
    }

    public /* synthetic */ TypeToken(Type type, a aVar) {
        this(type);
    }

    private static e any(Type[] bounds) {
        return new e(bounds, true);
    }

    @CheckForNull
    private TypeToken<? super T> boundAsSuperclass(Type type) {
        TypeToken<? super T> typeToken = (TypeToken<? super T>) of(type);
        if (typeToken.getRawType().isInterface()) {
            return null;
        }
        return typeToken;
    }

    private ImmutableList<TypeToken<? super T>> boundsAsInterfaces(Type[] bounds) {
        ImmutableList.a builder = ImmutableList.builder();
        for (Type type : bounds) {
            TypeToken<?> of2 = of(type);
            if (of2.getRawType().isInterface()) {
                builder.g(of2);
            }
        }
        return builder.e();
    }

    private static Type canonicalizeTypeArg(TypeVariable<?> declaration, Type typeArg) {
        return typeArg instanceof WildcardType ? canonicalizeWildcardType(declaration, (WildcardType) typeArg) : canonicalizeWildcardsInType(typeArg);
    }

    private static WildcardType canonicalizeWildcardType(TypeVariable<?> declaration, WildcardType type) {
        Type[] bounds = declaration.getBounds();
        ArrayList arrayList = new ArrayList();
        for (Type type2 : type.getUpperBounds()) {
            if (!any(bounds).a(type2)) {
                arrayList.add(canonicalizeWildcardsInType(type2));
            }
        }
        return new s.i(type.getLowerBounds(), (Type[]) arrayList.toArray(new Type[0]));
    }

    private static ParameterizedType canonicalizeWildcardsInParameterizedType(ParameterizedType type) {
        Class cls = (Class) type.getRawType();
        TypeVariable<Class<T>>[] typeParameters = cls.getTypeParameters();
        Type[] actualTypeArguments = type.getActualTypeArguments();
        for (int i11 = 0; i11 < actualTypeArguments.length; i11++) {
            actualTypeArguments[i11] = canonicalizeTypeArg(typeParameters[i11], actualTypeArguments[i11]);
        }
        return s.m(type.getOwnerType(), cls, actualTypeArguments);
    }

    private static Type canonicalizeWildcardsInType(Type type) {
        return type instanceof ParameterizedType ? canonicalizeWildcardsInParameterizedType((ParameterizedType) type) : type instanceof GenericArrayType ? s.j(canonicalizeWildcardsInType(((GenericArrayType) type).getGenericComponentType())) : type;
    }

    private static e every(Type[] bounds) {
        return new e(bounds, false);
    }

    private TypeToken<? extends T> getArraySubtype(Class<?> cls) {
        Class<?> componentType = cls.getComponentType();
        if (componentType != null) {
            TypeToken<?> componentType2 = getComponentType();
            Objects.requireNonNull(componentType2);
            return (TypeToken<? extends T>) of(newArrayClassOrGenericArrayType(componentType2.getSubtype(componentType).runtimeType));
        }
        throw new IllegalArgumentException(cls + " does not appear to be a subtype of " + this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private TypeToken<? super T> getArraySupertype(Class<? super T> cls) {
        TypeToken<?> componentType = getComponentType();
        if (componentType != 0) {
            Class<?> componentType2 = cls.getComponentType();
            Objects.requireNonNull(componentType2);
            return (TypeToken<? super T>) of(newArrayClassOrGenericArrayType(componentType.getSupertype(componentType2).runtimeType));
        }
        throw new IllegalArgumentException(cls + " isn't a super type of " + this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public o getCovariantTypeResolver() {
        o oVar = this.covariantTypeResolver;
        if (oVar != null) {
            return oVar;
        }
        o d11 = o.d(this.runtimeType);
        this.covariantTypeResolver = d11;
        return d11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public o getInvariantTypeResolver() {
        o oVar = this.invariantTypeResolver;
        if (oVar != null) {
            return oVar;
        }
        o f11 = o.f(this.runtimeType);
        this.invariantTypeResolver = f11;
        return f11;
    }

    @CheckForNull
    private Type getOwnerTypeIfPresent() {
        Type type = this.runtimeType;
        if (type instanceof ParameterizedType) {
            return ((ParameterizedType) type).getOwnerType();
        }
        if (type instanceof Class) {
            return ((Class) type).getEnclosingClass();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ImmutableSet<Class<? super T>> getRawTypes() {
        ImmutableSet.a builder = ImmutableSet.builder();
        new d(this, builder).a(this.runtimeType);
        return builder.e();
    }

    private TypeToken<? extends T> getSubtypeFromLowerBounds(Class<?> cls, Type[] typeArr) {
        if (typeArr.length > 0) {
            return (TypeToken<? extends T>) of(typeArr[0]).getSubtype(cls);
        }
        throw new IllegalArgumentException(cls + " isn't a subclass of " + this);
    }

    private TypeToken<? super T> getSupertypeFromUpperBounds(Class<? super T> cls, Type[] typeArr) {
        for (Type type : typeArr) {
            TypeToken<?> of2 = of(type);
            if (of2.isSubtypeOf(cls)) {
                return (TypeToken<? super T>) of2.getSupertype(cls);
            }
        }
        throw new IllegalArgumentException(cls + " isn't a super type of " + this);
    }

    private boolean is(Type formalType, TypeVariable<?> declaration) {
        if (this.runtimeType.equals(formalType)) {
            return true;
        }
        if (!(formalType instanceof WildcardType)) {
            return canonicalizeWildcardsInType(this.runtimeType).equals(canonicalizeWildcardsInType(formalType));
        }
        WildcardType canonicalizeWildcardType = canonicalizeWildcardType(declaration, (WildcardType) formalType);
        return every(canonicalizeWildcardType.getUpperBounds()).b(this.runtimeType) && every(canonicalizeWildcardType.getLowerBounds()).a(this.runtimeType);
    }

    private boolean isOwnedBySubtypeOf(Type supertype) {
        Iterator<TypeToken<? super T>> it = getTypes().iterator();
        while (it.hasNext()) {
            Type ownerTypeIfPresent = it.next().getOwnerTypeIfPresent();
            if (ownerTypeIfPresent != null && of(ownerTypeIfPresent).isSubtypeOf(supertype)) {
                return true;
            }
        }
        return false;
    }

    private boolean isSubtypeOfArrayType(GenericArrayType supertype) {
        Type type = this.runtimeType;
        if (!(type instanceof Class)) {
            if (type instanceof GenericArrayType) {
                return of(((GenericArrayType) type).getGenericComponentType()).isSubtypeOf(supertype.getGenericComponentType());
            }
            return false;
        }
        Class cls = (Class) type;
        if (cls.isArray()) {
            return of((Class) cls.getComponentType()).isSubtypeOf(supertype.getGenericComponentType());
        }
        return false;
    }

    private boolean isSubtypeOfParameterizedType(ParameterizedType supertype) {
        Class<? super Object> rawType = of(supertype).getRawType();
        if (!someRawTypeIsSubclassOf(rawType)) {
            return false;
        }
        TypeVariable<Class<? super Object>>[] typeParameters = rawType.getTypeParameters();
        Type[] actualTypeArguments = supertype.getActualTypeArguments();
        for (int i11 = 0; i11 < typeParameters.length; i11++) {
            if (!of(getCovariantTypeResolver().j(typeParameters[i11])).is(actualTypeArguments[i11], typeParameters[i11])) {
                return false;
            }
        }
        return Modifier.isStatic(((Class) supertype.getRawType()).getModifiers()) || supertype.getOwnerType() == null || isOwnedBySubtypeOf(supertype.getOwnerType());
    }

    private boolean isSupertypeOfArray(GenericArrayType subtype) {
        Type type = this.runtimeType;
        if (type instanceof Class) {
            Class cls = (Class) type;
            return !cls.isArray() ? cls.isAssignableFrom(Object[].class) : of(subtype.getGenericComponentType()).isSubtypeOf(cls.getComponentType());
        }
        if (type instanceof GenericArrayType) {
            return of(subtype.getGenericComponentType()).isSubtypeOf(((GenericArrayType) this.runtimeType).getGenericComponentType());
        }
        return false;
    }

    private boolean isWrapper() {
        return ro.n.c().contains(this.runtimeType);
    }

    private static Type newArrayClassOrGenericArrayType(Type componentType) {
        return s.d.f34441b.c(componentType);
    }

    public static <T> TypeToken<T> of(Class<T> type) {
        return new h(type);
    }

    private TypeToken<?> resolveSupertype(Type type) {
        TypeToken<?> of2 = of(getCovariantTypeResolver().j(type));
        of2.covariantTypeResolver = this.covariantTypeResolver;
        of2.invariantTypeResolver = this.invariantTypeResolver;
        return of2;
    }

    private Type resolveTypeArgsForSubclass(Class<?> subclass) {
        if ((this.runtimeType instanceof Class) && (subclass.getTypeParameters().length == 0 || getRawType().getTypeParameters().length != 0)) {
            return subclass;
        }
        TypeToken genericType = toGenericType(subclass);
        return new o().n(genericType.getSupertype(getRawType()).runtimeType, this.runtimeType).j(genericType.runtimeType);
    }

    private boolean someRawTypeIsSubclassOf(Class<?> superclass) {
        aa<Class<? super T>> it = getRawTypes().iterator();
        while (it.hasNext()) {
            if (superclass.isAssignableFrom(it.next())) {
                return true;
            }
        }
        return false;
    }

    @go.e
    public static <T> TypeToken<? extends T> toGenericType(Class<T> cls) {
        if (cls.isArray()) {
            return (TypeToken<? extends T>) of(s.j(toGenericType(cls.getComponentType()).runtimeType));
        }
        TypeVariable<Class<T>>[] typeParameters = cls.getTypeParameters();
        Type type = (!cls.isMemberClass() || Modifier.isStatic(cls.getModifiers())) ? null : toGenericType(cls.getEnclosingClass()).runtimeType;
        return (typeParameters.length > 0 || !(type == null || type == cls.getEnclosingClass())) ? (TypeToken<? extends T>) of(s.m(type, cls, typeParameters)) : of((Class) cls);
    }

    public final com.google.common.reflect.g<T, T> constructor(Constructor<?> constructor) {
        Preconditions.checkArgument(constructor.getDeclaringClass() == getRawType(), "%s not declared by %s", constructor, getRawType());
        return new b(constructor);
    }

    public boolean equals(@CheckForNull Object o11) {
        if (o11 instanceof TypeToken) {
            return this.runtimeType.equals(((TypeToken) o11).runtimeType);
        }
        return false;
    }

    @CheckForNull
    public final TypeToken<?> getComponentType() {
        Type i11 = s.i(this.runtimeType);
        if (i11 == null) {
            return null;
        }
        return of(i11);
    }

    public final ImmutableList<TypeToken<? super T>> getGenericInterfaces() {
        Type type = this.runtimeType;
        if (type instanceof TypeVariable) {
            return boundsAsInterfaces(((TypeVariable) type).getBounds());
        }
        if (type instanceof WildcardType) {
            return boundsAsInterfaces(((WildcardType) type).getUpperBounds());
        }
        ImmutableList.a builder = ImmutableList.builder();
        for (Type type2 : getRawType().getGenericInterfaces()) {
            builder.g(resolveSupertype(type2));
        }
        return builder.e();
    }

    @CheckForNull
    public final TypeToken<? super T> getGenericSuperclass() {
        Type type = this.runtimeType;
        if (type instanceof TypeVariable) {
            return boundAsSuperclass(((TypeVariable) type).getBounds()[0]);
        }
        if (type instanceof WildcardType) {
            return boundAsSuperclass(((WildcardType) type).getUpperBounds()[0]);
        }
        Type genericSuperclass = getRawType().getGenericSuperclass();
        if (genericSuperclass == null) {
            return null;
        }
        return (TypeToken<? super T>) resolveSupertype(genericSuperclass);
    }

    public final Class<? super T> getRawType() {
        return getRawTypes().iterator().next();
    }

    public final TypeToken<? extends T> getSubtype(Class<?> cls) {
        Preconditions.checkArgument(!(this.runtimeType instanceof TypeVariable), "Cannot get subtype of type variable <%s>", this);
        Type type = this.runtimeType;
        if (type instanceof WildcardType) {
            return getSubtypeFromLowerBounds(cls, ((WildcardType) type).getLowerBounds());
        }
        if (isArray()) {
            return getArraySubtype(cls);
        }
        Preconditions.checkArgument(getRawType().isAssignableFrom(cls), "%s isn't a subclass of %s", cls, this);
        TypeToken<? extends T> typeToken = (TypeToken<? extends T>) of(resolveTypeArgsForSubclass(cls));
        Preconditions.checkArgument(typeToken.isSubtypeOf((TypeToken<?>) this), "%s does not appear to be a subtype of %s", typeToken, this);
        return typeToken;
    }

    public final TypeToken<? super T> getSupertype(Class<? super T> cls) {
        Preconditions.checkArgument(someRawTypeIsSubclassOf(cls), "%s is not a super class of %s", cls, this);
        Type type = this.runtimeType;
        return type instanceof TypeVariable ? getSupertypeFromUpperBounds(cls, ((TypeVariable) type).getBounds()) : type instanceof WildcardType ? getSupertypeFromUpperBounds(cls, ((WildcardType) type).getUpperBounds()) : cls.isArray() ? getArraySupertype(cls) : (TypeToken<? super T>) resolveSupertype(toGenericType(cls).runtimeType);
    }

    public final Type getType() {
        return this.runtimeType;
    }

    public final TypeToken<T>.TypeSet getTypes() {
        return new TypeSet();
    }

    public int hashCode() {
        return this.runtimeType.hashCode();
    }

    public final boolean isArray() {
        return getComponentType() != null;
    }

    public final boolean isPrimitive() {
        Type type = this.runtimeType;
        return (type instanceof Class) && ((Class) type).isPrimitive();
    }

    public final boolean isSubtypeOf(TypeToken<?> type) {
        return isSubtypeOf(type.getType());
    }

    public final boolean isSupertypeOf(TypeToken<?> type) {
        return type.isSubtypeOf(getType());
    }

    public final com.google.common.reflect.g<T, Object> method(Method method) {
        Preconditions.checkArgument(someRawTypeIsSubclassOf(method.getDeclaringClass()), "%s not declared by %s", method, this);
        return new a(method);
    }

    @uo.a
    public final TypeToken<T> rejectTypeVariables() {
        new c().a(this.runtimeType);
        return this;
    }

    public final TypeToken<?> resolveType(Type type) {
        Preconditions.checkNotNull(type);
        return of(getInvariantTypeResolver().j(type));
    }

    public String toString() {
        return s.s(this.runtimeType);
    }

    public final TypeToken<T> unwrap() {
        return isWrapper() ? of(ro.n.e((Class) this.runtimeType)) : this;
    }

    public final <X> TypeToken<T> where(n<X> typeParam, TypeToken<X> typeArg) {
        return new h(new o().o(ImmutableMap.of(new o.d(typeParam.f34418a), typeArg.runtimeType)).j(this.runtimeType));
    }

    public final TypeToken<T> wrap() {
        return isPrimitive() ? of(ro.n.f((Class) this.runtimeType)) : this;
    }

    public Object writeReplace() {
        return of(new o().j(this.runtimeType));
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class TypeSet extends e5<TypeToken<? super T>> implements Serializable {
        private static final long serialVersionUID = 0;

        @CheckForNull
        private transient ImmutableSet<TypeToken<? super T>> types;

        public TypeSet() {
        }

        public TypeToken<T>.TypeSet classes() {
            return new f(TypeToken.this, null);
        }

        public TypeToken<T>.TypeSet interfaces() {
            return new g(this);
        }

        public Set<Class<? super T>> rawTypes() {
            return ImmutableSet.copyOf((Collection) i.f34384b.c(TypeToken.this.getRawTypes()));
        }

        @Override // com.google.common.collect.e5, com.google.common.collect.l4, com.google.common.collect.c5
        public Set<TypeToken<? super T>> delegate() {
            ImmutableSet<TypeToken<? super T>> immutableSet = this.types;
            if (immutableSet != null) {
                return immutableSet;
            }
            ImmutableSet<TypeToken<? super T>> I = i4.u(i.f34383a.d(TypeToken.this)).p(j.f34389a).I();
            this.types = I;
            return I;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class g extends TypeToken<T>.TypeSet {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final transient TypeToken<T>.TypeSet f34380a;

        /* renamed from: b, reason: collision with root package name */
        @CheckForNull
        public transient ImmutableSet<TypeToken<? super T>> f34381b;

        public g(TypeToken<T>.TypeSet allTypes) {
            super();
            this.f34380a = allTypes;
        }

        private Object readResolve() {
            return TypeToken.this.getTypes().interfaces();
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet
        public TypeToken<T>.TypeSet classes() {
            throw new UnsupportedOperationException("interfaces().classes() not supported.");
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet
        public Set<Class<? super T>> rawTypes() {
            return i4.u(i.f34384b.c(TypeToken.this.getRawTypes())).p(new i0() { // from class: com.google.common.reflect.q
                @Override // ho.i0
                public final boolean apply(Object obj) {
                    return ((Class) obj).isInterface();
                }
            }).I();
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet, com.google.common.collect.e5, com.google.common.collect.l4, com.google.common.collect.c5
        public Set<TypeToken<? super T>> delegate() {
            ImmutableSet<TypeToken<? super T>> immutableSet = this.f34381b;
            if (immutableSet != null) {
                return immutableSet;
            }
            ImmutableSet<TypeToken<? super T>> I = i4.u(this.f34380a).p(j.f34390b).I();
            this.f34381b = I;
            return I;
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet
        public TypeToken<T>.TypeSet interfaces() {
            return this;
        }
    }

    public TypeToken() {
        Type capture = capture();
        this.runtimeType = capture;
        Preconditions.checkState(!(capture instanceof TypeVariable), "Cannot construct a TypeToken for a type variable.\nYou probably meant to call new TypeToken<%s>(getClass()) that can resolve the type variable for you.\nIf you do need to create a TypeToken of a type variable, please use TypeToken.of() instead.", capture);
    }

    public static TypeToken<?> of(Type type) {
        return new h(type);
    }

    public final boolean isSubtypeOf(Type supertype) {
        Preconditions.checkNotNull(supertype);
        if (supertype instanceof WildcardType) {
            return any(((WildcardType) supertype).getLowerBounds()).b(this.runtimeType);
        }
        Type type = this.runtimeType;
        if (type instanceof WildcardType) {
            return any(((WildcardType) type).getUpperBounds()).a(supertype);
        }
        if (type instanceof TypeVariable) {
            return type.equals(supertype) || any(((TypeVariable) this.runtimeType).getBounds()).a(supertype);
        }
        if (type instanceof GenericArrayType) {
            return of(supertype).isSupertypeOfArray((GenericArrayType) this.runtimeType);
        }
        if (supertype instanceof Class) {
            return someRawTypeIsSubclassOf((Class) supertype);
        }
        if (supertype instanceof ParameterizedType) {
            return isSubtypeOfParameterizedType((ParameterizedType) supertype);
        }
        if (supertype instanceof GenericArrayType) {
            return isSubtypeOfArrayType((GenericArrayType) supertype);
        }
        return false;
    }

    public final boolean isSupertypeOf(Type type) {
        return of(type).isSubtypeOf(getType());
    }

    public TypeToken(Class<?> declaringClass) {
        Type capture = super.capture();
        if (capture instanceof Class) {
            this.runtimeType = capture;
        } else {
            this.runtimeType = o.d(declaringClass).j(capture);
        }
    }

    public final <X> TypeToken<T> where(n<X> typeParam, Class<X> typeArg) {
        return where(typeParam, of((Class) typeArg));
    }

    private TypeToken(Type type) {
        this.runtimeType = (Type) Preconditions.checkNotNull(type);
    }
}
