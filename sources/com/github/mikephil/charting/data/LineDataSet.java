package com.github.mikephil.charting.data;

import android.content.Context;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.util.Log;
import com.jiongji.andriod.card.R;
import fm.n;
import hm.c;
import java.util.ArrayList;
import java.util.List;
import km.f;
import rm.a;
import rm.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class LineDataSet extends n<Entry> implements f {
    public Mode H;
    public List<Integer> I;
    public int J;
    public float K;
    public float L;
    public float M;
    public DashPathEffect N;
    public hm.f O;
    public boolean P;
    public boolean Q;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum Mode {
        LINEAR,
        STEPPED,
        CUBIC_BEZIER,
        HORIZONTAL_BEZIER
    }

    public LineDataSet(List<Entry> list, String str) {
        super(list, str);
        this.H = Mode.LINEAR;
        this.I = null;
        this.J = -1;
        this.K = 8.0f;
        this.L = 4.0f;
        this.M = 0.2f;
        this.N = null;
        this.O = new c();
        this.P = true;
        this.Q = true;
        if (this.I == null) {
            this.I = new ArrayList();
        }
        this.I.clear();
        this.I.add(Integer.valueOf(Color.rgb(140, R.styleable.Theme_drawable_tab_lecture_new, 255)));
    }

    @Override // km.f
    public int F() {
        return this.I.size();
    }

    @Override // km.f
    @Deprecated
    public boolean G0() {
        return this.H == Mode.STEPPED;
    }

    @Override // km.f
    public hm.f J() {
        return this.O;
    }

    @Override // com.github.mikephil.charting.data.DataSet
    public DataSet<Entry> L1() {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < this.f30249s.size(); i11++) {
            arrayList.add(((Entry) this.f30249s.get(i11)).h());
        }
        LineDataSet lineDataSet = new LineDataSet(arrayList, getLabel());
        f2(lineDataSet);
        return lineDataSet;
    }

    @Override // km.f
    public DashPathEffect O() {
        return this.N;
    }

    @Override // km.f
    public float V0() {
        return this.K;
    }

    @Override // km.f
    @Deprecated
    public boolean c() {
        return this.H == Mode.CUBIC_BEZIER;
    }

    @Override // km.f
    public boolean d() {
        return this.N != null;
    }

    @Override // km.f
    public int e0(int i11) {
        return this.I.get(i11).intValue();
    }

    @Override // km.f
    public boolean f0() {
        return this.P;
    }

    public void f2(LineDataSet lineDataSet) {
        super.a2(lineDataSet);
        lineDataSet.I = this.I;
        lineDataSet.J = this.J;
        lineDataSet.L = this.L;
        lineDataSet.K = this.K;
        lineDataSet.M = this.M;
        lineDataSet.N = this.N;
        lineDataSet.Q = this.Q;
        lineDataSet.P = this.Q;
        lineDataSet.O = this.O;
        lineDataSet.H = this.H;
    }

    public void g2() {
        this.N = null;
    }

    @Override // km.f
    public Mode getMode() {
        return this.H;
    }

    @Override // km.f
    public float h0() {
        return this.L;
    }

    public void h2(float f11, float f12, float f13) {
        this.N = new DashPathEffect(new float[]{f11, f12}, f13);
    }

    public List<Integer> i2() {
        return this.I;
    }

    @Override // km.f
    public int j() {
        return this.J;
    }

    @Deprecated
    public float j2() {
        return V0();
    }

    public void k2() {
        if (this.I == null) {
            this.I = new ArrayList();
        }
        this.I.clear();
    }

    public void l2(int i11) {
        k2();
        this.I.add(Integer.valueOf(i11));
    }

    public void m2(List<Integer> list) {
        this.I = list;
    }

    public void n2(int... iArr) {
        this.I = a.c(iArr);
    }

    public void o2(int[] iArr, Context context) {
        List<Integer> list = this.I;
        if (list == null) {
            list = new ArrayList<>();
        }
        list.clear();
        for (int i11 : iArr) {
            list.add(Integer.valueOf(context.getResources().getColor(i11)));
        }
        this.I = list;
    }

    public void p2(int i11) {
        this.J = i11;
    }

    @Override // km.f
    public boolean q1() {
        return this.Q;
    }

    public void q2(float f11) {
        if (f11 >= 0.5f) {
            this.L = k.e(f11);
        } else {
            Log.e("LineDataSet", "Circle radius cannot be < 0.5");
        }
    }

    public void r2(float f11) {
        if (f11 >= 1.0f) {
            this.K = k.e(f11);
        } else {
            Log.e("LineDataSet", "Circle radius cannot be < 1");
        }
    }

    @Override // km.f
    public float s0() {
        return this.M;
    }

    @Deprecated
    public void s2(float f11) {
        r2(f11);
    }

    public void t2(float f11) {
        if (f11 > 1.0f) {
            f11 = 1.0f;
        }
        if (f11 < 0.05f) {
            f11 = 0.05f;
        }
        this.M = f11;
    }

    public void u2(boolean z11) {
        this.Q = z11;
    }

    public void v2(boolean z11) {
        this.P = z11;
    }

    public void w2(hm.f fVar) {
        if (fVar == null) {
            this.O = new c();
        } else {
            this.O = fVar;
        }
    }

    public void x2(Mode mode) {
        this.H = mode;
    }
}
