package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import java.io.Serializable;
import java.util.Map;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.c
@uo.j(containerOf = {"B"})
/* loaded from: classes7.dex */
public final class ImmutableClassToInstanceMap<B> extends w4<Class<? extends B>, B> implements x<B>, Serializable {
    private static final ImmutableClassToInstanceMap<Object> EMPTY = new ImmutableClassToInstanceMap<>(ImmutableMap.of());
    private final ImmutableMap<Class<? extends B>, B> delegate;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b<B> {

        /* renamed from: a, reason: collision with root package name */
        public final ImmutableMap.b<Class<? extends B>, B> f32990a = ImmutableMap.builder();

        public static <T> T b(Class<T> cls, Object obj) {
            return (T) ro.n.f(cls).cast(obj);
        }

        public ImmutableClassToInstanceMap<B> a() {
            ImmutableMap<Class<? extends B>, B> d11 = this.f32990a.d();
            return d11.isEmpty() ? ImmutableClassToInstanceMap.of() : new ImmutableClassToInstanceMap<>(d11);
        }

        @uo.a
        public <T extends B> b<B> c(Class<T> key, T value) {
            this.f32990a.i(key, value);
            return this;
        }

        @uo.a
        public <T extends B> b<B> d(Map<? extends Class<? extends T>, ? extends T> map) {
            for (Map.Entry<? extends Class<? extends T>, ? extends T> entry : map.entrySet()) {
                Class<? extends T> key = entry.getKey();
                this.f32990a.i(key, b(key, entry.getValue()));
            }
            return this;
        }
    }

    public static <B> b<B> builder() {
        return new b<>();
    }

    public static <B, S extends B> ImmutableClassToInstanceMap<B> copyOf(Map<? extends Class<? extends S>, ? extends S> map) {
        return map instanceof ImmutableClassToInstanceMap ? (ImmutableClassToInstanceMap) map : new b().d(map).a();
    }

    public static <B> ImmutableClassToInstanceMap<B> of() {
        return (ImmutableClassToInstanceMap<B>) EMPTY;
    }

    @Override // com.google.common.collect.x
    @CheckForNull
    public <T extends B> T getInstance(Class<T> cls) {
        return this.delegate.get(Preconditions.checkNotNull(cls));
    }

    @Override // com.google.common.collect.x
    @CheckForNull
    @Deprecated
    @uo.e("Always throws UnsupportedOperationException")
    @uo.a
    public <T extends B> T putInstance(Class<T> type, T value) {
        throw new UnsupportedOperationException();
    }

    public Object readResolve() {
        return isEmpty() ? of() : this;
    }

    private ImmutableClassToInstanceMap(ImmutableMap<Class<? extends B>, B> delegate) {
        this.delegate = delegate;
    }

    public static <B, T extends B> ImmutableClassToInstanceMap<B> of(Class<T> type, T value) {
        return new ImmutableClassToInstanceMap<>(ImmutableMap.of(type, value));
    }

    @Override // com.google.common.collect.w4, com.google.common.collect.c5
    public Map<Class<? extends B>, B> delegate() {
        return this.delegate;
    }
}
