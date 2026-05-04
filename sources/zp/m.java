package zp;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public int f102799a = 0;

    /* renamed from: b, reason: collision with root package name */
    public a f102800b = a.NUMERIC;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum a {
        NUMERIC,
        ALPHA,
        ISO_IEC_646
    }

    public int a() {
        return this.f102799a;
    }

    public void b(int i11) {
        this.f102799a += i11;
    }

    public boolean c() {
        return this.f102800b == a.ALPHA;
    }

    public boolean d() {
        return this.f102800b == a.ISO_IEC_646;
    }

    public boolean e() {
        return this.f102800b == a.NUMERIC;
    }

    public void f() {
        this.f102800b = a.ALPHA;
    }

    public void g() {
        this.f102800b = a.ISO_IEC_646;
    }

    public void h() {
        this.f102800b = a.NUMERIC;
    }

    public void i(int i11) {
        this.f102799a = i11;
    }
}
