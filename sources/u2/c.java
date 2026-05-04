package u2;

import com.badlogic.gdx.maps.tiled.TiledMapTile;
import com.badlogic.gdx.math.Rectangle;
import s2.g;
import s2.i;
import w1.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class c extends a {
    public c(s2.f fVar) {
        super(fVar);
    }

    @Override // s2.h
    public void D(i iVar) {
        TiledMapTile d11;
        float f11;
        int i11;
        c cVar = this;
        i iVar2 = iVar;
        float Q0 = cVar.Q0(iVar2, cVar.f91529c.e());
        int D = iVar2.D();
        int A = iVar2.A();
        float l11 = (iVar2.l() * cVar.f91528b) - (cVar.f91530d.f12533x * (iVar2.h() - 1.0f));
        float i12 = ((-iVar2.m()) * cVar.f91528b) - (cVar.f91530d.f12534y * (iVar2.i() - 1.0f));
        float C = iVar2.C() * cVar.f91528b;
        float B = iVar2.B() * cVar.f91528b;
        float f12 = C * 0.5f;
        float f13 = 0.5f * B;
        int i13 = 0;
        int max = Math.max(0, (int) (((cVar.f91530d.f12533x - f12) - l11) / C));
        Rectangle rectangle = cVar.f91530d;
        int min = Math.min(D, (int) (((((rectangle.f12533x + rectangle.width) + C) + f12) - l11) / C));
        int max2 = Math.max(0, (int) (((cVar.f91530d.f12534y - B) - i12) / B));
        Rectangle rectangle2 = cVar.f91530d;
        int min2 = Math.min(A, (int) ((((rectangle2.f12534y + rectangle2.height) + B) - i12) / f13));
        int i14 = 1;
        int i15 = min2 - 1;
        while (i15 >= max2) {
            float f14 = i15 % 2 == i14 ? f12 : 0.0f;
            int i16 = min - 1;
            while (i16 >= max) {
                i.a z11 = iVar2.z(i16, i15);
                if (z11 == null || (d11 = z11.d()) == null) {
                    f11 = Q0;
                    i11 = i13;
                } else {
                    boolean a11 = z11.a();
                    boolean b11 = z11.b();
                    int i17 = i13;
                    int c11 = z11.c();
                    o b12 = d11.b();
                    int i18 = i14;
                    float c12 = ((i16 * C) - f14) + (d11.c() * cVar.f91528b) + l11;
                    float f15 = (i15 * f13) + (d11.f() * cVar.f91528b) + i12;
                    float c13 = (cVar.f91528b * b12.c()) + c12;
                    float b13 = f15 + (cVar.f91528b * b12.b());
                    float g11 = b12.g();
                    float j11 = b12.j();
                    float h11 = b12.h();
                    float i19 = b12.i();
                    float[] fArr = cVar.f91534h;
                    fArr[i17] = c12;
                    fArr[i18] = f15;
                    fArr[2] = Q0;
                    fArr[3] = g11;
                    fArr[4] = j11;
                    fArr[5] = c12;
                    fArr[6] = b13;
                    fArr[7] = Q0;
                    fArr[8] = g11;
                    fArr[9] = i19;
                    fArr[10] = c13;
                    fArr[11] = b13;
                    fArr[12] = Q0;
                    fArr[13] = h11;
                    fArr[14] = i19;
                    fArr[15] = c13;
                    fArr[16] = f15;
                    fArr[17] = Q0;
                    fArr[18] = h11;
                    fArr[19] = j11;
                    if (a11) {
                        fArr[3] = h11;
                        fArr[13] = g11;
                        fArr[8] = h11;
                        fArr[18] = g11;
                    }
                    if (b11) {
                        fArr[4] = i19;
                        fArr[14] = j11;
                        fArr[9] = j11;
                        fArr[19] = i19;
                    }
                    if (c11 != 0) {
                        if (c11 == i18) {
                            float f16 = fArr[4];
                            fArr[4] = fArr[9];
                            fArr[9] = fArr[14];
                            fArr[14] = fArr[19];
                            fArr[19] = f16;
                            float f17 = fArr[3];
                            fArr[3] = fArr[8];
                            fArr[8] = fArr[13];
                            fArr[13] = fArr[18];
                            fArr[18] = f17;
                        } else if (c11 == 2) {
                            float f18 = fArr[3];
                            fArr[3] = fArr[13];
                            fArr[13] = f18;
                            float f19 = fArr[8];
                            fArr[8] = fArr[18];
                            fArr[18] = f19;
                            float f21 = fArr[4];
                            fArr[4] = fArr[14];
                            fArr[14] = f21;
                            float f22 = fArr[9];
                            fArr[9] = fArr[19];
                            fArr[19] = f22;
                        } else if (c11 == 3) {
                            float f23 = fArr[4];
                            fArr[4] = fArr[19];
                            fArr[19] = fArr[14];
                            fArr[14] = fArr[9];
                            fArr[9] = f23;
                            float f24 = fArr[3];
                            fArr[3] = fArr[18];
                            fArr[18] = fArr[13];
                            fArr[13] = fArr[8];
                            fArr[8] = f24;
                        }
                    }
                    f11 = Q0;
                    i11 = i17;
                    cVar.f91529c.t0(b12.f(), cVar.f91534h, i11, 20);
                }
                i16--;
                cVar = this;
                iVar2 = iVar;
                i13 = i11;
                Q0 = f11;
                i14 = 1;
            }
            i15--;
            cVar = this;
            iVar2 = iVar;
            Q0 = Q0;
            i14 = 1;
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
        float intValue = ((Integer) J0().o().d("tilewidth", Integer.class)).intValue() * 0.5f * this.f91528b;
        float C = gVar2.C();
        float D = gVar2.D();
        float h11 = ((C * this.f91528b) - (this.f91530d.f12533x * (gVar2.h() - 1.0f))) - intValue;
        float i14 = (D * this.f91528b) - (this.f91530d.f12534y * (gVar2.i() - 1.0f));
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
            c11 = 18;
            objArr = 17;
            c12 = 16;
            i11 = (int) Math.ceil((this.f91530d.width / this.f91531e.width) + 4.0f);
        } else {
            c11 = 18;
            objArr = 17;
            c12 = 16;
            i11 = 0;
        }
        int ceil = gVar2.F() ? (int) Math.ceil((this.f91530d.height / this.f91531e.height) + 4.0f) : 0;
        Rectangle rectangle = this.f91530d;
        Object[] objArr2 = objArr;
        float f17 = rectangle.f12533x;
        float f18 = rectangle.f12534y;
        Rectangle rectangle2 = this.f91531e;
        float f19 = f17 - (f17 % rectangle2.width);
        float f21 = f18 - (f18 % rectangle2.height);
        int i17 = 0;
        while (i17 <= i11) {
            int i18 = i15;
            while (i18 <= ceil) {
                if (gVar2.E()) {
                    i12 = i15;
                    f11 = C0;
                    float f22 = this.f91531e.width;
                    f13 = ((i17 - 2) * f22) + f19 + (h11 % f22);
                    f12 = f22 + f13;
                } else {
                    f11 = C0;
                    i12 = i15;
                    f12 = c13;
                    f13 = h11;
                }
                if (gVar2.F()) {
                    f14 = f12;
                    float f23 = this.f91531e.height;
                    float f24 = f21 + ((i18 - 2) * f23) + (i14 % f23);
                    f16 = f24 + f23;
                    f15 = f24;
                } else {
                    f14 = f12;
                    f15 = i14;
                    f16 = b11;
                }
                o oVar = B;
                float f25 = c13;
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
                    fArr[15] = f14;
                    fArr[c12] = f15;
                    fArr[objArr2 == true ? 1 : 0] = f11;
                    fArr[c11] = h13;
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
                c13 = f25;
            }
            i17++;
            gVar2 = gVar;
            B = B;
            c13 = c13;
        }
    }

    public c(s2.f fVar, w1.a aVar) {
        super(fVar, aVar);
    }

    public c(s2.f fVar, float f11) {
        super(fVar, f11);
    }

    public c(s2.f fVar, float f11, w1.a aVar) {
        super(fVar, f11, aVar);
    }
}
