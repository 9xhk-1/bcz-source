package g10;

import yz.j2;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class l extends j implements g<Integer>, r<Integer> {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final a f52526e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final l f52527f = new l(1, 0);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final l a() {
            return l.f52527f;
        }

        public a() {
        }
    }

    public l(int i11, int i12) {
        super(i11, i12, 1);
    }

    @Override // g10.g
    public /* bridge */ /* synthetic */ boolean contains(Integer num) {
        return k(num.intValue());
    }

    @Override // g10.j
    public boolean equals(@m80.l Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        if (isEmpty() && ((l) obj).isEmpty()) {
            return true;
        }
        l lVar = (l) obj;
        return d() == lVar.d() && f() == lVar.f();
    }

    @Override // g10.j
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (d() * 31) + f();
    }

    @Override // g10.j, g10.g
    public boolean isEmpty() {
        return d() > f();
    }

    public boolean k(int i11) {
        return d() <= i11 && i11 <= f();
    }

    @Override // g10.r
    @m80.k
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public Integer b() {
        if (f() != Integer.MAX_VALUE) {
            return Integer.valueOf(f() + 1);
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.");
    }

    @Override // g10.g
    @m80.k
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public Integer getEndInclusive() {
        return Integer.valueOf(f());
    }

    @Override // g10.g
    @m80.k
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public Integer getStart() {
        return Integer.valueOf(d());
    }

    @Override // g10.j
    @m80.k
    public String toString() {
        return d() + zr.m.f102856e + f();
    }

    @y0(version = "1.9")
    @yz.n(message = "Can throw an exception when it's impossible to represent the value with Int type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    @j2(markerClass = {kotlin.c.class})
    public static /* synthetic */ void m() {
    }
}
