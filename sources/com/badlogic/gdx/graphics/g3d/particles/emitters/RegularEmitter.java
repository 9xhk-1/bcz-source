package com.badlogic.gdx.graphics.g3d.particles.emitters;

import com.badlogic.gdx.utils.JsonValue;
import com.badlogic.gdx.utils.f;
import e2.a;
import e2.b;
import e2.c;
import e2.d;
import g2.a;
import j2.h;
import j2.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class RegularEmitter extends a implements f.c {
    public float A;
    public float B;
    public float C;
    public float D;
    public boolean E;
    public EmissionMode F;
    public a.d G;

    /* renamed from: o, reason: collision with root package name */
    public h f12182o;

    /* renamed from: p, reason: collision with root package name */
    public h f12183p;

    /* renamed from: q, reason: collision with root package name */
    public j f12184q;

    /* renamed from: r, reason: collision with root package name */
    public j f12185r;

    /* renamed from: s, reason: collision with root package name */
    public j f12186s;

    /* renamed from: t, reason: collision with root package name */
    public int f12187t;

    /* renamed from: u, reason: collision with root package name */
    public int f12188u;

    /* renamed from: v, reason: collision with root package name */
    public int f12189v;

    /* renamed from: w, reason: collision with root package name */
    public int f12190w;

    /* renamed from: x, reason: collision with root package name */
    public int f12191x;

    /* renamed from: y, reason: collision with root package name */
    public int f12192y;

    /* renamed from: z, reason: collision with root package name */
    public int f12193z;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum EmissionMode {
        Enabled,
        EnabledUntilCycleEnd,
        Disabled
    }

    public RegularEmitter() {
        this.f12182o = new h();
        this.f12183p = new h();
        this.f12184q = new j();
        this.f12185r = new j();
        this.f12186s = new j();
        this.f12183p.e(true);
        this.f12186s.e(true);
        this.f12185r.e(true);
        this.E = true;
        this.F = EmissionMode.Enabled;
    }

    @Override // e2.d
    public void C0() {
        c cVar;
        int i11;
        c cVar2 = this.f48397a;
        float f11 = cVar2.f48385j * 1000.0f;
        float f12 = this.D;
        int i12 = 0;
        if (f12 < this.B) {
            this.D = f12 + f11;
        } else {
            EmissionMode emissionMode = this.F;
            boolean z11 = emissionMode != EmissionMode.Disabled;
            float f13 = this.C;
            float f14 = this.A;
            if (f13 < f14) {
                float f15 = f13 + f11;
                this.C = f15;
                this.f52562n = f15 / f14;
            } else if (this.E && z11 && emissionMode == EmissionMode.Enabled) {
                cVar2.F();
            } else {
                z11 = false;
            }
            if (z11) {
                this.f12189v = (int) (this.f12189v + f11);
                float q11 = this.f12187t + (this.f12188u * this.f12186s.q(this.f52562n));
                if (q11 > 0.0f) {
                    float f16 = 1000.0f / q11;
                    int i13 = this.f12189v;
                    if (i13 >= f16) {
                        int min = Math.min((int) (i13 / f16), this.f52561m - this.f48397a.f48380e.f48329c);
                        this.f12189v = (int) (((int) (this.f12189v - (min * f16))) % f16);
                        e1(min);
                    }
                }
                int i14 = this.f48397a.f48380e.f48329c;
                int i15 = this.f52560l;
                if (i14 < i15) {
                    e1(i15 - i14);
                }
            }
        }
        int i16 = this.f48397a.f48380e.f48329c;
        int i17 = 0;
        while (true) {
            cVar = this.f48397a;
            e2.a aVar = cVar.f48380e;
            i11 = aVar.f48329c;
            if (i12 >= i11) {
                break;
            }
            a.d dVar = this.G;
            float[] fArr = dVar.f48337e;
            float f17 = fArr[i17] - f11;
            fArr[i17] = f17;
            if (f17 <= 0.0f) {
                aVar.i(i12);
            } else {
                fArr[i17 + 2] = 1.0f - (f17 / fArr[i17 + 1]);
                i12++;
                i17 += dVar.f48332c;
            }
        }
        if (i11 < i16) {
            cVar.q(i11, i16 - i11);
        }
    }

    @Override // g2.a, e2.d, com.badlogic.gdx.utils.f.c
    public void D(f fVar, JsonValue jsonValue) {
        super.D(fVar, jsonValue);
        this.E = ((Boolean) fVar.M("continous", Boolean.TYPE, jsonValue)).booleanValue();
        this.f12186s = (j) fVar.M("emission", j.class, jsonValue);
        this.f12182o = (h) fVar.M("delay", h.class, jsonValue);
        this.f12183p = (h) fVar.M("duration", h.class, jsonValue);
        this.f12185r = (j) fVar.M("life", j.class, jsonValue);
        this.f12184q = (j) fVar.M("lifeOffset", j.class, jsonValue);
    }

    @Override // e2.d
    public void R(int i11, int i12) {
        int i13;
        int q11 = this.f12192y + ((int) (this.f12193z * this.f12185r.q(this.f52562n)));
        int q12 = (int) (this.f12190w + (this.f12191x * this.f12184q.q(this.f52562n)));
        if (q12 > 0) {
            if (q12 >= q11) {
                q12 = q11 - 1;
            }
            i13 = q11 - q12;
        } else {
            i13 = q11;
        }
        float f11 = i13;
        float f12 = q11;
        float f13 = 1.0f - (f11 / f12);
        int i14 = this.G.f48332c;
        int i15 = i11 * i14;
        int i16 = (i12 * i14) + i15;
        while (i15 < i16) {
            a.d dVar = this.G;
            float[] fArr = dVar.f48337e;
            fArr[i15] = f11;
            fArr[i15 + 1] = f12;
            fArr[i15 + 2] = f13;
            i15 += dVar.f48332c;
        }
    }

    @Override // g2.a
    public boolean V0() {
        return this.D >= this.B && this.C >= this.A && this.f48397a.f48380e.f48329c == 0;
    }

    @Override // e2.d
    public void X() {
        this.G = (a.d) this.f48397a.f48380e.a(b.f48345c);
    }

    @Override // e2.d
    public d Z() {
        return new RegularEmitter(this);
    }

    public final void e1(int i11) {
        int min = Math.min(i11, this.f52561m - this.f48397a.f48380e.f48329c);
        if (min <= 0) {
            return;
        }
        c cVar = this.f48397a;
        cVar.a(cVar.f48380e.f48329c, min);
        this.f48397a.f48380e.f48329c += min;
    }

    public h f1() {
        return this.f12182o;
    }

    public h g1() {
        return this.f12183p;
    }

    public j h1() {
        return this.f12186s;
    }

    public EmissionMode i1() {
        return this.F;
    }

    @Override // g2.a, e2.d
    public void init() {
        super.init();
        this.f12189v = 0;
        this.C = this.A;
    }

    public j j1() {
        return this.f12185r;
    }

    public j k1() {
        return this.f12184q;
    }

    public float l1() {
        if (this.D < this.B) {
            return 0.0f;
        }
        return Math.min(1.0f, this.C / this.A);
    }

    public boolean m1() {
        return this.E;
    }

    public void n1(RegularEmitter regularEmitter) {
        super.a1(regularEmitter);
        this.f12182o.h(regularEmitter.f12182o);
        this.f12183p.h(regularEmitter.f12183p);
        this.f12184q.u(regularEmitter.f12184q);
        this.f12185r.u(regularEmitter.f12185r);
        this.f12186s.u(regularEmitter.f12186s);
        this.f12187t = regularEmitter.f12187t;
        this.f12188u = regularEmitter.f12188u;
        this.f12189v = regularEmitter.f12189v;
        this.f12190w = regularEmitter.f12190w;
        this.f12191x = regularEmitter.f12191x;
        this.f12192y = regularEmitter.f12192y;
        this.f12193z = regularEmitter.f12193z;
        this.A = regularEmitter.A;
        this.B = regularEmitter.B;
        this.C = regularEmitter.C;
        this.D = regularEmitter.D;
        this.E = regularEmitter.E;
    }

    public void o1(boolean z11) {
        this.E = z11;
    }

    public void p1(EmissionMode emissionMode) {
        this.F = emissionMode;
    }

    @Override // e2.d
    public void w0() {
        h hVar = this.f12182o;
        this.B = hVar.f63145a ? hVar.i() : 0.0f;
        this.D = 0.0f;
        this.C = 0.0f;
        float i11 = this.f12183p.i();
        this.A = i11;
        this.f52562n = this.C / i11;
        this.f12187t = (int) this.f12186s.i();
        this.f12188u = (int) this.f12186s.v();
        if (!this.f12186s.t()) {
            this.f12188u -= this.f12187t;
        }
        this.f12192y = (int) this.f12185r.i();
        this.f12193z = (int) this.f12185r.v();
        if (!this.f12185r.t()) {
            this.f12193z -= this.f12192y;
        }
        j jVar = this.f12184q;
        this.f12190w = jVar.f63145a ? (int) jVar.i() : 0;
        this.f12191x = (int) this.f12184q.v();
        if (this.f12184q.t()) {
            return;
        }
        this.f12191x -= this.f12190w;
    }

    @Override // g2.a, e2.d, com.badlogic.gdx.utils.f.c
    public void z(f fVar) {
        super.z(fVar);
        fVar.F0("continous", Boolean.valueOf(this.E));
        fVar.F0("emission", this.f12186s);
        fVar.F0("delay", this.f12182o);
        fVar.F0("duration", this.f12183p);
        fVar.F0("life", this.f12185r);
        fVar.F0("lifeOffset", this.f12184q);
    }

    public RegularEmitter(RegularEmitter regularEmitter) {
        this();
        n1(regularEmitter);
    }
}
