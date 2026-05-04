package pm;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.XAxis;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class q extends a {

    /* renamed from: h, reason: collision with root package name */
    public XAxis f80942h;

    /* renamed from: i, reason: collision with root package name */
    public Path f80943i;

    /* renamed from: j, reason: collision with root package name */
    public float[] f80944j;

    /* renamed from: k, reason: collision with root package name */
    public RectF f80945k;

    /* renamed from: l, reason: collision with root package name */
    public float[] f80946l;

    /* renamed from: m, reason: collision with root package name */
    public RectF f80947m;

    /* renamed from: n, reason: collision with root package name */
    public float[] f80948n;

    /* renamed from: o, reason: collision with root package name */
    public Path f80949o;

    public q(rm.l lVar, XAxis xAxis, rm.i iVar) {
        super(lVar, iVar, xAxis);
        this.f80943i = new Path();
        this.f80944j = new float[2];
        this.f80945k = new RectF();
        this.f80946l = new float[2];
        this.f80947m = new RectF();
        this.f80948n = new float[4];
        this.f80949o = new Path();
        this.f80942h = xAxis;
        this.f80857e.setColor(-16777216);
        this.f80857e.setTextAlign(Paint.Align.CENTER);
        this.f80857e.setTextSize(rm.k.e(10.0f));
    }

    @Override // pm.a
    public void a(float f11, float f12, boolean z11) {
        float f13;
        double d11;
        if (this.f80939a.k() > 10.0f && !this.f80939a.E()) {
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

    @Override // pm.a
    public void b(float f11, float f12) {
        super.b(f11, f12);
        k();
    }

    @Override // pm.a
    public void g(Canvas canvas) {
        if (this.f80942h.f() && this.f80942h.P()) {
            float e11 = this.f80942h.e();
            this.f80857e.setTypeface(this.f80942h.c());
            this.f80857e.setTextSize(this.f80942h.b());
            this.f80857e.setColor(this.f80942h.a());
            rm.g c11 = rm.g.c(0.0f, 0.0f);
            if (this.f80942h.w0() == XAxis.XAxisPosition.TOP) {
                c11.f84265c = 0.5f;
                c11.f84266d = 1.0f;
                n(canvas, this.f80939a.j() - e11, c11);
            } else if (this.f80942h.w0() == XAxis.XAxisPosition.TOP_INSIDE) {
                c11.f84265c = 0.5f;
                c11.f84266d = 1.0f;
                n(canvas, this.f80939a.j() + e11 + this.f80942h.M, c11);
            } else if (this.f80942h.w0() == XAxis.XAxisPosition.BOTTOM) {
                c11.f84265c = 0.5f;
                c11.f84266d = 0.0f;
                n(canvas, this.f80939a.f() + e11, c11);
            } else if (this.f80942h.w0() == XAxis.XAxisPosition.BOTTOM_INSIDE) {
                c11.f84265c = 0.5f;
                c11.f84266d = 0.0f;
                n(canvas, (this.f80939a.f() - e11) - this.f80942h.M, c11);
            } else {
                c11.f84265c = 0.5f;
                c11.f84266d = 1.0f;
                n(canvas, this.f80939a.j() - e11, c11);
                c11.f84265c = 0.5f;
                c11.f84266d = 0.0f;
                n(canvas, this.f80939a.f() + e11, c11);
            }
            rm.g.h(c11);
        }
    }

    @Override // pm.a
    public void h(Canvas canvas) {
        Canvas canvas2;
        if (this.f80942h.M() && this.f80942h.f()) {
            this.f80858f.setColor(this.f80942h.s());
            this.f80858f.setStrokeWidth(this.f80942h.u());
            this.f80858f.setPathEffect(this.f80942h.t());
            if (this.f80942h.w0() == XAxis.XAxisPosition.TOP || this.f80942h.w0() == XAxis.XAxisPosition.TOP_INSIDE || this.f80942h.w0() == XAxis.XAxisPosition.BOTH_SIDED) {
                canvas2 = canvas;
                canvas2.drawLine(this.f80939a.h(), this.f80939a.j(), this.f80939a.i(), this.f80939a.j(), this.f80858f);
            } else {
                canvas2 = canvas;
            }
            if (this.f80942h.w0() == XAxis.XAxisPosition.BOTTOM || this.f80942h.w0() == XAxis.XAxisPosition.BOTTOM_INSIDE || this.f80942h.w0() == XAxis.XAxisPosition.BOTH_SIDED) {
                canvas2.drawLine(this.f80939a.h(), this.f80939a.f(), this.f80939a.i(), this.f80939a.f(), this.f80858f);
            }
        }
    }

    @Override // pm.a
    public void i(Canvas canvas) {
        if (this.f80942h.O() && this.f80942h.f()) {
            int save = canvas.save();
            canvas.clipRect(o());
            if (this.f80944j.length != this.f80854b.f49887n * 2) {
                this.f80944j = new float[this.f80942h.f49887n * 2];
            }
            float[] fArr = this.f80944j;
            for (int i11 = 0; i11 < fArr.length; i11 += 2) {
                float[] fArr2 = this.f80942h.f49885l;
                int i12 = i11 / 2;
                fArr[i11] = fArr2[i12];
                fArr[i11 + 1] = fArr2[i12];
            }
            this.f80855c.o(fArr);
            r();
            Path path = this.f80943i;
            path.reset();
            for (int i13 = 0; i13 < fArr.length; i13 += 2) {
                l(canvas, fArr[i13], fArr[i13 + 1], path);
            }
            canvas.restoreToCount(save);
        }
    }

    @Override // pm.a
    public void j(Canvas canvas) {
        List<LimitLine> D = this.f80942h.D();
        if (D == null || D.size() <= 0) {
            return;
        }
        float[] fArr = this.f80946l;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        for (int i11 = 0; i11 < D.size(); i11++) {
            LimitLine limitLine = D.get(i11);
            if (limitLine.f()) {
                int save = canvas.save();
                this.f80947m.set(this.f80939a.q());
                this.f80947m.inset(-limitLine.t(), 0.0f);
                canvas.clipRect(this.f80947m);
                fArr[0] = limitLine.r();
                fArr[1] = 0.0f;
                this.f80855c.o(fArr);
                q(canvas, limitLine, fArr);
                p(canvas, limitLine, fArr, limitLine.e() + 2.0f);
                canvas.restoreToCount(save);
            }
        }
    }

    public void k() {
        String E = this.f80942h.E();
        this.f80857e.setTypeface(this.f80942h.c());
        this.f80857e.setTextSize(this.f80942h.b());
        rm.c b11 = rm.k.b(this.f80857e, E);
        float f11 = b11.f84257c;
        float a11 = rm.k.a(this.f80857e, "Q");
        rm.c D = rm.k.D(f11, a11, this.f80942h.v0());
        this.f80942h.J = Math.round(f11);
        this.f80942h.K = Math.round(a11);
        this.f80942h.L = Math.round(D.f84257c);
        this.f80942h.M = Math.round(D.f84258d);
        rm.c.c(D);
        rm.c.c(b11);
    }

    public void l(Canvas canvas, float f11, float f12, Path path) {
        path.moveTo(f11, this.f80939a.f());
        path.lineTo(f11, this.f80939a.j());
        canvas.drawPath(path, this.f80856d);
        path.reset();
    }

    public void m(Canvas canvas, String str, float f11, float f12, rm.g gVar, float f13) {
        rm.k.n(canvas, str, f11, f12, this.f80857e, gVar, f13);
    }

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
                fArr[i12] = this.f80942h.f49886m[i12 / 2];
            } else {
                fArr[i12] = this.f80942h.f49885l[i12 / 2];
            }
        }
        this.f80855c.o(fArr);
        int i13 = 0;
        while (i13 < i11) {
            float f13 = fArr[i13];
            if (this.f80939a.L(f13)) {
                hm.l H = this.f80942h.H();
                XAxis xAxis = this.f80942h;
                int i14 = i13 / 2;
                String c11 = H.c(xAxis.f49885l[i14], xAxis);
                if (this.f80942h.x0()) {
                    int i15 = this.f80942h.f49887n;
                    if (i14 == i15 - 1 && i15 > 1) {
                        float d11 = rm.k.d(this.f80857e, c11);
                        if (d11 > this.f80939a.Q() * 2.0f && f13 + d11 > this.f80939a.o()) {
                            f13 -= d11 / 2.0f;
                        }
                    } else if (i13 == 0) {
                        f13 += rm.k.d(this.f80857e, c11) / 2.0f;
                    }
                }
                canvas2 = canvas;
                f12 = f11;
                gVar2 = gVar;
                m(canvas2, c11, f13, f12, gVar2, v02);
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

    public RectF o() {
        this.f80945k.set(this.f80939a.q());
        this.f80945k.inset(-this.f80854b.B(), 0.0f);
        return this.f80945k;
    }

    public void p(Canvas canvas, LimitLine limitLine, float[] fArr, float f11) {
        String p11 = limitLine.p();
        if (p11 == null || p11.equals("")) {
            return;
        }
        this.f80859g.setStyle(limitLine.u());
        this.f80859g.setPathEffect(null);
        this.f80859g.setColor(limitLine.a());
        this.f80859g.setStrokeWidth(0.5f);
        this.f80859g.setTextSize(limitLine.b());
        float t11 = limitLine.t() + limitLine.d();
        LimitLine.LimitLabelPosition q11 = limitLine.q();
        if (q11 == LimitLine.LimitLabelPosition.RIGHT_TOP) {
            float a11 = rm.k.a(this.f80859g, p11);
            this.f80859g.setTextAlign(Paint.Align.LEFT);
            canvas.drawText(p11, fArr[0] + t11, this.f80939a.j() + f11 + a11, this.f80859g);
        } else if (q11 == LimitLine.LimitLabelPosition.RIGHT_BOTTOM) {
            this.f80859g.setTextAlign(Paint.Align.LEFT);
            canvas.drawText(p11, fArr[0] + t11, this.f80939a.f() - f11, this.f80859g);
        } else if (q11 != LimitLine.LimitLabelPosition.LEFT_TOP) {
            this.f80859g.setTextAlign(Paint.Align.RIGHT);
            canvas.drawText(p11, fArr[0] - t11, this.f80939a.f() - f11, this.f80859g);
        } else {
            this.f80859g.setTextAlign(Paint.Align.RIGHT);
            canvas.drawText(p11, fArr[0] - t11, this.f80939a.j() + f11 + rm.k.a(this.f80859g, p11), this.f80859g);
        }
    }

    public void q(Canvas canvas, LimitLine limitLine, float[] fArr) {
        float[] fArr2 = this.f80948n;
        fArr2[0] = fArr[0];
        fArr2[1] = this.f80939a.j();
        float[] fArr3 = this.f80948n;
        fArr3[2] = fArr[0];
        fArr3[3] = this.f80939a.f();
        this.f80949o.reset();
        Path path = this.f80949o;
        float[] fArr4 = this.f80948n;
        path.moveTo(fArr4[0], fArr4[1]);
        Path path2 = this.f80949o;
        float[] fArr5 = this.f80948n;
        path2.lineTo(fArr5[2], fArr5[3]);
        this.f80859g.setStyle(Paint.Style.STROKE);
        this.f80859g.setColor(limitLine.s());
        this.f80859g.setStrokeWidth(limitLine.t());
        this.f80859g.setPathEffect(limitLine.o());
        canvas.drawPath(this.f80949o, this.f80859g);
    }

    public void r() {
        this.f80856d.setColor(this.f80942h.z());
        this.f80856d.setStrokeWidth(this.f80942h.B());
        this.f80856d.setPathEffect(this.f80942h.A());
    }
}
