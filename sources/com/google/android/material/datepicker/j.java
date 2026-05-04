package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Pair;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public final class j<S> extends s<S> {

    /* renamed from: o, reason: collision with root package name */
    public static final String f31170o = "THEME_RES_ID_KEY";

    /* renamed from: p, reason: collision with root package name */
    public static final String f31171p = "GRID_SELECTOR_KEY";

    /* renamed from: q, reason: collision with root package name */
    public static final String f31172q = "CALENDAR_CONSTRAINTS_KEY";

    /* renamed from: r, reason: collision with root package name */
    public static final String f31173r = "DAY_VIEW_DECORATOR_KEY";

    /* renamed from: s, reason: collision with root package name */
    public static final String f31174s = "CURRENT_MONTH_KEY";

    /* renamed from: t, reason: collision with root package name */
    public static final int f31175t = 3;

    /* renamed from: u, reason: collision with root package name */
    @VisibleForTesting
    public static final Object f31176u = "MONTHS_VIEW_GROUP_TAG";

    /* renamed from: v, reason: collision with root package name */
    @VisibleForTesting
    public static final Object f31177v = "NAVIGATION_PREV_TAG";

    /* renamed from: w, reason: collision with root package name */
    @VisibleForTesting
    public static final Object f31178w = "NAVIGATION_NEXT_TAG";

    /* renamed from: x, reason: collision with root package name */
    @VisibleForTesting
    public static final Object f31179x = "SELECTOR_TOGGLE_TAG";

    /* renamed from: b, reason: collision with root package name */
    @StyleRes
    public int f31180b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    public DateSelector<S> f31181c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    public CalendarConstraints f31182d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    public DayViewDecorator f31183e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public Month f31184f;

    /* renamed from: g, reason: collision with root package name */
    public l f31185g;

    /* renamed from: h, reason: collision with root package name */
    public com.google.android.material.datepicker.b f31186h;

    /* renamed from: i, reason: collision with root package name */
    public RecyclerView f31187i;

    /* renamed from: j, reason: collision with root package name */
    public RecyclerView f31188j;

    /* renamed from: k, reason: collision with root package name */
    public View f31189k;

    /* renamed from: l, reason: collision with root package name */
    public View f31190l;

    /* renamed from: m, reason: collision with root package name */
    public View f31191m;

    /* renamed from: n, reason: collision with root package name */
    public View f31192n;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q f31193a;

        public a(q qVar) {
            this.f31193a = qVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int findLastVisibleItemPosition = j.this.M().findLastVisibleItemPosition() - 1;
            if (findLastVisibleItemPosition >= 0) {
                j.this.Q(this.f31193a.c(findLastVisibleItemPosition));
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f31195a;

        public b(int i11) {
            this.f31195a = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            j.this.f31188j.smoothScrollToPosition(this.f31195a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends AccessibilityDelegateCompat {
        public c() {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.setCollectionInfo(null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d extends t {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f31198b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context, int i11, boolean z11, int i12) {
            super(context, i11, z11);
            this.f31198b = i12;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public void calculateExtraLayoutSpace(@NonNull RecyclerView.State state, @NonNull int[] iArr) {
            if (this.f31198b == 0) {
                iArr[0] = j.this.f31188j.getWidth();
                iArr[1] = j.this.f31188j.getWidth();
            } else {
                iArr[0] = j.this.f31188j.getHeight();
                iArr[1] = j.this.f31188j.getHeight();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e implements m {
        public e() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.datepicker.j.m
        public void a(long j11) {
            if (j.this.f31182d.h().f(j11)) {
                j.this.f31181c.v0(j11);
                Iterator<r<S>> it = j.this.f31294a.iterator();
                while (it.hasNext()) {
                    it.next().b(j.this.f31181c.o0());
                }
                j.this.f31188j.getAdapter().notifyDataSetChanged();
                if (j.this.f31187i != null) {
                    j.this.f31187i.getAdapter().notifyDataSetChanged();
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class f extends AccessibilityDelegateCompat {
        public f() {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.setScrollable(false);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class g extends RecyclerView.ItemDecoration {

        /* renamed from: a, reason: collision with root package name */
        public final Calendar f31202a = v.x();

        /* renamed from: b, reason: collision with root package name */
        public final Calendar f31203b = v.x();

        public g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
            if ((recyclerView.getAdapter() instanceof w) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                w wVar = (w) recyclerView.getAdapter();
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                for (Pair<Long, Long> pair : j.this.f31181c.G0()) {
                    Long l11 = pair.first;
                    if (l11 != null && pair.second != null) {
                        this.f31202a.setTimeInMillis(l11.longValue());
                        this.f31203b.setTimeInMillis(pair.second.longValue());
                        int d11 = wVar.d(this.f31202a.get(1));
                        int d12 = wVar.d(this.f31203b.get(1));
                        View findViewByPosition = gridLayoutManager.findViewByPosition(d11);
                        View findViewByPosition2 = gridLayoutManager.findViewByPosition(d12);
                        int spanCount = d11 / gridLayoutManager.getSpanCount();
                        int spanCount2 = d12 / gridLayoutManager.getSpanCount();
                        int i11 = spanCount;
                        while (i11 <= spanCount2) {
                            if (gridLayoutManager.findViewByPosition(gridLayoutManager.getSpanCount() * i11) != null) {
                                canvas.drawRect((i11 != spanCount || findViewByPosition == null) ? 0 : findViewByPosition.getLeft() + (findViewByPosition.getWidth() / 2), r9.getTop() + j.this.f31186h.f31146d.e(), (i11 != spanCount2 || findViewByPosition2 == null) ? recyclerView.getWidth() : findViewByPosition2.getLeft() + (findViewByPosition2.getWidth() / 2), r9.getBottom() - j.this.f31186h.f31146d.b(), j.this.f31186h.f31150h);
                            }
                            i11++;
                        }
                    }
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class h extends AccessibilityDelegateCompat {
        public h() {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.setHintText(j.this.f31192n.getVisibility() == 0 ? j.this.getString(R.string.mtrl_picker_toggle_to_year_selection) : j.this.getString(R.string.mtrl_picker_toggle_to_day_selection));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class i extends RecyclerView.OnScrollListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q f31206a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MaterialButton f31207b;

        public i(q qVar, MaterialButton materialButton) {
            this.f31206a = qVar;
            this.f31207b = materialButton;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i11) {
            if (i11 == 0) {
                recyclerView.announceForAccessibility(this.f31207b.getText());
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(@NonNull RecyclerView recyclerView, int i11, int i12) {
            int findFirstVisibleItemPosition = i11 < 0 ? j.this.M().findFirstVisibleItemPosition() : j.this.M().findLastVisibleItemPosition();
            j.this.f31184f = this.f31206a.c(findFirstVisibleItemPosition);
            this.f31207b.setText(this.f31206a.d(findFirstVisibleItemPosition));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.google.android.material.datepicker.j$j, reason: collision with other inner class name */
    public class ViewOnClickListenerC0373j implements View.OnClickListener {
        public ViewOnClickListenerC0373j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            j.this.T();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class k implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q f31210a;

        public k(q qVar) {
            this.f31210a = qVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int findFirstVisibleItemPosition = j.this.M().findFirstVisibleItemPosition() + 1;
            if (findFirstVisibleItemPosition < j.this.f31188j.getAdapter().getItemCount()) {
                j.this.Q(this.f31210a.c(findFirstVisibleItemPosition));
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum l {
        DAY,
        YEAR
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface m {
        void a(long j11);
    }

    @Px
    public static int K(@NonNull Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height);
    }

    public static int L(@NonNull Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_navigation_height) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_bottom_padding);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_days_of_week_height);
        int i11 = p.f31276g;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i11) + ((i11 - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_vertical_padding)) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_bottom_padding);
    }

    @NonNull
    public static <T> j<T> N(@NonNull DateSelector<T> dateSelector, @StyleRes int i11, @NonNull CalendarConstraints calendarConstraints) {
        return O(dateSelector, i11, calendarConstraints, null);
    }

    @NonNull
    public static <T> j<T> O(@NonNull DateSelector<T> dateSelector, @StyleRes int i11, @NonNull CalendarConstraints calendarConstraints, @Nullable DayViewDecorator dayViewDecorator) {
        j<T> jVar = new j<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i11);
        bundle.putParcelable(f31171p, dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", dayViewDecorator);
        bundle.putParcelable(f31174s, calendarConstraints.m());
        jVar.setArguments(bundle);
        return jVar;
    }

    public final void F(@NonNull View view, @NonNull q qVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(R.id.month_navigation_fragment_toggle);
        materialButton.setTag(f31179x);
        ViewCompat.setAccessibilityDelegate(materialButton, new h());
        View findViewById = view.findViewById(R.id.month_navigation_previous);
        this.f31189k = findViewById;
        findViewById.setTag(f31177v);
        View findViewById2 = view.findViewById(R.id.month_navigation_next);
        this.f31190l = findViewById2;
        findViewById2.setTag(f31178w);
        this.f31191m = view.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.f31192n = view.findViewById(R.id.mtrl_calendar_day_selector_frame);
        R(l.DAY);
        materialButton.setText(this.f31184f.k());
        this.f31188j.addOnScrollListener(new i(qVar, materialButton));
        materialButton.setOnClickListener(new ViewOnClickListenerC0373j());
        this.f31190l.setOnClickListener(new k(qVar));
        this.f31189k.setOnClickListener(new a(qVar));
    }

    @NonNull
    public final RecyclerView.ItemDecoration G() {
        return new g();
    }

    @Nullable
    public CalendarConstraints H() {
        return this.f31182d;
    }

    public com.google.android.material.datepicker.b I() {
        return this.f31186h;
    }

    @Nullable
    public Month J() {
        return this.f31184f;
    }

    @NonNull
    public LinearLayoutManager M() {
        return (LinearLayoutManager) this.f31188j.getLayoutManager();
    }

    public final void P(int i11) {
        this.f31188j.post(new b(i11));
    }

    public void Q(Month month) {
        q qVar = (q) this.f31188j.getAdapter();
        int f11 = qVar.f(month);
        int f12 = f11 - qVar.f(this.f31184f);
        boolean z11 = Math.abs(f12) > 3;
        boolean z12 = f12 > 0;
        this.f31184f = month;
        if (z11 && z12) {
            this.f31188j.scrollToPosition(f11 - 3);
            P(f11);
        } else if (!z11) {
            P(f11);
        } else {
            this.f31188j.scrollToPosition(f11 + 3);
            P(f11);
        }
    }

    public void R(l lVar) {
        this.f31185g = lVar;
        if (lVar == l.YEAR) {
            this.f31187i.getLayoutManager().scrollToPosition(((w) this.f31187i.getAdapter()).d(this.f31184f.f31110c));
            this.f31191m.setVisibility(0);
            this.f31192n.setVisibility(8);
            this.f31189k.setVisibility(8);
            this.f31190l.setVisibility(8);
            return;
        }
        if (lVar == l.DAY) {
            this.f31191m.setVisibility(8);
            this.f31192n.setVisibility(0);
            this.f31189k.setVisibility(0);
            this.f31190l.setVisibility(0);
            Q(this.f31184f);
        }
    }

    public final void S() {
        ViewCompat.setAccessibilityDelegate(this.f31188j, new f());
    }

    public void T() {
        l lVar = this.f31185g;
        l lVar2 = l.YEAR;
        if (lVar == lVar2) {
            R(l.DAY);
        } else if (lVar == l.DAY) {
            R(lVar2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f31180b = bundle.getInt("THEME_RES_ID_KEY");
        this.f31181c = (DateSelector) bundle.getParcelable(f31171p);
        this.f31182d = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f31183e = (DayViewDecorator) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f31184f = (Month) bundle.getParcelable(f31174s);
    }

    @Override // androidx.fragment.app.Fragment
    @NonNull
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        int i11;
        int i12;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f31180b);
        this.f31186h = new com.google.android.material.datepicker.b(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month o11 = this.f31182d.o();
        if (com.google.android.material.datepicker.l.S(contextThemeWrapper)) {
            i11 = R.layout.mtrl_calendar_vertical;
            i12 = 1;
        } else {
            i11 = R.layout.mtrl_calendar_horizontal;
            i12 = 0;
        }
        View inflate = cloneInContext.inflate(i11, viewGroup, false);
        inflate.setMinimumHeight(L(requireContext()));
        GridView gridView = (GridView) inflate.findViewById(R.id.mtrl_calendar_days_of_week);
        ViewCompat.setAccessibilityDelegate(gridView, new c());
        int k11 = this.f31182d.k();
        gridView.setAdapter((ListAdapter) (k11 > 0 ? new com.google.android.material.datepicker.i(k11) : new com.google.android.material.datepicker.i()));
        gridView.setNumColumns(o11.f31111d);
        gridView.setEnabled(false);
        this.f31188j = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_months);
        this.f31188j.setLayoutManager(new d(getContext(), i12, false, i12));
        this.f31188j.setTag(f31176u);
        q qVar = new q(contextThemeWrapper, this.f31181c, this.f31182d, this.f31183e, new e());
        this.f31188j.setAdapter(qVar);
        int integer = contextThemeWrapper.getResources().getInteger(R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.f31187i = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f31187i.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f31187i.setAdapter(new w(this));
            this.f31187i.addItemDecoration(G());
        }
        if (inflate.findViewById(R.id.month_navigation_fragment_toggle) != null) {
            F(inflate, qVar);
        }
        if (!com.google.android.material.datepicker.l.S(contextThemeWrapper)) {
            new PagerSnapHelper().attachToRecyclerView(this.f31188j);
        }
        this.f31188j.scrollToPosition(qVar.f(this.f31184f));
        S();
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f31180b);
        bundle.putParcelable(f31171p, this.f31181c);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f31182d);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f31183e);
        bundle.putParcelable(f31174s, this.f31184f);
    }

    @Override // com.google.android.material.datepicker.s
    public boolean t(@NonNull r<S> rVar) {
        return super.t(rVar);
    }

    @Override // com.google.android.material.datepicker.s
    @Nullable
    public DateSelector<S> w() {
        return this.f31181c;
    }
}
