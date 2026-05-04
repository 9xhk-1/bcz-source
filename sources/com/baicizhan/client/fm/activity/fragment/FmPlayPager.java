package com.baicizhan.client.fm.activity.fragment;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import bb.d;
import com.baicizhan.client.fm.data.FmData;
import com.baicizhan.client.fm.data.FmList;
import com.flowviewpagerindicator.FlowableViewPager;
import gi.m0;
import hb.c;
import hb.e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import xb.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class FmPlayPager extends FlowableViewPager {
    public static final int S1 = -1;
    public static final int T1 = -2;
    public static final int U1 = -3;
    public static final int V1 = 1;
    public static final int W1 = 2;
    public static final int X1 = 4;
    public static final int Y1 = 13;
    public b H1;
    public FmList I1;
    public d J1;
    public SparseArray<Integer> K1;
    public SparseArray<Integer> L1;
    public SparseArray<Integer> M1;
    public int N1;
    public int O1;
    public SparseArray<WeakReference<e>> P1;
    public boolean Q1;
    public int R1;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements FlowableViewPager.i {
        public a() {
        }

        @Override // com.flowviewpagerindicator.FlowableViewPager.i
        public void onPageScrollStateChanged(int state) {
            FmPlayPager.this.c0(state);
        }

        @Override // com.flowviewpagerindicator.FlowableViewPager.i
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            FmPlayPager.this.d0(position, positionOffset, positionOffsetPixels);
        }

        @Override // com.flowviewpagerindicator.FlowableViewPager.i
        public void onPageSelected(int position) {
            FmPlayPager.this.e0(position);
            m0.j().g();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends FragmentStatePagerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public Fragment f17424a;

        public b(FragmentManager fm2) {
            super(fm2);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            if (FmPlayPager.this.I1 == null || FmPlayPager.this.I1.isEmpty()) {
                return 0;
            }
            return FmPlayPager.this.K1.size();
        }

        @Override // androidx.fragment.app.FragmentStatePagerAdapter
        public Fragment getItem(int i11) {
            int size;
            int size2;
            int intValue = ((Integer) FmPlayPager.this.K1.get(i11)).intValue();
            Log.d("whiz", "frag cache, get item: " + intValue);
            if (intValue == -3) {
                hb.a t11 = hb.a.t();
                FmPlayPager.this.P1.put(i11, new WeakReference(t11));
                return t11;
            }
            if (intValue == -2) {
                hb.d t12 = hb.d.t(FmPlayPager.this.I1.size());
                FmPlayPager.this.P1.put(i11, new WeakReference(t12));
                return t12;
            }
            if (intValue != -1) {
                c t13 = c.t(FmPlayPager.this.I1.get(intValue));
                FmPlayPager.this.P1.put(i11, new WeakReference(t13));
                return t13;
            }
            ArrayList arrayList = new ArrayList();
            int i12 = FmPlayPager.this.j0(1) ? 13 : 12;
            int i13 = i11 / i12;
            if (i11 % i12 == 0) {
                size = (i13 - 1) * 12;
                size2 = Math.min(i13 * 12, FmPlayPager.this.I1.size());
            } else {
                size = FmPlayPager.this.I1.size() - (FmPlayPager.this.I1.size() % 12);
                size2 = FmPlayPager.this.I1.size();
            }
            for (int i14 = size; i14 < size2; i14++) {
                FmData fmData = FmPlayPager.this.I1.get(i14);
                if (fmData == null) {
                    throw new NullPointerException("null data cannot be transferred to middle fragment, i: " + i11 + "; start: " + size + "; end: " + size2 + "; index: " + i14);
                }
                arrayList.add(fmData);
            }
            hb.b t14 = hb.b.t(arrayList);
            FmPlayPager.this.P1.put(i11, new WeakReference(t14));
            return t14;
        }

        @Override // androidx.fragment.app.FragmentStatePagerAdapter, androidx.viewpager.widget.PagerAdapter
        public void setPrimaryItem(ViewGroup container, int position, Object object) {
            if (this.f17424a != object) {
                this.f17424a = (Fragment) object;
            }
            super.setPrimaryItem(container, position, object);
        }
    }

    public FmPlayPager(Context context) {
        super(context);
        this.N1 = 7;
        this.O1 = -1;
        this.P1 = new SparseArray<>();
        this.Q1 = true;
        setPageMargin(f.a(getContext(), 36.0f));
        setClipChildren(false);
        setOffscreenPageLimit(3);
    }

    public final boolean a0(boolean init, int item) {
        if (item != getCurrentItem()) {
            return init;
        }
        if (init) {
            return true;
        }
        return this.Q1;
    }

    public final void b0() {
        int size = this.P1.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.P1.valueAt(i11).clear();
        }
        this.P1.clear();
    }

    public void c0(int state) {
        Log.d("whiz", "on page changed: " + state);
    }

    public void d0(int position, float positionOffset, int positionOffsetPixels) {
        Log.d("whiz", "on page scrolled: " + position);
    }

    public void e0(int position) {
        m0(position);
        Log.d("whiz", "on page selected: " + position + "; play? " + this.Q1);
        if (!this.Q1) {
            this.Q1 = true;
            return;
        }
        if (this.J1 != null) {
            int intValue = this.K1.get(position).intValue();
            if (intValue == -3) {
                this.J1.q0();
                return;
            }
            if (intValue == -2) {
                this.J1.t0();
                return;
            }
            if (intValue != -1) {
                this.J1.o0(intValue);
                return;
            }
            SparseArray<Integer> sparseArray = this.M1;
            if (sparseArray == null || sparseArray.size() == 0) {
                h0(true);
                return;
            }
            int intValue2 = this.M1.get(position).intValue();
            this.J1.r0(intValue2);
            this.O1 = intValue2;
        }
    }

    public void f0() {
        e0(getCurrentItem());
    }

    public void g0(int index, boolean play) {
        if (index < 0 || index >= this.I1.size()) {
            qb.c.d("", "cannot move fm line, the target index is invalid [%d], valid rage is [%d, %d]", Integer.valueOf(index), 0, Integer.valueOf(this.I1.size() - 1));
            return;
        }
        int intValue = this.L1.get(index).intValue();
        this.Q1 = a0(play, intValue);
        S(intValue);
    }

    public void h0(boolean play) {
        int currentItem = getCurrentItem() + 1;
        if (currentItem <= this.H1.getCount() - 1 && currentItem >= 0) {
            this.Q1 = a0(play, currentItem);
            S(currentItem);
        } else if (currentItem > this.H1.getCount() - 1) {
            this.J1.p0();
        }
    }

    public void i0(boolean play) {
        int currentItem = getCurrentItem() - 1;
        if (currentItem > this.H1.getCount() - 1 || currentItem < 0) {
            return;
        }
        this.Q1 = a0(play, currentItem);
        S(currentItem);
    }

    public final boolean j0(int pageFlag) {
        return (this.N1 & pageFlag) == pageFlag;
    }

    public void k0() {
        this.R1 = 0;
        setAdapter(null);
        setVisibility(4);
    }

    public void l0(int index, boolean retry) {
        e eVar;
        Integer num = this.L1.get(index);
        if (num == null) {
            return;
        }
        WeakReference<e> weakReference = this.P1.get(num.intValue());
        if (weakReference != null && (eVar = weakReference.get()) != null && this.H1.f17424a == eVar && (this.H1.f17424a instanceof c)) {
            ((c) this.H1.f17424a).v(retry);
        }
    }

    public final void m0(int position) {
        e eVar;
        e eVar2;
        e eVar3;
        WeakReference<e> weakReference = this.P1.get(position);
        WeakReference<e> weakReference2 = this.P1.get(position - 1);
        WeakReference<e> weakReference3 = this.P1.get(position + 1);
        if (weakReference != null && (eVar3 = weakReference.get()) != null) {
            eVar3.setEnabled(true);
        }
        if (weakReference2 != null && (eVar2 = weakReference2.get()) != null) {
            eVar2.setEnabled(false);
        }
        if (weakReference3 == null || (eVar = weakReference3.get()) == null) {
            return;
        }
        eVar.setEnabled(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void n0(FmList fmList, List<String> list, int i11, FragmentActivity fragmentActivity) {
        int i12;
        this.N1 = i11 & this.N1;
        b0();
        this.I1 = fmList;
        int size = fmList.size() + (j0(2) ? (this.I1.size() + 12) / 12 : 0) + (j0(1) ? 1 : 0) + (j0(4) ? 1 : 0);
        if (this.I1.size() % 12 == 0) {
            size--;
        }
        this.K1 = new SparseArray<>(size);
        this.L1 = new SparseArray<>(this.I1.size());
        this.M1 = new SparseArray<>();
        int size2 = (list == null || list.isEmpty() || (i12 = this.O1) < 0) ? 0 : (i12 + 1) % list.size();
        int i13 = 0;
        int i14 = 0;
        while (i13 < size) {
            int i15 = i13 % 13;
            Object[] objArr = (j0(1) && j0(4) && (!(i13 == 0 || i15 != 0 || i13 == size + (-1)) || i13 == size + (-2))) || (j0(1) && !j0(4) && ((i13 != 0 && i15 == 0) || i13 == size + (-1))) || ((!j0(1) && j0(4) && (!(i13 == 0 || 12 != i15 || i13 == size + (-1)) || i13 == size + (-2))) || !(j0(1) || j0(4) || ((i13 == 0 || 12 != i15) && i13 != size + (-1))));
            if (j0(2) && objArr == true) {
                this.K1.put(i13, -1);
                if (list != null && !list.isEmpty()) {
                    this.M1.put(i13, Integer.valueOf(size2));
                    size2 = (size2 + 1) % list.size();
                }
            } else if (j0(4) && i13 == size - 1) {
                this.K1.put(i13, -3);
            } else if (j0(1) && i13 == 0) {
                this.K1.put(i13, -2);
            } else {
                this.K1.put(i13, Integer.valueOf(i14));
                this.L1.put(i14, Integer.valueOf(i13));
                i14++;
            }
            i13++;
        }
        Log.d("whiz", "frag cache, re adapt");
        b bVar = new b(fragmentActivity.getSupportFragmentManager());
        this.H1 = bVar;
        setAdapter(bVar);
        setVisibility(0);
    }

    @Override // com.flowviewpagerindicator.FlowableViewPager, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b0();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setOnPageChangeListener(new a());
    }

    public void setHoldFragment(d holdFragment) {
        this.J1 = holdFragment;
    }

    public FmPlayPager(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.N1 = 7;
        this.O1 = -1;
        this.P1 = new SparseArray<>();
        this.Q1 = true;
        setPageMargin(f.a(getContext(), 36.0f));
        setClipChildren(false);
        setOffscreenPageLimit(3);
    }
}
