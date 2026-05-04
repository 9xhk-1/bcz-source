package ju;

import java.math.BigInteger;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public BigInteger f64668a;

    public j(BigInteger bigInteger) {
        if (bigInteger.signum() >= 0) {
            this.f64668a = bigInteger;
            return;
        }
        throw new IllegalArgumentException("Attempt to construct ConfigMemorySize with negative number: " + bigInteger);
    }

    public static j a(long j11) {
        return new j(BigInteger.valueOf(j11));
    }

    public static j b(BigInteger bigInteger) {
        return new j(bigInteger);
    }

    public long c() {
        if (this.f64668a.bitLength() < 64) {
            return this.f64668a.longValue();
        }
        throw new IllegalArgumentException("size-in-bytes value is out of range for a 64-bit long: '" + this.f64668a + "'");
    }

    public BigInteger d() {
        return this.f64668a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof j) {
            return ((j) obj).f64668a.equals(this.f64668a);
        }
        return false;
    }

    public int hashCode() {
        return this.f64668a.hashCode();
    }

    public String toString() {
        return "ConfigMemorySize(" + this.f64668a + pn.j.f81007d;
    }
}
