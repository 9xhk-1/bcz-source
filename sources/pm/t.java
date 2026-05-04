package pm;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.exifinterface.media.ExifInterface;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.YAxis;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class t extends a {

    /* renamed from: h, reason: collision with root package name */
    public YAxis f80953h;

    /* renamed from: i, reason: collision with root package name */
    public Paint f80954i;

    /* renamed from: j, reason: collision with root package name */
    public Path f80955j;

    /* renamed from: k, reason: collision with root package name */
    public RectF f80956k;

    /* renamed from: l, reason: collision with root package name */
    public float[] f80957l;

    /* renamed from: m, reason: collision with root package name */
    public Path f80958m;

    /* renamed from: n, reason: collision with root package name */
    public RectF f80959n;

    /* renamed from: o, reason: collision with root package name */
    public Path f80960o;

    /* renamed from: p, reason: collision with root package name */
    public float[] f80961p;

    /* renamed from: q, reason: collision with root package name */
    public RectF f80962q;

    public t(rm.l lVar, YAxis yAxis, rm.i iVar) {
        super(lVar, iVar, yAxis);
        this.f80955j = new Path();
        this.f80956k = new RectF();
        this.f80957l = new float[2];
        this.f80958m = new Path();
        this.f80959n = new RectF();
        this.f80960o = new Path();
        this.f80961p = new float[2];
        this.f80962q = new RectF();
        this.f80953h = yAxis;
        if (this.f80939a != null) {
            this.f80857e.setColor(-16777216);
            this.f80857e.setTextSize(rm.k.e(10.0f));
            Paint paint = new Paint(1);
            this.f80954i = paint;
            paint.setColor(-7829368);
            this.f80954i.setStrokeWidth(1.0f);
            this.f80954i.setStyle(Paint.Style.STROKE);
        }
    }

    @Override // pm.a
    public void g(Canvas canvas) {
        float i11;
        float i12;
        float f11;
        if (this.f80953h.f() && this.f80953h.P()) {
            float[] n11 = n();
            this.f80857e.setTypeface(this.f80953h.c());
            this.f80857e.setTextSize(this.f80953h.b());
            this.f80857e.setColor(this.f80953h.a());
            float d11 = this.f80953h.d();
            float a11 = (rm.k.a(this.f80857e, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS) / 2.5f) + this.f80953h.e();
            YAxis.AxisDependency v02 = this.f80953h.v0();
            YAxis.YAxisLabelPosition w02 = this.f80953h.w0();
            if (v02 == YAxis.AxisDependency.LEFT) {
                if (w02 == YAxis.YAxisLabelPosition.OUTSIDE_CHART) {
                    this.f80857e.setTextAlign(Paint.Align.RIGHT);
                    i11 = this.f80939a.P();
                    f11 = i11 - d11;
                } else {
                    this.f80857e.setTextAlign(Paint.Align.LEFT);
                    i12 = this.f80939a.P();
                    f11 = i12 + d11;
                }
            } else if (w02 == YAxis.YAxisLabelPosition.OUTSIDE_CHART) {
                this.f80857e.setTextAlign(Paint.Align.LEFT);
                i12 = this.f80939a.i();
                f11 = i12 + d11;
            } else {
                this.f80857e.setTextAlign(Paint.Align.RIGHT);
                i11 = this.f80939a.i();
                f11 = i11 - d11;
            }
            k(canvas, f11, n11, a11);
        }
    }

    @Override // pm.a
    public void h(Canvas canvas) {
        if (this.f80953h.f() && this.f80953h.M()) {
            this.f80858f.setColor(this.f80953h.s());
            this.f80858f.setStrokeWidth(this.f80953h.u());
            if (this.f80953h.v0() == YAxis.AxisDependency.LEFT) {
                canvas.drawLine(this.f80939a.h(), this.f80939a.j(), this.f80939a.h(), this.f80939a.f(), this.f80858f);
            } else {
                canvas.drawLine(this.f80939a.i(), this.f80939a.j(), this.f80939a.i(), this.f80939a.f(), this.f80858f);
            }
        }
    }

    @Override // pm.a
    public void i(Canvas canvas) {
        if (this.f80953h.f()) {
            if (this.f80953h.O()) {
                int save = canvas.save();
                canvas.clipRect(m());
                float[] n11 = n();
                this.f80856d.setColor(this.f80953h.z());
                this.f80856d.setStrokeWidth(this.f80953h.B());
                this.f80856d.setPathEffect(this.f80953h.A());
                Path path = this.f80955j;
                path.reset();
                for (int i11 = 0; i11 < n11.length; i11 += 2) {
                    canvas.drawPath(o(path, i11, n11), this.f80856d);
                    path.reset();
                }
                canvas.restoreToCount(save);
            }
            if (this.f80953h.H0()) {
                l(canvas);
            }
        }
    }

    @Override // pm.a
    public void j(Canvas canvas) {
        List<LimitLine> D = this.f80953h.D();
        if (D == null || D.size() <= 0) {
            return;
        }
        float[] fArr = this.f80961p;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        Path path = this.f80960o;
        path.reset();
        for (int i11 = 0; i11 < D.size(); i11++) {
            LimitLine limitLine = D.get(i11);
            if (limitLine.f()) {
                int save = canvas.save();
                this.f80962q.set(this.f80939a.q());
                this.f80962q.inset(0.0f, -limitLine.t());
                canvas.clipRect(this.f80962q);
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
                    this.f80859g.setTypeface(limitLine.c());
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

    public void k(Canvas canvas, float f11, float[] fArr, float f12) {
        int i11 = this.f80953h.G0() ? this.f80953h.f49887n : this.f80953h.f49887n - 1;
        for (int i12 = !this.f80953h.F0() ? 1 : 0; i12 < i11; i12++) {
            canvas.drawText(this.f80953h.x(i12), f11, fArr[(i12 * 2) + 1] + f12, this.f80857e);
        }
    }

    public void l(Canvas canvas) {
        int save = canvas.save();
        this.f80959n.set(this.f80939a.q());
        this.f80959n.inset(0.0f, -this.f80953h.E0());
        canvas.clipRect(this.f80959n);
        rm.f f11 = this.f80855c.f(0.0f, 0.0f);
        this.f80954i.setColor(this.f80953h.D0());
        this.f80954i.setStrokeWidth(this.f80953h.E0());
        Path path = this.f80958m;
        path.reset();
        path.moveTo(this.f80939a.h(), (float) f11.f84262d);
        path.lineTo(this.f80939a.i(), (float) f11.f84262d);
        canvas.drawPath(path, this.f80954i);
        canvas.restoreToCount(save);
    }

    public RectF m() {
        this.f80956k.set(this.f80939a.q());
        this.f80956k.inset(0.0f, -this.f80854b.B());
        return this.f80956k;
    }

    public float[] n() {
        int length = this.f80957l.length;
        int i11 = this.f80953h.f49887n;
        if (length != i11 * 2) {
            this.f80957l = new float[i11 * 2];
        }
        float[] fArr = this.f80957l;
        for (int i12 = 0; i12 < fArr.length; i12 += 2) {
            fArr[i12 + 1] = this.f80953h.f49885l[i12 / 2];
        }
        this.f80855c.o(fArr);
        return fArr;
    }

    public Path o(Path path, int i11, float[] fArr) {
        int i12 = i11 + 1;
        path.moveTo(this.f80939a.P(), fArr[i12]);
        path.lineTo(this.f80939a.i(), fArr[i12]);
        return path;
    }
}
