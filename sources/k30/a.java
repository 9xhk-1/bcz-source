package k30;

import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a<T> {

    /* renamed from: a, reason: collision with root package name */
    public final T f65734a;

    /* renamed from: b, reason: collision with root package name */
    public final T f65735b;

    public a(T t11, T t12) {
        this.f65734a = t11;
        this.f65735b = t12;
    }

    public final T a() {
        return this.f65734a;
    }

    public final T b() {
        return this.f65735b;
    }

    public final T c() {
        return this.f65734a;
    }

    public final T d() {
        return this.f65735b;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return g0.g(this.f65734a, aVar.f65734a) && g0.g(this.f65735b, aVar.f65735b);
    }

    public int hashCode() {
        T t11 = this.f65734a;
        int hashCode = (t11 == null ? 0 : t11.hashCode()) * 31;
        T t12 = this.f65735b;
        return hashCode + (t12 != null ? t12.hashCode() : 0);
    }

    @k
    public String toString() {
        return "ApproximationBounds(lower=" + this.f65734a + ", upper=" + this.f65735b + ')';
    }
}
