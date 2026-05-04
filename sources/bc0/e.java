package bc0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class e<T> {

    /* renamed from: a, reason: collision with root package name */
    public final long f6753a;

    /* renamed from: b, reason: collision with root package name */
    public final T f6754b;

    public e(long j11, T t11) {
        this.f6754b = t11;
        this.f6753a = j11;
    }

    public long a() {
        return this.f6753a;
    }

    public T b() {
        return this.f6754b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f6753a != eVar.f6753a) {
            return false;
        }
        T t11 = this.f6754b;
        if (t11 == null) {
            if (eVar.f6754b != null) {
                return false;
            }
        } else if (!t11.equals(eVar.f6754b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j11 = this.f6753a;
        int i11 = (((int) (j11 ^ (j11 >>> 32))) + 31) * 31;
        T t11 = this.f6754b;
        return i11 + (t11 == null ? 0 : t11.hashCode());
    }

    public String toString() {
        return "TimeInterval [intervalInMilliseconds=" + this.f6753a + ", value=" + this.f6754b + "]";
    }
}
