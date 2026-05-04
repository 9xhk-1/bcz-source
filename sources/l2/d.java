package l2;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;
import p2.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class d extends p2.a {
    public float A;
    public int B;
    public float C;
    public int D;
    public int E;
    public boolean F;
    public boolean G;
    public float H;
    public float I;
    public boolean J;
    public Vector3 K;
    public boolean L;
    public boolean M;
    public boolean N;
    public int O;
    public boolean P;
    public int Q;
    public boolean R;
    public int S;
    public boolean T;
    public int U;
    public boolean V;
    public boolean W;
    public com.badlogic.gdx.graphics.a X;
    public int Y;
    public float Z;

    /* renamed from: f0, reason: collision with root package name */
    public float f69159f0;

    /* renamed from: f1, reason: collision with root package name */
    public final Vector3 f69160f1;

    /* renamed from: h1, reason: collision with root package name */
    public final Vector3 f69161h1;

    /* renamed from: i1, reason: collision with root package name */
    public final a f69162i1;

    /* renamed from: j1, reason: collision with root package name */
    public int f69163j1;

    /* renamed from: k1, reason: collision with root package name */
    public boolean f69164k1;

    /* renamed from: z, reason: collision with root package name */
    public int f69165z;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends a.b {

        /* renamed from: a, reason: collision with root package name */
        public d f69166a;

        /* renamed from: b, reason: collision with root package name */
        public float f69167b;

        @Override // p2.a.b, p2.a.c
        public boolean a(Vector2 vector2, Vector2 vector22, Vector2 vector23, Vector2 vector24) {
            return false;
        }

        @Override // p2.a.b, p2.a.c
        public boolean c(float f11, float f12, int i11, int i12) {
            this.f69167b = 0.0f;
            return false;
        }

        @Override // p2.a.b, p2.a.c
        public boolean e(float f11, float f12) {
            return false;
        }

        @Override // p2.a.b, p2.a.c
        public boolean f(float f11, float f12) {
            float f13 = f12 - f11;
            float f14 = f13 - this.f69167b;
            this.f69167b = f13;
            float width = q1.g.f81379b.getWidth();
            float height = q1.g.f81379b.getHeight();
            d dVar = this.f69166a;
            if (width > height) {
                width = height;
            }
            return dVar.j1(f14 / width);
        }

        @Override // p2.a.b, p2.a.c
        public boolean g(float f11, float f12, int i11) {
            return false;
        }

        @Override // p2.a.b, p2.a.c
        public boolean h(float f11, float f12, int i11, int i12) {
            return false;
        }

        @Override // p2.a.b, p2.a.c
        public boolean i(float f11, float f12, float f13, float f14) {
            return false;
        }
    }

    public d(a aVar, com.badlogic.gdx.graphics.a aVar2) {
        super(aVar);
        this.f69165z = 0;
        this.A = 360.0f;
        this.B = 1;
        this.C = 10.0f;
        this.D = 2;
        this.E = 0;
        this.G = true;
        this.H = -0.1f;
        this.I = 10.0f;
        this.J = true;
        this.K = new Vector3();
        this.L = true;
        this.M = true;
        this.N = false;
        this.O = 51;
        this.Q = 47;
        this.S = 29;
        this.U = 32;
        this.Y = -1;
        this.f69160f1 = new Vector3();
        this.f69161h1 = new Vector3();
        this.f69162i1 = aVar;
        aVar.f69166a = this;
        this.X = aVar2;
    }

    @Override // q1.h, q1.k
    public boolean D(float f11, float f12) {
        return n1(f12 * this.H * this.C);
    }

    @Override // p2.a, q1.h, q1.k
    public boolean I(int i11, int i12, int i13) {
        boolean I = super.I(i11, i12, i13);
        if (I || this.Y < 0) {
            return I;
        }
        float f11 = i11;
        float width = (f11 - this.Z) / q1.g.f81379b.getWidth();
        float f12 = i12;
        float height = (this.f69159f0 - f12) / q1.g.f81379b.getHeight();
        this.Z = f11;
        this.f69159f0 = f12;
        return k1(width, height, this.Y);
    }

    @Override // q1.h, q1.k
    public boolean X(int i11) {
        if (i11 == this.E) {
            this.F = false;
            this.Y = -1;
        }
        if (i11 == this.O) {
            this.P = false;
        } else if (i11 == this.Q) {
            this.R = false;
        } else if (i11 == this.S) {
            this.T = false;
        } else if (i11 == this.U) {
            this.V = false;
        }
        return false;
    }

    @Override // q1.h, q1.k
    public boolean Z(int i11) {
        if (i11 == this.E) {
            this.F = true;
        }
        if (i11 == this.O) {
            this.P = true;
            return false;
        }
        if (i11 == this.Q) {
            this.R = true;
            return false;
        }
        if (i11 == this.S) {
            this.T = true;
            return false;
        }
        if (i11 != this.U) {
            return false;
        }
        this.V = true;
        return false;
    }

    @Override // p2.a, q1.h, q1.k
    public boolean b(int i11, int i12, int i13, int i14) {
        this.f69163j1 = this.f69163j1 & ((1 << i13) ^ (-1));
        this.f69164k1 = !com.badlogic.gdx.math.n.y(r0);
        if (i14 == this.Y) {
            this.Y = -1;
        }
        return super.b(i11, i12, i13, i14) || this.F;
    }

    public boolean j1(float f11) {
        return n1(this.I * f11);
    }

    public boolean k1(float f11, float f12, int i11) {
        if (i11 == this.f69165z) {
            this.f69160f1.set(this.X.f11509b).crs(this.X.f11510c).f12538y = 0.0f;
            this.X.l(this.K, this.f69160f1.nor(), f12 * this.A);
            this.X.l(this.K, Vector3.Y, f11 * (-this.A));
        } else if (i11 == this.B) {
            com.badlogic.gdx.graphics.a aVar = this.X;
            aVar.o(this.f69160f1.set(aVar.f11509b).crs(this.X.f11510c).nor().scl((-f11) * this.C));
            com.badlogic.gdx.graphics.a aVar2 = this.X;
            aVar2.o(this.f69161h1.set(aVar2.f11510c).scl((-f12) * this.C));
            if (this.L) {
                this.K.add(this.f69160f1).add(this.f69161h1);
            }
        } else if (i11 == this.D) {
            com.badlogic.gdx.graphics.a aVar3 = this.X;
            aVar3.o(this.f69160f1.set(aVar3.f11509b).scl(f12 * this.C));
            if (this.M) {
                this.K.add(this.f69160f1);
            }
        }
        if (!this.J) {
            return true;
        }
        this.X.r();
        return true;
    }

    public void l1(boolean z11) {
        if (this.W != z11) {
            this.A = -this.A;
        }
        this.W = z11;
    }

    public void m1() {
        if (this.T || this.V || this.P || this.R) {
            float S = q1.g.f81379b.S();
            if (this.T) {
                com.badlogic.gdx.graphics.a aVar = this.X;
                aVar.k(aVar.f11510c, (-S) * this.A);
            }
            if (this.V) {
                com.badlogic.gdx.graphics.a aVar2 = this.X;
                aVar2.k(aVar2.f11510c, this.A * S);
            }
            if (this.P) {
                com.badlogic.gdx.graphics.a aVar3 = this.X;
                aVar3.o(this.f69160f1.set(aVar3.f11509b).scl(this.C * S));
                if (this.M) {
                    this.K.add(this.f69160f1);
                }
            }
            if (this.R) {
                com.badlogic.gdx.graphics.a aVar4 = this.X;
                aVar4.o(this.f69160f1.set(aVar4.f11509b).scl((-S) * this.C));
                if (this.M) {
                    this.K.add(this.f69160f1);
                }
            }
            if (this.J) {
                this.X.r();
            }
        }
    }

    public boolean n1(float f11) {
        if (!this.G && this.E != 0 && !this.F) {
            return false;
        }
        com.badlogic.gdx.graphics.a aVar = this.X;
        aVar.o(this.f69160f1.set(aVar.f11509b).scl(f11));
        if (this.N) {
            this.K.add(this.f69160f1);
        }
        if (!this.J) {
            return true;
        }
        this.X.r();
        return true;
    }

    @Override // p2.a, q1.h, q1.k
    public boolean o(int i11, int i12, int i13, int i14) {
        int i15 = this.f69163j1 | (1 << i13);
        this.f69163j1 = i15;
        boolean y11 = com.badlogic.gdx.math.n.y(i15);
        this.f69164k1 = !y11;
        if (!y11) {
            this.Y = -1;
        } else if (this.Y < 0 && (this.E == 0 || this.F)) {
            this.Z = i11;
            this.f69159f0 = i12;
            this.Y = i14;
        }
        return super.o(i11, i12, i13, i14) || this.E == 0 || this.F;
    }

    public d(com.badlogic.gdx.graphics.a aVar) {
        this(new a(), aVar);
    }
}
