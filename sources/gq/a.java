package gq;

import com.google.zxing.FormatException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final kp.b f53989a;

    /* renamed from: b, reason: collision with root package name */
    public h f53990b;

    /* renamed from: c, reason: collision with root package name */
    public f f53991c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f53992d;

    public a(kp.b bVar) throws FormatException {
        int h11 = bVar.h();
        if (h11 < 21 || (h11 & 3) != 1) {
            throw FormatException.getFormatInstance();
        }
        this.f53989a = bVar;
    }

    public final int a(int i11, int i12, int i13) {
        return this.f53992d ? this.f53989a.e(i12, i11) : this.f53989a.e(i11, i12) ? (i13 << 1) | 1 : i13 << 1;
    }

    public void b() {
        int i11 = 0;
        while (i11 < this.f53989a.m()) {
            int i12 = i11 + 1;
            for (int i13 = i12; i13 < this.f53989a.h(); i13++) {
                if (this.f53989a.e(i11, i13) != this.f53989a.e(i13, i11)) {
                    this.f53989a.d(i13, i11);
                    this.f53989a.d(i11, i13);
                }
            }
            i11 = i12;
        }
    }

    public byte[] c() throws FormatException {
        f d11 = d();
        h e11 = e();
        c cVar = c.values()[d11.c()];
        int h11 = this.f53989a.h();
        cVar.b(this.f53989a, h11);
        kp.b a11 = e11.a();
        byte[] bArr = new byte[e11.h()];
        int i11 = h11 - 1;
        boolean z11 = true;
        int i12 = i11;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i12 > 0) {
            if (i12 == 6) {
                i12--;
            }
            for (int i16 = 0; i16 < h11; i16++) {
                int i17 = z11 ? i11 - i16 : i16;
                for (int i18 = 0; i18 < 2; i18++) {
                    int i19 = i12 - i18;
                    if (!a11.e(i19, i17)) {
                        i14++;
                        i15 <<= 1;
                        if (this.f53989a.e(i19, i17)) {
                            i15 |= 1;
                        }
                        if (i14 == 8) {
                            bArr[i13] = (byte) i15;
                            i13++;
                            i14 = 0;
                            i15 = 0;
                        }
                    }
                }
            }
            z11 = !z11;
            i12 -= 2;
        }
        if (i13 == e11.h()) {
            return bArr;
        }
        throw FormatException.getFormatInstance();
    }

    public f d() throws FormatException {
        f fVar = this.f53991c;
        if (fVar != null) {
            return fVar;
        }
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < 6; i13++) {
            i12 = a(i13, 8, i12);
        }
        int a11 = a(8, 7, a(8, 8, a(7, 8, i12)));
        for (int i14 = 5; i14 >= 0; i14--) {
            a11 = a(8, i14, a11);
        }
        int h11 = this.f53989a.h();
        int i15 = h11 - 7;
        for (int i16 = h11 - 1; i16 >= i15; i16--) {
            i11 = a(8, i16, i11);
        }
        for (int i17 = h11 - 8; i17 < h11; i17++) {
            i11 = a(i17, 8, i11);
        }
        f a12 = f.a(a11, i11);
        this.f53991c = a12;
        if (a12 != null) {
            return a12;
        }
        throw FormatException.getFormatInstance();
    }

    public h e() throws FormatException {
        h hVar = this.f53990b;
        if (hVar != null) {
            return hVar;
        }
        int h11 = this.f53989a.h();
        int i11 = (h11 - 17) / 4;
        if (i11 <= 6) {
            return h.i(i11);
        }
        int i12 = h11 - 11;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 5; i15 >= 0; i15--) {
            for (int i16 = h11 - 9; i16 >= i12; i16--) {
                i14 = a(i16, i15, i14);
            }
        }
        h c11 = h.c(i14);
        if (c11 != null && c11.e() == h11) {
            this.f53990b = c11;
            return c11;
        }
        for (int i17 = 5; i17 >= 0; i17--) {
            for (int i18 = h11 - 9; i18 >= i12; i18--) {
                i13 = a(i17, i18, i13);
            }
        }
        h c12 = h.c(i13);
        if (c12 == null || c12.e() != h11) {
            throw FormatException.getFormatInstance();
        }
        this.f53990b = c12;
        return c12;
    }

    public void f() {
        if (this.f53991c == null) {
            return;
        }
        c.values()[this.f53991c.c()].b(this.f53989a, this.f53989a.h());
    }

    public void g(boolean z11) {
        this.f53990b = null;
        this.f53991c = null;
        this.f53992d = z11;
    }
}
