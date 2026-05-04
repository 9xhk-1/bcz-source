package tv;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class l<T> implements h<T>, nu.e<T> {

    /* renamed from: b, reason: collision with root package name */
    public static final l<Object> f90966b = new l<>(null);

    /* renamed from: a, reason: collision with root package name */
    public final T f90967a;

    public l(T instance) {
        this.f90967a = instance;
    }

    public static <T> h<T> a(T instance) {
        return new l(s.c(instance, "instance cannot be null"));
    }

    public static <T> h<T> b(T instance) {
        return instance == null ? c() : new l(instance);
    }

    public static <T> l<T> c() {
        return (l<T>) f90966b;
    }

    @Override // javax.inject.Provider, vz.c
    public T get() {
        return this.f90967a;
    }
}
