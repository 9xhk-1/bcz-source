package com.badlogic.gdx.graphics.g2d;

import a3.e0;
import a3.l0;
import a3.v;
import com.badlogic.gdx.graphics.g2d.a;
import com.badlogic.gdx.graphics.g2d.d;
import java.util.Arrays;
import w1.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class b {

    /* renamed from: n, reason: collision with root package name */
    public static final com.badlogic.gdx.graphics.b f12041n = new com.badlogic.gdx.graphics.b(1.0f, 1.0f, 1.0f, 1.0f);

    /* renamed from: a, reason: collision with root package name */
    public final a f12042a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f12043b;

    /* renamed from: c, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<d> f12044c;

    /* renamed from: d, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<d> f12045d;

    /* renamed from: e, reason: collision with root package name */
    public int f12046e;

    /* renamed from: f, reason: collision with root package name */
    public float f12047f;

    /* renamed from: g, reason: collision with root package name */
    public float f12048g;

    /* renamed from: h, reason: collision with root package name */
    public final com.badlogic.gdx.graphics.b f12049h;

    /* renamed from: i, reason: collision with root package name */
    public float f12050i;

    /* renamed from: j, reason: collision with root package name */
    public float[][] f12051j;

    /* renamed from: k, reason: collision with root package name */
    public int[] f12052k;

    /* renamed from: l, reason: collision with root package name */
    public v[] f12053l;

    /* renamed from: m, reason: collision with root package name */
    public int[] f12054m;

    public b(a aVar) {
        this(aVar, aVar.l1());
    }

    public void A(float f11, int i11, int i12) {
        float[][] fArr = this.f12051j;
        if (fArr.length == 1) {
            float[] fArr2 = fArr[0];
            int min = Math.min(i12 * 20, this.f12052k[0]);
            for (int i13 = (i11 * 20) + 2; i13 < min; i13 += 5) {
                fArr2[i13] = f11;
            }
            return;
        }
        int length = fArr.length;
        for (int i14 = 0; i14 < length; i14++) {
            float[] fArr3 = this.f12051j[i14];
            v vVar = this.f12053l[i14];
            int i15 = vVar.f1640b;
            for (int i16 = 0; i16 < i15; i16++) {
                int i17 = vVar.f1639a[i16];
                if (i17 >= i12) {
                    break;
                }
                if (i17 >= i11) {
                    int i18 = i16 * 20;
                    fArr3[i18 + 2] = f11;
                    fArr3[i18 + 7] = f11;
                    fArr3[i18 + 12] = f11;
                    fArr3[i18 + 17] = f11;
                }
            }
        }
    }

    public void B(com.badlogic.gdx.graphics.b bVar) {
        y(bVar.L());
    }

    public void C(com.badlogic.gdx.graphics.b bVar, int i11, int i12) {
        A(bVar.L(), i11, i12);
    }

    public final void D(int i11) {
        float[][] fArr = new float[i11][];
        float[][] fArr2 = this.f12051j;
        int i12 = 0;
        System.arraycopy(fArr2, 0, fArr, 0, fArr2.length);
        this.f12051j = fArr;
        int[] iArr = new int[i11];
        int[] iArr2 = this.f12052k;
        System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
        this.f12052k = iArr;
        v[] vVarArr = new v[i11];
        v[] vVarArr2 = this.f12053l;
        if (vVarArr2 != null) {
            int length = vVarArr2.length;
            System.arraycopy(vVarArr2, 0, vVarArr, 0, vVarArr2.length);
            i12 = length;
        }
        while (i12 < i11) {
            vVarArr[i12] = new v();
            i12++;
        }
        this.f12053l = vVarArr;
        this.f12054m = new int[i11];
    }

    public void E(float f11, float f12) {
        M(f11 - this.f12047f, f12 - this.f12048g);
    }

    public d F(CharSequence charSequence, float f11, float f12) {
        h();
        return d(charSequence, f11, f12, 0, charSequence.length(), 0.0f, 8, false);
    }

    public d G(CharSequence charSequence, float f11, float f12, float f13, int i11, boolean z11) {
        h();
        return d(charSequence, f11, f12, 0, charSequence.length(), f13, i11, z11);
    }

    public d H(CharSequence charSequence, float f11, float f12, int i11, int i12, float f13, int i13, boolean z11) {
        h();
        return d(charSequence, f11, f12, i11, i12, f13, i13, z11);
    }

    public d I(CharSequence charSequence, float f11, float f12, int i11, int i12, float f13, int i13, boolean z11, String str) {
        h();
        return e(charSequence, f11, f12, i11, i12, f13, i13, z11, str);
    }

    public void J(d dVar, float f11, float f12) {
        h();
        f(dVar, f11, f12);
    }

    public void K(boolean z11) {
        this.f12043b = z11;
    }

    public void L(com.badlogic.gdx.graphics.b bVar) {
        b bVar2 = this;
        float L = bVar.L();
        if (bVar2.f12050i == L) {
            return;
        }
        bVar2.f12050i = L;
        float[][] fArr = bVar2.f12051j;
        com.badlogic.gdx.graphics.b bVar3 = f12041n;
        int[] iArr = bVar2.f12054m;
        int i11 = 0;
        Arrays.fill(iArr, 0);
        int i12 = bVar2.f12044c.f13179b;
        int i13 = 0;
        while (i13 < i12) {
            d dVar = bVar2.f12044c.get(i13);
            v vVar = dVar.f12060b;
            int i14 = dVar.f12059a.f13179b;
            float f11 = 0.0f;
            int i15 = i11;
            int i16 = i15;
            int i17 = i16;
            int i18 = i17;
            while (i15 < i14) {
                com.badlogic.gdx.utils.a<a.b> aVar = dVar.f12059a.get(i15).f12064a;
                a.b[] bVarArr = aVar.f13178a;
                int i19 = aVar.f13179b;
                int i21 = 0;
                while (i21 < i19) {
                    int i22 = i17 + 1;
                    if (i17 == i16) {
                        com.badlogic.gdx.graphics.b.b(bVar3, vVar.m(i18 + 1));
                        f11 = bVar3.r(bVar).L();
                        i18 += 2;
                        i16 = i18 < vVar.f1640b ? vVar.m(i18) : -1;
                    }
                    int i23 = i21;
                    int i24 = bVarArr[i21].f12040o;
                    int i25 = iArr[i24];
                    int i26 = i25 * 20;
                    iArr[i24] = i25 + 1;
                    float[] fArr2 = fArr[i24];
                    fArr2[i26 + 2] = f11;
                    fArr2[i26 + 7] = f11;
                    fArr2[i26 + 12] = f11;
                    fArr2[i26 + 17] = f11;
                    i21 = i23 + 1;
                    i17 = i22;
                }
                i15++;
            }
            i13++;
            bVar2 = this;
            i11 = 0;
        }
    }

    public void M(float f11, float f12) {
        if (f11 == 0.0f && f12 == 0.0f) {
            return;
        }
        if (this.f12043b) {
            f11 = Math.round(f11);
            f12 = Math.round(f12);
        }
        this.f12047f += f11;
        this.f12048g += f12;
        float[][] fArr = this.f12051j;
        int length = fArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            float[] fArr2 = fArr[i11];
            int i12 = this.f12052k[i11];
            for (int i13 = 0; i13 < i12; i13 += 5) {
                fArr2[i13] = fArr2[i13] + f11;
                int i14 = i13 + 1;
                fArr2[i14] = fArr2[i14] + f12;
            }
        }
    }

    public boolean N() {
        return this.f12043b;
    }

    public final void a(a.b bVar, float f11, float f12, float f13) {
        a.C0189a c0189a = this.f12042a.f11995a;
        float f14 = c0189a.f12015o;
        float f15 = c0189a.f12016p;
        float f16 = f11 + (bVar.f12035j * f14);
        float f17 = f12 + (bVar.f12036k * f15);
        float f18 = bVar.f12029d * f14;
        float f19 = bVar.f12030e * f15;
        float f21 = bVar.f12031f;
        float f22 = bVar.f12033h;
        float f23 = bVar.f12032g;
        float f24 = bVar.f12034i;
        if (this.f12043b) {
            f16 = Math.round(f16);
            f17 = Math.round(f17);
            f18 = Math.round(f18);
            f19 = Math.round(f19);
        }
        float f25 = f18 + f16;
        float f26 = f19 + f17;
        int i11 = bVar.f12040o;
        int[] iArr = this.f12052k;
        int i12 = iArr[i11];
        iArr[i11] = i12 + 20;
        v[] vVarArr = this.f12053l;
        if (vVarArr != null) {
            v vVar = vVarArr[i11];
            int i13 = this.f12046e;
            this.f12046e = i13 + 1;
            vVar.a(i13);
        }
        float[] fArr = this.f12051j[i11];
        fArr[i12] = f16;
        fArr[i12 + 1] = f17;
        fArr[i12 + 2] = f13;
        fArr[i12 + 3] = f21;
        fArr[i12 + 4] = f23;
        fArr[i12 + 5] = f16;
        fArr[i12 + 6] = f26;
        fArr[i12 + 7] = f13;
        fArr[i12 + 8] = f21;
        fArr[i12 + 9] = f24;
        fArr[i12 + 10] = f25;
        fArr[i12 + 11] = f26;
        fArr[i12 + 12] = f13;
        fArr[i12 + 13] = f22;
        fArr[i12 + 14] = f24;
        fArr[i12 + 15] = f25;
        fArr[i12 + 16] = f17;
        fArr[i12 + 17] = f13;
        fArr[i12 + 18] = f22;
        fArr[i12 + 19] = f23;
    }

    public d b(CharSequence charSequence, float f11, float f12) {
        return e(charSequence, f11, f12, 0, charSequence.length(), 0.0f, 8, false, null);
    }

    public d c(CharSequence charSequence, float f11, float f12, float f13, int i11, boolean z11) {
        return e(charSequence, f11, f12, 0, charSequence.length(), f13, i11, z11, null);
    }

    public d d(CharSequence charSequence, float f11, float f12, int i11, int i12, float f13, int i13, boolean z11) {
        return e(charSequence, f11, f12, i11, i12, f13, i13, z11, null);
    }

    public d e(CharSequence charSequence, float f11, float f12, int i11, int i12, float f13, int i13, boolean z11, String str) {
        d dVar = (d) l0.f(d.class);
        this.f12045d.a(dVar);
        dVar.h(this.f12042a, charSequence, i11, i12, this.f12049h, f13, i13, z11, str);
        f(dVar, f11, f12);
        return dVar;
    }

    public void f(d dVar, float f11, float f12) {
        g(dVar, f11, f12 + this.f12042a.f11995a.f12011k);
    }

    public final void g(d dVar, float f11, float f12) {
        int i11 = dVar.f12059a.f13179b;
        if (i11 == 0) {
            return;
        }
        int length = this.f12051j.length;
        int i12 = this.f12042a.f11996b.f13179b;
        if (length < i12) {
            D(i12);
        }
        this.f12044c.a(dVar);
        t(dVar);
        v vVar = dVar.f12060b;
        float f13 = 0.0f;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < i11; i16++) {
            d.a aVar = dVar.f12059a.get(i16);
            com.badlogic.gdx.utils.a<a.b> aVar2 = aVar.f12064a;
            a.b[] bVarArr = aVar2.f13178a;
            float[] fArr = aVar.f12065b.f1625a;
            float f14 = f11 + aVar.f12066c;
            float f15 = f12 + aVar.f12067d;
            int i17 = aVar2.f13179b;
            int i18 = 0;
            while (i18 < i17) {
                int i19 = i14 + 1;
                if (i14 == i13) {
                    f13 = e0.f(vVar.m(i15 + 1));
                    i15 += 2;
                    i13 = i15 < vVar.f1640b ? vVar.m(i15) : -1;
                }
                f14 += fArr[i18];
                a(bVarArr[i18], f14, f15, f13);
                i18++;
                i14 = i19;
            }
        }
        this.f12050i = com.badlogic.gdx.graphics.b.f11527j;
    }

    public void h() {
        this.f12047f = 0.0f;
        this.f12048g = 0.0f;
        l0.c(this.f12045d, true);
        this.f12045d.clear();
        this.f12044c.clear();
        int length = this.f12052k.length;
        for (int i11 = 0; i11 < length; i11++) {
            v[] vVarArr = this.f12053l;
            if (vVarArr != null) {
                vVarArr[i11].i();
            }
            this.f12052k[i11] = 0;
        }
    }

    public void i(w1.a aVar) {
        com.badlogic.gdx.utils.a<o> Q0 = this.f12042a.Q0();
        int length = this.f12051j.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (this.f12052k[i11] > 0) {
                aVar.t0(Q0.get(i11).f(), this.f12051j[i11], 0, this.f12052k[i11]);
            }
        }
    }

    public void j(w1.a aVar, float f11) {
        if (f11 == 1.0f) {
            i(aVar);
            return;
        }
        com.badlogic.gdx.graphics.b l11 = l();
        float f12 = l11.f11547d;
        l11.f11547d = f11 * f12;
        B(l11);
        i(aVar);
        l11.f11547d = f12;
        B(l11);
    }

    public void k(w1.a aVar, int i11, int i12) {
        if (this.f12051j.length == 1) {
            aVar.t0(this.f12042a.C0().f(), this.f12051j[0], i11 * 20, (i12 - i11) * 20);
            return;
        }
        com.badlogic.gdx.utils.a<o> Q0 = this.f12042a.Q0();
        int length = this.f12051j.length;
        for (int i13 = 0; i13 < length; i13++) {
            v vVar = this.f12053l[i13];
            int i14 = vVar.f1640b;
            int i15 = 0;
            int i16 = -1;
            for (int i17 = 0; i17 < i14; i17++) {
                int m11 = vVar.m(i17);
                if (m11 >= i12) {
                    break;
                }
                if (i16 == -1 && m11 >= i11) {
                    i16 = i17;
                }
                if (m11 >= i11) {
                    i15++;
                }
            }
            if (i16 != -1 && i15 != 0) {
                aVar.t0(Q0.get(i13).f(), this.f12051j[i13], i16 * 20, i15 * 20);
            }
        }
    }

    public com.badlogic.gdx.graphics.b l() {
        return this.f12049h;
    }

    public a m() {
        return this.f12042a;
    }

    public com.badlogic.gdx.utils.a<d> n() {
        return this.f12044c;
    }

    public int o(int i11) {
        return this.f12052k[i11];
    }

    public float[] p() {
        return q(0);
    }

    public float[] q(int i11) {
        return this.f12051j[i11];
    }

    public float r() {
        return this.f12047f;
    }

    public float s() {
        return this.f12048g;
    }

    public final void t(d dVar) {
        if (this.f12051j.length == 1) {
            u(0, dVar.f12061c);
            return;
        }
        int[] iArr = this.f12054m;
        Arrays.fill(iArr, 0);
        int i11 = dVar.f12059a.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            com.badlogic.gdx.utils.a<a.b> aVar = dVar.f12059a.get(i12).f12064a;
            a.b[] bVarArr = aVar.f13178a;
            int i13 = aVar.f13179b;
            for (int i14 = 0; i14 < i13; i14++) {
                int i15 = bVarArr[i14].f12040o;
                iArr[i15] = iArr[i15] + 1;
            }
        }
        int length = iArr.length;
        for (int i16 = 0; i16 < length; i16++) {
            u(i16, iArr[i16]);
        }
    }

    public final void u(int i11, int i12) {
        v[] vVarArr = this.f12053l;
        if (vVarArr != null) {
            v vVar = vVarArr[i11];
            if (i12 > vVar.f1639a.length) {
                vVar.k(i12 - vVar.f1640b);
            }
        }
        int i13 = this.f12052k[i11];
        int i14 = (i12 * 20) + i13;
        float[][] fArr = this.f12051j;
        float[] fArr2 = fArr[i11];
        if (fArr2 == null) {
            fArr[i11] = new float[i14];
        } else if (fArr2.length < i14) {
            float[] fArr3 = new float[i14];
            System.arraycopy(fArr2, 0, fArr3, 0, i13);
            this.f12051j[i11] = fArr3;
        }
    }

    public void v(float f11) {
        int i11 = ((int) (f11 * 254.0f)) << 24;
        int length = this.f12051j.length;
        float f12 = 0.0f;
        float f13 = 0.0f;
        for (int i12 = 0; i12 < length; i12++) {
            float[] fArr = this.f12051j[i12];
            int i13 = this.f12052k[i12];
            for (int i14 = 2; i14 < i13; i14 += 5) {
                float f14 = fArr[i14];
                if (f14 != f12 || i14 == 2) {
                    f13 = e0.f((e0.c(f14) & 16777215) | i11);
                    fArr[i14] = f13;
                    f12 = f14;
                } else {
                    fArr[i14] = f13;
                }
            }
        }
    }

    public void w(float f11, float f12, float f13, float f14) {
        this.f12049h.F(f11, f12, f13, f14);
    }

    public void x(com.badlogic.gdx.graphics.b bVar) {
        this.f12049h.H(bVar);
    }

    public void y(float f11) {
        int length = this.f12051j.length;
        for (int i11 = 0; i11 < length; i11++) {
            float[] fArr = this.f12051j[i11];
            int i12 = this.f12052k[i11];
            for (int i13 = 2; i13 < i12; i13 += 5) {
                fArr[i13] = f11;
            }
        }
    }

    public void z(float f11, float f12, float f13, float f14) {
        int i11 = ((int) (f12 * 255.0f)) << 8;
        int i12 = (int) (f11 * 255.0f);
        y(e0.f(i12 | i11 | (((int) (f13 * 255.0f)) << 16) | (((int) (f14 * 255.0f)) << 24)));
    }

    public b(a aVar, boolean z11) {
        this.f12044c = new com.badlogic.gdx.utils.a<>(1);
        this.f12045d = new com.badlogic.gdx.utils.a<>(0);
        this.f12049h = new com.badlogic.gdx.graphics.b(1.0f, 1.0f, 1.0f, 1.0f);
        this.f12042a = aVar;
        this.f12043b = z11;
        int i11 = aVar.f11996b.f13179b;
        if (i11 == 0) {
            throw new IllegalArgumentException("The specified font must contain at least one texture page.");
        }
        this.f12051j = new float[i11][];
        this.f12052k = new int[i11];
        if (i11 > 1) {
            v[] vVarArr = new v[i11];
            this.f12053l = vVarArr;
            int length = vVarArr.length;
            for (int i12 = 0; i12 < length; i12++) {
                this.f12053l[i12] = new v();
            }
        }
        this.f12054m = new int[i11];
    }
}
