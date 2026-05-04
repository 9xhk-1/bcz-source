package com.baicizhan.main.wikiv2.study;

import a00.k1;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.baicizhan.client.business.util.ClickProtectedEvent;
import com.baicizhan.main.activity.errorfb.WordErrorFeedbackActivity;
import com.baicizhan.main.wikiv2.study.StudyWikiFragment;
import com.jiongji.andriod.card.R;
import gs.wm;
import hj.m;
import hj.p;
import ij.e;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import li.c;
import li.f;
import m80.k;
import m80.l;
import wi.n;
import wi.o;
import yz.g2;
import yz.h1;
import yz.w;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class StudyWikiFragment extends Fragment implements c {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f25844e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final int f25845f = 8;

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final String f25846g = "study_wiki_book_id";

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final String f25847h = "study_wiki_topic_id";

    /* renamed from: a, reason: collision with root package name */
    @l
    public wm f25848a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public n f25849b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public f f25850c;

    /* renamed from: d, reason: collision with root package name */
    public long f25851d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @k
        public final StudyWikiFragment a(int i11, int i12) {
            StudyWikiFragment studyWikiFragment = new StudyWikiFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("study_wiki_book_id", i11);
            bundle.putInt("study_wiki_topic_id", i12);
            studyWikiFragment.setArguments(bundle);
            return studyWikiFragment;
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements Observer, b0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.l f25852a;

        public b(x00.l function) {
            g0.p(function, "function");
            this.f25852a = function;
        }

        public final boolean equals(@l Object obj) {
            if ((obj instanceof Observer) && (obj instanceof b0)) {
                return g0.g(getFunctionDelegate(), ((b0) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.b0
        @k
        public final w<?> getFunctionDelegate() {
            return this.f25852a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f25852a.invoke(obj);
        }
    }

    public static final void D(n nVar, StudyWikiFragment studyWikiFragment, e ctrl) {
        g0.p(ctrl, "ctrl");
        nVar.E(new m(studyWikiFragment, ctrl));
    }

    public static final void E(StudyWikiFragment studyWikiFragment, View view) {
        n nVar = studyWikiFragment.f25849b;
        if (nVar != null) {
            nVar.r();
        }
    }

    public static final void F(StudyWikiFragment studyWikiFragment, View view) {
        ClickProtectedEvent<Integer> m11;
        n nVar = studyWikiFragment.f25849b;
        if (nVar != null && (m11 = nVar.m()) != null) {
            m11.call();
        }
        n nVar2 = studyWikiFragment.f25849b;
        if (nVar2 != null) {
            n.f(nVar2, ma.a.H4, null, 2, null);
        }
    }

    public static final void G(StudyWikiFragment studyWikiFragment, List list) {
        RecyclerView recyclerView;
        wm wmVar = studyWikiFragment.f25848a;
        RecyclerView.Adapter adapter = (wmVar == null || (recyclerView = wmVar.f57368d) == null) ? null : recyclerView.getAdapter();
        if (!(adapter instanceof o) || list == null) {
            return;
        }
        o oVar = (o) adapter;
        oVar.m(list);
        oVar.notifyDataSetChanged();
    }

    public static final void H(StudyWikiFragment studyWikiFragment, Boolean bool) {
        if (bool == null || g0.g(bool, Boolean.FALSE)) {
            wm wmVar = studyWikiFragment.f25848a;
            g0.m(wmVar);
            wmVar.f57367c.setImageResource(R.drawable.ic_study_slash);
        } else {
            if (!g0.g(bool, Boolean.TRUE)) {
                throw new NoWhenBranchMatchedException();
            }
            wm wmVar2 = studyWikiFragment.f25848a;
            g0.m(wmVar2);
            wmVar2.f57367c.setImageResource(R.drawable.ic_study_slash_cancel);
        }
    }

    public static final void I(StudyWikiFragment studyWikiFragment, Integer num) {
        f fVar = studyWikiFragment.f25850c;
        if (fVar != null) {
            fVar.C(num);
        }
    }

    public static final g2 J(StudyWikiFragment studyWikiFragment, com.baicizhan.main.wikiv2.study.model.b bVar) {
        WordErrorFeedbackActivity.Q0(studyWikiFragment.getActivity(), bVar.b(), bVar.a());
        return g2.f100423a;
    }

    public final long B() {
        return this.f25851d;
    }

    public final void C() {
        RecyclerView recyclerView;
        final n nVar = (n) new ViewModelProvider(this).get(n.class);
        Bundle arguments = getArguments();
        nVar.v(arguments != null ? arguments.getInt("study_wiki_book_id") : 0);
        Bundle arguments2 = getArguments();
        nVar.w(arguments2 != null ? arguments2.getInt("study_wiki_topic_id") : 0);
        p.e(this, new rj.e() { // from class: wi.d
            @Override // rj.e
            public final void a(ij.e eVar) {
                StudyWikiFragment.D(n.this, this, eVar);
            }
        });
        this.f25849b = nVar;
        wm wmVar = this.f25848a;
        if (wmVar != null && (recyclerView = wmVar.f57368d) != null) {
            final Context context = recyclerView.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(context) { // from class: com.baicizhan.main.wikiv2.study.StudyWikiFragment$init$3$1
                @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
                public boolean requestChildRectangleOnScreen(RecyclerView parent, View child, Rect rect, boolean z11, boolean z12) {
                    g0.p(parent, "parent");
                    g0.p(child, "child");
                    g0.p(rect, "rect");
                    return false;
                }
            });
            if (recyclerView.getItemDecorationCount() == 0) {
                eu.a aVar = new eu.a(recyclerView.getContext());
                aVar.f(true);
                aVar.d(new ColorDrawable(recyclerView.getContext().getResources().getColor(R.color.main_color_weak_divider)));
                aVar.h(xb.f.a(recyclerView.getContext(), 20.0f), 0, xb.f.a(recyclerView.getContext(), 26.0f), xb.f.a(recyclerView.getContext(), 6.0f));
                recyclerView.addItemDecoration(aVar);
            }
            n nVar2 = this.f25849b;
            g0.m(nVar2);
            FragmentActivity requireActivity = requireActivity();
            g0.o(requireActivity, "requireActivity(...)");
            recyclerView.setAdapter(new o(nVar2, this, requireActivity));
        }
        wm wmVar2 = this.f25848a;
        if (wmVar2 != null) {
            wmVar2.f57367c.setOnClickListener(new View.OnClickListener() { // from class: wi.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StudyWikiFragment.E(StudyWikiFragment.this, view);
                }
            });
            wmVar2.f57366b.setOnClickListener(new View.OnClickListener() { // from class: wi.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StudyWikiFragment.F(StudyWikiFragment.this, view);
                }
            });
        }
        n nVar3 = this.f25849b;
        if (nVar3 != null) {
            nVar3.p().observe(this, new Observer() { // from class: wi.g
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    StudyWikiFragment.G(StudyWikiFragment.this, (List) obj);
                }
            });
            nVar3.q().observe(this, new Observer() { // from class: wi.h
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    StudyWikiFragment.H(StudyWikiFragment.this, (Boolean) obj);
                }
            });
            nVar3.m().observe(this, new Observer() { // from class: wi.i
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    StudyWikiFragment.I(StudyWikiFragment.this, (Integer) obj);
                }
            });
            nVar3.i().observe(getViewLifecycleOwner(), new b(new x00.l() { // from class: wi.j
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 J;
                    J = StudyWikiFragment.J(StudyWikiFragment.this, (com.baicizhan.main.wikiv2.study.model.b) obj);
                    return J;
                }
            }));
            nVar3.start();
        }
    }

    public final void K(long j11) {
        this.f25851d = j11;
    }

    @Override // li.c
    public boolean d() {
        wi.c l11;
        n nVar = this.f25849b;
        if (nVar == null || (l11 = nVar.l()) == null) {
            return false;
        }
        return l11.f();
    }

    @Override // li.c
    public void j(@l f fVar) {
        this.f25850c = fVar;
    }

    @Override // androidx.fragment.app.Fragment
    @l
    public View onCreateView(@k LayoutInflater inflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        g0.p(inflater, "inflater");
        wm wmVar = (wm) wi.p.f96399a.b(wm.class, inflater, viewGroup);
        this.f25848a = wmVar;
        C();
        return wmVar.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        wi.c l11;
        super.onDestroy();
        n nVar = this.f25849b;
        if (nVar == null || (l11 = nVar.l()) == null) {
            return;
        }
        l11.n();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        wm wmVar = this.f25848a;
        if (wmVar != null) {
            wmVar.f57368d.setAdapter(null);
            wmVar.f57366b.setOnClickListener(null);
            wmVar.f57367c.setOnClickListener(null);
            wi.p.f96399a.d(wm.class, wmVar);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        if (this.f25851d > 0) {
            n nVar = this.f25849b;
            if (nVar != null) {
                nVar.d(ma.a.A4, k1.k(h1.a(ma.b.f72947t1, Long.valueOf(System.currentTimeMillis() - this.f25851d))));
            }
            this.f25851d = 0L;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        n nVar = this.f25849b;
        if (nVar != null) {
            nVar.u();
        }
        n nVar2 = this.f25849b;
        if (nVar2 != null) {
            nVar2.g();
        }
        this.f25851d = System.currentTimeMillis();
    }

    @Override // li.c
    public void q() {
        wi.c l11;
        n nVar = this.f25849b;
        if (nVar == null || (l11 = nVar.l()) == null) {
            return;
        }
        l11.r();
    }
}
