package y2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class c extends x2.a {

    /* renamed from: d, reason: collision with root package name */
    public x2.c f99142d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f99143e;

    @Override // x2.a
    public boolean a(float f11) {
        if (this.f99143e) {
            this.f97056b.c1(this.f99142d);
            return true;
        }
        this.f97056b.d1(this.f99142d);
        return true;
    }

    public boolean i() {
        return this.f99143e;
    }

    public x2.c j() {
        return this.f99142d;
    }

    public void k(boolean z11) {
        this.f99143e = z11;
    }

    public void l(x2.c cVar) {
        this.f99142d = cVar;
    }

    @Override // x2.a, a3.j0.a
    public void reset() {
        super.reset();
        this.f99142d = null;
    }
}
