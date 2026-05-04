package y2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class e0 extends i {

    /* renamed from: e, reason: collision with root package name */
    public float f99158e;

    @Override // y2.i
    public boolean i(float f11) {
        x2.a aVar = this.f99171d;
        if (aVar == null) {
            return true;
        }
        return aVar.a(f11 * this.f99158e);
    }

    public float l() {
        return this.f99158e;
    }

    public void m(float f11) {
        this.f99158e = f11;
    }
}
