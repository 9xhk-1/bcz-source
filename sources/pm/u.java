package pm;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.YAxis;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class u extends t {

    /* renamed from: r, reason: collision with root package name */
    public Path f80963r;

    /* renamed from: s, reason: collision with root package name */
    public Path f80964s;

    /* renamed from: t, reason: collision with root package name */
    public float[] f80965t;

    public u(rm.l lVar, YAxis yAxis, rm.i iVar) {
        super(lVar, yAxis, iVar);
        this.f80963r = new Path();
        this.f80964s = new Path();
        this.f80965t = new float[4];
        this.f80859g.setTextAlign(Paint.Align.LEFT);
    }

    @Override // pm.a
    public void a(float f11, float f12, boolean z11) {
        float f13;
        double d11;
        if (this.f80939a.g() > 10.0f && !this.f80939a.E()) {
            rm.f j11 = this.f80855c.j(this.f80939a.h(), this.f80939a.j());
            rm.f j12 = this.f80855c.j(this.f80939a.i(), this.f80939a.j());
            if (z11) {
                f13 = (float) j12.f84261c;
                d11 = j11.f84261c;
            } else {
                f13 = (float) j11.f84261c;
                d11 = j12.f84261c;
            }
            float f14 = (float) d11;
            rm.f.c(j11);
            rm.f.c(j12);
            f11 = f13;
            f12 = f14;
        }
        b(f11, f12);
    }

    @Override // pm.t, pm.a
    public void g(Canvas canvas) {
        float f11;
        if (this.f80953h.f() && this.f80953h.P()) {
            float[] n11 = n();
            this.f80857e.setTypeface(this.f80953h.c());
            this.f80857e.setTextSize(this.f80953h.b());
            this.f80857e.setColor(this.f80953h.a());
            this.f80857e.setTextAlign(Paint.Align.CENTER);
            float e11 = rm.k.e(2.5f);
            float a11 = rm.k.a(this.f80857e, "Q");
            YAxis.AxisDependency v02 = this.f80953h.v0();
            YAxis.YAxisLabelPosition w02 = this.f80953h.w0();
            if (v02 == YAxis.AxisDependency.LEFT) {
                f11 = (w02 == YAxis.YAxisLabelPosition.OUTSIDE_CHART ? this.f80939a.j() : this.f80939a.j()) - e11;
            } else {
                f11 = (w02 == YAxis.YAxisLabelPosition.OUTSIDE_CHART ? this.f80939a.f() : this.f80939a.f()) + a11 + e11;
            }
            k(canvas, f11, n11, this.f80953h.e());
        }
    }

    @Override // pm.t, pm.a
    public void h(Canvas canvas) {
        if (this.f80953h.f() && this.f80953h.M()) {
            this.f80858f.setColor(this.f80953h.s());
            this.f80858f.setStrokeWidth(this.f80953h.u());
            if (this.f80953h.v0() == YAxis.AxisDependency.LEFT) {
                canvas.drawLine(this.f80939a.h(), this.f80939a.j(), this.f80939a.i(), this.f80939a.j(), this.f80858f);
            } else {
                canvas.drawLine(this.f80939a.h(), this.f80939a.f(), this.f80939a.i(), this.f80939a.f(), this.f80858f);
            }
        }
    }

    @Override // pm.t, pm.a
    public void j(Canvas canvas) {
        char c11;
        List<LimitLine> D = this.f80953h.D();
        if (D == null || D.size() <= 0) {
            return;
        }
        float[] fArr = this.f80965t;
        char c12 = 0;
        float f11 = 0.0f;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        Path path = this.f80964s;
        path.reset();
        int i11 = 0;
        while (i11 < D.size()) {
            LimitLine limitLine = D.get(i11);
            if (limitLine.f()) {
                int save = canvas.save();
                this.f80962q.set(this.f80939a.q());
                this.f80962q.inset(-limitLine.t(), f11);
                canvas.clipRect(this.f80962q);
                fArr[c12] = limitLine.r();
                fArr[2] = limitLine.r();
                this.f80855c.o(fArr);
                fArr[1] = this.f80939a.j();
                fArr[3] = this.f80939a.f();
                path.moveTo(fArr[c12], fArr[1]);
                path.lineTo(fArr[2], fArr[3]);
                this.f80859g.setStyle(Paint.Style.STROKE);
                this.f80859g.setColor(limitLine.s());
                this.f80859g.setPathEffect(limitLine.o());
                this.f80859g.setStrokeWidth(limitLine.t());
                canvas.drawPath(path, this.f80859g);
                path.reset();
                String p11 = limitLine.p();
                if (p11 == null || p11.equals("")) {
                    c11 = c12;
                } else {
                    this.f80859g.setStyle(limitLine.u());
                    this.f80859g.setPathEffect(null);
                    this.f80859g.setColor(limitLine.a());
                    this.f80859g.setTypeface(limitLine.c());
                    this.f80859g.setStrokeWidth(0.5f);
                    this.f80859g.setTextSize(limitLine.b());
                    float t11 = limitLine.t() + limitLine.d();
                    float e11 = rm.k.e(2.0f) + limitLine.e();
                    LimitLine.LimitLabelPosition q11 = limitLine.q();
                    c11 = c12;
                    if (q11 == LimitLine.LimitLabelPosition.RIGHT_TOP) {
                        float a11 = rm.k.a(this.f80859g, p11);
                        this.f80859g.setTextAlign(Paint.Align.LEFT);
                        canvas.drawText(p11, fArr[c11] + t11, this.f80939a.j() + e11 + a11, this.f80859g);
                    } else if (q11 == LimitLine.LimitLabelPosition.RIGHT_BOTTOM) {
                        this.f80859g.setTextAlign(Paint.Align.LEFT);
                        canvas.drawText(p11, fArr[c11] + t11, this.f80939a.f() - e11, this.f80859g);
                    } else if (q11 == LimitLine.LimitLabelPosition.LEFT_TOP) {
                        this.f80859g.setTextAlign(Paint.Align.RIGHT);
                        canvas.drawText(p11, fArr[c11] - t11, this.f80939a.j() + e11 + rm.k.a(this.f80859g, p11), this.f80859g);
                    } else {
                        this.f80859g.setTextAlign(Paint.Align.RIGHT);
                        canvas.drawText(p11, fArr[c11] - t11, this.f80939a.f() - e11, this.f80859g);
                    }
                }
                canvas.restoreToCount(save);
            } else {
                c11 = c12;
            }
            i11++;
            c12 = c11;
            f11 = 0.0f;
        }
    }

    @Override // pm.t
    public void k(Canvas canvas, float f11, float[] fArr, float f12) {
        this.f80857e.setTypeface(this.f80953h.c());
        this.f80857e.setTextSize(this.f80953h.b());
        this.f80857e.setColor(this.f80953h.a());
        int i11 = this.f80953h.G0() ? this.f80953h.f49887n : this.f80953h.f49887n - 1;
        for (int i12 = !this.f80953h.F0() ? 1 : 0; i12 < i11; i12++) {
            canvas.drawText(this.f80953h.x(i12), fArr[i12 * 2], f11 - f12, this.f80857e);
        }
    }

    @Override // pm.t
    public void l(Canvas canvas) {
        int save = canvas.save();
        this.f80959n.set(this.f80939a.q());
        this.f80959n.inset(-this.f80953h.E0(), 0.0f);
        canvas.clipRect(this.f80962q);
        rm.f f11 = this.f80855c.f(0.0f, 0.0f);
        this.f80954i.setColor(this.f80953h.D0());
        this.f80954i.setStrokeWidth(this.f80953h.E0());
        Path path = this.f80963r;
        path.reset();
        path.moveTo(((float) f11.f84261c) - 1.0f, this.f80939a.j());
        path.lineTo(((float) f11.f84261c) - 1.0f, this.f80939a.f());
        canvas.drawPath(path, this.f80954i);
        canvas.restoreToCount(save);
    }

    @Override // pm.t
    public RectF m() {
        this.f80956k.set(this.f80939a.q());
        this.f80956k.inset(-this.f80854b.B(), 0.0f);
        return this.f80956k;
    }

    @Override // pm.t
    public float[] n() {
        int length = this.f80957l.length;
        int i11 = this.f80953h.f49887n;
        if (length != i11 * 2) {
            this.f80957l = new float[i11 * 2];
        }
        float[] fArr = this.f80957l;
        for (int i12 = 0; i12 < fArr.length; i12 += 2) {
            fArr[i12] = this.f80953h.f49885l[i12 / 2];
        }
        this.f80855c.o(fArr);
        return fArr;
    }

    @Override // pm.t
    public Path o(Path path, int i11, float[] fArr) {
        path.moveTo(fArr[i11], this.f80939a.j());
        path.lineTo(fArr[i11], this.f80939a.f());
        return path;
    }
}
