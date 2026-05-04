package com.badlogic.gdx.scenes.scene2d.ui;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class m extends com.badlogic.gdx.scenes.scene2d.a implements a3.q {

    /* renamed from: u, reason: collision with root package name */
    public final w1.d f12970u;

    /* renamed from: v, reason: collision with root package name */
    public float f12971v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f12972w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f12973x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f12974y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f12975z;

    public m(w1.d dVar, boolean z11) {
        this.f12970u = dVar;
        this.f12974y = z11;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.a
    public void a1(float f11) {
        super.a1(f11);
        this.f12971v += f11;
        if (this.f12975z && this.f12970u.Z()) {
            j2();
        }
    }

    public void a3() {
        this.f12970u.b();
    }

    public void b3() {
        this.f12972w = true;
    }

    public w1.d c3() {
        return this.f12970u;
    }

    public boolean d3() {
        return this.f12975z;
    }

    @Override // a3.q
    public void dispose() {
        if (this.f12973x) {
            this.f12970u.dispose();
        }
    }

    public boolean e3() {
        return this.f12974y;
    }

    public boolean f3() {
        return this.f12972w;
    }

    public m g3(boolean z11) {
        this.f12975z = z11;
        return this;
    }

    public m h3(boolean z11) {
        this.f12974y = z11;
        return this;
    }

    public void i3() {
        this.f12972w = true;
        if (this.f12974y) {
            this.f12970u.f1(false);
        }
        this.f12970u.p1();
    }

    @Override // com.badlogic.gdx.scenes.scene2d.a
    public void n1(w1.a aVar, float f11) {
        this.f12970u.o1(K1(), M1());
        float f12 = this.f12971v;
        if (f12 > 0.0f) {
            this.f12970u.q1(f12);
            this.f12971v = 0.0f;
        }
        if (this.f12972w) {
            this.f12970u.o(aVar);
            this.f12972w = !this.f12970u.Z();
        }
    }

    @Override // com.badlogic.gdx.scenes.scene2d.a
    public void r2() {
        super.r2();
        this.f12970u.k1(D1(), E1(), E1());
    }

    public m(v1.a aVar, com.badlogic.gdx.graphics.g2d.e eVar) {
        w1.d dVar = new w1.d();
        this.f12970u = dVar;
        dVar.i0(aVar, eVar);
        this.f12973x = true;
    }

    public m(v1.a aVar, v1.a aVar2) {
        w1.d dVar = new w1.d();
        this.f12970u = dVar;
        dVar.w0(aVar, aVar2);
        this.f12973x = true;
    }
}
