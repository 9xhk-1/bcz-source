package y2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class d extends i {

    /* renamed from: e, reason: collision with root package name */
    public com.badlogic.gdx.utils.a<x2.a> f99148e = new com.badlogic.gdx.utils.a<>(false, 4);

    @Override // y2.i, x2.a
    public void e() {
        super.e();
        this.f99148e.clear();
    }

    @Override // y2.i, x2.a
    public void h(com.badlogic.gdx.scenes.scene2d.a aVar) {
        if (aVar != null) {
            this.f99148e.g(aVar.s1());
        }
        super.h(aVar);
    }

    @Override // y2.i
    public boolean i(float f11) {
        com.badlogic.gdx.utils.a<x2.a> s12 = this.f97056b.s1();
        if (s12.f13179b == 1) {
            this.f99148e.clear();
        }
        for (int i11 = this.f99148e.f13179b - 1; i11 >= 0; i11--) {
            if (s12.q(this.f99148e.get(i11), true) == -1) {
                this.f99148e.A(i11);
            }
        }
        if (this.f99148e.f13179b > 0) {
            return false;
        }
        return this.f99171d.a(f11);
    }
}
