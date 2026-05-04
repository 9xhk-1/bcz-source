package pm;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.github.mikephil.charting.data.Entry;
import java.util.List;
import pm.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class p extends l {

    /* renamed from: i, reason: collision with root package name */
    public jm.h f80940i;

    /* renamed from: j, reason: collision with root package name */
    public float[] f80941j;

    public p(jm.h hVar, cm.a aVar, rm.l lVar) {
        super(aVar, lVar);
        this.f80941j = new float[2];
        this.f80940i = hVar;
    }

    @Override // pm.g
    public void b(Canvas canvas) {
        for (T t11 : this.f80940i.getScatterData().q()) {
            if (t11.isVisible()) {
                o(canvas, t11);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [com.github.mikephil.charting.data.Entry, fm.f] */
    @Override // pm.g
    public void d(Canvas canvas, im.d[] dVarArr) {
        fm.s scatterData = this.f80940i.getScatterData();
        for (im.d dVar : dVarArr) {
            km.k kVar = (km.k) scatterData.k(dVar.d());
            if (kVar != null && kVar.g0()) {
                ?? N0 = kVar.N0(dVar.h(), dVar.j());
                if (l(N0, kVar)) {
                    rm.f f11 = this.f80940i.d(kVar.F0()).f(N0.j(), N0.c() * this.f80885b.i());
                    dVar.n((float) f11.f84261c, (float) f11.f84262d);
                    n(canvas, (float) f11.f84261c, (float) f11.f84262d, kVar);
                }
            }
        }
    }

    @Override // pm.g
    public void e(Canvas canvas, String str, float f11, float f12, int i11) {
        this.f80889f.setColor(i11);
        canvas.drawText(str, f11, f12, this.f80889f);
    }

    @Override // pm.g
    public void f(Canvas canvas) {
        Entry entry;
        p pVar = this;
        if (pVar.k(pVar.f80940i)) {
            List<T> q11 = pVar.f80940i.getScatterData().q();
            int i11 = 0;
            while (i11 < pVar.f80940i.getScatterData().m()) {
                km.k kVar = (km.k) q11.get(i11);
                if (pVar.m(kVar) && kVar.l1() >= 1) {
                    pVar.a(kVar);
                    pVar.f80866g.a(pVar.f80940i, kVar);
                    rm.i d11 = pVar.f80940i.d(kVar.F0());
                    float h11 = pVar.f80885b.h();
                    float i12 = pVar.f80885b.i();
                    c.a aVar = pVar.f80866g;
                    float[] d12 = d11.d(kVar, h11, i12, aVar.f80867a, aVar.f80868b);
                    float e11 = rm.k.e(kVar.q());
                    hm.l u02 = kVar.u0();
                    rm.g d13 = rm.g.d(kVar.m1());
                    d13.f84265c = rm.k.e(d13.f84265c);
                    d13.f84266d = rm.k.e(d13.f84266d);
                    int i13 = 0;
                    while (i13 < d12.length && pVar.f80939a.J(d12[i13])) {
                        if (pVar.f80939a.I(d12[i13])) {
                            int i14 = i13 + 1;
                            if (pVar.f80939a.M(d12[i14])) {
                                int i15 = i13 / 2;
                                Entry m11 = kVar.m(pVar.f80866g.f80867a + i15);
                                if (kVar.E0()) {
                                    entry = m11;
                                    pVar.e(canvas, u02.j(m11), d12[i13], d12[i14] - e11, kVar.r(i15 + pVar.f80866g.f80867a));
                                } else {
                                    entry = m11;
                                }
                                if (entry.b() != null && kVar.L()) {
                                    Drawable b11 = entry.b();
                                    rm.k.k(canvas, b11, (int) (d12[i13] + d13.f84265c), (int) (d12[i14] + d13.f84266d), b11.getIntrinsicWidth(), b11.getIntrinsicHeight());
                                }
                            }
                        }
                        i13 += 2;
                        pVar = this;
                    }
                    rm.g.h(d13);
                }
                i11++;
                pVar = this;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [com.github.mikephil.charting.data.Entry, fm.f] */
    public void o(Canvas canvas, km.k kVar) {
        km.k kVar2 = kVar;
        if (kVar2.l1() < 1) {
            return;
        }
        rm.l lVar = this.f80939a;
        rm.i d11 = this.f80940i.d(kVar2.F0());
        float i11 = this.f80885b.i();
        qm.e Z = kVar2.Z();
        if (Z == null) {
            Log.i("MISSING", "There's no IShapeRenderer specified for ScatterDataSet");
            return;
        }
        int min = (int) Math.min(Math.ceil(kVar2.l1() * this.f80885b.h()), kVar2.l1());
        int i12 = 0;
        while (i12 < min) {
            ?? m11 = kVar2.m(i12);
            this.f80941j[0] = m11.j();
            this.f80941j[1] = m11.c() * i11;
            d11.o(this.f80941j);
            if (!lVar.J(this.f80941j[0])) {
                return;
            }
            if (lVar.I(this.f80941j[0]) && lVar.M(this.f80941j[1])) {
                this.f80886c.setColor(kVar2.Y0(i12 / 2));
                rm.l lVar2 = this.f80939a;
                float[] fArr = this.f80941j;
                Z.a(canvas, kVar2, lVar2, fArr[0], fArr[1], this.f80886c);
            }
            i12++;
            kVar2 = kVar;
        }
    }

    @Override // pm.g
    public void j() {
    }

    @Override // pm.g
    public void c(Canvas canvas) {
    }
}
