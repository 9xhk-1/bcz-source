package ol;

import com.badlogic.gdx.math.Vector2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class i extends b {

    /* renamed from: b, reason: collision with root package name */
    public float f77569b;

    /* renamed from: c, reason: collision with root package name */
    public float f77570c;

    /* renamed from: d, reason: collision with root package name */
    public float f77571d;

    /* renamed from: e, reason: collision with root package name */
    public final com.badlogic.gdx.graphics.b f77572e;

    public i(String str) {
        super(str);
        this.f77572e = new com.badlogic.gdx.graphics.b(0.9451f, 0.9451f, 0.0f, 1.0f);
    }

    public com.badlogic.gdx.graphics.b e() {
        return this.f77572e;
    }

    public Vector2 j(com.esotericsoftware.spine.b bVar, Vector2 vector2) {
        vector2.f12535x = (this.f77569b * bVar.b()) + (this.f77570c * bVar.j()) + bVar.B();
        vector2.f12536y = (this.f77569b * bVar.k()) + (this.f77570c * bVar.m()) + bVar.C();
        return vector2;
    }

    public float k(com.esotericsoftware.spine.b bVar) {
        float f11 = this.f77571d * 0.017453292f;
        float d11 = pl.g.d(f11);
        float f12 = pl.g.f(f11);
        return pl.g.c((d11 * bVar.k()) + (f12 * bVar.m()), (bVar.b() * d11) + (bVar.j() * f12));
    }

    @Override // ol.b
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public i h() {
        return new i(this);
    }

    public float m() {
        return this.f77571d;
    }

    public float n() {
        return this.f77569b;
    }

    public float o() {
        return this.f77570c;
    }

    public void p(float f11) {
        this.f77571d = f11;
    }

    public void q(float f11) {
        this.f77569b = f11;
    }

    public void r(float f11) {
        this.f77570c = f11;
    }

    public i(i iVar) {
        super(iVar);
        com.badlogic.gdx.graphics.b bVar = new com.badlogic.gdx.graphics.b(0.9451f, 0.9451f, 0.0f, 1.0f);
        this.f77572e = bVar;
        this.f77569b = iVar.f77569b;
        this.f77570c = iVar.f77570c;
        this.f77571d = iVar.f77571d;
        bVar.H(iVar.f77572e);
    }
}
