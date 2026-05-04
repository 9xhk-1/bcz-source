package g10;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class q implements r<Float> {

    /* renamed from: a, reason: collision with root package name */
    public final float f52540a;

    /* renamed from: b, reason: collision with root package name */
    public final float f52541b;

    public q(float f11, float f12) {
        this.f52540a = f11;
        this.f52541b = f12;
    }

    private final boolean e(float f11, float f12) {
        return f11 <= f12;
    }

    public boolean a(float f11) {
        return f11 >= this.f52540a && f11 < this.f52541b;
    }

    @Override // g10.r
    @m80.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Float b() {
        return Float.valueOf(this.f52541b);
    }

    @Override // g10.r
    public /* bridge */ /* synthetic */ boolean contains(Float f11) {
        return a(f11.floatValue());
    }

    @Override // g10.r
    @m80.k
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Float getStart() {
        return Float.valueOf(this.f52540a);
    }

    public boolean equals(@m80.l Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        if (isEmpty() && ((q) obj).isEmpty()) {
            return true;
        }
        q qVar = (q) obj;
        return this.f52540a == qVar.f52540a && this.f52541b == qVar.f52541b;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Float.hashCode(this.f52540a) * 31) + Float.hashCode(this.f52541b);
    }

    @Override // g10.r
    public boolean isEmpty() {
        return this.f52540a >= this.f52541b;
    }

    @m80.k
    public String toString() {
        return this.f52540a + "..<" + this.f52541b;
    }
}
