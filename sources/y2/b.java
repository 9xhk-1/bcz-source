package y2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class b extends x2.a {

    /* renamed from: d, reason: collision with root package name */
    public x2.a f99139d;

    @Override // x2.a
    public boolean a(float f11) {
        this.f97056b.b1(this.f99139d);
        return true;
    }

    @Override // x2.a
    public void e() {
        x2.a aVar = this.f99139d;
        if (aVar != null) {
            aVar.e();
        }
    }

    public x2.a i() {
        return this.f99139d;
    }

    public void j(x2.a aVar) {
        this.f99139d = aVar;
    }

    @Override // x2.a, a3.j0.a
    public void reset() {
        super.reset();
        this.f99139d = null;
    }
}
