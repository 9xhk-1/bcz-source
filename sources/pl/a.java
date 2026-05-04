package pl;

import com.esotericsoftware.spine.Skeleton;
import jl.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class a extends com.badlogic.gdx.scenes.scene2d.a {

    /* renamed from: u, reason: collision with root package name */
    public k f80782u;

    /* renamed from: v, reason: collision with root package name */
    public Skeleton f80783v;

    /* renamed from: w, reason: collision with root package name */
    public com.esotericsoftware.spine.a f80784w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f80785x = true;

    public a() {
    }

    @Override // com.badlogic.gdx.scenes.scene2d.a
    public void a1(float f11) {
        this.f80784w.F(f11);
        this.f80784w.f(this.f80783v);
        super.a1(f11);
    }

    public com.esotericsoftware.spine.a a3() {
        return this.f80784w;
    }

    public k b3() {
        return this.f80782u;
    }

    public boolean c3() {
        return this.f80785x;
    }

    public Skeleton d3() {
        return this.f80783v;
    }

    public void e3(com.esotericsoftware.spine.a aVar) {
        this.f80784w = aVar;
    }

    public void f3(k kVar) {
        this.f80782u = kVar;
    }

    public void g3(boolean z11) {
        this.f80785x = z11;
    }

    public void h3(Skeleton skeleton) {
        this.f80783v = skeleton;
    }

    public void i3() {
        this.f80783v.d0(Skeleton.Physics.update);
    }

    @Override // com.badlogic.gdx.scenes.scene2d.a
    public void n1(w1.a aVar, float f11) {
        int b02 = aVar.b0();
        int H0 = aVar.H0();
        int X0 = aVar.X0();
        int J = aVar.J();
        com.badlogic.gdx.graphics.b l11 = this.f80783v.l();
        float f12 = l11.f11547d;
        this.f80783v.l().f11547d *= f11;
        this.f80783v.I(K1(), M1());
        i3();
        this.f80782u.b(aVar, this.f80783v);
        if (this.f80785x) {
            aVar.k0(b02, H0, X0, J);
        }
        l11.f11547d = f12;
    }

    public a(k kVar, Skeleton skeleton, com.esotericsoftware.spine.a aVar) {
        this.f80782u = kVar;
        this.f80783v = skeleton;
        this.f80784w = aVar;
    }
}
