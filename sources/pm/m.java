package pm;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.github.mikephil.charting.charts.PieChart;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class m extends g {

    /* renamed from: g, reason: collision with root package name */
    public PieChart f80917g;

    /* renamed from: h, reason: collision with root package name */
    public Paint f80918h;

    /* renamed from: i, reason: collision with root package name */
    public Paint f80919i;

    /* renamed from: j, reason: collision with root package name */
    public Paint f80920j;

    /* renamed from: k, reason: collision with root package name */
    public TextPaint f80921k;

    /* renamed from: l, reason: collision with root package name */
    public Paint f80922l;

    /* renamed from: m, reason: collision with root package name */
    public StaticLayout f80923m;

    /* renamed from: n, reason: collision with root package name */
    public CharSequence f80924n;

    /* renamed from: o, reason: collision with root package name */
    public RectF f80925o;

    /* renamed from: p, reason: collision with root package name */
    public RectF[] f80926p;

    /* renamed from: q, reason: collision with root package name */
    public WeakReference<Bitmap> f80927q;

    /* renamed from: r, reason: collision with root package name */
    public Canvas f80928r;

    /* renamed from: s, reason: collision with root package name */
    public Path f80929s;

    /* renamed from: t, reason: collision with root package name */
    public RectF f80930t;

    /* renamed from: u, reason: collision with root package name */
    public Path f80931u;

    /* renamed from: v, reason: collision with root package name */
    public Path f80932v;

    /* renamed from: w, reason: collision with root package name */
    public RectF f80933w;

    public m(PieChart pieChart, cm.a aVar, rm.l lVar) {
        super(aVar, lVar);
        this.f80925o = new RectF();
        this.f80926p = new RectF[]{new RectF(), new RectF(), new RectF()};
        this.f80929s = new Path();
        this.f80930t = new RectF();
        this.f80931u = new Path();
        this.f80932v = new Path();
        this.f80933w = new RectF();
        this.f80917g = pieChart;
        Paint paint = new Paint(1);
        this.f80918h = paint;
        paint.setColor(-1);
        Paint paint2 = this.f80918h;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        Paint paint3 = new Paint(1);
        this.f80919i = paint3;
        paint3.setColor(-1);
        this.f80919i.setStyle(style);
        this.f80919i.setAlpha(105);
        TextPaint textPaint = new TextPaint(1);
        this.f80921k = textPaint;
        textPaint.setColor(-16777216);
        this.f80921k.setTextSize(rm.k.e(12.0f));
        this.f80889f.setTextSize(rm.k.e(13.0f));
        this.f80889f.setColor(-1);
        Paint paint4 = this.f80889f;
        Paint.Align align = Paint.Align.CENTER;
        paint4.setTextAlign(align);
        Paint paint5 = new Paint(1);
        this.f80922l = paint5;
        paint5.setColor(-1);
        this.f80922l.setTextAlign(align);
        this.f80922l.setTextSize(rm.k.e(13.0f));
        Paint paint6 = new Paint(1);
        this.f80920j = paint6;
        paint6.setStyle(Paint.Style.STROKE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // pm.g
    public void b(Canvas canvas) {
        int o11 = (int) this.f80939a.o();
        int n11 = (int) this.f80939a.n();
        WeakReference<Bitmap> weakReference = this.f80927q;
        Bitmap bitmap = weakReference == null ? null : weakReference.get();
        if (bitmap == null || bitmap.getWidth() != o11 || bitmap.getHeight() != n11) {
            if (o11 <= 0 || n11 <= 0) {
                return;
            }
            bitmap = Bitmap.createBitmap(o11, n11, Bitmap.Config.ARGB_4444);
            this.f80927q = new WeakReference<>(bitmap);
            this.f80928r = new Canvas(bitmap);
        }
        bitmap.eraseColor(0);
        for (km.i iVar : ((fm.p) this.f80917g.getData()).q()) {
            if (iVar.isVisible() && iVar.l1() > 0) {
                n(canvas, iVar);
            }
        }
    }

    @Override // pm.g
    public void c(Canvas canvas) {
        p(canvas);
        canvas.drawBitmap(this.f80927q.get(), 0.0f, 0.0f, (Paint) null);
        m(canvas);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // pm.g
    public void d(Canvas canvas, im.d[] dVarArr) {
        km.i k11;
        int i11;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        RectF rectF;
        float f18;
        float f19;
        float f21;
        im.d[] dVarArr2 = dVarArr;
        boolean z11 = this.f80917g.m0() && !this.f80917g.o0();
        if (z11 && this.f80917g.n0()) {
            return;
        }
        float h11 = this.f80885b.h();
        float i12 = this.f80885b.i();
        float rotationAngle = this.f80917g.getRotationAngle();
        float[] drawAngles = this.f80917g.getDrawAngles();
        float[] absoluteAngles = this.f80917g.getAbsoluteAngles();
        rm.g centerCircleBox = this.f80917g.getCenterCircleBox();
        float radius = this.f80917g.getRadius();
        float f22 = 0.0f;
        float holeRadius = z11 ? (this.f80917g.getHoleRadius() / 100.0f) * radius : 0.0f;
        RectF rectF2 = this.f80933w;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        int i13 = 0;
        while (i13 < dVarArr2.length) {
            int h12 = (int) dVarArr2[i13].h();
            float f23 = f22;
            if (h12 < drawAngles.length && (k11 = ((fm.p) this.f80917g.getData()).k(dVarArr2[i13].d())) != null && k11.g0()) {
                int l12 = k11.l1();
                int i14 = 0;
                for (int i15 = 0; i15 < l12; i15++) {
                    if (Math.abs(k11.m(i15).c()) > rm.k.f84293g) {
                        i14++;
                    }
                }
                float f24 = h12 == 0 ? f23 : absoluteAngles[h12 - 1] * h11;
                float J0 = i14 <= 1 ? f23 : k11.J0();
                float f25 = drawAngles[h12];
                float f26 = radius;
                float y11 = k11.y();
                float f27 = holeRadius;
                float f28 = f26 + y11;
                i11 = i13;
                rectF2.set(this.f80917g.getCircleBox());
                float f29 = -y11;
                rectF2.inset(f29, f29);
                boolean z12 = J0 > f23 && f25 <= 180.0f;
                this.f80886c.setColor(k11.Y0(h12));
                float f31 = i14 == 1 ? f23 : J0 / (f26 * 0.017453292f);
                float f32 = i14 == 1 ? f23 : J0 / (f28 * 0.017453292f);
                float f33 = (((f31 / 2.0f) + f24) * i12) + rotationAngle;
                float f34 = (f25 - f31) * i12;
                float f35 = f34 < f23 ? f23 : f34;
                float f36 = (((f32 / 2.0f) + f24) * i12) + rotationAngle;
                float f37 = (f25 - f32) * i12;
                if (f37 < f23) {
                    f37 = f23;
                }
                this.f80929s.reset();
                if (f35 < 360.0f || f35 % 360.0f > rm.k.f84293g) {
                    f11 = f35;
                    f12 = f24;
                    f13 = J0;
                    double d11 = f36 * 0.017453292f;
                    this.f80929s.moveTo(centerCircleBox.f84265c + (((float) Math.cos(d11)) * f28), centerCircleBox.f84266d + (((float) Math.sin(d11)) * f28));
                    this.f80929s.arcTo(rectF2, f36, f37);
                } else {
                    f11 = f35;
                    this.f80929s.addCircle(centerCircleBox.f84265c, centerCircleBox.f84266d, f28, Path.Direction.CW);
                    f12 = f24;
                    f13 = J0;
                }
                if (z12) {
                    double d12 = f33 * 0.017453292f;
                    float cos = (((float) Math.cos(d12)) * f26) + centerCircleBox.f84265c;
                    float sin = centerCircleBox.f84266d + (((float) Math.sin(d12)) * f26);
                    f15 = f26;
                    rectF = rectF2;
                    f14 = f23;
                    f16 = f27;
                    f17 = f33;
                    f18 = l(centerCircleBox, f15, f25 * i12, cos, sin, f17, f11);
                } else {
                    f14 = f23;
                    f15 = f26;
                    f16 = f27;
                    f17 = f33;
                    rectF = rectF2;
                    f18 = f14;
                }
                RectF rectF3 = this.f80930t;
                float f38 = centerCircleBox.f84265c;
                f23 = f14;
                float f39 = centerCircleBox.f84266d;
                f19 = f15;
                rectF3.set(f38 - f16, f39 - f16, f38 + f16, f39 + f16);
                if (z11 && (f16 > f23 || z12)) {
                    if (z12) {
                        if (f18 < f23) {
                            f18 = -f18;
                        }
                        f21 = Math.max(f16, f18);
                    } else {
                        f21 = f16;
                    }
                    float f41 = (i14 == 1 || f21 == f23) ? f23 : f13 / (f21 * 0.017453292f);
                    float f42 = ((f12 + (f41 / 2.0f)) * i12) + rotationAngle;
                    float f43 = (f25 - f41) * i12;
                    if (f43 < f23) {
                        f43 = f23;
                    }
                    float f44 = f42 + f43;
                    if (f35 < 360.0f || f11 % 360.0f > rm.k.f84293g) {
                        double d13 = f44 * 0.017453292f;
                        this.f80929s.lineTo(centerCircleBox.f84265c + (((float) Math.cos(d13)) * f21), centerCircleBox.f84266d + (f21 * ((float) Math.sin(d13))));
                        this.f80929s.arcTo(this.f80930t, f44, -f43);
                    } else {
                        this.f80929s.addCircle(centerCircleBox.f84265c, centerCircleBox.f84266d, f21, Path.Direction.CCW);
                    }
                } else if (f11 % 360.0f > rm.k.f84293g) {
                    if (z12) {
                        double d14 = (f17 + (f11 / 2.0f)) * 0.017453292f;
                        this.f80929s.lineTo(centerCircleBox.f84265c + (((float) Math.cos(d14)) * f18), centerCircleBox.f84266d + (f18 * ((float) Math.sin(d14))));
                    } else {
                        this.f80929s.lineTo(centerCircleBox.f84265c, centerCircleBox.f84266d);
                    }
                }
                this.f80929s.close();
                this.f80928r.drawPath(this.f80929s, this.f80886c);
            } else {
                f19 = radius;
                f16 = holeRadius;
                rectF = rectF2;
                i11 = i13;
            }
            i13 = i11 + 1;
            f22 = f23;
            dVarArr2 = dVarArr;
            holeRadius = f16;
            rectF2 = rectF;
            radius = f19;
        }
        rm.g.h(centerCircleBox);
    }

    @Override // pm.g
    public void e(Canvas canvas, String str, float f11, float f12, int i11) {
        this.f80889f.setColor(i11);
        canvas.drawText(str, f11, f12, this.f80889f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00b1  */
    @Override // pm.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(android.graphics.Canvas r51) {
        /*
            Method dump skipped, instructions count: 958
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pm.m.f(android.graphics.Canvas):void");
    }

    public float l(rm.g gVar, float f11, float f12, float f13, float f14, float f15, float f16) {
        double d11 = (f15 + f16) * 0.017453292f;
        float cos = gVar.f84265c + (((float) Math.cos(d11)) * f11);
        float sin = gVar.f84266d + (((float) Math.sin(d11)) * f11);
        double d12 = (f15 + (f16 / 2.0f)) * 0.017453292f;
        return (float) ((f11 - ((float) ((Math.sqrt(Math.pow(cos - f13, 2.0d) + Math.pow(sin - f14, 2.0d)) / 2.0d) * Math.tan(((180.0d - f12) / 2.0d) * 0.017453292519943295d)))) - Math.sqrt(Math.pow((gVar.f84265c + (((float) Math.cos(d12)) * f11)) - ((cos + f13) / 2.0f), 2.0d) + Math.pow((gVar.f84266d + (((float) Math.sin(d12)) * f11)) - ((sin + f14) / 2.0f), 2.0d)));
    }

    public void m(Canvas canvas) {
        CharSequence centerText = this.f80917g.getCenterText();
        if (!this.f80917g.k0() || centerText == null) {
            return;
        }
        rm.g centerCircleBox = this.f80917g.getCenterCircleBox();
        rm.g centerTextOffset = this.f80917g.getCenterTextOffset();
        float f11 = centerCircleBox.f84265c + centerTextOffset.f84265c;
        float f12 = centerCircleBox.f84266d + centerTextOffset.f84266d;
        float radius = (!this.f80917g.m0() || this.f80917g.o0()) ? this.f80917g.getRadius() : this.f80917g.getRadius() * (this.f80917g.getHoleRadius() / 100.0f);
        RectF[] rectFArr = this.f80926p;
        RectF rectF = rectFArr[0];
        rectF.left = f11 - radius;
        rectF.top = f12 - radius;
        rectF.right = f11 + radius;
        rectF.bottom = f12 + radius;
        RectF rectF2 = rectFArr[1];
        rectF2.set(rectF);
        float centerTextRadiusPercent = this.f80917g.getCenterTextRadiusPercent() / 100.0f;
        if (centerTextRadiusPercent > 0.0d) {
            rectF2.inset((rectF2.width() - (rectF2.width() * centerTextRadiusPercent)) / 2.0f, (rectF2.height() - (rectF2.height() * centerTextRadiusPercent)) / 2.0f);
        }
        if (!centerText.equals(this.f80924n) || !rectF2.equals(this.f80925o)) {
            this.f80925o.set(rectF2);
            this.f80924n = centerText;
            this.f80923m = new StaticLayout(centerText, 0, centerText.length(), this.f80921k, (int) Math.max(Math.ceil(this.f80925o.width()), 1.0d), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        }
        float height = this.f80923m.getHeight();
        canvas.save();
        Path path = this.f80932v;
        path.reset();
        path.addOval(rectF, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.translate(rectF2.left, rectF2.top + ((rectF2.height() - height) / 2.0f));
        this.f80923m.draw(canvas);
        canvas.restore();
        rm.g.h(centerCircleBox);
        rm.g.h(centerTextOffset);
    }

    public void n(Canvas canvas, km.i iVar) {
        float f11;
        int i11;
        int i12;
        float f12;
        float f13;
        float f14;
        float f15;
        int i13;
        RectF rectF;
        float f16;
        float f17;
        int i14;
        float f18;
        float f19;
        int i15;
        int i16;
        float f21;
        m mVar = this;
        km.i iVar2 = iVar;
        float rotationAngle = mVar.f80917g.getRotationAngle();
        float h11 = mVar.f80885b.h();
        float i17 = mVar.f80885b.i();
        RectF circleBox = mVar.f80917g.getCircleBox();
        int l12 = iVar2.l1();
        float[] drawAngles = mVar.f80917g.getDrawAngles();
        rm.g centerCircleBox = mVar.f80917g.getCenterCircleBox();
        float radius = mVar.f80917g.getRadius();
        boolean z11 = mVar.f80917g.m0() && !mVar.f80917g.o0();
        float holeRadius = z11 ? (mVar.f80917g.getHoleRadius() / 100.0f) * radius : 0.0f;
        float holeRadius2 = (radius - ((mVar.f80917g.getHoleRadius() * radius) / 100.0f)) / 2.0f;
        RectF rectF2 = new RectF();
        boolean z12 = z11 && mVar.f80917g.n0();
        int i18 = 0;
        for (int i19 = 0; i19 < l12; i19++) {
            if (Math.abs(iVar2.m(i19).c()) > rm.k.f84293g) {
                i18++;
            }
        }
        float v11 = i18 <= 1 ? 0.0f : mVar.v(iVar2);
        float f22 = 0.0f;
        int i21 = 0;
        while (i21 < l12) {
            float f23 = drawAngles[i21];
            float abs = Math.abs(iVar2.m(i21).c());
            float f24 = rm.k.f84293g;
            if (abs > f24 && (!mVar.f80917g.q0(i21) || z12)) {
                boolean z13 = v11 > 0.0f && f23 <= 180.0f;
                f11 = holeRadius;
                mVar.f80886c.setColor(iVar2.Y0(i21));
                float f25 = i18 == 1 ? 0.0f : v11 / (radius * 0.017453292f);
                float f26 = rotationAngle + ((f22 + (f25 / 2.0f)) * i17);
                float f27 = (f23 - f25) * i17;
                if (f27 < 0.0f) {
                    f27 = 0.0f;
                }
                i11 = i21;
                mVar.f80929s.reset();
                if (z12) {
                    float f28 = radius - holeRadius2;
                    i12 = i18;
                    double d11 = f26 * 0.017453292f;
                    float cos = centerCircleBox.f84265c + (((float) Math.cos(d11)) * f28);
                    float sin = centerCircleBox.f84266d + (f28 * ((float) Math.sin(d11)));
                    f12 = rotationAngle;
                    rectF2.set(cos - holeRadius2, sin - holeRadius2, cos + holeRadius2, sin + holeRadius2);
                } else {
                    i12 = i18;
                    f12 = rotationAngle;
                }
                double d12 = f26 * 0.017453292f;
                float cos2 = (((float) Math.cos(d12)) * radius) + centerCircleBox.f84265c;
                float sin2 = centerCircleBox.f84266d + (((float) Math.sin(d12)) * radius);
                int i22 = (f27 > 360.0f ? 1 : (f27 == 360.0f ? 0 : -1));
                if (i22 < 0 || f27 % 360.0f > f24) {
                    f13 = cos2;
                    f14 = sin2;
                    f15 = 360.0f;
                    i13 = i22;
                    if (z12) {
                        mVar.f80929s.arcTo(rectF2, f26 + 180.0f, -180.0f);
                    }
                    mVar.f80929s.arcTo(circleBox, f26, f27);
                } else {
                    f15 = 360.0f;
                    f13 = cos2;
                    f14 = sin2;
                    i13 = i22;
                    mVar.f80929s.addCircle(centerCircleBox.f84265c, centerCircleBox.f84266d, radius, Path.Direction.CW);
                }
                RectF rectF3 = mVar.f80930t;
                float f29 = centerCircleBox.f84265c;
                float f31 = centerCircleBox.f84266d;
                rectF3.set(f29 - f11, f31 - f11, f29 + f11, f31 + f11);
                if (!z11 || (f11 <= 0.0f && !z13)) {
                    mVar = this;
                    rectF = rectF2;
                    float f32 = f27;
                    f16 = h11;
                    f17 = i17;
                    i14 = i12;
                    float f33 = f13;
                    float f34 = f14;
                    if (f32 % f15 > f24) {
                        if (z13) {
                            float l11 = mVar.l(centerCircleBox, radius, f23 * f17, f33, f34, f26, f32);
                            double d13 = (f26 + (f32 / 2.0f)) * 0.017453292f;
                            mVar.f80929s.lineTo(centerCircleBox.f84265c + (((float) Math.cos(d13)) * l11), centerCircleBox.f84266d + (l11 * ((float) Math.sin(d13))));
                        } else {
                            mVar.f80929s.lineTo(centerCircleBox.f84265c, centerCircleBox.f84266d);
                        }
                    }
                } else {
                    if (z13) {
                        rectF = rectF2;
                        f18 = f27;
                        f16 = h11;
                        f19 = f11;
                        i15 = i12;
                        i16 = 1;
                        mVar = this;
                        float l13 = mVar.l(centerCircleBox, radius, f23 * i17, f13, f14, f26, f18);
                        if (l13 < 0.0f) {
                            l13 = -l13;
                        }
                        f21 = Math.max(f19, l13);
                    } else {
                        mVar = this;
                        rectF = rectF2;
                        f18 = f27;
                        f16 = h11;
                        f19 = f11;
                        i15 = i12;
                        i16 = 1;
                        f21 = f19;
                    }
                    float f35 = (i15 == i16 || f21 == 0.0f) ? 0.0f : v11 / (f21 * 0.017453292f);
                    float f36 = f12 + ((f22 + (f35 / 2.0f)) * i17);
                    float f37 = (f23 - f35) * i17;
                    if (f37 < 0.0f) {
                        f37 = 0.0f;
                    }
                    float f38 = f36 + f37;
                    if (i13 < 0 || f18 % f15 > f24) {
                        if (z12) {
                            float f39 = radius - holeRadius2;
                            f17 = i17;
                            double d14 = f38 * 0.017453292f;
                            float cos3 = centerCircleBox.f84265c + (f39 * ((float) Math.cos(d14)));
                            float sin3 = centerCircleBox.f84266d + (((float) Math.sin(d14)) * f39);
                            rectF.set(cos3 - holeRadius2, sin3 - holeRadius2, cos3 + holeRadius2, sin3 + holeRadius2);
                            mVar.f80929s.arcTo(rectF, f38, 180.0f);
                            f11 = f19;
                        } else {
                            f17 = i17;
                            double d15 = f38 * 0.017453292f;
                            f11 = f19;
                            mVar.f80929s.lineTo(centerCircleBox.f84265c + (((float) Math.cos(d15)) * f21), centerCircleBox.f84266d + (f21 * ((float) Math.sin(d15))));
                        }
                        mVar.f80929s.arcTo(mVar.f80930t, f38, -f37);
                    } else {
                        mVar.f80929s.addCircle(centerCircleBox.f84265c, centerCircleBox.f84266d, f21, Path.Direction.CCW);
                        f11 = f19;
                        f17 = i17;
                    }
                    i14 = i15;
                }
                mVar.f80929s.close();
                mVar.f80928r.drawPath(mVar.f80929s, mVar.f80886c);
                f22 += f23 * f16;
            } else {
                f22 += f23 * h11;
                f11 = holeRadius;
                i11 = i21;
                i14 = i18;
                f12 = rotationAngle;
                f16 = h11;
                f17 = i17;
                rectF = rectF2;
            }
            i21 = i11 + 1;
            i18 = i14;
            rectF2 = rectF;
            h11 = f16;
            holeRadius = f11;
            i17 = f17;
            rotationAngle = f12;
            iVar2 = iVar;
        }
        rm.g.h(centerCircleBox);
    }

    public void o(Canvas canvas, String str, float f11, float f12) {
        canvas.drawText(str, f11, f12, this.f80922l);
    }

    public void p(Canvas canvas) {
        if (!this.f80917g.m0() || this.f80928r == null) {
            return;
        }
        float radius = this.f80917g.getRadius();
        float holeRadius = (this.f80917g.getHoleRadius() / 100.0f) * radius;
        rm.g centerCircleBox = this.f80917g.getCenterCircleBox();
        if (Color.alpha(this.f80918h.getColor()) > 0) {
            this.f80928r.drawCircle(centerCircleBox.f84265c, centerCircleBox.f84266d, holeRadius, this.f80918h);
        }
        if (Color.alpha(this.f80919i.getColor()) > 0 && this.f80917g.getTransparentCircleRadius() > this.f80917g.getHoleRadius()) {
            int alpha = this.f80919i.getAlpha();
            float transparentCircleRadius = radius * (this.f80917g.getTransparentCircleRadius() / 100.0f);
            this.f80919i.setAlpha((int) (alpha * this.f80885b.h() * this.f80885b.i()));
            this.f80931u.reset();
            this.f80931u.addCircle(centerCircleBox.f84265c, centerCircleBox.f84266d, transparentCircleRadius, Path.Direction.CW);
            this.f80931u.addCircle(centerCircleBox.f84265c, centerCircleBox.f84266d, holeRadius, Path.Direction.CCW);
            this.f80928r.drawPath(this.f80931u, this.f80919i);
            this.f80919i.setAlpha(alpha);
        }
        rm.g.h(centerCircleBox);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void q(Canvas canvas) {
        float f11;
        float f12;
        if (this.f80917g.n0()) {
            km.i Q = ((fm.p) this.f80917g.getData()).Q();
            if (Q.isVisible()) {
                float h11 = this.f80885b.h();
                float i11 = this.f80885b.i();
                rm.g centerCircleBox = this.f80917g.getCenterCircleBox();
                float radius = this.f80917g.getRadius();
                float holeRadius = (radius - ((this.f80917g.getHoleRadius() * radius) / 100.0f)) / 2.0f;
                float[] drawAngles = this.f80917g.getDrawAngles();
                float rotationAngle = this.f80917g.getRotationAngle();
                int i12 = 0;
                while (i12 < Q.l1()) {
                    float f13 = drawAngles[i12];
                    if (Math.abs(Q.m(i12).c()) > rm.k.f84293g) {
                        double d11 = radius - holeRadius;
                        double d12 = (rotationAngle + f13) * i11;
                        f11 = h11;
                        f12 = i11;
                        float cos = (float) (centerCircleBox.f84265c + (Math.cos(Math.toRadians(d12)) * d11));
                        float sin = (float) ((d11 * Math.sin(Math.toRadians(d12))) + centerCircleBox.f84266d);
                        this.f80886c.setColor(Q.Y0(i12));
                        this.f80928r.drawCircle(cos, sin, holeRadius, this.f80886c);
                    } else {
                        f11 = h11;
                        f12 = i11;
                    }
                    rotationAngle += f13 * f11;
                    i12++;
                    h11 = f11;
                    i11 = f12;
                }
                rm.g.h(centerCircleBox);
            }
        }
    }

    public TextPaint r() {
        return this.f80921k;
    }

    public Paint s() {
        return this.f80922l;
    }

    public Paint t() {
        return this.f80918h;
    }

    public Paint u() {
        return this.f80919i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public float v(km.i iVar) {
        if (!iVar.l()) {
            return iVar.J0();
        }
        if (iVar.J0() / this.f80939a.y() > (iVar.q0() / ((fm.p) this.f80917g.getData()).T()) * 2.0f) {
            return 0.0f;
        }
        return iVar.J0();
    }

    public void w() {
        Canvas canvas = this.f80928r;
        if (canvas != null) {
            canvas.setBitmap(null);
            this.f80928r = null;
        }
        WeakReference<Bitmap> weakReference = this.f80927q;
        if (weakReference != null) {
            Bitmap bitmap = weakReference.get();
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.f80927q.clear();
            this.f80927q = null;
        }
    }

    @Override // pm.g
    public void j() {
    }
}
