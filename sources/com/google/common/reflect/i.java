package com.google.common.reflect;

import com.google.common.base.Preconditions;
import com.google.common.collect.e5;
import com.google.common.collect.l6;
import com.google.common.collect.u6;
import com.google.common.collect.w4;
import com.google.common.collect.x4;
import com.google.common.reflect.i;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d
/* loaded from: classes7.dex */
public final class i<B> extends w4<TypeToken<? extends B>, B> implements p<B> {

    /* renamed from: a, reason: collision with root package name */
    public final Map<TypeToken<? extends B>, B> f34410a = u6.Y();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<K, V> extends x4<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public final Map.Entry<K, V> f34411a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.google.common.reflect.i$a$a, reason: collision with other inner class name */
        public class C0426a extends e5<Map.Entry<K, V>> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Set f34412a;

            public C0426a(final Set val$entries) {
                this.f34412a = val$entries;
            }

            @Override // com.google.common.collect.l4, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
                return a.z(super.iterator());
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
            public Set<Map.Entry<K, V>> delegate() {
                return this.f34412a;
            }
        }

        public a(Map.Entry<K, V> delegate) {
            this.f34411a = (Map.Entry) Preconditions.checkNotNull(delegate);
        }

        public static <K, V> Set<Map.Entry<K, V>> A(Set<Map.Entry<K, V>> entries) {
            return new C0426a(entries);
        }

        public static /* synthetic */ a x(Map.Entry entry) {
            return new a(entry);
        }

        public static <K, V> Iterator<Map.Entry<K, V>> z(Iterator<Map.Entry<K, V>> entries) {
            return l6.b0(entries, new ho.r() { // from class: com.google.common.reflect.h
                @Override // ho.r
                public final Object apply(Object obj) {
                    return i.a.x((Map.Entry) obj);
                }
            });
        }

        @Override // com.google.common.collect.x4, java.util.Map.Entry
        @k
        public V setValue(@k V value) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.x4, com.google.common.collect.c5
        /* renamed from: w */
        public Map.Entry<K, V> delegate() {
            return this.f34411a;
        }
    }

    @CheckForNull
    private <T extends B> T x(TypeToken<T> typeToken) {
        return this.f34410a.get(typeToken);
    }

    @Override // com.google.common.reflect.p
    @CheckForNull
    public <T extends B> T Z(TypeToken<T> typeToken) {
        return (T) x(typeToken.rejectTypeVariables());
    }

    @Override // com.google.common.collect.w4, java.util.Map
    public Set<Map.Entry<TypeToken<? extends B>, B>> entrySet() {
        return a.A(super.entrySet());
    }

    @Override // com.google.common.reflect.p
    @CheckForNull
    public <T extends B> T getInstance(Class<T> cls) {
        return (T) x(TypeToken.of((Class) cls));
    }

    @Override // com.google.common.reflect.p
    @CheckForNull
    @uo.a
    public <T extends B> T h0(TypeToken<T> typeToken, @k T t11) {
        return (T) y(typeToken.rejectTypeVariables(), t11);
    }

    @Override // com.google.common.collect.w4, java.util.Map, com.google.common.collect.u
    @Deprecated
    @uo.e("Always throws UnsupportedOperationException")
    public void putAll(Map<? extends TypeToken<? extends B>, ? extends B> map) {
        throw new UnsupportedOperationException("Please use putInstance() instead.");
    }

    @Override // com.google.common.reflect.p
    @CheckForNull
    @uo.a
    public <T extends B> T putInstance(Class<T> cls, @k T t11) {
        return (T) y(TypeToken.of((Class) cls), t11);
    }

    @Override // com.google.common.collect.w4, java.util.Map, com.google.common.collect.u
    @CheckForNull
    @Deprecated
    @uo.e("Always throws UnsupportedOperationException")
    @uo.a
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public B put(TypeToken<? extends B> key, @k B value) {
        throw new UnsupportedOperationException("Please use putInstance() instead.");
    }

    @CheckForNull
    public final <T extends B> T y(TypeToken<T> typeToken, @k T t11) {
        return this.f34410a.put(typeToken, t11);
    }

    @Override // com.google.common.collect.w4, com.google.common.collect.c5
    public Map<TypeToken<? extends B>, B> delegate() {
        return this.f34410a;
    }
}
