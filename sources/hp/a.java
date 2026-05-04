package hp;

import com.google.zxing.NotFoundException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import com.google.zxing.l;
import com.tencent.rtmp.TXLiveConstants;
import kp.b;
import kp.h;
import mp.c;
import u30.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f59728g = {3808, 476, TXLiveConstants.PLAY_WARNING_VIDEO_DISCONTINUITY, 1799};

    /* renamed from: a, reason: collision with root package name */
    public final b f59729a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f59730b;

    /* renamed from: c, reason: collision with root package name */
    public int f59731c;

    /* renamed from: d, reason: collision with root package name */
    public int f59732d;

    /* renamed from: e, reason: collision with root package name */
    public int f59733e;

    /* renamed from: f, reason: collision with root package name */
    public int f59734f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: hp.a$a, reason: collision with other inner class name */
    public static final class C0680a {

        /* renamed from: a, reason: collision with root package name */
        public final int f59735a;

        /* renamed from: b, reason: collision with root package name */
        public final int f59736b;

        public C0680a(int i11, int i12) {
            this.f59735a = i11;
            this.f59736b = i12;
        }

        public int a() {
            return this.f59735a;
        }

        public int b() {
            return this.f59736b;
        }

        public l c() {
            return new l(a(), b());
        }

        public String toString() {
            return "<" + this.f59735a + ' ' + this.f59736b + u0.f91710f;
        }
    }

    public a(b bVar) {
        this.f59729a = bVar;
    }

    public static float c(l lVar, l lVar2) {
        return lp.a.a(lVar.c(), lVar.d(), lVar2.c(), lVar2.d());
    }

    public static float d(C0680a c0680a, C0680a c0680a2) {
        return lp.a.b(c0680a.a(), c0680a.b(), c0680a2.a(), c0680a2.b());
    }

    public static l[] e(l[] lVarArr, int i11, int i12) {
        float f11 = i12 / (i11 * 2.0f);
        float c11 = lVarArr[0].c() - lVarArr[2].c();
        float d11 = lVarArr[0].d() - lVarArr[2].d();
        float c12 = (lVarArr[0].c() + lVarArr[2].c()) / 2.0f;
        float d12 = (lVarArr[0].d() + lVarArr[2].d()) / 2.0f;
        float f12 = c11 * f11;
        float f13 = d11 * f11;
        l lVar = new l(c12 + f12, d12 + f13);
        l lVar2 = new l(c12 - f12, d12 - f13);
        float c13 = lVarArr[1].c() - lVarArr[3].c();
        float d13 = lVarArr[1].d() - lVarArr[3].d();
        float c14 = (lVarArr[1].c() + lVarArr[3].c()) / 2.0f;
        float d14 = (lVarArr[1].d() + lVarArr[3].d()) / 2.0f;
        float f14 = c13 * f11;
        float f15 = f11 * d13;
        return new l[]{lVar, new l(c14 + f14, d14 + f15), lVar2, new l(c14 - f14, d14 - f15)};
    }

    public static int i(long j11, boolean z11) throws NotFoundException {
        int i11;
        int i12;
        if (z11) {
            i11 = 7;
            i12 = 2;
        } else {
            i11 = 10;
            i12 = 4;
        }
        int i13 = i11 - i12;
        int[] iArr = new int[i11];
        for (int i14 = i11 - 1; i14 >= 0; i14--) {
            iArr[i14] = ((int) j11) & 15;
            j11 >>= 4;
        }
        try {
            new c(mp.a.f73614k).a(iArr, i13);
            int i15 = 0;
            for (int i16 = 0; i16 < i12; i16++) {
                i15 = (i15 << 4) + iArr[i16];
            }
            return i15;
        } catch (ReedSolomonException unused) {
            throw NotFoundException.getNotFoundInstance();
        }
    }

    public static int n(int[] iArr, int i11) throws NotFoundException {
        int i12 = 0;
        for (int i13 : iArr) {
            i12 = (i12 << 3) + ((i13 >> (i11 - 2)) << 1) + (i13 & 1);
        }
        int i14 = ((i12 & 1) << 11) + (i12 >> 1);
        for (int i15 = 0; i15 < 4; i15++) {
            if (Integer.bitCount(f59728g[i15] ^ i14) <= 2) {
                return i15;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public fp.a a() throws NotFoundException {
        return b(false);
    }

    public fp.a b(boolean z11) throws NotFoundException {
        l[] g11 = g(l());
        if (z11) {
            l lVar = g11[0];
            g11[0] = g11[2];
            g11[2] = lVar;
        }
        f(g11);
        b bVar = this.f59729a;
        int i11 = this.f59734f;
        return new fp.a(r(bVar, g11[i11 % 4], g11[(i11 + 1) % 4], g11[(i11 + 2) % 4], g11[(i11 + 3) % 4]), m(g11), this.f59730b, this.f59732d, this.f59731c);
    }

    public final void f(l[] lVarArr) throws NotFoundException {
        long j11;
        long j12;
        if (!p(lVarArr[0]) || !p(lVarArr[1]) || !p(lVarArr[2]) || !p(lVarArr[3])) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i11 = this.f59733e * 2;
        int[] iArr = {s(lVarArr[0], lVarArr[1], i11), s(lVarArr[1], lVarArr[2], i11), s(lVarArr[2], lVarArr[3], i11), s(lVarArr[3], lVarArr[0], i11)};
        this.f59734f = n(iArr, i11);
        long j13 = 0;
        for (int i12 = 0; i12 < 4; i12++) {
            int i13 = iArr[(this.f59734f + i12) % 4];
            if (this.f59730b) {
                j11 = j13 << 7;
                j12 = (i13 >> 1) & 127;
            } else {
                j11 = j13 << 10;
                j12 = ((i13 >> 2) & 992) + ((i13 >> 1) & 31);
            }
            j13 = j11 + j12;
        }
        int i14 = i(j13, this.f59730b);
        if (this.f59730b) {
            this.f59731c = (i14 >> 6) + 1;
            this.f59732d = (i14 & 63) + 1;
        } else {
            this.f59731c = (i14 >> 11) + 1;
            this.f59732d = (i14 & 2047) + 1;
        }
    }

    public final l[] g(C0680a c0680a) throws NotFoundException {
        this.f59733e = 1;
        C0680a c0680a2 = c0680a;
        C0680a c0680a3 = c0680a2;
        C0680a c0680a4 = c0680a3;
        boolean z11 = true;
        while (this.f59733e < 9) {
            C0680a k11 = k(c0680a, z11, 1, -1);
            C0680a k12 = k(c0680a2, z11, 1, 1);
            C0680a k13 = k(c0680a3, z11, -1, 1);
            C0680a k14 = k(c0680a4, z11, -1, -1);
            if (this.f59733e > 2) {
                double d11 = (d(k14, k11) * this.f59733e) / (d(c0680a4, c0680a) * (this.f59733e + 2));
                if (d11 < 0.75d || d11 > 1.25d || !q(k11, k12, k13, k14)) {
                    break;
                }
            }
            z11 = !z11;
            this.f59733e++;
            c0680a4 = k14;
            c0680a = k11;
            c0680a2 = k12;
            c0680a3 = k13;
        }
        int i11 = this.f59733e;
        if (i11 != 5 && i11 != 7) {
            throw NotFoundException.getNotFoundInstance();
        }
        this.f59730b = i11 == 5;
        return e(new l[]{new l(c0680a.a() + 0.5f, c0680a.b() - 0.5f), new l(c0680a2.a() + 0.5f, c0680a2.b() + 0.5f), new l(c0680a3.a() - 0.5f, c0680a3.b() + 0.5f), new l(c0680a4.a() - 0.5f, c0680a4.b() - 0.5f)}, (r0 * 2) - 3, this.f59733e * 2);
    }

    public final int h(C0680a c0680a, C0680a c0680a2) {
        float d11 = d(c0680a, c0680a2);
        float a11 = (c0680a2.a() - c0680a.a()) / d11;
        float b11 = (c0680a2.b() - c0680a.b()) / d11;
        float a12 = c0680a.a();
        float b12 = c0680a.b();
        boolean e11 = this.f59729a.e(c0680a.a(), c0680a.b());
        int ceil = (int) Math.ceil(d11);
        int i11 = 0;
        for (int i12 = 0; i12 < ceil; i12++) {
            a12 += a11;
            b12 += b11;
            if (this.f59729a.e(lp.a.c(a12), lp.a.c(b12)) != e11) {
                i11++;
            }
        }
        float f11 = i11 / d11;
        if (f11 <= 0.1f || f11 >= 0.9f) {
            return (f11 <= 0.1f) == e11 ? 1 : -1;
        }
        return 0;
    }

    public final int j() {
        if (this.f59730b) {
            return (this.f59731c * 4) + 11;
        }
        int i11 = this.f59731c;
        return i11 <= 4 ? (i11 * 4) + 15 : (i11 * 4) + ((((i11 - 4) / 8) + 1) * 2) + 15;
    }

    public final C0680a k(C0680a c0680a, boolean z11, int i11, int i12) {
        int a11 = c0680a.a() + i11;
        int b11 = c0680a.b();
        while (true) {
            b11 += i12;
            if (!o(a11, b11) || this.f59729a.e(a11, b11) != z11) {
                break;
            }
            a11 += i11;
        }
        int i13 = a11 - i11;
        int i14 = b11 - i12;
        while (o(i13, i14) && this.f59729a.e(i13, i14) == z11) {
            i13 += i11;
        }
        int i15 = i13 - i11;
        while (o(i15, i14) && this.f59729a.e(i15, i14) == z11) {
            i14 += i12;
        }
        return new C0680a(i15, i14 - i12);
    }

    public final C0680a l() {
        l c11;
        l lVar;
        l lVar2;
        l lVar3;
        l c12;
        l c13;
        l c14;
        l c15;
        try {
            l[] c16 = new lp.c(this.f59729a).c();
            lVar2 = c16[0];
            lVar3 = c16[1];
            lVar = c16[2];
            c11 = c16[3];
        } catch (NotFoundException unused) {
            int m11 = this.f59729a.m() / 2;
            int h11 = this.f59729a.h() / 2;
            int i11 = m11 + 7;
            int i12 = h11 - 7;
            l c17 = k(new C0680a(i11, i12), false, 1, -1).c();
            int i13 = h11 + 7;
            l c18 = k(new C0680a(i11, i13), false, 1, 1).c();
            int i14 = m11 - 7;
            l c19 = k(new C0680a(i14, i13), false, -1, 1).c();
            c11 = k(new C0680a(i14, i12), false, -1, -1).c();
            lVar = c19;
            lVar2 = c17;
            lVar3 = c18;
        }
        int c21 = lp.a.c((((lVar2.c() + c11.c()) + lVar3.c()) + lVar.c()) / 4.0f);
        int c22 = lp.a.c((((lVar2.d() + c11.d()) + lVar3.d()) + lVar.d()) / 4.0f);
        try {
            l[] c23 = new lp.c(this.f59729a, 15, c21, c22).c();
            c12 = c23[0];
            c13 = c23[1];
            c14 = c23[2];
            c15 = c23[3];
        } catch (NotFoundException unused2) {
            int i15 = c21 + 7;
            int i16 = c22 - 7;
            c12 = k(new C0680a(i15, i16), false, 1, -1).c();
            int i17 = c22 + 7;
            c13 = k(new C0680a(i15, i17), false, 1, 1).c();
            int i18 = c21 - 7;
            c14 = k(new C0680a(i18, i17), false, -1, 1).c();
            c15 = k(new C0680a(i18, i16), false, -1, -1).c();
        }
        return new C0680a(lp.a.c((((c12.c() + c15.c()) + c13.c()) + c14.c()) / 4.0f), lp.a.c((((c12.d() + c15.d()) + c13.d()) + c14.d()) / 4.0f));
    }

    public final l[] m(l[] lVarArr) {
        return e(lVarArr, this.f59733e * 2, j());
    }

    public final boolean o(int i11, int i12) {
        return i11 >= 0 && i11 < this.f59729a.m() && i12 > 0 && i12 < this.f59729a.h();
    }

    public final boolean p(l lVar) {
        return o(lp.a.c(lVar.c()), lp.a.c(lVar.d()));
    }

    public final boolean q(C0680a c0680a, C0680a c0680a2, C0680a c0680a3, C0680a c0680a4) {
        C0680a c0680a5 = new C0680a(c0680a.a() - 3, c0680a.b() + 3);
        C0680a c0680a6 = new C0680a(c0680a2.a() - 3, c0680a2.b() - 3);
        C0680a c0680a7 = new C0680a(c0680a3.a() + 3, c0680a3.b() - 3);
        C0680a c0680a8 = new C0680a(c0680a4.a() + 3, c0680a4.b() + 3);
        int h11 = h(c0680a8, c0680a5);
        return h11 != 0 && h(c0680a5, c0680a6) == h11 && h(c0680a6, c0680a7) == h11 && h(c0680a7, c0680a8) == h11;
    }

    public final b r(b bVar, l lVar, l lVar2, l lVar3, l lVar4) throws NotFoundException {
        h b11 = h.b();
        int j11 = j();
        float f11 = j11 / 2.0f;
        int i11 = this.f59733e;
        float f12 = f11 - i11;
        float f13 = f11 + i11;
        return b11.c(bVar, j11, j11, f12, f12, f13, f12, f13, f13, f12, f13, lVar.c(), lVar.d(), lVar2.c(), lVar2.d(), lVar3.c(), lVar3.d(), lVar4.c(), lVar4.d());
    }

    public final int s(l lVar, l lVar2, int i11) {
        float c11 = c(lVar, lVar2);
        float f11 = c11 / i11;
        float c12 = lVar.c();
        float d11 = lVar.d();
        float c13 = ((lVar2.c() - lVar.c()) * f11) / c11;
        float d12 = (f11 * (lVar2.d() - lVar.d())) / c11;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            float f12 = i13;
            if (this.f59729a.e(lp.a.c((f12 * c13) + c12), lp.a.c((f12 * d12) + d11))) {
                i12 |= 1 << ((i11 - i13) - 1);
            }
        }
        return i12;
    }
}
