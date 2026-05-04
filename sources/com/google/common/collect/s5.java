package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.Enum;
import java.util.EnumMap;
import java.util.Map;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b(emulated = true, serializable = true)
/* loaded from: classes7.dex */
public final class s5<K extends Enum<K>, V> extends ImmutableMap.c<K, V> {

    /* renamed from: a, reason: collision with root package name */
    public final transient EnumMap<K, V> f33828a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @go.d
    public static class b<K extends Enum<K>, V> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final EnumMap<K, V> f33829a;

        public b(EnumMap<K, V> delegate) {
            this.f33829a = delegate;
        }

        public Object readResolve() {
            return new s5(this.f33829a);
        }
    }

    public static <K extends Enum<K>, V> ImmutableMap<K, V> d(EnumMap<K, V> map) {
        int size = map.size();
        if (size == 0) {
            return ImmutableMap.of();
        }
        if (size != 1) {
            return new s5(map);
        }
        Map.Entry entry = (Map.Entry) k6.z(map.entrySet());
        return ImmutableMap.of((Enum) entry.getKey(), entry.getValue());
    }

    @go.d
    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Use EnumSerializedForm");
    }

    @Override // com.google.common.collect.ImmutableMap.c
    public aa<Map.Entry<K, V>> b() {
        return u6.L0(this.f33828a.entrySet().iterator());
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public boolean containsKey(@CheckForNull Object key) {
        return this.f33828a.containsKey(key);
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public boolean equals(@CheckForNull Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof s5) {
            object = ((s5) object).f33828a;
        }
        return this.f33828a.equals(object);
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    @CheckForNull
    public V get(@CheckForNull Object key) {
        return this.f33828a.get(key);
    }

    @Override // com.google.common.collect.ImmutableMap
    public boolean isPartialView() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableMap
    public aa<K> keyIterator() {
        return l6.e0(this.f33828a.keySet().iterator());
    }

    @Override // java.util.Map
    public int size() {
        return this.f33828a.size();
    }

    @Override // com.google.common.collect.ImmutableMap.c, com.google.common.collect.ImmutableMap
    @go.d
    public Object writeReplace() {
        return new b(this.f33828a);
    }

    public s5(EnumMap<K, V> delegate) {
        this.f33828a = delegate;
        Preconditions.checkArgument(!delegate.isEmpty());
    }
}
