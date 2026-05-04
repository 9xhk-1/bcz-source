package com.google.gson.internal;

import com.google.gson.JsonIOException;
import com.google.gson.ReflectionAccessFilter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Map<Type, com.google.gson.f<?>> f34997a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f34998b;

    /* renamed from: c, reason: collision with root package name */
    public final List<ReflectionAccessFilter> f34999c;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a<T> implements com.google.gson.internal.h<T> {
        @Override // com.google.gson.internal.h
        public T a() {
            return (T) new TreeSet();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b<T> implements com.google.gson.internal.h<T> {
        @Override // com.google.gson.internal.h
        public T a() {
            return (T) new LinkedHashSet();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.google.gson.internal.c$c, reason: collision with other inner class name */
    public class C0434c<T> implements com.google.gson.internal.h<T> {
        @Override // com.google.gson.internal.h
        public T a() {
            return (T) new ArrayDeque();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d<T> implements com.google.gson.internal.h<T> {
        @Override // com.google.gson.internal.h
        public T a() {
            return (T) new ArrayList();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e<T> implements com.google.gson.internal.h<T> {
        @Override // com.google.gson.internal.h
        public T a() {
            return (T) new ConcurrentSkipListMap();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class f<T> implements com.google.gson.internal.h<T> {
        @Override // com.google.gson.internal.h
        public T a() {
            return (T) new ConcurrentHashMap();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class g<T> implements com.google.gson.internal.h<T> {
        @Override // com.google.gson.internal.h
        public T a() {
            return (T) new TreeMap();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class h<T> implements com.google.gson.internal.h<T> {
        @Override // com.google.gson.internal.h
        public T a() {
            return (T) new LinkedHashMap();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class i<T> implements com.google.gson.internal.h<T> {
        @Override // com.google.gson.internal.h
        public T a() {
            return (T) new LinkedTreeMap();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class j<T> implements com.google.gson.internal.h<T> {

        /* renamed from: a, reason: collision with root package name */
        public final com.google.gson.internal.m f35000a = com.google.gson.internal.m.d();

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Class f35001b;

        public j(Class cls) {
            this.f35001b = cls;
        }

        @Override // com.google.gson.internal.h
        public T a() {
            try {
                return (T) this.f35000a.e(this.f35001b);
            } catch (Exception e11) {
                throw new RuntimeException("Unable to create instance of " + this.f35001b + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e11);
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class k<T> implements com.google.gson.internal.h<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.google.gson.f f35003a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Type f35004b;

        public k(com.google.gson.f fVar, Type type) {
            this.f35003a = fVar;
            this.f35004b = type;
        }

        @Override // com.google.gson.internal.h
        public T a() {
            return (T) this.f35003a.a(this.f35004b);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class l<T> implements com.google.gson.internal.h<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f35006a;

        public l(String str) {
            this.f35006a = str;
        }

        @Override // com.google.gson.internal.h
        public T a() {
            throw new JsonIOException(this.f35006a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class m<T> implements com.google.gson.internal.h<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.google.gson.f f35008a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Type f35009b;

        public m(com.google.gson.f fVar, Type type) {
            this.f35008a = fVar;
            this.f35009b = type;
        }

        @Override // com.google.gson.internal.h
        public T a() {
            return (T) this.f35008a.a(this.f35009b);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class n<T> implements com.google.gson.internal.h<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f35011a;

        public n(String str) {
            this.f35011a = str;
        }

        @Override // com.google.gson.internal.h
        public T a() {
            throw new JsonIOException(this.f35011a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class o<T> implements com.google.gson.internal.h<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f35013a;

        public o(String str) {
            this.f35013a = str;
        }

        @Override // com.google.gson.internal.h
        public T a() {
            throw new JsonIOException(this.f35013a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class p<T> implements com.google.gson.internal.h<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Type f35015a;

        public p(Type type) {
            this.f35015a = type;
        }

        @Override // com.google.gson.internal.h
        public T a() {
            Type type = this.f35015a;
            if (!(type instanceof ParameterizedType)) {
                throw new JsonIOException("Invalid EnumSet type: " + this.f35015a.toString());
            }
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return (T) EnumSet.noneOf((Class) type2);
            }
            throw new JsonIOException("Invalid EnumSet type: " + this.f35015a.toString());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class q<T> implements com.google.gson.internal.h<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Type f35016a;

        public q(Type type) {
            this.f35016a = type;
        }

        @Override // com.google.gson.internal.h
        public T a() {
            Type type = this.f35016a;
            if (!(type instanceof ParameterizedType)) {
                throw new JsonIOException("Invalid EnumMap type: " + this.f35016a.toString());
            }
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return (T) new EnumMap((Class) type2);
            }
            throw new JsonIOException("Invalid EnumMap type: " + this.f35016a.toString());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class r<T> implements com.google.gson.internal.h<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f35017a;

        public r(String str) {
            this.f35017a = str;
        }

        @Override // com.google.gson.internal.h
        public T a() {
            throw new JsonIOException(this.f35017a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class s<T> implements com.google.gson.internal.h<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f35018a;

        public s(String str) {
            this.f35018a = str;
        }

        @Override // com.google.gson.internal.h
        public T a() {
            throw new JsonIOException(this.f35018a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class t<T> implements com.google.gson.internal.h<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Constructor f35019a;

        public t(Constructor constructor) {
            this.f35019a = constructor;
        }

        @Override // com.google.gson.internal.h
        public T a() {
            try {
                return (T) this.f35019a.newInstance(null);
            } catch (IllegalAccessException e11) {
                throw zo.a.b(e11);
            } catch (InstantiationException e12) {
                throw new RuntimeException("Failed to invoke " + this.f35019a + " with no args", e12);
            } catch (InvocationTargetException e13) {
                throw new RuntimeException("Failed to invoke " + this.f35019a + " with no args", e13.getTargetException());
            }
        }
    }

    public c(Map<Type, com.google.gson.f<?>> map, boolean z11, List<ReflectionAccessFilter> list) {
        this.f34997a = map;
        this.f34998b = z11;
        this.f34999c = list;
    }

    public static <T> com.google.gson.internal.h<T> b(Class<? super T> cls, ReflectionAccessFilter.FilterResult filterResult) {
        String d11;
        if (Modifier.isAbstract(cls.getModifiers())) {
            return null;
        }
        try {
            Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(null);
            ReflectionAccessFilter.FilterResult filterResult2 = ReflectionAccessFilter.FilterResult.ALLOW;
            if (filterResult == filterResult2 || (com.google.gson.internal.k.a(declaredConstructor, null) && (filterResult != ReflectionAccessFilter.FilterResult.BLOCK_ALL || Modifier.isPublic(declaredConstructor.getModifiers())))) {
                return (filterResult != filterResult2 || (d11 = zo.a.d(declaredConstructor)) == null) ? new t(declaredConstructor) : new s(d11);
            }
            return new r("Unable to invoke no-args constructor of " + cls + "; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter.");
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static <T> com.google.gson.internal.h<T> c(Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            return SortedSet.class.isAssignableFrom(cls) ? new a() : Set.class.isAssignableFrom(cls) ? new b() : Queue.class.isAssignableFrom(cls) ? new C0434c() : new d();
        }
        if (Map.class.isAssignableFrom(cls)) {
            return ConcurrentNavigableMap.class.isAssignableFrom(cls) ? new e() : ConcurrentMap.class.isAssignableFrom(cls) ? new f() : SortedMap.class.isAssignableFrom(cls) ? new g() : (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(bp.a.get(((ParameterizedType) type).getActualTypeArguments()[0]).getRawType())) ? new i() : new h();
        }
        return null;
    }

    public static <T> com.google.gson.internal.h<T> d(Type type, Class<? super T> cls) {
        if (EnumSet.class.isAssignableFrom(cls)) {
            return new p(type);
        }
        if (cls == EnumMap.class) {
            return new q(type);
        }
        return null;
    }

    public <T> com.google.gson.internal.h<T> a(bp.a<T> aVar) {
        Type type = aVar.getType();
        Class<? super T> rawType = aVar.getRawType();
        com.google.gson.f<?> fVar = this.f34997a.get(type);
        if (fVar != null) {
            return new k(fVar, type);
        }
        com.google.gson.f<?> fVar2 = this.f34997a.get(rawType);
        if (fVar2 != null) {
            return new m(fVar2, type);
        }
        com.google.gson.internal.h<T> d11 = d(type, rawType);
        if (d11 != null) {
            return d11;
        }
        ReflectionAccessFilter.FilterResult b11 = com.google.gson.internal.k.b(this.f34999c, rawType);
        com.google.gson.internal.h<T> b12 = b(rawType, b11);
        if (b12 != null) {
            return b12;
        }
        com.google.gson.internal.h<T> c11 = c(type, rawType);
        if (c11 != null) {
            return c11;
        }
        String c12 = com.google.gson.internal.m.c(rawType);
        if (c12 != null) {
            return new n(c12);
        }
        if (b11 == ReflectionAccessFilter.FilterResult.ALLOW) {
            return e(rawType);
        }
        return new o("Unable to create instance of " + rawType + "; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection.");
    }

    public final <T> com.google.gson.internal.h<T> e(Class<? super T> cls) {
        if (this.f34998b) {
            return new j(cls);
        }
        return new l("Unable to create instance of " + cls + "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.");
    }

    public String toString() {
        return this.f34997a.toString();
    }
}
