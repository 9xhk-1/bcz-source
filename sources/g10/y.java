package g10;

import java.util.Iterator;
import yz.w1;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@y0(version = "1.5")
/* loaded from: classes8.dex */
public class y implements Iterable<w1>, y00.a {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final a f52552d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final long f52553a;

    /* renamed from: b, reason: collision with root package name */
    public final long f52554b;

    /* renamed from: c, reason: collision with root package name */
    public final long f52555c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final y a(long j11, long j12, long j13) {
            return new y(j11, j12, j13, null);
        }

        public a() {
        }
    }

    public /* synthetic */ y(long j11, long j12, long j13, kotlin.jvm.internal.v vVar) {
        this(j11, j12, j13);
    }

    public final long d() {
        return this.f52553a;
    }

    public boolean equals(@m80.l Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        if (isEmpty() && ((y) obj).isEmpty()) {
            return true;
        }
        y yVar = (y) obj;
        return this.f52553a == yVar.f52553a && this.f52554b == yVar.f52554b && this.f52555c == yVar.f52555c;
    }

    public final long f() {
        return this.f52554b;
    }

    public final long g() {
        return this.f52555c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j11 = this.f52553a;
        int i11 = ((int) w1.i(j11 ^ w1.i(j11 >>> 32))) * 31;
        long j12 = this.f52554b;
        int i12 = (i11 + ((int) w1.i(j12 ^ w1.i(j12 >>> 32)))) * 31;
        long j13 = this.f52555c;
        return i12 + ((int) ((j13 >>> 32) ^ j13));
    }

    public boolean isEmpty() {
        int compare;
        int compare2;
        long j11 = this.f52555c;
        long j12 = this.f52553a;
        long j13 = this.f52554b;
        if (j11 > 0) {
            compare2 = Long.compare(j12 ^ Long.MIN_VALUE, j13 ^ Long.MIN_VALUE);
            return compare2 > 0;
        }
        compare = Long.compare(j12 ^ Long.MIN_VALUE, j13 ^ Long.MIN_VALUE);
        return compare < 0;
    }

    @Override // java.lang.Iterable
    @m80.k
    public final Iterator<w1> iterator() {
        return new z(this.f52553a, this.f52554b, this.f52555c, null);
    }

    @m80.k
    public String toString() {
        StringBuilder sb2;
        long j11;
        if (this.f52555c > 0) {
            sb2 = new StringBuilder();
            sb2.append((Object) w1.h0(this.f52553a));
            sb2.append(zr.m.f102856e);
            sb2.append((Object) w1.h0(this.f52554b));
            sb2.append(" step ");
            j11 = this.f52555c;
        } else {
            sb2 = new StringBuilder();
            sb2.append((Object) w1.h0(this.f52553a));
            sb2.append(" downTo ");
            sb2.append((Object) w1.h0(this.f52554b));
            sb2.append(" step ");
            j11 = -this.f52555c;
        }
        sb2.append(j11);
        return sb2.toString();
    }

    public y(long j11, long j12, long j13) {
        if (j13 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j13 == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.f52553a = j11;
        this.f52554b = o00.t.c(j11, j12, j13);
        this.f52555c = j13;
    }
}
