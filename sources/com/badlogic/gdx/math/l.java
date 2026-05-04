package com.badlogic.gdx.math;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class l {
    public static final u A;
    public static final v B;
    public static final w C;
    public static final u D;
    public static final v E;
    public static final w F;
    public static final l G;
    public static final l H;
    public static final l I;
    public static final r J;
    public static final s K;
    public static final t L;
    public static final a0 M;
    public static final b0 N;
    public static final c0 O;
    public static final o P;
    public static final p Q;
    public static final q R;

    /* renamed from: a, reason: collision with root package name */
    public static final l f12615a = new f();

    /* renamed from: b, reason: collision with root package name */
    public static final l f12616b = new g();

    /* renamed from: c, reason: collision with root package name */
    public static final l f12617c = new h();

    /* renamed from: d, reason: collision with root package name */
    public static final l f12618d;

    /* renamed from: e, reason: collision with root package name */
    public static final l f12619e;

    /* renamed from: f, reason: collision with root package name */
    public static final x f12620f;

    /* renamed from: g, reason: collision with root package name */
    public static final y f12621g;

    /* renamed from: h, reason: collision with root package name */
    public static final y f12622h;

    /* renamed from: i, reason: collision with root package name */
    public static final z f12623i;

    /* renamed from: j, reason: collision with root package name */
    public static final z f12624j;

    /* renamed from: k, reason: collision with root package name */
    public static final l f12625k;

    /* renamed from: l, reason: collision with root package name */
    public static final l f12626l;

    /* renamed from: m, reason: collision with root package name */
    public static final x f12627m;

    /* renamed from: n, reason: collision with root package name */
    public static final y f12628n;

    /* renamed from: o, reason: collision with root package name */
    public static final z f12629o;

    /* renamed from: p, reason: collision with root package name */
    public static final l f12630p;

    /* renamed from: q, reason: collision with root package name */
    public static final l f12631q;

    /* renamed from: r, reason: collision with root package name */
    public static final x f12632r;

    /* renamed from: s, reason: collision with root package name */
    public static final y f12633s;

    /* renamed from: t, reason: collision with root package name */
    public static final z f12634t;

    /* renamed from: u, reason: collision with root package name */
    public static final x f12635u;

    /* renamed from: v, reason: collision with root package name */
    public static final y f12636v;

    /* renamed from: w, reason: collision with root package name */
    public static final z f12637w;

    /* renamed from: x, reason: collision with root package name */
    public static final l f12638x;

    /* renamed from: y, reason: collision with root package name */
    public static final l f12639y;

    /* renamed from: z, reason: collision with root package name */
    public static final l f12640z;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends l {
        @Override // com.badlogic.gdx.math.l
        public float a(float f11) {
            return 1.0f - com.badlogic.gdx.math.n.s(f11 * 1.5707964f);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a0 extends l {
        public final float S;

        public a0(float f11) {
            this.S = f11 * 2.0f;
        }

        @Override // com.badlogic.gdx.math.l
        public float a(float f11) {
            if (f11 <= 0.5f) {
                float f12 = f11 * 2.0f;
                float f13 = this.S;
                return ((f12 * f12) * (((1.0f + f13) * f12) - f13)) / 2.0f;
            }
            float f14 = (f11 - 1.0f) * 2.0f;
            float f15 = this.S;
            return (((f14 * f14) * (((f15 + 1.0f) * f14) + f15)) / 2.0f) + 1.0f;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends l {
        @Override // com.badlogic.gdx.math.l
        public float a(float f11) {
            return com.badlogic.gdx.math.n.Z(f11 * 1.5707964f);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b0 extends l {
        public final float S;

        public b0(float f11) {
            this.S = f11;
        }

        @Override // com.badlogic.gdx.math.l
        public float a(float f11) {
            float f12 = this.S;
            return f11 * f11 * (((1.0f + f12) * f11) - f12);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends l {
        @Override // com.badlogic.gdx.math.l
        public float a(float f11) {
            if (f11 <= 0.5f) {
                float f12 = f11 * 2.0f;
                return (1.0f - ((float) Math.sqrt(1.0f - (f12 * f12)))) / 2.0f;
            }
            float f13 = (f11 - 1.0f) * 2.0f;
            return (((float) Math.sqrt(1.0f - (f13 * f13))) + 1.0f) / 2.0f;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c0 extends l {
        public final float S;

        public c0(float f11) {
            this.S = f11;
        }

        @Override // com.badlogic.gdx.math.l
        public float a(float f11) {
            float f12 = f11 - 1.0f;
            float f13 = this.S;
            return (f12 * f12 * (((f13 + 1.0f) * f12) + f13)) + 1.0f;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d extends l {
        @Override // com.badlogic.gdx.math.l
        public float a(float f11) {
            return 1.0f - ((float) Math.sqrt(1.0f - (f11 * f11)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e extends l {
        @Override // com.badlogic.gdx.math.l
        public float a(float f11) {
            float f12 = f11 - 1.0f;
            return (float) Math.sqrt(1.0f - (f12 * f12));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class g extends l {
        @Override // com.badlogic.gdx.math.l
        public float a(float f11) {
            return f11 * f11 * (3.0f - (f11 * 2.0f));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class h extends l {
        @Override // com.badlogic.gdx.math.l
        public float a(float f11) {
            float f12 = f11 * f11 * (3.0f - (f11 * 2.0f));
            return f12 * f12 * (3.0f - (f12 * 2.0f));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class i extends l {
        @Override // com.badlogic.gdx.math.l
        public float a(float f11) {
            return f11 * f11 * f11 * ((f11 * ((6.0f * f11) - 15.0f)) + 10.0f);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class j extends l {
        @Override // com.badlogic.gdx.math.l
        public float a(float f11) {
            if (f11 < 1.0E-6f) {
                return 0.0f;
            }
            return (float) Math.sqrt(f11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class k extends l {
        @Override // com.badlogic.gdx.math.l
        public float a(float f11) {
            if (f11 < 1.0E-6f) {
                return 0.0f;
            }
            if (f11 > 1.0f) {
                return 1.0f;
            }
            return 1.0f - ((float) Math.sqrt(-(f11 - 1.0f)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.badlogic.gdx.math.l$l, reason: collision with other inner class name */
    public class C0193l extends l {
        @Override // com.badlogic.gdx.math.l
        public float a(float f11) {
            return (float) Math.cbrt(f11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class m extends l {
        @Override // com.badlogic.gdx.math.l
        public float a(float f11) {
            return 1.0f - ((float) Math.cbrt(-(f11 - 1.0f)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class n extends l {
        @Override // com.badlogic.gdx.math.l
        public float a(float f11) {
            return (1.0f - com.badlogic.gdx.math.n.s(f11 * 3.1415927f)) / 2.0f;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class o extends q {
        public o(float[] fArr, float[] fArr2) {
            super(fArr, fArr2);
        }

        @Override // com.badlogic.gdx.math.l.q, com.badlogic.gdx.math.l
        public float a(float f11) {
            return f11 <= 0.5f ? (1.0f - c(1.0f - (f11 * 2.0f))) / 2.0f : (c((f11 * 2.0f) - 1.0f) / 2.0f) + 0.5f;
        }

        public final float c(float f11) {
            float f12 = this.S[0];
            float f13 = (f12 / 2.0f) + f11;
            return f13 < f12 ? (f13 / (f12 / 2.0f)) - 1.0f : super.a(f11);
        }

        public o(int i11) {
            super(i11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class p extends q {
        public p(float[] fArr, float[] fArr2) {
            super(fArr, fArr2);
        }

        @Override // com.badlogic.gdx.math.l.q, com.badlogic.gdx.math.l
        public float a(float f11) {
            return 1.0f - super.a(1.0f - f11);
        }

        public p(int i11) {
            super(i11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class r extends l {
        public final float S;
        public final float T;
        public final float U;
        public final float V;

        public r(float f11, float f12, int i11, float f13) {
            this.S = f11;
            this.T = f12;
            this.U = f13;
            this.V = i11 * 3.1415927f * (i11 % 2 == 0 ? 1 : -1);
        }

        @Override // com.badlogic.gdx.math.l
        public float a(float f11) {
            if (f11 <= 0.5f) {
                return ((((float) Math.pow(this.S, this.T * (r8 - 1.0f))) * com.badlogic.gdx.math.n.Z((f11 * 2.0f) * this.V)) * this.U) / 2.0f;
            }
            return 1.0f - (((((float) Math.pow(this.S, this.T * (r8 - 1.0f))) * com.badlogic.gdx.math.n.Z(((1.0f - f11) * 2.0f) * this.V)) * this.U) / 2.0f);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class s extends r {
        public s(float f11, float f12, int i11, float f13) {
            super(f11, f12, i11, f13);
        }

        @Override // com.badlogic.gdx.math.l.r, com.badlogic.gdx.math.l
        public float a(float f11) {
            if (f11 >= 0.99d) {
                return 1.0f;
            }
            return ((float) Math.pow(this.S, this.T * (f11 - 1.0f))) * com.badlogic.gdx.math.n.Z(f11 * this.V) * this.U;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class t extends r {
        public t(float f11, float f12, int i11, float f13) {
            super(f11, f12, i11, f13);
        }

        @Override // com.badlogic.gdx.math.l.r, com.badlogic.gdx.math.l
        public float a(float f11) {
            if (f11 == 0.0f) {
                return 0.0f;
            }
            return 1.0f - ((((float) Math.pow(this.S, this.T * (r6 - 1.0f))) * com.badlogic.gdx.math.n.Z((1.0f - f11) * this.V)) * this.U);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class u extends l {
        public final float S;
        public final float T;
        public final float U;
        public final float V;

        public u(float f11, float f12) {
            this.S = f11;
            this.T = f12;
            float pow = (float) Math.pow(f11, -f12);
            this.U = pow;
            this.V = 1.0f / (1.0f - pow);
        }

        @Override // com.badlogic.gdx.math.l
        public float a(float f11) {
            return (f11 <= 0.5f ? (((float) Math.pow(this.S, this.T * ((f11 * 2.0f) - 1.0f))) - this.U) * this.V : 2.0f - ((((float) Math.pow(this.S, (-this.T) * ((f11 * 2.0f) - 1.0f))) - this.U) * this.V)) / 2.0f;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class v extends u {
        public v(float f11, float f12) {
            super(f11, f12);
        }

        @Override // com.badlogic.gdx.math.l.u, com.badlogic.gdx.math.l
        public float a(float f11) {
            return (((float) Math.pow(this.S, this.T * (f11 - 1.0f))) - this.U) * this.V;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class w extends u {
        public w(float f11, float f12) {
            super(f11, f12);
        }

        @Override // com.badlogic.gdx.math.l.u, com.badlogic.gdx.math.l
        public float a(float f11) {
            return 1.0f - ((((float) Math.pow(this.S, (-this.T) * f11)) - this.U) * this.V);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class x extends l {
        public final int S;

        public x(int i11) {
            this.S = i11;
        }

        @Override // com.badlogic.gdx.math.l
        public float a(float f11) {
            if (f11 <= 0.5f) {
                return ((float) Math.pow(f11 * 2.0f, this.S)) / 2.0f;
            }
            return (((float) Math.pow((f11 - 1.0f) * 2.0f, this.S)) / (this.S % 2 == 0 ? -2 : 2)) + 1.0f;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class y extends x {
        public y(int i11) {
            super(i11);
        }

        @Override // com.badlogic.gdx.math.l.x, com.badlogic.gdx.math.l
        public float a(float f11) {
            return (float) Math.pow(f11, this.S);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class z extends x {
        public z(int i11) {
            super(i11);
        }

        @Override // com.badlogic.gdx.math.l.x, com.badlogic.gdx.math.l
        public float a(float f11) {
            return (((float) Math.pow(f11 - 1.0f, this.S)) * (this.S % 2 == 0 ? -1 : 1)) + 1.0f;
        }
    }

    static {
        i iVar = new i();
        f12618d = iVar;
        f12619e = iVar;
        f12620f = new x(2);
        y yVar = new y(2);
        f12621g = yVar;
        f12622h = yVar;
        z zVar = new z(2);
        f12623i = zVar;
        f12624j = zVar;
        f12625k = new j();
        f12626l = new k();
        f12627m = new x(3);
        f12628n = new y(3);
        f12629o = new z(3);
        f12630p = new C0193l();
        f12631q = new m();
        f12632r = new x(4);
        f12633s = new y(4);
        f12634t = new z(4);
        f12635u = new x(5);
        f12636v = new y(5);
        f12637w = new z(5);
        f12638x = new n();
        f12639y = new a();
        f12640z = new b();
        A = new u(2.0f, 10.0f);
        B = new v(2.0f, 10.0f);
        C = new w(2.0f, 10.0f);
        D = new u(2.0f, 5.0f);
        E = new v(2.0f, 5.0f);
        F = new w(2.0f, 5.0f);
        G = new c();
        H = new d();
        I = new e();
        J = new r(2.0f, 10.0f, 7, 1.0f);
        K = new s(2.0f, 10.0f, 6, 1.0f);
        L = new t(2.0f, 10.0f, 7, 1.0f);
        M = new a0(1.5f);
        N = new b0(2.0f);
        O = new c0(2.0f);
        P = new o(4);
        Q = new p(4);
        R = new q(4);
    }

    public abstract float a(float f11);

    public float b(float f11, float f12, float f13) {
        return f11 + ((f12 - f11) * a(f13));
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class q extends l {
        public final float[] S;
        public final float[] T;

        public q(float[] fArr, float[] fArr2) {
            if (fArr.length != fArr2.length) {
                throw new IllegalArgumentException("Must be the same number of widths and heights.");
            }
            this.S = fArr;
            this.T = fArr2;
        }

        @Override // com.badlogic.gdx.math.l
        public float a(float f11) {
            if (f11 == 1.0f) {
                return 1.0f;
            }
            float[] fArr = this.S;
            int i11 = 0;
            float f12 = f11 + (fArr[0] / 2.0f);
            int length = fArr.length;
            float f13 = 0.0f;
            float f14 = 0.0f;
            while (true) {
                if (i11 >= length) {
                    break;
                }
                f14 = this.S[i11];
                if (f12 <= f14) {
                    f13 = this.T[i11];
                    break;
                }
                f12 -= f14;
                i11++;
            }
            float f15 = f12 / f14;
            float f16 = (4.0f / f14) * f13 * f15;
            return 1.0f - ((f16 - (f15 * f16)) * f14);
        }

        public q(int i11) {
            if (i11 >= 2 && i11 <= 5) {
                float[] fArr = new float[i11];
                this.S = fArr;
                float[] fArr2 = new float[i11];
                this.T = fArr2;
                fArr2[0] = 1.0f;
                if (i11 == 2) {
                    fArr[0] = 0.6f;
                    fArr[1] = 0.4f;
                    fArr2[1] = 0.33f;
                } else if (i11 == 3) {
                    fArr[0] = 0.4f;
                    fArr[1] = 0.4f;
                    fArr[2] = 0.2f;
                    fArr2[1] = 0.33f;
                    fArr2[2] = 0.1f;
                } else if (i11 == 4) {
                    fArr[0] = 0.34f;
                    fArr[1] = 0.34f;
                    fArr[2] = 0.2f;
                    fArr[3] = 0.15f;
                    fArr2[1] = 0.26f;
                    fArr2[2] = 0.11f;
                    fArr2[3] = 0.03f;
                } else if (i11 == 5) {
                    fArr[0] = 0.3f;
                    fArr[1] = 0.3f;
                    fArr[2] = 0.2f;
                    fArr[3] = 0.1f;
                    fArr[4] = 0.1f;
                    fArr2[1] = 0.45f;
                    fArr2[2] = 0.3f;
                    fArr2[3] = 0.15f;
                    fArr2[4] = 0.06f;
                }
                fArr[0] = fArr[0] * 2.0f;
                return;
            }
            throw new IllegalArgumentException("bounces cannot be < 2 or > 5: " + i11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class f extends l {
        @Override // com.badlogic.gdx.math.l
        public float a(float f11) {
            return f11;
        }
    }
}
