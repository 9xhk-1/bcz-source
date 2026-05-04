package com.badlogic.gdx.graphics.g2d;

import a3.j0;
import a3.l0;
import a3.r;
import a3.v;
import com.badlogic.gdx.graphics.g2d.a;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class d implements j0.a {

    /* renamed from: f, reason: collision with root package name */
    public static final j0<a> f12056f = l0.d(a.class);

    /* renamed from: g, reason: collision with root package name */
    public static final v f12057g = new v(4);

    /* renamed from: h, reason: collision with root package name */
    public static final float f12058h = 1.0E-4f;

    /* renamed from: a, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<a> f12059a = new com.badlogic.gdx.utils.a<>(1);

    /* renamed from: b, reason: collision with root package name */
    public final v f12060b = new v(2);

    /* renamed from: c, reason: collision with root package name */
    public int f12061c;

    /* renamed from: d, reason: collision with root package name */
    public float f12062d;

    /* renamed from: e, reason: collision with root package name */
    public float f12063e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements j0.a {

        /* renamed from: a, reason: collision with root package name */
        public com.badlogic.gdx.utils.a<a.b> f12064a = new com.badlogic.gdx.utils.a<>();

        /* renamed from: b, reason: collision with root package name */
        public r f12065b = new r();

        /* renamed from: c, reason: collision with root package name */
        public float f12066c;

        /* renamed from: d, reason: collision with root package name */
        public float f12067d;

        /* renamed from: e, reason: collision with root package name */
        public float f12068e;

        public void a(a aVar) {
            this.f12064a.g(aVar.f12064a);
            if (this.f12065b.x()) {
                r rVar = this.f12065b;
                rVar.f1626b--;
            }
            this.f12065b.e(aVar.f12065b);
        }

        @Override // a3.j0.a
        public void reset() {
            this.f12064a.clear();
            this.f12065b.i();
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(this.f12064a.f13179b + 32);
            com.badlogic.gdx.utils.a<a.b> aVar = this.f12064a;
            int i11 = aVar.f13179b;
            for (int i12 = 0; i12 < i11; i12++) {
                sb2.append((char) aVar.get(i12).f12026a);
            }
            sb2.append(j2.O);
            sb2.append(this.f12066c);
            sb2.append(j2.O);
            sb2.append(this.f12067d);
            sb2.append(j2.O);
            sb2.append(this.f12068e);
            return sb2.toString();
        }
    }

    public d() {
    }

    public final void a(float f11, int i11) {
        if ((i11 & 8) == 0) {
            boolean z11 = (i11 & 1) != 0;
            com.badlogic.gdx.utils.a<a> aVar = this.f12059a;
            a[] aVarArr = aVar.f13178a;
            int i12 = aVar.f13179b;
            for (int i13 = 0; i13 < i12; i13++) {
                a aVar2 = aVarArr[i13];
                float f12 = aVar2.f12066c;
                float f13 = f11 - aVar2.f12068e;
                if (z11) {
                    f13 *= 0.5f;
                }
                aVar2.f12066c = f12 + f13;
            }
        }
    }

    public final void b(a.C0189a c0189a) {
        com.badlogic.gdx.utils.a<a> aVar = this.f12059a;
        a[] aVarArr = aVar.f13178a;
        int i11 = aVar.f13179b;
        float f11 = 0.0f;
        for (int i12 = 0; i12 < i11; i12++) {
            a aVar2 = aVarArr[i12];
            float[] fArr = aVar2.f12065b.f1625a;
            float f12 = aVar2.f12066c + fArr[0];
            com.badlogic.gdx.utils.a<a.b> aVar3 = aVar2.f12064a;
            a.b[] bVarArr = aVar3.f13178a;
            int i13 = aVar3.f13179b;
            float f13 = 0.0f;
            int i14 = 0;
            while (i14 < i13) {
                f13 = Math.max(f13, c(bVarArr[i14], c0189a) + f12);
                i14++;
                f12 += fArr[i14];
            }
            float max = Math.max(f12, f13);
            float f14 = aVar2.f12066c;
            float f15 = max - f14;
            aVar2.f12068e = f15;
            f11 = Math.max(f11, f14 + f15);
        }
        this.f12062d = f11;
    }

    public final float c(a.b bVar, a.C0189a c0189a) {
        int i11;
        if (bVar.f12039n) {
            i11 = bVar.f12037l;
        } else {
            i11 = bVar.f12035j + bVar.f12029d;
        }
        return (i11 * c0189a.f12015o) - c0189a.f12006f;
    }

    public final float d(com.badlogic.gdx.utils.a<a.b> aVar, a.C0189a c0189a) {
        return (aVar.first().f12039n ? 0.0f : (-r2.f12035j) * c0189a.f12015o) - c0189a.f12008h;
    }

    public final int e(CharSequence charSequence, int i11, int i12) {
        if (i11 == i12) {
            return -1;
        }
        char charAt = charSequence.charAt(i11);
        int i13 = 0;
        if (charAt != '#') {
            if (charAt == '[') {
                return -2;
            }
            if (charAt == ']') {
                v vVar = f12057g;
                if (vVar.f1640b > 1) {
                    vVar.y();
                }
                return 0;
            }
            for (int i14 = i11 + 1; i14 < i12; i14++) {
                if (charSequence.charAt(i14) == ']') {
                    com.badlogic.gdx.graphics.b a11 = com.badlogic.gdx.graphics.c.a(charSequence.subSequence(i11, i14).toString());
                    if (a11 == null) {
                        return -1;
                    }
                    f12057g.a(a11.P());
                    return i14 - i11;
                }
            }
            return -1;
        }
        int i15 = i11 + 1;
        while (true) {
            if (i15 >= i12) {
                break;
            }
            char charAt2 = charSequence.charAt(i15);
            if (charAt2 != ']') {
                int i16 = (i13 << 4) + charAt2;
                if (charAt2 >= '0' && charAt2 <= '9') {
                    i13 = i16 - 48;
                } else if (charAt2 >= 'A' && charAt2 <= 'F') {
                    i13 = i16 - 55;
                } else {
                    if (charAt2 < 'a' || charAt2 > 'f') {
                        break;
                    }
                    i13 = i16 - 87;
                }
                i15++;
            } else if (i15 >= i11 + 2 && i15 <= i11 + 9) {
                int i17 = i15 - i11;
                if (i17 < 8) {
                    i13 = (i13 << ((9 - i17) << 2)) | 255;
                }
                f12057g.a(Integer.reverseBytes(i13));
                return i17;
            }
        }
        return -1;
    }

    public final void f(a.C0189a c0189a, a aVar) {
        a.b peek = aVar.f12064a.peek();
        if (peek.f12039n) {
            return;
        }
        aVar.f12065b.f1625a[r4.f1626b - 1] = c(peek, c0189a);
    }

    public void g(com.badlogic.gdx.graphics.g2d.a aVar, CharSequence charSequence) {
        h(aVar, charSequence, 0, charSequence.length(), aVar.e(), 0.0f, 8, false, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(com.badlogic.gdx.graphics.g2d.a r23, java.lang.CharSequence r24, int r25, int r26, com.badlogic.gdx.graphics.b r27, float r28, int r29, boolean r30, @a3.d0 java.lang.String r31) {
        /*
            Method dump skipped, instructions count: 535
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.graphics.g2d.d.h(com.badlogic.gdx.graphics.g2d.a, java.lang.CharSequence, int, int, com.badlogic.gdx.graphics.b, float, int, boolean, java.lang.String):void");
    }

    public void i(com.badlogic.gdx.graphics.g2d.a aVar, CharSequence charSequence, com.badlogic.gdx.graphics.b bVar, float f11, int i11, boolean z11) {
        h(aVar, charSequence, 0, charSequence.length(), bVar, f11, i11, z11, null);
    }

    public final void j(a.C0189a c0189a, a aVar, float f11, String str) {
        int i11 = aVar.f12064a.f13179b;
        a h11 = f12056f.h();
        c0189a.d(h11, str, 0, str.length(), null);
        float f12 = 0.0f;
        if (h11.f12065b.f1626b > 0) {
            f(c0189a, h11);
            r rVar = h11.f12065b;
            float[] fArr = rVar.f1625a;
            int i12 = rVar.f1626b;
            for (int i13 = 1; i13 < i12; i13++) {
                f12 += fArr[i13];
            }
        }
        float f13 = f11 - f12;
        float f14 = aVar.f12066c;
        float[] fArr2 = aVar.f12065b.f1625a;
        int i14 = 0;
        while (i14 < aVar.f12065b.f1626b) {
            f14 += fArr2[i14];
            if (f14 > f13) {
                break;
            } else {
                i14++;
            }
        }
        if (i14 > 1) {
            aVar.f12064a.S(i14 - 1);
            aVar.f12065b.P(i14);
            f(c0189a, aVar);
            r rVar2 = h11.f12065b;
            int i15 = rVar2.f1626b;
            if (i15 > 0) {
                aVar.f12065b.f(rVar2, 1, i15 - 1);
            }
        } else {
            aVar.f12064a.clear();
            aVar.f12065b.i();
            aVar.f12065b.e(h11.f12065b);
        }
        int i16 = i11 - aVar.f12064a.f13179b;
        if (i16 > 0) {
            this.f12061c -= i16;
            if (c0189a.f12017q) {
                while (true) {
                    v vVar = this.f12060b;
                    int i17 = vVar.f1640b;
                    if (i17 <= 2 || vVar.m(i17 - 2) < this.f12061c) {
                        break;
                    }
                    this.f12060b.f1640b -= 2;
                }
            }
        }
        aVar.f12064a.g(h11.f12064a);
        this.f12061c += str.length();
        f12056f.d(h11);
    }

    public final a k(a.C0189a c0189a, a aVar, int i11) {
        a aVar2;
        int i12;
        com.badlogic.gdx.utils.a<a.b> aVar3 = aVar.f12064a;
        int i13 = aVar3.f13179b;
        r rVar = aVar.f12065b;
        int i14 = i11;
        while (i14 > 0 && c0189a.j((char) aVar3.get(i14 - 1).f12026a)) {
            i14--;
        }
        while (i11 < i13 && c0189a.j((char) aVar3.get(i11).f12026a)) {
            i11++;
        }
        if (i11 < i13) {
            aVar2 = f12056f.h();
            com.badlogic.gdx.utils.a<a.b> aVar4 = aVar2.f12064a;
            aVar4.h(aVar3, 0, i14);
            aVar3.B(0, i11 - 1);
            aVar.f12064a = aVar4;
            aVar2.f12064a = aVar3;
            r rVar2 = aVar2.f12065b;
            rVar2.f(rVar, 0, i14 + 1);
            rVar.D(1, i11);
            rVar.f1625a[0] = d(aVar3, c0189a);
            aVar.f12065b = rVar2;
            aVar2.f12065b = rVar;
            int i15 = aVar.f12064a.f13179b;
            int i16 = aVar2.f12064a.f13179b;
            int i17 = (i13 - i15) - i16;
            int i18 = this.f12061c - i17;
            this.f12061c = i18;
            if (c0189a.f12017q && i17 > 0) {
                int i19 = i18 - i16;
                for (int i21 = this.f12060b.f1640b - 2; i21 >= 2; i21 -= 2) {
                    int m11 = this.f12060b.m(i21);
                    if (m11 <= i19) {
                        break;
                    }
                    this.f12060b.G(i21, m11 - i17);
                }
            }
        } else {
            aVar3.S(i14);
            rVar.P(i14 + 1);
            int i22 = i11 - i14;
            if (i22 > 0) {
                this.f12061c -= i22;
                if (c0189a.f12017q) {
                    v vVar = this.f12060b;
                    if (vVar.m(vVar.f1640b - 2) > this.f12061c) {
                        int x11 = this.f12060b.x();
                        while (true) {
                            v vVar2 = this.f12060b;
                            int m12 = vVar2.m(vVar2.f1640b - 2);
                            i12 = this.f12061c;
                            if (m12 <= i12) {
                                break;
                            }
                            this.f12060b.f1640b -= 2;
                        }
                        v vVar3 = this.f12060b;
                        vVar3.G(vVar3.f1640b - 2, i12);
                        v vVar4 = this.f12060b;
                        vVar4.G(vVar4.f1640b - 1, x11);
                    }
                }
            }
            aVar2 = null;
        }
        if (i14 != 0) {
            f(c0189a, aVar);
            return aVar2;
        }
        f12056f.d(aVar);
        this.f12059a.pop();
        return aVar2;
    }

    @Override // a3.j0.a
    public void reset() {
        f12056f.e(this.f12059a);
        this.f12059a.clear();
        this.f12060b.i();
        this.f12061c = 0;
        this.f12062d = 0.0f;
        this.f12063e = 0.0f;
    }

    public String toString() {
        if (this.f12059a.f13179b == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(this.f12062d);
        sb2.append('x');
        sb2.append(this.f12063e);
        sb2.append('\n');
        int i11 = this.f12059a.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            sb2.append(this.f12059a.get(i12).toString());
            sb2.append('\n');
        }
        sb2.setLength(sb2.length() - 1);
        return sb2.toString();
    }

    public d(com.badlogic.gdx.graphics.g2d.a aVar, CharSequence charSequence) {
        g(aVar, charSequence);
    }

    public d(com.badlogic.gdx.graphics.g2d.a aVar, CharSequence charSequence, com.badlogic.gdx.graphics.b bVar, float f11, int i11, boolean z11) {
        i(aVar, charSequence, bVar, f11, i11, z11);
    }

    public d(com.badlogic.gdx.graphics.g2d.a aVar, CharSequence charSequence, int i11, int i12, com.badlogic.gdx.graphics.b bVar, float f11, int i13, boolean z11, String str) {
        h(aVar, charSequence, i11, i12, bVar, f11, i13, z11, str);
    }
}
