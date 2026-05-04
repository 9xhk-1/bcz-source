package hq;

import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.l;
import com.google.zxing.m;
import java.util.Map;
import kp.h;
import kp.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final kp.b f59747a;

    /* renamed from: b, reason: collision with root package name */
    public m f59748b;

    public c(kp.b bVar) {
        this.f59747a = bVar;
    }

    public static int c(l lVar, l lVar2, l lVar3, float f11) throws NotFoundException {
        int c11 = (lp.a.c(l.b(lVar, lVar2) / f11) + lp.a.c(l.b(lVar, lVar3) / f11)) / 2;
        int i11 = c11 + 7;
        int i12 = i11 & 3;
        if (i12 == 0) {
            return c11 + 8;
        }
        if (i12 == 2) {
            return c11 + 6;
        }
        if (i12 != 3) {
            return i11;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public static j d(l lVar, l lVar2, l lVar3, l lVar4, int i11) {
        float c11;
        float d11;
        float f11;
        float f12 = i11 - 3.5f;
        if (lVar4 != null) {
            c11 = lVar4.c();
            d11 = lVar4.d();
            f11 = f12 - 3.0f;
        } else {
            c11 = (lVar2.c() - lVar.c()) + lVar3.c();
            d11 = (lVar2.d() - lVar.d()) + lVar3.d();
            f11 = f12;
        }
        return j.b(3.5f, 3.5f, f12, 3.5f, f11, f11, 3.5f, f12, lVar.c(), lVar.d(), lVar2.c(), lVar2.d(), c11, d11, lVar3.c(), lVar3.d());
    }

    public static kp.b k(kp.b bVar, j jVar, int i11) throws NotFoundException {
        return h.b().d(bVar, i11, i11, jVar);
    }

    public final float a(l lVar, l lVar2, l lVar3) {
        return (b(lVar, lVar2) + b(lVar, lVar3)) / 2.0f;
    }

    public final float b(l lVar, l lVar2) {
        float m11 = m((int) lVar.c(), (int) lVar.d(), (int) lVar2.c(), (int) lVar2.d());
        float m12 = m((int) lVar2.c(), (int) lVar2.d(), (int) lVar.c(), (int) lVar.d());
        return Float.isNaN(m11) ? m12 / 7.0f : Float.isNaN(m12) ? m11 / 7.0f : (m11 + m12) / 14.0f;
    }

    public kp.f e() throws NotFoundException, FormatException {
        return f(null);
    }

    public final kp.f f(Map<DecodeHintType, ?> map) throws NotFoundException, FormatException {
        m mVar = map == null ? null : (m) map.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK);
        this.f59748b = mVar;
        return j(new e(this.f59747a, mVar).f(map));
    }

    public final a g(float f11, int i11, int i12, float f12) throws NotFoundException {
        int i13 = (int) (f12 * f11);
        int max = Math.max(0, i11 - i13);
        int min = Math.min(this.f59747a.m() - 1, i11 + i13) - max;
        float f13 = 3.0f * f11;
        if (min < f13) {
            throw NotFoundException.getNotFoundInstance();
        }
        int max2 = Math.max(0, i12 - i13);
        int min2 = Math.min(this.f59747a.h() - 1, i12 + i13) - max2;
        if (min2 >= f13) {
            return new b(this.f59747a, max, max2, min, min2, f11, this.f59748b).c();
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public final kp.b h() {
        return this.f59747a;
    }

    public final m i() {
        return this.f59748b;
    }

    public final kp.f j(f fVar) throws NotFoundException, FormatException {
        a aVar;
        d b11 = fVar.b();
        d c11 = fVar.c();
        d a11 = fVar.a();
        float a12 = a(b11, c11, a11);
        if (a12 < 1.0f) {
            throw NotFoundException.getNotFoundInstance();
        }
        int c12 = c(b11, c11, a11, a12);
        gq.h g11 = gq.h.g(c12);
        int e11 = g11.e() - 7;
        if (g11.d().length > 0) {
            float c13 = (c11.c() - b11.c()) + a11.c();
            float d11 = (c11.d() - b11.d()) + a11.d();
            float f11 = 1.0f - (3.0f / e11);
            int c14 = (int) (b11.c() + ((c13 - b11.c()) * f11));
            int d12 = (int) (b11.d() + (f11 * (d11 - b11.d())));
            for (int i11 = 4; i11 <= 16; i11 <<= 1) {
                try {
                    aVar = g(a12, c14, d12, i11);
                    break;
                } catch (NotFoundException unused) {
                }
            }
        }
        aVar = null;
        return new kp.f(k(this.f59747a, d(b11, c11, a11, aVar, c12), c12), aVar == null ? new l[]{a11, b11, c11} : new l[]{a11, b11, c11, aVar});
    }

    public final float l(int i11, int i12, int i13, int i14) {
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        c cVar;
        int i22;
        int i23 = 1;
        boolean z11 = Math.abs(i14 - i12) > Math.abs(i13 - i11);
        if (z11) {
            i16 = i11;
            i15 = i12;
            i18 = i13;
            i17 = i14;
        } else {
            i15 = i11;
            i16 = i12;
            i17 = i13;
            i18 = i14;
        }
        int abs = Math.abs(i17 - i15);
        int abs2 = Math.abs(i18 - i16);
        int i24 = 2;
        int i25 = (-abs) / 2;
        int i26 = i15 < i17 ? 1 : -1;
        int i27 = i16 < i18 ? 1 : -1;
        int i28 = i17 + i26;
        int i29 = i15;
        int i31 = i16;
        int i32 = 0;
        while (true) {
            if (i29 == i28) {
                i19 = i24;
                break;
            }
            int i33 = z11 ? i31 : i29;
            int i34 = z11 ? i29 : i31;
            boolean z12 = z11;
            if (i32 == i23) {
                i21 = i23;
                i22 = abs;
                cVar = this;
            } else {
                i21 = 0;
                cVar = this;
                i22 = abs;
            }
            if (i21 == cVar.f59747a.e(i33, i34)) {
                if (i32 == 2) {
                    return lp.a.b(i29, i31, i15, i16);
                }
                i32++;
            }
            i25 += abs2;
            if (i25 > 0) {
                if (i31 == i18) {
                    i19 = 2;
                    break;
                }
                i31 += i27;
                i25 -= i22;
            }
            i29 += i26;
            abs = i22;
            z11 = z12;
            i23 = 1;
            i24 = 2;
        }
        if (i32 == i19) {
            return lp.a.b(i28, i18, i15, i16);
        }
        return Float.NaN;
    }

    public final float m(int i11, int i12, int i13, int i14) {
        float f11;
        float f12;
        float l11 = l(i11, i12, i13, i14);
        int i15 = i11 - (i13 - i11);
        int i16 = 0;
        if (i15 < 0) {
            f11 = i11 / (i11 - i15);
            i15 = 0;
        } else if (i15 >= this.f59747a.m()) {
            f11 = ((this.f59747a.m() - 1) - i11) / (i15 - i11);
            i15 = this.f59747a.m() - 1;
        } else {
            f11 = 1.0f;
        }
        float f13 = i12;
        int i17 = (int) (f13 - ((i14 - i12) * f11));
        if (i17 < 0) {
            f12 = f13 / (i12 - i17);
        } else if (i17 >= this.f59747a.h()) {
            f12 = ((this.f59747a.h() - 1) - i12) / (i17 - i12);
            i16 = this.f59747a.h() - 1;
        } else {
            i16 = i17;
            f12 = 1.0f;
        }
        return (l11 + l(i11, i12, (int) (i11 + ((i15 - i11) * f12)), i16)) - 1.0f;
    }
}
