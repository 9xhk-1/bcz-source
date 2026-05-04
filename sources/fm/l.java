package fm;

import android.util.Log;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.data.Entry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class l extends c<km.b<? extends Entry>> {

    /* renamed from: j, reason: collision with root package name */
    public m f52068j;

    /* renamed from: k, reason: collision with root package name */
    public a f52069k;

    /* renamed from: l, reason: collision with root package name */
    public s f52070l;

    /* renamed from: m, reason: collision with root package name */
    public i f52071m;

    /* renamed from: n, reason: collision with root package name */
    public g f52072n;

    @Override // fm.k
    public void E() {
        m mVar = this.f52068j;
        if (mVar != null) {
            mVar.E();
        }
        a aVar = this.f52069k;
        if (aVar != null) {
            aVar.E();
        }
        i iVar = this.f52071m;
        if (iVar != null) {
            iVar.E();
        }
        s sVar = this.f52070l;
        if (sVar != null) {
            sVar.E();
        }
        g gVar = this.f52072n;
        if (gVar != null) {
            gVar.E();
        }
        d();
    }

    @Override // fm.k
    @Deprecated
    public boolean F(int i11) {
        Log.e(Chart.G, "removeDataSet(int index) not supported for CombinedData");
        return false;
    }

    @Override // fm.k
    @Deprecated
    public boolean H(float f11, int i11) {
        Log.e(Chart.G, "removeEntry(...) not supported for CombinedData");
        return false;
    }

    @Override // fm.k
    @Deprecated
    public boolean I(Entry entry, int i11) {
        Log.e(Chart.G, "removeEntry(...) not supported for CombinedData");
        return false;
    }

    public List<c> Q() {
        ArrayList arrayList = new ArrayList();
        m mVar = this.f52068j;
        if (mVar != null) {
            arrayList.add(mVar);
        }
        a aVar = this.f52069k;
        if (aVar != null) {
            arrayList.add(aVar);
        }
        s sVar = this.f52070l;
        if (sVar != null) {
            arrayList.add(sVar);
        }
        i iVar = this.f52071m;
        if (iVar != null) {
            arrayList.add(iVar);
        }
        g gVar = this.f52072n;
        if (gVar != null) {
            arrayList.add(gVar);
        }
        return arrayList;
    }

    public a R() {
        return this.f52069k;
    }

    public g S() {
        return this.f52072n;
    }

    public i T() {
        return this.f52071m;
    }

    public c U(int i11) {
        return Q().get(i11);
    }

    public int V(k kVar) {
        return Q().indexOf(kVar);
    }

    public km.b<? extends Entry> W(im.d dVar) {
        if (dVar.c() >= Q().size()) {
            return null;
        }
        c U = U(dVar.c());
        if (dVar.d() >= U.m()) {
            return null;
        }
        return (km.b) U.q().get(dVar.d());
    }

    public m X() {
        return this.f52068j;
    }

    public s Y() {
        return this.f52070l;
    }

    @Override // fm.k
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public boolean G(km.b<? extends Entry> bVar) {
        Iterator<c> it = Q().iterator();
        boolean z11 = false;
        while (it.hasNext() && !(z11 = it.next().G(bVar))) {
        }
        return z11;
    }

    public void a0(a aVar) {
        this.f52069k = aVar;
        E();
    }

    public void b0(g gVar) {
        this.f52072n = gVar;
        E();
    }

    public void c0(i iVar) {
        this.f52071m = iVar;
        E();
    }

    @Override // fm.k
    public void d() {
        if (this.f52067i == null) {
            this.f52067i = new ArrayList();
        }
        this.f52067i.clear();
        this.f52059a = -3.4028235E38f;
        this.f52060b = Float.MAX_VALUE;
        this.f52061c = -3.4028235E38f;
        this.f52062d = Float.MAX_VALUE;
        this.f52063e = -3.4028235E38f;
        this.f52064f = Float.MAX_VALUE;
        this.f52065g = -3.4028235E38f;
        this.f52066h = Float.MAX_VALUE;
        for (c cVar : Q()) {
            cVar.d();
            this.f52067i.addAll(cVar.q());
            if (cVar.z() > this.f52059a) {
                this.f52059a = cVar.z();
            }
            if (cVar.B() < this.f52060b) {
                this.f52060b = cVar.B();
            }
            if (cVar.x() > this.f52061c) {
                this.f52061c = cVar.x();
            }
            if (cVar.y() < this.f52062d) {
                this.f52062d = cVar.y();
            }
            float f11 = cVar.f52063e;
            if (f11 > this.f52063e) {
                this.f52063e = f11;
            }
            float f12 = cVar.f52064f;
            if (f12 < this.f52064f) {
                this.f52064f = f12;
            }
            float f13 = cVar.f52065g;
            if (f13 > this.f52065g) {
                this.f52065g = f13;
            }
            float f14 = cVar.f52066h;
            if (f14 < this.f52066h) {
                this.f52066h = f14;
            }
        }
    }

    public void d0(m mVar) {
        this.f52068j = mVar;
        E();
    }

    public void e0(s sVar) {
        this.f52070l = sVar;
        E();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [km.e] */
    @Override // fm.k
    public Entry s(im.d dVar) {
        if (dVar.c() >= Q().size()) {
            return null;
        }
        c U = U(dVar.c());
        if (dVar.d() >= U.m()) {
            return null;
        }
        for (Entry entry : U.k(dVar.d()).w(dVar.h())) {
            if (entry.c() == dVar.j() || Float.isNaN(dVar.j())) {
                return entry;
            }
        }
        return null;
    }
}
