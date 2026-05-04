package com.baicizhan.main.wikiv2.studyv2;

import a00.h0;
import a00.k1;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.baicizhan.client.business.util.KotlinExtKt;
import com.baicizhan.main.wikiv2.studyv2.data.s0;
import com.baicizhan.main.wikiv2.studyv2.data.w0;
import com.jiongji.andriod.card.R;
import gs.ym;
import hj.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import sa.q;
import yz.g2;
import yz.h1;
import yz.w;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nStudyWikiV2Fragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StudyWikiV2Fragment.kt\ncom/baicizhan/main/wikiv2/studyv2/StudyWikiV2Fragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,240:1\n1878#2,3:241\n*S KotlinDebug\n*F\n+ 1 StudyWikiV2Fragment.kt\ncom/baicizhan/main/wikiv2/studyv2/StudyWikiV2Fragment\n*L\n131#1:241,3\n*E\n"})
/* loaded from: classes3.dex */
public final class StudyWikiV2Fragment extends Fragment implements li.c {

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final a f25911f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    public static final int f25912g = 8;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public static final String f25913h = "StudyWikiV2Fragment";

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public static final String f25914i = "wiki_book_id";

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public static final String f25915j = "wiki_topic_id";

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public static final String f25916k = "wiki_upgrade";

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public static final String f25917l = "wiki_show_bottom";

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    public ym f25918a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public List<Object> f25919b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public StudyWikiV2ViewModel f25920c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public li.f f25921d;

    /* renamed from: e, reason: collision with root package name */
    public long f25922e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public static /* synthetic */ StudyWikiV2Fragment d(a aVar, int i11, int i12, boolean z11, boolean z12, int i13, Object obj) {
            if ((i13 & 4) != 0) {
                z11 = false;
            }
            if ((i13 & 8) != 0) {
                z12 = false;
            }
            return aVar.c(i11, i12, z11, z12);
        }

        @w00.k
        @m80.k
        public final StudyWikiV2Fragment a(int i11, int i12) {
            return d(this, i11, i12, false, false, 12, null);
        }

        @w00.k
        @m80.k
        public final StudyWikiV2Fragment b(int i11, int i12, boolean z11) {
            return d(this, i11, i12, z11, false, 8, null);
        }

        @w00.k
        @m80.k
        public final StudyWikiV2Fragment c(int i11, int i12, boolean z11, boolean z12) {
            StudyWikiV2Fragment studyWikiV2Fragment = new StudyWikiV2Fragment();
            Bundle bundle = new Bundle();
            bundle.putInt("wiki_book_id", i12);
            bundle.putInt("wiki_topic_id", i11);
            bundle.putBoolean(StudyWikiV2Fragment.f25916k, z11);
            bundle.putBoolean(StudyWikiV2Fragment.f25917l, z12);
            studyWikiV2Fragment.setArguments(bundle);
            return studyWikiV2Fragment;
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements Observer, b0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.l f25923a;

        public b(x00.l function) {
            g0.p(function, "function");
            this.f25923a = function;
        }

        public final boolean equals(@m80.l Object obj) {
            if ((obj instanceof Observer) && (obj instanceof b0)) {
                return g0.g(getFunctionDelegate(), ((b0) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.b0
        @m80.k
        public final w<?> getFunctionDelegate() {
            return this.f25923a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f25923a.invoke(obj);
        }
    }

    private final void D() {
        ym ymVar = this.f25918a;
        if (ymVar != null) {
            RecyclerView recyclerView = ymVar.f57660f;
            final Context context = recyclerView.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(context) { // from class: com.baicizhan.main.wikiv2.studyv2.StudyWikiV2Fragment$initView$1$1$1

                /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
                public static final class a extends LinearSmoothScroller {
                    public a(Context context) {
                        super(context);
                    }

                    @Override // androidx.recyclerview.widget.LinearSmoothScroller
                    public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                        g0.p(displayMetrics, "displayMetrics");
                        return 150.0f / displayMetrics.densityDpi;
                    }
                }

                @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
                public boolean requestChildRectangleOnScreen(RecyclerView parent, View child, Rect rect, boolean z11, boolean z12) {
                    g0.p(parent, "parent");
                    g0.p(child, "child");
                    g0.p(rect, "rect");
                    return false;
                }

                @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                public void smoothScrollToPosition(RecyclerView recyclerView2, RecyclerView.State state, int i11) {
                    g0.m(recyclerView2);
                    a aVar = new a(recyclerView2.getContext());
                    aVar.setTargetPosition(i11);
                    startSmoothScroll(aVar);
                }
            });
            StudyWikiV2ViewModel studyWikiV2ViewModel = this.f25920c;
            if (studyWikiV2ViewModel == null) {
                g0.S("mViewModel");
                studyWikiV2ViewModel = null;
            }
            recyclerView.setAdapter(new bj.a(this, studyWikiV2ViewModel));
            TextView noproguardContinueLearn = ymVar.f57657c;
            g0.o(noproguardContinueLearn, "noproguardContinueLearn");
            q.t(noproguardContinueLearn, 0, new x00.l() { // from class: com.baicizhan.main.wikiv2.studyv2.c
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 E;
                    E = StudyWikiV2Fragment.E(StudyWikiV2Fragment.this, (View) obj);
                    return E;
                }
            }, 1, null);
            ImageView noproguardKill = ymVar.f57658d;
            g0.o(noproguardKill, "noproguardKill");
            q.t(noproguardKill, 0, new x00.l() { // from class: com.baicizhan.main.wikiv2.studyv2.d
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 F;
                    F = StudyWikiV2Fragment.F(StudyWikiV2Fragment.this, (View) obj);
                    return F;
                }
            }, 1, null);
            Group noproguardBottomGroup = ymVar.f57656b;
            g0.o(noproguardBottomGroup, "noproguardBottomGroup");
            Bundle arguments = getArguments();
            q.z(noproguardBottomGroup, arguments != null ? arguments.getBoolean(f25917l, false) : false);
        }
    }

    public static final g2 E(StudyWikiV2Fragment studyWikiV2Fragment, View it) {
        g0.p(it, "it");
        StudyWikiV2ViewModel studyWikiV2ViewModel = studyWikiV2Fragment.f25920c;
        if (studyWikiV2ViewModel == null) {
            g0.S("mViewModel");
            studyWikiV2ViewModel = null;
        }
        studyWikiV2ViewModel.k().call();
        StudyWikiV2ViewModel studyWikiV2ViewModel2 = studyWikiV2Fragment.f25920c;
        if (studyWikiV2ViewModel2 == null) {
            g0.S("mViewModel");
            studyWikiV2ViewModel2 = null;
        }
        StudyWikiV2ViewModel.c(studyWikiV2ViewModel2, ma.a.H4, null, 2, null);
        return g2.f100423a;
    }

    public static final g2 F(StudyWikiV2Fragment studyWikiV2Fragment, View it) {
        g0.p(it, "it");
        StudyWikiV2ViewModel studyWikiV2ViewModel = studyWikiV2Fragment.f25920c;
        if (studyWikiV2ViewModel == null) {
            g0.S("mViewModel");
            studyWikiV2ViewModel = null;
        }
        studyWikiV2ViewModel.r();
        return g2.f100423a;
    }

    private final void G() {
        StudyWikiV2ViewModel studyWikiV2ViewModel = this.f25920c;
        if (studyWikiV2ViewModel == null) {
            g0.S("mViewModel");
            studyWikiV2ViewModel = null;
        }
        studyWikiV2ViewModel.h().observe(getViewLifecycleOwner(), new b(new x00.l() { // from class: com.baicizhan.main.wikiv2.studyv2.e
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 H;
                H = StudyWikiV2Fragment.H(StudyWikiV2Fragment.this, (List) obj);
                return H;
            }
        }));
        studyWikiV2ViewModel.g().observe(getViewLifecycleOwner(), new b(new x00.l() { // from class: com.baicizhan.main.wikiv2.studyv2.f
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 I;
                I = StudyWikiV2Fragment.I(StudyWikiV2Fragment.this, (Integer) obj);
                return I;
            }
        }));
        studyWikiV2ViewModel.k().observe(getViewLifecycleOwner(), new b(new x00.l() { // from class: com.baicizhan.main.wikiv2.studyv2.g
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 K;
                K = StudyWikiV2Fragment.K(StudyWikiV2Fragment.this, (Integer) obj);
                return K;
            }
        }));
        studyWikiV2ViewModel.q().observe(getViewLifecycleOwner(), new b(new x00.l() { // from class: com.baicizhan.main.wikiv2.studyv2.h
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 L;
                L = StudyWikiV2Fragment.L(StudyWikiV2Fragment.this, (Boolean) obj);
                return L;
            }
        }));
        Context requireContext = requireContext();
        g0.o(requireContext, "requireContext(...)");
        Bundle arguments = getArguments();
        studyWikiV2ViewModel.n(requireContext, arguments != null ? arguments.getBoolean(f25916k) : false);
    }

    public static final g2 H(StudyWikiV2Fragment studyWikiV2Fragment, List list) {
        RecyclerView recyclerView;
        Drawable drawable;
        ym ymVar = studyWikiV2Fragment.f25918a;
        if (ymVar != null && (recyclerView = ymVar.f57660f) != null) {
            if (recyclerView.getScrollState() != 0) {
                return g2.f100423a;
            }
            qb.c.i("new_wiki_time", "list start", new Object[0]);
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            g0.n(adapter, "null cannot be cast to non-null type com.baicizhan.main.wikiv2.studyv2.adapter.WikiAdapterV2");
            ((bj.a) adapter).m(list);
            g0.m(list);
            int i11 = 0;
            for (Object obj : list) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    h0.b0();
                }
                if (!(obj instanceof w0) && !(obj instanceof s0)) {
                    Context requireContext = studyWikiV2Fragment.requireContext();
                    g0.o(requireContext, "requireContext(...)");
                    xl.c cVar = new xl.c(requireContext, 1, i11, i12, false, 16, null);
                    if (i11 == list.size() - 1) {
                        drawable = KotlinExtKt.getDrawable(R.drawable.divider_transparent_68dp);
                        g0.m(drawable);
                    } else {
                        drawable = KotlinExtKt.getDrawable(R.drawable.divider_height_16dp_color_transparent);
                        g0.m(drawable);
                    }
                    cVar.setDrawable(drawable);
                    recyclerView.addItemDecoration(cVar);
                }
                i11 = i12;
            }
        }
        return g2.f100423a;
    }

    public static final g2 I(StudyWikiV2Fragment studyWikiV2Fragment, final Integer num) {
        final RecyclerView recyclerView;
        ym ymVar = studyWikiV2Fragment.f25918a;
        if (ymVar != null && (recyclerView = ymVar.f57660f) != null) {
            if (recyclerView.getScrollState() != 0) {
                return g2.f100423a;
            }
            final RecyclerView.Adapter adapter = recyclerView.getAdapter();
            if (adapter != null) {
                qb.c.b(f25913h, "itemPosChange:" + recyclerView.getScrollState(), new Object[0]);
                recyclerView.post(new Runnable() { // from class: com.baicizhan.main.wikiv2.studyv2.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        StudyWikiV2Fragment.J(RecyclerView.Adapter.this, num, recyclerView);
                    }
                });
            }
        }
        return g2.f100423a;
    }

    public static final void J(RecyclerView.Adapter adapter, Integer num, RecyclerView recyclerView) {
        g0.m(num);
        adapter.notifyItemChanged(num.intValue());
        if (num.intValue() == (recyclerView.getAdapter() != null ? r1.getItemCount() : 0) - 1) {
            recyclerView.smoothScrollToPosition(num.intValue());
        }
    }

    public static final g2 K(StudyWikiV2Fragment studyWikiV2Fragment, Integer num) {
        li.f fVar = studyWikiV2Fragment.f25921d;
        if (fVar != null) {
            fVar.C(num);
        }
        return g2.f100423a;
    }

    public static final g2 L(StudyWikiV2Fragment studyWikiV2Fragment, Boolean bool) {
        ImageView imageView;
        ym ymVar = studyWikiV2Fragment.f25918a;
        if (ymVar != null && (imageView = ymVar.f57658d) != null) {
            imageView.setImageResource(bool.booleanValue() ? R.drawable.ic_study_slash_cancel : R.drawable.ic_study_slash);
        }
        return g2.f100423a;
    }

    public static final void M(StudyWikiV2ViewModel studyWikiV2ViewModel, StudyWikiV2Fragment studyWikiV2Fragment, ij.e controller) {
        g0.p(controller, "controller");
        studyWikiV2ViewModel.E(new hj.m(studyWikiV2Fragment, controller));
    }

    public final long C() {
        return this.f25922e;
    }

    public final void N(long j11) {
        this.f25922e = j11;
    }

    @Override // li.c
    public boolean d() {
        StudyWikiV2ViewModel studyWikiV2ViewModel = this.f25920c;
        if (studyWikiV2ViewModel == null) {
            g0.S("mViewModel");
            studyWikiV2ViewModel = null;
        }
        return studyWikiV2ViewModel.j().f();
    }

    @Override // li.c
    public void j(@m80.l li.f fVar) {
        this.f25921d = fVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@m80.l Bundle bundle) {
        super.onCreate(bundle);
        final StudyWikiV2ViewModel studyWikiV2ViewModel = (StudyWikiV2ViewModel) new ViewModelProvider(this).get(StudyWikiV2ViewModel.class);
        p.e(this, new rj.e() { // from class: com.baicizhan.main.wikiv2.studyv2.j
            @Override // rj.e
            public final void a(ij.e eVar) {
                StudyWikiV2Fragment.M(StudyWikiV2ViewModel.this, this, eVar);
            }
        });
        Bundle arguments = getArguments();
        if (arguments != null) {
            studyWikiV2ViewModel.x(arguments.getInt("wiki_topic_id"));
            studyWikiV2ViewModel.v(arguments.getInt("wiki_book_id"));
        }
        this.f25920c = studyWikiV2ViewModel;
        Lifecycle lifecycle = getLifecycle();
        StudyWikiV2ViewModel studyWikiV2ViewModel2 = this.f25920c;
        if (studyWikiV2ViewModel2 == null) {
            g0.S("mViewModel");
            studyWikiV2ViewModel2 = null;
        }
        lifecycle.addObserver(studyWikiV2ViewModel2.j());
    }

    @Override // androidx.fragment.app.Fragment
    @m80.l
    public View onCreateView(@m80.k LayoutInflater inflater, @m80.l ViewGroup viewGroup, @m80.l Bundle bundle) {
        g0.p(inflater, "inflater");
        ym g11 = ym.g(inflater, viewGroup, false);
        this.f25918a = g11;
        StudyWikiV2ViewModel studyWikiV2ViewModel = this.f25920c;
        if (studyWikiV2ViewModel == null) {
            g0.S("mViewModel");
            studyWikiV2ViewModel = null;
        }
        g11.j(studyWikiV2ViewModel);
        g11.setLifecycleOwner(this);
        D();
        G();
        return g11.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        ym ymVar = this.f25918a;
        if (ymVar != null) {
            ymVar.f57660f.setAdapter(null);
            ymVar.f57657c.setOnClickListener(null);
            ymVar.f57658d.setOnClickListener(null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        if (this.f25922e > 0) {
            StudyWikiV2ViewModel studyWikiV2ViewModel = this.f25920c;
            if (studyWikiV2ViewModel == null) {
                g0.S("mViewModel");
                studyWikiV2ViewModel = null;
            }
            studyWikiV2ViewModel.b(ma.a.A4, k1.k(h1.a(ma.b.f72947t1, Long.valueOf(System.currentTimeMillis() - this.f25922e))));
            this.f25922e = 0L;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        StudyWikiV2ViewModel studyWikiV2ViewModel = this.f25920c;
        StudyWikiV2ViewModel studyWikiV2ViewModel2 = null;
        if (studyWikiV2ViewModel == null) {
            g0.S("mViewModel");
            studyWikiV2ViewModel = null;
        }
        studyWikiV2ViewModel.u();
        StudyWikiV2ViewModel studyWikiV2ViewModel3 = this.f25920c;
        if (studyWikiV2ViewModel3 == null) {
            g0.S("mViewModel");
        } else {
            studyWikiV2ViewModel2 = studyWikiV2ViewModel3;
        }
        studyWikiV2ViewModel2.d();
        this.f25922e = System.currentTimeMillis();
    }

    @Override // li.c
    public void q() {
        StudyWikiV2ViewModel studyWikiV2ViewModel = this.f25920c;
        if (studyWikiV2ViewModel == null) {
            g0.S("mViewModel");
            studyWikiV2ViewModel = null;
        }
        studyWikiV2ViewModel.j().o();
    }
}
