package h2;

import com.badlogic.gdx.math.n;
import com.badlogic.gdx.utils.JsonValue;
import e2.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class a extends d {

    /* renamed from: l, reason: collision with root package name */
    public a.d f57970l;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: h2.a$a, reason: collision with other inner class name */
    public static class C0647a extends a {

        /* renamed from: m, reason: collision with root package name */
        public a.d f57971m;

        @Override // e2.d
        /* renamed from: J0, reason: merged with bridge method [inline-methods] */
        public C0647a Z() {
            return new C0647a();
        }

        @Override // e2.d
        public void R(int i11, int i12) {
            int i13 = this.f57971m.f48332c;
            int i14 = i11 * i13;
            int i15 = (i12 * i13) + i14;
            while (i14 < i15) {
                this.f57971m.f48337e[i14] = n.J();
                this.f57971m.f48337e[i14 + 1] = n.J();
                this.f57971m.f48337e[i14 + 2] = n.J();
                this.f57971m.f48337e[i14 + 3] = n.J();
                i14 += this.f57971m.f48332c;
            }
        }

        @Override // h2.a, e2.d
        public void X() {
            this.f57971m = (a.d) this.f48397a.f48380e.a(e2.b.f48348f);
        }
    }

    @Override // e2.d
    public void X() {
        this.f57970l = (a.d) this.f48397a.f48380e.a(e2.b.f48348f);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b extends a {

        /* renamed from: m, reason: collision with root package name */
        public a.d f57972m;

        /* renamed from: n, reason: collision with root package name */
        public a.d f57973n;

        /* renamed from: o, reason: collision with root package name */
        public j2.j f57974o;

        /* renamed from: p, reason: collision with root package name */
        public j2.b f57975p;

        public b() {
            this.f57975p = new j2.b();
            j2.j jVar = new j2.j();
            this.f57974o = jVar;
            jVar.w(1.0f);
        }

        @Override // e2.d
        public void C0() {
            int i11 = this.f48397a.f48380e.f48329c * this.f57970l.f48332c;
            int i12 = 0;
            int i13 = 2;
            int i14 = 0;
            while (i12 < i11) {
                float f11 = this.f57973n.f48337e[i13];
                this.f57975p.f(f11, this.f57970l.f48337e, i12);
                float[] fArr = this.f57972m.f48337e;
                this.f57970l.f48337e[i12 + 3] = fArr[i14] + (fArr[i14 + 1] * this.f57974o.q(f11));
                i12 += this.f57970l.f48332c;
                i14 += this.f57972m.f48332c;
                i13 += this.f57973n.f48332c;
            }
        }

        @Override // e2.d, com.badlogic.gdx.utils.f.c
        public void D(com.badlogic.gdx.utils.f fVar, JsonValue jsonValue) {
            this.f57974o = (j2.j) fVar.M("alpha", j2.j.class, jsonValue);
            this.f57975p = (j2.b) fVar.M("color", j2.b.class, jsonValue);
        }

        @Override // e2.d
        /* renamed from: J0, reason: merged with bridge method [inline-methods] */
        public b Z() {
            return new b(this);
        }

        public void Q0(b bVar) {
            this.f57975p.j(bVar.f57975p);
            this.f57974o.u(bVar.f57974o);
        }

        @Override // e2.d
        public void R(int i11, int i12) {
            int i13 = this.f57970l.f48332c;
            int i14 = i11 * i13;
            int i15 = this.f57972m.f48332c * i11;
            int i16 = (i11 * this.f57973n.f48332c) + 2;
            int i17 = (i12 * i13) + i14;
            while (i14 < i17) {
                float i18 = this.f57974o.i();
                float v11 = this.f57974o.v() - i18;
                this.f57975p.f(0.0f, this.f57970l.f48337e, i14);
                this.f57970l.f48337e[i14 + 3] = (this.f57974o.q(this.f57973n.f48337e[i16]) * v11) + i18;
                a.d dVar = this.f57972m;
                float[] fArr = dVar.f48337e;
                fArr[i15] = i18;
                fArr[i15 + 1] = v11;
                i14 += this.f57970l.f48332c;
                i15 += dVar.f48332c;
                i16 += this.f57973n.f48332c;
            }
        }

        @Override // h2.a, e2.d
        public void X() {
            super.X();
            a.b bVar = e2.b.f48358p;
            bVar.f48334a = this.f48397a.f48381f.b();
            this.f57972m = (a.d) this.f48397a.f48380e.a(bVar);
            this.f57973n = (a.d) this.f48397a.f48380e.a(e2.b.f48345c);
        }

        @Override // e2.d, com.badlogic.gdx.utils.f.c
        public void z(com.badlogic.gdx.utils.f fVar) {
            fVar.F0("alpha", this.f57974o);
            fVar.F0("color", this.f57975p);
        }

        public b(b bVar) {
            this();
            Q0(bVar);
        }
    }
}
