package ku;

import androidx.collection.SieveCacheKt;
import com.typesafe.config.ConfigException;
import java.io.ObjectStreamException;
import java.io.Serializable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public abstract class g0 extends d implements Serializable {
    private static final long serialVersionUID = 2;

    /* renamed from: b, reason: collision with root package name */
    public final String f68721b;

    public g0(ju.m mVar, String str) {
        super(mVar);
        this.f68721b = str;
    }

    public static g0 Y0(ju.m mVar, double d11, String str) {
        long j11 = (long) d11;
        return ((double) j11) == d11 ? Z0(mVar, j11, str) : new m(mVar, d11, str);
    }

    public static g0 Z0(ju.m mVar, long j11, String str) {
        return (j11 > SieveCacheKt.NodeLinkMask || j11 < SieveCacheKt.NodeMetaAndPreviousMask) ? new t(mVar, j11, str) : new s(mVar, (int) j11, str);
    }

    private Object writeReplace() throws ObjectStreamException {
        return new c1(this);
    }

    @Override // ku.d
    public String Q0() {
        return this.f68721b;
    }

    public abstract double U0();

    public int V0(String str) {
        long X0 = X0();
        if (X0 >= SieveCacheKt.NodeMetaAndPreviousMask && X0 <= SieveCacheKt.NodeLinkMask) {
            return (int) X0;
        }
        throw new ConfigException.WrongType(g(), str, "32-bit integer", "out-of-range value " + X0);
    }

    public final boolean W0() {
        return ((double) X0()) == U0();
    }

    public abstract long X0();

    @Override // ju.t
    /* renamed from: a1, reason: merged with bridge method [inline-methods] */
    public abstract Number c();

    @Override // ku.d
    public boolean equals(Object obj) {
        if ((obj instanceof g0) && q0(obj)) {
            g0 g0Var = (g0) obj;
            if (W0()) {
                return g0Var.W0() && X0() == g0Var.X0();
            }
            if (!g0Var.W0() && U0() == g0Var.U0()) {
                return true;
            }
        }
        return false;
    }

    @Override // ku.d
    public int hashCode() {
        long X0 = W0() ? X0() : Double.doubleToLongBits(U0());
        return (int) (X0 ^ (X0 >>> 32));
    }

    @Override // ku.d
    public boolean q0(Object obj) {
        return obj instanceof g0;
    }
}
