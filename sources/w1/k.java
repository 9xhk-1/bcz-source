package w1;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.q;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public o f94533a;

    /* renamed from: b, reason: collision with root package name */
    public float f94534b;

    /* renamed from: g, reason: collision with root package name */
    public int f94539g;

    /* renamed from: h, reason: collision with root package name */
    public int f94540h;

    /* renamed from: i, reason: collision with root package name */
    public float f94541i;

    /* renamed from: j, reason: collision with root package name */
    public float f94542j;

    /* renamed from: c, reason: collision with root package name */
    public boolean f94535c = true;

    /* renamed from: d, reason: collision with root package name */
    public com.badlogic.gdx.utils.a<float[]> f94536d = new com.badlogic.gdx.utils.a<>();

    /* renamed from: e, reason: collision with root package name */
    public com.badlogic.gdx.utils.a<float[]> f94537e = new com.badlogic.gdx.utils.a<>();

    /* renamed from: f, reason: collision with root package name */
    public com.badlogic.gdx.utils.a<short[]> f94538f = new com.badlogic.gdx.utils.a<>();

    /* renamed from: k, reason: collision with root package name */
    public float f94543k = 0.0f;

    /* renamed from: l, reason: collision with root package name */
    public float f94544l = 0.0f;

    /* renamed from: m, reason: collision with root package name */
    public com.badlogic.gdx.graphics.b f94545m = com.badlogic.gdx.graphics.b.f11522e;

    /* renamed from: n, reason: collision with root package name */
    public Vector2 f94546n = new Vector2();

    public final void a() {
        this.f94537e.clear();
        int i11 = 0;
        while (true) {
            com.badlogic.gdx.utils.a<float[]> aVar = this.f94536d;
            if (i11 >= aVar.f13179b) {
                this.f94535c = false;
                return;
            }
            float[] fArr = aVar.get(i11);
            if (fArr != null) {
                float[] fArr2 = new float[(fArr.length * 5) / 2];
                int i12 = this.f94540h;
                int i13 = i11 / i12;
                int i14 = i11 % i12;
                int i15 = 0;
                for (int i16 = 0; i16 < fArr.length; i16 += 2) {
                    float f11 = fArr[i16];
                    Vector2 vector2 = this.f94546n;
                    fArr2[i15] = f11 + vector2.f12535x + this.f94543k;
                    int i17 = i16 + 1;
                    fArr2[i15 + 1] = fArr[i17] + vector2.f12536y + this.f94544l;
                    int i18 = i15 + 3;
                    fArr2[i15 + 2] = this.f94545m.L();
                    float f12 = fArr[i16];
                    float f13 = this.f94541i;
                    float f14 = (f12 % f13) / f13;
                    float f15 = fArr[i17];
                    float f16 = this.f94542j;
                    float f17 = (f15 % f16) / f16;
                    if (f12 == i13 * f13) {
                        f14 = 0.0f;
                    }
                    float f18 = 1.0f;
                    if (f12 == (i13 + 1) * f13) {
                        f14 = 1.0f;
                    }
                    if (f15 == i14 * f16) {
                        f17 = 0.0f;
                    }
                    if (f15 != (i14 + 1) * f16) {
                        f18 = f17;
                    }
                    float g11 = this.f94533a.g() + ((this.f94533a.h() - this.f94533a.g()) * f14);
                    float i19 = this.f94533a.i() + ((this.f94533a.j() - this.f94533a.i()) * f18);
                    int i21 = i15 + 4;
                    fArr2[i18] = g11;
                    i15 += 5;
                    fArr2[i21] = i19;
                }
                this.f94537e.a(fArr2);
            }
            i11++;
        }
    }

    public void b(j jVar) {
        if (this.f94535c) {
            a();
        }
        for (int i11 = 0; i11 < this.f94537e.f13179b; i11++) {
            jVar.L0(this.f94533a.f(), this.f94537e.get(i11), 0, this.f94537e.get(i11).length, this.f94538f.get(i11), 0, this.f94538f.get(i11).length);
        }
    }

    public final float[] c(float[] fArr) {
        this.f94546n.set(fArr[0], fArr[1]);
        for (int i11 = 0; i11 < fArr.length - 1; i11 += 2) {
            Vector2 vector2 = this.f94546n;
            float f11 = vector2.f12535x;
            float f12 = fArr[i11];
            if (f11 > f12) {
                vector2.f12535x = f12;
            }
            float f13 = vector2.f12536y;
            float f14 = fArr[i11 + 1];
            if (f13 > f14) {
                vector2.f12536y = f14;
            }
        }
        for (int i12 = 0; i12 < fArr.length; i12 += 2) {
            float f15 = fArr[i12];
            Vector2 vector22 = this.f94546n;
            fArr[i12] = f15 - vector22.f12535x;
            int i13 = i12 + 1;
            fArr[i13] = fArr[i13] - vector22.f12536y;
        }
        return fArr;
    }

    public void d(com.badlogic.gdx.graphics.b bVar) {
        this.f94545m = bVar;
        this.f94535c = true;
    }

    public void e(o oVar, float[] fArr) {
        f(oVar, fArr, -1.0f);
    }

    public void f(o oVar, float[] fArr, float f11) {
        this.f94533a = oVar;
        q qVar = new q(c(fArr));
        q qVar2 = new q();
        q qVar3 = new q();
        com.badlogic.gdx.math.h hVar = new com.badlogic.gdx.math.h();
        Rectangle c11 = qVar.c();
        if (f11 == -1.0f) {
            f11 = c11.getWidth() / oVar.c();
        }
        float b11 = oVar.b() / oVar.c();
        this.f94539g = (int) Math.ceil(f11);
        float width = c11.getWidth() / f11;
        this.f94541i = width;
        this.f94542j = b11 * width;
        this.f94540h = (int) Math.ceil(c11.getHeight() / this.f94542j);
        for (int i11 = 0; i11 < this.f94539g; i11++) {
            int i12 = 0;
            while (i12 < this.f94540h) {
                float f12 = i11;
                float f13 = this.f94541i;
                float f14 = i12;
                float f15 = this.f94542j;
                i12++;
                float f16 = i12;
                float f17 = i11 + 1;
                qVar2.x(new float[]{f12 * f13, f14 * f15, f12 * f13, f16 * f15, f17 * f13, f16 * f15, f17 * f13, f14 * f15});
                com.badlogic.gdx.math.m.r(qVar, qVar2, qVar3);
                float[] m11 = qVar3.m();
                if (m11.length > 0) {
                    this.f94536d.a(h(m11));
                    this.f94538f.a(hVar.d(m11).N());
                } else {
                    this.f94536d.a(null);
                }
            }
        }
        a();
    }

    public void g(float f11, float f12) {
        this.f94543k = f11;
        this.f94544l = f12;
        this.f94535c = true;
    }

    public final float[] h(float[] fArr) {
        for (int i11 = 0; i11 < fArr.length; i11 += 2) {
            float f11 = fArr[i11];
            float f12 = this.f94541i;
            float f13 = (f11 / f12) % 1.0f;
            int i12 = i11 + 1;
            float f14 = (fArr[i12] / this.f94542j) % 1.0f;
            if (f13 > 0.99f || f13 < 0.01f) {
                fArr[i11] = f12 * Math.round(f11 / f12);
            }
            if (f14 > 0.99f || f14 < 0.01f) {
                fArr[i12] = this.f94542j * Math.round(fArr[i12] / r1);
            }
        }
        return fArr;
    }
}
