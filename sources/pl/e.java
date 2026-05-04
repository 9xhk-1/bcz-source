package pl;

import com.esotericsoftware.spine.Skeleton;
import jl.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class e extends z2.c {

    /* renamed from: h, reason: collision with root package name */
    public k f80807h;

    /* renamed from: i, reason: collision with root package name */
    public Skeleton f80808i;

    /* renamed from: j, reason: collision with root package name */
    public com.esotericsoftware.spine.a f80809j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f80810k = true;

    public e() {
    }

    public void A(float f11) {
        this.f80809j.F(f11);
        this.f80809j.f(this.f80808i);
    }

    public void B() {
        this.f80808i.d0(Skeleton.Physics.update);
    }

    public com.esotericsoftware.spine.a g() {
        return this.f80809j;
    }

    public k h() {
        return this.f80807h;
    }

    public boolean i() {
        return this.f80810k;
    }

    public Skeleton j() {
        return this.f80808i;
    }

    public void k(com.esotericsoftware.spine.a aVar) {
        this.f80809j = aVar;
    }

    public void l(k kVar) {
        this.f80807h = kVar;
    }

    public void m(boolean z11) {
        this.f80810k = z11;
    }

    public void n(Skeleton skeleton) {
        this.f80808i = skeleton;
    }

    @Override // z2.c, z2.k
    public void y(w1.a aVar, float f11, float f12, float f13, float f14) {
        int b02 = aVar.b0();
        int H0 = aVar.H0();
        int X0 = aVar.X0();
        int J = aVar.J();
        this.f80808i.I(f11, f12);
        B();
        this.f80807h.b(aVar, this.f80808i);
        if (this.f80810k) {
            aVar.k0(b02, H0, X0, J);
        }
    }

    public e(k kVar, Skeleton skeleton, com.esotericsoftware.spine.a aVar) {
        this.f80807h = kVar;
        this.f80808i = skeleton;
        this.f80809j = aVar;
    }
}
