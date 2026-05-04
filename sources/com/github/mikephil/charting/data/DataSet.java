package com.github.mikephil.charting.data;

import com.github.mikephil.charting.data.Entry;
import fm.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public abstract class DataSet<T extends Entry> extends e<T> {

    /* renamed from: s, reason: collision with root package name */
    public List<T> f30249s;

    /* renamed from: t, reason: collision with root package name */
    public float f30250t;

    /* renamed from: u, reason: collision with root package name */
    public float f30251u;

    /* renamed from: v, reason: collision with root package name */
    public float f30252v;

    /* renamed from: w, reason: collision with root package name */
    public float f30253w;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum Rounding {
        UP,
        DOWN,
        CLOSEST
    }

    public DataSet(List<T> list, String str) {
        super(str);
        this.f30250t = -3.4028235E38f;
        this.f30251u = Float.MAX_VALUE;
        this.f30252v = -3.4028235E38f;
        this.f30253w = Float.MAX_VALUE;
        this.f30249s = list;
        if (list == null) {
            this.f30249s = new ArrayList();
        }
        C0();
    }

    @Override // km.e
    public void C0() {
        List<T> list = this.f30249s;
        if (list == null || list.isEmpty()) {
            return;
        }
        this.f30250t = -3.4028235E38f;
        this.f30251u = Float.MAX_VALUE;
        this.f30252v = -3.4028235E38f;
        this.f30253w = Float.MAX_VALUE;
        Iterator<T> it = this.f30249s.iterator();
        while (it.hasNext()) {
            I1(it.next());
        }
    }

    @Override // km.e
    public float I() {
        return this.f30253w;
    }

    public void I1(T t11) {
        if (t11 == null) {
            return;
        }
        J1(t11);
        K1(t11);
    }

    public void J1(T t11) {
        if (t11.j() < this.f30253w) {
            this.f30253w = t11.j();
        }
        if (t11.j() > this.f30252v) {
            this.f30252v = t11.j();
        }
    }

    public void K1(T t11) {
        if (t11.c() < this.f30251u) {
            this.f30251u = t11.c();
        }
        if (t11.c() > this.f30250t) {
            this.f30250t = t11.c();
        }
    }

    public abstract DataSet<T> L1();

    public void M1(DataSet dataSet) {
        super.s1(dataSet);
    }

    @Override // km.e
    public T N0(float f11, float f12) {
        return d1(f11, f12, Rounding.CLOSEST);
    }

    public List<T> N1() {
        return this.f30249s;
    }

    public void O1(List<T> list) {
        this.f30249s = list;
        u1();
    }

    public String P1() {
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DataSet, label: ");
        sb2.append(getLabel() == null ? "" : getLabel());
        sb2.append(", entries: ");
        sb2.append(this.f30249s.size());
        sb2.append("\n");
        stringBuffer.append(sb2.toString());
        return stringBuffer.toString();
    }

    @Override // km.e
    public boolean T(T t11) {
        List<T> list;
        if (t11 == null || (list = this.f30249s) == null) {
            return false;
        }
        boolean remove = list.remove(t11);
        if (remove) {
            C0();
        }
        return remove;
    }

    @Override // km.e
    public int U(float f11, float f12, Rounding rounding) {
        int i11;
        T t11;
        List<T> list = this.f30249s;
        if (list == null || list.isEmpty()) {
            return -1;
        }
        int size = this.f30249s.size() - 1;
        int i12 = 0;
        while (i12 < size) {
            int i13 = (i12 + size) / 2;
            float j11 = this.f30249s.get(i13).j() - f11;
            int i14 = i13 + 1;
            float j12 = this.f30249s.get(i14).j() - f11;
            float abs = Math.abs(j11);
            float abs2 = Math.abs(j12);
            if (abs2 >= abs) {
                if (abs >= abs2) {
                    double d11 = j11;
                    if (d11 < 0.0d) {
                        if (d11 < 0.0d) {
                        }
                    }
                }
                size = i13;
            }
            i12 = i14;
        }
        if (size != -1) {
            float j13 = this.f30249s.get(size).j();
            if (rounding == Rounding.UP) {
                if (j13 < f11 && size < this.f30249s.size() - 1) {
                    size++;
                }
            } else if (rounding == Rounding.DOWN && j13 > f11 && size > 0) {
                size--;
            }
            if (!Float.isNaN(f12)) {
                while (size > 0 && this.f30249s.get(size - 1).j() == j13) {
                    size--;
                }
                float c11 = this.f30249s.get(size).c();
                loop2: while (true) {
                    i11 = size;
                    do {
                        size++;
                        if (size >= this.f30249s.size()) {
                            break loop2;
                        }
                        t11 = this.f30249s.get(size);
                        if (t11.j() != j13) {
                            break loop2;
                        }
                    } while (Math.abs(t11.c() - f12) >= Math.abs(c11 - f12));
                    c11 = f12;
                }
                return i11;
            }
        }
        return size;
    }

    @Override // km.e
    public float a0() {
        return this.f30252v;
    }

    @Override // km.e
    public void clear() {
        this.f30249s.clear();
        u1();
    }

    @Override // km.e
    public T d1(float f11, float f12, Rounding rounding) {
        int U = U(f11, f12, rounding);
        if (U > -1) {
            return this.f30249s.get(U);
        }
        return null;
    }

    @Override // km.e
    public int h(Entry entry) {
        return this.f30249s.indexOf(entry);
    }

    @Override // km.e
    public void i0(T t11) {
        if (t11 == null) {
            return;
        }
        if (this.f30249s == null) {
            this.f30249s = new ArrayList();
        }
        I1(t11);
        if (this.f30249s.size() > 0) {
            if (this.f30249s.get(r0.size() - 1).j() > t11.j()) {
                this.f30249s.add(U(t11.j(), t11.c(), Rounding.UP), t11);
                return;
            }
        }
        this.f30249s.add(t11);
    }

    @Override // km.e
    public int l1() {
        return this.f30249s.size();
    }

    @Override // km.e
    public T m(int i11) {
        return this.f30249s.get(i11);
    }

    @Override // km.e
    public float m0() {
        return this.f30250t;
    }

    @Override // km.e
    public float q0() {
        return this.f30251u;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(P1());
        for (int i11 = 0; i11 < this.f30249s.size(); i11++) {
            stringBuffer.append(this.f30249s.get(i11).toString() + " ");
        }
        return stringBuffer.toString();
    }

    @Override // km.e
    public void v(float f11, float f12) {
        List<T> list = this.f30249s;
        if (list == null || list.isEmpty()) {
            return;
        }
        this.f30250t = -3.4028235E38f;
        this.f30251u = Float.MAX_VALUE;
        int U = U(f12, Float.NaN, Rounding.UP);
        for (int U2 = U(f11, Float.NaN, Rounding.DOWN); U2 <= U; U2++) {
            K1(this.f30249s.get(U2));
        }
    }

    @Override // km.e
    public List<T> w(float f11) {
        ArrayList arrayList = new ArrayList();
        int size = this.f30249s.size() - 1;
        int i11 = 0;
        while (true) {
            if (i11 > size) {
                break;
            }
            int i12 = (size + i11) / 2;
            T t11 = this.f30249s.get(i12);
            if (f11 == t11.j()) {
                while (i12 > 0 && this.f30249s.get(i12 - 1).j() == f11) {
                    i12--;
                }
                int size2 = this.f30249s.size();
                while (i12 < size2) {
                    T t12 = this.f30249s.get(i12);
                    if (t12.j() != f11) {
                        break;
                    }
                    arrayList.add(t12);
                    i12++;
                }
            } else if (f11 > t11.j()) {
                i11 = i12 + 1;
            } else {
                size = i12 - 1;
            }
        }
        return arrayList;
    }

    @Override // km.e
    public boolean x0(T t11) {
        if (t11 == null) {
            return false;
        }
        List<T> N1 = N1();
        if (N1 == null) {
            N1 = new ArrayList<>();
        }
        I1(t11);
        return N1.add(t11);
    }
}
