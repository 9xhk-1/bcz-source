package pm;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.data.BarEntry;
import com.tencent.connect.common.Constants;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class h extends b {

    /* renamed from: n, reason: collision with root package name */
    public RectF f80890n;

    public h(jm.a aVar, cm.a aVar2, rm.l lVar) {
        super(aVar, aVar2, lVar);
        this.f80890n = new RectF();
        this.f80889f.setTextAlign(Paint.Align.LEFT);
    }

    @Override // pm.b, pm.g
    public void e(Canvas canvas, String str, float f11, float f12, int i11) {
        this.f80889f.setColor(i11);
        canvas.drawText(str, f11, f12, this.f80889f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // pm.b, pm.g
    public void f(Canvas canvas) {
        List list;
        float f11;
        rm.g gVar;
        boolean z11;
        int i11;
        float[] fArr;
        float f12;
        int i12;
        int i13;
        float f13;
        BarEntry barEntry;
        boolean z12;
        int i14;
        float f14;
        int i15;
        List list2;
        float f15;
        dm.b bVar;
        rm.g gVar2;
        h hVar = this;
        if (hVar.k(hVar.f80860h)) {
            List q11 = hVar.f80860h.getBarData().q();
            float e11 = rm.k.e(5.0f);
            boolean a11 = hVar.f80860h.a();
            int i16 = 0;
            h hVar2 = hVar;
            while (i16 < hVar2.f80860h.getBarData().m()) {
                km.a aVar = (km.a) q11.get(i16);
                if (hVar2.m(aVar)) {
                    boolean e12 = hVar2.f80860h.e(aVar.F0());
                    hVar2.a(aVar);
                    float f16 = 2.0f;
                    float a12 = rm.k.a(hVar2.f80889f, Constants.VIA_REPORT_TYPE_SHARE_TO_QQ) / 2.0f;
                    hm.l u02 = aVar.u0();
                    dm.b bVar2 = hVar2.f80862j[i16];
                    float i17 = hVar2.f80885b.i();
                    rm.g d11 = rm.g.d(aVar.m1());
                    d11.f84265c = rm.k.e(d11.f84265c);
                    d11.f84266d = rm.k.e(d11.f84266d);
                    if (aVar.c0()) {
                        list = q11;
                        f11 = e11;
                        gVar = d11;
                        rm.i d12 = hVar2.f80860h.d(aVar.F0());
                        int i18 = 0;
                        int i19 = 0;
                        while (i18 < aVar.l1() * hVar2.f80885b.h()) {
                            BarEntry barEntry2 = (BarEntry) aVar.m(i18);
                            int r11 = aVar.r(i18);
                            float[] v11 = barEntry2.v();
                            if (v11 == null) {
                                int i21 = i19 + 1;
                                if (!hVar2.f80939a.K(bVar2.f48044b[i21])) {
                                    break;
                                }
                                if (hVar2.f80939a.L(bVar2.f48044b[i19]) && hVar2.f80939a.H(bVar2.f48044b[i21])) {
                                    String d13 = u02.d(barEntry2);
                                    float d14 = rm.k.d(hVar2.f80889f, d13);
                                    float f17 = a11 ? f11 : -(d14 + f11);
                                    float f18 = a11 ? -(d14 + f11) : f11;
                                    if (e12) {
                                        f17 = (-f17) - d14;
                                        f18 = (-f18) - d14;
                                    }
                                    float f19 = f17;
                                    float f21 = f18;
                                    if (aVar.E0()) {
                                        barEntry = barEntry2;
                                        z11 = a11;
                                        fArr = v11;
                                        e(canvas, d13, bVar2.f48044b[i19 + 2] + (barEntry2.c() >= 0.0f ? f19 : f21), bVar2.f48044b[i21] + a12, r11);
                                    } else {
                                        barEntry = barEntry2;
                                        z11 = a11;
                                        fArr = v11;
                                    }
                                    if (barEntry.b() == null || !aVar.L()) {
                                        i11 = i16;
                                    } else {
                                        Drawable b11 = barEntry.b();
                                        float f22 = bVar2.f48044b[i19 + 2];
                                        if (barEntry.c() < 0.0f) {
                                            f19 = f21;
                                        }
                                        float f23 = bVar2.f48044b[i21];
                                        i11 = i16;
                                        rm.k.k(canvas, b11, (int) (f22 + f19 + gVar.f84265c), (int) (f23 + gVar.f84266d), b11.getIntrinsicWidth(), b11.getIntrinsicHeight());
                                    }
                                }
                            } else {
                                BarEntry barEntry3 = barEntry2;
                                z11 = a11;
                                i11 = i16;
                                h hVar3 = hVar2;
                                fArr = v11;
                                int length = fArr.length * 2;
                                float[] fArr2 = new float[length];
                                float f24 = -barEntry3.r();
                                float f25 = 0.0f;
                                int i22 = 0;
                                int i23 = 0;
                                while (i22 < length) {
                                    float f26 = fArr[i23];
                                    if (f26 == 0.0f && (f25 == 0.0f || f24 == 0.0f)) {
                                        float f27 = f24;
                                        f24 = f26;
                                        f13 = f27;
                                    } else if (f26 >= 0.0f) {
                                        f25 += f26;
                                        f13 = f24;
                                        f24 = f25;
                                    } else {
                                        f13 = f24 - f26;
                                    }
                                    fArr2[i22] = f24 * i17;
                                    i22 += 2;
                                    i23++;
                                    f24 = f13;
                                }
                                d12.o(fArr2);
                                int i24 = 0;
                                while (i24 < length) {
                                    float f28 = fArr[i24 / 2];
                                    BarEntry barEntry4 = barEntry3;
                                    int i25 = i24;
                                    String e13 = u02.e(f28, barEntry4);
                                    int i26 = length;
                                    float d15 = rm.k.d(hVar3.f80889f, e13);
                                    float f29 = z11 ? f11 : -(d15 + f11);
                                    float[] fArr3 = fArr2;
                                    float f31 = z11 ? -(d15 + f11) : f11;
                                    if (e12) {
                                        f29 = (-f29) - d15;
                                        f31 = (-f31) - d15;
                                    }
                                    boolean z13 = (f28 == 0.0f && f24 == 0.0f && f25 > 0.0f) || f28 < 0.0f;
                                    float f32 = fArr3[i25];
                                    if (z13) {
                                        f29 = f31;
                                    }
                                    float f33 = f32 + f29;
                                    float[] fArr4 = bVar2.f48044b;
                                    float f34 = (fArr4[i19 + 1] + fArr4[i19 + 3]) / 2.0f;
                                    if (!hVar3.f80939a.K(f34)) {
                                        break;
                                    }
                                    if (hVar3.f80939a.L(f33) && hVar3.f80939a.H(f34)) {
                                        if (aVar.E0()) {
                                            float f35 = f34 + a12;
                                            f12 = f34;
                                            h hVar4 = hVar3;
                                            i12 = i25;
                                            barEntry3 = barEntry4;
                                            hVar4.e(canvas, e13, f33, f35, r11);
                                        } else {
                                            f12 = f34;
                                            i12 = i25;
                                            barEntry3 = barEntry4;
                                        }
                                        i13 = r11;
                                        if (barEntry3.b() != null && aVar.L()) {
                                            Drawable b12 = barEntry3.b();
                                            rm.k.k(canvas, b12, (int) (f33 + gVar.f84265c), (int) (f12 + gVar.f84266d), b12.getIntrinsicWidth(), b12.getIntrinsicHeight());
                                        }
                                    } else {
                                        i13 = r11;
                                        i12 = i25;
                                        barEntry3 = barEntry4;
                                    }
                                    i24 = i12 + 2;
                                    hVar3 = this;
                                    length = i26;
                                    fArr2 = fArr3;
                                    r11 = i13;
                                }
                            }
                            i19 = fArr == null ? i19 + 4 : i19 + (fArr.length * 4);
                            i18++;
                            hVar2 = this;
                            i16 = i11;
                            a11 = z11;
                        }
                    } else {
                        int i27 = 0;
                        h hVar5 = hVar2;
                        while (i27 < bVar2.f48044b.length * hVar5.f80885b.h()) {
                            float[] fArr5 = bVar2.f48044b;
                            int i28 = i27 + 1;
                            float f36 = fArr5[i28];
                            float f37 = (fArr5[i27 + 3] + f36) / f16;
                            if (!hVar5.f80939a.K(f36)) {
                                break;
                            }
                            if (hVar5.f80939a.L(bVar2.f48044b[i27]) && hVar5.f80939a.H(bVar2.f48044b[i28])) {
                                BarEntry barEntry5 = (BarEntry) aVar.m(i27 / 4);
                                float c11 = barEntry5.c();
                                rm.g gVar3 = d11;
                                String d16 = u02.d(barEntry5);
                                float d17 = rm.k.d(hVar5.f80889f, d16);
                                f14 = f16;
                                float f38 = a11 ? e11 : -(d17 + e11);
                                float f39 = a11 ? -(d17 + e11) : e11;
                                if (e12) {
                                    f38 = (-f38) - d17;
                                    f39 = (-f39) - d17;
                                }
                                float f41 = f38;
                                float f42 = f39;
                                if (aVar.E0()) {
                                    i15 = i27;
                                    list2 = q11;
                                    bVar = bVar2;
                                    f15 = e11;
                                    gVar2 = gVar3;
                                    h hVar6 = this;
                                    hVar6.e(canvas, d16, bVar2.f48044b[i27 + 2] + (c11 >= 0.0f ? f41 : f42), f37 + a12, aVar.r(i27 / 2));
                                    hVar5 = hVar6;
                                } else {
                                    hVar5 = this;
                                    i15 = i27;
                                    list2 = q11;
                                    f15 = e11;
                                    bVar = bVar2;
                                    gVar2 = gVar3;
                                }
                                if (barEntry5.b() != null && aVar.L()) {
                                    Drawable b13 = barEntry5.b();
                                    float f43 = bVar.f48044b[i15 + 2];
                                    if (c11 >= 0.0f) {
                                        f42 = f41;
                                    }
                                    rm.k.k(canvas, b13, (int) (f43 + f42 + gVar2.f84265c), (int) (f37 + gVar2.f84266d), b13.getIntrinsicWidth(), b13.getIntrinsicHeight());
                                }
                            } else {
                                i15 = i27;
                                list2 = q11;
                                f15 = e11;
                                f14 = f16;
                                bVar = bVar2;
                                gVar2 = d11;
                            }
                            i27 = i15 + 4;
                            bVar2 = bVar;
                            d11 = gVar2;
                            f16 = f14;
                            e11 = f15;
                            q11 = list2;
                            hVar5 = hVar5;
                        }
                        list = q11;
                        f11 = e11;
                        gVar = d11;
                    }
                    z12 = a11;
                    i14 = i16;
                    rm.g.h(gVar);
                } else {
                    list = q11;
                    f11 = e11;
                    z12 = a11;
                    i14 = i16;
                }
                i16 = i14 + 1;
                hVar2 = this;
                e11 = f11;
                q11 = list;
                a11 = z12;
            }
        }
    }

    @Override // pm.b, pm.g
    public void j() {
        fm.a barData = this.f80860h.getBarData();
        this.f80862j = new dm.c[barData.m()];
        for (int i11 = 0; i11 < this.f80862j.length; i11++) {
            km.a aVar = (km.a) barData.k(i11);
            this.f80862j[i11] = new dm.c(aVar.l1() * 4 * (aVar.c0() ? aVar.t() : 1), barData.m(), aVar.c0());
        }
    }

    @Override // pm.g
    public boolean k(jm.e eVar) {
        return ((float) eVar.getData().r()) < ((float) eVar.getMaxVisibleCount()) * this.f80939a.x();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // pm.b
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
                RectF rectF = this.f80890n;
                rectF.top = j11 - Q;
                rectF.bottom = j11 + Q;
                d11.t(rectF);
                if (this.f80939a.K(this.f80890n.bottom)) {
                    if (!this.f80939a.H(this.f80890n.top)) {
                        break;
                    }
                    this.f80890n.left = this.f80939a.h();
                    this.f80890n.right = this.f80939a.i();
                    canvas.drawRect(this.f80890n, this.f80863k);
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
            int i15 = i12 + 3;
            if (!this.f80939a.K(bVar.f48044b[i15])) {
                return;
            }
            int i16 = i12 + 1;
            if (this.f80939a.H(bVar.f48044b[i16])) {
                if (!z12) {
                    this.f80886c.setColor(aVar.Y0(i12 / 4));
                }
                float[] fArr = bVar.f48044b;
                int i17 = i12 + 2;
                canvas2.drawRect(fArr[i12], fArr[i16], fArr[i17], fArr[i15], this.f80886c);
                if (z11) {
                    float[] fArr2 = bVar.f48044b;
                    canvas.drawRect(fArr2[i12], fArr2[i16], fArr2[i17], fArr2[i15], this.f80864l);
                }
            }
            i12 += 4;
            canvas2 = canvas;
        }
    }

    @Override // pm.b
    public void o(float f11, float f12, float f13, float f14, rm.i iVar) {
        this.f80861i.set(f12, f11 - f14, f13, f11 + f14);
        iVar.s(this.f80861i, this.f80885b.i());
    }

    @Override // pm.b
    public void p(im.d dVar, RectF rectF) {
        dVar.n(rectF.centerY(), rectF.right);
    }
}
