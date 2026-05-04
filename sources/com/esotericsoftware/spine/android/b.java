package com.esotericsoftware.spine.android;

import a3.j0;
import a3.r;
import a3.t0;
import a3.v;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import com.badlogic.gdx.math.Vector2;
import com.esotericsoftware.spine.BlendMode;
import com.esotericsoftware.spine.Skeleton;
import jl.m;
import ol.e;
import ol.g;
import ol.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class b {

    /* renamed from: d, reason: collision with root package name */
    public static final short[] f29295d = {0, 1, 2, 2, 3, 0};

    /* renamed from: a, reason: collision with root package name */
    public final pl.c f29296a = new pl.c();

    /* renamed from: b, reason: collision with root package name */
    public final j0<C0343b> f29297b = new a(10);

    /* renamed from: c, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<C0343b> f29298c = new com.badlogic.gdx.utils.a<>();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends j0<C0343b> {
        public a(int i11) {
            super(i11);
        }

        @Override // a3.j0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public C0343b g() {
            return new C0343b();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.esotericsoftware.spine.android.b$b, reason: collision with other inner class name */
    public static class C0343b implements j0.a {

        /* renamed from: a, reason: collision with root package name */
        public r f29300a = new r(32);

        /* renamed from: b, reason: collision with root package name */
        public r f29301b = new r(32);

        /* renamed from: c, reason: collision with root package name */
        public v f29302c = new v(32);

        /* renamed from: d, reason: collision with root package name */
        public t0 f29303d = new t0(32);

        /* renamed from: e, reason: collision with root package name */
        public BlendMode f29304e;

        /* renamed from: f, reason: collision with root package name */
        public kl.c f29305f;

        @Override // a3.j0.a
        public void reset() {
            this.f29300a.I(0);
            this.f29301b.I(0);
            this.f29302c.H(0);
            this.f29303d.I(0);
            this.f29304e = null;
            this.f29305f = null;
        }
    }

    public com.badlogic.gdx.utils.a<C0343b> a(Skeleton skeleton) {
        float f11;
        float f12;
        int o11;
        int i11;
        float[] B;
        com.badlogic.gdx.graphics.b e11;
        short[] sArr;
        int i12;
        int i13;
        int i14;
        com.badlogic.gdx.graphics.b l11 = skeleton.l();
        float f13 = l11.f11544a;
        float f14 = l11.f11545b;
        float f15 = l11.f11546c;
        float f16 = l11.f11547d;
        this.f29297b.e(this.f29298c);
        this.f29298c.clear();
        C0343b h11 = this.f29297b.h();
        this.f29298c.a(h11);
        m[] mVarArr = skeleton.n().f13178a;
        int i15 = skeleton.n().f13179b;
        int i16 = 0;
        int i17 = 0;
        while (i16 < i15) {
            m mVar = mVarArr[i16];
            if (mVar.b().isActive()) {
                ol.b a11 = mVar.a();
                if (a11 == null) {
                    this.f29296a.c(mVar);
                } else {
                    if (a11 instanceof j) {
                        j jVar = (j) a11;
                        if (jVar.d() != null) {
                            jVar.d().a(mVar, jVar);
                        }
                        kl.c cVar = (kl.c) jVar.g().f();
                        BlendMode b11 = mVar.e().b();
                        if (h11.f29304e == null && h11.f29305f == null) {
                            h11.f29304e = b11;
                            h11.f29305f = cVar;
                        }
                        if (h11.f29304e != b11 || h11.f29305f != cVar || h11.f29300a.f1626b + 8 > 64000) {
                            h11 = this.f29297b.h();
                            this.f29298c.a(h11);
                            h11.f29304e = b11;
                            h11.f29305f = cVar;
                            i17 = 0;
                        }
                        r rVar = h11.f29300a;
                        rVar.I(rVar.f1626b + 8);
                        jVar.j(mVar, h11.f29300a.f1625a, i17, 2);
                        B = jVar.q();
                        sArr = f29295d;
                        e11 = jVar.e();
                        f11 = f16;
                        i12 = i17;
                        o11 = 8;
                    } else if (a11 instanceof g) {
                        g gVar = (g) a11;
                        o11 = gVar.o();
                        if (gVar.d() != null) {
                            gVar.d().a(mVar, gVar);
                        }
                        kl.c cVar2 = (kl.c) gVar.g().f();
                        BlendMode b12 = mVar.e().b();
                        if (h11.f29304e == null && h11.f29305f == null) {
                            h11.f29304e = b12;
                            h11.f29305f = cVar2;
                        }
                        if (h11.f29304e == b12 && h11.f29305f == cVar2) {
                            f11 = f16;
                            if (h11.f29300a.f1626b + o11 <= 64000) {
                                i11 = i17;
                                r rVar2 = h11.f29300a;
                                rVar2.I(rVar2.f1626b + o11);
                                gVar.j(mVar, 0, o11, h11.f29300a.f1625a, i11, 2);
                                B = gVar.B();
                                short[] A = gVar.A();
                                e11 = gVar.e();
                                sArr = A;
                                i12 = i11;
                            }
                        } else {
                            f11 = f16;
                        }
                        h11 = this.f29297b.h();
                        this.f29298c.a(h11);
                        h11.f29304e = b12;
                        h11.f29305f = cVar2;
                        i11 = 0;
                        r rVar22 = h11.f29300a;
                        rVar22.I(rVar22.f1626b + o11);
                        gVar.j(mVar, 0, o11, h11.f29300a.f1625a, i11, 2);
                        B = gVar.B();
                        short[] A2 = gVar.A();
                        e11 = gVar.e();
                        sArr = A2;
                        i12 = i11;
                    } else {
                        f11 = f16;
                        f12 = f13;
                        if (a11 instanceof e) {
                            this.f29296a.d(mVar, (e) a11);
                        }
                        i16++;
                        f13 = f12;
                        f16 = f11;
                    }
                    float[] fArr = B;
                    com.badlogic.gdx.graphics.b c11 = mVar.c();
                    int i18 = ((int) (c11.f11546c * f15 * e11.f11546c * 255.0f)) | (((int) (((c11.f11547d * f11) * e11.f11547d) * 255.0f)) << 24) | (((int) (((c11.f11544a * f13) * e11.f11544a) * 255.0f)) << 16) | (((int) (((c11.f11545b * f14) * e11.f11545b) * 255.0f)) << 8);
                    int i19 = h11.f29303d.f1634b;
                    int length = sArr.length;
                    if (this.f29296a.k()) {
                        this.f29296a.g(h11.f29300a.f1625a, i12, sArr, sArr.length, fArr);
                        i14 = i12;
                        r j11 = this.f29296a.j();
                        h11.f29300a.I(j11.f1626b + i14);
                        i13 = i18;
                        System.arraycopy(j11.f1625a, 0, h11.f29300a.f1625a, i14, j11.f1626b);
                        h11.f29301b.e(this.f29296a.i());
                        h11.f29303d.f(this.f29296a.h());
                        o11 = j11.f1626b;
                        length = this.f29296a.h().f1634b;
                    } else {
                        i13 = i18;
                        i14 = i12;
                        h11.f29301b.g(fArr);
                        h11.f29303d.h(sArr);
                    }
                    float[] fArr2 = h11.f29301b.f1625a;
                    int C0 = h11.f29305f.C0();
                    int I = h11.f29305f.I();
                    int i21 = i14 + o11;
                    f12 = f13;
                    int i22 = i14;
                    while (i22 < i21) {
                        int i23 = i21;
                        fArr2[i22] = fArr2[i22] * C0;
                        int i24 = i22 + 1;
                        fArr2[i24] = fArr2[i24] * I;
                        i22 += 2;
                        i21 = i23;
                    }
                    int i25 = i21;
                    v vVar = h11.f29302c;
                    int i26 = o11 >> 1;
                    vVar.H(vVar.f1640b + i26);
                    int[] iArr = h11.f29302c.f1639a;
                    int i27 = i14 >> 1;
                    int i28 = i26 + i27;
                    for (int i29 = i27; i29 < i28; i29++) {
                        iArr[i29] = i13;
                    }
                    short[] sArr2 = h11.f29303d.f1633a;
                    int i31 = length + i19;
                    while (i19 < i31) {
                        sArr2[i19] = (short) (sArr2[i19] + i27);
                        i19++;
                    }
                    this.f29296a.c(mVar);
                    i17 = i25;
                    i16++;
                    f13 = f12;
                    f16 = f11;
                }
            } else {
                this.f29296a.c(mVar);
            }
            f11 = f16;
            f12 = f13;
            i16++;
            f13 = f12;
            f16 = f11;
        }
        this.f29296a.b();
        com.badlogic.gdx.utils.a<C0343b> aVar = this.f29298c;
        if (aVar.f13179b == 1 && aVar.get(0).f29300a.f1626b == 0) {
            this.f29297b.e(this.f29298c);
            this.f29298c.clear();
        }
        return this.f29298c;
    }

    public Bitmap b(float f11, float f12, int i11, Skeleton skeleton) {
        Vector2 vector2 = new Vector2(0.0f, 0.0f);
        Vector2 vector22 = new Vector2(0.0f, 0.0f);
        skeleton.j(vector2, vector22, new r());
        float f13 = vector2.f12535x;
        float f14 = vector2.f12536y;
        RectF rectF = new RectF(f13, f14, vector22.f12535x + f13, vector22.f12536y + f14);
        float width = 1.0f / (rectF.width() > rectF.height() ? rectF.width() / f11 : rectF.height() / f12);
        Bitmap createBitmap = Bitmap.createBitmap((int) f11, (int) f12, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setColor(i11);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect(0.0f, 0.0f, f11, f12, paint);
        canvas.translate(f11 / 2.0f, f12 / 2.0f);
        canvas.scale(width, -width);
        canvas.translate(-(rectF.left + (rectF.width() / 2.0f)), -(rectF.top + (rectF.height() / 2.0f)));
        c(canvas, a(skeleton));
        return createBitmap;
    }

    public void c(Canvas canvas, com.badlogic.gdx.utils.a<C0343b> aVar) {
        for (int i11 = 0; i11 < aVar.f13179b; i11++) {
            C0343b c0343b = aVar.get(i11);
            if (Build.VERSION.SDK_INT >= 29) {
                Canvas.VertexMode vertexMode = Canvas.VertexMode.TRIANGLES;
                r rVar = c0343b.f29300a;
                int i12 = rVar.f1626b;
                float[] fArr = rVar.f1625a;
                float[] fArr2 = c0343b.f29301b.f1625a;
                int[] iArr = c0343b.f29302c.f1639a;
                t0 t0Var = c0343b.f29303d;
                canvas.drawVertices(vertexMode, i12, fArr, 0, fArr2, 0, iArr, 0, t0Var.f1633a, 0, t0Var.f1634b, c0343b.f29305f.u1(c0343b.f29304e));
            } else {
                v vVar = c0343b.f29302c;
                int[] iArr2 = vVar.f1639a;
                int[] iArr3 = new int[c0343b.f29300a.f1626b];
                System.arraycopy(iArr2, 0, iArr3, 0, vVar.f1640b);
                Canvas.VertexMode vertexMode2 = Canvas.VertexMode.TRIANGLES;
                r rVar2 = c0343b.f29300a;
                int i13 = rVar2.f1626b;
                float[] fArr3 = rVar2.f1625a;
                float[] fArr4 = c0343b.f29301b.f1625a;
                t0 t0Var2 = c0343b.f29303d;
                canvas.drawVertices(vertexMode2, i13, fArr3, 0, fArr4, 0, iArr3, 0, t0Var2.f1633a, 0, t0Var2.f1634b, c0343b.f29305f.u1(c0343b.f29304e));
            }
        }
    }
}
