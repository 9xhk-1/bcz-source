package tj;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.SectionIndexer;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.baicizhan.client.business.util.TimeUtil;
import com.baicizhan.client.business.widget.PinnedSectionListView;
import com.baicizhan.main.wordlist.activity.WordListFragment;
import com.baicizhan.main.wordlist.activity.WordListItem;
import com.jiongji.andriod.card.R;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class u extends BaseAdapter implements PinnedSectionListView.e, SectionIndexer {

    /* renamed from: l, reason: collision with root package name */
    public static final int f90734l = 0;

    /* renamed from: m, reason: collision with root package name */
    public static final int f90735m = 1;

    /* renamed from: n, reason: collision with root package name */
    public static final int f90736n = 1;

    /* renamed from: o, reason: collision with root package name */
    public static final int f90737o = 2;

    /* renamed from: p, reason: collision with root package name */
    public static final int f90738p = 3;

    /* renamed from: q, reason: collision with root package name */
    public static final int f90739q = 4;

    /* renamed from: r, reason: collision with root package name */
    public static final int f90740r = 5;

    /* renamed from: s, reason: collision with root package name */
    public static final int f90741s = 6;

    /* renamed from: t, reason: collision with root package name */
    public static final int f90742t = 7;

    /* renamed from: u, reason: collision with root package name */
    public static final int f90743u = 1061109567;

    /* renamed from: b, reason: collision with root package name */
    public boolean f90745b;

    /* renamed from: e, reason: collision with root package name */
    public com.chauthai.swipereveallayout.a f90748e;

    /* renamed from: f, reason: collision with root package name */
    public j f90749f;

    /* renamed from: g, reason: collision with root package name */
    public List<WordListItem> f90750g;

    /* renamed from: h, reason: collision with root package name */
    public int f90751h;

    /* renamed from: i, reason: collision with root package name */
    public int f90752i;

    /* renamed from: j, reason: collision with root package name */
    public final int f90753j;

    /* renamed from: k, reason: collision with root package name */
    public WordListFragment f90754k;

    /* renamed from: a, reason: collision with root package name */
    public final int[] f90744a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 16, 21, f90743u};

    /* renamed from: c, reason: collision with root package name */
    public Long[] f90746c = new Long[0];

    /* renamed from: d, reason: collision with root package name */
    public Integer[] f90747d = new Integer[0];

    public u(@NonNull WordListFragment fragment, List<WordListItem> items, int style, int sortBy, boolean sectionEnable, int type) {
        List list = Collections.EMPTY_LIST;
        this.f90754k = fragment;
        this.f90750g = items;
        this.f90751h = style;
        this.f90752i = sortBy;
        this.f90745b = sectionEnable;
        this.f90753j = type;
        com.chauthai.swipereveallayout.a aVar = new com.chauthai.swipereveallayout.a();
        this.f90748e = aVar;
        aVar.o(true);
        this.f90749f = new j();
        n();
    }

    @Override // com.baicizhan.client.business.widget.PinnedSectionListView.e
    public boolean a(int viewType) {
        return viewType == 0;
    }

    public void b(boolean editable) {
        this.f90749f.g(editable);
        this.f90748e.n(false);
        this.f90748e.l(editable);
    }

    public final View c(int position, View convertView) {
        c0 c0Var = (c0) convertView.getTag();
        c0Var.f90662a = position;
        c0Var.k((WordListItem) getItem(position), this.f90751h);
        return convertView;
    }

    public final View d(int position, View convertView) {
        String b11;
        int i11 = this.f90752i;
        if (i11 == 2 || 3 == i11) {
            b11 = WordListItem.b(((Long) getItem(position)).longValue());
        } else if (i11 == 5 || 4 == i11) {
            long longValue = ((Long) getItem(position)).longValue();
            int[] iArr = this.f90744a;
            int i12 = (int) longValue;
            int i13 = iArr[i12];
            int i14 = iArr[i12 + 1];
            if (i13 == 0 && i14 == 1) {
                b11 = "这些是一次都没错过的，好棒~";
            } else {
                int i15 = i14 - 1;
                if (i13 == i15) {
                    b11 = i13 + "次";
                } else if (i14 < 1061109567) {
                    b11 = i13 + "到" + i15 + "次";
                } else {
                    b11 = (i13 - 1) + "次以上";
                }
            }
        } else {
            b11 = "";
        }
        ((TextView) convertView).setText(b11);
        return convertView;
    }

    public final void e() {
        if (this.f90750g.isEmpty()) {
            return;
        }
        Iterator<WordListItem> it = this.f90750g.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                it.remove();
            }
        }
    }

    public final View f(ViewGroup parent) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate((this.f90751h & 2) > 0 ? R.layout.wordlist_item_without_theme : R.layout.wordlist_item_without_theme_colloction, parent, false);
        inflate.setTag(new c0(this, parent.getContext(), inflate));
        return inflate;
    }

    public final View g(ViewGroup parent) {
        return LayoutInflater.from(parent.getContext()).inflate(R.layout.wordlist_timestamp_sectioin, parent, false);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        if (xb.e.h(this.f90750g)) {
            return 0;
        }
        return this.f90750g.size() + (this.f90745b ? this.f90746c.length : 0);
    }

    @Override // android.widget.Adapter
    public Object getItem(int position) {
        if (!this.f90745b) {
            return this.f90750g.get(position);
        }
        int sectionForPosition = getSectionForPosition(position);
        return this.f90747d[sectionForPosition].intValue() == position ? this.f90746c[sectionForPosition] : this.f90750g.get((position - sectionForPosition) - 1);
    }

    @Override // android.widget.Adapter
    public long getItemId(int position) {
        return position;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int position) {
        if (!this.f90745b) {
            return 1;
        }
        int sectionForPosition = getSectionForPosition(position);
        if (sectionForPosition >= 0) {
            return this.f90747d[sectionForPosition].intValue() == position ? 0 : 1;
        }
        qb.c.d("WordListAdapter", "sectionIndex " + sectionForPosition, new Object[0]);
        return 1;
    }

    @Override // android.widget.SectionIndexer
    public int getPositionForSection(int sectionIndex) {
        if (this.f90745b) {
            return this.f90747d[sectionIndex].intValue();
        }
        return 0;
    }

    @Override // android.widget.SectionIndexer
    public int getSectionForPosition(int position) {
        int i11 = 0;
        while (true) {
            Integer[] numArr = this.f90747d;
            if (i11 >= numArr.length || position < numArr[i11].intValue()) {
                break;
            }
            i11++;
        }
        return i11 - 1;
    }

    @Override // android.widget.SectionIndexer
    public Object[] getSections() {
        return this.f90746c;
    }

    @Override // android.widget.Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        return getItemViewType(position) == 0 ? i(position, convertView, parent) : h(position, convertView, parent);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 2;
    }

    public final View h(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = f(parent);
        }
        View c11 = c(position, convertView);
        c0 c0Var = (c0) c11.getTag();
        this.f90748e.d(c0Var.f90664c, String.valueOf(position));
        this.f90749f.f(c0Var);
        return c11;
    }

    public final View i(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = g(parent);
        }
        return d(position, convertView);
    }

    public int j() {
        return this.f90753j;
    }

    public List<WordListItem> k() {
        return this.f90750g;
    }

    public final void l() {
        int i11 = 0;
        while (true) {
            Integer[] numArr = this.f90747d;
            if (i11 >= numArr.length) {
                break;
            }
            if (numArr[i11].intValue() != 0 && (this.f90747d[i11].intValue() - i11) - 1 < this.f90750g.size() && (this.f90747d[i11].intValue() - i11) - 1 >= 0) {
                this.f90750g.get((this.f90747d[i11].intValue() - i11) - 1).u(false);
            }
            i11++;
        }
        if (this.f90750g.isEmpty()) {
            return;
        }
        this.f90750g.get(r1.size() - 1).u(false);
    }

    public final void m(int sortBy) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (sortBy == 5) {
            int length = this.f90744a.length - 1;
            Iterator<WordListItem> it = this.f90750g.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                int j11 = it.next().j();
                boolean z11 = false;
                while (length > 0 && j11 < this.f90744a[length]) {
                    length--;
                    z11 = true;
                }
                if (z11) {
                    arrayList.add(Long.valueOf(length));
                    arrayList2.add(Integer.valueOf(i11));
                    i11++;
                }
                i11++;
            }
        } else {
            Iterator<WordListItem> it2 = this.f90750g.iterator();
            int i12 = 0;
            int i13 = 0;
            while (it2.hasNext()) {
                boolean z12 = false;
                while (it2.next().j() >= this.f90744a[i12]) {
                    i12++;
                    z12 = true;
                }
                if (z12) {
                    arrayList.add(Long.valueOf(i12 - 1));
                    arrayList2.add(Integer.valueOf(i13));
                    i13++;
                }
                i13++;
            }
        }
        Long[] lArr = new Long[arrayList.size()];
        this.f90746c = lArr;
        arrayList.toArray(lArr);
        Integer[] numArr = new Integer[arrayList2.size()];
        this.f90747d = numArr;
        arrayList2.toArray(numArr);
    }

    public final void n() {
        e();
        int i11 = this.f90752i;
        if (i11 == 2 || i11 == 3) {
            o();
        } else if (i11 == 4 || i11 == 5) {
            m(i11);
        }
        l();
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        n();
        super.notifyDataSetChanged();
    }

    public final void o() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        long j11 = TimeUtil.todayStart();
        long j12 = Long.MAX_VALUE;
        int i11 = 0;
        for (WordListItem wordListItem : this.f90750g) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(wordListItem.m());
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 1);
            calendar.set(14, 0);
            long j13 = 0;
            if (wordListItem.m() != 0 && calendar.get(1) >= 2012) {
                j13 = calendar.getTimeInMillis();
            }
            if (j13 >= j11) {
                j13 = j11;
            }
            if (j13 != j12) {
                arrayList.add(Long.valueOf(j13));
                arrayList2.add(Integer.valueOf(i11));
                i11++;
                j12 = j13;
            }
            i11++;
        }
        Long[] lArr = new Long[arrayList.size()];
        this.f90746c = lArr;
        arrayList.toArray(lArr);
        Integer[] numArr = new Integer[arrayList2.size()];
        this.f90747d = numArr;
        arrayList2.toArray(numArr);
    }

    public void p(WordListItem item) {
        if (item == null || this.f90750g.indexOf(item) == -1) {
            return;
        }
        this.f90750g.remove(item);
        this.f90748e.n(false);
        notifyDataSetChanged();
    }

    public void q(List<WordListItem> items) {
        this.f90750g = items;
        notifyDataSetChanged();
    }
}
