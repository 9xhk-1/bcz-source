package h2;

import com.badlogic.gdx.utils.JsonValue;
import e2.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class j extends d {

    /* renamed from: l, reason: collision with root package name */
    public j2.j f58032l;

    /* renamed from: m, reason: collision with root package name */
    public a.d f58033m;

    /* renamed from: n, reason: collision with root package name */
    public a.d f58034n;

    /* renamed from: o, reason: collision with root package name */
    public a.d f58035o;

    /* renamed from: p, reason: collision with root package name */
    public a.b f58036p;

    public j() {
        j2.j jVar = new j2.j();
        this.f58032l = jVar;
        jVar.w(1.0f);
    }

    @Override // e2.d
    public void C0() {
        int i11 = this.f48397a.f48380e.f48329c * this.f58033m.f48332c;
        int i12 = 0;
        int i13 = 2;
        int i14 = 0;
        while (i12 < i11) {
            float[] fArr = this.f58033m.f48337e;
            float[] fArr2 = this.f58034n.f48337e;
            fArr[i12] = fArr2[i14] + (fArr2[i14 + 1] * this.f58032l.q(this.f58035o.f48337e[i13]));
            i12 += this.f58033m.f48332c;
            i14 += this.f58034n.f48332c;
            i13 += this.f58035o.f48332c;
        }
    }

    @Override // e2.d, com.badlogic.gdx.utils.f.c
    public void D(com.badlogic.gdx.utils.f fVar, JsonValue jsonValue) {
        this.f58032l = (j2.j) fVar.M("value", j2.j.class, jsonValue);
    }

    public final void J0(j jVar) {
        this.f58032l.u(jVar.f58032l);
        this.f58036p = jVar.f58036p;
    }

    @Override // e2.d
    public void R(int i11, int i12) {
        if (this.f58032l.t()) {
            int i13 = this.f58033m.f48332c;
            int i14 = i11 * i13;
            int i15 = i11 * this.f58034n.f48332c;
            int i16 = (i12 * i13) + i14;
            while (i14 < i16) {
                float i17 = this.f58032l.i();
                float v11 = this.f58032l.v();
                float[] fArr = this.f58034n.f48337e;
                fArr[i15] = i17;
                fArr[i15 + 1] = v11;
                this.f58033m.f48337e[i14] = i17 + (v11 * this.f58032l.q(0.0f));
                i14 += this.f58033m.f48332c;
                i15 += this.f58034n.f48332c;
            }
            return;
        }
        int i18 = this.f58033m.f48332c;
        int i19 = i11 * i18;
        int i21 = i11 * this.f58034n.f48332c;
        int i22 = (i12 * i18) + i19;
        while (i19 < i22) {
            float i23 = this.f58032l.i();
            float v12 = this.f58032l.v() - i23;
            float[] fArr2 = this.f58034n.f48337e;
            fArr2[i21] = i23;
            fArr2[i21 + 1] = v12;
            this.f58033m.f48337e[i19] = i23 + (v12 * this.f58032l.q(0.0f));
            i19 += this.f58033m.f48332c;
            i21 += this.f58034n.f48332c;
        }
    }

    @Override // e2.d
    public void X() {
        this.f58033m = (a.d) this.f48397a.f48380e.a(this.f58036p);
        a.b bVar = e2.b.f48358p;
        bVar.f48334a = this.f48397a.f48381f.b();
        this.f58034n = (a.d) this.f48397a.f48380e.a(bVar);
        this.f58035o = (a.d) this.f48397a.f48380e.a(e2.b.f48345c);
    }

    @Override // e2.d, com.badlogic.gdx.utils.f.c
    public void z(com.badlogic.gdx.utils.f fVar) {
        fVar.F0("value", this.f58032l);
    }

    public j(j jVar) {
        this();
        J0(jVar);
    }
}
