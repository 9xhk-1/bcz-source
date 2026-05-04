package com.google.common.reflect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.u6;
import com.google.common.reflect.s;
import ho.a0;
import ho.d0;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.CheckForNull;
import u30.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@com.google.common.reflect.d
/* loaded from: classes7.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final c f34419a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends r {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Map f34420b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Type f34421c;

        public a(final Map val$mappings, final Type val$to) {
            this.f34420b = val$mappings;
            this.f34421c = val$to;
        }

        @Override // com.google.common.reflect.r
        public void b(Class<?> fromClass) {
            if (this.f34421c instanceof WildcardType) {
                return;
            }
            throw new IllegalArgumentException("No type mapping from " + fromClass + " to " + this.f34421c);
        }

        @Override // com.google.common.reflect.r
        public void c(GenericArrayType fromArrayType) {
            Type type = this.f34421c;
            if (type instanceof WildcardType) {
                return;
            }
            Type i11 = s.i(type);
            Preconditions.checkArgument(i11 != null, "%s is not an array type.", this.f34421c);
            o.g(this.f34420b, fromArrayType.getGenericComponentType(), i11);
        }

        @Override // com.google.common.reflect.r
        public void d(ParameterizedType fromParameterizedType) {
            Type type = this.f34421c;
            if (type instanceof WildcardType) {
                return;
            }
            ParameterizedType parameterizedType = (ParameterizedType) o.e(ParameterizedType.class, type);
            if (fromParameterizedType.getOwnerType() != null && parameterizedType.getOwnerType() != null) {
                o.g(this.f34420b, fromParameterizedType.getOwnerType(), parameterizedType.getOwnerType());
            }
            Preconditions.checkArgument(fromParameterizedType.getRawType().equals(parameterizedType.getRawType()), "Inconsistent raw type: %s vs. %s", fromParameterizedType, this.f34421c);
            Type[] actualTypeArguments = fromParameterizedType.getActualTypeArguments();
            Type[] actualTypeArguments2 = parameterizedType.getActualTypeArguments();
            Preconditions.checkArgument(actualTypeArguments.length == actualTypeArguments2.length, "%s not compatible with %s", fromParameterizedType, parameterizedType);
            for (int i11 = 0; i11 < actualTypeArguments.length; i11++) {
                o.g(this.f34420b, actualTypeArguments[i11], actualTypeArguments2[i11]);
            }
        }

        @Override // com.google.common.reflect.r
        public void e(TypeVariable<?> typeVariable) {
            this.f34420b.put(new d(typeVariable), this.f34421c);
        }

        @Override // com.google.common.reflect.r
        public void f(WildcardType fromWildcardType) {
            Type type = this.f34421c;
            if (type instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type;
                Type[] upperBounds = fromWildcardType.getUpperBounds();
                Type[] upperBounds2 = wildcardType.getUpperBounds();
                Type[] lowerBounds = fromWildcardType.getLowerBounds();
                Type[] lowerBounds2 = wildcardType.getLowerBounds();
                Preconditions.checkArgument(upperBounds.length == upperBounds2.length && lowerBounds.length == lowerBounds2.length, "Incompatible type: %s vs. %s", fromWildcardType, this.f34421c);
                for (int i11 = 0; i11 < upperBounds.length; i11++) {
                    o.g(this.f34420b, upperBounds[i11], upperBounds2[i11]);
                }
                for (int i12 = 0; i12 < lowerBounds.length; i12++) {
                    o.g(this.f34420b, lowerBounds[i12], lowerBounds2[i12]);
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends r {

        /* renamed from: b, reason: collision with root package name */
        public final Map<d, Type> f34422b = u6.Y();

        public static ImmutableMap<d, Type> g(Type contextType) {
            Preconditions.checkNotNull(contextType);
            b bVar = new b();
            bVar.a(contextType);
            return ImmutableMap.copyOf((Map) bVar.f34422b);
        }

        @Override // com.google.common.reflect.r
        public void b(Class<?> clazz) {
            a(clazz.getGenericSuperclass());
            a(clazz.getGenericInterfaces());
        }

        @Override // com.google.common.reflect.r
        public void d(ParameterizedType parameterizedType) {
            Class cls = (Class) parameterizedType.getRawType();
            TypeVariable[] typeParameters = cls.getTypeParameters();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            Preconditions.checkState(typeParameters.length == actualTypeArguments.length);
            for (int i11 = 0; i11 < typeParameters.length; i11++) {
                h(new d(typeParameters[i11]), actualTypeArguments[i11]);
            }
            a(cls);
            a(parameterizedType.getOwnerType());
        }

        @Override // com.google.common.reflect.r
        public void e(TypeVariable<?> t11) {
            a(t11.getBounds());
        }

        @Override // com.google.common.reflect.r
        public void f(WildcardType t11) {
            a(t11.getUpperBounds());
        }

        public final void h(d var, Type arg) {
            if (this.f34422b.containsKey(var)) {
                return;
            }
            Type type = arg;
            while (type != null) {
                if (var.a(type)) {
                    while (arg != null) {
                        arg = this.f34422b.remove(d.c(arg));
                    }
                    return;
                }
                type = this.f34422b.get(d.c(type));
            }
            this.f34422b.put(var, arg);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final TypeVariable<?> f34427a;

        public d(TypeVariable<?> var) {
            this.f34427a = (TypeVariable) Preconditions.checkNotNull(var);
        }

        @CheckForNull
        public static d c(Type t11) {
            if (t11 instanceof TypeVariable) {
                return new d((TypeVariable) t11);
            }
            return null;
        }

        public boolean a(Type type) {
            if (type instanceof TypeVariable) {
                return b((TypeVariable) type);
            }
            return false;
        }

        public final boolean b(TypeVariable<?> that) {
            return this.f34427a.getGenericDeclaration().equals(that.getGenericDeclaration()) && this.f34427a.getName().equals(that.getName());
        }

        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof d) {
                return b(((d) obj).f34427a);
            }
            return false;
        }

        public int hashCode() {
            return d0.b(this.f34427a.getGenericDeclaration(), this.f34427a.getName());
        }

        public String toString() {
            return this.f34427a.toString();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e {

        /* renamed from: b, reason: collision with root package name */
        public static final e f34428b = new e();

        /* renamed from: a, reason: collision with root package name */
        public final AtomicInteger f34429a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends e {

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ TypeVariable f34430c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ e f34431d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(final e this$0, AtomicInteger id2, final TypeVariable val$typeParam) {
                super(id2, null);
                this.f34430c = val$typeParam;
                this.f34431d = this$0;
            }

            @Override // com.google.common.reflect.o.e
            public TypeVariable<?> b(Type[] upperBounds) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(Arrays.asList(upperBounds));
                linkedHashSet.addAll(Arrays.asList(this.f34430c.getBounds()));
                if (linkedHashSet.size() > 1) {
                    linkedHashSet.remove(Object.class);
                }
                return super.b((Type[]) linkedHashSet.toArray(new Type[0]));
            }
        }

        public /* synthetic */ e(AtomicInteger atomicInteger, a aVar) {
            this(atomicInteger);
        }

        public final Type a(Type type) {
            Preconditions.checkNotNull(type);
            if (type instanceof Class) {
                return type;
            }
            if (type instanceof TypeVariable) {
                return type;
            }
            if (type instanceof GenericArrayType) {
                return s.j(e().a(((GenericArrayType) type).getGenericComponentType()));
            }
            if (!(type instanceof ParameterizedType)) {
                if (!(type instanceof WildcardType)) {
                    throw new AssertionError("must have been one of the known types");
                }
                WildcardType wildcardType = (WildcardType) type;
                return wildcardType.getLowerBounds().length == 0 ? b(wildcardType.getUpperBounds()) : type;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Class cls = (Class) parameterizedType.getRawType();
            TypeVariable<?>[] typeParameters = cls.getTypeParameters();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            for (int i11 = 0; i11 < actualTypeArguments.length; i11++) {
                actualTypeArguments[i11] = d(typeParameters[i11]).a(actualTypeArguments[i11]);
            }
            return s.m(e().c(parameterizedType.getOwnerType()), cls, actualTypeArguments);
        }

        public TypeVariable<?> b(Type[] upperBounds) {
            return s.k(e.class, "capture#" + this.f34429a.incrementAndGet() + "-of ? extends " + a0.o(u0.f91708d).n(upperBounds), upperBounds);
        }

        @CheckForNull
        public final Type c(@CheckForNull Type type) {
            if (type == null) {
                return null;
            }
            return a(type);
        }

        public final e d(TypeVariable<?> typeParam) {
            return new a(this, this.f34429a, typeParam);
        }

        public final e e() {
            return new e(this.f34429a);
        }

        public e() {
            this(new AtomicInteger());
        }

        public e(AtomicInteger id2) {
            this.f34429a = id2;
        }
    }

    public /* synthetic */ o(c cVar, a aVar) {
        this(cVar);
    }

    public static o d(Type contextType) {
        return new o().o(b.g(contextType));
    }

    public static <T> T e(Class<T> type, Object arg) {
        try {
            return type.cast(arg);
        } catch (ClassCastException unused) {
            throw new IllegalArgumentException(arg + " is not a " + type.getSimpleName());
        }
    }

    public static o f(Type contextType) {
        return new o().o(b.g(e.f34428b.a(contextType)));
    }

    public static void g(Map<d, Type> mappings, Type from, Type to2) {
        if (from.equals(to2)) {
            return;
        }
        new a(mappings, to2).a(from);
    }

    public final Type h(GenericArrayType type) {
        return s.j(j(type.getGenericComponentType()));
    }

    public final ParameterizedType i(ParameterizedType type) {
        Type ownerType = type.getOwnerType();
        return s.m(ownerType == null ? null : j(ownerType), (Class) j(type.getRawType()), k(type.getActualTypeArguments()));
    }

    public Type j(Type type) {
        Preconditions.checkNotNull(type);
        return type instanceof TypeVariable ? this.f34419a.a((TypeVariable) type) : type instanceof ParameterizedType ? i((ParameterizedType) type) : type instanceof GenericArrayType ? h((GenericArrayType) type) : type instanceof WildcardType ? m((WildcardType) type) : type;
    }

    public final Type[] k(Type[] types) {
        Type[] typeArr = new Type[types.length];
        for (int i11 = 0; i11 < types.length; i11++) {
            typeArr[i11] = j(types[i11]);
        }
        return typeArr;
    }

    public Type[] l(Type[] types) {
        for (int i11 = 0; i11 < types.length; i11++) {
            types[i11] = j(types[i11]);
        }
        return types;
    }

    public final WildcardType m(WildcardType type) {
        return new s.i(k(type.getLowerBounds()), k(type.getUpperBounds()));
    }

    public o n(Type formal, Type actual) {
        HashMap Y = u6.Y();
        g(Y, (Type) Preconditions.checkNotNull(formal), (Type) Preconditions.checkNotNull(actual));
        return o(Y);
    }

    public o o(Map<d, ? extends Type> mappings) {
        return new o(this.f34419a.c(mappings));
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final ImmutableMap<d, Type> f34423a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends c {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TypeVariable f34424b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ c f34425c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ c f34426d;

            public a(final c this$0, final TypeVariable val$var, final c val$unguarded) {
                this.f34424b = val$var;
                this.f34425c = val$unguarded;
                this.f34426d = this$0;
            }

            @Override // com.google.common.reflect.o.c
            public Type b(TypeVariable<?> intermediateVar, c forDependent) {
                return intermediateVar.getGenericDeclaration().equals(this.f34424b.getGenericDeclaration()) ? intermediateVar : this.f34425c.b(intermediateVar, forDependent);
            }
        }

        public c() {
            this.f34423a = ImmutableMap.of();
        }

        public final Type a(TypeVariable<?> var) {
            return b(var, new a(this, var, this));
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.reflect.GenericDeclaration] */
        public Type b(TypeVariable<?> var, c forDependants) {
            Type type = this.f34423a.get(new d(var));
            a aVar = null;
            if (type != null) {
                return new o(forDependants, aVar).j(type);
            }
            Type[] bounds = var.getBounds();
            if (bounds.length != 0) {
                Type[] k11 = new o(forDependants, aVar).k(bounds);
                if (!s.e.f34446a || !Arrays.equals(bounds, k11)) {
                    return s.k(var.getGenericDeclaration(), var.getName(), k11);
                }
            }
            return var;
        }

        public final c c(Map<d, ? extends Type> mappings) {
            ImmutableMap.b builder = ImmutableMap.builder();
            builder.l(this.f34423a);
            for (Map.Entry<d, ? extends Type> entry : mappings.entrySet()) {
                d key = entry.getKey();
                Type value = entry.getValue();
                Preconditions.checkArgument(!key.a(value), "Type variable %s bound to itself", key);
                builder.i(key, value);
            }
            return new c(builder.d());
        }

        public c(ImmutableMap<d, Type> map) {
            this.f34423a = map;
        }
    }

    public o() {
        this.f34419a = new c();
    }

    public o(c typeTable) {
        this.f34419a = typeTable;
    }
}
