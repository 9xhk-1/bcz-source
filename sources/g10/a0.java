package g10;

import yz.j2;
import yz.w1;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@y0(version = "1.5")
/* loaded from: classes8.dex */
public final class a0 extends y implements g<w1>, r<w1> {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final a f52502e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final a0 f52503f = new a0(-1, 0, null);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final a0 a() {
            return a0.f52503f;
        }

        public a() {
        }
    }

    public /* synthetic */ a0(long j11, long j12, kotlin.jvm.internal.v vVar) {
        this(j11, j12);
    }

    @Override // g10.r
    public /* bridge */ /* synthetic */ w1 b() {
        return w1.b(k());
    }

    @Override // g10.g
    public /* bridge */ /* synthetic */ boolean contains(w1 w1Var) {
        return j(w1Var.m0());
    }

    @Override // g10.y
    public boolean equals(@m80.l Object obj) {
        if (!(obj instanceof a0)) {
            return false;
        }
        if (isEmpty() && ((a0) obj).isEmpty()) {
            return true;
        }
        a0 a0Var = (a0) obj;
        return d() == a0Var.d() && f() == a0Var.f();
    }

    @Override // g10.g
    public /* bridge */ /* synthetic */ w1 getEndInclusive() {
        return w1.b(m());
    }

    @Override // g10.g
    public /* bridge */ /* synthetic */ w1 getStart() {
        return w1.b(n());
    }

    @Override // g10.y
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((int) w1.i(d() ^ w1.i(d() >>> 32))) * 31) + ((int) w1.i(f() ^ w1.i(f() >>> 32)));
    }

    @Override // g10.y, g10.g
    public boolean isEmpty() {
        int compare;
        compare = Long.compare(d() ^ Long.MIN_VALUE, f() ^ Long.MIN_VALUE);
        return compare > 0;
    }

    public boolean j(long j11) {
        int compare;
        int compare2;
        compare = Long.compare(d() ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE);
        if (compare > 0) {
            return false;
        }
        compare2 = Long.compare(j11 ^ Long.MIN_VALUE, f() ^ Long.MIN_VALUE);
        return compare2 <= 0;
    }

    public long k() {
        if (f() != -1) {
            return w1.i(f() + w1.i(1 & 4294967295L));
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.");
    }

    public long m() {
        return f();
    }

    public long n() {
        return d();
    }

    @Override // g10.y
    @m80.k
    public String toString() {
        return ((Object) w1.h0(d())) + zr.m.f102856e + ((Object) w1.h0(f()));
    }

    public a0(long j11, long j12) {
        super(j11, j12, 1L, null);
    }

    @y0(version = "1.9")
    @yz.n(message = "Can throw an exception when it's impossible to represent the value with ULong type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    @j2(markerClass = {kotlin.c.class})
    public static /* synthetic */ void l() {
    }
}
