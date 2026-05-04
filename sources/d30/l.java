package d30;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class l<T> {

    /* renamed from: a, reason: collision with root package name */
    public final T f47158a;

    /* renamed from: b, reason: collision with root package name */
    public final Thread f47159b = Thread.currentThread();

    public l(T t11) {
        this.f47158a = t11;
    }

    public T a() {
        if (b()) {
            return this.f47158a;
        }
        throw new IllegalStateException("No value in this thread (hasValue should be checked before)");
    }

    public boolean b() {
        return this.f47159b == Thread.currentThread();
    }
}
