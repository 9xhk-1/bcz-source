package y2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class u extends i {

    /* renamed from: h, reason: collision with root package name */
    public static final int f99198h = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f99199e;

    /* renamed from: f, reason: collision with root package name */
    public int f99200f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f99201g;

    @Override // y2.i, x2.a
    public void e() {
        super.e();
        this.f99200f = 0;
        this.f99201g = false;
    }

    @Override // y2.i
    public boolean i(float f11) {
        if (this.f99200f == this.f99199e) {
            return true;
        }
        if (!this.f99171d.a(f11)) {
            return false;
        }
        if (this.f99201g) {
            return true;
        }
        int i11 = this.f99199e;
        if (i11 > 0) {
            this.f99200f++;
        }
        if (this.f99200f == i11) {
            return true;
        }
        x2.a aVar = this.f99171d;
        if (aVar == null) {
            return false;
        }
        aVar.e();
        return false;
    }

    public void l() {
        this.f99201g = true;
    }

    public int m() {
        return this.f99199e;
    }

    public void n(int i11) {
        this.f99199e = i11;
    }
}
