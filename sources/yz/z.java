package yz;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@y0(version = "1.1")
/* loaded from: classes8.dex */
public final class z implements Comparable<z> {

    /* renamed from: f, reason: collision with root package name */
    public static final int f100468f = 255;

    /* renamed from: a, reason: collision with root package name */
    public final int f100470a;

    /* renamed from: b, reason: collision with root package name */
    public final int f100471b;

    /* renamed from: c, reason: collision with root package name */
    public final int f100472c;

    /* renamed from: d, reason: collision with root package name */
    public final int f100473d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final a f100467e = new a(null);

    /* renamed from: g, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final z f100469g = a0.a();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public a() {
        }
    }

    public z(int i11, int i12, int i13) {
        this.f100470a = i11;
        this.f100471b = i12;
        this.f100472c = i13;
        this.f100473d = g(i11, i12, i13);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(@m80.k z other) {
        kotlin.jvm.internal.g0.p(other, "other");
        return this.f100473d - other.f100473d;
    }

    public final int b() {
        return this.f100470a;
    }

    public final int c() {
        return this.f100471b;
    }

    public final int d() {
        return this.f100472c;
    }

    public final boolean e(int i11, int i12) {
        int i13 = this.f100470a;
        if (i13 <= i11) {
            return i13 == i11 && this.f100471b >= i12;
        }
        return true;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        z zVar = obj instanceof z ? (z) obj : null;
        return zVar != null && this.f100473d == zVar.f100473d;
    }

    public final boolean f(int i11, int i12, int i13) {
        int i14 = this.f100470a;
        if (i14 > i11) {
            return true;
        }
        if (i14 != i11) {
            return false;
        }
        int i15 = this.f100471b;
        if (i15 <= i12) {
            return i15 == i12 && this.f100472c >= i13;
        }
        return true;
    }

    public final int g(int i11, int i12, int i13) {
        if (i11 >= 0 && i11 < 256 && i12 >= 0 && i12 < 256 && i13 >= 0 && i13 < 256) {
            return (i11 << 16) + (i12 << 8) + i13;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i11 + '.' + i12 + '.' + i13).toString());
    }

    public int hashCode() {
        return this.f100473d;
    }

    @m80.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f100470a);
        sb2.append('.');
        sb2.append(this.f100471b);
        sb2.append('.');
        sb2.append(this.f100472c);
        return sb2.toString();
    }

    public z(int i11, int i12) {
        this(i11, i12, 0);
    }
}
