package ho;

import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.d
@j
@go.c
/* loaded from: classes7.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @go.c
    public static final Map<Class<? extends Enum<?>>, Map<String, WeakReference<? extends Enum<?>>>> f59640a = new WeakHashMap();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @go.c
    public static final class a<T extends Enum<T>> extends h<String, T> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: c, reason: collision with root package name */
        public final Class<T> f59641c;

        public a(Class<T> enumClass) {
            this.f59641c = (Class) Preconditions.checkNotNull(enumClass);
        }

        @Override // ho.h, ho.r
        public boolean equals(@CheckForNull Object object) {
            if (object instanceof a) {
                return this.f59641c.equals(((a) object).f59641c);
            }
            return false;
        }

        public int hashCode() {
            return this.f59641c.hashCode();
        }

        @Override // ho.h
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public String g(T enumValue) {
            return enumValue.name();
        }

        @Override // ho.h
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public T h(String str) {
            return (T) Enum.valueOf(this.f59641c, str);
        }

        public String toString() {
            return "Enums.stringConverter(" + this.f59641c.getName() + ".class)";
        }
    }

    @go.c
    public static <T extends Enum<T>> Map<String, WeakReference<? extends Enum<?>>> a(Class<T> enumClass) {
        Map<String, WeakReference<? extends Enum<?>>> map;
        Map<Class<? extends Enum<?>>, Map<String, WeakReference<? extends Enum<?>>>> map2 = f59640a;
        synchronized (map2) {
            try {
                map = map2.get(enumClass);
                if (map == null) {
                    map = d(enumClass);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return map;
    }

    @go.c
    public static Field b(Enum<?> enumValue) {
        try {
            return enumValue.getDeclaringClass().getDeclaredField(enumValue.name());
        } catch (NoSuchFieldException e11) {
            throw new AssertionError(e11);
        }
    }

    public static <T extends Enum<T>> Optional<T> c(Class<T> enumClass, String value) {
        Preconditions.checkNotNull(enumClass);
        Preconditions.checkNotNull(value);
        return h0.d(enumClass, value);
    }

    @go.c
    public static <T extends Enum<T>> Map<String, WeakReference<? extends Enum<?>>> d(Class<T> enumClass) {
        HashMap hashMap = new HashMap();
        Iterator it = EnumSet.allOf(enumClass).iterator();
        while (it.hasNext()) {
            Enum r22 = (Enum) it.next();
            hashMap.put(r22.name(), new WeakReference(r22));
        }
        f59640a.put(enumClass, hashMap);
        return hashMap;
    }

    @go.c
    public static <T extends Enum<T>> h<String, T> e(Class<T> enumClass) {
        return new a(enumClass);
    }
}
