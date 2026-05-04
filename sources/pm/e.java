package pm;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.data.CandleEntry;
import java.util.List;
import pm.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class e extends l {

    /* renamed from: i, reason: collision with root package name */
    public jm.d f80875i;

    /* renamed from: j, reason: collision with root package name */
    public float[] f80876j;

    /* renamed from: k, reason: collision with root package name */
    public float[] f80877k;

    /* renamed from: l, reason: collision with root package name */
    public float[] f80878l;

    /* renamed from: m, reason: collision with root package name */
    public float[] f80879m;

    /* renamed from: n, reason: collision with root package name */
    public float[] f80880n;

    public e(jm.d dVar, cm.a aVar, rm.l lVar) {
        super(aVar, lVar);
        this.f80876j = new float[8];
        this.f80877k = new float[4];
        this.f80878l = new float[4];
        this.f80879m = new float[4];
        this.f80880n = new float[4];
        this.f80875i = dVar;
    }

    @Override // pm.g
    public void b(Canvas canvas) {
        for (T t11 : this.f80875i.getCandleData().q()) {
            if (t11.isVisible()) {
                o(canvas, t11);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // pm.g
    public void d(Canvas canvas, im.d[] dVarArr) {
        fm.i candleData = this.f80875i.getCandleData();
        for (im.d dVar : dVarArr) {
            km.h hVar = (km.d) candleData.k(dVar.d());
            if (hVar != null && hVar.g0()) {
                CandleEntry candleEntry = (CandleEntry) hVar.N0(dVar.h(), dVar.j());
                if (l(candleEntry, hVar)) {
                    rm.f f11 = this.f80875i.d(hVar.F0()).f(candleEntry.j(), ((candleEntry.p() * this.f80885b.i()) + (candleEntry.o() * this.f80885b.i())) / 2.0f);
                    dVar.n((float) f11.f84261c, (float) f11.f84262d);
                    n(canvas, (float) f11.f84261c, (float) f11.f84262d, hVar);
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
        CandleEntry candleEntry;
        e eVar = this;
        if (eVar.k(eVar.f80875i)) {
            List<T> q11 = eVar.f80875i.getCandleData().q();
            int i11 = 0;
            while (i11 < q11.size()) {
                km.d dVar = (km.d) q11.get(i11);
                if (eVar.m(dVar) && dVar.l1() >= 1) {
                    eVar.a(dVar);
                    rm.i d11 = eVar.f80875i.d(dVar.F0());
                    eVar.f80866g.a(eVar.f80875i, dVar);
                    float h11 = eVar.f80885b.h();
                    float i12 = eVar.f80885b.i();
                    c.a aVar = eVar.f80866g;
                    float[] b11 = d11.b(dVar, h11, i12, aVar.f80867a, aVar.f80868b);
                    float e11 = rm.k.e(5.0f);
                    hm.l u02 = dVar.u0();
                    rm.g d12 = rm.g.d(dVar.m1());
                    d12.f84265c = rm.k.e(d12.f84265c);
                    d12.f84266d = rm.k.e(d12.f84266d);
                    int i13 = 0;
                    while (i13 < b11.length) {
                        float f11 = b11[i13];
                        float f12 = b11[i13 + 1];
                        if (!eVar.f80939a.J(f11)) {
                            break;
                        }
                        if (eVar.f80939a.I(f11) && eVar.f80939a.M(f12)) {
                            int i14 = i13 / 2;
                            CandleEntry candleEntry2 = (CandleEntry) dVar.m(eVar.f80866g.f80867a + i14);
                            if (dVar.E0()) {
                                candleEntry = candleEntry2;
                                eVar.e(canvas, u02.g(candleEntry2), f11, f12 - e11, dVar.r(i14));
                            } else {
                                candleEntry = candleEntry2;
                            }
                            if (candleEntry.b() != null && dVar.L()) {
                                Drawable b12 = candleEntry.b();
                                rm.k.k(canvas, b12, (int) (f11 + d12.f84265c), (int) (f12 + d12.f84266d), b12.getIntrinsicWidth(), b12.getIntrinsicHeight());
                            }
                        }
                        i13 += 2;
                        eVar = this;
                    }
                    rm.g.h(d12);
                }
                i11++;
                eVar = this;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void o(Canvas canvas, km.d dVar) {
        rm.i d11 = this.f80875i.d(dVar.F0());
        float i11 = this.f80885b.i();
        float U0 = dVar.U0();
        boolean C = dVar.C();
        this.f80866g.a(this.f80875i, dVar);
        this.f80886c.setStrokeWidth(dVar.M0());
        int i12 = this.f80866g.f80867a;
        while (true) {
            c.a aVar = this.f80866g;
            if (i12 > aVar.f80869c + aVar.f80867a) {
                return;
            }
            CandleEntry candleEntry = (CandleEntry) dVar.m(i12);
            if (candleEntry != null) {
                float j11 = candleEntry.j();
                float r11 = candleEntry.r();
                float n11 = candleEntry.n();
                float o11 = candleEntry.o();
                float p11 = candleEntry.p();
                if (C) {
                    float[] fArr = this.f80876j;
                    fArr[0] = j11;
                    fArr[2] = j11;
                    fArr[4] = j11;
                    fArr[6] = j11;
                    if (r11 > n11) {
                        fArr[1] = o11 * i11;
                        fArr[3] = r11 * i11;
                        fArr[5] = p11 * i11;
                        fArr[7] = n11 * i11;
                    } else if (r11 < n11) {
                        fArr[1] = o11 * i11;
                        fArr[3] = n11 * i11;
                        fArr[5] = p11 * i11;
                        fArr[7] = r11 * i11;
                    } else {
                        fArr[1] = o11 * i11;
                        float f11 = r11 * i11;
                        fArr[3] = f11;
                        fArr[5] = p11 * i11;
                        fArr[7] = f11;
                    }
                    d11.o(fArr);
                    if (!dVar.z0()) {
                        this.f80886c.setColor(dVar.j1() == 1122867 ? dVar.Y0(i12) : dVar.j1());
                    } else if (r11 > n11) {
                        this.f80886c.setColor(dVar.k0() == 1122867 ? dVar.Y0(i12) : dVar.k0());
                    } else if (r11 < n11) {
                        this.f80886c.setColor(dVar.z() == 1122867 ? dVar.Y0(i12) : dVar.z());
                    } else {
                        this.f80886c.setColor(dVar.I0() == 1122867 ? dVar.Y0(i12) : dVar.I0());
                    }
                    this.f80886c.setStyle(Paint.Style.STROKE);
                    canvas.drawLines(this.f80876j, this.f80886c);
                    float[] fArr2 = this.f80877k;
                    fArr2[0] = (j11 - 0.5f) + U0;
                    fArr2[1] = n11 * i11;
                    fArr2[2] = (j11 + 0.5f) - U0;
                    fArr2[3] = r11 * i11;
                    d11.o(fArr2);
                    if (r11 > n11) {
                        if (dVar.k0() == 1122867) {
                            this.f80886c.setColor(dVar.Y0(i12));
                        } else {
                            this.f80886c.setColor(dVar.k0());
                        }
                        this.f80886c.setStyle(dVar.S0());
                        float[] fArr3 = this.f80877k;
                        canvas.drawRect(fArr3[0], fArr3[3], fArr3[2], fArr3[1], this.f80886c);
                    } else if (r11 < n11) {
                        if (dVar.z() == 1122867) {
                            this.f80886c.setColor(dVar.Y0(i12));
                        } else {
                            this.f80886c.setColor(dVar.z());
                        }
                        this.f80886c.setStyle(dVar.S());
                        float[] fArr4 = this.f80877k;
                        canvas.drawRect(fArr4[0], fArr4[1], fArr4[2], fArr4[3], this.f80886c);
                    } else {
                        if (dVar.I0() == 1122867) {
                            this.f80886c.setColor(dVar.Y0(i12));
                        } else {
                            this.f80886c.setColor(dVar.I0());
                        }
                        float[] fArr5 = this.f80877k;
                        canvas.drawLine(fArr5[0], fArr5[1], fArr5[2], fArr5[3], this.f80886c);
                    }
                } else {
                    float[] fArr6 = this.f80878l;
                    fArr6[0] = j11;
                    fArr6[1] = o11 * i11;
                    fArr6[2] = j11;
                    fArr6[3] = p11 * i11;
                    float[] fArr7 = this.f80879m;
                    fArr7[0] = (j11 - 0.5f) + U0;
                    float f12 = r11 * i11;
                    fArr7[1] = f12;
                    fArr7[2] = j11;
                    fArr7[3] = f12;
                    float[] fArr8 = this.f80880n;
                    fArr8[0] = (j11 + 0.5f) - U0;
                    float f13 = n11 * i11;
                    fArr8[1] = f13;
                    fArr8[2] = j11;
                    fArr8[3] = f13;
                    d11.o(fArr6);
                    d11.o(this.f80879m);
                    d11.o(this.f80880n);
                    this.f80886c.setColor(r11 > n11 ? dVar.k0() == 1122867 ? dVar.Y0(i12) : dVar.k0() : r11 < n11 ? dVar.z() == 1122867 ? dVar.Y0(i12) : dVar.z() : dVar.I0() == 1122867 ? dVar.Y0(i12) : dVar.I0());
                    float[] fArr9 = this.f80878l;
                    canvas.drawLine(fArr9[0], fArr9[1], fArr9[2], fArr9[3], this.f80886c);
                    float[] fArr10 = this.f80879m;
                    canvas.drawLine(fArr10[0], fArr10[1], fArr10[2], fArr10[3], this.f80886c);
                    float[] fArr11 = this.f80880n;
                    canvas.drawLine(fArr11[0], fArr11[1], fArr11[2], fArr11[3], this.f80886c);
                }
            }
            i12++;
        }
    }

    @Override // pm.g
    public void j() {
    }

    @Override // pm.g
    public void c(Canvas canvas) {
    }
}
