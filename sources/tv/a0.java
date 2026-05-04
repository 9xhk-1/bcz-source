package tv;

import javax.inject.Provider;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a0<T> implements t<T> {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f90956c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ boolean f90957d = false;

    /* renamed from: a, reason: collision with root package name */
    public volatile t<T> f90958a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f90959b = f90956c;

    public a0(t<T> provider) {
        this.f90958a = provider;
    }

    public static <P extends Provider<T>, T> Provider<T> a(P delegate) {
        return b(v.a(delegate));
    }

    public static <T> t<T> b(t<T> provider) {
        return !(provider instanceof a0) ? provider instanceof g ? provider : new a0((t) s.b(provider)) : provider;
    }

    @Override // javax.inject.Provider, vz.c
    public T get() {
        T t11 = (T) this.f90959b;
        if (t11 != f90956c) {
            return t11;
        }
        t<T> tVar = this.f90958a;
        if (tVar == null) {
            return (T) this.f90959b;
        }
        T t12 = tVar.get();
        this.f90959b = t12;
        this.f90958a = null;
        return t12;
    }
}
