package pm;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.data.BarEntry;
import com.tencent.connect.common.Constants;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class b extends c {

    /* renamed from: h, reason: collision with root package name */
    public jm.a f80860h;

    /* renamed from: i, reason: collision with root package name */
    public RectF f80861i;

    /* renamed from: j, reason: collision with root package name */
    public dm.b[] f80862j;

    /* renamed from: k, reason: collision with root package name */
    public Paint f80863k;

    /* renamed from: l, reason: collision with root package name */
    public Paint f80864l;

    /* renamed from: m, reason: collision with root package name */
    public RectF f80865m;

    public b(jm.a aVar, cm.a aVar2, rm.l lVar) {
        super(aVar2, lVar);
        this.f80861i = new RectF();
        this.f80865m = new RectF();
        this.f80860h = aVar;
        Paint paint = new Paint(1);
        this.f80887d = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f80887d.setColor(Color.rgb(0, 0, 0));
        this.f80887d.setAlpha(120);
        Paint paint2 = new Paint(1);
        this.f80863k = paint2;
        paint2.setStyle(style);
        Paint paint3 = new Paint(1);
        this.f80864l = paint3;
        paint3.setStyle(Paint.Style.STROKE);
    }

    @Override // pm.g
    public void b(Canvas canvas) {
        fm.a barData = this.f80860h.getBarData();
        for (int i11 = 0; i11 < barData.m(); i11++) {
            km.a aVar = (km.a) barData.k(i11);
            if (aVar.isVisible()) {
                n(canvas, aVar, i11);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // pm.g
    public void d(Canvas canvas, im.d[] dVarArr) {
        float c11;
        float f11;
        fm.a barData = this.f80860h.getBarData();
        for (im.d dVar : dVarArr) {
            km.a aVar = (km.a) barData.k(dVar.d());
            if (aVar != null && aVar.g0()) {
                BarEntry barEntry = (BarEntry) aVar.N0(dVar.h(), dVar.j());
                if (l(barEntry, aVar)) {
                    rm.i d11 = this.f80860h.d(aVar.F0());
                    this.f80887d.setColor(aVar.k1());
                    this.f80887d.setAlpha(aVar.i1());
                    if (dVar.g() < 0 || !barEntry.x()) {
                        c11 = barEntry.c();
                        f11 = 0.0f;
                    } else if (this.f80860h.b()) {
                        c11 = barEntry.s();
                        f11 = -barEntry.r();
                    } else {
                        im.j jVar = barEntry.t()[dVar.g()];
                        float f12 = jVar.f60711a;
                        f11 = jVar.f60712b;
                        c11 = f12;
                    }
                    o(barEntry.j(), c11, f11, barData.Q() / 2.0f, d11);
                    p(dVar, this.f80861i);
                    canvas.drawRect(this.f80861i, this.f80887d);
                }
            }
        }
    }

    @Override // pm.g
    public void e(Canvas canvas, String str, float f11, float f12, int i11) {
        this.f80889f.setColor(i11);
        canvas.drawText(str, f11, f12, this.f80889f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // pm.g
    public void f(Canvas canvas) {
        List list;
        rm.g gVar;
        int i11;
        boolean z11;
        int i12;
        float[] fArr;
        float f11;
        rm.i iVar;
        int i13;
        float f12;
        int i14;
        float f13;
        float f14;
        BarEntry barEntry;
        float f15;
        float f16;
        boolean z12;
        int i15;
        hm.l lVar;
        List list2;
        rm.g gVar2;
        BarEntry barEntry2;
        b bVar = this;
        if (bVar.k(bVar.f80860h)) {
            List q11 = bVar.f80860h.getBarData().q();
            float e11 = rm.k.e(4.5f);
            boolean a11 = bVar.f80860h.a();
            int i16 = 0;
            while (i16 < bVar.f80860h.getBarData().m()) {
                km.a aVar = (km.a) q11.get(i16);
                if (bVar.m(aVar)) {
                    bVar.a(aVar);
                    boolean e12 = bVar.f80860h.e(aVar.F0());
                    float a12 = rm.k.a(bVar.f80889f, Constants.VIA_SHARE_TYPE_PUBLISHVIDEO);
                    float f17 = a11 ? -e11 : a12 + e11;
                    float f18 = a11 ? a12 + e11 : -e11;
                    if (e12) {
                        f17 = (-f17) - a12;
                        f18 = (-f18) - a12;
                    }
                    float f19 = f17;
                    float f21 = f18;
                    dm.b bVar2 = bVar.f80862j[i16];
                    float i17 = bVar.f80885b.i();
                    hm.l u02 = aVar.u0();
                    rm.g d11 = rm.g.d(aVar.m1());
                    d11.f84265c = rm.k.e(d11.f84265c);
                    d11.f84266d = rm.k.e(d11.f84266d);
                    if (aVar.c0()) {
                        list = q11;
                        gVar = d11;
                        rm.i d12 = bVar.f80860h.d(aVar.F0());
                        int i18 = 0;
                        int i19 = 0;
                        while (i18 < aVar.l1() * bVar.f80885b.h()) {
                            BarEntry barEntry3 = (BarEntry) aVar.m(i18);
                            float[] v11 = barEntry3.v();
                            float[] fArr2 = bVar2.f48044b;
                            float f22 = (fArr2[i19] + fArr2[i19 + 2]) / 2.0f;
                            int r11 = aVar.r(i18);
                            if (v11 == null) {
                                rm.i iVar2 = d12;
                                if (!bVar.f80939a.J(f22)) {
                                    break;
                                }
                                i11 = i18;
                                int i21 = i19 + 1;
                                if (bVar.f80939a.M(bVar2.f48044b[i21]) && bVar.f80939a.I(f22)) {
                                    if (aVar.E0()) {
                                        String d13 = u02.d(barEntry3);
                                        float f23 = bVar2.f48044b[i21] + (barEntry3.c() >= 0.0f ? f19 : f21);
                                        barEntry = barEntry3;
                                        f15 = f22;
                                        f11 = e11;
                                        iVar = iVar2;
                                        z11 = a11;
                                        fArr = v11;
                                        bVar.e(canvas, d13, f15, f23, r11);
                                    } else {
                                        f11 = e11;
                                        z11 = a11;
                                        iVar = iVar2;
                                        barEntry = barEntry3;
                                        fArr = v11;
                                        f15 = f22;
                                    }
                                    if (barEntry.b() == null || !aVar.L()) {
                                        i12 = i16;
                                    } else {
                                        Drawable b11 = barEntry.b();
                                        float f24 = bVar2.f48044b[i21] + (barEntry.c() >= 0.0f ? f19 : f21);
                                        i12 = i16;
                                        rm.k.k(canvas, b11, (int) (f15 + gVar.f84265c), (int) (f24 + gVar.f84266d), b11.getIntrinsicWidth(), b11.getIntrinsicHeight());
                                    }
                                } else {
                                    z11 = a11;
                                    i12 = i16;
                                    d12 = iVar2;
                                    bVar = bVar;
                                    e11 = e11;
                                    i18 = i11;
                                    i16 = i12;
                                    a11 = z11;
                                }
                            } else {
                                i11 = i18;
                                BarEntry barEntry4 = barEntry3;
                                float f25 = f22;
                                z11 = a11;
                                i12 = i16;
                                int i22 = r11;
                                b bVar3 = bVar;
                                fArr = v11;
                                f11 = e11;
                                iVar = d12;
                                int length = fArr.length * 2;
                                float[] fArr3 = new float[length];
                                float f26 = -barEntry4.r();
                                float f27 = 0.0f;
                                int i23 = 0;
                                int i24 = 0;
                                while (i23 < length) {
                                    float f28 = fArr[i24];
                                    if (f28 == 0.0f && (f27 == 0.0f || f26 == 0.0f)) {
                                        f14 = f26;
                                        f26 = f28;
                                    } else if (f28 >= 0.0f) {
                                        f27 += f28;
                                        f14 = f26;
                                        f26 = f27;
                                    } else {
                                        f14 = f26 - f28;
                                    }
                                    fArr3[i23 + 1] = f26 * i17;
                                    i23 += 2;
                                    i24++;
                                    f26 = f14;
                                }
                                iVar.o(fArr3);
                                int i25 = 0;
                                while (i25 < length) {
                                    float f29 = fArr[i25 / 2];
                                    int i26 = length;
                                    float f31 = fArr3[i25 + 1] + (((f29 > 0.0f ? 1 : (f29 == 0.0f ? 0 : -1)) == 0 && (f26 > 0.0f ? 1 : (f26 == 0.0f ? 0 : -1)) == 0 && (f27 > 0.0f ? 1 : (f27 == 0.0f ? 0 : -1)) > 0) || (f29 > 0.0f ? 1 : (f29 == 0.0f ? 0 : -1)) < 0 ? f21 : f19);
                                    float[] fArr4 = fArr3;
                                    if (!bVar3.f80939a.J(f25)) {
                                        break;
                                    }
                                    if (bVar3.f80939a.M(f31) && bVar3.f80939a.I(f25)) {
                                        if (aVar.E0()) {
                                            BarEntry barEntry5 = barEntry4;
                                            String e13 = u02.e(f29, barEntry5);
                                            f13 = f31;
                                            b bVar4 = bVar3;
                                            i13 = i25;
                                            barEntry4 = barEntry5;
                                            bVar4.e(canvas, e13, f25, f13, i22);
                                        } else {
                                            f13 = f31;
                                            i13 = i25;
                                        }
                                        f12 = f25;
                                        i14 = i22;
                                        if (barEntry4.b() != null && aVar.L()) {
                                            Drawable b12 = barEntry4.b();
                                            rm.k.k(canvas, b12, (int) (f12 + gVar.f84265c), (int) (gVar.f84266d + f13), b12.getIntrinsicWidth(), b12.getIntrinsicHeight());
                                        }
                                    } else {
                                        i13 = i25;
                                        f12 = f25;
                                        i14 = i22;
                                    }
                                    i25 = i13 + 2;
                                    bVar3 = this;
                                    fArr3 = fArr4;
                                    f25 = f12;
                                    length = i26;
                                    i22 = i14;
                                }
                            }
                            i19 = fArr == null ? i19 + 4 : i19 + (fArr.length * 4);
                            i18 = i11 + 1;
                            bVar = this;
                            d12 = iVar;
                            e11 = f11;
                            i16 = i12;
                            a11 = z11;
                        }
                    } else {
                        int i27 = 0;
                        while (i27 < bVar2.f48044b.length * bVar.f80885b.h()) {
                            float[] fArr5 = bVar2.f48044b;
                            float f32 = (fArr5[i27] + fArr5[i27 + 2]) / 2.0f;
                            if (!bVar.f80939a.J(f32)) {
                                break;
                            }
                            int i28 = i27 + 1;
                            if (bVar.f80939a.M(bVar2.f48044b[i28]) && bVar.f80939a.I(f32)) {
                                int i29 = i27 / 4;
                                BarEntry barEntry6 = (BarEntry) aVar.m(i29);
                                float c11 = barEntry6.c();
                                if (aVar.E0()) {
                                    rm.g gVar3 = d11;
                                    String d14 = u02.d(barEntry6);
                                    float[] fArr6 = bVar2.f48044b;
                                    float f33 = c11 >= 0.0f ? fArr6[i28] + f19 : fArr6[i27 + 3] + f21;
                                    int r12 = aVar.r(i29);
                                    list2 = q11;
                                    gVar2 = gVar3;
                                    barEntry2 = barEntry6;
                                    float f34 = f33;
                                    lVar = u02;
                                    bVar.e(canvas, d14, f32, f34, r12);
                                } else {
                                    lVar = u02;
                                    barEntry2 = barEntry6;
                                    list2 = q11;
                                    gVar2 = d11;
                                }
                                if (barEntry2.b() != null && aVar.L()) {
                                    Drawable b13 = barEntry2.b();
                                    rm.k.k(canvas, b13, (int) (f32 + gVar2.f84265c), (int) ((c11 >= 0.0f ? bVar2.f48044b[i28] + f19 : bVar2.f48044b[i27 + 3] + f21) + gVar2.f84266d), b13.getIntrinsicWidth(), b13.getIntrinsicHeight());
                                }
                            } else {
                                lVar = u02;
                                list2 = q11;
                                gVar2 = d11;
                            }
                            i27 += 4;
                            d11 = gVar2;
                            u02 = lVar;
                            q11 = list2;
                        }
                        list = q11;
                        gVar = d11;
                    }
                    f16 = e11;
                    z12 = a11;
                    i15 = i16;
                    rm.g.h(gVar);
                } else {
                    list = q11;
                    f16 = e11;
                    z12 = a11;
                    i15 = i16;
                }
                i16 = i15 + 1;
                bVar = this;
                e11 = f16;
                q11 = list;
                a11 = z12;
            }
        }
    }

    @Override // pm.g
    public void j() {
        fm.a barData = this.f80860h.getBarData();
        this.f80862j = new dm.b[barData.m()];
        for (int i11 = 0; i11 < this.f80862j.length; i11++) {
            km.a aVar = (km.a) barData.k(i11);
            this.f80862j[i11] = new dm.b(aVar.l1() * 4 * (aVar.c0() ? aVar.t() : 1), barData.m(), aVar.c0());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void n(Canvas canvas, km.a aVar, int i11) {
        rm.i d11 = this.f80860h.d(aVar.F0());
        this.f80864l.setColor(aVar.p0());
        this.f80864l.setStrokeWidth(rm.k.e(aVar.N()));
        int i12 = 0;
        boolean z11 = aVar.N() > 0.0f;
        float h11 = this.f80885b.h();
        float i13 = this.f80885b.i();
        if (this.f80860h.c()) {
            this.f80863k.setColor(aVar.a1());
            float Q = this.f80860h.getBarData().Q() / 2.0f;
            int min = Math.min((int) Math.ceil(aVar.l1() * h11), aVar.l1());
            for (int i14 = 0; i14 < min; i14++) {
                float j11 = ((BarEntry) aVar.m(i14)).j();
                RectF rectF = this.f80865m;
                rectF.left = j11 - Q;
                rectF.right = j11 + Q;
                d11.t(rectF);
                if (this.f80939a.I(this.f80865m.right)) {
                    if (!this.f80939a.J(this.f80865m.left)) {
                        break;
                    }
                    this.f80865m.top = this.f80939a.j();
                    this.f80865m.bottom = this.f80939a.f();
                    canvas.drawRect(this.f80865m, this.f80863k);
                }
            }
        }
        Canvas canvas2 = canvas;
        dm.b bVar = this.f80862j[i11];
        bVar.e(h11, i13);
        bVar.j(i11);
        bVar.k(this.f80860h.e(aVar.F0()));
        bVar.i(this.f80860h.getBarData().Q());
        bVar.a(aVar);
        d11.o(bVar.f48044b);
        boolean z12 = aVar.A0().size() == 1;
        if (z12) {
            this.f80886c.setColor(aVar.e());
        }
        while (i12 < bVar.f()) {
            int i15 = i12 + 2;
            if (this.f80939a.I(bVar.f48044b[i15])) {
                if (!this.f80939a.J(bVar.f48044b[i12])) {
                    return;
                }
                if (!z12) {
                    this.f80886c.setColor(aVar.Y0(i12 / 4));
                }
                if (aVar.R0() != null) {
                    om.a R0 = aVar.R0();
                    Paint paint = this.f80886c;
                    float[] fArr = bVar.f48044b;
                    float f11 = fArr[i12];
                    paint.setShader(new LinearGradient(f11, fArr[i12 + 3], f11, fArr[i12 + 1], R0.b(), R0.a(), Shader.TileMode.MIRROR));
                }
                if (aVar.x() != null) {
                    Paint paint2 = this.f80886c;
                    float[] fArr2 = bVar.f48044b;
                    float f12 = fArr2[i12];
                    float f13 = fArr2[i12 + 3];
                    float f14 = fArr2[i12 + 1];
                    int i16 = i12 / 4;
                    paint2.setShader(new LinearGradient(f12, f13, f12, f14, aVar.n1(i16).b(), aVar.n1(i16).a(), Shader.TileMode.MIRROR));
                }
                float[] fArr3 = bVar.f48044b;
                int i17 = i12 + 1;
                int i18 = i12 + 3;
                canvas2.drawRect(fArr3[i12], fArr3[i17], fArr3[i15], fArr3[i18], this.f80886c);
                if (z11) {
                    float[] fArr4 = bVar.f48044b;
                    canvas.drawRect(fArr4[i12], fArr4[i17], fArr4[i15], fArr4[i18], this.f80864l);
                }
            }
            i12 += 4;
            canvas2 = canvas;
        }
    }

    public void o(float f11, float f12, float f13, float f14, rm.i iVar) {
        this.f80861i.set(f11 - f14, f12, f11 + f14, f13);
        iVar.r(this.f80861i, this.f80885b.i());
    }

    public void p(im.d dVar, RectF rectF) {
        dVar.n(rectF.centerX(), rectF.top);
    }

    @Override // pm.g
    public void c(Canvas canvas) {
    }
}
