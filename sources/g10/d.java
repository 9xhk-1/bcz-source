package g10;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class d implements f<Double> {

    /* renamed from: a, reason: collision with root package name */
    public final double f52510a;

    /* renamed from: b, reason: collision with root package name */
    public final double f52511b;

    public d(double d11, double d12) {
        this.f52510a = d11;
        this.f52511b = d12;
    }

    @Override // g10.f
    public /* bridge */ /* synthetic */ boolean a(Double d11, Double d12) {
        return e(d11.doubleValue(), d12.doubleValue());
    }

    public boolean b(double d11) {
        return d11 >= this.f52510a && d11 <= this.f52511b;
    }

    @Override // g10.g
    @m80.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Double getEndInclusive() {
        return Double.valueOf(this.f52511b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // g10.f, g10.g
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return b(((Number) comparable).doubleValue());
    }

    @Override // g10.g
    @m80.k
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Double getStart() {
        return Double.valueOf(this.f52510a);
    }

    public boolean e(double d11, double d12) {
        return d11 <= d12;
    }

    public boolean equals(@m80.l Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        if (isEmpty() && ((d) obj).isEmpty()) {
            return true;
        }
        d dVar = (d) obj;
        return this.f52510a == dVar.f52510a && this.f52511b == dVar.f52511b;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Double.hashCode(this.f52510a) * 31) + Double.hashCode(this.f52511b);
    }

    @Override // g10.f, g10.g
    public boolean isEmpty() {
        return this.f52510a > this.f52511b;
    }

    @m80.k
    public String toString() {
        return this.f52510a + zr.m.f102856e + this.f52511b;
    }
}
