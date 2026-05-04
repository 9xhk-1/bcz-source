package com.google.common.reflect;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.w4;
import java.util.Map;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d
/* loaded from: classes7.dex */
public final class f<B> extends w4<TypeToken<? extends B>, B> implements p<B> {

    /* renamed from: a, reason: collision with root package name */
    public final ImmutableMap<TypeToken<? extends B>, B> f34403a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b<B> {

        /* renamed from: a, reason: collision with root package name */
        public final ImmutableMap.b<TypeToken<? extends B>, B> f34404a;

        public f<B> a() {
            return new f<>(this.f34404a.d());
        }

        @uo.a
        public <T extends B> b<B> b(TypeToken<T> key, T value) {
            this.f34404a.i(key.rejectTypeVariables(), value);
            return this;
        }

        @uo.a
        public <T extends B> b<B> c(Class<T> key, T value) {
            this.f34404a.i(TypeToken.of((Class) key), value);
            return this;
        }

        public b() {
            this.f34404a = ImmutableMap.builder();
        }
    }

    public static <B> b<B> w() {
        return new b<>();
    }

    public static <B> f<B> x() {
        return new f<>(ImmutableMap.of());
    }

    @Override // com.google.common.reflect.p
    @CheckForNull
    public <T extends B> T Z(TypeToken<T> typeToken) {
        return (T) z(typeToken.rejectTypeVariables());
    }

    @Override // com.google.common.reflect.p
    @CheckForNull
    public <T extends B> T getInstance(Class<T> cls) {
        return (T) z(TypeToken.of((Class) cls));
    }

    @Override // com.google.common.reflect.p
    @CheckForNull
    @Deprecated
    @uo.e("Always throws UnsupportedOperationException")
    @uo.a
    public <T extends B> T h0(TypeToken<T> type, T value) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.w4, java.util.Map, com.google.common.collect.u
    @Deprecated
    @uo.e("Always throws UnsupportedOperationException")
    public void putAll(Map<? extends TypeToken<? extends B>, ? extends B> map) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.reflect.p
    @CheckForNull
    @Deprecated
    @uo.e("Always throws UnsupportedOperationException")
    @uo.a
    public <T extends B> T putInstance(Class<T> type, T value) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.w4, java.util.Map, com.google.common.collect.u
    @CheckForNull
    @Deprecated
    @uo.e("Always throws UnsupportedOperationException")
    @uo.a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public B put(TypeToken<? extends B> key, B value) {
        throw new UnsupportedOperationException();
    }

    @CheckForNull
    public final <T extends B> T z(TypeToken<T> typeToken) {
        return this.f34403a.get(typeToken);
    }

    public f(ImmutableMap<TypeToken<? extends B>, B> delegate) {
        this.f34403a = delegate;
    }

    @Override // com.google.common.collect.w4, com.google.common.collect.c5
    public Map<TypeToken<? extends B>, B> delegate() {
        return this.f34403a;
    }
}
