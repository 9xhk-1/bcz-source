package pm;

import com.github.mikephil.charting.data.DataSet;
import com.github.mikephil.charting.data.Entry;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public abstract class c extends g {

    /* renamed from: g, reason: collision with root package name */
    public a f80866g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a {

        /* renamed from: a, reason: collision with root package name */
        public int f80867a;

        /* renamed from: b, reason: collision with root package name */
        public int f80868b;

        /* renamed from: c, reason: collision with root package name */
        public int f80869c;

        public a() {
        }

        public void a(jm.b bVar, km.b bVar2) {
            float max = Math.max(0.0f, Math.min(1.0f, c.this.f80885b.h()));
            float lowestVisibleX = bVar.getLowestVisibleX();
            float highestVisibleX = bVar.getHighestVisibleX();
            T d12 = bVar2.d1(lowestVisibleX, Float.NaN, DataSet.Rounding.DOWN);
            T d13 = bVar2.d1(highestVisibleX, Float.NaN, DataSet.Rounding.UP);
            this.f80867a = d12 == 0 ? 0 : bVar2.h(d12);
            this.f80868b = d13 != 0 ? bVar2.h(d13) : 0;
            this.f80869c = (int) ((r2 - this.f80867a) * max);
        }
    }

    public c(cm.a aVar, rm.l lVar) {
        super(aVar, lVar);
        this.f80866g = new a();
    }

    public boolean l(Entry entry, km.b bVar) {
        return entry != null && ((float) bVar.h(entry)) < ((float) bVar.l1()) * this.f80885b.h();
    }

    public boolean m(km.e eVar) {
        if (eVar.isVisible()) {
            return eVar.E0() || eVar.L();
        }
        return false;
    }
}
