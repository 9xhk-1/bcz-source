package pm;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import com.github.mikephil.charting.components.Legend;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class i extends o {

    /* renamed from: b, reason: collision with root package name */
    public Paint f80891b;

    /* renamed from: c, reason: collision with root package name */
    public Paint f80892c;

    /* renamed from: d, reason: collision with root package name */
    public Legend f80893d;

    /* renamed from: e, reason: collision with root package name */
    public List<com.github.mikephil.charting.components.a> f80894e;

    /* renamed from: f, reason: collision with root package name */
    public Paint.FontMetrics f80895f;

    /* renamed from: g, reason: collision with root package name */
    public Path f80896g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f80897a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f80898b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f80899c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f80900d;

        static {
            int[] iArr = new int[Legend.LegendForm.values().length];
            f80900d = iArr;
            try {
                iArr[Legend.LegendForm.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f80900d[Legend.LegendForm.EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f80900d[Legend.LegendForm.DEFAULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f80900d[Legend.LegendForm.CIRCLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f80900d[Legend.LegendForm.SQUARE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f80900d[Legend.LegendForm.LINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[Legend.LegendOrientation.values().length];
            f80899c = iArr2;
            try {
                iArr2[Legend.LegendOrientation.HORIZONTAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f80899c[Legend.LegendOrientation.VERTICAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr3 = new int[Legend.LegendVerticalAlignment.values().length];
            f80898b = iArr3;
            try {
                iArr3[Legend.LegendVerticalAlignment.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f80898b[Legend.LegendVerticalAlignment.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f80898b[Legend.LegendVerticalAlignment.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            int[] iArr4 = new int[Legend.LegendHorizontalAlignment.values().length];
            f80897a = iArr4;
            try {
                iArr4[Legend.LegendHorizontalAlignment.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f80897a[Legend.LegendHorizontalAlignment.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f80897a[Legend.LegendHorizontalAlignment.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    public i(rm.l lVar, Legend legend) {
        super(lVar);
        this.f80894e = new ArrayList(16);
        this.f80895f = new Paint.FontMetrics();
        this.f80896g = new Path();
        this.f80893d = legend;
        Paint paint = new Paint(1);
        this.f80891b = paint;
        paint.setTextSize(rm.k.e(9.0f));
        this.f80891b.setTextAlign(Paint.Align.LEFT);
        Paint paint2 = new Paint(1);
        this.f80892c = paint2;
        paint2.setStyle(Paint.Style.FILL);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [km.e] */
    /* JADX WARN: Type inference failed for: r8v3, types: [km.e] */
    public void a(fm.k<?> kVar) {
        if (!this.f80893d.I()) {
            this.f80894e.clear();
            for (int i11 = 0; i11 < kVar.m(); i11++) {
                ?? k11 = kVar.k(i11);
                List<Integer> A0 = k11.A0();
                int l12 = k11.l1();
                if (k11 instanceof km.a) {
                    km.a aVar = (km.a) k11;
                    if (aVar.c0()) {
                        String[] d02 = aVar.d0();
                        for (int i12 = 0; i12 < A0.size() && i12 < aVar.t(); i12++) {
                            this.f80894e.add(new com.github.mikephil.charting.components.a(d02[i12 % d02.length], k11.i(), k11.n(), k11.Q(), k11.K(), A0.get(i12).intValue()));
                        }
                        if (aVar.getLabel() != null) {
                            this.f80894e.add(new com.github.mikephil.charting.components.a(k11.getLabel(), Legend.LegendForm.NONE, Float.NaN, Float.NaN, null, rm.a.f84248a));
                        }
                    }
                }
                if (k11 instanceof km.i) {
                    km.i iVar = (km.i) k11;
                    for (int i13 = 0; i13 < A0.size() && i13 < l12; i13++) {
                        this.f80894e.add(new com.github.mikephil.charting.components.a(iVar.m(i13).m(), k11.i(), k11.n(), k11.Q(), k11.K(), A0.get(i13).intValue()));
                    }
                    if (iVar.getLabel() != null) {
                        this.f80894e.add(new com.github.mikephil.charting.components.a(k11.getLabel(), Legend.LegendForm.NONE, Float.NaN, Float.NaN, null, rm.a.f84248a));
                    }
                } else {
                    if (k11 instanceof km.d) {
                        km.d dVar = (km.d) k11;
                        if (dVar.k0() != 1122867) {
                            int k02 = dVar.k0();
                            int z11 = dVar.z();
                            this.f80894e.add(new com.github.mikephil.charting.components.a(null, k11.i(), k11.n(), k11.Q(), k11.K(), k02));
                            this.f80894e.add(new com.github.mikephil.charting.components.a(k11.getLabel(), k11.i(), k11.n(), k11.Q(), k11.K(), z11));
                        }
                    }
                    int i14 = 0;
                    while (i14 < A0.size() && i14 < l12) {
                        this.f80894e.add(new com.github.mikephil.charting.components.a((i14 >= A0.size() + (-1) || i14 >= l12 + (-1)) ? kVar.k(i11).getLabel() : null, k11.i(), k11.n(), k11.Q(), k11.K(), A0.get(i14).intValue()));
                        i14++;
                    }
                }
            }
            if (this.f80893d.s() != null) {
                Collections.addAll(this.f80894e, this.f80893d.s());
            }
            this.f80893d.P(this.f80894e);
        }
        Typeface c11 = this.f80893d.c();
        if (c11 != null) {
            this.f80891b.setTypeface(c11);
        }
        this.f80891b.setTextSize(this.f80893d.b());
        this.f80891b.setColor(this.f80893d.a());
        this.f80893d.m(this.f80891b, this.f80939a);
    }

    public void b(Canvas canvas, float f11, float f12, com.github.mikephil.charting.components.a aVar, Legend legend) {
        Canvas canvas2;
        int i11 = aVar.f30239f;
        if (i11 == 1122868 || i11 == 1122867 || i11 == 0) {
            return;
        }
        int save = canvas.save();
        Legend.LegendForm legendForm = aVar.f30235b;
        if (legendForm == Legend.LegendForm.DEFAULT) {
            legendForm = legend.t();
        }
        this.f80892c.setColor(aVar.f30239f);
        float e11 = rm.k.e(Float.isNaN(aVar.f30236c) ? legend.w() : aVar.f30236c);
        float f13 = e11 / 2.0f;
        int i12 = a.f80900d[legendForm.ordinal()];
        if (i12 == 3 || i12 == 4) {
            canvas2 = canvas;
            this.f80892c.setStyle(Paint.Style.FILL);
            canvas2.drawCircle(f11 + f13, f12, f13, this.f80892c);
        } else if (i12 != 5) {
            if (i12 == 6) {
                float e12 = rm.k.e(Float.isNaN(aVar.f30237d) ? legend.v() : aVar.f30237d);
                DashPathEffect dashPathEffect = aVar.f30238e;
                if (dashPathEffect == null) {
                    dashPathEffect = legend.u();
                }
                this.f80892c.setStyle(Paint.Style.STROKE);
                this.f80892c.setStrokeWidth(e12);
                this.f80892c.setPathEffect(dashPathEffect);
                this.f80896g.reset();
                this.f80896g.moveTo(f11, f12);
                this.f80896g.lineTo(f11 + e11, f12);
                canvas.drawPath(this.f80896g, this.f80892c);
            }
            canvas2 = canvas;
        } else {
            this.f80892c.setStyle(Paint.Style.FILL);
            canvas2 = canvas;
            canvas2.drawRect(f11, f12 - f13, f11 + e11, f12 + f13, this.f80892c);
        }
        canvas2.restoreToCount(save);
    }

    public void c(Canvas canvas, float f11, float f12, String str) {
        canvas.drawText(str, f11, f12, this.f80891b);
    }

    public Paint d() {
        return this.f80892c;
    }

    public Paint e() {
        return this.f80891b;
    }

    public void f(Canvas canvas) {
        float f11;
        float f12;
        List<rm.c> list;
        boolean z11;
        List<rm.c> list2;
        List<Boolean> list3;
        int i11;
        Canvas canvas2;
        float f13;
        float j11;
        int i12;
        float f14;
        Canvas canvas3;
        float f15;
        float f16;
        double d11;
        double d12;
        if (this.f80893d.f()) {
            Typeface c11 = this.f80893d.c();
            if (c11 != null) {
                this.f80891b.setTypeface(c11);
            }
            this.f80891b.setTextSize(this.f80893d.b());
            this.f80891b.setColor(this.f80893d.a());
            float u11 = rm.k.u(this.f80891b, this.f80895f);
            float w11 = rm.k.w(this.f80891b, this.f80895f) + rm.k.e(this.f80893d.G());
            float a11 = u11 - (rm.k.a(this.f80891b, "ABC") / 2.0f);
            com.github.mikephil.charting.components.a[] r11 = this.f80893d.r();
            float e11 = rm.k.e(this.f80893d.x());
            float e12 = rm.k.e(this.f80893d.F());
            Legend.LegendOrientation C = this.f80893d.C();
            Legend.LegendHorizontalAlignment y11 = this.f80893d.y();
            Legend.LegendVerticalAlignment E = this.f80893d.E();
            Legend.LegendDirection q11 = this.f80893d.q();
            float e13 = rm.k.e(this.f80893d.w());
            float e14 = rm.k.e(this.f80893d.D());
            float e15 = this.f80893d.e();
            float d13 = this.f80893d.d();
            int i13 = a.f80897a[y11.ordinal()];
            if (i13 == 1) {
                f11 = e14;
                if (C != Legend.LegendOrientation.VERTICAL) {
                    d13 += this.f80939a.h();
                }
                f12 = q11 == Legend.LegendDirection.RIGHT_TO_LEFT ? d13 + this.f80893d.f30220x : d13;
            } else if (i13 == 2) {
                f11 = e14;
                f12 = (C == Legend.LegendOrientation.VERTICAL ? this.f80939a.o() : this.f80939a.i()) - d13;
                if (q11 == Legend.LegendDirection.LEFT_TO_RIGHT) {
                    f12 -= this.f80893d.f30220x;
                }
            } else if (i13 != 3) {
                f11 = e14;
                f12 = 0.0f;
            } else {
                Legend.LegendOrientation legendOrientation = Legend.LegendOrientation.VERTICAL;
                float o11 = C == legendOrientation ? this.f80939a.o() / 2.0f : this.f80939a.h() + (this.f80939a.k() / 2.0f);
                Legend.LegendDirection legendDirection = Legend.LegendDirection.LEFT_TO_RIGHT;
                f11 = e14;
                f12 = o11 + (q11 == legendDirection ? d13 : -d13);
                if (C == legendOrientation) {
                    double d14 = f12;
                    if (q11 == legendDirection) {
                        d11 = d14;
                        d12 = ((-this.f80893d.f30220x) / 2.0d) + d13;
                    } else {
                        d11 = d14;
                        d12 = (this.f80893d.f30220x / 2.0d) - d13;
                    }
                    f12 = (float) (d11 + d12);
                }
            }
            int i14 = a.f80899c[C.ordinal()];
            if (i14 != 1) {
                if (i14 != 2) {
                    return;
                }
                int i15 = a.f80898b[E.ordinal()];
                if (i15 == 1) {
                    j11 = (y11 == Legend.LegendHorizontalAlignment.CENTER ? 0.0f : this.f80939a.j()) + e15;
                } else if (i15 == 2) {
                    j11 = (y11 == Legend.LegendHorizontalAlignment.CENTER ? this.f80939a.n() : this.f80939a.f()) - (this.f80893d.f30221y + e15);
                } else if (i15 != 3) {
                    j11 = 0.0f;
                } else {
                    float n11 = this.f80939a.n() / 2.0f;
                    Legend legend = this.f80893d;
                    j11 = (n11 - (legend.f30221y / 2.0f)) + legend.e();
                }
                float f17 = j11;
                float f18 = 0.0f;
                int i16 = 0;
                boolean z12 = false;
                while (i16 < r11.length) {
                    com.github.mikephil.charting.components.a aVar = r11[i16];
                    boolean z13 = aVar.f30235b != Legend.LegendForm.NONE;
                    float e16 = Float.isNaN(aVar.f30236c) ? e13 : rm.k.e(aVar.f30236c);
                    if (z13) {
                        Legend.LegendDirection legendDirection2 = Legend.LegendDirection.LEFT_TO_RIGHT;
                        float f19 = q11 == legendDirection2 ? f12 + f18 : f12 - (e16 - f18);
                        f14 = f11;
                        f15 = w11;
                        i12 = i16;
                        canvas3 = canvas;
                        b(canvas3, f19, f17 + a11, aVar, this.f80893d);
                        f16 = q11 == legendDirection2 ? f19 + e16 : f19;
                    } else {
                        i12 = i16;
                        f14 = f11;
                        canvas3 = canvas;
                        f15 = w11;
                        f16 = f12;
                    }
                    if (aVar.f30234a != null) {
                        if (z13 && !z12) {
                            f16 += q11 == Legend.LegendDirection.LEFT_TO_RIGHT ? e11 : -e11;
                        } else if (z12) {
                            f16 = f12;
                        }
                        if (q11 == Legend.LegendDirection.RIGHT_TO_LEFT) {
                            f16 -= rm.k.d(this.f80891b, r2);
                        }
                        if (z12) {
                            f17 += u11 + f15;
                            c(canvas3, f16, f17 + u11, aVar.f30234a);
                        } else {
                            c(canvas3, f16, f17 + u11, aVar.f30234a);
                        }
                        f17 += u11 + f15;
                        f18 = 0.0f;
                    } else {
                        f18 += e16 + f14;
                        z12 = true;
                    }
                    i16 = i12 + 1;
                    w11 = f15;
                    f11 = f14;
                }
                return;
            }
            float f21 = f11;
            List<rm.c> p11 = this.f80893d.p();
            List<rm.c> o12 = this.f80893d.o();
            List<Boolean> n12 = this.f80893d.n();
            int i17 = a.f80898b[E.ordinal()];
            float f22 = f12;
            if (i17 != 1) {
                e15 = i17 != 2 ? i17 != 3 ? 0.0f : e15 + ((this.f80939a.n() - this.f80893d.f30221y) / 2.0f) : (this.f80939a.n() - e15) - this.f80893d.f30221y;
            }
            int length = r11.length;
            float f23 = f22;
            int i18 = 0;
            int i19 = 0;
            while (i19 < length) {
                float f24 = e15;
                com.github.mikephil.charting.components.a aVar2 = r11[i19];
                List<rm.c> list4 = o12;
                int i21 = length;
                boolean z14 = aVar2.f30235b != Legend.LegendForm.NONE;
                float e17 = Float.isNaN(aVar2.f30236c) ? e13 : rm.k.e(aVar2.f30236c);
                if (i19 < n12.size() && n12.get(i19).booleanValue()) {
                    f24 += u11 + w11;
                    f23 = f22;
                }
                if (f23 == f22 && y11 == Legend.LegendHorizontalAlignment.CENTER && i18 < p11.size()) {
                    f23 += (q11 == Legend.LegendDirection.RIGHT_TO_LEFT ? p11.get(i18).f84257c : -p11.get(i18).f84257c) / 2.0f;
                    i18++;
                }
                float f25 = f23;
                int i22 = i18;
                float f26 = f25;
                boolean z15 = aVar2.f30234a == null;
                if (z14) {
                    if (q11 == Legend.LegendDirection.RIGHT_TO_LEFT) {
                        f26 -= e17;
                    }
                    float f27 = f26;
                    z11 = z14;
                    i11 = i19;
                    list = p11;
                    list2 = list4;
                    list3 = n12;
                    b(canvas, f27, f24 + a11, aVar2, this.f80893d);
                    canvas2 = canvas;
                    f26 = q11 == Legend.LegendDirection.LEFT_TO_RIGHT ? f27 + e17 : f27;
                } else {
                    list = p11;
                    z11 = z14;
                    list2 = list4;
                    list3 = n12;
                    i11 = i19;
                    canvas2 = canvas;
                }
                if (z15) {
                    f13 = q11 == Legend.LegendDirection.RIGHT_TO_LEFT ? -f21 : f21;
                } else {
                    if (z11) {
                        f26 += q11 == Legend.LegendDirection.RIGHT_TO_LEFT ? -e11 : e11;
                    }
                    Legend.LegendDirection legendDirection3 = Legend.LegendDirection.RIGHT_TO_LEFT;
                    if (q11 == legendDirection3) {
                        f26 -= list2.get(i11).f84257c;
                    }
                    c(canvas2, f26, f24 + u11, aVar2.f30234a);
                    if (q11 == Legend.LegendDirection.LEFT_TO_RIGHT) {
                        f26 += list2.get(i11).f84257c;
                    }
                    f13 = q11 == legendDirection3 ? -e12 : e12;
                }
                i19 = i11 + 1;
                f23 = f26 + f13;
                i18 = i22;
                o12 = list2;
                e15 = f24;
                n12 = list3;
                length = i21;
                p11 = list;
            }
        }
    }
}
