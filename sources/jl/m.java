package jl;

import a3.d0;
import a3.r;
import com.esotericsoftware.spine.Skeleton;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public final n f64407a;

    /* renamed from: b, reason: collision with root package name */
    public final com.esotericsoftware.spine.b f64408b;

    /* renamed from: d, reason: collision with root package name */
    @d0
    public final com.badlogic.gdx.graphics.b f64410d;

    /* renamed from: e, reason: collision with root package name */
    @d0
    public ol.b f64411e;

    /* renamed from: f, reason: collision with root package name */
    public int f64412f;

    /* renamed from: h, reason: collision with root package name */
    public int f64414h;

    /* renamed from: c, reason: collision with root package name */
    public com.badlogic.gdx.graphics.b f64409c = new com.badlogic.gdx.graphics.b();

    /* renamed from: g, reason: collision with root package name */
    public r f64413g = new r();

    public m(n nVar, com.esotericsoftware.spine.b bVar) {
        if (nVar == null) {
            throw new IllegalArgumentException("data cannot be null.");
        }
        if (bVar == null) {
            throw new IllegalArgumentException("bone cannot be null.");
        }
        this.f64407a = nVar;
        this.f64408b = bVar;
        this.f64410d = nVar.f64419e == null ? null : new com.badlogic.gdx.graphics.b();
        m();
    }

    @d0
    public ol.b a() {
        return this.f64411e;
    }

    public com.esotericsoftware.spine.b b() {
        return this.f64408b;
    }

    public com.badlogic.gdx.graphics.b c() {
        return this.f64409c;
    }

    @d0
    public com.badlogic.gdx.graphics.b d() {
        return this.f64410d;
    }

    public n e() {
        return this.f64407a;
    }

    public r f() {
        return this.f64413g;
    }

    public int g() {
        return this.f64412f;
    }

    public Skeleton h() {
        return this.f64408b.f29331b;
    }

    public void i(@d0 ol.b bVar) {
        ol.b bVar2 = this.f64411e;
        if (bVar2 == bVar) {
            return;
        }
        if (!(bVar instanceof ol.l) || !(bVar2 instanceof ol.l) || ((ol.l) bVar).m() != ((ol.l) this.f64411e).m()) {
            this.f64413g.i();
        }
        this.f64411e = bVar;
        this.f64412f = -1;
    }

    public void j(com.badlogic.gdx.graphics.b bVar) {
        this.f64409c = bVar;
    }

    public void k(r rVar) {
        if (rVar == null) {
            throw new IllegalArgumentException("deform cannot be null.");
        }
        this.f64413g = rVar;
    }

    public void l(int i11) {
        this.f64412f = i11;
    }

    public void m() {
        this.f64409c.H(this.f64407a.f64418d);
        com.badlogic.gdx.graphics.b bVar = this.f64410d;
        if (bVar != null) {
            bVar.H(this.f64407a.f64419e);
        }
        n nVar = this.f64407a;
        String str = nVar.f64420f;
        if (str == null) {
            i(null);
        } else {
            this.f64411e = null;
            i(this.f64408b.f29331b.g(nVar.f64415a, str));
        }
    }

    public String toString() {
        return this.f64407a.f64416b;
    }

    public m(m mVar, com.esotericsoftware.spine.b bVar) {
        if (mVar == null) {
            throw new IllegalArgumentException("slot cannot be null.");
        }
        if (bVar != null) {
            this.f64407a = mVar.f64407a;
            this.f64408b = bVar;
            this.f64409c.H(mVar.f64409c);
            this.f64410d = mVar.f64410d == null ? null : new com.badlogic.gdx.graphics.b(mVar.f64410d);
            this.f64411e = mVar.f64411e;
            this.f64412f = mVar.f64412f;
            this.f64413g.e(mVar.f64413g);
            return;
        }
        throw new IllegalArgumentException("bone cannot be null.");
    }
}
