package k10;

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class r2 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final WeakReference<ClassLoader> f64989a;

    /* renamed from: b, reason: collision with root package name */
    public final int f64990b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public ClassLoader f64991c;

    public r2(@m80.k ClassLoader classLoader) {
        kotlin.jvm.internal.g0.p(classLoader, "classLoader");
        this.f64989a = new WeakReference<>(classLoader);
        this.f64990b = System.identityHashCode(classLoader);
        this.f64991c = classLoader;
    }

    public final void a(@m80.l ClassLoader classLoader) {
        this.f64991c = classLoader;
    }

    public boolean equals(@m80.l Object obj) {
        return (obj instanceof r2) && this.f64989a.get() == ((r2) obj).f64989a.get();
    }

    public int hashCode() {
        return this.f64990b;
    }

    @m80.k
    public String toString() {
        String obj;
        ClassLoader classLoader = this.f64989a.get();
        return (classLoader == null || (obj = classLoader.toString()) == null) ? "<null>" : obj;
    }
}
