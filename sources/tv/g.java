package tv;

import javax.inject.Provider;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class g<T> implements t<T>, nu.e<T> {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f90962c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ boolean f90963d = false;

    /* renamed from: a, reason: collision with root package name */
    public volatile t<T> f90964a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f90965b = f90962c;

    public g(t<T> provider) {
        this.f90964a = provider;
    }

    public static <P extends Provider<T>, T> nu.e<T> b(P provider) {
        return c(v.a(provider));
    }

    public static <T> nu.e<T> c(t<T> provider) {
        return provider instanceof nu.e ? (nu.e) provider : new g((t) s.b(provider));
    }

    @Deprecated
    public static <P extends Provider<T>, T> Provider<T> d(P delegate) {
        return e(v.a(delegate));
    }

    public static <T> t<T> e(t<T> delegate) {
        s.b(delegate);
        return delegate instanceof g ? delegate : new g(delegate);
    }

    public static Object f(Object currentInstance, Object newInstance) {
        if (currentInstance == f90962c) {
            return newInstance;
        }
        if (currentInstance == newInstance) {
            return newInstance;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + currentInstance + " & " + newInstance + ". This is likely due to a circular dependency.");
    }

    public final synchronized Object a() {
        Object obj;
        obj = this.f90965b;
        if (obj == f90962c) {
            obj = this.f90964a.get();
            this.f90965b = f(this.f90965b, obj);
            this.f90964a = null;
        }
        return obj;
    }

    @Override // javax.inject.Provider, vz.c
    public T get() {
        T t11 = (T) this.f90965b;
        return t11 == f90962c ? (T) a() : t11;
    }
}
