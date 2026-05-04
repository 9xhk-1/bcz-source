package pm;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.XAxis;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class r extends q {

    /* renamed from: p, reason: collision with root package name */
    public BarChart f80950p;

    /* renamed from: q, reason: collision with root package name */
    public Path f80951q;

    public r(rm.l lVar, XAxis xAxis, rm.i iVar, BarChart barChart) {
        super(lVar, xAxis, iVar);
        this.f80951q = new Path();
        this.f80950p = barChart;
    }

    @Override // pm.q, pm.a
    public void a(float f11, float f12, boolean z11) {
        float f13;
        double d11;
        if (this.f80939a.k() > 10.0f && !this.f80939a.F()) {
            rm.f j11 = this.f80855c.j(this.f80939a.h(), this.f80939a.f());
            rm.f j12 = this.f80855c.j(this.f80939a.h(), this.f80939a.j());
            if (z11) {
                f13 = (float) j12.f84262d;
                d11 = j11.f84262d;
            } else {
                f13 = (float) j11.f84262d;
                d11 = j12.f84262d;
            }
            float f14 = (float) d11;
            rm.f.c(j11);
            rm.f.c(j12);
            f11 = f13;
            f12 = f14;
        }
        b(f11, f12);
    }

    @Override // pm.q, pm.a
    public void g(Canvas canvas) {
        if (this.f80942h.f() && this.f80942h.P()) {
            float d11 = this.f80942h.d();
            this.f80857e.setTypeface(this.f80942h.c());
            this.f80857e.setTextSize(this.f80942h.b());
            this.f80857e.setColor(this.f80942h.a());
            rm.g c11 = rm.g.c(0.0f, 0.0f);
            if (this.f80942h.w0() == XAxis.XAxisPosition.TOP) {
                c11.f84265c = 0.0f;
                c11.f84266d = 0.5f;
                n(canvas, this.f80939a.i() + d11, c11);
            } else if (this.f80942h.w0() == XAxis.XAxisPosition.TOP_INSIDE) {
                c11.f84265c = 1.0f;
                c11.f84266d = 0.5f;
                n(canvas, this.f80939a.i() - d11, c11);
            } else if (this.f80942h.w0() == XAxis.XAxisPosition.BOTTOM) {
                c11.f84265c = 1.0f;
                c11.f84266d = 0.5f;
                n(canvas, this.f80939a.h() - d11, c11);
            } else if (this.f80942h.w0() == XAxis.XAxisPosition.BOTTOM_INSIDE) {
                c11.f84265c = 1.0f;
                c11.f84266d = 0.5f;
                n(canvas, this.f80939a.h() + d11, c11);
            } else {
                c11.f84265c = 0.0f;
                c11.f84266d = 0.5f;
                n(canvas, this.f80939a.i() + d11, c11);
                c11.f84265c = 1.0f;
                c11.f84266d = 0.5f;
                n(canvas, this.f80939a.h() - d11, c11);
            }
            rm.g.h(c11);
        }
    }

    @Override // pm.q, pm.a
    public void h(Canvas canvas) {
        Canvas canvas2;
        if (this.f80942h.M() && this.f80942h.f()) {
            this.f80858f.setColor(this.f80942h.s());
            this.f80858f.setStrokeWidth(this.f80942h.u());
            if (this.f80942h.w0() == XAxis.XAxisPosition.TOP || this.f80942h.w0() == XAxis.XAxisPosition.TOP_INSIDE || this.f80942h.w0() == XAxis.XAxisPosition.BOTH_SIDED) {
                canvas2 = canvas;
                canvas2.drawLine(this.f80939a.i(), this.f80939a.j(), this.f80939a.i(), this.f80939a.f(), this.f80858f);
            } else {
                canvas2 = canvas;
            }
            if (this.f80942h.w0() == XAxis.XAxisPosition.BOTTOM || this.f80942h.w0() == XAxis.XAxisPosition.BOTTOM_INSIDE || this.f80942h.w0() == XAxis.XAxisPosition.BOTH_SIDED) {
                canvas2.drawLine(this.f80939a.h(), this.f80939a.j(), this.f80939a.h(), this.f80939a.f(), this.f80858f);
            }
        }
    }

    @Override // pm.q, pm.a
    public void j(Canvas canvas) {
        List<LimitLine> D = this.f80942h.D();
        if (D == null || D.size() <= 0) {
            return;
        }
        float[] fArr = this.f80946l;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        Path path = this.f80951q;
        path.reset();
        for (int i11 = 0; i11 < D.size(); i11++) {
            LimitLine limitLine = D.get(i11);
            if (limitLine.f()) {
                int save = canvas.save();
                this.f80947m.set(this.f80939a.q());
                this.f80947m.inset(0.0f, -limitLine.t());
                canvas.clipRect(this.f80947m);
                this.f80859g.setStyle(Paint.Style.STROKE);
                this.f80859g.setColor(limitLine.s());
                this.f80859g.setStrokeWidth(limitLine.t());
                this.f80859g.setPathEffect(limitLine.o());
                fArr[1] = limitLine.r();
                this.f80855c.o(fArr);
                path.moveTo(this.f80939a.h(), fArr[1]);
                path.lineTo(this.f80939a.i(), fArr[1]);
                canvas.drawPath(path, this.f80859g);
                path.reset();
                String p11 = limitLine.p();
                if (p11 != null && !p11.equals("")) {
                    this.f80859g.setStyle(limitLine.u());
                    this.f80859g.setPathEffect(null);
                    this.f80859g.setColor(limitLine.a());
                    this.f80859g.setStrokeWidth(0.5f);
                    this.f80859g.setTextSize(limitLine.b());
                    float a11 = rm.k.a(this.f80859g, p11);
                    float e11 = rm.k.e(4.0f) + limitLine.d();
                    float t11 = limitLine.t() + a11 + limitLine.e();
                    LimitLine.LimitLabelPosition q11 = limitLine.q();
                    if (q11 == LimitLine.LimitLabelPosition.RIGHT_TOP) {
                        this.f80859g.setTextAlign(Paint.Align.RIGHT);
                        canvas.drawText(p11, this.f80939a.i() - e11, (fArr[1] - t11) + a11, this.f80859g);
                    } else if (q11 == LimitLine.LimitLabelPosition.RIGHT_BOTTOM) {
                        this.f80859g.setTextAlign(Paint.Align.RIGHT);
                        canvas.drawText(p11, this.f80939a.i() - e11, fArr[1] + t11, this.f80859g);
                    } else if (q11 == LimitLine.LimitLabelPosition.LEFT_TOP) {
                        this.f80859g.setTextAlign(Paint.Align.LEFT);
                        canvas.drawText(p11, this.f80939a.h() + e11, (fArr[1] - t11) + a11, this.f80859g);
                    } else {
                        this.f80859g.setTextAlign(Paint.Align.LEFT);
                        canvas.drawText(p11, this.f80939a.P() + e11, fArr[1] + t11, this.f80859g);
                    }
                }
                canvas.restoreToCount(save);
            }
        }
    }

    @Override // pm.q
    public void k() {
        this.f80857e.setTypeface(this.f80942h.c());
        this.f80857e.setTextSize(this.f80942h.b());
        rm.c b11 = rm.k.b(this.f80857e, this.f80942h.E());
        float d11 = (int) (b11.f84257c + (this.f80942h.d() * 3.5f));
        float f11 = b11.f84258d;
        rm.c D = rm.k.D(b11.f84257c, f11, this.f80942h.v0());
        this.f80942h.J = Math.round(d11);
        this.f80942h.K = Math.round(f11);
        XAxis xAxis = this.f80942h;
        xAxis.L = (int) (D.f84257c + (xAxis.d() * 3.5f));
        this.f80942h.M = Math.round(D.f84258d);
        rm.c.c(D);
    }

    @Override // pm.q
    public void l(Canvas canvas, float f11, float f12, Path path) {
        path.moveTo(this.f80939a.i(), f12);
        path.lineTo(this.f80939a.h(), f12);
        canvas.drawPath(path, this.f80856d);
        path.reset();
    }

    @Override // pm.q
    public void n(Canvas canvas, float f11, rm.g gVar) {
        Canvas canvas2;
        float f12;
        rm.g gVar2;
        float v02 = this.f80942h.v0();
        boolean L = this.f80942h.L();
        int i11 = this.f80942h.f49887n * 2;
        float[] fArr = new float[i11];
        for (int i12 = 0; i12 < i11; i12 += 2) {
            if (L) {
                fArr[i12 + 1] = this.f80942h.f49886m[i12 / 2];
            } else {
                fArr[i12 + 1] = this.f80942h.f49885l[i12 / 2];
            }
        }
        this.f80855c.o(fArr);
        int i13 = 0;
        while (i13 < i11) {
            float f13 = fArr[i13 + 1];
            if (this.f80939a.M(f13)) {
                hm.l H = this.f80942h.H();
                XAxis xAxis = this.f80942h;
                String c11 = H.c(xAxis.f49885l[i13 / 2], xAxis);
                canvas2 = canvas;
                f12 = f11;
                gVar2 = gVar;
                m(canvas2, c11, f12, f13, gVar2, v02);
            } else {
                canvas2 = canvas;
                f12 = f11;
                gVar2 = gVar;
            }
            i13 += 2;
            canvas = canvas2;
            f11 = f12;
            gVar = gVar2;
        }
    }

    @Override // pm.q
    public RectF o() {
        this.f80945k.set(this.f80939a.q());
        this.f80945k.inset(0.0f, -this.f80854b.B());
        return this.f80945k;
    }
}
