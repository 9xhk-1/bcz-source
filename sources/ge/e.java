package ge;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.baicizhan.client.business.util.Fonts;
import com.baicizhan.client.business.webview.BczWebHelperKt;
import com.baicizhan.main.activity.myevaluationd.MyMarkerView;
import com.baicizhan.main.activity.mytab.MyTabFragment;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.XAxis;
import com.jiongji.andriod.card.R;
import gs.l9;
import hm.l;
import ma.t;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class e extends Fragment {

    /* renamed from: c, reason: collision with root package name */
    public static final String f53651c = "MyTabFragment";

    /* renamed from: a, reason: collision with root package name */
    public d f53652a;

    /* renamed from: b, reason: collision with root package name */
    public l9 f53653b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends l {
        public a() {
        }

        @Override // hm.l
        public String c(float value, em.a axis) {
            return value == 1.0f ? e.this.getString(R.string.evaluation_first_week) : String.valueOf((int) value);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements Observer<Void> {
        public b() {
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(@Nullable Void aVoid) {
            BczWebHelperKt.startReadTest(e.this.getActivity(), "oldmine");
            ma.l.a(t.f73013l, ma.a.f72867x0);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements Observer<Void> {
        public c() {
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(@Nullable Void aVoid) {
            BczWebHelperKt.startListenerTest(e.this.getActivity(), "oldmine");
            ma.l.a(t.f73013l, ma.a.f72874y0);
        }
    }

    private void v() {
        this.f53652a.f53646g.observe(this, new b());
        this.f53652a.f53647h.observe(this, new c());
    }

    private void x() {
        this.f53652a = (d) new ViewModelProvider(this).get(d.class);
    }

    public static final MyTabFragment y() {
        return new MyTabFragment();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        x();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        w(inflater);
        v();
        return this.f53653b.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f53652a.start();
    }

    public final void t(LineChart chart) {
        chart.getDescription().g(false);
        chart.setTouchEnabled(true);
        chart.setDrawGridBackground(false);
        chart.getAxisLeft().g(false);
        chart.getAxisRight().g(false);
        chart.getLegend().g(false);
        chart.setBackground(getResources().getDrawable(R.drawable.background_evaluation_chart));
        MyMarkerView myMarkerView = new MyMarkerView(getContext(), R.layout.custom_marker_view);
        myMarkerView.setChartView(chart);
        chart.setMarker(myMarkerView);
        XAxis xAxis = chart.getXAxis();
        xAxis.A0(XAxis.XAxisPosition.BOTTOM);
        xAxis.l0(1.0f);
        xAxis.j0(true);
        xAxis.g0(false);
        xAxis.h0(false);
        xAxis.r0(6, true);
        xAxis.h(getResources().getColor(R.color.main_color_white));
        xAxis.u0(new a());
        chart.setDragEnabled(false);
        chart.setScaleEnabled(false);
        chart.setPinchZoom(true);
    }

    public final void w(LayoutInflater inflater) {
        l9 e11 = l9.e(inflater);
        this.f53653b = e11;
        e11.j(this.f53652a);
        this.f53653b.setLifecycleOwner(this);
        l9 l9Var = this.f53653b;
        Fonts.setSafeFace(R.font.din_black_italic, l9Var.f55733b.f56018g, l9Var.f55732a.f56018g);
        t(this.f53653b.f55732a.f56012a);
        t(this.f53653b.f55733b.f56012a);
    }
}
