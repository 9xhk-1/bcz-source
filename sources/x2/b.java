package x2;

import a3.j0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class b implements j0.a {

    /* renamed from: a, reason: collision with root package name */
    public com.badlogic.gdx.scenes.scene2d.c f97058a;

    /* renamed from: b, reason: collision with root package name */
    public com.badlogic.gdx.scenes.scene2d.a f97059b;

    /* renamed from: c, reason: collision with root package name */
    public com.badlogic.gdx.scenes.scene2d.a f97060c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f97061d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f97062e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f97063f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f97064g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f97065h;

    public void a() {
        this.f97065h = true;
        this.f97064g = true;
        this.f97063f = true;
    }

    public boolean b() {
        return this.f97062e;
    }

    public com.badlogic.gdx.scenes.scene2d.a c() {
        return this.f97060c;
    }

    public com.badlogic.gdx.scenes.scene2d.c d() {
        return this.f97058a;
    }

    public com.badlogic.gdx.scenes.scene2d.a e() {
        return this.f97059b;
    }

    public void f() {
        this.f97063f = true;
    }

    public boolean g() {
        return this.f97065h;
    }

    public boolean h() {
        return this.f97061d;
    }

    public boolean i() {
        return this.f97063f;
    }

    public boolean j() {
        return this.f97064g;
    }

    public void k(boolean z11) {
        this.f97062e = z11;
    }

    public void l(boolean z11) {
        this.f97061d = z11;
    }

    public void m(com.badlogic.gdx.scenes.scene2d.a aVar) {
        this.f97060c = aVar;
    }

    public void n(com.badlogic.gdx.scenes.scene2d.c cVar) {
        this.f97058a = cVar;
    }

    public void o(com.badlogic.gdx.scenes.scene2d.a aVar) {
        this.f97059b = aVar;
    }

    public void p() {
        this.f97064g = true;
    }

    @Override // a3.j0.a
    public void reset() {
        this.f97058a = null;
        this.f97059b = null;
        this.f97060c = null;
        this.f97061d = false;
        this.f97062e = true;
        this.f97063f = false;
        this.f97064g = false;
        this.f97065h = false;
    }
}
