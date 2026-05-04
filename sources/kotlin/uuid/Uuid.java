package kotlin.uuid;

import e00.g;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Comparator;
import kotlin.d;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import kx.a0;
import m80.k;
import m80.l;
import o00.f;
import u30.f0;
import x00.p;
import yz.n;
import yz.o;
import yz.p1;
import yz.v0;
import yz.w0;
import yz.w1;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@y0(version = "2.0")
@y30.a
/* loaded from: classes8.dex */
public final class Uuid implements Comparable<Uuid>, Serializable {

    @k
    public static final a Companion = new a(null);

    @k
    private static final Uuid NIL = new Uuid(0, 0);
    public static final int SIZE_BITS = 128;
    public static final int SIZE_BYTES = 16;
    private final long leastSignificantBits;
    private final long mostSignificantBits;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @k
        public final Uuid a(@k byte[] byteArray) {
            String v11;
            g0.p(byteArray, "byteArray");
            if (byteArray.length == 16) {
                return b(kotlin.uuid.a.b(byteArray, 0), kotlin.uuid.a.b(byteArray, 8));
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Expected exactly 16 bytes, but was ");
            v11 = b.v(byteArray, 32);
            sb2.append(v11);
            sb2.append(" of size ");
            sb2.append(byteArray.length);
            throw new IllegalArgumentException(sb2.toString().toString());
        }

        @k
        public final Uuid b(long j11, long j12) {
            return (j11 == 0 && j12 == 0) ? g() : new Uuid(j11, j12, null);
        }

        @y0(version = "2.1")
        @d
        @k
        public final Uuid c(@k byte[] bArr) {
            g0.p(bArr, "$v$c$kotlin-UByteArray$-ubyteArray$0");
            return a(bArr);
        }

        @k
        public final Uuid d(long j11, long j12) {
            return b(j11, j12);
        }

        @k
        public final Comparator<Uuid> e() {
            return g.q();
        }

        @k
        public final Uuid g() {
            return Uuid.NIL;
        }

        @k
        public final Uuid h(@k String uuidString) {
            String u11;
            g0.p(uuidString, "uuidString");
            int length = uuidString.length();
            if (length == 32) {
                return kotlin.uuid.a.m(uuidString);
            }
            if (length == 36) {
                return kotlin.uuid.a.n(uuidString);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"");
            u11 = b.u(uuidString, 64);
            sb2.append(u11);
            sb2.append("\" of length ");
            sb2.append(uuidString.length());
            throw new IllegalArgumentException(sb2.toString());
        }

        @k
        public final Uuid i(@k String hexString) {
            String u11;
            g0.p(hexString, "hexString");
            if (hexString.length() == 32) {
                return kotlin.uuid.a.m(hexString);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Expected a 32-char hexadecimal string, but was \"");
            u11 = b.u(hexString, 64);
            sb2.append(u11);
            sb2.append("\" of length ");
            sb2.append(hexString.length());
            throw new IllegalArgumentException(sb2.toString().toString());
        }

        @y0(version = "2.1")
        @k
        public final Uuid j(@k String hexDashString) {
            String u11;
            g0.p(hexDashString, "hexDashString");
            if (hexDashString.length() == 36) {
                return kotlin.uuid.a.n(hexDashString);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Expected a 36-char string in the standard hex-and-dash UUID format, but was \"");
            u11 = b.u(hexDashString, 64);
            sb2.append(u11);
            sb2.append("\" of length ");
            sb2.append(hexDashString.length());
            throw new IllegalArgumentException(sb2.toString().toString());
        }

        @k
        public final Uuid k() {
            return kotlin.uuid.a.h();
        }

        public a() {
        }

        @n(message = "Use naturalOrder<Uuid>() instead", replaceWith = @w0(expression = "naturalOrder<Uuid>()", imports = {"kotlin.comparisons.naturalOrder"}))
        @o(warningSince = "2.1")
        public static /* synthetic */ void f() {
        }
    }

    public /* synthetic */ Uuid(long j11, long j12, v vVar) {
        this(j11, j12);
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    @f
    private final <T> T toLongs(p<? super Long, ? super Long, ? extends T> action) {
        g0.p(action, "action");
        return action.invoke(Long.valueOf(getMostSignificantBits()), Long.valueOf(getLeastSignificantBits()));
    }

    @f
    private final <T> T toULongs(p<? super w1, ? super w1, ? extends T> action) {
        g0.p(action, "action");
        return action.invoke(w1.b(w1.i(getMostSignificantBits())), w1.b(w1.i(getLeastSignificantBits())));
    }

    private final Object writeReplace() {
        return kotlin.uuid.a.i(this);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Uuid)) {
            return false;
        }
        Uuid uuid = (Uuid) obj;
        return this.mostSignificantBits == uuid.mostSignificantBits && this.leastSignificantBits == uuid.leastSignificantBits;
    }

    public final long getLeastSignificantBits() {
        return this.leastSignificantBits;
    }

    public final long getMostSignificantBits() {
        return this.mostSignificantBits;
    }

    public int hashCode() {
        return Long.hashCode(this.mostSignificantBits ^ this.leastSignificantBits);
    }

    @k
    public final byte[] toByteArray() {
        byte[] bArr = new byte[16];
        kotlin.uuid.a.j(bArr, 0, this.mostSignificantBits);
        kotlin.uuid.a.j(bArr, 8, this.leastSignificantBits);
        return bArr;
    }

    @y0(version = "2.1")
    @k
    public final String toHexDashString() {
        byte[] bArr = new byte[36];
        kotlin.uuid.a.a(this.mostSignificantBits, bArr, 0, 0, 4);
        bArr[8] = a0.f68904b;
        kotlin.uuid.a.a(this.mostSignificantBits, bArr, 9, 4, 6);
        bArr[13] = a0.f68904b;
        kotlin.uuid.a.a(this.mostSignificantBits, bArr, 14, 6, 8);
        bArr[18] = a0.f68904b;
        kotlin.uuid.a.a(this.leastSignificantBits, bArr, 19, 0, 2);
        bArr[23] = a0.f68904b;
        kotlin.uuid.a.a(this.leastSignificantBits, bArr, 24, 2, 8);
        return f0.U1(bArr);
    }

    @k
    public final String toHexString() {
        byte[] bArr = new byte[32];
        kotlin.uuid.a.a(this.mostSignificantBits, bArr, 0, 0, 8);
        kotlin.uuid.a.a(this.leastSignificantBits, bArr, 16, 0, 8);
        return f0.U1(bArr);
    }

    @k
    public String toString() {
        return toHexDashString();
    }

    @y0(version = "2.1")
    @d
    @k
    /* renamed from: toUByteArray-TcUX1vc, reason: not valid java name */
    public final byte[] m6322toUByteArrayTcUX1vc() {
        return p1.f(toByteArray());
    }

    private Uuid(long j11, long j12) {
        this.mostSignificantBits = j11;
        this.leastSignificantBits = j12;
    }

    @Override // java.lang.Comparable
    @y0(version = "2.1")
    public int compareTo(@k Uuid other) {
        int compare;
        int compare2;
        g0.p(other, "other");
        long j11 = this.mostSignificantBits;
        if (j11 != other.mostSignificantBits) {
            compare2 = Long.compare(w1.i(j11) ^ Long.MIN_VALUE, w1.i(other.mostSignificantBits) ^ Long.MIN_VALUE);
            return compare2;
        }
        compare = Long.compare(w1.i(this.leastSignificantBits) ^ Long.MIN_VALUE, w1.i(other.leastSignificantBits) ^ Long.MIN_VALUE);
        return compare;
    }

    @v0
    public static /* synthetic */ void getLeastSignificantBits$annotations() {
    }

    @v0
    public static /* synthetic */ void getMostSignificantBits$annotations() {
    }
}
