package pm;

import android.graphics.Canvas;
import android.util.Log;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.charts.CombinedChart;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class f extends g {

    /* renamed from: g, reason: collision with root package name */
    public List<g> f80881g;

    /* renamed from: h, reason: collision with root package name */
    public WeakReference<Chart> f80882h;

    /* renamed from: i, reason: collision with root package name */
    public List<im.d> f80883i;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f80884a;

        static {
            int[] iArr = new int[CombinedChart.DrawOrder.values().length];
            f80884a = iArr;
            try {
                iArr[CombinedChart.DrawOrder.BAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f80884a[CombinedChart.DrawOrder.BUBBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f80884a[CombinedChart.DrawOrder.LINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f80884a[CombinedChart.DrawOrder.CANDLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f80884a[CombinedChart.DrawOrder.SCATTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public f(CombinedChart combinedChart, cm.a aVar, rm.l lVar) {
        super(aVar, lVar);
        this.f80881g = new ArrayList(5);
        this.f80883i = new ArrayList();
        this.f80882h = new WeakReference<>(combinedChart);
        l();
    }

    @Override // pm.g
    public void b(Canvas canvas) {
        Iterator<g> it = this.f80881g.iterator();
        while (it.hasNext()) {
            it.next().b(canvas);
        }
    }

    @Override // pm.g
    public void c(Canvas canvas) {
        Iterator<g> it = this.f80881g.iterator();
        while (it.hasNext()) {
            it.next().c(canvas);
        }
    }

    @Override // pm.g
    public void d(Canvas canvas, im.d[] dVarArr) {
        Chart chart = this.f80882h.get();
        if (chart == null) {
            return;
        }
        for (g gVar : this.f80881g) {
            Object barData = gVar instanceof b ? ((b) gVar).f80860h.getBarData() : gVar instanceof j ? ((j) gVar).f80901i.getLineData() : gVar instanceof e ? ((e) gVar).f80875i.getCandleData() : gVar instanceof p ? ((p) gVar).f80940i.getScatterData() : gVar instanceof d ? ((d) gVar).f80871h.getBubbleData() : null;
            int indexOf = barData == null ? -1 : ((fm.l) chart.getData()).Q().indexOf(barData);
            this.f80883i.clear();
            for (im.d dVar : dVarArr) {
                if (dVar.c() == indexOf || dVar.c() == -1) {
                    this.f80883i.add(dVar);
                }
            }
            List<im.d> list = this.f80883i;
            gVar.d(canvas, (im.d[]) list.toArray(new im.d[list.size()]));
        }
    }

    @Override // pm.g
    public void e(Canvas canvas, String str, float f11, float f12, int i11) {
        Log.e(Chart.G, "Erroneous call to drawValue() in CombinedChartRenderer!");
    }

    @Override // pm.g
    public void f(Canvas canvas) {
        Iterator<g> it = this.f80881g.iterator();
        while (it.hasNext()) {
            it.next().f(canvas);
        }
    }

    @Override // pm.g
    public void j() {
        Iterator<g> it = this.f80881g.iterator();
        while (it.hasNext()) {
            it.next().j();
        }
    }

    public void l() {
        this.f80881g.clear();
        CombinedChart combinedChart = (CombinedChart) this.f80882h.get();
        if (combinedChart == null) {
            return;
        }
        for (CombinedChart.DrawOrder drawOrder : combinedChart.getDrawOrder()) {
            int i11 = a.f80884a[drawOrder.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 == 5 && combinedChart.getScatterData() != null) {
                                this.f80881g.add(new p(combinedChart, this.f80885b, this.f80939a));
                            }
                        } else if (combinedChart.getCandleData() != null) {
                            this.f80881g.add(new e(combinedChart, this.f80885b, this.f80939a));
                        }
                    } else if (combinedChart.getLineData() != null) {
                        this.f80881g.add(new j(combinedChart, this.f80885b, this.f80939a));
                    }
                } else if (combinedChart.getBubbleData() != null) {
                    this.f80881g.add(new d(combinedChart, this.f80885b, this.f80939a));
                }
            } else if (combinedChart.getBarData() != null) {
                this.f80881g.add(new b(combinedChart, this.f80885b, this.f80939a));
            }
        }
    }

    public g m(int i11) {
        if (i11 >= this.f80881g.size() || i11 < 0) {
            return null;
        }
        return this.f80881g.get(i11);
    }

    public List<g> n() {
        return this.f80881g;
    }

    public void o(List<g> list) {
        this.f80881g = list;
    }
}
