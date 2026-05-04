package com.baicizhan.main.wikiv2.lookup;

import a00.k1;
import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.ColorInt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.baicizhan.client.business.widget.WikiVideoView;
import com.baicizhan.main.wikiv2.lookup.WordWikiFragment;
import com.baicizhan.main.wikiv2.studyv2.data.EntryAction;
import com.baicizhan.main.wikiv2.studyv2.data.WikiStyle;
import com.baicizhan.online.resource_api.GetTopicResourceChannel;
import gs.zb;
import hj.m;
import hj.p;
import ij.e;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import org.junit.jupiter.api.j2;
import p50.h;
import pi.a0;
import pi.d0;
import pi.i0;
import pi.j0;
import pi.l0;
import pi.m0;
import pi.n;
import pi.n0;
import pi.o0;
import pi.p0;
import pi.q0;
import pi.s;
import pi.t;
import pi.v0;
import pi.x;
import pi.y;
import w00.o;
import yz.c0;
import yz.e0;
import yz.g2;
import yz.h1;
import yz.w;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nWordWikiFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordWikiFragment.kt\ncom/baicizhan/main/wikiv2/lookup/WordWikiFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,356:1\n1#2:357\n360#3,7:358\n*S KotlinDebug\n*F\n+ 1 WordWikiFragment.kt\ncom/baicizhan/main/wikiv2/lookup/WordWikiFragment\n*L\n279#1:358,7\n*E\n"})
/* loaded from: classes3.dex */
public final class WordWikiFragment extends com.baicizhan.base.c {

    @k
    public static final String A = "need_report";

    /* renamed from: t, reason: collision with root package name */
    @k
    public static final a f25562t = new a(null);

    /* renamed from: u, reason: collision with root package name */
    public static final int f25563u = 8;

    /* renamed from: v, reason: collision with root package name */
    @k
    public static final String f25564v = "WordWikiFragment";

    /* renamed from: w, reason: collision with root package name */
    @k
    public static final String f25565w = "wiki_topic_id";

    /* renamed from: x, reason: collision with root package name */
    @k
    public static final String f25566x = "wiki_book_id";

    /* renamed from: y, reason: collision with root package name */
    @k
    public static final String f25567y = "wiki_channel";

    /* renamed from: z, reason: collision with root package name */
    @k
    public static final String f25568z = "wiki_background";

    /* renamed from: g, reason: collision with root package name */
    @l
    public zb f25572g;

    /* renamed from: j, reason: collision with root package name */
    public int f25575j;

    /* renamed from: k, reason: collision with root package name */
    public int f25576k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public GetTopicResourceChannel f25577l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f25578m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public Boolean f25579n;

    /* renamed from: o, reason: collision with root package name */
    @l
    public WikiVideoView f25580o;

    /* renamed from: p, reason: collision with root package name */
    @l
    public b f25581p;

    /* renamed from: s, reason: collision with root package name */
    public long f25584s;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final c0 f25569d = e0.c(new x00.a() { // from class: oi.g
        @Override // x00.a
        public final Object invoke() {
            b0 i02;
            i02 = WordWikiFragment.i0(WordWikiFragment.this);
            return i02;
        }
    });

    /* renamed from: e, reason: collision with root package name */
    @k
    public final c0 f25570e = e0.c(new x00.a() { // from class: oi.h
        @Override // x00.a
        public final Object invoke() {
            ta.b W;
            W = WordWikiFragment.W(WordWikiFragment.this);
            return W;
        }
    });

    /* renamed from: f, reason: collision with root package name */
    @k
    public final c0 f25571f = e0.c(new x00.a() { // from class: oi.i
        @Override // x00.a
        public final Object invoke() {
            p50.h X;
            X = WordWikiFragment.X();
            return X;
        }
    });

    /* renamed from: h, reason: collision with root package name */
    @k
    public final Observer<List<?>> f25573h = new Observer() { // from class: oi.j
        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            WordWikiFragment.h0(WordWikiFragment.this, (List) obj);
        }
    };

    /* renamed from: i, reason: collision with root package name */
    @k
    public final Observer<Integer> f25574i = new Observer() { // from class: oi.k
        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            WordWikiFragment.L(WordWikiFragment.this, ((Integer) obj).intValue());
        }
    };

    /* renamed from: q, reason: collision with root package name */
    @k
    public final Handler f25582q = new Handler();

    /* renamed from: r, reason: collision with root package name */
    @k
    public final Runnable f25583r = new Runnable() { // from class: oi.l
        @Override // java.lang.Runnable
        public final void run() {
            WordWikiFragment.N(WordWikiFragment.this);
        }
    };

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public static /* synthetic */ WordWikiFragment e(a aVar, int i11, int i12, GetTopicResourceChannel getTopicResourceChannel, int i13, boolean z11, int i14, Object obj) {
            if ((i14 & 4) != 0) {
                getTopicResourceChannel = GetTopicResourceChannel.LOOK_UP;
            }
            GetTopicResourceChannel getTopicResourceChannel2 = getTopicResourceChannel;
            if ((i14 & 8) != 0) {
                i13 = 0;
            }
            int i15 = i13;
            if ((i14 & 16) != 0) {
                z11 = true;
            }
            return aVar.d(i11, i12, getTopicResourceChannel2, i15, z11);
        }

        @w00.k
        @o
        @k
        public final WordWikiFragment a(int i11, int i12) {
            return e(this, i11, i12, null, 0, false, 28, null);
        }

        @w00.k
        @o
        @k
        public final WordWikiFragment b(int i11, int i12, @k GetTopicResourceChannel channel) {
            g0.p(channel, "channel");
            return e(this, i11, i12, channel, 0, false, 24, null);
        }

        @w00.k
        @o
        @k
        public final WordWikiFragment c(int i11, int i12, @k GetTopicResourceChannel channel, @ColorInt int i13) {
            g0.p(channel, "channel");
            return e(this, i11, i12, channel, i13, false, 16, null);
        }

        @w00.k
        @o
        @k
        public final WordWikiFragment d(int i11, int i12, @k GetTopicResourceChannel channel, @ColorInt int i13, boolean z11) {
            g0.p(channel, "channel");
            WordWikiFragment wordWikiFragment = new WordWikiFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("wiki_topic_id", i11);
            bundle.putInt("wiki_book_id", i12);
            bundle.putSerializable("wiki_channel", channel);
            bundle.putInt("wiki_background", i13);
            bundle.putBoolean("need_report", z11);
            wordWikiFragment.setArguments(bundle);
            return wordWikiFragment;
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b {
        void G(boolean z11);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements v0.a {
        public c() {
        }

        public static final void c(View view) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
        }

        @Override // pi.v0.a
        public void a(WikiVideoView v11) {
            g0.p(v11, "v");
            WordWikiFragment wordWikiFragment = WordWikiFragment.this;
            qb.c.b(WordWikiFragment.f25564v, wordWikiFragment + ", video view created, " + wordWikiFragment.f25575j, new Object[0]);
            WordWikiFragment.this.f25580o = v11;
        }

        @Override // pi.v0.a
        public void b(ViewGroup parent, WikiVideoView v11, boolean z11) {
            g0.p(parent, "parent");
            g0.p(v11, "v");
            WordWikiFragment wordWikiFragment = WordWikiFragment.this;
            qb.c.b(WordWikiFragment.f25564v, wordWikiFragment + ", onFullscreenChanged: " + z11 + j2.O + wordWikiFragment.f25575j, new Object[0]);
            WordWikiFragment.this.f25579n = Boolean.valueOf(z11);
            FragmentActivity activity = WordWikiFragment.this.getActivity();
            WikiVideoView wikiVideoView = null;
            if (activity == null || activity.isFinishing()) {
                Context context = v11.getContext();
                Activity activity2 = context instanceof Activity ? (Activity) context : null;
                if (activity2 != null) {
                    activity2.setRequestedOrientation(1);
                }
                c(v11);
                return;
            }
            FragmentActivity requireActivity = WordWikiFragment.this.requireActivity();
            g0.o(requireActivity, "requireActivity(...)");
            View decorView = requireActivity.getWindow().getDecorView();
            g0.n(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) decorView;
            if (z11) {
                c(v11);
                viewGroup.addView(v11);
                v11.setFullscreen(true);
                requireActivity.setRequestedOrientation(0);
                if (WordWikiFragment.this.f25578m) {
                    return;
                }
                requireActivity.getWindow().addFlags(1024);
                return;
            }
            int childCount = viewGroup.getChildCount() - 1;
            while (true) {
                if (-1 >= childCount) {
                    break;
                }
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof WikiVideoView) {
                    wikiVideoView = (WikiVideoView) childAt;
                    break;
                }
                childCount--;
            }
            if (wikiVideoView != null) {
                viewGroup.removeView(wikiVideoView);
                if (!g0.g(wikiVideoView, v11)) {
                    c(v11);
                }
                parent.addView(wikiVideoView);
            }
            if (wikiVideoView != null) {
                wikiVideoView.setFullscreen(false);
            }
            requireActivity.setRequestedOrientation(1);
            if (WordWikiFragment.this.f25578m) {
                return;
            }
            requireActivity.getWindow().clearFlags(1024);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d implements Observer, b0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.l f25586a;

        public d(x00.l function) {
            g0.p(function, "function");
            this.f25586a = function;
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
            return this.f25586a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f25586a.invoke(obj);
        }
    }

    public static final void L(WordWikiFragment wordWikiFragment, int i11) {
        wordWikiFragment.T().notifyItemChanged(i11);
    }

    public static final void N(WordWikiFragment wordWikiFragment) {
        wordWikiFragment.S().n("");
    }

    @w00.k
    @o
    @k
    public static final WordWikiFragment O(int i11, int i12) {
        return f25562t.a(i11, i12);
    }

    @w00.k
    @o
    @k
    public static final WordWikiFragment P(int i11, int i12, @k GetTopicResourceChannel getTopicResourceChannel) {
        return f25562t.b(i11, i12, getTopicResourceChannel);
    }

    @w00.k
    @o
    @k
    public static final WordWikiFragment Q(int i11, int i12, @k GetTopicResourceChannel getTopicResourceChannel, @ColorInt int i13) {
        return f25562t.c(i11, i12, getTopicResourceChannel, i13);
    }

    @w00.k
    @o
    @k
    public static final WordWikiFragment R(int i11, int i12, @k GetTopicResourceChannel getTopicResourceChannel, @ColorInt int i13, boolean z11) {
        return f25562t.d(i11, i12, getTopicResourceChannel, i13, z11);
    }

    public static final ta.b W(WordWikiFragment wordWikiFragment) {
        return (ta.b) new ViewModelProvider(wordWikiFragment).get(ta.b.class);
    }

    public static final h X() {
        return new h();
    }

    public static final g2 Y(WordWikiFragment wordWikiFragment, Void r12) {
        wordWikiFragment.b0(false);
        return g2.f100423a;
    }

    public static final void Z(WordWikiFragment wordWikiFragment, e it) {
        g0.p(it, "it");
        wordWikiFragment.V().E(new m(wordWikiFragment, it));
    }

    public static final Class a0(int i11, pi.m t11) {
        g0.p(t11, "t");
        return t11.f() == 0 ? n.class : s.class;
    }

    public static /* synthetic */ void c0(WordWikiFragment wordWikiFragment, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        wordWikiFragment.b0(z11);
    }

    public static final void h0(WordWikiFragment wordWikiFragment, List it) {
        g0.p(it, "it");
        wordWikiFragment.f25582q.removeCallbacks(wordWikiFragment.f25583r);
        wordWikiFragment.S().s();
        wordWikiFragment.T().m(it);
        wordWikiFragment.T().notifyDataSetChanged();
    }

    public static final oi.b0 i0(WordWikiFragment wordWikiFragment) {
        return (oi.b0) new ViewModelProvider(wordWikiFragment).get(oi.b0.class);
    }

    public final void M() {
        oi.b0.u(V(), ma.a.H4, null, 2, null);
    }

    public final ta.b S() {
        return (ta.b) this.f25570e.getValue();
    }

    public final h T() {
        return (h) this.f25571f.getValue();
    }

    public final long U() {
        return this.f25584s;
    }

    public final oi.b0 V() {
        return (oi.b0) this.f25569d.getValue();
    }

    public final void b0(boolean z11) {
        boolean z12;
        b bVar;
        if (this.f25575j <= 0 || this.f25577l == null) {
            z12 = false;
        } else {
            this.f25582q.removeCallbacks(this.f25583r);
            this.f25582q.postDelayed(this.f25583r, 1000L);
            oi.b0 V = V();
            int i11 = this.f25575j;
            int i12 = this.f25576k;
            GetTopicResourceChannel getTopicResourceChannel = this.f25577l;
            g0.m(getTopicResourceChannel);
            V.N(i11, i12, getTopicResourceChannel);
            z12 = true;
        }
        if (!z11 || (bVar = this.f25581p) == null) {
            return;
        }
        bVar.G(z12);
    }

    public final void d0(int i11, int i12, @k GetTopicResourceChannel channel) {
        g0.p(channel, "channel");
        this.f25575j = i11;
        this.f25576k = i12;
        this.f25577l = channel;
        b0(false);
    }

    public final void e0(long j11) {
        this.f25584s = j11;
    }

    public final void f0() {
        WikiVideoView wikiVideoView = this.f25580o;
        qb.c.b(f25564v, "try to stop, current playing: " + (wikiVideoView != null ? Boolean.valueOf(wikiVideoView.o()) : null), new Object[0]);
        WikiVideoView wikiVideoView2 = this.f25580o;
        if (wikiVideoView2 != null) {
            wikiVideoView2.u();
        }
    }

    public final boolean g0() {
        qb.c.b(f25564v, this + ", current fullscreen: " + this.f25579n + j2.O + this.f25575j, new Object[0]);
        if (!g0.g(this.f25579n, Boolean.TRUE)) {
            return false;
        }
        V().b0(false);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(@k Context context) {
        g0.p(context, "context");
        super.onAttach(context);
        this.f25581p = context instanceof b ? (b) context : null;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@k Configuration newConfig) {
        zb zbVar;
        RecyclerView recyclerView;
        g0.p(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        int i11 = 0;
        qb.c.b(f25564v, "orientation = " + newConfig.orientation, new Object[0]);
        if (newConfig.orientation == 1) {
            List<?> c11 = T().c();
            g0.o(c11, "getItems(...)");
            Iterator<?> it = c11.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i11 = -1;
                    break;
                } else if (it.next() instanceof q0) {
                    break;
                } else {
                    i11++;
                }
            }
            if (i11 < 0 || (zbVar = this.f25572g) == null || (recyclerView = zbVar.f57769a) == null) {
                return;
            }
            recyclerView.scrollToPosition(i11);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null || arguments.getBoolean("need_report")) {
            com.baicizhan.main.wikiv2.studyv2.data.u0 u0Var = com.baicizhan.main.wikiv2.studyv2.data.u0.f26107a;
            u0Var.n("", "");
            u0Var.r(WikiStyle.SEARCH_WIKI);
            u0Var.p(EntryAction.CLICK);
        }
        V().C().observe(this, this.f25573h);
        V().y().observe(this, this.f25574i);
        S().f90403e.observe(this, new d(new x00.l() { // from class: oi.e
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 Y;
                Y = WordWikiFragment.Y(WordWikiFragment.this, (Void) obj);
                return Y;
            }
        }));
        TypedArray obtainStyledAttributes = requireActivity().obtainStyledAttributes(new int[]{R.attr.windowFullscreen});
        g0.o(obtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f25578m = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        Bundle arguments2 = getArguments();
        this.f25575j = arguments2 != null ? arguments2.getInt("wiki_topic_id") : 0;
        Bundle arguments3 = getArguments();
        this.f25576k = arguments3 != null ? arguments3.getInt("wiki_book_id") : 0;
        Bundle arguments4 = getArguments();
        Serializable serializable = arguments4 != null ? arguments4.getSerializable("wiki_channel") : null;
        this.f25577l = serializable instanceof GetTopicResourceChannel ? (GetTopicResourceChannel) serializable : null;
        c0(this, false, 1, null);
        V().c0(this.f25575j);
        p.e(this, new rj.e() { // from class: oi.f
            @Override // rj.e
            public final void a(ij.e eVar) {
                WordWikiFragment.Z(WordWikiFragment.this, eVar);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    @l
    public View onCreateView(@k LayoutInflater inflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        g0.p(inflater, "inflater");
        zb zbVar = (zb) DataBindingUtil.inflate(inflater, com.jiongji.andriod.card.R.layout.fragment_word_wiki, viewGroup, false);
        zbVar.setLifecycleOwner(this);
        zbVar.j(S());
        this.f25572g = zbVar;
        return zbVar.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f25582q.removeCallbacks(this.f25583r);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        WikiVideoView wikiVideoView = this.f25580o;
        if (wikiVideoView != null) {
            wikiVideoView.r();
        }
        if (this.f25584s > 0) {
            V().t(ma.a.A4, k1.k(h1.a(ma.b.f72947t1, Long.valueOf(System.currentTimeMillis() - this.f25584s))));
            this.f25584s = 0L;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        V().v();
        this.f25584s = System.currentTimeMillis();
    }

    @Override // com.baicizhan.base.c, androidx.fragment.app.Fragment
    @SuppressLint({"SourceLockedOrientationActivity"})
    public void onViewCreated(@k View view, @l Bundle bundle) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        g0.p(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            Integer valueOf = Integer.valueOf(arguments.getInt("wiki_background"));
            if (valueOf.intValue() == 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                view.setBackgroundColor(valueOf.intValue());
            }
        }
        zb zbVar = this.f25572g;
        if (zbVar != null && (recyclerView2 = zbVar.f57769a) != null) {
            recyclerView2.setAdapter(T());
        }
        zb zbVar2 = this.f25572g;
        if (zbVar2 != null && (recyclerView = zbVar2.f57769a) != null) {
            final Context context = getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(context) { // from class: com.baicizhan.main.wikiv2.lookup.WordWikiFragment$onViewCreated$3
                @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
                public boolean requestChildRectangleOnScreen(RecyclerView parent, View child, Rect rect, boolean z11, boolean z12) {
                    g0.p(parent, "parent");
                    g0.p(child, "child");
                    g0.p(rect, "rect");
                    return false;
                }
            });
        }
        T().i(pi.a.class, new pi.c(V(), this));
        T().i(pi.d.class, new pi.k(V(), this));
        T().i(o0.class, new p0(V(), this));
        T().i(a0.class, new d0(V(), this));
        T().h(pi.m.class).b(new n(V(), this), new s(V(), this)).a(new p50.b() { // from class: oi.d
            @Override // p50.b
            public final Class a(int i11, Object obj) {
                Class a02;
                a02 = WordWikiFragment.a0(i11, (pi.m) obj);
                return a02;
            }
        });
        T().i(t.class, new pi.v(V(), this));
        T().i(j0.class, new l0(V(), this));
        h T = T();
        v0 v0Var = new v0(V(), this);
        v0Var.R(new c());
        g2 g2Var = g2.f100423a;
        T.i(q0.class, v0Var);
        T().i(x.class, new y(V(), this));
        T().i(m0.class, new n0(V(), this));
        T().i(pi.g0.class, new i0(V(), this));
    }
}
