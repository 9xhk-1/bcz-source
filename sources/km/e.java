package km;

import android.graphics.DashPathEffect;
import android.graphics.Typeface;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.DataSet;
import com.github.mikephil.charting.data.Entry;
import hm.l;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public interface e<T extends Entry> {
    boolean A(int i11);

    List<Integer> A0();

    void B(boolean z11);

    void C0();

    boolean E0();

    YAxis.AxisDependency F0();

    float I();

    DashPathEffect K();

    boolean L();

    boolean L0(float f11);

    void M(Typeface typeface);

    T N0(float f11, float f12);

    void P(int i11);

    int P0();

    float Q();

    om.a R0();

    boolean T(T t11);

    float T0();

    int U(float f11, float f12, DataSet.Rounding rounding);

    void V(rm.g gVar);

    void W(l lVar);

    void Y(List<Integer> list);

    int Y0(int i11);

    float a0();

    boolean b1();

    void clear();

    T d1(float f11, float f12, DataSet.Rounding rounding);

    int e();

    void f(boolean z11);

    void g(YAxis.AxisDependency axisDependency);

    boolean g0();

    String getLabel();

    int h(T t11);

    Legend.LegendForm i();

    void i0(T t11);

    boolean isVisible();

    void j0(String str);

    int l1();

    T m(int i11);

    float m0();

    rm.g m1();

    float n();

    om.a n1(int i11);

    void o(boolean z11);

    Typeface p();

    float q0();

    int r(int i11);

    boolean removeFirst();

    boolean removeLast();

    void s(float f11);

    void setVisible(boolean z11);

    int t0(int i11);

    l u0();

    void v(float f11, float f12);

    List<T> w(float f11);

    List<om.a> x();

    boolean x0(T t11);

    boolean y0(T t11);
}
