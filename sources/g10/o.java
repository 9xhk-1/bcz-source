package g10;

import yz.j2;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class o extends m implements g<Long>, r<Long> {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final a f52536e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final o f52537f = new o(1, 0);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final o a() {
            return o.f52537f;
        }

        public a() {
        }
    }

    public o(long j11, long j12) {
        super(j11, j12, 1L);
    }

    @Override // g10.g
    public /* bridge */ /* synthetic */ boolean contains(Long l11) {
        return k(l11.longValue());
    }

    @Override // g10.m
    public boolean equals(@m80.l Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        if (isEmpty() && ((o) obj).isEmpty()) {
            return true;
        }
        o oVar = (o) obj;
        return d() == oVar.d() && f() == oVar.f();
    }

    @Override // g10.m
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (int) ((31 * (d() ^ (d() >>> 32))) + (f() ^ (f() >>> 32)));
    }

    @Override // g10.m, g10.g
    public boolean isEmpty() {
        return d() > f();
    }

    public boolean k(long j11) {
        return d() <= j11 && j11 <= f();
    }

    @Override // g10.r
    @m80.k
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public Long b() {
        if (f() != Long.MAX_VALUE) {
            return Long.valueOf(f() + 1);
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.");
    }

    @Override // g10.g
    @m80.k
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public Long getEndInclusive() {
        return Long.valueOf(f());
    }

    @Override // g10.g
    @m80.k
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public Long getStart() {
        return Long.valueOf(d());
    }

    @Override // g10.m
    @m80.k
    public String toString() {
        return d() + zr.m.f102856e + f();
    }

    @y0(version = "1.9")
    @yz.n(message = "Can throw an exception when it's impossible to represent the value with Long type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    @j2(markerClass = {kotlin.c.class})
    public static /* synthetic */ void m() {
    }
}
