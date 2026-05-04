package w1;

import com.badlogic.gdx.graphics.Mesh;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.r;
import com.badlogic.gdx.math.Affine2;
import com.badlogic.gdx.math.Matrix4;
import n2.w;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class j implements f {

    /* renamed from: a, reason: collision with root package name */
    public Mesh f94508a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f94509b;

    /* renamed from: c, reason: collision with root package name */
    public final short[] f94510c;

    /* renamed from: d, reason: collision with root package name */
    public int f94511d;

    /* renamed from: e, reason: collision with root package name */
    public int f94512e;

    /* renamed from: f, reason: collision with root package name */
    public Texture f94513f;

    /* renamed from: g, reason: collision with root package name */
    public float f94514g;

    /* renamed from: h, reason: collision with root package name */
    public float f94515h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f94516i;

    /* renamed from: j, reason: collision with root package name */
    public final Matrix4 f94517j;

    /* renamed from: k, reason: collision with root package name */
    public final Matrix4 f94518k;

    /* renamed from: l, reason: collision with root package name */
    public final Matrix4 f94519l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f94520m;

    /* renamed from: n, reason: collision with root package name */
    public int f94521n;

    /* renamed from: o, reason: collision with root package name */
    public int f94522o;

    /* renamed from: p, reason: collision with root package name */
    public int f94523p;

    /* renamed from: q, reason: collision with root package name */
    public int f94524q;

    /* renamed from: r, reason: collision with root package name */
    public final w f94525r;

    /* renamed from: s, reason: collision with root package name */
    public w f94526s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f94527t;

    /* renamed from: u, reason: collision with root package name */
    public final com.badlogic.gdx.graphics.b f94528u;

    /* renamed from: v, reason: collision with root package name */
    public float f94529v;

    /* renamed from: w, reason: collision with root package name */
    public int f94530w;

    /* renamed from: x, reason: collision with root package name */
    public int f94531x;

    /* renamed from: y, reason: collision with root package name */
    public int f94532y;

    public j() {
        this(2000, null);
    }

    @Override // w1.a
    public Matrix4 B0() {
        return this.f94517j;
    }

    @Override // w1.a
    public boolean E0() {
        return !this.f94520m;
    }

    @Override // w1.a
    public void F() {
        flush();
        this.f94520m = false;
    }

    @Override // w1.a
    public void G(float f11) {
        com.badlogic.gdx.graphics.b.a(this.f94528u, f11);
        this.f94529v = f11;
    }

    @Override // w1.f
    public void H(g gVar, float f11, float f12, float f13, float f14) {
        if (!this.f94516i) {
            throw new IllegalStateException("PolygonSpriteBatch.begin must be called before draw.");
        }
        short[] sArr = this.f94510c;
        short[] sArr2 = gVar.f94487c;
        int length = sArr2.length;
        float[] fArr = gVar.f94486b;
        int length2 = fArr.length;
        Texture texture = gVar.f94488d.f94611a;
        if (texture != this.f94513f) {
            o(texture);
        } else if (this.f94512e + length > sArr.length || this.f94511d + ((length2 * 5) / 2) > this.f94509b.length) {
            flush();
        }
        int i11 = this.f94512e;
        int i12 = this.f94511d;
        int i13 = i12 / 5;
        int length3 = sArr2.length;
        int i14 = 0;
        while (i14 < length3) {
            sArr[i11] = (short) (sArr2[i14] + i13);
            i14++;
            i11++;
        }
        this.f94512e = i11;
        float[] fArr2 = this.f94509b;
        float f15 = this.f94529v;
        float[] fArr3 = gVar.f94485a;
        float f16 = f13 / r5.f94616f;
        float f17 = f14 / r5.f94617g;
        for (int i15 = 0; i15 < length2; i15 += 2) {
            fArr2[i12] = (fArr[i15] * f16) + f11;
            int i16 = i15 + 1;
            fArr2[i12 + 1] = (fArr[i16] * f17) + f12;
            fArr2[i12 + 2] = f15;
            int i17 = i12 + 4;
            fArr2[i12 + 3] = fArr3[i15];
            i12 += 5;
            fArr2[i17] = fArr3[i16];
        }
        this.f94511d = i12;
    }

    @Override // w1.a
    public int H0() {
        return this.f94522o;
    }

    @Override // w1.a
    public int J() {
        return this.f94524q;
    }

    @Override // w1.a
    public void K(Texture texture, float f11, float f12, int i11, int i12, int i13, int i14) {
        if (!this.f94516i) {
            throw new IllegalStateException("PolygonSpriteBatch.begin must be called before draw.");
        }
        short[] sArr = this.f94510c;
        float[] fArr = this.f94509b;
        if (texture != this.f94513f) {
            o(texture);
        } else if (this.f94512e + 6 > sArr.length || this.f94511d + 20 > fArr.length) {
            flush();
        }
        int i15 = this.f94512e;
        int i16 = this.f94511d;
        int i17 = i16 / 5;
        short s11 = (short) i17;
        sArr[i15] = s11;
        sArr[i15 + 1] = (short) (i17 + 1);
        short s12 = (short) (i17 + 2);
        sArr[i15 + 2] = s12;
        sArr[i15 + 3] = s12;
        sArr[i15 + 4] = (short) (i17 + 3);
        sArr[i15 + 5] = s11;
        this.f94512e = i15 + 6;
        float f13 = this.f94514g;
        float f14 = i11 * f13;
        float f15 = this.f94515h;
        float f16 = (i12 + i14) * f15;
        float f17 = (i11 + i13) * f13;
        float f18 = i12 * f15;
        float f19 = i13 + f11;
        float f21 = i14 + f12;
        float f22 = this.f94529v;
        fArr[i16] = f11;
        fArr[i16 + 1] = f12;
        fArr[i16 + 2] = f22;
        fArr[i16 + 3] = f14;
        fArr[i16 + 4] = f16;
        fArr[i16 + 5] = f11;
        fArr[i16 + 6] = f21;
        fArr[i16 + 7] = f22;
        fArr[i16 + 8] = f14;
        fArr[i16 + 9] = f18;
        fArr[i16 + 10] = f19;
        fArr[i16 + 11] = f21;
        fArr[i16 + 12] = f22;
        fArr[i16 + 13] = f17;
        fArr[i16 + 14] = f18;
        fArr[i16 + 15] = f19;
        fArr[i16 + 16] = f12;
        fArr[i16 + 17] = f22;
        fArr[i16 + 18] = f17;
        fArr[i16 + 19] = f16;
        this.f94511d = i16 + 20;
    }

    @Override // w1.a
    public void K0(w wVar) {
        if (this.f94516i) {
            flush();
        }
        this.f94526s = wVar;
        if (this.f94516i) {
            if (wVar != null) {
                wVar.S();
            } else {
                this.f94525r.S();
            }
            b();
        }
    }

    @Override // w1.a
    public void L(o oVar, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, boolean z11) {
        float f21;
        float f22;
        float f23;
        float f24;
        float f25;
        float f26;
        float f27;
        float f28;
        float f29;
        float f31;
        float f32;
        if (!this.f94516i) {
            throw new IllegalStateException("PolygonSpriteBatch.begin must be called before draw.");
        }
        short[] sArr = this.f94510c;
        float[] fArr = this.f94509b;
        Texture texture = oVar.f94611a;
        if (texture != this.f94513f) {
            o(texture);
        } else if (this.f94512e + 6 > sArr.length || this.f94511d + 20 > fArr.length) {
            flush();
        }
        int i11 = this.f94512e;
        int i12 = this.f94511d / 5;
        short s11 = (short) i12;
        sArr[i11] = s11;
        sArr[i11 + 1] = (short) (i12 + 1);
        short s12 = (short) (i12 + 2);
        sArr[i11 + 2] = s12;
        sArr[i11 + 3] = s12;
        sArr[i11 + 4] = (short) (i12 + 3);
        sArr[i11 + 5] = s11;
        this.f94512e = i11 + 6;
        float f33 = f11 + f13;
        float f34 = f12 + f14;
        float f35 = -f13;
        float f36 = -f14;
        float f37 = f15 - f13;
        float f38 = f16 - f14;
        if (f17 != 1.0f || f18 != 1.0f) {
            f35 *= f17;
            f36 *= f18;
            f37 *= f17;
            f38 *= f18;
        }
        if (f19 != 0.0f) {
            float t11 = com.badlogic.gdx.math.n.t(f19);
            float a02 = com.badlogic.gdx.math.n.a0(f19);
            float f39 = t11 * f35;
            f22 = f39 - (a02 * f36);
            float f41 = f35 * a02;
            float f42 = (f36 * t11) + f41;
            float f43 = a02 * f38;
            f21 = f39 - f43;
            float f44 = f38 * t11;
            f25 = f41 + f44;
            float f45 = (t11 * f37) - f43;
            float f46 = f44 + (a02 * f37);
            f24 = f46 - (f25 - f42);
            f27 = (f45 - f21) + f22;
            f37 = f45;
            f23 = f42;
            f26 = f46;
        } else {
            f21 = f35;
            f22 = f21;
            f23 = f36;
            f24 = f23;
            f25 = f38;
            f26 = f25;
            f27 = f37;
        }
        float f47 = f22 + f33;
        float f48 = f23 + f34;
        float f49 = f21 + f33;
        float f51 = f25 + f34;
        float f52 = f37 + f33;
        float f53 = f26 + f34;
        float f54 = f27 + f33;
        float f55 = f24 + f34;
        if (z11) {
            f28 = oVar.f94614d;
            f29 = oVar.f94615e;
            f31 = oVar.f94612b;
            f32 = oVar.f94613c;
        } else {
            f28 = oVar.f94612b;
            f29 = oVar.f94613c;
            f31 = oVar.f94614d;
            f32 = oVar.f94615e;
        }
        float f56 = f32;
        float f57 = f29;
        float f58 = f31;
        float f59 = f28;
        float f61 = this.f94529v;
        int i13 = this.f94511d;
        fArr[i13] = f47;
        fArr[i13 + 1] = f48;
        fArr[i13 + 2] = f61;
        fArr[i13 + 3] = f59;
        fArr[i13 + 4] = f57;
        fArr[i13 + 5] = f49;
        fArr[i13 + 6] = f51;
        fArr[i13 + 7] = f61;
        fArr[i13 + 8] = f58;
        fArr[i13 + 9] = f57;
        fArr[i13 + 10] = f52;
        fArr[i13 + 11] = f53;
        fArr[i13 + 12] = f61;
        fArr[i13 + 13] = f58;
        fArr[i13 + 14] = f56;
        fArr[i13 + 15] = f54;
        fArr[i13 + 16] = f55;
        fArr[i13 + 17] = f61;
        fArr[i13 + 18] = f59;
        fArr[i13 + 19] = f56;
        this.f94511d = i13 + 20;
    }

    @Override // w1.f
    public void L0(Texture texture, float[] fArr, int i11, int i12, short[] sArr, int i13, int i14) {
        if (!this.f94516i) {
            throw new IllegalStateException("PolygonSpriteBatch.begin must be called before draw.");
        }
        short[] sArr2 = this.f94510c;
        float[] fArr2 = this.f94509b;
        if (texture != this.f94513f) {
            o(texture);
        } else if (this.f94512e + i14 > sArr2.length || this.f94511d + i12 > fArr2.length) {
            flush();
        }
        int i15 = this.f94512e;
        int i16 = this.f94511d;
        int i17 = i16 / 5;
        int i18 = i14 + i13;
        while (i13 < i18) {
            sArr2[i15] = (short) (sArr[i13] + i17);
            i13++;
            i15++;
        }
        this.f94512e = i15;
        System.arraycopy(fArr, i11, fArr2, i16, i12);
        this.f94511d += i12;
    }

    @Override // w1.a
    public float N0() {
        return this.f94529v;
    }

    @Override // w1.a
    public void O0(o oVar, float f11, float f12, Affine2 affine2) {
        if (!this.f94516i) {
            throw new IllegalStateException("PolygonSpriteBatch.begin must be called before draw.");
        }
        short[] sArr = this.f94510c;
        float[] fArr = this.f94509b;
        Texture texture = oVar.f94611a;
        if (texture != this.f94513f) {
            o(texture);
        } else if (this.f94512e + 6 > sArr.length || this.f94511d + 20 > fArr.length) {
            flush();
        }
        int i11 = this.f94512e;
        int i12 = this.f94511d;
        int i13 = i12 / 5;
        short s11 = (short) i13;
        sArr[i11] = s11;
        sArr[i11 + 1] = (short) (i13 + 1);
        short s12 = (short) (i13 + 2);
        sArr[i11 + 2] = s12;
        sArr[i11 + 3] = s12;
        sArr[i11 + 4] = (short) (i13 + 3);
        sArr[i11 + 5] = s11;
        this.f94512e = i11 + 6;
        float f13 = affine2.m02;
        float f14 = affine2.m12;
        float f15 = affine2.m01;
        float f16 = (f15 * f12) + f13;
        float f17 = affine2.m11;
        float f18 = (f17 * f12) + f14;
        float f19 = affine2.f12517m00;
        float f21 = (f19 * f11) + (f15 * f12) + f13;
        float f22 = affine2.f12518m10;
        float f23 = (f22 * f11) + (f17 * f12) + f14;
        float f24 = oVar.f94612b;
        float f25 = oVar.f94615e;
        float f26 = oVar.f94614d;
        float f27 = oVar.f94613c;
        float f28 = this.f94529v;
        fArr[i12] = f13;
        fArr[i12 + 1] = f14;
        fArr[i12 + 2] = f28;
        fArr[i12 + 3] = f24;
        fArr[i12 + 4] = f25;
        fArr[i12 + 5] = f16;
        fArr[i12 + 6] = f18;
        fArr[i12 + 7] = f28;
        fArr[i12 + 8] = f24;
        fArr[i12 + 9] = f27;
        fArr[i12 + 10] = f21;
        fArr[i12 + 11] = f23;
        fArr[i12 + 12] = f28;
        fArr[i12 + 13] = f26;
        fArr[i12 + 14] = f27;
        fArr[i12 + 15] = (f19 * f11) + f13;
        fArr[i12 + 16] = (f22 * f11) + f14;
        fArr[i12 + 17] = f28;
        fArr[i12 + 18] = f26;
        fArr[i12 + 19] = f25;
        this.f94511d = i12 + 20;
    }

    @Override // w1.a
    public void R0(Matrix4 matrix4) {
        if (this.f94516i) {
            flush();
        }
        this.f94517j.set(matrix4);
        if (this.f94516i) {
            b();
        }
    }

    @Override // w1.f
    public void T(g gVar, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19) {
        if (!this.f94516i) {
            throw new IllegalStateException("PolygonSpriteBatch.begin must be called before draw.");
        }
        short[] sArr = this.f94510c;
        short[] sArr2 = gVar.f94487c;
        int length = sArr2.length;
        float[] fArr = gVar.f94486b;
        int length2 = fArr.length;
        Texture texture = gVar.f94488d.f94611a;
        if (texture != this.f94513f) {
            o(texture);
        } else if (this.f94512e + length > sArr.length || this.f94511d + ((length2 * 5) / 2) > this.f94509b.length) {
            flush();
        }
        int i11 = this.f94512e;
        int i12 = this.f94511d;
        int i13 = i12 / 5;
        int i14 = 0;
        while (i14 < length) {
            sArr[i11] = (short) (sArr2[i14] + i13);
            i14++;
            i11++;
        }
        this.f94512e = i11;
        float[] fArr2 = this.f94509b;
        float f21 = this.f94529v;
        float[] fArr3 = gVar.f94485a;
        float f22 = f11 + f13;
        float f23 = f12 + f14;
        float f24 = f15 / r7.f94616f;
        float f25 = f16 / r7.f94617g;
        float t11 = com.badlogic.gdx.math.n.t(f19);
        float a02 = com.badlogic.gdx.math.n.a0(f19);
        for (int i15 = 0; i15 < length2; i15 += 2) {
            float f26 = ((fArr[i15] * f24) - f13) * f17;
            int i16 = i15 + 1;
            float f27 = ((fArr[i16] * f25) - f14) * f18;
            fArr2[i12] = ((t11 * f26) - (a02 * f27)) + f22;
            fArr2[i12 + 1] = (f26 * a02) + (f27 * t11) + f23;
            fArr2[i12 + 2] = f21;
            int i17 = i12 + 4;
            fArr2[i12 + 3] = fArr3[i15];
            i12 += 5;
            fArr2[i17] = fArr3[i16];
        }
        this.f94511d = i12;
    }

    @Override // w1.a
    public void T0(Texture texture, float f11, float f12, float f13, float f14) {
        if (!this.f94516i) {
            throw new IllegalStateException("PolygonSpriteBatch.begin must be called before draw.");
        }
        short[] sArr = this.f94510c;
        float[] fArr = this.f94509b;
        if (texture != this.f94513f) {
            o(texture);
        } else if (this.f94512e + 6 > sArr.length || this.f94511d + 20 > fArr.length) {
            flush();
        }
        int i11 = this.f94512e;
        int i12 = this.f94511d;
        int i13 = i12 / 5;
        short s11 = (short) i13;
        sArr[i11] = s11;
        sArr[i11 + 1] = (short) (i13 + 1);
        short s12 = (short) (i13 + 2);
        sArr[i11 + 2] = s12;
        sArr[i11 + 3] = s12;
        sArr[i11 + 4] = (short) (i13 + 3);
        sArr[i11 + 5] = s11;
        this.f94512e = i11 + 6;
        float f15 = f13 + f11;
        float f16 = f14 + f12;
        float f17 = this.f94529v;
        fArr[i12] = f11;
        fArr[i12 + 1] = f12;
        fArr[i12 + 2] = f17;
        fArr[i12 + 3] = 0.0f;
        fArr[i12 + 4] = 1.0f;
        fArr[i12 + 5] = f11;
        fArr[i12 + 6] = f16;
        fArr[i12 + 7] = f17;
        fArr[i12 + 8] = 0.0f;
        fArr[i12 + 9] = 0.0f;
        fArr[i12 + 10] = f15;
        fArr[i12 + 11] = f16;
        fArr[i12 + 12] = f17;
        fArr[i12 + 13] = 1.0f;
        fArr[i12 + 14] = 0.0f;
        fArr[i12 + 15] = f15;
        fArr[i12 + 16] = f12;
        fArr[i12 + 17] = f17;
        fArr[i12 + 18] = 1.0f;
        fArr[i12 + 19] = 1.0f;
        this.f94511d = i12 + 20;
    }

    @Override // w1.a
    public int X0() {
        return this.f94523p;
    }

    @Override // w1.f
    public void Y(g gVar, float f11, float f12) {
        if (!this.f94516i) {
            throw new IllegalStateException("PolygonSpriteBatch.begin must be called before draw.");
        }
        short[] sArr = this.f94510c;
        short[] sArr2 = gVar.f94487c;
        int length = sArr2.length;
        float[] fArr = gVar.f94486b;
        int length2 = fArr.length;
        Texture texture = gVar.f94488d.f94611a;
        if (texture != this.f94513f) {
            o(texture);
        } else if (this.f94512e + length > sArr.length || this.f94511d + ((length2 * 5) / 2) > this.f94509b.length) {
            flush();
        }
        int i11 = this.f94512e;
        int i12 = this.f94511d;
        int i13 = i12 / 5;
        int i14 = 0;
        while (i14 < length) {
            sArr[i11] = (short) (sArr2[i14] + i13);
            i14++;
            i11++;
        }
        this.f94512e = i11;
        float[] fArr2 = this.f94509b;
        float f13 = this.f94529v;
        float[] fArr3 = gVar.f94485a;
        for (int i15 = 0; i15 < length2; i15 += 2) {
            fArr2[i12] = fArr[i15] + f11;
            int i16 = i15 + 1;
            fArr2[i12 + 1] = fArr[i16] + f12;
            fArr2[i12 + 2] = f13;
            int i17 = i12 + 4;
            fArr2[i12 + 3] = fArr3[i15];
            i12 += 5;
            fArr2[i17] = fArr3[i16];
        }
        this.f94511d = i12;
    }

    @Override // w1.a
    public void Z0(Matrix4 matrix4) {
        if (this.f94516i) {
            flush();
        }
        this.f94518k.set(matrix4);
        if (this.f94516i) {
            b();
        }
    }

    public void b() {
        this.f94519l.set(this.f94518k).mul(this.f94517j);
        w wVar = this.f94526s;
        if (wVar != null) {
            wVar.I1("u_projTrans", this.f94519l);
            this.f94526s.i2("u_texture", 0);
        } else {
            this.f94525r.I1("u_projTrans", this.f94519l);
            this.f94525r.i2("u_texture", 0);
        }
    }

    @Override // w1.a
    public int b0() {
        return this.f94521n;
    }

    @Override // w1.a
    public void c() {
        if (this.f94516i) {
            throw new IllegalStateException("PolygonSpriteBatch.end must be called before begin.");
        }
        this.f94530w = 0;
        q1.g.f81384g.glDepthMask(false);
        w wVar = this.f94526s;
        if (wVar != null) {
            wVar.S();
        } else {
            this.f94525r.S();
        }
        b();
        this.f94516i = true;
    }

    @Override // w1.a
    public void c0(Texture texture, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        if (!this.f94516i) {
            throw new IllegalStateException("PolygonSpriteBatch.begin must be called before draw.");
        }
        short[] sArr = this.f94510c;
        float[] fArr = this.f94509b;
        if (texture != this.f94513f) {
            o(texture);
        } else if (this.f94512e + 6 > sArr.length || this.f94511d + 20 > fArr.length) {
            flush();
        }
        int i11 = this.f94512e;
        int i12 = this.f94511d;
        int i13 = i12 / 5;
        short s11 = (short) i13;
        sArr[i11] = s11;
        sArr[i11 + 1] = (short) (i13 + 1);
        short s12 = (short) (i13 + 2);
        sArr[i11 + 2] = s12;
        sArr[i11 + 3] = s12;
        sArr[i11 + 4] = (short) (i13 + 3);
        sArr[i11 + 5] = s11;
        this.f94512e = i11 + 6;
        float f19 = f13 + f11;
        float f21 = f14 + f12;
        float f22 = this.f94529v;
        fArr[i12] = f11;
        fArr[i12 + 1] = f12;
        fArr[i12 + 2] = f22;
        fArr[i12 + 3] = f15;
        fArr[i12 + 4] = f16;
        fArr[i12 + 5] = f11;
        fArr[i12 + 6] = f21;
        fArr[i12 + 7] = f22;
        fArr[i12 + 8] = f15;
        fArr[i12 + 9] = f18;
        fArr[i12 + 10] = f19;
        fArr[i12 + 11] = f21;
        fArr[i12 + 12] = f22;
        fArr[i12 + 13] = f17;
        fArr[i12 + 14] = f18;
        fArr[i12 + 15] = f19;
        fArr[i12 + 16] = f12;
        fArr[i12 + 17] = f22;
        fArr[i12 + 18] = f17;
        fArr[i12 + 19] = f16;
        this.f94511d = i12 + 20;
    }

    @Override // a3.q
    public void dispose() {
        w wVar;
        this.f94508a.dispose();
        if (!this.f94527t || (wVar = this.f94525r) == null) {
            return;
        }
        wVar.dispose();
    }

    @Override // w1.a
    public com.badlogic.gdx.graphics.b e() {
        return this.f94528u;
    }

    @Override // w1.a
    public boolean e0() {
        return this.f94516i;
    }

    @Override // w1.a
    public void end() {
        if (!this.f94516i) {
            throw new IllegalStateException("PolygonSpriteBatch.begin must be called before end.");
        }
        if (this.f94511d > 0) {
            flush();
        }
        this.f94513f = null;
        this.f94516i = false;
        com.badlogic.gdx.graphics.f fVar = q1.g.f81384g;
        fVar.glDepthMask(true);
        if (E0()) {
            fVar.glDisable(com.badlogic.gdx.graphics.f.f11564c0);
        }
    }

    @Override // w1.a
    public void f0(Texture texture, float f11, float f12) {
        T0(texture, f11, f12, texture.C0(), texture.I());
    }

    @Override // w1.a
    public void flush() {
        if (this.f94511d == 0) {
            return;
        }
        this.f94530w++;
        this.f94531x++;
        int i11 = this.f94512e;
        if (i11 > this.f94532y) {
            this.f94532y = i11;
        }
        this.f94513f.S();
        Mesh mesh = this.f94508a;
        mesh.O1(this.f94509b, 0, this.f94511d);
        mesh.I1(this.f94510c, 0, i11);
        if (this.f94520m) {
            q1.g.f81384g.glDisable(com.badlogic.gdx.graphics.f.f11564c0);
        } else {
            q1.g.f81384g.glEnable(com.badlogic.gdx.graphics.f.f11564c0);
            int i12 = this.f94521n;
            if (i12 != -1) {
                q1.g.f81384g.a5(i12, this.f94522o, this.f94523p, this.f94524q);
            }
        }
        w wVar = this.f94526s;
        if (wVar == null) {
            wVar = this.f94525r;
        }
        mesh.D1(wVar, 4, 0, i11);
        this.f94511d = 0;
        this.f94512e = 0;
    }

    @Override // w1.a
    public void g0(int i11, int i12) {
        k0(i11, i12, i11, i12);
    }

    @Override // w1.a
    public w getShader() {
        w wVar = this.f94526s;
        return wVar == null ? this.f94525r : wVar;
    }

    @Override // w1.a
    public void h(com.badlogic.gdx.graphics.b bVar) {
        this.f94528u.H(bVar);
        this.f94529v = bVar.L();
    }

    @Override // w1.a
    public void k(float f11, float f12, float f13, float f14) {
        this.f94528u.F(f11, f12, f13, f14);
        this.f94529v = this.f94528u.L();
    }

    @Override // w1.a
    public void k0(int i11, int i12, int i13, int i14) {
        if (this.f94521n == i11 && this.f94522o == i12 && this.f94523p == i13 && this.f94524q == i14) {
            return;
        }
        flush();
        this.f94521n = i11;
        this.f94522o = i12;
        this.f94523p = i13;
        this.f94524q = i14;
    }

    public void o(Texture texture) {
        flush();
        this.f94513f = texture;
        this.f94514g = 1.0f / texture.C0();
        this.f94515h = 1.0f / texture.I();
    }

    @Override // w1.a
    public void q(o oVar, float f11, float f12) {
        v0(oVar, f11, f12, oVar.c(), oVar.b());
    }

    @Override // w1.a
    public void q0(Texture texture, float f11, float f12, float f13, float f14, int i11, int i12, int i13, int i14, boolean z11, boolean z12) {
        if (!this.f94516i) {
            throw new IllegalStateException("PolygonSpriteBatch.begin must be called before draw.");
        }
        short[] sArr = this.f94510c;
        float[] fArr = this.f94509b;
        if (texture != this.f94513f) {
            o(texture);
        } else if (this.f94512e + 6 > sArr.length || this.f94511d + 20 > fArr.length) {
            flush();
        }
        int i15 = this.f94512e;
        int i16 = this.f94511d;
        int i17 = i16 / 5;
        short s11 = (short) i17;
        sArr[i15] = s11;
        sArr[i15 + 1] = (short) (i17 + 1);
        short s12 = (short) (i17 + 2);
        sArr[i15 + 2] = s12;
        sArr[i15 + 3] = s12;
        sArr[i15 + 4] = (short) (i17 + 3);
        sArr[i15 + 5] = s11;
        this.f94512e = i15 + 6;
        float f15 = this.f94514g;
        float f16 = i11 * f15;
        float f17 = this.f94515h;
        float f18 = (i12 + i14) * f17;
        float f19 = (i11 + i13) * f15;
        float f21 = i12 * f17;
        float f22 = f11 + f13;
        float f23 = f12 + f14;
        if (z11) {
            f19 = f16;
            f16 = f19;
        }
        if (z12) {
            f18 = f21;
            f21 = f18;
        }
        float f24 = this.f94529v;
        fArr[i16] = f11;
        fArr[i16 + 1] = f12;
        fArr[i16 + 2] = f24;
        fArr[i16 + 3] = f16;
        fArr[i16 + 4] = f18;
        fArr[i16 + 5] = f11;
        fArr[i16 + 6] = f23;
        fArr[i16 + 7] = f24;
        fArr[i16 + 8] = f16;
        fArr[i16 + 9] = f21;
        fArr[i16 + 10] = f22;
        fArr[i16 + 11] = f23;
        fArr[i16 + 12] = f24;
        fArr[i16 + 13] = f19;
        fArr[i16 + 14] = f21;
        fArr[i16 + 15] = f22;
        fArr[i16 + 16] = f12;
        fArr[i16 + 17] = f24;
        fArr[i16 + 18] = f19;
        fArr[i16 + 19] = f18;
        this.f94511d = i16 + 20;
    }

    @Override // w1.a
    public void s(o oVar, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19) {
        float f21;
        float f22;
        float f23;
        float f24;
        float f25;
        float f26;
        float f27;
        if (!this.f94516i) {
            throw new IllegalStateException("PolygonSpriteBatch.begin must be called before draw.");
        }
        short[] sArr = this.f94510c;
        float[] fArr = this.f94509b;
        Texture texture = oVar.f94611a;
        if (texture != this.f94513f) {
            o(texture);
        } else if (this.f94512e + 6 > sArr.length || this.f94511d + 20 > fArr.length) {
            flush();
        }
        int i11 = this.f94512e;
        int i12 = this.f94511d / 5;
        short s11 = (short) i12;
        sArr[i11] = s11;
        sArr[i11 + 1] = (short) (i12 + 1);
        short s12 = (short) (i12 + 2);
        sArr[i11 + 2] = s12;
        sArr[i11 + 3] = s12;
        sArr[i11 + 4] = (short) (i12 + 3);
        sArr[i11 + 5] = s11;
        this.f94512e = i11 + 6;
        float f28 = f11 + f13;
        float f29 = f12 + f14;
        float f31 = -f13;
        float f32 = -f14;
        float f33 = f15 - f13;
        float f34 = f16 - f14;
        if (f17 != 1.0f || f18 != 1.0f) {
            f31 *= f17;
            f32 *= f18;
            f33 *= f17;
            f34 *= f18;
        }
        if (f19 != 0.0f) {
            float t11 = com.badlogic.gdx.math.n.t(f19);
            float a02 = com.badlogic.gdx.math.n.a0(f19);
            float f35 = t11 * f31;
            f22 = f35 - (a02 * f32);
            float f36 = f31 * a02;
            float f37 = (f32 * t11) + f36;
            float f38 = a02 * f34;
            f21 = f35 - f38;
            float f39 = f34 * t11;
            f25 = f36 + f39;
            float f41 = (t11 * f33) - f38;
            float f42 = f39 + (a02 * f33);
            f24 = f42 - (f25 - f37);
            f27 = (f41 - f21) + f22;
            f33 = f41;
            f23 = f37;
            f26 = f42;
        } else {
            f21 = f31;
            f22 = f21;
            f23 = f32;
            f24 = f23;
            f25 = f34;
            f26 = f25;
            f27 = f33;
        }
        float f43 = f22 + f28;
        float f44 = f23 + f29;
        float f45 = f21 + f28;
        float f46 = f25 + f29;
        float f47 = f33 + f28;
        float f48 = f26 + f29;
        float f49 = f27 + f28;
        float f51 = f24 + f29;
        float f52 = oVar.f94612b;
        float f53 = oVar.f94615e;
        float f54 = oVar.f94614d;
        float f55 = oVar.f94613c;
        float f56 = this.f94529v;
        int i13 = this.f94511d;
        fArr[i13] = f43;
        fArr[i13 + 1] = f44;
        fArr[i13 + 2] = f56;
        fArr[i13 + 3] = f52;
        fArr[i13 + 4] = f53;
        fArr[i13 + 5] = f45;
        fArr[i13 + 6] = f46;
        fArr[i13 + 7] = f56;
        fArr[i13 + 8] = f52;
        fArr[i13 + 9] = f55;
        fArr[i13 + 10] = f47;
        fArr[i13 + 11] = f48;
        fArr[i13 + 12] = f56;
        fArr[i13 + 13] = f54;
        fArr[i13 + 14] = f55;
        fArr[i13 + 15] = f49;
        fArr[i13 + 16] = f51;
        fArr[i13 + 17] = f56;
        fArr[i13 + 18] = f54;
        fArr[i13 + 19] = f53;
        this.f94511d = i13 + 20;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005b A[LOOP:0: B:8:0x0059->B:9:0x005b, LOOP_END] */
    @Override // w1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void t0(com.badlogic.gdx.graphics.Texture r9, float[] r10, int r11, int r12) {
        /*
            r8 = this;
            boolean r0 = r8.f94516i
            if (r0 == 0) goto La1
            short[] r0 = r8.f94510c
            float[] r1 = r8.f94509b
            int r2 = r12 / 20
            int r2 = r2 * 6
            com.badlogic.gdx.graphics.Texture r3 = r8.f94513f
            if (r9 == r3) goto L2a
            r8.o(r9)
            int r9 = r1.length
            int r2 = r1.length
            int r2 = r2 % 20
            int r9 = r9 - r2
            int r9 = java.lang.Math.min(r12, r9)
            int r2 = r0.length
            int r2 = r2 / 6
            int r2 = r2 * 20
            int r9 = java.lang.Math.min(r9, r2)
            int r2 = r9 / 20
        L27:
            int r2 = r2 * 6
            goto L51
        L2a:
            int r9 = r8.f94512e
            int r9 = r9 + r2
            int r3 = r0.length
            if (r9 > r3) goto L39
            int r9 = r8.f94511d
            int r9 = r9 + r12
            int r3 = r1.length
            if (r9 <= r3) goto L37
            goto L39
        L37:
            r9 = r12
            goto L51
        L39:
            r8.flush()
            int r9 = r1.length
            int r2 = r1.length
            int r2 = r2 % 20
            int r9 = r9 - r2
            int r9 = java.lang.Math.min(r12, r9)
            int r2 = r0.length
            int r2 = r2 / 6
            int r2 = r2 * 20
            int r9 = java.lang.Math.min(r9, r2)
            int r2 = r9 / 20
            goto L27
        L51:
            int r3 = r8.f94511d
            int r4 = r3 / 5
            short r4 = (short) r4
            int r5 = r8.f94512e
            int r2 = r2 + r5
        L59:
            if (r5 >= r2) goto L80
            r0[r5] = r4
            int r6 = r5 + 1
            int r7 = r4 + 1
            short r7 = (short) r7
            r0[r6] = r7
            int r6 = r5 + 2
            int r7 = r4 + 2
            short r7 = (short) r7
            r0[r6] = r7
            int r6 = r5 + 3
            r0[r6] = r7
            int r6 = r5 + 4
            int r7 = r4 + 3
            short r7 = (short) r7
            r0[r6] = r7
            int r6 = r5 + 5
            r0[r6] = r4
            int r5 = r5 + 6
            int r4 = r4 + 4
            short r4 = (short) r4
            goto L59
        L80:
            java.lang.System.arraycopy(r10, r11, r1, r3, r9)
            int r3 = r3 + r9
            r8.f94511d = r3
            r8.f94512e = r5
            int r12 = r12 - r9
            if (r12 != 0) goto L8c
            return
        L8c:
            int r11 = r11 + r9
            r8.flush()
            r3 = 0
            if (r9 <= r12) goto L80
            int r9 = r0.length
            int r9 = r9 / 6
            int r9 = r9 * 20
            int r9 = java.lang.Math.min(r12, r9)
            int r2 = r9 / 20
            int r5 = r2 * 6
            goto L80
        La1:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "PolygonSpriteBatch.begin must be called before draw."
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.j.t0(com.badlogic.gdx.graphics.Texture, float[], int, int):void");
    }

    @Override // w1.a
    public void u0(Texture texture, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, int i11, int i12, int i13, int i14, boolean z11, boolean z12) {
        float f21;
        float f22;
        float f23;
        float f24;
        float f25;
        float f26;
        float f27;
        if (!this.f94516i) {
            throw new IllegalStateException("PolygonSpriteBatch.begin must be called before draw.");
        }
        short[] sArr = this.f94510c;
        float[] fArr = this.f94509b;
        if (texture != this.f94513f) {
            o(texture);
        } else if (this.f94512e + 6 > sArr.length || this.f94511d + 20 > fArr.length) {
            flush();
        }
        int i15 = this.f94512e;
        int i16 = this.f94511d / 5;
        short s11 = (short) i16;
        sArr[i15] = s11;
        sArr[i15 + 1] = (short) (i16 + 1);
        short s12 = (short) (i16 + 2);
        sArr[i15 + 2] = s12;
        sArr[i15 + 3] = s12;
        sArr[i15 + 4] = (short) (i16 + 3);
        sArr[i15 + 5] = s11;
        this.f94512e = i15 + 6;
        float f28 = f11 + f13;
        float f29 = f12 + f14;
        float f31 = -f13;
        float f32 = -f14;
        float f33 = f15 - f13;
        float f34 = f16 - f14;
        if (f17 != 1.0f || f18 != 1.0f) {
            f31 *= f17;
            f32 *= f18;
            f33 *= f17;
            f34 *= f18;
        }
        if (f19 != 0.0f) {
            float t11 = com.badlogic.gdx.math.n.t(f19);
            float a02 = com.badlogic.gdx.math.n.a0(f19);
            float f35 = t11 * f31;
            f22 = f35 - (a02 * f32);
            float f36 = f31 * a02;
            float f37 = (f32 * t11) + f36;
            float f38 = a02 * f34;
            f21 = f35 - f38;
            float f39 = f34 * t11;
            f25 = f36 + f39;
            float f41 = (t11 * f33) - f38;
            float f42 = f39 + (a02 * f33);
            f24 = f42 - (f25 - f37);
            f27 = (f41 - f21) + f22;
            f33 = f41;
            f23 = f37;
            f26 = f42;
        } else {
            f21 = f31;
            f22 = f21;
            f23 = f32;
            f24 = f23;
            f25 = f34;
            f26 = f25;
            f27 = f33;
        }
        float f43 = f22 + f28;
        float f44 = f23 + f29;
        float f45 = f21 + f28;
        float f46 = f25 + f29;
        float f47 = f33 + f28;
        float f48 = f26 + f29;
        float f49 = f27 + f28;
        float f51 = f24 + f29;
        float f52 = this.f94514g;
        float f53 = i11 * f52;
        float f54 = this.f94515h;
        float f55 = (i12 + i14) * f54;
        float f56 = (i11 + i13) * f52;
        float f57 = i12 * f54;
        if (z11) {
            f53 = f56;
            f56 = f53;
        }
        if (z12) {
            f55 = f57;
            f57 = f55;
        }
        float f58 = this.f94529v;
        int i17 = this.f94511d;
        fArr[i17] = f43;
        fArr[i17 + 1] = f44;
        fArr[i17 + 2] = f58;
        fArr[i17 + 3] = f53;
        fArr[i17 + 4] = f55;
        fArr[i17 + 5] = f45;
        fArr[i17 + 6] = f46;
        fArr[i17 + 7] = f58;
        fArr[i17 + 8] = f53;
        fArr[i17 + 9] = f57;
        fArr[i17 + 10] = f47;
        fArr[i17 + 11] = f48;
        fArr[i17 + 12] = f58;
        fArr[i17 + 13] = f56;
        fArr[i17 + 14] = f57;
        fArr[i17 + 15] = f49;
        fArr[i17 + 16] = f51;
        fArr[i17 + 17] = f58;
        fArr[i17 + 18] = f56;
        fArr[i17 + 19] = f55;
        this.f94511d = i17 + 20;
    }

    @Override // w1.a
    public void v() {
        flush();
        this.f94520m = true;
    }

    @Override // w1.a
    public void v0(o oVar, float f11, float f12, float f13, float f14) {
        if (!this.f94516i) {
            throw new IllegalStateException("PolygonSpriteBatch.begin must be called before draw.");
        }
        short[] sArr = this.f94510c;
        float[] fArr = this.f94509b;
        Texture texture = oVar.f94611a;
        if (texture != this.f94513f) {
            o(texture);
        } else if (this.f94512e + 6 > sArr.length || this.f94511d + 20 > fArr.length) {
            flush();
        }
        int i11 = this.f94512e;
        int i12 = this.f94511d;
        int i13 = i12 / 5;
        short s11 = (short) i13;
        sArr[i11] = s11;
        sArr[i11 + 1] = (short) (i13 + 1);
        short s12 = (short) (i13 + 2);
        sArr[i11 + 2] = s12;
        sArr[i11 + 3] = s12;
        sArr[i11 + 4] = (short) (i13 + 3);
        sArr[i11 + 5] = s11;
        this.f94512e = i11 + 6;
        float f15 = f13 + f11;
        float f16 = f14 + f12;
        float f17 = oVar.f94612b;
        float f18 = oVar.f94615e;
        float f19 = oVar.f94614d;
        float f21 = oVar.f94613c;
        float f22 = this.f94529v;
        fArr[i12] = f11;
        fArr[i12 + 1] = f12;
        fArr[i12 + 2] = f22;
        fArr[i12 + 3] = f17;
        fArr[i12 + 4] = f18;
        fArr[i12 + 5] = f11;
        fArr[i12 + 6] = f16;
        fArr[i12 + 7] = f22;
        fArr[i12 + 8] = f17;
        fArr[i12 + 9] = f21;
        fArr[i12 + 10] = f15;
        fArr[i12 + 11] = f16;
        fArr[i12 + 12] = f22;
        fArr[i12 + 13] = f19;
        fArr[i12 + 14] = f21;
        fArr[i12 + 15] = f15;
        fArr[i12 + 16] = f12;
        fArr[i12 + 17] = f22;
        fArr[i12 + 18] = f19;
        fArr[i12 + 19] = f18;
        this.f94511d = i12 + 20;
    }

    @Override // w1.a
    public Matrix4 x0() {
        return this.f94518k;
    }

    public j(int i11) {
        this(i11, i11 * 2, null);
    }

    public j(int i11, w wVar) {
        this(i11, i11 * 2, wVar);
    }

    public j(int i11, int i12, w wVar) {
        this.f94514g = 0.0f;
        this.f94515h = 0.0f;
        this.f94517j = new Matrix4();
        Matrix4 matrix4 = new Matrix4();
        this.f94518k = matrix4;
        this.f94519l = new Matrix4();
        this.f94521n = com.badlogic.gdx.graphics.f.f11653r;
        this.f94522o = com.badlogic.gdx.graphics.f.f11659s;
        this.f94523p = com.badlogic.gdx.graphics.f.f11653r;
        this.f94524q = com.badlogic.gdx.graphics.f.f11659s;
        this.f94528u = new com.badlogic.gdx.graphics.b(1.0f, 1.0f, 1.0f, 1.0f);
        this.f94529v = com.badlogic.gdx.graphics.b.f11527j;
        this.f94530w = 0;
        this.f94531x = 0;
        this.f94532y = 0;
        if (i11 <= 32767) {
            int i13 = i12 * 3;
            this.f94508a = new Mesh(q1.g.f81386i != null ? Mesh.VertexDataType.VertexBufferObjectWithVAO : Mesh.VertexDataType.VertexArray, false, i11, i13, new r(1, 2, w.f74225u), new r(4, 4, w.f74227w), new r(16, 2, "a_texCoord0"));
            this.f94509b = new float[i11 * 5];
            this.f94510c = new short[i13];
            if (wVar == null) {
                this.f94525r = m.b();
                this.f94527t = true;
            } else {
                this.f94525r = wVar;
            }
            matrix4.setToOrtho2D(0.0f, 0.0f, q1.g.f81379b.getWidth(), q1.g.f81379b.getHeight());
            return;
        }
        throw new IllegalArgumentException("Can't have more than 32767 vertices per batch: " + i11);
    }
}
