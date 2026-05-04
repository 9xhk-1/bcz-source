package y2;

import a3.j0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class i extends x2.a {

    /* renamed from: d, reason: collision with root package name */
    public x2.a f99171d;

    @Override // x2.a
    public final boolean a(float f11) {
        j0 c11 = c();
        g(null);
        try {
            return i(f11);
        } finally {
            g(c11);
        }
    }

    @Override // x2.a
    public void e() {
        x2.a aVar = this.f99171d;
        if (aVar != null) {
            aVar.e();
        }
    }

    @Override // x2.a
    public void f(com.badlogic.gdx.scenes.scene2d.a aVar) {
        x2.a aVar2 = this.f99171d;
        if (aVar2 != null) {
            aVar2.f(aVar);
        }
        super.f(aVar);
    }

    @Override // x2.a
    public void h(com.badlogic.gdx.scenes.scene2d.a aVar) {
        x2.a aVar2 = this.f99171d;
        if (aVar2 != null) {
            aVar2.h(aVar);
        }
        super.h(aVar);
    }

    public abstract boolean i(float f11);

    public x2.a j() {
        return this.f99171d;
    }

    public void k(x2.a aVar) {
        this.f99171d = aVar;
    }

    @Override // x2.a, a3.j0.a
    public void reset() {
        super.reset();
        this.f99171d = null;
    }

    @Override // x2.a
    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        if (this.f99171d == null) {
            str = "";
        } else {
            str = pn.j.f81006c + this.f99171d + pn.j.f81007d;
        }
        sb2.append(str);
        return sb2.toString();
    }
}
