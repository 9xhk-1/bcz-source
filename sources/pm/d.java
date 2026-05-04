package pm;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.data.BubbleEntry;
import java.util.List;
import pm.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class d extends c {

    /* renamed from: h, reason: collision with root package name */
    public jm.c f80871h;

    /* renamed from: i, reason: collision with root package name */
    public float[] f80872i;

    /* renamed from: j, reason: collision with root package name */
    public float[] f80873j;

    /* renamed from: k, reason: collision with root package name */
    public float[] f80874k;

    public d(jm.c cVar, cm.a aVar, rm.l lVar) {
        super(aVar, lVar);
        this.f80872i = new float[4];
        this.f80873j = new float[2];
        this.f80874k = new float[3];
        this.f80871h = cVar;
        this.f80886c.setStyle(Paint.Style.FILL);
        this.f80887d.setStyle(Paint.Style.STROKE);
        this.f80887d.setStrokeWidth(rm.k.e(1.5f));
    }

    @Override // pm.g
    public void b(Canvas canvas) {
        for (T t11 : this.f80871h.getBubbleData().q()) {
            if (t11.isVisible()) {
                n(canvas, t11);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // pm.g
    public void d(Canvas canvas, im.d[] dVarArr) {
        fm.g bubbleData = this.f80871h.getBubbleData();
        float i11 = this.f80885b.i();
        for (im.d dVar : dVarArr) {
            km.c cVar = (km.c) bubbleData.k(dVar.d());
            if (cVar != null && cVar.g0()) {
                BubbleEntry bubbleEntry = (BubbleEntry) cVar.N0(dVar.h(), dVar.j());
                if (bubbleEntry.c() == dVar.j() && l(bubbleEntry, cVar)) {
                    rm.i d11 = this.f80871h.d(cVar.F0());
                    float[] fArr = this.f80872i;
                    fArr[0] = 0.0f;
                    fArr[2] = 1.0f;
                    d11.o(fArr);
                    boolean E = cVar.E();
                    float[] fArr2 = this.f80872i;
                    float min = Math.min(Math.abs(this.f80939a.f() - this.f80939a.j()), Math.abs(fArr2[2] - fArr2[0]));
                    this.f80873j[0] = bubbleEntry.j();
                    this.f80873j[1] = bubbleEntry.c() * i11;
                    d11.o(this.f80873j);
                    float[] fArr3 = this.f80873j;
                    dVar.n(fArr3[0], fArr3[1]);
                    float o11 = o(bubbleEntry.m(), cVar.a(), min, E) / 2.0f;
                    if (this.f80939a.K(this.f80873j[1] + o11) && this.f80939a.H(this.f80873j[1] - o11) && this.f80939a.I(this.f80873j[0] + o11)) {
                        if (!this.f80939a.J(this.f80873j[0] - o11)) {
                            return;
                        }
                        int Y0 = cVar.Y0((int) bubbleEntry.j());
                        Color.RGBToHSV(Color.red(Y0), Color.green(Y0), Color.blue(Y0), this.f80874k);
                        float[] fArr4 = this.f80874k;
                        fArr4[2] = fArr4[2] * 0.5f;
                        this.f80887d.setColor(Color.HSVToColor(Color.alpha(Y0), this.f80874k));
                        this.f80887d.setStrokeWidth(cVar.D0());
                        float[] fArr5 = this.f80873j;
                        canvas.drawCircle(fArr5[0], fArr5[1], o11, this.f80887d);
                    }
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
        BubbleEntry bubbleEntry;
        float f11;
        d dVar = this;
        fm.g bubbleData = dVar.f80871h.getBubbleData();
        if (bubbleData != null && dVar.k(dVar.f80871h)) {
            List<T> q11 = bubbleData.q();
            float a11 = rm.k.a(dVar.f80889f, "1");
            int i11 = 0;
            while (i11 < q11.size()) {
                km.c cVar = (km.c) q11.get(i11);
                if (dVar.m(cVar) && cVar.l1() >= 1) {
                    dVar.a(cVar);
                    float max = Math.max(0.0f, Math.min(1.0f, dVar.f80885b.h()));
                    float i12 = dVar.f80885b.i();
                    dVar.f80866g.a(dVar.f80871h, cVar);
                    rm.i d11 = dVar.f80871h.d(cVar.F0());
                    c.a aVar = dVar.f80866g;
                    float[] a12 = d11.a(cVar, i12, aVar.f80867a, aVar.f80868b);
                    float f12 = max == 1.0f ? i12 : max;
                    hm.l u02 = cVar.u0();
                    rm.g d12 = rm.g.d(cVar.m1());
                    d12.f84265c = rm.k.e(d12.f84265c);
                    d12.f84266d = rm.k.e(d12.f84266d);
                    int i13 = 0;
                    while (i13 < a12.length) {
                        int i14 = i13 / 2;
                        int r11 = cVar.r(dVar.f80866g.f80867a + i14);
                        int argb = Color.argb(Math.round(255.0f * f12), Color.red(r11), Color.green(r11), Color.blue(r11));
                        float f13 = a12[i13];
                        float f14 = a12[i13 + 1];
                        if (!dVar.f80939a.J(f13)) {
                            break;
                        }
                        if (dVar.f80939a.I(f13) && dVar.f80939a.M(f14)) {
                            BubbleEntry bubbleEntry2 = (BubbleEntry) cVar.m(i14 + dVar.f80866g.f80867a);
                            if (cVar.E0()) {
                                f11 = f14;
                                bubbleEntry = bubbleEntry2;
                                dVar.e(canvas, u02.f(bubbleEntry2), f13, f14 + (0.5f * a11), argb);
                            } else {
                                bubbleEntry = bubbleEntry2;
                                f11 = f14;
                            }
                            if (bubbleEntry.b() != null && cVar.L()) {
                                Drawable b11 = bubbleEntry.b();
                                rm.k.k(canvas, b11, (int) (f13 + d12.f84265c), (int) (f11 + d12.f84266d), b11.getIntrinsicWidth(), b11.getIntrinsicHeight());
                            }
                        }
                        i13 += 2;
                        dVar = this;
                    }
                    rm.g.h(d12);
                }
                i11++;
                dVar = this;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void n(Canvas canvas, km.c cVar) {
        if (cVar.l1() < 1) {
            return;
        }
        rm.i d11 = this.f80871h.d(cVar.F0());
        float i11 = this.f80885b.i();
        this.f80866g.a(this.f80871h, cVar);
        float[] fArr = this.f80872i;
        fArr[0] = 0.0f;
        fArr[2] = 1.0f;
        d11.o(fArr);
        boolean E = cVar.E();
        float[] fArr2 = this.f80872i;
        float min = Math.min(Math.abs(this.f80939a.f() - this.f80939a.j()), Math.abs(fArr2[2] - fArr2[0]));
        int i12 = this.f80866g.f80867a;
        while (true) {
            c.a aVar = this.f80866g;
            if (i12 > aVar.f80869c + aVar.f80867a) {
                return;
            }
            BubbleEntry bubbleEntry = (BubbleEntry) cVar.m(i12);
            this.f80873j[0] = bubbleEntry.j();
            this.f80873j[1] = bubbleEntry.c() * i11;
            d11.o(this.f80873j);
            float o11 = o(bubbleEntry.m(), cVar.a(), min, E) / 2.0f;
            if (this.f80939a.K(this.f80873j[1] + o11) && this.f80939a.H(this.f80873j[1] - o11) && this.f80939a.I(this.f80873j[0] + o11)) {
                if (!this.f80939a.J(this.f80873j[0] - o11)) {
                    return;
                }
                this.f80886c.setColor(cVar.Y0((int) bubbleEntry.j()));
                float[] fArr3 = this.f80873j;
                canvas.drawCircle(fArr3[0], fArr3[1], o11, this.f80886c);
            }
            i12++;
        }
    }

    public float o(float f11, float f12, float f13, boolean z11) {
        if (z11) {
            f11 = f12 == 0.0f ? 1.0f : (float) Math.sqrt(f11 / f12);
        }
        return f13 * f11;
    }

    @Override // pm.g
    public void j() {
    }

    @Override // pm.g
    public void c(Canvas canvas) {
    }
}
