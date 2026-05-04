package tv;

import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class o<K, V> {

    /* renamed from: a, reason: collision with root package name */
    public final Map<K, V> f90971a;

    public o(int size) {
        this.f90971a = d.d(size);
    }

    public static <K, V> o<K, V> b(int size) {
        return new o<>(size);
    }

    public Map<K, V> a() {
        return this.f90971a.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f90971a);
    }

    public o<K, V> c(K key, V value) {
        this.f90971a.put(key, value);
        return this;
    }

    public o<K, V> d(Map<K, V> map) {
        this.f90971a.putAll(map);
        return this;
    }
}
