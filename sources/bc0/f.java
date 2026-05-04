package bc0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class f<T> {

    /* renamed from: a, reason: collision with root package name */
    public final long f6755a;

    /* renamed from: b, reason: collision with root package name */
    public final T f6756b;

    public f(long j11, T t11) {
        this.f6756b = t11;
        this.f6755a = j11;
    }

    public long a() {
        return this.f6755a;
    }

    public T b() {
        return this.f6756b;
    }

    public boolean equals(Object obj) {
        T t11;
        T t12;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f6755a == fVar.f6755a && ((t11 = this.f6756b) == (t12 = fVar.f6756b) || (t11 != null && t11.equals(t12)));
    }

    public int hashCode() {
        long j11 = this.f6755a;
        int i11 = (((int) (j11 ^ (j11 >>> 32))) + 31) * 31;
        T t11 = this.f6756b;
        return i11 + (t11 == null ? 0 : t11.hashCode());
    }

    public String toString() {
        return String.format("Timestamped(timestampMillis = %d, value = %s)", Long.valueOf(this.f6755a), this.f6756b.toString());
    }
}
