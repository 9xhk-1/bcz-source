package h2;

import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.n;
import com.badlogic.gdx.utils.JsonValue;
import e2.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class c extends h2.d {

    /* renamed from: n, reason: collision with root package name */
    public static final Vector3 f57985n = new Vector3();

    /* renamed from: o, reason: collision with root package name */
    public static final Vector3 f57986o = new Vector3();

    /* renamed from: p, reason: collision with root package name */
    public static final Vector3 f57987p = new Vector3();

    /* renamed from: q, reason: collision with root package name */
    public static final Quaternion f57988q = new Quaternion();

    /* renamed from: l, reason: collision with root package name */
    public boolean f57989l;

    /* renamed from: m, reason: collision with root package name */
    public a.d f57990m;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b extends h {

        /* renamed from: t, reason: collision with root package name */
        public a.d f57994t;

        public b() {
        }

        @Override // e2.d
        public void C0() {
            int i11 = this.f48397a.f48380e.f48329c;
            int i12 = 2;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            while (i13 < i11) {
                float[] fArr = this.f58003r.f48337e;
                float q11 = fArr[i14] + (fArr[i14 + 1] * this.f58004s.q(this.f57990m.f48337e[i12]));
                Vector3 vector3 = c.f57987p;
                vector3.set(n.L(-1.0f, 1.0f), n.L(-1.0f, 1.0f), n.L(-1.0f, 1.0f)).nor().scl(q11);
                a.d dVar = this.f57994t;
                float[] fArr2 = dVar.f48337e;
                fArr2[i15] = fArr2[i15] + vector3.f12537x;
                int i16 = i15 + 1;
                fArr2[i16] = fArr2[i16] + vector3.f12538y;
                int i17 = i15 + 2;
                fArr2[i17] = fArr2[i17] + vector3.f12539z;
                i13++;
                i14 += this.f58003r.f48332c;
                i15 += dVar.f48332c;
                i12 += this.f57990m.f48332c;
            }
        }

        @Override // e2.d
        /* renamed from: J0, reason: merged with bridge method [inline-methods] */
        public b Z() {
            return new b(this);
        }

        @Override // h2.c.h, h2.c, e2.d
        public void X() {
            super.X();
            this.f57994t = (a.d) this.f48397a.f48380e.a(e2.b.f48355m);
        }

        public b(b bVar) {
            super(bVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: h2.c$c, reason: collision with other inner class name */
    public static class C0648c extends h {

        /* renamed from: t, reason: collision with root package name */
        public a.d f57995t;

        /* renamed from: u, reason: collision with root package name */
        public a.d f57996u;

        public C0648c() {
        }

        @Override // e2.d
        public void C0() {
            float f11;
            float f12;
            float f13;
            if (this.f57989l) {
                f11 = 0.0f;
                f12 = 0.0f;
                f13 = 0.0f;
            } else {
                float[] fArr = this.f48397a.f48382g.val;
                f11 = fArr[12];
                f13 = fArr[13];
                f12 = fArr[14];
            }
            int i11 = this.f48397a.f48380e.f48329c;
            int i12 = 2;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            while (i13 < i11) {
                float[] fArr2 = this.f58003r.f48337e;
                float q11 = fArr2[i14] + (fArr2[i14 + 1] * this.f58004s.q(this.f57990m.f48337e[i12]));
                Vector3 vector3 = c.f57987p;
                float[] fArr3 = this.f57996u.f48337e;
                vector3.set(fArr3[i15] - f11, fArr3[i15 + 1] - f13, fArr3[i15 + 2] - f12).nor().scl(q11);
                a.d dVar = this.f57995t;
                float[] fArr4 = dVar.f48337e;
                fArr4[i16] = fArr4[i16] + vector3.f12537x;
                int i17 = i16 + 1;
                fArr4[i17] = fArr4[i17] + vector3.f12538y;
                int i18 = i16 + 2;
                fArr4[i18] = fArr4[i18] + vector3.f12539z;
                i13++;
                i15 += this.f57996u.f48332c;
                i14 += this.f58003r.f48332c;
                i16 += dVar.f48332c;
                i12 += this.f57990m.f48332c;
            }
        }

        @Override // e2.d
        /* renamed from: J0, reason: merged with bridge method [inline-methods] */
        public C0648c Z() {
            return new C0648c(this);
        }

        @Override // h2.c.h, h2.c, e2.d
        public void X() {
            super.X();
            this.f57995t = (a.d) this.f48397a.f48380e.a(e2.b.f48355m);
            this.f57996u = (a.d) this.f48397a.f48380e.a(e2.b.f48346d);
        }

        public C0648c(C0648c c0648c) {
            super(c0648c);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d extends c {

        /* renamed from: r, reason: collision with root package name */
        public a.d f57997r;

        /* renamed from: s, reason: collision with root package name */
        public a.d f57998s;

        public d() {
        }

        @Override // e2.d
        public void C0() {
            int i11 = this.f48397a.f48380e.f48329c * this.f57997r.f48332c;
            int i12 = 0;
            int i13 = 0;
            while (i12 < i11) {
                Vector3 vector3 = c.f57985n;
                float[] fArr = this.f57998s.f48337e;
                Vector3 nor = vector3.set(fArr[i13], fArr[i13 + 1], fArr[i13 + 2]).nor();
                Vector3 nor2 = c.f57986o.set(vector3).crs(Vector3.Y).nor().crs(vector3).nor();
                Vector3 nor3 = c.f57987p.set(nor2).crs(nor).nor();
                Quaternion quaternion = c.f57988q;
                quaternion.setFromAxes(false, nor3.f12537x, nor2.f12537x, nor.f12537x, nor3.f12538y, nor2.f12538y, nor.f12538y, nor3.f12539z, nor2.f12539z, nor.f12539z);
                a.d dVar = this.f57997r;
                float[] fArr2 = dVar.f48337e;
                fArr2[i12] = quaternion.f12530x;
                fArr2[i12 + 1] = quaternion.f12531y;
                fArr2[i12 + 2] = quaternion.f12532z;
                fArr2[i12 + 3] = quaternion.f12529w;
                i12 += dVar.f48332c;
                i13 += this.f57998s.f48332c;
            }
        }

        @Override // h2.c, e2.d
        public void X() {
            this.f57997r = (a.d) this.f48397a.f48380e.a(e2.b.f48351i);
            this.f57998s = (a.d) this.f48397a.f48380e.a(e2.b.f48355m);
        }

        @Override // e2.d
        public e2.d Z() {
            return new d(this);
        }

        public d(d dVar) {
            super(dVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e extends a {

        /* renamed from: w, reason: collision with root package name */
        public a.d f57999w;

        public e() {
        }

        @Override // e2.d
        public void C0() {
            int i11 = this.f48397a.f48380e.f48329c * this.f57999w.f48332c;
            int i12 = 0;
            int i13 = 0;
            int i14 = 2;
            int i15 = 0;
            while (i12 < i11) {
                float f11 = this.f57990m.f48337e[i14];
                float[] fArr = this.f58003r.f48337e;
                float q11 = fArr[i15] + (fArr[i15 + 1] * this.f58004s.q(f11));
                float[] fArr2 = this.f57991t.f48337e;
                float q12 = fArr2[i13 + 2] + (fArr2[i13 + 3] * this.f57993v.q(f11));
                float[] fArr3 = this.f57991t.f48337e;
                float q13 = fArr3[i13] + (fArr3[i13 + 1] * this.f57992u.q(f11));
                float t11 = n.t(q13);
                float a02 = n.a0(q13);
                float t12 = n.t(q12);
                float a03 = n.a0(q12);
                Vector3 vector3 = c.f57987p;
                vector3.set(t11 * a03, t12, a02 * a03).nor().scl(q11);
                if (!this.f57989l) {
                    Matrix4 matrix4 = this.f48397a.f48382g;
                    Quaternion quaternion = c.f57988q;
                    matrix4.getRotation(quaternion, true);
                    vector3.mul(quaternion);
                }
                a.d dVar = this.f57999w;
                float[] fArr4 = dVar.f48337e;
                fArr4[i12] = fArr4[i12] + vector3.f12537x;
                int i16 = i12 + 1;
                fArr4[i16] = fArr4[i16] + vector3.f12538y;
                int i17 = i12 + 2;
                fArr4[i17] = fArr4[i17] + vector3.f12539z;
                i15 += this.f58003r.f48332c;
                i12 += dVar.f48332c;
                i13 += this.f57991t.f48332c;
                i14 += this.f57990m.f48332c;
            }
        }

        @Override // e2.d
        /* renamed from: J0, reason: merged with bridge method [inline-methods] */
        public e Z() {
            return new e(this);
        }

        @Override // h2.c.a, h2.c.h, h2.c, e2.d
        public void X() {
            super.X();
            this.f57999w = (a.d) this.f48397a.f48380e.a(e2.b.f48355m);
        }

        public e(e eVar) {
            super(eVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class f extends h {

        /* renamed from: t, reason: collision with root package name */
        public a.d f58000t;

        public f() {
        }

        @Override // e2.d
        public void C0() {
            int i11 = this.f48397a.f48380e.f48329c * this.f58000t.f48332c;
            int i12 = 0;
            int i13 = 2;
            int i14 = 0;
            while (i12 < i11) {
                float[] fArr = this.f58000t.f48337e;
                float f11 = fArr[i12];
                float[] fArr2 = this.f58003r.f48337e;
                fArr[i12] = f11 + fArr2[i14] + (fArr2[i14 + 1] * this.f58004s.q(this.f57990m.f48337e[i13]));
                i14 += this.f58003r.f48332c;
                i12 += this.f58000t.f48332c;
                i13 += this.f57990m.f48332c;
            }
        }

        @Override // e2.d
        /* renamed from: J0, reason: merged with bridge method [inline-methods] */
        public f Z() {
            return new f(this);
        }

        @Override // h2.c.h, h2.c, e2.d
        public void X() {
            super.X();
            this.f58000t = (a.d) this.f48397a.f48380e.a(e2.b.f48356n);
        }

        public f(f fVar) {
            super(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class g extends a {

        /* renamed from: w, reason: collision with root package name */
        public a.d f58001w;

        /* renamed from: x, reason: collision with root package name */
        public a.d f58002x;

        public g() {
        }

        @Override // e2.d
        public void C0() {
            int i11 = this.f48397a.f48380e.f48329c * this.f58002x.f48332c;
            int i12 = 0;
            int i13 = 0;
            int i14 = 2;
            int i15 = 0;
            while (i12 < i11) {
                float f11 = this.f57990m.f48337e[i14];
                float[] fArr = this.f58003r.f48337e;
                float q11 = fArr[i15] + (fArr[i15 + 1] * this.f58004s.q(f11));
                float[] fArr2 = this.f57991t.f48337e;
                float q12 = fArr2[i13 + 2] + (fArr2[i13 + 3] * this.f57993v.q(f11));
                float[] fArr3 = this.f57991t.f48337e;
                float q13 = fArr3[i13] + (fArr3[i13 + 1] * this.f57992u.q(f11));
                float t11 = n.t(q13);
                float a02 = n.a0(q13);
                float t12 = n.t(q12);
                float a03 = n.a0(q12);
                Vector3 vector3 = c.f57987p;
                vector3.set(t11 * a03, t12, a02 * a03);
                vector3.scl(q11 * 0.017453292f);
                a.d dVar = this.f58002x;
                float[] fArr4 = dVar.f48337e;
                fArr4[i12] = fArr4[i12] + vector3.f12537x;
                int i16 = i12 + 1;
                fArr4[i16] = fArr4[i16] + vector3.f12538y;
                int i17 = i12 + 2;
                fArr4[i17] = fArr4[i17] + vector3.f12539z;
                i15 += this.f58003r.f48332c;
                i12 += dVar.f48332c;
                i13 += this.f57991t.f48332c;
                i14 += this.f57990m.f48332c;
            }
        }

        @Override // e2.d
        /* renamed from: J0, reason: merged with bridge method [inline-methods] */
        public g Z() {
            return new g(this);
        }

        @Override // h2.c.a, h2.c.h, h2.c, e2.d
        public void X() {
            super.X();
            this.f58001w = (a.d) this.f48397a.f48380e.a(e2.b.f48351i);
            this.f58002x = (a.d) this.f48397a.f48380e.a(e2.b.f48357o);
        }

        public g(g gVar) {
            super(gVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class i extends a {

        /* renamed from: w, reason: collision with root package name */
        public a.d f58005w;

        /* renamed from: x, reason: collision with root package name */
        public a.d f58006x;

        public i() {
        }

        @Override // e2.d
        public void C0() {
            int i11 = this.f48397a.f48380e.f48329c * this.f58005w.f48332c;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            int i15 = 2;
            int i16 = 0;
            while (i12 < i11) {
                float f11 = this.f57990m.f48337e[i15];
                float[] fArr = this.f58003r.f48337e;
                float q11 = fArr[i16] + (fArr[i16 + 1] * this.f58004s.q(f11));
                float[] fArr2 = this.f57991t.f48337e;
                float q12 = fArr2[i13 + 2] + (fArr2[i13 + 3] * this.f57993v.q(f11));
                float[] fArr3 = this.f57991t.f48337e;
                float q13 = fArr3[i13] + (fArr3[i13 + 1] * this.f57992u.q(f11));
                float t11 = n.t(q13);
                float a02 = n.a0(q13);
                float t12 = n.t(q12);
                float a03 = n.a0(q12);
                Vector3 vector3 = c.f57987p;
                vector3.set(t11 * a03, t12, a02 * a03);
                Vector3 vector32 = c.f57985n;
                float[] fArr4 = this.f58006x.f48337e;
                vector32.set(fArr4[i14], fArr4[i14 + 1], fArr4[i14 + 2]);
                if (!this.f57989l) {
                    Matrix4 matrix4 = this.f48397a.f48382g;
                    Vector3 vector33 = c.f57986o;
                    matrix4.getTranslation(vector33);
                    vector32.sub(vector33);
                    Matrix4 matrix42 = this.f48397a.f48382g;
                    Quaternion quaternion = c.f57988q;
                    matrix42.getRotation(quaternion, true);
                    vector3.mul(quaternion);
                }
                vector3.crs(vector32).nor().scl(q11);
                a.d dVar = this.f58005w;
                float[] fArr5 = dVar.f48337e;
                fArr5[i12] = fArr5[i12] + vector3.f12537x;
                int i17 = i12 + 1;
                fArr5[i17] = fArr5[i17] + vector3.f12538y;
                int i18 = i12 + 2;
                fArr5[i18] = fArr5[i18] + vector3.f12539z;
                i16 += this.f58003r.f48332c;
                i12 += dVar.f48332c;
                i13 += this.f57991t.f48332c;
                i15 += this.f57990m.f48332c;
                i14 += this.f58006x.f48332c;
            }
        }

        @Override // e2.d
        /* renamed from: J0, reason: merged with bridge method [inline-methods] */
        public i Z() {
            return new i(this);
        }

        @Override // h2.c.a, h2.c.h, h2.c, e2.d
        public void X() {
            super.X();
            this.f58005w = (a.d) this.f48397a.f48380e.a(e2.b.f48355m);
            this.f58006x = (a.d) this.f48397a.f48380e.a(e2.b.f48346d);
        }

        public i(i iVar) {
            super(iVar);
        }
    }

    public c() {
        this.f57989l = false;
    }

    @Override // e2.d, com.badlogic.gdx.utils.f.c
    public void D(com.badlogic.gdx.utils.f fVar, JsonValue jsonValue) {
        super.D(fVar, jsonValue);
        this.f57989l = ((Boolean) fVar.M("isGlobal", Boolean.TYPE, jsonValue)).booleanValue();
    }

    @Override // e2.d
    public void X() {
        this.f57990m = (a.d) this.f48397a.f48380e.a(e2.b.f48345c);
    }

    @Override // e2.d, com.badlogic.gdx.utils.f.c
    public void z(com.badlogic.gdx.utils.f fVar) {
        super.z(fVar);
        fVar.F0("isGlobal", Boolean.valueOf(this.f57989l));
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class h extends c {

        /* renamed from: r, reason: collision with root package name */
        public a.d f58003r;

        /* renamed from: s, reason: collision with root package name */
        public j2.j f58004s;

        public h() {
            this.f58004s = new j2.j();
        }

        @Override // h2.c, e2.d, com.badlogic.gdx.utils.f.c
        public void D(com.badlogic.gdx.utils.f fVar, JsonValue jsonValue) {
            super.D(fVar, jsonValue);
            this.f58004s = (j2.j) fVar.M("strengthValue", j2.j.class, jsonValue);
        }

        @Override // e2.d
        public void R(int i11, int i12) {
            int i13 = this.f58003r.f48332c;
            int i14 = i11 * i13;
            int i15 = (i12 * i13) + i14;
            while (i14 < i15) {
                float i16 = this.f58004s.i();
                float v11 = this.f58004s.v();
                if (!this.f58004s.t()) {
                    v11 -= i16;
                }
                a.d dVar = this.f58003r;
                float[] fArr = dVar.f48337e;
                fArr[i14] = i16;
                fArr[i14 + 1] = v11;
                i14 += dVar.f48332c;
            }
        }

        @Override // h2.c, e2.d
        public void X() {
            super.X();
            a.b bVar = e2.b.f48358p;
            bVar.f48334a = this.f48397a.f48381f.b();
            this.f58003r = (a.d) this.f48397a.f48380e.a(bVar);
        }

        @Override // h2.c, e2.d, com.badlogic.gdx.utils.f.c
        public void z(com.badlogic.gdx.utils.f fVar) {
            super.z(fVar);
            fVar.F0("strengthValue", this.f58004s);
        }

        public h(h hVar) {
            super(hVar);
            j2.j jVar = new j2.j();
            this.f58004s = jVar;
            jVar.u(hVar.f58004s);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class a extends h {

        /* renamed from: t, reason: collision with root package name */
        public a.d f57991t;

        /* renamed from: u, reason: collision with root package name */
        public j2.j f57992u;

        /* renamed from: v, reason: collision with root package name */
        public j2.j f57993v;

        public a() {
            this.f57992u = new j2.j();
            this.f57993v = new j2.j();
        }

        @Override // h2.c.h, h2.c, e2.d, com.badlogic.gdx.utils.f.c
        public void D(com.badlogic.gdx.utils.f fVar, JsonValue jsonValue) {
            super.D(fVar, jsonValue);
            this.f57992u = (j2.j) fVar.M("thetaValue", j2.j.class, jsonValue);
            this.f57993v = (j2.j) fVar.M("phiValue", j2.j.class, jsonValue);
        }

        @Override // h2.c.h, e2.d
        public void R(int i11, int i12) {
            super.R(i11, i12);
            int i13 = this.f57991t.f48332c;
            int i14 = i11 * i13;
            int i15 = (i12 * i13) + i14;
            while (i14 < i15) {
                float i16 = this.f57992u.i();
                float v11 = this.f57992u.v();
                if (!this.f57992u.t()) {
                    v11 -= i16;
                }
                float[] fArr = this.f57991t.f48337e;
                fArr[i14] = i16;
                fArr[i14 + 1] = v11;
                float i17 = this.f57993v.i();
                float v12 = this.f57993v.v();
                if (!this.f57993v.t()) {
                    v12 -= i17;
                }
                a.d dVar = this.f57991t;
                float[] fArr2 = dVar.f48337e;
                fArr2[i14 + 2] = i17;
                fArr2[i14 + 3] = v12;
                i14 += dVar.f48332c;
            }
        }

        @Override // h2.c.h, h2.c, e2.d
        public void X() {
            super.X();
            a.b bVar = e2.b.f48359q;
            bVar.f48334a = this.f48397a.f48381f.b();
            this.f57991t = (a.d) this.f48397a.f48380e.a(bVar);
        }

        @Override // h2.c.h, h2.c, e2.d, com.badlogic.gdx.utils.f.c
        public void z(com.badlogic.gdx.utils.f fVar) {
            super.z(fVar);
            fVar.F0("thetaValue", this.f57992u);
            fVar.F0("phiValue", this.f57993v);
        }

        public a(a aVar) {
            super(aVar);
            this.f57992u = new j2.j();
            this.f57993v = new j2.j();
            this.f57992u.u(aVar.f57992u);
            this.f57993v.u(aVar.f57993v);
        }
    }

    public c(c cVar) {
        this.f57989l = false;
        this.f57989l = cVar.f57989l;
    }
}
