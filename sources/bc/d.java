package bc;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.baicizhan.client.business.widget.LockableViewPager;
import com.baicizhan.client.friend.model.SocialNetwork;
import com.baicizhan.client.friend.model.UIState;
import com.baicizhan.online.bs_socials.BBFriendRankInfo;
import com.baicizhan.online.bs_socials.BBRankResult;
import com.jiongji.andriod.card.R;
import java.lang.ref.WeakReference;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import va.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class d extends Fragment implements View.OnClickListener {

    /* renamed from: l, reason: collision with root package name */
    public static final String f6713l = "FriendWeekFragment";

    /* renamed from: m, reason: collision with root package name */
    public static final String f6714m = "extra_position";

    /* renamed from: n, reason: collision with root package name */
    public static final DateFormat f6715n = new SimpleDateFormat("MM月dd日", Locale.CHINA);

    /* renamed from: a, reason: collision with root package name */
    public View f6716a;

    /* renamed from: b, reason: collision with root package name */
    public View f6717b;

    /* renamed from: c, reason: collision with root package name */
    public TextView f6718c;

    /* renamed from: d, reason: collision with root package name */
    public TextView f6719d;

    /* renamed from: e, reason: collision with root package name */
    public LockableViewPager f6720e;

    /* renamed from: f, reason: collision with root package name */
    public View f6721f;

    /* renamed from: g, reason: collision with root package name */
    public View f6722g;

    /* renamed from: j, reason: collision with root package name */
    public int f6725j;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList<BBFriendRankInfo> f6723h = new ArrayList<>();

    /* renamed from: i, reason: collision with root package name */
    public ArrayList<BBFriendRankInfo> f6724i = new ArrayList<>();

    /* renamed from: k, reason: collision with root package name */
    public ViewPager.OnPageChangeListener f6726k = new a();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6728a;

        static {
            int[] iArr = new int[UIState.values().length];
            f6728a = iArr;
            try {
                iArr[UIState.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6728a[UIState.COMPLETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6728a[UIState.EMPTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6728a[UIState.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c implements SocialNetwork.Listener<BBRankResult> {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<d> f6729a;

        public c(d fragment) {
            this.f6729a = new WeakReference<>(fragment);
        }

        @Override // com.baicizhan.client.friend.model.SocialNetwork.Listener
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(BBRankResult res) {
            d dVar = this.f6729a.get();
            if (dVar == null || dVar.getActivity() == null) {
                return;
            }
            dVar.f6723h = new ArrayList(res.getLast_week_rank());
            dVar.f6724i = new ArrayList(res.getCurrent_week_rank());
            dVar.H(res.getCurrent_week_rankSize() > 0 ? UIState.COMPLETE : UIState.EMPTY);
        }

        @Override // com.baicizhan.client.friend.model.SocialNetwork.Listener
        public void onError(Exception e11) {
            d dVar = this.f6729a.get();
            if (dVar == null || dVar.getActivity() == null) {
                return;
            }
            dVar.H(UIState.ERROR);
            qb.c.c("", "fetch rank failed.", e11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: bc.d$d, reason: collision with other inner class name */
    public class C0115d extends FragmentPagerAdapter {

        /* renamed from: b, reason: collision with root package name */
        public static final int f6730b = 2;

        public C0115d(FragmentManager fm2) {
            super(fm2);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return 2;
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public Fragment getItem(int position) {
            return e.t(position == 0 ? d.this.f6723h : d.this.f6724i);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e extends Fragment {

        /* renamed from: d, reason: collision with root package name */
        public static final String f6732d = "PAGE_INDEX";

        /* renamed from: a, reason: collision with root package name */
        public ArrayList<BBFriendRankInfo> f6733a;

        /* renamed from: b, reason: collision with root package name */
        public ac.d f6734b;

        /* renamed from: c, reason: collision with root package name */
        public RecyclerView f6735c;

        public static e t(ArrayList<BBFriendRankInfo> rank) {
            e eVar = new e();
            Bundle bundle = new Bundle();
            bundle.putSerializable(f6732d, rank);
            eVar.setArguments(bundle);
            return eVar;
        }

        @Override // androidx.fragment.app.Fragment
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            this.f6733a = getArguments() != null ? (ArrayList) getArguments().getSerializable(f6732d) : new ArrayList<>();
        }

        @Override // androidx.fragment.app.Fragment
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View inflate = inflater.inflate(R.layout.friend_week_page_fragment, container, false);
            RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.rank_list);
            this.f6735c = recyclerView;
            recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
            eu.a aVar = new eu.a(getActivity());
            aVar.d(new ColorDrawable(-3029578));
            this.f6735c.addItemDecoration(aVar);
            ac.d dVar = new ac.d(getActivity(), this.f6733a);
            this.f6734b = dVar;
            this.f6735c.setAdapter(dVar);
            this.f6734b.d();
            return inflate;
        }

        @Override // androidx.fragment.app.Fragment
        public void onDestroyView() {
            super.onDestroyView();
        }
    }

    private void F() {
        H(UIState.LOADING);
        SocialNetwork.fetchRank(f6713l, new c(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H(UIState state) {
        int i11 = b.f6728a[state.ordinal()];
        if (i11 == 1) {
            this.f6721f.setVisibility(G() ? 0 : 8);
            this.f6720e.setVisibility(G() ? 4 : 0);
            this.f6722g.setVisibility(8);
            this.f6716a.setEnabled(false);
            this.f6717b.setEnabled(false);
            return;
        }
        if (i11 == 2) {
            this.f6721f.setVisibility(8);
            this.f6720e.setVisibility(0);
            this.f6722g.setVisibility(8);
            this.f6716a.setEnabled(this.f6725j != 0);
            this.f6717b.setEnabled(this.f6725j == 0);
            this.f6720e.setAdapter(new C0115d(getChildFragmentManager()));
            this.f6720e.setCurrentItem(this.f6725j);
            D(this.f6725j);
            C(this.f6720e, -1, -1);
            return;
        }
        if (i11 == 3) {
            this.f6721f.setVisibility(8);
            this.f6720e.setVisibility(4);
            this.f6722g.setVisibility(0);
            this.f6716a.setEnabled(false);
            this.f6717b.setEnabled(false);
            return;
        }
        if (i11 != 4) {
            return;
        }
        this.f6721f.setVisibility(8);
        this.f6720e.setVisibility(4);
        this.f6722g.setVisibility(8);
        this.f6716a.setEnabled(false);
        this.f6717b.setEnabled(false);
        g.i("请在稳定的网络环境下重试", 0);
    }

    public final void C(View view, int width, int height) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams.width == width && layoutParams.height == height) {
            return;
        }
        layoutParams.width = width;
        layoutParams.height = height;
        view.setLayoutParams(layoutParams);
    }

    public final void D(int position) {
        this.f6725j = position;
        this.f6718c.setText(position == 0 ? R.string.friend_last_week : R.string.friend_this_week);
        this.f6719d.setText(E((position - this.f6720e.getAdapter().getCount()) + 1));
    }

    public final CharSequence E(int diffWeek) {
        Calendar calendar = Calendar.getInstance();
        calendar.setFirstDayOfWeek(2);
        calendar.add(5, diffWeek * 7);
        int i11 = calendar.get(7);
        if (i11 >= 2) {
            calendar.add(5, 2 - i11);
        } else {
            calendar.add(5, -6);
        }
        DateFormat dateFormat = f6715n;
        String format = dateFormat.format(calendar.getTime());
        calendar.add(5, 6);
        return String.format(Locale.CHINA, "%s - %s", format, dateFormat.format(calendar.getTime()));
    }

    public final boolean G() {
        ArrayList<BBFriendRankInfo> arrayList = this.f6724i;
        if (arrayList != null && !arrayList.isEmpty()) {
            return false;
        }
        ArrayList<BBFriendRankInfo> arrayList2 = this.f6723h;
        return arrayList2 == null || arrayList2.isEmpty();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int min;
        int max;
        int id2 = view.getId();
        if (id2 == R.id.left_indicator) {
            if (this.f6720e.getAdapter() == null || (max = Math.max(0, this.f6720e.getCurrentItem() - 1)) == this.f6720e.getCurrentItem()) {
                return;
            }
            this.f6720e.setCurrentItem(max);
            this.f6716a.setEnabled(false);
            this.f6717b.setEnabled(true);
            return;
        }
        if (id2 != R.id.right_indicator || this.f6720e.getAdapter() == null || (min = Math.min(this.f6720e.getAdapter().getCount() - 1, this.f6720e.getCurrentItem() + 1)) == this.f6720e.getCurrentItem()) {
            return;
        }
        this.f6720e.setCurrentItem(min);
        this.f6717b.setEnabled(false);
        this.f6716a.setEnabled(true);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.f6725j = savedInstanceState == null ? 1 : savedInstanceState.getInt(f6714m);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.friend_week_fragment, container, false);
        View findViewById = inflate.findViewById(R.id.left_indicator);
        this.f6716a = findViewById;
        findViewById.setEnabled(false);
        this.f6716a.setOnClickListener(this);
        View findViewById2 = inflate.findViewById(R.id.right_indicator);
        this.f6717b = findViewById2;
        findViewById2.setOnClickListener(this);
        this.f6717b.setEnabled(false);
        this.f6718c = (TextView) inflate.findViewById(R.id.week);
        this.f6719d = (TextView) inflate.findViewById(R.id.week_date);
        LockableViewPager lockableViewPager = (LockableViewPager) inflate.findViewById(R.id.rank_list_pager);
        this.f6720e = lockableViewPager;
        lockableViewPager.setOnPageChangeListener(this.f6726k);
        this.f6721f = inflate.findViewById(R.id.load_progress);
        this.f6722g = inflate.findViewById(R.id.single_tip);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        com.baicizhan.client.business.thrift.c.b().b(f6713l);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        F();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(f6714m, this.f6725j);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements ViewPager.OnPageChangeListener {
        public a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int position) {
            d.this.D(position);
            d.this.f6716a.setEnabled(position != 0);
            d.this.f6717b.setEnabled(position == 0);
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int state) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int arg0, float arg1, int arg2) {
        }
    }
}
