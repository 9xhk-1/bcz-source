package tv;

import javax.inject.Provider;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class u<T> implements t<nu.e<T>> {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ boolean f90977b = false;

    /* renamed from: a, reason: collision with root package name */
    public final t<T> f90978a;

    public u(t<T> provider) {
        this.f90978a = provider;
    }

    @Deprecated
    public static <T> t<nu.e<T>> a(Provider<T> provider) {
        return b(v.a(provider));
    }

    public static <T> t<nu.e<T>> b(t<T> provider) {
        return new u((t) s.b(provider));
    }

    @Override // javax.inject.Provider, vz.c
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public nu.e<T> get() {
        return g.c(this.f90978a);
    }
}
