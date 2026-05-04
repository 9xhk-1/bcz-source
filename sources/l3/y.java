package l3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final int f69722a;

    /* renamed from: b, reason: collision with root package name */
    public final int f69723b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f69724c;

    public y(int i11, int i12, @m80.k String unitName) {
        kotlin.jvm.internal.g0.p(unitName, "unitName");
        this.f69722a = i11;
        this.f69723b = i12;
        this.f69724c = unitName;
    }

    public static /* synthetic */ y e(y yVar, int i11, int i12, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = yVar.f69722a;
        }
        if ((i13 & 2) != 0) {
            i12 = yVar.f69723b;
        }
        if ((i13 & 4) != 0) {
            str = yVar.f69724c;
        }
        return yVar.d(i11, i12, str);
    }

    public final int a() {
        return this.f69722a;
    }

    public final int b() {
        return this.f69723b;
    }

    @m80.k
    public final String c() {
        return this.f69724c;
    }

    @m80.k
    public final y d(int i11, int i12, @m80.k String unitName) {
        kotlin.jvm.internal.g0.p(unitName, "unitName");
        return new y(i11, i12, unitName);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f69722a == yVar.f69722a && this.f69723b == yVar.f69723b && kotlin.jvm.internal.g0.g(this.f69724c, yVar.f69724c);
    }

    public final int f() {
        return this.f69722a;
    }

    @m80.k
    public final String g() {
        return this.f69724c;
    }

    public final int h() {
        return this.f69723b;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f69722a) * 31) + Integer.hashCode(this.f69723b)) * 31) + this.f69724c.hashCode();
    }

    @m80.k
    public String toString() {
        return "SentenceUnit(unitId=" + this.f69722a + ", unitNo=" + this.f69723b + ", unitName=" + this.f69724c + ')';
    }
}
