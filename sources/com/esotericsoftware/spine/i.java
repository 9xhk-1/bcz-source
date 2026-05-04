package com.esotericsoftware.spine;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.a;
import com.esotericsoftware.spine.Skeleton;
import jl.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class i implements j {

    /* renamed from: a, reason: collision with root package name */
    public final o f29466a;

    /* renamed from: b, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<b> f29467b;

    /* renamed from: c, reason: collision with root package name */
    public b f29468c;

    /* renamed from: d, reason: collision with root package name */
    public float f29469d;

    /* renamed from: e, reason: collision with root package name */
    public float f29470e;

    /* renamed from: f, reason: collision with root package name */
    public float f29471f;

    /* renamed from: g, reason: collision with root package name */
    public float f29472g;

    /* renamed from: h, reason: collision with root package name */
    public float f29473h;

    /* renamed from: i, reason: collision with root package name */
    public float f29474i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f29475j;

    /* renamed from: k, reason: collision with root package name */
    public final Vector2 f29476k;

    public i(o oVar, Skeleton skeleton) {
        this.f29476k = new Vector2();
        if (oVar == null) {
            throw new IllegalArgumentException("data cannot be null.");
        }
        if (skeleton == null) {
            throw new IllegalArgumentException("skeleton cannot be null.");
        }
        this.f29466a = oVar;
        this.f29467b = new com.badlogic.gdx.utils.a<>(oVar.f64423d.f13179b);
        a.b<BoneData> it = oVar.f64423d.iterator();
        while (it.hasNext()) {
            this.f29467b.a(skeleton.f29193b.get(it.next().f29164a));
        }
        this.f29468c = skeleton.f29193b.get(oVar.f64424e.f29164a);
        this.f29469d = oVar.f64425f;
        this.f29470e = oVar.f64426g;
        this.f29471f = oVar.f64427h;
        this.f29472g = oVar.f64428i;
        this.f29473h = oVar.f64429j;
        this.f29474i = oVar.f64430k;
    }

    @Override // com.esotericsoftware.spine.j
    public void a(Skeleton.Physics physics) {
        if (this.f29469d == 0.0f && this.f29470e == 0.0f && this.f29471f == 0.0f && this.f29472g == 0.0f && this.f29473h == 0.0f && this.f29474i == 0.0f) {
            return;
        }
        o oVar = this.f29466a;
        if (oVar.f64438s) {
            if (oVar.f64437r) {
                d();
                return;
            } else {
                b();
                return;
            }
        }
        if (oVar.f64437r) {
            e();
        } else {
            c();
        }
    }

    public final void b() {
        float f11;
        i iVar = this;
        float f12 = iVar.f29469d;
        float f13 = iVar.f29470e;
        float f14 = iVar.f29471f;
        float f15 = iVar.f29472g;
        float f16 = iVar.f29473h;
        float f17 = iVar.f29474i;
        b bVar = iVar.f29468c;
        com.badlogic.gdx.utils.a<b> aVar = iVar.f29467b;
        b[] bVarArr = aVar.f13178a;
        int i11 = aVar.f13179b;
        int i12 = 0;
        while (i12 < i11) {
            b bVar2 = bVarArr[i12];
            float f18 = bVar2.f29343n;
            if (f12 != 0.0f) {
                f18 += ((bVar.f29343n - f18) + iVar.f29466a.f64431l) * f12;
            }
            float f19 = f18;
            float f21 = bVar2.f29341l;
            float f22 = bVar2.f29342m;
            float f23 = bVar.f29341l - f21;
            float f24 = f12;
            o oVar = iVar.f29466a;
            float f25 = ((f23 + oVar.f64432m) * f13) + f21;
            float f26 = f22 + (((bVar.f29342m - f22) + oVar.f64433n) * f14);
            float f27 = bVar2.f29344o;
            float f28 = bVar2.f29345p;
            float f29 = (f15 == 0.0f || f27 == 0.0f) ? f27 : (f27 + (((bVar.f29344o - f27) + oVar.f64434o) * f15)) / f27;
            if (f16 == 0.0f || f28 == 0.0f) {
                f11 = f29;
            } else {
                f11 = f29;
                f28 = ((((bVar.f29345p - f28) + oVar.f64435p) * f16) + f28) / f28;
            }
            float f31 = bVar2.f29347r;
            bVar2.k0(f25, f26, f19, f11, f28, bVar2.f29346q, f17 != 0.0f ? f31 + (((bVar.f29347r - f31) + oVar.f64436q) * f17) : f31);
            i12++;
            iVar = this;
            f12 = f24;
        }
    }

    public final void c() {
        float f11;
        float f12;
        float f13;
        i iVar = this;
        float f14 = iVar.f29469d;
        float f15 = iVar.f29470e;
        float f16 = iVar.f29471f;
        float f17 = iVar.f29472g;
        float f18 = iVar.f29473h;
        float f19 = iVar.f29474i;
        boolean z11 = (f15 == 0.0f && f16 == 0.0f) ? false : true;
        b bVar = iVar.f29468c;
        float f21 = bVar.f29348s;
        float f22 = bVar.f29349t;
        float f23 = bVar.f29351v;
        float f24 = bVar.f29352w;
        float f25 = (f21 * f24) - (f22 * f23) > 0.0f ? 0.017453292f : -0.017453292f;
        o oVar = iVar.f29466a;
        float f26 = oVar.f64431l * f25;
        float f27 = oVar.f64436q * f25;
        com.badlogic.gdx.utils.a<b> aVar = iVar.f29467b;
        b[] bVarArr = aVar.f13178a;
        int i11 = aVar.f13179b;
        int i12 = 0;
        while (i12 < i11) {
            int i13 = i12;
            b bVar2 = bVarArr[i12];
            if (f14 != 0.0f) {
                f11 = f15;
                float f28 = bVar2.f29348s;
                f12 = f16;
                float f29 = bVar2.f29349t;
                float f31 = bVar2.f29351v;
                f13 = f17;
                float f32 = bVar2.f29352w;
                float b11 = (pl.g.b(f23, f21) - pl.g.b(f31, f28)) + f26;
                if (b11 > 3.1415927f) {
                    b11 -= 6.2831855f;
                } else if (b11 < -3.1415927f) {
                    b11 += 6.2831855f;
                }
                float f33 = b11 * f14;
                float d11 = pl.g.d(f33);
                float f34 = pl.g.f(f33);
                bVar2.f29348s = (d11 * f28) - (f34 * f31);
                bVar2.f29349t = (d11 * f29) - (f34 * f32);
                bVar2.f29351v = (f34 * f28) + (f31 * d11);
                bVar2.f29352w = (f34 * f29) + (d11 * f32);
            } else {
                f11 = f15;
                f12 = f16;
                f13 = f17;
            }
            if (z11) {
                Vector2 vector2 = iVar.f29476k;
                o oVar2 = iVar.f29466a;
                bVar.F(vector2.set(oVar2.f64432m, oVar2.f64433n));
                float f35 = bVar2.f29350u;
                bVar2.f29350u = f35 + ((vector2.f12535x - f35) * f11);
                float f36 = bVar2.f29353x;
                bVar2.f29353x = f36 + ((vector2.f12536y - f36) * f12);
            }
            if (f13 != 0.0f) {
                float f37 = bVar2.f29348s;
                float f38 = bVar2.f29351v;
                float sqrt = (float) Math.sqrt((f37 * f37) + (f38 * f38));
                if (sqrt != 0.0f) {
                    sqrt = ((((((float) Math.sqrt((f21 * f21) + (f23 * f23))) - sqrt) + iVar.f29466a.f64434o) * f13) + sqrt) / sqrt;
                }
                bVar2.f29348s *= sqrt;
                bVar2.f29351v *= sqrt;
            }
            if (f18 != 0.0f) {
                float f39 = bVar2.f29349t;
                float f41 = bVar2.f29352w;
                float sqrt2 = (float) Math.sqrt((f39 * f39) + (f41 * f41));
                if (sqrt2 != 0.0f) {
                    sqrt2 = ((((((float) Math.sqrt((f22 * f22) + (f24 * f24))) - sqrt2) + iVar.f29466a.f64435p) * f18) + sqrt2) / sqrt2;
                }
                bVar2.f29349t *= sqrt2;
                bVar2.f29352w *= sqrt2;
            }
            if (f19 > 0.0f) {
                float f42 = bVar2.f29349t;
                float b12 = pl.g.b(bVar2.f29352w, f42);
                float b13 = (pl.g.b(f24, f22) - pl.g.b(f23, f21)) - (b12 - pl.g.b(bVar2.f29351v, bVar2.f29348s));
                if (b13 > 3.1415927f) {
                    b13 -= 6.2831855f;
                } else if (b13 < -3.1415927f) {
                    b13 += 6.2831855f;
                }
                float f43 = b12 + ((b13 + f27) * f19);
                float sqrt3 = (float) Math.sqrt((f42 * f42) + (r3 * r3));
                bVar2.f29349t = pl.g.d(f43) * sqrt3;
                bVar2.f29352w = pl.g.f(f43) * sqrt3;
            }
            bVar2.i0();
            i12 = i13 + 1;
            iVar = this;
            f15 = f11;
            f16 = f12;
            f17 = f13;
        }
    }

    public final void d() {
        i iVar = this;
        float f11 = iVar.f29469d;
        float f12 = iVar.f29470e;
        float f13 = iVar.f29471f;
        float f14 = iVar.f29472g;
        float f15 = iVar.f29473h;
        float f16 = iVar.f29474i;
        b bVar = iVar.f29468c;
        com.badlogic.gdx.utils.a<b> aVar = iVar.f29467b;
        b[] bVarArr = aVar.f13178a;
        int i11 = aVar.f13179b;
        int i12 = 0;
        while (i12 < i11) {
            b bVar2 = bVarArr[i12];
            float f17 = bVar2.f29343n;
            float f18 = bVar.f29343n;
            o oVar = iVar.f29466a;
            float f19 = f17 + ((f18 + oVar.f64431l) * f11);
            bVar2.k0(((bVar.f29341l + oVar.f64432m) * f12) + bVar2.f29341l, bVar2.f29342m + ((bVar.f29342m + oVar.f64433n) * f13), f19, bVar2.f29344o * ((((bVar.f29344o - 1.0f) + oVar.f64434o) * f14) + 1.0f), bVar2.f29345p * ((((bVar.f29345p - 1.0f) + oVar.f64435p) * f15) + 1.0f), bVar2.f29346q, bVar2.f29347r + ((bVar.f29347r + oVar.f64436q) * f16));
            i12++;
            iVar = this;
        }
    }

    public final void e() {
        float f11;
        float f12;
        float f13;
        float f14;
        float f15 = this.f29469d;
        float f16 = this.f29470e;
        float f17 = this.f29471f;
        float f18 = this.f29472g;
        float f19 = this.f29473h;
        float f21 = this.f29474i;
        boolean z11 = (f16 == 0.0f && f17 == 0.0f) ? false : true;
        b bVar = this.f29468c;
        float f22 = bVar.f29348s;
        float f23 = bVar.f29349t;
        float f24 = bVar.f29351v;
        float f25 = bVar.f29352w;
        float f26 = (f22 * f25) - (f23 * f24) > 0.0f ? 0.017453292f : -0.017453292f;
        o oVar = this.f29466a;
        float f27 = oVar.f64431l * f26;
        float f28 = oVar.f64436q * f26;
        com.badlogic.gdx.utils.a<b> aVar = this.f29467b;
        b[] bVarArr = aVar.f13178a;
        int i11 = aVar.f13179b;
        int i12 = 0;
        while (i12 < i11) {
            int i13 = i12;
            b bVar2 = bVarArr[i12];
            if (f15 != 0.0f) {
                f11 = f16;
                float f29 = bVar2.f29348s;
                float f31 = bVar2.f29349t;
                float f32 = bVar2.f29351v;
                float f33 = bVar2.f29352w;
                float b11 = pl.g.b(f24, f22) + f27;
                if (b11 > 3.1415927f) {
                    b11 -= 6.2831855f;
                } else if (b11 < -3.1415927f) {
                    b11 += 6.2831855f;
                }
                float f34 = b11 * f15;
                float d11 = pl.g.d(f34);
                float f35 = pl.g.f(f34);
                bVar2.f29348s = (d11 * f29) - (f35 * f32);
                bVar2.f29349t = (d11 * f31) - (f35 * f33);
                bVar2.f29351v = (f35 * f29) + (d11 * f32);
                bVar2.f29352w = (f35 * f31) + (d11 * f33);
            } else {
                f11 = f16;
            }
            if (z11) {
                Vector2 vector2 = this.f29476k;
                f12 = f17;
                o oVar2 = this.f29466a;
                f13 = f18;
                bVar.F(vector2.set(oVar2.f64432m, oVar2.f64433n));
                bVar2.f29350u += vector2.f12535x * f11;
                bVar2.f29353x += vector2.f12536y * f12;
            } else {
                f12 = f17;
                f13 = f18;
            }
            if (f13 != 0.0f) {
                f14 = 1.0f;
                float sqrt = (((((float) Math.sqrt((f22 * f22) + (f24 * f24))) - 1.0f) + this.f29466a.f64434o) * f13) + 1.0f;
                bVar2.f29348s *= sqrt;
                bVar2.f29351v *= sqrt;
            } else {
                f14 = 1.0f;
            }
            if (f19 != 0.0f) {
                float sqrt2 = (((((float) Math.sqrt((f23 * f23) + (f25 * f25))) - f14) + this.f29466a.f64435p) * f19) + f14;
                bVar2.f29349t *= sqrt2;
                bVar2.f29352w *= sqrt2;
            }
            if (f21 > 0.0f) {
                float b12 = pl.g.b(f25, f23) - pl.g.b(f24, f22);
                if (b12 > 3.1415927f) {
                    b12 -= 6.2831855f;
                } else if (b12 < -3.1415927f) {
                    b12 += 6.2831855f;
                }
                float f36 = bVar2.f29349t;
                float b13 = pl.g.b(bVar2.f29352w, f36) + (((b12 - 1.5707964f) + f28) * f21);
                float sqrt3 = (float) Math.sqrt((f36 * f36) + (r4 * r4));
                bVar2.f29349t = pl.g.d(b13) * sqrt3;
                bVar2.f29352w = pl.g.f(b13) * sqrt3;
            }
            bVar2.i0();
            i12 = i13 + 1;
            f16 = f11;
            f17 = f12;
            f18 = f13;
        }
    }

    public com.badlogic.gdx.utils.a<b> f() {
        return this.f29467b;
    }

    public o g() {
        return this.f29466a;
    }

    public float h() {
        return this.f29469d;
    }

    public float i() {
        return this.f29472g;
    }

    @Override // com.esotericsoftware.spine.j
    public boolean isActive() {
        return this.f29475j;
    }

    public float j() {
        return this.f29473h;
    }

    public float k() {
        return this.f29474i;
    }

    public float l() {
        return this.f29470e;
    }

    public float m() {
        return this.f29471f;
    }

    public b n() {
        return this.f29468c;
    }

    public void o(float f11) {
        this.f29469d = f11;
    }

    public void p(float f11) {
        this.f29472g = f11;
    }

    public void q(float f11) {
        this.f29473h = f11;
    }

    public void r(float f11) {
        this.f29474i = f11;
    }

    public void s(float f11) {
        this.f29470e = f11;
    }

    public void t(float f11) {
        this.f29471f = f11;
    }

    public String toString() {
        return this.f29466a.f64303a;
    }

    public void u(b bVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("target cannot be null.");
        }
        this.f29468c = bVar;
    }

    public void v() {
        o oVar = this.f29466a;
        this.f29469d = oVar.f64425f;
        this.f29470e = oVar.f64426g;
        this.f29471f = oVar.f64427h;
        this.f29472g = oVar.f64428i;
        this.f29473h = oVar.f64429j;
        this.f29474i = oVar.f64430k;
    }

    public i(i iVar, Skeleton skeleton) {
        this(iVar.f29466a, skeleton);
        this.f29469d = iVar.f29469d;
        this.f29470e = iVar.f29470e;
        this.f29471f = iVar.f29471f;
        this.f29472g = iVar.f29472g;
        this.f29473h = iVar.f29473h;
        this.f29474i = iVar.f29474i;
    }
}
