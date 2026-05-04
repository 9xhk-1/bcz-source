package com.badlogic.gdx.graphics;

import a3.e0;
import com.malmstein.fenster.videorender.gles.GeneratedTexture;
import com.tencent.liteav.TXLiteAVCode;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class b {
    public static final b A;
    public static final b B;
    public static final b C;
    public static final b D;
    public static final b E;
    public static final b F;
    public static final b G;
    public static final b H;
    public static final b I;
    public static final b J;
    public static final b K;
    public static final b L;
    public static final b M;
    public static final b N;

    /* renamed from: e, reason: collision with root package name */
    public static final b f11522e;

    /* renamed from: f, reason: collision with root package name */
    public static final b f11523f;

    /* renamed from: g, reason: collision with root package name */
    public static final b f11524g;

    /* renamed from: h, reason: collision with root package name */
    public static final b f11525h;

    /* renamed from: i, reason: collision with root package name */
    public static final b f11526i;

    /* renamed from: j, reason: collision with root package name */
    public static final float f11527j;

    /* renamed from: k, reason: collision with root package name */
    public static final b f11528k;

    /* renamed from: l, reason: collision with root package name */
    public static final b f11529l;

    /* renamed from: m, reason: collision with root package name */
    public static final b f11530m;

    /* renamed from: n, reason: collision with root package name */
    public static final b f11531n;

    /* renamed from: o, reason: collision with root package name */
    public static final b f11532o;

    /* renamed from: p, reason: collision with root package name */
    public static final b f11533p;

    /* renamed from: q, reason: collision with root package name */
    public static final b f11534q;

    /* renamed from: r, reason: collision with root package name */
    public static final b f11535r;

    /* renamed from: s, reason: collision with root package name */
    public static final b f11536s;

    /* renamed from: t, reason: collision with root package name */
    public static final b f11537t;

    /* renamed from: u, reason: collision with root package name */
    public static final b f11538u;

    /* renamed from: v, reason: collision with root package name */
    public static final b f11539v;

    /* renamed from: w, reason: collision with root package name */
    public static final b f11540w;

    /* renamed from: x, reason: collision with root package name */
    public static final b f11541x;

    /* renamed from: y, reason: collision with root package name */
    public static final b f11542y;

    /* renamed from: z, reason: collision with root package name */
    public static final b f11543z;

    /* renamed from: a, reason: collision with root package name */
    public float f11544a;

    /* renamed from: b, reason: collision with root package name */
    public float f11545b;

    /* renamed from: c, reason: collision with root package name */
    public float f11546c;

    /* renamed from: d, reason: collision with root package name */
    public float f11547d;

    static {
        b bVar = new b(1.0f, 1.0f, 1.0f, 1.0f);
        f11522e = bVar;
        f11523f = new b(-1077952513);
        f11524g = new b(2139062271);
        f11525h = new b(1061109759);
        f11526i = new b(0.0f, 0.0f, 0.0f, 1.0f);
        f11527j = bVar.L();
        f11528k = new b(0.0f, 0.0f, 0.0f, 0.0f);
        f11529l = new b(1.0f, 1.0f, 1.0f, 0.0f);
        f11530m = new b(0.0f, 0.0f, 1.0f, 1.0f);
        f11531n = new b(0.0f, 0.0f, 0.5f, 1.0f);
        f11532o = new b(1097458175);
        f11533p = new b(1887473919);
        f11534q = new b(-2016482305);
        f11535r = new b(0.0f, 1.0f, 1.0f, 1.0f);
        f11536s = new b(0.0f, 0.5f, 0.5f, 1.0f);
        f11537t = new b(GeneratedTexture.f39228e);
        f11538u = new b(2147418367);
        f11539v = new b(852308735);
        f11540w = new b(579543807);
        f11541x = new b(1804477439);
        f11542y = new b(-65281);
        f11543z = new b(-2686721);
        A = new b(-626712321);
        B = new b(-5963521);
        C = new b(-1958407169);
        D = new b(-759919361);
        E = new b(-1306385665);
        F = new b(-16776961);
        G = new b(-13361921);
        H = new b(-8433409);
        I = new b(-92245249);
        J = new b(-9849601);
        K = new b(1.0f, 0.0f, 1.0f, 1.0f);
        L = new b(-1608453889);
        M = new b(-293409025);
        N = new b(-1339006721);
    }

    public b() {
    }

    public static int A(b bVar) {
        return ((int) (bVar.f11547d * 15.0f)) | (((int) (bVar.f11544a * 15.0f)) << 12) | (((int) (bVar.f11545b * 15.0f)) << 8) | (((int) (bVar.f11546c * 15.0f)) << 4);
    }

    public static void B(b bVar, int i11) {
        bVar.f11544a = ((61440 & i11) >>> 12) / 15.0f;
        bVar.f11545b = ((i11 & 3840) >>> 8) / 15.0f;
        bVar.f11546c = ((i11 & 240) >>> 4) / 15.0f;
        bVar.f11547d = (i11 & 15) / 15.0f;
    }

    public static int C(float f11, float f12, float f13, float f14) {
        return (((int) (f11 * 255.0f)) << 24) | (((int) (f12 * 255.0f)) << 16) | (((int) (f13 * 255.0f)) << 8) | ((int) (f14 * 255.0f));
    }

    public static int D(b bVar) {
        return ((int) (bVar.f11547d * 255.0f)) | (((int) (bVar.f11544a * 255.0f)) << 24) | (((int) (bVar.f11545b * 255.0f)) << 16) | (((int) (bVar.f11546c * 255.0f)) << 8);
    }

    public static void E(b bVar, int i11) {
        bVar.f11544a = (((-16777216) & i11) >>> 24) / 255.0f;
        bVar.f11545b = ((16711680 & i11) >>> 16) / 255.0f;
        bVar.f11546c = ((65280 & i11) >>> 8) / 255.0f;
        bVar.f11547d = (i11 & 255) / 255.0f;
    }

    public static float M(float f11, float f12, float f13, float f14) {
        return e0.f(((int) (f11 * 255.0f)) | (((int) (f12 * 255.0f)) << 8) | (((int) (f13 * 255.0f)) << 16) | (((int) (f14 * 255.0f)) << 24));
    }

    public static float N(int i11, int i12, int i13, int i14) {
        return e0.f(i11 | (i12 << 8) | (i13 << 16) | (i14 << 24));
    }

    public static int Q(int i11, int i12, int i13, int i14) {
        return i11 | (i12 << 8) | (i13 << 16) | (i14 << 24);
    }

    public static b R(String str) {
        return S(str, new b());
    }

    public static b S(String str, b bVar) {
        if (str.charAt(0) == '#') {
            str = str.substring(1);
        }
        bVar.f11544a = Integer.parseInt(str.substring(0, 2), 16) / 255.0f;
        bVar.f11545b = Integer.parseInt(str.substring(2, 4), 16) / 255.0f;
        bVar.f11546c = Integer.parseInt(str.substring(4, 6), 16) / 255.0f;
        bVar.f11547d = str.length() != 8 ? 1.0f : Integer.parseInt(str.substring(6, 8), 16) / 255.0f;
        return bVar;
    }

    public static void a(b bVar, float f11) {
        int c11 = e0.c(f11);
        bVar.f11547d = (((-16777216) & c11) >>> 24) / 255.0f;
        bVar.f11546c = ((16711680 & c11) >>> 16) / 255.0f;
        bVar.f11545b = ((65280 & c11) >>> 8) / 255.0f;
        bVar.f11544a = (c11 & 255) / 255.0f;
    }

    public static void b(b bVar, int i11) {
        bVar.f11547d = (((-16777216) & i11) >>> 24) / 255.0f;
        bVar.f11546c = ((16711680 & i11) >>> 16) / 255.0f;
        bVar.f11545b = ((65280 & i11) >>> 8) / 255.0f;
        bVar.f11544a = (i11 & 255) / 255.0f;
    }

    public static int e(float f11) {
        return (int) (f11 * 255.0f);
    }

    public static int f(float f11, float f12, float f13, float f14) {
        return (((int) (f11 * 255.0f)) << 24) | (((int) (f12 * 255.0f)) << 16) | (((int) (f13 * 255.0f)) << 8) | ((int) (f14 * 255.0f));
    }

    public static int g(b bVar) {
        return ((int) (bVar.f11546c * 255.0f)) | (((int) (bVar.f11547d * 255.0f)) << 24) | (((int) (bVar.f11544a * 255.0f)) << 16) | (((int) (bVar.f11545b * 255.0f)) << 8);
    }

    public static void h(b bVar, int i11) {
        bVar.f11547d = (((-16777216) & i11) >>> 24) / 255.0f;
        bVar.f11544a = ((16711680 & i11) >>> 16) / 255.0f;
        bVar.f11545b = ((65280 & i11) >>> 8) / 255.0f;
        bVar.f11546c = (i11 & 255) / 255.0f;
    }

    public static int o(float f11, float f12) {
        return (((int) (f11 * 255.0f)) << 8) | ((int) (f12 * 255.0f));
    }

    public static int t(float f11, float f12, float f13) {
        return (((int) (f11 * 31.0f)) << 11) | (((int) (f12 * 63.0f)) << 5) | ((int) (f13 * 31.0f));
    }

    public static int u(b bVar) {
        return ((int) (bVar.f11546c * 31.0f)) | (((int) (bVar.f11544a * 31.0f)) << 11) | (((int) (bVar.f11545b * 63.0f)) << 5);
    }

    public static void v(b bVar, int i11) {
        bVar.f11544a = ((63488 & i11) >>> 11) / 31.0f;
        bVar.f11545b = ((i11 & TXLiteAVCode.EVT_VOD_PLAY_TCP_CONNECT_SUCC) >>> 5) / 63.0f;
        bVar.f11546c = (i11 & 31) / 31.0f;
    }

    public static int w(float f11, float f12, float f13) {
        return (((int) (f11 * 255.0f)) << 16) | (((int) (f12 * 255.0f)) << 8) | ((int) (f13 * 255.0f));
    }

    public static int x(b bVar) {
        return ((int) (bVar.f11546c * 255.0f)) | (((int) (bVar.f11544a * 255.0f)) << 16) | (((int) (bVar.f11545b * 255.0f)) << 8);
    }

    public static void y(b bVar, int i11) {
        bVar.f11544a = ((16711680 & i11) >>> 16) / 255.0f;
        bVar.f11545b = ((65280 & i11) >>> 8) / 255.0f;
        bVar.f11546c = (i11 & 255) / 255.0f;
    }

    public static int z(float f11, float f12, float f13, float f14) {
        return (((int) (f11 * 15.0f)) << 12) | (((int) (f12 * 15.0f)) << 8) | (((int) (f13 * 15.0f)) << 4) | ((int) (f14 * 15.0f));
    }

    public b F(float f11, float f12, float f13, float f14) {
        this.f11544a = f11;
        this.f11545b = f12;
        this.f11546c = f13;
        this.f11547d = f14;
        return i();
    }

    public b G(int i11) {
        E(this, i11);
        return this;
    }

    public b H(b bVar) {
        this.f11544a = bVar.f11544a;
        this.f11545b = bVar.f11545b;
        this.f11546c = bVar.f11546c;
        this.f11547d = bVar.f11547d;
        return this;
    }

    public b I(b bVar, float f11) {
        this.f11544a = bVar.f11544a;
        this.f11545b = bVar.f11545b;
        this.f11546c = bVar.f11546c;
        this.f11547d = com.badlogic.gdx.math.n.o(f11, 0.0f, 1.0f);
        return this;
    }

    public b J(float f11, float f12, float f13, float f14) {
        this.f11544a -= f11;
        this.f11545b -= f12;
        this.f11546c -= f13;
        this.f11547d -= f14;
        return i();
    }

    public b K(b bVar) {
        this.f11544a -= bVar.f11544a;
        this.f11545b -= bVar.f11545b;
        this.f11546c -= bVar.f11546c;
        this.f11547d -= bVar.f11547d;
        return i();
    }

    public float L() {
        return e0.f((((int) (this.f11547d * 255.0f)) << 24) | (((int) (this.f11546c * 255.0f)) << 16) | (((int) (this.f11545b * 255.0f)) << 8) | ((int) (this.f11544a * 255.0f)));
    }

    public float[] O(float[] fArr) {
        float max = Math.max(Math.max(this.f11544a, this.f11545b), this.f11546c);
        float min = Math.min(Math.min(this.f11544a, this.f11545b), this.f11546c);
        float f11 = max - min;
        if (f11 == 0.0f) {
            fArr[0] = 0.0f;
        } else {
            float f12 = this.f11544a;
            if (max == f12) {
                fArr[0] = ((((this.f11545b - this.f11546c) * 60.0f) / f11) + 360.0f) % 360.0f;
            } else {
                float f13 = this.f11545b;
                if (max == f13) {
                    fArr[0] = (((this.f11546c - f12) * 60.0f) / f11) + 120.0f;
                } else {
                    fArr[0] = (((f12 - f13) * 60.0f) / f11) + 240.0f;
                }
            }
        }
        if (max > 0.0f) {
            fArr[1] = 1.0f - (min / max);
        } else {
            fArr[1] = 0.0f;
        }
        fArr[2] = max;
        return fArr;
    }

    public int P() {
        return (((int) (this.f11547d * 255.0f)) << 24) | (((int) (this.f11546c * 255.0f)) << 16) | (((int) (this.f11545b * 255.0f)) << 8) | ((int) (this.f11544a * 255.0f));
    }

    public b c(float f11, float f12, float f13, float f14) {
        this.f11544a += f11;
        this.f11545b += f12;
        this.f11546c += f13;
        this.f11547d += f14;
        return i();
    }

    public b d(b bVar) {
        this.f11544a += bVar.f11544a;
        this.f11545b += bVar.f11545b;
        this.f11546c += bVar.f11546c;
        this.f11547d += bVar.f11547d;
        return i();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && P() == ((b) obj).P();
    }

    public int hashCode() {
        float f11 = this.f11544a;
        int b11 = (f11 != 0.0f ? e0.b(f11) : 0) * 31;
        float f12 = this.f11545b;
        int b12 = (b11 + (f12 != 0.0f ? e0.b(f12) : 0)) * 31;
        float f13 = this.f11546c;
        int b13 = (b12 + (f13 != 0.0f ? e0.b(f13) : 0)) * 31;
        float f14 = this.f11547d;
        return b13 + (f14 != 0.0f ? e0.b(f14) : 0);
    }

    public b i() {
        float f11 = this.f11544a;
        if (f11 < 0.0f) {
            this.f11544a = 0.0f;
        } else if (f11 > 1.0f) {
            this.f11544a = 1.0f;
        }
        float f12 = this.f11545b;
        if (f12 < 0.0f) {
            this.f11545b = 0.0f;
        } else if (f12 > 1.0f) {
            this.f11545b = 1.0f;
        }
        float f13 = this.f11546c;
        if (f13 < 0.0f) {
            this.f11546c = 0.0f;
        } else if (f13 > 1.0f) {
            this.f11546c = 1.0f;
        }
        float f14 = this.f11547d;
        if (f14 < 0.0f) {
            this.f11547d = 0.0f;
            return this;
        }
        if (f14 > 1.0f) {
            this.f11547d = 1.0f;
        }
        return this;
    }

    public b j() {
        return new b(this);
    }

    public b k(float f11, float f12, float f13) {
        float f14 = ((f11 / 60.0f) + 6.0f) % 6.0f;
        int i11 = (int) f14;
        float f15 = f14 - i11;
        float f16 = (1.0f - f12) * f13;
        float f17 = (1.0f - (f12 * f15)) * f13;
        float f18 = (1.0f - (f12 * (1.0f - f15))) * f13;
        if (i11 == 0) {
            this.f11544a = f13;
            this.f11545b = f18;
            this.f11546c = f16;
        } else if (i11 == 1) {
            this.f11544a = f17;
            this.f11545b = f13;
            this.f11546c = f16;
        } else if (i11 == 2) {
            this.f11544a = f16;
            this.f11545b = f13;
            this.f11546c = f18;
        } else if (i11 == 3) {
            this.f11544a = f16;
            this.f11545b = f17;
            this.f11546c = f13;
        } else if (i11 != 4) {
            this.f11544a = f13;
            this.f11545b = f16;
            this.f11546c = f17;
        } else {
            this.f11544a = f18;
            this.f11545b = f16;
            this.f11546c = f13;
        }
        return i();
    }

    public b l(float[] fArr) {
        return k(fArr[0], fArr[1], fArr[2]);
    }

    public b m(float f11, float f12, float f13, float f14, float f15) {
        float f16 = this.f11544a;
        this.f11544a = f16 + ((f11 - f16) * f15);
        float f17 = this.f11545b;
        this.f11545b = f17 + ((f12 - f17) * f15);
        float f18 = this.f11546c;
        this.f11546c = f18 + ((f13 - f18) * f15);
        float f19 = this.f11547d;
        this.f11547d = f19 + (f15 * (f14 - f19));
        return i();
    }

    public b n(b bVar, float f11) {
        float f12 = this.f11544a;
        this.f11544a = f12 + ((bVar.f11544a - f12) * f11);
        float f13 = this.f11545b;
        this.f11545b = f13 + ((bVar.f11545b - f13) * f11);
        float f14 = this.f11546c;
        this.f11546c = f14 + ((bVar.f11546c - f14) * f11);
        float f15 = this.f11547d;
        this.f11547d = f15 + (f11 * (bVar.f11547d - f15));
        return i();
    }

    public b p(float f11) {
        this.f11544a *= f11;
        this.f11545b *= f11;
        this.f11546c *= f11;
        this.f11547d *= f11;
        return i();
    }

    public b q(float f11, float f12, float f13, float f14) {
        this.f11544a *= f11;
        this.f11545b *= f12;
        this.f11546c *= f13;
        this.f11547d *= f14;
        return i();
    }

    public b r(b bVar) {
        this.f11544a *= bVar.f11544a;
        this.f11545b *= bVar.f11545b;
        this.f11546c *= bVar.f11546c;
        this.f11547d *= bVar.f11547d;
        return i();
    }

    public b s() {
        float f11 = this.f11544a;
        float f12 = this.f11547d;
        this.f11544a = f11 * f12;
        this.f11545b *= f12;
        this.f11546c *= f12;
        return this;
    }

    public String toString() {
        String hexString = Integer.toHexString((((int) (this.f11544a * 255.0f)) << 24) | (((int) (this.f11545b * 255.0f)) << 16) | (((int) (this.f11546c * 255.0f)) << 8) | ((int) (this.f11547d * 255.0f)));
        while (hexString.length() < 8) {
            hexString = "0" + hexString;
        }
        return hexString;
    }

    public b(int i11) {
        E(this, i11);
    }

    public b(float f11, float f12, float f13, float f14) {
        this.f11544a = f11;
        this.f11545b = f12;
        this.f11546c = f13;
        this.f11547d = f14;
        i();
    }

    public b(b bVar) {
        H(bVar);
    }
}
