package ro;

import com.google.common.base.Preconditions;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.b
@f
/* loaded from: classes7.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final Map<Class<?>, Class<?>> f84477a;

    /* renamed from: b, reason: collision with root package name */
    public static final Map<Class<?>, Class<?>> f84478b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(16);
        a(linkedHashMap, linkedHashMap2, Boolean.TYPE, Boolean.class);
        a(linkedHashMap, linkedHashMap2, Byte.TYPE, Byte.class);
        a(linkedHashMap, linkedHashMap2, Character.TYPE, Character.class);
        a(linkedHashMap, linkedHashMap2, Double.TYPE, Double.class);
        a(linkedHashMap, linkedHashMap2, Float.TYPE, Float.class);
        a(linkedHashMap, linkedHashMap2, Integer.TYPE, Integer.class);
        a(linkedHashMap, linkedHashMap2, Long.TYPE, Long.class);
        a(linkedHashMap, linkedHashMap2, Short.TYPE, Short.class);
        a(linkedHashMap, linkedHashMap2, Void.TYPE, Void.class);
        f84477a = Collections.unmodifiableMap(linkedHashMap);
        f84478b = Collections.unmodifiableMap(linkedHashMap2);
    }

    public static void a(Map<Class<?>, Class<?>> forward, Map<Class<?>, Class<?>> backward, Class<?> key, Class<?> value) {
        forward.put(key, value);
        backward.put(value, key);
    }

    public static Set<Class<?>> b() {
        return f84477a.keySet();
    }

    public static Set<Class<?>> c() {
        return f84478b.keySet();
    }

    public static boolean d(Class<?> type) {
        return f84478b.containsKey(Preconditions.checkNotNull(type));
    }

    public static <T> Class<T> e(Class<T> type) {
        Preconditions.checkNotNull(type);
        Class<T> cls = (Class) f84478b.get(type);
        return cls == null ? type : cls;
    }

    public static <T> Class<T> f(Class<T> type) {
        Preconditions.checkNotNull(type);
        Class<T> cls = (Class) f84477a.get(type);
        return cls == null ? type : cls;
    }
}
