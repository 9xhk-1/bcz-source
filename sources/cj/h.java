package cj;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.baicizhan.client.business.util.KotlinExtKt;
import com.baicizhan.client.business.widget.WikiVideoView;
import com.baicizhan.main.wikiv2.studyv2.StudyWikiV2ViewModel;
import com.baicizhan.main.wikiv2.studyv2.data.c0;
import com.baicizhan.main.wikiv2.studyv2.data.i0;
import com.baicizhan.main.wikiv2.studyv2.data.k0;
import com.baicizhan.main.wikiv2.studyv2.data.n0;
import com.baicizhan.main.wikiv2.studyv2.data.u;
import com.baicizhan.main.wikiv2.studyv2.data.y;
import com.jiongji.andriod.card.R;
import gs.nk;
import gs.pk;
import java.util.List;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import x00.l;
import yz.g2;
import yz.w;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class h extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final a f8701d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final int f8702e = 8;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final String f8703f = "WikiExtPagerAdapter";

    /* renamed from: g, reason: collision with root package name */
    public static final int f8704g = 1;

    /* renamed from: h, reason: collision with root package name */
    public static final int f8705h = 2;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final List<y> f8706a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final LifecycleOwner f8707b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final StudyWikiV2ViewModel f8708c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class b extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final nk f8709a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h f8710b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@m80.k h hVar, nk binding) {
            super(binding.getRoot());
            g0.p(binding, "binding");
            this.f8710b = hVar;
            this.f8709a = binding;
        }

        @m80.k
        public final nk a() {
            return this.f8709a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class c extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final pk f8711a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h f8712b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@m80.k h hVar, pk binding) {
            super(binding.getRoot());
            g0.p(binding, "binding");
            this.f8712b = hVar;
            this.f8711a = binding;
        }

        @m80.k
        public final pk a() {
            return this.f8711a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d implements Observer, b0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f8713a;

        public d(l function) {
            g0.p(function, "function");
            this.f8713a = function;
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
            return this.f8713a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f8713a.invoke(obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(@m80.k List<? extends y> extensions, @m80.k LifecycleOwner lifecycleOwner, @m80.k StudyWikiV2ViewModel vm2) {
        g0.p(extensions, "extensions");
        g0.p(lifecycleOwner, "lifecycleOwner");
        g0.p(vm2, "vm");
        this.f8706a = extensions;
        this.f8707b = lifecycleOwner;
        this.f8708c = vm2;
    }

    public static final void h(WikiVideoView wikiVideoView, h hVar, pk pkVar, k0 k0Var) {
        if (wikiVideoView.n()) {
            hVar.l(pkVar);
        } else {
            hVar.p(pkVar);
        }
        k0Var.c().setValue(Boolean.valueOf(wikiVideoView.n()));
    }

    public static final void i(k0 k0Var, h hVar, boolean z11) {
        k0Var.b(z11);
        if (z11) {
            hVar.f8708c.s();
        }
    }

    public static final g2 j(h hVar, pk pkVar, Boolean bool) {
        if (!bool.booleanValue()) {
            hVar.l(pkVar);
        }
        return g2.f100423a;
    }

    public static final g2 k(WikiVideoView wikiVideoView, Boolean bool) {
        if (!bool.booleanValue()) {
            wikiVideoView.u();
        }
        return g2.f100423a;
    }

    public final void g(final pk pkVar, final k0 k0Var) {
        final WikiVideoView wikiVideoView = pkVar.f56391a;
        wikiVideoView.setFullscreenEnabled(true);
        wikiVideoView.setVideoURI(m9.c.d(k0Var.l()));
        wikiVideoView.setSnapshot(k0Var.m().toString());
        wikiVideoView.setOnFullscreenListener(new WikiVideoView.e() { // from class: cj.d
            @Override // com.baicizhan.client.business.widget.WikiVideoView.e
            public final void a() {
                h.h(WikiVideoView.this, this, pkVar, k0Var);
            }
        });
        wikiVideoView.setOnToggleListener(new WikiVideoView.f() { // from class: cj.e
            @Override // com.baicizhan.client.business.widget.WikiVideoView.f
            public final void a(boolean z11) {
                h.i(k0.this, this, z11);
            }
        });
        k0Var.c().removeObservers(this.f8707b);
        k0Var.c().observe(this.f8707b, new d(new l() { // from class: cj.f
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 j11;
                j11 = h.j(h.this, pkVar, (Boolean) obj);
                return j11;
            }
        }));
        k0Var.a().removeObservers(this.f8707b);
        k0Var.a().observe(this.f8707b, new d(new l() { // from class: cj.g
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 k11;
                k11 = h.k(WikiVideoView.this, (Boolean) obj);
                return k11;
            }
        }));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f8706a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i11) {
        return this.f8706a.get(i11) instanceof k0 ? 2 : 1;
    }

    public final void l(pk pkVar) {
        Window window;
        View decorView;
        LifecycleOwner lifecycleOwner = this.f8707b;
        if (!(lifecycleOwner instanceof Fragment) || (window = ((Fragment) lifecycleOwner).requireActivity().getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) decorView;
        int childCount = viewGroup.getChildCount();
        int i11 = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = viewGroup.getChildAt(i11);
            if (childAt instanceof WikiVideoView) {
                viewGroup.removeView(childAt);
                pkVar.f56392b.removeAllViews();
                pkVar.f56392b.addView(childAt);
                break;
            }
            i11++;
        }
        pkVar.f56391a.setFullscreen(false);
        ((Fragment) this.f8707b).requireActivity().setRequestedOrientation(1);
    }

    @m80.k
    public final List<y> m() {
        return this.f8706a;
    }

    @m80.k
    public final LifecycleOwner n() {
        return this.f8707b;
    }

    @m80.k
    public final StudyWikiV2ViewModel o() {
        return this.f8708c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@m80.k RecyclerView.ViewHolder holder, int i11) {
        RecyclerView.Adapter jVar;
        Drawable drawable;
        int i12;
        int size;
        g0.p(holder, "holder");
        if (this.f8706a.get(i11) instanceof k0) {
            c cVar = (c) holder;
            cVar.a().f56391a.getName();
            pk a11 = cVar.a();
            y yVar = this.f8706a.get(i11);
            g0.n(yVar, "null cannot be cast to non-null type com.baicizhan.main.wikiv2.studyv2.data.Tv");
            g(a11, (k0) yVar);
            return;
        }
        RecyclerView recyclerView = ((b) holder).a().f56085a;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        Drawable drawable2 = KotlinExtKt.getDrawable(R.drawable.divider_transparent_8dp);
        y yVar2 = this.f8706a.get(i11);
        if (yVar2 instanceof c0) {
            y yVar3 = this.f8706a.get(i11);
            g0.n(yVar3, "null cannot be cast to non-null type com.baicizhan.main.wikiv2.studyv2.data.Phrase");
            i12 = ((c0) yVar3).h().size();
            drawable = KotlinExtKt.getDrawable(R.drawable.divider_transparent_12dp);
            y yVar4 = this.f8706a.get(i11);
            g0.n(yVar4, "null cannot be cast to non-null type com.baicizhan.main.wikiv2.studyv2.data.Phrase");
            jVar = new i(((c0) yVar4).h());
        } else {
            if (yVar2 instanceof n0) {
                y yVar5 = this.f8706a.get(i11);
                g0.n(yVar5, "null cannot be cast to non-null type com.baicizhan.main.wikiv2.studyv2.data.Variant");
                size = ((n0) yVar5).h().size();
                y yVar6 = this.f8706a.get(i11);
                g0.n(yVar6, "null cannot be cast to non-null type com.baicizhan.main.wikiv2.studyv2.data.Variant");
                jVar = new k(((n0) yVar6).h());
            } else if (yVar2 instanceof u) {
                y yVar7 = this.f8706a.get(i11);
                g0.n(yVar7, "null cannot be cast to non-null type com.baicizhan.main.wikiv2.studyv2.data.Derivation");
                size = ((u) yVar7).h().size();
                y yVar8 = this.f8706a.get(i11);
                g0.n(yVar8, "null cannot be cast to non-null type com.baicizhan.main.wikiv2.studyv2.data.Derivation");
                jVar = new cj.b(((u) yVar8).h());
            } else if (yVar2 instanceof com.baicizhan.main.wikiv2.studyv2.data.v) {
                y yVar9 = this.f8706a.get(i11);
                g0.n(yVar9, "null cannot be cast to non-null type com.baicizhan.main.wikiv2.studyv2.data.EnMean");
                size = ((com.baicizhan.main.wikiv2.studyv2.data.v) yVar9).h().size();
                y yVar10 = this.f8706a.get(i11);
                g0.n(yVar10, "null cannot be cast to non-null type com.baicizhan.main.wikiv2.studyv2.data.EnMean");
                jVar = new cj.c(((com.baicizhan.main.wikiv2.studyv2.data.v) yVar10).h());
            } else {
                if (yVar2 instanceof i0) {
                    recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), 2));
                    y yVar11 = this.f8706a.get(i11);
                    g0.n(yVar11, "null cannot be cast to non-null type com.baicizhan.main.wikiv2.studyv2.data.Synonym");
                    jVar = new j(((i0) yVar11).h());
                } else if (yVar2 instanceof com.baicizhan.main.wikiv2.studyv2.data.b) {
                    recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), 2));
                    y yVar12 = this.f8706a.get(i11);
                    g0.n(yVar12, "null cannot be cast to non-null type com.baicizhan.main.wikiv2.studyv2.data.Antonym");
                    jVar = new j(((com.baicizhan.main.wikiv2.studyv2.data.b) yVar12).h());
                } else {
                    if (!(yVar2 instanceof com.baicizhan.main.wikiv2.studyv2.data.g0)) {
                        throw new Exception("illegal data type");
                    }
                    recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), 2));
                    y yVar13 = this.f8706a.get(i11);
                    g0.n(yVar13, "null cannot be cast to non-null type com.baicizhan.main.wikiv2.studyv2.data.Similar");
                    jVar = new j(((com.baicizhan.main.wikiv2.studyv2.data.g0) yVar13).h());
                }
                drawable = drawable2;
                i12 = 0;
            }
            drawable = drawable2;
            i12 = size;
        }
        recyclerView.setAdapter(jVar);
        int itemDecorationCount = recyclerView.getItemDecorationCount();
        for (int i13 = 0; i13 < itemDecorationCount; i13++) {
            recyclerView.removeItemDecorationAt(i13);
        }
        Context context = recyclerView.getContext();
        g0.o(context, "getContext(...)");
        xl.c cVar2 = new xl.c(context, 1, 0, i12 - 1, false, 16, null);
        g0.m(drawable);
        cVar2.setDrawable(drawable);
        recyclerView.addItemDecoration(cVar2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @m80.k
    public RecyclerView.ViewHolder onCreateViewHolder(@m80.k ViewGroup parent, int i11) {
        g0.p(parent, "parent");
        if (i11 == 1) {
            nk e11 = nk.e(LayoutInflater.from(parent.getContext()), parent, false);
            g0.o(e11, "inflate(...)");
            return new b(this, e11);
        }
        pk e12 = pk.e(LayoutInflater.from(parent.getContext()), parent, false);
        g0.o(e12, "inflate(...)");
        return new c(this, e12);
    }

    public final void p(pk pkVar) {
        Window window;
        View decorView;
        LifecycleOwner lifecycleOwner = this.f8707b;
        if (!(lifecycleOwner instanceof Fragment) || (window = ((Fragment) lifecycleOwner).requireActivity().getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        pkVar.f56392b.removeView(pkVar.f56391a);
        ((ViewGroup) decorView).addView(pkVar.f56391a);
        pkVar.f56391a.setFullscreen(true);
        ((Fragment) this.f8707b).requireActivity().setRequestedOrientation(0);
    }
}
