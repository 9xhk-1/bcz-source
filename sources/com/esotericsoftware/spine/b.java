package com.esotericsoftware.spine;

import a3.d0;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Vector2;
import com.esotericsoftware.spine.BoneData;
import com.esotericsoftware.spine.Skeleton;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class b implements j {
    public boolean A;

    /* renamed from: a, reason: collision with root package name */
    public final BoneData f29330a;

    /* renamed from: b, reason: collision with root package name */
    public final Skeleton f29331b;

    /* renamed from: c, reason: collision with root package name */
    @d0
    public final b f29332c;

    /* renamed from: d, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<b> f29333d = new com.badlogic.gdx.utils.a<>();

    /* renamed from: e, reason: collision with root package name */
    public float f29334e;

    /* renamed from: f, reason: collision with root package name */
    public float f29335f;

    /* renamed from: g, reason: collision with root package name */
    public float f29336g;

    /* renamed from: h, reason: collision with root package name */
    public float f29337h;

    /* renamed from: i, reason: collision with root package name */
    public float f29338i;

    /* renamed from: j, reason: collision with root package name */
    public float f29339j;

    /* renamed from: k, reason: collision with root package name */
    public float f29340k;

    /* renamed from: l, reason: collision with root package name */
    public float f29341l;

    /* renamed from: m, reason: collision with root package name */
    public float f29342m;

    /* renamed from: n, reason: collision with root package name */
    public float f29343n;

    /* renamed from: o, reason: collision with root package name */
    public float f29344o;

    /* renamed from: p, reason: collision with root package name */
    public float f29345p;

    /* renamed from: q, reason: collision with root package name */
    public float f29346q;

    /* renamed from: r, reason: collision with root package name */
    public float f29347r;

    /* renamed from: s, reason: collision with root package name */
    public float f29348s;

    /* renamed from: t, reason: collision with root package name */
    public float f29349t;

    /* renamed from: u, reason: collision with root package name */
    public float f29350u;

    /* renamed from: v, reason: collision with root package name */
    public float f29351v;

    /* renamed from: w, reason: collision with root package name */
    public float f29352w;

    /* renamed from: x, reason: collision with root package name */
    public float f29353x;

    /* renamed from: y, reason: collision with root package name */
    public BoneData.Inherit f29354y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f29355z;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29356a;

        static {
            int[] iArr = new int[BoneData.Inherit.values().length];
            f29356a = iArr;
            try {
                iArr[BoneData.Inherit.normal.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29356a[BoneData.Inherit.onlyTranslation.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29356a[BoneData.Inherit.noRotationOrReflection.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29356a[BoneData.Inherit.noScale.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f29356a[BoneData.Inherit.noScaleOrReflection.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public b(BoneData boneData, Skeleton skeleton, @d0 b bVar) {
        if (boneData == null) {
            throw new IllegalArgumentException("data cannot be null.");
        }
        if (skeleton == null) {
            throw new IllegalArgumentException("skeleton cannot be null.");
        }
        this.f29330a = boneData;
        this.f29331b = skeleton;
        this.f29332c = bVar;
        d0();
    }

    public Matrix3 A(Matrix3 matrix3) {
        if (matrix3 == null) {
            throw new IllegalArgumentException("worldTransform cannot be null.");
        }
        float[] fArr = matrix3.val;
        fArr[0] = this.f29348s;
        fArr[3] = this.f29349t;
        fArr[1] = this.f29351v;
        fArr[4] = this.f29352w;
        fArr[6] = this.f29350u;
        fArr[7] = this.f29353x;
        fArr[2] = 0.0f;
        fArr[5] = 0.0f;
        fArr[8] = 1.0f;
        return matrix3;
    }

    public float B() {
        return this.f29350u;
    }

    public float C() {
        return this.f29353x;
    }

    public float D() {
        return this.f29334e;
    }

    public float E() {
        return this.f29335f;
    }

    public Vector2 F(Vector2 vector2) {
        if (vector2 == null) {
            throw new IllegalArgumentException("local cannot be null.");
        }
        float f11 = vector2.f12535x;
        float f12 = vector2.f12536y;
        vector2.f12535x = (this.f29348s * f11) + (this.f29349t * f12) + this.f29350u;
        vector2.f12536y = (f11 * this.f29351v) + (f12 * this.f29352w) + this.f29353x;
        return vector2;
    }

    public float G(float f11) {
        float f12 = ((f11 - this.f29336g) - this.f29339j) * 0.017453292f;
        float f13 = pl.g.f(f12);
        float d11 = pl.g.d(f12);
        return pl.g.c((this.f29351v * d11) + (this.f29352w * f13), (d11 * this.f29348s) + (f13 * this.f29349t));
    }

    public Vector2 H(Vector2 vector2) {
        if (vector2 == null) {
            throw new IllegalArgumentException("world cannot be null.");
        }
        b bVar = this.f29332c;
        return bVar == null ? vector2 : bVar.F(vector2);
    }

    public void I(float f11) {
        float f12 = f11 * 0.017453292f;
        float f13 = pl.g.f(f12);
        float d11 = pl.g.d(f12);
        float f14 = this.f29348s;
        float f15 = this.f29349t;
        float f16 = this.f29351v;
        this.f29348s = (d11 * f14) - (f13 * f16);
        float f17 = this.f29352w;
        this.f29349t = (d11 * f15) - (f13 * f17);
        this.f29351v = (f14 * f13) + (f16 * d11);
        this.f29352w = (f13 * f15) + (d11 * f17);
    }

    public void J(float f11) {
        this.f29348s = f11;
    }

    public void K(float f11) {
        this.f29343n = f11;
    }

    public void L(float f11) {
        this.f29344o = f11;
    }

    public void M(float f11) {
        this.f29345p = f11;
    }

    public void N(float f11) {
        this.f29346q = f11;
    }

    public void O(float f11) {
        this.f29347r = f11;
    }

    public void P(float f11) {
        this.f29341l = f11;
    }

    public void Q(float f11) {
        this.f29342m = f11;
    }

    public void R(float f11) {
        this.f29349t = f11;
    }

    public void S(float f11) {
        this.f29351v = f11;
    }

    public void T(float f11) {
        this.f29352w = f11;
    }

    public void U(BoneData.Inherit inherit) {
        if (inherit == null) {
            throw new IllegalArgumentException("inherit cannot be null.");
        }
        this.f29354y = inherit;
    }

    public void V(float f11, float f12) {
        this.f29334e = f11;
        this.f29335f = f12;
    }

    public void W(float f11) {
        this.f29336g = f11;
    }

    public void X(float f11) {
        this.f29337h = f11;
        this.f29338i = f11;
    }

    public void Y(float f11, float f12) {
        this.f29337h = f11;
        this.f29338i = f12;
    }

    public void Z(float f11) {
        this.f29337h = f11;
    }

    @Override // com.esotericsoftware.spine.j
    public void a(Skeleton.Physics physics) {
        k0(this.f29341l, this.f29342m, this.f29343n, this.f29344o, this.f29345p, this.f29346q, this.f29347r);
    }

    public void a0(float f11) {
        this.f29338i = f11;
    }

    public float b() {
        return this.f29348s;
    }

    public void b0(float f11) {
        this.f29339j = f11;
    }

    public float c() {
        return this.f29343n;
    }

    public void c0(float f11) {
        this.f29340k = f11;
    }

    public float d() {
        return this.f29344o;
    }

    public void d0() {
        BoneData boneData = this.f29330a;
        this.f29334e = boneData.f29168e;
        this.f29335f = boneData.f29169f;
        this.f29336g = boneData.f29170g;
        this.f29337h = boneData.f29171h;
        this.f29338i = boneData.f29172i;
        this.f29339j = boneData.f29173j;
        this.f29340k = boneData.f29174k;
        this.f29354y = boneData.f29175l;
    }

    public float e() {
        return this.f29345p;
    }

    public void e0(float f11) {
        this.f29350u = f11;
    }

    public float f() {
        return this.f29346q;
    }

    public void f0(float f11) {
        this.f29353x = f11;
    }

    public float g() {
        return this.f29347r;
    }

    public void g0(float f11) {
        this.f29334e = f11;
    }

    public float h() {
        return this.f29341l;
    }

    public void h0(float f11) {
        this.f29335f = f11;
    }

    public float i() {
        return this.f29342m;
    }

    public void i0() {
        float f11;
        float f12;
        float f13;
        float f14;
        b bVar = this.f29332c;
        if (bVar == null) {
            float f15 = this.f29350u;
            Skeleton skeleton = this.f29331b;
            this.f29341l = f15 - skeleton.f29203l;
            this.f29342m = this.f29353x - skeleton.f29204m;
            float f16 = this.f29348s;
            float f17 = this.f29349t;
            float f18 = this.f29351v;
            float f19 = this.f29352w;
            this.f29343n = pl.g.c(f18, f16);
            this.f29344o = (float) Math.sqrt((f16 * f16) + (f18 * f18));
            this.f29345p = (float) Math.sqrt((f17 * f17) + (f19 * f19));
            this.f29346q = 0.0f;
            this.f29347r = pl.g.c((f16 * f17) + (f18 * f19), (f16 * f19) - (f17 * f18));
            return;
        }
        float f21 = bVar.f29348s;
        float f22 = bVar.f29349t;
        float f23 = bVar.f29351v;
        float f24 = bVar.f29352w;
        float f25 = (f21 * f24) - (f22 * f23);
        float f26 = 1.0f / f25;
        float f27 = f24 * f26;
        float f28 = f22 * f26;
        float f29 = f23 * f26;
        float f31 = f21 * f26;
        float f32 = this.f29350u - bVar.f29350u;
        float f33 = this.f29353x - bVar.f29353x;
        this.f29341l = (f32 * f27) - (f33 * f28);
        this.f29342m = (f33 * f31) - (f32 * f29);
        BoneData.Inherit inherit = this.f29354y;
        if (inherit == BoneData.Inherit.onlyTranslation) {
            f13 = this.f29348s;
            f14 = this.f29349t;
            f11 = this.f29351v;
            f12 = this.f29352w;
        } else {
            int i11 = a.f29356a[inherit.ordinal()];
            if (i11 == 3) {
                float abs = Math.abs(f25) / ((f21 * f21) + (f23 * f23));
                Skeleton skeleton2 = this.f29331b;
                float f34 = skeleton2.f29205n;
                float f35 = skeleton2.f29206o;
                float f36 = (-(f23 / f35)) * abs * f34;
                float f37 = (f21 / f34) * abs * f35;
                float f38 = 1.0f / ((f21 * f37) - (f23 * f36));
                f27 = f37 * f38;
                f28 = f36 * f38;
            } else if (i11 == 4 || i11 == 5) {
                float f39 = this.f29336g * 0.017453292f;
                float d11 = pl.g.d(f39);
                float f41 = pl.g.f(f39);
                float f42 = (f21 * d11) + (f22 * f41);
                Skeleton skeleton3 = this.f29331b;
                float f43 = f42 / skeleton3.f29205n;
                float f44 = ((f23 * d11) + (f24 * f41)) / skeleton3.f29206o;
                float sqrt = (float) Math.sqrt((f43 * f43) + (f44 * f44));
                if (sqrt > 1.0E-5f) {
                    sqrt = 1.0f / sqrt;
                }
                float f45 = f43 * sqrt;
                float f46 = f44 * sqrt;
                float sqrt2 = (float) Math.sqrt((f45 * f45) + (f46 * f46));
                if (this.f29354y == BoneData.Inherit.noScale) {
                    boolean z11 = f26 < 0.0f;
                    Skeleton skeleton4 = this.f29331b;
                    if (z11 != (((skeleton4.f29205n > 0.0f ? 1 : (skeleton4.f29205n == 0.0f ? 0 : -1)) < 0) != ((skeleton4.f29206o > 0.0f ? 1 : (skeleton4.f29206o == 0.0f ? 0 : -1)) < 0))) {
                        sqrt2 = -sqrt2;
                    }
                }
                float b11 = pl.g.b(f46, f45) + 1.5707964f;
                float d12 = pl.g.d(b11) * sqrt2;
                float f47 = pl.g.f(b11) * sqrt2;
                float f48 = 1.0f / ((f45 * f47) - (d12 * f46));
                f27 = f47 * f48;
                f28 = d12 * f48;
                f29 = f46 * f48;
                f31 = f45 * f48;
            }
            float f49 = this.f29348s;
            float f51 = this.f29351v;
            float f52 = (f27 * f49) - (f28 * f51);
            float f53 = this.f29349t;
            float f54 = this.f29352w;
            float f55 = (f27 * f53) - (f28 * f54);
            f11 = (f51 * f31) - (f49 * f29);
            f12 = (f31 * f54) - (f29 * f53);
            f13 = f52;
            f14 = f55;
        }
        this.f29346q = 0.0f;
        float sqrt3 = (float) Math.sqrt((f13 * f13) + (f11 * f11));
        this.f29344o = sqrt3;
        if (sqrt3 > 1.0E-4f) {
            float f56 = (f13 * f12) - (f14 * f11);
            this.f29345p = f56 / sqrt3;
            this.f29347r = -pl.g.c((f14 * f13) + (f12 * f11), f56);
            this.f29343n = pl.g.c(f11, f13);
            return;
        }
        this.f29344o = 0.0f;
        this.f29345p = (float) Math.sqrt((f14 * f14) + (f12 * f12));
        this.f29347r = 0.0f;
        this.f29343n = 90.0f - pl.g.c(f12, f14);
    }

    @Override // com.esotericsoftware.spine.j
    public boolean isActive() {
        return this.A;
    }

    public float j() {
        return this.f29349t;
    }

    public void j0() {
        k0(this.f29334e, this.f29335f, this.f29336g, this.f29337h, this.f29338i, this.f29339j, this.f29340k);
    }

    public float k() {
        return this.f29351v;
    }

    public void k0(float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        float c11;
        float f18;
        this.f29341l = f11;
        this.f29342m = f12;
        this.f29343n = f13;
        this.f29344o = f14;
        this.f29345p = f15;
        this.f29346q = f16;
        this.f29347r = f17;
        b bVar = this.f29332c;
        if (bVar == null) {
            Skeleton skeleton = this.f29331b;
            float f19 = skeleton.f29205n;
            float f21 = skeleton.f29206o;
            float f22 = (f16 + f13) * 0.017453292f;
            float f23 = (f13 + 90.0f + f17) * 0.017453292f;
            this.f29348s = pl.g.d(f22) * f14 * f19;
            this.f29349t = pl.g.d(f23) * f15 * f19;
            this.f29351v = pl.g.f(f22) * f14 * f21;
            this.f29352w = pl.g.f(f23) * f15 * f21;
            this.f29350u = (f11 * f19) + skeleton.f29203l;
            this.f29353x = (f12 * f21) + skeleton.f29204m;
            return;
        }
        float f24 = bVar.f29348s;
        float f25 = bVar.f29349t;
        float f26 = bVar.f29351v;
        float f27 = bVar.f29352w;
        this.f29350u = (f24 * f11) + (f25 * f12) + bVar.f29350u;
        this.f29353x = (f11 * f26) + (f12 * f27) + bVar.f29353x;
        int i11 = a.f29356a[this.f29354y.ordinal()];
        if (i11 == 1) {
            float f28 = (f13 + f16) * 0.017453292f;
            float f29 = (f13 + 90.0f + f17) * 0.017453292f;
            float d11 = pl.g.d(f28) * f14;
            float d12 = pl.g.d(f29) * f15;
            float f31 = pl.g.f(f28) * f14;
            float f32 = pl.g.f(f29) * f15;
            this.f29348s = (f24 * d11) + (f25 * f31);
            this.f29349t = (f24 * d12) + (f25 * f32);
            this.f29351v = (d11 * f26) + (f31 * f27);
            this.f29352w = (f26 * d12) + (f27 * f32);
            return;
        }
        if (i11 != 2) {
            float f33 = 0.0f;
            if (i11 == 3) {
                float f34 = (f24 * f24) + (f26 * f26);
                if (f34 > 1.0E-4f) {
                    float abs = Math.abs((f27 * f24) - (f25 * f26)) / f34;
                    Skeleton skeleton2 = this.f29331b;
                    f33 = f24 / skeleton2.f29205n;
                    f18 = f26 / skeleton2.f29206o;
                    f25 = f18 * abs;
                    f27 = f33 * abs;
                    c11 = pl.g.c(f18, f33);
                } else {
                    c11 = 90.0f - pl.g.c(f27, f25);
                    f18 = 0.0f;
                }
                float f35 = ((f16 + f13) - c11) * 0.017453292f;
                float f36 = (((f13 + f17) - c11) + 90.0f) * 0.017453292f;
                float d13 = pl.g.d(f35) * f14;
                float d14 = pl.g.d(f36) * f15;
                float f37 = pl.g.f(f35) * f14;
                float f38 = pl.g.f(f36) * f15;
                this.f29348s = (f33 * d13) - (f25 * f37);
                this.f29349t = (f33 * d14) - (f25 * f38);
                this.f29351v = (d13 * f18) + (f37 * f27);
                this.f29352w = (f18 * d14) + (f27 * f38);
            } else if (i11 == 4 || i11 == 5) {
                float f39 = f13 * 0.017453292f;
                float d15 = pl.g.d(f39);
                float f41 = pl.g.f(f39);
                Skeleton skeleton3 = this.f29331b;
                float f42 = ((f24 * d15) + (f25 * f41)) / skeleton3.f29205n;
                float f43 = ((d15 * f26) + (f41 * f27)) / skeleton3.f29206o;
                float sqrt = (float) Math.sqrt((f42 * f42) + (f43 * f43));
                if (sqrt > 1.0E-5f) {
                    sqrt = 1.0f / sqrt;
                }
                float f44 = f42 * sqrt;
                float f45 = f43 * sqrt;
                float sqrt2 = (float) Math.sqrt((f44 * f44) + (f45 * f45));
                if (this.f29354y == BoneData.Inherit.noScale) {
                    boolean z11 = (f24 * f27) - (f25 * f26) < 0.0f;
                    Skeleton skeleton4 = this.f29331b;
                    if (z11 != (((skeleton4.f29205n > 0.0f ? 1 : (skeleton4.f29205n == 0.0f ? 0 : -1)) < 0) != ((skeleton4.f29206o > 0.0f ? 1 : (skeleton4.f29206o == 0.0f ? 0 : -1)) < 0))) {
                        sqrt2 = -sqrt2;
                    }
                }
                float b11 = pl.g.b(f45, f44) + 1.5707964f;
                float d16 = pl.g.d(b11) * sqrt2;
                float f46 = pl.g.f(b11) * sqrt2;
                float f47 = f16 * 0.017453292f;
                float f48 = (f17 + 90.0f) * 0.017453292f;
                float d17 = pl.g.d(f47) * f14;
                float d18 = pl.g.d(f48) * f15;
                float f49 = pl.g.f(f47) * f14;
                float f51 = pl.g.f(f48) * f15;
                this.f29348s = (f44 * d17) + (d16 * f49);
                this.f29349t = (f44 * d18) + (d16 * f51);
                this.f29351v = (d17 * f45) + (f49 * f46);
                this.f29352w = (f45 * d18) + (f46 * f51);
            }
        } else {
            float f52 = (f13 + f16) * 0.017453292f;
            float f53 = (f13 + 90.0f + f17) * 0.017453292f;
            this.f29348s = pl.g.d(f52) * f14;
            this.f29349t = pl.g.d(f53) * f15;
            this.f29351v = pl.g.f(f52) * f14;
            this.f29352w = pl.g.f(f53) * f15;
        }
        float f54 = this.f29348s;
        Skeleton skeleton5 = this.f29331b;
        float f55 = skeleton5.f29205n;
        this.f29348s = f54 * f55;
        this.f29349t *= f55;
        float f56 = this.f29351v;
        float f57 = skeleton5.f29206o;
        this.f29351v = f56 * f57;
        this.f29352w *= f57;
    }

    public com.badlogic.gdx.utils.a<b> l() {
        return this.f29333d;
    }

    public Vector2 l0(Vector2 vector2) {
        if (vector2 == null) {
            throw new IllegalArgumentException("world cannot be null.");
        }
        float f11 = this.f29348s;
        float f12 = this.f29352w;
        float f13 = this.f29349t;
        float f14 = this.f29351v;
        float f15 = (f11 * f12) - (f13 * f14);
        float f16 = vector2.f12535x - this.f29350u;
        float f17 = vector2.f12536y - this.f29353x;
        vector2.f12535x = ((f12 * f16) - (f13 * f17)) / f15;
        vector2.f12536y = ((f17 * f11) - (f16 * f14)) / f15;
        return vector2;
    }

    public float m() {
        return this.f29352w;
    }

    public float m0(float f11) {
        float f12 = f11 * 0.017453292f;
        float f13 = pl.g.f(f12);
        float d11 = pl.g.d(f12);
        return (pl.g.c((this.f29348s * f13) - (this.f29351v * d11), (this.f29352w * d11) - (this.f29349t * f13)) + this.f29336g) - this.f29339j;
    }

    public BoneData n() {
        return this.f29330a;
    }

    public Vector2 n0(Vector2 vector2) {
        if (vector2 == null) {
            throw new IllegalArgumentException("world cannot be null.");
        }
        b bVar = this.f29332c;
        return bVar == null ? vector2 : bVar.l0(vector2);
    }

    public BoneData.Inherit o() {
        return this.f29354y;
    }

    @d0
    public b p() {
        return this.f29332c;
    }

    public float q() {
        return this.f29336g;
    }

    public float r() {
        return this.f29337h;
    }

    public float s() {
        return this.f29338i;
    }

    public float t() {
        return this.f29339j;
    }

    public String toString() {
        return this.f29330a.f29165b;
    }

    public float u() {
        return this.f29340k;
    }

    public Skeleton v() {
        return this.f29331b;
    }

    public float w() {
        return pl.g.c(this.f29351v, this.f29348s);
    }

    public float x() {
        return pl.g.c(this.f29352w, this.f29349t);
    }

    public float y() {
        float f11 = this.f29348s;
        float f12 = this.f29351v;
        return (float) Math.sqrt((f11 * f11) + (f12 * f12));
    }

    public float z() {
        float f11 = this.f29349t;
        float f12 = this.f29352w;
        return (float) Math.sqrt((f11 * f11) + (f12 * f12));
    }

    public b(b bVar, Skeleton skeleton, @d0 b bVar2) {
        if (bVar == null) {
            throw new IllegalArgumentException("bone cannot be null.");
        }
        if (skeleton != null) {
            this.f29331b = skeleton;
            this.f29332c = bVar2;
            this.f29330a = bVar.f29330a;
            this.f29334e = bVar.f29334e;
            this.f29335f = bVar.f29335f;
            this.f29336g = bVar.f29336g;
            this.f29337h = bVar.f29337h;
            this.f29338i = bVar.f29338i;
            this.f29339j = bVar.f29339j;
            this.f29340k = bVar.f29340k;
            this.f29354y = bVar.f29354y;
            return;
        }
        throw new IllegalArgumentException("skeleton cannot be null.");
    }
}
