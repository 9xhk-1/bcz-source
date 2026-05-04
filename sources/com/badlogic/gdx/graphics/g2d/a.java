package com.badlogic.gdx.graphics.g2d;

import a3.q;
import a3.r;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.d;
import com.badlogic.gdx.utils.GdxRuntimeException;
import q1.g;
import w1.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class a implements q {

    /* renamed from: g, reason: collision with root package name */
    public static final int f11992g = 9;

    /* renamed from: h, reason: collision with root package name */
    public static final int f11993h = 512;

    /* renamed from: i, reason: collision with root package name */
    public static final int f11994i = 128;

    /* renamed from: a, reason: collision with root package name */
    public final C0189a f11995a;

    /* renamed from: b, reason: collision with root package name */
    public com.badlogic.gdx.utils.a<o> f11996b;

    /* renamed from: c, reason: collision with root package name */
    public final com.badlogic.gdx.graphics.g2d.b f11997c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f11998d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f11999e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f12000f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f12026a;

        /* renamed from: b, reason: collision with root package name */
        public int f12027b;

        /* renamed from: c, reason: collision with root package name */
        public int f12028c;

        /* renamed from: d, reason: collision with root package name */
        public int f12029d;

        /* renamed from: e, reason: collision with root package name */
        public int f12030e;

        /* renamed from: f, reason: collision with root package name */
        public float f12031f;

        /* renamed from: g, reason: collision with root package name */
        public float f12032g;

        /* renamed from: h, reason: collision with root package name */
        public float f12033h;

        /* renamed from: i, reason: collision with root package name */
        public float f12034i;

        /* renamed from: j, reason: collision with root package name */
        public int f12035j;

        /* renamed from: k, reason: collision with root package name */
        public int f12036k;

        /* renamed from: l, reason: collision with root package name */
        public int f12037l;

        /* renamed from: m, reason: collision with root package name */
        public byte[][] f12038m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f12039n;

        /* renamed from: o, reason: collision with root package name */
        public int f12040o = 0;

        public int a(char c11) {
            byte[] bArr;
            byte[][] bArr2 = this.f12038m;
            if (bArr2 == null || (bArr = bArr2[c11 >>> '\t']) == null) {
                return 0;
            }
            return bArr[c11 & 511];
        }

        public void b(int i11, int i12) {
            if (this.f12038m == null) {
                this.f12038m = new byte[128][];
            }
            byte[][] bArr = this.f12038m;
            int i13 = i11 >>> 9;
            byte[] bArr2 = bArr[i13];
            if (bArr2 == null) {
                bArr2 = new byte[512];
                bArr[i13] = bArr2;
            }
            bArr2[i11 & 511] = (byte) i12;
        }

        public String toString() {
            return Character.toString((char) this.f12026a);
        }
    }

    public a() {
        this(g.f81382e.i("com/badlogic/gdx/utils/lsans-15.fnt"), g.f81382e.i("com/badlogic/gdx/utils/lsans-15.png"), false, true);
    }

    public static int d1(CharSequence charSequence, char c11, int i11) {
        int length = charSequence.length();
        while (i11 < length) {
            if (charSequence.charAt(i11) == c11) {
                return i11;
            }
            i11++;
        }
        return length;
    }

    public o C0() {
        return this.f11996b.first();
    }

    public d D(w1.a aVar, CharSequence charSequence, float f11, float f12, int i11, int i12, float f13, int i13, boolean z11, String str) {
        this.f11997c.h();
        d e11 = this.f11997c.e(charSequence, f11, f12, i11, i12, f13, i13, z11, str);
        this.f11997c.i(aVar);
        return e11;
    }

    public void I(w1.a aVar, d dVar, float f11, float f12) {
        this.f11997c.h();
        this.f11997c.f(dVar, f11, f12);
        this.f11997c.i(aVar);
    }

    public o J0(int i11) {
        return this.f11996b.get(i11);
    }

    public com.badlogic.gdx.utils.a<o> Q0() {
        return this.f11996b;
    }

    public float R() {
        return this.f11995a.f12011k;
    }

    public float V0() {
        return this.f11995a.f12015o;
    }

    public com.badlogic.gdx.graphics.g2d.b X() {
        return this.f11997c;
    }

    public float Z() {
        return this.f11995a.f12010j;
    }

    public float a1() {
        return this.f11995a.f12016p;
    }

    public d b(w1.a aVar, CharSequence charSequence, float f11, float f12) {
        this.f11997c.h();
        d b11 = this.f11997c.b(charSequence, f11, f12);
        this.f11997c.i(aVar);
        return b11;
    }

    public float b1() {
        return this.f11995a.f12021u;
    }

    public float c1() {
        return this.f11995a.f12022v;
    }

    @Override // a3.q
    public void dispose() {
        if (!this.f12000f) {
            return;
        }
        int i11 = 0;
        while (true) {
            com.badlogic.gdx.utils.a<o> aVar = this.f11996b;
            if (i11 >= aVar.f13179b) {
                return;
            }
            aVar.get(i11).f().dispose();
            i11++;
        }
    }

    public com.badlogic.gdx.graphics.b e() {
        return this.f11997c.l();
    }

    public boolean e1() {
        return this.f11998d;
    }

    public void f1(C0189a c0189a) {
        for (b[] bVarArr : c0189a.f12019s) {
            if (bVarArr != null) {
                for (b bVar : bVarArr) {
                    if (bVar != null) {
                        c0189a.n(bVar, this.f11996b.get(bVar.f12040o));
                    }
                }
            }
        }
        b bVar2 = c0189a.f12020t;
        if (bVar2 != null) {
            c0189a.n(bVar2, this.f11996b.get(bVar2.f12040o));
        }
    }

    public com.badlogic.gdx.graphics.g2d.b g1() {
        return new com.badlogic.gdx.graphics.g2d.b(this, this.f11999e);
    }

    public void h(com.badlogic.gdx.graphics.b bVar) {
        this.f11997c.l().H(bVar);
    }

    public boolean h1() {
        return this.f12000f;
    }

    public C0189a i0() {
        return this.f11995a;
    }

    public void i1(CharSequence charSequence) {
        int i11;
        C0189a c0189a = this.f11995a;
        int length = charSequence.length();
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            b c11 = c0189a.c(charSequence.charAt(i13));
            if (c11 != null && (i11 = c11.f12037l) > i12) {
                i12 = i11;
            }
        }
        int length2 = charSequence.length();
        for (int i14 = 0; i14 < length2; i14++) {
            b c12 = c0189a.c(charSequence.charAt(i14));
            if (c12 != null) {
                c12.f12035j += (i12 - c12.f12037l) / 2;
                c12.f12037l = i12;
                c12.f12038m = null;
                c12.f12039n = true;
            }
        }
    }

    public void j1(boolean z11) {
        this.f12000f = z11;
    }

    public void k(float f11, float f12, float f13, float f14) {
        this.f11997c.l().F(f11, f12, f13, f14);
    }

    public void k1(boolean z11) {
        this.f11999e = z11;
        this.f11997c.K(z11);
    }

    public boolean l1() {
        return this.f11999e;
    }

    public float n0() {
        return this.f11995a.f12012l;
    }

    public d o(w1.a aVar, CharSequence charSequence, float f11, float f12, float f13, int i11, boolean z11) {
        this.f11997c.h();
        d c11 = this.f11997c.c(charSequence, f11, f12, f13, i11, z11);
        this.f11997c.i(aVar);
        return c11;
    }

    public String toString() {
        String str = this.f11995a.f12001a;
        return str != null ? str : super.toString();
    }

    public float w0() {
        return this.f11995a.f12009i;
    }

    public d z(w1.a aVar, CharSequence charSequence, float f11, float f12, int i11, int i12, float f13, int i13, boolean z11) {
        this.f11997c.h();
        d d11 = this.f11997c.d(charSequence, f11, f12, i11, i12, f13, i13, z11);
        this.f11997c.i(aVar);
        return d11;
    }

    public a(boolean z11) {
        this(g.f81382e.i("com/badlogic/gdx/utils/lsans-15.fnt"), g.f81382e.i("com/badlogic/gdx/utils/lsans-15.png"), z11, true);
    }

    public a(v1.a aVar, o oVar) {
        this(aVar, oVar, false);
    }

    public a(v1.a aVar, o oVar, boolean z11) {
        this(new C0189a(aVar, z11), oVar, true);
    }

    public a(v1.a aVar) {
        this(aVar, false);
    }

    public a(v1.a aVar, boolean z11) {
        this(new C0189a(aVar, z11), (o) null, true);
    }

    public a(v1.a aVar, v1.a aVar2, boolean z11) {
        this(aVar, aVar2, z11, true);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.badlogic.gdx.graphics.g2d.a$a, reason: collision with other inner class name */
    public static class C0189a {

        /* renamed from: a, reason: collision with root package name */
        public String f12001a;

        /* renamed from: b, reason: collision with root package name */
        public String[] f12002b;

        /* renamed from: c, reason: collision with root package name */
        public v1.a f12003c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f12004d;

        /* renamed from: e, reason: collision with root package name */
        public float f12005e;

        /* renamed from: f, reason: collision with root package name */
        public float f12006f;

        /* renamed from: g, reason: collision with root package name */
        public float f12007g;

        /* renamed from: h, reason: collision with root package name */
        public float f12008h;

        /* renamed from: i, reason: collision with root package name */
        public float f12009i;

        /* renamed from: j, reason: collision with root package name */
        public float f12010j;

        /* renamed from: k, reason: collision with root package name */
        public float f12011k;

        /* renamed from: l, reason: collision with root package name */
        public float f12012l;

        /* renamed from: m, reason: collision with root package name */
        public float f12013m;

        /* renamed from: n, reason: collision with root package name */
        public float f12014n;

        /* renamed from: o, reason: collision with root package name */
        public float f12015o;

        /* renamed from: p, reason: collision with root package name */
        public float f12016p;

        /* renamed from: q, reason: collision with root package name */
        public boolean f12017q;

        /* renamed from: r, reason: collision with root package name */
        public float f12018r;

        /* renamed from: s, reason: collision with root package name */
        public final b[][] f12019s;

        /* renamed from: t, reason: collision with root package name */
        public b f12020t;

        /* renamed from: u, reason: collision with root package name */
        public float f12021u;

        /* renamed from: v, reason: collision with root package name */
        public float f12022v;

        /* renamed from: w, reason: collision with root package name */
        public char[] f12023w;

        /* renamed from: x, reason: collision with root package name */
        public char[] f12024x;

        /* renamed from: y, reason: collision with root package name */
        public char[] f12025y;

        public C0189a() {
            this.f12010j = 1.0f;
            this.f12014n = 1.0f;
            this.f12015o = 1.0f;
            this.f12016p = 1.0f;
            this.f12019s = new b[128][];
            this.f12022v = 1.0f;
            this.f12024x = new char[]{'x', 'e', 'a', 'o', 'n', io.ktor.util.date.b.f61997c, 'r', 'c', l50.b.f69934p, io.ktor.util.date.b.f61998d, 'v', 'w', io.ktor.util.date.b.f62003i};
            this.f12025y = new char[]{io.ktor.util.date.b.f62001g, 'N', 'B', 'D', 'C', 'E', 'F', 'K', 'A', 'G', 'H', 'I', 'J', 'L', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', io.ktor.util.date.b.f62002h, 'Z'};
        }

        public b a() {
            for (b[] bVarArr : this.f12019s) {
                if (bVarArr != null) {
                    for (b bVar : bVarArr) {
                        if (bVar != null && bVar.f12030e != 0 && bVar.f12029d != 0) {
                            return bVar;
                        }
                    }
                }
            }
            throw new GdxRuntimeException("No glyphs found.");
        }

        public v1.a b() {
            return this.f12003c;
        }

        public b c(char c11) {
            b[] bVarArr = this.f12019s[c11 / 512];
            if (bVarArr != null) {
                return bVarArr[c11 & 511];
            }
            return null;
        }

        public void d(d.a aVar, CharSequence charSequence, int i11, int i12, b bVar) {
            b c11;
            int i13 = i12 - i11;
            if (i13 == 0) {
                return;
            }
            boolean z11 = this.f12017q;
            float f11 = this.f12015o;
            com.badlogic.gdx.utils.a<b> aVar2 = aVar.f12064a;
            r rVar = aVar.f12065b;
            aVar2.o(i13);
            aVar.f12065b.k(i13 + 1);
            do {
                int i14 = i11 + 1;
                char charAt = charSequence.charAt(i11);
                if (charAt == '\r' || ((c11 = c(charAt)) == null && (c11 = this.f12020t) == null)) {
                    i11 = i14;
                } else {
                    aVar2.a(c11);
                    rVar.a(bVar == null ? c11.f12039n ? 0.0f : ((-c11.f12035j) * f11) - this.f12008h : (bVar.f12037l + bVar.a(charAt)) * f11);
                    i11 = (z11 && charAt == '[' && i14 < i12 && charSequence.charAt(i14) == '[') ? i11 + 2 : i14;
                    bVar = c11;
                }
            } while (i11 < i12);
            if (bVar != null) {
                rVar.a(bVar.f12039n ? bVar.f12037l * f11 : ((bVar.f12029d + bVar.f12035j) * f11) - this.f12006f);
            }
        }

        public String e(int i11) {
            return this.f12002b[i11];
        }

        public String[] f() {
            return this.f12002b;
        }

        public int g(com.badlogic.gdx.utils.a<b> aVar, int i11) {
            int i12 = i11 - 1;
            b[] bVarArr = aVar.f13178a;
            char c11 = (char) bVarArr[i12].f12026a;
            if (j(c11)) {
                return i12;
            }
            if (i(c11)) {
                i12 = i11 - 2;
            }
            while (i12 > 0) {
                char c12 = (char) bVarArr[i12].f12026a;
                if (j(c12) || i(c12)) {
                    return i12 + 1;
                }
                i12--;
            }
            return 0;
        }

        public boolean h(char c11) {
            return (this.f12020t == null && c(c11) == null) ? false : true;
        }

        public boolean i(char c11) {
            char[] cArr = this.f12023w;
            if (cArr == null) {
                return false;
            }
            for (char c12 : cArr) {
                if (c11 == c12) {
                    return true;
                }
            }
            return false;
        }

        public boolean j(char c11) {
            return c11 == '\t' || c11 == '\n' || c11 == '\r' || c11 == ' ';
        }

        /* JADX WARN: Removed duplicated region for block: B:108:0x0338 A[Catch: all -> 0x02b2, Exception -> 0x02b5, TryCatch #0 {all -> 0x02b2, blocks: (B:63:0x033c, B:65:0x034b, B:67:0x0365, B:68:0x036d, B:70:0x03b5, B:71:0x03ce, B:73:0x03e1, B:74:0x03e4, B:86:0x03ea, B:76:0x03f4, B:78:0x03f8, B:80:0x03fc, B:89:0x03c0, B:91:0x036a, B:153:0x02bf, B:155:0x0291, B:157:0x0297, B:159:0x029d, B:161:0x02a3, B:166:0x02a8, B:165:0x02ba, B:207:0x0446, B:208:0x045e, B:174:0x02d0, B:176:0x02df, B:178:0x02e7, B:181:0x02c9, B:101:0x02fb, B:106:0x0326, B:108:0x0338, B:193:0x040a, B:194:0x0413, B:195:0x0414, B:196:0x041d, B:197:0x041e, B:198:0x0427, B:199:0x0428, B:200:0x0431, B:201:0x0432, B:202:0x043b, B:203:0x043c, B:204:0x0445), top: B:4:0x001c }] */
        /* JADX WARN: Removed duplicated region for block: B:111:0x0321 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:123:0x0216 A[Catch: all -> 0x00ce, Exception -> 0x00d3, TryCatch #7 {Exception -> 0x00d3, all -> 0x00ce, blocks: (B:5:0x001c, B:8:0x0022, B:10:0x0043, B:12:0x0075, B:14:0x0080, B:16:0x008a, B:18:0x00a3, B:20:0x00b3, B:22:0x00b7, B:25:0x00bf, B:26:0x00d9, B:28:0x00e0, B:30:0x00e6, B:32:0x00f6, B:34:0x00fa, B:38:0x0101, B:39:0x0117, B:43:0x0119, B:44:0x012f, B:45:0x0130, B:47:0x0140, B:49:0x0160, B:50:0x0167, B:52:0x0168, B:53:0x016f, B:55:0x0170, B:56:0x0173, B:59:0x0181, B:61:0x018a, B:95:0x0190, B:96:0x0197, B:118:0x01a8, B:120:0x01ae, B:121:0x0210, B:123:0x0216, B:125:0x0225, B:126:0x0229, B:127:0x0230, B:129:0x0234, B:130:0x0244, B:132:0x0251, B:134:0x025a, B:138:0x025f, B:139:0x0263, B:141:0x0272, B:143:0x027b, B:147:0x0280, B:149:0x0286, B:98:0x019e), top: B:4:0x001c }] */
        /* JADX WARN: Removed duplicated region for block: B:129:0x0234 A[Catch: all -> 0x00ce, Exception -> 0x00d3, TryCatch #7 {Exception -> 0x00d3, all -> 0x00ce, blocks: (B:5:0x001c, B:8:0x0022, B:10:0x0043, B:12:0x0075, B:14:0x0080, B:16:0x008a, B:18:0x00a3, B:20:0x00b3, B:22:0x00b7, B:25:0x00bf, B:26:0x00d9, B:28:0x00e0, B:30:0x00e6, B:32:0x00f6, B:34:0x00fa, B:38:0x0101, B:39:0x0117, B:43:0x0119, B:44:0x012f, B:45:0x0130, B:47:0x0140, B:49:0x0160, B:50:0x0167, B:52:0x0168, B:53:0x016f, B:55:0x0170, B:56:0x0173, B:59:0x0181, B:61:0x018a, B:95:0x0190, B:96:0x0197, B:118:0x01a8, B:120:0x01ae, B:121:0x0210, B:123:0x0216, B:125:0x0225, B:126:0x0229, B:127:0x0230, B:129:0x0234, B:130:0x0244, B:132:0x0251, B:134:0x025a, B:138:0x025f, B:139:0x0263, B:141:0x0272, B:143:0x027b, B:147:0x0280, B:149:0x0286, B:98:0x019e), top: B:4:0x001c }] */
        /* JADX WARN: Removed duplicated region for block: B:132:0x0251 A[Catch: all -> 0x00ce, Exception -> 0x00d3, TryCatch #7 {Exception -> 0x00d3, all -> 0x00ce, blocks: (B:5:0x001c, B:8:0x0022, B:10:0x0043, B:12:0x0075, B:14:0x0080, B:16:0x008a, B:18:0x00a3, B:20:0x00b3, B:22:0x00b7, B:25:0x00bf, B:26:0x00d9, B:28:0x00e0, B:30:0x00e6, B:32:0x00f6, B:34:0x00fa, B:38:0x0101, B:39:0x0117, B:43:0x0119, B:44:0x012f, B:45:0x0130, B:47:0x0140, B:49:0x0160, B:50:0x0167, B:52:0x0168, B:53:0x016f, B:55:0x0170, B:56:0x0173, B:59:0x0181, B:61:0x018a, B:95:0x0190, B:96:0x0197, B:118:0x01a8, B:120:0x01ae, B:121:0x0210, B:123:0x0216, B:125:0x0225, B:126:0x0229, B:127:0x0230, B:129:0x0234, B:130:0x0244, B:132:0x0251, B:134:0x025a, B:138:0x025f, B:139:0x0263, B:141:0x0272, B:143:0x027b, B:147:0x0280, B:149:0x0286, B:98:0x019e), top: B:4:0x001c }] */
        /* JADX WARN: Removed duplicated region for block: B:138:0x025f A[Catch: all -> 0x00ce, Exception -> 0x00d3, TryCatch #7 {Exception -> 0x00d3, all -> 0x00ce, blocks: (B:5:0x001c, B:8:0x0022, B:10:0x0043, B:12:0x0075, B:14:0x0080, B:16:0x008a, B:18:0x00a3, B:20:0x00b3, B:22:0x00b7, B:25:0x00bf, B:26:0x00d9, B:28:0x00e0, B:30:0x00e6, B:32:0x00f6, B:34:0x00fa, B:38:0x0101, B:39:0x0117, B:43:0x0119, B:44:0x012f, B:45:0x0130, B:47:0x0140, B:49:0x0160, B:50:0x0167, B:52:0x0168, B:53:0x016f, B:55:0x0170, B:56:0x0173, B:59:0x0181, B:61:0x018a, B:95:0x0190, B:96:0x0197, B:118:0x01a8, B:120:0x01ae, B:121:0x0210, B:123:0x0216, B:125:0x0225, B:126:0x0229, B:127:0x0230, B:129:0x0234, B:130:0x0244, B:132:0x0251, B:134:0x025a, B:138:0x025f, B:139:0x0263, B:141:0x0272, B:143:0x027b, B:147:0x0280, B:149:0x0286, B:98:0x019e), top: B:4:0x001c }] */
        /* JADX WARN: Removed duplicated region for block: B:141:0x0272 A[Catch: all -> 0x00ce, Exception -> 0x00d3, TryCatch #7 {Exception -> 0x00d3, all -> 0x00ce, blocks: (B:5:0x001c, B:8:0x0022, B:10:0x0043, B:12:0x0075, B:14:0x0080, B:16:0x008a, B:18:0x00a3, B:20:0x00b3, B:22:0x00b7, B:25:0x00bf, B:26:0x00d9, B:28:0x00e0, B:30:0x00e6, B:32:0x00f6, B:34:0x00fa, B:38:0x0101, B:39:0x0117, B:43:0x0119, B:44:0x012f, B:45:0x0130, B:47:0x0140, B:49:0x0160, B:50:0x0167, B:52:0x0168, B:53:0x016f, B:55:0x0170, B:56:0x0173, B:59:0x0181, B:61:0x018a, B:95:0x0190, B:96:0x0197, B:118:0x01a8, B:120:0x01ae, B:121:0x0210, B:123:0x0216, B:125:0x0225, B:126:0x0229, B:127:0x0230, B:129:0x0234, B:130:0x0244, B:132:0x0251, B:134:0x025a, B:138:0x025f, B:139:0x0263, B:141:0x0272, B:143:0x027b, B:147:0x0280, B:149:0x0286, B:98:0x019e), top: B:4:0x001c }] */
        /* JADX WARN: Removed duplicated region for block: B:147:0x0280 A[Catch: all -> 0x00ce, Exception -> 0x00d3, TryCatch #7 {Exception -> 0x00d3, all -> 0x00ce, blocks: (B:5:0x001c, B:8:0x0022, B:10:0x0043, B:12:0x0075, B:14:0x0080, B:16:0x008a, B:18:0x00a3, B:20:0x00b3, B:22:0x00b7, B:25:0x00bf, B:26:0x00d9, B:28:0x00e0, B:30:0x00e6, B:32:0x00f6, B:34:0x00fa, B:38:0x0101, B:39:0x0117, B:43:0x0119, B:44:0x012f, B:45:0x0130, B:47:0x0140, B:49:0x0160, B:50:0x0167, B:52:0x0168, B:53:0x016f, B:55:0x0170, B:56:0x0173, B:59:0x0181, B:61:0x018a, B:95:0x0190, B:96:0x0197, B:118:0x01a8, B:120:0x01ae, B:121:0x0210, B:123:0x0216, B:125:0x0225, B:126:0x0229, B:127:0x0230, B:129:0x0234, B:130:0x0244, B:132:0x0251, B:134:0x025a, B:138:0x025f, B:139:0x0263, B:141:0x0272, B:143:0x027b, B:147:0x0280, B:149:0x0286, B:98:0x019e), top: B:4:0x001c }] */
        /* JADX WARN: Removed duplicated region for block: B:176:0x02df A[Catch: all -> 0x02b2, Exception -> 0x02b5, TryCatch #0 {all -> 0x02b2, blocks: (B:63:0x033c, B:65:0x034b, B:67:0x0365, B:68:0x036d, B:70:0x03b5, B:71:0x03ce, B:73:0x03e1, B:74:0x03e4, B:86:0x03ea, B:76:0x03f4, B:78:0x03f8, B:80:0x03fc, B:89:0x03c0, B:91:0x036a, B:153:0x02bf, B:155:0x0291, B:157:0x0297, B:159:0x029d, B:161:0x02a3, B:166:0x02a8, B:165:0x02ba, B:207:0x0446, B:208:0x045e, B:174:0x02d0, B:176:0x02df, B:178:0x02e7, B:181:0x02c9, B:101:0x02fb, B:106:0x0326, B:108:0x0338, B:193:0x040a, B:194:0x0413, B:195:0x0414, B:196:0x041d, B:197:0x041e, B:198:0x0427, B:199:0x0428, B:200:0x0431, B:201:0x0432, B:202:0x043b, B:203:0x043c, B:204:0x0445), top: B:4:0x001c }] */
        /* JADX WARN: Removed duplicated region for block: B:178:0x02e7 A[Catch: all -> 0x02b2, Exception -> 0x02b5, TRY_LEAVE, TryCatch #0 {all -> 0x02b2, blocks: (B:63:0x033c, B:65:0x034b, B:67:0x0365, B:68:0x036d, B:70:0x03b5, B:71:0x03ce, B:73:0x03e1, B:74:0x03e4, B:86:0x03ea, B:76:0x03f4, B:78:0x03f8, B:80:0x03fc, B:89:0x03c0, B:91:0x036a, B:153:0x02bf, B:155:0x0291, B:157:0x0297, B:159:0x029d, B:161:0x02a3, B:166:0x02a8, B:165:0x02ba, B:207:0x0446, B:208:0x045e, B:174:0x02d0, B:176:0x02df, B:178:0x02e7, B:181:0x02c9, B:101:0x02fb, B:106:0x0326, B:108:0x0338, B:193:0x040a, B:194:0x0413, B:195:0x0414, B:196:0x041d, B:197:0x041e, B:198:0x0427, B:199:0x0428, B:200:0x0431, B:201:0x0432, B:202:0x043b, B:203:0x043c, B:204:0x0445), top: B:4:0x001c }] */
        /* JADX WARN: Removed duplicated region for block: B:181:0x02c9 A[Catch: all -> 0x02b2, Exception -> 0x02b5, TryCatch #0 {all -> 0x02b2, blocks: (B:63:0x033c, B:65:0x034b, B:67:0x0365, B:68:0x036d, B:70:0x03b5, B:71:0x03ce, B:73:0x03e1, B:74:0x03e4, B:86:0x03ea, B:76:0x03f4, B:78:0x03f8, B:80:0x03fc, B:89:0x03c0, B:91:0x036a, B:153:0x02bf, B:155:0x0291, B:157:0x0297, B:159:0x029d, B:161:0x02a3, B:166:0x02a8, B:165:0x02ba, B:207:0x0446, B:208:0x045e, B:174:0x02d0, B:176:0x02df, B:178:0x02e7, B:181:0x02c9, B:101:0x02fb, B:106:0x0326, B:108:0x0338, B:193:0x040a, B:194:0x0413, B:195:0x0414, B:196:0x041d, B:197:0x041e, B:198:0x0427, B:199:0x0428, B:200:0x0431, B:201:0x0432, B:202:0x043b, B:203:0x043c, B:204:0x0445), top: B:4:0x001c }] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00e0 A[Catch: all -> 0x00ce, Exception -> 0x00d3, TryCatch #7 {Exception -> 0x00d3, all -> 0x00ce, blocks: (B:5:0x001c, B:8:0x0022, B:10:0x0043, B:12:0x0075, B:14:0x0080, B:16:0x008a, B:18:0x00a3, B:20:0x00b3, B:22:0x00b7, B:25:0x00bf, B:26:0x00d9, B:28:0x00e0, B:30:0x00e6, B:32:0x00f6, B:34:0x00fa, B:38:0x0101, B:39:0x0117, B:43:0x0119, B:44:0x012f, B:45:0x0130, B:47:0x0140, B:49:0x0160, B:50:0x0167, B:52:0x0168, B:53:0x016f, B:55:0x0170, B:56:0x0173, B:59:0x0181, B:61:0x018a, B:95:0x0190, B:96:0x0197, B:118:0x01a8, B:120:0x01ae, B:121:0x0210, B:123:0x0216, B:125:0x0225, B:126:0x0229, B:127:0x0230, B:129:0x0234, B:130:0x0244, B:132:0x0251, B:134:0x025a, B:138:0x025f, B:139:0x0263, B:141:0x0272, B:143:0x027b, B:147:0x0280, B:149:0x0286, B:98:0x019e), top: B:4:0x001c }] */
        /* JADX WARN: Removed duplicated region for block: B:65:0x034b A[Catch: all -> 0x02b2, Exception -> 0x02b5, TryCatch #0 {all -> 0x02b2, blocks: (B:63:0x033c, B:65:0x034b, B:67:0x0365, B:68:0x036d, B:70:0x03b5, B:71:0x03ce, B:73:0x03e1, B:74:0x03e4, B:86:0x03ea, B:76:0x03f4, B:78:0x03f8, B:80:0x03fc, B:89:0x03c0, B:91:0x036a, B:153:0x02bf, B:155:0x0291, B:157:0x0297, B:159:0x029d, B:161:0x02a3, B:166:0x02a8, B:165:0x02ba, B:207:0x0446, B:208:0x045e, B:174:0x02d0, B:176:0x02df, B:178:0x02e7, B:181:0x02c9, B:101:0x02fb, B:106:0x0326, B:108:0x0338, B:193:0x040a, B:194:0x0413, B:195:0x0414, B:196:0x041d, B:197:0x041e, B:198:0x0427, B:199:0x0428, B:200:0x0431, B:201:0x0432, B:202:0x043b, B:203:0x043c, B:204:0x0445), top: B:4:0x001c }] */
        /* JADX WARN: Removed duplicated region for block: B:93:0x0346 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void k(v1.a r22, boolean r23) {
            /*
                Method dump skipped, instructions count: 1131
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.graphics.g2d.a.C0189a.k(v1.a, boolean):void");
        }

        public void l(float f11) {
            q(this.f12015o + f11, this.f12016p + f11);
        }

        public void m(int i11, b bVar) {
            b[][] bVarArr = this.f12019s;
            int i12 = i11 / 512;
            b[] bVarArr2 = bVarArr[i12];
            if (bVarArr2 == null) {
                bVarArr2 = new b[512];
                bVarArr[i12] = bVarArr2;
            }
            bVarArr2[i11 & 511] = bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00a8  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00b1  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void n(com.badlogic.gdx.graphics.g2d.a.b r18, w1.o r19) {
            /*
                Method dump skipped, instructions count: 186
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.graphics.g2d.a.C0189a.n(com.badlogic.gdx.graphics.g2d.a$b, w1.o):void");
        }

        public void o(float f11) {
            float f12 = f11 * this.f12016p;
            this.f12009i = f12;
            if (!this.f12004d) {
                f12 = -f12;
            }
            this.f12013m = f12;
        }

        public void p(float f11) {
            q(f11, f11);
        }

        public void q(float f11, float f12) {
            if (f11 == 0.0f) {
                throw new IllegalArgumentException("scaleX cannot be 0.");
            }
            if (f12 == 0.0f) {
                throw new IllegalArgumentException("scaleY cannot be 0.");
            }
            float f13 = f11 / this.f12015o;
            float f14 = f12 / this.f12016p;
            this.f12009i *= f14;
            this.f12021u *= f13;
            this.f12022v *= f14;
            this.f12010j *= f14;
            this.f12011k *= f14;
            this.f12012l *= f14;
            this.f12013m *= f14;
            this.f12008h *= f13;
            this.f12006f *= f13;
            this.f12005e *= f14;
            this.f12007g *= f14;
            this.f12015o = f11;
            this.f12016p = f12;
        }

        public String toString() {
            String str = this.f12001a;
            return str != null ? str : super.toString();
        }

        public C0189a(v1.a aVar, boolean z11) {
            this.f12010j = 1.0f;
            this.f12014n = 1.0f;
            this.f12015o = 1.0f;
            this.f12016p = 1.0f;
            this.f12019s = new b[128][];
            this.f12022v = 1.0f;
            this.f12024x = new char[]{'x', 'e', 'a', 'o', 'n', io.ktor.util.date.b.f61997c, 'r', 'c', l50.b.f69934p, io.ktor.util.date.b.f61998d, 'v', 'w', io.ktor.util.date.b.f62003i};
            this.f12025y = new char[]{io.ktor.util.date.b.f62001g, 'N', 'B', 'D', 'C', 'E', 'F', 'K', 'A', 'G', 'H', 'I', 'J', 'L', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', io.ktor.util.date.b.f62002h, 'Z'};
            this.f12003c = aVar;
            this.f12004d = z11;
            k(aVar, z11);
        }
    }

    public a(v1.a aVar, v1.a aVar2, boolean z11, boolean z12) {
        this(new C0189a(aVar, z11), new o(new Texture(aVar2, false)), z12);
        this.f12000f = true;
    }

    public a(C0189a c0189a, o oVar, boolean z11) {
        this(c0189a, (com.badlogic.gdx.utils.a<o>) (oVar != null ? com.badlogic.gdx.utils.a.T(oVar) : null), z11);
    }

    public a(C0189a c0189a, com.badlogic.gdx.utils.a<o> aVar, boolean z11) {
        v1.a e11;
        this.f11998d = c0189a.f12004d;
        this.f11995a = c0189a;
        this.f11999e = z11;
        if (aVar != null && aVar.f13179b != 0) {
            this.f11996b = aVar;
            this.f12000f = false;
        } else {
            String[] strArr = c0189a.f12002b;
            if (strArr != null) {
                int length = strArr.length;
                this.f11996b = new com.badlogic.gdx.utils.a<>(length);
                for (int i11 = 0; i11 < length; i11++) {
                    v1.a aVar2 = c0189a.f12003c;
                    if (aVar2 == null) {
                        e11 = g.f81382e.a(c0189a.f12002b[i11]);
                    } else {
                        e11 = g.f81382e.e(c0189a.f12002b[i11], aVar2.R());
                    }
                    this.f11996b.a(new o(new Texture(e11, false)));
                }
                this.f12000f = true;
            } else {
                throw new IllegalArgumentException("If no regions are specified, the font data must have an images path.");
            }
        }
        this.f11997c = g1();
        f1(c0189a);
    }
}
