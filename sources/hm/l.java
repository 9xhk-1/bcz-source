package hm;

import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.BubbleEntry;
import com.github.mikephil.charting.data.CandleEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.data.RadarEntry;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public abstract class l implements e, g {
    @Override // hm.e
    @Deprecated
    public String a(float f11, em.a aVar) {
        return h(f11);
    }

    @Override // hm.g
    @Deprecated
    public String b(float f11, Entry entry, int i11, rm.l lVar) {
        return h(f11);
    }

    public String c(float f11, em.a aVar) {
        return h(f11);
    }

    public String d(BarEntry barEntry) {
        return h(barEntry.c());
    }

    public String e(float f11, BarEntry barEntry) {
        return h(f11);
    }

    public String f(BubbleEntry bubbleEntry) {
        return h(bubbleEntry.m());
    }

    public String g(CandleEntry candleEntry) {
        return h(candleEntry.o());
    }

    public String h(float f11) {
        return String.valueOf(f11);
    }

    public String i(float f11, PieEntry pieEntry) {
        return h(f11);
    }

    public String j(Entry entry) {
        return h(entry.c());
    }

    public String k(RadarEntry radarEntry) {
        return h(radarEntry.c());
    }
}
