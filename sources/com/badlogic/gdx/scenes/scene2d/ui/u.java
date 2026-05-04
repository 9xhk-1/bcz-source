package com.badlogic.gdx.scenes.scene2d.ui;

import a3.j0;
import a3.l0;
import com.badlogic.gdx.graphics.g2d.a;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.w;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class u extends w {
    public a3.v A1;
    public String B1;
    public int C1;
    public int D1;
    public int E1;
    public float F1;
    public float G1;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends w.e {
        public a() {
            super();
        }

        @Override // com.badlogic.gdx.scenes.scene2d.ui.w.e
        public boolean G(char c11) {
            return u.this.M && c11 == '\t';
        }

        @Override // com.badlogic.gdx.scenes.scene2d.ui.w.e
        public void H(boolean z11) {
            if (!z11) {
                u uVar = u.this;
                if (uVar.C1 < uVar.o4()) {
                    u uVar2 = u.this;
                    int i11 = uVar2.C1;
                    int i12 = (i11 * 2) + 1;
                    a3.v vVar = uVar2.A1;
                    if (i12 < vVar.f1640b) {
                        uVar2.f13100y = vVar.m((i11 * 2) + 1);
                        return;
                    }
                    return;
                }
            }
            u uVar3 = u.this;
            uVar3.f13100y = uVar3.f13099x.length();
        }

        @Override // com.badlogic.gdx.scenes.scene2d.ui.w.e
        public void I(boolean z11) {
            if (z11) {
                u.this.f13100y = 0;
                return;
            }
            u uVar = u.this;
            int i11 = uVar.C1;
            int i12 = i11 * 2;
            a3.v vVar = uVar.A1;
            if (i12 < vVar.f1640b) {
                uVar.f13100y = vVar.m(i11 * 2);
            }
        }

        @Override // com.badlogic.gdx.scenes.scene2d.ui.w.e
        public void K(float f11, float f12) {
            u uVar = u.this;
            uVar.F1 = -1.0f;
            w.h hVar = uVar.E;
            z2.k kVar = hVar.f13110e;
            com.badlogic.gdx.graphics.g2d.a aVar = hVar.f13106a;
            float v12 = uVar.v1();
            if (kVar != null) {
                v12 -= kVar.w();
                f11 -= kVar.z();
            }
            float max = Math.max(0.0f, f11);
            if (kVar != null) {
                f12 -= kVar.w();
            }
            u uVar2 = u.this;
            int floor = (int) Math.floor((v12 - f12) / aVar.w0());
            u uVar3 = u.this;
            uVar2.C1 = floor + uVar3.D1;
            uVar3.C1 = Math.max(0, Math.min(uVar3.C1, uVar3.o4() - 1));
            super.K(max, f12);
            u.this.u4();
        }

        @Override // com.badlogic.gdx.scenes.scene2d.ui.w.e, com.badlogic.gdx.scenes.scene2d.b
        public boolean d(InputEvent inputEvent, int i11) {
            boolean d11 = super.d(inputEvent, i11);
            if (!u.this.Q1()) {
                return d11;
            }
            boolean z11 = q1.g.f81381d.c(59) || q1.g.f81381d.c(60);
            if (i11 == 20) {
                if (z11) {
                    u uVar = u.this;
                    if (!uVar.A) {
                        uVar.f13101z = uVar.f13100y;
                        uVar.A = true;
                    }
                } else {
                    u.this.e3();
                }
                u uVar2 = u.this;
                uVar2.q4(uVar2.C1 + 1);
            } else {
                if (i11 != 19) {
                    u.this.F1 = -1.0f;
                    u.this.t4();
                    return true;
                }
                if (z11) {
                    u uVar3 = u.this;
                    if (!uVar3.A) {
                        uVar3.f13101z = uVar3.f13100y;
                        uVar3.A = true;
                    }
                } else {
                    u.this.e3();
                }
                u uVar4 = u.this;
                uVar4.q4(uVar4.C1 - 1);
            }
            J(i11);
            u.this.t4();
            return true;
        }

        @Override // com.badlogic.gdx.scenes.scene2d.ui.w.e, com.badlogic.gdx.scenes.scene2d.b
        public boolean e(InputEvent inputEvent, char c11) {
            boolean e11 = super.e(inputEvent, c11);
            u.this.t4();
            return e11;
        }
    }

    public u(String str, q qVar) {
        super(str, qVar);
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.w
    public float E3(com.badlogic.gdx.graphics.g2d.a aVar, @a3.d0 z2.k kVar) {
        float v12 = v1();
        if (kVar != null) {
            v12 -= kVar.w();
        }
        return aVar.l1() ? (int) v12 : v12;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.w
    public void F3() {
        super.F3();
        this.B = true;
        this.A1 = new a3.v();
        this.C1 = 0;
        this.D1 = 0;
        this.F1 = -1.0f;
        this.E1 = 0;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.w
    public int J3(float f11) {
        a3.v vVar = this.A1;
        int i11 = vVar.f1640b;
        if (i11 <= 0) {
            return 0;
        }
        int i12 = this.C1;
        if (i12 * 2 >= i11) {
            return this.f13099x.length();
        }
        float[] fArr = this.D.f1625a;
        int[] iArr = vVar.f1639a;
        int i13 = iArr[i12 * 2];
        float f12 = f11 + fArr[i13];
        int i14 = iArr[(i12 * 2) + 1];
        while (i13 < i14 && fArr[i13] <= f12) {
            i13++;
        }
        return (i13 <= 0 || fArr[i13] - f12 > f12 - fArr[i13 + (-1)]) ? Math.max(0, i13 - 1) : i13;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.w
    public void K3(boolean z11, boolean z12) {
        int i11 = z11 ? 1 : -1;
        int i12 = this.C1;
        int i13 = (i12 * 2) + i11;
        if (i13 >= 0) {
            int i14 = i13 + 1;
            a3.v vVar = this.A1;
            if (i14 < vVar.f1640b) {
                int[] iArr = vVar.f1639a;
                int i15 = iArr[i13];
                int i16 = this.f13100y;
                if (i15 == i16 && iArr[i14] == i16) {
                    this.C1 = i12 + i11;
                    if (z12) {
                        super.K3(z11, z12);
                    }
                    t4();
                    u4();
                }
            }
        }
        super.K3(z11, z12);
        u4();
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.w, com.badlogic.gdx.scenes.scene2d.ui.e0, z2.l
    public float R() {
        if (this.G1 <= 0.0f) {
            return super.R();
        }
        float ceil = (float) Math.ceil(this.E.f13106a.w0() * this.G1);
        z2.k kVar = this.E.f13110e;
        return kVar != null ? Math.max(ceil + kVar.s() + this.E.f13110e.w(), this.E.f13110e.o()) : ceil;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.e0, com.badlogic.gdx.scenes.scene2d.a
    public void W2() {
        float w11;
        this.B1 = null;
        w.h hVar = this.E;
        com.badlogic.gdx.graphics.g2d.a aVar = hVar.f13106a;
        z2.k kVar = hVar.f13110e;
        float v12 = v1();
        if (kVar == null) {
            w11 = 0.0f;
        } else {
            w11 = kVar.w() + kVar.s();
        }
        this.E1 = (int) Math.floor((v12 - w11) / aVar.w0());
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.w
    public void a4(int i11, int i12) {
        super.a4(i11, i12);
        u4();
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.w
    public void b4(w.h hVar) {
        if (hVar == null) {
            throw new IllegalArgumentException("style cannot be null.");
        }
        this.E = hVar;
        this.Y = hVar.f13106a.Z() - hVar.f13106a.n0();
        if (this.f13099x != null) {
            f4();
        }
        C0();
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.w
    public void c3() {
        super.c3();
        if (this.f13099x.equals(this.B1)) {
            return;
        }
        this.B1 = this.f13099x;
        com.badlogic.gdx.graphics.g2d.a aVar = this.E.f13106a;
        float J1 = J1();
        z2.k kVar = this.E.f13110e;
        float z11 = J1 - (kVar != null ? kVar.z() + this.E.f13110e.u() : 0.0f);
        this.A1.i();
        j0 d11 = l0.d(com.badlogic.gdx.graphics.g2d.d.class);
        com.badlogic.gdx.graphics.g2d.d dVar = (com.badlogic.gdx.graphics.g2d.d) d11.h();
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < this.f13099x.length(); i13++) {
            char charAt = this.f13099x.charAt(i13);
            if (charAt == '\r' || charAt == '\n') {
                this.A1.a(i11);
                this.A1.a(i13);
                i11 = i13 + 1;
            } else {
                if (!f3(i13, 0)) {
                    i12 = i13;
                }
                dVar.g(aVar, this.f13099x.subSequence(i11, i13 + 1));
                if (dVar.f12062d > z11) {
                    if (i11 >= i12) {
                        i12 = i13 - 1;
                    }
                    this.A1.a(i11);
                    i12++;
                    this.A1.a(i12);
                    i11 = i12;
                }
            }
        }
        d11.d(dVar);
        if (i11 < this.f13099x.length()) {
            this.A1.a(i11);
            this.A1.a(this.f13099x.length());
        }
        t4();
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.w
    public boolean f3(int i11, int i12) {
        int[] iArr;
        int i13;
        int j42 = j4(i11 + i12);
        if (!super.f3(i11, i12)) {
            return false;
        }
        if (j42 < 0) {
            return true;
        }
        a3.v vVar = this.A1;
        return j42 >= vVar.f1640b + (-2) || (i13 = (iArr = vVar.f1639a)[j42 + 1]) != i11 || i13 == iArr[j42 + 2];
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.w
    public com.badlogic.gdx.scenes.scene2d.b h3() {
        return new a();
    }

    public final int j4(int i11) {
        int i12 = 0;
        while (true) {
            a3.v vVar = this.A1;
            if (i12 >= vVar.f1640b || i11 <= vVar.f1639a[i12]) {
                break;
            }
            i12++;
        }
        return i12;
    }

    public int k4() {
        return this.C1;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.w
    public void l3(z2.k kVar, w1.a aVar, com.badlogic.gdx.graphics.g2d.a aVar2, float f11, float f12) {
        kVar.y(aVar, f11 + l4(), f12 + m4(), kVar.b(), aVar2.w0());
    }

    public float l4() {
        a.C0189a i02 = this.E.f13106a.i0();
        float f11 = 0.0f;
        if (this.f13100y < this.D.f1626b) {
            int i11 = this.C1;
            int i12 = i11 * 2;
            a3.v vVar = this.A1;
            if (i12 < vVar.f1640b) {
                int i13 = vVar.f1639a[i11 * 2];
                a.b c11 = i02.c(this.G.charAt(i13));
                if (c11 != null && !c11.f12039n) {
                    f11 = ((-c11.f12035j) * i02.f12015o) - i02.f12008h;
                }
                f11 += this.D.n(this.f13100y) - this.D.n(i13);
            }
        }
        return f11 + i02.f12018r;
    }

    public float m4() {
        return (-((this.C1 - this.D1) + 1)) * this.E.f13106a.w0();
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.w
    public void n3(z2.k kVar, w1.a aVar, com.badlogic.gdx.graphics.g2d.a aVar2, float f11, float f12) {
        float f13;
        float f14;
        int i11 = this.D1 * 2;
        int min = Math.min(this.f13100y, this.f13101z);
        int max = Math.max(this.f13100y, this.f13101z);
        a.C0189a i02 = aVar2.i0();
        float w02 = this.E.f13106a.w0();
        float f15 = 0.0f;
        while (true) {
            int i12 = i11 + 1;
            a3.v vVar = this.A1;
            if (i12 >= vVar.f1640b || i11 >= (this.D1 + this.E1) * 2) {
                return;
            }
            int m11 = vVar.m(i11);
            int m12 = this.A1.m(i12);
            if ((min >= m11 || min >= m12 || max >= m11 || max >= m12) && (min <= m11 || min <= m12 || max <= m11 || max <= m12)) {
                int max2 = Math.max(m11, min);
                int min2 = Math.min(m12, max);
                a.b c11 = i02.c(this.G.charAt(m11));
                if (c11 == null) {
                    f13 = 0.0f;
                    f14 = 0.0f;
                } else if (max2 == m11) {
                    f14 = c11.f12039n ? 0.0f : ((-c11.f12035j) * i02.f12015o) - i02.f12008h;
                    f13 = 0.0f;
                } else {
                    f13 = c11.f12039n ? 0.0f : ((-c11.f12035j) * i02.f12015o) - i02.f12008h;
                    f14 = 0.0f;
                }
                kVar.y(aVar, f11 + (this.D.n(max2) - this.D.n(m11)) + f13, (f12 - w02) - f15, (this.D.n(min2) - this.D.n(max2)) + f14, aVar2.w0());
            }
            f15 += aVar2.w0();
            i11 += 2;
        }
    }

    public int n4() {
        return this.D1;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.w
    public void o3(w1.a aVar, com.badlogic.gdx.graphics.g2d.a aVar2, float f11, float f12) {
        float f13 = (-(this.E.f13106a.w0() - this.Y)) / 2.0f;
        for (int i11 = this.D1 * 2; i11 < (this.D1 + this.E1) * 2; i11 += 2) {
            a3.v vVar = this.A1;
            if (i11 >= vVar.f1640b) {
                return;
            }
            int[] iArr = vVar.f1639a;
            aVar2.z(aVar, this.G, f11, f12 + f13, iArr[i11], iArr[i11 + 1], 0.0f, 8, false);
            f13 -= aVar2.w0();
        }
    }

    public int o4() {
        return (this.A1.f1640b / 2) + (r4() ? 1 : 0);
    }

    public int p4() {
        return this.E1;
    }

    public void q4(int i11) {
        if (i11 < 0) {
            this.C1 = 0;
            this.f13100y = 0;
            this.F1 = -1.0f;
            return;
        }
        if (i11 >= o4()) {
            int o42 = o4() - 1;
            this.f13100y = this.f13099x.length();
            if (i11 > o4() || o42 == this.C1) {
                this.F1 = -1.0f;
            }
            this.C1 = o42;
            return;
        }
        int i12 = this.C1;
        if (i11 != i12) {
            if (this.F1 < 0.0f) {
                this.F1 = this.A1.f1640b > i12 * 2 ? this.D.n(this.f13100y) - this.D.n(this.A1.m(this.C1 * 2)) : 0.0f;
            }
            this.C1 = i11;
            int i13 = i11 * 2;
            a3.v vVar = this.A1;
            this.f13100y = i13 >= vVar.f1640b ? this.f13099x.length() : vVar.m(i11 * 2);
            while (this.f13100y < this.f13099x.length() && this.f13100y <= this.A1.m((this.C1 * 2) + 1) - 1 && this.D.n(this.f13100y) - this.D.n(this.A1.m(this.C1 * 2)) < this.F1) {
                this.f13100y++;
            }
            t4();
        }
    }

    public boolean r4() {
        if (this.f13099x.length() == 0) {
            return false;
        }
        String str = this.f13099x;
        if (str.charAt(str.length() - 1) != '\n') {
            String str2 = this.f13099x;
            if (str2.charAt(str2.length() - 1) != '\r') {
                return false;
            }
        }
        return true;
    }

    public void s4(float f11) {
        this.G1 = f11;
    }

    public void t4() {
        u4();
        v4();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        if (r5.f13099x.charAt(r0.length() - 1) == '\r') goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r3[r2] == r0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void u4() {
        /*
            r5 = this;
            int r0 = r5.f13100y
            int r0 = r5.j4(r0)
            int r1 = r0 / 2
            int r2 = r0 % 2
            if (r2 == 0) goto L20
            int r2 = r0 + 1
            a3.v r3 = r5.A1
            int r4 = r3.f1640b
            if (r2 >= r4) goto L20
            int r4 = r5.f13100y
            int[] r3 = r3.f1639a
            r0 = r3[r0]
            if (r4 != r0) goto L20
            r2 = r3[r2]
            if (r2 == r0) goto L52
        L20:
            a3.v r0 = r5.A1
            int r0 = r0.f1640b
            int r0 = r0 / 2
            if (r1 < r0) goto L50
            java.lang.String r0 = r5.f13099x
            int r0 = r0.length()
            if (r0 == 0) goto L50
            java.lang.String r0 = r5.f13099x
            int r2 = r0.length()
            int r2 = r2 + (-1)
            char r0 = r0.charAt(r2)
            r2 = 10
            if (r0 == r2) goto L50
            java.lang.String r0 = r5.f13099x
            int r2 = r0.length()
            int r2 = r2 + (-1)
            char r0 = r0.charAt(r2)
            r2 = 13
            if (r0 != r2) goto L52
        L50:
            r5.C1 = r1
        L52:
            r5.v4()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.scenes.scene2d.ui.u.u4():void");
    }

    public void v4() {
        int i11 = this.C1;
        int i12 = this.D1;
        if (i11 == i12) {
            return;
        }
        int i13 = i11 >= i12 ? 1 : -1;
        while (true) {
            int i14 = this.D1;
            int i15 = this.C1;
            if (i14 <= i15 && (this.E1 + i14) - 1 >= i15) {
                return;
            } else {
                this.D1 = i14 + i13;
            }
        }
    }

    public u(String str, q qVar, String str2) {
        super(str, qVar, str2);
    }

    public u(String str, w.h hVar) {
        super(str, hVar);
    }
}
