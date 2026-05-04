package com.badlogic.gdx.scenes.scene2d.ui;

import a3.l0;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.n;
import z2.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class r extends n {
    public int M;
    public int N;
    public boolean O;
    public com.badlogic.gdx.math.l P;
    public float[] Q;
    public float R;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends com.badlogic.gdx.scenes.scene2d.b {
        public a() {
        }

        @Override // com.badlogic.gdx.scenes.scene2d.b
        public void b(InputEvent inputEvent, float f11, float f12, int i11, @a3.d0 com.badlogic.gdx.scenes.scene2d.a aVar) {
            if (i11 == -1) {
                r.this.O = true;
            }
        }

        @Override // com.badlogic.gdx.scenes.scene2d.b
        public void c(InputEvent inputEvent, float f11, float f12, int i11, @a3.d0 com.badlogic.gdx.scenes.scene2d.a aVar) {
            if (i11 == -1) {
                r.this.O = false;
            }
        }

        @Override // com.badlogic.gdx.scenes.scene2d.b
        public boolean i(InputEvent inputEvent, float f11, float f12, int i11, int i12) {
            r rVar = r.this;
            if (rVar.J) {
                return false;
            }
            int i13 = rVar.M;
            if ((i13 != -1 && i13 != i12) || rVar.N != -1) {
                return false;
            }
            rVar.N = i11;
            rVar.D3(f11, f12);
            return true;
        }

        @Override // com.badlogic.gdx.scenes.scene2d.b
        public void j(InputEvent inputEvent, float f11, float f12, int i11) {
            r.this.D3(f11, f12);
        }

        @Override // com.badlogic.gdx.scenes.scene2d.b
        public void k(InputEvent inputEvent, float f11, float f12, int i11, int i12) {
            r rVar = r.this;
            if (i11 != rVar.N) {
                return;
            }
            rVar.N = -1;
            if (inputEvent.B() || !r.this.D3(f11, f12)) {
                d.a aVar = (d.a) l0.f(d.a.class);
                r.this.q1(aVar);
                l0.a(aVar);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b extends n.a {

        /* renamed from: i, reason: collision with root package name */
        @a3.d0
        public z2.k f13056i;

        /* renamed from: j, reason: collision with root package name */
        @a3.d0
        public z2.k f13057j;

        /* renamed from: k, reason: collision with root package name */
        @a3.d0
        public z2.k f13058k;

        /* renamed from: l, reason: collision with root package name */
        @a3.d0
        public z2.k f13059l;

        /* renamed from: m, reason: collision with root package name */
        @a3.d0
        public z2.k f13060m;

        /* renamed from: n, reason: collision with root package name */
        @a3.d0
        public z2.k f13061n;

        /* renamed from: o, reason: collision with root package name */
        @a3.d0
        public z2.k f13062o;

        /* renamed from: p, reason: collision with root package name */
        @a3.d0
        public z2.k f13063p;

        public b() {
        }

        public b(@a3.d0 z2.k kVar, @a3.d0 z2.k kVar2) {
            super(kVar, kVar2);
        }

        public b(b bVar) {
            super(bVar);
            this.f13056i = bVar.f13056i;
            this.f13057j = bVar.f13057j;
            this.f13058k = bVar.f13058k;
            this.f13059l = bVar.f13059l;
            this.f13060m = bVar.f13060m;
            this.f13061n = bVar.f13061n;
            this.f13062o = bVar.f13062o;
            this.f13063p = bVar.f13063p;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public r(float r7, float r8, float r9, boolean r10, com.badlogic.gdx.scenes.scene2d.ui.q r11) {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "default-"
            r0.append(r1)
            if (r10 == 0) goto Lf
            java.lang.String r1 = "vertical"
            goto L11
        Lf:
            java.lang.String r1 = "horizontal"
        L11:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Class<com.badlogic.gdx.scenes.scene2d.ui.r$b> r1 = com.badlogic.gdx.scenes.scene2d.ui.r.b.class
            java.lang.Object r11 = r11.X(r0, r1)
            r5 = r11
            com.badlogic.gdx.scenes.scene2d.ui.r$b r5 = (com.badlogic.gdx.scenes.scene2d.ui.r.b) r5
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.scenes.scene2d.ui.r.<init>(float, float, float, boolean, com.badlogic.gdx.scenes.scene2d.ui.q):void");
    }

    public boolean D3(float f11, float f12) {
        float a11;
        z2.k kVar = m3().f12981c;
        z2.k d32 = d3();
        float f13 = this.D;
        float j32 = j3();
        float i32 = i3();
        if (this.E) {
            float v12 = (v1() - d32.w()) - d32.s();
            float o11 = kVar == null ? 0.0f : kVar.o();
            float s11 = (f12 - d32.s()) - (0.5f * o11);
            this.D = s11;
            float f14 = v12 - o11;
            a11 = j32 + ((i32 - j32) * this.P.a(s11 / f14));
            float max = Math.max(Math.min(0.0f, d32.s()), this.D);
            this.D = max;
            this.D = Math.min(f14, max);
        } else {
            float J1 = (J1() - d32.z()) - d32.u();
            float b11 = kVar == null ? 0.0f : kVar.b();
            float z11 = (f11 - d32.z()) - (0.5f * b11);
            this.D = z11;
            float f15 = J1 - b11;
            a11 = j32 + ((i32 - j32) * this.P.a(z11 / f15));
            float max2 = Math.max(Math.min(0.0f, d32.z()), this.D);
            this.D = max2;
            this.D = Math.min(f15, max2);
        }
        float O3 = (q1.g.f81381d.c(59) || q1.g.f81381d.c(60)) ? a11 : O3(a11);
        boolean A3 = A3(O3);
        if (O3 == a11) {
            this.D = f13;
        }
        return A3;
    }

    @a3.d0
    public float[] E3() {
        return this.Q;
    }

    public float F3() {
        return this.R;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.n
    /* renamed from: G3, reason: merged with bridge method [inline-methods] */
    public b m3() {
        return (b) super.m3();
    }

    public boolean H3() {
        return this.N != -1;
    }

    public boolean I3() {
        return this.O;
    }

    public void J3(int i11) {
        this.M = i11;
    }

    public void K3(float f11, @a3.d0 float... fArr) {
        if (fArr != null && fArr.length == 0) {
            throw new IllegalArgumentException("values cannot be empty.");
        }
        this.Q = fArr;
        this.R = f11;
    }

    @Deprecated
    public void L3(@a3.d0 float[] fArr, float f11) {
        K3(f11, fArr);
    }

    public void M3(com.badlogic.gdx.math.l lVar) {
        this.P = lVar;
    }

    public void N3(float f11) {
        float f12 = this.f12977y;
        A3(f12 + ((this.f12978z - f12) * this.P.a(f11)));
    }

    public float O3(float f11) {
        float[] fArr = this.Q;
        if (fArr != null && fArr.length != 0) {
            float f12 = 0.0f;
            int i11 = 0;
            float f13 = -1.0f;
            while (true) {
                float[] fArr2 = this.Q;
                if (i11 >= fArr2.length) {
                    break;
                }
                float f14 = fArr2[i11];
                float abs = Math.abs(f11 - f14);
                if (abs <= this.R && (f13 == -1.0f || abs < f13)) {
                    f12 = f14;
                    f13 = abs;
                }
                i11++;
            }
            if (f13 != -1.0f) {
                return f12;
            }
        }
        return f11;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.n
    @a3.d0
    public z2.k d3() {
        z2.k kVar;
        z2.k kVar2;
        z2.k kVar3;
        b bVar = (b) super.m3();
        return (!this.J || (kVar3 = bVar.f12980b) == null) ? (!H3() || (kVar2 = bVar.f13057j) == null) ? (!this.O || (kVar = bVar.f13056i) == null) ? bVar.f12979a : kVar : kVar2 : kVar3;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.n
    public z2.k e3() {
        z2.k kVar;
        z2.k kVar2;
        z2.k kVar3;
        b bVar = (b) super.m3();
        return (!this.J || (kVar3 = bVar.f12986h) == null) ? (!H3() || (kVar2 = bVar.f13063p) == null) ? (!this.O || (kVar = bVar.f13062o) == null) ? bVar.f12985g : kVar : kVar2 : kVar3;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.n
    public z2.k f3() {
        z2.k kVar;
        z2.k kVar2;
        z2.k kVar3;
        b bVar = (b) super.m3();
        return (!this.J || (kVar3 = bVar.f12984f) == null) ? (!H3() || (kVar2 = bVar.f13061n) == null) ? (!this.O || (kVar = bVar.f13060m) == null) ? bVar.f12983e : kVar : kVar2 : kVar3;
    }

    @Override // com.badlogic.gdx.scenes.scene2d.ui.n
    @a3.d0
    public z2.k g3() {
        z2.k kVar;
        z2.k kVar2;
        z2.k kVar3;
        b bVar = (b) super.m3();
        return (!this.J || (kVar3 = bVar.f12982d) == null) ? (!H3() || (kVar2 = bVar.f13059l) == null) ? (!this.O || (kVar = bVar.f13058k) == null) ? bVar.f12981c : kVar : kVar2 : kVar3;
    }

    public r(float f11, float f12, float f13, boolean z11, q qVar, String str) {
        this(f11, f12, f13, z11, (b) qVar.X(str, b.class));
    }

    public r(float f11, float f12, float f13, boolean z11, b bVar) {
        super(f11, f12, f13, z11, bVar);
        this.M = -1;
        this.N = -1;
        this.P = com.badlogic.gdx.math.l.f12615a;
        d1(new a());
    }
}
