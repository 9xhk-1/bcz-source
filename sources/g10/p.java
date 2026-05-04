package g10;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class p implements r<Double> {

    /* renamed from: a, reason: collision with root package name */
    public final double f52538a;

    /* renamed from: b, reason: collision with root package name */
    public final double f52539b;

    public p(double d11, double d12) {
        this.f52538a = d11;
        this.f52539b = d12;
    }

    private final boolean e(double d11, double d12) {
        return d11 <= d12;
    }

    public boolean a(double d11) {
        return d11 >= this.f52538a && d11 < this.f52539b;
    }

    @Override // g10.r
    @m80.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Double b() {
        return Double.valueOf(this.f52539b);
    }

    @Override // g10.r
    public /* bridge */ /* synthetic */ boolean contains(Double d11) {
        return a(d11.doubleValue());
    }

    @Override // g10.r
    @m80.k
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Double getStart() {
        return Double.valueOf(this.f52538a);
    }

    public boolean equals(@m80.l Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        if (isEmpty() && ((p) obj).isEmpty()) {
            return true;
        }
        p pVar = (p) obj;
        return this.f52538a == pVar.f52538a && this.f52539b == pVar.f52539b;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Double.hashCode(this.f52538a) * 31) + Double.hashCode(this.f52539b);
    }

    @Override // g10.r
    public boolean isEmpty() {
        return this.f52538a >= this.f52539b;
    }

    @m80.k
    public String toString() {
        return this.f52538a + "..<" + this.f52539b;
    }
}
