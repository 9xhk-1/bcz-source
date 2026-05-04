package h2;

import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.n;
import com.badlogic.gdx.utils.JsonValue;
import e2.a;
import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class b extends d {

    /* renamed from: l, reason: collision with root package name */
    public com.badlogic.gdx.utils.a<c> f57976l;

    /* renamed from: m, reason: collision with root package name */
    public a.d f57977m;

    /* renamed from: n, reason: collision with root package name */
    public a.d f57978n;

    /* renamed from: o, reason: collision with root package name */
    public a.d f57979o;

    /* renamed from: p, reason: collision with root package name */
    public a.d f57980p;

    /* renamed from: q, reason: collision with root package name */
    public a.d f57981q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f57982r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f57983s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f57984t;

    public b() {
        this.f57976l = new com.badlogic.gdx.utils.a<>(true, 3, c.class);
    }

    @Override // e2.d
    public void C0() {
        if (this.f57982r) {
            a.d dVar = this.f57977m;
            Arrays.fill(dVar.f48337e, 0, this.f48397a.f48380e.f48329c * dVar.f48332c, 0.0f);
        }
        if (this.f57983s || this.f57984t) {
            a.d dVar2 = this.f57981q;
            Arrays.fill(dVar2.f48337e, 0, this.f48397a.f48380e.f48329c * dVar2.f48332c, 0.0f);
        }
        int i11 = 0;
        while (true) {
            com.badlogic.gdx.utils.a<c> aVar = this.f57976l;
            if (i11 >= aVar.f13179b) {
                break;
            }
            aVar.f13178a[i11].C0();
            i11++;
        }
        if (this.f57982r) {
            int i12 = 0;
            int i13 = 0;
            while (true) {
                e2.c cVar = this.f48397a;
                if (i12 >= cVar.f48380e.f48329c) {
                    break;
                }
                a.d dVar3 = this.f57978n;
                float[] fArr = dVar3.f48337e;
                float f11 = fArr[i13];
                int i14 = i13 + 1;
                float f12 = fArr[i14];
                int i15 = i13 + 2;
                float f13 = fArr[i15];
                float[] fArr2 = this.f57979o.f48337e;
                float f14 = (f11 * 2.0f) - fArr2[i13];
                float[] fArr3 = this.f57977m.f48337e;
                float f15 = fArr3[i13];
                float f16 = cVar.f48386k;
                fArr[i13] = f14 + (f15 * f16);
                fArr[i14] = ((f12 * 2.0f) - fArr2[i14]) + (fArr3[i14] * f16);
                fArr[i15] = ((2.0f * f13) - fArr2[i15]) + (fArr3[i15] * f16);
                fArr2[i13] = f11;
                fArr2[i14] = f12;
                fArr2[i15] = f13;
                i12++;
                i13 += dVar3.f48332c;
            }
        }
        if (!this.f57983s) {
            if (this.f57984t) {
                int i16 = 0;
                int i17 = 0;
                int i18 = 0;
                while (i17 < this.f48397a.f48380e.f48329c) {
                    float[] fArr4 = this.f57981q.f48337e;
                    float f17 = fArr4[i18];
                    float f18 = fArr4[i18 + 1];
                    float f19 = fArr4[i18 + 2];
                    float[] fArr5 = this.f57980p.f48337e;
                    float f21 = fArr5[i16];
                    int i19 = i16 + 1;
                    float f22 = fArr5[i19];
                    int i21 = i16 + 2;
                    float f23 = fArr5[i21];
                    int i22 = i16 + 3;
                    float f24 = fArr5[i22];
                    Quaternion quaternion = e2.d.f48393h;
                    quaternion.set(f17, f18, f19, 0.0f).mul(f21, f22, f23, f24).mul(this.f48397a.f48385j * 0.5f).add(f21, f22, f23, f24).nor();
                    a.d dVar4 = this.f57980p;
                    float[] fArr6 = dVar4.f48337e;
                    fArr6[i16] = quaternion.f12530x;
                    fArr6[i19] = quaternion.f12531y;
                    fArr6[i21] = quaternion.f12532z;
                    fArr6[i22] = quaternion.f12529w;
                    i17++;
                    i16 += dVar4.f48332c;
                    i18 += this.f57981q.f48332c;
                }
                return;
            }
            return;
        }
        int i23 = 0;
        int i24 = 0;
        while (true) {
            e2.c cVar2 = this.f48397a;
            if (i23 >= cVar2.f48380e.f48329c) {
                return;
            }
            float f25 = this.f57981q.f48337e[i23] * cVar2.f48385j;
            if (f25 != 0.0f) {
                float t11 = n.t(f25);
                float a02 = n.a0(f25);
                float[] fArr7 = this.f57980p.f48337e;
                float f26 = fArr7[i24];
                int i25 = i24 + 1;
                float f27 = fArr7[i25];
                fArr7[i24] = (f26 * t11) - (f27 * a02);
                fArr7[i25] = (f27 * t11) + (f26 * a02);
            }
            i23++;
            i24 += this.f57980p.f48332c;
        }
    }

    @Override // e2.d, com.badlogic.gdx.utils.f.c
    public void D(com.badlogic.gdx.utils.f fVar, JsonValue jsonValue) {
        this.f57976l.g((com.badlogic.gdx.utils.a) fVar.N("velocities", com.badlogic.gdx.utils.a.class, c.class, jsonValue));
    }

    @Override // e2.d
    /* renamed from: J0, reason: merged with bridge method [inline-methods] */
    public b Z() {
        return new b(this);
    }

    @Override // e2.d
    public void R(int i11, int i12) {
        if (this.f57982r) {
            int i13 = this.f57978n.f48332c;
            int i14 = i11 * i13;
            int i15 = (i13 * i12) + i14;
            while (i14 < i15) {
                float[] fArr = this.f57979o.f48337e;
                a.d dVar = this.f57978n;
                float[] fArr2 = dVar.f48337e;
                fArr[i14] = fArr2[i14];
                int i16 = i14 + 1;
                fArr[i16] = fArr2[i16];
                int i17 = i14 + 2;
                fArr[i17] = fArr2[i17];
                i14 += dVar.f48332c;
            }
        }
        if (this.f57983s) {
            int i18 = this.f57980p.f48332c;
            int i19 = i11 * i18;
            int i21 = (i18 * i12) + i19;
            while (i19 < i21) {
                a.d dVar2 = this.f57980p;
                float[] fArr3 = dVar2.f48337e;
                fArr3[i19] = 1.0f;
                fArr3[i19 + 1] = 0.0f;
                i19 += dVar2.f48332c;
            }
        } else if (this.f57984t) {
            int i22 = this.f57980p.f48332c;
            int i23 = i11 * i22;
            int i24 = (i22 * i12) + i23;
            while (i23 < i24) {
                a.d dVar3 = this.f57980p;
                float[] fArr4 = dVar3.f48337e;
                fArr4[i23] = 0.0f;
                fArr4[i23 + 1] = 0.0f;
                fArr4[i23 + 2] = 0.0f;
                fArr4[i23 + 3] = 1.0f;
                i23 += dVar3.f48332c;
            }
        }
        int i25 = 0;
        while (true) {
            com.badlogic.gdx.utils.a<c> aVar = this.f57976l;
            if (i25 >= aVar.f13179b) {
                return;
            }
            aVar.f13178a[i25].R(i11, i12);
            i25++;
        }
    }

    @Override // e2.d
    public void X() {
        int i11 = 0;
        while (true) {
            com.badlogic.gdx.utils.a<c> aVar = this.f57976l;
            if (i11 >= aVar.f13179b) {
                break;
            }
            aVar.f13178a[i11].X();
            i11++;
        }
        a.d dVar = (a.d) this.f48397a.f48380e.g(e2.b.f48355m);
        this.f57977m = dVar;
        boolean z11 = dVar != null;
        this.f57982r = z11;
        if (z11) {
            this.f57978n = (a.d) this.f48397a.f48380e.a(e2.b.f48346d);
            this.f57979o = (a.d) this.f48397a.f48380e.a(e2.b.f48347e);
        }
        a.d dVar2 = (a.d) this.f48397a.f48380e.g(e2.b.f48356n);
        this.f57981q = dVar2;
        boolean z12 = dVar2 != null;
        this.f57983s = z12;
        if (z12) {
            this.f57980p = (a.d) this.f48397a.f48380e.a(e2.b.f48350h);
            this.f57984t = false;
            return;
        }
        a.d dVar3 = (a.d) this.f48397a.f48380e.g(e2.b.f48357o);
        this.f57981q = dVar3;
        boolean z13 = dVar3 != null;
        this.f57984t = z13;
        if (z13) {
            this.f57980p = (a.d) this.f48397a.f48380e.a(e2.b.f48351i);
        }
    }

    @Override // e2.d
    public void init() {
        int i11 = 0;
        while (true) {
            com.badlogic.gdx.utils.a<c> aVar = this.f57976l;
            if (i11 >= aVar.f13179b) {
                return;
            }
            aVar.f13178a[i11].init();
            i11++;
        }
    }

    @Override // e2.d
    public void n0(e2.c cVar) {
        super.n0(cVar);
        int i11 = 0;
        while (true) {
            com.badlogic.gdx.utils.a<c> aVar = this.f57976l;
            if (i11 >= aVar.f13179b) {
                return;
            }
            aVar.f13178a[i11].n0(cVar);
            i11++;
        }
    }

    @Override // e2.d, com.badlogic.gdx.utils.f.c
    public void z(com.badlogic.gdx.utils.f fVar) {
        fVar.H0("velocities", this.f57976l, com.badlogic.gdx.utils.a.class, c.class);
    }

    public b(c... cVarArr) {
        this.f57976l = new com.badlogic.gdx.utils.a<>(true, cVarArr.length, c.class);
        for (c cVar : cVarArr) {
            this.f57976l.a((c) cVar.Z());
        }
    }

    public b(b bVar) {
        this((c[]) bVar.f57976l.Q(c.class));
    }
}
