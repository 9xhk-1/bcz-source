package q2;

import com.badlogic.gdx.utils.GdxRuntimeException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public String f81437a = "";

    /* renamed from: b, reason: collision with root package name */
    public float f81438b = 1.0f;

    /* renamed from: c, reason: collision with root package name */
    public com.badlogic.gdx.graphics.b f81439c;

    /* renamed from: d, reason: collision with root package name */
    public com.badlogic.gdx.graphics.b f81440d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f81441e;

    /* renamed from: f, reason: collision with root package name */
    public float f81442f;

    /* renamed from: g, reason: collision with root package name */
    public float f81443g;

    /* renamed from: h, reason: collision with root package name */
    public float f81444h;

    /* renamed from: i, reason: collision with root package name */
    public float f81445i;

    /* renamed from: j, reason: collision with root package name */
    public float f81446j;

    /* renamed from: k, reason: collision with root package name */
    public float f81447k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f81448l;

    /* renamed from: m, reason: collision with root package name */
    public d f81449m;

    /* renamed from: n, reason: collision with root package name */
    public g f81450n;

    /* renamed from: o, reason: collision with root package name */
    public h f81451o;

    public d() {
        com.badlogic.gdx.graphics.b bVar = com.badlogic.gdx.graphics.b.f11522e;
        this.f81439c = new com.badlogic.gdx.graphics.b(bVar);
        this.f81440d = new com.badlogic.gdx.graphics.b(bVar);
        this.f81441e = true;
        this.f81446j = 1.0f;
        this.f81447k = 1.0f;
        this.f81448l = true;
        this.f81450n = new g();
        this.f81451o = new h();
    }

    public void a() {
        d dVar = this.f81449m;
        if (dVar != null) {
            dVar.a();
            this.f81444h = this.f81449m.l() + this.f81442f;
            this.f81445i = this.f81449m.m() + this.f81443g;
        } else {
            this.f81444h = this.f81442f;
            this.f81445i = this.f81443g;
        }
        this.f81448l = false;
    }

    public com.badlogic.gdx.graphics.b b() {
        return this.f81449m != null ? this.f81440d.H(this.f81439c).r(this.f81449m.b()) : this.f81440d.H(this.f81439c);
    }

    public String c() {
        return this.f81437a;
    }

    public g d() {
        return this.f81450n;
    }

    public float e() {
        return this.f81442f;
    }

    public float f() {
        return this.f81443g;
    }

    public float g() {
        d dVar = this.f81449m;
        return dVar != null ? this.f81438b * dVar.g() : this.f81438b;
    }

    public float h() {
        return this.f81446j;
    }

    public float i() {
        return this.f81447k;
    }

    public d j() {
        return this.f81449m;
    }

    public h k() {
        return this.f81451o;
    }

    public float l() {
        if (this.f81448l) {
            a();
        }
        return this.f81444h;
    }

    public float m() {
        if (this.f81448l) {
            a();
        }
        return this.f81445i;
    }

    public com.badlogic.gdx.graphics.b n() {
        return this.f81439c;
    }

    public void o() {
        this.f81448l = true;
    }

    public boolean p() {
        return this.f81441e;
    }

    public void q(String str) {
        this.f81437a = str;
    }

    public void r(float f11) {
        this.f81442f = f11;
        o();
    }

    public void s(float f11) {
        this.f81443g = f11;
        o();
    }

    public void t(float f11) {
        this.f81438b = f11;
    }

    public void u(float f11) {
        this.f81446j = f11;
    }

    public void v(float f11) {
        this.f81447k = f11;
    }

    public void w(d dVar) {
        if (dVar == this) {
            throw new GdxRuntimeException("Can't set self as the parent");
        }
        this.f81449m = dVar;
    }

    public void x(com.badlogic.gdx.graphics.b bVar) {
        this.f81439c.H(bVar);
    }

    public void y(boolean z11) {
        this.f81441e = z11;
    }
}
