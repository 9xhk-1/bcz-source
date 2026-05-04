package rm;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.github.mikephil.charting.data.CandleEntry;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class i {

    /* renamed from: c, reason: collision with root package name */
    public l f84278c;

    /* renamed from: a, reason: collision with root package name */
    public Matrix f84276a = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    public Matrix f84277b = new Matrix();

    /* renamed from: d, reason: collision with root package name */
    public float[] f84279d = new float[1];

    /* renamed from: e, reason: collision with root package name */
    public float[] f84280e = new float[1];

    /* renamed from: f, reason: collision with root package name */
    public float[] f84281f = new float[1];

    /* renamed from: g, reason: collision with root package name */
    public float[] f84282g = new float[1];

    /* renamed from: h, reason: collision with root package name */
    public Matrix f84283h = new Matrix();

    /* renamed from: i, reason: collision with root package name */
    public float[] f84284i = new float[2];

    /* renamed from: j, reason: collision with root package name */
    public Matrix f84285j = new Matrix();

    /* renamed from: k, reason: collision with root package name */
    public Matrix f84286k = new Matrix();

    public i(l lVar) {
        this.f84278c = lVar;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [com.github.mikephil.charting.data.Entry, fm.f] */
    public float[] a(km.c cVar, float f11, int i11, int i12) {
        int i13 = ((i12 - i11) + 1) * 2;
        if (this.f84280e.length != i13) {
            this.f84280e = new float[i13];
        }
        float[] fArr = this.f84280e;
        for (int i14 = 0; i14 < i13; i14 += 2) {
            ?? m11 = cVar.m((i14 / 2) + i11);
            if (m11 != 0) {
                fArr[i14] = m11.j();
                fArr[i14 + 1] = m11.c() * f11;
            } else {
                fArr[i14] = 0.0f;
                fArr[i14 + 1] = 0.0f;
            }
        }
        i().mapPoints(fArr);
        return fArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public float[] b(km.d dVar, float f11, float f12, int i11, int i12) {
        int i13 = ((int) (((i12 - i11) * f11) + 1.0f)) * 2;
        if (this.f84282g.length != i13) {
            this.f84282g = new float[i13];
        }
        float[] fArr = this.f84282g;
        for (int i14 = 0; i14 < i13; i14 += 2) {
            CandleEntry candleEntry = (CandleEntry) dVar.m((i14 / 2) + i11);
            if (candleEntry != null) {
                fArr[i14] = candleEntry.j();
                fArr[i14 + 1] = candleEntry.o() * f12;
            } else {
                fArr[i14] = 0.0f;
                fArr[i14 + 1] = 0.0f;
            }
        }
        i().mapPoints(fArr);
        return fArr;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.github.mikephil.charting.data.Entry, fm.f] */
    public float[] c(km.f fVar, float f11, float f12, int i11, int i12) {
        int i13 = (((int) ((i12 - i11) * f11)) + 1) * 2;
        if (this.f84281f.length != i13) {
            this.f84281f = new float[i13];
        }
        float[] fArr = this.f84281f;
        for (int i14 = 0; i14 < i13; i14 += 2) {
            ?? m11 = fVar.m((i14 / 2) + i11);
            if (m11 != 0) {
                fArr[i14] = m11.j();
                fArr[i14 + 1] = m11.c() * f12;
            } else {
                fArr[i14] = 0.0f;
                fArr[i14 + 1] = 0.0f;
            }
        }
        i().mapPoints(fArr);
        return fArr;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.github.mikephil.charting.data.Entry, fm.f] */
    public float[] d(km.k kVar, float f11, float f12, int i11, int i12) {
        int i13 = ((int) (((i12 - i11) * f11) + 1.0f)) * 2;
        if (this.f84279d.length != i13) {
            this.f84279d = new float[i13];
        }
        float[] fArr = this.f84279d;
        for (int i14 = 0; i14 < i13; i14 += 2) {
            ?? m11 = kVar.m((i14 / 2) + i11);
            if (m11 != 0) {
                fArr[i14] = m11.j();
                fArr[i14 + 1] = m11.c() * f12;
            } else {
                fArr[i14] = 0.0f;
                fArr[i14 + 1] = 0.0f;
            }
        }
        i().mapPoints(fArr);
        return fArr;
    }

    public Matrix e() {
        return this.f84277b;
    }

    public f f(float f11, float f12) {
        float[] fArr = this.f84284i;
        fArr[0] = f11;
        fArr[1] = f12;
        o(fArr);
        float[] fArr2 = this.f84284i;
        return f.b(fArr2[0], fArr2[1]);
    }

    public Matrix g() {
        i().invert(this.f84286k);
        return this.f84286k;
    }

    public Matrix h() {
        return this.f84276a;
    }

    public Matrix i() {
        this.f84285j.set(this.f84276a);
        this.f84285j.postConcat(this.f84278c.f84302a);
        this.f84285j.postConcat(this.f84277b);
        return this.f84285j;
    }

    public f j(float f11, float f12) {
        f b11 = f.b(0.0d, 0.0d);
        k(f11, f12, b11);
        return b11;
    }

    public void k(float f11, float f12, f fVar) {
        float[] fArr = this.f84284i;
        fArr[0] = f11;
        fArr[1] = f12;
        n(fArr);
        float[] fArr2 = this.f84284i;
        fVar.f84261c = fArr2[0];
        fVar.f84262d = fArr2[1];
    }

    public void l(Path path) {
        path.transform(this.f84276a);
        path.transform(this.f84278c.r());
        path.transform(this.f84277b);
    }

    public void m(List<Path> list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            l(list.get(i11));
        }
    }

    public void n(float[] fArr) {
        Matrix matrix = this.f84283h;
        matrix.reset();
        this.f84277b.invert(matrix);
        matrix.mapPoints(fArr);
        this.f84278c.r().invert(matrix);
        matrix.mapPoints(fArr);
        this.f84276a.invert(matrix);
        matrix.mapPoints(fArr);
    }

    public void o(float[] fArr) {
        this.f84276a.mapPoints(fArr);
        this.f84278c.r().mapPoints(fArr);
        this.f84277b.mapPoints(fArr);
    }

    public void p(boolean z11) {
        this.f84277b.reset();
        if (!z11) {
            this.f84277b.postTranslate(this.f84278c.P(), this.f84278c.n() - this.f84278c.O());
        } else {
            this.f84277b.setTranslate(this.f84278c.P(), -this.f84278c.R());
            this.f84277b.postScale(1.0f, -1.0f);
        }
    }

    public void q(float f11, float f12, float f13, float f14) {
        float k11 = this.f84278c.k() / f12;
        float g11 = this.f84278c.g() / f13;
        if (Float.isInfinite(k11)) {
            k11 = 0.0f;
        }
        if (Float.isInfinite(g11)) {
            g11 = 0.0f;
        }
        this.f84276a.reset();
        this.f84276a.postTranslate(-f11, -f14);
        this.f84276a.postScale(k11, -g11);
    }

    public void r(RectF rectF, float f11) {
        rectF.top *= f11;
        rectF.bottom *= f11;
        this.f84276a.mapRect(rectF);
        this.f84278c.r().mapRect(rectF);
        this.f84277b.mapRect(rectF);
    }

    public void s(RectF rectF, float f11) {
        rectF.left *= f11;
        rectF.right *= f11;
        this.f84276a.mapRect(rectF);
        this.f84278c.r().mapRect(rectF);
        this.f84277b.mapRect(rectF);
    }

    public void t(RectF rectF) {
        this.f84276a.mapRect(rectF);
        this.f84278c.r().mapRect(rectF);
        this.f84277b.mapRect(rectF);
    }

    public void u(RectF rectF) {
        this.f84276a.mapRect(rectF);
        this.f84278c.r().mapRect(rectF);
        this.f84277b.mapRect(rectF);
    }

    public void v(RectF rectF, float f11) {
        rectF.left *= f11;
        rectF.right *= f11;
        this.f84276a.mapRect(rectF);
        this.f84278c.r().mapRect(rectF);
        this.f84277b.mapRect(rectF);
    }

    public void w(List<RectF> list) {
        Matrix i11 = i();
        for (int i12 = 0; i12 < list.size(); i12++) {
            i11.mapRect(list.get(i12));
        }
    }
}
