package dagger.hilt.android.internal.lifecycle;

import dagger.hilt.android.internal.lifecycle.a;
import java.util.Map;
import tv.t;
import tv.w;
import tv.x;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w({"dagger.hilt.android.internal.lifecycle.HiltViewModelMap.KeySet"})
@x
@tv.e
/* loaded from: classes8.dex */
public final class b implements tv.h<a.d> {

    /* renamed from: a, reason: collision with root package name */
    public final t<Map<Class<?>, Boolean>> f47606a;

    /* renamed from: b, reason: collision with root package name */
    public final t<uu.f> f47607b;

    public b(t<Map<Class<?>, Boolean>> keySetProvider, t<uu.f> viewModelComponentBuilderProvider) {
        this.f47606a = keySetProvider;
        this.f47607b = viewModelComponentBuilderProvider;
    }

    public static b a(t<Map<Class<?>, Boolean>> keySetProvider, t<uu.f> viewModelComponentBuilderProvider) {
        return new b(keySetProvider, viewModelComponentBuilderProvider);
    }

    public static a.d c(Map<Class<?>, Boolean> keySet, uu.f viewModelComponentBuilder) {
        return new a.d(keySet, viewModelComponentBuilder);
    }

    @Override // javax.inject.Provider, vz.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public a.d get() {
        return c(this.f47606a.get(), this.f47607b.get());
    }
}
