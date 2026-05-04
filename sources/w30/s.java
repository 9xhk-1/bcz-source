package w30;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import yz.j2;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@y0(version = "1.9")
@j2(markerClass = {h.class})
/* loaded from: classes8.dex */
public final class s<T> {

    /* renamed from: a, reason: collision with root package name */
    public final T f94779a;

    /* renamed from: b, reason: collision with root package name */
    public final long f94780b;

    public /* synthetic */ s(Object obj, long j11, v vVar) {
        this(obj, j11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ s d(s sVar, Object obj, long j11, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            obj = sVar.f94779a;
        }
        if ((i11 & 2) != 0) {
            j11 = sVar.f94780b;
        }
        return sVar.c(obj, j11);
    }

    public final T a() {
        return this.f94779a;
    }

    public final long b() {
        return this.f94780b;
    }

    @m80.k
    public final s<T> c(T t11, long j11) {
        return new s<>(t11, j11, null);
    }

    public final long e() {
        return this.f94780b;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return g0.g(this.f94779a, sVar.f94779a) && kotlin.time.e.q(this.f94780b, sVar.f94780b);
    }

    public final T f() {
        return this.f94779a;
    }

    public int hashCode() {
        T t11 = this.f94779a;
        return ((t11 == null ? 0 : t11.hashCode()) * 31) + kotlin.time.e.K(this.f94780b);
    }

    @m80.k
    public String toString() {
        return "TimedValue(value=" + this.f94779a + ", duration=" + ((Object) kotlin.time.e.f0(this.f94780b)) + ')';
    }

    public s(T t11, long j11) {
        this.f94779a = t11;
        this.f94780b = j11;
    }
}
