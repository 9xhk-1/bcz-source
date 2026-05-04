package pm;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.charts.RadarChart;
import com.github.mikephil.charting.data.RadarEntry;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class n extends k {

    /* renamed from: i, reason: collision with root package name */
    public RadarChart f80934i;

    /* renamed from: j, reason: collision with root package name */
    public Paint f80935j;

    /* renamed from: k, reason: collision with root package name */
    public Paint f80936k;

    /* renamed from: l, reason: collision with root package name */
    public Path f80937l;

    /* renamed from: m, reason: collision with root package name */
    public Path f80938m;

    public n(RadarChart radarChart, cm.a aVar, rm.l lVar) {
        super(aVar, lVar);
        this.f80937l = new Path();
        this.f80938m = new Path();
        this.f80934i = radarChart;
        Paint paint = new Paint(1);
        this.f80887d = paint;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.f80887d.setStrokeWidth(2.0f);
        this.f80887d.setColor(Color.rgb(255, 187, 115));
        Paint paint2 = new Paint(1);
        this.f80935j = paint2;
        paint2.setStyle(style);
        this.f80936k = new Paint(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // pm.g
    public void b(Canvas canvas) {
        fm.q qVar = (fm.q) this.f80934i.getData();
        int l12 = qVar.w().l1();
        for (km.j jVar : qVar.q()) {
            if (jVar.isVisible()) {
                r(canvas, jVar, l12);
            }
        }
    }

    @Override // pm.g
    public void c(Canvas canvas) {
        t(canvas);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // pm.g
    public void d(Canvas canvas, im.d[] dVarArr) {
        n nVar = this;
        float sliceAngle = nVar.f80934i.getSliceAngle();
        float factor = nVar.f80934i.getFactor();
        rm.g centerOffsets = nVar.f80934i.getCenterOffsets();
        rm.g c11 = rm.g.c(0.0f, 0.0f);
        fm.q qVar = (fm.q) nVar.f80934i.getData();
        int length = dVarArr.length;
        int i11 = 0;
        while (i11 < length) {
            im.d dVar = dVarArr[i11];
            km.j k11 = qVar.k(dVar.d());
            if (k11 != null && k11.g0()) {
                RadarEntry radarEntry = (RadarEntry) k11.m((int) dVar.h());
                if (nVar.l(radarEntry, k11)) {
                    rm.k.B(centerOffsets, (radarEntry.c() - nVar.f80934i.getYChartMin()) * factor * nVar.f80885b.i(), (dVar.h() * sliceAngle * nVar.f80885b.h()) + nVar.f80934i.getRotationAngle(), c11);
                    dVar.n(c11.f84265c, c11.f84266d);
                    nVar.n(canvas, c11.f84265c, c11.f84266d, k11);
                    if (k11.O0() && !Float.isNaN(c11.f84265c) && !Float.isNaN(c11.f84266d)) {
                        int n02 = k11.n0();
                        if (n02 == 1122867) {
                            n02 = k11.Y0(0);
                        }
                        if (k11.H() < 255) {
                            n02 = rm.a.a(n02, k11.H());
                        }
                        nVar.s(canvas, c11, k11.K0(), k11.r0(), k11.b(), n02, k11.H0());
                    }
                }
            }
            i11++;
            nVar = this;
        }
        rm.g.h(centerOffsets);
        rm.g.h(c11);
    }

    @Override // pm.g
    public void e(Canvas canvas, String str, float f11, float f12, int i11) {
        this.f80889f.setColor(i11);
        canvas.drawText(str, f11, f12, this.f80889f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // pm.g
    public void f(Canvas canvas) {
        float f11;
        km.j jVar;
        int i11;
        RadarEntry radarEntry;
        float f12;
        rm.g gVar;
        hm.l lVar;
        n nVar = this;
        float h11 = nVar.f80885b.h();
        float i12 = nVar.f80885b.i();
        float sliceAngle = nVar.f80934i.getSliceAngle();
        float factor = nVar.f80934i.getFactor();
        rm.g centerOffsets = nVar.f80934i.getCenterOffsets();
        rm.g c11 = rm.g.c(0.0f, 0.0f);
        rm.g c12 = rm.g.c(0.0f, 0.0f);
        float e11 = rm.k.e(5.0f);
        int i13 = 0;
        while (i13 < ((fm.q) nVar.f80934i.getData()).m()) {
            km.j k11 = ((fm.q) nVar.f80934i.getData()).k(i13);
            if (nVar.m(k11)) {
                nVar.a(k11);
                hm.l u02 = k11.u0();
                rm.g d11 = rm.g.d(k11.m1());
                d11.f84265c = rm.k.e(d11.f84265c);
                d11.f84266d = rm.k.e(d11.f84266d);
                int i14 = 0;
                while (i14 < k11.l1()) {
                    RadarEntry radarEntry2 = (RadarEntry) k11.m(i14);
                    rm.g gVar2 = d11;
                    float f13 = i14 * sliceAngle * h11;
                    rm.k.B(centerOffsets, (radarEntry2.c() - nVar.f80934i.getYChartMin()) * factor * i12, f13 + nVar.f80934i.getRotationAngle(), c11);
                    if (k11.E0()) {
                        hm.l lVar2 = u02;
                        i11 = i14;
                        radarEntry = radarEntry2;
                        f12 = h11;
                        gVar = gVar2;
                        nVar = this;
                        lVar = lVar2;
                        jVar = k11;
                        nVar.e(canvas, lVar2.k(radarEntry2), c11.f84265c, c11.f84266d - e11, k11.r(i14));
                    } else {
                        jVar = k11;
                        i11 = i14;
                        radarEntry = radarEntry2;
                        f12 = h11;
                        gVar = gVar2;
                        lVar = u02;
                    }
                    if (radarEntry.b() != null && jVar.L()) {
                        Drawable b11 = radarEntry.b();
                        rm.k.B(centerOffsets, (radarEntry.c() * factor * i12) + gVar.f84266d, f13 + nVar.f80934i.getRotationAngle(), c12);
                        float f14 = c12.f84266d + gVar.f84265c;
                        c12.f84266d = f14;
                        rm.k.k(canvas, b11, (int) c12.f84265c, (int) f14, b11.getIntrinsicWidth(), b11.getIntrinsicHeight());
                    }
                    i14 = i11 + 1;
                    d11 = gVar;
                    k11 = jVar;
                    u02 = lVar;
                    h11 = f12;
                }
                f11 = h11;
                rm.g.h(d11);
            } else {
                f11 = h11;
            }
            i13++;
            h11 = f11;
        }
        rm.g.h(centerOffsets);
        rm.g.h(c11);
        rm.g.h(c12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void r(Canvas canvas, km.j jVar, int i11) {
        float h11 = this.f80885b.h();
        float i12 = this.f80885b.i();
        float sliceAngle = this.f80934i.getSliceAngle();
        float factor = this.f80934i.getFactor();
        rm.g centerOffsets = this.f80934i.getCenterOffsets();
        rm.g c11 = rm.g.c(0.0f, 0.0f);
        Path path = this.f80937l;
        path.reset();
        boolean z11 = false;
        for (int i13 = 0; i13 < jVar.l1(); i13++) {
            this.f80886c.setColor(jVar.Y0(i13));
            rm.k.B(centerOffsets, (((RadarEntry) jVar.m(i13)).c() - this.f80934i.getYChartMin()) * factor * i12, (i13 * sliceAngle * h11) + this.f80934i.getRotationAngle(), c11);
            if (!Float.isNaN(c11.f84265c)) {
                if (z11) {
                    path.lineTo(c11.f84265c, c11.f84266d);
                } else {
                    path.moveTo(c11.f84265c, c11.f84266d);
                    z11 = true;
                }
            }
        }
        if (jVar.l1() > i11) {
            path.lineTo(centerOffsets.f84265c, centerOffsets.f84266d);
        }
        path.close();
        if (jVar.W0()) {
            Drawable k11 = jVar.k();
            if (k11 != null) {
                q(canvas, path, k11);
            } else {
                p(canvas, path, jVar.G(), jVar.l0());
            }
        }
        this.f80886c.setStrokeWidth(jVar.o0());
        this.f80886c.setStyle(Paint.Style.STROKE);
        if (!jVar.W0() || jVar.l0() < 255) {
            canvas.drawPath(path, this.f80886c);
        }
        rm.g.h(centerOffsets);
        rm.g.h(c11);
    }

    public void s(Canvas canvas, rm.g gVar, float f11, float f12, int i11, int i12, float f13) {
        canvas.save();
        float e11 = rm.k.e(f12);
        float e12 = rm.k.e(f11);
        if (i11 != 1122867) {
            Path path = this.f80938m;
            path.reset();
            path.addCircle(gVar.f84265c, gVar.f84266d, e11, Path.Direction.CW);
            if (e12 > 0.0f) {
                path.addCircle(gVar.f84265c, gVar.f84266d, e12, Path.Direction.CCW);
            }
            this.f80936k.setColor(i11);
            this.f80936k.setStyle(Paint.Style.FILL);
            canvas.drawPath(path, this.f80936k);
        }
        if (i12 != 1122867) {
            this.f80936k.setColor(i12);
            this.f80936k.setStyle(Paint.Style.STROKE);
            this.f80936k.setStrokeWidth(rm.k.e(f13));
            canvas.drawCircle(gVar.f84265c, gVar.f84266d, e11, this.f80936k);
        }
        canvas.restore();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void t(Canvas canvas) {
        float sliceAngle = this.f80934i.getSliceAngle();
        float factor = this.f80934i.getFactor();
        float rotationAngle = this.f80934i.getRotationAngle();
        rm.g centerOffsets = this.f80934i.getCenterOffsets();
        this.f80935j.setStrokeWidth(this.f80934i.getWebLineWidth());
        this.f80935j.setColor(this.f80934i.getWebColor());
        this.f80935j.setAlpha(this.f80934i.getWebAlpha());
        int skipWebLineCount = this.f80934i.getSkipWebLineCount() + 1;
        int l12 = ((fm.q) this.f80934i.getData()).w().l1();
        rm.g c11 = rm.g.c(0.0f, 0.0f);
        for (int i11 = 0; i11 < l12; i11 += skipWebLineCount) {
            rm.k.B(centerOffsets, this.f80934i.getYRange() * factor, (i11 * sliceAngle) + rotationAngle, c11);
            canvas.drawLine(centerOffsets.f84265c, centerOffsets.f84266d, c11.f84265c, c11.f84266d, this.f80935j);
        }
        rm.g.h(c11);
        this.f80935j.setStrokeWidth(this.f80934i.getWebLineWidthInner());
        this.f80935j.setColor(this.f80934i.getWebColorInner());
        this.f80935j.setAlpha(this.f80934i.getWebAlpha());
        int i12 = this.f80934i.getYAxis().f49887n;
        rm.g c12 = rm.g.c(0.0f, 0.0f);
        rm.g c13 = rm.g.c(0.0f, 0.0f);
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = 0;
            while (i14 < ((fm.q) this.f80934i.getData()).r()) {
                float yChartMin = (this.f80934i.getYAxis().f49885l[i13] - this.f80934i.getYChartMin()) * factor;
                rm.k.B(centerOffsets, yChartMin, (i14 * sliceAngle) + rotationAngle, c12);
                i14++;
                rm.k.B(centerOffsets, yChartMin, (i14 * sliceAngle) + rotationAngle, c13);
                canvas.drawLine(c12.f84265c, c12.f84266d, c13.f84265c, c13.f84266d, this.f80935j);
            }
        }
        rm.g.h(c12);
        rm.g.h(c13);
    }

    public Paint u() {
        return this.f80935j;
    }

    @Override // pm.g
    public void j() {
    }
}
