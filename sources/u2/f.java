package u2;

import com.badlogic.gdx.maps.tiled.TiledMapTile;
import com.badlogic.gdx.math.Rectangle;
import s2.i;
import w1.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class f extends a {
    public f(s2.f fVar) {
        super(fVar);
    }

    @Override // s2.h
    public void D(i iVar) {
        int i11;
        f fVar = this;
        i iVar2 = iVar;
        float Q0 = fVar.Q0(iVar2, fVar.f91529c.e());
        int D = iVar2.D();
        int A = iVar2.A();
        float C = iVar2.C() * fVar.f91528b;
        float B = iVar2.B() * fVar.f91528b;
        float l11 = (iVar2.l() * fVar.f91528b) - (fVar.f91530d.f12533x * (iVar2.h() - 1.0f));
        float i12 = ((-iVar2.m()) * fVar.f91528b) - (fVar.f91530d.f12534y * (iVar2.i() - 1.0f));
        int i13 = 0;
        int max = Math.max(0, (int) ((fVar.f91530d.f12533x - l11) / C));
        Rectangle rectangle = fVar.f91530d;
        int min = Math.min(D, (int) ((((rectangle.f12533x + rectangle.width) + C) - l11) / C));
        int max2 = Math.max(0, (int) ((fVar.f91530d.f12534y - i12) / B));
        Rectangle rectangle2 = fVar.f91530d;
        int min2 = Math.min(A, (int) ((((rectangle2.f12534y + rectangle2.height) + B) - i12) / B));
        float f11 = (min2 * B) + i12;
        float f12 = (max * C) + l11;
        float[] fArr = fVar.f91534h;
        while (min2 >= max2) {
            float f13 = f12;
            int i14 = max;
            while (i14 < min) {
                i.a z11 = iVar2.z(i14, min2);
                if (z11 == null) {
                    f13 += C;
                    i11 = i13;
                } else {
                    TiledMapTile d11 = z11.d();
                    if (d11 != null) {
                        boolean a11 = z11.a();
                        boolean b11 = z11.b();
                        int c11 = z11.c();
                        o b12 = d11.b();
                        int i15 = i13;
                        float c12 = f13 + (d11.c() * fVar.f91528b);
                        float f14 = (d11.f() * fVar.f91528b) + f11;
                        float c13 = c12 + (fVar.f91528b * b12.c());
                        float b13 = (fVar.f91528b * b12.b()) + f14;
                        float g11 = b12.g();
                        float j11 = b12.j();
                        float h11 = b12.h();
                        float i16 = b12.i();
                        fArr[i15] = c12;
                        fArr[1] = f14;
                        fArr[2] = Q0;
                        fArr[3] = g11;
                        fArr[4] = j11;
                        fArr[5] = c12;
                        fArr[6] = b13;
                        fArr[7] = Q0;
                        fArr[8] = g11;
                        fArr[9] = i16;
                        fArr[10] = c13;
                        fArr[11] = b13;
                        fArr[12] = Q0;
                        fArr[13] = h11;
                        fArr[14] = i16;
                        fArr[15] = c13;
                        fArr[16] = f14;
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
                            fArr[4] = i16;
                            fArr[14] = j11;
                            fArr[9] = j11;
                            fArr[19] = i16;
                        }
                        if (c11 != 0) {
                            if (c11 == 1) {
                                float f15 = fArr[4];
                                fArr[4] = fArr[9];
                                fArr[9] = fArr[14];
                                fArr[14] = fArr[19];
                                fArr[19] = f15;
                                float f16 = fArr[3];
                                fArr[3] = fArr[8];
                                fArr[8] = fArr[13];
                                fArr[13] = fArr[18];
                                fArr[18] = f16;
                            } else if (c11 == 2) {
                                float f17 = fArr[3];
                                fArr[3] = fArr[13];
                                fArr[13] = f17;
                                float f18 = fArr[8];
                                fArr[8] = fArr[18];
                                fArr[18] = f18;
                                float f19 = fArr[4];
                                fArr[4] = fArr[14];
                                fArr[14] = f19;
                                float f21 = fArr[9];
                                fArr[9] = fArr[19];
                                fArr[19] = f21;
                            } else if (c11 == 3) {
                                float f22 = fArr[4];
                                fArr[4] = fArr[19];
                                fArr[19] = fArr[14];
                                fArr[14] = fArr[9];
                                fArr[9] = f22;
                                float f23 = fArr[3];
                                fArr[3] = fArr[18];
                                fArr[18] = fArr[13];
                                fArr[13] = fArr[8];
                                fArr[8] = f23;
                            }
                        }
                        i11 = i15;
                        fVar.f91529c.t0(b12.f(), fArr, i11, 20);
                    } else {
                        i11 = i13;
                    }
                    f13 += C;
                }
                i14++;
                iVar2 = iVar;
                i13 = i11;
                fVar = this;
            }
            f11 -= B;
            min2--;
            iVar2 = iVar;
            fVar = this;
        }
    }

    public f(s2.f fVar, w1.a aVar) {
        super(fVar, aVar);
    }

    public f(s2.f fVar, float f11) {
        super(fVar, f11);
    }

    public f(s2.f fVar, float f11, w1.a aVar) {
        super(fVar, f11, aVar);
    }
}
