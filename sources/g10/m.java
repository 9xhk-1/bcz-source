package g10;

import a00.e1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class m implements Iterable<Long>, y00.a {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final a f52528d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final long f52529a;

    /* renamed from: b, reason: collision with root package name */
    public final long f52530b;

    /* renamed from: c, reason: collision with root package name */
    public final long f52531c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final m a(long j11, long j12, long j13) {
            return new m(j11, j12, j13);
        }

        public a() {
        }
    }

    public m(long j11, long j12, long j13) {
        if (j13 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j13 == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.f52529a = j11;
        this.f52530b = o00.o.d(j11, j12, j13);
        this.f52531c = j13;
    }

    public final long d() {
        return this.f52529a;
    }

    public boolean equals(@m80.l Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        if (isEmpty() && ((m) obj).isEmpty()) {
            return true;
        }
        m mVar = (m) obj;
        return this.f52529a == mVar.f52529a && this.f52530b == mVar.f52530b && this.f52531c == mVar.f52531c;
    }

    public final long f() {
        return this.f52530b;
    }

    public final long g() {
        return this.f52531c;
    }

    @Override // java.lang.Iterable
    @m80.k
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public e1 iterator() {
        return new n(this.f52529a, this.f52530b, this.f52531c);
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j11 = 31;
        long j12 = this.f52529a;
        long j13 = this.f52530b;
        long j14 = j11 * (((j12 ^ (j12 >>> 32)) * j11) + (j13 ^ (j13 >>> 32)));
        long j15 = this.f52531c;
        return (int) (j14 + (j15 ^ (j15 >>> 32)));
    }

    public boolean isEmpty() {
        long j11 = this.f52531c;
        long j12 = this.f52529a;
        long j13 = this.f52530b;
        return j11 > 0 ? j12 > j13 : j12 < j13;
    }

    @m80.k
    public String toString() {
        StringBuilder sb2;
        long j11;
        if (this.f52531c > 0) {
            sb2 = new StringBuilder();
            sb2.append(this.f52529a);
            sb2.append(zr.m.f102856e);
            sb2.append(this.f52530b);
            sb2.append(" step ");
            j11 = this.f52531c;
        } else {
            sb2 = new StringBuilder();
            sb2.append(this.f52529a);
            sb2.append(" downTo ");
            sb2.append(this.f52530b);
            sb2.append(" step ");
            j11 = -this.f52531c;
        }
        sb2.append(j11);
        return sb2.toString();
    }
}
