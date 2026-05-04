package tv;

import javax.inject.Provider;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class f<T> implements h<T> {

    /* renamed from: a, reason: collision with root package name */
    public t<T> f90961a;

    @Deprecated
    public static <T> void b(Provider<T> delegateFactory, Provider<T> delegate) {
        d((f) delegateFactory, v.a(delegate));
    }

    public static <T> void c(t<T> delegateFactory, t<T> delegate) {
        d((f) delegateFactory, delegate);
    }

    public static <T> void d(f<T> delegateFactory, t<T> delegate) {
        s.b(delegate);
        if (delegateFactory.f90961a != null) {
            throw new IllegalStateException();
        }
        delegateFactory.f90961a = delegate;
    }

    public t<T> a() {
        return (t) s.b(this.f90961a);
    }

    @Deprecated
    public void e(Provider<T> delegate) {
        f(v.a(delegate));
    }

    @Deprecated
    public void f(t<T> delegate) {
        c(this, delegate);
    }

    @Override // javax.inject.Provider, vz.c
    public T get() {
        t<T> tVar = this.f90961a;
        if (tVar != null) {
            return tVar.get();
        }
        throw new IllegalStateException();
    }
}
