package jl;

import a3.r;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Vector2;
import com.esotericsoftware.spine.Skeleton;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class l {

    /* renamed from: q, reason: collision with root package name */
    public static final com.badlogic.gdx.graphics.b f64386q = com.badlogic.gdx.graphics.b.F;

    /* renamed from: r, reason: collision with root package name */
    public static final com.badlogic.gdx.graphics.b f64387r = com.badlogic.gdx.graphics.b.f11537t;

    /* renamed from: s, reason: collision with root package name */
    public static final com.badlogic.gdx.graphics.b f64388s = new com.badlogic.gdx.graphics.b(0.0f, 0.0f, 1.0f, 0.5f);

    /* renamed from: t, reason: collision with root package name */
    public static final com.badlogic.gdx.graphics.b f64389t = new com.badlogic.gdx.graphics.b(1.0f, 0.64f, 0.0f, 0.5f);

    /* renamed from: u, reason: collision with root package name */
    public static final com.badlogic.gdx.graphics.b f64390u = new com.badlogic.gdx.graphics.b(0.0f, 1.0f, 0.0f, 0.5f);

    /* renamed from: a, reason: collision with root package name */
    public final ShapeRenderer f64391a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f64392b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f64393c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f64394d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f64395e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f64396f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f64397g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f64398h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f64399i;

    /* renamed from: j, reason: collision with root package name */
    public final h f64400j;

    /* renamed from: k, reason: collision with root package name */
    public final r f64401k;

    /* renamed from: l, reason: collision with root package name */
    public float f64402l;

    /* renamed from: m, reason: collision with root package name */
    public float f64403m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f64404n;

    /* renamed from: o, reason: collision with root package name */
    public final Vector2 f64405o;

    /* renamed from: p, reason: collision with root package name */
    public final Vector2 f64406p;

    public l() {
        this.f64392b = true;
        this.f64393c = true;
        this.f64394d = true;
        this.f64395e = true;
        this.f64396f = true;
        this.f64397g = true;
        this.f64398h = true;
        this.f64399i = true;
        this.f64400j = new h();
        this.f64401k = new r(32);
        this.f64402l = 1.0f;
        this.f64403m = 2.0f;
        this.f64405o = new Vector2();
        this.f64406p = new Vector2();
        this.f64391a = new ShapeRenderer();
    }

    public void a(Skeleton skeleton) {
        float f11;
        short s11;
        com.badlogic.gdx.graphics.b bVar;
        float f12;
        int i11;
        short s12;
        int i12;
        float f13;
        if (skeleton == null) {
            throw new IllegalArgumentException("skeleton cannot be null.");
        }
        q1.g.f81384g.glEnable(com.badlogic.gdx.graphics.f.f11564c0);
        char c11 = 1;
        q1.g.f81384g.glBlendFunc(this.f64404n ? 1 : com.badlogic.gdx.graphics.f.f11653r, com.badlogic.gdx.graphics.f.f11659s);
        ShapeRenderer shapeRenderer = this.f64391a;
        com.badlogic.gdx.utils.a<com.esotericsoftware.spine.b> i13 = skeleton.i();
        com.badlogic.gdx.utils.a<m> v11 = skeleton.v();
        shapeRenderer.z(ShapeRenderer.ShapeType.Filled);
        float f14 = 2.0f;
        int i14 = 0;
        if (this.f64392b) {
            int i15 = i13.f13179b;
            int i16 = 0;
            while (i16 < i15) {
                com.esotericsoftware.spine.b bVar2 = i13.get(i16);
                if (bVar2.f29332c == null || !bVar2.A) {
                    i12 = i16;
                    f13 = f14;
                } else {
                    float f15 = bVar2.f29330a.f29167d;
                    float f16 = this.f64403m;
                    if (f15 == 0.0f) {
                        f16 /= f14;
                        shapeRenderer.h(f64387r);
                        f15 = 8.0f;
                    } else {
                        shapeRenderer.h(f64386q);
                    }
                    float f17 = bVar2.f29348s * f15;
                    i12 = i16;
                    float f18 = bVar2.f29350u;
                    f13 = f14;
                    float f19 = f15 * bVar2.f29351v;
                    float f21 = bVar2.f29353x;
                    shapeRenderer.r1(f18, f21, f17 + f18, f19 + f21, f16 * this.f64402l);
                }
                i16 = i12 + 1;
                f14 = f13;
            }
            f11 = f14;
            shapeRenderer.C1(skeleton.z(), skeleton.A(), this.f64402l * 4.0f);
        } else {
            f11 = 2.0f;
        }
        if (this.f64395e) {
            shapeRenderer.h(f64387r);
            int i17 = v11.f13179b;
            for (int i18 = 0; i18 < i17; i18++) {
                m mVar = v11.get(i18);
                ol.b bVar3 = mVar.f64411e;
                if (bVar3 instanceof ol.i) {
                    ol.i iVar = (ol.i) bVar3;
                    iVar.j(mVar.b(), this.f64405o);
                    this.f64406p.set(8.0f, 0.0f).rotate(iVar.k(mVar.b()));
                    shapeRenderer.t1(this.f64405o, this.f64406p, (this.f64403m / f11) * this.f64402l);
                }
            }
        }
        shapeRenderer.end();
        shapeRenderer.z(ShapeRenderer.ShapeType.Line);
        short s13 = 2;
        if (this.f64393c) {
            shapeRenderer.h(f64388s);
            int i19 = v11.f13179b;
            for (int i21 = 0; i21 < i19; i21++) {
                m mVar2 = v11.get(i21);
                ol.b bVar4 = mVar2.f64411e;
                if (bVar4 instanceof ol.j) {
                    float[] fArr = this.f64401k.f1625a;
                    ((ol.j) bVar4).j(mVar2, fArr, 0, 2);
                    shapeRenderer.c1(fArr[0], fArr[1], fArr[2], fArr[3]);
                    shapeRenderer.c1(fArr[2], fArr[3], fArr[4], fArr[5]);
                    shapeRenderer.c1(fArr[4], fArr[5], fArr[6], fArr[7]);
                    shapeRenderer.c1(fArr[6], fArr[7], fArr[0], fArr[1]);
                }
            }
        }
        if (this.f64396f || this.f64397g) {
            int i22 = v11.f13179b;
            int i23 = 0;
            while (i23 < i22) {
                m mVar3 = v11.get(i23);
                ol.b bVar5 = mVar3.f64411e;
                if (bVar5 instanceof ol.g) {
                    ol.g gVar = (ol.g) bVar5;
                    float[] I = this.f64401k.I(gVar.o());
                    gVar.j(mVar3, 0, gVar.o(), I, 0, 2);
                    short[] A = gVar.A();
                    int x11 = gVar.x();
                    if (this.f64397g) {
                        shapeRenderer.h(f64389t);
                        int i24 = 0;
                        for (int length = A.length; i24 < length; length = length) {
                            int i25 = A[i24] * s13;
                            int i26 = A[i24 + 1] * s13;
                            int i27 = A[i24 + 2] * 2;
                            shapeRenderer.z1(I[i25], I[i25 + 1], I[i26], I[i26 + 1], I[i27], I[i27 + 1]);
                            i24 += 3;
                            x11 = x11;
                            s13 = s13;
                            A = A;
                        }
                    }
                    s11 = s13;
                    int i28 = x11;
                    if (this.f64396f && i28 > 0) {
                        shapeRenderer.h(f64388s);
                        float f22 = I[i28 - 2];
                        float f23 = I[i28 - 1];
                        int i29 = 0;
                        while (i29 < i28) {
                            float f24 = I[i29];
                            float f25 = I[i29 + 1];
                            shapeRenderer.c1(f24, f25, f22, f23);
                            i29 += 2;
                            f22 = f24;
                            f23 = f25;
                        }
                    }
                } else {
                    s11 = s13;
                }
                i23++;
                s13 = s11;
            }
        }
        short s14 = s13;
        if (this.f64394d) {
            h hVar = this.f64400j;
            hVar.r(skeleton, true);
            shapeRenderer.h(f64390u);
            shapeRenderer.n1(hVar.k(), hVar.l(), hVar.o(), hVar.h());
            com.badlogic.gdx.utils.a<r> n11 = hVar.n();
            com.badlogic.gdx.utils.a<ol.d> g11 = hVar.g();
            int i31 = n11.f13179b;
            for (int i32 = 0; i32 < i31; i32++) {
                r rVar = n11.get(i32);
                shapeRenderer.h(g11.get(i32).e());
                shapeRenderer.k1(rVar.f1625a, 0, rVar.f1626b);
            }
        }
        if (this.f64399i) {
            int i33 = v11.f13179b;
            for (int i34 = 0; i34 < i33; i34++) {
                m mVar4 = v11.get(i34);
                ol.b bVar6 = mVar4.f64411e;
                if (bVar6 instanceof ol.e) {
                    ol.e eVar = (ol.e) bVar6;
                    int o11 = eVar.o();
                    float[] I2 = this.f64401k.I(o11);
                    eVar.j(mVar4, 0, o11, I2, 0, 2);
                    shapeRenderer.h(eVar.e());
                    for (int i35 = s14; i35 < o11; i35 += 2) {
                        shapeRenderer.c1(I2[i35 - 2], I2[i35 - 1], I2[i35], I2[i35 + 1]);
                    }
                    shapeRenderer.c1(I2[0], I2[1], I2[o11 - 2], I2[o11 - 1]);
                }
            }
        }
        if (this.f64398h) {
            int i36 = v11.f13179b;
            int i37 = 0;
            while (i37 < i36) {
                m mVar5 = v11.get(i37);
                ol.b bVar7 = mVar5.f64411e;
                if (bVar7 instanceof ol.h) {
                    ol.h hVar2 = (ol.h) bVar7;
                    int o12 = hVar2.o();
                    float[] I3 = this.f64401k.I(o12);
                    hVar2.j(mVar5, 0, o12, I3, 0, 2);
                    com.badlogic.gdx.graphics.b e11 = hVar2.e();
                    float f26 = I3[s14];
                    float f27 = I3[3];
                    if (hVar2.v()) {
                        shapeRenderer.h(e11);
                        f12 = f26;
                        float f28 = I3[i14];
                        float f29 = I3[c11];
                        float f31 = I3[o12 - 2];
                        float f32 = I3[o12 - 1];
                        float f33 = I3[o12 - 4];
                        float f34 = I3[o12 - 3];
                        i11 = i14;
                        bVar = e11;
                        s12 = s14;
                        shapeRenderer.n0(f12, f27, f28, f29, f31, f32, f33, f34, 32);
                        shapeRenderer.h(com.badlogic.gdx.graphics.b.f11523f);
                        shapeRenderer.c1(f12, f27, f28, f29);
                        shapeRenderer.c1(f33, f34, f31, f32);
                    } else {
                        bVar = e11;
                        f12 = f26;
                        i11 = i14;
                        s12 = s14;
                    }
                    int i38 = o12 - 4;
                    int i39 = 4;
                    while (i39 < i38) {
                        int i41 = i38;
                        float f35 = I3[i39];
                        float f36 = I3[i39 + 1];
                        float f37 = I3[i39 + 2];
                        float f38 = I3[i39 + 3];
                        float f39 = I3[i39 + 4];
                        float f41 = I3[i39 + 5];
                        shapeRenderer.h(bVar);
                        shapeRenderer.n0(f12, f27, f35, f36, f37, f38, f39, f41, 32);
                        shapeRenderer.h(com.badlogic.gdx.graphics.b.f11523f);
                        shapeRenderer.c1(f12, f27, f35, f36);
                        shapeRenderer.c1(f39, f41, f37, f38);
                        i39 += 6;
                        f12 = f39;
                        f27 = f41;
                        i38 = i41;
                    }
                } else {
                    i11 = i14;
                    s12 = s14;
                }
                i37++;
                s14 = s12;
                i14 = i11;
                c11 = 1;
            }
        }
        int i42 = i14;
        shapeRenderer.end();
        shapeRenderer.z(ShapeRenderer.ShapeType.Filled);
        if (this.f64392b) {
            shapeRenderer.h(f64387r);
            int i43 = i13.f13179b;
            for (int i44 = i42; i44 < i43; i44++) {
                com.esotericsoftware.spine.b bVar8 = i13.get(i44);
                if (bVar8.A) {
                    shapeRenderer.X(bVar8.f29350u, bVar8.f29353x, this.f64402l * 3.0f, 8);
                }
            }
        }
        if (this.f64395e) {
            shapeRenderer.h(f64387r);
            int i45 = v11.f13179b;
            for (int i46 = i42; i46 < i45; i46++) {
                m mVar6 = v11.get(i46);
                ol.b bVar9 = mVar6.f64411e;
                if (bVar9 instanceof ol.i) {
                    ((ol.i) bVar9).j(mVar6.b(), this.f64405o);
                    Vector2 vector2 = this.f64405o;
                    shapeRenderer.X(vector2.f12535x, vector2.f12536y, this.f64402l * 3.0f, 8);
                }
            }
        }
        shapeRenderer.end();
    }

    public ShapeRenderer b() {
        return this.f64391a;
    }

    public void c(boolean z11) {
        this.f64392b = z11;
    }

    public void d(boolean z11) {
        this.f64394d = z11;
    }

    public void e(boolean z11) {
        this.f64399i = z11;
    }

    public void f(boolean z11) {
        this.f64396f = z11;
    }

    public void g(boolean z11) {
        this.f64397g = z11;
    }

    public void h(boolean z11) {
        this.f64398h = z11;
    }

    public void i(boolean z11) {
        this.f64395e = z11;
    }

    public void j(boolean z11) {
        this.f64404n = z11;
    }

    public void k(boolean z11) {
        this.f64393c = z11;
    }

    public void l(float f11) {
        this.f64402l = f11;
    }

    public l(ShapeRenderer shapeRenderer) {
        this.f64392b = true;
        this.f64393c = true;
        this.f64394d = true;
        this.f64395e = true;
        this.f64396f = true;
        this.f64397g = true;
        this.f64398h = true;
        this.f64399i = true;
        this.f64400j = new h();
        this.f64401k = new r(32);
        this.f64402l = 1.0f;
        this.f64403m = 2.0f;
        this.f64405o = new Vector2();
        this.f64406p = new Vector2();
        if (shapeRenderer != null) {
            this.f64391a = shapeRenderer;
            return;
        }
        throw new IllegalArgumentException("shapes cannot be null.");
    }
}
