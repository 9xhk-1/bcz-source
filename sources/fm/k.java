package fm;

import android.graphics.Typeface;
import android.util.Log;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import km.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public abstract class k<T extends km.e<? extends Entry>> {

    /* renamed from: a, reason: collision with root package name */
    public float f52059a;

    /* renamed from: b, reason: collision with root package name */
    public float f52060b;

    /* renamed from: c, reason: collision with root package name */
    public float f52061c;

    /* renamed from: d, reason: collision with root package name */
    public float f52062d;

    /* renamed from: e, reason: collision with root package name */
    public float f52063e;

    /* renamed from: f, reason: collision with root package name */
    public float f52064f;

    /* renamed from: g, reason: collision with root package name */
    public float f52065g;

    /* renamed from: h, reason: collision with root package name */
    public float f52066h;

    /* renamed from: i, reason: collision with root package name */
    public List<T> f52067i;

    public k() {
        this.f52059a = -3.4028235E38f;
        this.f52060b = Float.MAX_VALUE;
        this.f52061c = -3.4028235E38f;
        this.f52062d = Float.MAX_VALUE;
        this.f52063e = -3.4028235E38f;
        this.f52064f = Float.MAX_VALUE;
        this.f52065g = -3.4028235E38f;
        this.f52066h = Float.MAX_VALUE;
        this.f52067i = new ArrayList();
    }

    public float A(YAxis.AxisDependency axisDependency) {
        if (axisDependency == YAxis.AxisDependency.LEFT) {
            float f11 = this.f52063e;
            return f11 == -3.4028235E38f ? this.f52065g : f11;
        }
        float f12 = this.f52065g;
        return f12 == -3.4028235E38f ? this.f52063e : f12;
    }

    public float B() {
        return this.f52060b;
    }

    public float C(YAxis.AxisDependency axisDependency) {
        if (axisDependency == YAxis.AxisDependency.LEFT) {
            float f11 = this.f52064f;
            return f11 == Float.MAX_VALUE ? this.f52066h : f11;
        }
        float f12 = this.f52066h;
        return f12 == Float.MAX_VALUE ? this.f52064f : f12;
    }

    public boolean D() {
        Iterator<T> it = this.f52067i.iterator();
        while (it.hasNext()) {
            if (!it.next().g0()) {
                return false;
            }
        }
        return true;
    }

    public void E() {
        d();
    }

    public boolean F(int i11) {
        if (i11 >= this.f52067i.size() || i11 < 0) {
            return false;
        }
        return G(this.f52067i.get(i11));
    }

    public boolean G(T t11) {
        if (t11 == null) {
            return false;
        }
        boolean remove = this.f52067i.remove(t11);
        if (remove) {
            d();
        }
        return remove;
    }

    public boolean H(float f11, int i11) {
        Entry N0;
        if (i11 < this.f52067i.size() && (N0 = this.f52067i.get(i11).N0(f11, Float.NaN)) != null) {
            return I(N0, i11);
        }
        return false;
    }

    public boolean I(Entry entry, int i11) {
        T t11;
        if (entry == null || i11 >= this.f52067i.size() || (t11 = this.f52067i.get(i11)) == null) {
            return false;
        }
        boolean T = t11.T(entry);
        if (T) {
            d();
        }
        return T;
    }

    public void J(boolean z11) {
        Iterator<T> it = this.f52067i.iterator();
        while (it.hasNext()) {
            it.next().B(z11);
        }
    }

    public void K(boolean z11) {
        Iterator<T> it = this.f52067i.iterator();
        while (it.hasNext()) {
            it.next().f(z11);
        }
    }

    public void L(hm.l lVar) {
        if (lVar == null) {
            return;
        }
        Iterator<T> it = this.f52067i.iterator();
        while (it.hasNext()) {
            it.next().W(lVar);
        }
    }

    public void M(int i11) {
        Iterator<T> it = this.f52067i.iterator();
        while (it.hasNext()) {
            it.next().P(i11);
        }
    }

    public void N(List<Integer> list) {
        Iterator<T> it = this.f52067i.iterator();
        while (it.hasNext()) {
            it.next().Y(list);
        }
    }

    public void O(float f11) {
        Iterator<T> it = this.f52067i.iterator();
        while (it.hasNext()) {
            it.next().s(f11);
        }
    }

    public void P(Typeface typeface) {
        Iterator<T> it = this.f52067i.iterator();
        while (it.hasNext()) {
            it.next().M(typeface);
        }
    }

    public void a(T t11) {
        if (t11 == null) {
            return;
        }
        f(t11);
        this.f52067i.add(t11);
    }

    public void b(Entry entry, int i11) {
        if (this.f52067i.size() <= i11 || i11 < 0) {
            Log.e("addEntry", "Cannot add Entry because dataSetIndex too high or too low.");
            return;
        }
        T t11 = this.f52067i.get(i11);
        if (t11.x0(entry)) {
            e(entry, t11.F0());
        }
    }

    public final List<T> c(T[] tArr) {
        ArrayList arrayList = new ArrayList();
        for (T t11 : tArr) {
            arrayList.add(t11);
        }
        return arrayList;
    }

    public void d() {
        List<T> list = this.f52067i;
        if (list == null) {
            return;
        }
        this.f52059a = -3.4028235E38f;
        this.f52060b = Float.MAX_VALUE;
        this.f52061c = -3.4028235E38f;
        this.f52062d = Float.MAX_VALUE;
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            f(it.next());
        }
        this.f52063e = -3.4028235E38f;
        this.f52064f = Float.MAX_VALUE;
        this.f52065g = -3.4028235E38f;
        this.f52066h = Float.MAX_VALUE;
        T t11 = t(this.f52067i);
        if (t11 != null) {
            this.f52063e = t11.m0();
            this.f52064f = t11.q0();
            for (T t12 : this.f52067i) {
                if (t12.F0() == YAxis.AxisDependency.LEFT) {
                    if (t12.q0() < this.f52064f) {
                        this.f52064f = t12.q0();
                    }
                    if (t12.m0() > this.f52063e) {
                        this.f52063e = t12.m0();
                    }
                }
            }
        }
        T u11 = u(this.f52067i);
        if (u11 != null) {
            this.f52065g = u11.m0();
            this.f52066h = u11.q0();
            for (T t13 : this.f52067i) {
                if (t13.F0() == YAxis.AxisDependency.RIGHT) {
                    if (t13.q0() < this.f52066h) {
                        this.f52066h = t13.q0();
                    }
                    if (t13.m0() > this.f52065g) {
                        this.f52065g = t13.m0();
                    }
                }
            }
        }
    }

    public void e(Entry entry, YAxis.AxisDependency axisDependency) {
        if (this.f52059a < entry.c()) {
            this.f52059a = entry.c();
        }
        if (this.f52060b > entry.c()) {
            this.f52060b = entry.c();
        }
        if (this.f52061c < entry.j()) {
            this.f52061c = entry.j();
        }
        if (this.f52062d > entry.j()) {
            this.f52062d = entry.j();
        }
        if (axisDependency == YAxis.AxisDependency.LEFT) {
            if (this.f52063e < entry.c()) {
                this.f52063e = entry.c();
            }
            if (this.f52064f > entry.c()) {
                this.f52064f = entry.c();
                return;
            }
            return;
        }
        if (this.f52065g < entry.c()) {
            this.f52065g = entry.c();
        }
        if (this.f52066h > entry.c()) {
            this.f52066h = entry.c();
        }
    }

    public void f(T t11) {
        if (this.f52059a < t11.m0()) {
            this.f52059a = t11.m0();
        }
        if (this.f52060b > t11.q0()) {
            this.f52060b = t11.q0();
        }
        if (this.f52061c < t11.a0()) {
            this.f52061c = t11.a0();
        }
        if (this.f52062d > t11.I()) {
            this.f52062d = t11.I();
        }
        if (t11.F0() == YAxis.AxisDependency.LEFT) {
            if (this.f52063e < t11.m0()) {
                this.f52063e = t11.m0();
            }
            if (this.f52064f > t11.q0()) {
                this.f52064f = t11.q0();
                return;
            }
            return;
        }
        if (this.f52065g < t11.m0()) {
            this.f52065g = t11.m0();
        }
        if (this.f52066h > t11.q0()) {
            this.f52066h = t11.q0();
        }
    }

    public void g(float f11, float f12) {
        Iterator<T> it = this.f52067i.iterator();
        while (it.hasNext()) {
            it.next().v(f11, f12);
        }
        d();
    }

    public void h() {
        List<T> list = this.f52067i;
        if (list != null) {
            list.clear();
        }
        E();
    }

    public boolean i(T t11) {
        Iterator<T> it = this.f52067i.iterator();
        while (it.hasNext()) {
            if (it.next().equals(t11)) {
                return true;
            }
        }
        return false;
    }

    public int[] j() {
        if (this.f52067i == null) {
            return null;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f52067i.size(); i12++) {
            i11 += this.f52067i.get(i12).A0().size();
        }
        int[] iArr = new int[i11];
        int i13 = 0;
        for (int i14 = 0; i14 < this.f52067i.size(); i14++) {
            Iterator<Integer> it = this.f52067i.get(i14).A0().iterator();
            while (it.hasNext()) {
                iArr[i13] = it.next().intValue();
                i13++;
            }
        }
        return iArr;
    }

    public T k(int i11) {
        List<T> list = this.f52067i;
        if (list == null || i11 < 0 || i11 >= list.size()) {
            return null;
        }
        return this.f52067i.get(i11);
    }

    public T l(String str, boolean z11) {
        int o11 = o(this.f52067i, str, z11);
        if (o11 < 0 || o11 >= this.f52067i.size()) {
            return null;
        }
        return this.f52067i.get(o11);
    }

    public int m() {
        List<T> list = this.f52067i;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public T n(Entry entry) {
        if (entry == null) {
            return null;
        }
        for (int i11 = 0; i11 < this.f52067i.size(); i11++) {
            T t11 = this.f52067i.get(i11);
            for (int i12 = 0; i12 < t11.l1(); i12++) {
                if (entry.i(t11.N0(entry.j(), entry.c()))) {
                    return t11;
                }
            }
        }
        return null;
    }

    public int o(List<T> list, String str, boolean z11) {
        int i11 = 0;
        if (z11) {
            while (i11 < list.size()) {
                if (str.equalsIgnoreCase(list.get(i11).getLabel())) {
                    return i11;
                }
                i11++;
            }
            return -1;
        }
        while (i11 < list.size()) {
            if (str.equals(list.get(i11).getLabel())) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public String[] p() {
        String[] strArr = new String[this.f52067i.size()];
        for (int i11 = 0; i11 < this.f52067i.size(); i11++) {
            strArr[i11] = this.f52067i.get(i11).getLabel();
        }
        return strArr;
    }

    public List<T> q() {
        return this.f52067i;
    }

    public int r() {
        Iterator<T> it = this.f52067i.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            i11 += it.next().l1();
        }
        return i11;
    }

    public Entry s(im.d dVar) {
        if (dVar.d() >= this.f52067i.size()) {
            return null;
        }
        return this.f52067i.get(dVar.d()).N0(dVar.h(), dVar.j());
    }

    public T t(List<T> list) {
        for (T t11 : list) {
            if (t11.F0() == YAxis.AxisDependency.LEFT) {
                return t11;
            }
        }
        return null;
    }

    public T u(List<T> list) {
        for (T t11 : list) {
            if (t11.F0() == YAxis.AxisDependency.RIGHT) {
                return t11;
            }
        }
        return null;
    }

    public int v(T t11) {
        return this.f52067i.indexOf(t11);
    }

    public T w() {
        List<T> list = this.f52067i;
        if (list == null || list.isEmpty()) {
            return null;
        }
        T t11 = this.f52067i.get(0);
        for (T t12 : this.f52067i) {
            if (t12.l1() > t11.l1()) {
                t11 = t12;
            }
        }
        return t11;
    }

    public float x() {
        return this.f52061c;
    }

    public float y() {
        return this.f52062d;
    }

    public float z() {
        return this.f52059a;
    }

    public k(T... tArr) {
        this.f52059a = -3.4028235E38f;
        this.f52060b = Float.MAX_VALUE;
        this.f52061c = -3.4028235E38f;
        this.f52062d = Float.MAX_VALUE;
        this.f52063e = -3.4028235E38f;
        this.f52064f = Float.MAX_VALUE;
        this.f52065g = -3.4028235E38f;
        this.f52066h = Float.MAX_VALUE;
        this.f52067i = c(tArr);
        E();
    }

    public k(List<T> list) {
        this.f52059a = -3.4028235E38f;
        this.f52060b = Float.MAX_VALUE;
        this.f52061c = -3.4028235E38f;
        this.f52062d = Float.MAX_VALUE;
        this.f52063e = -3.4028235E38f;
        this.f52064f = Float.MAX_VALUE;
        this.f52065g = -3.4028235E38f;
        this.f52066h = Float.MAX_VALUE;
        this.f52067i = list;
        E();
    }
}
