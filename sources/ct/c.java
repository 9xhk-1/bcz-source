package ct;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class c<T, V> {

    /* renamed from: a, reason: collision with root package name */
    public final String f46850a;

    /* renamed from: b, reason: collision with root package name */
    public final Class<V> f46851b;

    public c(Class<V> cls, String str) {
        this.f46850a = str;
        this.f46851b = cls;
    }

    public static <T, V> c<T, V> e(Class<T> cls, Class<V> cls2, String str) {
        return new d(cls, cls2, str);
    }

    public abstract V a(T t11);

    public String b() {
        return this.f46850a;
    }

    public Class<V> c() {
        return this.f46851b;
    }

    public boolean d() {
        return false;
    }

    public void f(T t11, V v11) {
        throw new UnsupportedOperationException("Property " + b() + " is read-only");
    }
}
