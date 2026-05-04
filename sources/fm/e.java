package fm;

import android.content.Context;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Typeface;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.jiongji.andriod.card.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public abstract class e<T extends Entry> implements km.e<T> {

    /* renamed from: a, reason: collision with root package name */
    public List<Integer> f52036a;

    /* renamed from: b, reason: collision with root package name */
    public om.a f52037b;

    /* renamed from: c, reason: collision with root package name */
    public List<om.a> f52038c;

    /* renamed from: d, reason: collision with root package name */
    public List<Integer> f52039d;

    /* renamed from: e, reason: collision with root package name */
    public String f52040e;

    /* renamed from: f, reason: collision with root package name */
    public YAxis.AxisDependency f52041f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f52042g;

    /* renamed from: h, reason: collision with root package name */
    public transient hm.l f52043h;

    /* renamed from: i, reason: collision with root package name */
    public Typeface f52044i;

    /* renamed from: j, reason: collision with root package name */
    public Legend.LegendForm f52045j;

    /* renamed from: k, reason: collision with root package name */
    public float f52046k;

    /* renamed from: l, reason: collision with root package name */
    public float f52047l;

    /* renamed from: m, reason: collision with root package name */
    public DashPathEffect f52048m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f52049n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f52050o;

    /* renamed from: p, reason: collision with root package name */
    public rm.g f52051p;

    /* renamed from: q, reason: collision with root package name */
    public float f52052q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f52053r;

    public e() {
        this.f52036a = null;
        this.f52037b = null;
        this.f52038c = null;
        this.f52039d = null;
        this.f52040e = "DataSet";
        this.f52041f = YAxis.AxisDependency.LEFT;
        this.f52042g = true;
        this.f52045j = Legend.LegendForm.DEFAULT;
        this.f52046k = Float.NaN;
        this.f52047l = Float.NaN;
        this.f52048m = null;
        this.f52049n = true;
        this.f52050o = true;
        this.f52051p = new rm.g();
        this.f52052q = 17.0f;
        this.f52053r = true;
        this.f52036a = new ArrayList();
        this.f52039d = new ArrayList();
        this.f52036a.add(Integer.valueOf(Color.rgb(140, R.styleable.Theme_drawable_tab_lecture_new, 255)));
        this.f52039d.add(-16777216);
    }

    @Override // km.e
    public boolean A(int i11) {
        return T(m(i11));
    }

    @Override // km.e
    public List<Integer> A0() {
        return this.f52036a;
    }

    public void A1(int[] iArr, int i11) {
        v1();
        for (int i12 : iArr) {
            r1(Color.argb(i11, Color.red(i12), Color.green(i12), Color.blue(i12)));
        }
    }

    @Override // km.e
    public void B(boolean z11) {
        this.f52049n = z11;
    }

    public void B1(int[] iArr, Context context) {
        if (this.f52036a == null) {
            this.f52036a = new ArrayList();
        }
        this.f52036a.clear();
        for (int i11 : iArr) {
            this.f52036a.add(Integer.valueOf(context.getResources().getColor(i11)));
        }
    }

    public void C1(Legend.LegendForm legendForm) {
        this.f52045j = legendForm;
    }

    public void D1(DashPathEffect dashPathEffect) {
        this.f52048m = dashPathEffect;
    }

    @Override // km.e
    public boolean E0() {
        return this.f52049n;
    }

    public void E1(float f11) {
        this.f52047l = f11;
    }

    @Override // km.e
    public YAxis.AxisDependency F0() {
        return this.f52041f;
    }

    public void F1(float f11) {
        this.f52046k = f11;
    }

    public void G1(int i11, int i12) {
        this.f52037b = new om.a(i11, i12);
    }

    public void H1(List<om.a> list) {
        this.f52038c = list;
    }

    @Override // km.e
    public DashPathEffect K() {
        return this.f52048m;
    }

    @Override // km.e
    public boolean L() {
        return this.f52050o;
    }

    @Override // km.e
    public boolean L0(float f11) {
        return T(N0(f11, Float.NaN));
    }

    @Override // km.e
    public void M(Typeface typeface) {
        this.f52044i = typeface;
    }

    @Override // km.e
    public void P(int i11) {
        this.f52039d.clear();
        this.f52039d.add(Integer.valueOf(i11));
    }

    @Override // km.e
    public int P0() {
        return this.f52039d.get(0).intValue();
    }

    @Override // km.e
    public float Q() {
        return this.f52047l;
    }

    @Override // km.e
    public om.a R0() {
        return this.f52037b;
    }

    @Override // km.e
    public float T0() {
        return this.f52052q;
    }

    @Override // km.e
    public void V(rm.g gVar) {
        rm.g gVar2 = this.f52051p;
        gVar2.f84265c = gVar.f84265c;
        gVar2.f84266d = gVar.f84266d;
    }

    @Override // km.e
    public void W(hm.l lVar) {
        if (lVar == null) {
            return;
        }
        this.f52043h = lVar;
    }

    @Override // km.e
    public void Y(List<Integer> list) {
        this.f52039d = list;
    }

    @Override // km.e
    public int Y0(int i11) {
        List<Integer> list = this.f52036a;
        return list.get(i11 % list.size()).intValue();
    }

    @Override // km.e
    public boolean b1() {
        return this.f52043h == null;
    }

    @Override // km.e
    public int e() {
        return this.f52036a.get(0).intValue();
    }

    @Override // km.e
    public void f(boolean z11) {
        this.f52042g = z11;
    }

    @Override // km.e
    public void g(YAxis.AxisDependency axisDependency) {
        this.f52041f = axisDependency;
    }

    @Override // km.e
    public boolean g0() {
        return this.f52042g;
    }

    @Override // km.e
    public String getLabel() {
        return this.f52040e;
    }

    @Override // km.e
    public Legend.LegendForm i() {
        return this.f52045j;
    }

    @Override // km.e
    public boolean isVisible() {
        return this.f52053r;
    }

    @Override // km.e
    public void j0(String str) {
        this.f52040e = str;
    }

    @Override // km.e
    public rm.g m1() {
        return this.f52051p;
    }

    @Override // km.e
    public float n() {
        return this.f52046k;
    }

    @Override // km.e
    public om.a n1(int i11) {
        List<om.a> list = this.f52038c;
        return list.get(i11 % list.size());
    }

    @Override // km.e
    public void o(boolean z11) {
        this.f52050o = z11;
    }

    @Override // km.e
    public Typeface p() {
        return this.f52044i;
    }

    @Override // km.e
    public int r(int i11) {
        List<Integer> list = this.f52039d;
        return list.get(i11 % list.size()).intValue();
    }

    public void r1(int i11) {
        if (this.f52036a == null) {
            this.f52036a = new ArrayList();
        }
        this.f52036a.add(Integer.valueOf(i11));
    }

    @Override // km.e
    public boolean removeFirst() {
        if (l1() > 0) {
            return T(m(0));
        }
        return false;
    }

    @Override // km.e
    public boolean removeLast() {
        if (l1() > 0) {
            return T(m(l1() - 1));
        }
        return false;
    }

    @Override // km.e
    public void s(float f11) {
        this.f52052q = rm.k.e(f11);
    }

    public void s1(e eVar) {
        eVar.f52041f = this.f52041f;
        eVar.f52036a = this.f52036a;
        eVar.f52050o = this.f52050o;
        eVar.f52049n = this.f52049n;
        eVar.f52045j = this.f52045j;
        eVar.f52048m = this.f52048m;
        eVar.f52047l = this.f52047l;
        eVar.f52046k = this.f52046k;
        eVar.f52037b = this.f52037b;
        eVar.f52038c = this.f52038c;
        eVar.f52042g = this.f52042g;
        eVar.f52051p = this.f52051p;
        eVar.f52039d = this.f52039d;
        eVar.f52043h = this.f52043h;
        eVar.f52039d = this.f52039d;
        eVar.f52052q = this.f52052q;
        eVar.f52053r = this.f52053r;
    }

    @Override // km.e
    public void setVisible(boolean z11) {
        this.f52053r = z11;
    }

    @Override // km.e
    public int t0(int i11) {
        for (int i12 = 0; i12 < l1(); i12++) {
            if (i11 == m(i12).j()) {
                return i12;
            }
        }
        return -1;
    }

    public List<Integer> t1() {
        return this.f52039d;
    }

    @Override // km.e
    public hm.l u0() {
        return b1() ? rm.k.s() : this.f52043h;
    }

    public void u1() {
        C0();
    }

    public void v1() {
        if (this.f52036a == null) {
            this.f52036a = new ArrayList();
        }
        this.f52036a.clear();
    }

    public void w1(int i11) {
        v1();
        this.f52036a.add(Integer.valueOf(i11));
    }

    @Override // km.e
    public List<om.a> x() {
        return this.f52038c;
    }

    public void x1(int i11, int i12) {
        w1(Color.argb(i12, Color.red(i11), Color.green(i11), Color.blue(i11)));
    }

    @Override // km.e
    public boolean y0(T t11) {
        for (int i11 = 0; i11 < l1(); i11++) {
            if (m(i11).equals(t11)) {
                return true;
            }
        }
        return false;
    }

    public void y1(List<Integer> list) {
        this.f52036a = list;
    }

    public void z1(int... iArr) {
        this.f52036a = rm.a.c(iArr);
    }

    public e(String str) {
        this();
        this.f52040e = str;
    }
}
