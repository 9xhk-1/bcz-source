package y2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class h extends i {

    /* renamed from: e, reason: collision with root package name */
    public float f99169e;

    /* renamed from: f, reason: collision with root package name */
    public float f99170f;

    public h() {
    }

    @Override // y2.i, x2.a
    public void e() {
        super.e();
        this.f99170f = 0.0f;
    }

    @Override // y2.i
    public boolean i(float f11) {
        float f12 = this.f99170f;
        float f13 = this.f99169e;
        if (f12 < f13) {
            float f14 = f12 + f11;
            this.f99170f = f14;
            if (f14 < f13) {
                return false;
            }
            f11 = f14 - f13;
        }
        x2.a aVar = this.f99171d;
        if (aVar == null) {
            return true;
        }
        return aVar.a(f11);
    }

    public void l() {
        this.f99170f = this.f99169e;
    }

    public float m() {
        return this.f99169e;
    }

    public float n() {
        return this.f99170f;
    }

    public void o(float f11) {
        this.f99169e = f11;
    }

    public void p(float f11) {
        this.f99170f = f11;
    }

    public h(float f11) {
        this.f99169e = f11;
    }
}
