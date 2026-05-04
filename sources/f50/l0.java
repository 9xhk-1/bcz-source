package f50;

import j50.f2;
import j50.u2;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSerializersJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerializersJvm.kt\nkotlinx/serialization/SerializersKt__SerializersJvmKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,201:1\n11228#2:202\n11563#2,3:203\n1563#3:206\n1634#3,3:207\n37#4:210\n36#4,3:211\n1#5:214\n*S KotlinDebug\n*F\n+ 1 SerializersJvm.kt\nkotlinx/serialization/SerializersKt__SerializersJvmKt\n*L\n113#1:202\n113#1:203,3\n140#1:206\n140#1:207,3\n169#1:210\n169#1:211,3\n*E\n"})
/* loaded from: classes8.dex */
public final /* synthetic */ class l0 {
    public static final i<Object> a(o50.f fVar, GenericArrayType genericArrayType, boolean z11) {
        i<Object> t11;
        h10.d dVar;
        Type genericComponentType = genericArrayType.getGenericComponentType();
        if (genericComponentType instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) genericComponentType).getUpperBounds();
            kotlin.jvm.internal.g0.o(upperBounds, "getUpperBounds(...)");
            genericComponentType = (Type) a00.a0.jc(upperBounds);
        }
        kotlin.jvm.internal.g0.m(genericComponentType);
        if (z11) {
            t11 = k0.o(fVar, genericComponentType);
        } else {
            t11 = k0.t(fVar, genericComponentType);
            if (t11 == null) {
                return null;
            }
        }
        if (genericComponentType instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) genericComponentType).getRawType();
            kotlin.jvm.internal.g0.n(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            dVar = w00.b.i((Class) rawType);
        } else {
            if (!(genericComponentType instanceof h10.d)) {
                throw new IllegalStateException("unsupported type in GenericArray: " + kotlin.jvm.internal.o0.d(genericComponentType.getClass()));
            }
            dVar = (h10.d) genericComponentType;
        }
        kotlin.jvm.internal.g0.n(dVar, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
        i<Object> b11 = g50.a.b(dVar, t11);
        kotlin.jvm.internal.g0.n(b11, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
        return b11;
    }

    public static final Class<?> b(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            kotlin.jvm.internal.g0.o(rawType, "getRawType(...)");
            return b(rawType);
        }
        if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            kotlin.jvm.internal.g0.o(upperBounds, "getUpperBounds(...)");
            Object jc2 = a00.a0.jc(upperBounds);
            kotlin.jvm.internal.g0.o(jc2, "first(...)");
            return b((Type) jc2);
        }
        if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            kotlin.jvm.internal.g0.o(genericComponentType, "getGenericComponentType(...)");
            return b(genericComponentType);
        }
        throw new IllegalArgumentException("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument " + type + " has type " + kotlin.jvm.internal.o0.d(type.getClass()));
    }

    public static final <T> i<T> c(o50.f fVar, Class<T> cls, List<? extends i<Object>> list) {
        i[] iVarArr = (i[]) list.toArray(new i[0]);
        i<T> d11 = f2.d(cls, (i[]) Arrays.copyOf(iVarArr, iVarArr.length));
        if (d11 != null) {
            return d11;
        }
        h10.d<T> i11 = w00.b.i(cls);
        i<T> b11 = u2.b(i11);
        if (b11 != null) {
            return b11;
        }
        i<T> c11 = fVar.c(i11, list);
        if (c11 != null) {
            return c11;
        }
        if (cls.isInterface()) {
            return new o(w00.b.i(cls));
        }
        return null;
    }

    @m80.k
    public static final i<Object> d(@m80.k Type type) {
        kotlin.jvm.internal.g0.p(type, "type");
        return k0.o(o50.h.a(), type);
    }

    @m80.k
    public static final i<Object> e(@m80.k o50.f fVar, @m80.k Type type) {
        kotlin.jvm.internal.g0.p(fVar, "<this>");
        kotlin.jvm.internal.g0.p(type, "type");
        i<Object> f11 = f(fVar, type, true);
        if (f11 != null) {
            return f11;
        }
        f2.t(b(type));
        throw new KotlinNothingValueException();
    }

    public static final i<Object> f(o50.f fVar, Type type, boolean z11) {
        ArrayList<i> arrayList;
        if (type instanceof GenericArrayType) {
            return a(fVar, (GenericArrayType) type, z11);
        }
        if (type instanceof Class) {
            return j(fVar, (Class) type, z11);
        }
        if (!(type instanceof ParameterizedType)) {
            if (type instanceof WildcardType) {
                Type[] upperBounds = ((WildcardType) type).getUpperBounds();
                kotlin.jvm.internal.g0.o(upperBounds, "getUpperBounds(...)");
                Object jc2 = a00.a0.jc(upperBounds);
                kotlin.jvm.internal.g0.o(jc2, "first(...)");
                return g(fVar, (Type) jc2, false, 2, null);
            }
            throw new IllegalArgumentException("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument " + type + " has type " + kotlin.jvm.internal.o0.d(type.getClass()));
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Type rawType = parameterizedType.getRawType();
        kotlin.jvm.internal.g0.n(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
        Class cls = (Class) rawType;
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        kotlin.jvm.internal.g0.m(actualTypeArguments);
        if (z11) {
            arrayList = new ArrayList(actualTypeArguments.length);
            for (Type type2 : actualTypeArguments) {
                kotlin.jvm.internal.g0.m(type2);
                arrayList.add(k0.o(fVar, type2));
            }
        } else {
            arrayList = new ArrayList(actualTypeArguments.length);
            for (Type type3 : actualTypeArguments) {
                kotlin.jvm.internal.g0.m(type3);
                i<Object> t11 = k0.t(fVar, type3);
                if (t11 == null) {
                    return null;
                }
                arrayList.add(t11);
            }
        }
        if (Set.class.isAssignableFrom(cls)) {
            i<Object> o11 = g50.a.o((i) arrayList.get(0));
            kotlin.jvm.internal.g0.n(o11, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return o11;
        }
        if (List.class.isAssignableFrom(cls) || Collection.class.isAssignableFrom(cls)) {
            i<Object> i11 = g50.a.i((i) arrayList.get(0));
            kotlin.jvm.internal.g0.n(i11, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return i11;
        }
        if (Map.class.isAssignableFrom(cls)) {
            i<Object> l11 = g50.a.l((i) arrayList.get(0), (i) arrayList.get(1));
            kotlin.jvm.internal.g0.n(l11, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return l11;
        }
        if (Map.Entry.class.isAssignableFrom(cls)) {
            i<Object> k11 = g50.a.k((i) arrayList.get(0), (i) arrayList.get(1));
            kotlin.jvm.internal.g0.n(k11, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return k11;
        }
        if (Pair.class.isAssignableFrom(cls)) {
            i<Object> n11 = g50.a.n((i) arrayList.get(0), (i) arrayList.get(1));
            kotlin.jvm.internal.g0.n(n11, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return n11;
        }
        if (Triple.class.isAssignableFrom(cls)) {
            i<Object> q11 = g50.a.q((i) arrayList.get(0), (i) arrayList.get(1), (i) arrayList.get(2));
            kotlin.jvm.internal.g0.n(q11, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return q11;
        }
        ArrayList arrayList2 = new ArrayList(a00.i0.d0(arrayList, 10));
        for (i iVar : arrayList) {
            kotlin.jvm.internal.g0.n(iVar, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any?>");
            arrayList2.add(iVar);
        }
        return c(fVar, cls, arrayList2);
    }

    public static /* synthetic */ i g(o50.f fVar, Type type, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return f(fVar, type, z11);
    }

    @m80.l
    public static final i<Object> h(@m80.k Type type) {
        kotlin.jvm.internal.g0.p(type, "type");
        return k0.t(o50.h.a(), type);
    }

    @m80.l
    public static final i<Object> i(@m80.k o50.f fVar, @m80.k Type type) {
        kotlin.jvm.internal.g0.p(fVar, "<this>");
        kotlin.jvm.internal.g0.p(type, "type");
        return f(fVar, type, false);
    }

    public static final i<Object> j(o50.f fVar, Class<?> cls, boolean z11) {
        i<Object> t11;
        if (!cls.isArray() || cls.getComponentType().isPrimitive()) {
            kotlin.jvm.internal.g0.n(cls, "null cannot be cast to non-null type java.lang.Class<kotlin.Any>");
            return c(fVar, cls, a00.h0.J());
        }
        Class<?> componentType = cls.getComponentType();
        kotlin.jvm.internal.g0.o(componentType, "getComponentType(...)");
        if (z11) {
            t11 = k0.o(fVar, componentType);
        } else {
            t11 = k0.t(fVar, componentType);
            if (t11 == null) {
                return null;
            }
        }
        h10.d i11 = w00.b.i(componentType);
        kotlin.jvm.internal.g0.n(i11, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
        i<Object> b11 = g50.a.b(i11, t11);
        kotlin.jvm.internal.g0.n(b11, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
        return b11;
    }
}
