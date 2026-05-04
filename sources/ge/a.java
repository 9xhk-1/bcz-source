package ge;

import androidx.databinding.BindingAdapter;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.jiongji.andriod.card.R;
import fm.m;
import hm.f;
import java.util.ArrayList;
import java.util.List;
import jm.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f53631a = "ChartBindUtils";

    /* renamed from: b, reason: collision with root package name */
    public static final int f53632b = 6;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: ge.a$a, reason: collision with other inner class name */
    public class C0634a implements f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LineChart f53633a;

        public C0634a(final LineChart val$chart) {
            this.f53633a = val$chart;
        }

        @Override // hm.f
        public float a(km.f dataSet, g dataProvider) {
            return this.f53633a.getAxisLeft().w();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @BindingAdapter(requireAll = true, value = {"bindChart", "isReading"})
    public static void a(final LineChart chart, List<Integer> data, boolean isReading) {
        if (xb.e.h(data)) {
            return;
        }
        c(chart, data);
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        for (int size = data.size() > 6 ? data.size() - 6 : 0; size < data.size() - 1; size++) {
            i11++;
            arrayList.add(new Entry(i11, data.get(size).intValue()));
        }
        arrayList.add(new Entry(i11 + 1, data.get(data.size() - 1).intValue(), chart.getContext().getDrawable(isReading ? R.drawable.ic_evalueation_lreading_dot : R.drawable.ic_evalueation_listening_dot)));
        if (chart.getData() == 0 || ((m) chart.getData()).m() <= 0) {
            chart.setData(b(chart, arrayList));
        } else {
            ((LineDataSet) ((m) chart.getData()).k(0)).O1(arrayList);
            ((m) chart.getData()).E();
            chart.O();
        }
        chart.postInvalidate();
    }

    public static m b(final LineChart chart, ArrayList<Entry> values) {
        LineDataSet lineDataSet = new LineDataSet(values, null);
        lineDataSet.x2(LineDataSet.Mode.CUBIC_BEZIER);
        lineDataSet.d2(chart.getContext().getDrawable(R.drawable.fade_white));
        lineDataSet.t2(0.2f);
        lineDataSet.c1(true);
        lineDataSet.v2(false);
        lineDataSet.e2(4.0f);
        lineDataSet.r2(4.0f);
        lineDataSet.l2(-1);
        lineDataSet.w1(-1);
        lineDataSet.b2(100);
        lineDataSet.X1(false);
        lineDataSet.Y1(true);
        lineDataSet.w2(new C0634a(chart));
        m mVar = new m(lineDataSet);
        if (values.size() < 6) {
            ArrayList arrayList = new ArrayList();
            for (int i11 = 1; i11 <= 6; i11++) {
                arrayList.add(new Entry(i11, values.get(0).c()));
            }
            LineDataSet lineDataSet2 = new LineDataSet(arrayList, null);
            lineDataSet2.x2(LineDataSet.Mode.CUBIC_BEZIER);
            lineDataSet2.setVisible(false);
            lineDataSet2.f(false);
            mVar.a(lineDataSet2);
        }
        mVar.O(9.0f);
        mVar.J(false);
        return mVar;
    }

    public static void c(LineChart chart, List<Integer> data) {
        int i11 = 0;
        int i12 = Integer.MAX_VALUE;
        for (Integer num : data) {
            if (num.intValue() > i11) {
                i11 = num.intValue();
            }
            if (num.intValue() < i12) {
                i12 = num.intValue();
            }
        }
        YAxis axisLeft = chart.getAxisLeft();
        float f11 = (i11 - i12) * 0.2f;
        if (f11 == 0.0f) {
            f11 = 1000.0f;
        }
        axisLeft.c0(i11 + f11);
        axisLeft.e0(i12 - f11);
    }
}
