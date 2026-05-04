package jl;

import a3.e0;
import a3.r;
import a3.t0;
import com.badlogic.gdx.graphics.Texture;
import com.esotericsoftware.spine.BlendMode;
import com.esotericsoftware.spine.Skeleton;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class k {

    /* renamed from: e, reason: collision with root package name */
    public static final short[] f64381e = {0, 1, 2, 2, 3, 0};

    /* renamed from: a, reason: collision with root package name */
    public boolean f64382a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f64383b;

    /* renamed from: c, reason: collision with root package name */
    public final r f64384c = new r(32);

    /* renamed from: d, reason: collision with root package name */
    public final pl.c f64385d = new pl.c();

    public void a(pl.i iVar, Skeleton skeleton) {
        int i11;
        com.badlogic.gdx.graphics.b bVar;
        m mVar;
        float[] fArr;
        Texture texture;
        float[] fArr2;
        int i12;
        com.badlogic.gdx.graphics.b bVar2;
        Skeleton k11;
        com.badlogic.gdx.graphics.b bVar3;
        short[] sArr;
        boolean z11;
        boolean z12;
        float f11;
        m mVar2;
        int i13;
        float f12;
        float f13;
        pl.i iVar2 = iVar;
        if (iVar2 == null) {
            throw new IllegalArgumentException("batch cannot be null.");
        }
        if (skeleton == null) {
            throw new IllegalArgumentException("skeleton cannot be null.");
        }
        boolean z13 = this.f64382a;
        boolean z14 = this.f64383b;
        iVar2.J0(z13);
        com.badlogic.gdx.graphics.b bVar4 = skeleton.f29202k;
        float f14 = bVar4.f11544a;
        float f15 = bVar4.f11545b;
        float f16 = bVar4.f11546c;
        float f17 = bVar4.f11547d;
        com.badlogic.gdx.utils.a<m> aVar = skeleton.f29195d;
        m[] mVarArr = aVar.f13178a;
        int i14 = aVar.f13179b;
        com.badlogic.gdx.graphics.b bVar5 = null;
        BlendMode blendMode = null;
        float[] fArr3 = null;
        short[] sArr2 = null;
        float[] fArr4 = null;
        int i15 = 0;
        int i16 = 0;
        while (i15 < i14) {
            m mVar3 = mVarArr[i15];
            int i17 = i14;
            if (mVar3.f64408b.A) {
                int i18 = this.f64385d.k() ? 2 : 6;
                i11 = i15;
                ol.b bVar6 = mVar3.f64411e;
                bVar = bVar5;
                if (bVar6 instanceof ol.j) {
                    ol.j jVar = (ol.j) bVar6;
                    int i19 = i18 << 2;
                    float[] fArr5 = this.f64384c.f1625a;
                    jVar.j(mVar3, fArr5, 0, i18);
                    sArr2 = f64381e;
                    Texture f18 = jVar.g().f();
                    float[] q11 = jVar.q();
                    bVar2 = jVar.e();
                    texture = f18;
                    mVar = mVar3;
                    fArr = fArr5;
                    fArr2 = q11;
                    i12 = i19;
                } else if (bVar6 instanceof ol.g) {
                    ol.g gVar = (ol.g) bVar6;
                    int o11 = gVar.o();
                    int i21 = (o11 >> 1) * i18;
                    float[] I = this.f64384c.I(i21);
                    gVar.j(mVar3, 0, o11, I, 0, i18);
                    mVar = mVar3;
                    sArr2 = gVar.A();
                    texture = gVar.g().f();
                    float[] B = gVar.B();
                    i12 = i21;
                    bVar2 = gVar.e();
                    fArr2 = B;
                    fArr = I;
                } else {
                    mVar = mVar3;
                    if (bVar6 instanceof ol.e) {
                        this.f64385d.d(mVar, (ol.e) bVar6);
                    } else {
                        if ((bVar6 instanceof ol.k) && (k11 = ((ol.k) bVar6).k()) != null) {
                            a(iVar2, k11);
                        }
                        fArr = fArr3;
                        texture = null;
                        fArr2 = fArr4;
                        i12 = i16;
                        bVar2 = bVar;
                    }
                }
                if (texture != null) {
                    com.badlogic.gdx.graphics.b c11 = mVar.c();
                    Texture texture2 = texture;
                    float f19 = 255.0f;
                    float f21 = bVar2.f11547d * c11.f11547d * f17 * 255.0f;
                    if (z13) {
                        f19 = f21;
                        f12 = f19;
                    } else {
                        f12 = f21;
                    }
                    BlendMode b11 = mVar.f64407a.b();
                    if (b11 != blendMode) {
                        if (b11 == BlendMode.additive && z13) {
                            blendMode = BlendMode.normal;
                            f13 = 0.0f;
                        } else {
                            blendMode = b11;
                            f13 = f12;
                        }
                        blendMode.apply(iVar2, z14);
                    } else {
                        f13 = f12;
                    }
                    BlendMode blendMode2 = blendMode;
                    float f22 = bVar2.f11544a * f14 * f19;
                    float f23 = bVar2.f11545b * f15 * f19;
                    float f24 = bVar2.f11546c * f16 * f19;
                    float f25 = e0.f((((int) (c11.f11546c * f24)) << 16) | (((int) f13) << 24) | (((int) (c11.f11545b * f23)) << 8) | ((int) (c11.f11544a * f22)));
                    com.badlogic.gdx.graphics.b d11 = mVar.d();
                    float f26 = d11 != null ? e0.f(((int) (f22 * d11.f11544a)) | (((int) (d11.f11546c * f24)) << 16) | (((int) (d11.f11545b * f23)) << 8)) : 0.0f;
                    if (this.f64385d.k()) {
                        sArr = sArr2;
                        this.f64385d.f(fArr, sArr, sArr2.length, fArr2, f25, f26, true);
                        r j11 = this.f64385d.j();
                        t0 h11 = this.f64385d.h();
                        z12 = z14;
                        f11 = f14;
                        bVar3 = bVar2;
                        z11 = z13;
                        mVar2 = mVar;
                        iVar.D(texture2, j11.f1625a, 0, j11.f1626b, h11.f1633a, 0, h11.f1634b);
                        i12 = i12;
                    } else {
                        bVar3 = bVar2;
                        z11 = z13;
                        z12 = z14;
                        f11 = f14;
                        mVar2 = mVar;
                        int i22 = i12;
                        short[] sArr3 = sArr2;
                        int i23 = 0;
                        int i24 = 2;
                        while (i24 < i22) {
                            fArr[i24] = f25;
                            fArr[i24 + 1] = f26;
                            fArr[i24 + 2] = fArr2[i23];
                            fArr[i24 + 3] = fArr2[i23 + 1];
                            i24 += 6;
                            i23 += 2;
                        }
                        i12 = i22;
                        iVar.D(texture2, fArr, 0, i12, sArr3, 0, sArr3.length);
                        sArr = sArr3;
                    }
                    blendMode = blendMode2;
                } else {
                    bVar3 = bVar2;
                    sArr = sArr2;
                    z11 = z13;
                    z12 = z14;
                    f11 = f14;
                    mVar2 = mVar;
                }
                this.f64385d.c(mVar2);
                i13 = i12;
                bVar5 = bVar3;
                fArr3 = fArr;
                sArr2 = sArr;
                i15 = i11 + 1;
                z13 = z11;
                i14 = i17;
                z14 = z12;
                f14 = f11;
                fArr4 = fArr2;
                i16 = i13;
                iVar2 = iVar;
            } else {
                this.f64385d.c(mVar3);
                i11 = i15;
                bVar = bVar5;
            }
            z12 = z14;
            f11 = f14;
            fArr2 = fArr4;
            i13 = i16;
            bVar5 = bVar;
            z11 = z13;
            i15 = i11 + 1;
            z13 = z11;
            i14 = i17;
            z14 = z12;
            f14 = f11;
            fArr4 = fArr2;
            i16 = i13;
            iVar2 = iVar;
        }
        this.f64385d.b();
    }

    public void b(w1.a aVar, Skeleton skeleton) {
        int i11;
        boolean z11;
        Skeleton k11;
        if (aVar instanceof pl.i) {
            a((pl.i) aVar, skeleton);
            return;
        }
        if (aVar instanceof w1.j) {
            c((w1.j) aVar, skeleton);
            return;
        }
        if (aVar == null) {
            throw new IllegalArgumentException("batch cannot be null.");
        }
        if (skeleton == null) {
            throw new IllegalArgumentException("skeleton cannot be null.");
        }
        boolean z12 = this.f64382a;
        boolean z13 = this.f64383b;
        float[] fArr = this.f64384c.f1625a;
        com.badlogic.gdx.graphics.b bVar = skeleton.f29202k;
        float f11 = bVar.f11544a;
        float f12 = bVar.f11545b;
        float f13 = bVar.f11546c;
        float f14 = bVar.f11547d;
        com.badlogic.gdx.utils.a<m> aVar2 = skeleton.f29195d;
        m[] mVarArr = aVar2.f13178a;
        int i12 = aVar2.f13179b;
        BlendMode blendMode = null;
        int i13 = 0;
        while (i13 < i12) {
            m mVar = mVarArr[i13];
            if (mVar.f64408b.A) {
                ol.b bVar2 = mVar.f64411e;
                if (bVar2 instanceof ol.j) {
                    ol.j jVar = (ol.j) bVar2;
                    i11 = i12;
                    jVar.j(mVar, fArr, 0, 5);
                    com.badlogic.gdx.graphics.b e11 = jVar.e();
                    com.badlogic.gdx.graphics.b c11 = mVar.c();
                    z11 = z12;
                    float f15 = e11.f11547d * c11.f11547d * f14 * 255.0f;
                    float f16 = z11 ? f15 : 255.0f;
                    BlendMode b11 = mVar.f64407a.b();
                    if (b11 != blendMode) {
                        if (b11 == BlendMode.additive && z11) {
                            blendMode = BlendMode.normal;
                            f15 = 0.0f;
                        } else {
                            blendMode = b11;
                        }
                        blendMode.apply(aVar, z13);
                    }
                    float f17 = e0.f(((int) (c11.f11544a * f11 * e11.f11544a * f16)) | (((int) f15) << 24) | (((int) (((c11.f11546c * f13) * e11.f11546c) * f16)) << 16) | (((int) (((c11.f11545b * f12) * e11.f11545b) * f16)) << 8));
                    float[] q11 = jVar.q();
                    int i14 = 2;
                    int i15 = 0;
                    while (i15 < 8) {
                        fArr[i14] = f17;
                        fArr[i14 + 1] = q11[i15];
                        fArr[i14 + 2] = q11[i15 + 1];
                        i15 += 2;
                        i14 += 5;
                    }
                    aVar.t0(jVar.g().f(), fArr, 0, 20);
                } else {
                    i11 = i12;
                    z11 = z12;
                    if (bVar2 instanceof ol.e) {
                        throw new RuntimeException(aVar.getClass().getSimpleName() + " cannot perform clipping, PolygonSpriteBatch or TwoColorPolygonBatch is required.");
                    }
                    if (bVar2 instanceof ol.g) {
                        throw new RuntimeException(aVar.getClass().getSimpleName() + " cannot render meshes, PolygonSpriteBatch or TwoColorPolygonBatch is required.");
                    }
                    if ((bVar2 instanceof ol.k) && (k11 = ((ol.k) bVar2).k()) != null) {
                        b(aVar, k11);
                    }
                }
            } else {
                i11 = i12;
                z11 = z12;
            }
            i13++;
            i12 = i11;
            z12 = z11;
        }
    }

    public void c(w1.j jVar, Skeleton skeleton) {
        int i11;
        com.badlogic.gdx.graphics.b bVar;
        m mVar;
        float[] fArr;
        float[] fArr2;
        Texture texture;
        short[] sArr;
        com.badlogic.gdx.graphics.b bVar2;
        Skeleton k11;
        short[] sArr2;
        boolean z11;
        float f11;
        int i12;
        boolean z12;
        m mVar2;
        int i13;
        w1.j jVar2 = jVar;
        if (jVar2 == null) {
            throw new IllegalArgumentException("batch cannot be null.");
        }
        if (skeleton == null) {
            throw new IllegalArgumentException("skeleton cannot be null.");
        }
        boolean z13 = this.f64382a;
        boolean z14 = this.f64383b;
        com.badlogic.gdx.graphics.b bVar3 = skeleton.f29202k;
        float f12 = bVar3.f11544a;
        float f13 = bVar3.f11545b;
        float f14 = bVar3.f11546c;
        float f15 = bVar3.f11547d;
        com.badlogic.gdx.utils.a<m> aVar = skeleton.f29195d;
        m[] mVarArr = aVar.f13178a;
        int i14 = aVar.f13179b;
        com.badlogic.gdx.graphics.b bVar4 = null;
        BlendMode blendMode = null;
        float[] fArr3 = null;
        float[] fArr4 = null;
        short[] sArr3 = null;
        int i15 = 0;
        int i16 = 0;
        while (i15 < i14) {
            m mVar3 = mVarArr[i15];
            int i17 = i14;
            if (mVar3.f64408b.A) {
                int i18 = this.f64385d.k() ? 2 : 5;
                i11 = i15;
                ol.b bVar5 = mVar3.f64411e;
                bVar = bVar4;
                if (bVar5 instanceof ol.j) {
                    ol.j jVar3 = (ol.j) bVar5;
                    i16 = i18 << 2;
                    float[] fArr5 = this.f64384c.f1625a;
                    jVar3.j(mVar3, fArr5, 0, i18);
                    short[] sArr4 = f64381e;
                    Texture f16 = jVar3.g().f();
                    float[] q11 = jVar3.q();
                    bVar2 = jVar3.e();
                    texture = f16;
                    mVar = mVar3;
                    fArr = fArr5;
                    fArr2 = q11;
                    sArr = sArr4;
                } else if (bVar5 instanceof ol.g) {
                    ol.g gVar = (ol.g) bVar5;
                    int o11 = gVar.o();
                    int i19 = (o11 >> 1) * i18;
                    float[] I = this.f64384c.I(i19);
                    gVar.j(mVar3, 0, o11, I, 0, i18);
                    mVar = mVar3;
                    short[] A = gVar.A();
                    texture = gVar.g().f();
                    float[] B = gVar.B();
                    i16 = i19;
                    bVar2 = gVar.e();
                    fArr2 = B;
                    sArr = A;
                    fArr = I;
                } else {
                    mVar = mVar3;
                    if (bVar5 instanceof ol.e) {
                        this.f64385d.d(mVar, (ol.e) bVar5);
                    } else {
                        if ((bVar5 instanceof ol.k) && (k11 = ((ol.k) bVar5).k()) != null) {
                            c(jVar2, k11);
                        }
                        fArr = fArr3;
                        fArr2 = fArr4;
                        texture = null;
                        sArr = sArr3;
                        bVar2 = bVar;
                    }
                }
                if (texture != null) {
                    com.badlogic.gdx.graphics.b c11 = mVar.c();
                    Texture texture2 = texture;
                    float f17 = c11.f11547d * f15 * bVar2.f11547d * 255.0f;
                    float f18 = z13 ? f17 : 255.0f;
                    BlendMode b11 = mVar.f64407a.b();
                    if (b11 != blendMode) {
                        if (b11 == BlendMode.additive && z13) {
                            b11 = BlendMode.normal;
                            f17 = 0.0f;
                        }
                        blendMode = b11;
                        blendMode.apply(jVar2, z14);
                    }
                    BlendMode blendMode2 = blendMode;
                    float f19 = e0.f((((int) f17) << 24) | (((int) (((c11.f11546c * f14) * bVar2.f11546c) * f18)) << 16) | (((int) (((c11.f11545b * f13) * bVar2.f11545b) * f18)) << 8) | ((int) (c11.f11544a * f12 * bVar2.f11544a * f18)));
                    if (this.f64385d.k()) {
                        sArr2 = sArr;
                        this.f64385d.f(fArr, sArr2, sArr.length, fArr2, f19, 0.0f, false);
                        r j11 = this.f64385d.j();
                        t0 h11 = this.f64385d.h();
                        bVar = bVar2;
                        z11 = z14;
                        f11 = f12;
                        int i21 = i16;
                        z12 = z13;
                        mVar2 = mVar;
                        jVar2.L0(texture2, j11.f1625a, 0, j11.f1626b, h11.f1633a, 0, h11.f1634b);
                        i12 = i21;
                    } else {
                        bVar = bVar2;
                        z11 = z14;
                        f11 = f12;
                        int i22 = i16;
                        short[] sArr5 = sArr;
                        z12 = z13;
                        mVar2 = mVar;
                        int i23 = 0;
                        int i24 = 2;
                        while (i24 < i22) {
                            fArr[i24] = f19;
                            fArr[i24 + 1] = fArr2[i23];
                            fArr[i24 + 2] = fArr2[i23 + 1];
                            i24 += 5;
                            i23 += 2;
                        }
                        i12 = i22;
                        jVar.L0(texture2, fArr, 0, i12, sArr5, 0, sArr5.length);
                        sArr2 = sArr5;
                    }
                    blendMode = blendMode2;
                } else {
                    bVar = bVar2;
                    sArr2 = sArr;
                    z11 = z14;
                    f11 = f12;
                    i12 = i16;
                    z12 = z13;
                    mVar2 = mVar;
                }
                this.f64385d.c(mVar2);
                i13 = i12;
                fArr3 = fArr;
                fArr4 = fArr2;
                bVar4 = bVar;
                i15 = i11 + 1;
                z13 = z12;
                i14 = i17;
                z14 = z11;
                f12 = f11;
                sArr3 = sArr2;
                i16 = i13;
                jVar2 = jVar;
            } else {
                this.f64385d.c(mVar3);
                i11 = i15;
                bVar = bVar4;
            }
            z11 = z14;
            f11 = f12;
            sArr2 = sArr3;
            i13 = i16;
            z12 = z13;
            bVar4 = bVar;
            i15 = i11 + 1;
            z13 = z12;
            i14 = i17;
            z14 = z11;
            f12 = f11;
            sArr3 = sArr2;
            i16 = i13;
            jVar2 = jVar;
        }
        this.f64385d.b();
    }

    public boolean d() {
        return this.f64383b;
    }

    public boolean e() {
        return this.f64382a;
    }

    public pl.c f() {
        return this.f64385d;
    }

    public void g(boolean z11) {
        this.f64382a = z11;
        this.f64383b = z11;
    }

    public void h(boolean z11) {
        this.f64383b = z11;
    }

    public void i(boolean z11) {
        this.f64382a = z11;
    }
}
