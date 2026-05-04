package l3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f69320a;

    /* renamed from: b, reason: collision with root package name */
    public final int f69321b;

    /* renamed from: c, reason: collision with root package name */
    public final int f69322c;

    /* renamed from: d, reason: collision with root package name */
    public final int f69323d;

    /* renamed from: e, reason: collision with root package name */
    public final int f69324e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    public final Long f69325f;

    public g(int i11, int i12, int i13, int i14, int i15, @m80.l Long l11) {
        this.f69320a = i11;
        this.f69321b = i12;
        this.f69322c = i13;
        this.f69323d = i14;
        this.f69324e = i15;
        this.f69325f = l11;
    }

    public static /* synthetic */ g h(g gVar, int i11, int i12, int i13, int i14, int i15, Long l11, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            i11 = gVar.f69320a;
        }
        if ((i16 & 2) != 0) {
            i12 = gVar.f69321b;
        }
        if ((i16 & 4) != 0) {
            i13 = gVar.f69322c;
        }
        if ((i16 & 8) != 0) {
            i14 = gVar.f69323d;
        }
        if ((i16 & 16) != 0) {
            i15 = gVar.f69324e;
        }
        if ((i16 & 32) != 0) {
            l11 = gVar.f69325f;
        }
        int i17 = i15;
        Long l12 = l11;
        return gVar.g(i11, i12, i13, i14, i17, l12);
    }

    public final int a() {
        return this.f69320a;
    }

    public final int b() {
        return this.f69321b;
    }

    public final int c() {
        return this.f69322c;
    }

    public final int d() {
        return this.f69323d;
    }

    public final int e() {
        return this.f69324e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f69320a == gVar.f69320a && this.f69321b == gVar.f69321b && this.f69322c == gVar.f69322c && this.f69323d == gVar.f69323d && this.f69324e == gVar.f69324e && kotlin.jvm.internal.g0.g(this.f69325f, gVar.f69325f);
    }

    @m80.l
    public final Long f() {
        return this.f69325f;
    }

    @m80.k
    public final g g(int i11, int i12, int i13, int i14, int i15, @m80.l Long l11) {
        return new g(i11, i12, i13, i14, i15, l11);
    }

    public int hashCode() {
        int hashCode = ((((((((Integer.hashCode(this.f69320a) * 31) + Integer.hashCode(this.f69321b)) * 31) + Integer.hashCode(this.f69322c)) * 31) + Integer.hashCode(this.f69323d)) * 31) + Integer.hashCode(this.f69324e)) * 31;
        Long l11 = this.f69325f;
        return hashCode + (l11 == null ? 0 : l11.hashCode());
    }

    public final int i() {
        return this.f69322c;
    }

    public final int j() {
        return this.f69321b;
    }

    public final int k() {
        return this.f69320a;
    }

    public final int l() {
        return this.f69324e;
    }

    public final int m() {
        return this.f69323d;
    }

    @m80.l
    public final Long n() {
        return this.f69325f;
    }

    @m80.k
    public String toString() {
        return "BuddyCurrentState(ipType=" + this.f69320a + ", ipStatus=" + this.f69321b + ", energy=" + this.f69322c + ", travelEnergy=" + this.f69323d + ", travelAreaId=" + this.f69324e + ", travelReturnTime=" + this.f69325f + ')';
    }
}
