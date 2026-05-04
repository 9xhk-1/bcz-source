package u2;

import com.badlogic.gdx.maps.tiled.TiledMapTile;
import com.badlogic.gdx.math.Rectangle;
import s2.g;
import s2.i;
import w1.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class b extends a {

    /* renamed from: j, reason: collision with root package name */
    public boolean f91535j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f91536k;

    /* renamed from: l, reason: collision with root package name */
    public float f91537l;

    public b(s2.f fVar) {
        super(fVar);
        this.f91535j = true;
        this.f91536k = false;
        this.f91537l = 0.0f;
        d1(fVar);
    }

    @Override // s2.h
    public void D(i iVar) {
        i iVar2 = iVar;
        float Q0 = Q0(iVar2, this.f91529c.e());
        int D = iVar2.D();
        int A = iVar2.A();
        float C = iVar2.C() * this.f91528b;
        float B = iVar2.B() * this.f91528b;
        float l11 = (iVar2.l() * this.f91528b) - (this.f91530d.f12533x * (iVar2.h() - 1.0f));
        float i11 = ((-iVar2.m()) * this.f91528b) - (this.f91530d.f12534y * (iVar2.i() - 1.0f));
        float f11 = this.f91537l * this.f91528b;
        if (!this.f91535j) {
            float f12 = (B - f11) / 2.0f;
            float f13 = (B + f11) / 2.0f;
            float f14 = 0.5f * C;
            int max = Math.max(0, (int) (((this.f91530d.f12534y - f12) - l11) / f13));
            Rectangle rectangle = this.f91530d;
            int min = Math.min(A, (int) ((((rectangle.f12534y + rectangle.height) + f13) - l11) / f13));
            int max2 = Math.max(0, (int) (((this.f91530d.f12533x - f14) - i11) / C));
            Rectangle rectangle2 = this.f91530d;
            int min2 = Math.min(D, (int) ((((rectangle2.f12533x + rectangle2.width) + C) - i11) / C));
            int i12 = min - 1;
            while (i12 >= max) {
                float f15 = (i12 % 2 == 0 ? true : r13) == this.f91536k ? f14 : 0.0f;
                int i13 = max2;
                while (i13 < min2) {
                    e1(iVar2.z(i13, i12), (i13 * C) + f15 + l11, (i12 * f13) + i11, Q0);
                    i13++;
                    iVar2 = iVar;
                }
                i12--;
                iVar2 = iVar;
                r13 = false;
            }
            return;
        }
        float f16 = (C - f11) / 2.0f;
        float f17 = (C + f11) / 2.0f;
        float f18 = 0.5f * B;
        int max3 = Math.max(0, (int) (((this.f91530d.f12534y - f18) - l11) / B));
        Rectangle rectangle3 = this.f91530d;
        int min3 = Math.min(A, (int) ((((rectangle3.f12534y + rectangle3.height) + B) - l11) / B));
        int max4 = Math.max(0, (int) (((this.f91530d.f12533x - f16) - i11) / f17));
        Rectangle rectangle4 = this.f91530d;
        int min4 = Math.min(D, (int) ((((rectangle4.f12533x + rectangle4.width) + f17) - i11) / f17));
        boolean z11 = this.f91536k;
        int i14 = max4 % 2;
        int i15 = z11 == (i14 == 0) ? max4 + 1 : max4;
        if (z11 != (i14 == 0)) {
            max4++;
        }
        int i16 = min3 - 1;
        while (i16 >= max3) {
            int i17 = i15;
            while (i17 < min4) {
                e1(iVar2.z(i17, i16), (i17 * f17) + l11, (i16 * B) + f18 + i11, Q0);
                i17 += 2;
                f17 = f17;
            }
            float f19 = f17;
            for (int i18 = max4; i18 < min4; i18 += 2) {
                e1(iVar2.z(i18, i16), (i18 * f19) + l11, (i16 * B) + i11, Q0);
            }
            i16--;
            f17 = f19;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // u2.a, s2.h
    public void R(g gVar) {
        char c11;
        Object[] objArr;
        char c12;
        int i11;
        float f11;
        int i12;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        int i13;
        g gVar2 = gVar;
        float C0 = C0(gVar2, this.f91529c.e());
        float[] fArr = this.f91534h;
        o B = gVar2.B();
        if (B == null) {
            return;
        }
        int intValue = ((Integer) J0().o().d("tileheight", Integer.class)).intValue();
        int intValue2 = ((Integer) J0().o().d("height", Integer.class)).intValue();
        float f17 = this.f91537l;
        float f18 = intValue2 * intValue;
        float f19 = this.f91528b;
        float f21 = f18 * f19;
        float f22 = ((f18 * 0.75f) + (f17 * 0.5f)) * f19;
        float f23 = intValue * f19 * 0.5f;
        if (!this.f91535j) {
            f23 = -(f21 - f22);
        }
        float C = gVar2.C();
        float D = gVar2.D();
        float h11 = (C * this.f91528b) - (this.f91530d.f12533x * (gVar2.h() - 1.0f));
        float i14 = ((D * this.f91528b) - (this.f91530d.f12534y * (gVar2.i() - 1.0f))) + f23;
        float c13 = (B.c() * this.f91528b) + h11;
        float b11 = (B.b() * this.f91528b) + i14;
        this.f91531e.set(h11, i14, c13 - h11, b11 - i14);
        int i15 = 0;
        if (!gVar2.E() && !gVar2.F()) {
            if (this.f91530d.contains(this.f91531e) || this.f91530d.overlaps(this.f91531e)) {
                float g11 = B.g();
                float j11 = B.j();
                float h12 = B.h();
                float i16 = B.i();
                fArr[0] = h11;
                fArr[1] = i14;
                fArr[2] = C0;
                fArr[3] = g11;
                fArr[4] = j11;
                fArr[5] = h11;
                fArr[6] = b11;
                fArr[7] = C0;
                fArr[8] = g11;
                fArr[9] = i16;
                fArr[10] = c13;
                fArr[11] = b11;
                fArr[12] = C0;
                fArr[13] = h12;
                fArr[14] = i16;
                fArr[15] = c13;
                fArr[16] = i14;
                fArr[17] = C0;
                fArr[18] = h12;
                fArr[19] = j11;
                this.f91529c.t0(B.f(), fArr, 0, 20);
                return;
            }
            return;
        }
        if (gVar2.E()) {
            c11 = 17;
            objArr = 16;
            c12 = 15;
            i11 = (int) Math.ceil((this.f91530d.width / this.f91531e.width) + 4.0f);
        } else {
            c11 = 17;
            objArr = 16;
            c12 = 15;
            i11 = 0;
        }
        int ceil = gVar2.F() ? (int) Math.ceil((this.f91530d.height / this.f91531e.height) + 4.0f) : 0;
        Rectangle rectangle = this.f91530d;
        Object[] objArr2 = objArr;
        float f24 = rectangle.f12533x;
        float f25 = rectangle.f12534y;
        Rectangle rectangle2 = this.f91531e;
        float f26 = f24 - (f24 % rectangle2.width);
        float f27 = f25 - (f25 % rectangle2.height);
        int i17 = 0;
        while (i17 <= i11) {
            int i18 = i15;
            while (i18 <= ceil) {
                if (gVar2.E()) {
                    i12 = i15;
                    f11 = C0;
                    float f28 = this.f91531e.width;
                    f13 = ((i17 - 2) * f28) + f26 + (h11 % f28);
                    f12 = f28 + f13;
                } else {
                    f11 = C0;
                    i12 = i15;
                    f12 = c13;
                    f13 = h11;
                }
                if (gVar2.F()) {
                    f14 = f12;
                    float f29 = this.f91531e.height;
                    float f31 = f27 + ((i18 - 2) * f29) + (i14 % f29);
                    f16 = f31 + f29;
                    f15 = f31;
                } else {
                    f14 = f12;
                    f15 = i14;
                    f16 = b11;
                }
                o oVar = B;
                float f32 = c13;
                this.f91532f.set(f13, f15, f14 - f13, f16 - f15);
                if (this.f91530d.contains(this.f91532f) || this.f91530d.overlaps(this.f91532f)) {
                    float g12 = oVar.g();
                    float j12 = oVar.j();
                    float h13 = oVar.h();
                    float i19 = oVar.i();
                    fArr[i12] = f13;
                    fArr[1] = f15;
                    fArr[2] = f11;
                    fArr[3] = g12;
                    fArr[4] = j12;
                    fArr[5] = f13;
                    fArr[6] = f16;
                    fArr[7] = f11;
                    fArr[8] = g12;
                    fArr[9] = i19;
                    fArr[10] = f14;
                    fArr[11] = f16;
                    fArr[12] = f11;
                    fArr[13] = h13;
                    fArr[14] = i19;
                    fArr[c12] = f14;
                    fArr[objArr2 == true ? 1 : 0] = f15;
                    fArr[c11] = f11;
                    fArr[18] = h13;
                    fArr[19] = j12;
                    i13 = i12;
                    this.f91529c.t0(oVar.f(), fArr, i13, 20);
                } else {
                    i13 = i12;
                }
                i18++;
                gVar2 = gVar;
                i15 = i13;
                C0 = f11;
                B = oVar;
                c13 = f32;
            }
            i17++;
            gVar2 = gVar;
            c13 = c13;
        }
    }

    public final void d1(s2.f fVar) {
        String str = (String) fVar.o().d("staggeraxis", String.class);
        if (str != null) {
            if (str.equals("x")) {
                this.f91535j = true;
            } else {
                this.f91535j = false;
            }
        }
        String str2 = (String) fVar.o().d("staggerindex", String.class);
        if (str2 != null) {
            if (str2.equals("even")) {
                this.f91536k = true;
            } else {
                this.f91536k = false;
            }
        }
        if (!this.f91535j && ((Integer) fVar.o().d("height", Integer.class)).intValue() % 2 == 0) {
            this.f91536k = !this.f91536k;
        }
        if (((Integer) fVar.o().d("hexsidelength", Integer.class)) != null) {
            this.f91537l = r0.intValue();
            return;
        }
        if (this.f91535j) {
            if (((Integer) fVar.o().d("tilewidth", Integer.class)) != null) {
                this.f91537l = r0.intValue() * 0.5f;
                return;
            } else {
                this.f91537l = ((i) fVar.b().b(0)).C() * 0.5f;
                return;
            }
        }
        if (((Integer) fVar.o().d("tileheight", Integer.class)) != null) {
            this.f91537l = r0.intValue() * 0.5f;
        } else {
            this.f91537l = ((i) fVar.b().b(0)).B() * 0.5f;
        }
    }

    public final void e1(i.a aVar, float f11, float f12, float f13) {
        TiledMapTile d11;
        if (aVar == null || (d11 = aVar.d()) == null || (d11 instanceof v2.a)) {
            return;
        }
        boolean a11 = aVar.a();
        boolean b11 = aVar.b();
        int c11 = aVar.c();
        o b12 = d11.b();
        float c12 = f11 + (d11.c() * this.f91528b);
        float f14 = f12 + (d11.f() * this.f91528b);
        float c13 = (b12.c() * this.f91528b) + c12;
        float b13 = (b12.b() * this.f91528b) + f14;
        float g11 = b12.g();
        float j11 = b12.j();
        float h11 = b12.h();
        float i11 = b12.i();
        float[] fArr = this.f91534h;
        fArr[0] = c12;
        fArr[1] = f14;
        fArr[2] = f13;
        fArr[3] = g11;
        fArr[4] = j11;
        fArr[5] = c12;
        fArr[6] = b13;
        fArr[7] = f13;
        fArr[8] = g11;
        fArr[9] = i11;
        fArr[10] = c13;
        fArr[11] = b13;
        fArr[12] = f13;
        fArr[13] = h11;
        fArr[14] = i11;
        fArr[15] = c13;
        fArr[16] = f14;
        fArr[17] = f13;
        fArr[18] = h11;
        fArr[19] = j11;
        if (a11) {
            fArr[3] = h11;
            fArr[13] = g11;
            fArr[8] = h11;
            fArr[18] = g11;
        }
        if (b11) {
            fArr[4] = i11;
            fArr[14] = j11;
            fArr[9] = j11;
            fArr[19] = i11;
        }
        if (c11 == 2) {
            float f15 = fArr[3];
            fArr[3] = fArr[13];
            fArr[13] = f15;
            float f16 = fArr[8];
            fArr[8] = fArr[18];
            fArr[18] = f16;
            float f17 = fArr[4];
            fArr[4] = fArr[14];
            fArr[14] = f17;
            float f18 = fArr[9];
            fArr[9] = fArr[19];
            fArr[19] = f18;
        }
        this.f91529c.t0(b12.f(), this.f91534h, 0, 20);
    }

    public b(s2.f fVar, float f11) {
        super(fVar, f11);
        this.f91535j = true;
        this.f91536k = false;
        this.f91537l = 0.0f;
        d1(fVar);
    }

    public b(s2.f fVar, w1.a aVar) {
        super(fVar, aVar);
        this.f91535j = true;
        this.f91536k = false;
        this.f91537l = 0.0f;
        d1(fVar);
    }

    public b(s2.f fVar, float f11, w1.a aVar) {
        super(fVar, f11, aVar);
        this.f91535j = true;
        this.f91536k = false;
        this.f91537l = 0.0f;
        d1(fVar);
    }
}
