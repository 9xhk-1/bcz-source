package g10;

import yz.j2;
import yz.s1;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@y0(version = "1.5")
/* loaded from: classes8.dex */
public final class x extends v implements g<s1>, r<s1> {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final a f52550e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final x f52551f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final x a() {
            return x.f52551f;
        }

        public a() {
        }
    }

    static {
        kotlin.jvm.internal.v vVar = null;
        f52550e = new a(vVar);
        f52551f = new x(-1, 0, vVar);
    }

    public /* synthetic */ x(int i11, int i12, kotlin.jvm.internal.v vVar) {
        this(i11, i12);
    }

    @Override // g10.r
    public /* bridge */ /* synthetic */ s1 b() {
        return s1.b(k());
    }

    @Override // g10.g
    public /* bridge */ /* synthetic */ boolean contains(s1 s1Var) {
        return j(s1Var.m0());
    }

    @Override // g10.v
    public boolean equals(@m80.l Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        if (isEmpty() && ((x) obj).isEmpty()) {
            return true;
        }
        x xVar = (x) obj;
        return d() == xVar.d() && f() == xVar.f();
    }

    @Override // g10.g
    public /* bridge */ /* synthetic */ s1 getEndInclusive() {
        return s1.b(m());
    }

    @Override // g10.g
    public /* bridge */ /* synthetic */ s1 getStart() {
        return s1.b(n());
    }

    @Override // g10.v
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (d() * 31) + f();
    }

    @Override // g10.v, g10.g
    public boolean isEmpty() {
        int compare;
        compare = Integer.compare(d() ^ Integer.MIN_VALUE, f() ^ Integer.MIN_VALUE);
        return compare > 0;
    }

    public boolean j(int i11) {
        int compare;
        int compare2;
        compare = Integer.compare(d() ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE);
        if (compare > 0) {
            return false;
        }
        compare2 = Integer.compare(i11 ^ Integer.MIN_VALUE, f() ^ Integer.MIN_VALUE);
        return compare2 <= 0;
    }

    public int k() {
        if (f() != -1) {
            return s1.i(f() + 1);
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.");
    }

    public int m() {
        return f();
    }

    public int n() {
        return d();
    }

    @Override // g10.v
    @m80.k
    public String toString() {
        return ((Object) s1.h0(d())) + zr.m.f102856e + ((Object) s1.h0(f()));
    }

    public x(int i11, int i12) {
        super(i11, i12, 1, null);
    }

    @y0(version = "1.9")
    @yz.n(message = "Can throw an exception when it's impossible to represent the value with UInt type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    @j2(markerClass = {kotlin.c.class})
    public static /* synthetic */ void l() {
    }
}
