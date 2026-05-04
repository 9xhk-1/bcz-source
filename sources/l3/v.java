package l3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final int f69704a;

    /* renamed from: b, reason: collision with root package name */
    public final int f69705b;

    /* renamed from: c, reason: collision with root package name */
    public final int f69706c;

    /* renamed from: d, reason: collision with root package name */
    public final int f69707d;

    /* renamed from: e, reason: collision with root package name */
    public final long f69708e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final String f69709f;

    public v(int i11, int i12, int i13, int i14, long j11, @m80.k String appleProductId) {
        kotlin.jvm.internal.g0.p(appleProductId, "appleProductId");
        this.f69704a = i11;
        this.f69705b = i12;
        this.f69706c = i13;
        this.f69707d = i14;
        this.f69708e = j11;
        this.f69709f = appleProductId;
    }

    public static /* synthetic */ v h(v vVar, int i11, int i12, int i13, int i14, long j11, String str, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i11 = vVar.f69704a;
        }
        if ((i15 & 2) != 0) {
            i12 = vVar.f69705b;
        }
        if ((i15 & 4) != 0) {
            i13 = vVar.f69706c;
        }
        if ((i15 & 8) != 0) {
            i14 = vVar.f69707d;
        }
        if ((i15 & 16) != 0) {
            j11 = vVar.f69708e;
        }
        if ((i15 & 32) != 0) {
            str = vVar.f69709f;
        }
        String str2 = str;
        long j12 = j11;
        return vVar.g(i11, i12, i13, i14, j12, str2);
    }

    public final int a() {
        return this.f69704a;
    }

    public final int b() {
        return this.f69705b;
    }

    public final int c() {
        return this.f69706c;
    }

    public final int d() {
        return this.f69707d;
    }

    public final long e() {
        return this.f69708e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f69704a == vVar.f69704a && this.f69705b == vVar.f69705b && this.f69706c == vVar.f69706c && this.f69707d == vVar.f69707d && this.f69708e == vVar.f69708e && kotlin.jvm.internal.g0.g(this.f69709f, vVar.f69709f);
    }

    @m80.k
    public final String f() {
        return this.f69709f;
    }

    @m80.k
    public final v g(int i11, int i12, int i13, int i14, long j11, @m80.k String appleProductId) {
        kotlin.jvm.internal.g0.p(appleProductId, "appleProductId");
        return new v(i11, i12, i13, i14, j11, appleProductId);
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.f69704a) * 31) + Integer.hashCode(this.f69705b)) * 31) + Integer.hashCode(this.f69706c)) * 31) + Integer.hashCode(this.f69707d)) * 31) + Long.hashCode(this.f69708e)) * 31) + this.f69709f.hashCode();
    }

    @m80.k
    public final String i() {
        return this.f69709f;
    }

    public final long j() {
        return this.f69708e;
    }

    public final int k() {
        return this.f69707d;
    }

    public final int l() {
        return this.f69706c;
    }

    public final int m() {
        return this.f69705b;
    }

    public final int n() {
        return this.f69704a;
    }

    @m80.k
    public String toString() {
        return "SaleInfo(saleType=" + this.f69704a + ", productType=" + this.f69705b + ", price=" + this.f69706c + ", originPrice=" + this.f69707d + ", endTime=" + this.f69708e + ", appleProductId=" + this.f69709f + ')';
    }
}
