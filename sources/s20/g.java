package s20;

import e30.r0;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class g<T> {

    /* renamed from: a, reason: collision with root package name */
    public final T f87442a;

    public g(T t11) {
        this.f87442a = t11;
    }

    @m80.k
    public abstract r0 a(@m80.k p10.a0 a0Var);

    public T b() {
        return this.f87442a;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        T b11 = b();
        g gVar = obj instanceof g ? (g) obj : null;
        return g0.g(b11, gVar != null ? gVar.b() : null);
    }

    public int hashCode() {
        T b11 = b();
        if (b11 != null) {
            return b11.hashCode();
        }
        return 0;
    }

    @m80.k
    public String toString() {
        return String.valueOf(b());
    }
}
