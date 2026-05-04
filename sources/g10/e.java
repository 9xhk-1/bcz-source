package g10;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class e implements f<Float> {

    /* renamed from: a, reason: collision with root package name */
    public final float f52512a;

    /* renamed from: b, reason: collision with root package name */
    public final float f52513b;

    public e(float f11, float f12) {
        this.f52512a = f11;
        this.f52513b = f12;
    }

    @Override // g10.f
    public /* bridge */ /* synthetic */ boolean a(Float f11, Float f12) {
        return e(f11.floatValue(), f12.floatValue());
    }

    public boolean b(float f11) {
        return f11 >= this.f52512a && f11 <= this.f52513b;
    }

    @Override // g10.g
    @m80.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Float getEndInclusive() {
        return Float.valueOf(this.f52513b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // g10.f, g10.g
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return b(((Number) comparable).floatValue());
    }

    @Override // g10.g
    @m80.k
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Float getStart() {
        return Float.valueOf(this.f52512a);
    }

    public boolean e(float f11, float f12) {
        return f11 <= f12;
    }

    public boolean equals(@m80.l Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        if (isEmpty() && ((e) obj).isEmpty()) {
            return true;
        }
        e eVar = (e) obj;
        return this.f52512a == eVar.f52512a && this.f52513b == eVar.f52513b;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Float.hashCode(this.f52512a) * 31) + Float.hashCode(this.f52513b);
    }

    @Override // g10.f, g10.g
    public boolean isEmpty() {
        return this.f52512a > this.f52513b;
    }

    @m80.k
    public String toString() {
        return this.f52512a + zr.m.f102856e + this.f52513b;
    }
}
