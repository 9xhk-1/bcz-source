package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.d
@u3
@go.c
/* loaded from: classes7.dex */
public final class MutableClassToInstanceMap<B> extends w4<Class<? extends B>, B> implements x<B>, Serializable {
    private final Map<Class<? extends B>, B> delegate;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends x4<Class<? extends B>, B> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Map.Entry f33159a;

        public a(final Map.Entry val$entry) {
            this.f33159a = val$entry;
        }

        @Override // com.google.common.collect.x4, java.util.Map.Entry
        @t7
        public B setValue(@t7 B b11) {
            MutableClassToInstanceMap.cast(getKey(), b11);
            return (B) super.setValue(b11);
        }

        @Override // com.google.common.collect.x4, com.google.common.collect.c5
        /* renamed from: w */
        public Map.Entry<Class<? extends B>, B> delegate() {
            return this.f33159a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends e5<Map.Entry<Class<? extends B>, B>> {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends v9<Map.Entry<Class<? extends B>, B>, Map.Entry<Class<? extends B>, B>> {
            public a(Iterator backingIterator) {
                super(backingIterator);
            }

            @Override // com.google.common.collect.v9
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry<Class<? extends B>, B> a(Map.Entry<Class<? extends B>, B> from) {
                return MutableClassToInstanceMap.checkedEntry(from);
            }
        }

        public b() {
        }

        @Override // com.google.common.collect.l4, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<Class<? extends B>, B>> iterator() {
            return new a(delegate().iterator());
        }

        @Override // com.google.common.collect.l4, java.util.Collection
        public Object[] toArray() {
            return standardToArray();
        }

        @Override // com.google.common.collect.l4, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) standardToArray(tArr);
        }

        @Override // com.google.common.collect.e5, com.google.common.collect.l4, com.google.common.collect.c5
        public Set<Map.Entry<Class<? extends B>, B>> delegate() {
            return MutableClassToInstanceMap.this.delegate().entrySet();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c<B> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final Map<Class<? extends B>, B> f33162a;

        public c(Map<Class<? extends B>, B> backingMap) {
            this.f33162a = backingMap;
        }

        public Object readResolve() {
            return MutableClassToInstanceMap.create(this.f33162a);
        }
    }

    private MutableClassToInstanceMap(Map<Class<? extends B>, B> delegate) {
        this.delegate = (Map) Preconditions.checkNotNull(delegate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @CheckForNull
    @uo.a
    public static <T> T cast(Class<T> cls, @CheckForNull Object obj) {
        return (T) ro.n.f(cls).cast(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <B> Map.Entry<Class<? extends B>, B> checkedEntry(final Map.Entry<Class<? extends B>, B> entry) {
        return new a(entry);
    }

    public static <B> MutableClassToInstanceMap<B> create() {
        return new MutableClassToInstanceMap<>(new HashMap());
    }

    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    private Object writeReplace() {
        return new c(delegate());
    }

    @Override // com.google.common.collect.w4, java.util.Map
    public Set<Map.Entry<Class<? extends B>, B>> entrySet() {
        return new b();
    }

    @Override // com.google.common.collect.x
    @CheckForNull
    public <T extends B> T getInstance(Class<T> cls) {
        return (T) cast(cls, get(cls));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.w4, java.util.Map, com.google.common.collect.u
    @CheckForNull
    @uo.a
    public /* bridge */ /* synthetic */ Object put(Object key, @t7 Object value) {
        return put((Class<? extends Class<? extends B>>) key, (Class<? extends B>) value);
    }

    @Override // com.google.common.collect.w4, java.util.Map, com.google.common.collect.u
    public void putAll(Map<? extends Class<? extends B>, ? extends B> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            cast((Class) entry.getKey(), entry.getValue());
        }
        super.putAll(linkedHashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.x
    @CheckForNull
    @uo.a
    public <T extends B> T putInstance(Class<T> cls, @t7 T t11) {
        return (T) cast(cls, put((Class<? extends Class<T>>) cls, (Class<T>) t11));
    }

    public static <B> MutableClassToInstanceMap<B> create(Map<Class<? extends B>, B> backingMap) {
        return new MutableClassToInstanceMap<>(backingMap);
    }

    @Override // com.google.common.collect.w4, com.google.common.collect.c5
    public Map<Class<? extends B>, B> delegate() {
        return this.delegate;
    }

    @CheckForNull
    @uo.a
    public B put(Class<? extends B> cls, @t7 B b11) {
        cast(cls, b11);
        return (B) super.put((MutableClassToInstanceMap<B>) cls, (Class<? extends B>) b11);
    }
}
